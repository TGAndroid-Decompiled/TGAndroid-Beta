package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class f20 extends bk0 {
    public boolean f24865r;
    public boolean f24866s;
    public final e20 v;
    public final e20 f24867w;
    public final FragmentContextView f24868x;

    public f20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f24868x = fragmentContextView;
        this.v = new Runnable(this) {
            public final f20 f24568b;

            {
                this.f24568b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f24568b.f24868x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            yj0 yj0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (yj0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f23185y.d();
                            org.telegram.ui.ActionBar.g6.E0().c(true);
                            fragmentContextView2.f23153a.f(true);
                            return;
                        }
                        return;
                    default:
                        f20 f20Var = this.f24568b;
                        FragmentContextView fragmentContextView3 = f20Var.f24868x;
                        if (f20Var.f24865r && VoIPService.getSharedInstance() != null) {
                            f20Var.f24865r = false;
                            f20Var.f24866s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(f20Var.v, 90L);
                            try {
                                fragmentContextView3.f23185y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f24867w = new Runnable(this) {
            public final f20 f24568b;

            {
                this.f24568b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f24568b.f24868x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            yj0 yj0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (yj0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f23185y.d();
                            org.telegram.ui.ActionBar.g6.E0().c(true);
                            fragmentContextView2.f23153a.f(true);
                            return;
                        }
                        return;
                    default:
                        f20 f20Var = this.f24568b;
                        FragmentContextView fragmentContextView3 = f20Var.f24868x;
                        if (f20Var.f24865r && VoIPService.getSharedInstance() != null) {
                            f20Var.f24865r = false;
                            f20Var.f24866s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(f20Var.v, 90L);
                            try {
                                fragmentContextView3.f23185y.performHapticFeedback(3, 2);
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
        if (this.f24868x.P) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f24868x;
        int i10 = fragmentContextView.U;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        e20 e20Var = this.v;
        e20 e20Var2 = this.f24867w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(e20Var2);
            AndroidUtilities.cancelRunOnUIThread(e20Var);
            this.f24865r = false;
            this.f24866s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(e20Var2, 300L);
            this.f24865r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(e20Var);
            if (this.f24865r) {
                AndroidUtilities.cancelRunOnUIThread(e20Var2);
                this.f24865r = false;
            } else if (this.f24866s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.P(15)) {
                    if (fragmentContextView.P) {
                        fragmentContextView.E.M(0);
                    } else {
                        fragmentContextView.E.M(14);
                    }
                }
                fragmentContextView.f23185y.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f23185y.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f24866s = false;
                org.telegram.ui.ActionBar.g6.E0().c(true);
                fragmentContextView.f23153a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
