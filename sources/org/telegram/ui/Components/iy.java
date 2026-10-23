package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class iy implements View.OnClickListener {
    public final int f27350a;
    public final jy f27351b;

    public iy(jy jyVar, int i10) {
        this.f27350a = i10;
        this.f27351b = jyVar;
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
        int i11 = this.f27350a;
        jy jyVar = this.f27351b;
        switch (i11) {
            case 0:
                fy fyVar = jyVar.f27678s;
                if (fyVar != null && (stickerSet = fyVar.f26439b) != null) {
                    tz tzVar = jyVar.E;
                    if (!tzVar.f30787v2) {
                        tzVar.f30787v2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f20300id = stickerSet.f20307id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new kx(tzVar, tzVar.Y1, tzVar.getContext(), tzVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sg.q0 q0Var = jyVar.h;
                TextView textView = jyVar.f27675f;
                TextView textView2 = jyVar.e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (q0Var != null && q0Var.getVisibility() == 0 && q0Var.f46392r.isEnabled()) {
                    q0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                tz tzVar2 = jyVar.E;
                ArrayList arrayList2 = tzVar2.f30766p1;
                fy fyVar2 = jyVar.f27678s;
                if (fyVar2 != null && (stickerSet2 = fyVar2.f26439b) != null) {
                    fyVar2.f26441f = true;
                    ay ayVar = tzVar2.R;
                    int i12 = tzVar2.f30727c1;
                    ArrayList arrayList3 = tzVar2.f30769q1;
                    ey eyVar = tzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f20307id))) {
                        arrayList2.add(Long.valueOf(jyVar.f27678s.f26439b.f20307id));
                    }
                    jyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < eyVar.getChildCount()) {
                            if ((eyVar.getChildAt(i13) instanceof hy) && (R = RecyclerView.R((view2 = eyVar.getChildAt(i13)))) >= 0 && (i10 = ayVar.f24746w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && jyVar.f27678s != null && ((fy) arrayList3.get(i10)).f26439b.f20307id == jyVar.f27678s.f26439b.f20307id) {
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
                        ayVar.E(num.intValue(), view2);
                    }
                    if (jyVar.f27676n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = jyVar.f27678s.f26439b;
                        tL_inputStickerSetID2.f20300id = stickerSet4.f20307id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var = tzVar2.Y1;
                            if (n2Var == null) {
                                n2Var = new ai.a5(jyVar, 7);
                            }
                            aw.X(n2Var, stickerSet5, true, null, new hq(jyVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(jyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        jyVar.f27676n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                tz tzVar3 = jyVar.E;
                fy fyVar3 = jyVar.f27678s;
                if (fyVar3 != null && (stickerSet3 = fyVar3.f26439b) != null) {
                    fyVar3.f26441f = false;
                    ArrayList arrayList4 = tzVar3.f30766p1;
                    int i14 = tzVar3.f30727c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f20307id));
                    jyVar.a(true);
                    vx vxVar = tzVar3.I;
                    if (vxVar != null) {
                        vxVar.p(tzVar3.getEmojipacks());
                    }
                    tzVar3.U(tzVar3.Q.I0());
                    if (jyVar.f27677r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = jyVar.f27678s.f26439b;
                        tL_inputStickerSetID3.f20300id = stickerSet6.f20307id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = tzVar3.Y1;
                            if (n2Var2 == null) {
                                n2Var2 = new ai.a5(jyVar, 7);
                            }
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                            yt ytVar = new yt(4, jyVar, stickerSet7);
                            Pattern pattern = aw.V;
                            if (n2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(n2Var3.getCurrentAccount()).toggleStickerSet(n2Var3.getFragmentView().getContext(), stickerSet7, 0, n2Var3, true, true, ytVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(jyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        jyVar.f27677r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                uy uyVar = jyVar.E.f30780t1;
                if (uyVar != null) {
                    uyVar.q();
                    return;
                }
                return;
            case 5:
                uy uyVar2 = jyVar.E.f30780t1;
                if (uyVar2 != null) {
                    uyVar2.q();
                    return;
                }
                return;
            default:
                uy uyVar3 = jyVar.E.f30780t1;
                if (uyVar3 != null) {
                    uyVar3.q();
                    return;
                }
                return;
        }
    }
}
