package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class cx implements View.OnClickListener {
    public final int f33717a;
    public final dx f33718b;

    public cx(dx dxVar, int i7) {
        this.f33717a = i7;
        this.f33718b = dxVar;
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
        int i10 = this.f33717a;
        dx dxVar = this.f33718b;
        switch (i10) {
            case 0:
                zw zwVar = dxVar.f34094x;
                if (zwVar != null && (stickerSet = zwVar.f42431b) != null) {
                    ly lyVar = dxVar.H;
                    if (!lyVar.f37005x2) {
                        lyVar.f37005x2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f28071id = stickerSet.f28078id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new fw(lyVar, lyVar.Z1, lyVar.getContext(), lyVar.f36931a2, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ug.q0 q0Var = dxVar.f34091r;
                TextView textView = dxVar.f34090n;
                TextView textView2 = dxVar.h;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (q0Var != null && q0Var.getVisibility() == 0 && q0Var.f58271w.isEnabled()) {
                    q0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                ly lyVar2 = dxVar.H;
                ArrayList arrayList2 = lyVar2.f36979q1;
                zw zwVar2 = dxVar.f34094x;
                if (zwVar2 != null && (stickerSet2 = zwVar2.f42431b) != null) {
                    zwVar2.f42434f = true;
                    vw vwVar = lyVar2.S;
                    int i11 = lyVar2.f36941d1;
                    ArrayList arrayList3 = lyVar2.f36983r1;
                    yw ywVar = lyVar2.Q;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f28078id))) {
                        arrayList2.add(Long.valueOf(dxVar.f34094x.f42431b.f28078id));
                    }
                    dxVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 < ywVar.getChildCount()) {
                            if ((ywVar.getChildAt(i12) instanceof bx) && (R = RecyclerView.R((view2 = ywVar.getChildAt(i12)))) >= 0 && (i7 = vwVar.f41169x.get(R)) >= 0 && i7 < arrayList3.size() && arrayList3.get(i7) != null && dxVar.f34094x != null && ((zw) arrayList3.get(i7)).f42431b.f28078id == dxVar.f34094x.f42431b.f28078id) {
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
                        vwVar.E(num.intValue(), view2);
                    }
                    if (dxVar.f34092s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = dxVar.f34094x.f42431b;
                        tL_inputStickerSetID2.f28071id = stickerSet4.f28078id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.si.b0(i11).m0(tL_inputStickerSetID2, true);
                        if (m0 != null && m0.set != null) {
                            org.telegram.ui.ActionBar.e2 e2Var = lyVar2.Z1;
                            if (e2Var == null) {
                                e2Var = new bi.t6(dxVar, 8);
                            }
                            wu.J0(e2Var, m0, true, null, new fo(dxVar, 15));
                            return;
                        }
                        org.telegram.messenger.ns.f(i11).c(dxVar, 64);
                        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i11);
                        dxVar.f34092s = tL_inputStickerSetID2;
                        b02.m0(tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ly lyVar3 = dxVar.H;
                zw zwVar3 = dxVar.f34094x;
                if (zwVar3 != null && (stickerSet3 = zwVar3.f42431b) != null) {
                    zwVar3.f42434f = false;
                    ArrayList arrayList4 = lyVar3.f36979q1;
                    int i13 = lyVar3.f36941d1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f28078id));
                    dxVar.a(true);
                    qw qwVar = lyVar3.J;
                    if (qwVar != null) {
                        qwVar.p(lyVar3.getEmojipacks());
                    }
                    lyVar3.V(lyVar3.R.I0());
                    if (dxVar.f34093w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = dxVar.f34094x.f42431b;
                        tL_inputStickerSetID3.f28071id = stickerSet5.f28078id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet m02 = org.telegram.messenger.si.b0(i13).m0(tL_inputStickerSetID3, true);
                        if (m02 != null && m02.set != null) {
                            org.telegram.ui.ActionBar.e2 e2Var2 = lyVar3.Z1;
                            if (e2Var2 == null) {
                                e2Var2 = new bi.t6(dxVar, 8);
                            }
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var2;
                            vs vsVar = new vs(5, dxVar, m02);
                            Pattern pattern = wu.Q1;
                            if (e2Var3.getFragmentView() != null) {
                                org.telegram.messenger.si.b0(e2Var3.getCurrentAccount()).g2(e2Var3.getFragmentView().getContext(), m02, null, 0, e2Var3, null, true, true, vsVar, false);
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.ns.f(i13).c(dxVar, 64);
                        org.telegram.messenger.si b03 = org.telegram.messenger.si.b0(i13);
                        dxVar.f34093w = tL_inputStickerSetID3;
                        b03.m0(tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                mx mxVar = dxVar.H.f36993u1;
                if (mxVar != null) {
                    mxVar.q();
                    return;
                }
                return;
            case 5:
                mx mxVar2 = dxVar.H.f36993u1;
                if (mxVar2 != null) {
                    mxVar2.q();
                    return;
                }
                return;
            default:
                mx mxVar3 = dxVar.H.f36993u1;
                if (mxVar3 != null) {
                    mxVar3.q();
                    return;
                }
                return;
        }
    }
}
