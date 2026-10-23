package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class k61 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.wz X;
    public final ei.d Y;
    public final ci.a7 Z;
    public final HashMap f38433a0;
    public final int f38434b0;
    public int f38435c0;
    public org.telegram.ui.Components.u61 f38436d0;

    public k61(org.telegram.ui.ActionBar.n2 r17, long r18, int r20, ai.k4 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k61.<init>(org.telegram.ui.ActionBar.n2, long, int, ai.k4):void");
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }

    public final void Q() {
        int abs;
        org.telegram.ui.Components.wz wzVar = this.X;
        int L0 = wzVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(wzVar.N0() - L0) + 1;
        }
        ci.a7 a7Var = this.Z;
        if (a7Var != null) {
            int i10 = L0 + abs;
            int i11 = a7Var.i();
            int i12 = this.f38434b0;
            if (i10 > i11 - i12) {
                a7Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean R(int i10, View view) {
        org.telegram.ui.Components.h61 G;
        org.telegram.ui.Components.u61 u61Var = this.f38436d0;
        if (u61Var == null || i10 == 0 || (G = u61Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f38433a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.e = false;
                ((org.telegram.ui.Cells.s7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.s7) view).i(true, true);
            }
            ei.d dVar = this.Y;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((ci.a7) objArr[0]) == this.Z) {
            this.f38436d0.N(false);
            Q();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38435c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.f38435c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.im0 x(org.telegram.ui.Components.jm0 jm0Var) {
        org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(jm0Var, getContext(), this.currentAccount, 0, false, new g5(this, 25), this.resourcesProvider);
        this.f38436d0 = u61Var;
        u61Var.f30865r = false;
        return u61Var;
    }
}
