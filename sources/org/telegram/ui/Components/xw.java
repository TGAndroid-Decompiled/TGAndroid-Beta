package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class xw implements View.OnClickListener {
    public final int f40513a;
    public final yw f40514b;

    public xw(yw ywVar, int i7) {
        this.f40513a = i7;
        this.f40514b = ywVar;
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
        int i10 = this.f40513a;
        yw ywVar = this.f40514b;
        switch (i10) {
            case 0:
                uw uwVar = ywVar.f40822x;
                if (uwVar != null && (stickerSet = uwVar.f38810b) != null) {
                    hy hyVar = ywVar.G;
                    if (!hyVar.f34478w2) {
                        hyVar.f34478w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f26976id = stickerSet.f26983id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new aw(hyVar, hyVar.Y1, hyVar.getContext(), hyVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ug.p0 p0Var = ywVar.f40819r;
                TextView textView = ywVar.f40818n;
                TextView textView2 = ywVar.h;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (p0Var != null && p0Var.getVisibility() == 0 && p0Var.f56773w.isEnabled()) {
                    p0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                hy hyVar2 = ywVar.G;
                ArrayList arrayList2 = hyVar2.f34453p1;
                uw uwVar2 = ywVar.f40822x;
                if (uwVar2 != null && (stickerSet2 = uwVar2.f38810b) != null) {
                    uwVar2.f38813f = true;
                    qw qwVar = hyVar2.R;
                    int i11 = hyVar2.f34415c1;
                    ArrayList arrayList3 = hyVar2.f34456q1;
                    tw twVar = hyVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f26983id))) {
                        arrayList2.add(Long.valueOf(ywVar.f40822x.f38810b.f26983id));
                    }
                    ywVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 < twVar.getChildCount()) {
                            if ((twVar.getChildAt(i12) instanceof ww) && (R = RecyclerView.R((view2 = twVar.getChildAt(i12)))) >= 0 && (i7 = qwVar.f37485x.get(R)) >= 0 && i7 < arrayList3.size() && arrayList3.get(i7) != null && ywVar.f40822x != null && ((uw) arrayList3.get(i7)).f38810b.f26983id == ywVar.f40822x.f38810b.f26983id) {
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
                        qwVar.E(num.intValue(), view2);
                    }
                    if (ywVar.f40820s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = ywVar.f40822x.f38810b;
                        tL_inputStickerSetID2.f26976id = stickerSet4.f26983id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i11).m0(tL_inputStickerSetID2, true);
                        if (m0 != null && m0.set != null) {
                            org.telegram.ui.ActionBar.f2 f2Var = hyVar2.Y1;
                            if (f2Var == null) {
                                f2Var = new bi.w4(ywVar, 7);
                            }
                            ru.J0(f2Var, m0, true, null, new gp(ywVar, 13));
                            return;
                        }
                        org.telegram.messenger.qs.f(i11).c(ywVar, 64);
                        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i11);
                        ywVar.f40820s = tL_inputStickerSetID2;
                        b02.m0(tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                hy hyVar3 = ywVar.G;
                uw uwVar3 = ywVar.f40822x;
                if (uwVar3 != null && (stickerSet3 = uwVar3.f38810b) != null) {
                    uwVar3.f38813f = false;
                    ArrayList arrayList4 = hyVar3.f34453p1;
                    int i13 = hyVar3.f34415c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f26983id));
                    ywVar.a(true);
                    lw lwVar = hyVar3.I;
                    if (lwVar != null) {
                        lwVar.p(hyVar3.getEmojipacks());
                    }
                    hyVar3.U(hyVar3.Q.I0());
                    if (ywVar.f40821w == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet5 = ywVar.f40822x.f38810b;
                        tL_inputStickerSetID3.f26976id = stickerSet5.f26983id;
                        tL_inputStickerSetID3.access_hash = stickerSet5.access_hash;
                        TLRPC.TL_messages_stickerSet m02 = org.telegram.messenger.ui.b0(i13).m0(tL_inputStickerSetID3, true);
                        if (m02 != null && m02.set != null) {
                            org.telegram.ui.ActionBar.f2 f2Var2 = hyVar3.Y1;
                            if (f2Var2 == null) {
                                f2Var2 = new bi.w4(ywVar, 7);
                            }
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                            fq fqVar = new fq(11, ywVar, m02);
                            Pattern pattern = ru.M1;
                            if (f2Var3.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(f2Var3.getCurrentAccount()).g2(f2Var3.getFragmentView().getContext(), m02, null, 0, f2Var3, null, true, true, fqVar, false);
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.qs.f(i13).c(ywVar, 64);
                        org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i13);
                        ywVar.f40821w = tL_inputStickerSetID3;
                        b03.m0(tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ix ixVar = ywVar.G.f34467t1;
                if (ixVar != null) {
                    ixVar.q();
                    return;
                }
                return;
            case 5:
                ix ixVar2 = ywVar.G.f34467t1;
                if (ixVar2 != null) {
                    ixVar2.q();
                    return;
                }
                return;
            default:
                ix ixVar3 = ywVar.G.f34467t1;
                if (ixVar3 != null) {
                    ixVar3.q();
                    return;
                }
                return;
        }
    }
}
