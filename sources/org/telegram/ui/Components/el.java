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
public final class el implements org.telegram.ui.ActionBar.q0, hg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.z1 {
    public final int f24414a;
    public final tl f24415b;

    public el(tl tlVar, int i10) {
        this.f24414a = i10;
        this.f24415b = tlVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f24414a) {
            case 1:
                tl tlVar = this.f24415b;
                ArrayList arrayList2 = tlVar.f29096e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((sl) arrayList2.get(i10)).f28854b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(tlVar.Y(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f28853a = i11;
                            IMapsProvider.IMarker addMarker = tlVar.H.addMarker(position);
                            obj.f28854b = addMarker;
                            obj.f28855c = tL_messageMediaVenue;
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
                tl tlVar2 = this.f24415b;
                tlVar2.f29105n0 = false;
                tlVar2.i0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        tl.W(this.f24415b);
    }

    @Override
    public void k(int i10) {
        IMapsProvider.IMap iMap = this.f24415b.H;
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
        tl tlVar = this.f24415b;
        bi.o0 o0Var = tlVar.P;
        if (i10 == 1) {
            tlVar.g0(true);
            if (tlVar.f29098g0 != null) {
                tlVar.S.setVisibility(0);
                ql qlVar = tlVar.F;
                IMapsProvider.IMarker iMarker = tlVar.f29098g0;
                HashMap hashMap = qlVar.f28320a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    qlVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                tlVar.f29098g0 = null;
                tlVar.f29099h0 = null;
                tlVar.f29100i0 = null;
            }
            if (!tlVar.L && o0Var.getChildCount() > 0 && (childAt = o0Var.getChildAt(0)) != null) {
                View F = o0Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = o0Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (tlVar.f29121y0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = tlVar.H.getCameraPosition();
                        tlVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
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
        tl tlVar = this.f24415b;
        ImageView imageView = tlVar.f29104n;
        if (iMarker.getTag() instanceof sl) {
            tlVar.S.setVisibility(4);
            if (!tlVar.f29114u0) {
                int i14 = org.telegram.ui.ActionBar.g6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i14, tlVar.f27359a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i14));
                tlVar.f29114u0 = true;
            }
            ql qlVar = tlVar.F;
            qlVar.getClass();
            HashMap hashMap = qlVar.f28320a;
            sl slVar = (sl) iMarker.getTag();
            tl tlVar2 = qlVar.f28321b;
            sl slVar2 = tlVar2.f29099h0;
            org.telegram.ui.ActionBar.c6 c6Var = tlVar2.f27359a;
            if (slVar2 != slVar) {
                tlVar2.g0(false);
                IMapsProvider.IMarker iMarker2 = tlVar2.f29098g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        qlVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    tlVar2.f29098g0 = null;
                }
                tlVar2.f29099h0 = slVar;
                tlVar2.f29098g0 = iMarker;
                Context context = qlVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                qlVar.addView(frameLayout, w7.z5.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                tlVar2.f29100i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                tlVar2.f29100i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19672h5, c6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(tlVar2.f29100i0, w7.z5.d(71.0f, -2));
                tlVar2.f29100i0.setAlpha(0.0f);
                tlVar2.f29100i0.setOnClickListener(new org.telegram.ui.xf(22, qlVar, slVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
                textView.setTypeface(AndroidUtilities.bold());
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout3 = tlVar2.f29100i0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout3, textView, w7.z5.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, i11 | 48), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A6, c6Var));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                g10.setGravity(i12);
                FrameLayout frameLayout4 = tlVar2.f29100i0;
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                frameLayout4.addView(g10, w7.z5.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, i13 | 48));
                textView.setText(slVar.f28855c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout5.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(slVar.f28853a)));
                frameLayout.addView(frameLayout5, w7.z5.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                z9 z9Var = new z9(context);
                z9Var.f(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), slVar.f28855c.venue_type, "_64.png"), null, null);
                frameLayout5.addView(z9Var, w7.z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new pl(qlVar, frameLayout5));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                tlVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f24414a;
        tl tlVar = this.f24415b;
        switch (i10) {
            case 2:
                if (tlVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-tlVar.K) / 2.0f);
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
                ImageView imageView = tlVar.f29104n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = tlVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = tlVar.f29097f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    tlVar.f29097f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    tlVar.f29097f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, tlVar.f29112s0 - AndroidUtilities.dp(10.0f)));
                    tlVar.f29097f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = tlVar.f29097f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    tlVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    tlVar.f29097f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    tlVar.f29097f0.playTogether(ObjectAnimator.ofFloat(imageView2, property, tlVar.f29112s0));
                    tlVar.f29097f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!tlVar.f29114u0) {
                        int i11 = org.telegram.ui.ActionBar.g6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, tlVar.f27359a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        tlVar.f29114u0 = true;
                    }
                    IMapsProvider.IMap iMap = tlVar.H;
                    if (iMap != null && (location = tlVar.f29110r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        tlVar.f29110r0.setLongitude(tlVar.H.getCameraPosition().target.longitude);
                    }
                    tlVar.O.L(tlVar.f29110r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
