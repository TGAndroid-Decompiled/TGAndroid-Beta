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
public final class ca0 implements org.telegram.messenger.bb, org.telegram.ui.ActionBar.r1, org.telegram.messenger.db, jg.b {
    public final int f44258a;
    public final ra0 f44259b;

    public ca0(ra0 ra0Var, int i7) {
        this.f44258a = i7;
        this.f44259b = ra0Var;
    }

    @Override
    public void a() {
        ra0 ra0Var = this.f44259b;
        ra0Var.f49386v0 = false;
        ra0Var.L0();
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ia iaVar) {
        MotionEvent motionEvent2;
        Location location;
        int i7 = this.f44258a;
        ra0 ra0Var = this.f44259b;
        switch (i7) {
            case 0:
                ra0Var.D0();
                if (ra0Var.J != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-ra0Var.J) / 2.0f);
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
                if (ra0Var.D0 == null && ra0Var.B0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = ra0Var.f49381r0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ra0Var.f49381r0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        ra0Var.f49381r0.playTogether(ObjectAnimator.ofFloat(ra0Var.T, View.TRANSLATION_Y, ra0Var.A0 - org.telegram.messenger.g0.L(10.0f)));
                        ra0Var.f49381r0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = ra0Var.f49381r0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        ra0Var.J = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        ra0Var.f49381r0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        ra0Var.f49381r0.playTogether(ObjectAnimator.ofFloat(ra0Var.T, View.TRANSLATION_Y, ra0Var.A0));
                        ra0Var.f49381r0.start();
                        ra0Var.P.H();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!ra0Var.E0) {
                            ImageView imageView = ra0Var.f49358a;
                            int i10 = org.telegram.ui.ActionBar.l6.ij;
                            org.telegram.ui.ActionBar.s6.s(imageView, i10, ra0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            ra0Var.f49358a.setTag(Integer.valueOf(i10));
                            ra0Var.E0 = true;
                        }
                        org.telegram.messenger.fa faVar = ra0Var.E;
                        if (faVar != null && (location = ra0Var.f49393z0) != null) {
                            location.setLatitude(((org.telegram.messenger.cb) faVar.d().f13160b).f21833a);
                            ra0Var.f49393z0.setLongitude(((org.telegram.messenger.cb) ra0Var.E.d().f13160b).f21834b);
                        }
                        ra0Var.P.L(ra0Var.f49393z0);
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
        ra0 ra0Var = this.f44259b;
        int i10 = ra0Var.H0;
        if (i7 == 1) {
            ra0Var.f49378p0 = -1L;
            if (ra0Var.f49379q0) {
                ra0Var.f49379q0 = false;
                ra0Var.N0();
            }
            if (!ra0Var.M) {
                if ((i10 == 0 || i10 == 1) && ra0Var.Q.getChildCount() > 0 && (childAt = ra0Var.Q.getChildAt(0)) != null) {
                    bt btVar = ra0Var.Q;
                    View F = btVar.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = btVar.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i10 == 0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-L)) {
                            fi.y4 d = ra0Var.E.d();
                            ra0Var.H = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.cb) d.f13160b, d.f13161c);
                            ra0Var.Q.w0(0, top + L, null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f44258a) {
            case 2:
                ra0 ra0Var = this.f44259b;
                if (ra0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                        ra0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                ra0 ra0Var2 = this.f44259b;
                if (ra0Var2.getParentActivity() != null) {
                    try {
                        ra0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
