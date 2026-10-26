package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
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
public final class cl implements org.telegram.ui.ActionBar.r0, ig.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.b2 {
    public final int f27196a;
    public final sl f27197b;

    public cl(sl slVar, int i10) {
        this.f27196a = i10;
        this.f27197b = slVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f27196a) {
            case 1:
                sl slVar = this.f27197b;
                ArrayList arrayList2 = slVar.f32595c0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((rl) arrayList2.get(i10)).f32265b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(slVar.Z(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f32264a = i11;
                            IMapsProvider.IMarker addMarker = slVar.F.addMarker(position);
                            obj.f32265b = addMarker;
                            obj.f32266c = tL_messageMediaVenue;
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
                sl slVar2 = this.f27197b;
                slVar2.f32603k0 = false;
                slVar2.i0();
                return;
        }
    }

    @Override
    public void g(int i10) {
        IMapsProvider.IMap iMap = this.f27197b.F;
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
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        sl.W(this.f27197b);
    }

    @Override
    public void onCameraMoveStarted(int i10) {
        View childAt;
        s4.e1 T;
        int dp;
        sl slVar = this.f27197b;
        bi.r1 r1Var = slVar.N;
        if (i10 == 1) {
            slVar.g0(true);
            if (slVar.f32597e0 != null) {
                slVar.Q.setVisibility(0);
                pl plVar = slVar.f32621y;
                IMapsProvider.IMarker iMarker = slVar.f32597e0;
                HashMap hashMap = plVar.f31594a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    plVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                slVar.f32597e0 = null;
                slVar.f32598f0 = null;
                slVar.f32599g0 = null;
            }
            if (!slVar.J && r1Var.getChildCount() > 0 && (childAt = r1Var.getChildAt(0)) != null) {
                View F = r1Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = r1Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (slVar.f32616v0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = slVar.F.getCameraPosition();
                        slVar.H = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                        r1Var.w0(0, top + dp, null);
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
        sl slVar = this.f27197b;
        ImageView imageView = slVar.f32605n;
        if (iMarker.getTag() instanceof rl) {
            slVar.Q.setVisibility(4);
            if (!slVar.f32611r0) {
                int i13 = org.telegram.ui.ActionBar.y6.f23685ui;
                org.telegram.ui.ActionBar.f7.t(imageView, i13, slVar.f30214a, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i13));
                slVar.f32611r0 = true;
            }
            pl plVar = slVar.f32621y;
            plVar.getClass();
            HashMap hashMap = plVar.f31594a;
            rl rlVar = (rl) iMarker.getTag();
            sl slVar2 = plVar.f31595b;
            rl rlVar2 = slVar2.f32598f0;
            org.telegram.ui.ActionBar.u6 u6Var = slVar2.f30214a;
            if (rlVar2 != rlVar) {
                slVar2.g0(false);
                IMapsProvider.IMarker iMarker2 = slVar2.f32597e0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        plVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    slVar2.f32597e0 = null;
                }
                slVar2.f32598f0 = rlVar;
                slVar2.f32597e0 = iMarker;
                Context context = plVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                plVar.addView(frameLayout, gb1.g(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                slVar2.f32599g0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                FrameLayout frameLayout3 = slVar2.f32599g0;
                org.telegram.ui.ActionBar.f7.y(frameLayout3, frameLayout3.getBackground(), org.telegram.ui.ActionBar.y6.f23427h5, u6Var, PorterDuff.Mode.MULTIPLY);
                frameLayout.addView(slVar2.f32599g0, gb1.g(71.0f, -2));
                slVar2.f32599g0.setAlpha(0.0f);
                slVar2.f32599g0.setOnClickListener(new ga(4, plVar, rlVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
                textView.setTypeface(AndroidUtilities.bold());
                int i14 = 3;
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout4 = slVar2.f32599g0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView k10 = org.telegram.ui.d3.k(frameLayout4, textView, gb1.h(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                k10.setTextSize(1, 14.0f);
                k10.setMaxLines(1);
                k10.setEllipsize(truncateAt);
                k10.setSingleLine(true);
                org.telegram.ui.ActionBar.f7.V(k10, org.telegram.ui.ActionBar.y6.A6, u6Var);
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                k10.setGravity(i12);
                FrameLayout frameLayout5 = slVar2.f32599g0;
                if (LocaleController.isRTL) {
                    i14 = 5;
                }
                frameLayout5.addView(k10, gb1.h(-2, -2.0f, i14 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(rlVar.f32266c.title);
                k10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout6 = new FrameLayout(context);
                frameLayout6.setBackground(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.y4.a(rlVar.f32264a)));
                frameLayout.addView(frameLayout6, gb1.h(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                y9 y9Var = new y9(context);
                y9Var.g(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), rlVar.f32266c.venue_type, "_64.png"), null, null);
                frameLayout6.addView(y9Var, gb1.i(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ol(plVar, frameLayout6));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                slVar2.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        sl slVar = this.f27197b;
        if (slVar.I != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-slVar.I) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }
}
