package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.SparseLongArray;
public final class tb extends qb implements NotificationCenter.NotificationCenterDelegate {
    public final rb d;
    public SparseLongArray f31324e;
    public final org.telegram.ui.ActionBar.p2 f31325f;
    public final int h;
    public ic f31326n;

    public tb(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getContext(), p2Var.getResourceProvider());
        this.f31325f = p2Var;
        this.h = i10;
        this.f30375b.setLayoutParams(k7.c6.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.f30374a.setLayoutParams(k7.c6.h(56.0f, 48.0f, 8388659));
        rb rbVar = new rb(this, p2Var, getContext(), p2Var.getCurrentAccount(), p2Var.getResourceProvider());
        this.d = rbVar;
        rbVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
        this.d.setDelegate(new sb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-AndroidUtilities.dp(80.0f));
        this.d.setHint(LocaleController.getString(R.string.SavedTagReactionsHint));
        addView(this.d, k7.c6.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.savedMessagesForwarded) {
            this.f31324e = (SparseLongArray) objArr[0];
        }
    }

    public final void f() {
        if (this.d.getReactionsWindow() != null) {
            this.d.e();
            if (this.d.getReactionsWindow().f16035a != null) {
                this.d.getReactionsWindow().f16035a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return AndroidUtilities.dp(30.0f) + this.f30375b.getMeasuredHeight();
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

    public void setBulletin(ic icVar) {
        this.f31326n = icVar;
    }
}
