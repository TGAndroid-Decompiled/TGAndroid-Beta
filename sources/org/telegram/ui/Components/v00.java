package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;
public final class v00 extends ph0 {
    public boolean f40461r;
    public boolean f40462s;
    public final u00 f40463w;
    public final u00 f40464x;
    public final FragmentContextView f40465y;

    public v00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.f40465y = fragmentContextView;
        this.f40463w = new Runnable(this) {
            public final v00 f40160b;

            {
                this.f40160b = this;
            }

            @Override
            public final void run() {
                int i7;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f40160b.f40465y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            mh0 mh0Var = fragmentContextView2.F;
                            if (fragmentContextView2.Q) {
                                i7 = 15;
                            } else {
                                i7 = 29;
                            }
                            if (mh0Var.P(i7)) {
                                if (fragmentContextView2.Q) {
                                    fragmentContextView2.F.M(0);
                                } else {
                                    fragmentContextView2.F.M(14);
                                }
                            }
                            fragmentContextView2.E.d();
                            org.telegram.ui.ActionBar.n6.G0().c(true);
                            fragmentContextView2.f32952a.h(true);
                            return;
                        }
                        return;
                    default:
                        v00 v00Var = this.f40160b;
                        FragmentContextView fragmentContextView3 = v00Var.f40465y;
                        if (v00Var.f40461r && VoIPService.getSharedInstance() != null) {
                            v00Var.f40461r = false;
                            v00Var.f40462s = true;
                            fragmentContextView3.Q = false;
                            org.telegram.messenger.g0.h3(v00Var.f40463w, 90L);
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
        this.f40464x = new Runnable(this) {
            public final v00 f40160b;

            {
                this.f40160b = this;
            }

            @Override
            public final void run() {
                int i7;
                switch (r2) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.f40160b.f40465y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            mh0 mh0Var = fragmentContextView2.F;
                            if (fragmentContextView2.Q) {
                                i7 = 15;
                            } else {
                                i7 = 29;
                            }
                            if (mh0Var.P(i7)) {
                                if (fragmentContextView2.Q) {
                                    fragmentContextView2.F.M(0);
                                } else {
                                    fragmentContextView2.F.M(14);
                                }
                            }
                            fragmentContextView2.E.d();
                            org.telegram.ui.ActionBar.n6.G0().c(true);
                            fragmentContextView2.f32952a.h(true);
                            return;
                        }
                        return;
                    default:
                        v00 v00Var = this.f40160b;
                        FragmentContextView fragmentContextView3 = v00Var.f40465y;
                        if (v00Var.f40461r && VoIPService.getSharedInstance() != null) {
                            v00Var.f40461r = false;
                            v00Var.f40462s = true;
                            fragmentContextView3.Q = false;
                            org.telegram.messenger.g0.h3(v00Var.f40463w, 90L);
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
        if (this.f40465y.Q) {
            i7 = 2131742993;
        } else {
            i7 = 2131743056;
        }
        accessibilityNodeInfo.setText(org.telegram.messenger.gd.M0(i7, null));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.f40465y;
        int i7 = fragmentContextView.V;
        if (i7 != 3 && i7 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        u00 u00Var = this.f40463w;
        u00 u00Var2 = this.f40464x;
        if (sharedInstance == null) {
            org.telegram.messenger.g0.r(u00Var2);
            org.telegram.messenger.g0.r(u00Var);
            this.f40461r = false;
            this.f40462s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            org.telegram.messenger.g0.h3(u00Var2, 300L);
            this.f40461r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(u00Var);
            if (this.f40461r) {
                org.telegram.messenger.g0.r(u00Var2);
                this.f40461r = false;
            } else if (this.f40462s) {
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
                this.f40462s = false;
                org.telegram.ui.ActionBar.n6.G0().c(true);
                fragmentContextView.f32952a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
