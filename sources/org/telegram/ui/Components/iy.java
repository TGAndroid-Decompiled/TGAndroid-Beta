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
    public final int f27469a;
    public final jy f27470b;

    public iy(jy jyVar, int i10) {
        this.f27469a = i10;
        this.f27470b = jyVar;
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
        int i11 = this.f27469a;
        jy jyVar = this.f27470b;
        switch (i11) {
            case 0:
                fy fyVar = jyVar.f27784w;
                if (fyVar != null && (stickerSet = fyVar.f26469b) != null) {
                    tz tzVar = jyVar.G;
                    if (!tzVar.f31030w2) {
                        tzVar.f31030w2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f20363id = stickerSet.f20370id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new kx(tzVar, tzVar.Y1, tzVar.getContext(), tzVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sg.p0 p0Var = jyVar.f27782r;
                TextView textView = jyVar.f27781n;
                TextView textView2 = jyVar.h;
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
                tz tzVar2 = jyVar.G;
                ArrayList arrayList2 = tzVar2.f31005p1;
                fy fyVar2 = jyVar.f27784w;
                if (fyVar2 != null && (stickerSet2 = fyVar2.f26469b) != null) {
                    fyVar2.f26471f = true;
                    ay ayVar = tzVar2.R;
                    int i12 = tzVar2.f30966c1;
                    ArrayList arrayList3 = tzVar2.f31008q1;
                    ey eyVar = tzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f20370id))) {
                        arrayList2.add(Long.valueOf(jyVar.f27784w.f26469b.f20370id));
                    }
                    jyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < eyVar.getChildCount()) {
                            if ((eyVar.getChildAt(i13) instanceof hy) && (R = RecyclerView.R((view2 = eyVar.getChildAt(i13)))) >= 0 && (i10 = ayVar.f24871w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && jyVar.f27784w != null && ((fy) arrayList3.get(i10)).f26469b.f20370id == jyVar.f27784w.f26469b.f20370id) {
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
                    if (jyVar.f27783s == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = jyVar.f27784w.f26469b;
                        tL_inputStickerSetID2.f20363id = stickerSet4.f20370id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.o2 o2Var = tzVar2.Y1;
                            if (o2Var == null) {
                                o2Var = new ai.a5(jyVar, 7);
                            }
                            aw.g0(o2Var, stickerSet5, true, null, new zp(jyVar, 15));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(jyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        jyVar.f27783s = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                tz tzVar3 = jyVar.G;
                fy fyVar3 = jyVar.f27784w;
                if (fyVar3 != null && (stickerSet3 = fyVar3.f26469b) != null) {
                    fyVar3.f26471f = false;
                    ArrayList arrayList4 = tzVar3.f31005p1;
                    int i14 = tzVar3.f30966c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f20370id));
                    jyVar.a(true);
                    vx vxVar = tzVar3.I;
                    if (vxVar != null) {
                        vxVar.p(tzVar3.getEmojipacks());
                    }
                    tzVar3.U(tzVar3.Q.I0());
                    if (jyVar.v == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = jyVar.f27784w.f26469b;
                        tL_inputStickerSetID3.f20363id = stickerSet6.f20370id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.o2 o2Var2 = tzVar3.Y1;
                            if (o2Var2 == null) {
                                o2Var2 = new ai.a5(jyVar, 7);
                            }
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                            yt ytVar = new yt(4, jyVar, stickerSet7);
                            Pattern pattern = aw.V;
                            if (o2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(o2Var3.getCurrentAccount()).toggleStickerSet(o2Var3.getFragmentView().getContext(), stickerSet7, 0, o2Var3, true, true, ytVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(jyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        jyVar.v = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                uy uyVar = jyVar.G.f31019t1;
                if (uyVar != null) {
                    uyVar.q();
                    return;
                }
                return;
            case 5:
                uy uyVar2 = jyVar.G.f31019t1;
                if (uyVar2 != null) {
                    uyVar2.q();
                    return;
                }
                return;
            default:
                uy uyVar3 = jyVar.G.f31019t1;
                if (uyVar3 != null) {
                    uyVar3.q();
                    return;
                }
                return;
        }
    }
}
