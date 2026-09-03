package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q extends org.telegram.ui.Components.ql0 {
    public final Context f37261c;
    public final r d;

    public q(r rVar, Context context) {
        this.d = rVar;
        this.f37261c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.D;
    }

    @Override
    public final int j(int i10) {
        r rVar = this.d;
        if (i10 >= rVar.f37666x && i10 < rVar.f37667y) {
            return 0;
        }
        if (i10 == rVar.B) {
            return 1;
        }
        if (i10 != rVar.C && i10 != rVar.f37665w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        boolean z4;
        View view = l1Var.f5774a;
        r rVar = this.d;
        a0.h hVar = rVar.f37658a;
        ArrayList arrayList = rVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - rVar.f37666x;
            org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z10 = true;
            if (i12 != arrayList.size() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            wVar.b(stickerSetCovered, z4);
            org.telegram.ui.Components.fi0 fi0Var = wVar.f22486f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(r.V(rVar)).isStickerPackInstalled(stickerSetCovered.set.f19186id);
            wVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                hVar.l(stickerSetCovered.set.f19186id);
                if (fi0Var != null) {
                    fi0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f19186id) < 0) {
                    z10 = false;
                }
                if (fi0Var != null) {
                    fi0Var.a(z10, false);
                }
            }
            wVar.setOnCheckedChangeListener(new mg.w(6, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i10 == rVar.f37665w) {
                z8Var.setTopPadding(17);
                z8Var.setBottomPadding(10);
                if (rVar.E == 5) {
                    i11 = R.string.ArchivedEmojiInfo;
                } else {
                    i11 = R.string.ArchivedStickersInfo;
                }
                z8Var.setText(LocaleController.getString(i11));
                return;
            }
            z8Var.setTopPadding(10);
            z8Var.setBottomPadding(17);
            z8Var.setText(null);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f37261c;
        View view = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.z8(context);
                }
            } else {
                view = new org.telegram.ui.Cells.r4(context);
            }
        } else {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            view = wVar;
        }
        view.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(view);
    }
}
