package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q extends org.telegram.ui.Components.rl0 {
    public final Context f37562c;
    public final r d;

    public q(r rVar, Context context) {
        this.d = rVar;
        this.f37562c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 0) {
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
        if (i10 >= rVar.f37890x && i10 < rVar.f37891y) {
            return 0;
        }
        if (i10 == rVar.B) {
            return 1;
        }
        if (i10 != rVar.C && i10 != rVar.f37889w) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        boolean z4;
        View view = l1Var.f5785a;
        r rVar = this.d;
        a0.h hVar = rVar.f37882a;
        ArrayList arrayList = rVar.h;
        if (j(i10) == 0) {
            int i12 = i10 - rVar.f37890x;
            org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            boolean z10 = true;
            if (i12 != arrayList.size() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            wVar.b(stickerSetCovered, z4);
            org.telegram.ui.Components.ei0 ei0Var = wVar.f22522f;
            boolean isStickerPackInstalled = MediaDataController.getInstance(r.V(rVar)).isStickerPackInstalled(stickerSetCovered.set.f19211id);
            wVar.a(isStickerPackInstalled, false, false);
            if (isStickerPackInstalled) {
                hVar.l(stickerSetCovered.set.f19211id);
                if (ei0Var != null) {
                    ei0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f19211id) < 0) {
                    z10 = false;
                }
                if (ei0Var != null) {
                    ei0Var.a(z10, false);
                }
            }
            wVar.setOnCheckedChangeListener(new mg.w(6, this, stickerSetCovered));
        } else if (j(i10) == 2) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == rVar.f37889w) {
                a9Var.setTopPadding(17);
                a9Var.setBottomPadding(10);
                if (rVar.E == 5) {
                    i11 = R.string.ArchivedEmojiInfo;
                } else {
                    i11 = R.string.ArchivedStickersInfo;
                }
                a9Var.setText(LocaleController.getString(i11));
                return;
            }
            a9Var.setTopPadding(10);
            a9Var.setBottomPadding(17);
            a9Var.setText(null);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f37562c;
        View view = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.a9(context);
                }
            } else {
                view = new org.telegram.ui.Cells.s4(context);
            }
        } else {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            view = wVar;
        }
        view.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(view);
    }
}
