package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class o extends org.telegram.ui.Components.vk0 {
    public final Context f40855c;
    public final p d;

    public o(p pVar, Context context) {
        this.d = pVar;
        this.f40855c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.C;
    }

    @Override
    public final int j(int i9) {
        p pVar = this.d;
        if (i9 >= pVar.f41295x && i9 < pVar.f41296y) {
            return 0;
        }
        if (i9 == pVar.A) {
            return 1;
        }
        if (i9 != pVar.B && i9 != pVar.f41294w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        boolean z10;
        View view = q1Var.f5501a;
        p pVar = this.d;
        a0.h hVar = pVar.f41286a;
        ArrayList arrayList = pVar.h;
        if (j(i9) == 0) {
            int i11 = i9 - pVar.f41295x;
            org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
            boolean z11 = true;
            if (i11 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.jh0 jh0Var = wVar.f25819f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(p.U(pVar)).isStickerPackInstalled(stickerSetCovered.set.f22407id);
            wVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                hVar.l(stickerSetCovered.set.f22407id);
                if (jh0Var != null) {
                    jh0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f22407id) < 0) {
                    z11 = false;
                }
                if (jh0Var != null) {
                    jh0Var.a(z11, false);
                }
            }
            wVar.setOnCheckedChangeListener(new ih.v3(7, this, stickerSetCovered));
        } else if (j(i9) == 2) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == pVar.f41294w) {
                b9Var.setTopPadding(17);
                b9Var.setBottomPadding(10);
                if (pVar.D == 5) {
                    i10 = R.string.ArchivedEmojiInfo;
                } else {
                    i10 = R.string.ArchivedStickersInfo;
                }
                b9Var.setText(LocaleController.getString(i10));
                return;
            }
            b9Var.setTopPadding(10);
            b9Var.setBottomPadding(17);
            b9Var.setText(null);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.f40855c;
        View view = null;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    view = new org.telegram.ui.Cells.b9(context);
                }
            } else {
                view = new org.telegram.ui.Cells.s4(context);
            }
        } else {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            view = wVar;
        }
        view.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(view);
    }
}
