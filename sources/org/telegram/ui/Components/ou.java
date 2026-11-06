package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ou implements org.telegram.messenger.ls {
    public final ArrayList f36675a;
    public ArrayList f36676b;
    public ArrayList[] f36677c;
    public final int d;
    public boolean f36678e = false;
    public final qu f36679f;

    public ou(int i7, ArrayList arrayList, qu quVar) {
        this.f36679f = quVar;
        this.d = i7;
        this.f36675a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i7, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        ArrayList<Long> arrayList;
        if (i7 >= 0) {
            ArrayList[] arrayListArr = this.f36677c;
            if (i7 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i7] = new ArrayList();
                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                        if (document == null) {
                            this.f36677c[i7].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f26959id;
                            for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j3))); i12++) {
                            }
                            obj.f35775a = tL_messages_stickerSet;
                            obj.f35776b = document.f26959id;
                            this.f36677c[i7].add(obj);
                            if (this.f36679f.f37404y1) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i10 = 10;
                                } else {
                                    i10 = 16;
                                }
                                if (this.f36677c[i7].size() >= i10) {
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
                    this.f36677c[i7].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.qj qjVar;
        if (i7 == org.telegram.messenger.qs.B0) {
            for (int i11 = 0; i11 < this.f36676b.size(); i11++) {
                if (this.f36676b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(this.d).m0((TLRPC.InputStickerSet) this.f36675a.get(i11), true);
                    if (this.f36676b.size() == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        qu quVar = this.f36679f;
                        quVar.dismiss();
                        Context context = quVar.getContext();
                        org.telegram.ui.ActionBar.f2 f2Var = quVar.f37391j1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f36675a.get(i11);
                        org.telegram.ui.ActionBar.f2 f2Var2 = quVar.f37391j1;
                        if (f2Var2 instanceof org.telegram.ui.an) {
                            qjVar = ((org.telegram.ui.an) f2Var2).Z;
                        } else {
                            qjVar = null;
                        }
                        new yv0(context, f2Var, inputStickerSet, null, qjVar, quVar.I0).show();
                        return;
                    }
                    this.f36676b.set(i11, m0);
                    if (m0 != null) {
                        a(i11, m0);
                    }
                }
            }
            qu quVar2 = ((cu) this).h;
            quVar2.N0();
            fi.v vVar = quVar2.n1;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().f();
            }
        }
    }
}
