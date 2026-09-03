package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class u10 extends kj0 {
    public boolean f31470r;
    public boolean f31471s;
    public final t10 v;
    public final t10 f31472w;
    public final FragmentContextView f31473x;

    public u10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f31473x = fragmentContextView;
        this.v = new Runnable(this) {
            public final u10 f31243b;

            {
                this.f31243b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f31243b.f31473x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            hj0 hj0Var = fragmentContextView2.f24906y;
                            if (fragmentContextView2.L) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (hj0Var.N(i10)) {
                                if (fragmentContextView2.L) {
                                    fragmentContextView2.f24906y.K(0);
                                } else {
                                    fragmentContextView2.f24906y.K(14);
                                }
                            }
                            fragmentContextView2.f24904x.d();
                            org.telegram.ui.ActionBar.k6.D0().c(true);
                            fragmentContextView2.f24873a.f(true);
                            return;
                        }
                        return;
                    default:
                        u10 u10Var = this.f31243b;
                        FragmentContextView fragmentContextView3 = u10Var.f31473x;
                        if (u10Var.f31470r && VoIPService.getSharedInstance() != null) {
                            u10Var.f31470r = false;
                            u10Var.f31471s = true;
                            fragmentContextView3.L = false;
                            AndroidUtilities.runOnUIThread(u10Var.v, 90L);
                            try {
                                fragmentContextView3.f24904x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f31472w = new Runnable(this) {
            public final u10 f31243b;

            {
                this.f31243b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f31243b.f31473x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            hj0 hj0Var = fragmentContextView2.f24906y;
                            if (fragmentContextView2.L) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (hj0Var.N(i10)) {
                                if (fragmentContextView2.L) {
                                    fragmentContextView2.f24906y.K(0);
                                } else {
                                    fragmentContextView2.f24906y.K(14);
                                }
                            }
                            fragmentContextView2.f24904x.d();
                            org.telegram.ui.ActionBar.k6.D0().c(true);
                            fragmentContextView2.f24873a.f(true);
                            return;
                        }
                        return;
                    default:
                        u10 u10Var = this.f31243b;
                        FragmentContextView fragmentContextView3 = u10Var.f31473x;
                        if (u10Var.f31470r && VoIPService.getSharedInstance() != null) {
                            u10Var.f31470r = false;
                            u10Var.f31471s = true;
                            fragmentContextView3.L = false;
                            AndroidUtilities.runOnUIThread(u10Var.v, 90L);
                            try {
                                fragmentContextView3.f24904x.performHapticFeedback(3, 2);
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
        if (this.f31473x.L) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f31473x;
        int i10 = fragmentContextView.Q;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t10 t10Var = this.v;
        t10 t10Var2 = this.f31472w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(t10Var2);
            AndroidUtilities.cancelRunOnUIThread(t10Var);
            this.f31470r = false;
            this.f31471s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(t10Var2, 300L);
            this.f31470r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(t10Var);
            if (this.f31470r) {
                AndroidUtilities.cancelRunOnUIThread(t10Var2);
                this.f31470r = false;
            } else if (this.f31471s) {
                fragmentContextView.L = true;
                if (fragmentContextView.f24906y.N(15)) {
                    if (fragmentContextView.L) {
                        fragmentContextView.f24906y.K(0);
                    } else {
                        fragmentContextView.f24906y.K(14);
                    }
                }
                fragmentContextView.f24904x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f24904x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f31471s = false;
                org.telegram.ui.ActionBar.k6.D0().c(true);
                fragmentContextView.f24873a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
