package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class yx implements View.OnClickListener {
    public final int f31188a;
    public final zx f31189b;

    public yx(zx zxVar, int i10) {
        this.f31188a = i10;
        this.f31189b = zxVar;
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
        int i11 = this.f31188a;
        zx zxVar = this.f31189b;
        switch (i11) {
            case 0:
                vx vxVar = zxVar.f31498s;
                if (vxVar != null && (stickerSet = vxVar.f30064b) != null) {
                    kz kzVar = zxVar.B;
                    if (!kzVar.f26484t2) {
                        kzVar.f26484t2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f19179id = stickerSet.f19186id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new bx(kzVar, kzVar.V1, kzVar.getContext(), kzVar.W1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                eg.c1 c1Var = zxVar.h;
                TextView textView = zxVar.f31495f;
                TextView textView2 = zxVar.e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (c1Var != null && c1Var.getVisibility() == 0 && c1Var.f5221r.isEnabled()) {
                    c1Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                kz kzVar2 = zxVar.B;
                ArrayList arrayList2 = kzVar2.f26459m1;
                vx vxVar2 = zxVar.f31498s;
                if (vxVar2 != null && (stickerSet2 = vxVar2.f30064b) != null) {
                    vxVar2.f30066f = true;
                    rx rxVar = kzVar2.O;
                    int i12 = kzVar2.Z0;
                    ArrayList arrayList3 = kzVar2.f26463n1;
                    ix ixVar = kzVar2.M;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f19186id))) {
                        arrayList2.add(Long.valueOf(zxVar.f31498s.f30064b.f19186id));
                    }
                    zxVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < ixVar.getChildCount()) {
                            if ((ixVar.getChildAt(i13) instanceof xx) && (R = RecyclerView.R((view2 = ixVar.getChildAt(i13)))) >= 0 && (i10 = rxVar.f28602w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && zxVar.f31498s != null && ((vx) arrayList3.get(i10)).f30064b.f19186id == zxVar.f31498s.f30064b.f19186id) {
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
                        rxVar.E(num.intValue(), view2);
                    }
                    if (zxVar.f31496n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = zxVar.f31498s.f30064b;
                        tL_inputStickerSetID2.f19179id = stickerSet4.f19186id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.p2 p2Var = kzVar2.V1;
                            if (p2Var == null) {
                                p2Var = new eg.y1(zxVar, 8);
                            }
                            lv.W(p2Var, stickerSet5, true, null, new up(zxVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(zxVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        zxVar.f31496n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                kz kzVar3 = zxVar.B;
                vx vxVar3 = zxVar.f31498s;
                if (vxVar3 != null && (stickerSet3 = vxVar3.f30064b) != null) {
                    vxVar3.f30066f = false;
                    ArrayList arrayList4 = kzVar3.f26459m1;
                    int i14 = kzVar3.Z0;
                    arrayList4.remove(Long.valueOf(stickerSet3.f19186id));
                    zxVar.a(true);
                    fw fwVar = kzVar3.F;
                    if (fwVar != null) {
                        fwVar.p(kzVar3.getEmojipacks());
                    }
                    kzVar3.W(kzVar3.N.I0());
                    if (zxVar.f31497r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = zxVar.f31498s.f30064b;
                        tL_inputStickerSetID3.f19179id = stickerSet6.f19186id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = kzVar3.V1;
                            if (p2Var2 == null) {
                                p2Var2 = new eg.y1(zxVar, 8);
                            }
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                            em emVar = new em(14, zxVar, stickerSet7);
                            Pattern pattern = lv.S;
                            if (p2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(p2Var3.getCurrentAccount()).toggleStickerSet(p2Var3.getFragmentView().getContext(), stickerSet7, 0, p2Var3, true, true, emVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(zxVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        zxVar.f31497r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ky kyVar = zxVar.B.f26472q1;
                if (kyVar != null) {
                    kyVar.q();
                    return;
                }
                return;
            case 5:
                ky kyVar2 = zxVar.B.f26472q1;
                if (kyVar2 != null) {
                    kyVar2.q();
                    return;
                }
                return;
            default:
                ky kyVar3 = zxVar.B.f26472q1;
                if (kyVar3 != null) {
                    kyVar3.q();
                    return;
                }
                return;
        }
    }
}
