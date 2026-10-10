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
public final class il implements org.telegram.ui.ActionBar.r0, gg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.a2 {
    public final int f27406a;
    public final xl f27407b;

    public il(xl xlVar, int i10) {
        this.f27406a = i10;
        this.f27407b = xlVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f27406a) {
            case 1:
                xl xlVar = this.f27407b;
                ArrayList arrayList2 = xlVar.f32962e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((wl) arrayList2.get(i10)).f32697b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(xlVar.Y(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f32696a = i11;
                            IMapsProvider.IMarker addMarker = xlVar.H.addMarker(position);
                            obj.f32697b = addMarker;
                            obj.f32698c = tL_messageMediaVenue;
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
                xl xlVar2 = this.f27407b;
                xlVar2.f32971n0 = false;
                xlVar2.i0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        xl.W(this.f27407b);
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f27407b.H;
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
        xl xlVar = this.f27407b;
        ai.w0 w0Var = xlVar.P;
        if (i10 == 1) {
            xlVar.g0(true);
            if (xlVar.f32964g0 != null) {
                xlVar.S.setVisibility(0);
                ul ulVar = xlVar.F;
                IMapsProvider.IMarker iMarker = xlVar.f32964g0;
                HashMap hashMap = ulVar.f31545a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    ulVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                xlVar.f32964g0 = null;
                xlVar.f32965h0 = null;
                xlVar.f32966i0 = null;
            }
            if (!xlVar.L && w0Var.getChildCount() > 0 && (childAt = w0Var.getChildAt(0)) != null) {
                View F = w0Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = w0Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (xlVar.f32987y0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = xlVar.H.getCameraPosition();
                        xlVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
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
        xl xlVar = this.f27407b;
        ImageView imageView = xlVar.f32970n;
        if (iMarker.getTag() instanceof wl) {
            xlVar.S.setVisibility(4);
            if (!xlVar.f32980u0) {
                int i14 = org.telegram.ui.ActionBar.i6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i14, xlVar.f30210a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i14));
                xlVar.f32980u0 = true;
            }
            ul ulVar = xlVar.F;
            ulVar.getClass();
            HashMap hashMap = ulVar.f31545a;
            wl wlVar = (wl) iMarker.getTag();
            xl xlVar2 = ulVar.f31546b;
            wl wlVar2 = xlVar2.f32965h0;
            org.telegram.ui.ActionBar.e6 e6Var = xlVar2.f30210a;
            if (wlVar2 != wlVar) {
                xlVar2.g0(false);
                IMapsProvider.IMarker iMarker2 = xlVar2.f32964g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        ulVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    xlVar2.f32964g0 = null;
                }
                xlVar2.f32965h0 = wlVar;
                xlVar2.f32964g0 = iMarker;
                Context context = ulVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                ulVar.addView(frameLayout, w7.x5.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                xlVar2.f32966i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                xlVar2.f32966i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20872h5, e6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(xlVar2.f32966i0, w7.x5.d(71.0f, -2));
                xlVar2.f32966i0.setAlpha(0.0f);
                xlVar2.f32966i0.setOnClickListener(new org.telegram.ui.sf(22, ulVar, wlVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = xlVar2.f32966i0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout3, textView, w7.x5.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, i11 | 48), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A6, e6Var));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                g10.setGravity(i12);
                FrameLayout frameLayout4 = xlVar2.f32966i0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(g10, w7.x5.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, i13 | 48));
                textView.setText(wlVar.f32698c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(wlVar.f32696a)));
                frameLayout.addView(frameLayout5, w7.x5.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                y9 y9Var = new y9(context);
                y9Var.f(a1.g.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), wlVar.f32698c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(y9Var, w7.x5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new tl(ulVar, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                xlVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f27406a;
        xl xlVar = this.f27407b;
        switch (i10) {
            case 2:
                if (xlVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-xlVar.K) / 2.0f);
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
                ImageView imageView = xlVar.f32970n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = xlVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = xlVar.f32963f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    xlVar.f32963f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    xlVar.f32963f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, xlVar.f32978s0 - AndroidUtilities.dp(10.0f)));
                    xlVar.f32963f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = xlVar.f32963f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    xlVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    xlVar.f32963f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    xlVar.f32963f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, xlVar.f32978s0));
                    xlVar.f32963f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!xlVar.f32980u0) {
                        int i11 = org.telegram.ui.ActionBar.i6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, xlVar.f30210a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        xlVar.f32980u0 = true;
                    }
                    IMapsProvider.IMap iMap = xlVar.H;
                    if (iMap != null && (location = xlVar.f32976r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        xlVar.f32976r0.setLongitude(xlVar.H.getCameraPosition().target.longitude);
                    }
                    xlVar.O.L(xlVar.f32976r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
