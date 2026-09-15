package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class zx implements View.OnClickListener {
    public final int f30669a;
    public final ay f30670b;

    public zx(ay ayVar, int i10) {
        this.f30669a = i10;
        this.f30670b = ayVar;
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
        int i11 = this.f30669a;
        ay ayVar = this.f30670b;
        switch (i11) {
            case 0:
                wx wxVar = ayVar.f22512s;
                if (wxVar != null && (stickerSet = wxVar.f29823b) != null) {
                    kz kzVar = ayVar.E;
                    if (!kzVar.f25763v2) {
                        kzVar.f25763v2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f18132id = stickerSet.f18139id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new cx(kzVar, kzVar.Y1, kzVar.getContext(), kzVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rg.p0 p0Var = ayVar.h;
                TextView textView = ayVar.f22509f;
                TextView textView2 = ayVar.e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (p0Var != null && p0Var.getVisibility() == 0 && p0Var.f42426r.isEnabled()) {
                    p0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                kz kzVar2 = ayVar.E;
                ArrayList arrayList2 = kzVar2.f25742p1;
                wx wxVar2 = ayVar.f22512s;
                if (wxVar2 != null && (stickerSet2 = wxVar2.f29823b) != null) {
                    wxVar2.f29825f = true;
                    sx sxVar = kzVar2.R;
                    int i12 = kzVar2.f25703c1;
                    ArrayList arrayList3 = kzVar2.f25745q1;
                    vx vxVar = kzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f18139id))) {
                        arrayList2.add(Long.valueOf(ayVar.f22512s.f29823b.f18139id));
                    }
                    ayVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < vxVar.getChildCount()) {
                            if ((vxVar.getChildAt(i13) instanceof yx) && (R = RecyclerView.R((view2 = vxVar.getChildAt(i13)))) >= 0 && (i10 = sxVar.f27991w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && ayVar.f22512s != null && ((wx) arrayList3.get(i10)).f29823b.f18139id == ayVar.f22512s.f29823b.f18139id) {
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
                        sxVar.E(num.intValue(), view2);
                    }
                    if (ayVar.f22510n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = ayVar.f22512s.f29823b;
                        tL_inputStickerSetID2.f18132id = stickerSet4.f18139id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var = kzVar2.Y1;
                            if (n2Var == null) {
                                n2Var = new ai.y3(ayVar, 6);
                            }
                            sv.W(n2Var, stickerSet5, true, null, new xp(ayVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(ayVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        ayVar.f22510n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                kz kzVar3 = ayVar.E;
                wx wxVar3 = ayVar.f22512s;
                if (wxVar3 != null && (stickerSet3 = wxVar3.f29823b) != null) {
                    wxVar3.f29825f = false;
                    ArrayList arrayList4 = kzVar3.f25742p1;
                    int i14 = kzVar3.f25703c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f18139id));
                    ayVar.a(true);
                    nx nxVar = kzVar3.I;
                    if (nxVar != null) {
                        nxVar.p(kzVar3.getEmojipacks());
                    }
                    kzVar3.V(kzVar3.Q.I0());
                    if (ayVar.f22511r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = ayVar.f22512s.f29823b;
                        tL_inputStickerSetID3.f18132id = stickerSet6.f18139id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = kzVar3.Y1;
                            if (n2Var2 == null) {
                                n2Var2 = new ai.y3(ayVar, 6);
                            }
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                            oh ohVar = new oh(27, ayVar, stickerSet7);
                            Pattern pattern = sv.V;
                            if (n2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(n2Var3.getCurrentAccount()).toggleStickerSet(n2Var3.getFragmentView().getContext(), stickerSet7, 0, n2Var3, true, true, ohVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(ayVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        ayVar.f22511r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ky kyVar = ayVar.E.f25756t1;
                if (kyVar != null) {
                    kyVar.q();
                    return;
                }
                return;
            case 5:
                ky kyVar2 = ayVar.E.f25756t1;
                if (kyVar2 != null) {
                    kyVar2.q();
                    return;
                }
                return;
            default:
                ky kyVar3 = ayVar.E.f25756t1;
                if (kyVar3 != null) {
                    kyVar3.q();
                    return;
                }
                return;
        }
    }
}
