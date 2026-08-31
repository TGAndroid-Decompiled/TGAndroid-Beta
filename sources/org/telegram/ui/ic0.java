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
public final class ic0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.c2, IMapsProvider.OnCameraMoveStartedListener, uf.b, IMapsProvider.ITouchInterceptor {
    public final int f37796a;
    public final bd0 f37797b;

    public ic0(bd0 bd0Var, int i10) {
        this.f37796a = i10;
        this.f37797b = bd0Var;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f37796a) {
            case 5:
                bd0 bd0Var = this.f37797b;
                ArrayList arrayList2 = bd0Var.f35464h0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ad0) arrayList2.get(i10)).f35133b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(bd0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f35132a = i11;
                            IMapsProvider.IMarker addMarker = bd0Var.F.addMarker(position);
                            obj.f35133b = addMarker;
                            obj.f35134c = tL_messageMediaVenue;
                            addMarker.setTag(obj);
                            arrayList2.add(obj);
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    }
                    return;
                }
                return;
            default:
                bd0 bd0Var2 = this.f37797b;
                bd0Var2.f35473q0 = false;
                bd0Var2.B0();
                return;
        }
    }

    @Override
    public void h(int i10) {
        IMapsProvider.IMap iMap = this.f37797b.F;
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
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37796a) {
            case 1:
                bd0 bd0Var = this.f37797b;
                if (bd0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        bd0Var.getParentActivity().startActivity(intent);
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                return;
            default:
                bd0 bd0Var2 = this.f37797b;
                if (bd0Var2.getParentActivity() != null) {
                    try {
                        bd0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onCameraMoveStarted(int i10) {
        View childAt;
        f2.m1 T;
        int dp;
        bd0 bd0Var = this.f37797b;
        int i11 = bd0Var.D0;
        if (i10 == 1) {
            bd0Var.y0(true);
            if (bd0Var.f35466j0 != null) {
                bd0Var.U.setVisibility(0);
                yc0 yc0Var = bd0Var.f35483x;
                IMapsProvider.IMarker iMarker = bd0Var.f35466j0;
                HashMap hashMap = yc0Var.f43600a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    yc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                bd0Var.f35466j0 = null;
                bd0Var.f35467k0 = null;
                bd0Var.f35468l0 = null;
            }
            bd0Var.f35462f0 = -1L;
            if (bd0Var.f35463g0) {
                bd0Var.f35463g0 = false;
                bd0Var.C0();
            }
            if (!bd0Var.N) {
                if ((i11 == 0 || i11 == 1) && bd0Var.R.getChildCount() > 0 && (childAt = bd0Var.R.getChildAt(0)) != null) {
                    org.telegram.ui.Components.tl0 tl0Var = bd0Var.R;
                    View F = tl0Var.F(childAt);
                    if (F == null) {
                        T = null;
                    } else {
                        T = tl0Var.T(F);
                    }
                    if (T != null && T.b() == 0) {
                        if (i11 == 0) {
                            dp = 0;
                        } else {
                            dp = AndroidUtilities.dp(66.0f);
                        }
                        int top = childAt.getTop();
                        if (top < (-dp)) {
                            IMapsProvider.CameraPosition cameraPosition = bd0Var.F.getCameraPosition();
                            bd0Var.I = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                            bd0Var.R.v0(0, top + dp, null);
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
        int i10 = this.f37796a;
        bd0 bd0Var = this.f37797b;
        switch (i10) {
            case 6:
                if (bd0Var.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-bd0Var.K) / 2.0f);
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
                if (bd0Var.f35486y0 == null && bd0Var.f35482w0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = bd0Var.f35465i0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        bd0Var.f35465i0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        bd0Var.f35465i0.playTogether(ObjectAnimator.ofFloat(bd0Var.U, View.TRANSLATION_Y, bd0Var.f35480v0 - AndroidUtilities.dp(10.0f)));
                        bd0Var.f35465i0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = bd0Var.f35465i0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        bd0Var.K = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        bd0Var.f35465i0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        bd0Var.f35465i0.playTogether(ObjectAnimator.ofFloat(bd0Var.U, View.TRANSLATION_Y, bd0Var.f35480v0));
                        bd0Var.f35465i0.start();
                        bd0Var.Q.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!bd0Var.f35487z0) {
                            ImageView imageView = bd0Var.f35452a;
                            int i11 = org.telegram.ui.ActionBar.k6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(bd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            bd0Var.f35452a.setTag(Integer.valueOf(i11));
                            bd0Var.f35487z0 = true;
                        }
                        IMapsProvider.IMap iMap = bd0Var.F;
                        if (iMap != null && (location = bd0Var.f35479u0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            bd0Var.f35479u0.setLongitude(bd0Var.F.getCameraPosition().target.longitude);
                        }
                        bd0Var.Q.L(bd0Var.f35479u0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
