package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class b20 extends yj0 {
    public boolean f24785r;
    public boolean f24786s;
    public final a20 v;
    public final a20 f24787w;
    public final FragmentContextView f24788x;

    public b20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f24788x = fragmentContextView;
        this.v = new Runnable(this) {
            public final b20 f24472b;

            {
                this.f24472b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f24472b.f24788x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            vj0 vj0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (vj0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f24247y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView2.f24215a.f(true);
                            return;
                        }
                        return;
                    default:
                        b20 b20Var = this.f24472b;
                        FragmentContextView fragmentContextView3 = b20Var.f24788x;
                        if (b20Var.f24785r && VoIPService.getSharedInstance() != null) {
                            b20Var.f24785r = false;
                            b20Var.f24786s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(b20Var.v, 90L);
                            try {
                                fragmentContextView3.f24247y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f24787w = new Runnable(this) {
            public final b20 f24472b;

            {
                this.f24472b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f24472b.f24788x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            vj0 vj0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (vj0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f24247y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView2.f24215a.f(true);
                            return;
                        }
                        return;
                    default:
                        b20 b20Var = this.f24472b;
                        FragmentContextView fragmentContextView3 = b20Var.f24788x;
                        if (b20Var.f24785r && VoIPService.getSharedInstance() != null) {
                            b20Var.f24785r = false;
                            b20Var.f24786s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(b20Var.v, 90L);
                            try {
                                fragmentContextView3.f24247y.performHapticFeedback(3, 2);
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
        if (this.f24788x.P) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f24788x;
        int i10 = fragmentContextView.U;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        a20 a20Var = this.v;
        a20 a20Var2 = this.f24787w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(a20Var2);
            AndroidUtilities.cancelRunOnUIThread(a20Var);
            this.f24785r = false;
            this.f24786s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(a20Var2, 300L);
            this.f24785r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(a20Var);
            if (this.f24785r) {
                AndroidUtilities.cancelRunOnUIThread(a20Var2);
                this.f24785r = false;
            } else if (this.f24786s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.P(15)) {
                    if (fragmentContextView.P) {
                        fragmentContextView.E.M(0);
                    } else {
                        fragmentContextView.E.M(14);
                    }
                }
                fragmentContextView.f24247y.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f24247y.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f24786s = false;
                org.telegram.ui.ActionBar.h6.E0().c(true);
                fragmentContextView.f24215a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
