package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q extends org.telegram.ui.Components.il0 {
    public final Context f41495c;
    public final r d;

    public q(r rVar, Context context) {
        this.d = rVar;
        this.f41495c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.C;
    }

    @Override
    public final int j(int i10) {
        r rVar = this.d;
        if (i10 >= rVar.f41825x && i10 < rVar.f41826y) {
            return 0;
        }
        if (i10 == rVar.A) {
            return 1;
        }
        if (i10 != rVar.B && i10 != rVar.f41824w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        boolean z10;
        View view = n1Var.f6432a;
        r rVar = this.d;
        a0.h hVar = rVar.f41816a;
        ArrayList arrayList = rVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - rVar.f41825x;
            org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z11 = true;
            if (i12 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.th0 th0Var = wVar.f25853f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(r.V(rVar)).isStickerPackInstalled(stickerSetCovered.set.f22419id);
            wVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                hVar.l(stickerSetCovered.set.f22419id);
                if (th0Var != null) {
                    th0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f22419id) < 0) {
                    z11 = false;
                }
                if (th0Var != null) {
                    th0Var.a(z11, false);
                }
            }
            wVar.setOnCheckedChangeListener(new kg.w(7, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i10 == rVar.f41824w) {
                y8Var.setTopPadding(17);
                y8Var.setBottomPadding(10);
                if (rVar.D == 5) {
                    i11 = R.string.ArchivedEmojiInfo;
                } else {
                    i11 = R.string.ArchivedStickersInfo;
                }
                y8Var.setText(LocaleController.getString(i11));
                return;
            }
            y8Var.setTopPadding(10);
            y8Var.setBottomPadding(17);
            y8Var.setText(null);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f41495c;
        View view = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.y8(context);
                }
            } else {
                view = new org.telegram.ui.Cells.q4(context);
            }
        } else {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            view = wVar;
        }
        view.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(view);
    }
}
