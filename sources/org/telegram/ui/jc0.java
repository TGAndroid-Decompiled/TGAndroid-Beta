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
public final class jc0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.c2, IMapsProvider.OnCameraMoveStartedListener, tf.b, IMapsProvider.ITouchInterceptor {
    public final int f35164a;
    public final cd0 f35165b;

    public jc0(cd0 cd0Var, int i10) {
        this.f35164a = i10;
        this.f35165b = cd0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f35164a) {
            case 5:
                cd0 cd0Var = this.f35165b;
                ArrayList arrayList2 = cd0Var.f33094h0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((bd0) arrayList2.get(i10)).f32850b.remove();
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
                            obj.f32849a = i11;
                            IMapsProvider.IMarker addMarker = cd0Var.F.addMarker(position);
                            obj.f32850b = addMarker;
                            obj.f32851c = tL_messageMediaVenue;
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
                cd0 cd0Var2 = this.f35165b;
                cd0Var2.f33103q0 = false;
                cd0Var2.B0();
                return;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35164a) {
            case 1:
                cd0 cd0Var = this.f35165b;
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
                cd0 cd0Var2 = this.f35165b;
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
        IMapsProvider.IMap iMap = this.f35165b.F;
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
        f2.l1 T;
        int dp;
        cd0 cd0Var = this.f35165b;
        int i11 = cd0Var.D0;
        if (i10 == 1) {
            cd0Var.y0(true);
            if (cd0Var.f33096j0 != null) {
                cd0Var.U.setVisibility(0);
                zc0 zc0Var = cd0Var.f33113x;
                IMapsProvider.IMarker iMarker = cd0Var.f33096j0;
                HashMap hashMap = zc0Var.f40443a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    zc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                cd0Var.f33096j0 = null;
                cd0Var.f33097k0 = null;
                cd0Var.f33098l0 = null;
            }
            cd0Var.f33092f0 = -1L;
            if (cd0Var.f33093g0) {
                cd0Var.f33093g0 = false;
                cd0Var.C0();
            }
            if (!cd0Var.N) {
                if ((i11 == 0 || i11 == 1) && cd0Var.R.getChildCount() > 0 && (childAt = cd0Var.R.getChildAt(0)) != null) {
                    org.telegram.ui.Components.rl0 rl0Var = cd0Var.R;
                    View F = rl0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = rl0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = cd0Var.F.getCameraPosition();
                            cd0Var.I = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            cd0Var.R.v0(0, top + dp, null);
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
        int i10 = this.f35164a;
        cd0 cd0Var = this.f35165b;
        switch (i10) {
            case 6:
                if (cd0Var.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-cd0Var.K) / 2.0f);
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
                if (cd0Var.f33116y0 == null && cd0Var.f33112w0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = cd0Var.f33095i0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        cd0Var.f33095i0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        cd0Var.f33095i0.playTogether(ObjectAnimator.ofFloat(cd0Var.U, View.TRANSLATION_Y, cd0Var.f33110v0 - AndroidUtilities.dp(10.0f)));
                        cd0Var.f33095i0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = cd0Var.f33095i0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        cd0Var.K = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        cd0Var.f33095i0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        cd0Var.f33095i0.playTogether(ObjectAnimator.ofFloat(cd0Var.U, View.TRANSLATION_Y, cd0Var.f33110v0));
                        cd0Var.f33095i0.start();
                        cd0Var.Q.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!cd0Var.f33117z0) {
                            ImageView imageView = cd0Var.f33083a;
                            int i11 = org.telegram.ui.ActionBar.j6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(cd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            cd0Var.f33083a.setTag(Integer.valueOf(i11));
                            cd0Var.f33117z0 = true;
                        }
                        IMapsProvider.IMap iMap = cd0Var.F;
                        if (iMap != null && (location = cd0Var.f33109u0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            cd0Var.f33109u0.setLongitude(cd0Var.F.getCameraPosition().target.longitude);
                        }
                        cd0Var.Q.L(cd0Var.f33109u0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
