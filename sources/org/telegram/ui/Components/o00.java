package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
public final class o00 extends fh0 {
    public boolean f37768r;
    public boolean f37769s;
    public final n00 f37770w;
    public final n00 f37771x;
    public final FragmentContextView f37772y;

    public o00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f37772y = fragmentContextView;
        this.f37770w = new Runnable(this) {
            public final o00 f37421b;

            {
                this.f37421b = this;
            }

            @Override
            public final void run() {
                int i7;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f37421b.f37772y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ch0 ch0Var = fragmentContextView2.F;
                            if (fragmentContextView2.Q) {
                                i7 = 15;
                            } else {
                                i7 = 29;
                            }
                            if (ch0Var.P(i7)) {
                                if (fragmentContextView2.Q) {
                                    fragmentContextView2.F.M(0);
                                } else {
                                    fragmentContextView2.F.M(14);
                                }
                            }
                            fragmentContextView2.E.d();
                            org.telegram.ui.ActionBar.j6.G0().c(true);
                            fragmentContextView2.f32555a.h(true);
                            return;
                        }
                        return;
                    default:
                        o00 o00Var = this.f37421b;
                        FragmentContextView fragmentContextView3 = o00Var.f37772y;
                        if (o00Var.f37768r && VoIPService.getSharedInstance() != null) {
                            o00Var.f37768r = false;
                            o00Var.f37769s = true;
                            fragmentContextView3.Q = false;
                            org.telegram.messenger.g0.i3(o00Var.f37770w, 90L);
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
        this.f37771x = new Runnable(this) {
            public final o00 f37421b;

            {
                this.f37421b = this;
            }

            @Override
            public final void run() {
                int i7;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f37421b.f37772y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ch0 ch0Var = fragmentContextView2.F;
                            if (fragmentContextView2.Q) {
                                i7 = 15;
                            } else {
                                i7 = 29;
                            }
                            if (ch0Var.P(i7)) {
                                if (fragmentContextView2.Q) {
                                    fragmentContextView2.F.M(0);
                                } else {
                                    fragmentContextView2.F.M(14);
                                }
                            }
                            fragmentContextView2.E.d();
                            org.telegram.ui.ActionBar.j6.G0().c(true);
                            fragmentContextView2.f32555a.h(true);
                            return;
                        }
                        return;
                    default:
                        o00 o00Var = this.f37421b;
                        FragmentContextView fragmentContextView3 = o00Var.f37772y;
                        if (o00Var.f37768r && VoIPService.getSharedInstance() != null) {
                            o00Var.f37768r = false;
                            o00Var.f37769s = true;
                            fragmentContextView3.Q = false;
                            org.telegram.messenger.g0.i3(o00Var.f37770w, 90L);
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
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        if (this.f37772y.Q) {
            i7 = 2131743230;
        } else {
            i7 = 2131743293;
        }
        accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(i7, null));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f37772y;
        int i7 = fragmentContextView.V;
        if (i7 != 3 && i7 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        n00 n00Var = this.f37770w;
        n00 n00Var2 = this.f37771x;
        if (sharedInstance == null) {
            org.telegram.messenger.g0.r(n00Var2);
            org.telegram.messenger.g0.r(n00Var);
            this.f37768r = false;
            this.f37769s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            org.telegram.messenger.g0.i3(n00Var2, 300L);
            this.f37768r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(n00Var);
            if (this.f37768r) {
                org.telegram.messenger.g0.r(n00Var2);
                this.f37768r = false;
            } else if (this.f37769s) {
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
                this.f37769s = false;
                org.telegram.ui.ActionBar.j6.G0().c(true);
                fragmentContextView.f32555a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
