package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.tgnet.TLRPC;
public final class oc0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.z1, IMapsProvider.OnCameraMoveStartedListener, gg.b, IMapsProvider.ITouchInterceptor {
    public final int f40509a;
    public final gd0 f40510b;

    public oc0(gd0 gd0Var, int i10) {
        this.f40509a = i10;
        this.f40510b = gd0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f40509a) {
            case 5:
                gd0 gd0Var = this.f40510b;
                ArrayList arrayList2 = gd0Var.f38028k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((fd0) arrayList2.get(i10)).f37643b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(gd0Var.e0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f37642a = i11;
                            IMapsProvider.IMarker addMarker = gd0Var.I.addMarker(position);
                            obj.f37643b = addMarker;
                            obj.f37644c = tL_messageMediaVenue;
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
                gd0 gd0Var2 = this.f40510b;
                gd0Var2.f38039t0 = false;
                gd0Var2.A0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40509a) {
            case 1:
                gd0 gd0Var = this.f40510b;
                if (gd0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        gd0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            default:
                gd0 gd0Var2 = this.f40510b;
                if (gd0Var2.getParentActivity() != null) {
                    try {
                        gd0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f40510b.I;
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
        gd0 gd0Var = this.f40510b;
        int i11 = gd0Var.G0;
        if (i10 == 1) {
            gd0Var.x0(true);
            if (gd0Var.m0 != null) {
                gd0Var.X.setVisibility(0);
                dd0 dd0Var = gd0Var.f38044x;
                IMapsProvider.IMarker iMarker = gd0Var.m0;
                HashMap hashMap = dd0Var.f36987a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    dd0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                gd0Var.m0 = null;
                gd0Var.f38031n0 = null;
                gd0Var.f38032o0 = null;
            }
            gd0Var.f38026i0 = -1L;
            if (gd0Var.f38027j0) {
                gd0Var.f38027j0 = false;
                gd0Var.B0();
            }
            if (!gd0Var.Q) {
                if ((i11 == 0 || i11 == 1) && gd0Var.U.getChildCount() > 0 && (childAt = gd0Var.U.getChildAt(0)) != null) {
                    org.telegram.ui.Components.sm0 sm0Var = gd0Var.U;
                    View F = sm0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = sm0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = gd0Var.I.getCameraPosition();
                            gd0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            gd0Var.U.v0(0, top + dp, null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.f40509a;
        gd0 gd0Var = this.f40510b;
        switch (i10) {
            case 6:
                if (gd0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-gd0Var.N) / 2.0f);
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
                if (gd0Var.B0 == null && gd0Var.f38048z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = gd0Var.f38029l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        gd0Var.f38029l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        gd0Var.f38029l0.playTogether(ObjectAnimator.ofFloat(gd0Var.X, View.TRANSLATION_Y, gd0Var.f38047y0 - AndroidUtilities.dp(10.0f)));
                        gd0Var.f38029l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = gd0Var.f38029l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        gd0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        gd0Var.f38029l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        gd0Var.f38029l0.playTogether(ObjectAnimator.ofFloat(gd0Var.X, View.TRANSLATION_Y, gd0Var.f38047y0));
                        gd0Var.f38029l0.start();
                        gd0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!gd0Var.C0) {
                            ImageView imageView = gd0Var.f38013a;
                            int i11 = org.telegram.ui.ActionBar.h6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(gd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            gd0Var.f38013a.setTag(Integer.valueOf(i11));
                            gd0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = gd0Var.I;
                        if (iMap != null && (location = gd0Var.f38045x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            gd0Var.f38045x0.setLongitude(gd0Var.I.getCameraPosition().target.longitude);
                        }
                        gd0Var.T.L(gd0Var.f38045x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
