package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ey extends oj0 {
    public final boolean f33363c;
    public final gy d;

    public ey(gy gyVar, boolean z9) {
        this.d = gyVar;
        this.f33363c = z9;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z9 = this.f33363c;
        gy gyVar = this.d;
        if (z9) {
            arrayList = gyVar.n1;
        } else {
            arrayList = gyVar.f34053m1;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        ArrayList arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        org.telegram.messenger.hc k10;
        int i10;
        String str;
        ColorFilter colorFilter;
        l9 l9Var = (l9) d1Var.f56952a;
        gy gyVar = this.d;
        boolean z9 = this.f33363c;
        if (z9) {
            arrayList = gyVar.n1;
        } else {
            arrayList = gyVar.f34053m1;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i7);
        l9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(gyVar.f34024c1).m0(org.telegram.messenger.ui.Z(stickerSetCovered.set), false);
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
                        if (arrayList2.get(i11).f26958id == stickerSetCovered.set.thumb_document_id) {
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
            if (z9) {
                if (org.telegram.messenger.ij.D4(document)) {
                    colorFilter = org.telegram.ui.ActionBar.k6.o0(gyVar.Z1);
                } else {
                    colorFilter = null;
                }
                l9Var.setColorFilter(colorFilter);
            }
            TLObject w10 = org.telegram.messenger.w7.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            org.telegram.messenger.rz d = org.telegram.messenger.t5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.k6.f27831c7, 0.2f, false);
            if (d != null) {
                d.f25378e = 512;
                d.f25379f = 512;
            }
            if (w10 == null || org.telegram.messenger.ij.O4(document)) {
                w10 = document;
            }
            boolean z10 = w10 instanceof TLRPC.Document;
            if (z10) {
                k10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document);
            } else if (w10 instanceof TLRPC.PhotoSize) {
                k10 = org.telegram.messenger.hc.k((TLRPC.PhotoSize) w10, document, stickerSetCovered.set.thumb_version);
            } else {
                return;
            }
            org.telegram.messenger.hc hcVar = k10;
            if (hcVar != null) {
                if (z9) {
                    i10 = 16388;
                } else {
                    i10 = 1;
                }
                if (!org.telegram.messenger.rc.e(i10)) {
                    str = "30_30_firstframe";
                } else {
                    str = "30_30";
                }
                String str2 = str;
                if (z10 && (org.telegram.messenger.ij.L2(document, true) || org.telegram.messenger.ij.O4(document))) {
                    if (d != null) {
                        l9Var.p(org.telegram.messenger.hc.b(document), str2, d, stickerSetCovered);
                    } else {
                        l9Var.l(org.telegram.messenger.hc.b(document), str2, hcVar, null, 0, stickerSetCovered);
                    }
                } else if (hcVar.f22865p == 1) {
                    l9Var.k(hcVar, str2, "tgs", d, stickerSetCovered);
                } else {
                    l9Var.k(hcVar, null, "webp", d, stickerSetCovered);
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        dy dyVar = new dy(this, this.d.getContext());
        dyVar.u(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        dyVar.setLayerNum(1);
        dyVar.setAspectFit(true);
        dyVar.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f)));
        return new v4.d1(dyVar);
    }
}
