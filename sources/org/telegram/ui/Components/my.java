package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class my implements View.OnClickListener {
    public final int f27533a;
    public final ny f27534b;

    public my(ny nyVar, int i10) {
        this.f27533a = i10;
        this.f27534b = nyVar;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        Integer num;
        View view2;
        int R;
        int i10;
        TLRPC.StickerSet stickerSet3;
        int i11 = this.f27533a;
        ny nyVar = this.f27534b;
        switch (i11) {
            case 0:
                jy jyVar = nyVar.f27744s;
                if (jyVar != null && (stickerSet = jyVar.f26514b) != null) {
                    wz wzVar = nyVar.E;
                    if (!wzVar.f31074v2) {
                        wzVar.f31074v2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f19236id = stickerSet.f19243id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new ox(wzVar, wzVar.Y1, wzVar.getContext(), wzVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sg.q0 q0Var = nyVar.h;
                TextView textView = nyVar.f27741f;
                TextView textView2 = nyVar.e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (q0Var != null && q0Var.getVisibility() == 0 && q0Var.f45314r.isEnabled()) {
                    q0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                wz wzVar2 = nyVar.E;
                ArrayList arrayList2 = wzVar2.f31053p1;
                jy jyVar2 = nyVar.f27744s;
                if (jyVar2 != null && (stickerSet2 = jyVar2.f26514b) != null) {
                    jyVar2.f26516f = true;
                    fy fyVar = wzVar2.R;
                    int i12 = wzVar2.f31014c1;
                    ArrayList arrayList3 = wzVar2.f31056q1;
                    iy iyVar = wzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f19243id))) {
                        arrayList2.add(Long.valueOf(nyVar.f27744s.f26514b.f19243id));
                    }
                    nyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < iyVar.getChildCount()) {
                            if ((iyVar.getChildAt(i13) instanceof ly) && (R = RecyclerView.R((view2 = iyVar.getChildAt(i13)))) >= 0 && (i10 = fyVar.f25139w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && nyVar.f27744s != null && ((jy) arrayList3.get(i10)).f26514b.f19243id == nyVar.f27744s.f26514b.f19243id) {
                                num = Integer.valueOf(R);
                            } else {
                                i13++;
                            }
                        } else {
                            num = null;
                            view2 = null;
                        }
                    }
                    if (num != null) {
                        fyVar.E(num.intValue(), view2);
                    }
                    if (nyVar.f27742n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = nyVar.f27744s.f26514b;
                        tL_inputStickerSetID2.f19236id = stickerSet4.f19243id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.m2 m2Var = wzVar2.Y1;
                            if (m2Var == null) {
                                m2Var = new bi.o3(nyVar, 6);
                            }
                            ew.X(m2Var, stickerSet5, true, null, new kq(nyVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(nyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        nyVar.f27742n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                wz wzVar3 = nyVar.E;
                jy jyVar3 = nyVar.f27744s;
                if (jyVar3 != null && (stickerSet3 = jyVar3.f26514b) != null) {
                    jyVar3.f26516f = false;
                    ArrayList arrayList4 = wzVar3.f31053p1;
                    int i14 = wzVar3.f31014c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f19243id));
                    nyVar.a(true);
                    zx zxVar = wzVar3.I;
                    if (zxVar != null) {
                        zxVar.p(wzVar3.getEmojipacks());
                    }
                    wzVar3.U(wzVar3.Q.I0());
                    if (nyVar.f27743r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = nyVar.f27744s.f26514b;
                        tL_inputStickerSetID3.f19236id = stickerSet6.f19243id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.m2 m2Var2 = wzVar3.Y1;
                            if (m2Var2 == null) {
                                m2Var2 = new bi.o3(nyVar, 6);
                            }
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                            sk skVar = new sk(20, nyVar, stickerSet7);
                            Pattern pattern = ew.V;
                            if (m2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(m2Var3.getCurrentAccount()).toggleStickerSet(m2Var3.getFragmentView().getContext(), stickerSet7, 0, m2Var3, true, true, skVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(nyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        nyVar.f27743r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                wy wyVar = nyVar.E.f31067t1;
                if (wyVar != null) {
                    wyVar.q();
                    return;
                }
                return;
            case 5:
                wy wyVar2 = nyVar.E.f31067t1;
                if (wyVar2 != null) {
                    wyVar2.q();
                    return;
                }
                return;
            default:
                wy wyVar3 = nyVar.E.f31067t1;
                if (wyVar3 != null) {
                    wyVar3.q();
                    return;
                }
                return;
        }
    }
}
