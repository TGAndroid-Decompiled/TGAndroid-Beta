package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class d20 extends ak0 {
    public boolean f27336r;
    public boolean f27337s;
    public final c20 v;
    public final c20 f27338w;
    public final FragmentContextView f27339x;

    public d20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f27339x = fragmentContextView;
        this.v = new Runnable(this) {
            public final d20 f27036b;

            {
                this.f27036b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27036b.f27339x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            xj0 xj0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (xj0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f26180y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView2.f26148a.h(true);
                            return;
                        }
                        return;
                    default:
                        d20 d20Var = this.f27036b;
                        FragmentContextView fragmentContextView3 = d20Var.f27339x;
                        if (d20Var.f27336r && VoIPService.getSharedInstance() != null) {
                            d20Var.f27336r = false;
                            d20Var.f27337s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(d20Var.v, 90L);
                            try {
                                fragmentContextView3.f26180y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f27338w = new Runnable(this) {
            public final d20 f27036b;

            {
                this.f27036b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27036b.f27339x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            xj0 xj0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (xj0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f26180y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView2.f26148a.h(true);
                            return;
                        }
                        return;
                    default:
                        d20 d20Var = this.f27036b;
                        FragmentContextView fragmentContextView3 = d20Var.f27339x;
                        if (d20Var.f27336r && VoIPService.getSharedInstance() != null) {
                            d20Var.f27336r = false;
                            d20Var.f27337s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(d20Var.v, 90L);
                            try {
                                fragmentContextView3.f26180y.performHapticFeedback(3, 2);
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
        if (this.f27339x.P) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f27339x;
        int i10 = fragmentContextView.U;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        c20 c20Var = this.v;
        c20 c20Var2 = this.f27338w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(c20Var2);
            AndroidUtilities.cancelRunOnUIThread(c20Var);
            this.f27336r = false;
            this.f27337s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(c20Var2, 300L);
            this.f27336r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(c20Var);
            if (this.f27336r) {
                AndroidUtilities.cancelRunOnUIThread(c20Var2);
                this.f27336r = false;
            } else if (this.f27337s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.P(15)) {
                    if (fragmentContextView.P) {
                        fragmentContextView.E.M(0);
                    } else {
                        fragmentContextView.E.M(14);
                    }
                }
                fragmentContextView.f26180y.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f26180y.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f27337s = false;
                org.telegram.ui.ActionBar.y6.F0().c(true);
                fragmentContextView.f26148a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
