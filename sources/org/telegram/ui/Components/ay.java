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
    public final int f22530a;
    public final cy f22531b;

    public ay(cy cyVar, int i10) {
        this.f22530a = i10;
        this.f22531b = cyVar;
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
        int i11 = this.f22530a;
        cy cyVar = this.f22531b;
        switch (i11) {
            case 0:
                xx xxVar = cyVar.f23133s;
                if (xxVar != null && (stickerSet = xxVar.f30088b) != null) {
                    lz lzVar = cyVar.E;
                    if (!lzVar.f26028v2) {
                        lzVar.f26028v2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f18103id = stickerSet.f18110id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new dx(lzVar, lzVar.Y1, lzVar.getContext(), lzVar.Z1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rg.p0 p0Var = cyVar.h;
                TextView textView = cyVar.f23130f;
                TextView textView2 = cyVar.e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (p0Var != null && p0Var.getVisibility() == 0 && p0Var.f42377r.isEnabled()) {
                    p0Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                lz lzVar2 = cyVar.E;
                ArrayList arrayList2 = lzVar2.f26007p1;
                xx xxVar2 = cyVar.f23133s;
                if (xxVar2 != null && (stickerSet2 = xxVar2.f30088b) != null) {
                    xxVar2.f30090f = true;
                    tx txVar = lzVar2.R;
                    int i12 = lzVar2.f25968c1;
                    ArrayList arrayList3 = lzVar2.f26010q1;
                    wx wxVar = lzVar2.P;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f18110id))) {
                        arrayList2.add(Long.valueOf(cyVar.f23133s.f30088b.f18110id));
                    }
                    cyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < wxVar.getChildCount()) {
                            if ((wxVar.getChildAt(i13) instanceof zx) && (R = RecyclerView.R((view2 = wxVar.getChildAt(i13)))) >= 0 && (i10 = txVar.f28328w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && cyVar.f23133s != null && ((xx) arrayList3.get(i10)).f30088b.f18110id == cyVar.f23133s.f30088b.f18110id) {
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
                    if (cyVar.f23131n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = cyVar.f23133s.f30088b;
                        tL_inputStickerSetID2.f18103id = stickerSet4.f18110id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var = lzVar2.Y1;
                            if (n2Var == null) {
                                n2Var = new ai.y3(cyVar, 6);
                            }
                            tv.W(n2Var, stickerSet5, true, null, new yp(cyVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(cyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        cyVar.f23131n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                lz lzVar3 = cyVar.E;
                xx xxVar3 = cyVar.f23133s;
                if (xxVar3 != null && (stickerSet3 = xxVar3.f30088b) != null) {
                    xxVar3.f30090f = false;
                    ArrayList arrayList4 = lzVar3.f26007p1;
                    int i14 = lzVar3.f25968c1;
                    arrayList4.remove(Long.valueOf(stickerSet3.f18110id));
                    cyVar.a(true);
                    ox oxVar = lzVar3.I;
                    if (oxVar != null) {
                        oxVar.p(lzVar3.getEmojipacks());
                    }
                    lzVar3.U(lzVar3.Q.I0());
                    if (cyVar.f23132r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = cyVar.f23133s.f30088b;
                        tL_inputStickerSetID3.f18103id = stickerSet6.f18110id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = lzVar3.Y1;
                            if (n2Var2 == null) {
                                n2Var2 = new ai.y3(cyVar, 6);
                            }
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                            ph phVar = new ph(27, cyVar, stickerSet7);
                            Pattern pattern = tv.V;
                            if (n2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(n2Var3.getCurrentAccount()).toggleStickerSet(n2Var3.getFragmentView().getContext(), stickerSet7, 0, n2Var3, true, true, phVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(cyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        cyVar.f23132r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ly lyVar = cyVar.E.f26021t1;
                if (lyVar != null) {
                    lyVar.q();
                    return;
                }
                return;
            case 5:
                ly lyVar2 = cyVar.E.f26021t1;
                if (lyVar2 != null) {
                    lyVar2.q();
                    return;
                }
                return;
            default:
                ly lyVar3 = cyVar.E.f26021t1;
                if (lyVar3 != null) {
                    lyVar3.q();
                    return;
                }
                return;
        }
    }
}
