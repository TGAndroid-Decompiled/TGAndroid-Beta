package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class o extends org.telegram.ui.Components.im0 {
    public final Context f39731c;
    public final p d;

    public o(p pVar, Context context) {
        this.d = pVar;
        this.f39731c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45924f == 0) {
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
        if (i10 >= pVar.f40033x && i10 < pVar.f40034y) {
            return 0;
        }
        if (i10 == pVar.E) {
            return 1;
        }
        if (i10 != pVar.F && i10 != pVar.f40032w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        View view = b1Var.f45921a;
        p pVar = this.d;
        a0.h hVar = pVar.f40025a;
        ArrayList arrayList = pVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - pVar.f40033x;
            org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z11 = true;
            if (i12 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.ui0 ui0Var = wVar.f23679f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(p.V(pVar)).isStickerPackInstalled(stickerSetCovered.set.f20307id);
            wVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                hVar.l(stickerSetCovered.set.f20307id);
                if (ui0Var != null) {
                    ui0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f20307id) < 0) {
                    z11 = false;
                }
                if (ui0Var != null) {
                    ui0Var.a(z11, false);
                }
            }
            wVar.setOnCheckedChangeListener(new m4.w0(4, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == pVar.f40032w) {
                d9Var.setTopPadding(17);
                d9Var.setBottomPadding(10);
                if (pVar.H == 5) {
                    i11 = R.string.ArchivedEmojiInfo;
                } else {
                    i11 = R.string.ArchivedStickersInfo;
                }
                d9Var.setText(LocaleController.getString(i11));
                return;
            }
            d9Var.setTopPadding(10);
            d9Var.setBottomPadding(17);
            d9Var.setText(null);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f39731c;
        View view = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.d9(context);
                }
            } else {
                view = new org.telegram.ui.Cells.r4(context);
            }
        } else {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20994d6, false));
            view = wVar;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(view);
    }
}
