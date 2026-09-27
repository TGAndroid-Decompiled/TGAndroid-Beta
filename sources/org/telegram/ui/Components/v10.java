package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class v10 extends nj0 {
    public boolean f29006r;
    public boolean f29007s;
    public final u10 v;
    public final u10 f29008w;
    public final FragmentContextView f29009x;

    public v10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f29009x = fragmentContextView;
        this.v = new Runnable(this) {
            public final v10 f28743b;

            {
                this.f28743b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28743b.f29009x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            kj0 kj0Var = fragmentContextView2.f22290y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (kj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22290y.M(0);
                                } else {
                                    fragmentContextView2.f22290y.M(14);
                                }
                            }
                            fragmentContextView2.f22288x.d();
                            org.telegram.ui.ActionBar.i6.D0().c(true);
                            fragmentContextView2.f22258a.f(true);
                            return;
                        }
                        return;
                    default:
                        v10 v10Var = this.f28743b;
                        FragmentContextView fragmentContextView3 = v10Var.f29009x;
                        if (v10Var.f29006r && VoIPService.getSharedInstance() != null) {
                            v10Var.f29006r = false;
                            v10Var.f29007s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(v10Var.v, 90L);
                            try {
                                fragmentContextView3.f22288x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f29008w = new Runnable(this) {
            public final v10 f28743b;

            {
                this.f28743b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28743b.f29009x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            kj0 kj0Var = fragmentContextView2.f22290y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (kj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22290y.M(0);
                                } else {
                                    fragmentContextView2.f22290y.M(14);
                                }
                            }
                            fragmentContextView2.f22288x.d();
                            org.telegram.ui.ActionBar.i6.D0().c(true);
                            fragmentContextView2.f22258a.f(true);
                            return;
                        }
                        return;
                    default:
                        v10 v10Var = this.f28743b;
                        FragmentContextView fragmentContextView3 = v10Var.f29009x;
                        if (v10Var.f29006r && VoIPService.getSharedInstance() != null) {
                            v10Var.f29006r = false;
                            v10Var.f29007s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(v10Var.v, 90L);
                            try {
                                fragmentContextView3.f22288x.performHapticFeedback(3, 2);
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
        if (this.f29009x.O) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f29009x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        u10 u10Var = this.v;
        u10 u10Var2 = this.f29008w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(u10Var2);
            AndroidUtilities.cancelRunOnUIThread(u10Var);
            this.f29006r = false;
            this.f29007s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(u10Var2, 300L);
            this.f29006r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(u10Var);
            if (this.f29006r) {
                AndroidUtilities.cancelRunOnUIThread(u10Var2);
                this.f29006r = false;
            } else if (this.f29007s) {
                fragmentContextView.O = true;
                if (fragmentContextView.f22290y.P(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.f22290y.M(0);
                    } else {
                        fragmentContextView.f22290y.M(14);
                    }
                }
                fragmentContextView.f22288x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f22288x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f29007s = false;
                org.telegram.ui.ActionBar.i6.D0().c(true);
                fragmentContextView.f22258a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
