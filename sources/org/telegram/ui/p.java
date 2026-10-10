package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p extends org.telegram.ui.Components.qm0 {
    public final Context f40668c;
    public final q d;

    public p(q qVar, Context context) {
        this.d = qVar;
        this.f40668c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47706f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.G;
    }

    @Override
    public final int j(int i10) {
        q qVar = this.d;
        if (i10 >= qVar.f40991x && i10 < qVar.f40992y) {
            return 0;
        }
        if (i10 == qVar.E) {
            return 1;
        }
        if (i10 != qVar.F && i10 != qVar.f40990w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        boolean z10;
        View view = d1Var.f47702a;
        q qVar = this.d;
        a0.i iVar = qVar.f40982a;
        ArrayList arrayList = qVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - qVar.f40991x;
            org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z11 = true;
            if (i12 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.dj0 dj0Var = wVar.f23578f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(q.V(qVar)).isStickerPackInstalled(stickerSetCovered.set.f20069id);
            wVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                iVar.l(stickerSetCovered.set.f20069id);
                if (dj0Var != null) {
                    dj0Var.a(false, false);
                }
            } else {
                if (iVar.h(stickerSetCovered.set.f20069id) < 0) {
                    z11 = false;
                }
                if (dj0Var != null) {
                    dj0Var.a(z11, false);
                }
            }
            wVar.setOnCheckedChangeListener(new o(0, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == qVar.f40990w) {
                e9Var.setTopPadding(17);
                e9Var.setBottomPadding(10);
                if (qVar.H == 5) {
                    i11 = R.string.ArchivedEmojiInfo;
                } else {
                    i11 = R.string.ArchivedStickersInfo;
                }
                e9Var.setText(LocaleController.getString(i11));
                return;
            }
            e9Var.setTopPadding(10);
            e9Var.setBottomPadding(17);
            e9Var.setText(null);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f40668c;
        View view = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                view = new org.telegram.ui.Cells.s4(context);
            }
        } else {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
            view = wVar;
        }
        view.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(view);
    }
}
