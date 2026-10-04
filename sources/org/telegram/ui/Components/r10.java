package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class r10 extends AnimatorListenerAdapter {
    public final int f30244a;
    public final FragmentContextView f30245b;

    public r10(FragmentContextView fragmentContextView, int i10) {
        this.f30244a = i10;
        this.f30245b = fragmentContextView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30244a) {
            case 0:
                FragmentContextView fragmentContextView = this.f30245b;
                AnimatorSet animatorSet = fragmentContextView.f24167f;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fragmentContextView.setVisibility(8);
                    fragmentContextView.f24167f = null;
                    return;
                }
                return;
            case 1:
                FragmentContextView fragmentContextView2 = this.f30245b;
                AnimatorSet animatorSet2 = fragmentContextView2.f24167f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fragmentContextView2.f24167f = null;
                    return;
                }
                return;
            case 2:
                FragmentContextView fragmentContextView3 = this.f30245b;
                fragmentContextView3.f24184t0.unlock();
                AnimatorSet animatorSet3 = fragmentContextView3.f24167f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    fragmentContextView3.setVisibility(8);
                    z10 z10Var = fragmentContextView3.f24177o0;
                    if (z10Var != null) {
                        ((jr0) z10Var).a(false);
                    }
                    fragmentContextView3.f24167f = null;
                    if (fragmentContextView3.f24188w0) {
                        fragmentContextView3.e(false);
                    } else if (fragmentContextView3.f24186v0) {
                        fragmentContextView3.a(false);
                    } else if (fragmentContextView3.f24190x0) {
                        fragmentContextView3.g(false);
                    } else if (fragmentContextView3.f24192y0) {
                        fragmentContextView3.c(false);
                    }
                    fragmentContextView3.f24188w0 = false;
                    fragmentContextView3.f24186v0 = false;
                    fragmentContextView3.f24190x0 = false;
                    fragmentContextView3.f24192y0 = false;
                    return;
                }
                return;
            case 3:
                FragmentContextView fragmentContextView4 = this.f30245b;
                fragmentContextView4.f24184t0.unlock();
                AnimatorSet animatorSet4 = fragmentContextView4.f24167f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    z10 z10Var2 = fragmentContextView4.f24177o0;
                    if (z10Var2 != null) {
                        ((jr0) z10Var2).a(false);
                    }
                    fragmentContextView4.f24167f = null;
                    if (fragmentContextView4.f24188w0) {
                        fragmentContextView4.e(false);
                    } else if (fragmentContextView4.f24186v0) {
                        fragmentContextView4.a(false);
                    } else if (fragmentContextView4.f24190x0) {
                        fragmentContextView4.g(false);
                    } else if (fragmentContextView4.f24192y0) {
                        fragmentContextView4.c(false);
                    }
                    fragmentContextView4.f24188w0 = false;
                    fragmentContextView4.f24186v0 = false;
                    fragmentContextView4.f24190x0 = false;
                    fragmentContextView4.f24192y0 = false;
                    return;
                }
                return;
            case 4:
                FragmentContextView fragmentContextView5 = this.f30245b;
                fragmentContextView5.f24184t0.unlock();
                AnimatorSet animatorSet5 = fragmentContextView5.f24167f;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    fragmentContextView5.setVisibility(8);
                    fragmentContextView5.f24167f = null;
                    if (fragmentContextView5.f24188w0) {
                        fragmentContextView5.e(false);
                    } else if (fragmentContextView5.f24186v0) {
                        fragmentContextView5.a(false);
                    } else if (fragmentContextView5.f24190x0) {
                        fragmentContextView5.g(false);
                    } else if (fragmentContextView5.f24192y0) {
                        fragmentContextView5.c(false);
                    }
                    fragmentContextView5.f24188w0 = false;
                    fragmentContextView5.f24186v0 = false;
                    fragmentContextView5.f24190x0 = false;
                    fragmentContextView5.f24192y0 = false;
                    return;
                }
                return;
            case 5:
                FragmentContextView fragmentContextView6 = this.f30245b;
                fragmentContextView6.f24184t0.unlock();
                AnimatorSet animatorSet6 = fragmentContextView6.f24167f;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    z10 z10Var3 = fragmentContextView6.f24177o0;
                    if (z10Var3 != null) {
                        ((jr0) z10Var3).a(false);
                    }
                    fragmentContextView6.f24167f = null;
                    if (fragmentContextView6.f24188w0) {
                        fragmentContextView6.e(false);
                    } else if (fragmentContextView6.f24186v0) {
                        fragmentContextView6.a(false);
                    } else if (fragmentContextView6.f24190x0) {
                        fragmentContextView6.g(false);
                    } else if (fragmentContextView6.f24192y0) {
                        fragmentContextView6.c(false);
                    }
                    fragmentContextView6.f24188w0 = false;
                    fragmentContextView6.f24186v0 = false;
                    fragmentContextView6.f24190x0 = false;
                    fragmentContextView6.f24192y0 = false;
                    return;
                }
                return;
            case 6:
                FragmentContextView fragmentContextView7 = this.f30245b;
                fragmentContextView7.f24184t0.unlock();
                AnimatorSet animatorSet7 = fragmentContextView7.f24167f;
                if (animatorSet7 != null && animatorSet7.equals(animator)) {
                    fragmentContextView7.setVisibility(8);
                    fragmentContextView7.f24167f = null;
                    if (fragmentContextView7.f24188w0) {
                        fragmentContextView7.e(false);
                    } else if (fragmentContextView7.f24186v0) {
                        fragmentContextView7.a(false);
                    } else if (fragmentContextView7.f24190x0) {
                        fragmentContextView7.g(false);
                    } else if (fragmentContextView7.f24192y0) {
                        fragmentContextView7.c(false);
                    }
                    fragmentContextView7.f24188w0 = false;
                    fragmentContextView7.f24186v0 = false;
                    fragmentContextView7.f24190x0 = false;
                    fragmentContextView7.f24192y0 = false;
                    return;
                }
                return;
            case 7:
                FragmentContextView fragmentContextView8 = this.f30245b;
                fragmentContextView8.f24184t0.unlock();
                AnimatorSet animatorSet8 = fragmentContextView8.f24167f;
                if (animatorSet8 != null && animatorSet8.equals(animator)) {
                    fragmentContextView8.S = false;
                    fragmentContextView8.f24167f = null;
                    fragmentContextView8.e(false);
                    return;
                }
                return;
            case 8:
                FragmentContextView fragmentContextView9 = this.f30245b;
                fragmentContextView9.f24185u0.unlock();
                AnimatorSet animatorSet9 = fragmentContextView9.f24167f;
                if (animatorSet9 != null && animatorSet9.equals(animator)) {
                    fragmentContextView9.f24167f = null;
                }
                if (fragmentContextView9.f24188w0) {
                    fragmentContextView9.e(false);
                } else if (fragmentContextView9.f24186v0) {
                    fragmentContextView9.a(false);
                } else if (fragmentContextView9.f24190x0) {
                    fragmentContextView9.g(false);
                } else if (fragmentContextView9.f24192y0) {
                    fragmentContextView9.c(false);
                }
                fragmentContextView9.f24188w0 = false;
                fragmentContextView9.f24186v0 = false;
                fragmentContextView9.f24190x0 = false;
                fragmentContextView9.f24192y0 = false;
                fragmentContextView9.n();
                return;
            case 9:
                FragmentContextView fragmentContextView10 = this.f30245b;
                fragmentContextView10.f24184t0.unlock();
                AnimatorSet animatorSet10 = fragmentContextView10.f24167f;
                if (animatorSet10 != null && animatorSet10.equals(animator)) {
                    fragmentContextView10.setVisibility(8);
                    fragmentContextView10.f24167f = null;
                    if (fragmentContextView10.f24188w0) {
                        fragmentContextView10.e(false);
                    } else if (fragmentContextView10.f24186v0) {
                        fragmentContextView10.a(false);
                    } else if (fragmentContextView10.f24190x0) {
                        fragmentContextView10.g(false);
                    } else if (fragmentContextView10.f24192y0) {
                        fragmentContextView10.c(false);
                    }
                    fragmentContextView10.f24188w0 = false;
                    fragmentContextView10.f24186v0 = false;
                    fragmentContextView10.f24190x0 = false;
                    fragmentContextView10.f24192y0 = false;
                    return;
                }
                return;
            case 10:
                FragmentContextView fragmentContextView11 = this.f30245b;
                fragmentContextView11.f24184t0.unlock();
                AnimatorSet animatorSet11 = fragmentContextView11.f24167f;
                if (animatorSet11 != null && animatorSet11.equals(animator)) {
                    fragmentContextView11.S = false;
                    fragmentContextView11.f24167f = null;
                    fragmentContextView11.a(false);
                    return;
                }
                return;
            default:
                FragmentContextView fragmentContextView12 = this.f30245b;
                fragmentContextView12.f24185u0.unlock();
                AnimatorSet animatorSet12 = fragmentContextView12.f24167f;
                if (animatorSet12 != null && animatorSet12.equals(animator)) {
                    fragmentContextView12.f24167f = null;
                }
                if (fragmentContextView12.f24188w0) {
                    fragmentContextView12.e(false);
                } else if (fragmentContextView12.f24186v0) {
                    fragmentContextView12.a(false);
                } else if (fragmentContextView12.f24190x0) {
                    fragmentContextView12.g(false);
                } else if (fragmentContextView12.f24192y0) {
                    fragmentContextView12.c(false);
                }
                fragmentContextView12.f24188w0 = false;
                fragmentContextView12.f24186v0 = false;
                fragmentContextView12.f24190x0 = false;
                fragmentContextView12.f24192y0 = false;
                fragmentContextView12.n();
                return;
        }
    }
}
