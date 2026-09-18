package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class t10 extends lj0 {
    public boolean f28277r;
    public boolean f28278s;
    public final s10 v;
    public final s10 f28279w;
    public final FragmentContextView f28280x;

    public t10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f28280x = fragmentContextView;
        this.v = new Runnable(this) {
            public final t10 f28028b;

            {
                this.f28028b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28028b.f28280x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ij0 ij0Var = fragmentContextView2.f22251y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (ij0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22251y.M(0);
                                } else {
                                    fragmentContextView2.f22251y.M(14);
                                }
                            }
                            fragmentContextView2.f22249x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f22219a.f(true);
                            return;
                        }
                        return;
                    default:
                        t10 t10Var = this.f28028b;
                        FragmentContextView fragmentContextView3 = t10Var.f28280x;
                        if (t10Var.f28277r && VoIPService.getSharedInstance() != null) {
                            t10Var.f28277r = false;
                            t10Var.f28278s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(t10Var.v, 90L);
                            try {
                                fragmentContextView3.f22249x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f28279w = new Runnable(this) {
            public final t10 f28028b;

            {
                this.f28028b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28028b.f28280x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ij0 ij0Var = fragmentContextView2.f22251y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (ij0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22251y.M(0);
                                } else {
                                    fragmentContextView2.f22251y.M(14);
                                }
                            }
                            fragmentContextView2.f22249x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f22219a.f(true);
                            return;
                        }
                        return;
                    default:
                        t10 t10Var = this.f28028b;
                        FragmentContextView fragmentContextView3 = t10Var.f28280x;
                        if (t10Var.f28277r && VoIPService.getSharedInstance() != null) {
                            t10Var.f28277r = false;
                            t10Var.f28278s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(t10Var.v, 90L);
                            try {
                                fragmentContextView3.f22249x.performHapticFeedback(3, 2);
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
        if (this.f28280x.O) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f28280x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        s10 s10Var = this.v;
        s10 s10Var2 = this.f28279w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(s10Var2);
            AndroidUtilities.cancelRunOnUIThread(s10Var);
            this.f28277r = false;
            this.f28278s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(s10Var2, 300L);
            this.f28277r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(s10Var);
            if (this.f28277r) {
                AndroidUtilities.cancelRunOnUIThread(s10Var2);
                this.f28277r = false;
            } else if (this.f28278s) {
                fragmentContextView.O = true;
                if (fragmentContextView.f22251y.P(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.f22251y.M(0);
                    } else {
                        fragmentContextView.f22251y.M(14);
                    }
                }
                fragmentContextView.f22249x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f22249x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f28278s = false;
                org.telegram.ui.ActionBar.j6.D0().c(true);
                fragmentContextView.f22219a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
