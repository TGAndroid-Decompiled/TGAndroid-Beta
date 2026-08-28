package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class mx implements View.OnClickListener {
    public final int f30931a;
    public final nx f30932b;

    public mx(nx nxVar, int i9) {
        this.f30931a = i9;
        this.f30932b = nxVar;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        Integer num;
        View view2;
        int R;
        int i9;
        TLRPC.StickerSet stickerSet3;
        int i10 = this.f30931a;
        nx nxVar = this.f30932b;
        switch (i10) {
            case 0:
                jx jxVar = nxVar.f31200s;
                if (jxVar != null && (stickerSet = jxVar.f29865b) != null) {
                    wy wyVar = nxVar.A;
                    if (!wyVar.f34444s2) {
                        wyVar.f34444s2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f22400id = stickerSet.f22407id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new qw(wyVar, wyVar.U1, wyVar.getContext(), wyVar.V1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zf.p0 p0Var = nxVar.h;
                TextView textView = nxVar.f31197f;
                TextView textView2 = nxVar.f31196e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (p0Var != null && p0Var.getVisibility() == 0 && p0Var.f50651r.isEnabled()) {
                    p0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                wy wyVar2 = nxVar.A;
                ArrayList arrayList2 = wyVar2.l1;
                jx jxVar2 = nxVar.f31200s;
                if (jxVar2 != null && (stickerSet2 = jxVar2.f29865b) != null) {
                    jxVar2.f29868f = true;
                    fx fxVar = wyVar2.N;
                    int i11 = wyVar2.Y0;
                    ArrayList arrayList3 = wyVar2.f34422m1;
                    ww wwVar = wyVar2.L;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f22407id))) {
                        arrayList2.add(Long.valueOf(nxVar.f31200s.f29865b.f22407id));
                    }
                    nxVar.a(true);
                    int i12 = 0;
                    while (true) {
                        if (i12 < wwVar.getChildCount()) {
                            if ((wwVar.getChildAt(i12) instanceof lx) && (R = RecyclerView.R((view2 = wwVar.getChildAt(i12)))) >= 0 && (i9 = fxVar.f28594w.get(R)) >= 0 && i9 < arrayList3.size() && arrayList3.get(i9) != null && nxVar.f31200s != null && ((jx) arrayList3.get(i9)).f29865b.f22407id == nxVar.f31200s.f29865b.f22407id) {
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
                        fxVar.E(num.intValue(), view2);
                    }
                    if (nxVar.f31198n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = nxVar.f31200s.f29865b;
                        tL_inputStickerSetID2.f22400id = stickerSet4.f22407id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i11).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.o2 o2Var = wyVar2.U1;
                            if (o2Var == null) {
                                o2Var = new bg.i1(nxVar, 9);
                            }
                            dv.V(o2Var, stickerSet5, true, null, new np(nxVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i11).addObserver(nxVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
                        nxVar.f31198n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                wy wyVar3 = nxVar.A;
                jx jxVar3 = nxVar.f31200s;
                if (jxVar3 != null && (stickerSet3 = jxVar3.f29865b) != null) {
                    jxVar3.f29868f = false;
                    ArrayList arrayList4 = wyVar3.l1;
                    int i13 = wyVar3.Y0;
                    arrayList4.remove(Long.valueOf(stickerSet3.f22407id));
                    nxVar.a(true);
                    vv vvVar = wyVar3.E;
                    if (vvVar != null) {
                        vvVar.p(wyVar3.getEmojipacks());
                    }
                    wyVar3.V(wyVar3.M.I0());
                    if (nxVar.f31199r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = nxVar.f31200s.f29865b;
                        tL_inputStickerSetID3.f22400id = stickerSet6.f22407id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i13).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.o2 o2Var2 = wyVar3.U1;
                            if (o2Var2 == null) {
                                o2Var2 = new bg.i1(nxVar, 9);
                            }
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                            zq zqVar = new zq(9, nxVar, stickerSet7);
                            Pattern pattern = dv.R;
                            if (o2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(o2Var3.getCurrentAccount()).toggleStickerSet(o2Var3.getFragmentView().getContext(), stickerSet7, 0, o2Var3, true, true, zqVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i13).addObserver(nxVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i13);
                        nxVar.f31199r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                wx wxVar = nxVar.A.f34432p1;
                if (wxVar != null) {
                    wxVar.q();
                    return;
                }
                return;
            case 5:
                wx wxVar2 = nxVar.A.f34432p1;
                if (wxVar2 != null) {
                    wxVar2.q();
                    return;
                }
                return;
            default:
                wx wxVar3 = nxVar.A.f34432p1;
                if (wxVar3 != null) {
                    wxVar3.q();
                    return;
                }
                return;
        }
    }
}
