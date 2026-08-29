package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class p10 extends aj0 {
    public boolean f31544r;
    public boolean f31545s;
    public final o10 v;
    public final o10 f31546w;
    public final FragmentContextView f31547x;

    public p10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f31547x = fragmentContextView;
        this.v = new Runnable(this) {
            public final p10 f31225b;

            {
                this.f31225b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f31225b.f31547x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            xi0 xi0Var = fragmentContextView2.f26418y;
                            if (fragmentContextView2.K) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (xi0Var.N(i10)) {
                                if (fragmentContextView2.K) {
                                    fragmentContextView2.f26418y.K(0);
                                } else {
                                    fragmentContextView2.f26418y.K(14);
                                }
                            }
                            fragmentContextView2.f26416x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView2.f26385a.f(true);
                            return;
                        }
                        return;
                    default:
                        p10 p10Var = this.f31225b;
                        FragmentContextView fragmentContextView3 = p10Var.f31547x;
                        if (p10Var.f31544r && VoIPService.getSharedInstance() != null) {
                            p10Var.f31544r = false;
                            p10Var.f31545s = true;
                            fragmentContextView3.K = false;
                            AndroidUtilities.runOnUIThread(p10Var.v, 90L);
                            try {
                                fragmentContextView3.f26416x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f31546w = new Runnable(this) {
            public final p10 f31225b;

            {
                this.f31225b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f31225b.f31547x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            xi0 xi0Var = fragmentContextView2.f26418y;
                            if (fragmentContextView2.K) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (xi0Var.N(i10)) {
                                if (fragmentContextView2.K) {
                                    fragmentContextView2.f26418y.K(0);
                                } else {
                                    fragmentContextView2.f26418y.K(14);
                                }
                            }
                            fragmentContextView2.f26416x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView2.f26385a.f(true);
                            return;
                        }
                        return;
                    default:
                        p10 p10Var = this.f31225b;
                        FragmentContextView fragmentContextView3 = p10Var.f31547x;
                        if (p10Var.f31544r && VoIPService.getSharedInstance() != null) {
                            p10Var.f31544r = false;
                            p10Var.f31545s = true;
                            fragmentContextView3.K = false;
                            AndroidUtilities.runOnUIThread(p10Var.v, 90L);
                            try {
                                fragmentContextView3.f26416x.performHapticFeedback(3, 2);
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
        if (this.f31547x.K) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f31547x;
        int i10 = fragmentContextView.P;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        o10 o10Var = this.v;
        o10 o10Var2 = this.f31546w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(o10Var2);
            AndroidUtilities.cancelRunOnUIThread(o10Var);
            this.f31544r = false;
            this.f31545s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(o10Var2, 300L);
            this.f31544r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(o10Var);
            if (this.f31544r) {
                AndroidUtilities.cancelRunOnUIThread(o10Var2);
                this.f31544r = false;
            } else if (this.f31545s) {
                fragmentContextView.K = true;
                if (fragmentContextView.f26418y.N(15)) {
                    if (fragmentContextView.K) {
                        fragmentContextView.f26418y.K(0);
                    } else {
                        fragmentContextView.f26418y.K(14);
                    }
                }
                fragmentContextView.f26416x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f26416x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f31545s = false;
                org.telegram.ui.ActionBar.g6.D0().c(true);
                fragmentContextView.f26385a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
