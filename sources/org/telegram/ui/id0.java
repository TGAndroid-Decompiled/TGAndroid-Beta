package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public class id0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_channelLocation A0;
    public MessageObject B0;
    public boolean C0;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public final UndoView[] F;
    public dd0 F0;
    public boolean G;
    public final int G0;
    public boolean H;
    public int H0;
    public IMapsProvider.IMap I;
    public ad0 I0;
    public IMapsProvider.ICameraUpdate J;
    public sc0 J0;
    public IMapsProvider.IMapView K;
    public yc0 K0;
    public IMapsProvider.ICameraUpdate L;
    public org.telegram.ui.Cells.u3 L0;
    public boolean M;
    public TL_stories.MediaArea M0;
    public float N;
    public boolean N0;
    public IMapsProvider.ICircle O;
    public boolean O0;
    public double P;
    public Boolean P0;
    public boolean Q;
    public final Bitmap[] Q0;
    public org.telegram.ui.Components.oi0 R;
    public k0 S;
    public wc0 T;
    public org.telegram.ui.Components.vl0 U;
    public org.telegram.ui.Components.vl0 V;
    public bd0 W;
    public View X;
    public s4.c0 Y;
    public org.telegram.ui.ActionBar.w0 Z;
    public ImageView f33614a;
    public boolean f33615a0;
    public TextView f33616b;
    public boolean f33617b0;
    public ImageView f33618c;
    public boolean f33619c0;
    public org.telegram.ui.ActionBar.w0 d;
    public boolean f33620d0;
    public org.telegram.ui.Components.jl e;
    public long f33621e0;
    public LinearLayout f33622f;
    public boolean f33623f0;
    public final ArrayList f33624g0;
    public ImageView h;
    public final a0.i f33625h0;
    public long f33626i0;
    public boolean f33627j0;
    public final ArrayList f33628k0;
    public AnimatorSet f33629l0;
    public IMapsProvider.IMarker m0;
    public TextView f33630n;
    public hd0 f33631n0;
    public FrameLayout f33632o0;
    public boolean f33633p0;
    public boolean f33634q0;
    public TextView f33635r;
    public boolean f33636r0;
    public Drawable f33637s;
    public boolean f33638s0;
    public boolean f33639t0;
    public boolean f33640u0;
    public u7 v;
    public boolean f33641v0;
    public org.telegram.ui.ActionBar.w0 f33642w;
    public Location f33643w0;
    public fd0 f33644x;
    public Location f33645x0;
    public bi.x4 f33646y;
    public int f33647y0;
    public TLRPC.TL_channelLocation f33648z0;

    public id0(int i10) {
        super(null);
        this.F = new UndoView[2];
        this.f33617b0 = true;
        this.f33619c0 = false;
        this.f33620d0 = true;
        this.f33623f0 = true;
        this.f33624g0 = new ArrayList();
        this.f33625h0 = new a0.i();
        this.f33626i0 = -1L;
        this.f33628k0 = new ArrayList();
        this.f33633p0 = true;
        this.f33634q0 = true;
        this.H0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.O0 = true;
        this.Q0 = new Bitmap[7];
        this.G0 = i10;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static void U(id0 id0Var) {
        IMapsProvider.IMap iMap;
        Activity parentActivity;
        int i10 = id0Var.G0;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = id0Var.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            if (id0Var.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(id0Var.getParentActivity());
                alertDialog$Builder.m(R.raw.permission_request_location, 72, id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new qc0(id0Var, 1));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                id0Var.showDialog(alertDialog$Builder.f17528a);
            }
        } else if (id0Var.d0() || i10 == 3) {
            if ((id0Var.B0 != null && i10 != 3) || id0Var.f33648z0 != null) {
                if (id0Var.f33643w0 != null && (iMap = id0Var.I) != null) {
                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(id0Var.f33643w0.getLatitude(), id0Var.f33643w0.getLongitude()), id0Var.I.getMaxZoomLevel() - 4.0f));
                }
            } else if (id0Var.f33643w0 != null && id0Var.I != null) {
                ImageView imageView = id0Var.f33614a;
                int i11 = org.telegram.ui.ActionBar.j6.vi;
                imageView.setColorFilter(new PorterDuffColorFilter(id0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                id0Var.f33614a.setTag(Integer.valueOf(i11));
                id0Var.T.L(null);
                id0Var.C0 = false;
                id0Var.y0(false);
                id0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(id0Var.f33643w0.getLatitude(), id0Var.f33643w0.getLongitude())));
                if (id0Var.D0 && i10 != 8) {
                    Location location = id0Var.f33643w0;
                    if (location != null) {
                        id0Var.T.H(null, location, true);
                    }
                    id0Var.D0 = false;
                    id0Var.x0();
                }
            }
            if (id0Var.m0 != null) {
                id0Var.X.setVisibility(0);
                fd0 fd0Var = id0Var.f33644x;
                IMapsProvider.IMarker iMarker = id0Var.m0;
                HashMap hashMap = fd0Var.f32785a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    fd0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                id0Var.m0 = null;
                id0Var.f33631n0 = null;
                id0Var.f33632o0 = null;
            }
        }
    }

    public static void V(id0 id0Var, boolean z10, TLRPC.User user, int i10) {
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z10) {
            LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.f33621e0);
            if (sharingLocationInfo != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = id0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
                tL_messages_editMessage.f17278id = sharingLocationInfo.mid;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location lastKnownLocation = LocationController.getInstance(id0Var.currentAccount).getLastKnownLocation();
                tL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLatitude());
                tL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) lastKnownLocation.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i12 = sharingLocationInfo.lastSentProximityMeters;
                int i13 = sharingLocationInfo.proximityMeters;
                if (i12 != i13) {
                    inputMedia.proximity_notification_radius = i13;
                    inputMedia.flags |= 8;
                }
                inputMedia.heading = LocationController.getHeading(lastKnownLocation);
                TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
                int i14 = inputMedia2.flags;
                inputMedia2.flags = i14 | 4;
                int i15 = Integer.MAX_VALUE;
                if (i10 == Integer.MAX_VALUE) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = sharingLocationInfo.period + i10;
                }
                sharingLocationInfo.period = i11;
                inputMedia2.period = i11;
                if (i10 != Integer.MAX_VALUE) {
                    i15 = sharingLocationInfo.stopTime + i10;
                }
                sharingLocationInfo.stopTime = i15;
                inputMedia2.flags = i14 | 6;
                MessageObject messageObject = sharingLocationInfo.messageObject;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i11;
                    id0Var.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
                }
                id0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
                return;
            }
            return;
        }
        id0Var.w0(i10, user, 0);
    }

    public static void W(id0 id0Var) {
        sc0 sc0Var;
        id0Var.getLocationController().markLiveLoactionsAsRead(id0Var.f33621e0);
        if (!id0Var.isPaused && (sc0Var = id0Var.J0) != null) {
            AndroidUtilities.runOnUIThread(sc0Var, 5000L);
        }
    }

    public static IMapsProvider.LatLng p0(IMapsProvider.LatLng latLng, double d, double d10) {
        double degrees = Math.toDegrees(d10 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final void A0(boolean z10) {
        int i10;
        int i11;
        int i12;
        FrameLayout.LayoutParams layoutParams;
        float f7;
        s4.c1 K = this.U.K(0);
        if (K != null) {
            i10 = (int) K.f41610a.getY();
            i11 = Math.min(i10, 0) + this.H0;
        } else {
            i10 = -this.S.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) this.S.getLayoutParams()) != null) {
            if (i11 <= 0) {
                if (this.K.getView().getVisibility() == 0) {
                    this.K.getView().setVisibility(4);
                    this.S.setVisibility(4);
                    fd0 fd0Var = this.f33644x;
                    if (fd0Var != null) {
                        fd0Var.setVisibility(4);
                    }
                }
            } else if (this.K.getView().getVisibility() == 4) {
                this.K.getView().setVisibility(0);
                this.S.setVisibility(0);
                fd0 fd0Var2 = this.f33644x;
                if (fd0Var2 != null) {
                    fd0Var2.setVisibility(0);
                }
            }
            this.S.setTranslationY(Math.min(0, i10));
            int i13 = -i10;
            int i14 = i13 / 2;
            this.K.getView().setTranslationY(Math.max(0, i14));
            fd0 fd0Var3 = this.f33644x;
            if (fd0Var3 != null) {
                fd0Var3.setTranslationY(Math.max(0, i14));
            }
            int measuredHeight = this.H0 - this.d.getMeasuredHeight();
            int i15 = this.G0;
            if (i15 != 0 && i15 != 1) {
                i12 = 10;
            } else {
                i12 = 30;
            }
            float min = Math.min(measuredHeight - AndroidUtilities.dp(64 + i12), i13);
            this.d.setTranslationY(min);
            this.f33618c.setTranslationY(min);
            bi.x4 x4Var = this.f33646y;
            if (x4Var != null) {
                x4Var.setTranslationY(min);
            }
            org.telegram.ui.Components.jl jlVar = this.e;
            if (jlVar != null) {
                jlVar.f24437c = min;
                jlVar.setTranslationY(min + jlVar.f24436b);
            }
            View view = this.X;
            if (view != null) {
                if (view.getTag() == null) {
                    f7 = 48.0f;
                } else {
                    f7 = 69.0f;
                }
                int dp = (i11 / 2) + (i13 - AndroidUtilities.dp(f7));
                this.f33647y0 = dp;
                view.setTranslationY(dp);
            }
            if (!z10) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.K.getView().getLayoutParams();
                if (layoutParams2 != null) {
                    if (layoutParams2.height != AndroidUtilities.dp(10.0f) + this.H0) {
                        layoutParams2.height = AndroidUtilities.dp(10.0f) + this.H0;
                        IMapsProvider.IMap iMap = this.I;
                        if (iMap != null) {
                            iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                        }
                        this.K.getView().setLayoutParams(layoutParams2);
                    }
                }
                fd0 fd0Var4 = this.f33644x;
                if (fd0Var4 != null && (layoutParams = (FrameLayout.LayoutParams) fd0Var4.getLayoutParams()) != null) {
                    if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.H0) {
                        layoutParams.height = AndroidUtilities.dp(10.0f) + this.H0;
                        this.f33644x.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    public final void B0() {
        if (this.f33636r0) {
            if (this.f33639t0) {
                this.V.setEmptyView(null);
                this.f33622f.setVisibility(8);
                this.V.setVisibility(8);
                return;
            }
            this.V.setEmptyView(this.f33622f);
            return;
        }
        this.f33622f.setVisibility(8);
    }

    public final void C0() {
        int i10;
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.f33616b == null) {
            return;
        }
        boolean z11 = false;
        if (this.f33627j0) {
            z0(false, true);
            j0();
            return;
        }
        if (getConnectionsManager() != null) {
            i10 = getConnectionsManager().getCurrentTime();
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.f33624g0;
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.Message message = ((cd0) arrayList.get(i13)).f31643b;
            if (message != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                i12++;
            }
        }
        if (this.f33625h0.f(getUserConfig().getClientUserId()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f33643w0 != null && !z10) {
            i12++;
        }
        if (i12 >= 2) {
            z11 = true;
        }
        z0(z11, true);
    }

    public final cd0 c0(TLRPC.Message message) {
        cd0 cd0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.i iVar = this.f33625h0;
        cd0 cd0Var2 = (cd0) iVar.f(fromChatId);
        if (cd0Var2 == null) {
            ?? obj = new Object();
            obj.f31643b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f31644c = getMessagesController().getUser(Long.valueOf(obj.f31643b.from_id.user_id));
                obj.f31642a = obj.f31643b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    obj.f31644c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    obj.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                obj.f31642a = dialogId;
            }
            v0(obj);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap g02 = g0(obj);
                cd0Var = obj;
                if (g02 != null) {
                    position.icon(g02);
                    position.anchor(0.5f, 0.907f);
                    obj.e = this.I.addMarker(position);
                    if (!UserObject.isUserSelf(obj.f31644c)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.I.addMarker(flat);
                        obj.f31645f = addMarker;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            addMarker.setRotation(i10);
                            obj.f31645f.setIcon(R.drawable.map_pin_cone2);
                            obj.f31646g = true;
                        } else {
                            addMarker.setRotation(0);
                            obj.f31645f.setIcon(R.drawable.map_pin_circle);
                            obj.f31646g = false;
                        }
                    }
                    this.f33624g0.add(obj);
                    iVar.k(obj, obj.f31642a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f33621e0);
                    int i11 = (obj.f31642a > getUserConfig().getClientUserId() ? 1 : (obj.f31642a == getUserConfig().getClientUserId() ? 0 : -1));
                    cd0Var = obj;
                    cd0Var = obj;
                    if (i11 == 0 && sharingLocationInfo != null) {
                        int i12 = obj.f31643b.f17216id;
                        cd0Var = obj;
                        if (i12 == sharingLocationInfo.mid) {
                            Location location = this.f33643w0;
                            cd0Var = obj;
                            if (location != null) {
                                obj.e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.f33643w0.getLongitude()));
                                cd0Var = obj;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                cd0Var = obj;
            }
        } else {
            cd0Var2.f31643b = message;
            cd0Var2.e.setPosition(latLng);
            int i13 = (this.f33626i0 > cd0Var2.f31642a ? 1 : (this.f33626i0 == cd0Var2.f31642a ? 0 : -1));
            cd0Var = cd0Var2;
            if (i13 == 0) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(cd0Var2.e.getPosition()));
                cd0Var = cd0Var2;
            }
        }
        org.telegram.ui.Components.oi0 oi0Var = this.R;
        if (oi0Var != null) {
            oi0Var.c(true);
        }
        C0();
        return cd0Var;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        FrameLayout.LayoutParams layoutParams;
        TLRPC.Chat chat;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.f33638s0 = false;
        this.f33636r0 = false;
        this.f33639t0 = false;
        wc0 wc0Var = this.T;
        if (wc0Var != null) {
            wc0Var.F();
        }
        bd0 bd0Var = this.W;
        if (bd0Var != null) {
            bd0Var.F();
        }
        if (this.f33648z0 != null) {
            Location location = new Location("network");
            this.f33645x0 = location;
            location.setLatitude(this.f33648z0.geo_point.lat);
            this.f33645x0.setLongitude(this.f33648z0.geo_point._long);
        } else if (this.B0 != null) {
            Location location2 = new Location("network");
            this.f33645x0 = location2;
            location2.setLatitude(this.B0.messageOwner.media.geo.lat);
            this.f33645x0.setLongitude(this.B0.messageOwner.media.geo._long);
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33619c0 = z10;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.f17998h5;
        lVar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.j6.f18034j5;
        lVar2.setTitleColor(getThemedColor(i13));
        this.actionBar.C(getThemedColor(i13), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.j6.I5), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new vc0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        TLRPC.TL_channelLocation tL_channelLocation = this.f33648z0;
        int i14 = this.G0;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.B0;
            if (messageObject != null) {
                if (messageObject.isLiveLocation()) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                    org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                    this.Z = c10;
                    c10.e(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
                } else {
                    String str = this.B0.messageOwner.media.title;
                    if (str != null && str.length() > 0) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                    }
                    if (i14 != 3) {
                        org.telegram.ui.ActionBar.w0 c11 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                        this.Z = c11;
                        c11.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                        if (!getLocationController().isSharingLocation(this.f33621e0) && this.O0) {
                            this.Z.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                        }
                        this.Z.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                    }
                }
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i14 != 4) {
                    this.f33644x = new fd0(this, context);
                    org.telegram.ui.ActionBar.w0 c12 = n10.c(0, R.drawable.outline_header_search, getResourceProvider());
                    c12.F();
                    c12.H = new gg.m2(this, 12);
                    this.f33642w = c12;
                    c12.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.f33642w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.f33642w.getSearchField();
                    searchField.setTextColor(getThemedColor(i13));
                    searchField.setCursorColor(getThemedColor(i13));
                    searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Vd));
                }
            }
        }
        gd0 gd0Var = new gd0(this, context);
        this.fragmentView = gd0Var;
        gd0Var.setBackgroundColor(getThemedColor(i12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f33637s = mutate;
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.f33637s.getPadding(rect);
        if (i14 != 0 && i14 != 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top);
        }
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        layoutParams2.gravity = 83;
        k0 k0Var = new k0(this, context, 11);
        this.S = k0Var;
        k0Var.setBackgroundDrawable(new org.telegram.ui.Components.dd(n0()));
        MessageObject messageObject2 = this.B0;
        if ((messageObject2 == null && (i14 == 0 || i14 == 1)) || (messageObject2 != null && i14 == 3)) {
            org.telegram.ui.Components.jl jlVar = new org.telegram.ui.Components.jl(context, 1);
            this.e = jlVar;
            jlVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int dp = AndroidUtilities.dp(40.0f);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.wi);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.xi);
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3);
            w7.c6.a(this.e);
            this.e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.e.setOutlineProvider(xf.k0.f45157b);
            this.e.setBackgroundDrawable(i02);
            this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.vi));
            this.e.setTextSize(1, 14.0f);
            this.e.setTypeface(AndroidUtilities.bold());
            this.e.setGravity(17);
            this.e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.S.addView(this.e, w7.a6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (i14 == 3) {
                this.e.setText(LocaleController.getString(R.string.OpenInMaps));
                this.e.setOnClickListener(new View.OnClickListener(this) {
                    public final id0 f35788b;

                    {
                        this.f35788b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        TLRPC.User user;
                        boolean z14;
                        int i15 = r2;
                        id0 id0Var = this.f35788b;
                        switch (i15) {
                            case 0:
                                id0Var.y0(false);
                                id0Var.T.H(null, id0Var.f33645x0, true);
                                id0Var.D0 = true;
                                id0Var.x0();
                                return;
                            case 1:
                                id0Var.d.M(null, null);
                                return;
                            case 2:
                                id0.U(id0Var);
                                return;
                            case 3:
                                id0Var.f33626i0 = -1L;
                                id0Var.C0 = true;
                                if (id0Var.j0()) {
                                    id0Var.f33627j0 = true;
                                    id0Var.z0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (id0Var.getParentActivity() != null && id0Var.f33643w0 != null && id0Var.d0() && id0Var.I != null) {
                                    bi.x4 x4Var = id0Var.f33646y;
                                    if (x4Var != null) {
                                        x4Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.f33621e0);
                                    if (id0Var.G) {
                                        id0Var.F[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        id0Var.f33618c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = id0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            id0Var.O = null;
                                        }
                                        id0Var.G = true;
                                        id0Var.m0().k(0L, 25, 0, null, new sc0(id0Var, 1), new h90(12, id0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = id0Var.O;
                                    if (iCircle2 == null) {
                                        id0Var.e0(500);
                                    } else {
                                        id0Var.P = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(id0Var.f33621e0)) {
                                        user = id0Var.getMessagesController().getUser(Long.valueOf(id0Var.f33621e0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity = id0Var.getParentActivity();
                                    qc0 qc0Var = new qc0(id0Var, 3);
                                    l80 l80Var = new l80(9, id0Var, user);
                                    sc0 sc0Var = new sc0(id0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity);
                                    frameLayout.f25812a = null;
                                    frameLayout.d = -1;
                                    frameLayout.e = false;
                                    frameLayout.f25815f = false;
                                    frameLayout.h = null;
                                    frameLayout.f25816n = new Rect();
                                    new Paint();
                                    frameLayout.f25819w = true;
                                    frameLayout.F = org.telegram.ui.Components.wr.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.Q = sc0Var;
                                    frameLayout.f25821y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false), PorterDuff.Mode.MULTIPLY));
                                    mutate2.getPadding(rect2);
                                    int i16 = rect2.left;
                                    frameLayout.f25820x = i16;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i16, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i16, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, w7.a6.e(-1, -2, 80));
                                    frameLayout.O = LocaleController.getUseImperialSystemType();
                                    frameLayout.M = user;
                                    frameLayout.I = qc0Var;
                                    org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(parentActivity, null);
                                    frameLayout.G = dd0Var;
                                    dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    dd0Var.setItemCount(5);
                                    org.telegram.ui.Components.dd0 dd0Var2 = new org.telegram.ui.Components.dd0(parentActivity, null);
                                    frameLayout.H = dd0Var2;
                                    dd0Var2.setItemCount(5);
                                    dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(frameLayout, parentActivity);
                                    frameLayout.P = li0Var;
                                    li0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                    li0Var.addView(frameLayout3, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.a2.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false), 1, 20.0f);
                                    frameLayout3.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView.setOnTouchListener(new ai.h(20));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    li0Var.addView(linearLayout, w7.a6.n(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                                    TextView textView2 = new TextView(parentActivity);
                                    frameLayout.K = textView2;
                                    ?? textView3 = new TextView(parentActivity);
                                    frameLayout.J = textView3;
                                    linearLayout.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
                                    dd0Var.setFormatter(new org.telegram.ui.Components.ji0(frameLayout, 0));
                                    dd0Var.setMinValue(0);
                                    dd0Var.setMaxValue(10);
                                    dd0Var.setWrapSelectorWheel(false);
                                    dd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(frameLayout, 1);
                                    dd0Var.setOnValueChangedListener(ji0Var);
                                    dd0Var2.setMinValue(0);
                                    dd0Var2.setMaxValue(10);
                                    dd0Var2.setWrapSelectorWheel(false);
                                    dd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(dd0Var2, w7.a6.l(0.5f, 0, 270));
                                    dd0Var2.setFormatter(new org.telegram.ui.Components.ji0(frameLayout, 2));
                                    dd0Var2.setOnValueChangedListener(ji0Var);
                                    dd0Var.setValue(0);
                                    dd0Var2.setValue(6);
                                    li0Var.addView(frameLayout4, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                    frameLayout4.addView((View) textView3, w7.a6.c(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.u10(8, frameLayout, l80Var));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18161q5, false));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, w7.a6.c(48.0f, -1));
                                    frameLayout2.addView(li0Var, w7.a6.e(-1, -2, 51));
                                    id0Var.R = frameLayout;
                                    ((FrameLayout) id0Var.fragmentView).addView((View) frameLayout, w7.a6.c(-1.0f, -1));
                                    org.telegram.ui.Components.oi0 oi0Var = id0Var.R;
                                    oi0Var.f25817r = false;
                                    AnimatorSet animatorSet = oi0Var.f25818s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        oi0Var.f25818s = null;
                                    }
                                    org.telegram.ui.Components.ki0 ki0Var = oi0Var.v;
                                    ki0Var.measure(View.MeasureSpec.makeMeasureSpec((oi0Var.f25820x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (oi0Var.f25817r) {
                                        z14 = true;
                                    } else {
                                        ki0Var.setVisibility(0);
                                        if (oi0Var.f25819w) {
                                            oi0Var.setLayerType(2, null);
                                        }
                                        ki0Var.setTranslationY(ki0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        oi0Var.f25818s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ki0Var, View.TRANSLATION_Y, 0.0f));
                                        oi0Var.f25818s.setDuration(400L);
                                        oi0Var.f25818s.setStartDelay(20L);
                                        oi0Var.f25818s.setInterpolator(oi0Var.F);
                                        z14 = true;
                                        oi0Var.f25818s.addListener(new org.telegram.ui.Components.ni0(oi0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        oi0Var.f25818s.start();
                                    }
                                    oi0Var.c(z14);
                                    return;
                                }
                                return;
                            default:
                                id0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                        }
                    }
                });
                this.e.setTranslationX(0.0f);
            } else {
                this.e.setText(LocaleController.getString(R.string.PlacesInThisArea));
                this.e.setOnClickListener(new View.OnClickListener(this) {
                    public final id0 f35788b;

                    {
                        this.f35788b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        TLRPC.User user;
                        boolean z14;
                        int i15 = r2;
                        id0 id0Var = this.f35788b;
                        switch (i15) {
                            case 0:
                                id0Var.y0(false);
                                id0Var.T.H(null, id0Var.f33645x0, true);
                                id0Var.D0 = true;
                                id0Var.x0();
                                return;
                            case 1:
                                id0Var.d.M(null, null);
                                return;
                            case 2:
                                id0.U(id0Var);
                                return;
                            case 3:
                                id0Var.f33626i0 = -1L;
                                id0Var.C0 = true;
                                if (id0Var.j0()) {
                                    id0Var.f33627j0 = true;
                                    id0Var.z0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (id0Var.getParentActivity() != null && id0Var.f33643w0 != null && id0Var.d0() && id0Var.I != null) {
                                    bi.x4 x4Var = id0Var.f33646y;
                                    if (x4Var != null) {
                                        x4Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.f33621e0);
                                    if (id0Var.G) {
                                        id0Var.F[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        id0Var.f33618c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = id0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            id0Var.O = null;
                                        }
                                        id0Var.G = true;
                                        id0Var.m0().k(0L, 25, 0, null, new sc0(id0Var, 1), new h90(12, id0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = id0Var.O;
                                    if (iCircle2 == null) {
                                        id0Var.e0(500);
                                    } else {
                                        id0Var.P = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(id0Var.f33621e0)) {
                                        user = id0Var.getMessagesController().getUser(Long.valueOf(id0Var.f33621e0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity = id0Var.getParentActivity();
                                    qc0 qc0Var = new qc0(id0Var, 3);
                                    l80 l80Var = new l80(9, id0Var, user);
                                    sc0 sc0Var = new sc0(id0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity);
                                    frameLayout.f25812a = null;
                                    frameLayout.d = -1;
                                    frameLayout.e = false;
                                    frameLayout.f25815f = false;
                                    frameLayout.h = null;
                                    frameLayout.f25816n = new Rect();
                                    new Paint();
                                    frameLayout.f25819w = true;
                                    frameLayout.F = org.telegram.ui.Components.wr.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.Q = sc0Var;
                                    frameLayout.f25821y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false), PorterDuff.Mode.MULTIPLY));
                                    mutate2.getPadding(rect2);
                                    int i16 = rect2.left;
                                    frameLayout.f25820x = i16;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i16, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i16, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, w7.a6.e(-1, -2, 80));
                                    frameLayout.O = LocaleController.getUseImperialSystemType();
                                    frameLayout.M = user;
                                    frameLayout.I = qc0Var;
                                    org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(parentActivity, null);
                                    frameLayout.G = dd0Var;
                                    dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    dd0Var.setItemCount(5);
                                    org.telegram.ui.Components.dd0 dd0Var2 = new org.telegram.ui.Components.dd0(parentActivity, null);
                                    frameLayout.H = dd0Var2;
                                    dd0Var2.setItemCount(5);
                                    dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(frameLayout, parentActivity);
                                    frameLayout.P = li0Var;
                                    li0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                    li0Var.addView(frameLayout3, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.a2.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false), 1, 20.0f);
                                    frameLayout3.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView.setOnTouchListener(new ai.h(20));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    li0Var.addView(linearLayout, w7.a6.n(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                                    TextView textView2 = new TextView(parentActivity);
                                    frameLayout.K = textView2;
                                    ?? textView3 = new TextView(parentActivity);
                                    frameLayout.J = textView3;
                                    linearLayout.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
                                    dd0Var.setFormatter(new org.telegram.ui.Components.ji0(frameLayout, 0));
                                    dd0Var.setMinValue(0);
                                    dd0Var.setMaxValue(10);
                                    dd0Var.setWrapSelectorWheel(false);
                                    dd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(frameLayout, 1);
                                    dd0Var.setOnValueChangedListener(ji0Var);
                                    dd0Var2.setMinValue(0);
                                    dd0Var2.setMaxValue(10);
                                    dd0Var2.setWrapSelectorWheel(false);
                                    dd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(dd0Var2, w7.a6.l(0.5f, 0, 270));
                                    dd0Var2.setFormatter(new org.telegram.ui.Components.ji0(frameLayout, 2));
                                    dd0Var2.setOnValueChangedListener(ji0Var);
                                    dd0Var.setValue(0);
                                    dd0Var2.setValue(6);
                                    li0Var.addView(frameLayout4, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                                    frameLayout4.addView((View) textView3, w7.a6.c(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.u10(8, frameLayout, l80Var));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18161q5, false));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, w7.a6.c(48.0f, -1));
                                    frameLayout2.addView(li0Var, w7.a6.e(-1, -2, 51));
                                    id0Var.R = frameLayout;
                                    ((FrameLayout) id0Var.fragmentView).addView((View) frameLayout, w7.a6.c(-1.0f, -1));
                                    org.telegram.ui.Components.oi0 oi0Var = id0Var.R;
                                    oi0Var.f25817r = false;
                                    AnimatorSet animatorSet = oi0Var.f25818s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        oi0Var.f25818s = null;
                                    }
                                    org.telegram.ui.Components.ki0 ki0Var = oi0Var.v;
                                    ki0Var.measure(View.MeasureSpec.makeMeasureSpec((oi0Var.f25820x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (oi0Var.f25817r) {
                                        z14 = true;
                                    } else {
                                        ki0Var.setVisibility(0);
                                        if (oi0Var.f25819w) {
                                            oi0Var.setLayerType(2, null);
                                        }
                                        ki0Var.setTranslationY(ki0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        oi0Var.f25818s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ki0Var, View.TRANSLATION_Y, 0.0f));
                                        oi0Var.f25818s.setDuration(400L);
                                        oi0Var.f25818s.setStartDelay(20L);
                                        oi0Var.f25818s.setInterpolator(oi0Var.F);
                                        z14 = true;
                                        oi0Var.f25818s.addListener(new org.telegram.ui.Components.ni0(oi0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        oi0Var.f25818s.start();
                                    }
                                    oi0Var.c(z14);
                                    return;
                                }
                                return;
                            default:
                                id0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                        }
                    }
                });
            }
        }
        int i15 = org.telegram.ui.ActionBar.j6.ui;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i15), false, getResourceProvider());
        this.d = w0Var;
        w0Var.setClickable(true);
        this.d.setSubMenuOpenSide(2);
        this.d.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        this.d.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        this.d.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), getResourceProvider());
        this.d.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), getResourceProvider());
        this.d.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), getResourceProvider());
        this.d.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int dp2 = AndroidUtilities.dp(40.0f);
        int i16 = org.telegram.ui.ActionBar.j6.wi;
        int themedColor4 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.j6.xi;
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(dp2, themedColor4, getThemedColor(i17));
        w7.c6.a(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.d;
        bi.g gVar = xf.k0.f45156a;
        w0Var2.setOutlineProvider(gVar);
        this.d.setBackgroundDrawable(h02);
        this.d.setIcon(R.drawable.msg_map_type);
        this.S.addView(this.d, w7.a6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final id0 f35788b;

            {
                this.f35788b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                id0 id0Var = this.f35788b;
                switch (i152) {
                    case 0:
                        id0Var.y0(false);
                        id0Var.T.H(null, id0Var.f33645x0, true);
                        id0Var.D0 = true;
                        id0Var.x0();
                        return;
                    case 1:
                        id0Var.d.M(null, null);
                        return;
                    case 2:
                        id0.U(id0Var);
                        return;
                    case 3:
                        id0Var.f33626i0 = -1L;
                        id0Var.C0 = true;
                        if (id0Var.j0()) {
                            id0Var.f33627j0 = true;
                            id0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (id0Var.getParentActivity() != null && id0Var.f33643w0 != null && id0Var.d0() && id0Var.I != null) {
                            bi.x4 x4Var = id0Var.f33646y;
                            if (x4Var != null) {
                                x4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.f33621e0);
                            if (id0Var.G) {
                                id0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                id0Var.f33618c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = id0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    id0Var.O = null;
                                }
                                id0Var.G = true;
                                id0Var.m0().k(0L, 25, 0, null, new sc0(id0Var, 1), new h90(12, id0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = id0Var.O;
                            if (iCircle2 == null) {
                                id0Var.e0(500);
                            } else {
                                id0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(id0Var.f33621e0)) {
                                user = id0Var.getMessagesController().getUser(Long.valueOf(id0Var.f33621e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = id0Var.getParentActivity();
                            qc0 qc0Var = new qc0(id0Var, 3);
                            l80 l80Var = new l80(9, id0Var, user);
                            sc0 sc0Var = new sc0(id0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f25812a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f25815f = false;
                            frameLayout.h = null;
                            frameLayout.f25816n = new Rect();
                            new Paint();
                            frameLayout.f25819w = true;
                            frameLayout.F = org.telegram.ui.Components.wr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = sc0Var;
                            frameLayout.f25821y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f25820x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.a6.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = qc0Var;
                            org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(parentActivity, null);
                            frameLayout.G = dd0Var;
                            dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            dd0Var.setItemCount(5);
                            org.telegram.ui.Components.dd0 dd0Var2 = new org.telegram.ui.Components.dd0(parentActivity, null);
                            frameLayout.H = dd0Var2;
                            dd0Var2.setItemCount(5);
                            dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(frameLayout, parentActivity);
                            frameLayout.P = li0Var;
                            li0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            li0Var.addView(frameLayout3, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.a2.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false), 1, 20.0f);
                            frameLayout3.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new ai.h(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            li0Var.addView(linearLayout, w7.a6.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView2 = new TextView(parentActivity);
                            frameLayout.K = textView2;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.J = textView3;
                            linearLayout.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
                            dd0Var.setFormatter(new org.telegram.ui.Components.ji0(frameLayout, 0));
                            dd0Var.setMinValue(0);
                            dd0Var.setMaxValue(10);
                            dd0Var.setWrapSelectorWheel(false);
                            dd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(frameLayout, 1);
                            dd0Var.setOnValueChangedListener(ji0Var);
                            dd0Var2.setMinValue(0);
                            dd0Var2.setMaxValue(10);
                            dd0Var2.setWrapSelectorWheel(false);
                            dd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(dd0Var2, w7.a6.l(0.5f, 0, 270));
                            dd0Var2.setFormatter(new org.telegram.ui.Components.ji0(frameLayout, 2));
                            dd0Var2.setOnValueChangedListener(ji0Var);
                            dd0Var.setValue(0);
                            dd0Var2.setValue(6);
                            li0Var.addView(frameLayout4, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                            frameLayout4.addView((View) textView3, w7.a6.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.u10(8, frameLayout, l80Var));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18161q5, false));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, w7.a6.c(48.0f, -1));
                            frameLayout2.addView(li0Var, w7.a6.e(-1, -2, 51));
                            id0Var.R = frameLayout;
                            ((FrameLayout) id0Var.fragmentView).addView((View) frameLayout, w7.a6.c(-1.0f, -1));
                            org.telegram.ui.Components.oi0 oi0Var = id0Var.R;
                            oi0Var.f25817r = false;
                            AnimatorSet animatorSet = oi0Var.f25818s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                oi0Var.f25818s = null;
                            }
                            org.telegram.ui.Components.ki0 ki0Var = oi0Var.v;
                            ki0Var.measure(View.MeasureSpec.makeMeasureSpec((oi0Var.f25820x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (oi0Var.f25817r) {
                                z14 = true;
                            } else {
                                ki0Var.setVisibility(0);
                                if (oi0Var.f25819w) {
                                    oi0Var.setLayerType(2, null);
                                }
                                ki0Var.setTranslationY(ki0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                oi0Var.f25818s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(ki0Var, View.TRANSLATION_Y, 0.0f));
                                oi0Var.f25818s.setDuration(400L);
                                oi0Var.f25818s.setStartDelay(20L);
                                oi0Var.f25818s.setInterpolator(oi0Var.F);
                                z14 = true;
                                oi0Var.f25818s.addListener(new org.telegram.ui.Components.ni0(oi0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                oi0Var.f25818s.start();
                            }
                            oi0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        id0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        this.d.setDelegate(new qc0(this, 0));
        this.f33614a = new ImageView(context);
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i16), getThemedColor(i17));
        w7.c6.a(this.f33614a);
        this.f33614a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f33614a.setOutlineProvider(gVar);
        this.f33614a.setBackground(h03);
        this.f33614a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.f33614a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f33614a;
        int i18 = org.telegram.ui.ActionBar.j6.vi;
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), mode));
        this.f33614a.setTag(Integer.valueOf(i18));
        this.f33614a.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams d = w7.a6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        d.bottomMargin = (layoutParams2.height - rect.top) + d.bottomMargin;
        this.S.addView(this.f33614a, d);
        this.f33614a.setOnClickListener(new View.OnClickListener(this) {
            public final id0 f35788b;

            {
                this.f35788b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                id0 id0Var = this.f35788b;
                switch (i152) {
                    case 0:
                        id0Var.y0(false);
                        id0Var.T.H(null, id0Var.f33645x0, true);
                        id0Var.D0 = true;
                        id0Var.x0();
                        return;
                    case 1:
                        id0Var.d.M(null, null);
                        return;
                    case 2:
                        id0.U(id0Var);
                        return;
                    case 3:
                        id0Var.f33626i0 = -1L;
                        id0Var.C0 = true;
                        if (id0Var.j0()) {
                            id0Var.f33627j0 = true;
                            id0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (id0Var.getParentActivity() != null && id0Var.f33643w0 != null && id0Var.d0() && id0Var.I != null) {
                            bi.x4 x4Var = id0Var.f33646y;
                            if (x4Var != null) {
                                x4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.f33621e0);
                            if (id0Var.G) {
                                id0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                id0Var.f33618c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = id0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    id0Var.O = null;
                                }
                                id0Var.G = true;
                                id0Var.m0().k(0L, 25, 0, null, new sc0(id0Var, 1), new h90(12, id0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = id0Var.O;
                            if (iCircle2 == null) {
                                id0Var.e0(500);
                            } else {
                                id0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(id0Var.f33621e0)) {
                                user = id0Var.getMessagesController().getUser(Long.valueOf(id0Var.f33621e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = id0Var.getParentActivity();
                            qc0 qc0Var = new qc0(id0Var, 3);
                            l80 l80Var = new l80(9, id0Var, user);
                            sc0 sc0Var = new sc0(id0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f25812a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f25815f = false;
                            frameLayout.h = null;
                            frameLayout.f25816n = new Rect();
                            new Paint();
                            frameLayout.f25819w = true;
                            frameLayout.F = org.telegram.ui.Components.wr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = sc0Var;
                            frameLayout.f25821y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f25820x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.a6.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = qc0Var;
                            org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(parentActivity, null);
                            frameLayout.G = dd0Var;
                            dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            dd0Var.setItemCount(5);
                            org.telegram.ui.Components.dd0 dd0Var2 = new org.telegram.ui.Components.dd0(parentActivity, null);
                            frameLayout.H = dd0Var2;
                            dd0Var2.setItemCount(5);
                            dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(frameLayout, parentActivity);
                            frameLayout.P = li0Var;
                            li0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            li0Var.addView(frameLayout3, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.a2.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false), 1, 20.0f);
                            frameLayout3.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new ai.h(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            li0Var.addView(linearLayout, w7.a6.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView2 = new TextView(parentActivity);
                            frameLayout.K = textView2;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.J = textView3;
                            linearLayout.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
                            dd0Var.setFormatter(new org.telegram.ui.Components.ji0(frameLayout, 0));
                            dd0Var.setMinValue(0);
                            dd0Var.setMaxValue(10);
                            dd0Var.setWrapSelectorWheel(false);
                            dd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(frameLayout, 1);
                            dd0Var.setOnValueChangedListener(ji0Var);
                            dd0Var2.setMinValue(0);
                            dd0Var2.setMaxValue(10);
                            dd0Var2.setWrapSelectorWheel(false);
                            dd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(dd0Var2, w7.a6.l(0.5f, 0, 270));
                            dd0Var2.setFormatter(new org.telegram.ui.Components.ji0(frameLayout, 2));
                            dd0Var2.setOnValueChangedListener(ji0Var);
                            dd0Var.setValue(0);
                            dd0Var2.setValue(6);
                            li0Var.addView(frameLayout4, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                            frameLayout4.addView((View) textView3, w7.a6.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.u10(8, frameLayout, l80Var));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18161q5, false));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, w7.a6.c(48.0f, -1));
                            frameLayout2.addView(li0Var, w7.a6.e(-1, -2, 51));
                            id0Var.R = frameLayout;
                            ((FrameLayout) id0Var.fragmentView).addView((View) frameLayout, w7.a6.c(-1.0f, -1));
                            org.telegram.ui.Components.oi0 oi0Var = id0Var.R;
                            oi0Var.f25817r = false;
                            AnimatorSet animatorSet = oi0Var.f25818s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                oi0Var.f25818s = null;
                            }
                            org.telegram.ui.Components.ki0 ki0Var = oi0Var.v;
                            ki0Var.measure(View.MeasureSpec.makeMeasureSpec((oi0Var.f25820x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (oi0Var.f25817r) {
                                z14 = true;
                            } else {
                                ki0Var.setVisibility(0);
                                if (oi0Var.f25819w) {
                                    oi0Var.setLayerType(2, null);
                                }
                                ki0Var.setTranslationY(ki0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                oi0Var.f25818s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(ki0Var, View.TRANSLATION_Y, 0.0f));
                                oi0Var.f25818s.setDuration(400L);
                                oi0Var.f25818s.setStartDelay(20L);
                                oi0Var.f25818s.setInterpolator(oi0Var.F);
                                z14 = true;
                                oi0Var.f25818s.addListener(new org.telegram.ui.Components.ni0(oi0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                oi0Var.f25818s.start();
                            }
                            oi0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        id0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                            double d10 = geoPoint.lat;
                            double d102 = geoPoint._long;
                            id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d10 + "," + d102 + "?q=" + d10 + "," + d102)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        TextView textView = new TextView(context);
        this.f33616b = textView;
        textView.setGravity(17);
        this.f33616b.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f33616b.setTextSize(1, 15.0f);
        this.f33616b.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourceProvider));
        this.f33616b.setTypeface(AndroidUtilities.bold());
        this.f33616b.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.f33616b.setText(LocaleController.getString(R.string.LocationsShowAll));
        this.f33616b.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i16), getThemedColor(i17), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams d10 = w7.a6.d(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        d10.bottomMargin = (layoutParams2.height - rect.top) + d10.bottomMargin;
        this.S.addView(this.f33616b, d10);
        w7.c6.a(this.f33616b);
        this.f33616b.setOnClickListener(new View.OnClickListener(this) {
            public final id0 f35788b;

            {
                this.f35788b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                id0 id0Var = this.f35788b;
                switch (i152) {
                    case 0:
                        id0Var.y0(false);
                        id0Var.T.H(null, id0Var.f33645x0, true);
                        id0Var.D0 = true;
                        id0Var.x0();
                        return;
                    case 1:
                        id0Var.d.M(null, null);
                        return;
                    case 2:
                        id0.U(id0Var);
                        return;
                    case 3:
                        id0Var.f33626i0 = -1L;
                        id0Var.C0 = true;
                        if (id0Var.j0()) {
                            id0Var.f33627j0 = true;
                            id0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (id0Var.getParentActivity() != null && id0Var.f33643w0 != null && id0Var.d0() && id0Var.I != null) {
                            bi.x4 x4Var = id0Var.f33646y;
                            if (x4Var != null) {
                                x4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.f33621e0);
                            if (id0Var.G) {
                                id0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                id0Var.f33618c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = id0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    id0Var.O = null;
                                }
                                id0Var.G = true;
                                id0Var.m0().k(0L, 25, 0, null, new sc0(id0Var, 1), new h90(12, id0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = id0Var.O;
                            if (iCircle2 == null) {
                                id0Var.e0(500);
                            } else {
                                id0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(id0Var.f33621e0)) {
                                user = id0Var.getMessagesController().getUser(Long.valueOf(id0Var.f33621e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = id0Var.getParentActivity();
                            qc0 qc0Var = new qc0(id0Var, 3);
                            l80 l80Var = new l80(9, id0Var, user);
                            sc0 sc0Var = new sc0(id0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f25812a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f25815f = false;
                            frameLayout.h = null;
                            frameLayout.f25816n = new Rect();
                            new Paint();
                            frameLayout.f25819w = true;
                            frameLayout.F = org.telegram.ui.Components.wr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = sc0Var;
                            frameLayout.f25821y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f25820x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.a6.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = qc0Var;
                            org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(parentActivity, null);
                            frameLayout.G = dd0Var;
                            dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            dd0Var.setItemCount(5);
                            org.telegram.ui.Components.dd0 dd0Var2 = new org.telegram.ui.Components.dd0(parentActivity, null);
                            frameLayout.H = dd0Var2;
                            dd0Var2.setItemCount(5);
                            dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(frameLayout, parentActivity);
                            frameLayout.P = li0Var;
                            li0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            li0Var.addView(frameLayout3, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.a2.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false), 1, 20.0f);
                            frameLayout3.addView(textView2, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new ai.h(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            li0Var.addView(linearLayout, w7.a6.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView22 = new TextView(parentActivity);
                            frameLayout.K = textView22;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.J = textView3;
                            linearLayout.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
                            dd0Var.setFormatter(new org.telegram.ui.Components.ji0(frameLayout, 0));
                            dd0Var.setMinValue(0);
                            dd0Var.setMaxValue(10);
                            dd0Var.setWrapSelectorWheel(false);
                            dd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(frameLayout, 1);
                            dd0Var.setOnValueChangedListener(ji0Var);
                            dd0Var2.setMinValue(0);
                            dd0Var2.setMaxValue(10);
                            dd0Var2.setWrapSelectorWheel(false);
                            dd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(dd0Var2, w7.a6.l(0.5f, 0, 270));
                            dd0Var2.setFormatter(new org.telegram.ui.Components.ji0(frameLayout, 2));
                            dd0Var2.setOnValueChangedListener(ji0Var);
                            dd0Var.setValue(0);
                            dd0Var2.setValue(6);
                            li0Var.addView(frameLayout4, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                            frameLayout4.addView((View) textView3, w7.a6.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.u10(8, frameLayout, l80Var));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18161q5, false));
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, w7.a6.c(48.0f, -1));
                            frameLayout2.addView(li0Var, w7.a6.e(-1, -2, 51));
                            id0Var.R = frameLayout;
                            ((FrameLayout) id0Var.fragmentView).addView((View) frameLayout, w7.a6.c(-1.0f, -1));
                            org.telegram.ui.Components.oi0 oi0Var = id0Var.R;
                            oi0Var.f25817r = false;
                            AnimatorSet animatorSet = oi0Var.f25818s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                oi0Var.f25818s = null;
                            }
                            org.telegram.ui.Components.ki0 ki0Var = oi0Var.v;
                            ki0Var.measure(View.MeasureSpec.makeMeasureSpec((oi0Var.f25820x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (oi0Var.f25817r) {
                                z14 = true;
                            } else {
                                ki0Var.setVisibility(0);
                                if (oi0Var.f25819w) {
                                    oi0Var.setLayerType(2, null);
                                }
                                ki0Var.setTranslationY(ki0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                oi0Var.f25818s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(ki0Var, View.TRANSLATION_Y, 0.0f));
                                oi0Var.f25818s.setDuration(400L);
                                oi0Var.f25818s.setStartDelay(20L);
                                oi0Var.f25818s.setInterpolator(oi0Var.F);
                                z14 = true;
                                oi0Var.f25818s.addListener(new org.telegram.ui.Components.ni0(oi0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                oi0Var.f25818s.start();
                            }
                            oi0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        id0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        z0(false, false);
        this.f33618c = new ImageView(context);
        org.telegram.ui.Cells.z h04 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i16), getThemedColor(i17));
        w7.c6.a(this.f33618c);
        this.f33618c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f33618c.setOutlineProvider(gVar);
        this.f33618c.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        this.f33618c.setBackgroundDrawable(h04);
        this.f33618c.setScaleType(scaleType);
        this.f33618c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.S.addView(this.f33618c, w7.a6.d(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        this.f33618c.setOnClickListener(new View.OnClickListener(this) {
            public final id0 f35788b;

            {
                this.f35788b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                id0 id0Var = this.f35788b;
                switch (i152) {
                    case 0:
                        id0Var.y0(false);
                        id0Var.T.H(null, id0Var.f33645x0, true);
                        id0Var.D0 = true;
                        id0Var.x0();
                        return;
                    case 1:
                        id0Var.d.M(null, null);
                        return;
                    case 2:
                        id0.U(id0Var);
                        return;
                    case 3:
                        id0Var.f33626i0 = -1L;
                        id0Var.C0 = true;
                        if (id0Var.j0()) {
                            id0Var.f33627j0 = true;
                            id0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (id0Var.getParentActivity() != null && id0Var.f33643w0 != null && id0Var.d0() && id0Var.I != null) {
                            bi.x4 x4Var = id0Var.f33646y;
                            if (x4Var != null) {
                                x4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = id0Var.getLocationController().getSharingLocationInfo(id0Var.f33621e0);
                            if (id0Var.G) {
                                id0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                id0Var.f33618c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = id0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    id0Var.O = null;
                                }
                                id0Var.G = true;
                                id0Var.m0().k(0L, 25, 0, null, new sc0(id0Var, 1), new h90(12, id0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = id0Var.O;
                            if (iCircle2 == null) {
                                id0Var.e0(500);
                            } else {
                                id0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(id0Var.f33621e0)) {
                                user = id0Var.getMessagesController().getUser(Long.valueOf(id0Var.f33621e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = id0Var.getParentActivity();
                            qc0 qc0Var = new qc0(id0Var, 3);
                            l80 l80Var = new l80(9, id0Var, user);
                            sc0 sc0Var = new sc0(id0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f25812a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f25815f = false;
                            frameLayout.h = null;
                            frameLayout.f25816n = new Rect();
                            new Paint();
                            frameLayout.f25819w = true;
                            frameLayout.F = org.telegram.ui.Components.wr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = sc0Var;
                            frameLayout.f25821y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f25820x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.a6.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = qc0Var;
                            org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(parentActivity, null);
                            frameLayout.G = dd0Var;
                            dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            dd0Var.setItemCount(5);
                            org.telegram.ui.Components.dd0 dd0Var2 = new org.telegram.ui.Components.dd0(parentActivity, null);
                            frameLayout.H = dd0Var2;
                            dd0Var2.setItemCount(5);
                            dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(frameLayout, parentActivity);
                            frameLayout.P = li0Var;
                            li0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            li0Var.addView(frameLayout3, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.a2.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false), 1, 20.0f);
                            frameLayout3.addView(textView2, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new ai.h(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            li0Var.addView(linearLayout, w7.a6.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView22 = new TextView(parentActivity);
                            frameLayout.K = textView22;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.J = textView3;
                            linearLayout.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
                            dd0Var.setFormatter(new org.telegram.ui.Components.ji0(frameLayout, 0));
                            dd0Var.setMinValue(0);
                            dd0Var.setMaxValue(10);
                            dd0Var.setWrapSelectorWheel(false);
                            dd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(frameLayout, 1);
                            dd0Var.setOnValueChangedListener(ji0Var);
                            dd0Var2.setMinValue(0);
                            dd0Var2.setMaxValue(10);
                            dd0Var2.setWrapSelectorWheel(false);
                            dd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(dd0Var2, w7.a6.l(0.5f, 0, 270));
                            dd0Var2.setFormatter(new org.telegram.ui.Components.ji0(frameLayout, 2));
                            dd0Var2.setOnValueChangedListener(ji0Var);
                            dd0Var.setValue(0);
                            dd0Var2.setValue(6);
                            li0Var.addView(frameLayout4, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                            frameLayout4.addView((View) textView3, w7.a6.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.u10(8, frameLayout, l80Var));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18161q5, false));
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, w7.a6.c(48.0f, -1));
                            frameLayout2.addView(li0Var, w7.a6.e(-1, -2, 51));
                            id0Var.R = frameLayout;
                            ((FrameLayout) id0Var.fragmentView).addView((View) frameLayout, w7.a6.c(-1.0f, -1));
                            org.telegram.ui.Components.oi0 oi0Var = id0Var.R;
                            oi0Var.f25817r = false;
                            AnimatorSet animatorSet = oi0Var.f25818s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                oi0Var.f25818s = null;
                            }
                            org.telegram.ui.Components.ki0 ki0Var = oi0Var.v;
                            ki0Var.measure(View.MeasureSpec.makeMeasureSpec((oi0Var.f25820x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (oi0Var.f25817r) {
                                z14 = true;
                            } else {
                                ki0Var.setVisibility(0);
                                if (oi0Var.f25819w) {
                                    oi0Var.setLayerType(2, null);
                                }
                                ki0Var.setTranslationY(ki0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                oi0Var.f25818s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(ki0Var, View.TRANSLATION_Y, 0.0f));
                                oi0Var.f25818s.setDuration(400L);
                                oi0Var.f25818s.setStartDelay(20L);
                                oi0Var.f25818s.setInterpolator(oi0Var.F);
                                z14 = true;
                                oi0Var.f25818s.addListener(new org.telegram.ui.Components.ni0(oi0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                oi0Var.f25818s.start();
                            }
                            oi0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        id0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        if (DialogObject.isChatDialog(this.f33621e0)) {
            chat = getMessagesController().getChat(Long.valueOf(-this.f33621e0));
        } else {
            chat = null;
        }
        MessageObject messageObject3 = this.B0;
        if (messageObject3 != null && messageObject3.isLiveLocation() && !this.B0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f33621e0);
            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                this.f33618c.setImageResource(R.drawable.msg_location_alert2);
            } else {
                if (DialogObject.isUserDialog(this.f33621e0) && this.B0.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.f33618c.setVisibility(4);
                    this.f33618c.setAlpha(0.0f);
                    this.f33618c.setScaleX(0.4f);
                    this.f33618c.setScaleY(0.4f);
                }
                this.f33618c.setImageResource(R.drawable.msg_location_alert);
            }
        } else {
            this.f33618c.setVisibility(8);
            this.f33618c.setImageResource(R.drawable.msg_location_alert);
        }
        bi.x4 x4Var = new bi.x4(context, 1);
        this.f33646y = x4Var;
        x4Var.setLayerType(2, null);
        bi.x4 x4Var2 = this.f33646y;
        x4Var2.d = 4000L;
        x4Var2.l(1.0f, -25.0f);
        this.f33646y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.S.addView(this.f33646y, w7.a6.d(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33622f = linearLayout;
        linearLayout.setOrientation(1);
        this.f33622f.setGravity(1);
        this.f33622f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f33622f.setVisibility(8);
        gd0Var.addView(this.f33622f, w7.a6.c(-1.0f, -1));
        this.f33622f.setOnTouchListener(new ai.h(2));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.W5), mode));
        this.f33622f.addView(this.h, w7.a6.n(-2, -2));
        TextView textView2 = new TextView(context);
        this.f33630n = textView2;
        int i19 = org.telegram.ui.ActionBar.j6.X5;
        textView2.setTextColor(getThemedColor(i19));
        this.f33630n.setGravity(17);
        this.f33630n.setTypeface(AndroidUtilities.bold());
        this.f33630n.setTextSize(1, 17.0f);
        this.f33630n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView g10 = com.google.android.gms.internal.vision.e2.g(this.f33622f, this.f33630n, w7.a6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f33635r = g10;
        g10.setTextColor(getThemedColor(i19));
        this.f33635r.setGravity(17);
        this.f33635r.setTextSize(1, 15.0f);
        this.f33635r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f33622f.addView(this.f33635r, w7.a6.t(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.U = vl0Var;
        long j3 = this.f33621e0;
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        boolean z14 = this.E;
        if (i14 == 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        wc0 wc0Var2 = new wc0(this, context, this.G0, j3, resourceProvider, z14, z11);
        this.T = wc0Var2;
        vl0Var.setAdapter(wc0Var2);
        org.telegram.ui.Components.vl0 vl0Var2 = this.U;
        s4.c0 c0Var = new s4.c0(1, false);
        this.Y = c0Var;
        vl0Var2.setLayoutManager(c0Var);
        if (this.M0 != null) {
            this.L0 = new org.telegram.ui.Cells.u3(context, this.resourceProvider);
            yc0 yc0Var = new yc0(this, context, new org.telegram.ui.Components.av0(this), this, new xc0(this), getResourceProvider());
            this.K0 = yc0Var;
            yc0Var.setBackgroundColor(getThemedColor(i12));
            this.K0.addView(this.L0, w7.a6.e(-1, 32, 55));
            this.T.f8221h0 = this.K0;
            this.U.setOverScrollMode(2);
            s4.j jVar = new s4.j();
            z12 = false;
            jVar.f41645m = false;
            jVar.C = false;
            jVar.o(org.telegram.ui.Components.wr.h);
            jVar.n(350L);
            this.U.setItemAnimator(jVar);
        } else {
            z12 = false;
        }
        this.T.O(this.f33619c0, z12);
        this.T.getClass();
        this.U.setVerticalScrollBarEnabled(z12);
        gd0Var.addView(this.U, w7.a6.e(-1, -1, 51));
        MessageObject messageObject4 = this.B0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            wc0 wc0Var3 = this.T;
            wc0Var3.Q = this.B0.messageOwner.media.address;
            wc0Var3.Q();
        }
        this.U.setOnScrollListener(new zc0(this));
        ((s4.j) this.U.getItemAnimator()).C = false;
        this.U.setOnItemLongClickListener(new l80(7, this, context));
        this.U.setOnItemClickListener(new i(this, 16));
        wc0 wc0Var4 = this.T;
        long j10 = this.f33621e0;
        qc0 qc0Var = new qc0(this, 5);
        wc0Var4.H = j10;
        wc0Var4.f7967y = qc0Var;
        wc0Var4.P(this.H0);
        gd0Var.addView(this.S, w7.a6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.K = onCreateMapView;
        onCreateMapView.getView().setAlpha(0.0f);
        this.K.setOnDispatchTouchEventInterceptor(new qc0(this, 6));
        this.K.setOnInterceptTouchEventInterceptor(new qc0(this, 7));
        this.K.setOnLayoutListener(new sc0(this, 5));
        new Thread(new tc0(this, this.K, 1)).start();
        MessageObject messageObject5 = this.B0;
        if (messageObject5 == null && this.f33648z0 == null) {
            i10 = i14;
            if (chat != null && i10 == 4 && this.f33621e0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.S.addView(frameLayout, w7.a6.e(62, 76, 49));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                w9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                w9Var.e(chat, new org.telegram.ui.Components.g9(chat));
                frameLayout.addView(w9Var, w7.a6.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.X = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.X == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.S.addView(imageView4, w7.a6.e(28, 48, 49));
                this.X = imageView4;
            }
            org.telegram.ui.Components.vl0 vl0Var3 = new org.telegram.ui.Components.vl0(context, null);
            this.V = vl0Var3;
            vl0Var3.setVisibility(8);
            i11 = 0;
            this.V.setLayoutManager(new s4.c0(1, false));
            org.telegram.ui.ActionBar.f6 resourceProvider2 = getResourceProvider();
            if (i10 == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            bd0 bd0Var2 = new bd0(this, context, resourceProvider2, z13);
            this.W = bd0Var2;
            qc0 qc0Var2 = new qc0(this, 8);
            bd0Var2.H = 0L;
            bd0Var2.f7967y = qc0Var2;
            gd0Var.addView(this.V, w7.a6.e(-1, -1, 51));
            this.V.setOnScrollListener(new j3(this, 18));
            this.V.setOnItemClickListener(new ai.b0(17, this, n10));
        } else {
            i10 = i14;
            i11 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.f33648z0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.f33648z0;
                if (tL_channelLocation2 != null) {
                    this.T.X = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.B0;
                    if (messageObject6 != null) {
                        wc0 wc0Var5 = this.T;
                        wc0Var5.W = messageObject6;
                        wc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.B0;
        if (messageObject7 != null && i10 == 6) {
            wc0 wc0Var6 = this.T;
            wc0Var6.W = messageObject7;
            wc0Var6.l();
        }
        while (i11 < 2) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.F;
            undoViewArr[i11] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i11].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.S.addView(undoViewArr[i11], w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            i11++;
        }
        u7 u7Var = new u7(this, context, rect);
        this.v = u7Var;
        u7Var.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.S.addView(this.v, layoutParams2);
        if (this.B0 == null && this.f33648z0 == null && this.A0 != null) {
            this.C0 = true;
            ImageView imageView5 = this.f33614a;
            int i20 = org.telegram.ui.ActionBar.j6.ui;
            imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i20), PorterDuff.Mode.MULTIPLY));
            this.f33614a.setTag(Integer.valueOf(i20));
        }
        gd0Var.addView(this.actionBar);
        B0();
        return this.fragmentView;
    }

    public final boolean d0() {
        if (h0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new qc0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.f17528a);
                    return false;
                }
            } catch (Exception e) {
                FileLog.e(e);
                return true;
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        wc0 wc0Var;
        long dialogId;
        wc0 wc0Var2;
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.locationPermissionGranted) {
            this.f33619c0 = false;
            wc0 wc0Var3 = this.T;
            if (wc0Var3 != null) {
                wc0Var3.O(false, false);
            }
            IMapsProvider.IMap iMap = this.I;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.f33619c0 = true;
            wc0 wc0Var4 = this.T;
            if (wc0Var4 != null) {
                wc0Var4.O(true, false);
            }
        } else if (i10 == NotificationCenter.liveLocationsChanged) {
            wc0 wc0Var5 = this.T;
            if (wc0Var5 != null) {
                wc0Var5.l();
            }
            C0();
        } else if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.f33621e0 && this.B0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i12);
                    if (messageObject.isLiveLocation()) {
                        c0(messageObject.messageOwner);
                        z10 = true;
                    } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                        this.f33618c.setImageResource(R.drawable.msg_location_alert);
                        IMapsProvider.ICircle iCircle = this.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            this.O = null;
                        }
                    }
                }
                if (z10 && (wc0Var2 = this.T) != null) {
                    wc0Var2.N(this.f33624g0);
                }
            }
        } else if (i10 == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.f33621e0 && this.B0 != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(i13);
                    if (messageObject2.isLiveLocation()) {
                        TLRPC.Message message = messageObject2.messageOwner;
                        if (message.from_id != null) {
                            dialogId = MessageObject.getFromChatId(message);
                        } else {
                            dialogId = MessageObject.getDialogId(message);
                        }
                        cd0 cd0Var = (cd0) this.f33625h0.f(dialogId);
                        if (cd0Var != null) {
                            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                            if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                                TLRPC.Message message2 = messageObject2.messageOwner;
                                cd0Var.f31643b = message2;
                                TLRPC.GeoPoint geoPoint = message2.media.geo;
                                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                                cd0Var.e.setPosition(latLng);
                                if (this.f33626i0 == cd0Var.f31642a) {
                                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(cd0Var.e.getPosition()));
                                }
                                IMapsProvider.IMarker iMarker = cd0Var.f31645f;
                                if (iMarker != null) {
                                    iMarker.getPosition();
                                    cd0Var.f31645f.setPosition(latLng);
                                    int i14 = messageObject2.messageOwner.media.heading;
                                    if (i14 != 0) {
                                        cd0Var.f31645f.setRotation(i14);
                                        if (!cd0Var.f31646g) {
                                            cd0Var.f31645f.setIcon(R.drawable.map_pin_cone2);
                                            cd0Var.f31646g = true;
                                        }
                                    } else if (cd0Var.f31646g) {
                                        cd0Var.f31645f.setRotation(0);
                                        cd0Var.f31645f.setIcon(R.drawable.map_pin_circle);
                                        cd0Var.f31646g = false;
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                }
                if (z11 && (wc0Var = this.T) != null) {
                    wc0Var.l();
                    org.telegram.ui.Components.oi0 oi0Var = this.R;
                    if (oi0Var != null) {
                        oi0Var.c(true);
                    }
                }
                if (z11) {
                    C0();
                }
            }
        }
    }

    public final void e0(int i10) {
        if (this.I == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.f33643w0.getLatitude(), this.f33643w0.getLongitude()));
        onCreateCircleOptions.radius(i10);
        if (n0()) {
            onCreateCircleOptions.strokeColor(-1771658281);
            onCreateCircleOptions.fillColor(476488663);
        } else {
            onCreateCircleOptions.strokeColor(-1774024971);
            onCreateCircleOptions.fillColor(474121973);
        }
        onCreateCircleOptions.strokePattern(asList);
        onCreateCircleOptions.strokeWidth(2);
        this.O = this.I.addCircle(onCreateCircleOptions);
    }

    public final Bitmap f0(int i10) {
        Bitmap[] bitmapArr = this.Q0;
        Bitmap bitmap = bitmapArr[i10 % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.u4.a(i10));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return null;
        }
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        if (q0()) {
            return false;
        }
        return super.finishFragment(z10);
    }

    public final Bitmap g0(cd0 cd0Var) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                TLRPC.User user = cd0Var.f31644c;
                if (user != null) {
                    g9Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = cd0Var.d;
                    if (chat != null) {
                        g9Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                g9Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                g9Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = cd0Var.h;
                if (imageReceiver != null && imageReceiver.hasImageLoaded()) {
                    bitmap = cd0Var.h.getBitmap();
                } else {
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float dp = AndroidUtilities.dp(50.0f) / bitmap.getWidth();
                    matrix.postTranslate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                    matrix.postScale(dp, dp);
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f), paint);
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
                FileLog.e(th);
                return bitmap2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 21);
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.F;
            if (i10 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i10];
            int i11 = org.telegram.ui.ActionBar.j6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoView, 32, null, null, null, null, i11));
            int i12 = org.telegram.ui.ActionBar.j6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i12));
            int i13 = org.telegram.ui.ActionBar.j6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main", i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top", i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line", i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big", i13));
            arrayList.add(new org.telegram.ui.ActionBar.l6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small", i13));
            i10++;
        }
        View view = this.fragmentView;
        int i14 = org.telegram.ui.ActionBar.j6.f17998h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 32768, null, null, null, null, i14));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.j6.f18034j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 64, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.f33642w;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 16777216, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        ImageView imageView = this.h;
        int i16 = org.telegram.ui.ActionBar.j6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, null, null, i16));
        TextView textView = this.f33630n;
        int i17 = org.telegram.ui.ActionBar.j6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33635r, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        ImageView imageView2 = this.f33614a;
        int i18 = org.telegram.ui.ActionBar.j6.ui;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView2, 262152, null, null, null, null, i18));
        ImageView imageView3 = this.f33614a;
        int i19 = org.telegram.ui.ActionBar.j6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView3, 262152, null, null, null, null, i19));
        ImageView imageView4 = this.f33614a;
        int i20 = org.telegram.ui.ActionBar.j6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView4, 32, null, null, null, null, i20));
        ImageView imageView5 = this.f33614a;
        int i21 = org.telegram.ui.ActionBar.j6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView5, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, eVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33618c, 0, null, null, null, eVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33618c, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33618c, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f18174r0, eVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.si));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 393216, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 393216, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 393248, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 393248, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.pi));
        int i22 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 262144, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 262144, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 48, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18109n5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.x7.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.x7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f17999h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i17));
        return arrayList;
    }

    public boolean h0() {
        return this instanceof mn;
    }

    public final void i0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilder;
        if (this.f33623f0) {
            iLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
        } else {
            iLatLngBoundsBuilder = null;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
            int i11 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i12 = messageMedia.period;
            if (i11 + i12 > currentTime || i12 == Integer.MAX_VALUE) {
                if (iLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    iLatLngBoundsBuilder.include(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                }
                c0(message);
                if (this.f33618c.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.f33618c.setVisibility(0);
                    this.H = true;
                    this.f33618c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new org.telegram.ui.Components.voip.v2(this, 14)).start();
                }
            }
        }
        if (iLatLngBoundsBuilder != null) {
            if (this.f33623f0) {
                this.U.v0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.f33623f0 = false;
            this.T.N(this.f33624g0);
            if (this.B0.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = iLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng p02 = p0(center, 100.0d, 100.0d);
                    iLatLngBoundsBuilder.include(p0(center, -100.0d, -100.0d));
                    iLatLngBoundsBuilder.include(p02);
                    IMapsProvider.ILatLngBounds build = iLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, AndroidUtilities.dp(113.0f));
                            this.J = newCameraUpdateLatLngBounds;
                            this.I.moveCamera(newCameraUpdateLatLngBounds);
                            this.J = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        int i10;
        boolean z10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.I != null) {
            ArrayList arrayList = new ArrayList();
            if (getConnectionsManager() != null) {
                i10 = getConnectionsManager().getCurrentTime();
            } else {
                i10 = 0;
            }
            ArrayList arrayList2 = this.f33624g0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                cd0 cd0Var = (cd0) arrayList2.get(i12);
                IMapsProvider.IMarker iMarker = cd0Var.e;
                if (iMarker != null && (message = cd0Var.f31643b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            if (this.f33625h0.f(getUserConfig().getClientUserId()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Location location = this.f33643w0;
            if (location != null && !z10) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.f33643w0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
                    int i13 = 0;
                    double d12 = -1.7976931348623157E308d;
                    while (i13 < size2) {
                        IMapsProvider.LatLng latLng = (IMapsProvider.LatLng) arrayList.get(i13);
                        onCreateLatLngBoundsBuilder.include(latLng);
                        int i14 = size2;
                        double d13 = latLng.latitude;
                        if (d13 < d10) {
                            d10 = d13;
                        }
                        if (d13 > d) {
                            d = d13;
                        }
                        double d14 = latLng.longitude;
                        if (d14 < d11) {
                            d11 = d14;
                        }
                        if (d14 > d12) {
                            d12 = d14;
                        }
                        i13++;
                        size2 = i14;
                    }
                    IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng((d10 + d) / 2.0d, (d11 + d12) / 2.0d);
                    double radians = Math.toRadians(d12 - d11) * 6366198.0d * Math.cos(Math.toRadians(latLng2.latitude));
                    if (Math.toRadians(d - d10) * 6366198.0d < 30.0d || radians < 30.0d) {
                        onCreateLatLngBoundsBuilder.include(p0(latLng2, 15.0d, 15.0d));
                        onCreateLatLngBoundsBuilder.include(p0(latLng2, -15.0d, -15.0d));
                    }
                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(onCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f)), 500, null);
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            }
        }
        return false;
    }

    public final void k0(boolean z10) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        if (this.U != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                int i12 = this.G0;
                if (i12 == 6) {
                    this.H0 = org.telegram.messenger.a2.B(66.0f, measuredHeight, currentActionBarHeight);
                } else if (i12 == 2) {
                    this.H0 = org.telegram.messenger.a2.B(73.0f, measuredHeight, currentActionBarHeight);
                } else {
                    this.H0 = org.telegram.messenger.a2.B(66.0f, measuredHeight, currentActionBarHeight);
                }
                yc0 yc0Var = this.K0;
                if (yc0Var != null && yc0Var.c0(8) > 0) {
                    this.H0 -= AndroidUtilities.dp(200.0f);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.U.getLayoutParams();
                layoutParams2.topMargin = currentActionBarHeight;
                this.U.setLayoutParams(layoutParams2);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.S.getLayoutParams();
                layoutParams3.topMargin = currentActionBarHeight;
                layoutParams3.height = this.H0;
                this.S.setLayoutParams(layoutParams3);
                org.telegram.ui.Components.vl0 vl0Var = this.V;
                if (vl0Var != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) vl0Var.getLayoutParams();
                    layoutParams4.topMargin = currentActionBarHeight;
                    this.V.setLayoutParams(layoutParams4);
                }
                this.T.P(this.H0);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.K.getView().getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = AndroidUtilities.dp(10.0f) + this.H0;
                    IMapsProvider.IMap iMap = this.I;
                    if (iMap != null) {
                        iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                    }
                    this.K.getView().setLayoutParams(layoutParams5);
                }
                fd0 fd0Var = this.f33644x;
                if (fd0Var != null && (layoutParams = (FrameLayout.LayoutParams) fd0Var.getLayoutParams()) != null) {
                    layoutParams.height = AndroidUtilities.dp(10.0f) + this.H0;
                    this.f33644x.setLayoutParams(layoutParams);
                }
                this.T.l();
                if (z10) {
                    if (i12 == 3) {
                        i11 = 73;
                    } else if (i12 != 1 && i12 != 2) {
                        i11 = 0;
                    } else {
                        i11 = 66;
                    }
                    this.Y.h1(0, -AndroidUtilities.dp(i11));
                    A0(false);
                    this.U.post(new org.telegram.ui.Components.zd(this, i11, 16));
                    return;
                }
                A0(false);
            }
        }
    }

    public final boolean l0() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.f(this.B0.getDialogId());
        if (arrayList != null && arrayList.isEmpty()) {
            i0(arrayList);
        } else {
            arrayList = null;
        }
        if (DialogObject.isChatDialog(this.f33621e0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f33621e0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.B0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new org.telegram.messenger.p1(this, dialogId, 5));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView m0() {
        UndoView[] undoViewArr = this.F;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            this.S.removeView(undoViewArr[0]);
            this.S.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean n0() {
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.j6.I.q()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void o0() {
        SharedPreferences globalMainSettings;
        int i10;
        ImageView imageView = this.f33618c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.H && (i10 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) < 3) {
            globalMainSettings.edit().putInt("proximityhint", i10 + 1).commit();
            if (DialogObject.isUserDialog(this.f33621e0)) {
                this.f33646y.s(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.f33621e0)))));
            } else {
                this.f33646y.s(LocaleController.getString(R.string.ProximityTooltioGroup));
            }
            this.f33646y.u();
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.oi0 oi0Var = this.R;
        if (oi0Var != null) {
            if (z10) {
                oi0Var.a();
                return false;
            }
        } else {
            IMapsProvider.IMapView iMapView = this.K;
            if (iMapView != null && iMapView.getGlSurfaceView() != null && !this.M) {
                if (z10) {
                    q0();
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        MessageObject messageObject = this.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
            getNotificationCenter().addObserver(this, NotificationCenter.replaceMessagesObjects);
            return true;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.replaceMessagesObjects);
        try {
            IMapsProvider.IMap iMap = this.I;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            IMapsProvider.IMapView iMapView = this.K;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        wc0 wc0Var = this.T;
        if (wc0Var != null) {
            wc0Var.F();
        }
        bd0 bd0Var = this.W;
        if (bd0Var != null) {
            bd0Var.F();
        }
        sc0 sc0Var = this.J0;
        if (sc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sc0Var);
            this.J0 = null;
        }
        ArrayList arrayList = this.f33624g0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            cd0 cd0Var = (cd0) arrayList.get(i10);
            ImageReceiver imageReceiver = cd0Var.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                cd0Var.h = null;
            }
        }
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f33640u0) {
            iMapView.onLowMemory();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f33640u0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f33641v0 = false;
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 30) {
            s0(false);
        }
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f33640u0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f33641v0 = true;
        IMapsProvider.IMap iMap = this.I;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        k0(true);
        if (h0()) {
            this.f33633p0 = false;
        } else if (this.f33633p0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.f33633p0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        sc0 sc0Var = this.J0;
        if (sc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sc0Var);
            AndroidUtilities.runOnUIThread(this.J0, 5000L);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            try {
                if (this.K.getView().getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.K.getView().getParent()).removeView(this.K.getView());
                }
            } catch (Exception unused) {
            }
            k0 k0Var = this.S;
            if (k0Var != null) {
                k0Var.addView(this.K.getView(), 0, w7.a6.e(-1, AndroidUtilities.dp(10.0f) + this.H0, 51));
                fd0 fd0Var = this.f33644x;
                if (fd0Var != null) {
                    try {
                        if (fd0Var.getParent() instanceof ViewGroup) {
                            ((ViewGroup) this.f33644x.getParent()).removeView(this.f33644x);
                        }
                    } catch (Exception unused2) {
                    }
                    this.S.addView(this.f33644x, 1, w7.a6.e(-1, AndroidUtilities.dp(10.0f) + this.H0, 51));
                }
                A0(false);
                o0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.K.getView(), 0, w7.a6.e(-1, -1, 51));
            }
        }
    }

    public final boolean q0() {
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && iMapView.getGlSurfaceView() != null && !this.M) {
            GLSurfaceView glSurfaceView = this.K.getGlSurfaceView();
            glSurfaceView.queueEvent(new h90(11, this, glSurfaceView));
            return true;
        }
        return false;
    }

    public final void r0(cd0 cd0Var) {
        double d;
        double d10;
        String str;
        TLRPC.Message message;
        if (cd0Var != null && (message = cd0Var.f31643b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d10 = geoPoint._long;
        } else {
            MessageObject messageObject = this.B0;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.f33648z0.geo_point;
                d = geoPoint3.lat;
                d10 = geoPoint3._long;
            }
        }
        if (BuildVars.isHuaweiStoreApp()) {
            str = "mapapp://navigation";
        } else {
            str = "http://maps.google.com/maps";
        }
        if (this.f33643w0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f33643w0.getLatitude()), Double.valueOf(this.f33643w0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void s0(final boolean z10) {
        final TLRPC.User user;
        Activity parentActivity;
        if (this.F0 != null && !h0() && getParentActivity() != null && this.f33643w0 != null && d0()) {
            if (this.f33634q0 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f33634q0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    org.telegram.ui.Components.d5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new oc0(this, z10, 1), null).o();
                    return;
                }
            }
            if (DialogObject.isUserDialog(this.f33621e0)) {
                user = getMessagesController().getUser(Long.valueOf(this.f33621e0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.d5.E(getParentActivity(), z10, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    id0.V(id0.this, z10, user, i10);
                }
            }, null));
        }
    }

    public final void t0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.f33643w0 = new Location(location);
        cd0 cd0Var = (cd0) this.f33625h0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f33621e0);
        if (cd0Var != null && sharingLocationInfo != null && cd0Var.f31643b.f17216id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            cd0Var.e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = cd0Var.f31645f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.f33626i0 == cd0Var.f31642a) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(cd0Var.e.getPosition()));
            }
        }
        if (this.B0 == null && this.f33648z0 == null && this.I != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            wc0 wc0Var = this.T;
            if (wc0Var != null) {
                if (!this.D0 && (i10 = this.G0) != 4 && i10 != 8) {
                    wc0Var.H(null, this.f33643w0, true);
                }
                this.T.M(this.f33643w0);
            }
            if (!this.C0) {
                this.f33645x0 = new Location(location);
                if (this.E0) {
                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.E0 = true;
                    this.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.I.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.T.M(this.f33643w0);
        }
        org.telegram.ui.Components.oi0 oi0Var = this.R;
        if (oi0Var != null) {
            oi0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.O;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.f33643w0.getLatitude(), this.f33643w0.getLongitude()));
        }
        C0();
    }

    public final void u0(MessageObject messageObject) {
        this.B0 = messageObject;
        this.f33621e0 = messageObject.getDialogId();
    }

    public final void v0(cd0 cd0Var) {
        if (cd0Var.h == null) {
            TLRPC.User user = cd0Var.f31644c;
            TLRPC.Chat chat = cd0Var.d;
            if (user == null && chat == 0) {
                return;
            }
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
            if (user != null) {
                g9Var.m(this.currentAccount, user);
            } else {
                g9Var.k(this.currentAccount, chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.setCurrentAccount(this.currentAccount);
            imageReceiver.setDelegate(new l80(8, this, cd0Var));
            imageReceiver.onAttachedToWindow();
            if (user == null) {
                user = chat;
            }
            imageReceiver.setForUserOrChat(user, g9Var);
            cd0Var.h = imageReceiver;
        }
    }

    public final void w0(int i10, TLRPC.User user, int i11) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.f33643w0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.f33643w0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.f33643w0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.F0.b(tL_messageMediaGeoLive, this.G0, true, 0, 0L);
        if (i11 > 0) {
            this.R.L = true;
            this.f33618c.setImageResource(R.drawable.msg_location_alert2);
            org.telegram.ui.Components.oi0 oi0Var = this.R;
            if (oi0Var != null) {
                oi0Var.a();
            }
            m0().k(0L, 24, Integer.valueOf(i11), user, null, null);
            return;
        }
        finishFragment();
    }

    public final void x0() {
        if (this.T.h() != 0 && this.Y.L0() == 0) {
            View childAt = this.U.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                this.U.v0(0, top, null);
            }
        }
    }

    public final void y0(boolean z10) {
        Integer num;
        float f7;
        org.telegram.ui.Components.jl jlVar;
        Location location;
        Location location2;
        if (this.G0 == 3) {
            z10 = true;
        }
        if (z10 && (jlVar = this.e) != null && jlVar.getTag() == null && ((location = this.f33643w0) == null || (location2 = this.f33645x0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        org.telegram.ui.Components.jl jlVar2 = this.e;
        if (jlVar2 != null) {
            if (!z10 || jlVar2.getTag() == null) {
                if (z10 || this.e.getTag() != null) {
                    org.telegram.ui.Components.jl jlVar3 = this.e;
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    jlVar3.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    org.telegram.ui.Components.jl jlVar4 = this.e;
                    Property property = View.TRANSLATION_X;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(jlVar4, property, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.wr.f28820g);
                    animatorSet.start();
                }
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        float f7;
        float f10;
        Boolean bool = this.P0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.P0 = Boolean.valueOf(z10);
        float f11 = 0.0f;
        int i10 = 0;
        float f12 = 0.7f;
        if (!z11) {
            TextView textView = this.f33616b;
            if (!z10) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            TextView textView2 = this.f33616b;
            if (z10) {
                f11 = 1.0f;
            }
            textView2.setAlpha(f11);
            TextView textView3 = this.f33616b;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            textView3.setScaleX(f10);
            TextView textView4 = this.f33616b;
            if (z10) {
                f12 = 1.0f;
            }
            textView4.setScaleY(f12);
            return;
        }
        this.f33616b.setVisibility(0);
        ViewPropertyAnimator animate = this.f33616b.animate();
        if (z10) {
            f11 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f11);
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.7f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f7);
        if (z10) {
            f12 = 1.0f;
        }
        scaleX.scaleY(f12).setInterpolator(org.telegram.ui.Components.wr.h).setDuration(420L).withEndAction(new oc0(this, z10, 0)).start();
    }
}
