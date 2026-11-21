package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
public final class x00 extends rh0 {
    public boolean f41941r;
    public boolean f41942s;
    public final w00 f41943w;
    public final w00 f41944x;
    public final FragmentContextView f41945y;

    public x00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f41945y = fragmentContextView;
        this.f41943w = new Runnable(this) {
            public final x00 f41610b;

            {
                this.f41610b = this;
            }

            @Override
            public final void run() {
                int i7;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f41610b.f41945y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            oh0 oh0Var = fragmentContextView2.F;
                            if (fragmentContextView2.Q) {
                                i7 = 15;
                            } else {
                                i7 = 29;
                            }
                            if (oh0Var.P(i7)) {
                                if (fragmentContextView2.Q) {
                                    fragmentContextView2.F.M(0);
                                } else {
                                    fragmentContextView2.F.M(14);
                                }
                            }
                            fragmentContextView2.E.d();
                            org.telegram.ui.ActionBar.m6.G0().c(true);
                            fragmentContextView2.f32985a.h(true);
                            return;
                        }
                        return;
                    default:
                        x00 x00Var = this.f41610b;
                        FragmentContextView fragmentContextView3 = x00Var.f41945y;
                        if (x00Var.f41941r && VoIPService.getSharedInstance() != null) {
                            x00Var.f41941r = false;
                            x00Var.f41942s = true;
                            fragmentContextView3.Q = false;
                            org.telegram.messenger.g0.h3(x00Var.f41943w, 90L);
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
        this.f41944x = new Runnable(this) {
            public final x00 f41610b;

            {
                this.f41610b = this;
            }

            @Override
            public final void run() {
                int i7;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f41610b.f41945y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            oh0 oh0Var = fragmentContextView2.F;
                            if (fragmentContextView2.Q) {
                                i7 = 15;
                            } else {
                                i7 = 29;
                            }
                            if (oh0Var.P(i7)) {
                                if (fragmentContextView2.Q) {
                                    fragmentContextView2.F.M(0);
                                } else {
                                    fragmentContextView2.F.M(14);
                                }
                            }
                            fragmentContextView2.E.d();
                            org.telegram.ui.ActionBar.m6.G0().c(true);
                            fragmentContextView2.f32985a.h(true);
                            return;
                        }
                        return;
                    default:
                        x00 x00Var = this.f41610b;
                        FragmentContextView fragmentContextView3 = x00Var.f41945y;
                        if (x00Var.f41941r && VoIPService.getSharedInstance() != null) {
                            x00Var.f41941r = false;
                            x00Var.f41942s = true;
                            fragmentContextView3.Q = false;
                            org.telegram.messenger.g0.h3(x00Var.f41943w, 90L);
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
        if (this.f41945y.Q) {
            i7 = 2131742987;
        } else {
            i7 = 2131743050;
        }
        accessibilityNodeInfo.setText(org.telegram.messenger.gd.N0(i7, null));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f41945y;
        int i7 = fragmentContextView.V;
        if (i7 != 3 && i7 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        w00 w00Var = this.f41943w;
        w00 w00Var2 = this.f41944x;
        if (sharedInstance == null) {
            org.telegram.messenger.g0.r(w00Var2);
            org.telegram.messenger.g0.r(w00Var);
            this.f41941r = false;
            this.f41942s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            org.telegram.messenger.g0.h3(w00Var2, 300L);
            this.f41941r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(w00Var);
            if (this.f41941r) {
                org.telegram.messenger.g0.r(w00Var2);
                this.f41941r = false;
            } else if (this.f41942s) {
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
                this.f41942s = false;
                org.telegram.ui.ActionBar.m6.G0().c(true);
                fragmentContextView.f32985a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
