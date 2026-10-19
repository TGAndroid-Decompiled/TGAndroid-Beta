package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class b20 extends xj0 {
    public boolean f24778r;
    public boolean f24779s;
    public final a20 v;
    public final a20 f24780w;
    public final FragmentContextView f24781x;

    public b20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f24781x = fragmentContextView;
        this.v = new Runnable(this) {
            public final b20 f24464b;

            {
                this.f24464b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f24464b.f24781x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            uj0 uj0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (uj0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f24241y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView2.f24209a.f(true);
                            return;
                        }
                        return;
                    default:
                        b20 b20Var = this.f24464b;
                        FragmentContextView fragmentContextView3 = b20Var.f24781x;
                        if (b20Var.f24778r && VoIPService.getSharedInstance() != null) {
                            b20Var.f24778r = false;
                            b20Var.f24779s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(b20Var.v, 90L);
                            try {
                                fragmentContextView3.f24241y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f24780w = new Runnable(this) {
            public final b20 f24464b;

            {
                this.f24464b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f24464b.f24781x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            uj0 uj0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (uj0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f24241y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView2.f24209a.f(true);
                            return;
                        }
                        return;
                    default:
                        b20 b20Var = this.f24464b;
                        FragmentContextView fragmentContextView3 = b20Var.f24781x;
                        if (b20Var.f24778r && VoIPService.getSharedInstance() != null) {
                            b20Var.f24778r = false;
                            b20Var.f24779s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(b20Var.v, 90L);
                            try {
                                fragmentContextView3.f24241y.performHapticFeedback(3, 2);
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
        if (this.f24781x.P) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f24781x;
        int i10 = fragmentContextView.U;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        a20 a20Var = this.v;
        a20 a20Var2 = this.f24780w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(a20Var2);
            AndroidUtilities.cancelRunOnUIThread(a20Var);
            this.f24778r = false;
            this.f24779s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(a20Var2, 300L);
            this.f24778r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(a20Var);
            if (this.f24778r) {
                AndroidUtilities.cancelRunOnUIThread(a20Var2);
                this.f24778r = false;
            } else if (this.f24779s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.P(15)) {
                    if (fragmentContextView.P) {
                        fragmentContextView.E.M(0);
                    } else {
                        fragmentContextView.E.M(14);
                    }
                }
                fragmentContextView.f24241y.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f24241y.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f24779s = false;
                org.telegram.ui.ActionBar.h6.E0().c(true);
                fragmentContextView.f24209a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
