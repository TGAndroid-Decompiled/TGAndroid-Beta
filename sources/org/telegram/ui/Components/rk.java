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
public final class rk implements org.telegram.ui.ActionBar.r0, hg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.a2 {
    public final int f30062a;
    public final gl f30063b;

    public rk(gl glVar, int i10) {
        this.f30062a = i10;
        this.f30063b = glVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f30062a) {
            case 1:
                gl glVar = this.f30063b;
                ArrayList arrayList2 = glVar.f26459e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((fl) arrayList2.get(i10)).f26151b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(glVar.V(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f26150a = i11;
                            IMapsProvider.IMarker addMarker = glVar.H.addMarker(position);
                            obj.f26151b = addMarker;
                            obj.f26152c = tL_messageMediaVenue;
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
                gl glVar2 = this.f30063b;
                glVar2.f26468n0 = false;
                glVar2.f0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        gl.T(this.f30063b);
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f30063b.H;
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
        gl glVar = this.f30063b;
        bi.o0 o0Var = glVar.P;
        if (i10 == 1) {
            glVar.d0(true);
            if (glVar.f26461g0 != null) {
                glVar.S.setVisibility(0);
                dl dlVar = glVar.F;
                IMapsProvider.IMarker iMarker = glVar.f26461g0;
                HashMap hashMap = dlVar.f25445a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    dlVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                glVar.f26461g0 = null;
                glVar.f26462h0 = null;
                glVar.f26463i0 = null;
            }
            if (!glVar.L && o0Var.getChildCount() > 0 && (childAt = o0Var.getChildAt(0)) != null) {
                View F = o0Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = o0Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (glVar.f26484y0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = glVar.H.getCameraPosition();
                        glVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                        o0Var.v0(0, top + dp, null);
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
        gl glVar = this.f30063b;
        ImageView imageView = glVar.f26467n;
        if (iMarker.getTag() instanceof fl) {
            glVar.S.setVisibility(4);
            if (!glVar.f26477u0) {
                int i14 = org.telegram.ui.ActionBar.j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, glVar.f28779a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i14));
                glVar.f26477u0 = true;
            }
            dl dlVar = glVar.F;
            dlVar.getClass();
            HashMap hashMap = dlVar.f25445a;
            fl flVar = (fl) iMarker.getTag();
            gl glVar2 = dlVar.f25446b;
            fl flVar2 = glVar2.f26462h0;
            org.telegram.ui.ActionBar.f6 f6Var = glVar2.f28779a;
            if (flVar2 != flVar) {
                glVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = glVar2.f26461g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        dlVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    glVar2.f26461g0 = null;
                }
                glVar2.f26462h0 = flVar;
                glVar2.f26461g0 = iMarker;
                Context context = dlVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                dlVar.addView(frameLayout, w7.x5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                glVar2.f26463i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                glVar2.f26463i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, f6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(glVar2.f26463i0, w7.x5.c(71.0f, -2));
                glVar2.f26463i0.setAlpha(0.0f);
                glVar2.f26463i0.setOnClickListener(new org.telegram.ui.rf(22, dlVar, flVar));
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
                FrameLayout frameLayout3 = glVar2.f26463i0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView f7 = org.telegram.ui.Cells.p6.f(frameLayout3, textView, w7.x5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
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
                FrameLayout frameLayout4 = glVar2.f26463i0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(f7, w7.x5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(flVar.f26152c.title);
                f7.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.t4.a(flVar.f26150a)));
                frameLayout.addView(frameLayout5, w7.x5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                x9 x9Var = new x9(context);
                x9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), flVar.f26152c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(x9Var, w7.x5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new cl(dlVar, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                glVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f30062a;
        gl glVar = this.f30063b;
        switch (i10) {
            case 2:
                if (glVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-glVar.K) / 2.0f);
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
                ImageView imageView = glVar.f26467n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = glVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = glVar.f26460f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    glVar.f26460f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    glVar.f26460f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, glVar.f26475s0 - AndroidUtilities.dp(10.0f)));
                    glVar.f26460f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = glVar.f26460f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    glVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    glVar.f26460f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    glVar.f26460f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, glVar.f26475s0));
                    glVar.f26460f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!glVar.f26477u0) {
                        int i11 = org.telegram.ui.ActionBar.j6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, glVar.f28779a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        glVar.f26477u0 = true;
                    }
                    IMapsProvider.IMap iMap = glVar.H;
                    if (iMap != null && (location = glVar.f26473r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        glVar.f26473r0.setLongitude(glVar.H.getCameraPosition().target.longitude);
                    }
                    glVar.O.L(glVar.f26473r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
