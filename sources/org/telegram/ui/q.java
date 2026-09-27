package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q extends org.telegram.ui.Components.xl0 {
    public final Context f36590c;
    public final r d;

    public q(r rVar, Context context) {
        this.d = rVar;
        this.f36590c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43008f == 0) {
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
        r rVar = this.d;
        if (i10 >= rVar.f36940x && i10 < rVar.f36941y) {
            return 0;
        }
        if (i10 == rVar.E) {
            return 1;
        }
        if (i10 != rVar.F && i10 != rVar.f36939w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        View view = c1Var.f43005a;
        r rVar = this.d;
        a0.i iVar = rVar.f36932a;
        ArrayList arrayList = rVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - rVar.f36940x;
            org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z11 = true;
            if (i12 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.ki0 ki0Var = wVar.f21715f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(r.V(rVar)).isStickerPackInstalled(stickerSetCovered.set.f18356id);
            wVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                iVar.l(stickerSetCovered.set.f18356id);
                if (ki0Var != null) {
                    ki0Var.a(false, false);
                }
            } else {
                if (iVar.h(stickerSetCovered.set.f18356id) < 0) {
                    z11 = false;
                }
                if (ki0Var != null) {
                    ki0Var.a(z11, false);
                }
            }
            wVar.setOnCheckedChangeListener(new p(0, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == rVar.f36939w) {
                e9Var.setTopPadding(17);
                e9Var.setBottomPadding(10);
                if (rVar.H == 5) {
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
        Context context = this.f36590c;
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
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
            view = wVar;
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(view);
    }
}
