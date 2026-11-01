package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class lx implements View.OnClickListener {
    public final int f28299a;
    public final mx f28300b;

    public lx(mx mxVar, int i10) {
        this.f28299a = i10;
        this.f28300b = mxVar;
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
        int i11 = this.f28299a;
        mx mxVar = this.f28300b;
        switch (i11) {
            case 0:
                ix ixVar = mxVar.f28602x;
                if (ixVar != null && (stickerSet = ixVar.f27193b) != null) {
                    vy vyVar = mxVar.G;
                    if (!vyVar.f32007w2) {
                        vyVar.f32007w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f19814id = stickerSet.f19821id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new nw(vyVar, vyVar.Y1, vyVar.getContext(), vyVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                kg.x0 x0Var = mxVar.f28599r;
                TextView textView = mxVar.f28598n;
                TextView textView2 = mxVar.h;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (x0Var != null && x0Var.getVisibility() == 0 && x0Var.f11332w.isEnabled()) {
                    x0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                vy vyVar2 = mxVar.G;
                ArrayList arrayList2 = vyVar2.f31982p1;
                ix ixVar2 = mxVar.f28602x;
                if (ixVar2 != null && (stickerSet2 = ixVar2.f27193b) != null) {
                    ixVar2.f27195f = true;
                    ex exVar = vyVar2.R;
                    int i12 = vyVar2.f31943c1;
                    ArrayList arrayList3 = vyVar2.f31985q1;
                    hx hxVar = vyVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f19821id))) {
                        arrayList2.add(Long.valueOf(mxVar.f28602x.f27193b.f19821id));
                    }
                    mxVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < hxVar.getChildCount()) {
                            if ((hxVar.getChildAt(i13) instanceof kx) && (R = RecyclerView.R((view2 = hxVar.getChildAt(i13)))) >= 0 && (i10 = exVar.f25962x.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && mxVar.f28602x != null && ((ix) arrayList3.get(i10)).f27193b.f19821id == mxVar.f28602x.f27193b.f19821id) {
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
                        exVar.E(num.intValue(), view2);
                    }
                    if (mxVar.f28600s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = mxVar.f28602x.f27193b;
                        tL_inputStickerSetID2.f19814id = stickerSet4.f19821id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.vi.b0(i12).m0(tL_inputStickerSetID2, true);
                        if (m0 != null && m0.set != null) {
                            org.telegram.ui.ActionBar.k2 k2Var = vyVar2.Y1;
                            if (k2Var == null) {
                                k2Var = new kg.q1(mxVar, 4);
                            }
                            cv.J0(k2Var, m0, true, null, new ho(mxVar, 15));
                            return;
                        }
                        org.telegram.messenger.at.f(i12).c(mxVar, 64);
                        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(i12);
                        mxVar.f28600s = tL_inputStickerSetID2;
                        b02.m0(tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                vy vyVar3 = mxVar.G;
                ix ixVar3 = mxVar.f28602x;
                if (ixVar3 != null && (stickerSet3 = ixVar3.f27193b) != null) {
                    ixVar3.f27195f = false;
                    ArrayList arrayList4 = vyVar3.f31982p1;
                    int i14 = vyVar3.f31943c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f19821id));
                    mxVar.a(true);
                    zw zwVar = vyVar3.I;
                    if (zwVar != null) {
                        zwVar.p(vyVar3.getEmojipacks());
                    }
                    vyVar3.V(vyVar3.Q.I0());
                    if (mxVar.f28601w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = mxVar.f28602x.f27193b;
                        tL_inputStickerSetID3.f19814id = stickerSet5.f19821id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet m02 = org.telegram.messenger.vi.b0(i14).m0(tL_inputStickerSetID3, true);
                        if (m02 != null && m02.set != null) {
                            org.telegram.ui.ActionBar.k2 k2Var2 = vyVar3.Y1;
                            if (k2Var2 == null) {
                                k2Var2 = new kg.q1(mxVar, 4);
                            }
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                            at atVar = new at(5, mxVar, m02);
                            Pattern pattern = cv.M1;
                            if (k2Var3.getFragmentView() != null) {
                                org.telegram.messenger.vi.b0(k2Var3.getCurrentAccount()).g2(k2Var3.getFragmentView().getContext(), m02, null, 0, k2Var3, null, true, true, atVar, false);
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.at.f(i14).c(mxVar, 64);
                        org.telegram.messenger.vi b03 = org.telegram.messenger.vi.b0(i14);
                        mxVar.f28601w = tL_inputStickerSetID3;
                        b03.m0(tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                vx vxVar = mxVar.G.f31996t1;
                if (vxVar != null) {
                    vxVar.q();
                    return;
                }
                return;
            case 5:
                vx vxVar2 = mxVar.G.f31996t1;
                if (vxVar2 != null) {
                    vxVar2.q();
                    return;
                }
                return;
            default:
                vx vxVar3 = mxVar.G.f31996t1;
                if (vxVar3 != null) {
                    vxVar3.q();
                    return;
                }
                return;
        }
    }
}
