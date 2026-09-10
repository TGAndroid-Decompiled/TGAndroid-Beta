package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.SparseLongArray;
public final class ac extends xb implements NotificationCenter.NotificationCenterDelegate {
    public final yb d;
    public SparseLongArray e;
    public final org.telegram.ui.ActionBar.p2 f21459f;
    public final int h;
    public pc f21460n;

    public ac(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getContext(), p2Var.getResourceProvider());
        this.f21459f = p2Var;
        this.h = i10;
        this.f29000b.setLayoutParams(w7.a6.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.f28999a.setLayoutParams(w7.a6.h(56.0f, 48.0f, 8388659));
        yb ybVar = new yb(this, p2Var, getContext(), p2Var.getCurrentAccount(), p2Var.getResourceProvider());
        this.d = ybVar;
        ybVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
        this.d.setDelegate(new zb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-AndroidUtilities.dp(80.0f));
        this.d.setHint(LocaleController.getString(R.string.SavedTagReactionsHint));
        addView(this.d, w7.a6.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
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
            if (this.d.getReactionsWindow().f46950a != null) {
                this.d.getReactionsWindow().f46950a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return AndroidUtilities.dp(30.0f) + this.f29000b.getMeasuredHeight();
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

    public void setBulletin(pc pcVar) {
        this.f21460n = pcVar;
    }
}
