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
public final class qc0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.c2, IMapsProvider.OnCameraMoveStartedListener, fg.b, IMapsProvider.ITouchInterceptor {
    public final int f36018a;
    public final id0 f36019b;

    public qc0(id0 id0Var, int i10) {
        this.f36018a = i10;
        this.f36019b = id0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f36018a) {
            case 5:
                id0 id0Var = this.f36019b;
                ArrayList arrayList2 = id0Var.f33628k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((hd0) arrayList2.get(i10)).f33350b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(id0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f33349a = i11;
                            IMapsProvider.IMarker addMarker = id0Var.I.addMarker(position);
                            obj.f33350b = addMarker;
                            obj.f33351c = tL_messageMediaVenue;
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
                id0 id0Var2 = this.f36019b;
                id0Var2.f33639t0 = false;
                id0Var2.B0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f36018a) {
            case 1:
                id0 id0Var = this.f36019b;
                if (id0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        id0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                id0 id0Var2 = this.f36019b;
                if (id0Var2.getParentActivity() != null) {
                    try {
                        id0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f36019b.I;
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
        id0 id0Var = this.f36019b;
        int i11 = id0Var.G0;
        if (i10 == 1) {
            id0Var.y0(true);
            if (id0Var.m0 != null) {
                id0Var.X.setVisibility(0);
                fd0 fd0Var = id0Var.f33644x;
                IMapsProvider.IMarker iMarker = id0Var.m0;
                HashMap hashMap = fd0Var.f32785a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    fd0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                id0Var.m0 = null;
                id0Var.f33631n0 = null;
                id0Var.f33632o0 = null;
            }
            id0Var.f33626i0 = -1L;
            if (id0Var.f33627j0) {
                id0Var.f33627j0 = false;
                id0Var.C0();
            }
            if (!id0Var.Q) {
                if ((i11 == 0 || i11 == 1) && id0Var.U.getChildCount() > 0 && (childAt = id0Var.U.getChildAt(0)) != null) {
                    org.telegram.ui.Components.vl0 vl0Var = id0Var.U;
                    View F = vl0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = vl0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = id0Var.I.getCameraPosition();
                            id0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            id0Var.U.v0(0, top + dp, null);
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
        int i10 = this.f36018a;
        id0 id0Var = this.f36019b;
        switch (i10) {
            case 6:
                if (id0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-id0Var.N) / 2.0f);
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
                if (id0Var.B0 == null && id0Var.f33648z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = id0Var.f33629l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        id0Var.f33629l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        id0Var.f33629l0.playTogether(ObjectAnimator.ofFloat(id0Var.X, View.TRANSLATION_Y, id0Var.f33647y0 - AndroidUtilities.dp(10.0f)));
                        id0Var.f33629l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = id0Var.f33629l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        id0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        id0Var.f33629l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        id0Var.f33629l0.playTogether(ObjectAnimator.ofFloat(id0Var.X, View.TRANSLATION_Y, id0Var.f33647y0));
                        id0Var.f33629l0.start();
                        id0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!id0Var.C0) {
                            ImageView imageView = id0Var.f33614a;
                            int i11 = org.telegram.ui.ActionBar.j6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(id0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            id0Var.f33614a.setTag(Integer.valueOf(i11));
                            id0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = id0Var.I;
                        if (iMap != null && (location = id0Var.f33645x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            id0Var.f33645x0.setLongitude(id0Var.I.getCameraPosition().target.longitude);
                        }
                        id0Var.T.L(id0Var.f33645x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
