package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class o extends org.telegram.ui.Components.lm0 {
    public final Context f38813c;
    public final p d;

    public o(p pVar, Context context) {
        this.d = pVar;
        this.f38813c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 0) {
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
        if (i10 >= pVar.f39075x && i10 < pVar.f39076y) {
            return 0;
        }
        if (i10 == pVar.E) {
            return 1;
        }
        if (i10 != pVar.F && i10 != pVar.f39074w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        View view = b1Var.f44838a;
        p pVar = this.d;
        a0.h hVar = pVar.f39067a;
        ArrayList arrayList = pVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - pVar.f39075x;
            org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z11 = true;
            if (i12 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.yi0 yi0Var = wVar.f22594f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(p.V(pVar)).isStickerPackInstalled(stickerSetCovered.set.f19243id);
            wVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                hVar.l(stickerSetCovered.set.f19243id);
                if (yi0Var != null) {
                    yi0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f19243id) < 0) {
                    z11 = false;
                }
                if (yi0Var != null) {
                    yi0Var.a(z11, false);
                }
            }
            wVar.setOnCheckedChangeListener(new m4.z0(3, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == pVar.f39074w) {
                e9Var.setTopPadding(17);
                e9Var.setBottomPadding(10);
                if (pVar.H == 5) {
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f38813c;
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
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
            view = wVar;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(view);
    }
}
