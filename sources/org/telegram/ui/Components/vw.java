package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class vw implements View.OnClickListener {
    public final int f39807a;
    public final ww f39808b;

    public vw(ww wwVar, int i3) {
        this.f39807a = i3;
        this.f39808b = wwVar;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        Integer num;
        View view2;
        int R;
        int i3;
        TLRPC.StickerSet stickerSet3;
        int i10 = this.f39807a;
        ww wwVar = this.f39808b;
        switch (i10) {
            case 0:
                sw swVar = wwVar.f40165x;
                if (swVar != null && (stickerSet = swVar.f38125b) != null) {
                    ey eyVar = wwVar.H;
                    if (!eyVar.f33594x2) {
                        eyVar.f33594x2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f27021id = stickerSet.f27028id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new yv(eyVar, eyVar.Z1, eyVar.getContext(), eyVar.f33520a2, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                vg.o0 o0Var = wwVar.f40162r;
                TextView textView = wwVar.f40161n;
                TextView textView2 = wwVar.h;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (o0Var != null && o0Var.getVisibility() == 0 && o0Var.f56767w.isEnabled()) {
                    o0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                ey eyVar2 = wwVar.H;
                ArrayList arrayList2 = eyVar2.f33568q1;
                sw swVar2 = wwVar.f40165x;
                if (swVar2 != null && (stickerSet2 = swVar2.f38125b) != null) {
                    swVar2.f38128f = true;
                    ow owVar = eyVar2.S;
                    int i11 = eyVar2.f33529d1;
                    ArrayList arrayList3 = eyVar2.f33572r1;
                    rw rwVar = eyVar2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f27028id))) {
                        arrayList2.add(Long.valueOf(wwVar.f40165x.f38125b.f27028id));
                    }
                    wwVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 < rwVar.getChildCount()) {
                            if ((rwVar.getChildAt(i12) instanceof uw) && (R = RecyclerView.R((view2 = rwVar.getChildAt(i12)))) >= 0 && (i3 = owVar.f36956x.get(R)) >= 0 && i3 < arrayList3.size() && arrayList3.get(i3) != null && wwVar.f40165x != null && ((sw) arrayList3.get(i3)).f38125b.f27028id == wwVar.f40165x.f38125b.f27028id) {
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
                        owVar.E(num.intValue(), view2);
                    }
                    if (wwVar.f40163s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = wwVar.f40165x.f38125b;
                        tL_inputStickerSetID2.f27021id = stickerSet4.f27028id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(i11).m0(tL_inputStickerSetID2, true);
                        if (m0 != null && m0.set != null) {
                            org.telegram.ui.ActionBar.d2 d2Var = eyVar2.Z1;
                            if (d2Var == null) {
                                d2Var = new ai.c7(wwVar, 8);
                            }
                            pu.J0(d2Var, m0, true, null, new gp(wwVar, 13));
                            return;
                        }
                        org.telegram.messenger.hs.f(i11).c(wwVar, 64);
                        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i11);
                        wwVar.f40163s = tL_inputStickerSetID2;
                        b02.m0(tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ey eyVar3 = wwVar.H;
                sw swVar3 = wwVar.f40165x;
                if (swVar3 != null && (stickerSet3 = swVar3.f38125b) != null) {
                    swVar3.f38128f = false;
                    ArrayList arrayList4 = eyVar3.f33568q1;
                    int i13 = eyVar3.f33529d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f27028id));
                    wwVar.a(true);
                    jw jwVar = eyVar3.J;
                    if (jwVar != null) {
                        jwVar.p(eyVar3.getEmojipacks());
                    }
                    eyVar3.U(eyVar3.R.I0());
                    if (wwVar.f40164w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = wwVar.f40165x.f38125b;
                        tL_inputStickerSetID3.f27021id = stickerSet5.f27028id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet m02 = org.telegram.messenger.li.b0(i13).m0(tL_inputStickerSetID3, true);
                        if (m02 != null && m02.set != null) {
                            org.telegram.ui.ActionBar.d2 d2Var2 = eyVar3.Z1;
                            if (d2Var2 == null) {
                                d2Var2 = new ai.c7(wwVar, 8);
                            }
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                            cl clVar = new cl(16, wwVar, m02);
                            Pattern pattern = pu.N1;
                            if (d2Var3.getFragmentView() != null) {
                                org.telegram.messenger.li.b0(d2Var3.getCurrentAccount()).g2(d2Var3.getFragmentView().getContext(), m02, null, 0, d2Var3, null, true, true, clVar, false);
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.hs.f(i13).c(wwVar, 64);
                        org.telegram.messenger.li b03 = org.telegram.messenger.li.b0(i13);
                        wwVar.f40164w = tL_inputStickerSetID3;
                        b03.m0(tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                fx fxVar = wwVar.H.f33582u1;
                if (fxVar != null) {
                    fxVar.q();
                    return;
                }
                return;
            case 5:
                fx fxVar2 = wwVar.H.f33582u1;
                if (fxVar2 != null) {
                    fxVar2.q();
                    return;
                }
                return;
            default:
                fx fxVar3 = wwVar.H.f33582u1;
                if (fxVar3 != null) {
                    fxVar3.q();
                    return;
                }
                return;
        }
    }
}
