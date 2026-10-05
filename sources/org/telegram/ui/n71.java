package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class n71 extends org.telegram.ui.Components.cb implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.qz X;
    public final ci.d Y;
    public final ai.d9 Z;
    public final HashMap f38824a0;
    public final int f38825b0;
    public int f38826c0;
    public org.telegram.ui.Components.w61 f38827d0;

    public n71(org.telegram.ui.ActionBar.n2 r17, long r18, int r20, org.telegram.ui.Components.uc r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n71.<init>(org.telegram.ui.ActionBar.n2, long, int, org.telegram.ui.Components.uc):void");
    }

    public final void N() {
        int abs;
        org.telegram.ui.Components.qz qzVar = this.X;
        int L0 = qzVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(qzVar.N0() - L0) + 1;
        }
        ai.d9 d9Var = this.Z;
        if (d9Var != null) {
            int i10 = L0 + abs;
            int i11 = d9Var.i();
            int i12 = this.f38825b0;
            if (i10 > i11 - i12) {
                d9Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean O(int i10, View view) {
        org.telegram.ui.Components.h61 G;
        org.telegram.ui.Components.w61 w61Var = this.f38827d0;
        if (w61Var == null || i10 == 0 || (G = w61Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f38824a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.f27087e = false;
                ((org.telegram.ui.Cells.t7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.f27087e = true;
                ((org.telegram.ui.Cells.t7) view).i(true, true);
            }
            ci.d dVar = this.Y;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((ai.d9) objArr[0]) == this.Z) {
            this.f38827d0.N(false);
            N();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38826c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.f38826c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.yl0 v(org.telegram.ui.Components.zl0 zl0Var) {
        org.telegram.ui.Components.w61 w61Var = new org.telegram.ui.Components.w61(zl0Var, getContext(), this.currentAccount, 0, false, new c5(this, 25), this.resourcesProvider);
        this.f38827d0 = w61Var;
        w61Var.f32531r = false;
        return w61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
