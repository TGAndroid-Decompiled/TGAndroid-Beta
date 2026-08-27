package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public final class nx implements View.OnClickListener {

    public final int f31054a;

    public final ox f31055b;

    public nx(ox oxVar, int i10) {
        this.f31054a = i10;
        this.f31055b = oxVar;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        Integer numValueOf;
        View childAt;
        int iR;
        int i10;
        TLRPC.StickerSet stickerSet3;
        int i11 = this.f31054a;
        ox oxVar = this.f31055b;
        switch (i11) {
            case 0:
                kx kxVar = oxVar.f31430s;
                if (kxVar != null && (stickerSet = kxVar.f30205b) != null) {
                    yy yyVar = oxVar.A;
                    if (!yyVar.f35037s2) {
                        yyVar.f35037s2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f22400id = stickerSet.f22407id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new qw(yyVar, yyVar.U1, yyVar.getContext(), yyVar.V1, arrayList, stickerSet).show();
                        break;
                    }
                }
                break;
            case 1:
                ag.s1 s1Var = oxVar.h;
                TextView textView = oxVar.f31427f;
                TextView textView2 = oxVar.f31426e;
                if (textView2 == null || textView2.getVisibility() != 0 || !textView2.isEnabled()) {
                    if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                        textView.performClick();
                        break;
                    } else if (s1Var != null && s1Var.getVisibility() == 0 && s1Var.f647r.isEnabled()) {
                        s1Var.performClick();
                        break;
                    }
                } else {
                    textView2.performClick();
                    break;
                }
                break;
            case 2:
                yy yyVar2 = oxVar.A;
                ArrayList arrayList2 = yyVar2.l1;
                kx kxVar2 = oxVar.f31430s;
                if (kxVar2 != null && (stickerSet2 = kxVar2.f30205b) != null) {
                    kxVar2.f30208f = true;
                    gx gxVar = yyVar2.N;
                    int i12 = yyVar2.Y0;
                    ArrayList arrayList3 = yyVar2.f35015m1;
                    ww wwVar = yyVar2.L;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f22407id))) {
                        arrayList2.add(Long.valueOf(oxVar.f31430s.f30205b.f22407id));
                    }
                    oxVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= wwVar.getChildCount()) {
                            numValueOf = null;
                            childAt = null;
                        } else if (!(wwVar.getChildAt(i13) instanceof mx) || (iR = RecyclerView.R((childAt = wwVar.getChildAt(i13)))) < 0 || (i10 = gxVar.f28861w.get(iR)) < 0 || i10 >= arrayList3.size() || arrayList3.get(i10) == null || oxVar.f31430s == null || ((kx) arrayList3.get(i10)).f30205b.f22407id != oxVar.f31430s.f30205b.f22407id) {
                            i13++;
                        } else {
                            numValueOf = Integer.valueOf(iR);
                        }
                    }
                    if (numValueOf != null) {
                        gxVar.E(numValueOf.intValue(), childAt);
                    }
                    if (oxVar.f31428n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = oxVar.f31430s.f30205b;
                        tL_inputStickerSetID2.f22400id = stickerSet4.f22407id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 == null || stickerSet5.set == null) {
                            NotificationCenter.getInstance(i12).addObserver(oxVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                            oxVar.f31428n = tL_inputStickerSetID2;
                            mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        } else {
                            org.telegram.ui.ActionBar.n2 r2Var = yyVar2.U1;
                            if (r2Var == null) {
                                r2Var = new ag.r2(oxVar, 10);
                            }
                            cv.W(r2Var, stickerSet5, true, null, new lp(oxVar, 14));
                        }
                        break;
                    }
                }
                break;
            case 3:
                yy yyVar3 = oxVar.A;
                kx kxVar3 = oxVar.f31430s;
                if (kxVar3 != null && (stickerSet3 = kxVar3.f30205b) != null) {
                    kxVar3.f30208f = false;
                    ArrayList arrayList4 = yyVar3.l1;
                    int i14 = yyVar3.Y0;
                    arrayList4.remove(Long.valueOf(stickerSet3.f22407id));
                    oxVar.a(true);
                    uv uvVar = yyVar3.E;
                    if (uvVar != null) {
                        uvVar.p(yyVar3.getEmojipacks());
                    }
                    yyVar3.W(yyVar3.M.I0());
                    if (oxVar.f31429r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = oxVar.f31430s.f30205b;
                        tL_inputStickerSetID3.f22400id = stickerSet6.f22407id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 == null || stickerSet7.set == null) {
                            NotificationCenter.getInstance(i14).addObserver(oxVar, NotificationCenter.groupStickersDidLoad);
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                            oxVar.f31429r = tL_inputStickerSetID3;
                            mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                            break;
                        } else {
                            org.telegram.ui.ActionBar.n2 r2Var2 = yyVar3.U1;
                            if (r2Var2 == null) {
                                r2Var2 = new ag.r2(oxVar, 10);
                            }
                            org.telegram.ui.ActionBar.n2 n2Var = r2Var2;
                            xq xqVar = new xq(9, oxVar, stickerSet7);
                            Pattern pattern = cv.R;
                            if (n2Var.getFragmentView() != null) {
                                MediaDataController.getInstance(n2Var.getCurrentAccount()).toggleStickerSet(n2Var.getFragmentView().getContext(), stickerSet7, 0, n2Var, true, true, xqVar, false);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                xx xxVar = oxVar.A.f35025p1;
                if (xxVar != null) {
                    xxVar.q();
                }
                break;
            case 5:
                xx xxVar2 = oxVar.A.f35025p1;
                if (xxVar2 != null) {
                    xxVar2.q();
                }
                break;
            default:
                xx xxVar3 = oxVar.A.f35025p1;
                if (xxVar3 != null) {
                    xxVar3.q();
                }
                break;
        }
    }
}
