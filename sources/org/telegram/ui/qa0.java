package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public class qa0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public Location A0;
    public int B0;
    public bg.m C0;
    public org.telegram.messenger.ca D0;
    public boolean E;
    public boolean E0;
    public org.telegram.messenger.da F;
    public org.telegram.messenger.qa F0;
    public org.telegram.messenger.sa G;
    public da0 G0;
    public org.telegram.messenger.xa H;
    public TLRPC.TL_channelLocation H0;
    public org.telegram.messenger.sa I;
    public TLRPC.TL_channelLocation I0;
    public boolean J;
    public org.telegram.messenger.fj J0;
    public float K;
    public boolean K0;
    public k8.a L;
    public boolean L0;
    public double M;
    public na0 M0;
    public boolean N;
    public final int N0;
    public org.telegram.ui.Components.ug0 O;
    public int O0;
    public bi.p2 P;
    public la0 P0;
    public ia0 Q;
    public aa0 Q0;
    public et R;
    public ka0 R0;
    public org.telegram.ui.Components.ck0 S;
    public org.telegram.ui.Cells.y3 S0;
    public org.telegram.ui.Components.il T;
    public TL_stories.MediaArea T0;
    public View U;
    public boolean U0;
    public v4.c0 V;
    public boolean V0;
    public org.telegram.ui.ActionBar.h5 W;
    public Boolean W0;
    public FrameLayout X;
    public FrameLayout Y;
    public fh.g Z;
    public ImageView f51106a;
    public final RectF f51107a0;
    public TextView f51108b;
    public int f51109b0;
    public ImageView f51110c;
    public int f51111c0;
    public org.telegram.ui.ActionBar.h5 d;
    public TextureView f51112d0;
    public LinearLayout f51113e;
    public org.telegram.ui.Components.u80 f51114e0;
    public ImageView f51115f;
    public final RectF f51116f0;
    public final Paint f51117g0;
    public TextView h;
    public int f51118h0;
    public boolean f51119i0;
    public boolean f51120j0;
    public boolean f51121k0;
    public boolean f51122l0;
    public long m0;
    public TextView f51123n;
    public boolean f51124n0;
    public final ArrayList f51125o0;
    public final a0.h f51126p0;
    public long f51127q0;
    public org.telegram.ui.ActionBar.h5 f51128r;
    public boolean f51129r0;
    public hi.m3 f51130s;
    public AnimatorSet f51131s0;
    public boolean f51132t0;
    public boolean f51133u0;
    public boolean f51134v0;
    public boolean f51135w;
    public boolean f51136w0;
    public final UndoView[] f51137x;
    public boolean f51138x0;
    public boolean f51139y;
    public boolean f51140y0;
    public Location f51141z0;

    public qa0(int i7) {
        super(null);
        this.f51137x = new UndoView[2];
        this.f51107a0 = new RectF();
        this.f51116f0 = new RectF();
        this.f51117g0 = new Paint();
        this.f51120j0 = true;
        this.f51121k0 = false;
        this.f51122l0 = true;
        this.f51124n0 = true;
        this.f51125o0 = new ArrayList();
        this.f51126p0 = new a0.h();
        this.f51127q0 = -1L;
        this.f51132t0 = true;
        this.O0 = (org.telegram.messenger.g0.f24118q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.V0 = true;
        this.N0 = i7;
        org.telegram.messenger.g0.a0();
    }

    public static void Z(qa0 qa0Var, Canvas canvas, RectF rectF) {
        ai.k0 k0Var;
        Paint paint = qa0Var.f51117g0;
        int i7 = org.telegram.ui.ActionBar.n6.f29467h5;
        paint.setColor(qa0Var.getThemedColor(i7));
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) qa0Var.fragmentView;
        org.telegram.ui.Components.ck0 ck0Var = qa0Var.S;
        if (ck0Var != null && ck0Var.getVisibility() == 0) {
            org.telegram.ui.Components.ck0 ck0Var2 = qa0Var.S;
            ih.d.a(ck0Var2, canvas, rectF, ck0Var2, viewGroup);
            return;
        }
        if (qa0Var.P.getVisibility() == 0) {
            RectF rectF2 = qa0Var.f51116f0;
            canvas.save();
            canvas.translate(qa0Var.P.getX(), qa0Var.P.getY());
            canvas.clipRect(0.0f, 0.0f, qa0Var.P.getWidth(), viewGroup.getHeight() - qa0Var.P.getY());
            Drawable background = qa0Var.P.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            org.telegram.messenger.xa xaVar = qa0Var.H;
            if (xaVar != null) {
                k0Var = (ai.k0) ((a8.r7) xaVar).f617b;
            } else {
                k0Var = null;
            }
            if (k0Var != null && k0Var.getParent() == qa0Var.P && k0Var.getVisibility() == 0 && k0Var.getAlpha() > 0.0f) {
                TextureView textureView = qa0Var.f51112d0;
                if (textureView != null && textureView.isAttachedToWindow() && jh.k.c(qa0Var.f51112d0, qa0Var.P, rectF2)) {
                    if (k0Var.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (k0Var.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    qa0Var.f51112d0.draw(canvas);
                    canvas.restore();
                } else if (qa0Var.f51114e0 != null) {
                    rectF2.set(k0Var.getX(), k0Var.getY(), k0Var.getX() + k0Var.getWidth(), k0Var.getY() + k0Var.getHeight());
                    org.telegram.ui.Components.u80 u80Var = qa0Var.f51114e0;
                    float alpha = k0Var.getAlpha();
                    Paint paint2 = u80Var.f40257c;
                    Bitmap bitmap = u80Var.f40258e;
                    if (bitmap != null && !bitmap.isRecycled() && alpha > 0.0f) {
                        paint2.setAlpha((int) (Math.min(1.0f, alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                    }
                }
            }
            View view = qa0Var.U;
            if (view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(view.getX(), view.getY());
                view.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        if (qa0Var.R.getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(22.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + qa0Var.mSystemInsets.f15890b;
            float f10 = L;
            if (rectF.top >= f10) {
                return;
            }
            canvas.save();
            canvas.clipRect(0.0f, Math.min(rectF.top, f10), viewGroup.getWidth(), f10);
            if (qa0Var.f51109b0 < L) {
                paint.setColor(qa0Var.getThemedColor(i7));
                paint.setAlpha(205);
                canvas.drawRect(0.0f, Math.max(qa0Var.f51109b0, rectF.top), viewGroup.getWidth(), f10, paint);
            }
            et etVar = qa0Var.R;
            ih.d.a(etVar, canvas, rectF, etVar, viewGroup);
            canvas.restore();
        }
    }

    public static void a0(qa0 qa0Var) {
        qa0Var.glassEngine.g();
        View view = qa0Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void b0(qa0 qa0Var) {
        aa0 aa0Var;
        qa0Var.getLocationController().j(qa0Var.m0);
        if (!qa0Var.isPaused && (aa0Var = qa0Var.Q0) != null) {
            org.telegram.messenger.g0.h3(aa0Var, 5000L);
        }
    }

    public static void c0(qa0 qa0Var, boolean z10, TLRPC.User user, int i7) {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z10) {
            org.telegram.messenger.pd h = qa0Var.getLocationController().h(qa0Var.m0);
            if (h != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = qa0Var.getMessagesController().l1(h.f26225a);
                tL_messages_editMessage.f28487id = h.f26226b;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location location = org.telegram.messenger.qd.f(qa0Var.currentAccount).f26386s;
                tL_messages_editMessage.media.geo_point.lat = org.telegram.messenger.g0.b0(location.getLatitude());
                tL_messages_editMessage.media.geo_point._long = org.telegram.messenger.g0.b0(location.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) location.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i11 = h.f26230g;
                int i12 = h.f26229f;
                if (i11 != i12) {
                    inputMedia.proximity_notification_radius = i12;
                    inputMedia.flags |= 8;
                }
                inputMedia.heading = org.telegram.messenger.qd.e(location);
                TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
                int i13 = inputMedia2.flags;
                inputMedia2.flags = i13 | 4;
                int i14 = Integer.MAX_VALUE;
                if (i7 == Integer.MAX_VALUE) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = h.d + i7;
                }
                h.d = i10;
                inputMedia2.period = i10;
                if (i7 != Integer.MAX_VALUE) {
                    i14 = h.f26227c + i7;
                }
                h.f26227c = i14;
                inputMedia2.flags = i13 | 6;
                org.telegram.messenger.fj fjVar = h.h;
                if (fjVar != null && (message = fjVar.f23965k) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i10;
                    qa0Var.getMessagesStorage().r1(h.h.f23965k, null, null, true);
                }
                qa0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.G4, new Object[0]);
                return;
            }
            return;
        }
        qa0Var.I0(i7, 0, user);
    }

    public static void d0(qa0 qa0Var) {
        qa0Var.glassEngine.g();
    }

    public static void e0(qa0 qa0Var, int i7) {
        float e10;
        float f10;
        TLRPC.TL_messageMediaVenue H = qa0Var.T.H(i7);
        if (H != null && H.icon != null && qa0Var.F != null) {
            qa0Var.K0 = true;
            qa0Var.simpleActionBar.o(true);
            if ("pin".equals(H.icon)) {
                e10 = qa0Var.F.e();
                f10 = 4.0f;
            } else {
                e10 = qa0Var.F.e();
                f10 = 9.0f;
            }
            float f11 = e10 - f10;
            org.telegram.messenger.da daVar = qa0Var.F;
            IMapsProvider k10 = org.telegram.messenger.t0.k();
            TLRPC.GeoPoint geoPoint = H.geo;
            daVar.b(((pb.b) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(geoPoint.lat, geoPoint._long), f11));
            Location location = qa0Var.A0;
            if (location != null) {
                location.setLatitude(H.geo.lat);
                qa0Var.A0.setLongitude(H.geo._long);
            }
            qa0Var.Q.L(qa0Var.A0);
        }
    }

    public static View q0(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View q02 = q0(viewGroup.getChildAt(i7), cls);
                if (q02 != null) {
                    return q02;
                }
            }
            return null;
        }
        return null;
    }

    public static org.telegram.messenger.ab z0(org.telegram.messenger.ab abVar, double d, double d2) {
        double d10 = abVar.f22851a;
        return new org.telegram.messenger.ab(d10 + Math.toDegrees(d / 6366198.0d), abVar.f22852b + Math.toDegrees(d2 / (Math.cos(Math.toRadians(d10)) * 6366198.0d)));
    }

    public final boolean A0() {
        GLSurfaceView gLSurfaceView;
        org.telegram.messenger.xa xaVar = this.H;
        if (xaVar != null && (gLSurfaceView = (GLSurfaceView) ((a8.r7) xaVar).f620f) != null && !this.J) {
            gLSurfaceView.queueEvent(new o60(12, this, gLSurfaceView));
            return true;
        }
        return false;
    }

    public final void B0(ma0 ma0Var) {
        double d;
        double d2;
        TLRPC.Message message;
        if (ma0Var != null && (message = ma0Var.f49782b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d2 = geoPoint._long;
        } else {
            org.telegram.messenger.fj fjVar = this.J0;
            if (fjVar != null) {
                TLRPC.GeoPoint geoPoint2 = fjVar.f23965k.media.geo;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.H0.geo_point;
                d = geoPoint3.lat;
                d2 = geoPoint3._long;
            }
        }
        boolean z10 = org.telegram.messenger.s2.f26721a;
        org.telegram.messenger.t0.r();
        if (this.f51141z0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f51141z0.getLatitude()), Double.valueOf(this.f51141z0.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void C0(final boolean z10) {
        final TLRPC.User user;
        if (this.M0 != null && !o0() && getParentActivity() != null && this.f51141z0 != null && l0()) {
            if (org.telegram.messenger.n5.E(this.m0)) {
                user = getMessagesController().c2(Long.valueOf(this.m0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.b5.B(getParentActivity(), z10, user, new org.telegram.messenger.nr() {
                @Override
                public final void a(int i7) {
                    qa0.c0(qa0.this, z10, user, i7);
                }
            }, null));
        }
    }

    public final void D0() {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        if (this.f51114e0 != null && this.H != null) {
            TextureView textureView = this.f51112d0;
            if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.f51114e0.d) == null || !surfaceView.isAttachedToWindow())) {
                ai.k0 k0Var = (ai.k0) ((a8.r7) this.H).f617b;
                TextureView textureView2 = (TextureView) q0(k0Var, TextureView.class);
                this.f51112d0 = textureView2;
                org.telegram.ui.Components.u80 u80Var = this.f51114e0;
                if (textureView2 == null) {
                    surfaceView2 = (SurfaceView) q0(k0Var, SurfaceView.class);
                } else {
                    surfaceView2 = null;
                }
                if (u80Var.d != surfaceView2) {
                    u80Var.d = surfaceView2;
                    u80Var.a();
                }
                TextureView textureView3 = this.f51112d0;
                if (textureView3 != null) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                    if (!(surfaceTextureListener instanceof oa0)) {
                        this.f51112d0.setSurfaceTextureListener(new oa0(this, surfaceTextureListener));
                    }
                }
                P0();
            }
            TextureView textureView4 = this.f51112d0;
            if (textureView4 == null) {
                this.f51114e0.a();
                return;
            }
            TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
            if (!(surfaceTextureListener2 instanceof oa0)) {
                this.f51112d0.setSurfaceTextureListener(new oa0(this, surfaceTextureListener2));
            }
        }
    }

    public final void E0(Location location) {
        if (location == null) {
            return;
        }
        this.f51141z0 = new Location(location);
        ma0 ma0Var = (ma0) this.f51126p0.f(getUserConfig().e());
        org.telegram.messenger.pd h = getLocationController().h(this.m0);
        if (ma0Var != null && h != null && ma0Var.f49782b.f28424id == h.f26226b) {
            org.telegram.messenger.ab abVar = new org.telegram.messenger.ab(location.getLatitude(), location.getLongitude());
            ma0Var.f49784e.b(abVar);
            org.telegram.messenger.ca caVar = ma0Var.f49785f;
            if (caVar != null) {
                caVar.b(abVar);
            }
            if (this.f51127q0 == ma0Var.f49781a) {
                this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(ma0Var.f49784e.a()));
            }
        }
        if (this.J0 == null && this.H0 == null && this.F != null) {
            org.telegram.messenger.ab abVar2 = new org.telegram.messenger.ab(location.getLatitude(), location.getLongitude());
            ia0 ia0Var = this.Q;
            if (ia0Var != null) {
                ia0Var.M(this.f51141z0);
            }
            if (!this.K0) {
                this.A0 = new Location(location);
                if (this.L0) {
                    this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(abVar2));
                } else {
                    this.L0 = true;
                    this.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(abVar2, this.F.e() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.f51141z0);
        }
        org.telegram.ui.Components.ug0 ug0Var = this.O;
        if (ug0Var != null) {
            ug0Var.c(true);
        }
        k8.a aVar = this.L;
        if (aVar != null) {
            double latitude = this.f51141z0.getLatitude();
            double longitude = this.f51141z0.getLongitude();
            m8.a aVar2 = (m8.a) aVar.f18180b;
            LatLng latLng = new LatLng(latitude, longitude);
            try {
                v7.f fVar = (v7.f) aVar2.f20886a;
                Parcel p12 = fVar.p1();
                v7.b.b(p12, latLng);
                fVar.t1(p12, 3);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        bg.m mVar = this.C0;
        if (mVar != null) {
            mVar.a(this.f51141z0);
        }
        Q0(true);
        R0();
    }

    public final void F0(View view) {
        fh.g c10 = getBaseSimpleGlass().f56616c.c(view, null, false);
        c10.p(c8.i0.m(getResourceProvider()));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        view.setBackground(c10);
        c8.ra.a(view);
    }

    public final void G0(org.telegram.messenger.fj fjVar) {
        this.J0 = fjVar;
        this.m0 = org.telegram.messenger.fj.B0(fjVar.f23965k);
    }

    public final void H0(ma0 ma0Var) {
        if (ma0Var.h == null) {
            TLRPC.User user = ma0Var.f49783c;
            TLRPC.Chat chat = ma0Var.d;
            if (user == null && chat == 0) {
                return;
            }
            org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
            if (user != null) {
                b9Var.r(user);
            } else {
                b9Var.q(chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.d = this.currentAccount;
            imageReceiver.f22639h1 = new at(19, this, ma0Var);
            imageReceiver.P();
            if (user == null) {
                user = chat;
            }
            imageReceiver.i0(user, b9Var, null);
            ma0Var.h = imageReceiver;
        }
    }

    public final void I0(int i7, int i10, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(this.f51141z0.getLatitude());
        tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(this.f51141z0.getLongitude());
        tL_messageMediaGeoLive.heading = org.telegram.messenger.qd.e(this.f51141z0);
        int i11 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i7;
        tL_messageMediaGeoLive.proximity_notification_radius = i10;
        tL_messageMediaGeoLive.flags = i11 | 9;
        this.M0.b(tL_messageMediaGeoLive, this.N0, true, 0, 0L);
        if (i10 > 0) {
            this.O.M = true;
            this.f51110c.setImageResource(2131232213);
            org.telegram.ui.Components.ug0 ug0Var = this.O;
            if (ug0Var != null) {
                ug0Var.a();
            }
            w0().k(0L, 24, Integer.valueOf(i10), user, null, null);
            return;
        }
        finishFragment();
    }

    public final void J0(boolean z10, boolean z11) {
        float f10;
        float f11;
        Boolean bool = this.W0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.W0 = Boolean.valueOf(z10);
        float f12 = 0.0f;
        int i7 = 0;
        float f13 = 0.7f;
        if (!z11) {
            TextView textView = this.f51108b;
            if (!z10) {
                i7 = 8;
            }
            textView.setVisibility(i7);
            TextView textView2 = this.f51108b;
            if (z10) {
                f12 = 1.0f;
            }
            textView2.setAlpha(f12);
            TextView textView3 = this.f51108b;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            textView3.setScaleX(f11);
            TextView textView4 = this.f51108b;
            if (z10) {
                f13 = 1.0f;
            }
            textView4.setScaleY(f13);
            return;
        }
        this.f51108b.setVisibility(0);
        ViewPropertyAnimator animate = this.f51108b.animate();
        if (z10) {
            f12 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f12);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.7f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (z10) {
            f13 = 1.0f;
        }
        scaleX.scaleY(f13).setInterpolator(org.telegram.ui.Components.lr.h).setDuration(420L).withEndAction(new org.telegram.ui.Components.pp0(9, this, z10)).start();
    }

    public final void K0() {
        if (this.F != null && this.f51140y0) {
            if (this.C0 == null) {
                try {
                    SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.f26913b.getSystemService("sensor");
                    if (sensorManager != null) {
                        if (sensorManager.getDefaultSensor(11) == null) {
                            if (sensorManager.getDefaultSensor(2) != null) {
                                if (sensorManager.getDefaultSensor(1) == null) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        this.C0 = new bg.m(new da0(this, 3));
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            this.C0.a(this.f51141z0);
            bg.m mVar = this.C0;
            if (!mVar.f3305f) {
                try {
                    if (mVar.f3302b == null) {
                        SensorManager sensorManager2 = (SensorManager) org.telegram.messenger.t0.f26913b.getSystemService("sensor");
                        mVar.f3302b = sensorManager2;
                        if (sensorManager2 != null) {
                            Sensor defaultSensor = sensorManager2.getDefaultSensor(11);
                            mVar.f3303c = defaultSensor;
                            if (defaultSensor == null) {
                                mVar.d = mVar.f3302b.getDefaultSensor(1);
                                mVar.f3304e = mVar.f3302b.getDefaultSensor(2);
                            }
                        } else {
                            return;
                        }
                    }
                    Sensor sensor = mVar.f3303c;
                    if (sensor != null) {
                        mVar.f3302b.registerListener(mVar, sensor, 1);
                    } else {
                        Sensor sensor2 = mVar.d;
                        if (sensor2 != null && mVar.f3304e != null) {
                            mVar.f3302b.registerListener(mVar, sensor2, 1);
                            mVar.f3302b.registerListener(mVar, mVar.f3304e, 1);
                        } else {
                            return;
                        }
                    }
                    mVar.f3305f = true;
                    mVar.I = 0L;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    public final void L0() {
        if (this.f51140y0 && !this.f51121k0) {
            if (this.G0 == null) {
                org.telegram.messenger.qa onCreateLocationRequest = ((h6.m) org.telegram.messenger.t0.j()).onCreateLocationRequest();
                this.F0 = onCreateLocationRequest;
                ((org.telegram.messenger.z9) onCreateLocationRequest).c();
                ((org.telegram.messenger.z9) this.F0).b();
                ((org.telegram.messenger.z9) this.F0).a();
                this.G0 = new da0(this, 2);
            }
            try {
                ((h6.m) org.telegram.messenger.t0.j()).requestLocationUpdates(this.F0, this.G0);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void M0() {
        bg.m mVar = this.C0;
        if (mVar != null && mVar.f3305f) {
            mVar.f3305f = false;
            mVar.f3310x = false;
            try {
                mVar.f3302b.unregisterListener(mVar);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void N0(boolean z10) {
        int i7;
        int i10;
        FrameLayout.LayoutParams layoutParams;
        int i11;
        v4.f1 K = this.R.K(0);
        if (K != null) {
            i7 = (int) K.f59123a.getY();
            i10 = Math.min(i7, 0) + this.O0;
            this.f51109b0 = (this.O0 + i7) - this.f51118h0;
        } else {
            i7 = -this.P.getMeasuredHeight();
            this.f51109b0 = -org.telegram.messenger.g0.L(41.0f);
            i10 = 0;
        }
        this.R.invalidate();
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            int i12 = 4;
            if (i10 <= 0) {
                if (((ai.k0) ((a8.r7) this.H).f617b).getVisibility() == 0) {
                    ((ai.k0) ((a8.r7) this.H).f617b).setVisibility(4);
                    this.P.setVisibility(4);
                }
            } else if (((ai.k0) ((a8.r7) this.H).f617b).getVisibility() == 4) {
                ((ai.k0) ((a8.r7) this.H).f617b).setVisibility(0);
                this.P.setVisibility(0);
            }
            this.P.setTranslationY(Math.min(0, i7));
            int i13 = -i7;
            ((ai.k0) ((a8.r7) this.H).f617b).setTranslationY(Math.max(0, i13 / 2));
            FrameLayout frameLayout = this.X;
            float f10 = 48.0f;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i7));
                float l10 = Utilities.l((org.telegram.messenger.f3.z(53.0f, i10 - this.f51118h0, org.telegram.messenger.g0.L(46.0f) + ri.a.d(this.mSystemInsets.f15890b)) - org.telegram.messenger.g0.L(7.0f)) / org.telegram.messenger.g0.L(48.0f));
                FrameLayout frameLayout2 = this.X;
                frameLayout2.setAlpha(l10);
                int i14 = (l10 > 0.0f ? 1 : (l10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                frameLayout2.setVisibility(i11);
                FrameLayout frameLayout3 = this.Y;
                frameLayout3.setAlpha(l10);
                if (i14 > 0) {
                    i12 = 0;
                }
                frameLayout3.setVisibility(i12);
                P0();
            }
            View view = this.U;
            if (view != null) {
                if (view.getTag() != null) {
                    f10 = 69.0f;
                }
                int L = ((i10 / 2) + (i13 - org.telegram.messenger.g0.L(f10))) - (this.f51118h0 / 2);
                this.B0 = L;
                view.setTranslationY(L);
            }
            if (!z10 && (layoutParams = (FrameLayout.LayoutParams) ((ai.k0) ((a8.r7) this.H).f617b).getLayoutParams()) != null && layoutParams.height != u0()) {
                layoutParams.height = u0();
                org.telegram.messenger.da daVar = this.F;
                if (daVar != null) {
                    daVar.n(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
                }
                ((ai.k0) ((a8.r7) this.H).f617b).setLayoutParams(layoutParams);
            }
        }
    }

    public final void O0() {
        if (this.f51133u0) {
            if (this.f51136w0) {
                this.S.setEmptyView(null);
                this.f51113e.setVisibility(8);
                this.S.setVisibility(8);
                return;
            }
            this.S.setEmptyView(this.f51113e);
            return;
        }
        this.f51113e.setVisibility(8);
    }

    public final void P0() {
        org.telegram.messenger.xa xaVar;
        boolean z10;
        bi.p2 p2Var;
        org.telegram.ui.Components.u80 u80Var = this.f51114e0;
        if (u80Var != null && (xaVar = this.H) != null) {
            ai.k0 k0Var = (ai.k0) ((a8.r7) xaVar).f617b;
            if (this.f51112d0 == null && this.f51140y0 && !isFinishing() && (p2Var = this.P) != null && p2Var.getVisibility() == 0 && k0Var.getParent() != null && k0Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (u80Var.f40260g != z10) {
                u80Var.f40260g = z10;
                if (z10) {
                    u80Var.a();
                } else {
                    u80Var.d();
                }
            }
        }
    }

    public final void Q0(boolean z10) {
        Location location;
        boolean z11;
        float f10;
        int i7;
        if (this.F != null && (location = this.f51141z0) != null) {
            bg.m mVar = this.C0;
            if (mVar != null && mVar.H) {
                z11 = true;
            } else {
                z11 = false;
            }
            try {
                org.telegram.messenger.ca caVar = this.D0;
                int i10 = 2131231650;
                if (caVar == null) {
                    h9.g1 g1Var = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                    ((m8.g) g1Var.f13998b).f20901a = new LatLng(this.f51141z0.getLatitude(), this.f51141z0.getLongitude());
                    m8.g gVar = (m8.g) g1Var.f13998b;
                    gVar.f20907r = true;
                    gVar.f20904e = 0.5f;
                    gVar.f20905f = 0.5f;
                    if (z11) {
                        i7 = 2131231651;
                    } else {
                        i7 = 2131231650;
                    }
                    gVar.d = c8.r9.b(i7);
                    this.D0 = this.F.a(g1Var);
                    this.E0 = z11;
                } else if (z10) {
                    double latitude = location.getLatitude();
                    double longitude = this.f51141z0.getLongitude();
                    m8.f fVar = caVar.f23279a;
                    LatLng latLng = new LatLng(latitude, longitude);
                    fVar.getClass();
                    try {
                        v7.i iVar = (v7.i) fVar.f20900a;
                        Parcel p12 = iVar.p1();
                        v7.b.b(p12, latLng);
                        iVar.t1(p12, 3);
                    } catch (RemoteException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                org.telegram.messenger.ca caVar2 = this.D0;
                if (caVar2 != null) {
                    if (z11 != this.E0) {
                        if (z11) {
                            i10 = 2131231651;
                        }
                        caVar2.f23279a.a(c8.r9.b(i10));
                        this.E0 = z11;
                    }
                    org.telegram.messenger.ca caVar3 = this.D0;
                    if (z11) {
                        f10 = this.C0.G;
                    } else {
                        f10 = 0.0f;
                    }
                    caVar3.c(f10);
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    public final void R0() {
        int i7;
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.f51108b == null) {
            return;
        }
        boolean z11 = false;
        if (this.f51129r0) {
            J0(false, true);
            r0();
            return;
        }
        if (getConnectionsManager() != null) {
            i7 = getConnectionsManager().getCurrentTime();
        } else {
            i7 = 0;
        }
        ArrayList arrayList = this.f51125o0;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Message message = ((ma0) arrayList.get(i12)).f49782b;
            if (message != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > i7)) {
                i11++;
            }
        }
        if (this.f51126p0.f(getUserConfig().e()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f51141z0 != null && !z10) {
            i11++;
        }
        if (i11 >= 2) {
            z11 = true;
        }
        J0(z11, true);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29575n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29337a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29358b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29486i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xj));
    }

    @Override
    public final android.view.View createView(android.content.Context r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qa0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ia0 ia0Var;
        long B0;
        ia0 ia0Var2;
        if (i7 == org.telegram.messenger.ks.f25190t) {
            removeSelfFromStack(true);
            return;
        }
        if (i7 == org.telegram.messenger.ks.f25229y4) {
            this.f51121k0 = false;
            ia0 ia0Var3 = this.Q;
            if (ia0Var3 != null) {
                ia0Var3.O(false, false);
            }
            L0();
        } else if (i7 == org.telegram.messenger.ks.f25236z4) {
            this.f51121k0 = true;
            ia0 ia0Var4 = this.Q;
            if (ia0Var4 != null) {
                ia0Var4.O(true, false);
            }
        } else if (i7 == org.telegram.messenger.ks.G4) {
            ia0 ia0Var5 = this.Q;
            if (ia0Var5 != null) {
                ia0Var5.f();
            }
            R0();
        } else if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.m0 && this.J0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i11);
                    if (fjVar.C3()) {
                        i0(fjVar.f23965k);
                        z10 = true;
                    } else {
                        TLRPC.Message message = fjVar.f23965k;
                        if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && org.telegram.messenger.n5.E(org.telegram.messenger.fj.B0(message))) {
                            this.f51110c.setImageResource(2131232212);
                            k8.a aVar = this.L;
                            if (aVar != null) {
                                aVar.b1();
                                this.L = null;
                            }
                        }
                    }
                }
                if (z10 && (ia0Var2 = this.Q) != null) {
                    ia0Var2.N(this.f51125o0);
                }
            }
        } else if (i7 == org.telegram.messenger.ks.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.m0 && this.J0 != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList2.get(i12);
                    if (fjVar2.C3()) {
                        TLRPC.Message message2 = fjVar2.f23965k;
                        TLRPC.Peer peer = message2.from_id;
                        if (peer != null) {
                            B0 = org.telegram.messenger.fj.B1(peer);
                        } else {
                            B0 = org.telegram.messenger.fj.B0(message2);
                        }
                        ma0 ma0Var = (ma0) this.f51126p0.f(B0);
                        if (ma0Var != null) {
                            org.telegram.messenger.pd h = getLocationController().h(longValue);
                            if (h == null || h.f26226b != fjVar2.e1()) {
                                TLRPC.Message message3 = fjVar2.f23965k;
                                ma0Var.f49782b = message3;
                                TLRPC.GeoPoint geoPoint = message3.media.geo;
                                org.telegram.messenger.ab abVar = new org.telegram.messenger.ab(geoPoint.lat, geoPoint._long);
                                ma0Var.f49784e.b(abVar);
                                if (this.f51127q0 == ma0Var.f49781a) {
                                    this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(ma0Var.f49784e.a()));
                                }
                                org.telegram.messenger.ca caVar = ma0Var.f49785f;
                                if (caVar != null) {
                                    caVar.a();
                                    ma0Var.f49785f.b(abVar);
                                    int i13 = fjVar2.f23965k.media.heading;
                                    if (i13 != 0) {
                                        ma0Var.f49785f.c(i13);
                                        if (!ma0Var.f49786g) {
                                            ma0Var.f49785f.f23279a.a(c8.r9.b(2131231651));
                                            ma0Var.f49786g = true;
                                        }
                                    } else if (ma0Var.f49786g) {
                                        ma0Var.f49785f.c(0.0f);
                                        ma0Var.f49785f.f23279a.a(c8.r9.b(2131231650));
                                        ma0Var.f49786g = false;
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                }
                if (z11 && (ia0Var = this.Q) != null) {
                    ia0Var.f();
                    org.telegram.ui.Components.ug0 ug0Var = this.O;
                    if (ug0Var != null) {
                        ug0Var.c(true);
                    }
                }
                if (z11) {
                    R0();
                }
            }
        }
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        if (A0()) {
            return false;
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            UndoView[] undoViewArr = this.f51137x;
            if (i7 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.w6(undoViewArr[i7], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.wj));
            i7++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29467h5));
        org.telegram.ui.ActionBar.h5 h5Var = this.f51128r;
        if (h5Var != null) {
            editTextBoldCursor = h5Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29502j5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.pj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 196608, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Hi));
        return arrayList;
    }

    public final ma0 i0(TLRPC.Message message) {
        ma0 ma0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d2 = geoPoint._long;
        long B1 = org.telegram.messenger.fj.B1(message.from_id);
        a0.h hVar = this.f51126p0;
        ma0 ma0Var2 = (ma0) hVar.f(B1);
        if (ma0Var2 == null) {
            ?? obj = new Object();
            obj.f49782b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f49783c = getMessagesController().c2(Long.valueOf(obj.f49782b.from_id.user_id));
                obj.f49781a = obj.f49782b.from_id.user_id;
            } else {
                long B0 = org.telegram.messenger.fj.B0(message);
                if (org.telegram.messenger.n5.E(B0)) {
                    obj.f49783c = getMessagesController().c2(Long.valueOf(B0));
                } else {
                    obj.d = getMessagesController().O0(Long.valueOf(-B0));
                }
                obj.f49781a = B0;
            }
            H0(obj);
            try {
                h9.g1 g1Var = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                m8.g gVar = (m8.g) g1Var.f13998b;
                ((m8.g) g1Var.f13998b).f20901a = new LatLng(d, d2);
                Bitmap n02 = n0(obj);
                ma0Var = obj;
                if (n02 != null) {
                    gVar.d = c8.r9.a(n02);
                    gVar.f20904e = 0.5f;
                    gVar.f20905f = 0.8010882f;
                    obj.f49784e = this.F.a(g1Var);
                    if (!org.telegram.messenger.o10.C(obj.f49783c)) {
                        h9.g1 g1Var2 = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                        ((m8.g) g1Var2.f13998b).f20901a = new LatLng(d, d2);
                        m8.g gVar2 = (m8.g) g1Var2.f13998b;
                        gVar2.f20907r = true;
                        gVar2.f20904e = 0.5f;
                        gVar2.f20905f = 0.5f;
                        org.telegram.messenger.ca a10 = this.F.a(g1Var2);
                        obj.f49785f = a10;
                        int i7 = message.media.heading;
                        if (i7 != 0) {
                            a10.c(i7);
                            obj.f49785f.f23279a.a(c8.r9.b(2131231651));
                            obj.f49786g = true;
                        } else {
                            a10.c(0.0f);
                            obj.f49785f.f23279a.a(c8.r9.b(2131231650));
                            obj.f49786g = false;
                        }
                    }
                    this.f51125o0.add(obj);
                    hVar.k(obj, obj.f49781a);
                    org.telegram.messenger.pd h = getLocationController().h(this.m0);
                    int i10 = (obj.f49781a > getUserConfig().e() ? 1 : (obj.f49781a == getUserConfig().e() ? 0 : -1));
                    ma0Var = obj;
                    ma0Var = obj;
                    if (i10 == 0 && h != null) {
                        int i11 = obj.f49782b.f28424id;
                        ma0Var = obj;
                        if (i11 == h.f26226b) {
                            Location location = this.f51141z0;
                            ma0Var = obj;
                            if (location != null) {
                                double latitude = location.getLatitude();
                                double longitude = this.f51141z0.getLongitude();
                                m8.f fVar = obj.f49784e.f23279a;
                                LatLng latLng = new LatLng(latitude, longitude);
                                fVar.getClass();
                                try {
                                    v7.i iVar = (v7.i) fVar.f20900a;
                                    Parcel p12 = iVar.p1();
                                    v7.b.b(p12, latLng);
                                    iVar.t1(p12, 3);
                                    ma0Var = obj;
                                } catch (RemoteException e10) {
                                    throw new RuntimeException(e10);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                ma0Var = obj;
            }
        } else {
            ma0Var2.f49782b = message;
            m8.f fVar2 = ma0Var2.f49784e.f23279a;
            LatLng latLng2 = new LatLng(d, d2);
            fVar2.getClass();
            try {
                v7.i iVar2 = (v7.i) fVar2.f20900a;
                Parcel p13 = iVar2.p1();
                v7.b.b(p13, latLng2);
                iVar2.t1(p13, 3);
                int i12 = (this.f51127q0 > ma0Var2.f49781a ? 1 : (this.f51127q0 == ma0Var2.f49781a ? 0 : -1));
                ma0Var = ma0Var2;
                if (i12 == 0) {
                    this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(ma0Var2.f49784e.a()));
                    ma0Var = ma0Var2;
                }
            } catch (RemoteException e12) {
                throw new RuntimeException(e12);
            }
        }
        org.telegram.ui.Components.ug0 ug0Var = this.O;
        if (ug0Var != null) {
            ug0Var.c(true);
        }
        R0();
        return ma0Var;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0() {
        if (this.fragmentView != null && this.R != null) {
            i0.b bVar = this.mSystemInsets;
            int i7 = bVar.f15890b;
            int i10 = bVar.d;
            FrameLayout frameLayout = this.X;
            if (frameLayout != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                int d = ri.a.d(i7) - org.telegram.messenger.g0.L(6.0f);
                if (layoutParams.topMargin != d) {
                    layoutParams.topMargin = d;
                    this.X.requestLayout();
                }
            }
            this.R.setClipToPadding(false);
            this.R.setPadding(0, 0, 0, i10);
            org.telegram.ui.Components.ck0 ck0Var = this.S;
            if (ck0Var != null) {
                ck0Var.setClipToPadding(false);
                ri.a.e(this.S, i7, i10, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
            }
            if (this.fragmentView.getMeasuredHeight() > 0) {
                s0(false);
            }
        }
    }

    public final void k0() {
        int i7;
        fh.g gVar = this.Z;
        if (gVar != null) {
            gVar.updateColors();
        }
        et etVar = this.R;
        if (etVar != null) {
            etVar.invalidate();
        }
        if (this.F != null) {
            if (org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6)) < 0.721f) {
                i7 = 2131624086;
            } else {
                i7 = 0;
            }
            if (i7 != 0) {
                if (!this.f51119i0) {
                    this.f51119i0 = true;
                    this.F.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f26913b, i7));
                    k8.a aVar = this.L;
                    if (aVar != null) {
                        aVar.g1(-1);
                        this.L.c1(553648127);
                    }
                }
            } else if (this.f51119i0) {
                this.f51119i0 = false;
                this.F.i(null);
                k8.a aVar2 = this.L;
                if (aVar2 != null) {
                    aVar2.g1(-16777216);
                    this.L.c1(536870912);
                }
            }
            D0();
        }
    }

    public final boolean l0() {
        if (o0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) org.telegram.messenger.t0.f26913b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i7 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder.m(2131624120, 72, getThemedColor(i7), null);
                    alertDialog$Builder.n(i7, getResourceProvider());
                    alertDialog$Builder.f28744a.U = org.telegram.messenger.gd.M0(2131749355, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751795, null), new da0(this, 5));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    showDialog(alertDialog$Builder.f28744a);
                    return false;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return true;
            }
        }
        return true;
    }

    public final void m0(int i7) {
        v7.h aVar;
        if (this.F == null) {
            return;
        }
        List<org.telegram.messenger.fb> asList = Arrays.asList(new org.telegram.messenger.fb[]{new Object(), new Object()});
        org.telegram.messenger.ta onCreateCircleOptions = ((pb.b) org.telegram.messenger.t0.k()).onCreateCircleOptions();
        double latitude = this.f51141z0.getLatitude();
        double longitude = this.f51141z0.getLongitude();
        hi.w4 w4Var = (hi.w4) onCreateCircleOptions;
        m8.b bVar = (m8.b) w4Var.f15642b;
        LatLng latLng = new LatLng(latitude, longitude);
        bVar.getClass();
        bVar.f20887a = latLng;
        double d = i7;
        m8.b bVar2 = (m8.b) w4Var.f15642b;
        bVar2.f20888b = d;
        if (x0()) {
            bVar2.d = -1771658281;
            bVar2.f20890e = 476488663;
        } else {
            bVar2.d = -1774024971;
            bVar2.f20890e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (org.telegram.messenger.fb fbVar : asList) {
            if (fbVar instanceof org.telegram.messenger.eb) {
                arrayList.add(new m8.c(20, 1));
            } else if (fbVar instanceof org.telegram.messenger.db) {
                arrayList.add(new m8.c(20, 0));
            }
        }
        bVar2.f20893r = arrayList;
        bVar2.f20889c = 2;
        org.telegram.messenger.da daVar = this.F;
        k8.a aVar2 = daVar.f23503a;
        aVar2.getClass();
        try {
            l8.e eVar = (l8.e) aVar2.f18180b;
            Parcel p12 = eVar.p1();
            v7.b.b(p12, bVar2);
            Parcel o12 = eVar.o1(p12, 35);
            IBinder readStrongBinder = o12.readStrongBinder();
            int i10 = v7.g.f59300b;
            if (readStrongBinder == null) {
                aVar = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (queryLocalInterface instanceof v7.h) {
                    aVar = (v7.h) queryLocalInterface;
                } else {
                    aVar = new a8.a(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 11);
                }
            }
            o12.recycle();
            m8.a aVar3 = new m8.a(aVar);
            k8.a aVar4 = new k8.a(10, daVar, aVar3);
            daVar.f23505c.put(aVar3, aVar4);
            this.L = aVar4;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final Bitmap n0(ma0 ma0Var) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.t0.f26913b.getResources().getDrawable(2131231652);
                drawable.setBounds(0, 0, org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
                TLRPC.User user = ma0Var.f49783c;
                if (user != null) {
                    b9Var.r(user);
                } else {
                    TLRPC.Chat chat = ma0Var.d;
                    if (chat != null) {
                        b9Var.q(chat);
                    }
                }
                canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                b9Var.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
                b9Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = ma0Var.h;
                if (imageReceiver != null && imageReceiver.J()) {
                    bitmap = ma0Var.h.n();
                } else {
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float L = org.telegram.messenger.g0.L(50.0f) / bitmap.getWidth();
                    matrix.postScale(L, L);
                    matrix.postTranslate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(25.0f), paint);
                }
                canvas.restore();
                try {
                    canvas.setBitmap(null);
                    return createBitmap;
                } catch (Exception unused) {
                    return createBitmap;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmap2 = createBitmap;
                org.telegram.messenger.a8.g(th, true);
                return bitmap2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean o0() {
        return this instanceof jm;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ug0 ug0Var = this.O;
        if (ug0Var != null) {
            if (z10) {
                ug0Var.a();
                return false;
            }
        } else {
            org.telegram.messenger.xa xaVar = this.H;
            if (xaVar != null && ((GLSurfaceView) ((a8.r7) xaVar).f620f) != null && !this.J) {
                if (z10) {
                    A0();
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f51137x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25190t);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25229y4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25236z4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.G4);
        org.telegram.messenger.fj fjVar = this.J0;
        if (fjVar != null && fjVar.C3()) {
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.ks.m0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.u80 u80Var = this.f51114e0;
        if (u80Var != null) {
            u80Var.f40261i = true;
            u80Var.f40260g = false;
            u80Var.d();
            u80Var.d = null;
            u80Var.f40258e = null;
            u80Var.f40259f = null;
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25229y4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25236z4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.G4);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25190t);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.ks.m0);
        M0();
        if (this.G0 != null) {
            try {
                ((h6.m) org.telegram.messenger.t0.j()).removeLocationUpdates(this.G0);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.C0 = null;
        this.D0 = null;
        try {
            org.telegram.messenger.xa xaVar = this.H;
            if (xaVar != null) {
                ((a8.r7) xaVar).A();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        UndoView undoView = this.f51137x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        ia0 ia0Var = this.Q;
        if (ia0Var != null) {
            ia0Var.F();
        }
        org.telegram.ui.Components.il ilVar = this.T;
        if (ilVar != null) {
            ilVar.F();
        }
        aa0 aa0Var = this.Q0;
        if (aa0Var != null) {
            org.telegram.messenger.g0.r(aa0Var);
            this.Q0 = null;
        }
        ArrayList arrayList = this.f51125o0;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ma0 ma0Var = (ma0) arrayList.get(i7);
            ImageReceiver imageReceiver = ma0Var.h;
            if (imageReceiver != null) {
                imageReceiver.R();
                ma0Var.h = null;
            }
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        j0();
    }

    @Override
    public final void onLowMemory() {
        h6.m mVar;
        super.onLowMemory();
        org.telegram.messenger.xa xaVar = this.H;
        if (xaVar != null && this.f51138x0 && (mVar = (h6.m) ((m.o3) ((ai.k0) ((a8.r7) xaVar).f617b).f1263b).f20159b) != null) {
            try {
                l8.f fVar = (l8.f) mVar.f13937c;
                fVar.t1(fVar.p1(), 6);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.xa xaVar = this.H;
        if (xaVar != null && this.f51138x0) {
            try {
                ((a8.r7) xaVar).B();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        UndoView undoView = this.f51137x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f51140y0 = false;
        M0();
        if (this.G0 != null) {
            try {
                ((h6.m) org.telegram.messenger.t0.j()).removeLocationUpdates(this.G0);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        P0();
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.messenger.xa xaVar = this.H;
        if (xaVar != null && this.f51138x0) {
            try {
                ((a8.r7) xaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f51140y0 = true;
        K0();
        L0();
        D0();
        s0(true);
        if (o0()) {
            this.f51132t0 = false;
        } else if (this.f51132t0 && (parentActivity = getParentActivity()) != null) {
            this.f51132t0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        aa0 aa0Var = this.Q0;
        if (aa0Var != null) {
            org.telegram.messenger.g0.r(aa0Var);
            org.telegram.messenger.g0.h3(this.Q0, 5000L);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            k0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.ActionBar.h5 h5Var = this.f51128r;
            if (h5Var != null && h5Var.getSearchField() != null) {
                this.f51128r.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29502j5));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            try {
                if (((ai.k0) ((a8.r7) this.H).f617b).getParent() instanceof ViewGroup) {
                    ((ViewGroup) ((ai.k0) ((a8.r7) this.H).f617b).getParent()).removeView((ai.k0) ((a8.r7) this.H).f617b);
                }
            } catch (Exception unused) {
            }
            bi.p2 p2Var = this.P;
            if (p2Var != null) {
                p2Var.addView((ai.k0) ((a8.r7) this.H).f617b, 0, c8.ma.e(-1, u0(), 51));
                N0(false);
                y0();
                D0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView((ai.k0) ((a8.r7) this.H).f617b, 0, c8.ma.e(-1, -1, 51));
            }
        }
    }

    public final void p0(ArrayList arrayList) {
        org.telegram.messenger.va vaVar;
        if (this.f51124n0) {
            vaVar = ((pb.b) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
        } else {
            vaVar = null;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i7);
            int i10 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i11 = messageMedia.period;
            if (i10 + i11 > currentTime || i11 == Integer.MAX_VALUE) {
                if (vaVar != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((hi.u5) vaVar).q(new org.telegram.messenger.ab(geoPoint.lat, geoPoint._long));
                }
                i0(message);
                if (this.f51110c.getVisibility() != 8 && org.telegram.messenger.fj.B1(message.from_id) != getUserConfig().e()) {
                    this.f51110c.setVisibility(0);
                    this.E = true;
                    this.f51110c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new ay(this, 4)).start();
                }
            }
        }
        if (vaVar != null) {
            if (this.f51124n0) {
                this.R.w0(0, org.telegram.messenger.g0.L(99.0f), null);
            }
            this.f51124n0 = false;
            this.Q.N(this.f51125o0);
            if (this.J0.C3()) {
                try {
                    hi.u5 u5Var = (hi.u5) vaVar;
                    org.telegram.messenger.ab a10 = u5Var.j().a();
                    org.telegram.messenger.ab z02 = z0(a10, 100.0d, 100.0d);
                    u5Var.q(z0(a10, -100.0d, -100.0d));
                    u5Var.q(z02);
                    org.telegram.messenger.ba j3 = u5Var.j();
                    if (arrayList.size() > 1) {
                        try {
                            org.telegram.messenger.sa newCameraUpdateLatLngBounds = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(j3, org.telegram.messenger.g0.L(113.0f));
                            this.G = newCameraUpdateLatLngBounds;
                            this.F.h(newCameraUpdateLatLngBounds);
                            this.G = null;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean r0() {
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i11;
        boolean z13 = false;
        if (this.F != null) {
            ArrayList arrayList = new ArrayList();
            if (getConnectionsManager() != null) {
                i7 = getConnectionsManager().getCurrentTime();
            } else {
                i7 = 0;
            }
            ArrayList arrayList2 = this.f51125o0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                ma0 ma0Var = (ma0) arrayList2.get(i12);
                org.telegram.messenger.ca caVar = ma0Var.f49784e;
                if (caVar != null && (message = ma0Var.f49782b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i7)) {
                    arrayList.add(caVar.a());
                }
            }
            if (this.f51126p0.f(getUserConfig().e()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Location location = this.f51141z0;
            if (location != null && !z10) {
                arrayList.add(new org.telegram.messenger.ab(location.getLatitude(), this.f51141z0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    org.telegram.messenger.va onCreateLatLngBoundsBuilder = ((pb.b) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i13 = 0;
                    double d2 = Double.MAX_VALUE;
                    double d10 = Double.MAX_VALUE;
                    double d11 = -1.7976931348623157E308d;
                    while (i13 < size2) {
                        org.telegram.messenger.ab abVar = (org.telegram.messenger.ab) arrayList.get(i13);
                        z11 = z13;
                        try {
                            ((hi.u5) onCreateLatLngBoundsBuilder).q(abVar);
                            i10 = size2;
                            z12 = true;
                        } catch (Exception e10) {
                            e = e10;
                            z12 = true;
                            org.telegram.messenger.a8.g(e, z12);
                            return z11;
                        }
                        try {
                            double d12 = abVar.f22851a;
                            if (d12 < d2) {
                                d2 = d12;
                            }
                            if (d12 > d) {
                                d = d12;
                            }
                            double d13 = abVar.f22852b;
                            if (d13 < d10) {
                                d10 = d13;
                            }
                            if (d13 > d11) {
                                d11 = d13;
                            }
                            i13++;
                            z13 = z11;
                            size2 = i10;
                        } catch (Exception e11) {
                            e = e11;
                            org.telegram.messenger.a8.g(e, z12);
                            return z11;
                        }
                    }
                    z11 = z13;
                    z12 = true;
                    double d14 = (d2 + d) / 2.0d;
                    double d15 = (d10 + d11) / 2.0d;
                    double radians = Math.toRadians(d11 - d10) * 6366198.0d * Math.cos(Math.toRadians(d14));
                    if (Math.toRadians(d - d2) * 6366198.0d < 30.0d || radians < 30.0d) {
                        hi.u5 u5Var = (hi.u5) onCreateLatLngBoundsBuilder;
                        u5Var.q(new org.telegram.messenger.ab(Math.toDegrees(2.356194387921959E-6d) + d14, d15 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d14)) * 6366198.0d))));
                        u5Var.q(new org.telegram.messenger.ab(d14 + Math.toDegrees(-2.356194387921959E-6d), d15 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d14)) * 6366198.0d))));
                    }
                    this.F.c(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(((hi.u5) onCreateLatLngBoundsBuilder).j(), org.telegram.messenger.g0.L(60.0f)));
                    return true;
                } catch (Exception e12) {
                    e = e12;
                    z11 = z13;
                }
            }
        }
        return false;
    }

    public final void s0(boolean z10) {
        int i7;
        if (this.R != null) {
            int i10 = this.mSystemInsets.d;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                int i11 = this.N0;
                if (i11 == 6) {
                    this.O0 = org.telegram.messenger.f3.z(66.0f, measuredHeight, i10);
                } else if (i11 == 2) {
                    this.O0 = org.telegram.messenger.f3.z(73.0f, measuredHeight, i10);
                } else {
                    this.O0 = org.telegram.messenger.f3.z(66.0f, measuredHeight, i10);
                }
                ka0 ka0Var = this.R0;
                if (ka0Var != null && ka0Var.m0(8) > 0) {
                    this.O0 -= org.telegram.messenger.g0.L(200.0f);
                }
                this.f51111c0 = org.telegram.messenger.g0.L(100.0f) + (measuredHeight - this.O0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.L(29.0f) + this.O0;
                this.P.setLayoutParams(layoutParams);
                this.Q.P(this.O0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.k0) ((a8.r7) this.H).f617b).getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = u0();
                    org.telegram.messenger.da daVar = this.F;
                    if (daVar != null) {
                        daVar.n(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
                    }
                    ((ai.k0) ((a8.r7) this.H).f617b).setLayoutParams(layoutParams2);
                }
                this.Q.f();
                if (z10) {
                    if (i11 == 3) {
                        i7 = 73;
                    } else if (i11 != 1 && i11 != 2) {
                        i7 = 0;
                    } else {
                        i7 = 66;
                    }
                    this.V.h1(0, -org.telegram.messenger.g0.L(i7));
                    N0(false);
                    this.R.post(new ii(this, i7, 23));
                    return;
                }
                N0(false);
            }
        }
    }

    public final int t0() {
        return org.telegram.messenger.g0.L(10.0f) + this.f51118h0 + this.f51111c0;
    }

    public final int u0() {
        return org.telegram.messenger.g0.L(10.0f) + this.O0 + this.f51111c0;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        ArrayList arrayList = (ArrayList) getLocationController().f26381c.f(org.telegram.messenger.fj.B0(this.J0.f23965k));
        if (arrayList != null && arrayList.isEmpty()) {
            p0(arrayList);
        } else {
            arrayList = null;
        }
        if (org.telegram.messenger.n5.z(this.m0)) {
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-this.m0));
            if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = org.telegram.messenger.fj.B0(this.J0.f23965k);
        tL_messages_getRecentLocations.peer = getMessagesController().l1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new fi.r5(this, B0, 1));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView w0() {
        UndoView[] undoViewArr = this.f51137x;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.P.removeView(undoViewArr[0]);
            this.P.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean x0() {
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.n6.I.q()) || org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void y0() {
        SharedPreferences g12;
        int i7;
        ImageView imageView = this.f51110c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.E && (i7 = (g12 = org.telegram.messenger.mp.g1()).getInt("proximityhint", 0)) < 3) {
            g12.edit().putInt("proximityhint", i7 + 1).commit();
            if (org.telegram.messenger.n5.E(this.m0)) {
                this.f51130s.v(org.telegram.messenger.gd.a0("ProximityTooltioUser", null, 2131746417, org.telegram.messenger.o10.k(getMessagesController().c2(Long.valueOf(this.m0)), true)));
            } else {
                this.f51130s.v(org.telegram.messenger.gd.M0(2131746418, null));
            }
            this.f51130s.x();
        }
    }
}
