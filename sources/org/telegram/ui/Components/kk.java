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
public final class kk implements org.telegram.ui.ActionBar.s0, tf.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.c2 {
    public final int f26305a;
    public final al f26306b;

    public kk(al alVar, int i10) {
        this.f26305a = i10;
        this.f26306b = alVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f26305a) {
            case 1:
                al alVar = this.f26306b;
                ArrayList arrayList2 = alVar.f23419b0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((zk) arrayList2.get(i10)).f31372b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(alVar.V(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f31371a = i11;
                            IMapsProvider.IMarker addMarker = alVar.E.addMarker(position);
                            obj.f31372b = addMarker;
                            obj.f31373c = tL_messageMediaVenue;
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
                al alVar2 = this.f26306b;
                alVar2.f23428k0 = false;
                alVar2.f0();
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        al.T(this.f26306b);
    }

    @Override
    public void l(int i10) {
        IMapsProvider.IMap iMap = this.f26306b.E;
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
        f2.l1 T;
        int dp;
        al alVar = this.f26306b;
        lh.e1 e1Var = alVar.M;
        if (i10 == 1) {
            alVar.d0(true);
            if (alVar.f23421d0 != null) {
                alVar.P.setVisibility(0);
                xk xkVar = alVar.C;
                IMapsProvider.IMarker iMarker = alVar.f23421d0;
                HashMap hashMap = xkVar.f30686a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    xkVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                alVar.f23421d0 = null;
                alVar.f23422e0 = null;
                alVar.f23423f0 = null;
            }
            if (!alVar.I && e1Var.getChildCount() > 0 && (childAt = e1Var.getChildAt(0)) != null) {
                View F = e1Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = e1Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (alVar.f23441v0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = alVar.E.getCameraPosition();
                        alVar.G = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                        e1Var.v0(0, top + dp, null);
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
        al alVar = this.f26306b;
        ImageView imageView = alVar.f23430n;
        if (iMarker.getTag() instanceof zk) {
            alVar.P.setVisibility(4);
            if (!alVar.f23436r0) {
                int i14 = org.telegram.ui.ActionBar.j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, alVar.f24277a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i14));
                alVar.f23436r0 = true;
            }
            xk xkVar = alVar.C;
            xkVar.getClass();
            HashMap hashMap = xkVar.f30686a;
            zk zkVar = (zk) iMarker.getTag();
            al alVar2 = xkVar.f30687b;
            zk zkVar2 = alVar2.f23422e0;
            org.telegram.ui.ActionBar.f6 f6Var = alVar2.f24277a;
            if (zkVar2 != zkVar) {
                alVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = alVar2.f23421d0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        xkVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    alVar2.f23421d0 = null;
                }
                alVar2.f23422e0 = zkVar;
                alVar2.f23421d0 = iMarker;
                Context context = xkVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                xkVar.addView(frameLayout, k7.b6.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                alVar2.f23423f0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                alVar2.f23423f0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, f6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(alVar2.f23423f0, k7.b6.c(71.0f, -2));
                alVar2.f23423f0.setAlpha(0.0f);
                alVar2.f23423f0.setOnClickListener(new w2(7, xkVar, zkVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = alVar2.f23423f0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView i15 = org.telegram.ui.yh.i(frameLayout3, textView, k7.b6.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                i15.setTextSize(1, 14.0f);
                i15.setMaxLines(1);
                i15.setEllipsize(truncateAt);
                i15.setSingleLine(true);
                i15.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                i15.setGravity(i12);
                FrameLayout frameLayout4 = alVar2.f23423f0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(i15, k7.b6.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(zkVar.f31373c.title);
                i15.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(zkVar.f31371a)));
                frameLayout.addView(frameLayout5, k7.b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                p9 p9Var = new p9(context);
                p9Var.f(android.support.v4.media.a.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), zkVar.f31373c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(p9Var, k7.b6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new wk(xkVar, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                alVar2.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f26305a;
        al alVar = this.f26306b;
        switch (i10) {
            case 2:
                if (alVar.H != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-alVar.H) / 2.0f);
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
                ImageView imageView = alVar.f23430n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = alVar.P;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = alVar.f23420c0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    alVar.f23420c0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    alVar.f23420c0.playTogether(ObjectAnimator.ofFloat(imageView2, property, alVar.f23433p0 - AndroidUtilities.dp(10.0f)));
                    alVar.f23420c0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = alVar.f23420c0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    alVar.H = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    alVar.f23420c0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    alVar.f23420c0.playTogether(ObjectAnimator.ofFloat(imageView2, property, alVar.f23433p0));
                    alVar.f23420c0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!alVar.f23436r0) {
                        int i11 = org.telegram.ui.ActionBar.j6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, alVar.f24277a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        alVar.f23436r0 = true;
                    }
                    IMapsProvider.IMap iMap = alVar.E;
                    if (iMap != null && (location = alVar.f23432o0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        alVar.f23432o0.setLongitude(alVar.E.getCameraPosition().target.longitude);
                    }
                    alVar.L.L(alVar.f23432o0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
