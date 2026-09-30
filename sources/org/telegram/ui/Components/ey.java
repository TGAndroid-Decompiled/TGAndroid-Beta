package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ey implements View.OnClickListener {
    public final int f24073a;
    public final fy f24074b;

    public ey(fy fyVar, int i10) {
        this.f24073a = i10;
        this.f24074b = fyVar;
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
        int i11 = this.f24073a;
        fy fyVar = this.f24074b;
        switch (i11) {
            case 0:
                ay ayVar = fyVar.f24384s;
                if (ayVar != null && (stickerSet = ayVar.f22725b) != null) {
                    nz nzVar = fyVar.E;
                    if (!nzVar.f26878v2) {
                        nzVar.f26878v2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f18372id = stickerSet.f18379id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new gx(nzVar, nzVar.Y1, nzVar.getContext(), nzVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rg.p0 p0Var = fyVar.h;
                TextView textView = fyVar.f24381f;
                TextView textView2 = fyVar.e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (p0Var != null && p0Var.getVisibility() == 0 && p0Var.f42818r.isEnabled()) {
                    p0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                nz nzVar2 = fyVar.E;
                ArrayList arrayList2 = nzVar2.f26857p1;
                ay ayVar2 = fyVar.f24384s;
                if (ayVar2 != null && (stickerSet2 = ayVar2.f22725b) != null) {
                    ayVar2.f22727f = true;
                    wx wxVar = nzVar2.R;
                    int i12 = nzVar2.f26818c1;
                    ArrayList arrayList3 = nzVar2.f26860q1;
                    zx zxVar = nzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f18379id))) {
                        arrayList2.add(Long.valueOf(fyVar.f24384s.f22725b.f18379id));
                    }
                    fyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < zxVar.getChildCount()) {
                            if ((zxVar.getChildAt(i13) instanceof dy) && (R = RecyclerView.R((view2 = zxVar.getChildAt(i13)))) >= 0 && (i10 = wxVar.f30080w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && fyVar.f24384s != null && ((ay) arrayList3.get(i10)).f22725b.f18379id == fyVar.f24384s.f22725b.f18379id) {
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
                        wxVar.E(num.intValue(), view2);
                    }
                    if (fyVar.f24382n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = fyVar.f24384s.f22725b;
                        tL_inputStickerSetID2.f18372id = stickerSet4.f18379id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.m2 m2Var = nzVar2.Y1;
                            if (m2Var == null) {
                                m2Var = new ai.y3(fyVar, 6);
                            }
                            vv.W(m2Var, stickerSet5, true, null, new aq(fyVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(fyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        fyVar.f24382n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                nz nzVar3 = fyVar.E;
                ay ayVar3 = fyVar.f24384s;
                if (ayVar3 != null && (stickerSet3 = ayVar3.f22725b) != null) {
                    ayVar3.f22727f = false;
                    ArrayList arrayList4 = nzVar3.f26857p1;
                    int i14 = nzVar3.f26818c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f18379id));
                    fyVar.a(true);
                    rx rxVar = nzVar3.I;
                    if (rxVar != null) {
                        rxVar.p(nzVar3.getEmojipacks());
                    }
                    nzVar3.U(nzVar3.Q.I0());
                    if (fyVar.f24383r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = fyVar.f24384s.f22725b;
                        tL_inputStickerSetID3.f18372id = stickerSet6.f18379id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.m2 m2Var2 = nzVar3.Y1;
                            if (m2Var2 == null) {
                                m2Var2 = new ai.y3(fyVar, 6);
                            }
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                            xw xwVar = new xw(2, fyVar, stickerSet7);
                            Pattern pattern = vv.V;
                            if (m2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(m2Var3.getCurrentAccount()).toggleStickerSet(m2Var3.getFragmentView().getContext(), stickerSet7, 0, m2Var3, true, true, xwVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(fyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        fyVar.f24383r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                oy oyVar = fyVar.E.f26871t1;
                if (oyVar != null) {
                    oyVar.q();
                    return;
                }
                return;
            case 5:
                oy oyVar2 = fyVar.E.f26871t1;
                if (oyVar2 != null) {
                    oyVar2.q();
                    return;
                }
                return;
            default:
                oy oyVar3 = fyVar.E.f26871t1;
                if (oyVar3 != null) {
                    oyVar3.q();
                    return;
                }
                return;
        }
    }
}
