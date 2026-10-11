package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class gw implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList f26882a;
    public ArrayList f26883b;
    public ArrayList[] f26884c;
    public final int d;
    public boolean f26885e = false;
    public final jw f26886f;

    public gw(int i10, ArrayList arrayList, jw jwVar) {
        this.f26886f = jwVar;
        this.d = i10;
        this.f26882a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i11;
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.f26884c;
            if (i10 < arrayListArr.length) {
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                    arrayListArr[i10] = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                        if (document == null) {
                            this.f26884c[i10].add(null);
                        } else {
                            ?? obj = new Object();
                            long j3 = document.f20074id;
                            for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j3))); i13++) {
                            }
                            obj.f26893a = tL_messages_stickerSet;
                            obj.f26894b = document.f20074id;
                            this.f26884c[i10].add(obj);
                            if (this.f26886f.H) {
                                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                                if (stickerSet != null && !stickerSet.emojis) {
                                    i11 = 10;
                                } else {
                                    i11 = 16;
                                }
                                if (this.f26884c[i10].size() >= i11) {
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
                    this.f26884c[i10].add(null);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.ok okVar;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.f26883b.size(); i12++) {
                if (this.f26883b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.f26882a.get(i12), true);
                    if (this.f26883b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        jw jwVar = this.f26886f;
                        jwVar.dismiss();
                        Context context = jwVar.getContext();
                        org.telegram.ui.ActionBar.m2 m2Var = jwVar.f27858c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.f26882a.get(i12);
                        org.telegram.ui.ActionBar.m2 m2Var2 = jwVar.f27858c;
                        if (m2Var2 instanceof org.telegram.ui.zn) {
                            okVar = ((org.telegram.ui.zn) m2Var2).Y;
                        } else {
                            okVar = null;
                        }
                        org.telegram.ui.ok okVar2 = okVar;
                        d6Var = ((org.telegram.ui.ActionBar.e3) jwVar).resourcesProvider;
                        new yy0(context, m2Var, inputStickerSet, null, okVar2, d6Var).show();
                        return;
                    }
                    this.f26883b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            jw jwVar2 = ((tv) this).h;
            jwVar2.b0();
            ci.v vVar = jwVar2.h;
            if (vVar != null && vVar.getAdapter() != null) {
                vVar.getAdapter().l();
            }
        }
    }
}
