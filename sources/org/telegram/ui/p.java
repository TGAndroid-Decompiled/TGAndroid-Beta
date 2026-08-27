package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class p extends org.telegram.ui.Components.yk0 {

    public final Context f41230c;
    public final q d;

    public p(q qVar, Context context) {
        this.d = qVar;
        this.f41230c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 0;
    }

    @Override
    public final int h() {
        return this.d.C;
    }

    @Override
    public final int j(int i10) {
        q qVar = this.d;
        if (i10 >= qVar.f41466x && i10 < qVar.f41467y) {
            return 0;
        }
        if (i10 == qVar.A) {
            return 1;
        }
        return (i10 == qVar.B || i10 == qVar.f41465w) ? 2 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.f5789a;
        q qVar = this.d;
        a0.h hVar = qVar.f41457a;
        ArrayList arrayList = qVar.h;
        if (j(i10) != 0) {
            if (j(i10) == 2) {
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i10 == qVar.f41465w) {
                    x8Var.setTopPadding(17);
                    x8Var.setBottomPadding(10);
                    x8Var.setText(LocaleController.getString(qVar.D == 5 ? R.string.ArchivedEmojiInfo : R.string.ArchivedStickersInfo));
                    return;
                } else {
                    x8Var.setTopPadding(10);
                    x8Var.setBottomPadding(17);
                    x8Var.setText(null);
                    return;
                }
            }
            return;
        }
        int i11 = i10 - qVar.f41466x;
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
        wVar.b(stickerSetCovered, i11 != arrayList.size() - 1);
        org.telegram.ui.Components.lh0 lh0Var = wVar.f25837f;
        boolean zIsStickerPackInstalled = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) qVar).currentAccount).isStickerPackInstalled(stickerSetCovered.set.f22407id);
        wVar.a(zIsStickerPackInstalled, false, false);
        if (zIsStickerPackInstalled) {
            hVar.l(stickerSetCovered.set.f22407id);
            if (lh0Var != null) {
                lh0Var.a(false, false);
            }
        } else {
            boolean z10 = hVar.h(stickerSetCovered.set.f22407id) >= 0;
            if (lh0Var != null) {
                lh0Var.a(z10, false);
            }
        }
        wVar.setOnCheckedChangeListener(new jh.z1(7, this, stickerSetCovered));
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f41230c;
        View p4Var = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            p4Var = wVar;
        } else if (i10 == 1) {
            p4Var = new org.telegram.ui.Cells.p4(context);
        } else if (i10 == 2) {
            p4Var = new org.telegram.ui.Cells.x8(context);
        }
        p4Var.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(p4Var);
    }
}
