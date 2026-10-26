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
    public final Context f41730c;
    public final o d;

    public n(o oVar, Context context) {
        this.d = oVar;
        this.f41730c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47741f == 0) {
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
        if (i10 >= oVar.f42051x && i10 < oVar.f42052y) {
            return 0;
        }
        if (i10 == oVar.E) {
            return 1;
        }
        if (i10 != oVar.F && i10 != oVar.f42050w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        boolean z10;
        View view = e1Var.f47738a;
        o oVar = this.d;
        a0.h hVar = oVar.f42043a;
        ArrayList arrayList = oVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - oVar.f42051x;
            org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z11 = true;
            if (i12 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            vVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.wi0 wi0Var = vVar.f25494f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(o.W(oVar)).isStickerPackInstalled(stickerSetCovered.set.f22054id);
            vVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                hVar.l(stickerSetCovered.set.f22054id);
                if (wi0Var != null) {
                    wi0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f22054id) < 0) {
                    z11 = false;
                }
                if (wi0Var != null) {
                    wi0Var.a(z11, false);
                }
            }
            vVar.setOnCheckedChangeListener(new m4.s0(6, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i10 == oVar.f42050w) {
                i9Var.setTopPadding(17);
                i9Var.setBottomPadding(10);
                if (oVar.H == 5) {
                    i11 = R.string.ArchivedEmojiInfo;
                } else {
                    i11 = R.string.ArchivedStickersInfo;
                }
                i9Var.setText(LocaleController.getString(i11));
                return;
            }
            i9Var.setTopPadding(10);
            i9Var.setBottomPadding(17);
            i9Var.setText(null);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f41730c;
        View view = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.i9(context);
                }
            } else {
                view = new org.telegram.ui.Cells.w4(context);
            }
        } else {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, vVar, null);
            view = vVar;
        }
        view.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(view);
    }
}
