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
public final class sk implements org.telegram.ui.ActionBar.r0, gg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.a2 {
    public final int f27943a;
    public final hl f27944b;

    public sk(hl hlVar, int i10) {
        this.f27943a = i10;
        this.f27944b = hlVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f27943a) {
            case 1:
                hl hlVar = this.f27944b;
                ArrayList arrayList2 = hlVar.f24721e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((gl) arrayList2.get(i10)).f24364b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(hlVar.V(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f24363a = i11;
                            IMapsProvider.IMarker addMarker = hlVar.H.addMarker(position);
                            obj.f24364b = addMarker;
                            obj.f24365c = tL_messageMediaVenue;
                            addMarker.setTag(obj);
                            arrayList2.add(obj);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    return;
                }
                return;
            default:
                hl hlVar2 = this.f27944b;
                hlVar2.f24730n0 = false;
                hlVar2.f0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        hl.T(this.f27944b);
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f27944b.H;
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
        hl hlVar = this.f27944b;
        ai.w0 w0Var = hlVar.P;
        if (i10 == 1) {
            hlVar.d0(true);
            if (hlVar.f24723g0 != null) {
                hlVar.S.setVisibility(0);
                el elVar = hlVar.F;
                IMapsProvider.IMarker iMarker = hlVar.f24723g0;
                HashMap hashMap = elVar.f23716a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    elVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                hlVar.f24723g0 = null;
                hlVar.f24724h0 = null;
                hlVar.f24725i0 = null;
            }
            if (!hlVar.L && w0Var.getChildCount() > 0 && (childAt = w0Var.getChildAt(0)) != null) {
                View F = w0Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = w0Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (hlVar.f24746y0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = hlVar.H.getCameraPosition();
                        hlVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                        w0Var.v0(0, top + dp, null);
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
        hl hlVar = this.f27944b;
        ImageView imageView = hlVar.f24729n;
        if (iMarker.getTag() instanceof gl) {
            hlVar.S.setVisibility(4);
            if (!hlVar.f24739u0) {
                int i14 = org.telegram.ui.ActionBar.h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i14, hlVar.f26743a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i14));
                hlVar.f24739u0 = true;
            }
            el elVar = hlVar.F;
            elVar.getClass();
            HashMap hashMap = elVar.f23716a;
            gl glVar = (gl) iMarker.getTag();
            hl hlVar2 = elVar.f23717b;
            gl glVar2 = hlVar2.f24724h0;
            org.telegram.ui.ActionBar.d6 d6Var = hlVar2.f26743a;
            if (glVar2 != glVar) {
                hlVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = hlVar2.f24723g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        elVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    hlVar2.f24723g0 = null;
                }
                hlVar2.f24724h0 = glVar;
                hlVar2.f24723g0 = iMarker;
                Context context = elVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                elVar.addView(frameLayout, w7.x5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                hlVar2.f24725i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                hlVar2.f24725i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18859h5, d6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(hlVar2.f24725i0, w7.x5.c(71.0f, -2));
                hlVar2.f24725i0.setAlpha(0.0f);
                hlVar2.f24725i0.setOnClickListener(new org.telegram.ui.qf(22, elVar, glVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = hlVar2.f24725i0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView f7 = org.telegram.ui.Cells.q3.f(frameLayout3, textView, w7.x5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                f7.setTextSize(1, 14.0f);
                f7.setMaxLines(1);
                f7.setEllipsize(truncateAt);
                f7.setSingleLine(true);
                f7.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, d6Var));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                f7.setGravity(i12);
                FrameLayout frameLayout4 = hlVar2.f24725i0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(f7, w7.x5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(glVar.f24365c.title);
                f7.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(glVar.f24363a)));
                frameLayout.addView(frameLayout5, w7.x5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), glVar.f24365c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, w7.x5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new dl(elVar, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                hlVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f27943a;
        hl hlVar = this.f27944b;
        switch (i10) {
            case 2:
                if (hlVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-hlVar.K) / 2.0f);
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
                ImageView imageView = hlVar.f24729n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = hlVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = hlVar.f24722f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    hlVar.f24722f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    hlVar.f24722f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, hlVar.f24737s0 - AndroidUtilities.dp(10.0f)));
                    hlVar.f24722f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = hlVar.f24722f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    hlVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    hlVar.f24722f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    hlVar.f24722f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, hlVar.f24737s0));
                    hlVar.f24722f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!hlVar.f24739u0) {
                        int i11 = org.telegram.ui.ActionBar.h6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, hlVar.f26743a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        hlVar.f24739u0 = true;
                    }
                    IMapsProvider.IMap iMap = hlVar.H;
                    if (iMap != null && (location = hlVar.f24735r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        hlVar.f24735r0.setLongitude(hlVar.H.getCameraPosition().target.longitude);
                    }
                    hlVar.O.L(hlVar.f24735r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
