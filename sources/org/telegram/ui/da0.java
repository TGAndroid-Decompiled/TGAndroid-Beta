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
public final class da0 implements org.telegram.messenger.za, org.telegram.messenger.pa, org.telegram.ui.ActionBar.q1, org.telegram.messenger.bb, jg.b {
    public final int f46904a;
    public final qa0 f46905b;

    public da0(qa0 qa0Var, int i7) {
        this.f46904a = i7;
        this.f46905b = qa0Var;
    }

    @Override
    public void a() {
        qa0 qa0Var = this.f46905b;
        qa0Var.f51182w0 = false;
        qa0Var.O0();
    }

    @Override
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ga gaVar) {
        MotionEvent motionEvent2;
        Location location;
        int i7 = this.f46904a;
        qa0 qa0Var = this.f46905b;
        switch (i7) {
            case 0:
                qa0Var.D0();
                if (qa0Var.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-qa0Var.K) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = gaVar.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (qa0Var.J0 == null && qa0Var.H0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = qa0Var.f51177s0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        qa0Var.f51177s0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        qa0Var.f51177s0.playTogether(ObjectAnimator.ofFloat(qa0Var.U, View.TRANSLATION_Y, qa0Var.B0 - org.telegram.messenger.g0.L(10.0f)));
                        qa0Var.f51177s0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = qa0Var.f51177s0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        qa0Var.K = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        qa0Var.f51177s0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        qa0Var.f51177s0.playTogether(ObjectAnimator.ofFloat(qa0Var.U, View.TRANSLATION_Y, qa0Var.B0));
                        qa0Var.f51177s0.start();
                        qa0Var.Q.H();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!qa0Var.K0) {
                            ImageView imageView = qa0Var.f51152a;
                            int i10 = org.telegram.ui.ActionBar.m6.lj;
                            org.telegram.ui.ActionBar.t6.s(imageView, i10, qa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            qa0Var.f51152a.setTag(Integer.valueOf(i10));
                            qa0Var.K0 = true;
                        }
                        org.telegram.messenger.da daVar = qa0Var.F;
                        if (daVar != null && (location = qa0Var.A0) != null) {
                            location.setLatitude(((org.telegram.messenger.ab) daVar.d().f15536b).f22879a);
                            qa0Var.A0.setLongitude(((org.telegram.messenger.ab) qa0Var.F.d().f15536b).f22880b);
                        }
                        qa0Var.Q.L(qa0Var.A0);
                    }
                }
                return gaVar.a(motionEvent).booleanValue();
        }
    }

    @Override
    public void c(int i7) {
        View childAt;
        v4.f1 T;
        int L;
        qa0 qa0Var = this.f46905b;
        int i10 = qa0Var.N0;
        if (i7 == 1) {
            qa0Var.f51173q0 = -1L;
            if (qa0Var.f51175r0) {
                qa0Var.f51175r0 = false;
                qa0Var.R0();
            }
            if (!qa0Var.N) {
                if ((i10 == 0 || i10 == 1) && qa0Var.R.getChildCount() > 0 && (childAt = qa0Var.R.getChildAt(0)) != null) {
                    et etVar = qa0Var.R;
                    View F = etVar.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = etVar.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i10 == 0) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.g0.L(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-L)) {
                            hi.u4 d = qa0Var.F.d();
                            qa0Var.I = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.ab) d.f15536b, d.f15537c);
                            qa0Var.R.w0(0, top + L, null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f46904a) {
            case 4:
                qa0 qa0Var = this.f46905b;
                if (qa0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26941b.getPackageName()));
                        qa0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                qa0 qa0Var2 = this.f46905b;
                if (qa0Var2.getParentActivity() != null) {
                    try {
                        qa0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        qa0 qa0Var = this.f46905b;
        qa0Var.E0(location);
        qa0Var.getLocationController().n(location, qa0Var.f51168l0);
        qa0Var.f51168l0 = false;
    }
}
