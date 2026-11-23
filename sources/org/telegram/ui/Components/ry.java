package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ry extends dk0 {
    public final boolean f39341c;
    public final ty d;

    public ry(ty tyVar, boolean z10) {
        this.d = tyVar;
        this.f39341c = z10;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z10 = this.f39341c;
        ty tyVar = this.d;
        if (z10) {
            arrayList = tyVar.f40106o1;
        } else {
            arrayList = tyVar.n1;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        ArrayList arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        org.telegram.messenger.gc k10;
        int i10;
        String str;
        ColorFilter colorFilter;
        q9 q9Var = (q9) e1Var.f59111a;
        ty tyVar = this.d;
        boolean z10 = this.f39341c;
        if (z10) {
            arrayList = tyVar.f40106o1;
        } else {
            arrayList = tyVar.n1;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i7);
        q9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.si.d0(tyVar.f40074d1).o0(org.telegram.messenger.si.b0(stickerSetCovered.set), false);
            if (o02 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = o02.documents;
            }
        } else {
            arrayList2 = stickerSetCovered.covers;
        }
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                if (stickerSetCovered.set != null) {
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        if (arrayList2.get(i11).f28404id == stickerSetCovered.set.thumb_document_id) {
                            document = arrayList2.get(i11);
                            break;
                        }
                    }
                }
                document = null;
                if (document == null) {
                    document = arrayList2.get(0);
                }
            } else {
                document = null;
            }
        }
        if (document != null) {
            if (z10) {
                if (org.telegram.messenger.gj.C4(document)) {
                    colorFilter = org.telegram.ui.ActionBar.m6.o0(tyVar.f40064a2);
                } else {
                    colorFilter = null;
                }
                q9Var.setColorFilter(colorFilter);
            }
            TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            org.telegram.messenger.mz d = org.telegram.messenger.u5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.m6.f29330c7, 0.2f, false);
            if (d != null) {
                d.f25656e = 512;
                d.f25657f = 512;
            }
            if (w10 == null || org.telegram.messenger.gj.N4(document)) {
                w10 = document;
            }
            boolean z11 = w10 instanceof TLRPC.Document;
            if (z11) {
                k10 = org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
            } else if (w10 instanceof TLRPC.PhotoSize) {
                k10 = org.telegram.messenger.gc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
            } else {
                return;
            }
            org.telegram.messenger.gc gcVar = k10;
            if (gcVar != null) {
                if (z10) {
                    i10 = 16388;
                } else {
                    i10 = 1;
                }
                if (!org.telegram.messenger.qc.e(i10)) {
                    str = "30_30_firstframe";
                } else {
                    str = "30_30";
                }
                String str2 = str;
                if (z11 && (org.telegram.messenger.gj.K2(document, true) || org.telegram.messenger.gj.N4(document))) {
                    if (d != null) {
                        q9Var.p(org.telegram.messenger.gc.b(document), str2, d, stickerSetCovered);
                    } else {
                        q9Var.l(org.telegram.messenger.gc.b(document), str2, gcVar, null, 0, stickerSetCovered);
                    }
                } else if (gcVar.f24089p == 1) {
                    q9Var.k(gcVar, str2, "tgs", d, stickerSetCovered);
                } else {
                    q9Var.k(gcVar, null, "webp", d, stickerSetCovered);
                }
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        qy qyVar = new qy(this, this.d.getContext());
        qyVar.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        qyVar.setLayerNum(1);
        qyVar.setAspectFit(true);
        qyVar.setLayoutParams(new v4.p0(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f)));
        return new v4.e1(qyVar);
    }
}
