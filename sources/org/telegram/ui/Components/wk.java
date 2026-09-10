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
public final class wk implements org.telegram.ui.ActionBar.s0, fg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.c2 {
    public final int f28784a;
    public final ll f28785b;

    public wk(ll llVar, int i10) {
        this.f28784a = i10;
        this.f28785b = llVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f28784a) {
            case 1:
                ll llVar = this.f28785b;
                ArrayList arrayList2 = llVar.f25028e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((kl) arrayList2.get(i10)).f24746b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(llVar.V(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f24745a = i11;
                            IMapsProvider.IMarker addMarker = llVar.H.addMarker(position);
                            obj.f24746b = addMarker;
                            obj.f24747c = tL_messageMediaVenue;
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
                ll llVar2 = this.f28785b;
                llVar2.f25037n0 = false;
                llVar2.f0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ll.T(this.f28785b);
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f28785b.H;
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
        ll llVar = this.f28785b;
        bi.y1 y1Var = llVar.P;
        if (i10 == 1) {
            llVar.d0(true);
            if (llVar.f25030g0 != null) {
                llVar.S.setVisibility(0);
                il ilVar = llVar.F;
                IMapsProvider.IMarker iMarker = llVar.f25030g0;
                HashMap hashMap = ilVar.f24041a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    ilVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                llVar.f25030g0 = null;
                llVar.f25031h0 = null;
                llVar.f25032i0 = null;
            }
            if (!llVar.L && y1Var.getChildCount() > 0 && (childAt = y1Var.getChildAt(0)) != null) {
                View F = y1Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = y1Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (llVar.f25053y0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = llVar.H.getCameraPosition();
                        llVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                        y1Var.v0(0, top + dp, null);
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
        ll llVar = this.f28785b;
        ImageView imageView = llVar.f25036n;
        if (iMarker.getTag() instanceof kl) {
            llVar.S.setVisibility(4);
            if (!llVar.f25046u0) {
                int i14 = org.telegram.ui.ActionBar.j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, llVar.f26421a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i14));
                llVar.f25046u0 = true;
            }
            il ilVar = llVar.F;
            ilVar.getClass();
            HashMap hashMap = ilVar.f24041a;
            kl klVar = (kl) iMarker.getTag();
            ll llVar2 = ilVar.f24042b;
            kl klVar2 = llVar2.f25031h0;
            org.telegram.ui.ActionBar.f6 f6Var = llVar2.f26421a;
            if (klVar2 != klVar) {
                llVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = llVar2.f25030g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        ilVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    llVar2.f25030g0 = null;
                }
                llVar2.f25031h0 = klVar;
                llVar2.f25030g0 = iMarker;
                Context context = ilVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                ilVar.addView(frameLayout, w7.a6.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                llVar2.f25032i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                llVar2.f25032i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(llVar2.f25032i0, w7.a6.c(71.0f, -2));
                llVar2.f25032i0.setAlpha(0.0f);
                llVar2.f25032i0.setOnClickListener(new org.telegram.ui.sh(19, ilVar, klVar));
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
                FrameLayout frameLayout3 = llVar2.f25032i0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView f7 = org.telegram.ui.Cells.r6.f(frameLayout3, textView, w7.a6.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                f7.setTextSize(1, 14.0f);
                f7.setMaxLines(1);
                f7.setEllipsize(truncateAt);
                f7.setSingleLine(true);
                f7.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                f7.setGravity(i12);
                FrameLayout frameLayout4 = llVar2.f25032i0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(f7, w7.a6.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(klVar.f24747c.title);
                f7.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(klVar.f24745a)));
                frameLayout.addView(frameLayout5, w7.a6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), klVar.f24747c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, w7.a6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new hl(ilVar, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                llVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f28784a;
        ll llVar = this.f28785b;
        switch (i10) {
            case 2:
                if (llVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-llVar.K) / 2.0f);
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
                ImageView imageView = llVar.f25036n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = llVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = llVar.f25029f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    llVar.f25029f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    llVar.f25029f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, llVar.f25044s0 - AndroidUtilities.dp(10.0f)));
                    llVar.f25029f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = llVar.f25029f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    llVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    llVar.f25029f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    llVar.f25029f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, llVar.f25044s0));
                    llVar.f25029f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!llVar.f25046u0) {
                        int i11 = org.telegram.ui.ActionBar.j6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, llVar.f26421a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        llVar.f25046u0 = true;
                    }
                    IMapsProvider.IMap iMap = llVar.H;
                    if (iMap != null && (location = llVar.f25042r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        llVar.f25042r0.setLongitude(llVar.H.getCameraPosition().target.longitude);
                    }
                    llVar.O.L(llVar.f25042r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
