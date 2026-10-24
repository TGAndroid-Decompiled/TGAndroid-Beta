package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class z10 extends ak0 {
    public boolean f33123r;
    public boolean f33124s;
    public final y10 v;
    public final y10 f33125w;
    public final FragmentContextView f33126x;

    public z10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f33126x = fragmentContextView;
        this.v = new Runnable(this) {
            public final z10 f32781b;

            {
                this.f32781b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f32781b.f33126x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            xj0 xj0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (xj0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f24390y.d();
                            org.telegram.ui.ActionBar.k6.F0().c(true);
                            fragmentContextView2.f24358a.h(true);
                            return;
                        }
                        return;
                    default:
                        z10 z10Var = this.f32781b;
                        FragmentContextView fragmentContextView3 = z10Var.f33126x;
                        if (z10Var.f33123r && VoIPService.getSharedInstance() != null) {
                            z10Var.f33123r = false;
                            z10Var.f33124s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(z10Var.v, 90L);
                            try {
                                fragmentContextView3.f24390y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f33125w = new Runnable(this) {
            public final z10 f32781b;

            {
                this.f32781b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f32781b.f33126x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            xj0 xj0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (xj0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f24390y.d();
                            org.telegram.ui.ActionBar.k6.F0().c(true);
                            fragmentContextView2.f24358a.h(true);
                            return;
                        }
                        return;
                    default:
                        z10 z10Var = this.f32781b;
                        FragmentContextView fragmentContextView3 = z10Var.f33126x;
                        if (z10Var.f33123r && VoIPService.getSharedInstance() != null) {
                            z10Var.f33123r = false;
                            z10Var.f33124s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(z10Var.v, 90L);
                            try {
                                fragmentContextView3.f24390y.performHapticFeedback(3, 2);
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
        if (this.f33126x.P) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f33126x;
        int i10 = fragmentContextView.U;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        y10 y10Var = this.v;
        y10 y10Var2 = this.f33125w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(y10Var2);
            AndroidUtilities.cancelRunOnUIThread(y10Var);
            this.f33123r = false;
            this.f33124s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(y10Var2, 300L);
            this.f33123r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(y10Var);
            if (this.f33123r) {
                AndroidUtilities.cancelRunOnUIThread(y10Var2);
                this.f33123r = false;
            } else if (this.f33124s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.P(15)) {
                    if (fragmentContextView.P) {
                        fragmentContextView.E.M(0);
                    } else {
                        fragmentContextView.E.M(14);
                    }
                }
                fragmentContextView.f24390y.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f24390y.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f33124s = false;
                org.telegram.ui.ActionBar.k6.F0().c(true);
                fragmentContextView.f24358a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
