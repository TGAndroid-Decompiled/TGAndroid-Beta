package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class kx implements View.OnClickListener {
    public final int f37031a;
    public final lx f37032b;

    public kx(lx lxVar, int i7) {
        this.f37031a = i7;
        this.f37032b = lxVar;
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
        int i10 = this.f37031a;
        lx lxVar = this.f37032b;
        switch (i10) {
            case 0:
                hx hxVar = lxVar.f37315x;
                if (hxVar != null && (stickerSet = hxVar.f35988b) != null) {
                    ty tyVar = lxVar.H;
                    if (!tyVar.f40163x2) {
                        tyVar.f40163x2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f28451id = stickerSet.f28458id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new nw(tyVar, tyVar.Z1, tyVar.getContext(), tyVar.f40089a2, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ug.r0 r0Var = lxVar.f37312r;
                TextView textView = lxVar.f37311n;
                TextView textView2 = lxVar.h;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (r0Var != null && r0Var.getVisibility() == 0 && r0Var.f58904w.isEnabled()) {
                    r0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                ty tyVar2 = lxVar.H;
                ArrayList arrayList2 = tyVar2.f40137q1;
                hx hxVar2 = lxVar.f37315x;
                if (hxVar2 != null && (stickerSet2 = hxVar2.f35988b) != null) {
                    hxVar2.f35991f = true;
                    dx dxVar = tyVar2.S;
                    int i11 = tyVar2.f40099d1;
                    ArrayList arrayList3 = tyVar2.f40141r1;
                    gx gxVar = tyVar2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f28458id))) {
                        arrayList2.add(Long.valueOf(lxVar.f37315x.f35988b.f28458id));
                    }
                    lxVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 < gxVar.getChildCount()) {
                            if ((gxVar.getChildAt(i12) instanceof jx) && (R = RecyclerView.R((view2 = gxVar.getChildAt(i12)))) >= 0 && (i7 = dxVar.f34608x.get(R)) >= 0 && i7 < arrayList3.size() && arrayList3.get(i7) != null && lxVar.f37315x != null && ((hx) arrayList3.get(i7)).f35988b.f28458id == lxVar.f37315x.f35988b.f28458id) {
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
                        dxVar.E(num.intValue(), view2);
                    }
                    if (lxVar.f37313s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = lxVar.f37315x.f35988b;
                        tL_inputStickerSetID2.f28451id = stickerSet4.f28458id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(i11).o0(tL_inputStickerSetID2, true);
                        if (o02 != null && o02.set != null) {
                            org.telegram.ui.ActionBar.g2 g2Var = tyVar2.Z1;
                            if (g2Var == null) {
                                g2Var = new bi.c9(lxVar, 8);
                            }
                            ev.K0(g2Var, o02, true, null, new oo(lxVar, 15));
                            return;
                        }
                        org.telegram.messenger.ks.f(i11).c(lxVar, 64);
                        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i11);
                        lxVar.f37313s = tL_inputStickerSetID2;
                        d02.o0(tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ty tyVar3 = lxVar.H;
                hx hxVar3 = lxVar.f37315x;
                if (hxVar3 != null && (stickerSet3 = hxVar3.f35988b) != null) {
                    hxVar3.f35991f = false;
                    ArrayList arrayList4 = tyVar3.f40137q1;
                    int i13 = tyVar3.f40099d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f28458id));
                    lxVar.a(true);
                    yw ywVar = tyVar3.J;
                    if (ywVar != null) {
                        ywVar.p(tyVar3.getEmojipacks());
                    }
                    tyVar3.V(tyVar3.R.I0());
                    if (lxVar.f37314w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = lxVar.f37315x.f35988b;
                        tL_inputStickerSetID3.f28451id = stickerSet5.f28458id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet o03 = org.telegram.messenger.ri.d0(i13).o0(tL_inputStickerSetID3, true);
                        if (o03 != null && o03.set != null) {
                            org.telegram.ui.ActionBar.g2 g2Var2 = tyVar3.Z1;
                            if (g2Var2 == null) {
                                g2Var2 = new bi.c9(lxVar, 8);
                            }
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                            ou ouVar = new ou(3, lxVar, o03);
                            Pattern pattern = ev.Q1;
                            if (g2Var3.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(g2Var3.getCurrentAccount()).l2(g2Var3.getFragmentView().getContext(), o03, null, 0, g2Var3, null, true, true, ouVar, false);
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.ks.f(i13).c(lxVar, 64);
                        org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(i13);
                        lxVar.f37314w = tL_inputStickerSetID3;
                        d03.o0(tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                tx txVar = lxVar.H.f40151u1;
                if (txVar != null) {
                    txVar.q();
                    return;
                }
                return;
            case 5:
                tx txVar2 = lxVar.H.f40151u1;
                if (txVar2 != null) {
                    txVar2.q();
                    return;
                }
                return;
            default:
                tx txVar3 = lxVar.H.f40151u1;
                if (txVar3 != null) {
                    txVar3.q();
                    return;
                }
                return;
        }
    }
}
