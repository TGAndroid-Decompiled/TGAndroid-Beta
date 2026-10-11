package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class k20 extends hk0 {
    public boolean f27822r;
    public boolean f27823s;
    public final j20 v;
    public final j20 f27824w;
    public final FragmentContextView f27825x;

    public k20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f27825x = fragmentContextView;
        this.v = new Runnable(this) {
            public final k20 f27526b;

            {
                this.f27526b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27526b.f27825x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ek0 ek0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (ek0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f24187y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView2.f24154a.f(true);
                            return;
                        }
                        return;
                    default:
                        k20 k20Var = this.f27526b;
                        FragmentContextView fragmentContextView3 = k20Var.f27825x;
                        if (k20Var.f27822r && VoIPService.getSharedInstance() != null) {
                            k20Var.f27822r = false;
                            k20Var.f27823s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(k20Var.v, 90L);
                            try {
                                fragmentContextView3.f24187y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f27824w = new Runnable(this) {
            public final k20 f27526b;

            {
                this.f27526b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27526b.f27825x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ek0 ek0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (ek0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f24187y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView2.f24154a.f(true);
                            return;
                        }
                        return;
                    default:
                        k20 k20Var = this.f27526b;
                        FragmentContextView fragmentContextView3 = k20Var.f27825x;
                        if (k20Var.f27822r && VoIPService.getSharedInstance() != null) {
                            k20Var.f27822r = false;
                            k20Var.f27823s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(k20Var.v, 90L);
                            try {
                                fragmentContextView3.f24187y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        if (this.f27825x.P) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f27825x;
        int i10 = fragmentContextView.U;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        j20 j20Var = this.v;
        j20 j20Var2 = this.f27824w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(j20Var2);
            AndroidUtilities.cancelRunOnUIThread(j20Var);
            this.f27822r = false;
            this.f27823s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(j20Var2, 300L);
            this.f27822r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(j20Var);
            if (this.f27822r) {
                AndroidUtilities.cancelRunOnUIThread(j20Var2);
                this.f27822r = false;
            } else if (this.f27823s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.P(15)) {
                    if (fragmentContextView.P) {
                        fragmentContextView.E.M(0);
                    } else {
                        fragmentContextView.E.M(14);
                    }
                }
                fragmentContextView.f24187y.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f24187y.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f27823s = false;
                org.telegram.ui.ActionBar.h6.E0().c(true);
                fragmentContextView.f24154a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
