package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class pu implements org.telegram.messenger.ls {
    public final ArrayList f37101a;
    public ArrayList f37102b;
    public ArrayList[] f37103c;
    public final int d;
    public boolean f37104e = false;
    public final ru f37105f;

    public pu(int i7, ArrayList arrayList, ru ruVar) {
        this.f37105f = ruVar;
        this.d = i7;
        this.f37101a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i7, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        ArrayList<Long> arrayList;
        if (i7 >= 0) {
            ArrayList[] arrayListArr = this.f37103c;
            if (i7 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i7] = new ArrayList();
                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                        if (document == null) {
                            this.f37103c[i7].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f26962id;
                            for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j3))); i12++) {
                            }
                            obj.f36123a = tL_messages_stickerSet;
                            obj.f36124b = document.f26962id;
                            this.f37103c[i7].add(obj);
                            if (this.f37105f.f37789y1) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i10 = 10;
                                } else {
                                    i10 = 16;
                                }
                                if (this.f37103c[i7].size() >= i10) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                arrayListArr[i7] = new ArrayList(12);
                for (int i13 = 0; i13 < 12; i13++) {
                    this.f37103c[i7].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.qj qjVar;
        if (i7 == org.telegram.messenger.qs.B0) {
            for (int i11 = 0; i11 < this.f37102b.size(); i11++) {
                if (this.f37102b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(this.d).m0((TLRPC.InputStickerSet) this.f37101a.get(i11), true);
                    if (this.f37102b.size() == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        ru ruVar = this.f37105f;
                        ruVar.dismiss();
                        Context context = ruVar.getContext();
                        org.telegram.ui.ActionBar.f2 f2Var = ruVar.f37776j1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f37101a.get(i11);
                        org.telegram.ui.ActionBar.f2 f2Var2 = ruVar.f37776j1;
                        if (f2Var2 instanceof org.telegram.ui.an) {
                            qjVar = ((org.telegram.ui.an) f2Var2).Z;
                        } else {
                            qjVar = null;
                        }
                        new yv0(context, f2Var, inputStickerSet, null, qjVar, ruVar.I0).show();
                        return;
                    }
                    this.f37102b.set(i11, m0);
                    if (m0 != null) {
                        a(i11, m0);
                    }
                }
            }
            ru ruVar2 = ((du) this).h;
            ruVar2.N0();
            fi.v vVar = ruVar2.n1;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().f();
            }
        }
    }
}
