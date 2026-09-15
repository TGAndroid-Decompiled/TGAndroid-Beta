package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.SparseLongArray;
public final class zb extends wb implements NotificationCenter.NotificationCenterDelegate {
    public final xb d;
    public SparseLongArray e;
    public final org.telegram.ui.ActionBar.n2 f30537f;
    public final int h;
    public oc f30538n;

    public zb(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getContext(), n2Var.getResourceProvider());
        this.f30537f = n2Var;
        this.h = i10;
        this.f29682b.setLayoutParams(w7.x5.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.f29681a.setLayoutParams(w7.x5.h(56.0f, 48.0f, 8388659));
        xb xbVar = new xb(this, n2Var, getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider());
        this.d = xbVar;
        xbVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
        this.d.setDelegate(new yb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-AndroidUtilities.dp(80.0f));
        this.d.setHint(LocaleController.getString(R.string.SavedTagReactionsHint));
        addView(this.d, w7.x5.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.savedMessagesForwarded) {
            this.e = (SparseLongArray) objArr[0];
        }
    }

    public final void f() {
        if (this.d.getReactionsWindow() != null) {
            this.d.e();
            if (this.d.getReactionsWindow().f48983a != null) {
                this.d.getReactionsWindow().f48983a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return AndroidUtilities.dp(30.0f) + this.f29682b.getMeasuredHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.savedMessagesForwarded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.savedMessagesForwarded);
    }

    public void setBulletin(oc ocVar) {
        this.f30538n = ocVar;
    }
}
