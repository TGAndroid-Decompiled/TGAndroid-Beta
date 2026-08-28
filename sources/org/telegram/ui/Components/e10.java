package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class e10 extends pi0 {
    public boolean f27894r;
    public boolean f27895s;
    public final d10 v;
    public final d10 f27896w;
    public final FragmentContextView f27897x;

    public e10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f27897x = fragmentContextView;
        this.v = new Runnable(this) {
            public final e10 f27627b;

            {
                this.f27627b = this;
            }

            @Override
            public final void run() {
                int i9;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27627b.f27897x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            mi0 mi0Var = fragmentContextView2.f26407y;
                            if (fragmentContextView2.K) {
                                i9 = 15;
                            } else {
                                i9 = 29;
                            }
                            if (mi0Var.N(i9)) {
                                if (fragmentContextView2.K) {
                                    fragmentContextView2.f26407y.K(0);
                                } else {
                                    fragmentContextView2.f26407y.K(14);
                                }
                            }
                            fragmentContextView2.f26405x.d();
                            org.telegram.ui.ActionBar.f6.D0().c(true);
                            fragmentContextView2.f26374a.f(true);
                            return;
                        }
                        return;
                    default:
                        e10 e10Var = this.f27627b;
                        FragmentContextView fragmentContextView3 = e10Var.f27897x;
                        if (e10Var.f27894r && VoIPService.getSharedInstance() != null) {
                            e10Var.f27894r = false;
                            e10Var.f27895s = true;
                            fragmentContextView3.K = false;
                            AndroidUtilities.runOnUIThread(e10Var.v, 90L);
                            try {
                                fragmentContextView3.f26405x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f27896w = new Runnable(this) {
            public final e10 f27627b;

            {
                this.f27627b = this;
            }

            @Override
            public final void run() {
                int i9;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27627b.f27897x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            mi0 mi0Var = fragmentContextView2.f26407y;
                            if (fragmentContextView2.K) {
                                i9 = 15;
                            } else {
                                i9 = 29;
                            }
                            if (mi0Var.N(i9)) {
                                if (fragmentContextView2.K) {
                                    fragmentContextView2.f26407y.K(0);
                                } else {
                                    fragmentContextView2.f26407y.K(14);
                                }
                            }
                            fragmentContextView2.f26405x.d();
                            org.telegram.ui.ActionBar.f6.D0().c(true);
                            fragmentContextView2.f26374a.f(true);
                            return;
                        }
                        return;
                    default:
                        e10 e10Var = this.f27627b;
                        FragmentContextView fragmentContextView3 = e10Var.f27897x;
                        if (e10Var.f27894r && VoIPService.getSharedInstance() != null) {
                            e10Var.f27894r = false;
                            e10Var.f27895s = true;
                            fragmentContextView3.K = false;
                            AndroidUtilities.runOnUIThread(e10Var.v, 90L);
                            try {
                                fragmentContextView3.f26405x.performHapticFeedback(3, 2);
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
        int i9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        if (this.f27897x.K) {
            i9 = R.string.VoipUnmute;
        } else {
            i9 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i9));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f27897x;
        int i9 = fragmentContextView.P;
        if (i9 != 3 && i9 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        d10 d10Var = this.v;
        d10 d10Var2 = this.f27896w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(d10Var2);
            AndroidUtilities.cancelRunOnUIThread(d10Var);
            this.f27894r = false;
            this.f27895s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(d10Var2, 300L);
            this.f27894r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(d10Var);
            if (this.f27894r) {
                AndroidUtilities.cancelRunOnUIThread(d10Var2);
                this.f27894r = false;
            } else if (this.f27895s) {
                fragmentContextView.K = true;
                if (fragmentContextView.f26407y.N(15)) {
                    if (fragmentContextView.K) {
                        fragmentContextView.f26407y.K(0);
                    } else {
                        fragmentContextView.f26407y.K(14);
                    }
                }
                fragmentContextView.f26405x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f26405x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f27895s = false;
                org.telegram.ui.ActionBar.f6.D0().c(true);
                fragmentContextView.f26374a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
