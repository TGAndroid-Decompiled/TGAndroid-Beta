package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ty extends tk0 {
    public final boolean f30744c;
    public final vy d;

    public ty(vy vyVar, boolean z10) {
        this.d = vyVar;
        this.f30744c = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z10 = this.f30744c;
        vy vyVar = this.d;
        if (z10) {
            arrayList = vyVar.f31976n1;
        } else {
            arrayList = vyVar.f31972m1;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i10) {
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        ArrayList arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        org.telegram.messenger.jc k10;
        int i11;
        String str;
        ColorFilter colorFilter;
        g9 g9Var = (g9) c1Var.f47909a;
        vy vyVar = this.d;
        boolean z10 = this.f30744c;
        if (z10) {
            arrayList = vyVar.f31976n1;
        } else {
            arrayList = vyVar.f31972m1;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
        g9Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.vi.b0(vyVar.f31943c1).m0(org.telegram.messenger.vi.Z(stickerSetCovered.set), false);
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
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        if (arrayList2.get(i12).f19800id == stickerSetCovered.set.thumb_document_id) {
                            document = arrayList2.get(i12);
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
                if (org.telegram.messenger.kj.C4(document)) {
                    colorFilter = org.telegram.ui.ActionBar.t6.o0(vyVar.Z1);
                } else {
                    colorFilter = null;
                }
                g9Var.setColorFilter(colorFilter);
            }
            TLObject w9 = org.telegram.messenger.b8.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            org.telegram.messenger.d00 d = org.telegram.messenger.v5.d(stickerSetCovered.set.thumbs, org.telegram.ui.ActionBar.t6.f20912c7, 0.2f, false);
            if (d != null) {
                d.e = 512;
                d.f15264f = 512;
            }
            if (w9 == null || org.telegram.messenger.kj.N4(document)) {
                w9 = document;
            }
            boolean z11 = w9 instanceof TLRPC.Document;
            if (z11) {
                k10 = org.telegram.messenger.jc.c(org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false), document);
            } else if (w9 instanceof TLRPC.PhotoSize) {
                k10 = org.telegram.messenger.jc.k((TLRPC.PhotoSize) w9, document, stickerSetCovered.set.thumb_version);
            } else {
                return;
            }
            org.telegram.messenger.jc jcVar = k10;
            if (jcVar != null) {
                if (z10) {
                    i11 = 16388;
                } else {
                    i11 = 1;
                }
                if (!org.telegram.messenger.tc.e(i11)) {
                    str = "30_30_firstframe";
                } else {
                    str = "30_30";
                }
                String str2 = str;
                if (z11 && (org.telegram.messenger.kj.K2(document, true) || org.telegram.messenger.kj.N4(document))) {
                    if (d != null) {
                        g9Var.p(org.telegram.messenger.jc.b(document), str2, d, stickerSetCovered);
                    } else {
                        g9Var.l(org.telegram.messenger.jc.b(document), str2, jcVar, null, 0, stickerSetCovered);
                    }
                } else if (jcVar.f16444p == 1) {
                    g9Var.k(jcVar, str2, "tgs", d, stickerSetCovered);
                } else {
                    g9Var.k(jcVar, null, "webp", d, stickerSetCovered);
                }
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        sy syVar = new sy(this, this.d.getContext());
        syVar.u(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
        syVar.setLayerNum(1);
        syVar.setAspectFit(true);
        syVar.setLayoutParams(new s4.o0(org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(34.0f)));
        return new s4.c1(syVar);
    }
}
