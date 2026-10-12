package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class m20 extends ik0 {
    public boolean f28363r;
    public boolean f28364s;
    public final l20 v;
    public final l20 f28365w;
    public final FragmentContextView f28366x;

    public m20(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f28366x = fragmentContextView;
        this.v = new Runnable(this) {
            public final m20 f28007b;

            {
                this.f28007b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28007b.f28366x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            fk0 fk0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (fk0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f23972y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView2.f23939a.f(true);
                            return;
                        }
                        return;
                    default:
                        m20 m20Var = this.f28007b;
                        FragmentContextView fragmentContextView3 = m20Var.f28366x;
                        if (m20Var.f28363r && VoIPService.getSharedInstance() != null) {
                            m20Var.f28363r = false;
                            m20Var.f28364s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(m20Var.v, 90L);
                            try {
                                fragmentContextView3.f23972y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f28365w = new Runnable(this) {
            public final m20 f28007b;

            {
                this.f28007b = this;
            }

            @Override
            public final void run() {
                int i10;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f28007b.f28366x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            fk0 fk0Var = fragmentContextView2.E;
                            if (fragmentContextView2.P) {
                                i10 = 15;
                            } else {
                                i10 = 29;
                            }
                            if (fk0Var.P(i10)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.f23972y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView2.f23939a.f(true);
                            return;
                        }
                        return;
                    default:
                        m20 m20Var = this.f28007b;
                        FragmentContextView fragmentContextView3 = m20Var.f28366x;
                        if (m20Var.f28363r && VoIPService.getSharedInstance() != null) {
                            m20Var.f28363r = false;
                            m20Var.f28364s = true;
                            fragmentContextView3.P = false;
                            AndroidUtilities.runOnUIThread(m20Var.v, 90L);
                            try {
                                fragmentContextView3.f23972y.performHapticFeedback(3, 2);
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
        if (this.f28366x.P) {
            i10 = R.string.VoipUnmute;
        } else {
            i10 = R.string.VoipMute;
        }
        accessibilityNodeInfo.setText(LocaleController.getString(i10));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f28366x;
        int i10 = fragmentContextView.U;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        l20 l20Var = this.v;
        l20 l20Var2 = this.f28365w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(l20Var2);
            AndroidUtilities.cancelRunOnUIThread(l20Var);
            this.f28363r = false;
            this.f28364s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(l20Var2, 300L);
            this.f28363r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(l20Var);
            if (this.f28363r) {
                AndroidUtilities.cancelRunOnUIThread(l20Var2);
                this.f28363r = false;
            } else if (this.f28364s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.P(15)) {
                    if (fragmentContextView.P) {
                        fragmentContextView.E.M(0);
                    } else {
                        fragmentContextView.E.M(14);
                    }
                }
                fragmentContextView.f23972y.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.f23972y.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f28364s = false;
                org.telegram.ui.ActionBar.h6.E0().c(true);
                fragmentContextView.f23939a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
