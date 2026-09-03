package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class u10 extends jj0 {
    public boolean f29076r;
    public boolean f29077s;
    public final t10 v;
    public final t10 f29078w;
    public final FragmentContextView f29079x;

    public u10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f29079x = fragmentContextView;
        this.v = new Runnable(this) {
            public final u10 f28867b;

            {
                this.f28867b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28867b.f29079x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            gj0 gj0Var = fragmentContextView2.f23028y;
                            if (fragmentContextView2.L) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (gj0Var.N(i10)) {
                                if (fragmentContextView2.L) {
                                    fragmentContextView2.f23028y.K(0);
                                } else {
                                    fragmentContextView2.f23028y.K(14);
                                }
                            }
                            fragmentContextView2.f23026x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f22996a.f(true);
                            return;
                        }
                        return;
                    default:
                        u10 u10Var = this.f28867b;
                        FragmentContextView fragmentContextView3 = u10Var.f29079x;
                        if (u10Var.f29076r && VoIPService.getSharedInstance() != null) {
                            u10Var.f29076r = false;
                            u10Var.f29077s = true;
                            fragmentContextView3.L = false;
                            AndroidUtilities.runOnUIThread(u10Var.v, 90L);
                            try {
                                fragmentContextView3.f23026x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f29078w = new Runnable(this) {
            public final u10 f28867b;

            {
                this.f28867b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28867b.f29079x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            gj0 gj0Var = fragmentContextView2.f23028y;
                            if (fragmentContextView2.L) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (gj0Var.N(i10)) {
                                if (fragmentContextView2.L) {
                                    fragmentContextView2.f23028y.K(0);
                                } else {
                                    fragmentContextView2.f23028y.K(14);
                                }
                            }
                            fragmentContextView2.f23026x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f22996a.f(true);
                            return;
                        }
                        return;
                    default:
                        u10 u10Var = this.f28867b;
                        FragmentContextView fragmentContextView3 = u10Var.f29079x;
                        if (u10Var.f29076r && VoIPService.getSharedInstance() != null) {
                            u10Var.f29076r = false;
                            u10Var.f29077s = true;
                            fragmentContextView3.L = false;
                            AndroidUtilities.runOnUIThread(u10Var.v, 90L);
                            try {
                                fragmentContextView3.f23026x.performHapticFeedback(3, 2);
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
        if (this.f29079x.L) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f29079x;
        int i10 = fragmentContextView.Q;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t10 t10Var = this.v;
        t10 t10Var2 = this.f29078w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(t10Var2);
            AndroidUtilities.cancelRunOnUIThread(t10Var);
            this.f29076r = false;
            this.f29077s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(t10Var2, 300L);
            this.f29076r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(t10Var);
            if (this.f29076r) {
                AndroidUtilities.cancelRunOnUIThread(t10Var2);
                this.f29076r = false;
            } else if (this.f29077s) {
                fragmentContextView.L = true;
                if (fragmentContextView.f23028y.N(15)) {
                    if (fragmentContextView.L) {
                        fragmentContextView.f23028y.K(0);
                    } else {
                        fragmentContextView.f23028y.K(14);
                    }
                }
                fragmentContextView.f23026x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f23026x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f29077s = false;
                org.telegram.ui.ActionBar.j6.D0().c(true);
                fragmentContextView.f22996a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
