package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ux implements View.OnClickListener {
    public final int f33331a;
    public final vx f33332b;

    public ux(vx vxVar, int i10) {
        this.f33331a = i10;
        this.f33332b = vxVar;
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
        int i11 = this.f33331a;
        vx vxVar = this.f33332b;
        switch (i11) {
            case 0:
                rx rxVar = vxVar.f34212s;
                if (rxVar != null && (stickerSet = rxVar.f32402b) != null) {
                    fz fzVar = vxVar.A;
                    if (!fzVar.f28635s2) {
                        fzVar.f28635s2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f22412id = stickerSet.f22419id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new xw(fzVar, fzVar.U1, fzVar.getContext(), fzVar.V1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                cg.d1 d1Var = vxVar.h;
                TextView textView = vxVar.f34209f;
                TextView textView2 = vxVar.f34208e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (d1Var != null && d1Var.getVisibility() == 0 && d1Var.f3095r.isEnabled()) {
                    d1Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                fz fzVar2 = vxVar.A;
                ArrayList arrayList2 = fzVar2.l1;
                rx rxVar2 = vxVar.f34212s;
                if (rxVar2 != null && (stickerSet2 = rxVar2.f32402b) != null) {
                    rxVar2.f32405f = true;
                    nx nxVar = fzVar2.N;
                    int i12 = fzVar2.Y0;
                    ArrayList arrayList3 = fzVar2.f28613m1;
                    dx dxVar = fzVar2.L;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f22419id))) {
                        arrayList2.add(Long.valueOf(vxVar.f34212s.f32402b.f22419id));
                    }
                    vxVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < dxVar.getChildCount()) {
                            if ((dxVar.getChildAt(i13) instanceof tx) && (R = RecyclerView.R((view2 = dxVar.getChildAt(i13)))) >= 0 && (i10 = nxVar.f31164w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && vxVar.f34212s != null && ((rx) arrayList3.get(i10)).f32402b.f22419id == vxVar.f34212s.f32402b.f22419id) {
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
                        nxVar.E(num.intValue(), view2);
                    }
                    if (vxVar.f34210n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = vxVar.f34212s.f32402b;
                        tL_inputStickerSetID2.f22412id = stickerSet4.f22419id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.o2 o2Var = fzVar2.U1;
                            if (o2Var == null) {
                                o2Var = new cg.z1(vxVar, 10);
                            }
                            jv.W(o2Var, stickerSet5, true, null, new rp(vxVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(vxVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        vxVar.f34210n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                fz fzVar3 = vxVar.A;
                rx rxVar3 = vxVar.f34212s;
                if (rxVar3 != null && (stickerSet3 = rxVar3.f32402b) != null) {
                    rxVar3.f32405f = false;
                    ArrayList arrayList4 = fzVar3.l1;
                    int i14 = fzVar3.Y0;
                    arrayList4.remove(Long.valueOf(stickerSet3.f22419id));
                    vxVar.a(true);
                    bw bwVar = fzVar3.E;
                    if (bwVar != null) {
                        bwVar.p(fzVar3.getEmojipacks());
                    }
                    fzVar3.W(fzVar3.M.I0());
                    if (vxVar.f34211r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = vxVar.f34212s.f32402b;
                        tL_inputStickerSetID3.f22412id = stickerSet6.f22419id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.o2 o2Var2 = fzVar3.U1;
                            if (o2Var2 == null) {
                                o2Var2 = new cg.z1(vxVar, 10);
                            }
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                            gt gtVar = new gt(6, vxVar, stickerSet7);
                            Pattern pattern = jv.R;
                            if (o2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(o2Var3.getCurrentAccount()).toggleStickerSet(o2Var3.getFragmentView().getContext(), stickerSet7, 0, o2Var3, true, true, gtVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(vxVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        vxVar.f34211r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                fy fyVar = vxVar.A.f28623p1;
                if (fyVar != null) {
                    fyVar.q();
                    return;
                }
                return;
            case 5:
                fy fyVar2 = vxVar.A.f28623p1;
                if (fyVar2 != null) {
                    fyVar2.q();
                    return;
                }
                return;
            default:
                fy fyVar3 = vxVar.A.f28623p1;
                if (fyVar3 != null) {
                    fyVar3.q();
                    return;
                }
                return;
        }
    }
}
