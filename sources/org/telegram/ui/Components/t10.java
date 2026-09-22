package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class t10 extends nj0 {
    public boolean f28369r;
    public boolean f28370s;
    public final s10 v;
    public final s10 f28371w;
    public final FragmentContextView f28372x;

    public t10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f28372x = fragmentContextView;
        this.v = new Runnable(this) {
            public final t10 f28098b;

            {
                this.f28098b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28098b.f28372x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            kj0 kj0Var = fragmentContextView2.f22302y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (kj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22302y.M(0);
                                } else {
                                    fragmentContextView2.f22302y.M(14);
                                }
                            }
                            fragmentContextView2.f22300x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f22270a.f(true);
                            return;
                        }
                        return;
                    default:
                        t10 t10Var = this.f28098b;
                        FragmentContextView fragmentContextView3 = t10Var.f28372x;
                        if (t10Var.f28369r && VoIPService.getSharedInstance() != null) {
                            t10Var.f28369r = false;
                            t10Var.f28370s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(t10Var.v, 90L);
                            try {
                                fragmentContextView3.f22300x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f28371w = new Runnable(this) {
            public final t10 f28098b;

            {
                this.f28098b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28098b.f28372x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            kj0 kj0Var = fragmentContextView2.f22302y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (kj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22302y.M(0);
                                } else {
                                    fragmentContextView2.f22302y.M(14);
                                }
                            }
                            fragmentContextView2.f22300x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f22270a.f(true);
                            return;
                        }
                        return;
                    default:
                        t10 t10Var = this.f28098b;
                        FragmentContextView fragmentContextView3 = t10Var.f28372x;
                        if (t10Var.f28369r && VoIPService.getSharedInstance() != null) {
                            t10Var.f28369r = false;
                            t10Var.f28370s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(t10Var.v, 90L);
                            try {
                                fragmentContextView3.f22300x.performHapticFeedback(3, 2);
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
        if (this.f28372x.O) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f28372x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        s10 s10Var = this.v;
        s10 s10Var2 = this.f28371w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(s10Var2);
            AndroidUtilities.cancelRunOnUIThread(s10Var);
            this.f28369r = false;
            this.f28370s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(s10Var2, 300L);
            this.f28369r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(s10Var);
            if (this.f28369r) {
                AndroidUtilities.cancelRunOnUIThread(s10Var2);
                this.f28369r = false;
            } else if (this.f28370s) {
                fragmentContextView.O = true;
                if (fragmentContextView.f22302y.P(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.f22302y.M(0);
                    } else {
                        fragmentContextView.f22302y.M(14);
                    }
                }
                fragmentContextView.f22300x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f22300x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f28370s = false;
                org.telegram.ui.ActionBar.j6.D0().c(true);
                fragmentContextView.f22270a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
