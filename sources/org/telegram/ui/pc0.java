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
public final class pc0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.a2, IMapsProvider.OnCameraMoveStartedListener, gg.b, IMapsProvider.ITouchInterceptor {
    public final int f40811a;
    public final hd0 f40812b;

    public pc0(hd0 hd0Var, int i10) {
        this.f40811a = i10;
        this.f40812b = hd0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f40811a) {
            case 5:
                hd0 hd0Var = this.f40812b;
                ArrayList arrayList2 = hd0Var.f38314k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((gd0) arrayList2.get(i10)).f38025b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(hd0Var.e0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f38024a = i11;
                            IMapsProvider.IMarker addMarker = hd0Var.I.addMarker(position);
                            obj.f38025b = addMarker;
                            obj.f38026c = tL_messageMediaVenue;
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
                hd0 hd0Var2 = this.f40812b;
                hd0Var2.f38325t0 = false;
                hd0Var2.A0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40811a) {
            case 1:
                hd0 hd0Var = this.f40812b;
                if (hd0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        hd0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            default:
                hd0 hd0Var2 = this.f40812b;
                if (hd0Var2.getParentActivity() != null) {
                    try {
                        hd0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f40812b.I;
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
        hd0 hd0Var = this.f40812b;
        int i11 = hd0Var.G0;
        if (i10 == 1) {
            hd0Var.x0(true);
            if (hd0Var.m0 != null) {
                hd0Var.X.setVisibility(0);
                ed0 ed0Var = hd0Var.f38330x;
                IMapsProvider.IMarker iMarker = hd0Var.m0;
                HashMap hashMap = ed0Var.f37277a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    ed0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                hd0Var.m0 = null;
                hd0Var.f38317n0 = null;
                hd0Var.f38318o0 = null;
            }
            hd0Var.f38312i0 = -1L;
            if (hd0Var.f38313j0) {
                hd0Var.f38313j0 = false;
                hd0Var.B0();
            }
            if (!hd0Var.Q) {
                if ((i11 == 0 || i11 == 1) && hd0Var.U.getChildCount() > 0 && (childAt = hd0Var.U.getChildAt(0)) != null) {
                    org.telegram.ui.Components.rm0 rm0Var = hd0Var.U;
                    View F = rm0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = rm0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = hd0Var.I.getCameraPosition();
                            hd0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            hd0Var.U.v0(0, top + dp, null);
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
        int i10 = this.f40811a;
        hd0 hd0Var = this.f40812b;
        switch (i10) {
            case 6:
                if (hd0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-hd0Var.N) / 2.0f);
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
                if (hd0Var.B0 == null && hd0Var.f38334z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = hd0Var.f38315l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        hd0Var.f38315l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        hd0Var.f38315l0.playTogether(ObjectAnimator.ofFloat(hd0Var.X, View.TRANSLATION_Y, hd0Var.f38333y0 - AndroidUtilities.dp(10.0f)));
                        hd0Var.f38315l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = hd0Var.f38315l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        hd0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        hd0Var.f38315l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        hd0Var.f38315l0.playTogether(ObjectAnimator.ofFloat(hd0Var.X, View.TRANSLATION_Y, hd0Var.f38333y0));
                        hd0Var.f38315l0.start();
                        hd0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!hd0Var.C0) {
                            ImageView imageView = hd0Var.f38299a;
                            int i11 = org.telegram.ui.ActionBar.i6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(hd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            hd0Var.f38299a.setTag(Integer.valueOf(i11));
                            hd0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = hd0Var.I;
                        if (iMap != null && (location = hd0Var.f38331x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            hd0Var.f38331x0.setLongitude(hd0Var.I.getCameraPosition().target.longitude);
                        }
                        hd0Var.T.L(hd0Var.f38331x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
