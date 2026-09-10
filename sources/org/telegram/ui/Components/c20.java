package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class c20 extends kj0 {
    public boolean f21973r;
    public boolean f21974s;
    public final b20 v;
    public final b20 f21975w;
    public final FragmentContextView f21976x;

    public c20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f21976x = fragmentContextView;
        this.v = new Runnable(this) {
            public final c20 f21687b;

            {
                this.f21687b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f21687b.f21976x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            hj0 hj0Var = fragmentContextView2.f21150y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (hj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f21150y.M(0);
                                } else {
                                    fragmentContextView2.f21150y.M(14);
                                }
                            }
                            fragmentContextView2.f21148x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f21118a.f(true);
                            return;
                        }
                        return;
                    default:
                        c20 c20Var = this.f21687b;
                        FragmentContextView fragmentContextView3 = c20Var.f21976x;
                        if (c20Var.f21973r && VoIPService.getSharedInstance() != null) {
                            c20Var.f21973r = false;
                            c20Var.f21974s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(c20Var.v, 90L);
                            try {
                                fragmentContextView3.f21148x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f21975w = new Runnable(this) {
            public final c20 f21687b;

            {
                this.f21687b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f21687b.f21976x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            hj0 hj0Var = fragmentContextView2.f21150y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (hj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f21150y.M(0);
                                } else {
                                    fragmentContextView2.f21150y.M(14);
                                }
                            }
                            fragmentContextView2.f21148x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f21118a.f(true);
                            return;
                        }
                        return;
                    default:
                        c20 c20Var = this.f21687b;
                        FragmentContextView fragmentContextView3 = c20Var.f21976x;
                        if (c20Var.f21973r && VoIPService.getSharedInstance() != null) {
                            c20Var.f21973r = false;
                            c20Var.f21974s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(c20Var.v, 90L);
                            try {
                                fragmentContextView3.f21148x.performHapticFeedback(3, 2);
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
        if (this.f21976x.O) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f21976x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        b20 b20Var = this.v;
        b20 b20Var2 = this.f21975w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(b20Var2);
            AndroidUtilities.cancelRunOnUIThread(b20Var);
            this.f21973r = false;
            this.f21974s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(b20Var2, 300L);
            this.f21973r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(b20Var);
            if (this.f21973r) {
                AndroidUtilities.cancelRunOnUIThread(b20Var2);
                this.f21973r = false;
            } else if (this.f21974s) {
                fragmentContextView.O = true;
                if (fragmentContextView.f21150y.P(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.f21150y.M(0);
                    } else {
                        fragmentContextView.f21150y.M(14);
                    }
                }
                fragmentContextView.f21148x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f21148x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f21974s = false;
                org.telegram.ui.ActionBar.j6.D0().c(true);
                fragmentContextView.f21118a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
