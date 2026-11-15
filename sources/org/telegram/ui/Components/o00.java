package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
public final class o00 extends fh0 {
    public boolean f37779r;
    public boolean f37780s;
    public final n00 f37781w;
    public final n00 f37782x;
    public final FragmentContextView f37783y;

    public o00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f37783y = fragmentContextView;
        this.f37781w = new Runnable(this) {
            public final o00 f37422b;

            {
                this.f37422b = this;
            }

            @Override
            public final void run() {
                int i7;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f37422b.f37783y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ch0 ch0Var = fragmentContextView2.F;
                            if (fragmentContextView2.Q) {
                                i7 = 15;
                            } else {
                                i7 = 29;
                            }
                            if (ch0Var.P(i7)) {
                                if (fragmentContextView2.Q) {
                                    fragmentContextView2.F.M(0);
                                } else {
                                    fragmentContextView2.F.M(14);
                                }
                            }
                            fragmentContextView2.E.d();
                            org.telegram.ui.ActionBar.j6.G0().c(true);
                            fragmentContextView2.f32555a.h(true);
                            return;
                        }
                        return;
                    default:
                        o00 o00Var = this.f37422b;
                        FragmentContextView fragmentContextView3 = o00Var.f37783y;
                        if (o00Var.f37779r && VoIPService.getSharedInstance() != null) {
                            o00Var.f37779r = false;
                            o00Var.f37780s = true;
                            fragmentContextView3.Q = false;
                            org.telegram.messenger.g0.i3(o00Var.f37781w, 90L);
                            try {
                                fragmentContextView3.E.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        };
        this.f37782x = new Runnable(this) {
            public final o00 f37422b;

            {
                this.f37422b = this;
            }

            @Override
            public final void run() {
                int i7;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f37422b.f37783y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            ch0 ch0Var = fragmentContextView2.F;
                            if (fragmentContextView2.Q) {
                                i7 = 15;
                            } else {
                                i7 = 29;
                            }
                            if (ch0Var.P(i7)) {
                                if (fragmentContextView2.Q) {
                                    fragmentContextView2.F.M(0);
                                } else {
                                    fragmentContextView2.F.M(14);
                                }
                            }
                            fragmentContextView2.E.d();
                            org.telegram.ui.ActionBar.j6.G0().c(true);
                            fragmentContextView2.f32555a.h(true);
                            return;
                        }
                        return;
                    default:
                        o00 o00Var = this.f37422b;
                        FragmentContextView fragmentContextView3 = o00Var.f37783y;
                        if (o00Var.f37779r && VoIPService.getSharedInstance() != null) {
                            o00Var.f37779r = false;
                            o00Var.f37780s = true;
                            fragmentContextView3.Q = false;
                            org.telegram.messenger.g0.i3(o00Var.f37781w, 90L);
                            try {
                                fragmentContextView3.E.performHapticFeedback(3, 2);
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
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        if (this.f37783y.Q) {
            i7 = 2131743230;
        } else {
            i7 = 2131743293;
        }
        accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(i7, null));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f37783y;
        int i7 = fragmentContextView.V;
        if (i7 != 3 && i7 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        n00 n00Var = this.f37781w;
        n00 n00Var2 = this.f37782x;
        if (sharedInstance == null) {
            org.telegram.messenger.g0.r(n00Var2);
            org.telegram.messenger.g0.r(n00Var);
            this.f37779r = false;
            this.f37780s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            org.telegram.messenger.g0.i3(n00Var2, 300L);
            this.f37779r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(n00Var);
            if (this.f37779r) {
                org.telegram.messenger.g0.r(n00Var2);
                this.f37779r = false;
            } else if (this.f37780s) {
                fragmentContextView.Q = true;
                if (fragmentContextView.F.P(15)) {
                    if (fragmentContextView.Q) {
                        fragmentContextView.F.M(0);
                    } else {
                        fragmentContextView.F.M(14);
                    }
                }
                fragmentContextView.E.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.E.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.f37780s = false;
                org.telegram.ui.ActionBar.j6.G0().c(true);
                fragmentContextView.f32555a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
