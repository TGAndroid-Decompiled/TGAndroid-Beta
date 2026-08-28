package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.SparseLongArray;
public final class rb extends ob implements NotificationCenter.NotificationCenterDelegate {
    public final pb d;
    public SparseLongArray f32123e;
    public final org.telegram.ui.ActionBar.o2 f32124f;
    public final int h;
    public gc f32125n;

    public rb(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getContext(), o2Var.getResourceProvider());
        this.f32124f = o2Var;
        this.h = i9;
        this.f31343b.setLayoutParams(g7.e6.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.f31342a.setLayoutParams(g7.e6.h(56.0f, 48.0f, 8388659));
        pb pbVar = new pb(this, o2Var, getContext(), o2Var.getCurrentAccount(), o2Var.getResourceProvider());
        this.d = pbVar;
        pbVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
        this.d.setDelegate(new qb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-AndroidUtilities.dp(80.0f));
        this.d.setHint(LocaleController.getString(R.string.SavedTagReactionsHint));
        addView(this.d, g7.e6.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.savedMessagesForwarded) {
            this.f32123e = (SparseLongArray) objArr[0];
        }
    }

    public final void f() {
        if (this.d.getReactionsWindow() != null) {
            this.d.e();
            if (this.d.getReactionsWindow().f10574a != null) {
                this.d.getReactionsWindow().f10574a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return AndroidUtilities.dp(30.0f) + this.f31343b.getMeasuredHeight();
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

    public void setBulletin(gc gcVar) {
        this.f32125n = gcVar;
    }
}
