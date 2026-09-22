package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class t10 extends aj0 {
    public boolean f28023r;
    public boolean f28024s;
    public final s10 v;
    public final s10 f28025w;
    public final FragmentContextView f28026x;

    public t10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f28026x = fragmentContextView;
        this.v = new Runnable(this) {
            public final t10 f27738b;

            {
                this.f27738b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27738b.f28026x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            xi0 xi0Var = fragmentContextView2.f22062y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (xi0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22062y.M(0);
                                } else {
                                    fragmentContextView2.f22062y.M(14);
                                }
                            }
                            fragmentContextView2.f22060x.d();
                            org.telegram.ui.ActionBar.i6.D0().c(true);
                            fragmentContextView2.f22030a.f(true);
                            return;
                        }
                        return;
                    default:
                        t10 t10Var = this.f27738b;
                        FragmentContextView fragmentContextView3 = t10Var.f28026x;
                        if (t10Var.f28023r && VoIPService.getSharedInstance() != null) {
                            t10Var.f28023r = false;
                            t10Var.f28024s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(t10Var.v, 90L);
                            try {
                                fragmentContextView3.f22060x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f28025w = new Runnable(this) {
            public final t10 f27738b;

            {
                this.f27738b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27738b.f28026x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            xi0 xi0Var = fragmentContextView2.f22062y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (xi0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22062y.M(0);
                                } else {
                                    fragmentContextView2.f22062y.M(14);
                                }
                            }
                            fragmentContextView2.f22060x.d();
                            org.telegram.ui.ActionBar.i6.D0().c(true);
                            fragmentContextView2.f22030a.f(true);
                            return;
                        }
                        return;
                    default:
                        t10 t10Var = this.f27738b;
                        FragmentContextView fragmentContextView3 = t10Var.f28026x;
                        if (t10Var.f28023r && VoIPService.getSharedInstance() != null) {
                            t10Var.f28023r = false;
                            t10Var.f28024s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(t10Var.v, 90L);
                            try {
                                fragmentContextView3.f22060x.performHapticFeedback(3, 2);
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
        if (this.f28026x.O) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f28026x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        s10 s10Var = this.v;
        s10 s10Var2 = this.f28025w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(s10Var2);
            AndroidUtilities.cancelRunOnUIThread(s10Var);
            this.f28023r = false;
            this.f28024s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(s10Var2, 300L);
            this.f28023r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(s10Var);
            if (this.f28023r) {
                AndroidUtilities.cancelRunOnUIThread(s10Var2);
                this.f28023r = false;
            } else if (this.f28024s) {
                fragmentContextView.O = true;
                if (fragmentContextView.f22062y.P(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.f22062y.M(0);
                    } else {
                        fragmentContextView.f22062y.M(14);
                    }
                }
                fragmentContextView.f22060x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f22060x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f28024s = false;
                org.telegram.ui.ActionBar.i6.D0().c(true);
                fragmentContextView.f22030a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
