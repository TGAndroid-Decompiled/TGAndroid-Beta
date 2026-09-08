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
    public final int f24498a;
    public final cy f24499b;

    public ay(cy cyVar, int i10) {
        this.f24498a = i10;
        this.f24499b = cyVar;
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
        int i11 = this.f24498a;
        cy cyVar = this.f24499b;
        switch (i11) {
            case 0:
                xx xxVar = cyVar.f25151s;
                if (xxVar != null && (stickerSet = xxVar.f32791b) != null) {
                    kz kzVar = cyVar.E;
                    if (!kzVar.f28024w2) {
                        kzVar.f28024w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f19916id = stickerSet.f19923id;
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
                TextView textView = cyVar.f25148f;
                TextView textView2 = cyVar.f25147e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (r0Var != null && r0Var.getVisibility() == 0 && r0Var.f46269r.isEnabled()) {
                    r0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                kz kzVar2 = cyVar.E;
                ArrayList arrayList2 = kzVar2.f27999p1;
                xx xxVar2 = cyVar.f25151s;
                if (xxVar2 != null && (stickerSet2 = xxVar2.f32791b) != null) {
                    xxVar2.f32794f = true;
                    tx txVar = kzVar2.R;
                    int i12 = kzVar2.f27959c1;
                    ArrayList arrayList3 = kzVar2.f28002q1;
                    kx kxVar = kzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f19923id))) {
                        arrayList2.add(Long.valueOf(cyVar.f25151s.f32791b.f19923id));
                    }
                    cyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < kxVar.getChildCount()) {
                            if ((kxVar.getChildAt(i13) instanceof zx) && (R = RecyclerView.R((view2 = kxVar.getChildAt(i13)))) >= 0 && (i10 = txVar.f30757w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && cyVar.f25151s != null && ((xx) arrayList3.get(i10)).f32791b.f19923id == cyVar.f25151s.f32791b.f19923id) {
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
                    if (cyVar.f25149n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = cyVar.f25151s.f32791b;
                        tL_inputStickerSetID2.f19916id = stickerSet4.f19923id;
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
                        cyVar.f25149n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                kz kzVar3 = cyVar.E;
                xx xxVar3 = cyVar.f25151s;
                if (xxVar3 != null && (stickerSet3 = xxVar3.f32791b) != null) {
                    xxVar3.f32794f = false;
                    ArrayList arrayList4 = kzVar3.f27999p1;
                    int i14 = kzVar3.f27959c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f19923id));
                    cyVar.a(true);
                    jw jwVar = kzVar3.I;
                    if (jwVar != null) {
                        jwVar.p(kzVar3.getEmojipacks());
                    }
                    kzVar3.W(kzVar3.Q.I0());
                    if (cyVar.f25150r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = cyVar.f25151s.f32791b;
                        tL_inputStickerSetID3.f19916id = stickerSet6.f19923id;
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
                        cyVar.f25150r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ly lyVar = cyVar.E.f28013t1;
                if (lyVar != null) {
                    lyVar.q();
                    return;
                }
                return;
            case 5:
                ly lyVar2 = cyVar.E.f28013t1;
                if (lyVar2 != null) {
                    lyVar2.q();
                    return;
                }
                return;
            default:
                ly lyVar3 = cyVar.E.f28013t1;
                if (lyVar3 != null) {
                    lyVar3.q();
                    return;
                }
                return;
        }
    }
}
