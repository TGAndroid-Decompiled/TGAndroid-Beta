package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class t10 extends jj0 {
    public boolean f28863r;
    public boolean f28864s;
    public final s10 v;
    public final s10 f28865w;
    public final FragmentContextView f28866x;

    public t10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f28866x = fragmentContextView;
        this.v = new Runnable(this) {
            public final t10 f28590b;

            {
                this.f28590b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28590b.f28866x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            gj0 gj0Var = fragmentContextView2.f23055y;
                            if (fragmentContextView2.L) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (gj0Var.N(i10)) {
                                if (fragmentContextView2.L) {
                                    fragmentContextView2.f23055y.K(0);
                                } else {
                                    fragmentContextView2.f23055y.K(14);
                                }
                            }
                            fragmentContextView2.f23053x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f23023a.f(true);
                            return;
                        }
                        return;
                    default:
                        t10 t10Var = this.f28590b;
                        FragmentContextView fragmentContextView3 = t10Var.f28866x;
                        if (t10Var.f28863r && VoIPService.getSharedInstance() != null) {
                            t10Var.f28863r = false;
                            t10Var.f28864s = true;
                            fragmentContextView3.L = false;
                            AndroidUtilities.runOnUIThread(t10Var.v, 90L);
                            try {
                                fragmentContextView3.f23053x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f28865w = new Runnable(this) {
            public final t10 f28590b;

            {
                this.f28590b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28590b.f28866x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            gj0 gj0Var = fragmentContextView2.f23055y;
                            if (fragmentContextView2.L) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (gj0Var.N(i10)) {
                                if (fragmentContextView2.L) {
                                    fragmentContextView2.f23055y.K(0);
                                } else {
                                    fragmentContextView2.f23055y.K(14);
                                }
                            }
                            fragmentContextView2.f23053x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView2.f23023a.f(true);
                            return;
                        }
                        return;
                    default:
                        t10 t10Var = this.f28590b;
                        FragmentContextView fragmentContextView3 = t10Var.f28866x;
                        if (t10Var.f28863r && VoIPService.getSharedInstance() != null) {
                            t10Var.f28863r = false;
                            t10Var.f28864s = true;
                            fragmentContextView3.L = false;
                            AndroidUtilities.runOnUIThread(t10Var.v, 90L);
                            try {
                                fragmentContextView3.f23053x.performHapticFeedback(3, 2);
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
        if (this.f28866x.L) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f28866x;
        int i10 = fragmentContextView.Q;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        s10 s10Var = this.v;
        s10 s10Var2 = this.f28865w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(s10Var2);
            AndroidUtilities.cancelRunOnUIThread(s10Var);
            this.f28863r = false;
            this.f28864s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(s10Var2, 300L);
            this.f28863r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(s10Var);
            if (this.f28863r) {
                AndroidUtilities.cancelRunOnUIThread(s10Var2);
                this.f28863r = false;
            } else if (this.f28864s) {
                fragmentContextView.L = true;
                if (fragmentContextView.f23055y.N(15)) {
                    if (fragmentContextView.L) {
                        fragmentContextView.f23055y.K(0);
                    } else {
                        fragmentContextView.f23055y.K(14);
                    }
                }
                fragmentContextView.f23053x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f23053x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f28864s = false;
                org.telegram.ui.ActionBar.j6.D0().c(true);
                fragmentContextView.f23023a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
