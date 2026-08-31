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
    public final int f25372a;
    public final cy f25373b;

    public ay(cy cyVar, int i10) {
        this.f25372a = i10;
        this.f25373b = cyVar;
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
        int i11 = this.f25372a;
        cy cyVar = this.f25373b;
        switch (i11) {
            case 0:
                xx xxVar = cyVar.f26112s;
                if (xxVar != null && (stickerSet = xxVar.f33189b) != null) {
                    mz mzVar = cyVar.B;
                    if (!mzVar.f29327t2) {
                        mzVar.f29327t2 = true;
                        ArrayList arrayList = new ArrayList(1);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.f20863id = stickerSet.f20870id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        new dx(mzVar, mzVar.V1, mzVar.getContext(), mzVar.W1, arrayList, stickerSet).show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                fg.b1 b1Var = cyVar.h;
                TextView textView = cyVar.f26109f;
                TextView textView2 = cyVar.f26108e;
                if (textView2 != null && textView2.getVisibility() == 0 && textView2.isEnabled()) {
                    textView2.performClick();
                    return;
                } else if (textView != null && textView.getVisibility() == 0 && textView.isEnabled()) {
                    textView.performClick();
                    return;
                } else if (b1Var != null && b1Var.getVisibility() == 0 && b1Var.f6250r.isEnabled()) {
                    b1Var.performClick();
                    return;
                } else {
                    return;
                }
            case 2:
                mz mzVar2 = cyVar.B;
                ArrayList arrayList2 = mzVar2.f29302m1;
                xx xxVar2 = cyVar.f26112s;
                if (xxVar2 != null && (stickerSet2 = xxVar2.f33189b) != null) {
                    xxVar2.f33192f = true;
                    tx txVar = mzVar2.O;
                    int i12 = mzVar2.Z0;
                    ArrayList arrayList3 = mzVar2.f29306n1;
                    kx kxVar = mzVar2.M;
                    if (!arrayList2.contains(Long.valueOf(stickerSet2.f20870id))) {
                        arrayList2.add(Long.valueOf(cyVar.f26112s.f33189b.f20870id));
                    }
                    cyVar.a(true);
                    int i13 = 0;
                    while (true) {
                        if (i13 < kxVar.getChildCount()) {
                            if ((kxVar.getChildAt(i13) instanceof zx) && (R = RecyclerView.R((view2 = kxVar.getChildAt(i13)))) >= 0 && (i10 = txVar.f31476w.get(R)) >= 0 && i10 < arrayList3.size() && arrayList3.get(i10) != null && cyVar.f26112s != null && ((xx) arrayList3.get(i10)).f33189b.f20870id == cyVar.f26112s.f33189b.f20870id) {
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
                    if (cyVar.f26110n == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet4 = cyVar.f26112s.f33189b;
                        tL_inputStickerSetID2.f20863id = stickerSet4.f20870id;
                        tL_inputStickerSetID2.access_hash = stickerSet4.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet5 = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, true);
                        if (stickerSet5 != null && stickerSet5.set != null) {
                            org.telegram.ui.ActionBar.p2 p2Var = mzVar2.V1;
                            if (p2Var == null) {
                                p2Var = new fg.x1(cyVar, 8);
                            }
                            ov.W(p2Var, stickerSet5, true, null, new xp(cyVar, 14));
                            return;
                        }
                        NotificationCenter.getInstance(i12).addObserver(cyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                        cyVar.f26110n = tL_inputStickerSetID2;
                        mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID2, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                mz mzVar3 = cyVar.B;
                xx xxVar3 = cyVar.f26112s;
                if (xxVar3 != null && (stickerSet3 = xxVar3.f33189b) != null) {
                    xxVar3.f33192f = false;
                    ArrayList arrayList4 = mzVar3.f29302m1;
                    int i14 = mzVar3.Z0;
                    arrayList4.remove(Long.valueOf(stickerSet3.f20870id));
                    cyVar.a(true);
                    hw hwVar = mzVar3.F;
                    if (hwVar != null) {
                        hwVar.p(mzVar3.getEmojipacks());
                    }
                    mzVar3.W(mzVar3.N.I0());
                    if (cyVar.f26111r == null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet6 = cyVar.f26112s.f33189b;
                        tL_inputStickerSetID3.f20863id = stickerSet6.f20870id;
                        tL_inputStickerSetID3.access_hash = stickerSet6.access_hash;
                        TLRPC.TL_messages_stickerSet stickerSet7 = MediaDataController.getInstance(i14).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, true);
                        if (stickerSet7 != null && stickerSet7.set != null) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = mzVar3.V1;
                            if (p2Var2 == null) {
                                p2Var2 = new fg.x1(cyVar, 8);
                            }
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                            gm gmVar = new gm(14, cyVar, stickerSet7);
                            Pattern pattern = ov.S;
                            if (p2Var3.getFragmentView() != null) {
                                MediaDataController.getInstance(p2Var3.getCurrentAccount()).toggleStickerSet(p2Var3.getFragmentView().getContext(), stickerSet7, 0, p2Var3, true, true, gmVar, false);
                                return;
                            }
                            return;
                        }
                        NotificationCenter.getInstance(i14).addObserver(cyVar, NotificationCenter.groupStickersDidLoad);
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i14);
                        cyVar.f26111r = tL_inputStickerSetID3;
                        mediaDataController2.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID3, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                my myVar = cyVar.B.f29315q1;
                if (myVar != null) {
                    myVar.q();
                    return;
                }
                return;
            case 5:
                my myVar2 = cyVar.B.f29315q1;
                if (myVar2 != null) {
                    myVar2.q();
                    return;
                }
                return;
            default:
                my myVar3 = cyVar.B.f29315q1;
                if (myVar3 != null) {
                    myVar3.q();
                    return;
                }
                return;
        }
    }
}
