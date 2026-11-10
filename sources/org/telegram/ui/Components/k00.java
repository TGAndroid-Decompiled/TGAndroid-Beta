package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
public final class k00 extends ch0 {
    public boolean f35129r;
    public boolean f35130s;
    public final j00 f35131w;
    public final j00 f35132x;
    public final FragmentContextView f35133y;

    public k00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f35133y = fragmentContextView;
        this.f35131w = new Runnable(this) {
            public final k00 f34809b;

            {
                this.f34809b = this;
            }

            @Override
            public final void run() {
                int i7;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f34809b.f35133y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            zg0 zg0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i7 = 15;
                            } else {
                                i7 = 29;
                            }
                            if (zg0Var.P(i7)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.D.d();
                            org.telegram.ui.ActionBar.m6.G0().c(true);
                            fragmentContextView2.f31393a.h(true);
                            return;
                        }
                        return;
                    default:
                        k00 k00Var = this.f34809b;
                        FragmentContextView fragmentContextView3 = k00Var.f35133y;
                        if (k00Var.f35129r && VoIPService.getSharedInstance() != null) {
                            k00Var.f35129r = false;
                            k00Var.f35130s = true;
                            fragmentContextView3.P = false;
                            org.telegram.messenger.g0.i3(k00Var.f35131w, 90L);
                            try {
                                fragmentContextView3.D.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f35132x = new Runnable(this) {
            public final k00 f34809b;

            {
                this.f34809b = this;
            }

            @Override
            public final void run() {
                int i7;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f34809b.f35133y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            zg0 zg0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i7 = 15;
                            } else {
                                i7 = 29;
                            }
                            if (zg0Var.P(i7)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.D.d();
                            org.telegram.ui.ActionBar.m6.G0().c(true);
                            fragmentContextView2.f31393a.h(true);
                            return;
                        }
                        return;
                    default:
                        k00 k00Var = this.f34809b;
                        FragmentContextView fragmentContextView3 = k00Var.f35133y;
                        if (k00Var.f35129r && VoIPService.getSharedInstance() != null) {
                            k00Var.f35129r = false;
                            k00Var.f35130s = true;
                            fragmentContextView3.P = false;
                            org.telegram.messenger.g0.i3(k00Var.f35131w, 90L);
                            try {
                                fragmentContextView3.D.performHapticFeedback(3, 2);
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
        if (this.f35133y.P) {
            i7 = 2131743230;
        } else {
            i7 = 2131743293;
        }
        accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(i7, null));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f35133y;
        int i7 = fragmentContextView.U;
        if (i7 != 3 && i7 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        j00 j00Var = this.f35131w;
        j00 j00Var2 = this.f35132x;
        if (sharedInstance == null) {
            org.telegram.messenger.g0.r(j00Var2);
            org.telegram.messenger.g0.r(j00Var);
            this.f35129r = false;
            this.f35130s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            org.telegram.messenger.g0.i3(j00Var2, 300L);
            this.f35129r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(j00Var);
            if (this.f35129r) {
                org.telegram.messenger.g0.r(j00Var2);
                this.f35129r = false;
            } else if (this.f35130s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.P(15)) {
                    if (fragmentContextView.P) {
                        fragmentContextView.E.M(0);
                    } else {
                        fragmentContextView.E.M(14);
                    }
                }
                fragmentContextView.D.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.D.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f35130s = false;
                org.telegram.ui.ActionBar.m6.G0().c(true);
                fragmentContextView.f31393a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
