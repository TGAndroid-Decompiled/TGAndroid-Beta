package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class hx implements View.OnClickListener {
    public final int f35845a;
    public final ix f35846b;

    public hx(ix ixVar, int i7) {
        this.f35845a = i7;
        this.f35846b = ixVar;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        Integer num;
        View view2;
        int R;
        int i7;
        TLRPC.StickerSet stickerSet3;
        int i10 = this.f35845a;
        ix ixVar = this.f35846b;
        switch (i10) {
            case 0:
                ex exVar = ixVar.f36189x;
                if (exVar != null && (stickerSet = exVar.f34856b) != null) {
                    qy qyVar = ixVar.H;
                    if (!qyVar.f39111x2) {
                        qyVar.f39111x2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f28512id = stickerSet.f28519id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new kw(qyVar, qyVar.Z1, qyVar.getContext(), qyVar.f39037a2, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ug.r0 r0Var = ixVar.f36186r;
                TextView textView = ixVar.f36185n;
                TextView textView2 = ixVar.h;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (r0Var != null && r0Var.getVisibility() == 0 && r0Var.f58988w.isEnabled()) {
                    r0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                qy qyVar2 = ixVar.H;
                ArrayList arrayList2 = qyVar2.f39085q1;
                ex exVar2 = ixVar.f36189x;
                if (exVar2 != null && (stickerSet2 = exVar2.f34856b) != null) {
                    exVar2.f34859f = true;
                    ax axVar = qyVar2.S;
                    int i11 = qyVar2.f39047d1;
                    ArrayList arrayList3 = qyVar2.f39089r1;
                    dx dxVar = qyVar2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f28519id))) {
                        arrayList2.add(Long.valueOf(ixVar.f36189x.f34856b.f28519id));
                    }
                    ixVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 < dxVar.getChildCount()) {
                            if ((dxVar.getChildAt(i12) instanceof gx) && (R = RecyclerView.R((view2 = dxVar.getChildAt(i12)))) >= 0 && (i7 = axVar.f33573x.get(R)) >= 0 && i7 < arrayList3.size() && arrayList3.get(i7) != null && ixVar.f36189x != null && ((ex) arrayList3.get(i7)).f34856b.f28519id == ixVar.f36189x.f34856b.f28519id) {
                                num = Integer.valueOf(R);
                            } else {
                                i12++;
                            }
                        } else {
                            num = null;
                            view2 = null;
                        }
                    }
                    if (num != null) {
                        axVar.E(num.intValue(), view2);
                    }
                    if (ixVar.f36187s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = ixVar.f36189x.f34856b;
                        tL_inputStickerSetID2.f28512id = stickerSet4.f28519id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(i11).o0(tL_inputStickerSetID2, true);
                        if (o02 != null && o02.set != null) {
                            org.telegram.ui.ActionBar.g2 g2Var = qyVar2.Z1;
                            if (g2Var == null) {
                                g2Var = new bi.e9(ixVar, 8);
                            }
                            bv.K0(g2Var, o02, true, null, new lo(ixVar, 15));
                            return;
                        }
                        org.telegram.messenger.ks.f(i11).c(ixVar, 64);
                        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i11);
                        ixVar.f36187s = tL_inputStickerSetID2;
                        d02.o0(tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                qy qyVar3 = ixVar.H;
                ex exVar3 = ixVar.f36189x;
                if (exVar3 != null && (stickerSet3 = exVar3.f34856b) != null) {
                    exVar3.f34859f = false;
                    ArrayList arrayList4 = qyVar3.f39085q1;
                    int i13 = qyVar3.f39047d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f28519id));
                    ixVar.a(true);
                    vw vwVar = qyVar3.J;
                    if (vwVar != null) {
                        vwVar.p(qyVar3.getEmojipacks());
                    }
                    qyVar3.V(qyVar3.R.I0());
                    if (ixVar.f36188w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = ixVar.f36189x.f34856b;
                        tL_inputStickerSetID3.f28512id = stickerSet5.f28519id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet o03 = org.telegram.messenger.ri.d0(i13).o0(tL_inputStickerSetID3, true);
                        if (o03 != null && o03.set != null) {
                            org.telegram.ui.ActionBar.g2 g2Var2 = qyVar3.Z1;
                            if (g2Var2 == null) {
                                g2Var2 = new bi.e9(ixVar, 8);
                            }
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                            bt btVar = new bt(5, ixVar, o03);
                            Pattern pattern = bv.Q1;
                            if (g2Var3.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(g2Var3.getCurrentAccount()).l2(g2Var3.getFragmentView().getContext(), o03, null, 0, g2Var3, null, true, true, btVar, false);
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.ks.f(i13).c(ixVar, 64);
                        org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(i13);
                        ixVar.f36188w = tL_inputStickerSetID3;
                        d03.o0(tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                qx qxVar = ixVar.H.f39099u1;
                if (qxVar != null) {
                    qxVar.q();
                    return;
                }
                return;
            case 5:
                qx qxVar2 = ixVar.H.f39099u1;
                if (qxVar2 != null) {
                    qxVar2.q();
                    return;
                }
                return;
            default:
                qx qxVar3 = ixVar.H.f39099u1;
                if (qxVar3 != null) {
                    qxVar3.q();
                    return;
                }
                return;
        }
    }
}
