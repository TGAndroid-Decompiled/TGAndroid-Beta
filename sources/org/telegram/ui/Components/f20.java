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
    public boolean f24560r;
    public boolean f24561s;
    public final e20 v;
    public final e20 f24562w;
    public final FragmentContextView f24563x;

    public f20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f24563x = fragmentContextView;
        this.v = new Runnable(this) {
            public final f20 f24263b;

            {
                this.f24263b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f24263b.f24563x;
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
                            fragmentContextView2.f22885y.d();
                            org.telegram.ui.ActionBar.g6.E0().c(true);
                            fragmentContextView2.f22853a.f(true);
                            return;
                        }
                        return;
                    default:
                        f20 f20Var = this.f24263b;
                        FragmentContextView fragmentContextView3 = f20Var.f24563x;
                        if (f20Var.f24560r && VoIPService.getSharedInstance() != null) {
                            f20Var.f24560r = false;
                            f20Var.f24561s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(f20Var.v, 90L);
                            try {
                                fragmentContextView3.f22885y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f24562w = new Runnable(this) {
            public final f20 f24263b;

            {
                this.f24263b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f24263b.f24563x;
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
                            fragmentContextView2.f22885y.d();
                            org.telegram.ui.ActionBar.g6.E0().c(true);
                            fragmentContextView2.f22853a.f(true);
                            return;
                        }
                        return;
                    default:
                        f20 f20Var = this.f24263b;
                        FragmentContextView fragmentContextView3 = f20Var.f24563x;
                        if (f20Var.f24560r && VoIPService.getSharedInstance() != null) {
                            f20Var.f24560r = false;
                            f20Var.f24561s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(f20Var.v, 90L);
                            try {
                                fragmentContextView3.f22885y.performHapticFeedback(3, 2);
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
        if (this.f24563x.P) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f24563x;
        int i10 = fragmentContextView.U;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        e20 e20Var = this.v;
        e20 e20Var2 = this.f24562w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(e20Var2);
            AndroidUtilities.cancelRunOnUIThread(e20Var);
            this.f24560r = false;
            this.f24561s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(e20Var2, 300L);
            this.f24560r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(e20Var);
            if (this.f24560r) {
                AndroidUtilities.cancelRunOnUIThread(e20Var2);
                this.f24560r = false;
            } else if (this.f24561s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.P(15)) {
                    if (fragmentContextView.P) {
                        fragmentContextView.E.M(0);
                    } else {
                        fragmentContextView.E.M(14);
                    }
                }
                fragmentContextView.f22885y.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f22885y.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f24561s = false;
                org.telegram.ui.ActionBar.g6.E0().c(true);
                fragmentContextView.f22853a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
