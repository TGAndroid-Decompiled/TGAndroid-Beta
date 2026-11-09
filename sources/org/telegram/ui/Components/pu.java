package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class pu implements org.telegram.messenger.ls {
    public final ArrayList f37090a;
    public ArrayList f37091b;
    public ArrayList[] f37092c;
    public final int d;
    public boolean f37093e = false;
    public final ru f37094f;

    public pu(int i7, ArrayList arrayList, ru ruVar) {
        this.f37094f = ruVar;
        this.d = i7;
        this.f37090a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i7, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        ArrayList<Long> arrayList;
        if (i7 >= 0) {
            ArrayList[] arrayListArr = this.f37092c;
            if (i7 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i7] = new ArrayList();
                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                        if (document == null) {
                            this.f37092c[i7].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f26962id;
                            for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j3))); i12++) {
                            }
                            obj.f36154a = tL_messages_stickerSet;
                            obj.f36155b = document.f26962id;
                            this.f37092c[i7].add(obj);
                            if (this.f37094f.f37820y1) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i10 = 10;
                                } else {
                                    i10 = 16;
                                }
                                if (this.f37092c[i7].size() >= i10) {
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
                    this.f37092c[i7].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.sj sjVar;
        if (i7 == org.telegram.messenger.qs.B0) {
            for (int i11 = 0; i11 < this.f37091b.size(); i11++) {
                if (this.f37091b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(this.d).m0((TLRPC.InputStickerSet) this.f37090a.get(i11), true);
                    if (this.f37091b.size() == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        ru ruVar = this.f37094f;
                        ruVar.dismiss();
                        Context context = ruVar.getContext();
                        org.telegram.ui.ActionBar.f2 f2Var = ruVar.f37807j1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f37090a.get(i11);
                        org.telegram.ui.ActionBar.f2 f2Var2 = ruVar.f37807j1;
                        if (f2Var2 instanceof org.telegram.ui.cn) {
                            sjVar = ((org.telegram.ui.cn) f2Var2).Z;
                        } else {
                            sjVar = null;
                        }
                        new zv0(context, f2Var, inputStickerSet, null, sjVar, ruVar.I0).show();
                        return;
                    }
                    this.f37091b.set(i11, m0);
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
