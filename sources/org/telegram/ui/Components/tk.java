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
public final class tk implements org.telegram.ui.ActionBar.s0, gg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.b2 {
    public final int f28616a;
    public final il f28617b;

    public tk(il ilVar, int i10) {
        this.f28616a = i10;
        this.f28617b = ilVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f28616a) {
            case 1:
                il ilVar = this.f28617b;
                ArrayList arrayList2 = ilVar.f25172e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((hl) arrayList2.get(i10)).f24860b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(ilVar.V(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f24859a = i11;
                            IMapsProvider.IMarker addMarker = ilVar.H.addMarker(position);
                            obj.f24860b = addMarker;
                            obj.f24861c = tL_messageMediaVenue;
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
                il ilVar2 = this.f28617b;
                ilVar2.f25181n0 = false;
                ilVar2.f0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        il.T(this.f28617b);
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f28617b.H;
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
        s4.c1 U;
        int dp;
        il ilVar = this.f28617b;
        ai.w0 w0Var = ilVar.P;
        if (i10 == 1) {
            ilVar.d0(true);
            if (ilVar.f25174g0 != null) {
                ilVar.S.setVisibility(0);
                fl flVar = ilVar.F;
                IMapsProvider.IMarker iMarker = ilVar.f25174g0;
                HashMap hashMap = flVar.f24306a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    flVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                ilVar.f25174g0 = null;
                ilVar.f25175h0 = null;
                ilVar.f25176i0 = null;
            }
            if (!ilVar.L && w0Var.getChildCount() > 0 && (childAt = w0Var.getChildAt(0)) != null) {
                View G = w0Var.G(childAt);
                if (G == null) {
                    U = null;
                } else {
                    U = w0Var.U(G);
                }
                if (U != null && U.b() == 0) {
                    if (ilVar.f25197y0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = ilVar.H.getCameraPosition();
                        ilVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
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
        il ilVar = this.f28617b;
        ImageView imageView = ilVar.f25180n;
        if (iMarker.getTag() instanceof hl) {
            ilVar.S.setVisibility(4);
            if (!ilVar.f25190u0) {
                int i14 = org.telegram.ui.ActionBar.i6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i14, ilVar.f27103a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i14));
                ilVar.f25190u0 = true;
            }
            fl flVar = ilVar.F;
            flVar.getClass();
            HashMap hashMap = flVar.f24306a;
            hl hlVar = (hl) iMarker.getTag();
            il ilVar2 = flVar.f24307b;
            hl hlVar2 = ilVar2.f25175h0;
            org.telegram.ui.ActionBar.e6 e6Var = ilVar2.f27103a;
            if (hlVar2 != hlVar) {
                ilVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = ilVar2.f25174g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        flVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    ilVar2.f25174g0 = null;
                }
                ilVar2.f25175h0 = hlVar;
                ilVar2.f25174g0 = iMarker;
                Context context = flVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                flVar.addView(frameLayout, w7.y5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                ilVar2.f25176i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                ilVar2.f25176i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19128h5, e6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(ilVar2.f25176i0, w7.y5.c(71.0f, -2));
                ilVar2.f25176i0.setAlpha(0.0f);
                ilVar2.f25176i0.setOnClickListener(new org.telegram.ui.sf(22, flVar, hlVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = ilVar2.f25176i0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView h = org.telegram.ui.Cells.c1.h(frameLayout3, textView, w7.y5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                h.setTextSize(1, 14.0f);
                h.setMaxLines(1);
                h.setEllipsize(truncateAt);
                h.setSingleLine(true);
                h.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A6, e6Var));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                h.setGravity(i12);
                FrameLayout frameLayout4 = ilVar2.f25176i0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(h, w7.y5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(hlVar.f24861c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(hlVar.f24859a)));
                frameLayout.addView(frameLayout5, w7.y5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), hlVar.f24861c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, w7.y5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new el(flVar, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                ilVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f28616a;
        il ilVar = this.f28617b;
        switch (i10) {
            case 2:
                if (ilVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-ilVar.K) / 2.0f);
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
                ImageView imageView = ilVar.f25180n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = ilVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = ilVar.f25173f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ilVar.f25173f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    ilVar.f25173f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, ilVar.f25188s0 - AndroidUtilities.dp(10.0f)));
                    ilVar.f25173f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = ilVar.f25173f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    ilVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    ilVar.f25173f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    ilVar.f25173f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, ilVar.f25188s0));
                    ilVar.f25173f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!ilVar.f25190u0) {
                        int i11 = org.telegram.ui.ActionBar.i6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, ilVar.f27103a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        ilVar.f25190u0 = true;
                    }
                    IMapsProvider.IMap iMap = ilVar.H;
                    if (iMap != null && (location = ilVar.f25186r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        ilVar.f25186r0.setLongitude(ilVar.H.getCameraPosition().target.longitude);
                    }
                    ilVar.O.L(ilVar.f25186r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
