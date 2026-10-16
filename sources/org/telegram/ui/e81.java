package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class e81 extends org.telegram.ui.Components.db implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.zz X;
    public final di.d Y;
    public final bi.o8 Z;
    public final HashMap f35219a0;
    public final int f35220b0;
    public int f35221c0;
    public org.telegram.ui.Components.a71 f35222d0;

    public e81(org.telegram.ui.ActionBar.m2 r17, long r18, int r20, org.telegram.ui.Components.vc r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e81.<init>(org.telegram.ui.ActionBar.m2, long, int, org.telegram.ui.Components.vc):void");
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }

    public final void Q() {
        int abs;
        org.telegram.ui.Components.zz zzVar = this.X;
        int L0 = zzVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(zzVar.N0() - L0) + 1;
        }
        bi.o8 o8Var = this.Z;
        if (o8Var != null) {
            int i10 = L0 + abs;
            int i11 = o8Var.i();
            int i12 = this.f35220b0;
            if (i10 > i11 - i12) {
                o8Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean R(int i10, View view) {
        org.telegram.ui.Components.m61 G;
        org.telegram.ui.Components.a71 a71Var = this.f35222d0;
        if (a71Var == null || i10 == 0 || (G = a71Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.f35219a0;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.e = false;
                ((org.telegram.ui.Cells.t7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.t7) view).i(true, true);
            }
            di.d dVar = this.Y;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.b(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((bi.o8) objArr[0]) == this.Z) {
            this.f35222d0.N(false);
            Q();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35221c0 = this.Z.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.z(this.f35221c0);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.lm0 x(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(mm0Var, getContext(), this.currentAccount, 0, false, new f5(this, 25), this.resourcesProvider);
        this.f35222d0 = a71Var;
        a71Var.f23145r = false;
        return a71Var;
    }
}
