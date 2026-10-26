package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class hy implements View.OnClickListener {
    public final int f29067a;
    public final iy f29068b;

    public hy(iy iyVar, int i10) {
        this.f29067a = i10;
        this.f29068b = iyVar;
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
        int i11 = this.f29067a;
        iy iyVar = this.f29068b;
        switch (i11) {
            case 0:
                ey eyVar = iyVar.f29401w;
                if (eyVar != null && (stickerSet = eyVar.f28008b) != null) {
                    sz szVar = iyVar.G;
                    if (!szVar.f32783w2) {
                        szVar.f32783w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f22047id = stickerSet.f22054id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new jx(szVar, szVar.Y1, szVar.getContext(), szVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                tg.p0 p0Var = iyVar.f29399r;
                TextView textView = iyVar.f29398n;
                TextView textView2 = iyVar.h;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (p0Var != null && p0Var.getVisibility() == 0 && p0Var.v.isEnabled()) {
                    p0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                sz szVar2 = iyVar.G;
                ArrayList arrayList2 = szVar2.f32758p1;
                ey eyVar2 = iyVar.f29401w;
                if (eyVar2 != null && (stickerSet2 = eyVar2.f28008b) != null) {
                    eyVar2.f28010f = true;
                    zx zxVar = szVar2.R;
                    int i12 = szVar2.f32719c1;
                    ArrayList arrayList3 = szVar2.f32761q1;
                    dy dyVar = szVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f22054id))) {
                        arrayList2.add(Long.valueOf(iyVar.f29401w.f28008b.f22054id));
                    }
                    iyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < dyVar.getChildCount()) {
                            if ((dyVar.getChildAt(i13) instanceof gy) && (R = RecyclerView.R((view2 = dyVar.getChildAt(i13)))) >= 0 && (i10 = zxVar.f35432w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && iyVar.f29401w != null && ((ey) arrayList3.get(i10)).f28008b.f22054id == iyVar.f29401w.f28008b.f22054id) {
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
                        zxVar.E(num.intValue(), view2);
                    }
                    if (iyVar.f29400s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = iyVar.f29401w.f28008b;
                        tL_inputStickerSetID2.f22047id = stickerSet4.f22054id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.r2 r2Var = szVar2.Y1;
                            if (r2Var == null) {
                                r2Var = new bi.v4(iyVar, 7);
                            }
                            aw.g0(r2Var, stickerSet5, true, null, new bq(iyVar, 15));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(iyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        iyVar.f29400s = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                sz szVar3 = iyVar.G;
                ey eyVar3 = iyVar.f29401w;
                if (eyVar3 != null && (stickerSet3 = eyVar3.f28008b) != null) {
                    eyVar3.f28010f = false;
                    ArrayList arrayList4 = szVar3.f32758p1;
                    int i14 = szVar3.f32719c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f22054id));
                    iyVar.a(true);
                    ux uxVar = szVar3.I;
                    if (uxVar != null) {
                        uxVar.p(szVar3.getEmojipacks());
                    }
                    szVar3.U(szVar3.Q.I0());
                    if (iyVar.v == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = iyVar.f29401w.f28008b;
                        tL_inputStickerSetID3.f22047id = stickerSet6.f22054id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.r2 r2Var2 = szVar3.Y1;
                            if (r2Var2 == null) {
                                r2Var2 = new bi.v4(iyVar, 7);
                            }
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var2;
                            so soVar = new so(14, iyVar, stickerSet7);
                            Pattern pattern = aw.V;
                            if (r2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(r2Var3.getCurrentAccount()).toggleStickerSet(r2Var3.getFragmentView().getContext(), stickerSet7, 0, r2Var3, true, true, soVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(iyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        iyVar.v = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ty tyVar = iyVar.G.f32772t1;
                if (tyVar != null) {
                    tyVar.q();
                    return;
                }
                return;
            case 5:
                ty tyVar2 = iyVar.G.f32772t1;
                if (tyVar2 != null) {
                    tyVar2.q();
                    return;
                }
                return;
            default:
                ty tyVar3 = iyVar.G.f32772t1;
                if (tyVar3 != null) {
                    tyVar3.q();
                    return;
                }
                return;
        }
    }
}
