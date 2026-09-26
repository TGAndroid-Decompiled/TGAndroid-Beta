package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class v10 extends mj0 {
    public boolean f28963r;
    public boolean f28964s;
    public final u10 v;
    public final u10 f28965w;
    public final FragmentContextView f28966x;

    public v10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f28966x = fragmentContextView;
        this.v = new Runnable(this) {
            public final v10 f28668b;

            {
                this.f28668b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28668b.f28966x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            jj0 jj0Var = fragmentContextView2.f22287y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (jj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22287y.M(0);
                                } else {
                                    fragmentContextView2.f22287y.M(14);
                                }
                            }
                            fragmentContextView2.f22285x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView2.f22255a.f(true);
                            return;
                        }
                        return;
                    default:
                        v10 v10Var = this.f28668b;
                        FragmentContextView fragmentContextView3 = v10Var.f28966x;
                        if (v10Var.f28963r && VoIPService.getSharedInstance() != null) {
                            v10Var.f28963r = false;
                            v10Var.f28964s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(v10Var.v, 90L);
                            try {
                                fragmentContextView3.f22285x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f28965w = new Runnable(this) {
            public final v10 f28668b;

            {
                this.f28668b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28668b.f28966x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            jj0 jj0Var = fragmentContextView2.f22287y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (jj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22287y.M(0);
                                } else {
                                    fragmentContextView2.f22287y.M(14);
                                }
                            }
                            fragmentContextView2.f22285x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView2.f22255a.f(true);
                            return;
                        }
                        return;
                    default:
                        v10 v10Var = this.f28668b;
                        FragmentContextView fragmentContextView3 = v10Var.f28966x;
                        if (v10Var.f28963r && VoIPService.getSharedInstance() != null) {
                            v10Var.f28963r = false;
                            v10Var.f28964s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(v10Var.v, 90L);
                            try {
                                fragmentContextView3.f22285x.performHapticFeedback(3, 2);
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
        if (this.f28966x.O) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f28966x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        u10 u10Var = this.v;
        u10 u10Var2 = this.f28965w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(u10Var2);
            AndroidUtilities.cancelRunOnUIThread(u10Var);
            this.f28963r = false;
            this.f28964s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(u10Var2, 300L);
            this.f28963r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(u10Var);
            if (this.f28963r) {
                AndroidUtilities.cancelRunOnUIThread(u10Var2);
                this.f28963r = false;
            } else if (this.f28964s) {
                fragmentContextView.O = true;
                if (fragmentContextView.f22287y.P(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.f22287y.M(0);
                    } else {
                        fragmentContextView.f22287y.M(14);
                    }
                }
                fragmentContextView.f22285x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f22285x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f28964s = false;
                org.telegram.ui.ActionBar.h6.D0().c(true);
                fragmentContextView.f22255a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
