package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ge1;
import org.telegram.ui.ne1;
import org.telegram.ui.pe1;
public final class bs0 implements Runnable {
    public final int f21895a;
    public final boolean f21896b;
    public final Object f21897c;

    public bs0(int i10, Object obj, boolean z10) {
        this.f21895a = i10;
        this.f21897c = obj;
        this.f21896b = z10;
    }

    @Override
    public final void run() {
        int i10;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z10;
        int i11;
        int i12 = this.f21895a;
        vh.f fVar = null;
        int i13 = 0;
        boolean z11 = this.f21896b;
        Object obj = this.f21897c;
        switch (i12) {
            case 0:
                cs0 cs0Var = (cs0) obj;
                if (!z11) {
                    cs0Var.H.f24118q0.setVisibility(0);
                    return;
                } else {
                    cs0Var.getClass();
                    return;
                }
            case 1:
                aw0 aw0Var = (aw0) obj;
                ArrayList arrayList = aw0Var.f21643r;
                zv0 zv0Var = aw0Var.f21638n;
                if (zv0Var != null) {
                    zv0Var.H(aw0Var.f21630f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((zv0) arrayList.get(i13)).H(aw0Var.f21630f, z11);
                    i13++;
                }
                return;
            case 2:
                bw0 bw0Var = (bw0) obj;
                ArrayList arrayList2 = bw0Var.f21643r;
                zv0 zv0Var2 = bw0Var.f21638n;
                if (zv0Var2 != null) {
                    zv0Var2.H(bw0Var.f21915y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((zv0) arrayList2.get(i13)).H(bw0Var.f21915y0, z11);
                    i13++;
                }
                return;
            case 3:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 4:
                ((j61) obj).P(z11);
                return;
            case 5:
                org.telegram.ui.e00 e00Var = (org.telegram.ui.e00) obj;
                e00Var.Z(e00Var.P, z11);
                return;
            case 6:
                org.telegram.ui.xg0 xg0Var = (org.telegram.ui.xg0) obj;
                if (!z11) {
                    xg0Var.W.setVisibility(8);
                    return;
                }
                return;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z11) {
                    photoViewer.V0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.getClass();
                return;
            case 8:
                ((ProfileActivity) obj).e5(z11, true);
                return;
            case 9:
                Activity parentActivity = ((org.telegram.ui.f11) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                nf.f.s(parentActivity, LocaleController.getString(i10));
                return;
            case 10:
                org.telegram.ui.j31 j31Var = (org.telegram.ui.j31) obj;
                org.telegram.ui.k31 k31Var = j31Var.S;
                qp qpVar = j31Var.f33867b;
                if (qpVar != null && qpVar.d != null) {
                    j31Var.a(z11, true);
                    if (j31Var.K != null) {
                        j31Var.Q = true;
                        k31Var.K = z11;
                        k31Var.d0(k31Var.O, k31Var.J, false);
                    }
                    if (qpVar.d != null) {
                        while (i13 < qpVar.d.size()) {
                            ((rp) qpVar.d.get(i13)).f26735c = z11 ? 1 : 0;
                            ((rp) qpVar.d.get(i13)).e = k31Var.b0(((rp) qpVar.d.get(i13)).f26733a, z11);
                            i13++;
                        }
                        k31Var.f34214r = null;
                        qpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                pe1 pe1Var = (pe1) obj;
                AndroidUtilities.runOnUIThread(new ge1(pe1Var, 1));
                org.telegram.ui.Cells.t1 t1Var = pe1Var.K;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.t1 t1Var2 = pe1Var.K;
                        int O2 = t1Var2.O2(pe1Var.O);
                        ne1 ne1Var = pe1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && ne1Var != null && (checkBoxBaseArr = ne1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f21056p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f21056p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f21057q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = pe1Var.K;
                    t1Var3.K7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.an anVar = pe1Var.f35813c0;
                if (anVar != null) {
                    AndroidUtilities.runOnUIThread(anVar);
                    pe1Var.f35813c0 = null;
                    return;
                }
                return;
            case 12:
                vh.p pVar = (vh.p) obj;
                ArrayList arrayList3 = pVar.f43400c;
                boolean isEmpty = TextUtils.isEmpty(pVar.f43414t);
                String str = pVar.f43414t;
                pVar.f43416w = true;
                pVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) hc.b.i(1, arrayList3);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (isEmpty && z10 && z11) {
                    fVar = new vh.f(pVar, 1);
                }
                vh.f fVar2 = fVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(fVar2, 300L);
                }
                pVar.v = pVar.f43403i.getImporters(pVar.f43404j, str, tL_chatInviteImporter, pVar.d, new vh.g(pVar, isEmpty, fVar2, str, z10));
                return;
            case 13:
                xh.s0 s0Var = (xh.s0) obj;
                if (!z11) {
                    s0Var.f46015q0.setVisibility(8);
                    return;
                } else {
                    s0Var.getClass();
                    return;
                }
            case 14:
                xh.x3 x3Var = (xh.x3) obj;
                x3Var.getClass();
                if (z11) {
                    i11 = R.string.Gift2ActionWearDone;
                } else {
                    i11 = R.string.Gift2ActionWearOffDone;
                }
                x3Var.o2(x3Var.f46272c1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, x3Var.C1())), true);
                return;
            case 15:
                xh.x3 x3Var2 = ((xh.h2) obj).T;
                TL_stars.SavedStarGift H1 = x3Var2.H1(z11);
                if (H1 != null) {
                    x3Var2.f46270b1 = true;
                    x3Var2.j2(H1, x3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = x3Var2.I1(z11);
                    if (I1 != null) {
                        x3Var2.f46270b1 = true;
                        x3Var2.h2(I1.slug, I1, x3Var2.D0);
                    }
                }
                x3Var2.R0 = -1;
                pc pcVar = pc.f26074w;
                if (pcVar != null) {
                    pcVar.c(0L, false);
                    return;
                }
                return;
            default:
                yg.o oVar = (yg.o) obj;
                if (z11) {
                    ((yg.s) oVar.f47096x.f46058c).f47140w.setVisibility(4);
                    return;
                } else {
                    oVar.getClass();
                    return;
                }
        }
    }
}
