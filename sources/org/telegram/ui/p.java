package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p extends org.telegram.ui.Components.ul0 {
    public final Context f35651c;
    public final q d;

    public p(q qVar, Context context) {
        this.d = qVar;
        this.f35651c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 0) {
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
        if (i10 >= qVar.f35945x && i10 < qVar.f35946y) {
            return 0;
        }
        if (i10 == qVar.E) {
            return 1;
        }
        if (i10 != qVar.F && i10 != qVar.f35944w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        View view = c1Var.f41610a;
        q qVar = this.d;
        a0.i iVar = qVar.f35937a;
        ArrayList arrayList = qVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - qVar.f35945x;
            org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z11 = true;
            if (i12 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.hi0 hi0Var = wVar.f20578f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(q.V(qVar)).isStickerPackInstalled(stickerSetCovered.set.f17222id);
            wVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                iVar.l(stickerSetCovered.set.f17222id);
                if (hi0Var != null) {
                    hi0Var.a(false, false);
                }
            } else {
                if (iVar.h(stickerSetCovered.set.f17222id) < 0) {
                    z11 = false;
                }
                if (hi0Var != null) {
                    hi0Var.a(z11, false);
                }
            }
            wVar.setOnCheckedChangeListener(new bi.cb(23, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 == qVar.f35944w) {
                f9Var.setTopPadding(17);
                f9Var.setBottomPadding(10);
                if (qVar.H == 5) {
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
        Context context = this.f35651c;
        View view = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.f9(context);
                }
            } else {
                view = new org.telegram.ui.Cells.s4(context);
            }
        } else {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            view = wVar;
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(view);
    }
}
