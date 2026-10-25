package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.SparseLongArray;
public final class bc extends yb implements NotificationCenter.NotificationCenterDelegate {
    public final zb d;
    public SparseLongArray e;
    public final org.telegram.ui.ActionBar.r2 f26818f;
    public final int h;
    public qc f26819n;

    public bc(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        super(r2Var.getContext(), r2Var.getResourceProvider());
        this.f26818f = r2Var;
        this.h = i10;
        this.f34998b.setLayoutParams(gb1.m(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.f34997a.setLayoutParams(gb1.l(56.0f, 48.0f, 8388659));
        zb zbVar = new zb(this, r2Var, getContext(), r2Var.getCurrentAccount(), r2Var.getResourceProvider());
        this.d = zbVar;
        zbVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
        this.d.setDelegate(new ac(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-AndroidUtilities.dp(80.0f));
        this.d.setHint(LocaleController.getString(R.string.SavedTagReactionsHint));
        addView(this.d, gb1.h(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
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
            if (this.d.getReactionsWindow().f4047a != null) {
                this.d.getReactionsWindow().f4047a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return AndroidUtilities.dp(30.0f) + this.f34998b.getMeasuredHeight();
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

    public void setBulletin(qc qcVar) {
        this.f26819n = qcVar;
    }
}
