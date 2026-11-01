package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class av implements org.telegram.messenger.vs {
    public final ArrayList f24574a;
    public ArrayList f24575b;
    public ArrayList[] f24576c;
    public final int d;
    public boolean e = false;
    public final cv f24577f;

    public av(int i10, ArrayList arrayList, cv cvVar) {
        this.f24577f = cvVar;
        this.d = i10;
        this.f24574a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f24576c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f24576c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j10 = document.f19800id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j10))); i13++) {
                            }
                            obj.f24580a = tL_messages_stickerSet;
                            obj.f24581b = document.f19800id;
                            this.f24576c[i10].add(obj);
                            if (this.f24577f.f25257y1) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f24576c[i10].size() >= i11) {
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
                    this.f24576c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.mk mkVar;
        if (i10 == org.telegram.messenger.at.B0) {
            for (int i12 = 0; i12 < this.f24575b.size(); i12++) {
                if (this.f24575b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.vi.b0(this.d).m0((TLRPC.InputStickerSet) this.f24574a.get(i12), true);
                    if (this.f24575b.size() == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        cv cvVar = this.f24577f;
                        cvVar.dismiss();
                        Context context = cvVar.getContext();
                        org.telegram.ui.ActionBar.k2 k2Var = cvVar.f25243j1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f24574a.get(i12);
                        org.telegram.ui.ActionBar.k2 k2Var2 = cvVar.f25243j1;
                        if (k2Var2 instanceof org.telegram.ui.un) {
                            mkVar = ((org.telegram.ui.un) k2Var2).Z;
                        } else {
                            mkVar = null;
                        }
                        new dx0(context, k2Var, inputStickerSet, null, mkVar, cvVar.I0).show();
                        return;
                    }
                    this.f24575b.set(i12, m0);
                    if (m0 != null) {
                        a(i12, m0);
                    }
                }
            }
            cv cvVar2 = ((ou) this).h;
            cvVar2.N0();
            org.telegram.ui.g3 g3Var = cvVar2.f25246n1;
            if (g3Var != null && g3Var.getAdapter() != null) {
                g3Var.getAdapter().f();
            }
        }
    }
}
