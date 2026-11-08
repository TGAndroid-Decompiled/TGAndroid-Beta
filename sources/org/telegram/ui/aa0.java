package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.location.Location;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
public final class aa0 implements org.telegram.messenger.bb, org.telegram.ui.ActionBar.r1, org.telegram.messenger.db, jg.b {
    public final int f43612a;
    public final pa0 f43613b;

    public aa0(pa0 pa0Var, int i7) {
        this.f43612a = i7;
        this.f43613b = pa0Var;
    }

    @Override
    public void a() {
        pa0 pa0Var = this.f43613b;
        pa0Var.f48751v0 = false;
        pa0Var.L0();
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ia iaVar) {
        MotionEvent motionEvent2;
        Location location;
        int i7 = this.f43612a;
        pa0 pa0Var = this.f43613b;
        switch (i7) {
            case 0:
                pa0Var.D0();
                if (pa0Var.J != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-pa0Var.J) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = iaVar.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (pa0Var.D0 == null && pa0Var.B0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = pa0Var.f48746r0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        pa0Var.f48746r0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        pa0Var.f48746r0.playTogether(ObjectAnimator.ofFloat(pa0Var.T, View.TRANSLATION_Y, pa0Var.A0 - org.telegram.messenger.g0.L(10.0f)));
                        pa0Var.f48746r0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = pa0Var.f48746r0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        pa0Var.J = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        pa0Var.f48746r0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        pa0Var.f48746r0.playTogether(ObjectAnimator.ofFloat(pa0Var.T, View.TRANSLATION_Y, pa0Var.A0));
                        pa0Var.f48746r0.start();
                        pa0Var.P.H();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!pa0Var.E0) {
                            ImageView imageView = pa0Var.f48723a;
                            int i10 = org.telegram.ui.ActionBar.k6.ij;
                            org.telegram.ui.ActionBar.r6.t(imageView, i10, pa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            pa0Var.f48723a.setTag(Integer.valueOf(i10));
                            pa0Var.E0 = true;
                        }
                        org.telegram.messenger.fa faVar = pa0Var.E;
                        if (faVar != null && (location = pa0Var.f48758z0) != null) {
                            location.setLatitude(((org.telegram.messenger.cb) faVar.d().f13160b).f21833a);
                            pa0Var.f48758z0.setLongitude(((org.telegram.messenger.cb) pa0Var.E.d().f13160b).f21834b);
                        }
                        pa0Var.P.L(pa0Var.f48758z0);
                    }
                }
                return iaVar.a(motionEvent).booleanValue();
        }
    }

    @Override
    public void c(int i7) {
        View childAt;
        v4.d1 T;
        int L;
        pa0 pa0Var = this.f43613b;
        int i10 = pa0Var.H0;
        if (i7 == 1) {
            pa0Var.f48743p0 = -1L;
            if (pa0Var.f48744q0) {
                pa0Var.f48744q0 = false;
                pa0Var.N0();
            }
            if (!pa0Var.M) {
                if ((i10 == 0 || i10 == 1) && pa0Var.Q.getChildCount() > 0 && (childAt = pa0Var.Q.getChildAt(0)) != null) {
                    zs zsVar = pa0Var.Q;
                    View F = zsVar.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = zsVar.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i10 == 0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-L)) {
                            fi.y4 d = pa0Var.E.d();
                            pa0Var.H = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.cb) d.f13160b, d.f13161c);
                            pa0Var.Q.w0(0, top + L, null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f43612a) {
            case 2:
                pa0 pa0Var = this.f43613b;
                if (pa0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                        pa0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                pa0 pa0Var2 = this.f43613b;
                if (pa0Var2.getParentActivity() != null) {
                    try {
                        pa0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
