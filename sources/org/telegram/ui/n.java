package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class n extends org.telegram.ui.Components.lm0 {
    public final Context f39733c;
    public final o d;

    public n(o oVar, Context context) {
        this.d = oVar;
        this.f39733c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f == 0) {
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
        o oVar = this.d;
        if (i10 >= oVar.f40025x && i10 < oVar.f40026y) {
            return 0;
        }
        if (i10 == oVar.E) {
            return 1;
        }
        if (i10 != oVar.F && i10 != oVar.f40024w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        View view = b1Var.f46343a;
        o oVar = this.d;
        a0.h hVar = oVar.f40017a;
        ArrayList arrayList = oVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - oVar.f40025x;
            org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z11 = true;
            if (i12 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            vVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.xi0 xi0Var = vVar.f23749f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(o.V(oVar)).isStickerPackInstalled(stickerSetCovered.set.f20370id);
            vVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                hVar.l(stickerSetCovered.set.f20370id);
                if (xi0Var != null) {
                    xi0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f20370id) < 0) {
                    z11 = false;
                }
                if (xi0Var != null) {
                    xi0Var.a(z11, false);
                }
            }
            vVar.setOnCheckedChangeListener(new m4.w0(4, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == oVar.f40024w) {
                e9Var.setTopPadding(17);
                e9Var.setBottomPadding(10);
                if (oVar.H == 5) {
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
        Context context = this.f39733c;
        View view = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                view = new org.telegram.ui.Cells.r4(context);
            }
        } else {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, vVar, null);
            view = vVar;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(view);
    }
}
