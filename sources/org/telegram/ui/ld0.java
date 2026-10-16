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
import android.text.SpannableStringBuilder;
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
public class ld0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_channelLocation A0;
    public MessageObject B0;
    public boolean C0;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public final UndoView[] F;
    public gd0 F0;
    public boolean G;
    public final int G0;
    public boolean H;
    public int H0;
    public IMapsProvider.IMap I;
    public dd0 I0;
    public IMapsProvider.ICameraUpdate J;
    public vc0 J0;
    public IMapsProvider.IMapView K;
    public bd0 K0;
    public IMapsProvider.ICameraUpdate L;
    public org.telegram.ui.Cells.v3 L0;
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
    public org.telegram.ui.Components.fj0 R;
    public l0 S;
    public zc0 T;
    public org.telegram.ui.Components.mm0 U;
    public org.telegram.ui.Components.mm0 V;
    public ed0 W;
    public View X;
    public s4.b0 Y;
    public org.telegram.ui.ActionBar.u0 Z;
    public ImageView f37683a;
    public boolean f37684a0;
    public TextView f37685b;
    public boolean f37686b0;
    public ImageView f37687c;
    public boolean f37688c0;
    public org.telegram.ui.ActionBar.u0 d;
    public boolean f37689d0;
    public org.telegram.ui.Components.rl e;
    public long f37690e0;
    public LinearLayout f37691f;
    public boolean f37692f0;
    public final ArrayList f37693g0;
    public ImageView h;
    public final a0.h f37694h0;
    public long f37695i0;
    public boolean f37696j0;
    public final ArrayList f37697k0;
    public AnimatorSet f37698l0;
    public IMapsProvider.IMarker m0;
    public TextView f37699n;
    public kd0 f37700n0;
    public FrameLayout f37701o0;
    public boolean f37702p0;
    public boolean f37703q0;
    public TextView f37704r;
    public boolean f37705r0;
    public Drawable f37706s;
    public boolean f37707s0;
    public boolean f37708t0;
    public boolean f37709u0;
    public bi.d4 v;
    public boolean f37710v0;
    public org.telegram.ui.ActionBar.u0 f37711w;
    public Location f37712w0;
    public id0 f37713x;
    public Location f37714x0;
    public di.d4 f37715y;
    public int f37716y0;
    public TLRPC.TL_channelLocation f37717z0;

    public ld0(int i10) {
        super(null);
        this.F = new UndoView[2];
        this.f37686b0 = true;
        this.f37688c0 = false;
        this.f37689d0 = true;
        this.f37692f0 = true;
        this.f37693g0 = new ArrayList();
        this.f37694h0 = new a0.h();
        this.f37695i0 = -1L;
        this.f37697k0 = new ArrayList();
        this.f37702p0 = true;
        this.f37703q0 = true;
        this.H0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.O0 = true;
        this.Q0 = new Bitmap[7];
        this.G0 = i10;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static void U(ld0 ld0Var, boolean z10, TLRPC.User user, int i10) {
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z10) {
            LocationController.SharingLocationInfo sharingLocationInfo = ld0Var.getLocationController().getSharingLocationInfo(ld0Var.f37690e0);
            if (sharingLocationInfo != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = ld0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
                tL_messages_editMessage.f18999id = sharingLocationInfo.mid;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location lastKnownLocation = LocationController.getInstance(ld0Var.currentAccount).getLastKnownLocation();
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
                    ld0Var.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
                }
                ld0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
                return;
            }
            return;
        }
        ld0Var.v0(i10, user, 0);
    }

    public static void V(ld0 ld0Var) {
        vc0 vc0Var;
        ld0Var.getLocationController().markLiveLoactionsAsRead(ld0Var.f37690e0);
        if (!ld0Var.isPaused && (vc0Var = ld0Var.J0) != null) {
            AndroidUtilities.runOnUIThread(vc0Var, 5000L);
        }
    }

    public static IMapsProvider.LatLng o0(IMapsProvider.LatLng latLng, double d, double d10) {
        double degrees = Math.toDegrees(d10 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final void A0() {
        if (this.f37705r0) {
            if (this.f37708t0) {
                this.V.setEmptyView(null);
                this.f37691f.setVisibility(8);
                this.V.setVisibility(8);
                return;
            }
            this.V.setEmptyView(this.f37691f);
            return;
        }
        this.f37691f.setVisibility(8);
    }

    public final void B0() {
        int i10;
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.f37685b == null) {
            return;
        }
        boolean z11 = false;
        if (this.f37696j0) {
            y0(false, true);
            i0();
            return;
        }
        if (getConnectionsManager() != null) {
            i10 = getConnectionsManager().getCurrentTime();
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.f37693g0;
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.Message message = ((fd0) arrayList.get(i13)).f35509b;
            if (message != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                i12++;
            }
        }
        if (this.f37694h0.f(getUserConfig().getClientUserId()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f37712w0 != null && !z10) {
            i12++;
        }
        if (i12 >= 2) {
            z11 = true;
        }
        y0(z11, true);
    }

    public final fd0 b0(TLRPC.Message message) {
        fd0 fd0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.h hVar = this.f37694h0;
        fd0 fd0Var2 = (fd0) hVar.f(fromChatId);
        if (fd0Var2 == null) {
            ?? obj = new Object();
            obj.f35509b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f35510c = getMessagesController().getUser(Long.valueOf(obj.f35509b.from_id.user_id));
                obj.f35508a = obj.f35509b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    obj.f35510c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    obj.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                obj.f35508a = dialogId;
            }
            u0(obj);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap f02 = f0(obj);
                fd0Var = obj;
                if (f02 != null) {
                    position.icon(f02);
                    position.anchor(0.5f, 0.907f);
                    obj.e = this.I.addMarker(position);
                    if (!UserObject.isUserSelf(obj.f35510c)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.I.addMarker(flat);
                        obj.f35511f = addMarker;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            addMarker.setRotation(i10);
                            obj.f35511f.setIcon(R.drawable.map_pin_cone2);
                            obj.f35512g = true;
                        } else {
                            addMarker.setRotation(0);
                            obj.f35511f.setIcon(R.drawable.map_pin_circle);
                            obj.f35512g = false;
                        }
                    }
                    this.f37693g0.add(obj);
                    hVar.k(obj, obj.f35508a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f37690e0);
                    int i11 = (obj.f35508a > getUserConfig().getClientUserId() ? 1 : (obj.f35508a == getUserConfig().getClientUserId() ? 0 : -1));
                    fd0Var = obj;
                    fd0Var = obj;
                    if (i11 == 0 && sharingLocationInfo != null) {
                        int i12 = obj.f35509b.f18937id;
                        fd0Var = obj;
                        if (i12 == sharingLocationInfo.mid) {
                            Location location = this.f37712w0;
                            fd0Var = obj;
                            if (location != null) {
                                obj.e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.f37712w0.getLongitude()));
                                fd0Var = obj;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                fd0Var = obj;
            }
        } else {
            fd0Var2.f35509b = message;
            fd0Var2.e.setPosition(latLng);
            int i13 = (this.f37695i0 > fd0Var2.f35508a ? 1 : (this.f37695i0 == fd0Var2.f35508a ? 0 : -1));
            fd0Var = fd0Var2;
            if (i13 == 0) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(fd0Var2.e.getPosition()));
                fd0Var = fd0Var2;
            }
        }
        org.telegram.ui.Components.fj0 fj0Var = this.R;
        if (fj0Var != null) {
            fj0Var.c(true);
        }
        B0();
        return fd0Var;
    }

    public final boolean c0() {
        if (g0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                    alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new tc0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.f19248a);
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
        this.f37707s0 = false;
        this.f37705r0 = false;
        this.f37708t0 = false;
        zc0 zc0Var = this.T;
        if (zc0Var != null) {
            zc0Var.F();
        }
        ed0 ed0Var = this.W;
        if (ed0Var != null) {
            ed0Var.F();
        }
        if (this.f37717z0 != null) {
            Location location = new Location("network");
            this.f37714x0 = location;
            location.setLatitude(this.f37717z0.geo_point.lat);
            this.f37714x0.setLongitude(this.f37717z0.geo_point._long);
        } else if (this.B0 != null) {
            Location location2 = new Location("network");
            this.f37714x0 = location2;
            location2.setLatitude(this.B0.messageOwner.media.geo.lat);
            this.f37714x0.setLongitude(this.B0.messageOwner.media.geo._long);
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37688c0 = z10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.f19672h5;
        kVar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.g6.f19707j5;
        kVar2.setTitleColor(getThemedColor(i13));
        this.actionBar.D(getThemedColor(i13), false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.I5), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new yc0(this));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        TLRPC.TL_channelLocation tL_channelLocation = this.f37717z0;
        int i14 = this.G0;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.B0;
            if (messageObject != null) {
                if (messageObject.isLiveLocation()) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                    org.telegram.ui.ActionBar.u0 c10 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
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
                        org.telegram.ui.ActionBar.u0 c11 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                        this.Z = c11;
                        c11.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                        if (!getLocationController().isSharingLocation(this.f37690e0) && this.O0) {
                            this.Z.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                        }
                        this.Z.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                    }
                }
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i14 != 4) {
                    this.f37713x = new id0(this, context);
                    org.telegram.ui.ActionBar.u0 c12 = n10.c(0, R.drawable.outline_header_search, getResourceProvider());
                    c12.F();
                    c12.H = new ig.d2(this, 12);
                    this.f37711w = c12;
                    c12.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.f37711w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.f37711w.getSearchField();
                    searchField.setTextColor(getThemedColor(i13));
                    searchField.setCursorColor(getThemedColor(i13));
                    searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Vd));
                }
            }
        }
        jd0 jd0Var = new jd0(this, context);
        this.fragmentView = jd0Var;
        jd0Var.setBackgroundColor(getThemedColor(i12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f37706s = mutate;
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.f37706s.getPadding(rect);
        if (i14 != 0 && i14 != 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top);
        }
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        layoutParams2.gravity = 83;
        l0 l0Var = new l0(this, context, 11);
        this.S = l0Var;
        l0Var.setBackgroundDrawable(new org.telegram.ui.Components.gd(m0()));
        MessageObject messageObject2 = this.B0;
        if ((messageObject2 == null && (i14 == 0 || i14 == 1)) || (messageObject2 != null && i14 == 3)) {
            org.telegram.ui.Components.rl rlVar = new org.telegram.ui.Components.rl(context, 1);
            this.e = rlVar;
            rlVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int dp = AndroidUtilities.dp(40.0f);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.wi);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.xi);
            org.telegram.ui.Cells.z j02 = org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3);
            w7.b6.a(this.e);
            this.e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.e.setOutlineProvider(zf.j0.f50193b);
            this.e.setBackgroundDrawable(j02);
            this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.vi));
            this.e.setTextSize(1, 14.0f);
            this.e.setTypeface(AndroidUtilities.bold());
            this.e.setGravity(17);
            this.e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.S.addView(this.e, w7.z5.a(40.0f, 80.0f, 12.0f, 80.0f, 0.0f, -2, 49));
            if (i14 == 3) {
                this.e.setText(LocaleController.getString(R.string.OpenInMaps));
                this.e.setOnClickListener(new View.OnClickListener(this) {
                    public final ld0 f39757b;

                    {
                        this.f39757b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        IMapsProvider.IMap iMap;
                        TLRPC.User user;
                        boolean z14;
                        int i15 = r2;
                        ld0 ld0Var = this.f39757b;
                        switch (i15) {
                            case 0:
                                ld0Var.x0(false);
                                ld0Var.T.H(null, ld0Var.f37714x0, true);
                                ld0Var.D0 = true;
                                ld0Var.w0();
                                return;
                            case 1:
                                ld0Var.d.M(null, null);
                                return;
                            case 2:
                                int i16 = ld0Var.G0;
                                Activity parentActivity = ld0Var.getParentActivity();
                                if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                    if (ld0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ld0Var.getParentActivity());
                                        alertDialog$Builder.m(R.raw.permission_request_location, 72, ld0Var.getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                                        a2Var.T = replaceTags;
                                        alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new tc0(ld0Var, 1));
                                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                        ld0Var.showDialog(a2Var);
                                        return;
                                    }
                                    return;
                                } else if (ld0Var.c0() || i16 == 3) {
                                    if ((ld0Var.B0 != null && i16 != 3) || ld0Var.f37717z0 != null) {
                                        if (ld0Var.f37712w0 != null && (iMap = ld0Var.I) != null) {
                                            iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(ld0Var.f37712w0.getLatitude(), ld0Var.f37712w0.getLongitude()), ld0Var.I.getMaxZoomLevel() - 4.0f));
                                        }
                                    } else if (ld0Var.f37712w0 != null && ld0Var.I != null) {
                                        ImageView imageView = ld0Var.f37683a;
                                        int i17 = org.telegram.ui.ActionBar.g6.vi;
                                        imageView.setColorFilter(new PorterDuffColorFilter(ld0Var.getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
                                        ld0Var.f37683a.setTag(Integer.valueOf(i17));
                                        ld0Var.T.L(null);
                                        ld0Var.C0 = false;
                                        ld0Var.x0(false);
                                        ld0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(ld0Var.f37712w0.getLatitude(), ld0Var.f37712w0.getLongitude())));
                                        if (ld0Var.D0 && i16 != 8) {
                                            Location location3 = ld0Var.f37712w0;
                                            if (location3 != null) {
                                                ld0Var.T.H(null, location3, true);
                                            }
                                            ld0Var.D0 = false;
                                            ld0Var.w0();
                                        }
                                    }
                                    if (ld0Var.m0 != null) {
                                        ld0Var.X.setVisibility(0);
                                        id0 id0Var = ld0Var.f37713x;
                                        IMapsProvider.IMarker iMarker = ld0Var.m0;
                                        HashMap hashMap = id0Var.f36786a;
                                        View view2 = (View) hashMap.get(iMarker);
                                        if (view2 != null) {
                                            id0Var.removeView(view2);
                                            hashMap.remove(iMarker);
                                        }
                                        ld0Var.m0 = null;
                                        ld0Var.f37700n0 = null;
                                        ld0Var.f37701o0 = null;
                                        return;
                                    }
                                    return;
                                } else {
                                    return;
                                }
                            case 3:
                                ld0Var.f37695i0 = -1L;
                                ld0Var.C0 = true;
                                if (ld0Var.i0()) {
                                    ld0Var.f37696j0 = true;
                                    ld0Var.y0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (ld0Var.getParentActivity() != null && ld0Var.f37712w0 != null && ld0Var.c0() && ld0Var.I != null) {
                                    di.d4 d4Var = ld0Var.f37715y;
                                    if (d4Var != null) {
                                        d4Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = ld0Var.getLocationController().getSharingLocationInfo(ld0Var.f37690e0);
                                    if (ld0Var.G) {
                                        ld0Var.F[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        ld0Var.f37687c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = ld0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            ld0Var.O = null;
                                        }
                                        ld0Var.G = true;
                                        ld0Var.l0().k(0L, 25, 0, null, new vc0(ld0Var, 1), new d20(26, ld0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = ld0Var.O;
                                    if (iCircle2 == null) {
                                        ld0Var.d0(500);
                                    } else {
                                        ld0Var.P = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(ld0Var.f37690e0)) {
                                        user = ld0Var.getMessagesController().getUser(Long.valueOf(ld0Var.f37690e0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity2 = ld0Var.getParentActivity();
                                    tc0 tc0Var = new tc0(ld0Var, 3);
                                    qw qwVar = new qw(17, ld0Var, user);
                                    vc0 vc0Var = new vc0(ld0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity2);
                                    frameLayout.f24760a = null;
                                    frameLayout.d = -1;
                                    frameLayout.e = false;
                                    frameLayout.f24763f = false;
                                    frameLayout.h = null;
                                    frameLayout.f24764n = new Rect();
                                    new Paint();
                                    frameLayout.f24767w = true;
                                    frameLayout.F = org.telegram.ui.Components.es.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.Q = vc0Var;
                                    frameLayout.f24769y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false), PorterDuff.Mode.MULTIPLY));
                                    mutate2.getPadding(rect2);
                                    int i18 = rect2.left;
                                    frameLayout.f24768x = i18;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i18, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i18, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, w7.z5.e(-1, -2, 80));
                                    frameLayout.O = LocaleController.getUseImperialSystemType();
                                    frameLayout.M = user;
                                    frameLayout.I = tc0Var;
                                    org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, null);
                                    frameLayout.G = ud0Var;
                                    ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    ud0Var.setItemCount(5);
                                    org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, null);
                                    frameLayout.H = ud0Var2;
                                    ud0Var2.setItemCount(5);
                                    ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(frameLayout, parentActivity2);
                                    frameLayout.P = cj0Var;
                                    cj0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                                    cj0Var.addView(frameLayout3, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity2);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false), 1, textView);
                                    frameLayout3.addView(textView, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                                    textView.setOnTouchListener(new ci.d(20));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    cj0Var.addView(linearLayout, w7.z5.n(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                                    TextView textView2 = new TextView(parentActivity2);
                                    frameLayout.K = textView2;
                                    ?? textView3 = new TextView(parentActivity2);
                                    frameLayout.J = textView3;
                                    linearLayout.addView(ud0Var, w7.z5.l(0.5f, 0, 270));
                                    ud0Var.setFormatter(new org.telegram.ui.Components.aj0(frameLayout, 0));
                                    ud0Var.setMinValue(0);
                                    ud0Var.setMaxValue(10);
                                    ud0Var.setWrapSelectorWheel(false);
                                    ud0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(frameLayout, 1);
                                    ud0Var.setOnValueChangedListener(aj0Var);
                                    ud0Var2.setMinValue(0);
                                    ud0Var2.setMaxValue(10);
                                    ud0Var2.setWrapSelectorWheel(false);
                                    ud0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(ud0Var2, w7.z5.l(0.5f, 0, 270));
                                    ud0Var2.setFormatter(new org.telegram.ui.Components.aj0(frameLayout, 2));
                                    ud0Var2.setOnValueChangedListener(aj0Var);
                                    ud0Var.setValue(0);
                                    ud0Var2.setValue(6);
                                    cj0Var.addView(frameLayout4, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                    frameLayout4.addView((View) textView3, w7.z5.d(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.rt(11, frameLayout, qwVar));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19838q5, false));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, w7.z5.d(48.0f, -1));
                                    frameLayout2.addView(cj0Var, w7.z5.e(-1, -2, 51));
                                    ld0Var.R = frameLayout;
                                    ((FrameLayout) ld0Var.fragmentView).addView((View) frameLayout, w7.z5.d(-1.0f, -1));
                                    org.telegram.ui.Components.fj0 fj0Var = ld0Var.R;
                                    fj0Var.f24765r = false;
                                    AnimatorSet animatorSet = fj0Var.f24766s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        fj0Var.f24766s = null;
                                    }
                                    org.telegram.ui.Components.bj0 bj0Var = fj0Var.v;
                                    bj0Var.measure(View.MeasureSpec.makeMeasureSpec((fj0Var.f24768x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (fj0Var.f24765r) {
                                        z14 = true;
                                    } else {
                                        bj0Var.setVisibility(0);
                                        if (fj0Var.f24767w) {
                                            fj0Var.setLayerType(2, null);
                                        }
                                        bj0Var.setTranslationY(bj0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        fj0Var.f24766s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(bj0Var, View.TRANSLATION_Y, 0.0f));
                                        fj0Var.f24766s.setDuration(400L);
                                        fj0Var.f24766s.setStartDelay(20L);
                                        fj0Var.f24766s.setInterpolator(fj0Var.F);
                                        z14 = true;
                                        fj0Var.f24766s.addListener(new org.telegram.ui.Components.ej0(fj0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        fj0Var.f24766s.start();
                                    }
                                    fj0Var.c(z14);
                                    return;
                                }
                                return;
                            default:
                                ld0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = ld0Var.B0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    ld0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
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
                    public final ld0 f39757b;

                    {
                        this.f39757b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        IMapsProvider.IMap iMap;
                        TLRPC.User user;
                        boolean z14;
                        int i15 = r2;
                        ld0 ld0Var = this.f39757b;
                        switch (i15) {
                            case 0:
                                ld0Var.x0(false);
                                ld0Var.T.H(null, ld0Var.f37714x0, true);
                                ld0Var.D0 = true;
                                ld0Var.w0();
                                return;
                            case 1:
                                ld0Var.d.M(null, null);
                                return;
                            case 2:
                                int i16 = ld0Var.G0;
                                Activity parentActivity = ld0Var.getParentActivity();
                                if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                    if (ld0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ld0Var.getParentActivity());
                                        alertDialog$Builder.m(R.raw.permission_request_location, 72, ld0Var.getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                                        a2Var.T = replaceTags;
                                        alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new tc0(ld0Var, 1));
                                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                        ld0Var.showDialog(a2Var);
                                        return;
                                    }
                                    return;
                                } else if (ld0Var.c0() || i16 == 3) {
                                    if ((ld0Var.B0 != null && i16 != 3) || ld0Var.f37717z0 != null) {
                                        if (ld0Var.f37712w0 != null && (iMap = ld0Var.I) != null) {
                                            iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(ld0Var.f37712w0.getLatitude(), ld0Var.f37712w0.getLongitude()), ld0Var.I.getMaxZoomLevel() - 4.0f));
                                        }
                                    } else if (ld0Var.f37712w0 != null && ld0Var.I != null) {
                                        ImageView imageView = ld0Var.f37683a;
                                        int i17 = org.telegram.ui.ActionBar.g6.vi;
                                        imageView.setColorFilter(new PorterDuffColorFilter(ld0Var.getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
                                        ld0Var.f37683a.setTag(Integer.valueOf(i17));
                                        ld0Var.T.L(null);
                                        ld0Var.C0 = false;
                                        ld0Var.x0(false);
                                        ld0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(ld0Var.f37712w0.getLatitude(), ld0Var.f37712w0.getLongitude())));
                                        if (ld0Var.D0 && i16 != 8) {
                                            Location location3 = ld0Var.f37712w0;
                                            if (location3 != null) {
                                                ld0Var.T.H(null, location3, true);
                                            }
                                            ld0Var.D0 = false;
                                            ld0Var.w0();
                                        }
                                    }
                                    if (ld0Var.m0 != null) {
                                        ld0Var.X.setVisibility(0);
                                        id0 id0Var = ld0Var.f37713x;
                                        IMapsProvider.IMarker iMarker = ld0Var.m0;
                                        HashMap hashMap = id0Var.f36786a;
                                        View view2 = (View) hashMap.get(iMarker);
                                        if (view2 != null) {
                                            id0Var.removeView(view2);
                                            hashMap.remove(iMarker);
                                        }
                                        ld0Var.m0 = null;
                                        ld0Var.f37700n0 = null;
                                        ld0Var.f37701o0 = null;
                                        return;
                                    }
                                    return;
                                } else {
                                    return;
                                }
                            case 3:
                                ld0Var.f37695i0 = -1L;
                                ld0Var.C0 = true;
                                if (ld0Var.i0()) {
                                    ld0Var.f37696j0 = true;
                                    ld0Var.y0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (ld0Var.getParentActivity() != null && ld0Var.f37712w0 != null && ld0Var.c0() && ld0Var.I != null) {
                                    di.d4 d4Var = ld0Var.f37715y;
                                    if (d4Var != null) {
                                        d4Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = ld0Var.getLocationController().getSharingLocationInfo(ld0Var.f37690e0);
                                    if (ld0Var.G) {
                                        ld0Var.F[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        ld0Var.f37687c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = ld0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            ld0Var.O = null;
                                        }
                                        ld0Var.G = true;
                                        ld0Var.l0().k(0L, 25, 0, null, new vc0(ld0Var, 1), new d20(26, ld0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = ld0Var.O;
                                    if (iCircle2 == null) {
                                        ld0Var.d0(500);
                                    } else {
                                        ld0Var.P = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(ld0Var.f37690e0)) {
                                        user = ld0Var.getMessagesController().getUser(Long.valueOf(ld0Var.f37690e0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity2 = ld0Var.getParentActivity();
                                    tc0 tc0Var = new tc0(ld0Var, 3);
                                    qw qwVar = new qw(17, ld0Var, user);
                                    vc0 vc0Var = new vc0(ld0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity2);
                                    frameLayout.f24760a = null;
                                    frameLayout.d = -1;
                                    frameLayout.e = false;
                                    frameLayout.f24763f = false;
                                    frameLayout.h = null;
                                    frameLayout.f24764n = new Rect();
                                    new Paint();
                                    frameLayout.f24767w = true;
                                    frameLayout.F = org.telegram.ui.Components.es.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.Q = vc0Var;
                                    frameLayout.f24769y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false), PorterDuff.Mode.MULTIPLY));
                                    mutate2.getPadding(rect2);
                                    int i18 = rect2.left;
                                    frameLayout.f24768x = i18;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i18, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i18, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, w7.z5.e(-1, -2, 80));
                                    frameLayout.O = LocaleController.getUseImperialSystemType();
                                    frameLayout.M = user;
                                    frameLayout.I = tc0Var;
                                    org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, null);
                                    frameLayout.G = ud0Var;
                                    ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    ud0Var.setItemCount(5);
                                    org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, null);
                                    frameLayout.H = ud0Var2;
                                    ud0Var2.setItemCount(5);
                                    ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(frameLayout, parentActivity2);
                                    frameLayout.P = cj0Var;
                                    cj0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                                    cj0Var.addView(frameLayout3, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity2);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false), 1, textView);
                                    frameLayout3.addView(textView, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                                    textView.setOnTouchListener(new ci.d(20));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    cj0Var.addView(linearLayout, w7.z5.n(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                                    TextView textView2 = new TextView(parentActivity2);
                                    frameLayout.K = textView2;
                                    ?? textView3 = new TextView(parentActivity2);
                                    frameLayout.J = textView3;
                                    linearLayout.addView(ud0Var, w7.z5.l(0.5f, 0, 270));
                                    ud0Var.setFormatter(new org.telegram.ui.Components.aj0(frameLayout, 0));
                                    ud0Var.setMinValue(0);
                                    ud0Var.setMaxValue(10);
                                    ud0Var.setWrapSelectorWheel(false);
                                    ud0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(frameLayout, 1);
                                    ud0Var.setOnValueChangedListener(aj0Var);
                                    ud0Var2.setMinValue(0);
                                    ud0Var2.setMaxValue(10);
                                    ud0Var2.setWrapSelectorWheel(false);
                                    ud0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(ud0Var2, w7.z5.l(0.5f, 0, 270));
                                    ud0Var2.setFormatter(new org.telegram.ui.Components.aj0(frameLayout, 2));
                                    ud0Var2.setOnValueChangedListener(aj0Var);
                                    ud0Var.setValue(0);
                                    ud0Var2.setValue(6);
                                    cj0Var.addView(frameLayout4, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                    frameLayout4.addView((View) textView3, w7.z5.d(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.rt(11, frameLayout, qwVar));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19838q5, false));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, w7.z5.d(48.0f, -1));
                                    frameLayout2.addView(cj0Var, w7.z5.e(-1, -2, 51));
                                    ld0Var.R = frameLayout;
                                    ((FrameLayout) ld0Var.fragmentView).addView((View) frameLayout, w7.z5.d(-1.0f, -1));
                                    org.telegram.ui.Components.fj0 fj0Var = ld0Var.R;
                                    fj0Var.f24765r = false;
                                    AnimatorSet animatorSet = fj0Var.f24766s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        fj0Var.f24766s = null;
                                    }
                                    org.telegram.ui.Components.bj0 bj0Var = fj0Var.v;
                                    bj0Var.measure(View.MeasureSpec.makeMeasureSpec((fj0Var.f24768x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (fj0Var.f24765r) {
                                        z14 = true;
                                    } else {
                                        bj0Var.setVisibility(0);
                                        if (fj0Var.f24767w) {
                                            fj0Var.setLayerType(2, null);
                                        }
                                        bj0Var.setTranslationY(bj0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        fj0Var.f24766s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(bj0Var, View.TRANSLATION_Y, 0.0f));
                                        fj0Var.f24766s.setDuration(400L);
                                        fj0Var.f24766s.setStartDelay(20L);
                                        fj0Var.f24766s.setInterpolator(fj0Var.F);
                                        z14 = true;
                                        fj0Var.f24766s.addListener(new org.telegram.ui.Components.ej0(fj0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        fj0Var.f24766s.start();
                                    }
                                    fj0Var.c(z14);
                                    return;
                                }
                                return;
                            default:
                                ld0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = ld0Var.B0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    ld0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
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
        int i15 = org.telegram.ui.ActionBar.g6.ui;
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i15), false, getResourceProvider());
        this.d = u0Var;
        u0Var.setClickable(true);
        this.d.setSubMenuOpenSide(2);
        this.d.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        this.d.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        this.d.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), getResourceProvider());
        this.d.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), getResourceProvider());
        this.d.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), getResourceProvider());
        this.d.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int dp2 = AndroidUtilities.dp(40.0f);
        int i16 = org.telegram.ui.ActionBar.g6.wi;
        int themedColor4 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.g6.xi;
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.g6.i0(dp2, themedColor4, getThemedColor(i17));
        w7.b6.a(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.d;
        bi.a2 a2Var = zf.j0.f50192a;
        u0Var2.setOutlineProvider(a2Var);
        this.d.setBackgroundDrawable(i02);
        this.d.setIcon(R.drawable.msg_map_type);
        this.S.addView(this.d, w7.z5.a(40.0f, 0.0f, 12.0f, 12.0f, 0.0f, 40, 53));
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final ld0 f39757b;

            {
                this.f39757b = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                ld0 ld0Var = this.f39757b;
                switch (i152) {
                    case 0:
                        ld0Var.x0(false);
                        ld0Var.T.H(null, ld0Var.f37714x0, true);
                        ld0Var.D0 = true;
                        ld0Var.w0();
                        return;
                    case 1:
                        ld0Var.d.M(null, null);
                        return;
                    case 2:
                        int i162 = ld0Var.G0;
                        Activity parentActivity = ld0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (ld0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ld0Var.getParentActivity());
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, ld0Var.getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19248a;
                                a2Var2.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new tc0(ld0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                ld0Var.showDialog(a2Var2);
                                return;
                            }
                            return;
                        } else if (ld0Var.c0() || i162 == 3) {
                            if ((ld0Var.B0 != null && i162 != 3) || ld0Var.f37717z0 != null) {
                                if (ld0Var.f37712w0 != null && (iMap = ld0Var.I) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(ld0Var.f37712w0.getLatitude(), ld0Var.f37712w0.getLongitude()), ld0Var.I.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (ld0Var.f37712w0 != null && ld0Var.I != null) {
                                ImageView imageView = ld0Var.f37683a;
                                int i172 = org.telegram.ui.ActionBar.g6.vi;
                                imageView.setColorFilter(new PorterDuffColorFilter(ld0Var.getThemedColor(i172), PorterDuff.Mode.MULTIPLY));
                                ld0Var.f37683a.setTag(Integer.valueOf(i172));
                                ld0Var.T.L(null);
                                ld0Var.C0 = false;
                                ld0Var.x0(false);
                                ld0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(ld0Var.f37712w0.getLatitude(), ld0Var.f37712w0.getLongitude())));
                                if (ld0Var.D0 && i162 != 8) {
                                    Location location3 = ld0Var.f37712w0;
                                    if (location3 != null) {
                                        ld0Var.T.H(null, location3, true);
                                    }
                                    ld0Var.D0 = false;
                                    ld0Var.w0();
                                }
                            }
                            if (ld0Var.m0 != null) {
                                ld0Var.X.setVisibility(0);
                                id0 id0Var = ld0Var.f37713x;
                                IMapsProvider.IMarker iMarker = ld0Var.m0;
                                HashMap hashMap = id0Var.f36786a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    id0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                ld0Var.m0 = null;
                                ld0Var.f37700n0 = null;
                                ld0Var.f37701o0 = null;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        ld0Var.f37695i0 = -1L;
                        ld0Var.C0 = true;
                        if (ld0Var.i0()) {
                            ld0Var.f37696j0 = true;
                            ld0Var.y0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (ld0Var.getParentActivity() != null && ld0Var.f37712w0 != null && ld0Var.c0() && ld0Var.I != null) {
                            di.d4 d4Var = ld0Var.f37715y;
                            if (d4Var != null) {
                                d4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = ld0Var.getLocationController().getSharingLocationInfo(ld0Var.f37690e0);
                            if (ld0Var.G) {
                                ld0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                ld0Var.f37687c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = ld0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    ld0Var.O = null;
                                }
                                ld0Var.G = true;
                                ld0Var.l0().k(0L, 25, 0, null, new vc0(ld0Var, 1), new d20(26, ld0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = ld0Var.O;
                            if (iCircle2 == null) {
                                ld0Var.d0(500);
                            } else {
                                ld0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(ld0Var.f37690e0)) {
                                user = ld0Var.getMessagesController().getUser(Long.valueOf(ld0Var.f37690e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity2 = ld0Var.getParentActivity();
                            tc0 tc0Var = new tc0(ld0Var, 3);
                            qw qwVar = new qw(17, ld0Var, user);
                            vc0 vc0Var = new vc0(ld0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity2);
                            frameLayout.f24760a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f24763f = false;
                            frameLayout.h = null;
                            frameLayout.f24764n = new Rect();
                            new Paint();
                            frameLayout.f24767w = true;
                            frameLayout.F = org.telegram.ui.Components.es.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = vc0Var;
                            frameLayout.f24769y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i18 = rect2.left;
                            frameLayout.f24768x = i18;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i18, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i18, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.z5.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = tc0Var;
                            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.G = ud0Var;
                            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            ud0Var.setItemCount(5);
                            org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.H = ud0Var2;
                            ud0Var2.setItemCount(5);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(frameLayout, parentActivity2);
                            frameLayout.P = cj0Var;
                            cj0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                            cj0Var.addView(frameLayout3, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity2);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false), 1, textView);
                            frameLayout3.addView(textView, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView.setOnTouchListener(new ci.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            cj0Var.addView(linearLayout, w7.z5.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                            TextView textView2 = new TextView(parentActivity2);
                            frameLayout.K = textView2;
                            ?? textView3 = new TextView(parentActivity2);
                            frameLayout.J = textView3;
                            linearLayout.addView(ud0Var, w7.z5.l(0.5f, 0, 270));
                            ud0Var.setFormatter(new org.telegram.ui.Components.aj0(frameLayout, 0));
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(10);
                            ud0Var.setWrapSelectorWheel(false);
                            ud0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(frameLayout, 1);
                            ud0Var.setOnValueChangedListener(aj0Var);
                            ud0Var2.setMinValue(0);
                            ud0Var2.setMaxValue(10);
                            ud0Var2.setWrapSelectorWheel(false);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(ud0Var2, w7.z5.l(0.5f, 0, 270));
                            ud0Var2.setFormatter(new org.telegram.ui.Components.aj0(frameLayout, 2));
                            ud0Var2.setOnValueChangedListener(aj0Var);
                            ud0Var.setValue(0);
                            ud0Var2.setValue(6);
                            cj0Var.addView(frameLayout4, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                            frameLayout4.addView((View) textView3, w7.z5.d(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.rt(11, frameLayout, qwVar));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19838q5, false));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, w7.z5.d(48.0f, -1));
                            frameLayout2.addView(cj0Var, w7.z5.e(-1, -2, 51));
                            ld0Var.R = frameLayout;
                            ((FrameLayout) ld0Var.fragmentView).addView((View) frameLayout, w7.z5.d(-1.0f, -1));
                            org.telegram.ui.Components.fj0 fj0Var = ld0Var.R;
                            fj0Var.f24765r = false;
                            AnimatorSet animatorSet = fj0Var.f24766s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                fj0Var.f24766s = null;
                            }
                            org.telegram.ui.Components.bj0 bj0Var = fj0Var.v;
                            bj0Var.measure(View.MeasureSpec.makeMeasureSpec((fj0Var.f24768x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (fj0Var.f24765r) {
                                z14 = true;
                            } else {
                                bj0Var.setVisibility(0);
                                if (fj0Var.f24767w) {
                                    fj0Var.setLayerType(2, null);
                                }
                                bj0Var.setTranslationY(bj0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                fj0Var.f24766s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(bj0Var, View.TRANSLATION_Y, 0.0f));
                                fj0Var.f24766s.setDuration(400L);
                                fj0Var.f24766s.setStartDelay(20L);
                                fj0Var.f24766s.setInterpolator(fj0Var.F);
                                z14 = true;
                                fj0Var.f24766s.addListener(new org.telegram.ui.Components.ej0(fj0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                fj0Var.f24766s.start();
                            }
                            fj0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        ld0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = ld0Var.B0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            ld0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        this.d.setDelegate(new tc0(this, 0));
        this.f37683a = new ImageView(context);
        org.telegram.ui.Cells.z i03 = org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(40.0f), getThemedColor(i16), getThemedColor(i17));
        w7.b6.a(this.f37683a);
        this.f37683a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f37683a.setOutlineProvider(a2Var);
        this.f37683a.setBackground(i03);
        this.f37683a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.f37683a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f37683a;
        int i18 = org.telegram.ui.ActionBar.g6.vi;
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), mode));
        this.f37683a.setTag(Integer.valueOf(i18));
        this.f37683a.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams a2 = w7.z5.a(40.0f, 0.0f, 0.0f, 12.0f, 12.0f, 40, 85);
        a2.bottomMargin = (layoutParams2.height - rect.top) + a2.bottomMargin;
        this.S.addView(this.f37683a, a2);
        this.f37683a.setOnClickListener(new View.OnClickListener(this) {
            public final ld0 f39757b;

            {
                this.f39757b = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                ld0 ld0Var = this.f39757b;
                switch (i152) {
                    case 0:
                        ld0Var.x0(false);
                        ld0Var.T.H(null, ld0Var.f37714x0, true);
                        ld0Var.D0 = true;
                        ld0Var.w0();
                        return;
                    case 1:
                        ld0Var.d.M(null, null);
                        return;
                    case 2:
                        int i162 = ld0Var.G0;
                        Activity parentActivity = ld0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (ld0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ld0Var.getParentActivity());
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, ld0Var.getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19248a;
                                a2Var2.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new tc0(ld0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                ld0Var.showDialog(a2Var2);
                                return;
                            }
                            return;
                        } else if (ld0Var.c0() || i162 == 3) {
                            if ((ld0Var.B0 != null && i162 != 3) || ld0Var.f37717z0 != null) {
                                if (ld0Var.f37712w0 != null && (iMap = ld0Var.I) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(ld0Var.f37712w0.getLatitude(), ld0Var.f37712w0.getLongitude()), ld0Var.I.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (ld0Var.f37712w0 != null && ld0Var.I != null) {
                                ImageView imageView3 = ld0Var.f37683a;
                                int i172 = org.telegram.ui.ActionBar.g6.vi;
                                imageView3.setColorFilter(new PorterDuffColorFilter(ld0Var.getThemedColor(i172), PorterDuff.Mode.MULTIPLY));
                                ld0Var.f37683a.setTag(Integer.valueOf(i172));
                                ld0Var.T.L(null);
                                ld0Var.C0 = false;
                                ld0Var.x0(false);
                                ld0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(ld0Var.f37712w0.getLatitude(), ld0Var.f37712w0.getLongitude())));
                                if (ld0Var.D0 && i162 != 8) {
                                    Location location3 = ld0Var.f37712w0;
                                    if (location3 != null) {
                                        ld0Var.T.H(null, location3, true);
                                    }
                                    ld0Var.D0 = false;
                                    ld0Var.w0();
                                }
                            }
                            if (ld0Var.m0 != null) {
                                ld0Var.X.setVisibility(0);
                                id0 id0Var = ld0Var.f37713x;
                                IMapsProvider.IMarker iMarker = ld0Var.m0;
                                HashMap hashMap = id0Var.f36786a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    id0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                ld0Var.m0 = null;
                                ld0Var.f37700n0 = null;
                                ld0Var.f37701o0 = null;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        ld0Var.f37695i0 = -1L;
                        ld0Var.C0 = true;
                        if (ld0Var.i0()) {
                            ld0Var.f37696j0 = true;
                            ld0Var.y0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (ld0Var.getParentActivity() != null && ld0Var.f37712w0 != null && ld0Var.c0() && ld0Var.I != null) {
                            di.d4 d4Var = ld0Var.f37715y;
                            if (d4Var != null) {
                                d4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = ld0Var.getLocationController().getSharingLocationInfo(ld0Var.f37690e0);
                            if (ld0Var.G) {
                                ld0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                ld0Var.f37687c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = ld0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    ld0Var.O = null;
                                }
                                ld0Var.G = true;
                                ld0Var.l0().k(0L, 25, 0, null, new vc0(ld0Var, 1), new d20(26, ld0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = ld0Var.O;
                            if (iCircle2 == null) {
                                ld0Var.d0(500);
                            } else {
                                ld0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(ld0Var.f37690e0)) {
                                user = ld0Var.getMessagesController().getUser(Long.valueOf(ld0Var.f37690e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity2 = ld0Var.getParentActivity();
                            tc0 tc0Var = new tc0(ld0Var, 3);
                            qw qwVar = new qw(17, ld0Var, user);
                            vc0 vc0Var = new vc0(ld0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity2);
                            frameLayout.f24760a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f24763f = false;
                            frameLayout.h = null;
                            frameLayout.f24764n = new Rect();
                            new Paint();
                            frameLayout.f24767w = true;
                            frameLayout.F = org.telegram.ui.Components.es.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = vc0Var;
                            frameLayout.f24769y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i182 = rect2.left;
                            frameLayout.f24768x = i182;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i182, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i182, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.z5.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = tc0Var;
                            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.G = ud0Var;
                            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            ud0Var.setItemCount(5);
                            org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.H = ud0Var2;
                            ud0Var2.setItemCount(5);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(frameLayout, parentActivity2);
                            frameLayout.P = cj0Var;
                            cj0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                            cj0Var.addView(frameLayout3, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity2);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false), 1, textView);
                            frameLayout3.addView(textView, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView.setOnTouchListener(new ci.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            cj0Var.addView(linearLayout, w7.z5.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                            TextView textView2 = new TextView(parentActivity2);
                            frameLayout.K = textView2;
                            ?? textView3 = new TextView(parentActivity2);
                            frameLayout.J = textView3;
                            linearLayout.addView(ud0Var, w7.z5.l(0.5f, 0, 270));
                            ud0Var.setFormatter(new org.telegram.ui.Components.aj0(frameLayout, 0));
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(10);
                            ud0Var.setWrapSelectorWheel(false);
                            ud0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(frameLayout, 1);
                            ud0Var.setOnValueChangedListener(aj0Var);
                            ud0Var2.setMinValue(0);
                            ud0Var2.setMaxValue(10);
                            ud0Var2.setWrapSelectorWheel(false);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(ud0Var2, w7.z5.l(0.5f, 0, 270));
                            ud0Var2.setFormatter(new org.telegram.ui.Components.aj0(frameLayout, 2));
                            ud0Var2.setOnValueChangedListener(aj0Var);
                            ud0Var.setValue(0);
                            ud0Var2.setValue(6);
                            cj0Var.addView(frameLayout4, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                            frameLayout4.addView((View) textView3, w7.z5.d(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.rt(11, frameLayout, qwVar));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19838q5, false));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, w7.z5.d(48.0f, -1));
                            frameLayout2.addView(cj0Var, w7.z5.e(-1, -2, 51));
                            ld0Var.R = frameLayout;
                            ((FrameLayout) ld0Var.fragmentView).addView((View) frameLayout, w7.z5.d(-1.0f, -1));
                            org.telegram.ui.Components.fj0 fj0Var = ld0Var.R;
                            fj0Var.f24765r = false;
                            AnimatorSet animatorSet = fj0Var.f24766s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                fj0Var.f24766s = null;
                            }
                            org.telegram.ui.Components.bj0 bj0Var = fj0Var.v;
                            bj0Var.measure(View.MeasureSpec.makeMeasureSpec((fj0Var.f24768x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (fj0Var.f24765r) {
                                z14 = true;
                            } else {
                                bj0Var.setVisibility(0);
                                if (fj0Var.f24767w) {
                                    fj0Var.setLayerType(2, null);
                                }
                                bj0Var.setTranslationY(bj0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                fj0Var.f24766s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(bj0Var, View.TRANSLATION_Y, 0.0f));
                                fj0Var.f24766s.setDuration(400L);
                                fj0Var.f24766s.setStartDelay(20L);
                                fj0Var.f24766s.setInterpolator(fj0Var.F);
                                z14 = true;
                                fj0Var.f24766s.addListener(new org.telegram.ui.Components.ej0(fj0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                fj0Var.f24766s.start();
                            }
                            fj0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        ld0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = ld0Var.B0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            ld0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        TextView textView = new TextView(context);
        this.f37685b = textView;
        textView.setGravity(17);
        this.f37685b.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f37685b.setTextSize(1, 15.0f);
        this.f37685b.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.resourceProvider));
        this.f37685b.setTypeface(AndroidUtilities.bold());
        this.f37685b.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.f37685b.setText(LocaleController.getString(R.string.LocationsShowAll));
        this.f37685b.setBackground(org.telegram.ui.ActionBar.g6.a0(getThemedColor(i16), getThemedColor(i17), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams a10 = w7.z5.a(38.0f, 12.0f, 0.0f, 12.0f, 12.0f, -2, 81);
        a10.bottomMargin = (layoutParams2.height - rect.top) + a10.bottomMargin;
        this.S.addView(this.f37685b, a10);
        w7.b6.a(this.f37685b);
        this.f37685b.setOnClickListener(new View.OnClickListener(this) {
            public final ld0 f39757b;

            {
                this.f39757b = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                ld0 ld0Var = this.f39757b;
                switch (i152) {
                    case 0:
                        ld0Var.x0(false);
                        ld0Var.T.H(null, ld0Var.f37714x0, true);
                        ld0Var.D0 = true;
                        ld0Var.w0();
                        return;
                    case 1:
                        ld0Var.d.M(null, null);
                        return;
                    case 2:
                        int i162 = ld0Var.G0;
                        Activity parentActivity = ld0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (ld0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ld0Var.getParentActivity());
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, ld0Var.getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19248a;
                                a2Var2.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new tc0(ld0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                ld0Var.showDialog(a2Var2);
                                return;
                            }
                            return;
                        } else if (ld0Var.c0() || i162 == 3) {
                            if ((ld0Var.B0 != null && i162 != 3) || ld0Var.f37717z0 != null) {
                                if (ld0Var.f37712w0 != null && (iMap = ld0Var.I) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(ld0Var.f37712w0.getLatitude(), ld0Var.f37712w0.getLongitude()), ld0Var.I.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (ld0Var.f37712w0 != null && ld0Var.I != null) {
                                ImageView imageView3 = ld0Var.f37683a;
                                int i172 = org.telegram.ui.ActionBar.g6.vi;
                                imageView3.setColorFilter(new PorterDuffColorFilter(ld0Var.getThemedColor(i172), PorterDuff.Mode.MULTIPLY));
                                ld0Var.f37683a.setTag(Integer.valueOf(i172));
                                ld0Var.T.L(null);
                                ld0Var.C0 = false;
                                ld0Var.x0(false);
                                ld0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(ld0Var.f37712w0.getLatitude(), ld0Var.f37712w0.getLongitude())));
                                if (ld0Var.D0 && i162 != 8) {
                                    Location location3 = ld0Var.f37712w0;
                                    if (location3 != null) {
                                        ld0Var.T.H(null, location3, true);
                                    }
                                    ld0Var.D0 = false;
                                    ld0Var.w0();
                                }
                            }
                            if (ld0Var.m0 != null) {
                                ld0Var.X.setVisibility(0);
                                id0 id0Var = ld0Var.f37713x;
                                IMapsProvider.IMarker iMarker = ld0Var.m0;
                                HashMap hashMap = id0Var.f36786a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    id0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                ld0Var.m0 = null;
                                ld0Var.f37700n0 = null;
                                ld0Var.f37701o0 = null;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        ld0Var.f37695i0 = -1L;
                        ld0Var.C0 = true;
                        if (ld0Var.i0()) {
                            ld0Var.f37696j0 = true;
                            ld0Var.y0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (ld0Var.getParentActivity() != null && ld0Var.f37712w0 != null && ld0Var.c0() && ld0Var.I != null) {
                            di.d4 d4Var = ld0Var.f37715y;
                            if (d4Var != null) {
                                d4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = ld0Var.getLocationController().getSharingLocationInfo(ld0Var.f37690e0);
                            if (ld0Var.G) {
                                ld0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                ld0Var.f37687c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = ld0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    ld0Var.O = null;
                                }
                                ld0Var.G = true;
                                ld0Var.l0().k(0L, 25, 0, null, new vc0(ld0Var, 1), new d20(26, ld0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = ld0Var.O;
                            if (iCircle2 == null) {
                                ld0Var.d0(500);
                            } else {
                                ld0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(ld0Var.f37690e0)) {
                                user = ld0Var.getMessagesController().getUser(Long.valueOf(ld0Var.f37690e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity2 = ld0Var.getParentActivity();
                            tc0 tc0Var = new tc0(ld0Var, 3);
                            qw qwVar = new qw(17, ld0Var, user);
                            vc0 vc0Var = new vc0(ld0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity2);
                            frameLayout.f24760a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f24763f = false;
                            frameLayout.h = null;
                            frameLayout.f24764n = new Rect();
                            new Paint();
                            frameLayout.f24767w = true;
                            frameLayout.F = org.telegram.ui.Components.es.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = vc0Var;
                            frameLayout.f24769y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i182 = rect2.left;
                            frameLayout.f24768x = i182;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i182, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i182, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.z5.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = tc0Var;
                            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.G = ud0Var;
                            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            ud0Var.setItemCount(5);
                            org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.H = ud0Var2;
                            ud0Var2.setItemCount(5);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(frameLayout, parentActivity2);
                            frameLayout.P = cj0Var;
                            cj0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                            cj0Var.addView(frameLayout3, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false), 1, textView2);
                            frameLayout3.addView(textView2, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView2.setOnTouchListener(new ci.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            cj0Var.addView(linearLayout, w7.z5.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                            TextView textView22 = new TextView(parentActivity2);
                            frameLayout.K = textView22;
                            ?? textView3 = new TextView(parentActivity2);
                            frameLayout.J = textView3;
                            linearLayout.addView(ud0Var, w7.z5.l(0.5f, 0, 270));
                            ud0Var.setFormatter(new org.telegram.ui.Components.aj0(frameLayout, 0));
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(10);
                            ud0Var.setWrapSelectorWheel(false);
                            ud0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(frameLayout, 1);
                            ud0Var.setOnValueChangedListener(aj0Var);
                            ud0Var2.setMinValue(0);
                            ud0Var2.setMaxValue(10);
                            ud0Var2.setWrapSelectorWheel(false);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(ud0Var2, w7.z5.l(0.5f, 0, 270));
                            ud0Var2.setFormatter(new org.telegram.ui.Components.aj0(frameLayout, 2));
                            ud0Var2.setOnValueChangedListener(aj0Var);
                            ud0Var.setValue(0);
                            ud0Var2.setValue(6);
                            cj0Var.addView(frameLayout4, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                            frameLayout4.addView((View) textView3, w7.z5.d(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.rt(11, frameLayout, qwVar));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            textView22.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19838q5, false));
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, w7.z5.d(48.0f, -1));
                            frameLayout2.addView(cj0Var, w7.z5.e(-1, -2, 51));
                            ld0Var.R = frameLayout;
                            ((FrameLayout) ld0Var.fragmentView).addView((View) frameLayout, w7.z5.d(-1.0f, -1));
                            org.telegram.ui.Components.fj0 fj0Var = ld0Var.R;
                            fj0Var.f24765r = false;
                            AnimatorSet animatorSet = fj0Var.f24766s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                fj0Var.f24766s = null;
                            }
                            org.telegram.ui.Components.bj0 bj0Var = fj0Var.v;
                            bj0Var.measure(View.MeasureSpec.makeMeasureSpec((fj0Var.f24768x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (fj0Var.f24765r) {
                                z14 = true;
                            } else {
                                bj0Var.setVisibility(0);
                                if (fj0Var.f24767w) {
                                    fj0Var.setLayerType(2, null);
                                }
                                bj0Var.setTranslationY(bj0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                fj0Var.f24766s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(bj0Var, View.TRANSLATION_Y, 0.0f));
                                fj0Var.f24766s.setDuration(400L);
                                fj0Var.f24766s.setStartDelay(20L);
                                fj0Var.f24766s.setInterpolator(fj0Var.F);
                                z14 = true;
                                fj0Var.f24766s.addListener(new org.telegram.ui.Components.ej0(fj0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                fj0Var.f24766s.start();
                            }
                            fj0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        ld0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = ld0Var.B0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            ld0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        y0(false, false);
        this.f37687c = new ImageView(context);
        org.telegram.ui.Cells.z i04 = org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(40.0f), getThemedColor(i16), getThemedColor(i17));
        w7.b6.a(this.f37687c);
        this.f37687c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f37687c.setOutlineProvider(a2Var);
        this.f37687c.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        this.f37687c.setBackgroundDrawable(i04);
        this.f37687c.setScaleType(scaleType);
        this.f37687c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.S.addView(this.f37687c, w7.z5.a(40.0f, 0.0f, 62.0f, 12.0f, 0.0f, 40, 53));
        this.f37687c.setOnClickListener(new View.OnClickListener(this) {
            public final ld0 f39757b;

            {
                this.f39757b = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                ld0 ld0Var = this.f39757b;
                switch (i152) {
                    case 0:
                        ld0Var.x0(false);
                        ld0Var.T.H(null, ld0Var.f37714x0, true);
                        ld0Var.D0 = true;
                        ld0Var.w0();
                        return;
                    case 1:
                        ld0Var.d.M(null, null);
                        return;
                    case 2:
                        int i162 = ld0Var.G0;
                        Activity parentActivity = ld0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (ld0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ld0Var.getParentActivity());
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, ld0Var.getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19248a;
                                a2Var2.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new tc0(ld0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                ld0Var.showDialog(a2Var2);
                                return;
                            }
                            return;
                        } else if (ld0Var.c0() || i162 == 3) {
                            if ((ld0Var.B0 != null && i162 != 3) || ld0Var.f37717z0 != null) {
                                if (ld0Var.f37712w0 != null && (iMap = ld0Var.I) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(ld0Var.f37712w0.getLatitude(), ld0Var.f37712w0.getLongitude()), ld0Var.I.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (ld0Var.f37712w0 != null && ld0Var.I != null) {
                                ImageView imageView3 = ld0Var.f37683a;
                                int i172 = org.telegram.ui.ActionBar.g6.vi;
                                imageView3.setColorFilter(new PorterDuffColorFilter(ld0Var.getThemedColor(i172), PorterDuff.Mode.MULTIPLY));
                                ld0Var.f37683a.setTag(Integer.valueOf(i172));
                                ld0Var.T.L(null);
                                ld0Var.C0 = false;
                                ld0Var.x0(false);
                                ld0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(ld0Var.f37712w0.getLatitude(), ld0Var.f37712w0.getLongitude())));
                                if (ld0Var.D0 && i162 != 8) {
                                    Location location3 = ld0Var.f37712w0;
                                    if (location3 != null) {
                                        ld0Var.T.H(null, location3, true);
                                    }
                                    ld0Var.D0 = false;
                                    ld0Var.w0();
                                }
                            }
                            if (ld0Var.m0 != null) {
                                ld0Var.X.setVisibility(0);
                                id0 id0Var = ld0Var.f37713x;
                                IMapsProvider.IMarker iMarker = ld0Var.m0;
                                HashMap hashMap = id0Var.f36786a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    id0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                ld0Var.m0 = null;
                                ld0Var.f37700n0 = null;
                                ld0Var.f37701o0 = null;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        ld0Var.f37695i0 = -1L;
                        ld0Var.C0 = true;
                        if (ld0Var.i0()) {
                            ld0Var.f37696j0 = true;
                            ld0Var.y0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (ld0Var.getParentActivity() != null && ld0Var.f37712w0 != null && ld0Var.c0() && ld0Var.I != null) {
                            di.d4 d4Var = ld0Var.f37715y;
                            if (d4Var != null) {
                                d4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = ld0Var.getLocationController().getSharingLocationInfo(ld0Var.f37690e0);
                            if (ld0Var.G) {
                                ld0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                ld0Var.f37687c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = ld0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    ld0Var.O = null;
                                }
                                ld0Var.G = true;
                                ld0Var.l0().k(0L, 25, 0, null, new vc0(ld0Var, 1), new d20(26, ld0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = ld0Var.O;
                            if (iCircle2 == null) {
                                ld0Var.d0(500);
                            } else {
                                ld0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(ld0Var.f37690e0)) {
                                user = ld0Var.getMessagesController().getUser(Long.valueOf(ld0Var.f37690e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity2 = ld0Var.getParentActivity();
                            tc0 tc0Var = new tc0(ld0Var, 3);
                            qw qwVar = new qw(17, ld0Var, user);
                            vc0 vc0Var = new vc0(ld0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity2);
                            frameLayout.f24760a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f24763f = false;
                            frameLayout.h = null;
                            frameLayout.f24764n = new Rect();
                            new Paint();
                            frameLayout.f24767w = true;
                            frameLayout.F = org.telegram.ui.Components.es.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = vc0Var;
                            frameLayout.f24769y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i182 = rect2.left;
                            frameLayout.f24768x = i182;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i182, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i182, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.z5.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = tc0Var;
                            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.G = ud0Var;
                            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            ud0Var.setItemCount(5);
                            org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.H = ud0Var2;
                            ud0Var2.setItemCount(5);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(frameLayout, parentActivity2);
                            frameLayout.P = cj0Var;
                            cj0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                            cj0Var.addView(frameLayout3, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false), 1, textView2);
                            frameLayout3.addView(textView2, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView2.setOnTouchListener(new ci.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            cj0Var.addView(linearLayout, w7.z5.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                            TextView textView22 = new TextView(parentActivity2);
                            frameLayout.K = textView22;
                            ?? textView3 = new TextView(parentActivity2);
                            frameLayout.J = textView3;
                            linearLayout.addView(ud0Var, w7.z5.l(0.5f, 0, 270));
                            ud0Var.setFormatter(new org.telegram.ui.Components.aj0(frameLayout, 0));
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(10);
                            ud0Var.setWrapSelectorWheel(false);
                            ud0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(frameLayout, 1);
                            ud0Var.setOnValueChangedListener(aj0Var);
                            ud0Var2.setMinValue(0);
                            ud0Var2.setMaxValue(10);
                            ud0Var2.setWrapSelectorWheel(false);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(ud0Var2, w7.z5.l(0.5f, 0, 270));
                            ud0Var2.setFormatter(new org.telegram.ui.Components.aj0(frameLayout, 2));
                            ud0Var2.setOnValueChangedListener(aj0Var);
                            ud0Var.setValue(0);
                            ud0Var2.setValue(6);
                            cj0Var.addView(frameLayout4, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                            frameLayout4.addView((View) textView3, w7.z5.d(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.rt(11, frameLayout, qwVar));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            textView22.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19838q5, false));
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, w7.z5.d(48.0f, -1));
                            frameLayout2.addView(cj0Var, w7.z5.e(-1, -2, 51));
                            ld0Var.R = frameLayout;
                            ((FrameLayout) ld0Var.fragmentView).addView((View) frameLayout, w7.z5.d(-1.0f, -1));
                            org.telegram.ui.Components.fj0 fj0Var = ld0Var.R;
                            fj0Var.f24765r = false;
                            AnimatorSet animatorSet = fj0Var.f24766s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                fj0Var.f24766s = null;
                            }
                            org.telegram.ui.Components.bj0 bj0Var = fj0Var.v;
                            bj0Var.measure(View.MeasureSpec.makeMeasureSpec((fj0Var.f24768x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (fj0Var.f24765r) {
                                z14 = true;
                            } else {
                                bj0Var.setVisibility(0);
                                if (fj0Var.f24767w) {
                                    fj0Var.setLayerType(2, null);
                                }
                                bj0Var.setTranslationY(bj0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                fj0Var.f24766s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(bj0Var, View.TRANSLATION_Y, 0.0f));
                                fj0Var.f24766s.setDuration(400L);
                                fj0Var.f24766s.setStartDelay(20L);
                                fj0Var.f24766s.setInterpolator(fj0Var.F);
                                z14 = true;
                                fj0Var.f24766s.addListener(new org.telegram.ui.Components.ej0(fj0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                fj0Var.f24766s.start();
                            }
                            fj0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        ld0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = ld0Var.B0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            ld0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        if (DialogObject.isChatDialog(this.f37690e0)) {
            chat = getMessagesController().getChat(Long.valueOf(-this.f37690e0));
        } else {
            chat = null;
        }
        MessageObject messageObject3 = this.B0;
        if (messageObject3 != null && messageObject3.isLiveLocation() && !this.B0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f37690e0);
            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                this.f37687c.setImageResource(R.drawable.msg_location_alert2);
            } else {
                if (DialogObject.isUserDialog(this.f37690e0) && this.B0.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.f37687c.setVisibility(4);
                    this.f37687c.setAlpha(0.0f);
                    this.f37687c.setScaleX(0.4f);
                    this.f37687c.setScaleY(0.4f);
                }
                this.f37687c.setImageResource(R.drawable.msg_location_alert);
            }
        } else {
            this.f37687c.setVisibility(8);
            this.f37687c.setImageResource(R.drawable.msg_location_alert);
        }
        di.d4 d4Var = new di.d4(context, 1);
        this.f37715y = d4Var;
        d4Var.setLayerType(2, null);
        di.d4 d4Var2 = this.f37715y;
        d4Var2.d = 4000L;
        d4Var2.l(1.0f, -25.0f);
        this.f37715y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.S.addView(this.f37715y, w7.z5.a(-2.0f, 8.0f, 106.0f, 8.0f, 0.0f, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37691f = linearLayout;
        linearLayout.setOrientation(1);
        this.f37691f.setGravity(1);
        this.f37691f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f37691f.setVisibility(8);
        jd0Var.addView(this.f37691f, w7.z5.d(-1.0f, -1));
        this.f37691f.setOnTouchListener(new ci.d(2));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.W5), mode));
        this.f37691f.addView(this.h, w7.z5.n(-2, -2));
        TextView textView2 = new TextView(context);
        this.f37699n = textView2;
        int i19 = org.telegram.ui.ActionBar.g6.X5;
        textView2.setTextColor(getThemedColor(i19));
        this.f37699n.setGravity(17);
        this.f37699n.setTypeface(AndroidUtilities.bold());
        this.f37699n.setTextSize(1, 17.0f);
        this.f37699n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView i20 = com.google.android.gms.internal.play_billing.k3.i(this.f37691f, this.f37699n, w7.z5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f37704r = i20;
        i20.setTextColor(getThemedColor(i19));
        this.f37704r.setGravity(17);
        this.f37704r.setTextSize(1, 15.0f);
        this.f37704r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f37691f.addView(this.f37704r, w7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.U = mm0Var;
        long j10 = this.f37690e0;
        org.telegram.ui.ActionBar.c6 resourceProvider = getResourceProvider();
        boolean z14 = this.E;
        if (i14 == 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        zc0 zc0Var2 = new zc0(this, context, this.G0, j10, resourceProvider, z14, z11);
        this.T = zc0Var2;
        mm0Var.setAdapter(zc0Var2);
        org.telegram.ui.Components.mm0 mm0Var2 = this.U;
        s4.b0 b0Var = new s4.b0(1, false);
        this.Y = b0Var;
        mm0Var2.setLayoutManager(b0Var);
        if (this.M0 != null) {
            this.L0 = new org.telegram.ui.Cells.v3(context, this.resourceProvider);
            bd0 bd0Var = new bd0(this, context, new org.telegram.ui.Components.pv0(this), this, new ad0(this), getResourceProvider());
            this.K0 = bd0Var;
            bd0Var.setBackgroundColor(getThemedColor(i12));
            this.K0.addView(this.L0, w7.z5.e(-1, 32, 55));
            this.T.f10741h0 = this.K0;
            this.U.setOverScrollMode(2);
            s4.k kVar3 = new s4.k();
            z12 = false;
            kVar3.f44872m = false;
            kVar3.C = false;
            kVar3.o(org.telegram.ui.Components.es.h);
            kVar3.n(350L);
            this.U.setItemAnimator(kVar3);
        } else {
            z12 = false;
        }
        this.T.O(this.f37688c0, z12);
        this.T.getClass();
        this.U.setVerticalScrollBarEnabled(z12);
        jd0Var.addView(this.U, w7.z5.e(-1, -1, 51));
        MessageObject messageObject4 = this.B0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            zc0 zc0Var3 = this.T;
            zc0Var3.Q = this.B0.messageOwner.media.address;
            zc0Var3.Q();
        }
        this.U.setOnScrollListener(new cd0(this));
        ((s4.k) this.U.getItemAnimator()).C = false;
        this.U.setOnItemLongClickListener(new qw(15, this, context));
        this.U.setOnItemClickListener(new i(this, 17));
        zc0 zc0Var4 = this.T;
        long j11 = this.f37690e0;
        tc0 tc0Var = new tc0(this, 5);
        zc0Var4.H = j11;
        zc0Var4.f10517y = tc0Var;
        zc0Var4.P(this.H0);
        jd0Var.addView(this.S, w7.z5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.K = onCreateMapView;
        onCreateMapView.getView().setAlpha(0.0f);
        this.K.setOnDispatchTouchEventInterceptor(new tc0(this, 6));
        this.K.setOnInterceptTouchEventInterceptor(new tc0(this, 7));
        this.K.setOnLayoutListener(new vc0(this, 5));
        new Thread(new wc0(this, this.K, 1)).start();
        MessageObject messageObject5 = this.B0;
        if (messageObject5 == null && this.f37717z0 == null) {
            i10 = i14;
            if (chat != null && i10 == 4 && this.f37690e0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.S.addView(frameLayout, w7.z5.e(62, 76, 49));
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
                z9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                z9Var.e(chat, new org.telegram.ui.Components.k9(chat));
                frameLayout.addView(z9Var, w7.z5.a(52.0f, 5.0f, 5.0f, 0.0f, 0.0f, 52, 51));
                this.X = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.X == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.S.addView(imageView4, w7.z5.e(28, 48, 49));
                this.X = imageView4;
            }
            org.telegram.ui.Components.mm0 mm0Var3 = new org.telegram.ui.Components.mm0(context, null);
            this.V = mm0Var3;
            mm0Var3.setVisibility(8);
            i11 = 0;
            this.V.setLayoutManager(new s4.b0(1, false));
            org.telegram.ui.ActionBar.c6 resourceProvider2 = getResourceProvider();
            if (i10 == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            ed0 ed0Var2 = new ed0(this, context, resourceProvider2, z13);
            this.W = ed0Var2;
            tc0 tc0Var2 = new tc0(this, 8);
            ed0Var2.H = 0L;
            ed0Var2.f10517y = tc0Var2;
            jd0Var.addView(this.V, w7.z5.e(-1, -1, 51));
            this.V.setOnScrollListener(new k3(this, 18));
            this.V.setOnItemClickListener(new bi.z5(18, this, n10));
        } else {
            i10 = i14;
            i11 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.f37717z0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.f37717z0;
                if (tL_channelLocation2 != null) {
                    this.T.X = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.B0;
                    if (messageObject6 != null) {
                        zc0 zc0Var5 = this.T;
                        zc0Var5.W = messageObject6;
                        zc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.B0;
        if (messageObject7 != null && i10 == 6) {
            zc0 zc0Var6 = this.T;
            zc0Var6.W = messageObject7;
            zc0Var6.l();
        }
        while (i11 < 2) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.F;
            undoViewArr[i11] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i11].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.S.addView(undoViewArr[i11], w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
            i11++;
        }
        bi.d4 d4Var3 = new bi.d4(this, context, rect);
        this.v = d4Var3;
        d4Var3.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.S.addView(this.v, layoutParams2);
        if (this.B0 == null && this.f37717z0 == null && this.A0 != null) {
            this.C0 = true;
            ImageView imageView5 = this.f37683a;
            int i21 = org.telegram.ui.ActionBar.g6.ui;
            imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i21), PorterDuff.Mode.MULTIPLY));
            this.f37683a.setTag(Integer.valueOf(i21));
        }
        jd0Var.addView(this.actionBar);
        A0();
        return this.fragmentView;
    }

    public final void d0(int i10) {
        if (this.I == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.f37712w0.getLatitude(), this.f37712w0.getLongitude()));
        onCreateCircleOptions.radius(i10);
        if (m0()) {
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

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        zc0 zc0Var;
        long dialogId;
        zc0 zc0Var2;
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.locationPermissionGranted) {
            this.f37688c0 = false;
            zc0 zc0Var3 = this.T;
            if (zc0Var3 != null) {
                zc0Var3.O(false, false);
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
            this.f37688c0 = true;
            zc0 zc0Var4 = this.T;
            if (zc0Var4 != null) {
                zc0Var4.O(true, false);
            }
        } else if (i10 == NotificationCenter.liveLocationsChanged) {
            zc0 zc0Var5 = this.T;
            if (zc0Var5 != null) {
                zc0Var5.l();
            }
            B0();
        } else if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.f37690e0 && this.B0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i12);
                    if (messageObject.isLiveLocation()) {
                        b0(messageObject.messageOwner);
                        z10 = true;
                    } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                        this.f37687c.setImageResource(R.drawable.msg_location_alert);
                        IMapsProvider.ICircle iCircle = this.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            this.O = null;
                        }
                    }
                }
                if (z10 && (zc0Var2 = this.T) != null) {
                    zc0Var2.N(this.f37693g0);
                }
            }
        } else if (i10 == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.f37690e0 && this.B0 != null) {
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
                        fd0 fd0Var = (fd0) this.f37694h0.f(dialogId);
                        if (fd0Var != null) {
                            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                            if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                                TLRPC.Message message2 = messageObject2.messageOwner;
                                fd0Var.f35509b = message2;
                                TLRPC.GeoPoint geoPoint = message2.media.geo;
                                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                                fd0Var.e.setPosition(latLng);
                                if (this.f37695i0 == fd0Var.f35508a) {
                                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(fd0Var.e.getPosition()));
                                }
                                IMapsProvider.IMarker iMarker = fd0Var.f35511f;
                                if (iMarker != null) {
                                    iMarker.getPosition();
                                    fd0Var.f35511f.setPosition(latLng);
                                    int i14 = messageObject2.messageOwner.media.heading;
                                    if (i14 != 0) {
                                        fd0Var.f35511f.setRotation(i14);
                                        if (!fd0Var.f35512g) {
                                            fd0Var.f35511f.setIcon(R.drawable.map_pin_cone2);
                                            fd0Var.f35512g = true;
                                        }
                                    } else if (fd0Var.f35512g) {
                                        fd0Var.f35511f.setRotation(0);
                                        fd0Var.f35511f.setIcon(R.drawable.map_pin_circle);
                                        fd0Var.f35512g = false;
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                }
                if (z11 && (zc0Var = this.T) != null) {
                    zc0Var.l();
                    org.telegram.ui.Components.fj0 fj0Var = this.R;
                    if (fj0Var != null) {
                        fj0Var.c(true);
                    }
                }
                if (z11) {
                    B0();
                }
            }
        }
    }

    public final Bitmap e0(int i10) {
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

    public final Bitmap f0(fd0 fd0Var) {
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
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
                TLRPC.User user = fd0Var.f35510c;
                if (user != null) {
                    k9Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = fd0Var.d;
                    if (chat != null) {
                        k9Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                k9Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                k9Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = fd0Var.h;
                if (imageReceiver != null && imageReceiver.hasImageLoaded()) {
                    bitmap = fd0Var.h.getBitmap();
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
    public final boolean finishFragment(boolean z10) {
        if (p0()) {
            return false;
        }
        return super.finishFragment(z10);
    }

    public boolean g0() {
        return this instanceof nn;
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
            int i11 = org.telegram.ui.ActionBar.g6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView, 32, null, null, null, null, i11));
            int i12 = org.telegram.ui.ActionBar.g6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i12));
            int i13 = org.telegram.ui.ActionBar.g6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small", i13));
            i10++;
        }
        View view = this.fragmentView;
        int i14 = org.telegram.ui.ActionBar.g6.f19672h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 32768, null, null, null, null, i14));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.g6.f19707j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 64, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        org.telegram.ui.ActionBar.u0 u0Var = this.f37711w;
        if (u0Var != null) {
            editTextBoldCursor = u0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 16777216, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        ImageView imageView = this.h;
        int i16 = org.telegram.ui.ActionBar.g6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, null, null, i16));
        TextView textView = this.f37699n;
        int i17 = org.telegram.ui.ActionBar.g6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37704r, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        ImageView imageView2 = this.f37683a;
        int i18 = org.telegram.ui.ActionBar.g6.ui;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView2, 262152, null, null, null, null, i18));
        ImageView imageView3 = this.f37683a;
        int i19 = org.telegram.ui.ActionBar.g6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView3, 262152, null, null, null, null, i19));
        ImageView imageView4 = this.f37683a;
        int i20 = org.telegram.ui.ActionBar.g6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView4, 32, null, null, null, null, i20));
        ImageView imageView5 = this.f37683a;
        int i21 = org.telegram.ui.ActionBar.g6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView5, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, eVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37687c, 0, null, null, null, eVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37687c, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37687c, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f19852r0, eVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19889si));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19796ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19850qi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19776mi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19831pi));
        int i22 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19870ri));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19814oi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19563b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19783n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.V, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.V, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.V, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19673h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i17));
        return arrayList;
    }

    public final void h0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilder;
        if (this.f37692f0) {
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
                b0(message);
                if (this.f37687c.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.f37687c.setVisibility(0);
                    this.H = true;
                    this.f37687c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new org.telegram.ui.Components.v61(this, 28)).start();
                }
            }
        }
        if (iLatLngBoundsBuilder != null) {
            if (this.f37692f0) {
                this.U.v0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.f37692f0 = false;
            this.T.N(this.f37693g0);
            if (this.B0.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = iLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng o02 = o0(center, 100.0d, 100.0d);
                    iLatLngBoundsBuilder.include(o0(center, -100.0d, -100.0d));
                    iLatLngBoundsBuilder.include(o02);
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

    public final boolean i0() {
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
            ArrayList arrayList2 = this.f37693g0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                fd0 fd0Var = (fd0) arrayList2.get(i12);
                IMapsProvider.IMarker iMarker = fd0Var.e;
                if (iMarker != null && (message = fd0Var.f35509b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            if (this.f37694h0.f(getUserConfig().getClientUserId()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Location location = this.f37712w0;
            if (location != null && !z10) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.f37712w0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i13 = 0;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
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
                        onCreateLatLngBoundsBuilder.include(o0(latLng2, 15.0d, 15.0d));
                        onCreateLatLngBoundsBuilder.include(o0(latLng2, -15.0d, -15.0d));
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

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(boolean z10) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        if (this.U != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                int i12 = this.G0;
                if (i12 == 6) {
                    this.H0 = org.telegram.messenger.g0.B(66.0f, measuredHeight, currentActionBarHeight);
                } else if (i12 == 2) {
                    this.H0 = org.telegram.messenger.g0.B(73.0f, measuredHeight, currentActionBarHeight);
                } else {
                    this.H0 = org.telegram.messenger.g0.B(66.0f, measuredHeight, currentActionBarHeight);
                }
                bd0 bd0Var = this.K0;
                if (bd0Var != null && bd0Var.c0(8) > 0) {
                    this.H0 -= AndroidUtilities.dp(200.0f);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.U.getLayoutParams();
                layoutParams2.topMargin = currentActionBarHeight;
                this.U.setLayoutParams(layoutParams2);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.S.getLayoutParams();
                layoutParams3.topMargin = currentActionBarHeight;
                layoutParams3.height = this.H0;
                this.S.setLayoutParams(layoutParams3);
                org.telegram.ui.Components.mm0 mm0Var = this.V;
                if (mm0Var != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) mm0Var.getLayoutParams();
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
                id0 id0Var = this.f37713x;
                if (id0Var != null && (layoutParams = (FrameLayout.LayoutParams) id0Var.getLayoutParams()) != null) {
                    layoutParams.height = AndroidUtilities.dp(10.0f) + this.H0;
                    this.f37713x.setLayoutParams(layoutParams);
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
                    z0(false);
                    this.U.post(new org.telegram.ui.Components.o8(this, i11, 18));
                    return;
                }
                z0(false);
            }
        }
    }

    public final boolean k0() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.f(this.B0.getDialogId());
        if (arrayList != null && arrayList.isEmpty()) {
            h0(arrayList);
        } else {
            arrayList = null;
        }
        if (DialogObject.isChatDialog(this.f37690e0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f37690e0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.B0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new bi.o7(this, dialogId, 6));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView l0() {
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

    public final boolean m0() {
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.g6.I.q()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void n0() {
        SharedPreferences globalMainSettings;
        int i10;
        ImageView imageView = this.f37687c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.H && (i10 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) < 3) {
            globalMainSettings.edit().putInt("proximityhint", i10 + 1).commit();
            if (DialogObject.isUserDialog(this.f37690e0)) {
                this.f37715y.s(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.f37690e0)))));
            } else {
                this.f37715y.s(LocaleController.getString(R.string.ProximityTooltioGroup));
            }
            this.f37715y.u();
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.fj0 fj0Var = this.R;
        if (fj0Var != null) {
            if (z10) {
                fj0Var.a();
                return false;
            }
        } else {
            IMapsProvider.IMapView iMapView = this.K;
            if (iMapView != null && iMapView.getGlSurfaceView() != null && !this.M) {
                if (z10) {
                    p0();
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
        zc0 zc0Var = this.T;
        if (zc0Var != null) {
            zc0Var.F();
        }
        ed0 ed0Var = this.W;
        if (ed0Var != null) {
            ed0Var.F();
        }
        vc0 vc0Var = this.J0;
        if (vc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(vc0Var);
            this.J0 = null;
        }
        ArrayList arrayList = this.f37693g0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd0 fd0Var = (fd0) arrayList.get(i10);
            ImageReceiver imageReceiver = fd0Var.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                fd0Var.h = null;
            }
        }
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f37709u0) {
            iMapView.onLowMemory();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f37709u0) {
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
        this.f37710v0 = false;
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 30) {
            r0(false);
        }
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f37709u0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f37710v0 = true;
        IMapsProvider.IMap iMap = this.I;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        j0(true);
        if (g0()) {
            this.f37702p0 = false;
        } else if (this.f37702p0 && (parentActivity = getParentActivity()) != null) {
            this.f37702p0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        vc0 vc0Var = this.J0;
        if (vc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(vc0Var);
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
            l0 l0Var = this.S;
            if (l0Var != null) {
                l0Var.addView(this.K.getView(), 0, w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.H0, 51));
                id0 id0Var = this.f37713x;
                if (id0Var != null) {
                    try {
                        if (id0Var.getParent() instanceof ViewGroup) {
                            ((ViewGroup) this.f37713x.getParent()).removeView(this.f37713x);
                        }
                    } catch (Exception unused2) {
                    }
                    this.S.addView(this.f37713x, 1, w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.H0, 51));
                }
                z0(false);
                n0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.K.getView(), 0, w7.z5.e(-1, -1, 51));
            }
        }
    }

    public final boolean p0() {
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && iMapView.getGlSurfaceView() != null && !this.M) {
            GLSurfaceView glSurfaceView = this.K.getGlSurfaceView();
            glSurfaceView.queueEvent(new d20(25, this, glSurfaceView));
            return true;
        }
        return false;
    }

    public final void q0(fd0 fd0Var) {
        double d;
        double d10;
        String str;
        TLRPC.Message message;
        if (fd0Var != null && (message = fd0Var.f35509b) != null) {
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
                TLRPC.GeoPoint geoPoint3 = this.f37717z0.geo_point;
                d = geoPoint3.lat;
                d10 = geoPoint3._long;
            }
        }
        if (BuildVars.isHuaweiStoreApp()) {
            str = "mapapp://navigation";
        } else {
            str = "http://maps.google.com/maps";
        }
        if (this.f37712w0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f37712w0.getLatitude()), Double.valueOf(this.f37712w0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
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

    public final void r0(final boolean z10) {
        final TLRPC.User user;
        Activity parentActivity;
        if (this.F0 != null && !g0() && getParentActivity() != null && this.f37712w0 != null && c0()) {
            if (this.f37703q0 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f37703q0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    org.telegram.ui.Components.g5.k(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new rc0(this, z10, 1), null).o();
                    return;
                }
            }
            if (DialogObject.isUserDialog(this.f37690e0)) {
                user = getMessagesController().getUser(Long.valueOf(this.f37690e0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.g5.D(getParentActivity(), z10, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    ld0.U(ld0.this, z10, user, i10);
                }
            }, null));
        }
    }

    public final void s0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.f37712w0 = new Location(location);
        fd0 fd0Var = (fd0) this.f37694h0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f37690e0);
        if (fd0Var != null && sharingLocationInfo != null && fd0Var.f35509b.f18937id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            fd0Var.e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = fd0Var.f35511f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.f37695i0 == fd0Var.f35508a) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(fd0Var.e.getPosition()));
            }
        }
        if (this.B0 == null && this.f37717z0 == null && this.I != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            zc0 zc0Var = this.T;
            if (zc0Var != null) {
                if (!this.D0 && (i10 = this.G0) != 4 && i10 != 8) {
                    zc0Var.H(null, this.f37712w0, true);
                }
                this.T.M(this.f37712w0);
            }
            if (!this.C0) {
                this.f37714x0 = new Location(location);
                if (this.E0) {
                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.E0 = true;
                    this.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.I.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.T.M(this.f37712w0);
        }
        org.telegram.ui.Components.fj0 fj0Var = this.R;
        if (fj0Var != null) {
            fj0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.O;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.f37712w0.getLatitude(), this.f37712w0.getLongitude()));
        }
        B0();
    }

    public final void t0(MessageObject messageObject) {
        this.B0 = messageObject;
        this.f37690e0 = messageObject.getDialogId();
    }

    public final void u0(fd0 fd0Var) {
        if (fd0Var.h == null) {
            TLRPC.User user = fd0Var.f35510c;
            TLRPC.Chat chat = fd0Var.d;
            if (user == null && chat == 0) {
                return;
            }
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
            if (user != null) {
                k9Var.m(this.currentAccount, user);
            } else {
                k9Var.k(this.currentAccount, chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.setCurrentAccount(this.currentAccount);
            imageReceiver.setDelegate(new qw(16, this, fd0Var));
            imageReceiver.onAttachedToWindow();
            if (user == null) {
                user = chat;
            }
            imageReceiver.setForUserOrChat(user, k9Var);
            fd0Var.h = imageReceiver;
        }
    }

    public final void v0(int i10, TLRPC.User user, int i11) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.f37712w0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.f37712w0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.f37712w0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.F0.b(tL_messageMediaGeoLive, this.G0, true, 0, 0L);
        if (i11 > 0) {
            this.R.L = true;
            this.f37687c.setImageResource(R.drawable.msg_location_alert2);
            org.telegram.ui.Components.fj0 fj0Var = this.R;
            if (fj0Var != null) {
                fj0Var.a();
            }
            l0().k(0L, 24, Integer.valueOf(i11), user, null, null);
            return;
        }
        finishFragment();
    }

    public final void w0() {
        if (this.T.h() != 0 && this.Y.L0() == 0) {
            View childAt = this.U.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                this.U.v0(0, top, null);
            }
        }
    }

    public final void x0(boolean z10) {
        Integer num;
        float f7;
        org.telegram.ui.Components.rl rlVar;
        Location location;
        Location location2;
        if (this.G0 == 3) {
            z10 = true;
        }
        if (z10 && (rlVar = this.e) != null && rlVar.getTag() == null && ((location = this.f37712w0) == null || (location2 = this.f37714x0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        org.telegram.ui.Components.rl rlVar2 = this.e;
        if (rlVar2 != null) {
            if (!z10 || rlVar2.getTag() == null) {
                if (z10 || this.e.getTag() != null) {
                    org.telegram.ui.Components.rl rlVar3 = this.e;
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    rlVar3.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    org.telegram.ui.Components.rl rlVar4 = this.e;
                    Property property = View.TRANSLATION_X;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(rlVar4, property, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.es.f24466g);
                    animatorSet.start();
                }
            }
        }
    }

    public final void y0(boolean z10, boolean z11) {
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
            TextView textView = this.f37685b;
            if (!z10) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            TextView textView2 = this.f37685b;
            if (z10) {
                f11 = 1.0f;
            }
            textView2.setAlpha(f11);
            TextView textView3 = this.f37685b;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            textView3.setScaleX(f10);
            TextView textView4 = this.f37685b;
            if (z10) {
                f12 = 1.0f;
            }
            textView4.setScaleY(f12);
            return;
        }
        this.f37685b.setVisibility(0);
        ViewPropertyAnimator animate = this.f37685b.animate();
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
        scaleX.scaleY(f12).setInterpolator(org.telegram.ui.Components.es.h).setDuration(420L).withEndAction(new rc0(this, z10, 0)).start();
    }

    public final void z0(boolean z10) {
        int i10;
        int i11;
        int i12;
        FrameLayout.LayoutParams layoutParams;
        float f7;
        s4.b1 K = this.U.K(0);
        if (K != null) {
            i10 = (int) K.f44838a.getY();
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
                    id0 id0Var = this.f37713x;
                    if (id0Var != null) {
                        id0Var.setVisibility(4);
                    }
                }
            } else if (this.K.getView().getVisibility() == 4) {
                this.K.getView().setVisibility(0);
                this.S.setVisibility(0);
                id0 id0Var2 = this.f37713x;
                if (id0Var2 != null) {
                    id0Var2.setVisibility(0);
                }
            }
            this.S.setTranslationY(Math.min(0, i10));
            int i13 = -i10;
            int i14 = i13 / 2;
            this.K.getView().setTranslationY(Math.max(0, i14));
            id0 id0Var3 = this.f37713x;
            if (id0Var3 != null) {
                id0Var3.setTranslationY(Math.max(0, i14));
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
            this.f37687c.setTranslationY(min);
            di.d4 d4Var = this.f37715y;
            if (d4Var != null) {
                d4Var.setTranslationY(min);
            }
            org.telegram.ui.Components.rl rlVar = this.e;
            if (rlVar != null) {
                rlVar.f28565c = min;
                rlVar.setTranslationY(min + rlVar.f28564b);
            }
            View view = this.X;
            if (view != null) {
                if (view.getTag() == null) {
                    f7 = 48.0f;
                } else {
                    f7 = 69.0f;
                }
                int dp = (i11 / 2) + (i13 - AndroidUtilities.dp(f7));
                this.f37716y0 = dp;
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
                id0 id0Var4 = this.f37713x;
                if (id0Var4 != null && (layoutParams = (FrameLayout.LayoutParams) id0Var4.getLayoutParams()) != null) {
                    if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.H0) {
                        layoutParams.height = AndroidUtilities.dp(10.0f) + this.H0;
                        this.f37713x.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }
}
