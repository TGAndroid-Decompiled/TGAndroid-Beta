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
public final class cl implements org.telegram.ui.ActionBar.q0, hg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.z1 {
    public final int f25374a;
    public final rl f25375b;

    public cl(rl rlVar, int i10) {
        this.f25374a = i10;
        this.f25375b = rlVar;
    }

    @Override
    public void a(ArrayList arrayList) {
        switch (this.f25374a) {
            case 1:
                rl rlVar = this.f25375b;
                ArrayList arrayList2 = rlVar.f30192c0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ql) arrayList2.get(i10)).f29937b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(rlVar.Z(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ?? obj = new Object();
                            obj.f29936a = i11;
                            IMapsProvider.IMarker addMarker = rlVar.F.addMarker(position);
                            obj.f29937b = addMarker;
                            obj.f29938c = tL_messageMediaVenue;
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
                rl rlVar2 = this.f25375b;
                rlVar2.f30201l0 = false;
                rlVar2.j0();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        rl.W(this.f25375b);
    }

    @Override
    public void h(int i10) {
        IMapsProvider.IMap iMap = this.f25375b.F;
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
        rl rlVar = this.f25375b;
        ai.u1 u1Var = rlVar.N;
        if (i10 == 1) {
            rlVar.h0(true);
            if (rlVar.f30194e0 != null) {
                rlVar.Q.setVisibility(0);
                ol olVar = rlVar.f30218y;
                IMapsProvider.IMarker iMarker = rlVar.f30194e0;
                HashMap hashMap = olVar.f29227a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    olVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                rlVar.f30194e0 = null;
                rlVar.f30195f0 = null;
                rlVar.f30196g0 = null;
            }
            if (!rlVar.J && u1Var.getChildCount() > 0 && (childAt = u1Var.getChildAt(0)) != null) {
                View F = u1Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = u1Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (rlVar.f30215w0 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        IMapsProvider.CameraPosition cameraPosition = rlVar.F.getCameraPosition();
                        rlVar.H = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                        u1Var.v0(0, top + dp, null);
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
        rl rlVar = this.f25375b;
        ImageView imageView = rlVar.f30202n;
        if (iMarker.getTag() instanceof ql) {
            rlVar.Q.setVisibility(4);
            if (!rlVar.f30210s0) {
                int i13 = org.telegram.ui.ActionBar.k6.ui;
                org.telegram.ui.ActionBar.r6.t(imageView, i13, rlVar.f28365a, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i13));
                rlVar.f30210s0 = true;
            }
            ol olVar = rlVar.f30218y;
            olVar.getClass();
            HashMap hashMap = olVar.f29227a;
            ql qlVar = (ql) iMarker.getTag();
            rl rlVar2 = olVar.f29228b;
            ql qlVar2 = rlVar2.f30195f0;
            org.telegram.ui.ActionBar.g6 g6Var = rlVar2.f28365a;
            if (qlVar2 != qlVar) {
                rlVar2.h0(false);
                IMapsProvider.IMarker iMarker2 = rlVar2.f30194e0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        olVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    rlVar2.f30194e0 = null;
                }
                rlVar2.f30195f0 = qlVar;
                rlVar2.f30194e0 = iMarker;
                Context context = olVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                olVar.addView(frameLayout, w7.z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                rlVar2.f30196g0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                FrameLayout frameLayout3 = rlVar2.f30196g0;
                org.telegram.ui.ActionBar.r6.z(frameLayout3, frameLayout3.getBackground(), org.telegram.ui.ActionBar.k6.f21254h5, g6Var, PorterDuff.Mode.MULTIPLY);
                frameLayout.addView(rlVar2.f30196g0, w7.z5.c(71.0f, -2));
                rlVar2.f30196g0.setAlpha(0.0f);
                rlVar2.f30196g0.setOnClickListener(new ca(3, olVar, qlVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
                textView.setTypeface(AndroidUtilities.bold());
                int i14 = 5;
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout4 = rlVar2.f30196g0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView j10 = org.telegram.ui.Cells.b1.j(frameLayout4, textView, w7.z5.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                j10.setTextSize(1, 14.0f);
                j10.setMaxLines(1);
                j10.setEllipsize(truncateAt);
                j10.setSingleLine(true);
                org.telegram.ui.ActionBar.r6.W(j10, org.telegram.ui.ActionBar.k6.A6, g6Var);
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                j10.setGravity(i12);
                FrameLayout frameLayout5 = rlVar2.f30196g0;
                if (!LocaleController.isRTL) {
                    i14 = 3;
                }
                frameLayout5.addView(j10, w7.z5.d(-2, -2.0f, i14 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(qlVar.f29938c.title);
                j10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout6 = new FrameLayout(context);
                frameLayout6.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.t4.a(qlVar.f29936a)));
                frameLayout.addView(frameLayout6, w7.z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.g(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), qlVar.f29938c.venue_type, "_64.png"), null, null);
                frameLayout6.addView(w9Var, w7.z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new nl(olVar, frameLayout6));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                rlVar2.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        rl rlVar = this.f25375b;
        if (rlVar.I != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-rlVar.I) / 2.0f);
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
