package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class dy implements View.OnClickListener {
    public final int f23769a;
    public final ey f23770b;

    public dy(ey eyVar, int i10) {
        this.f23769a = i10;
        this.f23770b = eyVar;
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
        int i11 = this.f23769a;
        ey eyVar = this.f23770b;
        switch (i11) {
            case 0:
                zx zxVar = eyVar.f24081s;
                if (zxVar != null && (stickerSet = zxVar.f30992b) != null) {
                    mz mzVar = eyVar.E;
                    if (!mzVar.f26608v2) {
                        mzVar.f26608v2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f18355id = stickerSet.f18362id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new fx(mzVar, mzVar.Y1, mzVar.getContext(), mzVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rg.p0 p0Var = eyVar.h;
                TextView textView = eyVar.f24078f;
                TextView textView2 = eyVar.e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (p0Var != null && p0Var.getVisibility() == 0 && p0Var.f42709r.isEnabled()) {
                    p0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                mz mzVar2 = eyVar.E;
                ArrayList arrayList2 = mzVar2.f26587p1;
                zx zxVar2 = eyVar.f24081s;
                if (zxVar2 != null && (stickerSet2 = zxVar2.f30992b) != null) {
                    zxVar2.f30994f = true;
                    vx vxVar = mzVar2.R;
                    int i12 = mzVar2.f26548c1;
                    ArrayList arrayList3 = mzVar2.f26590q1;
                    yx yxVar = mzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f18362id))) {
                        arrayList2.add(Long.valueOf(eyVar.f24081s.f30992b.f18362id));
                    }
                    eyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < yxVar.getChildCount()) {
                            if ((yxVar.getChildAt(i13) instanceof cy) && (R = RecyclerView.R((view2 = yxVar.getChildAt(i13)))) >= 0 && (i10 = vxVar.f29783w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && eyVar.f24081s != null && ((zx) arrayList3.get(i10)).f30992b.f18362id == eyVar.f24081s.f30992b.f18362id) {
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
                        vxVar.E(num.intValue(), view2);
                    }
                    if (eyVar.f24079n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = eyVar.f24081s.f30992b;
                        tL_inputStickerSetID2.f18355id = stickerSet4.f18362id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.m2 m2Var = mzVar2.Y1;
                            if (m2Var == null) {
                                m2Var = new ai.y3(eyVar, 6);
                            }
                            uv.W(m2Var, stickerSet5, true, null, new zp(eyVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(eyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        eyVar.f24079n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                mz mzVar3 = eyVar.E;
                zx zxVar3 = eyVar.f24081s;
                if (zxVar3 != null && (stickerSet3 = zxVar3.f30992b) != null) {
                    zxVar3.f30994f = false;
                    ArrayList arrayList4 = mzVar3.f26587p1;
                    int i14 = mzVar3.f26548c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f18362id));
                    eyVar.a(true);
                    qx qxVar = mzVar3.I;
                    if (qxVar != null) {
                        qxVar.p(mzVar3.getEmojipacks());
                    }
                    mzVar3.U(mzVar3.Q.I0());
                    if (eyVar.f24080r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = eyVar.f24081s.f30992b;
                        tL_inputStickerSetID3.f18355id = stickerSet6.f18362id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.m2 m2Var2 = mzVar3.Y1;
                            if (m2Var2 == null) {
                                m2Var2 = new ai.y3(eyVar, 6);
                            }
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                            ww wwVar = new ww(2, eyVar, stickerSet7);
                            Pattern pattern = uv.V;
                            if (m2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(m2Var3.getCurrentAccount()).toggleStickerSet(m2Var3.getFragmentView().getContext(), stickerSet7, 0, m2Var3, true, true, wwVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(eyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        eyVar.f24080r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ny nyVar = eyVar.E.f26601t1;
                if (nyVar != null) {
                    nyVar.q();
                    return;
                }
                return;
            case 5:
                ny nyVar2 = eyVar.E.f26601t1;
                if (nyVar2 != null) {
                    nyVar2.q();
                    return;
                }
                return;
            default:
                ny nyVar3 = eyVar.E.f26601t1;
                if (nyVar3 != null) {
                    nyVar3.q();
                    return;
                }
                return;
        }
    }
}
