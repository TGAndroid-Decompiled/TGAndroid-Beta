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
public final class hc0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.c2, IMapsProvider.OnCameraMoveStartedListener, tf.b, IMapsProvider.ITouchInterceptor {
    public final int f34811a;
    public final ad0 f34812b;

    public hc0(ad0 ad0Var, int i10) {
        this.f34811a = i10;
        this.f34812b = ad0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f34811a) {
            case 5:
                ad0 ad0Var = this.f34812b;
                ArrayList arrayList2 = ad0Var.f32532h0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((zc0) arrayList2.get(i10)).f40765b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(ad0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f40764a = i11;
                            IMapsProvider.IMarker addMarker = ad0Var.F.addMarker(position);
                            obj.f40765b = addMarker;
                            obj.f40766c = tL_messageMediaVenue;
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
                ad0 ad0Var2 = this.f34812b;
                ad0Var2.f32541q0 = false;
                ad0Var2.B0();
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f34811a) {
            case 1:
                ad0 ad0Var = this.f34812b;
                if (ad0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        ad0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                ad0 ad0Var2 = this.f34812b;
                if (ad0Var2.getParentActivity() != null) {
                    try {
                        ad0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void l(int i10) {
        IMapsProvider.IMap iMap = this.f34812b.F;
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
        ad0 ad0Var = this.f34812b;
        int i11 = ad0Var.D0;
        if (i10 == 1) {
            ad0Var.y0(true);
            if (ad0Var.f32534j0 != null) {
                ad0Var.U.setVisibility(0);
                xc0 xc0Var = ad0Var.f32551x;
                IMapsProvider.IMarker iMarker = ad0Var.f32534j0;
                HashMap hashMap = xc0Var.f39895a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    xc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                ad0Var.f32534j0 = null;
                ad0Var.f32535k0 = null;
                ad0Var.f32536l0 = null;
            }
            ad0Var.f32530f0 = -1L;
            if (ad0Var.f32531g0) {
                ad0Var.f32531g0 = false;
                ad0Var.C0();
            }
            if (!ad0Var.N) {
                if ((i11 == 0 || i11 == 1) && ad0Var.R.getChildCount() > 0 && (childAt = ad0Var.R.getChildAt(0)) != null) {
                    org.telegram.ui.Components.sl0 sl0Var = ad0Var.R;
                    View F = sl0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = sl0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = ad0Var.F.getCameraPosition();
                            ad0Var.I = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            ad0Var.R.v0(0, top + dp, null);
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
        int i10 = this.f34811a;
        ad0 ad0Var = this.f34812b;
        switch (i10) {
            case 6:
                if (ad0Var.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-ad0Var.K) / 2.0f);
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
                if (ad0Var.f32554y0 == null && ad0Var.f32550w0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = ad0Var.f32533i0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ad0Var.f32533i0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        ad0Var.f32533i0.playTogether(ObjectAnimator.ofFloat(ad0Var.U, View.TRANSLATION_Y, ad0Var.f32548v0 - AndroidUtilities.dp(10.0f)));
                        ad0Var.f32533i0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = ad0Var.f32533i0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        ad0Var.K = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        ad0Var.f32533i0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        ad0Var.f32533i0.playTogether(ObjectAnimator.ofFloat(ad0Var.U, View.TRANSLATION_Y, ad0Var.f32548v0));
                        ad0Var.f32533i0.start();
                        ad0Var.Q.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!ad0Var.f32555z0) {
                            ImageView imageView = ad0Var.f32521a;
                            int i11 = org.telegram.ui.ActionBar.j6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(ad0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            ad0Var.f32521a.setTag(Integer.valueOf(i11));
                            ad0Var.f32555z0 = true;
                        }
                        IMapsProvider.IMap iMap = ad0Var.F;
                        if (iMap != null && (location = ad0Var.f32547u0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            ad0Var.f32547u0.setLongitude(ad0Var.F.getCameraPosition().target.longitude);
                        }
                        ad0Var.Q.L(ad0Var.f32547u0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
