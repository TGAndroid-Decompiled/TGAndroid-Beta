package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class u10 extends lj0 {
    public boolean f28658r;
    public boolean f28659s;
    public final t10 v;
    public final t10 f28660w;
    public final FragmentContextView f28661x;

    public u10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f28661x = fragmentContextView;
        this.v = new Runnable(this) {
            public final u10 f28375b;

            {
                this.f28375b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28375b.f28661x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ij0 ij0Var = fragmentContextView2.f22273y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (ij0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22273y.M(0);
                                } else {
                                    fragmentContextView2.f22273y.M(14);
                                }
                            }
                            fragmentContextView2.f22271x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView2.f22241a.f(true);
                            return;
                        }
                        return;
                    default:
                        u10 u10Var = this.f28375b;
                        FragmentContextView fragmentContextView3 = u10Var.f28661x;
                        if (u10Var.f28658r && VoIPService.getSharedInstance() != null) {
                            u10Var.f28658r = false;
                            u10Var.f28659s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(u10Var.v, 90L);
                            try {
                                fragmentContextView3.f22271x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f28660w = new Runnable(this) {
            public final u10 f28375b;

            {
                this.f28375b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28375b.f28661x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ij0 ij0Var = fragmentContextView2.f22273y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (ij0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22273y.M(0);
                                } else {
                                    fragmentContextView2.f22273y.M(14);
                                }
                            }
                            fragmentContextView2.f22271x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView2.f22241a.f(true);
                            return;
                        }
                        return;
                    default:
                        u10 u10Var = this.f28375b;
                        FragmentContextView fragmentContextView3 = u10Var.f28661x;
                        if (u10Var.f28658r && VoIPService.getSharedInstance() != null) {
                            u10Var.f28658r = false;
                            u10Var.f28659s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(u10Var.v, 90L);
                            try {
                                fragmentContextView3.f22271x.performHapticFeedback(3, 2);
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
        if (this.f28661x.O) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f28661x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t10 t10Var = this.v;
        t10 t10Var2 = this.f28660w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(t10Var2);
            AndroidUtilities.cancelRunOnUIThread(t10Var);
            this.f28658r = false;
            this.f28659s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(t10Var2, 300L);
            this.f28658r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(t10Var);
            if (this.f28658r) {
                AndroidUtilities.cancelRunOnUIThread(t10Var2);
                this.f28658r = false;
            } else if (this.f28659s) {
                fragmentContextView.O = true;
                if (fragmentContextView.f22273y.P(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.f22273y.M(0);
                    } else {
                        fragmentContextView.f22273y.M(14);
                    }
                }
                fragmentContextView.f22271x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f22271x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f28659s = false;
                org.telegram.ui.ActionBar.h6.D0().c(true);
                fragmentContextView.f22241a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
