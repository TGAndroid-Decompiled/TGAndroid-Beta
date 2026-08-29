package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.SparseLongArray;
public final class xb extends ub implements NotificationCenter.NotificationCenterDelegate {
    public final vb d;
    public SparseLongArray f34670e;
    public final org.telegram.ui.ActionBar.o2 f34671f;
    public final int h;
    public mc f34672n;

    public xb(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getContext(), o2Var.getResourceProvider());
        this.f34671f = o2Var;
        this.h = i10;
        this.f33185b.setLayoutParams(i7.f6.i(-2.0f, -2.0f, 8388659, 56.0f, 6.0f, 8.0f, 0.0f));
        this.f33184a.setLayoutParams(i7.f6.h(56.0f, 48.0f, 8388659));
        vb vbVar = new vb(this, o2Var, getContext(), o2Var.getCurrentAccount(), o2Var.getResourceProvider());
        this.d = vbVar;
        vbVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
        this.d.setDelegate(new wb(this));
        this.d.setTop(true);
        this.d.setClipChildren(false);
        this.d.setClipToPadding(false);
        this.d.setVisibility(0);
        this.d.setBubbleOffset(-AndroidUtilities.dp(80.0f));
        this.d.setHint(LocaleController.getString(R.string.SavedTagReactionsHint));
        addView(this.d, i7.f6.d(-2, 92.5f, 1, 0.0f, 36.0f, 0.0f, 0.0f));
        this.d.p(null, null, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.savedMessagesForwarded) {
            this.f34670e = (SparseLongArray) objArr[0];
        }
    }

    public final void f() {
        if (this.d.getReactionsWindow() != null) {
            this.d.e();
            if (this.d.getReactionsWindow().f13681a != null) {
                this.d.getReactionsWindow().f13681a.animate().alpha(0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public int getMeasuredBackgroundHeight() {
        return AndroidUtilities.dp(30.0f) + this.f33185b.getMeasuredHeight();
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

    public void setBulletin(mc mcVar) {
        this.f34672n = mcVar;
    }
}
