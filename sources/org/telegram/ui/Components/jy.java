package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jy extends tj0 {
    public final boolean f36200c;
    public final ly d;

    public jy(ly lyVar, boolean z10) {
        this.d = lyVar;
        this.f36200c = z10;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z10 = this.f36200c;
        ly lyVar = this.d;
        if (z10) {
            arrayList = lyVar.f36973o1;
        } else {
            arrayList = lyVar.n1;
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
        i9 i9Var = (i9) e1Var.f58535a;
        ly lyVar = this.d;
        boolean z10 = this.f36200c;
        if (z10) {
            arrayList = lyVar.f36973o1;
        } else {
            arrayList = lyVar.n1;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i7);
        i9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.si.b0(lyVar.f36941d1).m0(org.telegram.messenger.si.Z(stickerSetCovered.set), false);
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
                        if (arrayList2.get(i11).f28057id == stickerSetCovered.set.thumb_document_id) {
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
                    colorFilter = org.telegram.ui.ActionBar.j6.o0(lyVar.f36931a2);
                } else {
                    colorFilter = null;
                }
                i9Var.setColorFilter(colorFilter);
            }
            TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            org.telegram.messenger.pz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.j6.f28832c7, 0.2f, false);
            if (d != null) {
                d.f26029e = 512;
                d.f26030f = 512;
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
                        i9Var.p(org.telegram.messenger.gc.b(document), str2, d, stickerSetCovered);
                    } else {
                        i9Var.l(org.telegram.messenger.gc.b(document), str2, gcVar, null, 0, stickerSetCovered);
                    }
                } else if (gcVar.f23724p == 1) {
                    i9Var.k(gcVar, str2, "tgs", d, stickerSetCovered);
                } else {
                    i9Var.k(gcVar, null, "webp", d, stickerSetCovered);
                }
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        iy iyVar = new iy(this, this.d.getContext());
        iyVar.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        iyVar.setLayerNum(1);
        iyVar.setAspectFit(true);
        iyVar.setLayoutParams(new v4.p0(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f)));
        return new v4.e1(iyVar);
    }
}
