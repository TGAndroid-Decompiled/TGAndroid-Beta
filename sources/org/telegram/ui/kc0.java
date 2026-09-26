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
public final class kc0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.z1, IMapsProvider.OnCameraMoveStartedListener, gg.b, IMapsProvider.ITouchInterceptor {
    public final int f35030a;
    public final cd0 f35031b;

    public kc0(cd0 cd0Var, int i10) {
        this.f35030a = i10;
        this.f35031b = cd0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f35030a) {
            case 5:
                cd0 cd0Var = this.f35031b;
                ArrayList arrayList2 = cd0Var.f32668k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((bd0) arrayList2.get(i10)).f32390b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(cd0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f32389a = i11;
                            IMapsProvider.IMarker addMarker = cd0Var.I.addMarker(position);
                            obj.f32390b = addMarker;
                            obj.f32391c = tL_messageMediaVenue;
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
                cd0 cd0Var2 = this.f35031b;
                cd0Var2.f32679t0 = false;
                cd0Var2.B0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f35030a) {
            case 1:
                cd0 cd0Var = this.f35031b;
                if (cd0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        cd0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                cd0 cd0Var2 = this.f35031b;
                if (cd0Var2.getParentActivity() != null) {
                    try {
                        cd0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f35031b.I;
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
        cd0 cd0Var = this.f35031b;
        int i11 = cd0Var.G0;
        if (i10 == 1) {
            cd0Var.y0(true);
            if (cd0Var.m0 != null) {
                cd0Var.X.setVisibility(0);
                zc0 zc0Var = cd0Var.f32684x;
                IMapsProvider.IMarker iMarker = cd0Var.m0;
                HashMap hashMap = zc0Var.f40443a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    zc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                cd0Var.m0 = null;
                cd0Var.f32671n0 = null;
                cd0Var.f32672o0 = null;
            }
            cd0Var.f32666i0 = -1L;
            if (cd0Var.f32667j0) {
                cd0Var.f32667j0 = false;
                cd0Var.C0();
            }
            if (!cd0Var.Q) {
                if ((i11 == 0 || i11 == 1) && cd0Var.U.getChildCount() > 0 && (childAt = cd0Var.U.getChildAt(0)) != null) {
                    org.telegram.ui.Components.xl0 xl0Var = cd0Var.U;
                    View F = xl0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = xl0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = cd0Var.I.getCameraPosition();
                            cd0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            cd0Var.U.v0(0, top + dp, null);
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
        int i10 = this.f35030a;
        cd0 cd0Var = this.f35031b;
        switch (i10) {
            case 6:
                if (cd0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-cd0Var.N) / 2.0f);
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
                if (cd0Var.B0 == null && cd0Var.f32688z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = cd0Var.f32669l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        cd0Var.f32669l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        cd0Var.f32669l0.playTogether(ObjectAnimator.ofFloat(cd0Var.X, View.TRANSLATION_Y, cd0Var.f32687y0 - AndroidUtilities.dp(10.0f)));
                        cd0Var.f32669l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = cd0Var.f32669l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        cd0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        cd0Var.f32669l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        cd0Var.f32669l0.playTogether(ObjectAnimator.ofFloat(cd0Var.X, View.TRANSLATION_Y, cd0Var.f32687y0));
                        cd0Var.f32669l0.start();
                        cd0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!cd0Var.C0) {
                            ImageView imageView = cd0Var.f32654a;
                            int i11 = org.telegram.ui.ActionBar.h6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(cd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            cd0Var.f32654a.setTag(Integer.valueOf(i11));
                            cd0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = cd0Var.I;
                        if (iMap != null && (location = cd0Var.f32685x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            cd0Var.f32685x0.setLongitude(cd0Var.I.getCameraPosition().target.longitude);
                        }
                        cd0Var.T.L(cd0Var.f32685x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
