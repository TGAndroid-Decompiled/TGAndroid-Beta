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
public final class da0 implements org.telegram.messenger.bb, org.telegram.ui.ActionBar.r1, org.telegram.messenger.db, jg.b {
    public final int f44940a;
    public final sa0 f44941b;

    public da0(sa0 sa0Var, int i7) {
        this.f44940a = i7;
        this.f44941b = sa0Var;
    }

    @Override
    public void a() {
        sa0 sa0Var = this.f44941b;
        sa0Var.f49795v0 = false;
        sa0Var.L0();
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ia iaVar) {
        MotionEvent motionEvent2;
        Location location;
        int i7 = this.f44940a;
        sa0 sa0Var = this.f44941b;
        switch (i7) {
            case 0:
                sa0Var.D0();
                if (sa0Var.J != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-sa0Var.J) / 2.0f);
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
                if (sa0Var.D0 == null && sa0Var.B0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = sa0Var.f49790r0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        sa0Var.f49790r0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        sa0Var.f49790r0.playTogether(ObjectAnimator.ofFloat(sa0Var.T, View.TRANSLATION_Y, sa0Var.A0 - org.telegram.messenger.g0.L(10.0f)));
                        sa0Var.f49790r0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = sa0Var.f49790r0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        sa0Var.J = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        sa0Var.f49790r0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        sa0Var.f49790r0.playTogether(ObjectAnimator.ofFloat(sa0Var.T, View.TRANSLATION_Y, sa0Var.A0));
                        sa0Var.f49790r0.start();
                        sa0Var.P.H();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!sa0Var.E0) {
                            ImageView imageView = sa0Var.f49767a;
                            int i10 = org.telegram.ui.ActionBar.m6.ij;
                            org.telegram.ui.ActionBar.t6.s(imageView, i10, sa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            sa0Var.f49767a.setTag(Integer.valueOf(i10));
                            sa0Var.E0 = true;
                        }
                        org.telegram.messenger.fa faVar = sa0Var.E;
                        if (faVar != null && (location = sa0Var.f49802z0) != null) {
                            location.setLatitude(((org.telegram.messenger.cb) faVar.d().f13162b).f21837a);
                            sa0Var.f49802z0.setLongitude(((org.telegram.messenger.cb) sa0Var.E.d().f13162b).f21838b);
                        }
                        sa0Var.P.L(sa0Var.f49802z0);
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
        sa0 sa0Var = this.f44941b;
        int i10 = sa0Var.H0;
        if (i7 == 1) {
            sa0Var.f49787p0 = -1L;
            if (sa0Var.f49788q0) {
                sa0Var.f49788q0 = false;
                sa0Var.N0();
            }
            if (!sa0Var.M) {
                if ((i10 == 0 || i10 == 1) && sa0Var.Q.getChildCount() > 0 && (childAt = sa0Var.Q.getChildAt(0)) != null) {
                    ct ctVar = sa0Var.Q;
                    View F = ctVar.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = ctVar.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i10 == 0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-L)) {
                            fi.y4 d = sa0Var.E.d();
                            sa0Var.H = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.cb) d.f13162b, d.f13163c);
                            sa0Var.Q.w0(0, top + L, null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f44940a) {
            case 2:
                sa0 sa0Var = this.f44941b;
                if (sa0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25570b.getPackageName()));
                        sa0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                sa0 sa0Var2 = this.f44941b;
                if (sa0Var2.getParentActivity() != null) {
                    try {
                        sa0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
