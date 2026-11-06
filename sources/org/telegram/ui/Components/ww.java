package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class ww implements View.OnClickListener {
    public final int f40104a;
    public final xw f40105b;

    public ww(xw xwVar, int i7) {
        this.f40104a = i7;
        this.f40105b = xwVar;
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
        int i10 = this.f40104a;
        xw xwVar = this.f40105b;
        switch (i10) {
            case 0:
                tw twVar = xwVar.f40450x;
                if (twVar != null && (stickerSet = twVar.f38411b) != null) {
                    gy gyVar = xwVar.G;
                    if (!gyVar.f34087w2) {
                        gyVar.f34087w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f26972id = stickerSet.f26979id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new zv(gyVar, gyVar.Y1, gyVar.getContext(), gyVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ug.p0 p0Var = xwVar.f40447r;
                TextView textView = xwVar.f40446n;
                TextView textView2 = xwVar.h;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (p0Var != null && p0Var.getVisibility() == 0 && p0Var.f56669w.isEnabled()) {
                    p0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                gy gyVar2 = xwVar.G;
                ArrayList arrayList2 = gyVar2.f34062p1;
                tw twVar2 = xwVar.f40450x;
                if (twVar2 != null && (stickerSet2 = twVar2.f38411b) != null) {
                    twVar2.f38414f = true;
                    pw pwVar = gyVar2.R;
                    int i11 = gyVar2.f34024c1;
                    ArrayList arrayList3 = gyVar2.f34065q1;
                    sw swVar = gyVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f26979id))) {
                        arrayList2.add(Long.valueOf(xwVar.f40450x.f38411b.f26979id));
                    }
                    xwVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 < swVar.getChildCount()) {
                            if ((swVar.getChildAt(i12) instanceof vw) && (R = RecyclerView.R((view2 = swVar.getChildAt(i12)))) >= 0 && (i7 = pwVar.f37068x.get(R)) >= 0 && i7 < arrayList3.size() && arrayList3.get(i7) != null && xwVar.f40450x != null && ((tw) arrayList3.get(i7)).f38411b.f26979id == xwVar.f40450x.f38411b.f26979id) {
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
                        pwVar.E(num.intValue(), view2);
                    }
                    if (xwVar.f40448s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = xwVar.f40450x.f38411b;
                        tL_inputStickerSetID2.f26972id = stickerSet4.f26979id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i11).m0(tL_inputStickerSetID2, true);
                        if (m0 != null && m0.set != null) {
                            org.telegram.ui.ActionBar.f2 f2Var = gyVar2.Y1;
                            if (f2Var == null) {
                                f2Var = new bi.w4(xwVar, 7);
                            }
                            qu.J0(f2Var, m0, true, null, new gp(xwVar, 13));
                            return;
                        }
                        org.telegram.messenger.qs.f(i11).c(xwVar, 64);
                        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i11);
                        xwVar.f40448s = tL_inputStickerSetID2;
                        b02.m0(tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                gy gyVar3 = xwVar.G;
                tw twVar3 = xwVar.f40450x;
                if (twVar3 != null && (stickerSet3 = twVar3.f38411b) != null) {
                    twVar3.f38414f = false;
                    ArrayList arrayList4 = gyVar3.f34062p1;
                    int i13 = gyVar3.f34024c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f26979id));
                    xwVar.a(true);
                    kw kwVar = gyVar3.I;
                    if (kwVar != null) {
                        kwVar.p(gyVar3.getEmojipacks());
                    }
                    gyVar3.U(gyVar3.Q.I0());
                    if (xwVar.f40449w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = xwVar.f40450x.f38411b;
                        tL_inputStickerSetID3.f26972id = stickerSet5.f26979id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet m02 = org.telegram.messenger.ui.b0(i13).m0(tL_inputStickerSetID3, true);
                        if (m02 != null && m02.set != null) {
                            org.telegram.ui.ActionBar.f2 f2Var2 = gyVar3.Y1;
                            if (f2Var2 == null) {
                                f2Var2 = new bi.w4(xwVar, 7);
                            }
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                            fq fqVar = new fq(11, xwVar, m02);
                            Pattern pattern = qu.M1;
                            if (f2Var3.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(f2Var3.getCurrentAccount()).g2(f2Var3.getFragmentView().getContext(), m02, null, 0, f2Var3, null, true, true, fqVar, false);
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.qs.f(i13).c(xwVar, 64);
                        org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i13);
                        xwVar.f40449w = tL_inputStickerSetID3;
                        b03.m0(tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                hx hxVar = xwVar.G.f34076t1;
                if (hxVar != null) {
                    hxVar.q();
                    return;
                }
                return;
            case 5:
                hx hxVar2 = xwVar.G.f34076t1;
                if (hxVar2 != null) {
                    hxVar2.q();
                    return;
                }
                return;
            default:
                hx hxVar3 = xwVar.G.f34076t1;
                if (hxVar3 != null) {
                    hxVar3.q();
                    return;
                }
                return;
        }
    }
}
