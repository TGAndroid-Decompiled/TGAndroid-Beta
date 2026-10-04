package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class w10 extends nj0 {
    public boolean f32431r;
    public boolean f32432s;
    public final v10 v;
    public final v10 f32433w;
    public final FragmentContextView f32434x;

    public w10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f32434x = fragmentContextView;
        this.v = new Runnable(this) {
            public final w10 f31497b;

            {
                this.f31497b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f31497b.f32434x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            kj0 kj0Var = fragmentContextView2.f24191y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (kj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f24191y.M(0);
                                } else {
                                    fragmentContextView2.f24191y.M(14);
                                }
                            }
                            fragmentContextView2.f24189x.d();
                            org.telegram.ui.ActionBar.i6.D0().c(true);
                            fragmentContextView2.f24158a.f(true);
                            return;
                        }
                        return;
                    default:
                        w10 w10Var = this.f31497b;
                        FragmentContextView fragmentContextView3 = w10Var.f32434x;
                        if (w10Var.f32431r && VoIPService.getSharedInstance() != null) {
                            w10Var.f32431r = false;
                            w10Var.f32432s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(w10Var.v, 90L);
                            try {
                                fragmentContextView3.f24189x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f32433w = new Runnable(this) {
            public final w10 f31497b;

            {
                this.f31497b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f31497b.f32434x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            kj0 kj0Var = fragmentContextView2.f24191y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (kj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f24191y.M(0);
                                } else {
                                    fragmentContextView2.f24191y.M(14);
                                }
                            }
                            fragmentContextView2.f24189x.d();
                            org.telegram.ui.ActionBar.i6.D0().c(true);
                            fragmentContextView2.f24158a.f(true);
                            return;
                        }
                        return;
                    default:
                        w10 w10Var = this.f31497b;
                        FragmentContextView fragmentContextView3 = w10Var.f32434x;
                        if (w10Var.f32431r && VoIPService.getSharedInstance() != null) {
                            w10Var.f32431r = false;
                            w10Var.f32432s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(w10Var.v, 90L);
                            try {
                                fragmentContextView3.f24189x.performHapticFeedback(3, 2);
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
        if (this.f32434x.O) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f32434x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        v10 v10Var = this.v;
        v10 v10Var2 = this.f32433w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(v10Var2);
            AndroidUtilities.cancelRunOnUIThread(v10Var);
            this.f32431r = false;
            this.f32432s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(v10Var2, 300L);
            this.f32431r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(v10Var);
            if (this.f32431r) {
                AndroidUtilities.cancelRunOnUIThread(v10Var2);
                this.f32431r = false;
            } else if (this.f32432s) {
                fragmentContextView.O = true;
                if (fragmentContextView.f24191y.P(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.f24191y.M(0);
                    } else {
                        fragmentContextView.f24191y.M(14);
                    }
                }
                fragmentContextView.f24189x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f24189x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f32432s = false;
                org.telegram.ui.ActionBar.i6.D0().c(true);
                fragmentContextView.f24158a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
