package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p extends org.telegram.ui.Components.vm0 {
    public final Context f40821c;
    public final q d;

    public p(q qVar, Context context) {
        this.d = qVar;
        this.f40821c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47893f == 0) {
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
        if (i10 >= qVar.f41130x && i10 < qVar.f41131y) {
            return 0;
        }
        if (i10 == qVar.E) {
            return 1;
        }
        if (i10 != qVar.F && i10 != qVar.f41129w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        boolean z10;
        View view = d1Var.f47889a;
        q qVar = this.d;
        a0.i iVar = qVar.f41121a;
        ArrayList arrayList = qVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - qVar.f41130x;
            org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z11 = true;
            if (i12 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.ej0 ej0Var = wVar.f23336f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(q.V(qVar)).isStickerPackInstalled(stickerSetCovered.set.f19829id);
            wVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                iVar.l(stickerSetCovered.set.f19829id);
                if (ej0Var != null) {
                    ej0Var.a(false, false);
                }
            } else {
                if (iVar.h(stickerSetCovered.set.f19829id) < 0) {
                    z11 = false;
                }
                if (ej0Var != null) {
                    ej0Var.a(z11, false);
                }
            }
            wVar.setOnCheckedChangeListener(new o(0, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == qVar.f41129w) {
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
        Context context = this.f40821c;
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
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
            view = wVar;
        }
        view.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(view);
    }
}
