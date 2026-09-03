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
public final class k71 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.pz U;
    public final qh.d V;
    public final oh.l6 W;
    public final HashMap X;
    public final int Y;
    public int Z;
    public org.telegram.ui.Components.w51 f38203a0;

    public k71(org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10, org.telegram.ui.Components.mc mcVar) {
        super(p2Var);
        this.X = new HashMap();
        this.Y = i10;
        oh.l6 A = MessagesController.getInstance(p2Var.getCurrentAccount()).getStoriesController().A(j10, 1, -1, true);
        this.W = A;
        A.p(30, false);
        this.H = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        J();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, k7.c6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21662d7, this.resourcesProvider));
        frameLayout.addView(view, k7.c6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        qh.d dVar = new qh.d(getContext(), this.resourcesProvider, true);
        this.V = dVar;
        dVar.g(LocaleController.getString(R.string.StoriesAlbumMenuAddStories), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new hb0(18, this, mcVar));
        frameLayout.addView(dVar, k7.c6.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(i10, false);
        this.U = pzVar;
        pzVar.O = new i71(this);
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i12, 0, i12, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(pzVar);
        this.d.setOnItemClickListener(new p21(this, 4));
        this.d.setOnItemLongClickListener(new kl0(this, 17));
        this.d.setOnScrollListener(new j71(this));
        this.f38203a0.N(true);
    }

    public final void P() {
        int abs;
        org.telegram.ui.Components.pz pzVar = this.U;
        int L0 = pzVar.L0();
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(pzVar.N0() - L0) + 1;
        }
        oh.l6 l6Var = this.W;
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
        org.telegram.ui.Components.h51 G;
        org.telegram.ui.Components.w51 w51Var = this.f38203a0;
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
                G.f27369e = false;
                ((org.telegram.ui.Cells.r7) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(id2), messageObject.storyItem);
                G.f27369e = true;
                ((org.telegram.ui.Cells.r7) view).i(true, true);
            }
            qh.d dVar = this.V;
            dVar.setEnabled(!hashMap.isEmpty());
            dVar.c(hashMap.size(), true);
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && ((oh.l6) objArr[0]) == this.W) {
            this.f38203a0.N(false);
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
    public final org.telegram.ui.Components.rl0 v(org.telegram.ui.Components.sl0 sl0Var) {
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(sl0Var, getContext(), this.currentAccount, 0, false, new d5(this, 25), this.resourcesProvider);
        this.f38203a0 = w51Var;
        w51Var.f32651r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
    }
}
