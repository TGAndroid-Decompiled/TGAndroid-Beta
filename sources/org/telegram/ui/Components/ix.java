package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class ix implements View.OnClickListener {
    public final int f36262a;
    public final jx f36263b;

    public ix(jx jxVar, int i7) {
        this.f36262a = i7;
        this.f36263b = jxVar;
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
        int i10 = this.f36262a;
        jx jxVar = this.f36263b;
        switch (i10) {
            case 0:
                fx fxVar = jxVar.f36552x;
                if (fxVar != null && (stickerSet = fxVar.f35172b) != null) {
                    ry ryVar = jxVar.H;
                    if (!ryVar.f39409x2) {
                        ryVar.f39409x2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f28425id = stickerSet.f28432id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new lw(ryVar, ryVar.Z1, ryVar.getContext(), ryVar.f39335a2, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ug.s0 s0Var = jxVar.f36549r;
                TextView textView = jxVar.f36548n;
                TextView textView2 = jxVar.h;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (s0Var != null && s0Var.getVisibility() == 0 && s0Var.f58867w.isEnabled()) {
                    s0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                ry ryVar2 = jxVar.H;
                ArrayList arrayList2 = ryVar2.f39383q1;
                fx fxVar2 = jxVar.f36552x;
                if (fxVar2 != null && (stickerSet2 = fxVar2.f35172b) != null) {
                    fxVar2.f35175f = true;
                    bx bxVar = ryVar2.S;
                    int i11 = ryVar2.f39345d1;
                    ArrayList arrayList3 = ryVar2.f39387r1;
                    ex exVar = ryVar2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f28432id))) {
                        arrayList2.add(Long.valueOf(jxVar.f36552x.f35172b.f28432id));
                    }
                    jxVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 < exVar.getChildCount()) {
                            if ((exVar.getChildAt(i12) instanceof hx) && (R = RecyclerView.R((view2 = exVar.getChildAt(i12)))) >= 0 && (i7 = bxVar.f33808x.get(R)) >= 0 && i7 < arrayList3.size() && arrayList3.get(i7) != null && jxVar.f36552x != null && ((fx) arrayList3.get(i7)).f35172b.f28432id == jxVar.f36552x.f35172b.f28432id) {
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
                        bxVar.E(num.intValue(), view2);
                    }
                    if (jxVar.f36550s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = jxVar.f36552x.f35172b;
                        tL_inputStickerSetID2.f28425id = stickerSet4.f28432id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(i11).o0(tL_inputStickerSetID2, true);
                        if (o02 != null && o02.set != null) {
                            org.telegram.ui.ActionBar.h2 h2Var = ryVar2.Z1;
                            if (h2Var == null) {
                                h2Var = new bi.z8(jxVar, 8);
                            }
                            bv.K0(h2Var, o02, true, null, new mo(jxVar, 15));
                            return;
                        }
                        org.telegram.messenger.ks.f(i11).c(jxVar, 64);
                        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i11);
                        jxVar.f36550s = tL_inputStickerSetID2;
                        d02.o0(tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ry ryVar3 = jxVar.H;
                fx fxVar3 = jxVar.f36552x;
                if (fxVar3 != null && (stickerSet3 = fxVar3.f35172b) != null) {
                    fxVar3.f35175f = false;
                    ArrayList arrayList4 = ryVar3.f39383q1;
                    int i13 = ryVar3.f39345d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f28432id));
                    jxVar.a(true);
                    ww wwVar = ryVar3.J;
                    if (wwVar != null) {
                        wwVar.p(ryVar3.getEmojipacks());
                    }
                    ryVar3.V(ryVar3.R.I0());
                    if (jxVar.f36551w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = jxVar.f36552x.f35172b;
                        tL_inputStickerSetID3.f28425id = stickerSet5.f28432id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet o03 = org.telegram.messenger.ri.d0(i13).o0(tL_inputStickerSetID3, true);
                        if (o03 != null && o03.set != null) {
                            org.telegram.ui.ActionBar.h2 h2Var2 = ryVar3.Z1;
                            if (h2Var2 == null) {
                                h2Var2 = new bi.z8(jxVar, 8);
                            }
                            org.telegram.ui.ActionBar.h2 h2Var3 = h2Var2;
                            dw dwVar = new dw(1, jxVar, o03);
                            Pattern pattern = bv.Q1;
                            if (h2Var3.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(h2Var3.getCurrentAccount()).l2(h2Var3.getFragmentView().getContext(), o03, null, 0, h2Var3, null, true, true, dwVar, false);
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.ks.f(i13).c(jxVar, 64);
                        org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(i13);
                        jxVar.f36551w = tL_inputStickerSetID3;
                        d03.o0(tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                rx rxVar = jxVar.H.f39397u1;
                if (rxVar != null) {
                    rxVar.q();
                    return;
                }
                return;
            case 5:
                rx rxVar2 = jxVar.H.f39397u1;
                if (rxVar2 != null) {
                    rxVar2.q();
                    return;
                }
                return;
            default:
                rx rxVar3 = jxVar.H.f39397u1;
                if (rxVar3 != null) {
                    rxVar3.q();
                    return;
                }
                return;
        }
    }
}
