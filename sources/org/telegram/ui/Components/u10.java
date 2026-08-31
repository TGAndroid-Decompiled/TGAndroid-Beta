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
    public boolean f31516r;
    public boolean f31517s;
    public final t10 v;
    public final t10 f31518w;
    public final FragmentContextView f31519x;

    public u10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f31519x = fragmentContextView;
        this.v = new Runnable(this) {
            public final u10 f31233b;

            {
                this.f31233b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f31233b.f31519x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ij0 ij0Var = fragmentContextView2.f24904y;
                            if (fragmentContextView2.L) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (ij0Var.N(i10)) {
                                if (fragmentContextView2.L) {
                                    fragmentContextView2.f24904y.K(0);
                                } else {
                                    fragmentContextView2.f24904y.K(14);
                                }
                            }
                            fragmentContextView2.f24902x.d();
                            org.telegram.ui.ActionBar.k6.D0().c(true);
                            fragmentContextView2.f24871a.f(true);
                            return;
                        }
                        return;
                    default:
                        u10 u10Var = this.f31233b;
                        FragmentContextView fragmentContextView3 = u10Var.f31519x;
                        if (u10Var.f31516r && VoIPService.getSharedInstance() != null) {
                            u10Var.f31516r = false;
                            u10Var.f31517s = true;
                            fragmentContextView3.L = false;
                            AndroidUtilities.runOnUIThread(u10Var.v, 90L);
                            try {
                                fragmentContextView3.f24902x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f31518w = new Runnable(this) {
            public final u10 f31233b;

            {
                this.f31233b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f31233b.f31519x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ij0 ij0Var = fragmentContextView2.f24904y;
                            if (fragmentContextView2.L) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (ij0Var.N(i10)) {
                                if (fragmentContextView2.L) {
                                    fragmentContextView2.f24904y.K(0);
                                } else {
                                    fragmentContextView2.f24904y.K(14);
                                }
                            }
                            fragmentContextView2.f24902x.d();
                            org.telegram.ui.ActionBar.k6.D0().c(true);
                            fragmentContextView2.f24871a.f(true);
                            return;
                        }
                        return;
                    default:
                        u10 u10Var = this.f31233b;
                        FragmentContextView fragmentContextView3 = u10Var.f31519x;
                        if (u10Var.f31516r && VoIPService.getSharedInstance() != null) {
                            u10Var.f31516r = false;
                            u10Var.f31517s = true;
                            fragmentContextView3.L = false;
                            AndroidUtilities.runOnUIThread(u10Var.v, 90L);
                            try {
                                fragmentContextView3.f24902x.performHapticFeedback(3, 2);
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
        if (this.f31519x.L) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f31519x;
        int i10 = fragmentContextView.Q;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t10 t10Var = this.v;
        t10 t10Var2 = this.f31518w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(t10Var2);
            AndroidUtilities.cancelRunOnUIThread(t10Var);
            this.f31516r = false;
            this.f31517s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(t10Var2, 300L);
            this.f31516r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(t10Var);
            if (this.f31516r) {
                AndroidUtilities.cancelRunOnUIThread(t10Var2);
                this.f31516r = false;
            } else if (this.f31517s) {
                fragmentContextView.L = true;
                if (fragmentContextView.f24904y.N(15)) {
                    if (fragmentContextView.L) {
                        fragmentContextView.f24904y.K(0);
                    } else {
                        fragmentContextView.f24904y.K(14);
                    }
                }
                fragmentContextView.f24902x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f24902x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f31517s = false;
                org.telegram.ui.ActionBar.k6.D0().c(true);
                fragmentContextView.f24871a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
