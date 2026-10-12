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
public final class kl implements org.telegram.ui.ActionBar.q0, gg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.z1 {
    public final int f27877a;
    public final zl f27878b;

    public kl(zl zlVar, int i10) {
        this.f27877a = i10;
        this.f27878b = zlVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f27877a) {
            case 1:
                zl zlVar = this.f27878b;
                ArrayList arrayList2 = zlVar.f33404e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((yl) arrayList2.get(i10)).f33130b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(zlVar.Y(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f33129a = i11;
                            IMapsProvider.IMarker addMarker = zlVar.H.addMarker(position);
                            obj.f33130b = addMarker;
                            obj.f33131c = tL_messageMediaVenue;
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
                zl zlVar2 = this.f27878b;
                zlVar2.f33413n0 = false;
                zlVar2.i0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        zl.W(this.f27878b);
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f27878b.H;
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
        s4.d1 T;
        int dp;
        zl zlVar = this.f27878b;
        ai.w0 w0Var = zlVar.P;
        if (i10 == 1) {
            zlVar.g0(true);
            if (zlVar.f33406g0 != null) {
                zlVar.S.setVisibility(0);
                wl wlVar = zlVar.F;
                IMapsProvider.IMarker iMarker = zlVar.f33406g0;
                HashMap hashMap = wlVar.f32433a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    wlVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                zlVar.f33406g0 = null;
                zlVar.f33407h0 = null;
                zlVar.f33408i0 = null;
            }
            if (!zlVar.L && w0Var.getChildCount() > 0 && (childAt = w0Var.getChildAt(0)) != null) {
                View F = w0Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = w0Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (zlVar.f33429y0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = zlVar.H.getCameraPosition();
                        zlVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
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
        zl zlVar = this.f27878b;
        ImageView imageView = zlVar.f33412n;
        if (iMarker.getTag() instanceof yl) {
            zlVar.S.setVisibility(4);
            if (!zlVar.f33422u0) {
                int i14 = org.telegram.ui.ActionBar.h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i14, zlVar.f30569a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i14));
                zlVar.f33422u0 = true;
            }
            wl wlVar = zlVar.F;
            wlVar.getClass();
            HashMap hashMap = wlVar.f32433a;
            yl ylVar = (yl) iMarker.getTag();
            zl zlVar2 = wlVar.f32434b;
            yl ylVar2 = zlVar2.f33407h0;
            org.telegram.ui.ActionBar.c6 c6Var = zlVar2.f30569a;
            if (ylVar2 != ylVar) {
                zlVar2.g0(false);
                IMapsProvider.IMarker iMarker2 = zlVar2.f33406g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        wlVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    zlVar2.f33406g0 = null;
                }
                zlVar2.f33407h0 = ylVar;
                zlVar2.f33406g0 = iMarker;
                Context context = wlVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                wlVar.addView(frameLayout, w7.w5.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                zlVar2.f33408i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                zlVar2.f33408i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20631h5, c6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(zlVar2.f33408i0, w7.w5.d(71.0f, -2));
                zlVar2.f33408i0.setAlpha(0.0f);
                zlVar2.f33408i0.setOnClickListener(new org.telegram.ui.wf(22, wlVar, ylVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = zlVar2.f33408i0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout3, textView, w7.w5.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, i11 | 48), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A6, c6Var));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                g10.setGravity(i12);
                FrameLayout frameLayout4 = zlVar2.f33408i0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(g10, w7.w5.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, i13 | 48));
                textView.setText(ylVar.f33131c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(ylVar.f33129a)));
                frameLayout.addView(frameLayout5, w7.w5.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                y9 y9Var = new y9(context);
                y9Var.f(a1.g.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), ylVar.f33131c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(y9Var, w7.w5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new vl(wlVar, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                zlVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f27877a;
        zl zlVar = this.f27878b;
        switch (i10) {
            case 2:
                if (zlVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-zlVar.K) / 2.0f);
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
                ImageView imageView = zlVar.f33412n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = zlVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = zlVar.f33405f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    zlVar.f33405f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    zlVar.f33405f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, zlVar.f33420s0 - AndroidUtilities.dp(10.0f)));
                    zlVar.f33405f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = zlVar.f33405f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    zlVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    zlVar.f33405f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    zlVar.f33405f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, zlVar.f33420s0));
                    zlVar.f33405f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!zlVar.f33422u0) {
                        int i11 = org.telegram.ui.ActionBar.h6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, zlVar.f30569a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        zlVar.f33422u0 = true;
                    }
                    IMapsProvider.IMap iMap = zlVar.H;
                    if (iMap != null && (location = zlVar.f33418r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        zlVar.f33418r0.setLongitude(zlVar.H.getCameraPosition().target.longitude);
                    }
                    zlVar.O.L(zlVar.f33418r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
