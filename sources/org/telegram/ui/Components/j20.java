package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class j20 extends fk0 {
    public boolean f27560r;
    public boolean f27561s;
    public final i20 v;
    public final i20 f27562w;
    public final FragmentContextView f27563x;

    public j20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f27563x = fragmentContextView;
        this.v = new Runnable(this) {
            public final j20 f27198b;

            {
                this.f27198b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27198b.f27563x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ck0 ck0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (ck0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f24195y.d();
                            org.telegram.ui.ActionBar.i6.E0().c(true);
                            fragmentContextView2.f24162a.f(true);
                            return;
                        }
                        return;
                    default:
                        j20 j20Var = this.f27198b;
                        FragmentContextView fragmentContextView3 = j20Var.f27563x;
                        if (j20Var.f27560r && VoIPService.getSharedInstance() != null) {
                            j20Var.f27560r = false;
                            j20Var.f27561s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(j20Var.v, 90L);
                            try {
                                fragmentContextView3.f24195y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f27562w = new Runnable(this) {
            public final j20 f27198b;

            {
                this.f27198b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f27198b.f27563x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ck0 ck0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (ck0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f24195y.d();
                            org.telegram.ui.ActionBar.i6.E0().c(true);
                            fragmentContextView2.f24162a.f(true);
                            return;
                        }
                        return;
                    default:
                        j20 j20Var = this.f27198b;
                        FragmentContextView fragmentContextView3 = j20Var.f27563x;
                        if (j20Var.f27560r && VoIPService.getSharedInstance() != null) {
                            j20Var.f27560r = false;
                            j20Var.f27561s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(j20Var.v, 90L);
                            try {
                                fragmentContextView3.f24195y.performHapticFeedback(3, 2);
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
        if (this.f27563x.P) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f27563x;
        int i10 = fragmentContextView.U;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        i20 i20Var = this.v;
        i20 i20Var2 = this.f27562w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(i20Var2);
            AndroidUtilities.cancelRunOnUIThread(i20Var);
            this.f27560r = false;
            this.f27561s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(i20Var2, 300L);
            this.f27560r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(i20Var);
            if (this.f27560r) {
                AndroidUtilities.cancelRunOnUIThread(i20Var2);
                this.f27560r = false;
            } else if (this.f27561s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.P(15)) {
                    if (fragmentContextView.P) {
                        fragmentContextView.E.M(0);
                    } else {
                        fragmentContextView.E.M(14);
                    }
                }
                fragmentContextView.f24195y.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f24195y.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f27561s = false;
                org.telegram.ui.ActionBar.i6.E0().c(true);
                fragmentContextView.f24162a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
