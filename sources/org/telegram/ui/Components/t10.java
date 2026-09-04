package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class t10 extends aj0 {
    public boolean f30494r;
    public boolean f30495s;
    public final s10 v;
    public final s10 f30496w;
    public final FragmentContextView f30497x;

    public t10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f30497x = fragmentContextView;
        this.v = new Runnable(this) {
            public final t10 f30163b;

            {
                this.f30163b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f30163b.f30497x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            xi0 xi0Var = fragmentContextView2.f24005y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (xi0Var.N(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f24005y.K(0);
                                } else {
                                    fragmentContextView2.f24005y.K(14);
                                }
                            }
                            fragmentContextView2.f24003x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f23972a.f(true);
                            return;
                        }
                        return;
                    default:
                        t10 t10Var = this.f30163b;
                        FragmentContextView fragmentContextView3 = t10Var.f30497x;
                        if (t10Var.f30494r && VoIPService.getSharedInstance() != null) {
                            t10Var.f30494r = false;
                            t10Var.f30495s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(t10Var.v, 90L);
                            try {
                                fragmentContextView3.f24003x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f30496w = new Runnable(this) {
            public final t10 f30163b;

            {
                this.f30163b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f30163b.f30497x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            xi0 xi0Var = fragmentContextView2.f24005y;
                            if (fragmentContextView2.O) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (xi0Var.N(i10)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.f24005y.K(0);
                                } else {
                                    fragmentContextView2.f24005y.K(14);
                                }
                            }
                            fragmentContextView2.f24003x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f23972a.f(true);
                            return;
                        }
                        return;
                    default:
                        t10 t10Var = this.f30163b;
                        FragmentContextView fragmentContextView3 = t10Var.f30497x;
                        if (t10Var.f30494r && VoIPService.getSharedInstance() != null) {
                            t10Var.f30494r = false;
                            t10Var.f30495s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(t10Var.v, 90L);
                            try {
                                fragmentContextView3.f24003x.performHapticFeedback(3, 2);
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
        if (this.f30497x.O) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f30497x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        s10 s10Var = this.v;
        s10 s10Var2 = this.f30496w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(s10Var2);
            AndroidUtilities.cancelRunOnUIThread(s10Var);
            this.f30494r = false;
            this.f30495s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(s10Var2, 300L);
            this.f30494r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(s10Var);
            if (this.f30494r) {
                AndroidUtilities.cancelRunOnUIThread(s10Var2);
                this.f30494r = false;
            } else if (this.f30495s) {
                fragmentContextView.O = true;
                if (fragmentContextView.f24005y.N(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.f24005y.K(0);
                    } else {
                        fragmentContextView.f24005y.K(14);
                    }
                }
                fragmentContextView.f24003x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f24003x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f30495s = false;
                org.telegram.ui.ActionBar.j6.D0().c(true);
                fragmentContextView.f23972a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
