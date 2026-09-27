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
public final class nc0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.b2, IMapsProvider.OnCameraMoveStartedListener, gg.b, IMapsProvider.ITouchInterceptor {
    public final int f35929a;
    public final fd0 f35930b;

    public nc0(fd0 fd0Var, int i10) {
        this.f35929a = i10;
        this.f35930b = fd0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f35929a) {
            case 5:
                fd0 fd0Var = this.f35930b;
                ArrayList arrayList2 = fd0Var.f33500k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ed0) arrayList2.get(i10)).f33222b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(fd0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f33221a = i11;
                            IMapsProvider.IMarker addMarker = fd0Var.I.addMarker(position);
                            obj.f33222b = addMarker;
                            obj.f33223c = tL_messageMediaVenue;
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
                fd0 fd0Var2 = this.f35930b;
                fd0Var2.f33511t0 = false;
                fd0Var2.B0();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f35929a) {
            case 1:
                fd0 fd0Var = this.f35930b;
                if (fd0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        fd0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                fd0 fd0Var2 = this.f35930b;
                if (fd0Var2.getParentActivity() != null) {
                    try {
                        fd0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.f35930b.I;
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
        fd0 fd0Var = this.f35930b;
        int i11 = fd0Var.G0;
        if (i10 == 1) {
            fd0Var.y0(true);
            if (fd0Var.m0 != null) {
                fd0Var.X.setVisibility(0);
                cd0 cd0Var = fd0Var.f33516x;
                IMapsProvider.IMarker iMarker = fd0Var.m0;
                HashMap hashMap = cd0Var.f32695a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    cd0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                fd0Var.m0 = null;
                fd0Var.f33503n0 = null;
                fd0Var.f33504o0 = null;
            }
            fd0Var.f33498i0 = -1L;
            if (fd0Var.f33499j0) {
                fd0Var.f33499j0 = false;
                fd0Var.C0();
            }
            if (!fd0Var.Q) {
                if ((i11 == 0 || i11 == 1) && fd0Var.U.getChildCount() > 0 && (childAt = fd0Var.U.getChildAt(0)) != null) {
                    org.telegram.ui.Components.yl0 yl0Var = fd0Var.U;
                    View G = yl0Var.G(childAt);
                    if (G == null) {
                        U = null;
                    } else {
                        U = yl0Var.U(G);
                    }
                    if (U != null && U.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = fd0Var.I.getCameraPosition();
                            fd0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            fd0Var.U.w0(0, top + dp, null);
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
        int i10 = this.f35929a;
        fd0 fd0Var = this.f35930b;
        switch (i10) {
            case 6:
                if (fd0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-fd0Var.N) / 2.0f);
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
                if (fd0Var.B0 == null && fd0Var.f33520z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = fd0Var.f33501l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        fd0Var.f33501l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        fd0Var.f33501l0.playTogether(ObjectAnimator.ofFloat(fd0Var.X, View.TRANSLATION_Y, fd0Var.f33519y0 - AndroidUtilities.dp(10.0f)));
                        fd0Var.f33501l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = fd0Var.f33501l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        fd0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        fd0Var.f33501l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        fd0Var.f33501l0.playTogether(ObjectAnimator.ofFloat(fd0Var.X, View.TRANSLATION_Y, fd0Var.f33519y0));
                        fd0Var.f33501l0.start();
                        fd0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!fd0Var.C0) {
                            ImageView imageView = fd0Var.f33486a;
                            int i11 = org.telegram.ui.ActionBar.i6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(fd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            fd0Var.f33486a.setTag(Integer.valueOf(i11));
                            fd0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = fd0Var.I;
                        if (iMap != null && (location = fd0Var.f33517x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            fd0Var.f33517x0.setLongitude(fd0Var.I.getCameraPosition().target.longitude);
                        }
                        fd0Var.T.L(fd0Var.f33517x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
