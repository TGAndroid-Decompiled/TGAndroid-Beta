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
public final class ik implements org.telegram.ui.ActionBar.s0, of.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.b2 {
    public final int f29449a;
    public final xk f29450b;

    public ik(xk xkVar, int i9) {
        this.f29449a = i9;
        this.f29450b = xkVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f29449a) {
            case 1:
                xk xkVar = this.f29450b;
                ArrayList arrayList2 = xkVar.f34688a0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        ((wk) arrayList2.get(i9)).f34237b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(xkVar.U(i10));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f34236a = i10;
                            IMapsProvider.IMarker addMarker = xkVar.D.addMarker(position);
                            obj.f34237b = addMarker;
                            obj.f34238c = tL_messageMediaVenue;
                            addMarker.setTag(obj);
                            arrayList2.add(obj);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    return;
                }
                return;
            default:
                xk xkVar2 = this.f29450b;
                xkVar2.f34697j0 = false;
                xkVar2.e0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        xk.S(this.f29450b);
    }

    @Override
    public void i(int i9) {
        IMapsProvider.IMap iMap = this.f29450b.D;
        if (iMap != null) {
            if (i9 == 2) {
                iMap.setMapType(0);
            } else if (i9 == 3) {
                iMap.setMapType(1);
            } else if (i9 == 4) {
                iMap.setMapType(2);
            }
        }
    }

    @Override
    public void onCameraMoveStarted(int i9) {
        View childAt;
        f2.q1 T;
        int dp;
        xk xkVar = this.f29450b;
        gh.f1 f1Var = xkVar.L;
        if (i9 == 1) {
            xkVar.c0(true);
            if (xkVar.f34690c0 != null) {
                xkVar.O.setVisibility(0);
                uk ukVar = xkVar.B;
                IMapsProvider.IMarker iMarker = xkVar.f34690c0;
                HashMap hashMap = ukVar.f33084a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    ukVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                xkVar.f34690c0 = null;
                xkVar.f34691d0 = null;
                xkVar.f34692e0 = null;
            }
            if (!xkVar.H && f1Var.getChildCount() > 0 && (childAt = f1Var.getChildAt(0)) != null) {
                View F = f1Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = f1Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (xkVar.f34710u0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = xkVar.D.getCameraPosition();
                        xkVar.F = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                        f1Var.v0(0, top + dp, null);
                    }
                }
            }
        }
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i9;
        int i10;
        int i11;
        int i12;
        xk xkVar = this.f29450b;
        ImageView imageView = xkVar.f34700n;
        if (iMarker.getTag() instanceof wk) {
            xkVar.O.setVisibility(4);
            if (!xkVar.f34704q0) {
                int i13 = org.telegram.ui.ActionBar.f6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i13, xkVar.f27492a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i13));
                xkVar.f34704q0 = true;
            }
            uk ukVar = xkVar.B;
            ukVar.getClass();
            HashMap hashMap = ukVar.f33084a;
            wk wkVar = (wk) iMarker.getTag();
            xk xkVar2 = ukVar.f33085b;
            wk wkVar2 = xkVar2.f34691d0;
            org.telegram.ui.ActionBar.b6 b6Var = xkVar2.f27492a;
            if (wkVar2 != wkVar) {
                xkVar2.c0(false);
                IMapsProvider.IMarker iMarker2 = xkVar2.f34690c0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        ukVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    xkVar2.f34690c0 = null;
                }
                xkVar2.f34691d0 = wkVar;
                xkVar2.f34690c0 = iMarker;
                Context context = ukVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                ukVar.addView(frameLayout, g7.e6.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                xkVar2.f34692e0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                xkVar2.f34692e0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(xkVar2.f34692e0, g7.e6.c(71.0f, -2));
                xkVar2.f34692e0.setAlpha(0.0f);
                xkVar2.f34692e0.setOnClickListener(new s2(9, ukVar, wkVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i9 = 5;
                } else {
                    i9 = 3;
                }
                textView.setGravity(i9);
                FrameLayout frameLayout3 = xkVar2.f34692e0;
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout3, textView, g7.e6.d(-2, -2.0f, i10 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                g10.setGravity(i11);
                FrameLayout frameLayout4 = xkVar2.f34692e0;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout4.addView(g10, g7.e6.d(-2, -2.0f, i12 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(wkVar.f34238c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(wkVar.f34236a)));
                frameLayout.addView(frameLayout5, g7.e6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                o9 o9Var = new o9(context);
                o9Var.f(aa.d.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), wkVar.f34238c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(o9Var, g7.e6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new tk(ukVar, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                xkVar2.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i9 = this.f29449a;
        xk xkVar = this.f29450b;
        switch (i9) {
            case 2:
                if (xkVar.G != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-xkVar.G) / 2.0f);
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
                ImageView imageView = xkVar.f34700n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = xkVar.O;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = xkVar.f34689b0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    xkVar.f34689b0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    xkVar.f34689b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, xkVar.f34702o0 - AndroidUtilities.dp(10.0f)));
                    xkVar.f34689b0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = xkVar.f34689b0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    xkVar.G = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    xkVar.f34689b0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    xkVar.f34689b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, xkVar.f34702o0));
                    xkVar.f34689b0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!xkVar.f34704q0) {
                        int i10 = org.telegram.ui.ActionBar.f6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, xkVar.f27492a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i10));
                        xkVar.f34704q0 = true;
                    }
                    IMapsProvider.IMap iMap = xkVar.D;
                    if (iMap != null && (location = xkVar.f34701n0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        xkVar.f34701n0.setLongitude(xkVar.D.getCameraPosition().target.longitude);
                    }
                    xkVar.K.L(xkVar.f34701n0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
