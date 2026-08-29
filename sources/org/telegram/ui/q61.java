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
public final class q61 extends org.telegram.ui.Components.xa implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.iz T;
    public final nh.d U;
    public final lh.k6 V;
    public final HashMap W;
    public final int X;
    public int Y;
    public org.telegram.ui.Components.k51 Z;

    public q61(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10, org.telegram.ui.Components.pc pcVar) {
        super(o2Var);
        this.W = new HashMap();
        this.X = i10;
        lh.k6 A = MessagesController.getInstance(o2Var.getCurrentAccount()).getStoriesController().A(j10, 1, -1, true);
        this.V = A;
        A.p(30, false);
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        J();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, i7.f6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, this.resourcesProvider));
        frameLayout.addView(view, i7.f6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        nh.d dVar = new nh.d(getContext(), this.resourcesProvider, true);
        this.U = dVar;
        dVar.g(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new t70(21, this, pcVar));
        frameLayout.addView(dVar, i7.f6.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(i10, false);
        this.T = izVar;
        izVar.O = new o61(this);
        org.telegram.ui.Components.jl0 jl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i12, 0, i12, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(izVar);
        this.d.setOnItemClickListener(new d21(this, 3));
        this.d.setOnItemLongClickListener(new zk0(this, 17));
        this.d.setOnScrollListener(new p61(this));
        this.Z.N(true);
    }

    public final void P() {
        int abs;
        org.telegram.ui.Components.iz izVar = this.T;
        int L0 = izVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(izVar.N0() - L0) + 1;
        }
        lh.k6 k6Var = this.V;
        if (k6Var != null) {
            int i10 = L0 + abs;
            int i11 = k6Var.i();
            int i12 = this.X;
            if (i10 > i11 - i12) {
                k6Var.p(Math.min(100, Math.max(1, i12 / 2) * i12 * i12), false);
            }
        }
    }

    public final boolean Q(int i10, View view) {
        org.telegram.ui.Components.w41 G;
        org.telegram.ui.Components.k51 k51Var = this.Z;
        if (k51Var == null || i10 == 0 || (G = k51Var.G(i10 - 1)) == null) {
            return false;
        }
        Object obj = G.G;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            int id2 = messageObject.getId();
            Integer valueOf = Integer.valueOf(id2);
            HashMap hashMap = this.W;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(id2));
                G.f34294e = false;
                ((org.telegram.ui.Cells.p7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.f34294e = true;
                ((org.telegram.ui.Cells.p7) view).i(true, true);
            }
            nh.d dVar = this.U;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((lh.k6) objArr[0]) == this.V) {
            this.Z.N(false);
            P();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y = this.V.o();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V.z(this.Y);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final org.telegram.ui.Components.il0 v(org.telegram.ui.Components.jl0 jl0Var) {
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(jl0Var, getContext(), this.currentAccount, 0, false, new b5(this, 25), this.resourcesProvider);
        this.Z = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
