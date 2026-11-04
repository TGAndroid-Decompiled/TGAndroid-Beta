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
public class la0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public Location A0;
    public int B0;
    public TLRPC.TL_channelLocation C0;
    public TLRPC.TL_channelLocation D0;
    public boolean E;
    public org.telegram.messenger.zi E0;
    public org.telegram.messenger.z9 F;
    public boolean F0;
    public org.telegram.messenger.na G;
    public boolean G0;
    public org.telegram.messenger.sa H;
    public ia0 H0;
    public org.telegram.messenger.na I;
    public final int I0;
    public boolean J;
    public int J0;
    public float K;
    public ga0 K0;
    public m2.t L;
    public u90 L0;
    public double M;
    public fa0 M0;
    public boolean N;
    public org.telegram.ui.Cells.x3 N0;
    public org.telegram.ui.Components.kg0 O;
    public TL_stories.MediaArea O0;
    public ai.d2 P;
    public boolean P0;
    public da0 Q;
    public boolean Q0;
    public xs R;
    public Boolean R0;
    public org.telegram.ui.Components.tj0 S;
    public org.telegram.ui.Components.sk T;
    public View U;
    public u4.b0 V;
    public org.telegram.ui.ActionBar.f5 W;
    public FrameLayout X;
    public FrameLayout Y;
    public gh.g Z;
    public ImageView f47239a;
    public final RectF f47240a0;
    public TextView f47241b;
    public int f47242b0;
    public ImageView f47243c;
    public int f47244c0;
    public org.telegram.ui.ActionBar.f5 d;
    public TextureView f47245d0;
    public LinearLayout f47246e;
    public org.telegram.ui.Components.c80 f47247e0;
    public ImageView f47248f;
    public final RectF f47249f0;
    public final Paint f47250g0;
    public TextView h;
    public int f47251h0;
    public boolean f47252i0;
    public boolean f47253j0;
    public boolean f47254k0;
    public boolean f47255l0;
    public long m0;
    public TextView f47256n;
    public boolean f47257n0;
    public final ArrayList f47258o0;
    public final a0.h f47259p0;
    public long f47260q0;
    public org.telegram.ui.ActionBar.f5 f47261r;
    public boolean f47262r0;
    public gi.l3 f47263s;
    public AnimatorSet f47264s0;
    public boolean f47265t0;
    public boolean f47266u0;
    public boolean f47267v0;
    public boolean f47268w;
    public boolean f47269w0;
    public final UndoView[] f47270x;
    public boolean f47271x0;
    public boolean f47272y;
    public boolean f47273y0;
    public Location f47274z0;

    public la0(int i3) {
        super(null);
        this.f47270x = new UndoView[2];
        this.f47240a0 = new RectF();
        this.f47249f0 = new RectF();
        this.f47250g0 = new Paint();
        this.f47253j0 = true;
        this.f47254k0 = false;
        this.f47255l0 = true;
        this.f47257n0 = true;
        this.f47258o0 = new ArrayList();
        this.f47259p0 = new a0.h();
        this.f47260q0 = -1L;
        this.f47265t0 = true;
        this.J0 = (org.telegram.messenger.g0.f22608q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.Q0 = true;
        this.I0 = i3;
        org.telegram.messenger.g0.a0();
    }

    public static void Z(la0 la0Var, Canvas canvas, RectF rectF) {
        ai.c0 c0Var;
        Paint paint = la0Var.f47250g0;
        int i3 = org.telegram.ui.ActionBar.k6.f27954h5;
        paint.setColor(la0Var.getThemedColor(i3));
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) la0Var.fragmentView;
        org.telegram.ui.Components.tj0 tj0Var = la0Var.S;
        if (tj0Var != null && tj0Var.getVisibility() == 0) {
            org.telegram.ui.Components.tj0 tj0Var2 = la0Var.S;
            jh.d.a(tj0Var2, canvas, rectF, tj0Var2, viewGroup);
            return;
        }
        if (la0Var.P.getVisibility() == 0) {
            RectF rectF2 = la0Var.f47249f0;
            canvas.save();
            canvas.translate(la0Var.P.getX(), la0Var.P.getY());
            canvas.clipRect(0.0f, 0.0f, la0Var.P.getWidth(), viewGroup.getHeight() - la0Var.P.getY());
            Drawable background = la0Var.P.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            org.telegram.messenger.sa saVar = la0Var.H;
            if (saVar != null) {
                c0Var = (ai.c0) ((b8.ke) saVar).f2716b;
            } else {
                c0Var = null;
            }
            if (c0Var != null && c0Var.getParent() == la0Var.P && c0Var.getVisibility() == 0 && c0Var.getAlpha() > 0.0f) {
                TextureView textureView = la0Var.f47245d0;
                if (textureView != null && textureView.isAttachedToWindow() && kh.k.c(la0Var.f47245d0, la0Var.P, rectF2)) {
                    if (c0Var.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (c0Var.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    la0Var.f47245d0.draw(canvas);
                    canvas.restore();
                } else if (la0Var.f47247e0 != null) {
                    rectF2.set(c0Var.getX(), c0Var.getY(), c0Var.getX() + c0Var.getWidth(), c0Var.getY() + c0Var.getHeight());
                    org.telegram.ui.Components.c80 c80Var = la0Var.f47247e0;
                    float alpha = c0Var.getAlpha();
                    Paint paint2 = c80Var.f32595c;
                    Bitmap bitmap = c80Var.f32596e;
                    if (bitmap != null && !bitmap.isRecycled() && alpha > 0.0f) {
                        paint2.setAlpha((int) (Math.min(1.0f, alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                    }
                }
            }
            View view = la0Var.U;
            if (view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(view.getX(), view.getY());
                view.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        if (la0Var.R.getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(22.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + la0Var.mSystemInsets.f14496b;
            float f10 = L;
            if (rectF.top >= f10) {
                return;
            }
            canvas.save();
            canvas.clipRect(0.0f, Math.min(rectF.top, f10), viewGroup.getWidth(), f10);
            if (la0Var.f47242b0 < L) {
                paint.setColor(la0Var.getThemedColor(i3));
                paint.setAlpha(205);
                canvas.drawRect(0.0f, Math.max(la0Var.f47242b0, rectF.top), viewGroup.getWidth(), f10, paint);
            }
            xs xsVar = la0Var.R;
            jh.d.a(xsVar, canvas, rectF, xsVar, viewGroup);
            canvas.restore();
        }
    }

    public static void a0(la0 la0Var) {
        la0Var.glassEngine.g();
        View view = la0Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void b0(la0 la0Var, boolean z10, TLRPC.User user, int i3) {
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z10) {
            org.telegram.messenger.kd h = la0Var.getLocationController().h(la0Var.m0);
            if (h != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = la0Var.getMessagesController().j1(h.f23810a);
                tL_messages_editMessage.f27085id = h.f23811b;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location location = org.telegram.messenger.ld.f(la0Var.currentAccount).f23981s;
                tL_messages_editMessage.media.geo_point.lat = org.telegram.messenger.g0.b0(location.getLatitude());
                tL_messages_editMessage.media.geo_point._long = org.telegram.messenger.g0.b0(location.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) location.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i11 = h.f23815g;
                int i12 = h.f23814f;
                if (i11 != i12) {
                    inputMedia.proximity_notification_radius = i12;
                    inputMedia.flags |= 8;
                }
                inputMedia.heading = org.telegram.messenger.ld.e(location);
                TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
                int i13 = inputMedia2.flags;
                inputMedia2.flags = i13 | 4;
                int i14 = Integer.MAX_VALUE;
                if (i3 == Integer.MAX_VALUE) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = h.d + i3;
                }
                h.d = i10;
                inputMedia2.period = i10;
                if (i3 != Integer.MAX_VALUE) {
                    i14 = h.f23812c + i3;
                }
                h.f23812c = i14;
                inputMedia2.flags = i13 | 6;
                org.telegram.messenger.zi ziVar = h.h;
                if (ziVar != null && (message = ziVar.f26868k) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i10;
                    la0Var.getMessagesStorage().r1(h.h.f26868k, null, null, true);
                }
                la0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.D4, new Object[0]);
                return;
            }
            return;
        }
        la0Var.I0(i3, 0, user);
    }

    public static void c0(la0 la0Var) {
        u90 u90Var;
        la0Var.getLocationController().j(la0Var.m0);
        if (!la0Var.isPaused && (u90Var = la0Var.L0) != null) {
            org.telegram.messenger.g0.i3(u90Var, 5000L);
        }
    }

    public static void d0(la0 la0Var) {
        la0Var.glassEngine.g();
    }

    public static void e0(la0 la0Var, int i3) {
        float e10;
        float f10;
        TLRPC.TL_messageMediaVenue H = la0Var.T.H(i3);
        if (H != null && H.icon != null && la0Var.F != null) {
            la0Var.F0 = true;
            la0Var.simpleActionBar.j(true);
            if ("pin".equals(H.icon)) {
                e10 = la0Var.F.e();
                f10 = 4.0f;
            } else {
                e10 = la0Var.F.e();
                f10 = 9.0f;
            }
            float f11 = e10 - f10;
            org.telegram.messenger.z9 z9Var = la0Var.F;
            IMapsProvider k10 = org.telegram.messenger.t0.k();
            TLRPC.GeoPoint geoPoint = H.geo;
            z9Var.b(((mb.b) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(geoPoint.lat, geoPoint._long), f11));
            Location location = la0Var.A0;
            if (location != null) {
                location.setLatitude(H.geo.lat);
                la0Var.A0.setLongitude(H.geo._long);
            }
            la0Var.Q.L(la0Var.A0);
        }
    }

    public static View q0(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View q02 = q0(viewGroup.getChildAt(i3), cls);
                if (q02 != null) {
                    return q02;
                }
            }
            return null;
        }
        return null;
    }

    public static org.telegram.messenger.va z0(org.telegram.messenger.va vaVar, double d, double d10) {
        double d11 = vaVar.f25843a;
        return new org.telegram.messenger.va(d11 + Math.toDegrees(d / 6366198.0d), vaVar.f25844b + Math.toDegrees(d10 / (Math.cos(Math.toRadians(d11)) * 6366198.0d)));
    }

    public final boolean A0() {
        GLSurfaceView gLSurfaceView;
        org.telegram.messenger.sa saVar = this.H;
        if (saVar != null && (gLSurfaceView = (GLSurfaceView) ((b8.ke) saVar).f2719f) != null && !this.J) {
            gLSurfaceView.queueEvent(new ly(26, this, gLSurfaceView));
            return true;
        }
        return false;
    }

    public final void B0(ha0 ha0Var) {
        double d;
        double d10;
        TLRPC.Message message;
        if (ha0Var != null && (message = ha0Var.f45881b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d10 = geoPoint._long;
        } else {
            org.telegram.messenger.zi ziVar = this.E0;
            if (ziVar != null) {
                TLRPC.GeoPoint geoPoint2 = ziVar.f26868k.media.geo;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.C0.geo_point;
                d = geoPoint3.lat;
                d10 = geoPoint3._long;
            }
        }
        boolean z10 = org.telegram.messenger.r2.f25040a;
        org.telegram.messenger.t0.r();
        if (this.f47274z0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f47274z0.getLatitude()), Double.valueOf(this.f47274z0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void C0(final boolean z10) {
        final TLRPC.User user;
        if (this.H0 != null && !o0() && getParentActivity() != null && this.f47274z0 != null && l0()) {
            if (org.telegram.messenger.m5.E(this.m0)) {
                user = getMessagesController().a2(Long.valueOf(this.m0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.t4.D(getParentActivity(), z10, user, new org.telegram.messenger.kr() {
                @Override
                public final void a(int i3) {
                    la0.b0(la0.this, z10, user, i3);
                }
            }, null));
        }
    }

    public final void D0() {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        if (this.f47247e0 != null && this.H != null) {
            TextureView textureView = this.f47245d0;
            if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.f47247e0.d) == null || !surfaceView.isAttachedToWindow())) {
                ai.c0 c0Var = (ai.c0) ((b8.ke) this.H).f2716b;
                TextureView textureView2 = (TextureView) q0(c0Var, TextureView.class);
                this.f47245d0 = textureView2;
                org.telegram.ui.Components.c80 c80Var = this.f47247e0;
                if (textureView2 == null) {
                    surfaceView2 = (SurfaceView) q0(c0Var, SurfaceView.class);
                } else {
                    surfaceView2 = null;
                }
                if (c80Var.d != surfaceView2) {
                    c80Var.d = surfaceView2;
                    c80Var.a();
                }
                TextureView textureView3 = this.f47245d0;
                if (textureView3 != null) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                    if (!(surfaceTextureListener instanceof ja0)) {
                        this.f47245d0.setSurfaceTextureListener(new ja0(this, surfaceTextureListener));
                    }
                }
                M0();
            }
            TextureView textureView4 = this.f47245d0;
            if (textureView4 == null) {
                this.f47247e0.a();
                return;
            }
            TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
            if (!(surfaceTextureListener2 instanceof ja0)) {
                this.f47245d0.setSurfaceTextureListener(new ja0(this, surfaceTextureListener2));
            }
        }
    }

    public final void E0(Location location) {
        if (location == null) {
            return;
        }
        this.f47274z0 = new Location(location);
        ha0 ha0Var = (ha0) this.f47259p0.f(getUserConfig().e());
        org.telegram.messenger.kd h = getLocationController().h(this.m0);
        if (ha0Var != null && h != null && ha0Var.f45881b.f27022id == h.f23811b) {
            org.telegram.messenger.va vaVar = new org.telegram.messenger.va(location.getLatitude(), location.getLongitude());
            ha0Var.f45883e.b(vaVar);
            org.telegram.messenger.y9 y9Var = ha0Var.f45884f;
            if (y9Var != null) {
                y9Var.b(vaVar);
            }
            if (this.f47260q0 == ha0Var.f45880a) {
                this.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(ha0Var.f45883e.a()));
            }
        }
        if (this.E0 == null && this.C0 == null && this.F != null) {
            org.telegram.messenger.va vaVar2 = new org.telegram.messenger.va(location.getLatitude(), location.getLongitude());
            da0 da0Var = this.Q;
            if (da0Var != null) {
                da0Var.M(this.f47274z0);
            }
            if (!this.F0) {
                this.A0 = new Location(location);
                if (this.G0) {
                    this.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(vaVar2));
                } else {
                    this.G0 = true;
                    this.F.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(vaVar2, this.F.e() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.f47274z0);
        }
        org.telegram.ui.Components.kg0 kg0Var = this.O;
        if (kg0Var != null) {
            kg0Var.c(true);
        }
        m2.t tVar = this.L;
        if (tVar != null) {
            double latitude = this.f47274z0.getLatitude();
            double longitude = this.f47274z0.getLongitude();
            l8.a aVar = (l8.a) tVar.f19006b;
            LatLng latLng = new LatLng(latitude, longitude);
            try {
                u7.f fVar = (u7.f) aVar.f18096a;
                Parcel P0 = fVar.P0();
                u7.b.b(P0, latLng);
                fVar.T0(P0, 3);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
        N0();
    }

    public final void F0(View view) {
        gh.g c2 = getBaseSimpleGlass().f53525c.c(view, null, false);
        c2.p(b8.cd.m(getResourceProvider()));
        c2.r(org.telegram.messenger.g0.L(23.0f));
        c2.q(org.telegram.messenger.g0.L(6.0f));
        view.setBackground(c2);
        b8.pf.a(view);
    }

    public final void G0(org.telegram.messenger.zi ziVar) {
        this.E0 = ziVar;
        this.m0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
    }

    public final void H0(ha0 ha0Var) {
        if (ha0Var.h == null) {
            TLRPC.User user = ha0Var.f45882c;
            TLRPC.Chat chat = ha0Var.d;
            if (user == null && chat == 0) {
                return;
            }
            org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            if (user != null) {
                u8Var.r(user);
            } else {
                u8Var.q(chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.d = this.currentAccount;
            imageReceiver.f21247h1 = new org.telegram.ui.Components.i41(26, this, ha0Var);
            imageReceiver.P();
            if (user == null) {
                user = chat;
            }
            imageReceiver.i0(user, u8Var, null);
            ha0Var.h = imageReceiver;
        }
    }

    public final void I0(int i3, int i10, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(this.f47274z0.getLatitude());
        tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(this.f47274z0.getLongitude());
        tL_messageMediaGeoLive.heading = org.telegram.messenger.ld.e(this.f47274z0);
        int i11 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i3;
        tL_messageMediaGeoLive.proximity_notification_radius = i10;
        tL_messageMediaGeoLive.flags = i11 | 9;
        this.H0.d(tL_messageMediaGeoLive, this.I0, true, 0, 0L);
        if (i10 > 0) {
            this.O.M = true;
            this.f47243c.setImageResource(2131232211);
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
        int i3 = 0;
        float f13 = 0.7f;
        if (!z11) {
            TextView textView = this.f47241b;
            if (!z10) {
                i3 = 8;
            }
            textView.setVisibility(i3);
            TextView textView2 = this.f47241b;
            if (z10) {
                f12 = 1.0f;
            }
            textView2.setAlpha(f12);
            TextView textView3 = this.f47241b;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            textView3.setScaleX(f11);
            TextView textView4 = this.f47241b;
            if (z10) {
                f13 = 1.0f;
            }
            textView4.setScaleY(f13);
            return;
        }
        this.f47241b.setVisibility(0);
        ViewPropertyAnimator animate = this.f47241b.animate();
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
        scaleX.scaleY(f13).setInterpolator(org.telegram.ui.Components.xq.h).setDuration(420L).withEndAction(new org.telegram.ui.Components.up0(8, this, z10)).start();
    }

    public final void K0(boolean z10) {
        int i3;
        int i10;
        FrameLayout.LayoutParams layoutParams;
        int i11;
        u4.d1 K = this.R.K(0);
        if (K != null) {
            i3 = (int) K.f55540a.getY();
            i10 = Math.min(i3, 0) + this.J0;
            this.f47242b0 = (this.J0 + i3) - this.f47251h0;
        } else {
            i3 = -this.P.getMeasuredHeight();
            this.f47242b0 = -org.telegram.messenger.g0.L(41.0f);
            i10 = 0;
        }
        this.R.invalidate();
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            int i12 = 4;
            if (i10 <= 0) {
                if (((ai.c0) ((b8.ke) this.H).f2716b).getVisibility() == 0) {
                    ((ai.c0) ((b8.ke) this.H).f2716b).setVisibility(4);
                    this.P.setVisibility(4);
                }
            } else if (((ai.c0) ((b8.ke) this.H).f2716b).getVisibility() == 4) {
                ((ai.c0) ((b8.ke) this.H).f2716b).setVisibility(0);
                this.P.setVisibility(0);
            }
            this.P.setTranslationY(Math.min(0, i3));
            int i13 = -i3;
            ((ai.c0) ((b8.ke) this.H).f2716b).setTranslationY(Math.max(0, i13 / 2));
            FrameLayout frameLayout = this.X;
            float f10 = 48.0f;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i3));
                float l10 = Utilities.l((org.telegram.messenger.k5.z(53.0f, i10 - this.f47251h0, org.telegram.messenger.g0.L(46.0f) + pi.a.d(this.mSystemInsets.f14496b)) - org.telegram.messenger.g0.L(7.0f)) / org.telegram.messenger.g0.L(48.0f));
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
                int L = ((i10 / 2) + (i13 - org.telegram.messenger.g0.L(f10))) - (this.f47251h0 / 2);
                this.B0 = L;
                view.setTranslationY(L);
            }
            if (!z10 && (layoutParams = (FrameLayout.LayoutParams) ((ai.c0) ((b8.ke) this.H).f2716b).getLayoutParams()) != null && layoutParams.height != u0()) {
                layoutParams.height = u0();
                org.telegram.messenger.z9 z9Var = this.F;
                if (z9Var != null) {
                    z9Var.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
                }
                ((ai.c0) ((b8.ke) this.H).f2716b).setLayoutParams(layoutParams);
            }
        }
    }

    public final void L0() {
        if (this.f47266u0) {
            if (this.f47269w0) {
                this.S.setEmptyView(null);
                this.f47246e.setVisibility(8);
                this.S.setVisibility(8);
                return;
            }
            this.S.setEmptyView(this.f47246e);
            return;
        }
        this.f47246e.setVisibility(8);
    }

    public final void M0() {
        org.telegram.messenger.sa saVar;
        boolean z10;
        ai.d2 d2Var;
        org.telegram.ui.Components.c80 c80Var = this.f47247e0;
        if (c80Var != null && (saVar = this.H) != null) {
            ai.c0 c0Var = (ai.c0) ((b8.ke) saVar).f2716b;
            if (this.f47245d0 == null && this.f47273y0 && !isFinishing() && (d2Var = this.P) != null && d2Var.getVisibility() == 0 && c0Var.getParent() != null && c0Var.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c80Var.f32598g != z10) {
                c80Var.f32598g = z10;
                if (z10) {
                    c80Var.a();
                } else {
                    c80Var.d();
                }
            }
        }
    }

    public final void N0() {
        int i3;
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.f47241b == null) {
            return;
        }
        boolean z11 = false;
        if (this.f47262r0) {
            J0(false, true);
            r0();
            return;
        }
        if (getConnectionsManager() != null) {
            i3 = getConnectionsManager().getCurrentTime();
        } else {
            i3 = 0;
        }
        ArrayList arrayList = this.f47258o0;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Message message = ((ha0) arrayList.get(i12)).f45881b;
            if (message != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > i3)) {
                i11++;
            }
        }
        if (this.f47259p0.f(getUserConfig().e()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f47274z0 != null && !z10) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28061n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27824a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
    }

    @Override
    public final android.view.View createView(android.content.Context r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.la0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        da0 da0Var;
        long B0;
        da0 da0Var2;
        if (i3 == org.telegram.messenger.hs.f23305t) {
            removeSelfFromStack(true);
            return;
        }
        if (i3 == org.telegram.messenger.hs.f23323v4) {
            this.f47254k0 = false;
            da0 da0Var3 = this.Q;
            if (da0Var3 != null) {
                da0Var3.O(false, false);
            }
            org.telegram.messenger.z9 z9Var = this.F;
            if (z9Var != null) {
                try {
                    z9Var.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23330w4) {
            this.f47254k0 = true;
            da0 da0Var4 = this.Q;
            if (da0Var4 != null) {
                da0Var4.O(true, false);
            }
        } else if (i3 == org.telegram.messenger.hs.D4) {
            da0 da0Var5 = this.Q;
            if (da0Var5 != null) {
                da0Var5.f();
            }
            N0();
        } else if (i3 == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.m0 && this.E0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i11);
                    if (ziVar.D3()) {
                        i0(ziVar.f26868k);
                        z10 = true;
                    } else {
                        TLRPC.Message message = ziVar.f26868k;
                        if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && org.telegram.messenger.m5.E(org.telegram.messenger.zi.B0(message))) {
                            this.f47243c.setImageResource(2131232210);
                            m2.t tVar = this.L;
                            if (tVar != null) {
                                tVar.U0();
                                this.L = null;
                            }
                        }
                    }
                }
                if (z10 && (da0Var2 = this.Q) != null) {
                    da0Var2.N(this.f47258o0);
                }
            }
        } else if (i3 == org.telegram.messenger.hs.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.m0 && this.E0 != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList2.get(i12);
                    if (ziVar2.D3()) {
                        TLRPC.Message message2 = ziVar2.f26868k;
                        TLRPC.Peer peer = message2.from_id;
                        if (peer != null) {
                            B0 = org.telegram.messenger.zi.C1(peer);
                        } else {
                            B0 = org.telegram.messenger.zi.B0(message2);
                        }
                        ha0 ha0Var = (ha0) this.f47259p0.f(B0);
                        if (ha0Var != null) {
                            org.telegram.messenger.kd h = getLocationController().h(longValue);
                            if (h == null || h.f23811b != ziVar2.f1()) {
                                TLRPC.Message message3 = ziVar2.f26868k;
                                ha0Var.f45881b = message3;
                                TLRPC.GeoPoint geoPoint = message3.media.geo;
                                org.telegram.messenger.va vaVar = new org.telegram.messenger.va(geoPoint.lat, geoPoint._long);
                                ha0Var.f45883e.b(vaVar);
                                if (this.f47260q0 == ha0Var.f45880a) {
                                    this.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(ha0Var.f45883e.a()));
                                }
                                org.telegram.messenger.y9 y9Var = ha0Var.f45884f;
                                if (y9Var != null) {
                                    y9Var.a();
                                    ha0Var.f45884f.b(vaVar);
                                    int i13 = ziVar2.f26868k.media.heading;
                                    if (i13 != 0) {
                                        ha0Var.f45884f.c(i13);
                                        if (!ha0Var.f45885g) {
                                            ha0Var.f45884f.f26557a.a(b8.wd.b(2131231650));
                                            ha0Var.f45885g = true;
                                        }
                                    } else if (ha0Var.f45885g) {
                                        ha0Var.f45884f.c(0);
                                        ha0Var.f45884f.f26557a.a(b8.wd.b(2131231649));
                                        ha0Var.f45885g = false;
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                }
                if (z11 && (da0Var = this.Q) != null) {
                    da0Var.f();
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
        int i3 = 0;
        while (true) {
            UndoView[] undoViewArr = this.f47270x;
            if (i3 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(undoViewArr[i3], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.tj));
            i3++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27954h5));
        org.telegram.ui.ActionBar.f5 f5Var = this.f47261r;
        if (f5Var != null) {
            editTextBoldCursor = f5Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27988j5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 196608, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
        return arrayList;
    }

    public final ha0 i0(TLRPC.Message message) {
        ha0 ha0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d10 = geoPoint._long;
        long C1 = org.telegram.messenger.zi.C1(message.from_id);
        a0.h hVar = this.f47259p0;
        ha0 ha0Var2 = (ha0) hVar.f(C1);
        if (ha0Var2 == null) {
            ?? obj = new Object();
            obj.f45881b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f45882c = getMessagesController().a2(Long.valueOf(obj.f45881b.from_id.user_id));
                obj.f45880a = obj.f45881b.from_id.user_id;
            } else {
                long B0 = org.telegram.messenger.zi.B0(message);
                if (org.telegram.messenger.m5.E(B0)) {
                    obj.f45882c = getMessagesController().a2(Long.valueOf(B0));
                } else {
                    obj.d = getMessagesController().M0(Long.valueOf(-B0));
                }
                obj.f45880a = B0;
            }
            H0(obj);
            try {
                gi.v5 v5Var = (gi.v5) ((mb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                l8.g gVar = (l8.g) v5Var.f13688b;
                ((l8.g) v5Var.f13688b).f18111a = new LatLng(d, d10);
                Bitmap n02 = n0(obj);
                ha0Var = obj;
                if (n02 != null) {
                    gVar.d = b8.wd.a(n02);
                    gVar.f18114e = 0.5f;
                    gVar.f18115f = 0.907f;
                    obj.f45883e = this.F.a(v5Var);
                    if (!org.telegram.messenger.l10.B(obj.f45882c)) {
                        gi.v5 v5Var2 = (gi.v5) ((mb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                        ((l8.g) v5Var2.f13688b).f18111a = new LatLng(d, d10);
                        l8.g gVar2 = (l8.g) v5Var2.f13688b;
                        gVar2.f18117r = true;
                        gVar2.f18114e = 0.5f;
                        gVar2.f18115f = 0.5f;
                        org.telegram.messenger.y9 a10 = this.F.a(v5Var2);
                        obj.f45884f = a10;
                        int i3 = message.media.heading;
                        if (i3 != 0) {
                            a10.c(i3);
                            obj.f45884f.f26557a.a(b8.wd.b(2131231650));
                            obj.f45885g = true;
                        } else {
                            a10.c(0);
                            obj.f45884f.f26557a.a(b8.wd.b(2131231649));
                            obj.f45885g = false;
                        }
                    }
                    this.f47258o0.add(obj);
                    hVar.k(obj, obj.f45880a);
                    org.telegram.messenger.kd h = getLocationController().h(this.m0);
                    int i10 = (obj.f45880a > getUserConfig().e() ? 1 : (obj.f45880a == getUserConfig().e() ? 0 : -1));
                    ha0Var = obj;
                    ha0Var = obj;
                    if (i10 == 0 && h != null) {
                        int i11 = obj.f45881b.f27022id;
                        ha0Var = obj;
                        if (i11 == h.f23811b) {
                            Location location = this.f47274z0;
                            ha0Var = obj;
                            if (location != null) {
                                double latitude = location.getLatitude();
                                double longitude = this.f47274z0.getLongitude();
                                l8.f fVar = obj.f45883e.f26557a;
                                LatLng latLng = new LatLng(latitude, longitude);
                                fVar.getClass();
                                try {
                                    u7.i iVar = (u7.i) fVar.f18110a;
                                    Parcel P0 = iVar.P0();
                                    u7.b.b(P0, latLng);
                                    iVar.T0(P0, 3);
                                    ha0Var = obj;
                                } catch (RemoteException e10) {
                                    throw new RuntimeException(e10);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                ha0Var = obj;
            }
        } else {
            ha0Var2.f45881b = message;
            l8.f fVar2 = ha0Var2.f45883e.f26557a;
            LatLng latLng2 = new LatLng(d, d10);
            fVar2.getClass();
            try {
                u7.i iVar2 = (u7.i) fVar2.f18110a;
                Parcel P02 = iVar2.P0();
                u7.b.b(P02, latLng2);
                iVar2.T0(P02, 3);
                int i12 = (this.f47260q0 > ha0Var2.f45880a ? 1 : (this.f47260q0 == ha0Var2.f45880a ? 0 : -1));
                ha0Var = ha0Var2;
                if (i12 == 0) {
                    this.F.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(ha0Var2.f45883e.a()));
                    ha0Var = ha0Var2;
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
        return ha0Var;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6)) > 0.699999988079071d) {
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
            int i3 = bVar.f14496b;
            int i10 = bVar.d;
            FrameLayout frameLayout = this.X;
            if (frameLayout != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                int d = pi.a.d(i3) - org.telegram.messenger.g0.L(6.0f);
                if (layoutParams.topMargin != d) {
                    layoutParams.topMargin = d;
                    this.X.requestLayout();
                }
            }
            this.R.setClipToPadding(false);
            this.R.setPadding(0, 0, 0, i10);
            org.telegram.ui.Components.tj0 tj0Var = this.S;
            if (tj0Var != null) {
                tj0Var.setClipToPadding(false);
                pi.a.e(this.S, i3, i10, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
            }
            if (this.fragmentView.getMeasuredHeight() > 0) {
                s0(false);
            }
        }
    }

    public final void k0() {
        int i3;
        gh.g gVar = this.Z;
        if (gVar != null) {
            gVar.updateColors();
        }
        xs xsVar = this.R;
        if (xsVar != null) {
            xsVar.invalidate();
        }
        if (this.F != null) {
            if (org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6)) < 0.721f) {
                i3 = 2131624085;
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                if (!this.f47252i0) {
                    this.f47252i0 = true;
                    this.F.i(((mb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f25457b, i3));
                    m2.t tVar = this.L;
                    if (tVar != null) {
                        tVar.g1(-1);
                        this.L.a1(553648127);
                    }
                }
            } else if (this.f47252i0) {
                this.f47252i0 = false;
                this.F.i(null);
                m2.t tVar2 = this.L;
                if (tVar2 != null) {
                    tVar2.g1(-16777216);
                    this.L.a1(536870912);
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
                if (!((LocationManager) org.telegram.messenger.t0.f25457b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i3 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(2131624119, 72, getThemedColor(i3), null);
                    alertDialog$Builder.n(i3, getResourceProvider());
                    alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131749538, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751806, null), new x90(this, 3));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    showDialog(alertDialog$Builder.f27343a);
                    return false;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return true;
            }
        }
        return true;
    }

    public final void m0(int i3) {
        u7.h aVar;
        if (this.F == null) {
            return;
        }
        List<org.telegram.messenger.ab> asList = Arrays.asList(new org.telegram.messenger.ab[]{new Object(), new Object()});
        org.telegram.messenger.oa onCreateCircleOptions = ((mb.b) org.telegram.messenger.t0.k()).onCreateCircleOptions();
        double latitude = this.f47274z0.getLatitude();
        double longitude = this.f47274z0.getLongitude();
        hi.d dVar = (hi.d) onCreateCircleOptions;
        l8.b bVar = (l8.b) dVar.f14429b;
        LatLng latLng = new LatLng(latitude, longitude);
        bVar.getClass();
        bVar.f18097a = latLng;
        double d = i3;
        l8.b bVar2 = (l8.b) dVar.f14429b;
        bVar2.f18098b = d;
        if (x0()) {
            bVar2.d = -1771658281;
            bVar2.f18100e = 476488663;
        } else {
            bVar2.d = -1774024971;
            bVar2.f18100e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (org.telegram.messenger.ab abVar : asList) {
            if (abVar instanceof org.telegram.messenger.za) {
                arrayList.add(new l8.c(20, 1));
            } else if (abVar instanceof org.telegram.messenger.ya) {
                arrayList.add(new l8.c(20, 0));
            }
        }
        bVar2.f18103r = arrayList;
        bVar2.f18099c = 2;
        org.telegram.messenger.z9 z9Var = this.F;
        p4.q qVar = z9Var.f26754a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.f53181a;
            Parcel P0 = eVar.P0();
            u7.b.b(P0, bVar2);
            Parcel O0 = eVar.O0(P0, 35);
            IBinder readStrongBinder = O0.readStrongBinder();
            int i10 = u7.g.f55738b;
            if (readStrongBinder == null) {
                aVar = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (queryLocalInterface instanceof u7.h) {
                    aVar = (u7.h) queryLocalInterface;
                } else {
                    aVar = new b8.a(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 10);
                }
            }
            O0.recycle();
            l8.a aVar2 = new l8.a(aVar);
            m2.t tVar = new m2.t(7, z9Var, aVar2);
            z9Var.f26756c.put(aVar2, tVar);
            this.L = tVar;
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final Bitmap n0(ha0 ha0Var) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.t0.f25457b.getResources().getDrawable(2131231651);
                drawable.setBounds(0, 0, org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                TLRPC.User user = ha0Var.f45882c;
                if (user != null) {
                    u8Var.r(user);
                } else {
                    TLRPC.Chat chat = ha0Var.d;
                    if (chat != null) {
                        u8Var.q(chat);
                    }
                }
                canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                u8Var.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
                u8Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = ha0Var.h;
                if (imageReceiver != null && imageReceiver.J()) {
                    bitmap = ha0Var.h.n();
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
        return this instanceof em;
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
            org.telegram.messenger.sa saVar = this.H;
            if (saVar != null && ((GLSurfaceView) ((b8.ke) saVar).f2719f) != null && !this.J) {
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
        UndoView undoView = this.f47270x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23305t);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23323v4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23330w4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.D4);
        org.telegram.messenger.zi ziVar = this.E0;
        if (ziVar != null && ziVar.D3()) {
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.hs.m0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.c80 c80Var = this.f47247e0;
        if (c80Var != null) {
            c80Var.f32599i = true;
            c80Var.f32598g = false;
            c80Var.d();
            c80Var.d = null;
            c80Var.f32596e = null;
            c80Var.f32597f = null;
        }
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23323v4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23330w4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.D4);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23305t);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.m0);
        try {
            org.telegram.messenger.z9 z9Var = this.F;
            if (z9Var != null) {
                z9Var.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.messenger.sa saVar = this.H;
            if (saVar != null) {
                ((b8.ke) saVar).x();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        UndoView undoView = this.f47270x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        da0 da0Var = this.Q;
        if (da0Var != null) {
            da0Var.F();
        }
        org.telegram.ui.Components.sk skVar = this.T;
        if (skVar != null) {
            skVar.F();
        }
        u90 u90Var = this.L0;
        if (u90Var != null) {
            org.telegram.messenger.g0.r(u90Var);
            this.L0 = null;
        }
        ArrayList arrayList = this.f47258o0;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ha0 ha0Var = (ha0) arrayList.get(i3);
            ImageReceiver imageReceiver = ha0Var.h;
            if (imageReceiver != null) {
                imageReceiver.R();
                ha0Var.h = null;
            }
        }
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        j0();
    }

    @Override
    public final void onLowMemory() {
        android.support.v4.media.session.a0 a0Var;
        super.onLowMemory();
        org.telegram.messenger.sa saVar = this.H;
        if (saVar != null && this.f47271x0 && (a0Var = (android.support.v4.media.session.a0) ((m.o3) ((ai.c0) ((b8.ke) saVar).f2716b).f536b).f18683b) != null) {
            try {
                k8.f fVar = (k8.f) a0Var.f1187c;
                fVar.T0(fVar.P0(), 6);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.sa saVar = this.H;
        if (saVar != null && this.f47271x0) {
            try {
                ((b8.ke) saVar).y();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        UndoView undoView = this.f47270x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f47273y0 = false;
        M0();
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.messenger.sa saVar = this.H;
        if (saVar != null && this.f47271x0) {
            try {
                ((b8.ke) saVar).A();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f47273y0 = true;
        D0();
        org.telegram.messenger.z9 z9Var = this.F;
        if (z9Var != null) {
            try {
                z9Var.k(true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        s0(true);
        if (o0()) {
            this.f47265t0 = false;
        } else if (this.f47265t0 && (parentActivity = getParentActivity()) != null) {
            this.f47265t0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        u90 u90Var = this.L0;
        if (u90Var != null) {
            org.telegram.messenger.g0.r(u90Var);
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
            org.telegram.ui.ActionBar.f5 f5Var = this.f47261r;
            if (f5Var != null && f5Var.getSearchField() != null) {
                this.f47261r.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27988j5));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            try {
                if (((ai.c0) ((b8.ke) this.H).f2716b).getParent() instanceof ViewGroup) {
                    ((ViewGroup) ((ai.c0) ((b8.ke) this.H).f2716b).getParent()).removeView((ai.c0) ((b8.ke) this.H).f2716b);
                }
            } catch (Exception unused) {
            }
            ai.d2 d2Var = this.P;
            if (d2Var != null) {
                d2Var.addView((ai.c0) ((b8.ke) this.H).f2716b, 0, b8.mf.e(-1, u0(), 51));
                K0(false);
                y0();
                D0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView((ai.c0) ((b8.ke) this.H).f2716b, 0, b8.mf.e(-1, -1, 51));
            }
        }
    }

    public final void p0(ArrayList arrayList) {
        org.telegram.messenger.qa qaVar;
        if (this.f47257n0) {
            qaVar = ((mb.b) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
        } else {
            qaVar = null;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
            int i10 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i11 = messageMedia.period;
            if (i10 + i11 > currentTime || i11 == Integer.MAX_VALUE) {
                if (qaVar != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((gi.w5) qaVar).V(new org.telegram.messenger.va(geoPoint.lat, geoPoint._long));
                }
                i0(message);
                if (this.f47243c.getVisibility() != 8 && org.telegram.messenger.zi.C1(message.from_id) != getUserConfig().e()) {
                    this.f47243c.setVisibility(0);
                    this.E = true;
                    this.f47243c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new y20(this, 3)).start();
                }
            }
        }
        if (qaVar != null) {
            if (this.f47257n0) {
                this.R.w0(0, org.telegram.messenger.g0.L(99.0f), null);
            }
            this.f47257n0 = false;
            this.Q.N(this.f47258o0);
            if (this.E0.D3()) {
                try {
                    gi.w5 w5Var = (gi.w5) qaVar;
                    org.telegram.messenger.va a10 = w5Var.R().a();
                    org.telegram.messenger.va z02 = z0(a10, 100.0d, 100.0d);
                    w5Var.V(z0(a10, -100.0d, -100.0d));
                    w5Var.V(z02);
                    org.telegram.messenger.x9 R = w5Var.R();
                    if (arrayList.size() > 1) {
                        try {
                            org.telegram.messenger.na newCameraUpdateLatLngBounds = ((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(R, org.telegram.messenger.g0.L(113.0f));
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
        int i3;
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
                i3 = getConnectionsManager().getCurrentTime();
            } else {
                i3 = 0;
            }
            ArrayList arrayList2 = this.f47258o0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                ha0 ha0Var = (ha0) arrayList2.get(i12);
                org.telegram.messenger.y9 y9Var = ha0Var.f45883e;
                if (y9Var != null && (message = ha0Var.f45881b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i3)) {
                    arrayList.add(y9Var.a());
                }
            }
            if (this.f47259p0.f(getUserConfig().e()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Location location = this.f47274z0;
            if (location != null && !z10) {
                arrayList.add(new org.telegram.messenger.va(location.getLatitude(), this.f47274z0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    org.telegram.messenger.qa onCreateLatLngBoundsBuilder = ((mb.b) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i13 = 0;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
                    double d12 = -1.7976931348623157E308d;
                    while (i13 < size2) {
                        org.telegram.messenger.va vaVar = (org.telegram.messenger.va) arrayList.get(i13);
                        z11 = z13;
                        try {
                            ((gi.w5) onCreateLatLngBoundsBuilder).V(vaVar);
                            i10 = size2;
                            z12 = true;
                        } catch (Exception e10) {
                            e = e10;
                            z12 = true;
                            org.telegram.messenger.a8.g(e, z12);
                            return z11;
                        }
                        try {
                            double d13 = vaVar.f25843a;
                            if (d13 < d10) {
                                d10 = d13;
                            }
                            if (d13 > d) {
                                d = d13;
                            }
                            double d14 = vaVar.f25844b;
                            if (d14 < d11) {
                                d11 = d14;
                            }
                            if (d14 > d12) {
                                d12 = d14;
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
                    double d15 = (d10 + d) / 2.0d;
                    double d16 = (d11 + d12) / 2.0d;
                    double radians = Math.toRadians(d12 - d11) * 6366198.0d * Math.cos(Math.toRadians(d15));
                    if (Math.toRadians(d - d10) * 6366198.0d < 30.0d || radians < 30.0d) {
                        gi.w5 w5Var = (gi.w5) onCreateLatLngBoundsBuilder;
                        w5Var.V(new org.telegram.messenger.va(Math.toDegrees(2.356194387921959E-6d) + d15, d16 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d15)) * 6366198.0d))));
                        w5Var.V(new org.telegram.messenger.va(d15 + Math.toDegrees(-2.356194387921959E-6d), d16 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d15)) * 6366198.0d))));
                    }
                    this.F.c(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(((gi.w5) onCreateLatLngBoundsBuilder).R(), org.telegram.messenger.g0.L(60.0f)));
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
        int i3;
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
                fa0 fa0Var = this.M0;
                if (fa0Var != null && fa0Var.m0(8) > 0) {
                    this.J0 -= org.telegram.messenger.g0.L(200.0f);
                }
                this.f47244c0 = org.telegram.messenger.g0.L(100.0f) + (measuredHeight - this.J0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.L(29.0f) + this.J0;
                this.P.setLayoutParams(layoutParams);
                this.Q.P(this.J0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.c0) ((b8.ke) this.H).f2716b).getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = u0();
                    org.telegram.messenger.z9 z9Var = this.F;
                    if (z9Var != null) {
                        z9Var.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
                    }
                    ((ai.c0) ((b8.ke) this.H).f2716b).setLayoutParams(layoutParams2);
                }
                this.Q.f();
                if (z10) {
                    if (i11 == 3) {
                        i3 = 73;
                    } else if (i11 != 1 && i11 != 2) {
                        i3 = 0;
                    } else {
                        i3 = 66;
                    }
                    this.V.h1(0, -org.telegram.messenger.g0.L(i3));
                    K0(false);
                    this.R.post(new org.telegram.ui.Components.o2(this, i3, 17));
                    return;
                }
                K0(false);
            }
        }
    }

    public final int t0() {
        return org.telegram.messenger.g0.L(10.0f) + this.f47251h0 + this.f47244c0;
    }

    public final int u0() {
        return org.telegram.messenger.g0.L(10.0f) + this.J0 + this.f47244c0;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        ArrayList arrayList = (ArrayList) getLocationController().f23976c.f(org.telegram.messenger.zi.B0(this.E0.f26868k));
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
        long B0 = org.telegram.messenger.zi.B0(this.E0.f26868k);
        tL_messages_getRecentLocations.peer = getMessagesController().j1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new ei.c6(this, B0, 1));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView w0() {
        UndoView[] undoViewArr = this.f47270x;
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
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.k6.I.q()) || org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void y0() {
        SharedPreferences e12;
        int i3;
        ImageView imageView = this.f47243c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.E && (i3 = (e12 = org.telegram.messenger.hp.e1()).getInt("proximityhint", 0)) < 3) {
            e12.edit().putInt("proximityhint", i3 + 1).commit();
            if (org.telegram.messenger.m5.E(this.m0)) {
                this.f47263s.u(org.telegram.messenger.bd.a0("ProximityTooltioUser", null, 2131746620, org.telegram.messenger.l10.j(getMessagesController().a2(Long.valueOf(this.m0)), true)));
            } else {
                this.f47263s.u(org.telegram.messenger.bd.M0(2131746621, null));
            }
            this.f47263s.w();
        }
    }
}
