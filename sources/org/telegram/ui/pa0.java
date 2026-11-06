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
public class pa0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int A0;
    public TLRPC.TL_channelLocation B0;
    public TLRPC.TL_channelLocation C0;
    public boolean D;
    public org.telegram.messenger.ij D0;
    public org.telegram.messenger.fa E;
    public boolean E0;
    public org.telegram.messenger.ua F;
    public boolean F0;
    public org.telegram.messenger.za G;
    public ma0 G0;
    public org.telegram.messenger.ua H;
    public final int H0;
    public boolean I;
    public int I0;
    public float J;
    public ka0 J0;
    public m4.d0 K;
    public x90 K0;
    public double L;
    public ja0 L0;
    public boolean M;
    public org.telegram.ui.Cells.x3 M0;
    public org.telegram.ui.Components.hg0 N;
    public TL_stories.MediaArea N0;
    public di.a4 O;
    public boolean O0;
    public ha0 P;
    public boolean P0;
    public zs Q;
    public Boolean Q0;
    public org.telegram.ui.Components.pj0 R;
    public org.telegram.ui.Components.uk S;
    public View T;
    public v4.b0 U;
    public org.telegram.ui.ActionBar.f5 V;
    public FrameLayout W;
    public FrameLayout X;
    public fh.g Y;
    public final RectF Z;
    public ImageView f48734a;
    public int f48735a0;
    public TextView f48736b;
    public int f48737b0;
    public ImageView f48738c;
    public TextureView f48739c0;
    public org.telegram.ui.ActionBar.f5 d;
    public org.telegram.ui.Components.g80 f48740d0;
    public LinearLayout f48741e;
    public final RectF f48742e0;
    public ImageView f48743f;
    public final Paint f48744f0;
    public int f48745g0;
    public TextView h;
    public boolean f48746h0;
    public boolean f48747i0;
    public boolean f48748j0;
    public boolean f48749k0;
    public long f48750l0;
    public boolean m0;
    public TextView f48751n;
    public final ArrayList f48752n0;
    public final a0.h f48753o0;
    public long f48754p0;
    public boolean f48755q0;
    public org.telegram.ui.ActionBar.f5 f48756r;
    public AnimatorSet f48757r0;
    public fi.m3 f48758s;
    public boolean f48759s0;
    public boolean f48760t0;
    public boolean f48761u0;
    public boolean f48762v0;
    public boolean f48763w;
    public boolean f48764w0;
    public final UndoView[] f48765x;
    public boolean f48766x0;
    public boolean f48767y;
    public Location f48768y0;
    public Location f48769z0;

    public pa0(int i7) {
        super(null);
        this.f48765x = new UndoView[2];
        this.Z = new RectF();
        this.f48742e0 = new RectF();
        this.f48744f0 = new Paint();
        this.f48747i0 = true;
        this.f48748j0 = false;
        this.f48749k0 = true;
        this.m0 = true;
        this.f48752n0 = new ArrayList();
        this.f48753o0 = new a0.h();
        this.f48754p0 = -1L;
        this.f48759s0 = true;
        this.I0 = (org.telegram.messenger.g0.f22537q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.P0 = true;
        this.H0 = i7;
        org.telegram.messenger.g0.a0();
    }

    public static void Z(pa0 pa0Var, Canvas canvas, RectF rectF) {
        bi.x5 x5Var;
        Paint paint = pa0Var.f48744f0;
        int i7 = org.telegram.ui.ActionBar.k6.f27921h5;
        paint.setColor(pa0Var.getThemedColor(i7));
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) pa0Var.fragmentView;
        org.telegram.ui.Components.pj0 pj0Var = pa0Var.R;
        if (pj0Var != null && pj0Var.getVisibility() == 0) {
            org.telegram.ui.Components.pj0 pj0Var2 = pa0Var.R;
            ih.d.a(pj0Var2, canvas, rectF, pj0Var2, viewGroup);
            return;
        }
        if (pa0Var.O.getVisibility() == 0) {
            RectF rectF2 = pa0Var.f48742e0;
            canvas.save();
            canvas.translate(pa0Var.O.getX(), pa0Var.O.getY());
            canvas.clipRect(0.0f, 0.0f, pa0Var.O.getWidth(), viewGroup.getHeight() - pa0Var.O.getY());
            Drawable background = pa0Var.O.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            org.telegram.messenger.za zaVar = pa0Var.G;
            if (zaVar != null) {
                x5Var = (bi.x5) ((a8.r7) zaVar).f614b;
            } else {
                x5Var = null;
            }
            if (x5Var != null && x5Var.getParent() == pa0Var.O && x5Var.getVisibility() == 0 && x5Var.getAlpha() > 0.0f) {
                TextureView textureView = pa0Var.f48739c0;
                if (textureView != null && textureView.isAttachedToWindow() && jh.k.c(pa0Var.f48739c0, pa0Var.O, rectF2)) {
                    if (x5Var.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (x5Var.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    pa0Var.f48739c0.draw(canvas);
                    canvas.restore();
                } else if (pa0Var.f48740d0 != null) {
                    rectF2.set(x5Var.getX(), x5Var.getY(), x5Var.getX() + x5Var.getWidth(), x5Var.getY() + x5Var.getHeight());
                    org.telegram.ui.Components.g80 g80Var = pa0Var.f48740d0;
                    float alpha = x5Var.getAlpha();
                    Paint paint2 = g80Var.f33898c;
                    Bitmap bitmap = g80Var.f33899e;
                    if (bitmap != null && !bitmap.isRecycled() && alpha > 0.0f) {
                        paint2.setAlpha((int) (Math.min(1.0f, alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                    }
                }
            }
            View view = pa0Var.T;
            if (view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(view.getX(), view.getY());
                view.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        if (pa0Var.Q.getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(22.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + pa0Var.mSystemInsets.f15118b;
            float f10 = L;
            if (rectF.top >= f10) {
                return;
            }
            canvas.save();
            canvas.clipRect(0.0f, Math.min(rectF.top, f10), viewGroup.getWidth(), f10);
            if (pa0Var.f48735a0 < L) {
                paint.setColor(pa0Var.getThemedColor(i7));
                paint.setAlpha(205);
                canvas.drawRect(0.0f, Math.max(pa0Var.f48735a0, rectF.top), viewGroup.getWidth(), f10, paint);
            }
            zs zsVar = pa0Var.Q;
            ih.d.a(zsVar, canvas, rectF, zsVar, viewGroup);
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

    public static void b0(pa0 pa0Var, boolean z9, TLRPC.User user, int i7) {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z9) {
            org.telegram.messenger.rd h = pa0Var.getLocationController().h(pa0Var.f48750l0);
            if (h != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = pa0Var.getMessagesController().j1(h.f25265a);
                tL_messages_editMessage.f27036id = h.f25266b;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location location = org.telegram.messenger.sd.f(pa0Var.currentAccount).f25448s;
                tL_messages_editMessage.media.geo_point.lat = org.telegram.messenger.g0.b0(location.getLatitude());
                tL_messages_editMessage.media.geo_point._long = org.telegram.messenger.g0.b0(location.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) location.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i11 = h.f25270g;
                int i12 = h.f25269f;
                if (i11 != i12) {
                    inputMedia.proximity_notification_radius = i12;
                    inputMedia.flags |= 8;
                }
                inputMedia.heading = org.telegram.messenger.sd.e(location);
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
                    i14 = h.f25267c + i7;
                }
                h.f25267c = i14;
                inputMedia2.flags = i13 | 6;
                org.telegram.messenger.ij ijVar = h.h;
                if (ijVar != null && (message = ijVar.f23237k) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i10;
                    pa0Var.getMessagesStorage().r1(h.h.f23237k, null, null, true);
                }
                pa0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.D4, new Object[0]);
                return;
            }
            return;
        }
        pa0Var.I0(i7, 0, user);
    }

    public static void c0(pa0 pa0Var) {
        x90 x90Var;
        pa0Var.getLocationController().j(pa0Var.f48750l0);
        if (!pa0Var.isPaused && (x90Var = pa0Var.K0) != null) {
            org.telegram.messenger.g0.i3(x90Var, 5000L);
        }
    }

    public static void d0(pa0 pa0Var) {
        pa0Var.glassEngine.g();
    }

    public static void e0(pa0 pa0Var, int i7) {
        float e10;
        float f10;
        TLRPC.TL_messageMediaVenue H = pa0Var.S.H(i7);
        if (H != null && H.icon != null && pa0Var.E != null) {
            pa0Var.E0 = true;
            pa0Var.simpleActionBar.j(true);
            if ("pin".equals(H.icon)) {
                e10 = pa0Var.E.e();
                f10 = 4.0f;
            } else {
                e10 = pa0Var.E.e();
                f10 = 9.0f;
            }
            float f11 = e10 - f10;
            org.telegram.messenger.fa faVar = pa0Var.E;
            IMapsProvider k10 = org.telegram.messenger.t0.k();
            TLRPC.GeoPoint geoPoint = H.geo;
            faVar.b(((nb.a) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long), f11));
            Location location = pa0Var.f48769z0;
            if (location != null) {
                location.setLatitude(H.geo.lat);
                pa0Var.f48769z0.setLongitude(H.geo._long);
            }
            pa0Var.P.L(pa0Var.f48769z0);
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

    public static org.telegram.messenger.cb z0(org.telegram.messenger.cb cbVar, double d, double d2) {
        double d10 = cbVar.f21791a;
        return new org.telegram.messenger.cb(d10 + Math.toDegrees(d / 6366198.0d), cbVar.f21792b + Math.toDegrees(d2 / (Math.cos(Math.toRadians(d10)) * 6366198.0d)));
    }

    public final boolean A0() {
        GLSurfaceView gLSurfaceView;
        org.telegram.messenger.za zaVar = this.G;
        if (zaVar != null && (gLSurfaceView = (GLSurfaceView) ((a8.r7) zaVar).f617f) != null && !this.I) {
            gLSurfaceView.queueEvent(new q10(21, this, gLSurfaceView));
            return true;
        }
        return false;
    }

    public final void B0(la0 la0Var) {
        double d;
        double d2;
        TLRPC.Message message;
        if (la0Var != null && (message = la0Var.f47467b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d2 = geoPoint._long;
        } else {
            org.telegram.messenger.ij ijVar = this.D0;
            if (ijVar != null) {
                TLRPC.GeoPoint geoPoint2 = ijVar.f23237k.media.geo;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.B0.geo_point;
                d = geoPoint3.lat;
                d2 = geoPoint3._long;
            }
        }
        boolean z9 = org.telegram.messenger.r2.f25191a;
        org.telegram.messenger.t0.r();
        if (this.f48768y0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f48768y0.getLatitude()), Double.valueOf(this.f48768y0.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
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

    public final void C0(final boolean z9) {
        final TLRPC.User user;
        if (this.G0 != null && !o0() && getParentActivity() != null && this.f48768y0 != null && l0()) {
            if (org.telegram.messenger.m5.E(this.f48750l0)) {
                user = getMessagesController().a2(Long.valueOf(this.f48750l0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.v4.B(getParentActivity(), z9, user, new org.telegram.messenger.sr() {
                @Override
                public final void a(int i7) {
                    pa0.b0(pa0.this, z9, user, i7);
                }
            }, null));
        }
    }

    public final void D0() {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        if (this.f48740d0 != null && this.G != null) {
            TextureView textureView = this.f48739c0;
            if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.f48740d0.d) == null || !surfaceView.isAttachedToWindow())) {
                bi.x5 x5Var = (bi.x5) ((a8.r7) this.G).f614b;
                TextureView textureView2 = (TextureView) q0(x5Var, TextureView.class);
                this.f48739c0 = textureView2;
                org.telegram.ui.Components.g80 g80Var = this.f48740d0;
                if (textureView2 == null) {
                    surfaceView2 = (SurfaceView) q0(x5Var, SurfaceView.class);
                } else {
                    surfaceView2 = null;
                }
                if (g80Var.d != surfaceView2) {
                    g80Var.d = surfaceView2;
                    g80Var.a();
                }
                TextureView textureView3 = this.f48739c0;
                if (textureView3 != null) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                    if (!(surfaceTextureListener instanceof na0)) {
                        this.f48739c0.setSurfaceTextureListener(new na0(this, surfaceTextureListener));
                    }
                }
                M0();
            }
            TextureView textureView4 = this.f48739c0;
            if (textureView4 == null) {
                this.f48740d0.a();
                return;
            }
            TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
            if (!(surfaceTextureListener2 instanceof na0)) {
                this.f48739c0.setSurfaceTextureListener(new na0(this, surfaceTextureListener2));
            }
        }
    }

    public final void E0(Location location) {
        if (location == null) {
            return;
        }
        this.f48768y0 = new Location(location);
        la0 la0Var = (la0) this.f48753o0.f(getUserConfig().e());
        org.telegram.messenger.rd h = getLocationController().h(this.f48750l0);
        if (la0Var != null && h != null && la0Var.f47467b.f26973id == h.f25266b) {
            org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(location.getLatitude(), location.getLongitude());
            la0Var.f47469e.b(cbVar);
            org.telegram.messenger.ea eaVar = la0Var.f47470f;
            if (eaVar != null) {
                eaVar.b(cbVar);
            }
            if (this.f48754p0 == la0Var.f47466a) {
                this.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(la0Var.f47469e.a()));
            }
        }
        if (this.D0 == null && this.B0 == null && this.E != null) {
            org.telegram.messenger.cb cbVar2 = new org.telegram.messenger.cb(location.getLatitude(), location.getLongitude());
            ha0 ha0Var = this.P;
            if (ha0Var != null) {
                ha0Var.M(this.f48768y0);
            }
            if (!this.E0) {
                this.f48769z0 = new Location(location);
                if (this.F0) {
                    this.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(cbVar2));
                } else {
                    this.F0 = true;
                    this.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar2, this.E.e() - 4.0f));
                }
            }
        } else {
            this.P.M(this.f48768y0);
        }
        org.telegram.ui.Components.hg0 hg0Var = this.N;
        if (hg0Var != null) {
            hg0Var.c(true);
        }
        m4.d0 d0Var = this.K;
        if (d0Var != null) {
            double latitude = this.f48768y0.getLatitude();
            double longitude = this.f48768y0.getLongitude();
            m8.a aVar = (m8.a) d0Var.f19608a;
            LatLng latLng = new LatLng(latitude, longitude);
            try {
                v7.f fVar = (v7.f) aVar.f19925a;
                Parcel P0 = fVar.P0();
                v7.b.b(P0, latLng);
                fVar.T0(P0, 3);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        N0();
    }

    public final void F0(View view) {
        fh.g c10 = getBaseSimpleGlass().f21018c.c(view, null, false);
        c10.p(c8.g0.m(getResourceProvider()));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        view.setBackground(c10);
        c8.ka.a(view);
    }

    public final void G0(org.telegram.messenger.ij ijVar) {
        this.D0 = ijVar;
        this.f48750l0 = org.telegram.messenger.ij.B0(ijVar.f23237k);
    }

    public final void H0(la0 la0Var) {
        if (la0Var.h == null) {
            TLRPC.User user = la0Var.f47468c;
            TLRPC.Chat chat = la0Var.d;
            if (user == null && chat == 0) {
                return;
            }
            org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            if (user != null) {
                w8Var.r(user);
            } else {
                w8Var.q(chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.d = this.currentAccount;
            imageReceiver.f21192g1 = new pu(16, this, la0Var);
            imageReceiver.P();
            if (user == null) {
                user = chat;
            }
            imageReceiver.i0(user, w8Var, null);
            la0Var.h = imageReceiver;
        }
    }

    public final void I0(int i7, int i10, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(this.f48768y0.getLatitude());
        tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(this.f48768y0.getLongitude());
        tL_messageMediaGeoLive.heading = org.telegram.messenger.sd.e(this.f48768y0);
        int i11 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i7;
        tL_messageMediaGeoLive.proximity_notification_radius = i10;
        tL_messageMediaGeoLive.flags = i11 | 9;
        this.G0.d(tL_messageMediaGeoLive, this.H0, true, 0, 0L);
        if (i10 > 0) {
            this.N.L = true;
            this.f48738c.setImageResource(2131232211);
            org.telegram.ui.Components.hg0 hg0Var = this.N;
            if (hg0Var != null) {
                hg0Var.a();
            }
            w0().k(0L, 24, Integer.valueOf(i10), user, null, null);
            return;
        }
        finishFragment();
    }

    public final void J0(boolean z9, boolean z10) {
        float f10;
        float f11;
        Boolean bool = this.Q0;
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        this.Q0 = Boolean.valueOf(z9);
        float f12 = 0.0f;
        int i7 = 0;
        float f13 = 0.7f;
        if (!z10) {
            TextView textView = this.f48736b;
            if (!z9) {
                i7 = 8;
            }
            textView.setVisibility(i7);
            TextView textView2 = this.f48736b;
            if (z9) {
                f12 = 1.0f;
            }
            textView2.setAlpha(f12);
            TextView textView3 = this.f48736b;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            textView3.setScaleX(f11);
            TextView textView4 = this.f48736b;
            if (z9) {
                f13 = 1.0f;
            }
            textView4.setScaleY(f13);
            return;
        }
        this.f48736b.setVisibility(0);
        ViewPropertyAnimator animate = this.f48736b.animate();
        if (z9) {
            f12 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f12);
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.7f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (z9) {
            f13 = 1.0f;
        }
        scaleX.scaleY(f13).setInterpolator(org.telegram.ui.Components.xq.h).setDuration(420L).withEndAction(new org.telegram.ui.Components.tp0(8, this, z9)).start();
    }

    public final void K0(boolean z9) {
        int i7;
        int i10;
        FrameLayout.LayoutParams layoutParams;
        int i11;
        v4.d1 K = this.Q.K(0);
        if (K != null) {
            i7 = (int) K.f56927a.getY();
            i10 = Math.min(i7, 0) + this.I0;
            this.f48735a0 = (this.I0 + i7) - this.f48745g0;
        } else {
            i7 = -this.O.getMeasuredHeight();
            this.f48735a0 = -org.telegram.messenger.g0.L(41.0f);
            i10 = 0;
        }
        this.Q.invalidate();
        if (((FrameLayout.LayoutParams) this.O.getLayoutParams()) != null) {
            int i12 = 4;
            if (i10 <= 0) {
                if (((bi.x5) ((a8.r7) this.G).f614b).getVisibility() == 0) {
                    ((bi.x5) ((a8.r7) this.G).f614b).setVisibility(4);
                    this.O.setVisibility(4);
                }
            } else if (((bi.x5) ((a8.r7) this.G).f614b).getVisibility() == 4) {
                ((bi.x5) ((a8.r7) this.G).f614b).setVisibility(0);
                this.O.setVisibility(0);
            }
            this.O.setTranslationY(Math.min(0, i7));
            int i13 = -i7;
            ((bi.x5) ((a8.r7) this.G).f614b).setTranslationY(Math.max(0, i13 / 2));
            FrameLayout frameLayout = this.W;
            float f10 = 48.0f;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i7));
                float l10 = Utilities.l((org.telegram.messenger.k5.z(53.0f, i10 - this.f48745g0, org.telegram.messenger.g0.L(46.0f) + oi.a.d(this.mSystemInsets.f15118b)) - org.telegram.messenger.g0.L(7.0f)) / org.telegram.messenger.g0.L(48.0f));
                FrameLayout frameLayout2 = this.W;
                frameLayout2.setAlpha(l10);
                int i14 = (l10 > 0.0f ? 1 : (l10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                frameLayout2.setVisibility(i11);
                FrameLayout frameLayout3 = this.X;
                frameLayout3.setAlpha(l10);
                if (i14 > 0) {
                    i12 = 0;
                }
                frameLayout3.setVisibility(i12);
                M0();
            }
            View view = this.T;
            if (view != null) {
                if (view.getTag() != null) {
                    f10 = 69.0f;
                }
                int L = ((i10 / 2) + (i13 - org.telegram.messenger.g0.L(f10))) - (this.f48745g0 / 2);
                this.A0 = L;
                view.setTranslationY(L);
            }
            if (!z9 && (layoutParams = (FrameLayout.LayoutParams) ((bi.x5) ((a8.r7) this.G).f614b).getLayoutParams()) != null && layoutParams.height != u0()) {
                layoutParams.height = u0();
                org.telegram.messenger.fa faVar = this.E;
                if (faVar != null) {
                    faVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
                }
                ((bi.x5) ((a8.r7) this.G).f614b).setLayoutParams(layoutParams);
            }
        }
    }

    public final void L0() {
        if (this.f48760t0) {
            if (this.f48762v0) {
                this.R.setEmptyView(null);
                this.f48741e.setVisibility(8);
                this.R.setVisibility(8);
                return;
            }
            this.R.setEmptyView(this.f48741e);
            return;
        }
        this.f48741e.setVisibility(8);
    }

    public final void M0() {
        org.telegram.messenger.za zaVar;
        boolean z9;
        di.a4 a4Var;
        org.telegram.ui.Components.g80 g80Var = this.f48740d0;
        if (g80Var != null && (zaVar = this.G) != null) {
            bi.x5 x5Var = (bi.x5) ((a8.r7) zaVar).f614b;
            if (this.f48739c0 == null && this.f48766x0 && !isFinishing() && (a4Var = this.O) != null && a4Var.getVisibility() == 0 && x5Var.getParent() != null && x5Var.getVisibility() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (g80Var.f33901g != z9) {
                g80Var.f33901g = z9;
                if (z9) {
                    g80Var.a();
                } else {
                    g80Var.d();
                }
            }
        }
    }

    public final void N0() {
        int i7;
        boolean z9;
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.f48736b == null) {
            return;
        }
        boolean z10 = false;
        if (this.f48755q0) {
            J0(false, true);
            r0();
            return;
        }
        if (getConnectionsManager() != null) {
            i7 = getConnectionsManager().getCurrentTime();
        } else {
            i7 = 0;
        }
        ArrayList arrayList = this.f48752n0;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Message message = ((la0) arrayList.get(i12)).f47467b;
            if (message != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > i7)) {
                i11++;
            }
        }
        if (this.f48753o0.f(getUserConfig().e()) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f48768y0 != null && !z9) {
            i11++;
        }
        if (i11 >= 2) {
            z10 = true;
        }
        J0(z10, true);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28029n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27792a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27812b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
    }

    @Override
    public final android.view.View createView(android.content.Context r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pa0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ha0 ha0Var;
        long B0;
        ha0 ha0Var2;
        if (i7 == org.telegram.messenger.qs.f25059t) {
            removeSelfFromStack(true);
            return;
        }
        if (i7 == org.telegram.messenger.qs.f25077v4) {
            this.f48748j0 = false;
            ha0 ha0Var3 = this.P;
            if (ha0Var3 != null) {
                ha0Var3.O(false, false);
            }
            org.telegram.messenger.fa faVar = this.E;
            if (faVar != null) {
                try {
                    faVar.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25084w4) {
            this.f48748j0 = true;
            ha0 ha0Var4 = this.P;
            if (ha0Var4 != null) {
                ha0Var4.O(true, false);
            }
        } else if (i7 == org.telegram.messenger.qs.D4) {
            ha0 ha0Var5 = this.P;
            if (ha0Var5 != null) {
                ha0Var5.f();
            }
            N0();
        } else if (i7 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.f48750l0 && this.D0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z9 = false;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i11);
                    if (ijVar.D3()) {
                        i0(ijVar.f23237k);
                        z9 = true;
                    } else {
                        TLRPC.Message message = ijVar.f23237k;
                        if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && org.telegram.messenger.m5.E(org.telegram.messenger.ij.B0(message))) {
                            this.f48738c.setImageResource(2131232210);
                            m4.d0 d0Var = this.K;
                            if (d0Var != null) {
                                d0Var.R0();
                                this.K = null;
                            }
                        }
                    }
                }
                if (z9 && (ha0Var2 = this.P) != null) {
                    ha0Var2.N(this.f48752n0);
                }
            }
        } else if (i7 == org.telegram.messenger.qs.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.f48750l0 && this.D0 != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i12);
                    if (ijVar2.D3()) {
                        TLRPC.Message message2 = ijVar2.f23237k;
                        TLRPC.Peer peer = message2.from_id;
                        if (peer != null) {
                            B0 = org.telegram.messenger.ij.C1(peer);
                        } else {
                            B0 = org.telegram.messenger.ij.B0(message2);
                        }
                        la0 la0Var = (la0) this.f48753o0.f(B0);
                        if (la0Var != null) {
                            org.telegram.messenger.rd h = getLocationController().h(longValue);
                            if (h == null || h.f25266b != ijVar2.f1()) {
                                TLRPC.Message message3 = ijVar2.f23237k;
                                la0Var.f47467b = message3;
                                TLRPC.GeoPoint geoPoint = message3.media.geo;
                                org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long);
                                la0Var.f47469e.b(cbVar);
                                if (this.f48754p0 == la0Var.f47466a) {
                                    this.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(la0Var.f47469e.a()));
                                }
                                org.telegram.messenger.ea eaVar = la0Var.f47470f;
                                if (eaVar != null) {
                                    eaVar.a();
                                    la0Var.f47470f.b(cbVar);
                                    int i13 = ijVar2.f23237k.media.heading;
                                    if (i13 != 0) {
                                        la0Var.f47470f.c(i13);
                                        if (!la0Var.f47471g) {
                                            la0Var.f47470f.f22169a.a(c8.q9.b(2131231650));
                                            la0Var.f47471g = true;
                                        }
                                    } else if (la0Var.f47471g) {
                                        la0Var.f47470f.c(0);
                                        la0Var.f47470f.f22169a.a(c8.q9.b(2131231649));
                                        la0Var.f47471g = false;
                                    }
                                }
                            }
                            z10 = true;
                        }
                    }
                }
                if (z10 && (ha0Var = this.P) != null) {
                    ha0Var.f();
                    org.telegram.ui.Components.hg0 hg0Var = this.N;
                    if (hg0Var != null) {
                        hg0Var.c(true);
                    }
                }
                if (z10) {
                    N0();
                }
            }
        }
    }

    @Override
    public final boolean finishFragment(boolean z9) {
        if (A0()) {
            return false;
        }
        return super.finishFragment(z9);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            UndoView[] undoViewArr = this.f48765x;
            if (i7 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(undoViewArr[i7], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.tj));
            i7++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Q, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27921h5));
        org.telegram.ui.ActionBar.f5 f5Var = this.f48756r;
        if (f5Var != null) {
            editTextBoldCursor = f5Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27956j5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Q, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Q, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Q, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Q, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Q, 196608, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
        return arrayList;
    }

    public final la0 i0(TLRPC.Message message) {
        la0 la0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d2 = geoPoint._long;
        long C1 = org.telegram.messenger.ij.C1(message.from_id);
        a0.h hVar = this.f48753o0;
        la0 la0Var2 = (la0) hVar.f(C1);
        if (la0Var2 == null) {
            ?? obj = new Object();
            obj.f47467b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f47468c = getMessagesController().a2(Long.valueOf(obj.f47467b.from_id.user_id));
                obj.f47466a = obj.f47467b.from_id.user_id;
            } else {
                long B0 = org.telegram.messenger.ij.B0(message);
                if (org.telegram.messenger.m5.E(B0)) {
                    obj.f47468c = getMessagesController().a2(Long.valueOf(B0));
                } else {
                    obj.d = getMessagesController().M0(Long.valueOf(-B0));
                }
                obj.f47466a = B0;
            }
            H0(obj);
            try {
                gf.g gVar = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                m8.g gVar2 = (m8.g) gVar.f13889b;
                ((m8.g) gVar.f13889b).f19940a = new LatLng(d, d2);
                Bitmap n02 = n0(obj);
                la0Var = obj;
                if (n02 != null) {
                    gVar2.d = c8.q9.a(n02);
                    gVar2.f19943e = 0.5f;
                    gVar2.f19944f = 0.907f;
                    obj.f47469e = this.E.a(gVar);
                    if (!org.telegram.messenger.t10.B(obj.f47468c)) {
                        gf.g gVar3 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                        ((m8.g) gVar3.f13889b).f19940a = new LatLng(d, d2);
                        m8.g gVar4 = (m8.g) gVar3.f13889b;
                        gVar4.f19946r = true;
                        gVar4.f19943e = 0.5f;
                        gVar4.f19944f = 0.5f;
                        org.telegram.messenger.ea a10 = this.E.a(gVar3);
                        obj.f47470f = a10;
                        int i7 = message.media.heading;
                        if (i7 != 0) {
                            a10.c(i7);
                            obj.f47470f.f22169a.a(c8.q9.b(2131231650));
                            obj.f47471g = true;
                        } else {
                            a10.c(0);
                            obj.f47470f.f22169a.a(c8.q9.b(2131231649));
                            obj.f47471g = false;
                        }
                    }
                    this.f48752n0.add(obj);
                    hVar.k(obj, obj.f47466a);
                    org.telegram.messenger.rd h = getLocationController().h(this.f48750l0);
                    int i10 = (obj.f47466a > getUserConfig().e() ? 1 : (obj.f47466a == getUserConfig().e() ? 0 : -1));
                    la0Var = obj;
                    la0Var = obj;
                    if (i10 == 0 && h != null) {
                        int i11 = obj.f47467b.f26973id;
                        la0Var = obj;
                        if (i11 == h.f25266b) {
                            Location location = this.f48768y0;
                            la0Var = obj;
                            if (location != null) {
                                double latitude = location.getLatitude();
                                double longitude = this.f48768y0.getLongitude();
                                m8.f fVar = obj.f47469e.f22169a;
                                LatLng latLng = new LatLng(latitude, longitude);
                                fVar.getClass();
                                try {
                                    v7.i iVar = (v7.i) fVar.f19939a;
                                    Parcel P0 = iVar.P0();
                                    v7.b.b(P0, latLng);
                                    iVar.T0(P0, 3);
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
            la0Var2.f47467b = message;
            m8.f fVar2 = la0Var2.f47469e.f22169a;
            LatLng latLng2 = new LatLng(d, d2);
            fVar2.getClass();
            try {
                v7.i iVar2 = (v7.i) fVar2.f19939a;
                Parcel P02 = iVar2.P0();
                v7.b.b(P02, latLng2);
                iVar2.T0(P02, 3);
                int i12 = (this.f48754p0 > la0Var2.f47466a ? 1 : (this.f48754p0 == la0Var2.f47466a ? 0 : -1));
                la0Var = la0Var2;
                if (i12 == 0) {
                    this.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(la0Var2.f47469e.a()));
                    la0Var = la0Var2;
                }
            } catch (RemoteException e12) {
                throw new RuntimeException(e12);
            }
        }
        org.telegram.ui.Components.hg0 hg0Var = this.N;
        if (hg0Var != null) {
            hg0Var.c(true);
        }
        N0();
        return la0Var;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.k6.f27848d6)) > 0.699999988079071d) {
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
        if (this.fragmentView != null && this.Q != null) {
            i0.b bVar = this.mSystemInsets;
            int i7 = bVar.f15118b;
            int i10 = bVar.d;
            FrameLayout frameLayout = this.W;
            if (frameLayout != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                int d = oi.a.d(i7) - org.telegram.messenger.g0.L(6.0f);
                if (layoutParams.topMargin != d) {
                    layoutParams.topMargin = d;
                    this.W.requestLayout();
                }
            }
            this.Q.setClipToPadding(false);
            this.Q.setPadding(0, 0, 0, i10);
            org.telegram.ui.Components.pj0 pj0Var = this.R;
            if (pj0Var != null) {
                pj0Var.setClipToPadding(false);
                oi.a.e(this.R, i7, i10, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
            }
            if (this.fragmentView.getMeasuredHeight() > 0) {
                s0(false);
            }
        }
    }

    public final void k0() {
        int i7;
        fh.g gVar = this.Y;
        if (gVar != null) {
            gVar.updateColors();
        }
        zs zsVar = this.Q;
        if (zsVar != null) {
            zsVar.invalidate();
        }
        if (this.E != null) {
            if (org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.k6.f27848d6)) < 0.721f) {
                i7 = 2131624085;
            } else {
                i7 = 0;
            }
            if (i7 != 0) {
                if (!this.f48746h0) {
                    this.f48746h0 = true;
                    this.E.i(((nb.a) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f25555b, i7));
                    m4.d0 d0Var = this.K;
                    if (d0Var != null) {
                        d0Var.X0(-1);
                        this.K.U0(553648127);
                    }
                }
            } else if (this.f48746h0) {
                this.f48746h0 = false;
                this.E.i(null);
                m4.d0 d0Var2 = this.K;
                if (d0Var2 != null) {
                    d0Var2.X0(-16777216);
                    this.K.U0(536870912);
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
                if (!((LocationManager) org.telegram.messenger.t0.f25555b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i7 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(2131624119, 72, getThemedColor(i7), null);
                    alertDialog$Builder.n(i7, getResourceProvider());
                    alertDialog$Builder.f27292a.T = org.telegram.messenger.hd.M0(2131749529, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751806, null), new aa0(this, 3));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    showDialog(alertDialog$Builder.f27292a);
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
        if (this.E == null) {
            return;
        }
        List<org.telegram.messenger.hb> asList = Arrays.asList(new org.telegram.messenger.hb[]{new Object(), new Object()});
        org.telegram.messenger.va onCreateCircleOptions = ((nb.a) org.telegram.messenger.t0.k()).onCreateCircleOptions();
        double latitude = this.f48768y0.getLatitude();
        double longitude = this.f48768y0.getLongitude();
        h9.f1 f1Var = (h9.f1) onCreateCircleOptions;
        m8.b bVar = (m8.b) f1Var.f14323b;
        LatLng latLng = new LatLng(latitude, longitude);
        bVar.getClass();
        bVar.f19926a = latLng;
        double d = i7;
        m8.b bVar2 = (m8.b) f1Var.f14323b;
        bVar2.f19927b = d;
        if (x0()) {
            bVar2.d = -1771658281;
            bVar2.f19929e = 476488663;
        } else {
            bVar2.d = -1774024971;
            bVar2.f19929e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (org.telegram.messenger.hb hbVar : asList) {
            if (hbVar instanceof org.telegram.messenger.gb) {
                arrayList.add(new m8.c(20, 1));
            } else if (hbVar instanceof org.telegram.messenger.fb) {
                arrayList.add(new m8.c(20, 0));
            }
        }
        bVar2.f19932r = arrayList;
        bVar2.f19928c = 2;
        org.telegram.messenger.fa faVar = this.E;
        wf.b bVar3 = faVar.f22364a;
        bVar3.getClass();
        try {
            l8.e eVar = (l8.e) bVar3.f57538b;
            Parcel P0 = eVar.P0();
            v7.b.b(P0, bVar2);
            Parcel O0 = eVar.O0(P0, 35);
            IBinder readStrongBinder = O0.readStrongBinder();
            int i10 = v7.g.f57132b;
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
            O0.recycle();
            m8.a aVar2 = new m8.a(aVar);
            m4.d0 d0Var = new m4.d0(faVar, aVar2, false);
            faVar.f22366c.put(aVar2, d0Var);
            this.K = d0Var;
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
                Drawable drawable = org.telegram.messenger.t0.f25555b.getResources().getDrawable(2131231651);
                drawable.setBounds(0, 0, org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                TLRPC.User user = la0Var.f47468c;
                if (user != null) {
                    w8Var.r(user);
                } else {
                    TLRPC.Chat chat = la0Var.d;
                    if (chat != null) {
                        w8Var.q(chat);
                    }
                }
                canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                w8Var.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
                w8Var.draw(canvas);
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
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.hg0 hg0Var = this.N;
        if (hg0Var != null) {
            if (z9) {
                hg0Var.a();
                return false;
            }
        } else {
            org.telegram.messenger.za zaVar = this.G;
            if (zaVar != null && ((GLSurfaceView) ((a8.r7) zaVar).f617f) != null && !this.I) {
                if (z9) {
                    A0();
                }
            } else {
                return super.onBackPressed(z9);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f48765x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25059t);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25077v4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25084w4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.D4);
        org.telegram.messenger.ij ijVar = this.D0;
        if (ijVar != null && ijVar.D3()) {
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.qs.m0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.g80 g80Var = this.f48740d0;
        if (g80Var != null) {
            g80Var.f33902i = true;
            g80Var.f33901g = false;
            g80Var.d();
            g80Var.d = null;
            g80Var.f33899e = null;
            g80Var.f33900f = null;
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25077v4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25084w4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.D4);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25059t);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.m0);
        try {
            org.telegram.messenger.fa faVar = this.E;
            if (faVar != null) {
                faVar.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.messenger.za zaVar = this.G;
            if (zaVar != null) {
                ((a8.r7) zaVar).w();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        UndoView undoView = this.f48765x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        ha0 ha0Var = this.P;
        if (ha0Var != null) {
            ha0Var.F();
        }
        org.telegram.ui.Components.uk ukVar = this.S;
        if (ukVar != null) {
            ukVar.F();
        }
        x90 x90Var = this.K0;
        if (x90Var != null) {
            org.telegram.messenger.g0.r(x90Var);
            this.K0 = null;
        }
        ArrayList arrayList = this.f48752n0;
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
        org.telegram.messenger.za zaVar = this.G;
        if (zaVar != null && this.f48764w0 && (mVar = (h6.m) ((m.q3) ((bi.x5) ((a8.r7) zaVar).f614b).f5026b).f19226b) != null) {
            try {
                l8.f fVar = (l8.f) mVar.f14265c;
                fVar.T0(fVar.P0(), 6);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.za zaVar = this.G;
        if (zaVar != null && this.f48764w0) {
            try {
                ((a8.r7) zaVar).x();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        UndoView undoView = this.f48765x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f48766x0 = false;
        M0();
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.messenger.za zaVar = this.G;
        if (zaVar != null && this.f48764w0) {
            try {
                ((a8.r7) zaVar).z();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f48766x0 = true;
        D0();
        org.telegram.messenger.fa faVar = this.E;
        if (faVar != null) {
            try {
                faVar.k(true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        s0(true);
        if (o0()) {
            this.f48759s0 = false;
        } else if (this.f48759s0 && (parentActivity = getParentActivity()) != null) {
            this.f48759s0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        x90 x90Var = this.K0;
        if (x90Var != null) {
            org.telegram.messenger.g0.r(x90Var);
            org.telegram.messenger.g0.i3(this.K0, 5000L);
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
            org.telegram.ui.ActionBar.f5 f5Var = this.f48756r;
            if (f5Var != null && f5Var.getSearchField() != null) {
                this.f48756r.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27956j5));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9 && !z10) {
            try {
                if (((bi.x5) ((a8.r7) this.G).f614b).getParent() instanceof ViewGroup) {
                    ((ViewGroup) ((bi.x5) ((a8.r7) this.G).f614b).getParent()).removeView((bi.x5) ((a8.r7) this.G).f614b);
                }
            } catch (Exception unused) {
            }
            di.a4 a4Var = this.O;
            if (a4Var != null) {
                a4Var.addView((bi.x5) ((a8.r7) this.G).f614b, 0, c8.ha.e(-1, u0(), 51));
                K0(false);
                y0();
                D0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView((bi.x5) ((a8.r7) this.G).f614b, 0, c8.ha.e(-1, -1, 51));
            }
        }
    }

    public final void p0(ArrayList arrayList) {
        org.telegram.messenger.xa xaVar;
        if (this.m0) {
            xaVar = ((nb.a) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
        } else {
            xaVar = null;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i7);
            int i10 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i11 = messageMedia.period;
            if (i10 + i11 > currentTime || i11 == Integer.MAX_VALUE) {
                if (xaVar != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((g6.d0) xaVar).X(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long));
                }
                i0(message);
                if (this.f48738c.getVisibility() != 8 && org.telegram.messenger.ij.C1(message.from_id) != getUserConfig().e()) {
                    this.f48738c.setVisibility(0);
                    this.D = true;
                    this.f48738c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new d30(this, 3)).start();
                }
            }
        }
        if (xaVar != null) {
            if (this.m0) {
                this.Q.w0(0, org.telegram.messenger.g0.L(99.0f), null);
            }
            this.m0 = false;
            this.P.N(this.f48752n0);
            if (this.D0.D3()) {
                try {
                    g6.d0 d0Var = (g6.d0) xaVar;
                    org.telegram.messenger.cb a10 = d0Var.R().a();
                    org.telegram.messenger.cb z02 = z0(a10, 100.0d, 100.0d);
                    d0Var.X(z0(a10, -100.0d, -100.0d));
                    d0Var.X(z02);
                    org.telegram.messenger.da R = d0Var.R();
                    if (arrayList.size() > 1) {
                        try {
                            org.telegram.messenger.ua newCameraUpdateLatLngBounds = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(R, org.telegram.messenger.g0.L(113.0f));
                            this.F = newCameraUpdateLatLngBounds;
                            this.E.h(newCameraUpdateLatLngBounds);
                            this.F = null;
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
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i11;
        boolean z12 = false;
        if (this.E != null) {
            ArrayList arrayList = new ArrayList();
            if (getConnectionsManager() != null) {
                i7 = getConnectionsManager().getCurrentTime();
            } else {
                i7 = 0;
            }
            ArrayList arrayList2 = this.f48752n0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                la0 la0Var = (la0) arrayList2.get(i12);
                org.telegram.messenger.ea eaVar = la0Var.f47469e;
                if (eaVar != null && (message = la0Var.f47467b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i7)) {
                    arrayList.add(eaVar.a());
                }
            }
            if (this.f48753o0.f(getUserConfig().e()) != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            Location location = this.f48768y0;
            if (location != null && !z9) {
                arrayList.add(new org.telegram.messenger.cb(location.getLatitude(), this.f48768y0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    org.telegram.messenger.xa onCreateLatLngBoundsBuilder = ((nb.a) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i13 = 0;
                    double d2 = Double.MAX_VALUE;
                    double d10 = Double.MAX_VALUE;
                    double d11 = -1.7976931348623157E308d;
                    while (i13 < size2) {
                        org.telegram.messenger.cb cbVar = (org.telegram.messenger.cb) arrayList.get(i13);
                        z10 = z12;
                        try {
                            ((g6.d0) onCreateLatLngBoundsBuilder).X(cbVar);
                            i10 = size2;
                            z11 = true;
                        } catch (Exception e10) {
                            e = e10;
                            z11 = true;
                            org.telegram.messenger.a8.g(e, z11);
                            return z10;
                        }
                        try {
                            double d12 = cbVar.f21791a;
                            if (d12 < d2) {
                                d2 = d12;
                            }
                            if (d12 > d) {
                                d = d12;
                            }
                            double d13 = cbVar.f21792b;
                            if (d13 < d10) {
                                d10 = d13;
                            }
                            if (d13 > d11) {
                                d11 = d13;
                            }
                            i13++;
                            z12 = z10;
                            size2 = i10;
                        } catch (Exception e11) {
                            e = e11;
                            org.telegram.messenger.a8.g(e, z11);
                            return z10;
                        }
                    }
                    z10 = z12;
                    z11 = true;
                    double d14 = (d2 + d) / 2.0d;
                    double d15 = (d10 + d11) / 2.0d;
                    double radians = Math.toRadians(d11 - d10) * 6366198.0d * Math.cos(Math.toRadians(d14));
                    if (Math.toRadians(d - d2) * 6366198.0d < 30.0d || radians < 30.0d) {
                        g6.d0 d0Var = (g6.d0) onCreateLatLngBoundsBuilder;
                        d0Var.X(new org.telegram.messenger.cb(Math.toDegrees(2.356194387921959E-6d) + d14, d15 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d14)) * 6366198.0d))));
                        d0Var.X(new org.telegram.messenger.cb(d14 + Math.toDegrees(-2.356194387921959E-6d), d15 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d14)) * 6366198.0d))));
                    }
                    this.E.c(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(((g6.d0) onCreateLatLngBoundsBuilder).R(), org.telegram.messenger.g0.L(60.0f)));
                    return true;
                } catch (Exception e12) {
                    e = e12;
                    z10 = z12;
                }
            }
        }
        return false;
    }

    public final void s0(boolean z9) {
        int i7;
        if (this.Q != null) {
            int i10 = this.mSystemInsets.d;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                int i11 = this.H0;
                if (i11 == 6) {
                    this.I0 = org.telegram.messenger.k5.z(66.0f, measuredHeight, i10);
                } else if (i11 == 2) {
                    this.I0 = org.telegram.messenger.k5.z(73.0f, measuredHeight, i10);
                } else {
                    this.I0 = org.telegram.messenger.k5.z(66.0f, measuredHeight, i10);
                }
                ja0 ja0Var = this.L0;
                if (ja0Var != null && ja0Var.m0(8) > 0) {
                    this.I0 -= org.telegram.messenger.g0.L(200.0f);
                }
                this.f48737b0 = org.telegram.messenger.g0.L(100.0f) + (measuredHeight - this.I0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.L(29.0f) + this.I0;
                this.O.setLayoutParams(layoutParams);
                this.P.P(this.I0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((bi.x5) ((a8.r7) this.G).f614b).getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = u0();
                    org.telegram.messenger.fa faVar = this.E;
                    if (faVar != null) {
                        faVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
                    }
                    ((bi.x5) ((a8.r7) this.G).f614b).setLayoutParams(layoutParams2);
                }
                this.P.f();
                if (z9) {
                    if (i11 == 3) {
                        i7 = 73;
                    } else if (i11 != 1 && i11 != 2) {
                        i7 = 0;
                    } else {
                        i7 = 66;
                    }
                    this.U.h1(0, -org.telegram.messenger.g0.L(i7));
                    K0(false);
                    this.Q.post(new org.telegram.ui.Components.r2(this, i7, 17));
                    return;
                }
                K0(false);
            }
        }
    }

    public final int t0() {
        return org.telegram.messenger.g0.L(10.0f) + this.f48745g0 + this.f48737b0;
    }

    public final int u0() {
        return org.telegram.messenger.g0.L(10.0f) + this.I0 + this.f48737b0;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        ArrayList arrayList = (ArrayList) getLocationController().f25443c.f(org.telegram.messenger.ij.B0(this.D0.f23237k));
        if (arrayList != null && arrayList.isEmpty()) {
            p0(arrayList);
        } else {
            arrayList = null;
        }
        if (org.telegram.messenger.m5.z(this.f48750l0)) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.f48750l0));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = org.telegram.messenger.ij.B0(this.D0.f23237k);
        tL_messages_getRecentLocations.peer = getMessagesController().j1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new di.b6(this, B0, 1));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView w0() {
        UndoView[] undoViewArr = this.f48765x;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.O.removeView(undoViewArr[0]);
            this.O.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean x0() {
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.k6.I.q()) || org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.k6.f27848d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void y0() {
        SharedPreferences e12;
        int i7;
        ImageView imageView = this.f48738c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.D && (i7 = (e12 = org.telegram.messenger.qp.e1()).getInt("proximityhint", 0)) < 3) {
            e12.edit().putInt("proximityhint", i7 + 1).commit();
            if (org.telegram.messenger.m5.E(this.f48750l0)) {
                this.f48758s.u(org.telegram.messenger.hd.a0("ProximityTooltioUser", null, 2131746611, org.telegram.messenger.t10.j(getMessagesController().a2(Long.valueOf(this.f48750l0)), true)));
            } else {
                this.f48758s.u(org.telegram.messenger.hd.M0(2131746612, null));
            }
            this.f48758s.w();
        }
    }
}
