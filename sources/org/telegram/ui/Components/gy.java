package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class gy implements View.OnClickListener {
    public final int f23451a;
    public final iy f23452b;

    public gy(iy iyVar, int i10) {
        this.f23451a = i10;
        this.f23452b = iyVar;
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
        int i11 = this.f23451a;
        iy iyVar = this.f23452b;
        switch (i11) {
            case 0:
                dy dyVar = iyVar.f24164s;
                if (dyVar != null && (stickerSet = dyVar.f22499b) != null) {
                    rz rzVar = iyVar.E;
                    if (!rzVar.f26869w2) {
                        rzVar.f26869w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f17215id = stickerSet.f17222id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new jx(rzVar, rzVar.Y1, rzVar.getContext(), rzVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                qg.s0 s0Var = iyVar.h;
                TextView textView = iyVar.f24161f;
                TextView textView2 = iyVar.e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (s0Var != null && s0Var.getVisibility() == 0 && s0Var.f40904r.isEnabled()) {
                    s0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                rz rzVar2 = iyVar.E;
                ArrayList arrayList2 = rzVar2.f26844p1;
                dy dyVar2 = iyVar.f24164s;
                if (dyVar2 != null && (stickerSet2 = dyVar2.f22499b) != null) {
                    dyVar2.f22501f = true;
                    yx yxVar = rzVar2.R;
                    int i12 = rzVar2.f26805c1;
                    ArrayList arrayList3 = rzVar2.f26847q1;
                    px pxVar = rzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f17222id))) {
                        arrayList2.add(Long.valueOf(iyVar.f24164s.f22499b.f17222id));
                    }
                    iyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < pxVar.getChildCount()) {
                            if ((pxVar.getChildAt(i13) instanceof fy) && (R = RecyclerView.R((view2 = pxVar.getChildAt(i13)))) >= 0 && (i10 = yxVar.f29522w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && iyVar.f24164s != null && ((dy) arrayList3.get(i10)).f22499b.f17222id == iyVar.f24164s.f22499b.f17222id) {
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
                        yxVar.E(num.intValue(), view2);
                    }
                    if (iyVar.f24162n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = iyVar.f24164s.f22499b;
                        tL_inputStickerSetID2.f17215id = stickerSet4.f17222id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.p2 p2Var = rzVar2.Y1;
                            if (p2Var == null) {
                                p2Var = new bi.o1(iyVar, 4);
                            }
                            wv.W(p2Var, stickerSet5, true, null, new dq(iyVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(iyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        iyVar.f24162n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                rz rzVar3 = iyVar.E;
                dy dyVar3 = iyVar.f24164s;
                if (dyVar3 != null && (stickerSet3 = dyVar3.f22499b) != null) {
                    dyVar3.f22501f = false;
                    ArrayList arrayList4 = rzVar3.f26844p1;
                    int i14 = rzVar3.f26805c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f17222id));
                    iyVar.a(true);
                    ow owVar = rzVar3.I;
                    if (owVar != null) {
                        owVar.p(rzVar3.getEmojipacks());
                    }
                    rzVar3.W(rzVar3.Q.I0());
                    if (iyVar.f24163r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = iyVar.f24164s.f22499b;
                        tL_inputStickerSetID3.f17215id = stickerSet6.f17222id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = rzVar3.Y1;
                            if (p2Var2 == null) {
                                p2Var2 = new bi.o1(iyVar, 4);
                            }
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                            hy hyVar = new hy(0, iyVar, stickerSet7);
                            Pattern pattern = wv.V;
                            if (p2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(p2Var3.getCurrentAccount()).toggleStickerSet(p2Var3.getFragmentView().getContext(), stickerSet7, 0, p2Var3, true, true, hyVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(iyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        iyVar.f24163r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                sy syVar = iyVar.E.f26858t1;
                if (syVar != null) {
                    syVar.q();
                    return;
                }
                return;
            case 5:
                sy syVar2 = iyVar.E.f26858t1;
                if (syVar2 != null) {
                    syVar2.q();
                    return;
                }
                return;
            default:
                sy syVar3 = iyVar.E.f26858t1;
                if (syVar3 != null) {
                    syVar3.q();
                    return;
                }
                return;
        }
    }
}
