package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class d20 extends bk0 {
    public boolean f27318r;
    public boolean f27319s;
    public final c20 v;
    public final c20 f27320w;
    public final FragmentContextView f27321x;

    public d20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f27321x = fragmentContextView;
        this.v = new Runnable(this) {
            public final d20 f27034b;

            {
                this.f27034b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27034b.f27321x;
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
                            fragmentContextView2.f26184y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView2.f26152a.h(true);
                            return;
                        }
                        return;
                    default:
                        d20 d20Var = this.f27034b;
                        FragmentContextView fragmentContextView3 = d20Var.f27321x;
                        if (d20Var.f27318r && VoIPService.getSharedInstance() != null) {
                            d20Var.f27318r = false;
                            d20Var.f27319s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(d20Var.v, 90L);
                            try {
                                fragmentContextView3.f26184y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f27320w = new Runnable(this) {
            public final d20 f27034b;

            {
                this.f27034b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27034b.f27321x;
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
                            fragmentContextView2.f26184y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView2.f26152a.h(true);
                            return;
                        }
                        return;
                    default:
                        d20 d20Var = this.f27034b;
                        FragmentContextView fragmentContextView3 = d20Var.f27321x;
                        if (d20Var.f27318r && VoIPService.getSharedInstance() != null) {
                            d20Var.f27318r = false;
                            d20Var.f27319s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(d20Var.v, 90L);
                            try {
                                fragmentContextView3.f26184y.performHapticFeedback(3, 2);
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
        if (this.f27321x.P) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f27321x;
        int i10 = fragmentContextView.U;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        c20 c20Var = this.v;
        c20 c20Var2 = this.f27320w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(c20Var2);
            AndroidUtilities.cancelRunOnUIThread(c20Var);
            this.f27318r = false;
            this.f27319s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(c20Var2, 300L);
            this.f27318r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(c20Var);
            if (this.f27318r) {
                AndroidUtilities.cancelRunOnUIThread(c20Var2);
                this.f27318r = false;
            } else if (this.f27319s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.P(15)) {
                    if (fragmentContextView.P) {
                        fragmentContextView.E.M(0);
                    } else {
                        fragmentContextView.E.M(14);
                    }
                }
                fragmentContextView.f26184y.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f26184y.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f27319s = false;
                org.telegram.ui.ActionBar.y6.F0().c(true);
                fragmentContextView.f26152a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
