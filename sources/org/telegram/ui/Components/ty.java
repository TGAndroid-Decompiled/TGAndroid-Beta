package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ty implements View.OnClickListener {
    public final int f30990a;
    public final uy f30991b;

    public ty(uy uyVar, int i10) {
        this.f30990a = i10;
        this.f30991b = uyVar;
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
        int i11 = this.f30990a;
        uy uyVar = this.f30991b;
        switch (i11) {
            case 0:
                qy qyVar = uyVar.f31286s;
                if (qyVar != null && (stickerSet = qyVar.f29948b) != null) {
                    d00 d00Var = uyVar.E;
                    if (!d00Var.f25133v2) {
                        d00Var.f25133v2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f19823id = stickerSet.f19830id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new vx(d00Var, d00Var.Y1, d00Var.getContext(), d00Var.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rg.q0 q0Var = uyVar.h;
                TextView textView = uyVar.f31283f;
                TextView textView2 = uyVar.f31282e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (q0Var != null && q0Var.getVisibility() == 0 && q0Var.f47623r.isEnabled()) {
                    q0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                d00 d00Var2 = uyVar.E;
                ArrayList arrayList2 = d00Var2.f25112p1;
                qy qyVar2 = uyVar.f31286s;
                if (qyVar2 != null && (stickerSet2 = qyVar2.f29948b) != null) {
                    qyVar2.f29951f = true;
                    my myVar = d00Var2.R;
                    int i12 = d00Var2.f25072c1;
                    ArrayList arrayList3 = d00Var2.f25115q1;
                    py pyVar = d00Var2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f19830id))) {
                        arrayList2.add(Long.valueOf(uyVar.f31286s.f29948b.f19830id));
                    }
                    uyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < pyVar.getChildCount()) {
                            if ((pyVar.getChildAt(i13) instanceof sy) && (R = RecyclerView.R((view2 = pyVar.getChildAt(i13)))) >= 0 && (i10 = myVar.f28671w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && uyVar.f31286s != null && ((qy) arrayList3.get(i10)).f29948b.f19830id == uyVar.f31286s.f29948b.f19830id) {
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
                        myVar.E(num.intValue(), view2);
                    }
                    if (uyVar.f31284n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = uyVar.f31286s.f29948b;
                        tL_inputStickerSetID2.f19823id = stickerSet4.f19830id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.m2 m2Var = d00Var2.Y1;
                            if (m2Var == null) {
                                m2Var = new ai.z3(uyVar, 6);
                            }
                            lw.X(m2Var, stickerSet5, true, null, new pq(uyVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(uyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        uyVar.f31284n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                d00 d00Var3 = uyVar.E;
                qy qyVar3 = uyVar.f31286s;
                if (qyVar3 != null && (stickerSet3 = qyVar3.f29948b) != null) {
                    qyVar3.f29951f = false;
                    ArrayList arrayList4 = d00Var3.f25112p1;
                    int i14 = d00Var3.f25072c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f19830id));
                    uyVar.a(true);
                    hy hyVar = d00Var3.I;
                    if (hyVar != null) {
                        hyVar.p(d00Var3.getEmojipacks());
                    }
                    d00Var3.U(d00Var3.Q.I0());
                    if (uyVar.f31285r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = uyVar.f31286s.f29948b;
                        tL_inputStickerSetID3.f19823id = stickerSet6.f19830id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.m2 m2Var2 = d00Var3.Y1;
                            if (m2Var2 == null) {
                                m2Var2 = new ai.z3(uyVar, 6);
                            }
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                            jt jtVar = new jt(7, uyVar, stickerSet7);
                            Pattern pattern = lw.V;
                            if (m2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(m2Var3.getCurrentAccount()).toggleStickerSet(m2Var3.getFragmentView().getContext(), stickerSet7, 0, m2Var3, true, true, jtVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(uyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        uyVar.f31285r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                dz dzVar = uyVar.E.f25126t1;
                if (dzVar != null) {
                    dzVar.q();
                    return;
                }
                return;
            case 5:
                dz dzVar2 = uyVar.E.f25126t1;
                if (dzVar2 != null) {
                    dzVar2.q();
                    return;
                }
                return;
            default:
                dz dzVar3 = uyVar.E.f25126t1;
                if (dzVar3 != null) {
                    dzVar3.q();
                    return;
                }
                return;
        }
    }
}
