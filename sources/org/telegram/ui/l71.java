package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class l71 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.nz U;
    public final ph.d V;
    public final nh.l6 W;
    public final HashMap X;
    public final int Y;
    public int Z;
    public org.telegram.ui.Components.w51 f35671a0;

    public l71(org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10, org.telegram.ui.Components.lc lcVar) {
        super(p2Var);
        this.X = new HashMap();
        this.Y = i10;
        nh.l6 A = MessagesController.getInstance(p2Var.getCurrentAccount()).getStoriesController().A(j10, 1, -1, true);
        this.W = A;
        A.p(30, false);
        this.H = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        J();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, k7.b6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19882d7, this.resourcesProvider));
        frameLayout.addView(view, k7.b6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ph.d dVar = new ph.d(getContext(), this.resourcesProvider, true);
        this.V = dVar;
        dVar.g(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new ib0(18, this, lcVar));
        frameLayout.addView(dVar, k7.b6.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.nz nzVar = new org.telegram.ui.Components.nz(i10, false);
        this.U = nzVar;
        nzVar.O = new j71(this);
        org.telegram.ui.Components.rl0 rl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i12, 0, i12, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(nzVar);
        this.d.setOnItemClickListener(new p21(this, 4));
        this.d.setOnItemLongClickListener(new kl0(this, 17));
        this.d.setOnScrollListener(new k71(this));
        this.f35671a0.N(true);
    }

    public final void P() {
        int abs;
        org.telegram.ui.Components.nz nzVar = this.U;
        int L0 = nzVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(nzVar.N0() - L0) + 1;
        }
        nh.l6 l6Var = this.W;
        if (l6Var != null) {
            int i10 = L0 + abs;
            int i11 = l6Var.i();
            int i12 = this.Y;
            if (i10 > i11 - i12) {
                l6Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean Q(int i10, View view) {
        org.telegram.ui.Components.i51 G;
        org.telegram.ui.Components.w51 w51Var = this.f35671a0;
        if (w51Var == null || i10 == 0 || (G = w51Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.X;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.e = false;
                ((org.telegram.ui.Cells.q7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.e = true;
                ((org.telegram.ui.Cells.q7) view).i(true, true);
            }
            ph.d dVar = this.V;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((nh.l6) objArr[0]) == this.W) {
            this.f35671a0.N(false);
            P();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z = this.W.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.W.z(this.Z);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.ql0 v(org.telegram.ui.Components.rl0 rl0Var) {
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(rl0Var, getContext(), this.currentAccount, 0, false, new f5(this, 25), this.resourcesProvider);
        this.f35671a0 = w51Var;
        w51Var.f30148r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
