package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

public final class h10 extends ri0 {

    public boolean f28894r;

    public boolean f28895s;
    public final g10 v;

    public final g10 f28896w;

    public final FragmentContextView f28897x;

    public h10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f28897x = fragmentContextView;
        final int i10 = 0;
        this.v = new Runnable(this) {

            public final h10 f28499b;

            {
                this.f28499b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28499b.f28897x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.f26403y.N(fragmentContextView2.K ? 15 : 29)) {
                                if (fragmentContextView2.K) {
                                    fragmentContextView2.f26403y.K(0);
                                } else {
                                    fragmentContextView2.f26403y.K(14);
                                }
                            }
                            fragmentContextView2.f26401x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView2.f26370a.f(true);
                            break;
                        }
                        break;
                    default:
                        h10 h10Var = this.f28499b;
                        FragmentContextView fragmentContextView3 = h10Var.f28897x;
                        if (h10Var.f28894r && VoIPService.getSharedInstance() != null) {
                            h10Var.f28894r = false;
                            h10Var.f28895s = true;
                            fragmentContextView3.K = false;
                            AndroidUtilities.runOnUIThread(h10Var.v, 90L);
                            try {
                                fragmentContextView3.f26401x.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f28896w = new Runnable(this) {

            public final h10 f28499b;

            {
                this.f28499b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28499b.f28897x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.f26403y.N(fragmentContextView2.K ? 15 : 29)) {
                                if (fragmentContextView2.K) {
                                    fragmentContextView2.f26403y.K(0);
                                } else {
                                    fragmentContextView2.f26403y.K(14);
                                }
                            }
                            fragmentContextView2.f26401x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView2.f26370a.f(true);
                            break;
                        }
                        break;
                    default:
                        h10 h10Var = this.f28499b;
                        FragmentContextView fragmentContextView3 = h10Var.f28897x;
                        if (h10Var.f28894r && VoIPService.getSharedInstance() != null) {
                            h10Var.f28894r = false;
                            h10Var.f28895s = true;
                            fragmentContextView3.K = false;
                            AndroidUtilities.runOnUIThread(h10Var.v, 90L);
                            try {
                                fragmentContextView3.f26401x.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setText(LocaleController.getString(this.f28897x.K ? R.string.VoipUnmute : R.string.VoipMute));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f28897x;
        int i10 = fragmentContextView.P;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        g10 g10Var = this.v;
        g10 g10Var2 = this.f28896w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(g10Var2);
            AndroidUtilities.cancelRunOnUIThread(g10Var);
            this.f28894r = false;
            this.f28895s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(g10Var2, 300L);
            this.f28894r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(g10Var);
            if (this.f28894r) {
                AndroidUtilities.cancelRunOnUIThread(g10Var2);
                this.f28894r = false;
            } else if (this.f28895s) {
                fragmentContextView.K = true;
                if (fragmentContextView.f26403y.N(15)) {
                    if (fragmentContextView.K) {
                        fragmentContextView.f26403y.K(0);
                    } else {
                        fragmentContextView.f26403y.K(14);
                    }
                }
                fragmentContextView.f26401x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f26401x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f28895s = false;
                org.telegram.ui.ActionBar.g6.D0().c(true);
                fragmentContextView.f26370a.f(true);
                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
