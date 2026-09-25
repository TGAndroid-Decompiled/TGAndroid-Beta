package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p extends org.telegram.ui.Components.vl0 {
    public final Context f36371c;
    public final q d;

    public p(q qVar, Context context) {
        this.d = qVar;
        this.f36371c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42964f == 0) {
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
        if (i10 >= qVar.f36718x && i10 < qVar.f36719y) {
            return 0;
        }
        if (i10 == qVar.E) {
            return 1;
        }
        if (i10 != qVar.F && i10 != qVar.f36717w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        View view = c1Var.f42961a;
        q qVar = this.d;
        a0.i iVar = qVar.f36710a;
        ArrayList arrayList = qVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - qVar.f36718x;
            org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z11 = true;
            if (i12 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.ii0 ii0Var = wVar.f21713f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(q.V(qVar)).isStickerPackInstalled(stickerSetCovered.set.f18363id);
            wVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                iVar.l(stickerSetCovered.set.f18363id);
                if (ii0Var != null) {
                    ii0Var.a(false, false);
                }
            } else {
                if (iVar.h(stickerSetCovered.set.f18363id) < 0) {
                    z11 = false;
                }
                if (ii0Var != null) {
                    ii0Var.a(z11, false);
                }
            }
            wVar.setOnCheckedChangeListener(new o(0, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == qVar.f36717w) {
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
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f36371c;
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
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
            view = wVar;
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(view);
    }
}
