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
public class pa0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public Location A0;
    public int B0;
    public TLRPC.TL_channelLocation C0;
    public TLRPC.TL_channelLocation D0;
    public boolean E;
    public org.telegram.messenger.gj E0;
    public org.telegram.messenger.ea F;
    public boolean F0;
    public org.telegram.messenger.ta G;
    public boolean G0;
    public org.telegram.messenger.ya H;
    public ma0 H0;
    public org.telegram.messenger.ta I;
    public final int I0;
    public boolean J;
    public int J0;
    public float K;
    public ka0 K0;
    public k8.a L;
    public y90 L0;
    public double M;
    public ja0 M0;
    public boolean N;
    public org.telegram.ui.Cells.x3 N0;
    public org.telegram.ui.Components.kg0 O;
    public TL_stories.MediaArea O0;
    public bi.v1 P;
    public boolean P0;
    public ha0 Q;
    public boolean Q0;
    public ct R;
    public Boolean R0;
    public org.telegram.ui.Components.uj0 S;
    public org.telegram.ui.Components.bl T;
    public View U;
    public v4.b0 V;
    public org.telegram.ui.ActionBar.d5 W;
    public FrameLayout X;
    public FrameLayout Y;
    public fh.g Z;
    public ImageView f50192a;
    public final RectF f50193a0;
    public TextView f50194b;
    public int f50195b0;
    public ImageView f50196c;
    public int f50197c0;
    public org.telegram.ui.ActionBar.d5 d;
    public TextureView f50198d0;
    public LinearLayout f50199e;
    public org.telegram.ui.Components.j80 f50200e0;
    public ImageView f50201f;
    public final RectF f50202f0;
    public final Paint f50203g0;
    public TextView h;
    public int f50204h0;
    public boolean f50205i0;
    public boolean f50206j0;
    public boolean f50207k0;
    public boolean f50208l0;
    public long m0;
    public TextView f50209n;
    public boolean f50210n0;
    public final ArrayList f50211o0;
    public final a0.h f50212p0;
    public long f50213q0;
    public org.telegram.ui.ActionBar.d5 f50214r;
    public boolean f50215r0;
    public hi.l3 f50216s;
    public AnimatorSet f50217s0;
    public boolean f50218t0;
    public boolean f50219u0;
    public boolean f50220v0;
    public boolean f50221w;
    public boolean f50222w0;
    public final UndoView[] f50223x;
    public boolean f50224x0;
    public boolean f50225y;
    public boolean f50226y0;
    public Location f50227z0;

    public pa0(int i7) {
        super(null);
        this.f50223x = new UndoView[2];
        this.f50193a0 = new RectF();
        this.f50202f0 = new RectF();
        this.f50203g0 = new Paint();
        this.f50206j0 = true;
        this.f50207k0 = false;
        this.f50208l0 = true;
        this.f50210n0 = true;
        this.f50211o0 = new ArrayList();
        this.f50212p0 = new a0.h();
        this.f50213q0 = -1L;
        this.f50218t0 = true;
        this.J0 = (org.telegram.messenger.g0.f23609q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.Q0 = true;
        this.I0 = i7;
        org.telegram.messenger.g0.a0();
    }

    public static void Z(pa0 pa0Var, Canvas canvas, RectF rectF) {
        ai.j0 j0Var;
        Paint paint = pa0Var.f50203g0;
        int i7 = org.telegram.ui.ActionBar.j6.f28922h5;
        paint.setColor(pa0Var.getThemedColor(i7));
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) pa0Var.fragmentView;
        org.telegram.ui.Components.uj0 uj0Var = pa0Var.S;
        if (uj0Var != null && uj0Var.getVisibility() == 0) {
            org.telegram.ui.Components.uj0 uj0Var2 = pa0Var.S;
            ih.d.a(uj0Var2, canvas, rectF, uj0Var2, viewGroup);
            return;
        }
        if (pa0Var.P.getVisibility() == 0) {
            RectF rectF2 = pa0Var.f50202f0;
            canvas.save();
            canvas.translate(pa0Var.P.getX(), pa0Var.P.getY());
            canvas.clipRect(0.0f, 0.0f, pa0Var.P.getWidth(), viewGroup.getHeight() - pa0Var.P.getY());
            Drawable background = pa0Var.P.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            org.telegram.messenger.ya yaVar = pa0Var.H;
            if (yaVar != null) {
                j0Var = (ai.j0) ((a8.r7) yaVar).f617b;
            } else {
                j0Var = null;
            }
            if (j0Var != null && j0Var.getParent() == pa0Var.P && j0Var.getVisibility() == 0 && j0Var.getAlpha() > 0.0f) {
                TextureView textureView = pa0Var.f50198d0;
                if (textureView != null && textureView.isAttachedToWindow() && jh.k.c(pa0Var.f50198d0, pa0Var.P, rectF2)) {
                    if (j0Var.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (j0Var.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    pa0Var.f50198d0.draw(canvas);
                    canvas.restore();
                } else if (pa0Var.f50200e0 != null) {
                    rectF2.set(j0Var.getX(), j0Var.getY(), j0Var.getX() + j0Var.getWidth(), j0Var.getY() + j0Var.getHeight());
                    org.telegram.ui.Components.j80 j80Var = pa0Var.f50200e0;
                    float alpha = j0Var.getAlpha();
                    Paint paint2 = j80Var.f35914c;
                    Bitmap bitmap = j80Var.f35915e;
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
            int L = org.telegram.messenger.g0.L(22.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + pa0Var.mSystemInsets.f15575b;
            float f10 = L;
            if (rectF.top >= f10) {
                return;
            }
            canvas.save();
            canvas.clipRect(0.0f, Math.min(rectF.top, f10), viewGroup.getWidth(), f10);
            if (pa0Var.f50195b0 < L) {
                paint.setColor(pa0Var.getThemedColor(i7));
                paint.setAlpha(205);
                canvas.drawRect(0.0f, Math.max(pa0Var.f50195b0, rectF.top), viewGroup.getWidth(), f10, paint);
            }
            ct ctVar = pa0Var.R;
            ih.d.a(ctVar, canvas, rectF, ctVar, viewGroup);
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

    public static void b0(pa0 pa0Var, boolean z10, TLRPC.User user, int i7) {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z10) {
            org.telegram.messenger.qd h = pa0Var.getLocationController().h(pa0Var.m0);
            if (h != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = pa0Var.getMessagesController().j1(h.f26078a);
                tL_messages_editMessage.f28135id = h.f26079b;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location location = org.telegram.messenger.rd.f(pa0Var.currentAccount).f26276s;
                tL_messages_editMessage.media.geo_point.lat = org.telegram.messenger.g0.b0(location.getLatitude());
                tL_messages_editMessage.media.geo_point._long = org.telegram.messenger.g0.b0(location.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) location.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i11 = h.f26083g;
                int i12 = h.f26082f;
                if (i11 != i12) {
                    inputMedia.proximity_notification_radius = i12;
                    inputMedia.flags |= 8;
                }
                inputMedia.heading = org.telegram.messenger.rd.e(location);
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
                    i14 = h.f26080c + i7;
                }
                h.f26080c = i14;
                inputMedia2.flags = i13 | 6;
                org.telegram.messenger.gj gjVar = h.h;
                if (gjVar != null && (message = gjVar.f23817k) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i10;
                    pa0Var.getMessagesStorage().r1(h.h.f23817k, null, null, true);
                }
                pa0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.D4, new Object[0]);
                return;
            }
            return;
        }
        pa0Var.I0(i7, 0, user);
    }

    public static void c0(pa0 pa0Var) {
        y90 y90Var;
        pa0Var.getLocationController().j(pa0Var.m0);
        if (!pa0Var.isPaused && (y90Var = pa0Var.L0) != null) {
            org.telegram.messenger.g0.i3(y90Var, 5000L);
        }
    }

    public static void d0(pa0 pa0Var) {
        pa0Var.glassEngine.g();
    }

    public static void e0(pa0 pa0Var, int i7) {
        float e10;
        float f10;
        TLRPC.TL_messageMediaVenue H = pa0Var.T.H(i7);
        if (H != null && H.icon != null && pa0Var.F != null) {
            pa0Var.F0 = true;
            pa0Var.simpleActionBar.m(true);
            if ("pin".equals(H.icon)) {
                e10 = pa0Var.F.e();
                f10 = 4.0f;
            } else {
                e10 = pa0Var.F.e();
                f10 = 9.0f;
            }
            float f11 = e10 - f10;
            org.telegram.messenger.ea eaVar = pa0Var.F;
            IMapsProvider k10 = org.telegram.messenger.t0.k();
            TLRPC.GeoPoint geoPoint = H.geo;
            eaVar.b(((pb.b) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.bb(geoPoint.lat, geoPoint._long), f11));
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

    public static org.telegram.messenger.bb z0(org.telegram.messenger.bb bbVar, double d, double d2) {
        double d10 = bbVar.f22677a;
        return new org.telegram.messenger.bb(d10 + Math.toDegrees(d / 6366198.0d), bbVar.f22678b + Math.toDegrees(d2 / (Math.cos(Math.toRadians(d10)) * 6366198.0d)));
    }

    public final boolean A0() {
        GLSurfaceView gLSurfaceView;
        org.telegram.messenger.ya yaVar = this.H;
        if (yaVar != null && (gLSurfaceView = (GLSurfaceView) ((a8.r7) yaVar).f620f) != null && !this.J) {
            gLSurfaceView.queueEvent(new g50(17, this, gLSurfaceView));
            return true;
        }
        return false;
    }

    public final void B0(la0 la0Var) {
        double d;
        double d2;
        TLRPC.Message message;
        if (la0Var != null && (message = la0Var.f48922b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d2 = geoPoint._long;
        } else {
            org.telegram.messenger.gj gjVar = this.E0;
            if (gjVar != null) {
                TLRPC.GeoPoint geoPoint2 = gjVar.f23817k.media.geo;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.C0.geo_point;
                d = geoPoint3.lat;
                d2 = geoPoint3._long;
            }
        }
        boolean z10 = org.telegram.messenger.r2.f26198a;
        org.telegram.messenger.t0.r();
        if (this.f50227z0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f50227z0.getLatitude()), Double.valueOf(this.f50227z0.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
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
        if (this.H0 != null && !o0() && getParentActivity() != null && this.f50227z0 != null && l0()) {
            if (org.telegram.messenger.m5.E(this.m0)) {
                user = getMessagesController().a2(Long.valueOf(this.m0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.t4.B(getParentActivity(), z10, user, new org.telegram.messenger.pr() {
                @Override
                public final void a(int i7) {
                    pa0.b0(pa0.this, z10, user, i7);
                }
            }, null));
        }
    }

    public final void D0() {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        if (this.f50200e0 != null && this.H != null) {
            TextureView textureView = this.f50198d0;
            if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.f50200e0.d) == null || !surfaceView.isAttachedToWindow())) {
                ai.j0 j0Var = (ai.j0) ((a8.r7) this.H).f617b;
                TextureView textureView2 = (TextureView) q0(j0Var, TextureView.class);
                this.f50198d0 = textureView2;
                org.telegram.ui.Components.j80 j80Var = this.f50200e0;
                if (textureView2 == null) {
                    surfaceView2 = (SurfaceView) q0(j0Var, SurfaceView.class);
                } else {
                    surfaceView2 = null;
                }
                if (j80Var.d != surfaceView2) {
                    j80Var.d = surfaceView2;
                    j80Var.a();
                }
                TextureView textureView3 = this.f50198d0;
                if (textureView3 != null) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                    if (!(surfaceTextureListener instanceof na0)) {
                        this.f50198d0.setSurfaceTextureListener(new na0(this, surfaceTextureListener));
                    }
                }
                M0();
            }
            TextureView textureView4 = this.f50198d0;
            if (textureView4 == null) {
                this.f50200e0.a();
                return;
            }
            TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
            if (!(surfaceTextureListener2 instanceof na0)) {
                this.f50198d0.setSurfaceTextureListener(new na0(this, surfaceTextureListener2));
            }
        }
    }

    public final void E0(Location location) {
        if (location == null) {
            return;
        }
        this.f50227z0 = new Location(location);
        la0 la0Var = (la0) this.f50212p0.f(getUserConfig().e());
        org.telegram.messenger.qd h = getLocationController().h(this.m0);
        if (la0Var != null && h != null && la0Var.f48922b.f28072id == h.f26079b) {
            org.telegram.messenger.bb bbVar = new org.telegram.messenger.bb(location.getLatitude(), location.getLongitude());
            la0Var.f48924e.b(bbVar);
            org.telegram.messenger.da daVar = la0Var.f48925f;
            if (daVar != null) {
                daVar.b(bbVar);
            }
            if (this.f50213q0 == la0Var.f48921a) {
                this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(la0Var.f48924e.a()));
            }
        }
        if (this.E0 == null && this.C0 == null && this.F != null) {
            org.telegram.messenger.bb bbVar2 = new org.telegram.messenger.bb(location.getLatitude(), location.getLongitude());
            ha0 ha0Var = this.Q;
            if (ha0Var != null) {
                ha0Var.M(this.f50227z0);
            }
            if (!this.F0) {
                this.A0 = new Location(location);
                if (this.G0) {
                    this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(bbVar2));
                } else {
                    this.G0 = true;
                    this.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(bbVar2, this.F.e() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.f50227z0);
        }
        org.telegram.ui.Components.kg0 kg0Var = this.O;
        if (kg0Var != null) {
            kg0Var.c(true);
        }
        k8.a aVar = this.L;
        if (aVar != null) {
            double latitude = this.f50227z0.getLatitude();
            double longitude = this.f50227z0.getLongitude();
            m8.a aVar2 = (m8.a) aVar.f17788b;
            LatLng latLng = new LatLng(latitude, longitude);
            try {
                v7.f fVar = (v7.f) aVar2.f20525a;
                Parcel p12 = fVar.p1();
                v7.b.b(p12, latLng);
                fVar.t1(p12, 3);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        N0();
    }

    public final void F0(View view) {
        fh.g c10 = getBaseSimpleGlass().f56042c.c(view, null, false);
        c10.p(c8.g0.l(getResourceProvider()));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        view.setBackground(c10);
        c8.na.a(view);
    }

    public final void G0(org.telegram.messenger.gj gjVar) {
        this.E0 = gjVar;
        this.m0 = org.telegram.messenger.gj.B0(gjVar.f23817k);
    }

    public final void H0(la0 la0Var) {
        if (la0Var.h == null) {
            TLRPC.User user = la0Var.f48923c;
            TLRPC.Chat chat = la0Var.d;
            if (user == null && chat == 0) {
                return;
            }
            org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            if (user != null) {
                t8Var.r(user);
            } else {
                t8Var.q(chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.d = this.currentAccount;
            imageReceiver.f22276h1 = new tr(20, this, la0Var);
            imageReceiver.P();
            if (user == null) {
                user = chat;
            }
            imageReceiver.i0(user, t8Var, null);
            la0Var.h = imageReceiver;
        }
    }

    public final void I0(int i7, int i10, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(this.f50227z0.getLatitude());
        tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(this.f50227z0.getLongitude());
        tL_messageMediaGeoLive.heading = org.telegram.messenger.rd.e(this.f50227z0);
        int i11 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i7;
        tL_messageMediaGeoLive.proximity_notification_radius = i10;
        tL_messageMediaGeoLive.flags = i11 | 9;
        this.H0.d(tL_messageMediaGeoLive, this.I0, true, 0, 0L);
        if (i10 > 0) {
            this.O.M = true;
            this.f50196c.setImageResource(2131232212);
            org.telegram.ui.Components.kg0 kg0Var = this.O;
            if (kg0Var != null) {
                kg0Var.a();
            }
            w0().k(0L, 24, Integer.valueOf(i10), user, null, null);
            return;
        }
        finishFragment();
    }

    public final void J0(boolean z10, boolean z11) {
        float f10;
        float f11;
        Boolean bool = this.R0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.R0 = Boolean.valueOf(z10);
        float f12 = 0.0f;
        int i7 = 0;
        float f13 = 0.7f;
        if (!z11) {
            TextView textView = this.f50194b;
            if (!z10) {
                i7 = 8;
            }
            textView.setVisibility(i7);
            TextView textView2 = this.f50194b;
            if (z10) {
                f12 = 1.0f;
            }
            textView2.setAlpha(f12);
            TextView textView3 = this.f50194b;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            textView3.setScaleX(f11);
            TextView textView4 = this.f50194b;
            if (z10) {
                f13 = 1.0f;
            }
            textView4.setScaleY(f13);
            return;
        }
        this.f50194b.setVisibility(0);
        ViewPropertyAnimator animate = this.f50194b.animate();
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
        scaleX.scaleY(f13).setInterpolator(org.telegram.ui.Components.er.h).setDuration(420L).withEndAction(new org.telegram.ui.Components.fp0(9, this, z10)).start();
    }

    public final void K0(boolean z10) {
        int i7;
        int i10;
        FrameLayout.LayoutParams layoutParams;
        int i11;
        v4.e1 K = this.R.K(0);
        if (K != null) {
            i7 = (int) K.f58535a.getY();
            i10 = Math.min(i7, 0) + this.J0;
            this.f50195b0 = (this.J0 + i7) - this.f50204h0;
        } else {
            i7 = -this.P.getMeasuredHeight();
            this.f50195b0 = -org.telegram.messenger.g0.L(41.0f);
            i10 = 0;
        }
        this.R.invalidate();
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            int i12 = 4;
            if (i10 <= 0) {
                if (((ai.j0) ((a8.r7) this.H).f617b).getVisibility() == 0) {
                    ((ai.j0) ((a8.r7) this.H).f617b).setVisibility(4);
                    this.P.setVisibility(4);
                }
            } else if (((ai.j0) ((a8.r7) this.H).f617b).getVisibility() == 4) {
                ((ai.j0) ((a8.r7) this.H).f617b).setVisibility(0);
                this.P.setVisibility(0);
            }
            this.P.setTranslationY(Math.min(0, i7));
            int i13 = -i7;
            ((ai.j0) ((a8.r7) this.H).f617b).setTranslationY(Math.max(0, i13 / 2));
            FrameLayout frameLayout = this.X;
            float f10 = 48.0f;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i7));
                float l10 = Utilities.l((org.telegram.messenger.k5.z(53.0f, i10 - this.f50204h0, org.telegram.messenger.g0.L(46.0f) + ri.a.d(this.mSystemInsets.f15575b)) - org.telegram.messenger.g0.L(7.0f)) / org.telegram.messenger.g0.L(48.0f));
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
                M0();
            }
            View view = this.U;
            if (view != null) {
                if (view.getTag() != null) {
                    f10 = 69.0f;
                }
                int L = ((i10 / 2) + (i13 - org.telegram.messenger.g0.L(f10))) - (this.f50204h0 / 2);
                this.B0 = L;
                view.setTranslationY(L);
            }
            if (!z10 && (layoutParams = (FrameLayout.LayoutParams) ((ai.j0) ((a8.r7) this.H).f617b).getLayoutParams()) != null && layoutParams.height != u0()) {
                layoutParams.height = u0();
                org.telegram.messenger.ea eaVar = this.F;
                if (eaVar != null) {
                    eaVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
                }
                ((ai.j0) ((a8.r7) this.H).f617b).setLayoutParams(layoutParams);
            }
        }
    }

    public final void L0() {
        if (this.f50219u0) {
            if (this.f50222w0) {
                this.S.setEmptyView(null);
                this.f50199e.setVisibility(8);
                this.S.setVisibility(8);
                return;
            }
            this.S.setEmptyView(this.f50199e);
            return;
        }
        this.f50199e.setVisibility(8);
    }

    public final void M0() {
        org.telegram.messenger.ya yaVar;
        boolean z10;
        bi.v1 v1Var;
        org.telegram.ui.Components.j80 j80Var = this.f50200e0;
        if (j80Var != null && (yaVar = this.H) != null) {
            ai.j0 j0Var = (ai.j0) ((a8.r7) yaVar).f617b;
            if (this.f50198d0 == null && this.f50226y0 && !isFinishing() && (v1Var = this.P) != null && v1Var.getVisibility() == 0 && j0Var.getParent() != null && j0Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (j80Var.f35917g != z10) {
                j80Var.f35917g = z10;
                if (z10) {
                    j80Var.a();
                } else {
                    j80Var.d();
                }
            }
        }
    }

    public final void N0() {
        int i7;
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.f50194b == null) {
            return;
        }
        boolean z11 = false;
        if (this.f50215r0) {
            J0(false, true);
            r0();
            return;
        }
        if (getConnectionsManager() != null) {
            i7 = getConnectionsManager().getCurrentTime();
        } else {
            i7 = 0;
        }
        ArrayList arrayList = this.f50211o0;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Message message = ((la0) arrayList.get(i12)).f48922b;
            if (message != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > i7)) {
                i11++;
            }
        }
        if (this.f50212p0.f(getUserConfig().e()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f50227z0 != null && !z10) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29030n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28792a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.xj));
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
        if (i7 == org.telegram.messenger.ns.f25572t) {
            removeSelfFromStack(true);
            return;
        }
        if (i7 == org.telegram.messenger.ns.f25590v4) {
            this.f50207k0 = false;
            ha0 ha0Var3 = this.Q;
            if (ha0Var3 != null) {
                ha0Var3.O(false, false);
            }
            org.telegram.messenger.ea eaVar = this.F;
            if (eaVar != null) {
                try {
                    eaVar.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25597w4) {
            this.f50207k0 = true;
            ha0 ha0Var4 = this.Q;
            if (ha0Var4 != null) {
                ha0Var4.O(true, false);
            }
        } else if (i7 == org.telegram.messenger.ns.D4) {
            ha0 ha0Var5 = this.Q;
            if (ha0Var5 != null) {
                ha0Var5.f();
            }
            N0();
        } else if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.m0 && this.E0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i11);
                    if (gjVar.C3()) {
                        i0(gjVar.f23817k);
                        z10 = true;
                    } else {
                        TLRPC.Message message = gjVar.f23817k;
                        if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && org.telegram.messenger.m5.E(org.telegram.messenger.gj.B0(message))) {
                            this.f50196c.setImageResource(2131232211);
                            k8.a aVar = this.L;
                            if (aVar != null) {
                                aVar.c1();
                                this.L = null;
                            }
                        }
                    }
                }
                if (z10 && (ha0Var2 = this.Q) != null) {
                    ha0Var2.N(this.f50211o0);
                }
            }
        } else if (i7 == org.telegram.messenger.ns.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.m0 && this.E0 != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList2.get(i12);
                    if (gjVar2.C3()) {
                        TLRPC.Message message2 = gjVar2.f23817k;
                        TLRPC.Peer peer = message2.from_id;
                        if (peer != null) {
                            B0 = org.telegram.messenger.gj.B1(peer);
                        } else {
                            B0 = org.telegram.messenger.gj.B0(message2);
                        }
                        la0 la0Var = (la0) this.f50212p0.f(B0);
                        if (la0Var != null) {
                            org.telegram.messenger.qd h = getLocationController().h(longValue);
                            if (h == null || h.f26079b != gjVar2.e1()) {
                                TLRPC.Message message3 = gjVar2.f23817k;
                                la0Var.f48922b = message3;
                                TLRPC.GeoPoint geoPoint = message3.media.geo;
                                org.telegram.messenger.bb bbVar = new org.telegram.messenger.bb(geoPoint.lat, geoPoint._long);
                                la0Var.f48924e.b(bbVar);
                                if (this.f50213q0 == la0Var.f48921a) {
                                    this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(la0Var.f48924e.a()));
                                }
                                org.telegram.messenger.da daVar = la0Var.f48925f;
                                if (daVar != null) {
                                    daVar.a();
                                    la0Var.f48925f.b(bbVar);
                                    int i13 = gjVar2.f23817k.media.heading;
                                    if (i13 != 0) {
                                        la0Var.f48925f.c(i13);
                                        if (!la0Var.f48926g) {
                                            la0Var.f48925f.f23053a.a(c8.p9.b(2131231650));
                                            la0Var.f48926g = true;
                                        }
                                    } else if (la0Var.f48926g) {
                                        la0Var.f48925f.c(0);
                                        la0Var.f48925f.f23053a.a(c8.p9.b(2131231649));
                                        la0Var.f48926g = false;
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                }
                if (z11 && (ha0Var = this.Q) != null) {
                    ha0Var.f();
                    org.telegram.ui.Components.kg0 kg0Var = this.O;
                    if (kg0Var != null) {
                        kg0Var.c(true);
                    }
                }
                if (z11) {
                    N0();
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
            UndoView[] undoViewArr = this.f50223x;
            if (i7 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.s6(undoViewArr[i7], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.wj));
            i7++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.R, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28922h5));
        org.telegram.ui.ActionBar.d5 d5Var = this.f50214r;
        if (d5Var != null) {
            editTextBoldCursor = d5Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28957j5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.pj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.R, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.R, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.R, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.R, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.R, 196608, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Hi));
        return arrayList;
    }

    public final la0 i0(TLRPC.Message message) {
        la0 la0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d2 = geoPoint._long;
        long B1 = org.telegram.messenger.gj.B1(message.from_id);
        a0.h hVar = this.f50212p0;
        la0 la0Var2 = (la0) hVar.f(B1);
        if (la0Var2 == null) {
            ?? obj = new Object();
            obj.f48922b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f48923c = getMessagesController().a2(Long.valueOf(obj.f48922b.from_id.user_id));
                obj.f48921a = obj.f48922b.from_id.user_id;
            } else {
                long B0 = org.telegram.messenger.gj.B0(message);
                if (org.telegram.messenger.m5.E(B0)) {
                    obj.f48923c = getMessagesController().a2(Long.valueOf(B0));
                } else {
                    obj.d = getMessagesController().M0(Long.valueOf(-B0));
                }
                obj.f48921a = B0;
            }
            H0(obj);
            try {
                hi.l0 l0Var = (hi.l0) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                m8.g gVar = (m8.g) l0Var.f14544b;
                ((m8.g) l0Var.f14544b).f20540a = new LatLng(d, d2);
                Bitmap n02 = n0(obj);
                la0Var = obj;
                if (n02 != null) {
                    gVar.d = c8.p9.a(n02);
                    gVar.f20543e = 0.5f;
                    gVar.f20544f = 0.907f;
                    obj.f48924e = this.F.a(l0Var);
                    if (!org.telegram.messenger.q10.B(obj.f48923c)) {
                        hi.l0 l0Var2 = (hi.l0) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                        ((m8.g) l0Var2.f14544b).f20540a = new LatLng(d, d2);
                        m8.g gVar2 = (m8.g) l0Var2.f14544b;
                        gVar2.f20546r = true;
                        gVar2.f20543e = 0.5f;
                        gVar2.f20544f = 0.5f;
                        org.telegram.messenger.da a10 = this.F.a(l0Var2);
                        obj.f48925f = a10;
                        int i7 = message.media.heading;
                        if (i7 != 0) {
                            a10.c(i7);
                            obj.f48925f.f23053a.a(c8.p9.b(2131231650));
                            obj.f48926g = true;
                        } else {
                            a10.c(0);
                            obj.f48925f.f23053a.a(c8.p9.b(2131231649));
                            obj.f48926g = false;
                        }
                    }
                    this.f50211o0.add(obj);
                    hVar.k(obj, obj.f48921a);
                    org.telegram.messenger.qd h = getLocationController().h(this.m0);
                    int i10 = (obj.f48921a > getUserConfig().e() ? 1 : (obj.f48921a == getUserConfig().e() ? 0 : -1));
                    la0Var = obj;
                    la0Var = obj;
                    if (i10 == 0 && h != null) {
                        int i11 = obj.f48922b.f28072id;
                        la0Var = obj;
                        if (i11 == h.f26079b) {
                            Location location = this.f50227z0;
                            la0Var = obj;
                            if (location != null) {
                                double latitude = location.getLatitude();
                                double longitude = this.f50227z0.getLongitude();
                                m8.f fVar = obj.f48924e.f23053a;
                                LatLng latLng = new LatLng(latitude, longitude);
                                fVar.getClass();
                                try {
                                    v7.i iVar = (v7.i) fVar.f20539a;
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
            la0Var2.f48922b = message;
            m8.f fVar2 = la0Var2.f48924e.f23053a;
            LatLng latLng2 = new LatLng(d, d2);
            fVar2.getClass();
            try {
                v7.i iVar2 = (v7.i) fVar2.f20539a;
                Parcel p13 = iVar2.p1();
                v7.b.b(p13, latLng2);
                iVar2.t1(p13, 3);
                int i12 = (this.f50213q0 > la0Var2.f48921a ? 1 : (this.f50213q0 == la0Var2.f48921a ? 0 : -1));
                la0Var = la0Var2;
                if (i12 == 0) {
                    this.F.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(la0Var2.f48924e.a()));
                    la0Var = la0Var2;
                }
            } catch (RemoteException e12) {
                throw new RuntimeException(e12);
            }
        }
        org.telegram.ui.Components.kg0 kg0Var = this.O;
        if (kg0Var != null) {
            kg0Var.c(true);
        }
        N0();
        return la0Var;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6)) > 0.699999988079071d) {
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
            i0.c cVar = this.mSystemInsets;
            int i7 = cVar.f15575b;
            int i10 = cVar.d;
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
            org.telegram.ui.Components.uj0 uj0Var = this.S;
            if (uj0Var != null) {
                uj0Var.setClipToPadding(false);
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
        ct ctVar = this.R;
        if (ctVar != null) {
            ctVar.invalidate();
        }
        if (this.F != null) {
            if (org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6)) < 0.721f) {
                i7 = 2131624086;
            } else {
                i7 = 0;
            }
            if (i7 != 0) {
                if (!this.f50205i0) {
                    this.f50205i0 = true;
                    this.F.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f26600b, i7));
                    k8.a aVar = this.L;
                    if (aVar != null) {
                        aVar.h1(-1);
                        this.L.d1(553648127);
                    }
                }
            } else if (this.f50205i0) {
                this.f50205i0 = false;
                this.F.i(null);
                k8.a aVar2 = this.L;
                if (aVar2 != null) {
                    aVar2.h1(-16777216);
                    this.L.d1(536870912);
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
                if (!((LocationManager) org.telegram.messenger.t0.f26600b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i7 = org.telegram.ui.ActionBar.j6.L5;
                    alertDialog$Builder.m(2131624120, 72, getThemedColor(i7), null);
                    alertDialog$Builder.n(i7, getResourceProvider());
                    alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131749530, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751806, null), new ba0(this, 3));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    showDialog(alertDialog$Builder.f28392a);
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
        List<org.telegram.messenger.gb> asList = Arrays.asList(new org.telegram.messenger.gb[]{new Object(), new Object()});
        org.telegram.messenger.ua onCreateCircleOptions = ((pb.b) org.telegram.messenger.t0.k()).onCreateCircleOptions();
        double latitude = this.f50227z0.getLatitude();
        double longitude = this.f50227z0.getLongitude();
        gc.b bVar = (gc.b) onCreateCircleOptions;
        m8.b bVar2 = (m8.b) bVar.f13134b;
        LatLng latLng = new LatLng(latitude, longitude);
        bVar2.getClass();
        bVar2.f20526a = latLng;
        double d = i7;
        m8.b bVar3 = (m8.b) bVar.f13134b;
        bVar3.f20527b = d;
        if (x0()) {
            bVar3.d = -1771658281;
            bVar3.f20529e = 476488663;
        } else {
            bVar3.d = -1774024971;
            bVar3.f20529e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (org.telegram.messenger.gb gbVar : asList) {
            if (gbVar instanceof org.telegram.messenger.fb) {
                arrayList.add(new m8.c(20, 1));
            } else if (gbVar instanceof org.telegram.messenger.eb) {
                arrayList.add(new m8.c(20, 0));
            }
        }
        bVar3.f20532r = arrayList;
        bVar3.f20528c = 2;
        org.telegram.messenger.ea eaVar = this.F;
        k8.a aVar2 = eaVar.f23281a;
        aVar2.getClass();
        try {
            l8.e eVar = (l8.e) aVar2.f17788b;
            Parcel p12 = eVar.p1();
            v7.b.b(p12, bVar3);
            Parcel o12 = eVar.o1(p12, 35);
            IBinder readStrongBinder = o12.readStrongBinder();
            int i10 = v7.g.f58730b;
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
            k8.a aVar4 = new k8.a(10, eaVar, aVar3);
            eaVar.f23283c.put(aVar3, aVar4);
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
                Drawable drawable = org.telegram.messenger.t0.f26600b.getResources().getDrawable(2131231651);
                drawable.setBounds(0, 0, org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                TLRPC.User user = la0Var.f48923c;
                if (user != null) {
                    t8Var.r(user);
                } else {
                    TLRPC.Chat chat = la0Var.d;
                    if (chat != null) {
                        t8Var.q(chat);
                    }
                }
                canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                t8Var.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
                t8Var.draw(canvas);
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
                    matrix.postTranslate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                    matrix.postScale(L, L);
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
        return this instanceof im;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.kg0 kg0Var = this.O;
        if (kg0Var != null) {
            if (z10) {
                kg0Var.a();
                return false;
            }
        } else {
            org.telegram.messenger.ya yaVar = this.H;
            if (yaVar != null && ((GLSurfaceView) ((a8.r7) yaVar).f620f) != null && !this.J) {
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
        UndoView undoView = this.f50223x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25572t);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25590v4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25597w4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.D4);
        org.telegram.messenger.gj gjVar = this.E0;
        if (gjVar != null && gjVar.C3()) {
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.ns.m0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.j80 j80Var = this.f50200e0;
        if (j80Var != null) {
            j80Var.f35918i = true;
            j80Var.f35917g = false;
            j80Var.d();
            j80Var.d = null;
            j80Var.f35915e = null;
            j80Var.f35916f = null;
        }
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25590v4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25597w4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.D4);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25572t);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.ns.m0);
        try {
            org.telegram.messenger.ea eaVar = this.F;
            if (eaVar != null) {
                eaVar.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.messenger.ya yaVar = this.H;
            if (yaVar != null) {
                ((a8.r7) yaVar).x();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        UndoView undoView = this.f50223x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        ha0 ha0Var = this.Q;
        if (ha0Var != null) {
            ha0Var.F();
        }
        org.telegram.ui.Components.bl blVar = this.T;
        if (blVar != null) {
            blVar.F();
        }
        y90 y90Var = this.L0;
        if (y90Var != null) {
            org.telegram.messenger.g0.r(y90Var);
            this.L0 = null;
        }
        ArrayList arrayList = this.f50211o0;
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
        org.telegram.messenger.ya yaVar = this.H;
        if (yaVar != null && this.f50224x0 && (mVar = (h6.m) ((m.o3) ((ai.j0) ((a8.r7) yaVar).f617b).f1265b).f19795b) != null) {
            try {
                l8.f fVar = (l8.f) mVar.f13625c;
                fVar.t1(fVar.p1(), 6);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.ya yaVar = this.H;
        if (yaVar != null && this.f50224x0) {
            try {
                ((a8.r7) yaVar).y();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        UndoView undoView = this.f50223x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f50226y0 = false;
        M0();
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.messenger.ya yaVar = this.H;
        if (yaVar != null && this.f50224x0) {
            try {
                ((a8.r7) yaVar).z();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f50226y0 = true;
        D0();
        org.telegram.messenger.ea eaVar = this.F;
        if (eaVar != null) {
            try {
                eaVar.k(true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        s0(true);
        if (o0()) {
            this.f50218t0 = false;
        } else if (this.f50218t0 && (parentActivity = getParentActivity()) != null) {
            this.f50218t0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        y90 y90Var = this.L0;
        if (y90Var != null) {
            org.telegram.messenger.g0.r(y90Var);
            org.telegram.messenger.g0.i3(this.L0, 5000L);
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
            org.telegram.ui.ActionBar.d5 d5Var = this.f50214r;
            if (d5Var != null && d5Var.getSearchField() != null) {
                this.f50214r.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28957j5));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            try {
                if (((ai.j0) ((a8.r7) this.H).f617b).getParent() instanceof ViewGroup) {
                    ((ViewGroup) ((ai.j0) ((a8.r7) this.H).f617b).getParent()).removeView((ai.j0) ((a8.r7) this.H).f617b);
                }
            } catch (Exception unused) {
            }
            bi.v1 v1Var = this.P;
            if (v1Var != null) {
                v1Var.addView((ai.j0) ((a8.r7) this.H).f617b, 0, c8.ja.e(-1, u0(), 51));
                K0(false);
                y0();
                D0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView((ai.j0) ((a8.r7) this.H).f617b, 0, c8.ja.e(-1, -1, 51));
            }
        }
    }

    public final void p0(ArrayList arrayList) {
        org.telegram.messenger.wa waVar;
        if (this.f50210n0) {
            waVar = ((pb.b) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
        } else {
            waVar = null;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i7);
            int i10 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i11 = messageMedia.period;
            if (i10 + i11 > currentTime || i11 == Integer.MAX_VALUE) {
                if (waVar != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((ia.d) waVar).x(new org.telegram.messenger.bb(geoPoint.lat, geoPoint._long));
                }
                i0(message);
                if (this.f50196c.getVisibility() != 8 && org.telegram.messenger.gj.B1(message.from_id) != getUserConfig().e()) {
                    this.f50196c.setVisibility(0);
                    this.E = true;
                    this.f50196c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new xx(this, 4)).start();
                }
            }
        }
        if (waVar != null) {
            if (this.f50210n0) {
                this.R.w0(0, org.telegram.messenger.g0.L(99.0f), null);
            }
            this.f50210n0 = false;
            this.Q.N(this.f50211o0);
            if (this.E0.C3()) {
                try {
                    ia.d dVar = (ia.d) waVar;
                    org.telegram.messenger.bb a10 = dVar.r().a();
                    org.telegram.messenger.bb z02 = z0(a10, 100.0d, 100.0d);
                    dVar.x(z0(a10, -100.0d, -100.0d));
                    dVar.x(z02);
                    org.telegram.messenger.ca r10 = dVar.r();
                    if (arrayList.size() > 1) {
                        try {
                            org.telegram.messenger.ta newCameraUpdateLatLngBounds = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(r10, org.telegram.messenger.g0.L(113.0f));
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
            ArrayList arrayList2 = this.f50211o0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                la0 la0Var = (la0) arrayList2.get(i12);
                org.telegram.messenger.da daVar = la0Var.f48924e;
                if (daVar != null && (message = la0Var.f48922b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i7)) {
                    arrayList.add(daVar.a());
                }
            }
            if (this.f50212p0.f(getUserConfig().e()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Location location = this.f50227z0;
            if (location != null && !z10) {
                arrayList.add(new org.telegram.messenger.bb(location.getLatitude(), this.f50227z0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    org.telegram.messenger.wa onCreateLatLngBoundsBuilder = ((pb.b) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i13 = 0;
                    double d2 = Double.MAX_VALUE;
                    double d10 = Double.MAX_VALUE;
                    double d11 = -1.7976931348623157E308d;
                    while (i13 < size2) {
                        org.telegram.messenger.bb bbVar = (org.telegram.messenger.bb) arrayList.get(i13);
                        z11 = z13;
                        try {
                            ((ia.d) onCreateLatLngBoundsBuilder).x(bbVar);
                            i10 = size2;
                            z12 = true;
                        } catch (Exception e10) {
                            e = e10;
                            z12 = true;
                            org.telegram.messenger.a8.g(e, z12);
                            return z11;
                        }
                        try {
                            double d12 = bbVar.f22677a;
                            if (d12 < d2) {
                                d2 = d12;
                            }
                            if (d12 > d) {
                                d = d12;
                            }
                            double d13 = bbVar.f22678b;
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
                        ia.d dVar = (ia.d) onCreateLatLngBoundsBuilder;
                        dVar.x(new org.telegram.messenger.bb(Math.toDegrees(2.356194387921959E-6d) + d14, d15 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d14)) * 6366198.0d))));
                        dVar.x(new org.telegram.messenger.bb(d14 + Math.toDegrees(-2.356194387921959E-6d), d15 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d14)) * 6366198.0d))));
                    }
                    this.F.c(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(((ia.d) onCreateLatLngBoundsBuilder).r(), org.telegram.messenger.g0.L(60.0f)));
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
                int i11 = this.I0;
                if (i11 == 6) {
                    this.J0 = org.telegram.messenger.k5.z(66.0f, measuredHeight, i10);
                } else if (i11 == 2) {
                    this.J0 = org.telegram.messenger.k5.z(73.0f, measuredHeight, i10);
                } else {
                    this.J0 = org.telegram.messenger.k5.z(66.0f, measuredHeight, i10);
                }
                ja0 ja0Var = this.M0;
                if (ja0Var != null && ja0Var.m0(8) > 0) {
                    this.J0 -= org.telegram.messenger.g0.L(200.0f);
                }
                this.f50197c0 = org.telegram.messenger.g0.L(100.0f) + (measuredHeight - this.J0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.L(29.0f) + this.J0;
                this.P.setLayoutParams(layoutParams);
                this.Q.P(this.J0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.j0) ((a8.r7) this.H).f617b).getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = u0();
                    org.telegram.messenger.ea eaVar = this.F;
                    if (eaVar != null) {
                        eaVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
                    }
                    ((ai.j0) ((a8.r7) this.H).f617b).setLayoutParams(layoutParams2);
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
                    K0(false);
                    this.R.post(new org.telegram.ui.Components.a2(this, i7, 20));
                    return;
                }
                K0(false);
            }
        }
    }

    public final int t0() {
        return org.telegram.messenger.g0.L(10.0f) + this.f50204h0 + this.f50197c0;
    }

    public final int u0() {
        return org.telegram.messenger.g0.L(10.0f) + this.J0 + this.f50197c0;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        ArrayList arrayList = (ArrayList) getLocationController().f26271c.f(org.telegram.messenger.gj.B0(this.E0.f23817k));
        if (arrayList != null && arrayList.isEmpty()) {
            p0(arrayList);
        } else {
            arrayList = null;
        }
        if (org.telegram.messenger.m5.z(this.m0)) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.m0));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = org.telegram.messenger.gj.B0(this.E0.f23817k);
        tL_messages_getRecentLocations.peer = getMessagesController().j1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new fi.u5(this, B0, 1));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView w0() {
        UndoView[] undoViewArr = this.f50223x;
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
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.j6.I.q()) || org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void y0() {
        SharedPreferences e12;
        int i7;
        ImageView imageView = this.f50196c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.E && (i7 = (e12 = org.telegram.messenger.np.e1()).getInt("proximityhint", 0)) < 3) {
            e12.edit().putInt("proximityhint", i7 + 1).commit();
            if (org.telegram.messenger.m5.E(this.m0)) {
                this.f50216s.u(org.telegram.messenger.hd.a0("ProximityTooltioUser", null, 2131746612, org.telegram.messenger.q10.j(getMessagesController().a2(Long.valueOf(this.m0)), true)));
            } else {
                this.f50216s.u(org.telegram.messenger.hd.M0(2131746613, null));
            }
            this.f50216s.w();
        }
    }
}
