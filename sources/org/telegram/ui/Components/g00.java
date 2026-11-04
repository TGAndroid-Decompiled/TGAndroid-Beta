package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
public final class g00 extends fh0 {
    public boolean f33902r;
    public boolean f33903s;
    public final f00 f33904w;
    public final f00 f33905x;
    public final FragmentContextView f33906y;

    public g00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f33906y = fragmentContextView;
        this.f33904w = new Runnable(this) {
            public final g00 f33619b;

            {
                this.f33619b = this;
            }

            @Override
            public final void run() {
                int i3;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f33619b.f33906y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ch0 ch0Var = fragmentContextView2.F;
                            if (fragmentContextView2.Q) {
                                i3 = 15;
                            } else {
                                i3 = 29;
                            }
                            if (ch0Var.P(i3)) {
                                if (fragmentContextView2.Q) {
                                    fragmentContextView2.F.M(0);
                                } else {
                                    fragmentContextView2.F.M(14);
                                }
                            }
                            fragmentContextView2.E.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView2.f31448a.h(true);
                            return;
                        }
                        return;
                    default:
                        g00 g00Var = this.f33619b;
                        FragmentContextView fragmentContextView3 = g00Var.f33906y;
                        if (g00Var.f33902r && VoIPService.getSharedInstance() != null) {
                            g00Var.f33902r = false;
                            g00Var.f33903s = true;
                            fragmentContextView3.Q = false;
                            org.telegram.messenger.g0.i3(g00Var.f33904w, 90L);
                            try {
                                fragmentContextView3.E.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f33905x = new Runnable(this) {
            public final g00 f33619b;

            {
                this.f33619b = this;
            }

            @Override
            public final void run() {
                int i3;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f33619b.f33906y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ch0 ch0Var = fragmentContextView2.F;
                            if (fragmentContextView2.Q) {
                                i3 = 15;
                            } else {
                                i3 = 29;
                            }
                            if (ch0Var.P(i3)) {
                                if (fragmentContextView2.Q) {
                                    fragmentContextView2.F.M(0);
                                } else {
                                    fragmentContextView2.F.M(14);
                                }
                            }
                            fragmentContextView2.E.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView2.f31448a.h(true);
                            return;
                        }
                        return;
                    default:
                        g00 g00Var = this.f33619b;
                        FragmentContextView fragmentContextView3 = g00Var.f33906y;
                        if (g00Var.f33902r && VoIPService.getSharedInstance() != null) {
                            g00Var.f33902r = false;
                            g00Var.f33903s = true;
                            fragmentContextView3.Q = false;
                            org.telegram.messenger.g0.i3(g00Var.f33904w, 90L);
                            try {
                                fragmentContextView3.E.performHapticFeedback(3, 2);
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
        int i3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        if (this.f33906y.Q) {
            i3 = 2131743240;
        } else {
            i3 = 2131743303;
        }
        accessibilityNodeInfo.setText(org.telegram.messenger.bd.M0(i3, null));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f33906y;
        int i3 = fragmentContextView.V;
        if (i3 != 3 && i3 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        f00 f00Var = this.f33904w;
        f00 f00Var2 = this.f33905x;
        if (sharedInstance == null) {
            org.telegram.messenger.g0.r(f00Var2);
            org.telegram.messenger.g0.r(f00Var);
            this.f33902r = false;
            this.f33903s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            org.telegram.messenger.g0.i3(f00Var2, 300L);
            this.f33902r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(f00Var);
            if (this.f33902r) {
                org.telegram.messenger.g0.r(f00Var2);
                this.f33902r = false;
            } else if (this.f33903s) {
                fragmentContextView.Q = true;
                if (fragmentContextView.F.P(15)) {
                    if (fragmentContextView.Q) {
                        fragmentContextView.F.M(0);
                    } else {
                        fragmentContextView.F.M(14);
                    }
                }
                fragmentContextView.E.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.E.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f33903s = false;
                org.telegram.ui.ActionBar.k6.G0().c(true);
                fragmentContextView.f31448a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
