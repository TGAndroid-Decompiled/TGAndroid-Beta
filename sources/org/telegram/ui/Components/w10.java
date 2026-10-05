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
    public boolean f32467r;
    public boolean f32468s;
    public final v10 v;
    public final v10 f32469w;
    public final FragmentContextView f32470x;

    public w10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f32470x = fragmentContextView;
        this.v = new Runnable(this) {
            public final w10 f31599b;

            {
                this.f31599b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f31599b.f32470x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            kj0 kj0Var = fragmentContextView2.f24199y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (kj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f24199y.M(0);
                                } else {
                                    fragmentContextView2.f24199y.M(14);
                                }
                            }
                            fragmentContextView2.f24197x.d();
                            org.telegram.ui.ActionBar.i6.D0().c(true);
                            fragmentContextView2.f24166a.f(true);
                            return;
                        }
                        return;
                    default:
                        w10 w10Var = this.f31599b;
                        FragmentContextView fragmentContextView3 = w10Var.f32470x;
                        if (w10Var.f32467r && VoIPService.getSharedInstance() != null) {
                            w10Var.f32467r = false;
                            w10Var.f32468s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(w10Var.v, 90L);
                            try {
                                fragmentContextView3.f24197x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f32469w = new Runnable(this) {
            public final w10 f31599b;

            {
                this.f31599b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f31599b.f32470x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            kj0 kj0Var = fragmentContextView2.f24199y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (kj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f24199y.M(0);
                                } else {
                                    fragmentContextView2.f24199y.M(14);
                                }
                            }
                            fragmentContextView2.f24197x.d();
                            org.telegram.ui.ActionBar.i6.D0().c(true);
                            fragmentContextView2.f24166a.f(true);
                            return;
                        }
                        return;
                    default:
                        w10 w10Var = this.f31599b;
                        FragmentContextView fragmentContextView3 = w10Var.f32470x;
                        if (w10Var.f32467r && VoIPService.getSharedInstance() != null) {
                            w10Var.f32467r = false;
                            w10Var.f32468s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(w10Var.v, 90L);
                            try {
                                fragmentContextView3.f24197x.performHapticFeedback(3, 2);
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
        if (this.f32470x.O) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f32470x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        v10 v10Var = this.v;
        v10 v10Var2 = this.f32469w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(v10Var2);
            AndroidUtilities.cancelRunOnUIThread(v10Var);
            this.f32467r = false;
            this.f32468s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(v10Var2, 300L);
            this.f32467r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(v10Var);
            if (this.f32467r) {
                AndroidUtilities.cancelRunOnUIThread(v10Var2);
                this.f32467r = false;
            } else if (this.f32468s) {
                fragmentContextView.O = true;
                if (fragmentContextView.f24199y.P(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.f24199y.M(0);
                    } else {
                        fragmentContextView.f24199y.M(14);
                    }
                }
                fragmentContextView.f24197x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f24197x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f32468s = false;
                org.telegram.ui.ActionBar.i6.D0().c(true);
                fragmentContextView.f24166a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
