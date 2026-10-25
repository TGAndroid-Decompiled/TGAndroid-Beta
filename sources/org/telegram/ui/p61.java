package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class p61 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.vz X;
    public final fi.d Y;
    public final di.z6 Z;
    public final HashMap f42373a0;
    public final int f42374b0;
    public int f42375c0;
    public org.telegram.ui.Components.j71 f42376d0;

    public p61(org.telegram.ui.ActionBar.r2 r17, long r18, int r20, bi.f4 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p61.<init>(org.telegram.ui.ActionBar.r2, long, int, bi.f4):void");
    }

    public final void P() {
        int abs;
        org.telegram.ui.Components.vz vzVar = this.X;
        int L0 = vzVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(vzVar.N0() - L0) + 1;
        }
        di.z6 z6Var = this.Z;
        if (z6Var != null) {
            int i10 = L0 + abs;
            int i11 = z6Var.i();
            int i12 = this.f42374b0;
            if (i10 > i11 - i12) {
                z6Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean Q(int i10, View view) {
        org.telegram.ui.Components.t61 G;
        org.telegram.ui.Components.j71 j71Var = this.f42376d0;
        if (j71Var == null || i10 == 0 || (G = j71Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f42373a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.e = false;
                ((org.telegram.ui.Cells.w7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.w7) view).i(true, true);
            }
            fi.d dVar = this.Y;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((di.z6) objArr[0]) == this.Z) {
            this.f42376d0.O(false);
            P();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42375c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.f42375c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.lm0 v(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(mm0Var, getContext(), this.currentAccount, 0, false, new e5(this, 25), this.resourcesProvider);
        this.f42376d0 = j71Var;
        j71Var.f29505r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
