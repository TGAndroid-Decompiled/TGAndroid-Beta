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
public class pa0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public Location A0;
    public int B0;
    public bg.m C0;
    public org.telegram.messenger.ca D0;
    public boolean E;
    public boolean E0;
    public org.telegram.messenger.da F;
    public org.telegram.messenger.qa F0;
    public org.telegram.messenger.sa G;
    public ca0 G0;
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
    public ma0 M0;
    public boolean N;
    public final int N0;
    public org.telegram.ui.Components.ug0 O;
    public int O0;
    public bi.p2 P;
    public ka0 P0;
    public ha0 Q;
    public z90 Q0;
    public et R;
    public ja0 R0;
    public org.telegram.ui.Components.ck0 S;
    public org.telegram.ui.Cells.x3 S0;
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
    public ImageView f50830a;
    public final RectF f50831a0;
    public TextView f50832b;
    public int f50833b0;
    public ImageView f50834c;
    public int f50835c0;
    public org.telegram.ui.ActionBar.h5 d;
    public TextureView f50836d0;
    public LinearLayout f50837e;
    public org.telegram.ui.Components.u80 f50838e0;
    public ImageView f50839f;
    public final RectF f50840f0;
    public final Paint f50841g0;
    public TextView h;
    public int f50842h0;
    public boolean f50843i0;
    public boolean f50844j0;
    public boolean f50845k0;
    public boolean f50846l0;
    public long m0;
    public TextView f50847n;
    public boolean f50848n0;
    public final ArrayList f50849o0;
    public final a0.h f50850p0;
    public long f50851q0;
    public org.telegram.ui.ActionBar.h5 f50852r;
    public boolean f50853r0;
    public hi.m3 f50854s;
    public AnimatorSet f50855s0;
    public boolean f50856t0;
    public boolean f50857u0;
    public boolean f50858v0;
    public boolean f50859w;
    public boolean f50860w0;
    public final UndoView[] f50861x;
    public boolean f50862x0;
    public boolean f50863y;
    public boolean f50864y0;
    public Location f50865z0;

    public pa0(int i7) {
        super(null);
        this.f50861x = new UndoView[2];
        this.f50831a0 = new RectF();
        this.f50840f0 = new RectF();
        this.f50841g0 = new Paint();
        this.f50844j0 = true;
        this.f50845k0 = false;
        this.f50846l0 = true;
        this.f50848n0 = true;
        this.f50849o0 = new ArrayList();
        this.f50850p0 = new a0.h();
        this.f50851q0 = -1L;
        this.f50856t0 = true;
        this.O0 = (org.telegram.messenger.g0.f24121q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.V0 = true;
        this.N0 = i7;
        org.telegram.messenger.g0.a0();
    }

    public static void Z(pa0 pa0Var, Canvas canvas, RectF rectF) {
        ai.k0 k0Var;
        Paint paint = pa0Var.f50841g0;
        int i7 = org.telegram.ui.ActionBar.n6.f29469h5;
        paint.setColor(pa0Var.getThemedColor(i7));
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) pa0Var.fragmentView;
        org.telegram.ui.Components.ck0 ck0Var = pa0Var.S;
        if (ck0Var != null && ck0Var.getVisibility() == 0) {
            org.telegram.ui.Components.ck0 ck0Var2 = pa0Var.S;
            ih.d.a(ck0Var2, canvas, rectF, ck0Var2, viewGroup);
            return;
        }
        if (pa0Var.P.getVisibility() == 0) {
            RectF rectF2 = pa0Var.f50840f0;
            canvas.save();
            canvas.translate(pa0Var.P.getX(), pa0Var.P.getY());
            canvas.clipRect(0.0f, 0.0f, pa0Var.P.getWidth(), viewGroup.getHeight() - pa0Var.P.getY());
            Drawable background = pa0Var.P.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            org.telegram.messenger.xa xaVar = pa0Var.H;
            if (xaVar != null) {
                k0Var = (ai.k0) ((a8.r7) xaVar).f617b;
            } else {
                k0Var = null;
            }
            if (k0Var != null && k0Var.getParent() == pa0Var.P && k0Var.getVisibility() == 0 && k0Var.getAlpha() > 0.0f) {
                TextureView textureView = pa0Var.f50836d0;
                if (textureView != null && textureView.isAttachedToWindow() && jh.k.c(pa0Var.f50836d0, pa0Var.P, rectF2)) {
                    if (k0Var.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (k0Var.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    pa0Var.f50836d0.draw(canvas);
                    canvas.restore();
                } else if (pa0Var.f50838e0 != null) {
                    rectF2.set(k0Var.getX(), k0Var.getY(), k0Var.getX() + k0Var.getWidth(), k0Var.getY() + k0Var.getHeight());
                    org.telegram.ui.Components.u80 u80Var = pa0Var.f50838e0;
                    float alpha = k0Var.getAlpha();
                    Paint paint2 = u80Var.f40257c;
                    Bitmap bitmap = u80Var.f40258e;
                    if (bitmap != null && !bitmap.isRecycled() && alpha > 0.0f) {
                        paint2.setAlpha((int) (Math.min(1.0f, alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                    }
                }
            }
            View view = pa0Var.U;
            if (view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(view.getX(), view.getY());
                view.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        if (pa0Var.R.getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(22.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + pa0Var.mSystemInsets.f15893b;
            float f10 = L;
            if (rectF.top >= f10) {
                return;
            }
            canvas.save();
            canvas.clipRect(0.0f, Math.min(rectF.top, f10), viewGroup.getWidth(), f10);
            if (pa0Var.f50833b0 < L) {
                paint.setColor(pa0Var.getThemedColor(i7));
                paint.setAlpha(205);
                canvas.drawRect(0.0f, Math.max(pa0Var.f50833b0, rectF.top), viewGroup.getWidth(), f10, paint);
            }
            et etVar = pa0Var.R;
            ih.d.a(etVar, canvas, rectF, etVar, viewGroup);
            canvas.restore();
        }
    }

    public static void a0(pa0 pa0Var) {
        pa0Var.glassEngine.g();
        View view = pa0Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void b0(pa0 pa0Var) {
        z90 z90Var;
        pa0Var.getLocationController().j(pa0Var.m0);
        if (!pa0Var.isPaused && (z90Var = pa0Var.Q0) != null) {
            org.telegram.messenger.g0.h3(z90Var, 5000L);
        }
    }

    public static void c0(pa0 pa0Var, boolean z10, TLRPC.User user, int i7) {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z10) {
            org.telegram.messenger.pd h = pa0Var.getLocationController().h(pa0Var.m0);
            if (h != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = pa0Var.getMessagesController().l1(h.f26227a);
                tL_messages_editMessage.f28489id = h.f26228b;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location location = org.telegram.messenger.qd.f(pa0Var.currentAccount).f26388s;
                tL_messages_editMessage.media.geo_point.lat = org.telegram.messenger.g0.b0(location.getLatitude());
                tL_messages_editMessage.media.geo_point._long = org.telegram.messenger.g0.b0(location.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) location.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i11 = h.f26232g;
                int i12 = h.f26231f;
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
                    i14 = h.f26229c + i7;
                }
                h.f26229c = i14;
                inputMedia2.flags = i13 | 6;
                org.telegram.messenger.fj fjVar = h.h;
                if (fjVar != null && (message = fjVar.f23968k) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i10;
                    pa0Var.getMessagesStorage().r1(h.h.f23968k, null, null, true);
                }
                pa0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.F4, new Object[0]);
                return;
            }
            return;
        }
        pa0Var.I0(i7, 0, user);
    }

    public static void d0(pa0 pa0Var) {
        pa0Var.glassEngine.g();
    }

    public static void e0(pa0 pa0Var, int i7) {
        float e10;
        float f10;
        TLRPC.TL_messageMediaVenue H = pa0Var.T.H(i7);
        if (H != null && H.icon != null && pa0Var.F != null) {
            pa0Var.K0 = true;
            pa0Var.simpleActionBar.o(true);
            if ("pin".equals(H.icon)) {
                e10 = pa0Var.F.e();
                f10 = 4.0f;
            } else {
                e10 = pa0Var.F.e();
                f10 = 9.0f;
            }
            float f11 = e10 - f10;
            org.telegram.messenger.da daVar = pa0Var.F;
            IMapsProvider k10 = org.telegram.messenger.t0.k();
            TLRPC.GeoPoint geoPoint = H.geo;
            daVar.b(((pb.b) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(geoPoint.lat, geoPoint._long), f11));
            Location location = pa0Var.A0;
            if (location != null) {
                location.setLatitude(H.geo.lat);
                pa0Var.A0.setLongitude(H.geo._long);
            }
            pa0Var.Q.L(pa0Var.A0);
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
        double d10 = abVar.f22854a;
        return new org.telegram.messenger.ab(d10 + Math.toDegrees(d / 6366198.0d), abVar.f22855b + Math.toDegrees(d2 / (Math.cos(Math.toRadians(d10)) * 6366198.0d)));
    }

    public final boolean A0() {
        GLSurfaceView gLSurfaceView;
        org.telegram.messenger.xa xaVar = this.H;
        if (xaVar != null && (gLSurfaceView = (GLSurfaceView) ((a8.r7) xaVar).f620f) != null && !this.J) {
            gLSurfaceView.queueEvent(new n60(12, this, gLSurfaceView));
            return true;
        }
        return false;
    }

    public final void B0(la0 la0Var) {
        double d;
        double d2;
        TLRPC.Message message;
        if (la0Var != null && (message = la0Var.f49521b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d2 = geoPoint._long;
        } else {
            org.telegram.messenger.fj fjVar = this.J0;
            if (fjVar != null) {
                TLRPC.GeoPoint geoPoint2 = fjVar.f23968k.media.geo;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.H0.geo_point;
                d = geoPoint3.lat;
                d2 = geoPoint3._long;
            }
        }
        boolean z10 = org.telegram.messenger.s2.f26723a;
        org.telegram.messenger.t0.r();
        if (this.f50865z0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f50865z0.getLatitude()), Double.valueOf(this.f50865z0.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
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
        if (this.M0 != null && !o0() && getParentActivity() != null && this.f50865z0 != null && l0()) {
            if (org.telegram.messenger.n5.E(this.m0)) {
                user = getMessagesController().c2(Long.valueOf(this.m0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.b5.B(getParentActivity(), z10, user, new org.telegram.messenger.nr() {
                @Override
                public final void a(int i7) {
                    pa0.c0(pa0.this, z10, user, i7);
                }
            }, null));
        }
    }

    public final void D0() {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        if (this.f50838e0 != null && this.H != null) {
            TextureView textureView = this.f50836d0;
            if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.f50838e0.d) == null || !surfaceView.isAttachedToWindow())) {
                ai.k0 k0Var = (ai.k0) ((a8.r7) this.H).f617b;
                TextureView textureView2 = (TextureView) q0(k0Var, TextureView.class);
                this.f50836d0 = textureView2;
                org.telegram.ui.Components.u80 u80Var = this.f50838e0;
                if (textureView2 == null) {
                    surfaceView2 = (SurfaceView) q0(k0Var, SurfaceView.class);
                } else {
                    surfaceView2 = null;
                }
                if (u80Var.d != surfaceView2) {
                    u80Var.d = surfaceView2;
                    u80Var.a();
                }
                TextureView textureView3 = this.f50836d0;
                if (textureView3 != null) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                    if (!(surfaceTextureListener instanceof na0)) {
                        this.f50836d0.setSurfaceTextureListener(new na0(this, surfaceTextureListener));
                    }
                }
                P0();
            }
            TextureView textureView4 = this.f50836d0;
            if (textureView4 == null) {
                this.f50838e0.a();
                return;
            }
            TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
            if (!(surfaceTextureListener2 instanceof na0)) {
                this.f50836d0.setSurfaceTextureListener(new na0(this, surfaceTextureListener2));
            }
        }
    }

    public final void E0(Location location) {
        if (location == null) {
            return;
        }
        this.f50865z0 = new Location(location);
        la0 la0Var = (la0) this.f50850p0.f(getUserConfig().e());
        org.telegram.messenger.pd h = getLocationController().h(this.m0);
        if (la0Var != null && h != null && la0Var.f49521b.f28426id == h.f26228b) {
            org.telegram.messenger.ab abVar = new org.telegram.messenger.ab(location.getLatitude(), location.getLongitude());
            la0Var.f49523e.b(abVar);
            org.telegram.messenger.ca caVar = la0Var.f49524f;
            if (caVar != null) {
                caVar.b(abVar);
            }
            if (this.f50851q0 == la0Var.f49520a) {
                this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(la0Var.f49523e.a()));
            }
        }
        if (this.J0 == null && this.H0 == null && this.F != null) {
            org.telegram.messenger.ab abVar2 = new org.telegram.messenger.ab(location.getLatitude(), location.getLongitude());
            ha0 ha0Var = this.Q;
            if (ha0Var != null) {
                ha0Var.M(this.f50865z0);
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
            this.Q.M(this.f50865z0);
        }
        org.telegram.ui.Components.ug0 ug0Var = this.O;
        if (ug0Var != null) {
            ug0Var.c(true);
        }
        k8.a aVar = this.L;
        if (aVar != null) {
            double latitude = this.f50865z0.getLatitude();
            double longitude = this.f50865z0.getLongitude();
            m8.a aVar2 = (m8.a) aVar.f18183b;
            LatLng latLng = new LatLng(latitude, longitude);
            try {
                v7.f fVar = (v7.f) aVar2.f20889a;
                Parcel p12 = fVar.p1();
                v7.b.b(p12, latLng);
                fVar.t1(p12, 3);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        bg.m mVar = this.C0;
        if (mVar != null) {
            mVar.a(this.f50865z0);
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
        this.m0 = org.telegram.messenger.fj.B0(fjVar.f23968k);
    }

    public final void H0(la0 la0Var) {
        if (la0Var.h == null) {
            TLRPC.User user = la0Var.f49522c;
            TLRPC.Chat chat = la0Var.d;
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
            imageReceiver.f22642h1 = new at(19, this, la0Var);
            imageReceiver.P();
            if (user == null) {
                user = chat;
            }
            imageReceiver.i0(user, b9Var, null);
            la0Var.h = imageReceiver;
        }
    }

    public final void I0(int i7, int i10, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(this.f50865z0.getLatitude());
        tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(this.f50865z0.getLongitude());
        tL_messageMediaGeoLive.heading = org.telegram.messenger.qd.e(this.f50865z0);
        int i11 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i7;
        tL_messageMediaGeoLive.proximity_notification_radius = i10;
        tL_messageMediaGeoLive.flags = i11 | 9;
        this.M0.b(tL_messageMediaGeoLive, this.N0, true, 0, 0L);
        if (i10 > 0) {
            this.O.M = true;
            this.f50834c.setImageResource(2131232213);
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
            TextView textView = this.f50832b;
            if (!z10) {
                i7 = 8;
            }
            textView.setVisibility(i7);
            TextView textView2 = this.f50832b;
            if (z10) {
                f12 = 1.0f;
            }
            textView2.setAlpha(f12);
            TextView textView3 = this.f50832b;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            textView3.setScaleX(f11);
            TextView textView4 = this.f50832b;
            if (z10) {
                f13 = 1.0f;
            }
            textView4.setScaleY(f13);
            return;
        }
        this.f50832b.setVisibility(0);
        ViewPropertyAnimator animate = this.f50832b.animate();
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
        if (this.F != null && this.f50864y0) {
            if (this.C0 == null) {
                try {
                    SensorManager sensorManager = (SensorManager) org.telegram.messenger.t0.f26915b.getSystemService("sensor");
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
                        this.C0 = new bg.m(new ca0(this, 3));
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            this.C0.a(this.f50865z0);
            bg.m mVar = this.C0;
            if (!mVar.f3304f) {
                try {
                    if (mVar.f3301b == null) {
                        SensorManager sensorManager2 = (SensorManager) org.telegram.messenger.t0.f26915b.getSystemService("sensor");
                        mVar.f3301b = sensorManager2;
                        if (sensorManager2 != null) {
                            Sensor defaultSensor = sensorManager2.getDefaultSensor(11);
                            mVar.f3302c = defaultSensor;
                            if (defaultSensor == null) {
                                mVar.d = mVar.f3301b.getDefaultSensor(1);
                                mVar.f3303e = mVar.f3301b.getDefaultSensor(2);
                            }
                        } else {
                            return;
                        }
                    }
                    Sensor sensor = mVar.f3302c;
                    if (sensor != null) {
                        mVar.f3301b.registerListener(mVar, sensor, 1);
                    } else {
                        Sensor sensor2 = mVar.d;
                        if (sensor2 != null && mVar.f3303e != null) {
                            mVar.f3301b.registerListener(mVar, sensor2, 1);
                            mVar.f3301b.registerListener(mVar, mVar.f3303e, 1);
                        } else {
                            return;
                        }
                    }
                    mVar.f3304f = true;
                    mVar.I = 0L;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    public final void L0() {
        if (this.f50864y0 && !this.f50845k0) {
            if (this.G0 == null) {
                org.telegram.messenger.qa onCreateLocationRequest = ((h6.m) org.telegram.messenger.t0.j()).onCreateLocationRequest();
                this.F0 = onCreateLocationRequest;
                ((org.telegram.messenger.z9) onCreateLocationRequest).c();
                ((org.telegram.messenger.z9) this.F0).b();
                ((org.telegram.messenger.z9) this.F0).a();
                this.G0 = new ca0(this, 2);
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
        if (mVar != null && mVar.f3304f) {
            mVar.f3304f = false;
            mVar.f3309x = false;
            try {
                mVar.f3301b.unregisterListener(mVar);
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
            i7 = (int) K.f59122a.getY();
            i10 = Math.min(i7, 0) + this.O0;
            this.f50833b0 = (this.O0 + i7) - this.f50842h0;
        } else {
            i7 = -this.P.getMeasuredHeight();
            this.f50833b0 = -org.telegram.messenger.g0.L(41.0f);
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
                float l10 = Utilities.l((org.telegram.messenger.f3.z(53.0f, i10 - this.f50842h0, org.telegram.messenger.g0.L(46.0f) + ri.a.d(this.mSystemInsets.f15893b)) - org.telegram.messenger.g0.L(7.0f)) / org.telegram.messenger.g0.L(48.0f));
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
                int L = ((i10 / 2) + (i13 - org.telegram.messenger.g0.L(f10))) - (this.f50842h0 / 2);
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
        if (this.f50857u0) {
            if (this.f50860w0) {
                this.S.setEmptyView(null);
                this.f50837e.setVisibility(8);
                this.S.setVisibility(8);
                return;
            }
            this.S.setEmptyView(this.f50837e);
            return;
        }
        this.f50837e.setVisibility(8);
    }

    public final void P0() {
        org.telegram.messenger.xa xaVar;
        boolean z10;
        bi.p2 p2Var;
        org.telegram.ui.Components.u80 u80Var = this.f50838e0;
        if (u80Var != null && (xaVar = this.H) != null) {
            ai.k0 k0Var = (ai.k0) ((a8.r7) xaVar).f617b;
            if (this.f50836d0 == null && this.f50864y0 && !isFinishing() && (p2Var = this.P) != null && p2Var.getVisibility() == 0 && k0Var.getParent() != null && k0Var.getVisibility() == 0) {
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
        if (this.F != null && (location = this.f50865z0) != null) {
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
                    ((m8.g) g1Var.f14001b).f20904a = new LatLng(this.f50865z0.getLatitude(), this.f50865z0.getLongitude());
                    m8.g gVar = (m8.g) g1Var.f14001b;
                    gVar.f20910r = true;
                    gVar.f20907e = 0.5f;
                    gVar.f20908f = 0.5f;
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
                    double longitude = this.f50865z0.getLongitude();
                    m8.f fVar = caVar.f23282a;
                    LatLng latLng = new LatLng(latitude, longitude);
                    fVar.getClass();
                    try {
                        v7.i iVar = (v7.i) fVar.f20903a;
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
                        caVar2.f23282a.a(c8.r9.b(i10));
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
        if (this.f50832b == null) {
            return;
        }
        boolean z11 = false;
        if (this.f50853r0) {
            J0(false, true);
            r0();
            return;
        }
        if (getConnectionsManager() != null) {
            i7 = getConnectionsManager().getCurrentTime();
        } else {
            i7 = 0;
        }
        ArrayList arrayList = this.f50849o0;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Message message = ((la0) arrayList.get(i12)).f49521b;
            if (message != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > i7)) {
                i11++;
            }
        }
        if (this.f50850p0.f(getUserConfig().e()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f50865z0 != null && !z10) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29577n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29339a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29360b7));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29397d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29488i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xj));
    }

    @Override
    public final android.view.View createView(android.content.Context r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pa0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ha0 ha0Var;
        long B0;
        ha0 ha0Var2;
        if (i7 == org.telegram.messenger.ks.f25192t) {
            removeSelfFromStack(true);
            return;
        }
        if (i7 == org.telegram.messenger.ks.f25224x4) {
            this.f50845k0 = false;
            ha0 ha0Var3 = this.Q;
            if (ha0Var3 != null) {
                ha0Var3.O(false, false);
            }
            L0();
        } else if (i7 == org.telegram.messenger.ks.f25231y4) {
            this.f50845k0 = true;
            ha0 ha0Var4 = this.Q;
            if (ha0Var4 != null) {
                ha0Var4.O(true, false);
            }
        } else if (i7 == org.telegram.messenger.ks.F4) {
            ha0 ha0Var5 = this.Q;
            if (ha0Var5 != null) {
                ha0Var5.f();
            }
            R0();
        } else if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.m0 && this.J0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i11);
                    if (fjVar.C3()) {
                        i0(fjVar.f23968k);
                        z10 = true;
                    } else {
                        TLRPC.Message message = fjVar.f23968k;
                        if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && org.telegram.messenger.n5.E(org.telegram.messenger.fj.B0(message))) {
                            this.f50834c.setImageResource(2131232212);
                            k8.a aVar = this.L;
                            if (aVar != null) {
                                aVar.b1();
                                this.L = null;
                            }
                        }
                    }
                }
                if (z10 && (ha0Var2 = this.Q) != null) {
                    ha0Var2.N(this.f50849o0);
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
                        TLRPC.Message message2 = fjVar2.f23968k;
                        TLRPC.Peer peer = message2.from_id;
                        if (peer != null) {
                            B0 = org.telegram.messenger.fj.B1(peer);
                        } else {
                            B0 = org.telegram.messenger.fj.B0(message2);
                        }
                        la0 la0Var = (la0) this.f50850p0.f(B0);
                        if (la0Var != null) {
                            org.telegram.messenger.pd h = getLocationController().h(longValue);
                            if (h == null || h.f26228b != fjVar2.e1()) {
                                TLRPC.Message message3 = fjVar2.f23968k;
                                la0Var.f49521b = message3;
                                TLRPC.GeoPoint geoPoint = message3.media.geo;
                                org.telegram.messenger.ab abVar = new org.telegram.messenger.ab(geoPoint.lat, geoPoint._long);
                                la0Var.f49523e.b(abVar);
                                if (this.f50851q0 == la0Var.f49520a) {
                                    this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(la0Var.f49523e.a()));
                                }
                                org.telegram.messenger.ca caVar = la0Var.f49524f;
                                if (caVar != null) {
                                    caVar.a();
                                    la0Var.f49524f.b(abVar);
                                    int i13 = fjVar2.f23968k.media.heading;
                                    if (i13 != 0) {
                                        la0Var.f49524f.c(i13);
                                        if (!la0Var.f49525g) {
                                            la0Var.f49524f.f23282a.a(c8.r9.b(2131231651));
                                            la0Var.f49525g = true;
                                        }
                                    } else if (la0Var.f49525g) {
                                        la0Var.f49524f.c(0.0f);
                                        la0Var.f49524f.f23282a.a(c8.r9.b(2131231650));
                                        la0Var.f49525g = false;
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                }
                if (z11 && (ha0Var = this.Q) != null) {
                    ha0Var.f();
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
            UndoView[] undoViewArr = this.f50861x;
            if (i7 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.w6(undoViewArr[i7], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.wj));
            i7++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29469h5));
        org.telegram.ui.ActionBar.h5 h5Var = this.f50852r;
        if (h5Var != null) {
            editTextBoldCursor = h5Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29504j5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.pj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.R, 196608, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Hi));
        return arrayList;
    }

    public final la0 i0(TLRPC.Message message) {
        la0 la0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d2 = geoPoint._long;
        long B1 = org.telegram.messenger.fj.B1(message.from_id);
        a0.h hVar = this.f50850p0;
        la0 la0Var2 = (la0) hVar.f(B1);
        if (la0Var2 == null) {
            ?? obj = new Object();
            obj.f49521b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f49522c = getMessagesController().c2(Long.valueOf(obj.f49521b.from_id.user_id));
                obj.f49520a = obj.f49521b.from_id.user_id;
            } else {
                long B0 = org.telegram.messenger.fj.B0(message);
                if (org.telegram.messenger.n5.E(B0)) {
                    obj.f49522c = getMessagesController().c2(Long.valueOf(B0));
                } else {
                    obj.d = getMessagesController().O0(Long.valueOf(-B0));
                }
                obj.f49520a = B0;
            }
            H0(obj);
            try {
                h9.g1 g1Var = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                m8.g gVar = (m8.g) g1Var.f14001b;
                ((m8.g) g1Var.f14001b).f20904a = new LatLng(d, d2);
                Bitmap n02 = n0(obj);
                la0Var = obj;
                if (n02 != null) {
                    gVar.d = c8.r9.a(n02);
                    gVar.f20907e = 0.5f;
                    gVar.f20908f = 0.8010882f;
                    obj.f49523e = this.F.a(g1Var);
                    if (!org.telegram.messenger.o10.C(obj.f49522c)) {
                        h9.g1 g1Var2 = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                        ((m8.g) g1Var2.f14001b).f20904a = new LatLng(d, d2);
                        m8.g gVar2 = (m8.g) g1Var2.f14001b;
                        gVar2.f20910r = true;
                        gVar2.f20907e = 0.5f;
                        gVar2.f20908f = 0.5f;
                        org.telegram.messenger.ca a10 = this.F.a(g1Var2);
                        obj.f49524f = a10;
                        int i7 = message.media.heading;
                        if (i7 != 0) {
                            a10.c(i7);
                            obj.f49524f.f23282a.a(c8.r9.b(2131231651));
                            obj.f49525g = true;
                        } else {
                            a10.c(0.0f);
                            obj.f49524f.f23282a.a(c8.r9.b(2131231650));
                            obj.f49525g = false;
                        }
                    }
                    this.f50849o0.add(obj);
                    hVar.k(obj, obj.f49520a);
                    org.telegram.messenger.pd h = getLocationController().h(this.m0);
                    int i10 = (obj.f49520a > getUserConfig().e() ? 1 : (obj.f49520a == getUserConfig().e() ? 0 : -1));
                    la0Var = obj;
                    la0Var = obj;
                    if (i10 == 0 && h != null) {
                        int i11 = obj.f49521b.f28426id;
                        la0Var = obj;
                        if (i11 == h.f26228b) {
                            Location location = this.f50865z0;
                            la0Var = obj;
                            if (location != null) {
                                double latitude = location.getLatitude();
                                double longitude = this.f50865z0.getLongitude();
                                m8.f fVar = obj.f49523e.f23282a;
                                LatLng latLng = new LatLng(latitude, longitude);
                                fVar.getClass();
                                try {
                                    v7.i iVar = (v7.i) fVar.f20903a;
                                    Parcel p12 = iVar.p1();
                                    v7.b.b(p12, latLng);
                                    iVar.t1(p12, 3);
                                    la0Var = obj;
                                } catch (RemoteException e10) {
                                    throw new RuntimeException(e10);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                la0Var = obj;
            }
        } else {
            la0Var2.f49521b = message;
            m8.f fVar2 = la0Var2.f49523e.f23282a;
            LatLng latLng2 = new LatLng(d, d2);
            fVar2.getClass();
            try {
                v7.i iVar2 = (v7.i) fVar2.f20903a;
                Parcel p13 = iVar2.p1();
                v7.b.b(p13, latLng2);
                iVar2.t1(p13, 3);
                int i12 = (this.f50851q0 > la0Var2.f49520a ? 1 : (this.f50851q0 == la0Var2.f49520a ? 0 : -1));
                la0Var = la0Var2;
                if (i12 == 0) {
                    this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(la0Var2.f49523e.a()));
                    la0Var = la0Var2;
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
        return la0Var;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6)) > 0.699999988079071d) {
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
            int i7 = bVar.f15893b;
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
            if (org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6)) < 0.721f) {
                i7 = 2131624086;
            } else {
                i7 = 0;
            }
            if (i7 != 0) {
                if (!this.f50843i0) {
                    this.f50843i0 = true;
                    this.F.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f26915b, i7));
                    k8.a aVar = this.L;
                    if (aVar != null) {
                        aVar.g1(-1);
                        this.L.c1(553648127);
                    }
                }
            } else if (this.f50843i0) {
                this.f50843i0 = false;
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
                if (!((LocationManager) org.telegram.messenger.t0.f26915b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i7 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder.m(2131624120, 72, getThemedColor(i7), null);
                    alertDialog$Builder.n(i7, getResourceProvider());
                    alertDialog$Builder.f28746a.U = org.telegram.messenger.gd.M0(2131749355, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751795, null), new ca0(this, 5));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    showDialog(alertDialog$Builder.f28746a);
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
        double latitude = this.f50865z0.getLatitude();
        double longitude = this.f50865z0.getLongitude();
        hi.w4 w4Var = (hi.w4) onCreateCircleOptions;
        m8.b bVar = (m8.b) w4Var.f15645b;
        LatLng latLng = new LatLng(latitude, longitude);
        bVar.getClass();
        bVar.f20890a = latLng;
        double d = i7;
        m8.b bVar2 = (m8.b) w4Var.f15645b;
        bVar2.f20891b = d;
        if (x0()) {
            bVar2.d = -1771658281;
            bVar2.f20893e = 476488663;
        } else {
            bVar2.d = -1774024971;
            bVar2.f20893e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (org.telegram.messenger.fb fbVar : asList) {
            if (fbVar instanceof org.telegram.messenger.eb) {
                arrayList.add(new m8.c(20, 1));
            } else if (fbVar instanceof org.telegram.messenger.db) {
                arrayList.add(new m8.c(20, 0));
            }
        }
        bVar2.f20896r = arrayList;
        bVar2.f20892c = 2;
        org.telegram.messenger.da daVar = this.F;
        k8.a aVar2 = daVar.f23506a;
        aVar2.getClass();
        try {
            l8.e eVar = (l8.e) aVar2.f18183b;
            Parcel p12 = eVar.p1();
            v7.b.b(p12, bVar2);
            Parcel o12 = eVar.o1(p12, 35);
            IBinder readStrongBinder = o12.readStrongBinder();
            int i10 = v7.g.f59299b;
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
            daVar.f23508c.put(aVar3, aVar4);
            this.L = aVar4;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final Bitmap n0(la0 la0Var) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.t0.f26915b.getResources().getDrawable(2131231652);
                drawable.setBounds(0, 0, org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
                TLRPC.User user = la0Var.f49522c;
                if (user != null) {
                    b9Var.r(user);
                } else {
                    TLRPC.Chat chat = la0Var.d;
                    if (chat != null) {
                        b9Var.q(chat);
                    }
                }
                canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                b9Var.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
                b9Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = la0Var.h;
                if (imageReceiver != null && imageReceiver.J()) {
                    bitmap = la0Var.h.n();
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
        UndoView undoView = this.f50861x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25192t);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25224x4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25231y4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.F4);
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
        org.telegram.ui.Components.u80 u80Var = this.f50838e0;
        if (u80Var != null) {
            u80Var.f40261i = true;
            u80Var.f40260g = false;
            u80Var.d();
            u80Var.d = null;
            u80Var.f40258e = null;
            u80Var.f40259f = null;
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25224x4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25231y4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.F4);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25192t);
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
        UndoView undoView = this.f50861x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        ha0 ha0Var = this.Q;
        if (ha0Var != null) {
            ha0Var.F();
        }
        org.telegram.ui.Components.il ilVar = this.T;
        if (ilVar != null) {
            ilVar.F();
        }
        z90 z90Var = this.Q0;
        if (z90Var != null) {
            org.telegram.messenger.g0.r(z90Var);
            this.Q0 = null;
        }
        ArrayList arrayList = this.f50849o0;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            la0 la0Var = (la0) arrayList.get(i7);
            ImageReceiver imageReceiver = la0Var.h;
            if (imageReceiver != null) {
                imageReceiver.R();
                la0Var.h = null;
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
        if (xaVar != null && this.f50862x0 && (mVar = (h6.m) ((m.o3) ((ai.k0) ((a8.r7) xaVar).f617b).f1263b).f20162b) != null) {
            try {
                l8.f fVar = (l8.f) mVar.f13940c;
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
        if (xaVar != null && this.f50862x0) {
            try {
                ((a8.r7) xaVar).B();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        UndoView undoView = this.f50861x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f50864y0 = false;
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
        if (xaVar != null && this.f50862x0) {
            try {
                ((a8.r7) xaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f50864y0 = true;
        K0();
        L0();
        D0();
        s0(true);
        if (o0()) {
            this.f50856t0 = false;
        } else if (this.f50856t0 && (parentActivity = getParentActivity()) != null) {
            this.f50856t0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        z90 z90Var = this.Q0;
        if (z90Var != null) {
            org.telegram.messenger.g0.r(z90Var);
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
            org.telegram.ui.ActionBar.h5 h5Var = this.f50852r;
            if (h5Var != null && h5Var.getSearchField() != null) {
                this.f50852r.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29504j5));
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
        if (this.f50848n0) {
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
                if (this.f50834c.getVisibility() != 8 && org.telegram.messenger.fj.B1(message.from_id) != getUserConfig().e()) {
                    this.f50834c.setVisibility(0);
                    this.E = true;
                    this.f50834c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new ay(this, 4)).start();
                }
            }
        }
        if (vaVar != null) {
            if (this.f50848n0) {
                this.R.w0(0, org.telegram.messenger.g0.L(99.0f), null);
            }
            this.f50848n0 = false;
            this.Q.N(this.f50849o0);
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
            ArrayList arrayList2 = this.f50849o0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                la0 la0Var = (la0) arrayList2.get(i12);
                org.telegram.messenger.ca caVar = la0Var.f49523e;
                if (caVar != null && (message = la0Var.f49521b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i7)) {
                    arrayList.add(caVar.a());
                }
            }
            if (this.f50850p0.f(getUserConfig().e()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Location location = this.f50865z0;
            if (location != null && !z10) {
                arrayList.add(new org.telegram.messenger.ab(location.getLatitude(), this.f50865z0.getLongitude()));
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
                            double d12 = abVar.f22854a;
                            if (d12 < d2) {
                                d2 = d12;
                            }
                            if (d12 > d) {
                                d = d12;
                            }
                            double d13 = abVar.f22855b;
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
                ja0 ja0Var = this.R0;
                if (ja0Var != null && ja0Var.m0(8) > 0) {
                    this.O0 -= org.telegram.messenger.g0.L(200.0f);
                }
                this.f50835c0 = org.telegram.messenger.g0.L(100.0f) + (measuredHeight - this.O0);
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
        return org.telegram.messenger.g0.L(10.0f) + this.f50842h0 + this.f50835c0;
    }

    public final int u0() {
        return org.telegram.messenger.g0.L(10.0f) + this.O0 + this.f50835c0;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        ArrayList arrayList = (ArrayList) getLocationController().f26383c.f(org.telegram.messenger.fj.B0(this.J0.f23968k));
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
        long B0 = org.telegram.messenger.fj.B0(this.J0.f23968k);
        tL_messages_getRecentLocations.peer = getMessagesController().l1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new fi.r5(this, B0, 1));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView w0() {
        UndoView[] undoViewArr = this.f50861x;
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
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.n6.I.q()) || org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void y0() {
        SharedPreferences g12;
        int i7;
        ImageView imageView = this.f50834c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.E && (i7 = (g12 = org.telegram.messenger.mp.g1()).getInt("proximityhint", 0)) < 3) {
            g12.edit().putInt("proximityhint", i7 + 1).commit();
            if (org.telegram.messenger.n5.E(this.m0)) {
                this.f50854s.v(org.telegram.messenger.gd.a0("ProximityTooltioUser", null, 2131746417, org.telegram.messenger.o10.k(getMessagesController().c2(Long.valueOf(this.m0)), true)));
            } else {
                this.f50854s.v(org.telegram.messenger.gd.M0(2131746418, null));
            }
            this.f50854s.x();
        }
    }
}
