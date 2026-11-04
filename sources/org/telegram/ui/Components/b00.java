package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class b00 extends AnimatorListenerAdapter {
    public final int f32025a;
    public final FragmentContextView f32026b;

    public b00(FragmentContextView fragmentContextView, int i3) {
        this.f32025a = i3;
        this.f32026b = fragmentContextView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32025a) {
            case 0:
                FragmentContextView fragmentContextView = this.f32026b;
                AnimatorSet animatorSet = fragmentContextView.f31457f;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fragmentContextView.f31457f = null;
                    return;
                }
                return;
            case 1:
                FragmentContextView fragmentContextView2 = this.f32026b;
                fragmentContextView2.f31476v0.e();
                AnimatorSet animatorSet2 = fragmentContextView2.f31457f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fragmentContextView2.setVisibility(8);
                    i00 i00Var = fragmentContextView2.f31469q0;
                    if (i00Var != null) {
                        ((wo0) i00Var).b(false);
                    }
                    fragmentContextView2.f31457f = null;
                    if (fragmentContextView2.f31482y0) {
                        fragmentContextView2.e(false);
                    } else if (fragmentContextView2.f31480x0) {
                        fragmentContextView2.a(false);
                    } else if (fragmentContextView2.f31483z0) {
                        fragmentContextView2.g(false);
                    } else if (fragmentContextView2.A0) {
                        fragmentContextView2.c(false);
                    }
                    fragmentContextView2.f31482y0 = false;
                    fragmentContextView2.f31480x0 = false;
                    fragmentContextView2.f31483z0 = false;
                    fragmentContextView2.A0 = false;
                    return;
                }
                return;
            case 2:
                FragmentContextView fragmentContextView3 = this.f32026b;
                fragmentContextView3.f31476v0.e();
                AnimatorSet animatorSet3 = fragmentContextView3.f31457f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    i00 i00Var2 = fragmentContextView3.f31469q0;
                    if (i00Var2 != null) {
                        ((wo0) i00Var2).b(false);
                    }
                    fragmentContextView3.f31457f = null;
                    if (fragmentContextView3.f31482y0) {
                        fragmentContextView3.e(false);
                    } else if (fragmentContextView3.f31480x0) {
                        fragmentContextView3.a(false);
                    } else if (fragmentContextView3.f31483z0) {
                        fragmentContextView3.g(false);
                    } else if (fragmentContextView3.A0) {
                        fragmentContextView3.c(false);
                    }
                    fragmentContextView3.f31482y0 = false;
                    fragmentContextView3.f31480x0 = false;
                    fragmentContextView3.f31483z0 = false;
                    fragmentContextView3.A0 = false;
                    return;
                }
                return;
            case 3:
                FragmentContextView fragmentContextView4 = this.f32026b;
                fragmentContextView4.f31476v0.e();
                AnimatorSet animatorSet4 = fragmentContextView4.f31457f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    fragmentContextView4.setVisibility(8);
                    fragmentContextView4.f31457f = null;
                    if (fragmentContextView4.f31482y0) {
                        fragmentContextView4.e(false);
                    } else if (fragmentContextView4.f31480x0) {
                        fragmentContextView4.a(false);
                    } else if (fragmentContextView4.f31483z0) {
                        fragmentContextView4.g(false);
                    } else if (fragmentContextView4.A0) {
                        fragmentContextView4.c(false);
                    }
                    fragmentContextView4.f31482y0 = false;
                    fragmentContextView4.f31480x0 = false;
                    fragmentContextView4.f31483z0 = false;
                    fragmentContextView4.A0 = false;
                    return;
                }
                return;
            case 4:
                FragmentContextView fragmentContextView5 = this.f32026b;
                fragmentContextView5.f31476v0.e();
                AnimatorSet animatorSet5 = fragmentContextView5.f31457f;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    i00 i00Var3 = fragmentContextView5.f31469q0;
                    if (i00Var3 != null) {
                        ((wo0) i00Var3).b(false);
                    }
                    fragmentContextView5.f31457f = null;
                    if (fragmentContextView5.f31482y0) {
                        fragmentContextView5.e(false);
                    } else if (fragmentContextView5.f31480x0) {
                        fragmentContextView5.a(false);
                    } else if (fragmentContextView5.f31483z0) {
                        fragmentContextView5.g(false);
                    } else if (fragmentContextView5.A0) {
                        fragmentContextView5.c(false);
                    }
                    fragmentContextView5.f31482y0 = false;
                    fragmentContextView5.f31480x0 = false;
                    fragmentContextView5.f31483z0 = false;
                    fragmentContextView5.A0 = false;
                    return;
                }
                return;
            case 5:
                FragmentContextView fragmentContextView6 = this.f32026b;
                fragmentContextView6.f31476v0.e();
                AnimatorSet animatorSet6 = fragmentContextView6.f31457f;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    fragmentContextView6.setVisibility(8);
                    fragmentContextView6.f31457f = null;
                    if (fragmentContextView6.f31482y0) {
                        fragmentContextView6.e(false);
                    } else if (fragmentContextView6.f31480x0) {
                        fragmentContextView6.a(false);
                    } else if (fragmentContextView6.f31483z0) {
                        fragmentContextView6.g(false);
                    } else if (fragmentContextView6.A0) {
                        fragmentContextView6.c(false);
                    }
                    fragmentContextView6.f31482y0 = false;
                    fragmentContextView6.f31480x0 = false;
                    fragmentContextView6.f31483z0 = false;
                    fragmentContextView6.A0 = false;
                    return;
                }
                return;
            case 6:
                FragmentContextView fragmentContextView7 = this.f32026b;
                fragmentContextView7.f31476v0.e();
                AnimatorSet animatorSet7 = fragmentContextView7.f31457f;
                if (animatorSet7 != null && animatorSet7.equals(animator)) {
                    fragmentContextView7.U = false;
                    fragmentContextView7.f31457f = null;
                    fragmentContextView7.e(false);
                    return;
                }
                return;
            case 7:
                FragmentContextView fragmentContextView8 = this.f32026b;
                fragmentContextView8.f31478w0.e();
                AnimatorSet animatorSet8 = fragmentContextView8.f31457f;
                if (animatorSet8 != null && animatorSet8.equals(animator)) {
                    fragmentContextView8.f31457f = null;
                }
                if (fragmentContextView8.f31482y0) {
                    fragmentContextView8.e(false);
                } else if (fragmentContextView8.f31480x0) {
                    fragmentContextView8.a(false);
                } else if (fragmentContextView8.f31483z0) {
                    fragmentContextView8.g(false);
                } else if (fragmentContextView8.A0) {
                    fragmentContextView8.c(false);
                }
                fragmentContextView8.f31482y0 = false;
                fragmentContextView8.f31480x0 = false;
                fragmentContextView8.f31483z0 = false;
                fragmentContextView8.A0 = false;
                fragmentContextView8.n();
                return;
            case 8:
                FragmentContextView fragmentContextView9 = this.f32026b;
                fragmentContextView9.f31476v0.e();
                AnimatorSet animatorSet9 = fragmentContextView9.f31457f;
                if (animatorSet9 != null && animatorSet9.equals(animator)) {
                    fragmentContextView9.setVisibility(8);
                    fragmentContextView9.f31457f = null;
                    if (fragmentContextView9.f31482y0) {
                        fragmentContextView9.e(false);
                    } else if (fragmentContextView9.f31480x0) {
                        fragmentContextView9.a(false);
                    } else if (fragmentContextView9.f31483z0) {
                        fragmentContextView9.g(false);
                    } else if (fragmentContextView9.A0) {
                        fragmentContextView9.c(false);
                    }
                    fragmentContextView9.f31482y0 = false;
                    fragmentContextView9.f31480x0 = false;
                    fragmentContextView9.f31483z0 = false;
                    fragmentContextView9.A0 = false;
                    return;
                }
                return;
            case 9:
                FragmentContextView fragmentContextView10 = this.f32026b;
                fragmentContextView10.f31476v0.e();
                AnimatorSet animatorSet10 = fragmentContextView10.f31457f;
                if (animatorSet10 != null && animatorSet10.equals(animator)) {
                    fragmentContextView10.U = false;
                    fragmentContextView10.f31457f = null;
                    fragmentContextView10.a(false);
                    return;
                }
                return;
            case 10:
                FragmentContextView fragmentContextView11 = this.f32026b;
                fragmentContextView11.f31478w0.e();
                AnimatorSet animatorSet11 = fragmentContextView11.f31457f;
                if (animatorSet11 != null && animatorSet11.equals(animator)) {
                    fragmentContextView11.f31457f = null;
                }
                if (fragmentContextView11.f31482y0) {
                    fragmentContextView11.e(false);
                } else if (fragmentContextView11.f31480x0) {
                    fragmentContextView11.a(false);
                } else if (fragmentContextView11.f31483z0) {
                    fragmentContextView11.g(false);
                } else if (fragmentContextView11.A0) {
                    fragmentContextView11.c(false);
                }
                fragmentContextView11.f31482y0 = false;
                fragmentContextView11.f31480x0 = false;
                fragmentContextView11.f31483z0 = false;
                fragmentContextView11.A0 = false;
                fragmentContextView11.n();
                return;
            default:
                FragmentContextView fragmentContextView12 = this.f32026b;
                AnimatorSet animatorSet12 = fragmentContextView12.f31457f;
                if (animatorSet12 != null && animatorSet12.equals(animator)) {
                    fragmentContextView12.setVisibility(8);
                    fragmentContextView12.f31457f = null;
                    return;
                }
                return;
        }
    }
}
