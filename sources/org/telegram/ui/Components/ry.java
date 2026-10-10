package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ry implements View.OnClickListener {
    public final int f30604a;
    public final sy f30605b;

    public ry(sy syVar, int i10) {
        this.f30604a = i10;
        this.f30605b = syVar;
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
        int i11 = this.f30604a;
        sy syVar = this.f30605b;
        switch (i11) {
            case 0:
                oy oyVar = syVar.f30893s;
                if (oyVar != null && (stickerSet = oyVar.f29619b) != null) {
                    b00 b00Var = syVar.E;
                    if (!b00Var.f24750v2) {
                        b00Var.f24750v2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f20062id = stickerSet.f20069id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new tx(b00Var, b00Var.Y1, b00Var.getContext(), b00Var.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rg.p0 p0Var = syVar.h;
                TextView textView = syVar.f30890f;
                TextView textView2 = syVar.f30889e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (p0Var != null && p0Var.getVisibility() == 0 && p0Var.f47429r.isEnabled()) {
                    p0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                b00 b00Var2 = syVar.E;
                ArrayList arrayList2 = b00Var2.f24729p1;
                oy oyVar2 = syVar.f30893s;
                if (oyVar2 != null && (stickerSet2 = oyVar2.f29619b) != null) {
                    oyVar2.f29622f = true;
                    ky kyVar = b00Var2.R;
                    int i12 = b00Var2.f24689c1;
                    ArrayList arrayList3 = b00Var2.f24732q1;
                    ny nyVar = b00Var2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f20069id))) {
                        arrayList2.add(Long.valueOf(syVar.f30893s.f29619b.f20069id));
                    }
                    syVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < nyVar.getChildCount()) {
                            if ((nyVar.getChildAt(i13) instanceof qy) && (R = RecyclerView.R((view2 = nyVar.getChildAt(i13)))) >= 0 && (i10 = kyVar.f28118w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && syVar.f30893s != null && ((oy) arrayList3.get(i10)).f29619b.f20069id == syVar.f30893s.f29619b.f20069id) {
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
                        kyVar.E(num.intValue(), view2);
                    }
                    if (syVar.f30891n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = syVar.f30893s.f29619b;
                        tL_inputStickerSetID2.f20062id = stickerSet4.f20069id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var = b00Var2.Y1;
                            if (n2Var == null) {
                                n2Var = new ai.z3(syVar, 6);
                            }
                            jw.X(n2Var, stickerSet5, true, null, new nq(syVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(syVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        syVar.f30891n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                b00 b00Var3 = syVar.E;
                oy oyVar3 = syVar.f30893s;
                if (oyVar3 != null && (stickerSet3 = oyVar3.f29619b) != null) {
                    oyVar3.f29622f = false;
                    ArrayList arrayList4 = b00Var3.f24729p1;
                    int i14 = b00Var3.f24689c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f20069id));
                    syVar.a(true);
                    fy fyVar = b00Var3.I;
                    if (fyVar != null) {
                        fyVar.p(b00Var3.getEmojipacks());
                    }
                    b00Var3.U(b00Var3.Q.I0());
                    if (syVar.f30892r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = syVar.f30893s.f29619b;
                        tL_inputStickerSetID3.f20062id = stickerSet6.f20069id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = b00Var3.Y1;
                            if (n2Var2 == null) {
                                n2Var2 = new ai.z3(syVar, 6);
                            }
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                            as asVar = new as(9, syVar, stickerSet7);
                            Pattern pattern = jw.V;
                            if (n2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(n2Var3.getCurrentAccount()).toggleStickerSet(n2Var3.getFragmentView().getContext(), stickerSet7, 0, n2Var3, true, true, asVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(syVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        syVar.f30892r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                bz bzVar = syVar.E.f24743t1;
                if (bzVar != null) {
                    bzVar.q();
                    return;
                }
                return;
            case 5:
                bz bzVar2 = syVar.E.f24743t1;
                if (bzVar2 != null) {
                    bzVar2.q();
                    return;
                }
                return;
            default:
                bz bzVar3 = syVar.E.f24743t1;
                if (bzVar3 != null) {
                    bzVar3.q();
                    return;
                }
                return;
        }
    }
}
