package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class w10 extends oj0 {
    public boolean f29790r;
    public boolean f29791s;
    public final v10 v;
    public final v10 f29792w;
    public final FragmentContextView f29793x;

    public w10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f29793x = fragmentContextView;
        this.v = new Runnable(this) {
            public final w10 f28987b;

            {
                this.f28987b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28987b.f29793x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            lj0 lj0Var = fragmentContextView2.f22309y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (lj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22309y.M(0);
                                } else {
                                    fragmentContextView2.f22309y.M(14);
                                }
                            }
                            fragmentContextView2.f22307x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView2.f22277a.f(true);
                            return;
                        }
                        return;
                    default:
                        w10 w10Var = this.f28987b;
                        FragmentContextView fragmentContextView3 = w10Var.f29793x;
                        if (w10Var.f29790r && VoIPService.getSharedInstance() != null) {
                            w10Var.f29790r = false;
                            w10Var.f29791s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(w10Var.v, 90L);
                            try {
                                fragmentContextView3.f22307x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f29792w = new Runnable(this) {
            public final w10 f28987b;

            {
                this.f28987b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28987b.f29793x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            lj0 lj0Var = fragmentContextView2.f22309y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (lj0Var.P(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f22309y.M(0);
                                } else {
                                    fragmentContextView2.f22309y.M(14);
                                }
                            }
                            fragmentContextView2.f22307x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView2.f22277a.f(true);
                            return;
                        }
                        return;
                    default:
                        w10 w10Var = this.f28987b;
                        FragmentContextView fragmentContextView3 = w10Var.f29793x;
                        if (w10Var.f29790r && VoIPService.getSharedInstance() != null) {
                            w10Var.f29790r = false;
                            w10Var.f29791s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(w10Var.v, 90L);
                            try {
                                fragmentContextView3.f22307x.performHapticFeedback(3, 2);
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
        if (this.f29793x.O) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f29793x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        v10 v10Var = this.v;
        v10 v10Var2 = this.f29792w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(v10Var2);
            AndroidUtilities.cancelRunOnUIThread(v10Var);
            this.f29790r = false;
            this.f29791s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(v10Var2, 300L);
            this.f29790r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(v10Var);
            if (this.f29790r) {
                AndroidUtilities.cancelRunOnUIThread(v10Var2);
                this.f29790r = false;
            } else if (this.f29791s) {
                fragmentContextView.O = true;
                if (fragmentContextView.f22309y.P(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.f22309y.M(0);
                    } else {
                        fragmentContextView.f22309y.M(14);
                    }
                }
                fragmentContextView.f22307x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f22307x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f29791s = false;
                org.telegram.ui.ActionBar.h6.D0().c(true);
                fragmentContextView.f22277a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
