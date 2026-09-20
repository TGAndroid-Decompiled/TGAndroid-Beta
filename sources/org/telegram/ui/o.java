package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class o extends org.telegram.ui.Components.ul0 {
    public final Context f36160c;
    public final p d;

    public o(p pVar, Context context) {
        this.d = pVar;
        this.f36160c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42977f == 0) {
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
        p pVar = this.d;
        if (i10 >= pVar.f36416x && i10 < pVar.f36417y) {
            return 0;
        }
        if (i10 == pVar.E) {
            return 1;
        }
        if (i10 != pVar.F && i10 != pVar.f36415w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        View view = c1Var.f42974a;
        p pVar = this.d;
        a0.i iVar = pVar.f36408a;
        ArrayList arrayList = pVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - pVar.f36416x;
            org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z11 = true;
            if (i12 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.hi0 hi0Var = wVar.f21709f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(p.V(pVar)).isStickerPackInstalled(stickerSetCovered.set.f18355id);
            wVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                iVar.l(stickerSetCovered.set.f18355id);
                if (hi0Var != null) {
                    hi0Var.a(false, false);
                }
            } else {
                if (iVar.h(stickerSetCovered.set.f18355id) < 0) {
                    z11 = false;
                }
                if (hi0Var != null) {
                    hi0Var.a(z11, false);
                }
            }
            wVar.setOnCheckedChangeListener(new ah.b(28, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 == pVar.f36415w) {
                f9Var.setTopPadding(17);
                f9Var.setBottomPadding(10);
                if (pVar.H == 5) {
                    i11 = R.string.ArchivedEmojiInfo;
                } else {
                    i11 = R.string.ArchivedStickersInfo;
                }
                f9Var.setText(LocaleController.getString(i11));
                return;
            }
            f9Var.setTopPadding(10);
            f9Var.setBottomPadding(17);
            f9Var.setText(null);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f36160c;
        View view = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.f9(context);
                }
            } else {
                view = new org.telegram.ui.Cells.t4(context);
            }
        } else {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
            view = wVar;
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(view);
    }
}
