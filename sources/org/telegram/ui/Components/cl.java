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
public final class cl implements org.telegram.ui.ActionBar.q0, hg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.a2 {
    public final int f25214a;
    public final rl f25215b;

    public cl(rl rlVar, int i10) {
        this.f25214a = i10;
        this.f25215b = rlVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f25214a) {
            case 1:
                rl rlVar = this.f25215b;
                ArrayList arrayList2 = rlVar.f29951e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ql) arrayList2.get(i10)).f29630b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(rlVar.Y(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f29629a = i11;
                            IMapsProvider.IMarker addMarker = rlVar.H.addMarker(position);
                            obj.f29630b = addMarker;
                            obj.f29631c = tL_messageMediaVenue;
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
                rl rlVar2 = this.f25215b;
                rlVar2.f29960n0 = false;
                rlVar2.i0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        rl.W(this.f25215b);
    }

    @Override
    public void j(int i10) {
        IMapsProvider.IMap iMap = this.f25215b.H;
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
        s4.b1 T;
        int dp;
        rl rlVar = this.f25215b;
        ai.u1 u1Var = rlVar.P;
        if (i10 == 1) {
            rlVar.g0(true);
            if (rlVar.f29953g0 != null) {
                rlVar.S.setVisibility(0);
                ol olVar = rlVar.F;
                IMapsProvider.IMarker iMarker = rlVar.f29953g0;
                HashMap hashMap = olVar.f29063a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    olVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                rlVar.f29953g0 = null;
                rlVar.f29954h0 = null;
                rlVar.f29955i0 = null;
            }
            if (!rlVar.L && u1Var.getChildCount() > 0 && (childAt = u1Var.getChildAt(0)) != null) {
                View F = u1Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = u1Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (rlVar.f29976y0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = rlVar.H.getCameraPosition();
                        rlVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                        u1Var.v0(0, top + dp, null);
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
        rl rlVar = this.f25215b;
        ImageView imageView = rlVar.f29959n;
        if (iMarker.getTag() instanceof ql) {
            rlVar.S.setVisibility(4);
            if (!rlVar.f29969u0) {
                int i14 = org.telegram.ui.ActionBar.h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i14, rlVar.f28172a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i14));
                rlVar.f29969u0 = true;
            }
            ol olVar = rlVar.F;
            olVar.getClass();
            HashMap hashMap = olVar.f29063a;
            ql qlVar = (ql) iMarker.getTag();
            rl rlVar2 = olVar.f29064b;
            ql qlVar2 = rlVar2.f29954h0;
            org.telegram.ui.ActionBar.d6 d6Var = rlVar2.f28172a;
            if (qlVar2 != qlVar) {
                rlVar2.g0(false);
                IMapsProvider.IMarker iMarker2 = rlVar2.f29953g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        olVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    rlVar2.f29953g0 = null;
                }
                rlVar2.f29954h0 = qlVar;
                rlVar2.f29953g0 = iMarker;
                Context context = olVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                olVar.addView(frameLayout, w7.z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                rlVar2.f29955i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                rlVar2.f29955i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21061h5, d6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(rlVar2.f29955i0, w7.z5.c(71.0f, -2));
                rlVar2.f29955i0.setAlpha(0.0f);
                rlVar2.f29955i0.setOnClickListener(new ca(2, olVar, qlVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = rlVar2.f29955i0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView j10 = org.telegram.ui.Cells.c1.j(frameLayout3, textView, w7.z5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                j10.setTextSize(1, 14.0f);
                j10.setMaxLines(1);
                j10.setEllipsize(truncateAt);
                j10.setSingleLine(true);
                j10.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A6, d6Var));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                j10.setGravity(i12);
                FrameLayout frameLayout4 = rlVar2.f29955i0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(j10, w7.z5.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(qlVar.f29631c.title);
                j10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.t4.a(qlVar.f29629a)));
                frameLayout.addView(frameLayout5, w7.z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), qlVar.f29631c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(w9Var, w7.z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new nl(olVar, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                rlVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f25214a;
        rl rlVar = this.f25215b;
        switch (i10) {
            case 2:
                if (rlVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-rlVar.K) / 2.0f);
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
                ImageView imageView = rlVar.f29959n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = rlVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = rlVar.f29952f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    rlVar.f29952f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    rlVar.f29952f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, rlVar.f29967s0 - AndroidUtilities.dp(10.0f)));
                    rlVar.f29952f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = rlVar.f29952f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    rlVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    rlVar.f29952f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    rlVar.f29952f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, rlVar.f29967s0));
                    rlVar.f29952f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!rlVar.f29969u0) {
                        int i11 = org.telegram.ui.ActionBar.h6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, rlVar.f28172a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        rlVar.f29969u0 = true;
                    }
                    IMapsProvider.IMap iMap = rlVar.H;
                    if (iMap != null && (location = rlVar.f29965r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        rlVar.f29965r0.setLongitude(rlVar.H.getCameraPosition().target.longitude);
                    }
                    rlVar.O.L(rlVar.f29965r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
