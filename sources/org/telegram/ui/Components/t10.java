package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class t10 extends bj0 {
    public boolean f27987r;
    public boolean f27988s;
    public final s10 v;
    public final s10 f27989w;
    public final FragmentContextView f27990x;

    public t10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f27990x = fragmentContextView;
        this.v = new Runnable(this) {
            public final t10 f27748b;

            {
                this.f27748b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27748b.f27990x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            yi0 yi0Var = fragmentContextView2.f22078y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (yi0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22078y.M(0);
                                } else {
                                    fragmentContextView2.f22078y.M(14);
                                }
                            }
                            fragmentContextView2.f22076x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f22046a.f(true);
                            return;
                        }
                        return;
                    default:
                        t10 t10Var = this.f27748b;
                        FragmentContextView fragmentContextView3 = t10Var.f27990x;
                        if (t10Var.f27987r && VoIPService.getSharedInstance() != null) {
                            t10Var.f27987r = false;
                            t10Var.f27988s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(t10Var.v, 90L);
                            try {
                                fragmentContextView3.f22076x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f27989w = new Runnable(this) {
            public final t10 f27748b;

            {
                this.f27748b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27748b.f27990x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            yi0 yi0Var = fragmentContextView2.f22078y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (yi0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22078y.M(0);
                                } else {
                                    fragmentContextView2.f22078y.M(14);
                                }
                            }
                            fragmentContextView2.f22076x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f22046a.f(true);
                            return;
                        }
                        return;
                    default:
                        t10 t10Var = this.f27748b;
                        FragmentContextView fragmentContextView3 = t10Var.f27990x;
                        if (t10Var.f27987r && VoIPService.getSharedInstance() != null) {
                            t10Var.f27987r = false;
                            t10Var.f27988s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(t10Var.v, 90L);
                            try {
                                fragmentContextView3.f22076x.performHapticFeedback(3, 2);
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
        if (this.f27990x.O) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f27990x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        s10 s10Var = this.v;
        s10 s10Var2 = this.f27989w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(s10Var2);
            AndroidUtilities.cancelRunOnUIThread(s10Var);
            this.f27987r = false;
            this.f27988s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(s10Var2, 300L);
            this.f27987r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(s10Var);
            if (this.f27987r) {
                AndroidUtilities.cancelRunOnUIThread(s10Var2);
                this.f27987r = false;
            } else if (this.f27988s) {
                fragmentContextView.O = true;
                if (fragmentContextView.f22078y.P(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.f22078y.M(0);
                    } else {
                        fragmentContextView.f22078y.M(14);
                    }
                }
                fragmentContextView.f22076x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f22076x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f27988s = false;
                org.telegram.ui.ActionBar.j6.D0().c(true);
                fragmentContextView.f22046a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
