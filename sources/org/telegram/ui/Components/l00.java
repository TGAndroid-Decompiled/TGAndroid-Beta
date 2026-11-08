package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
public final class l00 extends ch0 {
    public boolean f35469r;
    public boolean f35470s;
    public final k00 f35471w;
    public final k00 f35472x;
    public final FragmentContextView f35473y;

    public l00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f35473y = fragmentContextView;
        this.f35471w = new Runnable(this) {
            public final l00 f35153b;

            {
                this.f35153b = this;
            }

            @Override
            public final void run() {
                int i7;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f35153b.f35473y;
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
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView2.f31377a.h(true);
                            return;
                        }
                        return;
                    default:
                        l00 l00Var = this.f35153b;
                        FragmentContextView fragmentContextView3 = l00Var.f35473y;
                        if (l00Var.f35469r && VoIPService.getSharedInstance() != null) {
                            l00Var.f35469r = false;
                            l00Var.f35470s = true;
                            fragmentContextView3.P = false;
                            org.telegram.messenger.g0.i3(l00Var.f35471w, 90L);
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
        this.f35472x = new Runnable(this) {
            public final l00 f35153b;

            {
                this.f35153b = this;
            }

            @Override
            public final void run() {
                int i7;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f35153b.f35473y;
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
                            org.telegram.ui.ActionBar.k6.G0().c(true);
                            fragmentContextView2.f31377a.h(true);
                            return;
                        }
                        return;
                    default:
                        l00 l00Var = this.f35153b;
                        FragmentContextView fragmentContextView3 = l00Var.f35473y;
                        if (l00Var.f35469r && VoIPService.getSharedInstance() != null) {
                            l00Var.f35469r = false;
                            l00Var.f35470s = true;
                            fragmentContextView3.P = false;
                            org.telegram.messenger.g0.i3(l00Var.f35471w, 90L);
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
        if (this.f35473y.P) {
            i7 = 2131743233;
        } else {
            i7 = 2131743296;
        }
        accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(i7, null));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f35473y;
        int i7 = fragmentContextView.U;
        if (i7 != 3 && i7 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        k00 k00Var = this.f35471w;
        k00 k00Var2 = this.f35472x;
        if (sharedInstance == null) {
            org.telegram.messenger.g0.r(k00Var2);
            org.telegram.messenger.g0.r(k00Var);
            this.f35469r = false;
            this.f35470s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            org.telegram.messenger.g0.i3(k00Var2, 300L);
            this.f35469r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(k00Var);
            if (this.f35469r) {
                org.telegram.messenger.g0.r(k00Var2);
                this.f35469r = false;
            } else if (this.f35470s) {
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
                this.f35470s = false;
                org.telegram.ui.ActionBar.k6.G0().c(true);
                fragmentContextView.f31377a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
