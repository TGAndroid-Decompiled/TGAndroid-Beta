package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cy extends sj0 {
    public final boolean f32853c;
    public final ey d;

    public cy(ey eyVar, boolean z10) {
        this.d = eyVar;
        this.f32853c = z10;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z10 = this.f32853c;
        ey eyVar = this.d;
        if (z10) {
            arrayList = eyVar.f33562o1;
        } else {
            arrayList = eyVar.f33559n1;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i3) {
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        ArrayList arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        org.telegram.messenger.ac k10;
        int i10;
        String str;
        ColorFilter colorFilter;
        k9 k9Var = (k9) d1Var.f55540a;
        ey eyVar = this.d;
        boolean z10 = this.f32853c;
        if (z10) {
            arrayList = eyVar.f33562o1;
        } else {
            arrayList = eyVar.f33559n1;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i3);
        k9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(eyVar.f33529d1).m0(org.telegram.messenger.li.Z(stickerSetCovered.set), false);
            if (m0 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = m0.documents;
            }
        } else {
            arrayList2 = stickerSetCovered.covers;
        }
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                if (stickerSetCovered.set != null) {
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        if (arrayList2.get(i11).f27007id == stickerSetCovered.set.thumb_document_id) {
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
                if (org.telegram.messenger.zi.D4(document)) {
                    colorFilter = org.telegram.ui.ActionBar.k6.o0(eyVar.f33520a2);
                } else {
                    colorFilter = null;
                }
                k9Var.setColorFilter(colorFilter);
            }
            TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            org.telegram.messenger.jz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.k6.f27862c7, 0.2f, false);
            if (d != null) {
                d.f23763e = 512;
                d.f23764f = 512;
            }
            if (w10 == null || org.telegram.messenger.zi.O4(document)) {
                w10 = document;
            }
            boolean z11 = w10 instanceof TLRPC.Document;
            if (z11) {
                k10 = org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
            } else if (w10 instanceof TLRPC.PhotoSize) {
                k10 = org.telegram.messenger.ac.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
            } else {
                return;
            }
            org.telegram.messenger.ac acVar = k10;
            if (acVar != null) {
                if (z10) {
                    i10 = 16388;
                } else {
                    i10 = 1;
                }
                if (!org.telegram.messenger.lc.e(i10)) {
                    str = "30_30_firstframe";
                } else {
                    str = "30_30";
                }
                String str2 = str;
                if (z11 && (org.telegram.messenger.zi.L2(document, true) || org.telegram.messenger.zi.O4(document))) {
                    if (d != null) {
                        k9Var.p(org.telegram.messenger.ac.b(document), str2, d, stickerSetCovered);
                    } else {
                        k9Var.l(org.telegram.messenger.ac.b(document), str2, acVar, null, 0, stickerSetCovered);
                    }
                } else if (acVar.f21497p == 1) {
                    k9Var.k(acVar, str2, "tgs", d, stickerSetCovered);
                } else {
                    k9Var.k(acVar, null, "webp", d, stickerSetCovered);
                }
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ay ayVar = new ay(this, this.d.getContext());
        ayVar.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        ayVar.setLayerNum(1);
        ayVar.setAspectFit(true);
        ayVar.setLayoutParams(new u4.p0(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f)));
        return new u4.d1(ayVar);
    }
}
