package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
public final class y00 extends fi0 {
    public boolean f32679r;
    public boolean f32680s;
    public final x00 f32681w;
    public final x00 f32682x;
    public final FragmentContextView f32683y;

    public y00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f32683y = fragmentContextView;
        this.f32681w = new Runnable(this) {
            public final y00 f32353b;

            {
                this.f32353b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f32353b.f32683y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ci0 ci0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (ci0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView2.f24031a.h(true);
                            return;
                        }
                        return;
                    default:
                        y00 y00Var = this.f32353b;
                        FragmentContextView fragmentContextView3 = y00Var.f32683y;
                        if (y00Var.f32679r && VoIPService.getSharedInstance() != null) {
                            y00Var.f32679r = false;
                            y00Var.f32680s = true;
                            fragmentContextView3.P = false;
                            org.telegram.messenger.i0.h3(y00Var.f32681w, 90L);
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
        this.f32682x = new Runnable(this) {
            public final y00 f32353b;

            {
                this.f32353b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f32353b.f32683y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ci0 ci0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (ci0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView2.f24031a.h(true);
                            return;
                        }
                        return;
                    default:
                        y00 y00Var = this.f32353b;
                        FragmentContextView fragmentContextView3 = y00Var.f32683y;
                        if (y00Var.f32679r && VoIPService.getSharedInstance() != null) {
                            y00Var.f32679r = false;
                            y00Var.f32680s = true;
                            fragmentContextView3.P = false;
                            org.telegram.messenger.i0.h3(y00Var.f32681w, 90L);
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
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        if (this.f32683y.P) {
            i10 = 2131743256;
        } else {
            i10 = 2131743319;
        }
        accessibilityNodeInfo.setText(org.telegram.messenger.dd.L0(i10, null));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f32683y;
        int i10 = fragmentContextView.U;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        x00 x00Var = this.f32681w;
        x00 x00Var2 = this.f32682x;
        if (sharedInstance == null) {
            org.telegram.messenger.i0.r(x00Var2);
            org.telegram.messenger.i0.r(x00Var);
            this.f32679r = false;
            this.f32680s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            org.telegram.messenger.i0.h3(x00Var2, 300L);
            this.f32679r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.i0.r(x00Var);
            if (this.f32679r) {
                org.telegram.messenger.i0.r(x00Var2);
                this.f32679r = false;
            } else if (this.f32680s) {
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
                this.f32680s = false;
                org.telegram.ui.ActionBar.t6.G0().c(true);
                fragmentContextView.f24031a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
