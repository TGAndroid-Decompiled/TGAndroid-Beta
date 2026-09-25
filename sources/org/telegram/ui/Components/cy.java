package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class cy implements View.OnClickListener {
    public final int f23412a;
    public final dy f23413b;

    public cy(dy dyVar, int i10) {
        this.f23412a = i10;
        this.f23413b = dyVar;
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
        int i11 = this.f23412a;
        dy dyVar = this.f23413b;
        switch (i11) {
            case 0:
                yx yxVar = dyVar.f23760s;
                if (yxVar != null && (stickerSet = yxVar.f30716b) != null) {
                    lz lzVar = dyVar.E;
                    if (!lzVar.f26297v2) {
                        lzVar.f26297v2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f18356id = stickerSet.f18363id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new ex(lzVar, lzVar.Y1, lzVar.getContext(), lzVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rg.p0 p0Var = dyVar.h;
                TextView textView = dyVar.f23757f;
                TextView textView2 = dyVar.e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (p0Var != null && p0Var.getVisibility() == 0 && p0Var.f42711r.isEnabled()) {
                    p0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                lz lzVar2 = dyVar.E;
                ArrayList arrayList2 = lzVar2.f26276p1;
                yx yxVar2 = dyVar.f23760s;
                if (yxVar2 != null && (stickerSet2 = yxVar2.f30716b) != null) {
                    yxVar2.f30718f = true;
                    ux uxVar = lzVar2.R;
                    int i12 = lzVar2.f26237c1;
                    ArrayList arrayList3 = lzVar2.f26279q1;
                    xx xxVar = lzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f18363id))) {
                        arrayList2.add(Long.valueOf(dyVar.f23760s.f30716b.f18363id));
                    }
                    dyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < xxVar.getChildCount()) {
                            if ((xxVar.getChildAt(i13) instanceof ay) && (R = RecyclerView.R((view2 = xxVar.getChildAt(i13)))) >= 0 && (i10 = uxVar.f28942w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && dyVar.f23760s != null && ((yx) arrayList3.get(i10)).f30716b.f18363id == dyVar.f23760s.f30716b.f18363id) {
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
                        uxVar.E(num.intValue(), view2);
                    }
                    if (dyVar.f23758n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = dyVar.f23760s.f30716b;
                        tL_inputStickerSetID2.f18356id = stickerSet4.f18363id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.m2 m2Var = lzVar2.Y1;
                            if (m2Var == null) {
                                m2Var = new ai.y3(dyVar, 6);
                            }
                            tv.W(m2Var, stickerSet5, true, null, new yp(dyVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(dyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        dyVar.f23758n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                lz lzVar3 = dyVar.E;
                yx yxVar3 = dyVar.f23760s;
                if (yxVar3 != null && (stickerSet3 = yxVar3.f30716b) != null) {
                    yxVar3.f30718f = false;
                    ArrayList arrayList4 = lzVar3.f26276p1;
                    int i14 = lzVar3.f26237c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f18363id));
                    dyVar.a(true);
                    px pxVar = lzVar3.I;
                    if (pxVar != null) {
                        pxVar.p(lzVar3.getEmojipacks());
                    }
                    lzVar3.U(lzVar3.Q.I0());
                    if (dyVar.f23759r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = dyVar.f23760s.f30716b;
                        tL_inputStickerSetID3.f18356id = stickerSet6.f18363id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.m2 m2Var2 = lzVar3.Y1;
                            if (m2Var2 == null) {
                                m2Var2 = new ai.y3(dyVar, 6);
                            }
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                            vw vwVar = new vw(2, dyVar, stickerSet7);
                            Pattern pattern = tv.V;
                            if (m2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(m2Var3.getCurrentAccount()).toggleStickerSet(m2Var3.getFragmentView().getContext(), stickerSet7, 0, m2Var3, true, true, vwVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(dyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        dyVar.f23759r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                my myVar = dyVar.E.f26290t1;
                if (myVar != null) {
                    myVar.q();
                    return;
                }
                return;
            case 5:
                my myVar2 = dyVar.E.f26290t1;
                if (myVar2 != null) {
                    myVar2.q();
                    return;
                }
                return;
            default:
                my myVar3 = dyVar.E.f26290t1;
                if (myVar3 != null) {
                    myVar3.q();
                    return;
                }
                return;
        }
    }
}
