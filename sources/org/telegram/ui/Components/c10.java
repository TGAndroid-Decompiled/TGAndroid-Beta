package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

public final class c10 extends AnimatorListenerAdapter {

    public final int f27275a;

    public final FragmentContextView f27276b;

    public c10(FragmentContextView fragmentContextView, int i10) {
        this.f27275a = i10;
        this.f27276b = fragmentContextView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27275a) {
            case 0:
                FragmentContextView fragmentContextView = this.f27276b;
                AnimatorSet animatorSet = fragmentContextView.f26379f;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fragmentContextView.setVisibility(8);
                    fragmentContextView.f26379f = null;
                    break;
                }
                break;
            case 1:
                FragmentContextView fragmentContextView2 = this.f27276b;
                AnimatorSet animatorSet2 = fragmentContextView2.f26379f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fragmentContextView2.f26379f = null;
                    break;
                }
                break;
            case 2:
                FragmentContextView fragmentContextView3 = this.f27276b;
                fragmentContextView3.f26390p0.unlock();
                AnimatorSet animatorSet3 = fragmentContextView3.f26379f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    fragmentContextView3.setVisibility(8);
                    j10 j10Var = fragmentContextView3.f26385k0;
                    if (j10Var != null) {
                        ((cq0) j10Var).a(false);
                    }
                    fragmentContextView3.f26379f = null;
                    if (fragmentContextView3.f26395s0) {
                        fragmentContextView3.e(false);
                    } else if (fragmentContextView3.f26393r0) {
                        fragmentContextView3.a(false);
                    } else if (fragmentContextView3.f26396t0) {
                        fragmentContextView3.g(false);
                    } else if (fragmentContextView3.f26397u0) {
                        fragmentContextView3.c(false);
                    }
                    fragmentContextView3.f26395s0 = false;
                    fragmentContextView3.f26393r0 = false;
                    fragmentContextView3.f26396t0 = false;
                    fragmentContextView3.f26397u0 = false;
                    break;
                }
                break;
            case 3:
                FragmentContextView fragmentContextView4 = this.f27276b;
                fragmentContextView4.f26390p0.unlock();
                AnimatorSet animatorSet4 = fragmentContextView4.f26379f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    j10 j10Var2 = fragmentContextView4.f26385k0;
                    if (j10Var2 != null) {
                        ((cq0) j10Var2).a(false);
                    }
                    fragmentContextView4.f26379f = null;
                    if (fragmentContextView4.f26395s0) {
                        fragmentContextView4.e(false);
                    } else if (fragmentContextView4.f26393r0) {
                        fragmentContextView4.a(false);
                    } else if (fragmentContextView4.f26396t0) {
                        fragmentContextView4.g(false);
                    } else if (fragmentContextView4.f26397u0) {
                        fragmentContextView4.c(false);
                    }
                    fragmentContextView4.f26395s0 = false;
                    fragmentContextView4.f26393r0 = false;
                    fragmentContextView4.f26396t0 = false;
                    fragmentContextView4.f26397u0 = false;
                    break;
                }
                break;
            case 4:
                FragmentContextView fragmentContextView5 = this.f27276b;
                fragmentContextView5.f26390p0.unlock();
                AnimatorSet animatorSet5 = fragmentContextView5.f26379f;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    fragmentContextView5.setVisibility(8);
                    fragmentContextView5.f26379f = null;
                    if (fragmentContextView5.f26395s0) {
                        fragmentContextView5.e(false);
                    } else if (fragmentContextView5.f26393r0) {
                        fragmentContextView5.a(false);
                    } else if (fragmentContextView5.f26396t0) {
                        fragmentContextView5.g(false);
                    } else if (fragmentContextView5.f26397u0) {
                        fragmentContextView5.c(false);
                    }
                    fragmentContextView5.f26395s0 = false;
                    fragmentContextView5.f26393r0 = false;
                    fragmentContextView5.f26396t0 = false;
                    fragmentContextView5.f26397u0 = false;
                    break;
                }
                break;
            case 5:
                FragmentContextView fragmentContextView6 = this.f27276b;
                fragmentContextView6.f26390p0.unlock();
                AnimatorSet animatorSet6 = fragmentContextView6.f26379f;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    j10 j10Var3 = fragmentContextView6.f26385k0;
                    if (j10Var3 != null) {
                        ((cq0) j10Var3).a(false);
                    }
                    fragmentContextView6.f26379f = null;
                    if (fragmentContextView6.f26395s0) {
                        fragmentContextView6.e(false);
                    } else if (fragmentContextView6.f26393r0) {
                        fragmentContextView6.a(false);
                    } else if (fragmentContextView6.f26396t0) {
                        fragmentContextView6.g(false);
                    } else if (fragmentContextView6.f26397u0) {
                        fragmentContextView6.c(false);
                    }
                    fragmentContextView6.f26395s0 = false;
                    fragmentContextView6.f26393r0 = false;
                    fragmentContextView6.f26396t0 = false;
                    fragmentContextView6.f26397u0 = false;
                    break;
                }
                break;
            case 6:
                FragmentContextView fragmentContextView7 = this.f27276b;
                fragmentContextView7.f26390p0.unlock();
                AnimatorSet animatorSet7 = fragmentContextView7.f26379f;
                if (animatorSet7 != null && animatorSet7.equals(animator)) {
                    fragmentContextView7.setVisibility(8);
                    fragmentContextView7.f26379f = null;
                    if (fragmentContextView7.f26395s0) {
                        fragmentContextView7.e(false);
                    } else if (fragmentContextView7.f26393r0) {
                        fragmentContextView7.a(false);
                    } else if (fragmentContextView7.f26396t0) {
                        fragmentContextView7.g(false);
                    } else if (fragmentContextView7.f26397u0) {
                        fragmentContextView7.c(false);
                    }
                    fragmentContextView7.f26395s0 = false;
                    fragmentContextView7.f26393r0 = false;
                    fragmentContextView7.f26396t0 = false;
                    fragmentContextView7.f26397u0 = false;
                    break;
                }
                break;
            case 7:
                FragmentContextView fragmentContextView8 = this.f27276b;
                fragmentContextView8.f26390p0.unlock();
                AnimatorSet animatorSet8 = fragmentContextView8.f26379f;
                if (animatorSet8 != null && animatorSet8.equals(animator)) {
                    fragmentContextView8.O = false;
                    fragmentContextView8.f26379f = null;
                    fragmentContextView8.e(false);
                    break;
                }
                break;
            case 8:
                FragmentContextView fragmentContextView9 = this.f27276b;
                fragmentContextView9.f26391q0.unlock();
                AnimatorSet animatorSet9 = fragmentContextView9.f26379f;
                if (animatorSet9 != null && animatorSet9.equals(animator)) {
                    fragmentContextView9.f26379f = null;
                }
                if (fragmentContextView9.f26395s0) {
                    fragmentContextView9.e(false);
                } else if (fragmentContextView9.f26393r0) {
                    fragmentContextView9.a(false);
                } else if (fragmentContextView9.f26396t0) {
                    fragmentContextView9.g(false);
                } else if (fragmentContextView9.f26397u0) {
                    fragmentContextView9.c(false);
                }
                fragmentContextView9.f26395s0 = false;
                fragmentContextView9.f26393r0 = false;
                fragmentContextView9.f26396t0 = false;
                fragmentContextView9.f26397u0 = false;
                fragmentContextView9.m();
                break;
            case 9:
                FragmentContextView fragmentContextView10 = this.f27276b;
                fragmentContextView10.f26390p0.unlock();
                AnimatorSet animatorSet10 = fragmentContextView10.f26379f;
                if (animatorSet10 != null && animatorSet10.equals(animator)) {
                    fragmentContextView10.setVisibility(8);
                    fragmentContextView10.f26379f = null;
                    if (fragmentContextView10.f26395s0) {
                        fragmentContextView10.e(false);
                    } else if (fragmentContextView10.f26393r0) {
                        fragmentContextView10.a(false);
                    } else if (fragmentContextView10.f26396t0) {
                        fragmentContextView10.g(false);
                    } else if (fragmentContextView10.f26397u0) {
                        fragmentContextView10.c(false);
                    }
                    fragmentContextView10.f26395s0 = false;
                    fragmentContextView10.f26393r0 = false;
                    fragmentContextView10.f26396t0 = false;
                    fragmentContextView10.f26397u0 = false;
                    break;
                }
                break;
            case 10:
                FragmentContextView fragmentContextView11 = this.f27276b;
                fragmentContextView11.f26390p0.unlock();
                AnimatorSet animatorSet11 = fragmentContextView11.f26379f;
                if (animatorSet11 != null && animatorSet11.equals(animator)) {
                    fragmentContextView11.O = false;
                    fragmentContextView11.f26379f = null;
                    fragmentContextView11.a(false);
                    break;
                }
                break;
            default:
                FragmentContextView fragmentContextView12 = this.f27276b;
                fragmentContextView12.f26391q0.unlock();
                AnimatorSet animatorSet12 = fragmentContextView12.f26379f;
                if (animatorSet12 != null && animatorSet12.equals(animator)) {
                    fragmentContextView12.f26379f = null;
                }
                if (fragmentContextView12.f26395s0) {
                    fragmentContextView12.e(false);
                } else if (fragmentContextView12.f26393r0) {
                    fragmentContextView12.a(false);
                } else if (fragmentContextView12.f26396t0) {
                    fragmentContextView12.g(false);
                } else if (fragmentContextView12.f26397u0) {
                    fragmentContextView12.c(false);
                }
                fragmentContextView12.f26395s0 = false;
                fragmentContextView12.f26393r0 = false;
                fragmentContextView12.f26396t0 = false;
                fragmentContextView12.f26397u0 = false;
                fragmentContextView12.m();
                break;
        }
    }
}
