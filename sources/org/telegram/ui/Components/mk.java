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
public final class mk implements org.telegram.ui.ActionBar.s0, rf.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.b2 {
    public final int f30716a;
    public final bl f30717b;

    public mk(bl blVar, int i10) {
        this.f30716a = i10;
        this.f30717b = blVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f30716a) {
            case 1:
                bl blVar = this.f30717b;
                ArrayList arrayList2 = blVar.f27152a0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((al) arrayList2.get(i10)).f26798b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(blVar.V(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f26797a = i11;
                            IMapsProvider.IMarker addMarker = blVar.D.addMarker(position);
                            obj.f26798b = addMarker;
                            obj.f26799c = tL_messageMediaVenue;
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
                bl blVar2 = this.f30717b;
                blVar2.f27161j0 = false;
                blVar2.f0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        bl.T(this.f30717b);
    }

    @Override
    public void i(int i10) {
        IMapsProvider.IMap iMap = this.f30717b.D;
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
        f2.n1 T;
        int dp;
        bl blVar = this.f30717b;
        jh.e1 e1Var = blVar.L;
        if (i10 == 1) {
            blVar.d0(true);
            if (blVar.f27154c0 != null) {
                blVar.O.setVisibility(0);
                yk ykVar = blVar.B;
                IMapsProvider.IMarker iMarker = blVar.f27154c0;
                HashMap hashMap = ykVar.f35085a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    ykVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                blVar.f27154c0 = null;
                blVar.f27155d0 = null;
                blVar.f27156e0 = null;
            }
            if (!blVar.H && e1Var.getChildCount() > 0 && (childAt = e1Var.getChildAt(0)) != null) {
                View F = e1Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = e1Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (blVar.f27174u0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = blVar.D.getCameraPosition();
                        blVar.F = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
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
        bl blVar = this.f30717b;
        ImageView imageView = blVar.f27164n;
        if (iMarker.getTag() instanceof al) {
            blVar.O.setVisibility(4);
            if (!blVar.f27168q0) {
                int i14 = org.telegram.ui.ActionBar.g6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, blVar.f28402a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i14));
                blVar.f27168q0 = true;
            }
            yk ykVar = blVar.B;
            ykVar.getClass();
            HashMap hashMap = ykVar.f35085a;
            al alVar = (al) iMarker.getTag();
            bl blVar2 = ykVar.f35086b;
            al alVar2 = blVar2.f27155d0;
            org.telegram.ui.ActionBar.c6 c6Var = blVar2.f28402a;
            if (alVar2 != alVar) {
                blVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = blVar2.f27154c0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        ykVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    blVar2.f27154c0 = null;
                }
                blVar2.f27155d0 = alVar;
                blVar2.f27154c0 = iMarker;
                Context context = ykVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                ykVar.addView(frameLayout, i7.f6.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                blVar2.f27156e0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                blVar2.f27156e0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(blVar2.f27156e0, i7.f6.c(71.0f, -2));
                blVar2.f27156e0.setAlpha(0.0f);
                blVar2.f27156e0.setOnClickListener(new t2(10, ykVar, alVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = blVar2.f27156e0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView h = org.telegram.ui.th.h(frameLayout3, textView, i7.f6.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                h.setTextSize(1, 14.0f);
                h.setMaxLines(1);
                h.setEllipsize(truncateAt);
                h.setSingleLine(true);
                h.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                h.setGravity(i12);
                FrameLayout frameLayout4 = blVar2.f27156e0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(h, i7.f6.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(alVar.f26799c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.s4.a(alVar.f26797a)));
                frameLayout.addView(frameLayout5, i7.f6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                t9 t9Var = new t9(context);
                t9Var.f(a4.w.q(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), alVar.f26799c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(t9Var, i7.f6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new xk(ykVar, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                blVar2.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f30716a;
        bl blVar = this.f30717b;
        switch (i10) {
            case 2:
                if (blVar.G != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-blVar.G) / 2.0f);
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
                ImageView imageView = blVar.f27164n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = blVar.O;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = blVar.f27153b0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    blVar.f27153b0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    blVar.f27153b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, blVar.f27166o0 - AndroidUtilities.dp(10.0f)));
                    blVar.f27153b0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = blVar.f27153b0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    blVar.G = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    blVar.f27153b0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    blVar.f27153b0.playTogether(ObjectAnimator.ofFloat(imageView2, property, blVar.f27166o0));
                    blVar.f27153b0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!blVar.f27168q0) {
                        int i11 = org.telegram.ui.ActionBar.g6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, blVar.f28402a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        blVar.f27168q0 = true;
                    }
                    IMapsProvider.IMap iMap = blVar.D;
                    if (iMap != null && (location = blVar.f27165n0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        blVar.f27165n0.setLongitude(blVar.D.getCameraPosition().target.longitude);
                    }
                    blVar.K.L(blVar.f27165n0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
