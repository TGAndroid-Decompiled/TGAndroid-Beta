package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class a81 extends org.telegram.ui.Components.db implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.g00 X;
    public final ci.d Y;
    public final ai.e9 Z;
    public final HashMap f35726a0;
    public final int f35727b0;
    public int f35728c0;
    public org.telegram.ui.Components.h71 f35729d0;

    public a81(org.telegram.ui.ActionBar.m2 r17, long r18, int r20, org.telegram.ui.Components.vc r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a81.<init>(org.telegram.ui.ActionBar.m2, long, int, org.telegram.ui.Components.vc):void");
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }

    public final void Q() {
        int abs;
        org.telegram.ui.Components.g00 g00Var = this.X;
        int L0 = g00Var.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(g00Var.N0() - L0) + 1;
        }
        ai.e9 e9Var = this.Z;
        if (e9Var != null) {
            int i10 = L0 + abs;
            int i11 = e9Var.i();
            int i12 = this.f35727b0;
            if (i10 > i11 - i12) {
                e9Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean R(int i10, View view) {
        org.telegram.ui.Components.u61 G;
        org.telegram.ui.Components.h71 h71Var = this.f35729d0;
        if (h71Var == null || i10 == 0 || (G = h71Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f35726a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.f31065e = false;
                ((org.telegram.ui.Cells.t7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.f31065e = true;
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
        if (i10 == NotificationCenter.storiesListUpdated && ((ai.e9) objArr[0]) == this.Z) {
            this.f35729d0.N(false);
            Q();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35728c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.f35728c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.vm0 x(org.telegram.ui.Components.wm0 wm0Var) {
        org.telegram.ui.Components.h71 h71Var = new org.telegram.ui.Components.h71(wm0Var, getContext(), this.currentAccount, 0, false, new e5(this, 25), this.resourcesProvider);
        this.f35729d0 = h71Var;
        h71Var.f26679r = false;
        return h71Var;
    }
}
