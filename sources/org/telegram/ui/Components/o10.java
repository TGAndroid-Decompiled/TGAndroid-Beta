package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class o10 extends AnimatorListenerAdapter {
    public final int f27425a;
    public final FragmentContextView f27426b;

    public o10(FragmentContextView fragmentContextView, int i10) {
        this.f27425a = i10;
        this.f27426b = fragmentContextView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27425a) {
            case 0:
                FragmentContextView fragmentContextView = this.f27426b;
                AnimatorSet animatorSet = fragmentContextView.f23031f;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fragmentContextView.setVisibility(8);
                    fragmentContextView.f23031f = null;
                    return;
                }
                return;
            case 1:
                FragmentContextView fragmentContextView2 = this.f27426b;
                AnimatorSet animatorSet2 = fragmentContextView2.f23031f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fragmentContextView2.f23031f = null;
                    return;
                }
                return;
            case 2:
                FragmentContextView fragmentContextView3 = this.f27426b;
                fragmentContextView3.f23043q0.unlock();
                AnimatorSet animatorSet3 = fragmentContextView3.f23031f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    fragmentContextView3.setVisibility(8);
                    v10 v10Var = fragmentContextView3.f23038l0;
                    if (v10Var != null) {
                        ((vq0) v10Var).a(false);
                    }
                    fragmentContextView3.f23031f = null;
                    if (fragmentContextView3.f23048t0) {
                        fragmentContextView3.e(false);
                    } else if (fragmentContextView3.f23047s0) {
                        fragmentContextView3.a(false);
                    } else if (fragmentContextView3.f23049u0) {
                        fragmentContextView3.g(false);
                    } else if (fragmentContextView3.f23050v0) {
                        fragmentContextView3.c(false);
                    }
                    fragmentContextView3.f23048t0 = false;
                    fragmentContextView3.f23047s0 = false;
                    fragmentContextView3.f23049u0 = false;
                    fragmentContextView3.f23050v0 = false;
                    return;
                }
                return;
            case 3:
                FragmentContextView fragmentContextView4 = this.f27426b;
                fragmentContextView4.f23043q0.unlock();
                AnimatorSet animatorSet4 = fragmentContextView4.f23031f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    v10 v10Var2 = fragmentContextView4.f23038l0;
                    if (v10Var2 != null) {
                        ((vq0) v10Var2).a(false);
                    }
                    fragmentContextView4.f23031f = null;
                    if (fragmentContextView4.f23048t0) {
                        fragmentContextView4.e(false);
                    } else if (fragmentContextView4.f23047s0) {
                        fragmentContextView4.a(false);
                    } else if (fragmentContextView4.f23049u0) {
                        fragmentContextView4.g(false);
                    } else if (fragmentContextView4.f23050v0) {
                        fragmentContextView4.c(false);
                    }
                    fragmentContextView4.f23048t0 = false;
                    fragmentContextView4.f23047s0 = false;
                    fragmentContextView4.f23049u0 = false;
                    fragmentContextView4.f23050v0 = false;
                    return;
                }
                return;
            case 4:
                FragmentContextView fragmentContextView5 = this.f27426b;
                fragmentContextView5.f23043q0.unlock();
                AnimatorSet animatorSet5 = fragmentContextView5.f23031f;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    fragmentContextView5.setVisibility(8);
                    fragmentContextView5.f23031f = null;
                    if (fragmentContextView5.f23048t0) {
                        fragmentContextView5.e(false);
                    } else if (fragmentContextView5.f23047s0) {
                        fragmentContextView5.a(false);
                    } else if (fragmentContextView5.f23049u0) {
                        fragmentContextView5.g(false);
                    } else if (fragmentContextView5.f23050v0) {
                        fragmentContextView5.c(false);
                    }
                    fragmentContextView5.f23048t0 = false;
                    fragmentContextView5.f23047s0 = false;
                    fragmentContextView5.f23049u0 = false;
                    fragmentContextView5.f23050v0 = false;
                    return;
                }
                return;
            case 5:
                FragmentContextView fragmentContextView6 = this.f27426b;
                fragmentContextView6.f23043q0.unlock();
                AnimatorSet animatorSet6 = fragmentContextView6.f23031f;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    v10 v10Var3 = fragmentContextView6.f23038l0;
                    if (v10Var3 != null) {
                        ((vq0) v10Var3).a(false);
                    }
                    fragmentContextView6.f23031f = null;
                    if (fragmentContextView6.f23048t0) {
                        fragmentContextView6.e(false);
                    } else if (fragmentContextView6.f23047s0) {
                        fragmentContextView6.a(false);
                    } else if (fragmentContextView6.f23049u0) {
                        fragmentContextView6.g(false);
                    } else if (fragmentContextView6.f23050v0) {
                        fragmentContextView6.c(false);
                    }
                    fragmentContextView6.f23048t0 = false;
                    fragmentContextView6.f23047s0 = false;
                    fragmentContextView6.f23049u0 = false;
                    fragmentContextView6.f23050v0 = false;
                    return;
                }
                return;
            case 6:
                FragmentContextView fragmentContextView7 = this.f27426b;
                fragmentContextView7.f23043q0.unlock();
                AnimatorSet animatorSet7 = fragmentContextView7.f23031f;
                if (animatorSet7 != null && animatorSet7.equals(animator)) {
                    fragmentContextView7.setVisibility(8);
                    fragmentContextView7.f23031f = null;
                    if (fragmentContextView7.f23048t0) {
                        fragmentContextView7.e(false);
                    } else if (fragmentContextView7.f23047s0) {
                        fragmentContextView7.a(false);
                    } else if (fragmentContextView7.f23049u0) {
                        fragmentContextView7.g(false);
                    } else if (fragmentContextView7.f23050v0) {
                        fragmentContextView7.c(false);
                    }
                    fragmentContextView7.f23048t0 = false;
                    fragmentContextView7.f23047s0 = false;
                    fragmentContextView7.f23049u0 = false;
                    fragmentContextView7.f23050v0 = false;
                    return;
                }
                return;
            case 7:
                FragmentContextView fragmentContextView8 = this.f27426b;
                fragmentContextView8.f23043q0.unlock();
                AnimatorSet animatorSet8 = fragmentContextView8.f23031f;
                if (animatorSet8 != null && animatorSet8.equals(animator)) {
                    fragmentContextView8.P = false;
                    fragmentContextView8.f23031f = null;
                    fragmentContextView8.e(false);
                    return;
                }
                return;
            case 8:
                FragmentContextView fragmentContextView9 = this.f27426b;
                fragmentContextView9.f23045r0.unlock();
                AnimatorSet animatorSet9 = fragmentContextView9.f23031f;
                if (animatorSet9 != null && animatorSet9.equals(animator)) {
                    fragmentContextView9.f23031f = null;
                }
                if (fragmentContextView9.f23048t0) {
                    fragmentContextView9.e(false);
                } else if (fragmentContextView9.f23047s0) {
                    fragmentContextView9.a(false);
                } else if (fragmentContextView9.f23049u0) {
                    fragmentContextView9.g(false);
                } else if (fragmentContextView9.f23050v0) {
                    fragmentContextView9.c(false);
                }
                fragmentContextView9.f23048t0 = false;
                fragmentContextView9.f23047s0 = false;
                fragmentContextView9.f23049u0 = false;
                fragmentContextView9.f23050v0 = false;
                fragmentContextView9.m();
                return;
            case 9:
                FragmentContextView fragmentContextView10 = this.f27426b;
                fragmentContextView10.f23043q0.unlock();
                AnimatorSet animatorSet10 = fragmentContextView10.f23031f;
                if (animatorSet10 != null && animatorSet10.equals(animator)) {
                    fragmentContextView10.setVisibility(8);
                    fragmentContextView10.f23031f = null;
                    if (fragmentContextView10.f23048t0) {
                        fragmentContextView10.e(false);
                    } else if (fragmentContextView10.f23047s0) {
                        fragmentContextView10.a(false);
                    } else if (fragmentContextView10.f23049u0) {
                        fragmentContextView10.g(false);
                    } else if (fragmentContextView10.f23050v0) {
                        fragmentContextView10.c(false);
                    }
                    fragmentContextView10.f23048t0 = false;
                    fragmentContextView10.f23047s0 = false;
                    fragmentContextView10.f23049u0 = false;
                    fragmentContextView10.f23050v0 = false;
                    return;
                }
                return;
            case 10:
                FragmentContextView fragmentContextView11 = this.f27426b;
                fragmentContextView11.f23043q0.unlock();
                AnimatorSet animatorSet11 = fragmentContextView11.f23031f;
                if (animatorSet11 != null && animatorSet11.equals(animator)) {
                    fragmentContextView11.P = false;
                    fragmentContextView11.f23031f = null;
                    fragmentContextView11.a(false);
                    return;
                }
                return;
            default:
                FragmentContextView fragmentContextView12 = this.f27426b;
                fragmentContextView12.f23045r0.unlock();
                AnimatorSet animatorSet12 = fragmentContextView12.f23031f;
                if (animatorSet12 != null && animatorSet12.equals(animator)) {
                    fragmentContextView12.f23031f = null;
                }
                if (fragmentContextView12.f23048t0) {
                    fragmentContextView12.e(false);
                } else if (fragmentContextView12.f23047s0) {
                    fragmentContextView12.a(false);
                } else if (fragmentContextView12.f23049u0) {
                    fragmentContextView12.g(false);
                } else if (fragmentContextView12.f23050v0) {
                    fragmentContextView12.c(false);
                }
                fragmentContextView12.f23048t0 = false;
                fragmentContextView12.f23047s0 = false;
                fragmentContextView12.f23049u0 = false;
                fragmentContextView12.f23050v0 = false;
                fragmentContextView12.m();
                return;
        }
    }
}
