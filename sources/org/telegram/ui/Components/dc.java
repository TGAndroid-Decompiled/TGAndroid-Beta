package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.SparseLongArray;
public final class dc extends ac implements NotificationCenter.NotificationCenterDelegate {
    public final bc d;
    public SparseLongArray f25529e;
    public final org.telegram.ui.ActionBar.m2 f25530f;
    public final int h;
    public sc f25531n;

    public dc(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        super(m2Var.getContext(), m2Var.getResourceProvider());
        this.f25530f = m2Var;
        this.h = i10;
        this.f24488b.setLayoutParams(w7.x5.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.f24487a.setLayoutParams(w7.x5.h(56.0f, 48.0f, 8388659));
        bc bcVar = new bc(this, m2Var, getContext(), m2Var.getCurrentAccount(), m2Var.getResourceProvider());
        this.d = bcVar;
        bcVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
        this.d.setDelegate(new cc(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-AndroidUtilities.dp(80.0f));
        this.d.setHint(LocaleController.getString(R.string.SavedTagReactionsHint));
        addView(this.d, w7.x5.a(92.5f, 0.0f, 36.0f, 0.0f, 0.0f, -2, 1));
        this.d.p(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.savedMessagesForwarded) {
            this.f25529e = (SparseLongArray) objArr[0];
        }
    }

    public final void f() {
        if (this.d.getReactionsWindow() != null) {
            this.d.e();
            if (this.d.getReactionsWindow().f54536a != null) {
                this.d.getReactionsWindow().f54536a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return AndroidUtilities.dp(30.0f) + this.f24488b.getMeasuredHeight();
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

    public void setBulletin(sc scVar) {
        this.f25531n = scVar;
    }
}
