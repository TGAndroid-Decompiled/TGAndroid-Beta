package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ay implements View.OnClickListener {
    public final int f24471a;
    public final cy f24472b;

    public ay(cy cyVar, int i10) {
        this.f24471a = i10;
        this.f24472b = cyVar;
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
        int i11 = this.f24471a;
        cy cyVar = this.f24472b;
        switch (i11) {
            case 0:
                xx xxVar = cyVar.f25124s;
                if (xxVar != null && (stickerSet = xxVar.f32764b) != null) {
                    kz kzVar = cyVar.E;
                    if (!kzVar.f27997w2) {
                        kzVar.f27997w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f19889id = stickerSet.f19896id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new ex(kzVar, kzVar.Y1, kzVar.getContext(), kzVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sg.r0 r0Var = cyVar.h;
                TextView textView = cyVar.f25121f;
                TextView textView2 = cyVar.f25120e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (r0Var != null && r0Var.getVisibility() == 0 && r0Var.f46241r.isEnabled()) {
                    r0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                kz kzVar2 = cyVar.E;
                ArrayList arrayList2 = kzVar2.f27972p1;
                xx xxVar2 = cyVar.f25124s;
                if (xxVar2 != null && (stickerSet2 = xxVar2.f32764b) != null) {
                    xxVar2.f32767f = true;
                    tx txVar = kzVar2.R;
                    int i12 = kzVar2.f27932c1;
                    ArrayList arrayList3 = kzVar2.f27975q1;
                    kx kxVar = kzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f19896id))) {
                        arrayList2.add(Long.valueOf(cyVar.f25124s.f32764b.f19896id));
                    }
                    cyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < kxVar.getChildCount()) {
                            if ((kxVar.getChildAt(i13) instanceof zx) && (R = RecyclerView.R((view2 = kxVar.getChildAt(i13)))) >= 0 && (i10 = txVar.f30730w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && cyVar.f25124s != null && ((xx) arrayList3.get(i10)).f32764b.f19896id == cyVar.f25124s.f32764b.f19896id) {
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
                        txVar.E(num.intValue(), view2);
                    }
                    if (cyVar.f25122n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = cyVar.f25124s.f32764b;
                        tL_inputStickerSetID2.f19889id = stickerSet4.f19896id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var = kzVar2.Y1;
                            if (n2Var == null) {
                                n2Var = new bi.l3(cyVar, 6);
                            }
                            rv.W(n2Var, stickerSet5, true, null, new wp(cyVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(cyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        cyVar.f25122n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                kz kzVar3 = cyVar.E;
                xx xxVar3 = cyVar.f25124s;
                if (xxVar3 != null && (stickerSet3 = xxVar3.f32764b) != null) {
                    xxVar3.f32767f = false;
                    ArrayList arrayList4 = kzVar3.f27972p1;
                    int i14 = kzVar3.f27932c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f19896id));
                    cyVar.a(true);
                    jw jwVar = kzVar3.I;
                    if (jwVar != null) {
                        jwVar.p(kzVar3.getEmojipacks());
                    }
                    kzVar3.W(kzVar3.Q.I0());
                    if (cyVar.f25123r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = cyVar.f25124s.f32764b;
                        tL_inputStickerSetID3.f19889id = stickerSet6.f19896id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = kzVar3.Y1;
                            if (n2Var2 == null) {
                                n2Var2 = new bi.l3(cyVar, 6);
                            }
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                            zu zuVar = new zu(3, cyVar, stickerSet7);
                            Pattern pattern = rv.V;
                            if (n2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(n2Var3.getCurrentAccount()).toggleStickerSet(n2Var3.getFragmentView().getContext(), stickerSet7, 0, n2Var3, true, true, zuVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(cyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        cyVar.f25123r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ly lyVar = cyVar.E.f27986t1;
                if (lyVar != null) {
                    lyVar.q();
                    return;
                }
                return;
            case 5:
                ly lyVar2 = cyVar.E.f27986t1;
                if (lyVar2 != null) {
                    lyVar2.q();
                    return;
                }
                return;
            default:
                ly lyVar3 = cyVar.E.f27986t1;
                if (lyVar3 != null) {
                    lyVar3.q();
                    return;
                }
                return;
        }
    }
}
