package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class uk implements org.telegram.ui.ActionBar.r0, gg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.a2 {
    public final int f31392a;
    public final jl f31393b;

    public uk(jl jlVar, int i10) {
        this.f31392a = i10;
        this.f31393b = jlVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f31392a) {
            case 1:
                jl jlVar = this.f31393b;
                ArrayList arrayList2 = jlVar.f27813e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((il) arrayList2.get(i10)).f27440b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(jlVar.T(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f27439a = i11;
                            IMapsProvider.IMarker addMarker = jlVar.H.addMarker(position);
                            obj.f27440b = addMarker;
                            obj.f27441c = tL_messageMediaVenue;
                            addMarker.setTag(obj);
                            arrayList2.add(obj);
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    return;
                }
                return;
            default:
                jl jlVar2 = this.f31393b;
                jlVar2.f27822n0 = false;
                jlVar2.f0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        jl.R(this.f31393b);
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f31393b.H;
        if (iMap != null) {
            if (i10 == 2) {
                iMap.setMapType(0);
            } else if (i10 == 3) {
                iMap.setMapType(1);
            } else if (i10 == 4) {
                iMap.setMapType(2);
            }
        }
    }

    @Override
    public void onCameraMoveStarted(int i10) {
        View childAt;
        s4.c1 T;
        int dp;
        jl jlVar = this.f31393b;
        ai.w0 w0Var = jlVar.P;
        if (i10 == 1) {
            jlVar.d0(true);
            if (jlVar.f27815g0 != null) {
                jlVar.S.setVisibility(0);
                gl glVar = jlVar.F;
                IMapsProvider.IMarker iMarker = jlVar.f27815g0;
                HashMap hashMap = glVar.f26888a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    glVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                jlVar.f27815g0 = null;
                jlVar.f27816h0 = null;
                jlVar.f27817i0 = null;
            }
            if (!jlVar.L && w0Var.getChildCount() > 0 && (childAt = w0Var.getChildAt(0)) != null) {
                View F = w0Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = w0Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (jlVar.f27838y0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = jlVar.H.getCameraPosition();
                        jlVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                        w0Var.w0(0, top + dp, null);
                    }
                }
            }
        }
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        jl jlVar = this.f31393b;
        ImageView imageView = jlVar.f27821n;
        if (iMarker.getTag() instanceof il) {
            jlVar.S.setVisibility(4);
            if (!jlVar.f27831u0) {
                int i14 = org.telegram.ui.ActionBar.i6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i14, jlVar.f29647a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i14));
                jlVar.f27831u0 = true;
            }
            gl glVar = jlVar.F;
            glVar.getClass();
            HashMap hashMap = glVar.f26888a;
            il ilVar = (il) iMarker.getTag();
            jl jlVar2 = glVar.f26889b;
            il ilVar2 = jlVar2.f27816h0;
            org.telegram.ui.ActionBar.d6 d6Var = jlVar2.f29647a;
            if (ilVar2 != ilVar) {
                jlVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = jlVar2.f27815g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        glVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    jlVar2.f27815g0 = null;
                }
                jlVar2.f27816h0 = ilVar;
                jlVar2.f27815g0 = iMarker;
                Context context = glVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                glVar.addView(frameLayout, w7.z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                jlVar2.f27817i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                jlVar2.f27817i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20894h5, d6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(jlVar2.f27817i0, w7.z5.c(71.0f, -2));
                jlVar2.f27817i0.setAlpha(0.0f);
                jlVar2.f27817i0.setOnClickListener(new org.telegram.ui.qf(22, glVar, ilVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = jlVar2.f27817i0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView i15 = org.telegram.ui.Cells.c1.i(frameLayout3, textView, w7.z5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                i15.setTextSize(1, 14.0f);
                i15.setMaxLines(1);
                i15.setEllipsize(truncateAt);
                i15.setSingleLine(true);
                i15.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A6, d6Var));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                i15.setGravity(i12);
                FrameLayout frameLayout4 = jlVar2.f27817i0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(i15, w7.z5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(ilVar.f27441c.title);
                i15.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(ilVar.f27439a)));
                frameLayout.addView(frameLayout5, w7.z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), ilVar.f27441c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, w7.z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new fl(glVar, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                jlVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f31392a;
        jl jlVar = this.f31393b;
        switch (i10) {
            case 2:
                if (jlVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-jlVar.K) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                ImageView imageView = jlVar.f27821n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = jlVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = jlVar.f27814f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    jlVar.f27814f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    jlVar.f27814f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, jlVar.f27829s0 - AndroidUtilities.dp(10.0f)));
                    jlVar.f27814f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = jlVar.f27814f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    jlVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    jlVar.f27814f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    jlVar.f27814f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, jlVar.f27829s0));
                    jlVar.f27814f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!jlVar.f27831u0) {
                        int i11 = org.telegram.ui.ActionBar.i6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, jlVar.f29647a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        jlVar.f27831u0 = true;
                    }
                    IMapsProvider.IMap iMap = jlVar.H;
                    if (iMap != null && (location = jlVar.f27827r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        jlVar.f27827r0.setLongitude(jlVar.H.getCameraPosition().target.longitude);
                    }
                    jlVar.O.L(jlVar.f27827r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
