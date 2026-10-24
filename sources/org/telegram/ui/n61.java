package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class n61 extends org.telegram.ui.Components.za implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.uz X;
    public final ei.d Y;
    public final ci.z6 Z;
    public final HashMap f39745a0;
    public final int f39746b0;
    public int f39747c0;
    public org.telegram.ui.Components.a71 f39748d0;

    public n61(org.telegram.ui.ActionBar.o2 r17, long r18, int r20, ai.k4 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n61.<init>(org.telegram.ui.ActionBar.o2, long, int, ai.k4):void");
    }

    public final void P() {
        int abs;
        org.telegram.ui.Components.uz uzVar = this.X;
        int L0 = uzVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(uzVar.N0() - L0) + 1;
        }
        ci.z6 z6Var = this.Z;
        if (z6Var != null) {
            int i10 = L0 + abs;
            int i11 = z6Var.i();
            int i12 = this.f39746b0;
            if (i10 > i11 - i12) {
                z6Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean Q(int i10, View view) {
        org.telegram.ui.Components.l61 G;
        org.telegram.ui.Components.a71 a71Var = this.f39748d0;
        if (a71Var == null || i10 == 0 || (G = a71Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f39745a0;
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
        if (i10 == NotificationCenter.storiesListUpdated && ((ci.z6) objArr[0]) == this.Z) {
            this.f39748d0.N(false);
            P();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39747c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.f39747c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.km0 w(org.telegram.ui.Components.lm0 lm0Var) {
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(lm0Var, getContext(), this.currentAccount, 0, false, new f5(this, 25), this.resourcesProvider);
        this.f39748d0 = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
