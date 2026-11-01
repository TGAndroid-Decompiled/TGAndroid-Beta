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
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class mk implements org.telegram.ui.ActionBar.o0, zf.b, org.telegram.messenger.cb, org.telegram.messenger.eb, org.telegram.messenger.fb, org.telegram.ui.ActionBar.u1 {
    public final int f28507a;
    public final bl f28508b;

    public mk(bl blVar, int i10) {
        this.f28507a = i10;
        this.f28508b = blVar;
    }

    @Override
    public void a(org.telegram.messenger.ga gaVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        bl blVar = this.f28508b;
        ImageView imageView = blVar.f24862n;
        if (gaVar.b() instanceof al) {
            blVar.Q.setVisibility(4);
            if (!blVar.f24868r0) {
                int i14 = org.telegram.ui.ActionBar.t6.ij;
                org.telegram.ui.ActionBar.a7.t(imageView, i14, blVar.f30963a, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i14));
                blVar.f24868r0 = true;
            }
            yk ykVar = blVar.D;
            ykVar.getClass();
            HashMap hashMap = ykVar.f32862a;
            al alVar = (al) gaVar.b();
            bl blVar2 = ykVar.f32863b;
            al alVar2 = blVar2.f24855f0;
            org.telegram.ui.ActionBar.p6 p6Var = blVar2.f30963a;
            if (alVar2 == alVar) {
                return;
            }
            blVar2.g0(false);
            org.telegram.messenger.ga gaVar2 = blVar2.f24854e0;
            if (gaVar2 != null) {
                View view = (View) hashMap.get(gaVar2);
                if (view != null) {
                    ykVar.removeView(view);
                    hashMap.remove(gaVar2);
                }
                blVar2.f24854e0 = null;
            }
            blVar2.f24855f0 = alVar;
            blVar2.f24854e0 = gaVar;
            Context context = ykVar.getContext();
            FrameLayout frameLayout = new FrameLayout(context);
            ykVar.addView(frameLayout, w7.b6.c(114.0f, -2));
            FrameLayout frameLayout2 = new FrameLayout(context);
            blVar2.f24856g0 = frameLayout2;
            frameLayout2.setBackgroundResource(2131232786);
            FrameLayout frameLayout3 = blVar2.f24856g0;
            org.telegram.ui.ActionBar.a7.y(frameLayout3, frameLayout3.getBackground(), org.telegram.ui.ActionBar.t6.f21002h5, p6Var, PorterDuff.Mode.MULTIPLY);
            frameLayout.addView(blVar2.f24856g0, w7.b6.c(71.0f, -2));
            blVar2.f24856g0.setAlpha(0.0f);
            blVar2.f24856g0.setOnClickListener(new org.telegram.ui.ud(23, ykVar, alVar));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setMaxLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setSingleLine(true);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
            textView.setTypeface(org.telegram.messenger.i0.o());
            if (org.telegram.messenger.dd.X) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10);
            FrameLayout frameLayout4 = blVar2.f24856g0;
            if (org.telegram.messenger.dd.X) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout4, textView, w7.b6.d(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
            l4.setTextSize(1, 14.0f);
            l4.setMaxLines(1);
            l4.setEllipsize(truncateAt);
            l4.setSingleLine(true);
            org.telegram.ui.ActionBar.a7.V(l4, org.telegram.ui.ActionBar.t6.A6, p6Var);
            if (org.telegram.messenger.dd.X) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            l4.setGravity(i12);
            FrameLayout frameLayout5 = blVar2.f24856g0;
            if (org.telegram.messenger.dd.X) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            frameLayout5.addView(l4, w7.b6.d(-2, -2.0f, i13 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
            textView.setText(alVar.f24438c.title);
            l4.setText(org.telegram.messenger.dd.L0(2131744280, null));
            FrameLayout frameLayout6 = new FrameLayout(context);
            frameLayout6.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(36.0f), org.telegram.ui.Cells.x4.a(alVar.f24436a)));
            frameLayout.addView(frameLayout6, w7.b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
            g9 g9Var = new g9(context);
            g9Var.h(a1.g.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), alVar.f24438c.venue_type, "_64.png"), null, null);
            frameLayout6.addView(g9Var, w7.b6.e(30, 30, 17));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new xk(ykVar, frameLayout6));
            ofFloat.setDuration(360L);
            ofFloat.start();
            hashMap.put(gaVar, frameLayout);
            blVar2.F.c(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(gaVar.a()), 300);
        }
    }

    @Override
    public void b(ArrayList arrayList) {
        switch (this.f28507a) {
            case 1:
                bl blVar = this.f28508b;
                ArrayList arrayList2 = blVar.f24852c0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((al) arrayList2.get(i10)).f24437b.c();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            org.telegram.messenger.bb onCreateMarkerOptions = ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            l2.f fVar = (l2.f) onCreateMarkerOptions;
                            ((j8.f) fVar.f11588b).f9717a = new LatLng(geoPoint.lat, geoPoint._long);
                            ((j8.f) fVar.f11588b).d = v7.n8.a(blVar.Z(i11));
                            fVar.e(0.5f);
                            String str = tL_messageMediaVenue.title;
                            j8.f fVar2 = (j8.f) fVar.f11588b;
                            fVar2.f9718b = str;
                            fVar2.f9719c = tL_messageMediaVenue.address;
                            ?? obj = new Object();
                            obj.f24436a = i11;
                            org.telegram.messenger.ga a2 = blVar.F.a(fVar);
                            obj.f24437b = a2;
                            obj.f24438c = tL_messageMediaVenue;
                            a2.f(obj);
                            arrayList2.add(obj);
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                    return;
                }
                return;
            default:
                bl blVar2 = this.f28508b;
                blVar2.f24860k0 = false;
                blVar2.i0();
                return;
        }
    }

    @Override
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ka kaVar) {
        MotionEvent motionEvent2;
        bl blVar = this.f28508b;
        if (blVar.I != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-blVar.I) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = kaVar.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override
    public void d(int i10) {
        View childAt;
        s4.c1 T;
        int L;
        bl blVar = this.f28508b;
        ag.b1 b1Var = blVar.N;
        if (i10 == 1) {
            blVar.g0(true);
            if (blVar.f24854e0 != null) {
                blVar.Q.setVisibility(0);
                yk ykVar = blVar.D;
                org.telegram.messenger.ga gaVar = blVar.f24854e0;
                HashMap hashMap = ykVar.f32862a;
                View view = (View) hashMap.get(gaVar);
                if (view != null) {
                    ykVar.removeView(view);
                    hashMap.remove(gaVar);
                }
                blVar.f24854e0 = null;
                blVar.f24855f0 = null;
                blVar.f24856g0 = null;
            }
            if (!blVar.J && b1Var.getChildCount() > 0 && (childAt = b1Var.getChildAt(0)) != null) {
                View F = b1Var.F(childAt);
                if (F == null) {
                    T = null;
                } else {
                    T = b1Var.T(F);
                }
                if (T != null && T.b() == 0) {
                    if (blVar.f24873v0 == 0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.i0.L(66.0f);
                    }
                    int top = childAt.getTop();
                    if (top < (-L)) {
                        jg.c0 d = blVar.F.d();
                        blVar.H = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.db) d.f9903b, d.f9904c);
                        b1Var.w0(0, top + L, null);
                    }
                }
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        bl.W(this.f28508b);
    }

    @Override
    public void k(int i10) {
        org.telegram.messenger.ha haVar = this.f28508b.F;
        if (haVar != null) {
            if (i10 == 2) {
                haVar.k(0);
            } else if (i10 == 3) {
                haVar.k(1);
            } else if (i10 == 4) {
                haVar.k(2);
            }
        }
    }
}
