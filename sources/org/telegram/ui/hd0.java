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
public class hd0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_channelLocation A0;
    public MessageObject B0;
    public boolean C0;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public final UndoView[] F;
    public cd0 F0;
    public boolean G;
    public final int G0;
    public boolean H;
    public int H0;
    public IMapsProvider.IMap I;
    public zc0 I0;
    public IMapsProvider.ICameraUpdate J;
    public rc0 J0;
    public IMapsProvider.IMapView K;
    public xc0 K0;
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
    public org.telegram.ui.Components.jj0 R;
    public k0 S;
    public vc0 T;
    public org.telegram.ui.Components.qm0 U;
    public org.telegram.ui.Components.qm0 V;
    public ad0 W;
    public View X;
    public s4.d0 Y;
    public org.telegram.ui.ActionBar.v0 Z;
    public ImageView f38253a;
    public boolean f38254a0;
    public TextView f38255b;
    public boolean f38256b0;
    public ImageView f38257c;
    public boolean f38258c0;
    public org.telegram.ui.ActionBar.v0 d;
    public boolean f38259d0;
    public org.telegram.ui.Components.vl f38260e;
    public long f38261e0;
    public LinearLayout f38262f;
    public boolean f38263f0;
    public final ArrayList f38264g0;
    public ImageView h;
    public final a0.i f38265h0;
    public long f38266i0;
    public boolean f38267j0;
    public final ArrayList f38268k0;
    public AnimatorSet f38269l0;
    public IMapsProvider.IMarker m0;
    public TextView f38270n;
    public gd0 f38271n0;
    public FrameLayout f38272o0;
    public boolean f38273p0;
    public boolean f38274q0;
    public TextView f38275r;
    public boolean f38276r0;
    public Drawable f38277s;
    public boolean f38278s0;
    public boolean f38279t0;
    public boolean f38280u0;
    public ai.o4 v;
    public boolean f38281v0;
    public org.telegram.ui.ActionBar.v0 f38282w;
    public Location f38283w0;
    public ed0 f38284x;
    public Location f38285x0;
    public ci.d4 f38286y;
    public int f38287y0;
    public TLRPC.TL_channelLocation f38288z0;

    public hd0(int i10) {
        super(null);
        this.F = new UndoView[2];
        this.f38256b0 = true;
        this.f38258c0 = false;
        this.f38259d0 = true;
        this.f38263f0 = true;
        this.f38264g0 = new ArrayList();
        this.f38265h0 = new a0.i();
        this.f38266i0 = -1L;
        this.f38268k0 = new ArrayList();
        this.f38273p0 = true;
        this.f38274q0 = true;
        this.H0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.O0 = true;
        this.Q0 = new Bitmap[7];
        this.G0 = i10;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static void U(hd0 hd0Var, boolean z10, TLRPC.User user, int i10) {
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z10) {
            LocationController.SharingLocationInfo sharingLocationInfo = hd0Var.getLocationController().getSharingLocationInfo(hd0Var.f38261e0);
            if (sharingLocationInfo != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = hd0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
                tL_messages_editMessage.f20121id = sharingLocationInfo.mid;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location lastKnownLocation = LocationController.getInstance(hd0Var.currentAccount).getLastKnownLocation();
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
                    hd0Var.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
                }
                hd0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
                return;
            }
            return;
        }
        hd0Var.v0(i10, user, 0);
    }

    public static void V(hd0 hd0Var) {
        rc0 rc0Var;
        hd0Var.getLocationController().markLiveLoactionsAsRead(hd0Var.f38261e0);
        if (!hd0Var.isPaused && (rc0Var = hd0Var.J0) != null) {
            AndroidUtilities.runOnUIThread(rc0Var, 5000L);
        }
    }

    public static IMapsProvider.LatLng o0(IMapsProvider.LatLng latLng, double d, double d10) {
        double degrees = Math.toDegrees(d10 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final void A0() {
        if (this.f38276r0) {
            if (this.f38279t0) {
                this.V.setEmptyView(null);
                this.f38262f.setVisibility(8);
                this.V.setVisibility(8);
                return;
            }
            this.V.setEmptyView(this.f38262f);
            return;
        }
        this.f38262f.setVisibility(8);
    }

    public final void B0() {
        int i10;
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.f38255b == null) {
            return;
        }
        boolean z11 = false;
        if (this.f38267j0) {
            y0(false, true);
            i0();
            return;
        }
        if (getConnectionsManager() != null) {
            i10 = getConnectionsManager().getCurrentTime();
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.f38264g0;
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.Message message = ((bd0) arrayList.get(i13)).f36281b;
            if (message != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                i12++;
            }
        }
        if (this.f38265h0.f(getUserConfig().getClientUserId()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f38283w0 != null && !z10) {
            i12++;
        }
        if (i12 >= 2) {
            z11 = true;
        }
        y0(z11, true);
    }

    public final bd0 b0(TLRPC.Message message) {
        bd0 bd0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.i iVar = this.f38265h0;
        bd0 bd0Var2 = (bd0) iVar.f(fromChatId);
        if (bd0Var2 == null) {
            ?? obj = new Object();
            obj.f36281b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f36282c = getMessagesController().getUser(Long.valueOf(obj.f36281b.from_id.user_id));
                obj.f36280a = obj.f36281b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    obj.f36282c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    obj.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                obj.f36280a = dialogId;
            }
            u0(obj);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap f02 = f0(obj);
                bd0Var = obj;
                if (f02 != null) {
                    position.icon(f02);
                    position.anchor(0.5f, 0.907f);
                    obj.f36283e = this.I.addMarker(position);
                    if (!UserObject.isUserSelf(obj.f36282c)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.I.addMarker(flat);
                        obj.f36284f = addMarker;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            addMarker.setRotation(i10);
                            obj.f36284f.setIcon(R.drawable.map_pin_cone2);
                            obj.f36285g = true;
                        } else {
                            addMarker.setRotation(0);
                            obj.f36284f.setIcon(R.drawable.map_pin_circle);
                            obj.f36285g = false;
                        }
                    }
                    this.f38264g0.add(obj);
                    iVar.k(obj, obj.f36280a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f38261e0);
                    int i11 = (obj.f36280a > getUserConfig().getClientUserId() ? 1 : (obj.f36280a == getUserConfig().getClientUserId() ? 0 : -1));
                    bd0Var = obj;
                    bd0Var = obj;
                    if (i11 == 0 && sharingLocationInfo != null) {
                        int i12 = obj.f36281b.f20059id;
                        bd0Var = obj;
                        if (i12 == sharingLocationInfo.mid) {
                            Location location = this.f38283w0;
                            bd0Var = obj;
                            if (location != null) {
                                obj.f36283e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.f38283w0.getLongitude()));
                                bd0Var = obj;
                            }
                        }
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                bd0Var = obj;
            }
        } else {
            bd0Var2.f36281b = message;
            bd0Var2.f36283e.setPosition(latLng);
            int i13 = (this.f38266i0 > bd0Var2.f36280a ? 1 : (this.f38266i0 == bd0Var2.f36280a ? 0 : -1));
            bd0Var = bd0Var2;
            if (i13 == 0) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(bd0Var2.f36283e.getPosition()));
                bd0Var = bd0Var2;
            }
        }
        org.telegram.ui.Components.jj0 jj0Var = this.R;
        if (jj0Var != null) {
            jj0Var.c(true);
        }
        B0();
        return bd0Var;
    }

    public final boolean c0() {
        if (g0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                    alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new pc0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.f20374a);
                    return false;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
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
        this.f38278s0 = false;
        this.f38276r0 = false;
        this.f38279t0 = false;
        vc0 vc0Var = this.T;
        if (vc0Var != null) {
            vc0Var.F();
        }
        ad0 ad0Var = this.W;
        if (ad0Var != null) {
            ad0Var.F();
        }
        if (this.f38288z0 != null) {
            Location location = new Location("network");
            this.f38285x0 = location;
            location.setLatitude(this.f38288z0.geo_point.lat);
            this.f38285x0.setLongitude(this.f38288z0.geo_point._long);
        } else if (this.B0 != null) {
            Location location2 = new Location("network");
            this.f38285x0 = location2;
            location2.setLatitude(this.B0.messageOwner.media.geo.lat);
            this.f38285x0.setLongitude(this.B0.messageOwner.media.geo._long);
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38258c0 = z10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.i6.f20868h5;
        kVar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.i6.f20905j5;
        kVar2.setTitleColor(getThemedColor(i13));
        this.actionBar.D(getThemedColor(i13), false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.i6.I5), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new uc0(this));
        org.telegram.ui.ActionBar.z o9 = this.actionBar.o();
        TLRPC.TL_channelLocation tL_channelLocation = this.f38288z0;
        int i14 = this.G0;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.B0;
            if (messageObject != null) {
                if (messageObject.isLiveLocation()) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                    org.telegram.ui.ActionBar.v0 c10 = o9.c(0, R.drawable.ic_ab_other, getResourceProvider());
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
                        org.telegram.ui.ActionBar.v0 c11 = o9.c(0, R.drawable.ic_ab_other, getResourceProvider());
                        this.Z = c11;
                        c11.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                        if (!getLocationController().isSharingLocation(this.f38261e0) && this.O0) {
                            this.Z.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                        }
                        this.Z.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                    }
                }
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i14 != 4) {
                    this.f38284x = new ed0(this, context);
                    org.telegram.ui.ActionBar.v0 c12 = o9.c(0, R.drawable.outline_header_search, getResourceProvider());
                    c12.F();
                    c12.H = new hg.e2(this, 12);
                    this.f38282w = c12;
                    c12.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.f38282w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.f38282w.getSearchField();
                    searchField.setTextColor(getThemedColor(i13));
                    searchField.setCursorColor(getThemedColor(i13));
                    searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Vd));
                }
            }
        }
        fd0 fd0Var = new fd0(this, context);
        this.fragmentView = fd0Var;
        fd0Var.setBackgroundColor(getThemedColor(i12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f38277s = mutate;
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.f38277s.getPadding(rect);
        if (i14 != 0 && i14 != 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top);
        }
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        layoutParams2.gravity = 83;
        k0 k0Var = new k0(this, context, 11);
        this.S = k0Var;
        k0Var.setBackgroundDrawable(new org.telegram.ui.Components.hd(m0()));
        MessageObject messageObject2 = this.B0;
        if ((messageObject2 == null && (i14 == 0 || i14 == 1)) || (messageObject2 != null && i14 == 3)) {
            org.telegram.ui.Components.vl vlVar = new org.telegram.ui.Components.vl(context, 1);
            this.f38260e = vlVar;
            vlVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int dp = AndroidUtilities.dp(40.0f);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.wi);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.i6.xi);
            org.telegram.ui.Cells.z j02 = org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3);
            w7.z5.a(this.f38260e);
            this.f38260e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.f38260e.setOutlineProvider(yf.i0.f52170b);
            this.f38260e.setBackgroundDrawable(j02);
            this.f38260e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.vi));
            this.f38260e.setTextSize(1, 14.0f);
            this.f38260e.setTypeface(AndroidUtilities.bold());
            this.f38260e.setGravity(17);
            this.f38260e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.S.addView(this.f38260e, w7.x5.a(40.0f, 80.0f, 12.0f, 80.0f, 0.0f, -2, 49));
            if (i14 == 3) {
                this.f38260e.setText(LocaleController.getString(R.string.OpenInMaps));
                this.f38260e.setOnClickListener(new View.OnClickListener(this) {
                    public final hd0 f40494b;

                    {
                        this.f40494b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        IMapsProvider.IMap iMap;
                        TLRPC.User user;
                        boolean z14;
                        int i15 = r2;
                        hd0 hd0Var = this.f40494b;
                        switch (i15) {
                            case 0:
                                hd0Var.x0(false);
                                hd0Var.T.H(null, hd0Var.f38285x0, true);
                                hd0Var.D0 = true;
                                hd0Var.w0();
                                return;
                            case 1:
                                hd0Var.d.M(null, null);
                                return;
                            case 2:
                                int i16 = hd0Var.G0;
                                Activity parentActivity = hd0Var.getParentActivity();
                                if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                    if (hd0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hd0Var.getParentActivity());
                                        alertDialog$Builder.m(R.raw.permission_request_location, 72, hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                                        b2Var.T = replaceTags;
                                        alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new pc0(hd0Var, 1));
                                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                        hd0Var.showDialog(b2Var);
                                        return;
                                    }
                                    return;
                                } else if (hd0Var.c0() || i16 == 3) {
                                    if ((hd0Var.B0 != null && i16 != 3) || hd0Var.f38288z0 != null) {
                                        if (hd0Var.f38283w0 != null && (iMap = hd0Var.I) != null) {
                                            iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(hd0Var.f38283w0.getLatitude(), hd0Var.f38283w0.getLongitude()), hd0Var.I.getMaxZoomLevel() - 4.0f));
                                        }
                                    } else if (hd0Var.f38283w0 != null && hd0Var.I != null) {
                                        ImageView imageView = hd0Var.f38253a;
                                        int i17 = org.telegram.ui.ActionBar.i6.vi;
                                        imageView.setColorFilter(new PorterDuffColorFilter(hd0Var.getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
                                        hd0Var.f38253a.setTag(Integer.valueOf(i17));
                                        hd0Var.T.L(null);
                                        hd0Var.C0 = false;
                                        hd0Var.x0(false);
                                        hd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(hd0Var.f38283w0.getLatitude(), hd0Var.f38283w0.getLongitude())));
                                        if (hd0Var.D0 && i16 != 8) {
                                            Location location3 = hd0Var.f38283w0;
                                            if (location3 != null) {
                                                hd0Var.T.H(null, location3, true);
                                            }
                                            hd0Var.D0 = false;
                                            hd0Var.w0();
                                        }
                                    }
                                    if (hd0Var.m0 != null) {
                                        hd0Var.X.setVisibility(0);
                                        ed0 ed0Var = hd0Var.f38284x;
                                        IMapsProvider.IMarker iMarker = hd0Var.m0;
                                        HashMap hashMap = ed0Var.f37231a;
                                        View view2 = (View) hashMap.get(iMarker);
                                        if (view2 != null) {
                                            ed0Var.removeView(view2);
                                            hashMap.remove(iMarker);
                                        }
                                        hd0Var.m0 = null;
                                        hd0Var.f38271n0 = null;
                                        hd0Var.f38272o0 = null;
                                        return;
                                    }
                                    return;
                                } else {
                                    return;
                                }
                            case 3:
                                hd0Var.f38266i0 = -1L;
                                hd0Var.C0 = true;
                                if (hd0Var.i0()) {
                                    hd0Var.f38267j0 = true;
                                    hd0Var.y0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (hd0Var.getParentActivity() != null && hd0Var.f38283w0 != null && hd0Var.c0() && hd0Var.I != null) {
                                    ci.d4 d4Var = hd0Var.f38286y;
                                    if (d4Var != null) {
                                        d4Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = hd0Var.getLocationController().getSharingLocationInfo(hd0Var.f38261e0);
                                    if (hd0Var.G) {
                                        hd0Var.F[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        hd0Var.f38257c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = hd0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            hd0Var.O = null;
                                        }
                                        hd0Var.G = true;
                                        hd0Var.l0().k(0L, 25, 0, null, new rc0(hd0Var, 1), new m70(20, hd0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = hd0Var.O;
                                    if (iCircle2 == null) {
                                        hd0Var.d0(500);
                                    } else {
                                        hd0Var.P = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(hd0Var.f38261e0)) {
                                        user = hd0Var.getMessagesController().getUser(Long.valueOf(hd0Var.f38261e0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity2 = hd0Var.getParentActivity();
                                    pc0 pc0Var = new pc0(hd0Var, 3);
                                    rw rwVar = new rw(15, hd0Var, user);
                                    rc0 rc0Var = new rc0(hd0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity2);
                                    frameLayout.f27723a = null;
                                    frameLayout.d = -1;
                                    frameLayout.f27726e = false;
                                    frameLayout.f27727f = false;
                                    frameLayout.h = null;
                                    frameLayout.f27728n = new Rect();
                                    new Paint();
                                    frameLayout.f27731w = true;
                                    frameLayout.F = org.telegram.ui.Components.hs.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.Q = rc0Var;
                                    frameLayout.f27733y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false), PorterDuff.Mode.MULTIPLY));
                                    mutate2.getPadding(rect2);
                                    int i18 = rect2.left;
                                    frameLayout.f27732x = i18;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i18, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i18, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, w7.x5.e(-1, -2, 80));
                                    frameLayout.O = LocaleController.getUseImperialSystemType();
                                    frameLayout.M = user;
                                    frameLayout.I = pc0Var;
                                    org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, null);
                                    frameLayout.G = ud0Var;
                                    ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    ud0Var.setItemCount(5);
                                    org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, null);
                                    frameLayout.H = ud0Var2;
                                    ud0Var2.setItemCount(5);
                                    ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(frameLayout, parentActivity2);
                                    frameLayout.P = gj0Var;
                                    gj0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                                    gj0Var.addView(frameLayout3, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity2);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false), 1, textView);
                                    frameLayout3.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                                    textView.setOnTouchListener(new bi.d(20));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    gj0Var.addView(linearLayout, w7.x5.n(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                                    TextView textView2 = new TextView(parentActivity2);
                                    frameLayout.K = textView2;
                                    ?? textView3 = new TextView(parentActivity2);
                                    frameLayout.J = textView3;
                                    linearLayout.addView(ud0Var, w7.x5.l(0.5f, 0, 270));
                                    ud0Var.setFormatter(new org.telegram.ui.Components.ej0(frameLayout, 0));
                                    ud0Var.setMinValue(0);
                                    ud0Var.setMaxValue(10);
                                    ud0Var.setWrapSelectorWheel(false);
                                    ud0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(frameLayout, 1);
                                    ud0Var.setOnValueChangedListener(ej0Var);
                                    ud0Var2.setMinValue(0);
                                    ud0Var2.setMaxValue(10);
                                    ud0Var2.setWrapSelectorWheel(false);
                                    ud0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(ud0Var2, w7.x5.l(0.5f, 0, 270));
                                    ud0Var2.setFormatter(new org.telegram.ui.Components.ej0(frameLayout, 2));
                                    ud0Var2.setOnValueChangedListener(ej0Var);
                                    ud0Var.setValue(0);
                                    ud0Var2.setValue(6);
                                    gj0Var.addView(frameLayout4, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                                    frameLayout4.addView((View) textView3, w7.x5.d(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.ut(11, frameLayout, rwVar));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21036q5, false));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, w7.x5.d(48.0f, -1));
                                    frameLayout2.addView(gj0Var, w7.x5.e(-1, -2, 51));
                                    hd0Var.R = frameLayout;
                                    ((FrameLayout) hd0Var.fragmentView).addView((View) frameLayout, w7.x5.d(-1.0f, -1));
                                    org.telegram.ui.Components.jj0 jj0Var = hd0Var.R;
                                    jj0Var.f27729r = false;
                                    AnimatorSet animatorSet = jj0Var.f27730s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        jj0Var.f27730s = null;
                                    }
                                    org.telegram.ui.Components.fj0 fj0Var = jj0Var.v;
                                    fj0Var.measure(View.MeasureSpec.makeMeasureSpec((jj0Var.f27732x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (jj0Var.f27729r) {
                                        z14 = true;
                                    } else {
                                        fj0Var.setVisibility(0);
                                        if (jj0Var.f27731w) {
                                            jj0Var.setLayerType(2, null);
                                        }
                                        fj0Var.setTranslationY(fj0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        jj0Var.f27730s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(fj0Var, View.TRANSLATION_Y, 0.0f));
                                        jj0Var.f27730s.setDuration(400L);
                                        jj0Var.f27730s.setStartDelay(20L);
                                        jj0Var.f27730s.setInterpolator(jj0Var.F);
                                        z14 = true;
                                        jj0Var.f27730s.addListener(new org.telegram.ui.Components.ij0(jj0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        jj0Var.f27730s.start();
                                    }
                                    jj0Var.c(z14);
                                    return;
                                }
                                return;
                            default:
                                hd0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = hd0Var.B0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    hd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    return;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                        }
                    }
                });
                this.f38260e.setTranslationX(0.0f);
            } else {
                this.f38260e.setText(LocaleController.getString(R.string.PlacesInThisArea));
                this.f38260e.setOnClickListener(new View.OnClickListener(this) {
                    public final hd0 f40494b;

                    {
                        this.f40494b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        IMapsProvider.IMap iMap;
                        TLRPC.User user;
                        boolean z14;
                        int i15 = r2;
                        hd0 hd0Var = this.f40494b;
                        switch (i15) {
                            case 0:
                                hd0Var.x0(false);
                                hd0Var.T.H(null, hd0Var.f38285x0, true);
                                hd0Var.D0 = true;
                                hd0Var.w0();
                                return;
                            case 1:
                                hd0Var.d.M(null, null);
                                return;
                            case 2:
                                int i16 = hd0Var.G0;
                                Activity parentActivity = hd0Var.getParentActivity();
                                if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                    if (hd0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hd0Var.getParentActivity());
                                        alertDialog$Builder.m(R.raw.permission_request_location, 72, hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                                        b2Var.T = replaceTags;
                                        alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new pc0(hd0Var, 1));
                                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                        hd0Var.showDialog(b2Var);
                                        return;
                                    }
                                    return;
                                } else if (hd0Var.c0() || i16 == 3) {
                                    if ((hd0Var.B0 != null && i16 != 3) || hd0Var.f38288z0 != null) {
                                        if (hd0Var.f38283w0 != null && (iMap = hd0Var.I) != null) {
                                            iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(hd0Var.f38283w0.getLatitude(), hd0Var.f38283w0.getLongitude()), hd0Var.I.getMaxZoomLevel() - 4.0f));
                                        }
                                    } else if (hd0Var.f38283w0 != null && hd0Var.I != null) {
                                        ImageView imageView = hd0Var.f38253a;
                                        int i17 = org.telegram.ui.ActionBar.i6.vi;
                                        imageView.setColorFilter(new PorterDuffColorFilter(hd0Var.getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
                                        hd0Var.f38253a.setTag(Integer.valueOf(i17));
                                        hd0Var.T.L(null);
                                        hd0Var.C0 = false;
                                        hd0Var.x0(false);
                                        hd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(hd0Var.f38283w0.getLatitude(), hd0Var.f38283w0.getLongitude())));
                                        if (hd0Var.D0 && i16 != 8) {
                                            Location location3 = hd0Var.f38283w0;
                                            if (location3 != null) {
                                                hd0Var.T.H(null, location3, true);
                                            }
                                            hd0Var.D0 = false;
                                            hd0Var.w0();
                                        }
                                    }
                                    if (hd0Var.m0 != null) {
                                        hd0Var.X.setVisibility(0);
                                        ed0 ed0Var = hd0Var.f38284x;
                                        IMapsProvider.IMarker iMarker = hd0Var.m0;
                                        HashMap hashMap = ed0Var.f37231a;
                                        View view2 = (View) hashMap.get(iMarker);
                                        if (view2 != null) {
                                            ed0Var.removeView(view2);
                                            hashMap.remove(iMarker);
                                        }
                                        hd0Var.m0 = null;
                                        hd0Var.f38271n0 = null;
                                        hd0Var.f38272o0 = null;
                                        return;
                                    }
                                    return;
                                } else {
                                    return;
                                }
                            case 3:
                                hd0Var.f38266i0 = -1L;
                                hd0Var.C0 = true;
                                if (hd0Var.i0()) {
                                    hd0Var.f38267j0 = true;
                                    hd0Var.y0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (hd0Var.getParentActivity() != null && hd0Var.f38283w0 != null && hd0Var.c0() && hd0Var.I != null) {
                                    ci.d4 d4Var = hd0Var.f38286y;
                                    if (d4Var != null) {
                                        d4Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = hd0Var.getLocationController().getSharingLocationInfo(hd0Var.f38261e0);
                                    if (hd0Var.G) {
                                        hd0Var.F[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        hd0Var.f38257c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = hd0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            hd0Var.O = null;
                                        }
                                        hd0Var.G = true;
                                        hd0Var.l0().k(0L, 25, 0, null, new rc0(hd0Var, 1), new m70(20, hd0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = hd0Var.O;
                                    if (iCircle2 == null) {
                                        hd0Var.d0(500);
                                    } else {
                                        hd0Var.P = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(hd0Var.f38261e0)) {
                                        user = hd0Var.getMessagesController().getUser(Long.valueOf(hd0Var.f38261e0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity2 = hd0Var.getParentActivity();
                                    pc0 pc0Var = new pc0(hd0Var, 3);
                                    rw rwVar = new rw(15, hd0Var, user);
                                    rc0 rc0Var = new rc0(hd0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity2);
                                    frameLayout.f27723a = null;
                                    frameLayout.d = -1;
                                    frameLayout.f27726e = false;
                                    frameLayout.f27727f = false;
                                    frameLayout.h = null;
                                    frameLayout.f27728n = new Rect();
                                    new Paint();
                                    frameLayout.f27731w = true;
                                    frameLayout.F = org.telegram.ui.Components.hs.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.Q = rc0Var;
                                    frameLayout.f27733y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false), PorterDuff.Mode.MULTIPLY));
                                    mutate2.getPadding(rect2);
                                    int i18 = rect2.left;
                                    frameLayout.f27732x = i18;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i18, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i18, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, w7.x5.e(-1, -2, 80));
                                    frameLayout.O = LocaleController.getUseImperialSystemType();
                                    frameLayout.M = user;
                                    frameLayout.I = pc0Var;
                                    org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, null);
                                    frameLayout.G = ud0Var;
                                    ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    ud0Var.setItemCount(5);
                                    org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, null);
                                    frameLayout.H = ud0Var2;
                                    ud0Var2.setItemCount(5);
                                    ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(frameLayout, parentActivity2);
                                    frameLayout.P = gj0Var;
                                    gj0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                                    gj0Var.addView(frameLayout3, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity2);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false), 1, textView);
                                    frameLayout3.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                                    textView.setOnTouchListener(new bi.d(20));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    gj0Var.addView(linearLayout, w7.x5.n(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                                    TextView textView2 = new TextView(parentActivity2);
                                    frameLayout.K = textView2;
                                    ?? textView3 = new TextView(parentActivity2);
                                    frameLayout.J = textView3;
                                    linearLayout.addView(ud0Var, w7.x5.l(0.5f, 0, 270));
                                    ud0Var.setFormatter(new org.telegram.ui.Components.ej0(frameLayout, 0));
                                    ud0Var.setMinValue(0);
                                    ud0Var.setMaxValue(10);
                                    ud0Var.setWrapSelectorWheel(false);
                                    ud0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(frameLayout, 1);
                                    ud0Var.setOnValueChangedListener(ej0Var);
                                    ud0Var2.setMinValue(0);
                                    ud0Var2.setMaxValue(10);
                                    ud0Var2.setWrapSelectorWheel(false);
                                    ud0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(ud0Var2, w7.x5.l(0.5f, 0, 270));
                                    ud0Var2.setFormatter(new org.telegram.ui.Components.ej0(frameLayout, 2));
                                    ud0Var2.setOnValueChangedListener(ej0Var);
                                    ud0Var.setValue(0);
                                    ud0Var2.setValue(6);
                                    gj0Var.addView(frameLayout4, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                                    frameLayout4.addView((View) textView3, w7.x5.d(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.ut(11, frameLayout, rwVar));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21036q5, false));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, w7.x5.d(48.0f, -1));
                                    frameLayout2.addView(gj0Var, w7.x5.e(-1, -2, 51));
                                    hd0Var.R = frameLayout;
                                    ((FrameLayout) hd0Var.fragmentView).addView((View) frameLayout, w7.x5.d(-1.0f, -1));
                                    org.telegram.ui.Components.jj0 jj0Var = hd0Var.R;
                                    jj0Var.f27729r = false;
                                    AnimatorSet animatorSet = jj0Var.f27730s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        jj0Var.f27730s = null;
                                    }
                                    org.telegram.ui.Components.fj0 fj0Var = jj0Var.v;
                                    fj0Var.measure(View.MeasureSpec.makeMeasureSpec((jj0Var.f27732x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (jj0Var.f27729r) {
                                        z14 = true;
                                    } else {
                                        fj0Var.setVisibility(0);
                                        if (jj0Var.f27731w) {
                                            jj0Var.setLayerType(2, null);
                                        }
                                        fj0Var.setTranslationY(fj0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        jj0Var.f27730s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(fj0Var, View.TRANSLATION_Y, 0.0f));
                                        jj0Var.f27730s.setDuration(400L);
                                        jj0Var.f27730s.setStartDelay(20L);
                                        jj0Var.f27730s.setInterpolator(jj0Var.F);
                                        z14 = true;
                                        jj0Var.f27730s.addListener(new org.telegram.ui.Components.ij0(jj0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        jj0Var.f27730s.start();
                                    }
                                    jj0Var.c(z14);
                                    return;
                                }
                                return;
                            default:
                                hd0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = hd0Var.B0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    hd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    return;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                        }
                    }
                });
            }
        }
        int i15 = org.telegram.ui.ActionBar.i6.ui;
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, getThemedColor(i15), false, getResourceProvider());
        this.d = v0Var;
        v0Var.setClickable(true);
        this.d.setSubMenuOpenSide(2);
        this.d.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        this.d.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        this.d.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), getResourceProvider());
        this.d.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), getResourceProvider());
        this.d.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), getResourceProvider());
        this.d.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int dp2 = AndroidUtilities.dp(40.0f);
        int i16 = org.telegram.ui.ActionBar.i6.wi;
        int themedColor4 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.i6.xi;
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.i6.i0(dp2, themedColor4, getThemedColor(i17));
        w7.z5.a(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.d;
        ai.l2 l2Var = yf.i0.f52169a;
        v0Var2.setOutlineProvider(l2Var);
        this.d.setBackgroundDrawable(i02);
        this.d.setIcon(R.drawable.msg_map_type);
        this.S.addView(this.d, w7.x5.a(40.0f, 0.0f, 12.0f, 12.0f, 0.0f, 40, 53));
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final hd0 f40494b;

            {
                this.f40494b = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                hd0 hd0Var = this.f40494b;
                switch (i152) {
                    case 0:
                        hd0Var.x0(false);
                        hd0Var.T.H(null, hd0Var.f38285x0, true);
                        hd0Var.D0 = true;
                        hd0Var.w0();
                        return;
                    case 1:
                        hd0Var.d.M(null, null);
                        return;
                    case 2:
                        int i162 = hd0Var.G0;
                        Activity parentActivity = hd0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (hd0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hd0Var.getParentActivity());
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                                b2Var.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new pc0(hd0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                hd0Var.showDialog(b2Var);
                                return;
                            }
                            return;
                        } else if (hd0Var.c0() || i162 == 3) {
                            if ((hd0Var.B0 != null && i162 != 3) || hd0Var.f38288z0 != null) {
                                if (hd0Var.f38283w0 != null && (iMap = hd0Var.I) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(hd0Var.f38283w0.getLatitude(), hd0Var.f38283w0.getLongitude()), hd0Var.I.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (hd0Var.f38283w0 != null && hd0Var.I != null) {
                                ImageView imageView = hd0Var.f38253a;
                                int i172 = org.telegram.ui.ActionBar.i6.vi;
                                imageView.setColorFilter(new PorterDuffColorFilter(hd0Var.getThemedColor(i172), PorterDuff.Mode.MULTIPLY));
                                hd0Var.f38253a.setTag(Integer.valueOf(i172));
                                hd0Var.T.L(null);
                                hd0Var.C0 = false;
                                hd0Var.x0(false);
                                hd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(hd0Var.f38283w0.getLatitude(), hd0Var.f38283w0.getLongitude())));
                                if (hd0Var.D0 && i162 != 8) {
                                    Location location3 = hd0Var.f38283w0;
                                    if (location3 != null) {
                                        hd0Var.T.H(null, location3, true);
                                    }
                                    hd0Var.D0 = false;
                                    hd0Var.w0();
                                }
                            }
                            if (hd0Var.m0 != null) {
                                hd0Var.X.setVisibility(0);
                                ed0 ed0Var = hd0Var.f38284x;
                                IMapsProvider.IMarker iMarker = hd0Var.m0;
                                HashMap hashMap = ed0Var.f37231a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    ed0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                hd0Var.m0 = null;
                                hd0Var.f38271n0 = null;
                                hd0Var.f38272o0 = null;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        hd0Var.f38266i0 = -1L;
                        hd0Var.C0 = true;
                        if (hd0Var.i0()) {
                            hd0Var.f38267j0 = true;
                            hd0Var.y0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (hd0Var.getParentActivity() != null && hd0Var.f38283w0 != null && hd0Var.c0() && hd0Var.I != null) {
                            ci.d4 d4Var = hd0Var.f38286y;
                            if (d4Var != null) {
                                d4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = hd0Var.getLocationController().getSharingLocationInfo(hd0Var.f38261e0);
                            if (hd0Var.G) {
                                hd0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                hd0Var.f38257c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = hd0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    hd0Var.O = null;
                                }
                                hd0Var.G = true;
                                hd0Var.l0().k(0L, 25, 0, null, new rc0(hd0Var, 1), new m70(20, hd0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = hd0Var.O;
                            if (iCircle2 == null) {
                                hd0Var.d0(500);
                            } else {
                                hd0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(hd0Var.f38261e0)) {
                                user = hd0Var.getMessagesController().getUser(Long.valueOf(hd0Var.f38261e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity2 = hd0Var.getParentActivity();
                            pc0 pc0Var = new pc0(hd0Var, 3);
                            rw rwVar = new rw(15, hd0Var, user);
                            rc0 rc0Var = new rc0(hd0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity2);
                            frameLayout.f27723a = null;
                            frameLayout.d = -1;
                            frameLayout.f27726e = false;
                            frameLayout.f27727f = false;
                            frameLayout.h = null;
                            frameLayout.f27728n = new Rect();
                            new Paint();
                            frameLayout.f27731w = true;
                            frameLayout.F = org.telegram.ui.Components.hs.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = rc0Var;
                            frameLayout.f27733y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i18 = rect2.left;
                            frameLayout.f27732x = i18;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i18, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i18, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.x5.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = pc0Var;
                            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.G = ud0Var;
                            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            ud0Var.setItemCount(5);
                            org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.H = ud0Var2;
                            ud0Var2.setItemCount(5);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(frameLayout, parentActivity2);
                            frameLayout.P = gj0Var;
                            gj0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                            gj0Var.addView(frameLayout3, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity2);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false), 1, textView);
                            frameLayout3.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView.setOnTouchListener(new bi.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            gj0Var.addView(linearLayout, w7.x5.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                            TextView textView2 = new TextView(parentActivity2);
                            frameLayout.K = textView2;
                            ?? textView3 = new TextView(parentActivity2);
                            frameLayout.J = textView3;
                            linearLayout.addView(ud0Var, w7.x5.l(0.5f, 0, 270));
                            ud0Var.setFormatter(new org.telegram.ui.Components.ej0(frameLayout, 0));
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(10);
                            ud0Var.setWrapSelectorWheel(false);
                            ud0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(frameLayout, 1);
                            ud0Var.setOnValueChangedListener(ej0Var);
                            ud0Var2.setMinValue(0);
                            ud0Var2.setMaxValue(10);
                            ud0Var2.setWrapSelectorWheel(false);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(ud0Var2, w7.x5.l(0.5f, 0, 270));
                            ud0Var2.setFormatter(new org.telegram.ui.Components.ej0(frameLayout, 2));
                            ud0Var2.setOnValueChangedListener(ej0Var);
                            ud0Var.setValue(0);
                            ud0Var2.setValue(6);
                            gj0Var.addView(frameLayout4, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                            frameLayout4.addView((View) textView3, w7.x5.d(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.ut(11, frameLayout, rwVar));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21036q5, false));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, w7.x5.d(48.0f, -1));
                            frameLayout2.addView(gj0Var, w7.x5.e(-1, -2, 51));
                            hd0Var.R = frameLayout;
                            ((FrameLayout) hd0Var.fragmentView).addView((View) frameLayout, w7.x5.d(-1.0f, -1));
                            org.telegram.ui.Components.jj0 jj0Var = hd0Var.R;
                            jj0Var.f27729r = false;
                            AnimatorSet animatorSet = jj0Var.f27730s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                jj0Var.f27730s = null;
                            }
                            org.telegram.ui.Components.fj0 fj0Var = jj0Var.v;
                            fj0Var.measure(View.MeasureSpec.makeMeasureSpec((jj0Var.f27732x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (jj0Var.f27729r) {
                                z14 = true;
                            } else {
                                fj0Var.setVisibility(0);
                                if (jj0Var.f27731w) {
                                    jj0Var.setLayerType(2, null);
                                }
                                fj0Var.setTranslationY(fj0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                jj0Var.f27730s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(fj0Var, View.TRANSLATION_Y, 0.0f));
                                jj0Var.f27730s.setDuration(400L);
                                jj0Var.f27730s.setStartDelay(20L);
                                jj0Var.f27730s.setInterpolator(jj0Var.F);
                                z14 = true;
                                jj0Var.f27730s.addListener(new org.telegram.ui.Components.ij0(jj0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                jj0Var.f27730s.start();
                            }
                            jj0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        hd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = hd0Var.B0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            hd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                }
            }
        });
        this.d.setDelegate(new pc0(this, 0));
        this.f38253a = new ImageView(context);
        org.telegram.ui.Cells.z i03 = org.telegram.ui.ActionBar.i6.i0(AndroidUtilities.dp(40.0f), getThemedColor(i16), getThemedColor(i17));
        w7.z5.a(this.f38253a);
        this.f38253a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f38253a.setOutlineProvider(l2Var);
        this.f38253a.setBackground(i03);
        this.f38253a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.f38253a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f38253a;
        int i18 = org.telegram.ui.ActionBar.i6.vi;
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), mode));
        this.f38253a.setTag(Integer.valueOf(i18));
        this.f38253a.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams a2 = w7.x5.a(40.0f, 0.0f, 0.0f, 12.0f, 12.0f, 40, 85);
        a2.bottomMargin = (layoutParams2.height - rect.top) + a2.bottomMargin;
        this.S.addView(this.f38253a, a2);
        this.f38253a.setOnClickListener(new View.OnClickListener(this) {
            public final hd0 f40494b;

            {
                this.f40494b = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                hd0 hd0Var = this.f40494b;
                switch (i152) {
                    case 0:
                        hd0Var.x0(false);
                        hd0Var.T.H(null, hd0Var.f38285x0, true);
                        hd0Var.D0 = true;
                        hd0Var.w0();
                        return;
                    case 1:
                        hd0Var.d.M(null, null);
                        return;
                    case 2:
                        int i162 = hd0Var.G0;
                        Activity parentActivity = hd0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (hd0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hd0Var.getParentActivity());
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                                b2Var.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new pc0(hd0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                hd0Var.showDialog(b2Var);
                                return;
                            }
                            return;
                        } else if (hd0Var.c0() || i162 == 3) {
                            if ((hd0Var.B0 != null && i162 != 3) || hd0Var.f38288z0 != null) {
                                if (hd0Var.f38283w0 != null && (iMap = hd0Var.I) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(hd0Var.f38283w0.getLatitude(), hd0Var.f38283w0.getLongitude()), hd0Var.I.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (hd0Var.f38283w0 != null && hd0Var.I != null) {
                                ImageView imageView3 = hd0Var.f38253a;
                                int i172 = org.telegram.ui.ActionBar.i6.vi;
                                imageView3.setColorFilter(new PorterDuffColorFilter(hd0Var.getThemedColor(i172), PorterDuff.Mode.MULTIPLY));
                                hd0Var.f38253a.setTag(Integer.valueOf(i172));
                                hd0Var.T.L(null);
                                hd0Var.C0 = false;
                                hd0Var.x0(false);
                                hd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(hd0Var.f38283w0.getLatitude(), hd0Var.f38283w0.getLongitude())));
                                if (hd0Var.D0 && i162 != 8) {
                                    Location location3 = hd0Var.f38283w0;
                                    if (location3 != null) {
                                        hd0Var.T.H(null, location3, true);
                                    }
                                    hd0Var.D0 = false;
                                    hd0Var.w0();
                                }
                            }
                            if (hd0Var.m0 != null) {
                                hd0Var.X.setVisibility(0);
                                ed0 ed0Var = hd0Var.f38284x;
                                IMapsProvider.IMarker iMarker = hd0Var.m0;
                                HashMap hashMap = ed0Var.f37231a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    ed0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                hd0Var.m0 = null;
                                hd0Var.f38271n0 = null;
                                hd0Var.f38272o0 = null;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        hd0Var.f38266i0 = -1L;
                        hd0Var.C0 = true;
                        if (hd0Var.i0()) {
                            hd0Var.f38267j0 = true;
                            hd0Var.y0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (hd0Var.getParentActivity() != null && hd0Var.f38283w0 != null && hd0Var.c0() && hd0Var.I != null) {
                            ci.d4 d4Var = hd0Var.f38286y;
                            if (d4Var != null) {
                                d4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = hd0Var.getLocationController().getSharingLocationInfo(hd0Var.f38261e0);
                            if (hd0Var.G) {
                                hd0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                hd0Var.f38257c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = hd0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    hd0Var.O = null;
                                }
                                hd0Var.G = true;
                                hd0Var.l0().k(0L, 25, 0, null, new rc0(hd0Var, 1), new m70(20, hd0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = hd0Var.O;
                            if (iCircle2 == null) {
                                hd0Var.d0(500);
                            } else {
                                hd0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(hd0Var.f38261e0)) {
                                user = hd0Var.getMessagesController().getUser(Long.valueOf(hd0Var.f38261e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity2 = hd0Var.getParentActivity();
                            pc0 pc0Var = new pc0(hd0Var, 3);
                            rw rwVar = new rw(15, hd0Var, user);
                            rc0 rc0Var = new rc0(hd0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity2);
                            frameLayout.f27723a = null;
                            frameLayout.d = -1;
                            frameLayout.f27726e = false;
                            frameLayout.f27727f = false;
                            frameLayout.h = null;
                            frameLayout.f27728n = new Rect();
                            new Paint();
                            frameLayout.f27731w = true;
                            frameLayout.F = org.telegram.ui.Components.hs.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = rc0Var;
                            frameLayout.f27733y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i182 = rect2.left;
                            frameLayout.f27732x = i182;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i182, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i182, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.x5.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = pc0Var;
                            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.G = ud0Var;
                            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            ud0Var.setItemCount(5);
                            org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.H = ud0Var2;
                            ud0Var2.setItemCount(5);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(frameLayout, parentActivity2);
                            frameLayout.P = gj0Var;
                            gj0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                            gj0Var.addView(frameLayout3, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity2);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false), 1, textView);
                            frameLayout3.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView.setOnTouchListener(new bi.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            gj0Var.addView(linearLayout, w7.x5.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                            TextView textView2 = new TextView(parentActivity2);
                            frameLayout.K = textView2;
                            ?? textView3 = new TextView(parentActivity2);
                            frameLayout.J = textView3;
                            linearLayout.addView(ud0Var, w7.x5.l(0.5f, 0, 270));
                            ud0Var.setFormatter(new org.telegram.ui.Components.ej0(frameLayout, 0));
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(10);
                            ud0Var.setWrapSelectorWheel(false);
                            ud0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(frameLayout, 1);
                            ud0Var.setOnValueChangedListener(ej0Var);
                            ud0Var2.setMinValue(0);
                            ud0Var2.setMaxValue(10);
                            ud0Var2.setWrapSelectorWheel(false);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(ud0Var2, w7.x5.l(0.5f, 0, 270));
                            ud0Var2.setFormatter(new org.telegram.ui.Components.ej0(frameLayout, 2));
                            ud0Var2.setOnValueChangedListener(ej0Var);
                            ud0Var.setValue(0);
                            ud0Var2.setValue(6);
                            gj0Var.addView(frameLayout4, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                            frameLayout4.addView((View) textView3, w7.x5.d(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.ut(11, frameLayout, rwVar));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21036q5, false));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, w7.x5.d(48.0f, -1));
                            frameLayout2.addView(gj0Var, w7.x5.e(-1, -2, 51));
                            hd0Var.R = frameLayout;
                            ((FrameLayout) hd0Var.fragmentView).addView((View) frameLayout, w7.x5.d(-1.0f, -1));
                            org.telegram.ui.Components.jj0 jj0Var = hd0Var.R;
                            jj0Var.f27729r = false;
                            AnimatorSet animatorSet = jj0Var.f27730s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                jj0Var.f27730s = null;
                            }
                            org.telegram.ui.Components.fj0 fj0Var = jj0Var.v;
                            fj0Var.measure(View.MeasureSpec.makeMeasureSpec((jj0Var.f27732x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (jj0Var.f27729r) {
                                z14 = true;
                            } else {
                                fj0Var.setVisibility(0);
                                if (jj0Var.f27731w) {
                                    jj0Var.setLayerType(2, null);
                                }
                                fj0Var.setTranslationY(fj0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                jj0Var.f27730s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(fj0Var, View.TRANSLATION_Y, 0.0f));
                                jj0Var.f27730s.setDuration(400L);
                                jj0Var.f27730s.setStartDelay(20L);
                                jj0Var.f27730s.setInterpolator(jj0Var.F);
                                z14 = true;
                                jj0Var.f27730s.addListener(new org.telegram.ui.Components.ij0(jj0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                jj0Var.f27730s.start();
                            }
                            jj0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        hd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = hd0Var.B0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            hd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                }
            }
        });
        TextView textView = new TextView(context);
        this.f38255b = textView;
        textView.setGravity(17);
        this.f38255b.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f38255b.setTextSize(1, 15.0f);
        this.f38255b.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, this.resourceProvider));
        this.f38255b.setTypeface(AndroidUtilities.bold());
        this.f38255b.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.f38255b.setText(LocaleController.getString(R.string.LocationsShowAll));
        this.f38255b.setBackground(org.telegram.ui.ActionBar.i6.a0(getThemedColor(i16), getThemedColor(i17), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams a10 = w7.x5.a(38.0f, 12.0f, 0.0f, 12.0f, 12.0f, -2, 81);
        a10.bottomMargin = (layoutParams2.height - rect.top) + a10.bottomMargin;
        this.S.addView(this.f38255b, a10);
        w7.z5.a(this.f38255b);
        this.f38255b.setOnClickListener(new View.OnClickListener(this) {
            public final hd0 f40494b;

            {
                this.f40494b = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                hd0 hd0Var = this.f40494b;
                switch (i152) {
                    case 0:
                        hd0Var.x0(false);
                        hd0Var.T.H(null, hd0Var.f38285x0, true);
                        hd0Var.D0 = true;
                        hd0Var.w0();
                        return;
                    case 1:
                        hd0Var.d.M(null, null);
                        return;
                    case 2:
                        int i162 = hd0Var.G0;
                        Activity parentActivity = hd0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (hd0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hd0Var.getParentActivity());
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                                b2Var.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new pc0(hd0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                hd0Var.showDialog(b2Var);
                                return;
                            }
                            return;
                        } else if (hd0Var.c0() || i162 == 3) {
                            if ((hd0Var.B0 != null && i162 != 3) || hd0Var.f38288z0 != null) {
                                if (hd0Var.f38283w0 != null && (iMap = hd0Var.I) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(hd0Var.f38283w0.getLatitude(), hd0Var.f38283w0.getLongitude()), hd0Var.I.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (hd0Var.f38283w0 != null && hd0Var.I != null) {
                                ImageView imageView3 = hd0Var.f38253a;
                                int i172 = org.telegram.ui.ActionBar.i6.vi;
                                imageView3.setColorFilter(new PorterDuffColorFilter(hd0Var.getThemedColor(i172), PorterDuff.Mode.MULTIPLY));
                                hd0Var.f38253a.setTag(Integer.valueOf(i172));
                                hd0Var.T.L(null);
                                hd0Var.C0 = false;
                                hd0Var.x0(false);
                                hd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(hd0Var.f38283w0.getLatitude(), hd0Var.f38283w0.getLongitude())));
                                if (hd0Var.D0 && i162 != 8) {
                                    Location location3 = hd0Var.f38283w0;
                                    if (location3 != null) {
                                        hd0Var.T.H(null, location3, true);
                                    }
                                    hd0Var.D0 = false;
                                    hd0Var.w0();
                                }
                            }
                            if (hd0Var.m0 != null) {
                                hd0Var.X.setVisibility(0);
                                ed0 ed0Var = hd0Var.f38284x;
                                IMapsProvider.IMarker iMarker = hd0Var.m0;
                                HashMap hashMap = ed0Var.f37231a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    ed0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                hd0Var.m0 = null;
                                hd0Var.f38271n0 = null;
                                hd0Var.f38272o0 = null;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        hd0Var.f38266i0 = -1L;
                        hd0Var.C0 = true;
                        if (hd0Var.i0()) {
                            hd0Var.f38267j0 = true;
                            hd0Var.y0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (hd0Var.getParentActivity() != null && hd0Var.f38283w0 != null && hd0Var.c0() && hd0Var.I != null) {
                            ci.d4 d4Var = hd0Var.f38286y;
                            if (d4Var != null) {
                                d4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = hd0Var.getLocationController().getSharingLocationInfo(hd0Var.f38261e0);
                            if (hd0Var.G) {
                                hd0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                hd0Var.f38257c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = hd0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    hd0Var.O = null;
                                }
                                hd0Var.G = true;
                                hd0Var.l0().k(0L, 25, 0, null, new rc0(hd0Var, 1), new m70(20, hd0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = hd0Var.O;
                            if (iCircle2 == null) {
                                hd0Var.d0(500);
                            } else {
                                hd0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(hd0Var.f38261e0)) {
                                user = hd0Var.getMessagesController().getUser(Long.valueOf(hd0Var.f38261e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity2 = hd0Var.getParentActivity();
                            pc0 pc0Var = new pc0(hd0Var, 3);
                            rw rwVar = new rw(15, hd0Var, user);
                            rc0 rc0Var = new rc0(hd0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity2);
                            frameLayout.f27723a = null;
                            frameLayout.d = -1;
                            frameLayout.f27726e = false;
                            frameLayout.f27727f = false;
                            frameLayout.h = null;
                            frameLayout.f27728n = new Rect();
                            new Paint();
                            frameLayout.f27731w = true;
                            frameLayout.F = org.telegram.ui.Components.hs.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = rc0Var;
                            frameLayout.f27733y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i182 = rect2.left;
                            frameLayout.f27732x = i182;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i182, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i182, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.x5.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = pc0Var;
                            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.G = ud0Var;
                            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            ud0Var.setItemCount(5);
                            org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.H = ud0Var2;
                            ud0Var2.setItemCount(5);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(frameLayout, parentActivity2);
                            frameLayout.P = gj0Var;
                            gj0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                            gj0Var.addView(frameLayout3, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false), 1, textView2);
                            frameLayout3.addView(textView2, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView2.setOnTouchListener(new bi.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            gj0Var.addView(linearLayout, w7.x5.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                            TextView textView22 = new TextView(parentActivity2);
                            frameLayout.K = textView22;
                            ?? textView3 = new TextView(parentActivity2);
                            frameLayout.J = textView3;
                            linearLayout.addView(ud0Var, w7.x5.l(0.5f, 0, 270));
                            ud0Var.setFormatter(new org.telegram.ui.Components.ej0(frameLayout, 0));
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(10);
                            ud0Var.setWrapSelectorWheel(false);
                            ud0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(frameLayout, 1);
                            ud0Var.setOnValueChangedListener(ej0Var);
                            ud0Var2.setMinValue(0);
                            ud0Var2.setMaxValue(10);
                            ud0Var2.setWrapSelectorWheel(false);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(ud0Var2, w7.x5.l(0.5f, 0, 270));
                            ud0Var2.setFormatter(new org.telegram.ui.Components.ej0(frameLayout, 2));
                            ud0Var2.setOnValueChangedListener(ej0Var);
                            ud0Var.setValue(0);
                            ud0Var2.setValue(6);
                            gj0Var.addView(frameLayout4, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                            frameLayout4.addView((View) textView3, w7.x5.d(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.ut(11, frameLayout, rwVar));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            textView22.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21036q5, false));
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, w7.x5.d(48.0f, -1));
                            frameLayout2.addView(gj0Var, w7.x5.e(-1, -2, 51));
                            hd0Var.R = frameLayout;
                            ((FrameLayout) hd0Var.fragmentView).addView((View) frameLayout, w7.x5.d(-1.0f, -1));
                            org.telegram.ui.Components.jj0 jj0Var = hd0Var.R;
                            jj0Var.f27729r = false;
                            AnimatorSet animatorSet = jj0Var.f27730s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                jj0Var.f27730s = null;
                            }
                            org.telegram.ui.Components.fj0 fj0Var = jj0Var.v;
                            fj0Var.measure(View.MeasureSpec.makeMeasureSpec((jj0Var.f27732x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (jj0Var.f27729r) {
                                z14 = true;
                            } else {
                                fj0Var.setVisibility(0);
                                if (jj0Var.f27731w) {
                                    jj0Var.setLayerType(2, null);
                                }
                                fj0Var.setTranslationY(fj0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                jj0Var.f27730s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(fj0Var, View.TRANSLATION_Y, 0.0f));
                                jj0Var.f27730s.setDuration(400L);
                                jj0Var.f27730s.setStartDelay(20L);
                                jj0Var.f27730s.setInterpolator(jj0Var.F);
                                z14 = true;
                                jj0Var.f27730s.addListener(new org.telegram.ui.Components.ij0(jj0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                jj0Var.f27730s.start();
                            }
                            jj0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        hd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = hd0Var.B0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            hd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                }
            }
        });
        y0(false, false);
        this.f38257c = new ImageView(context);
        org.telegram.ui.Cells.z i04 = org.telegram.ui.ActionBar.i6.i0(AndroidUtilities.dp(40.0f), getThemedColor(i16), getThemedColor(i17));
        w7.z5.a(this.f38257c);
        this.f38257c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f38257c.setOutlineProvider(l2Var);
        this.f38257c.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        this.f38257c.setBackgroundDrawable(i04);
        this.f38257c.setScaleType(scaleType);
        this.f38257c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.S.addView(this.f38257c, w7.x5.a(40.0f, 0.0f, 62.0f, 12.0f, 0.0f, 40, 53));
        this.f38257c.setOnClickListener(new View.OnClickListener(this) {
            public final hd0 f40494b;

            {
                this.f40494b = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                hd0 hd0Var = this.f40494b;
                switch (i152) {
                    case 0:
                        hd0Var.x0(false);
                        hd0Var.T.H(null, hd0Var.f38285x0, true);
                        hd0Var.D0 = true;
                        hd0Var.w0();
                        return;
                    case 1:
                        hd0Var.d.M(null, null);
                        return;
                    case 2:
                        int i162 = hd0Var.G0;
                        Activity parentActivity = hd0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (hd0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hd0Var.getParentActivity());
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                                b2Var.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new pc0(hd0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                hd0Var.showDialog(b2Var);
                                return;
                            }
                            return;
                        } else if (hd0Var.c0() || i162 == 3) {
                            if ((hd0Var.B0 != null && i162 != 3) || hd0Var.f38288z0 != null) {
                                if (hd0Var.f38283w0 != null && (iMap = hd0Var.I) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(hd0Var.f38283w0.getLatitude(), hd0Var.f38283w0.getLongitude()), hd0Var.I.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (hd0Var.f38283w0 != null && hd0Var.I != null) {
                                ImageView imageView3 = hd0Var.f38253a;
                                int i172 = org.telegram.ui.ActionBar.i6.vi;
                                imageView3.setColorFilter(new PorterDuffColorFilter(hd0Var.getThemedColor(i172), PorterDuff.Mode.MULTIPLY));
                                hd0Var.f38253a.setTag(Integer.valueOf(i172));
                                hd0Var.T.L(null);
                                hd0Var.C0 = false;
                                hd0Var.x0(false);
                                hd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(hd0Var.f38283w0.getLatitude(), hd0Var.f38283w0.getLongitude())));
                                if (hd0Var.D0 && i162 != 8) {
                                    Location location3 = hd0Var.f38283w0;
                                    if (location3 != null) {
                                        hd0Var.T.H(null, location3, true);
                                    }
                                    hd0Var.D0 = false;
                                    hd0Var.w0();
                                }
                            }
                            if (hd0Var.m0 != null) {
                                hd0Var.X.setVisibility(0);
                                ed0 ed0Var = hd0Var.f38284x;
                                IMapsProvider.IMarker iMarker = hd0Var.m0;
                                HashMap hashMap = ed0Var.f37231a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    ed0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                hd0Var.m0 = null;
                                hd0Var.f38271n0 = null;
                                hd0Var.f38272o0 = null;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 3:
                        hd0Var.f38266i0 = -1L;
                        hd0Var.C0 = true;
                        if (hd0Var.i0()) {
                            hd0Var.f38267j0 = true;
                            hd0Var.y0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (hd0Var.getParentActivity() != null && hd0Var.f38283w0 != null && hd0Var.c0() && hd0Var.I != null) {
                            ci.d4 d4Var = hd0Var.f38286y;
                            if (d4Var != null) {
                                d4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = hd0Var.getLocationController().getSharingLocationInfo(hd0Var.f38261e0);
                            if (hd0Var.G) {
                                hd0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                hd0Var.f38257c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = hd0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    hd0Var.O = null;
                                }
                                hd0Var.G = true;
                                hd0Var.l0().k(0L, 25, 0, null, new rc0(hd0Var, 1), new m70(20, hd0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = hd0Var.O;
                            if (iCircle2 == null) {
                                hd0Var.d0(500);
                            } else {
                                hd0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(hd0Var.f38261e0)) {
                                user = hd0Var.getMessagesController().getUser(Long.valueOf(hd0Var.f38261e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity2 = hd0Var.getParentActivity();
                            pc0 pc0Var = new pc0(hd0Var, 3);
                            rw rwVar = new rw(15, hd0Var, user);
                            rc0 rc0Var = new rc0(hd0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity2);
                            frameLayout.f27723a = null;
                            frameLayout.d = -1;
                            frameLayout.f27726e = false;
                            frameLayout.f27727f = false;
                            frameLayout.h = null;
                            frameLayout.f27728n = new Rect();
                            new Paint();
                            frameLayout.f27731w = true;
                            frameLayout.F = org.telegram.ui.Components.hs.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = rc0Var;
                            frameLayout.f27733y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i182 = rect2.left;
                            frameLayout.f27732x = i182;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i182, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i182, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.x5.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = pc0Var;
                            org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.G = ud0Var;
                            ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            ud0Var.setItemCount(5);
                            org.telegram.ui.Components.ud0 ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, null);
                            frameLayout.H = ud0Var2;
                            ud0Var2.setItemCount(5);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(frameLayout, parentActivity2);
                            frameLayout.P = gj0Var;
                            gj0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                            gj0Var.addView(frameLayout3, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false), 1, textView2);
                            frameLayout3.addView(textView2, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView2.setOnTouchListener(new bi.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            gj0Var.addView(linearLayout, w7.x5.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity2);
                            TextView textView22 = new TextView(parentActivity2);
                            frameLayout.K = textView22;
                            ?? textView3 = new TextView(parentActivity2);
                            frameLayout.J = textView3;
                            linearLayout.addView(ud0Var, w7.x5.l(0.5f, 0, 270));
                            ud0Var.setFormatter(new org.telegram.ui.Components.ej0(frameLayout, 0));
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(10);
                            ud0Var.setWrapSelectorWheel(false);
                            ud0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(frameLayout, 1);
                            ud0Var.setOnValueChangedListener(ej0Var);
                            ud0Var2.setMinValue(0);
                            ud0Var2.setMaxValue(10);
                            ud0Var2.setWrapSelectorWheel(false);
                            ud0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(ud0Var2, w7.x5.l(0.5f, 0, 270));
                            ud0Var2.setFormatter(new org.telegram.ui.Components.ej0(frameLayout, 2));
                            ud0Var2.setOnValueChangedListener(ej0Var);
                            ud0Var.setValue(0);
                            ud0Var2.setValue(6);
                            gj0Var.addView(frameLayout4, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                            frameLayout4.addView((View) textView3, w7.x5.d(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.ut(11, frameLayout, rwVar));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            textView22.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21036q5, false));
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, w7.x5.d(48.0f, -1));
                            frameLayout2.addView(gj0Var, w7.x5.e(-1, -2, 51));
                            hd0Var.R = frameLayout;
                            ((FrameLayout) hd0Var.fragmentView).addView((View) frameLayout, w7.x5.d(-1.0f, -1));
                            org.telegram.ui.Components.jj0 jj0Var = hd0Var.R;
                            jj0Var.f27729r = false;
                            AnimatorSet animatorSet = jj0Var.f27730s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                jj0Var.f27730s = null;
                            }
                            org.telegram.ui.Components.fj0 fj0Var = jj0Var.v;
                            fj0Var.measure(View.MeasureSpec.makeMeasureSpec((jj0Var.f27732x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (jj0Var.f27729r) {
                                z14 = true;
                            } else {
                                fj0Var.setVisibility(0);
                                if (jj0Var.f27731w) {
                                    jj0Var.setLayerType(2, null);
                                }
                                fj0Var.setTranslationY(fj0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                jj0Var.f27730s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(fj0Var, View.TRANSLATION_Y, 0.0f));
                                jj0Var.f27730s.setDuration(400L);
                                jj0Var.f27730s.setStartDelay(20L);
                                jj0Var.f27730s.setInterpolator(jj0Var.F);
                                z14 = true;
                                jj0Var.f27730s.addListener(new org.telegram.ui.Components.ij0(jj0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                jj0Var.f27730s.start();
                            }
                            jj0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        hd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = hd0Var.B0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            hd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                }
            }
        });
        if (DialogObject.isChatDialog(this.f38261e0)) {
            chat = getMessagesController().getChat(Long.valueOf(-this.f38261e0));
        } else {
            chat = null;
        }
        MessageObject messageObject3 = this.B0;
        if (messageObject3 != null && messageObject3.isLiveLocation() && !this.B0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f38261e0);
            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                this.f38257c.setImageResource(R.drawable.msg_location_alert2);
            } else {
                if (DialogObject.isUserDialog(this.f38261e0) && this.B0.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.f38257c.setVisibility(4);
                    this.f38257c.setAlpha(0.0f);
                    this.f38257c.setScaleX(0.4f);
                    this.f38257c.setScaleY(0.4f);
                }
                this.f38257c.setImageResource(R.drawable.msg_location_alert);
            }
        } else {
            this.f38257c.setVisibility(8);
            this.f38257c.setImageResource(R.drawable.msg_location_alert);
        }
        ci.d4 d4Var = new ci.d4(context, 1);
        this.f38286y = d4Var;
        d4Var.setLayerType(2, null);
        ci.d4 d4Var2 = this.f38286y;
        d4Var2.d = 4000L;
        d4Var2.l(1.0f, -25.0f);
        this.f38286y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.S.addView(this.f38286y, w7.x5.a(-2.0f, 8.0f, 106.0f, 8.0f, 0.0f, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38262f = linearLayout;
        linearLayout.setOrientation(1);
        this.f38262f.setGravity(1);
        this.f38262f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f38262f.setVisibility(8);
        fd0Var.addView(this.f38262f, w7.x5.d(-1.0f, -1));
        this.f38262f.setOnTouchListener(new bi.d(2));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.W5), mode));
        this.f38262f.addView(this.h, w7.x5.n(-2, -2));
        TextView textView2 = new TextView(context);
        this.f38270n = textView2;
        int i19 = org.telegram.ui.ActionBar.i6.X5;
        textView2.setTextColor(getThemedColor(i19));
        this.f38270n.setGravity(17);
        this.f38270n.setTypeface(AndroidUtilities.bold());
        this.f38270n.setTextSize(1, 17.0f);
        this.f38270n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = com.google.android.gms.internal.vision.e2.h(this.f38262f, this.f38270n, w7.x5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f38275r = h;
        h.setTextColor(getThemedColor(i19));
        this.f38275r.setGravity(17);
        this.f38275r.setTextSize(1, 15.0f);
        this.f38275r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f38262f.addView(this.f38275r, w7.x5.t(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.U = qm0Var;
        long j3 = this.f38261e0;
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        boolean z14 = this.E;
        if (i14 == 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        vc0 vc0Var2 = new vc0(this, context, this.G0, j3, resourceProvider, z14, z11);
        this.T = vc0Var2;
        qm0Var.setAdapter(vc0Var2);
        org.telegram.ui.Components.qm0 qm0Var2 = this.U;
        s4.d0 d0Var = new s4.d0(1, false);
        this.Y = d0Var;
        qm0Var2.setLayoutManager(d0Var);
        if (this.M0 != null) {
            this.L0 = new org.telegram.ui.Cells.v3(context, this.resourceProvider);
            xc0 xc0Var = new xc0(this, context, new org.telegram.ui.Components.tv0(this), this, new wc0(this), getResourceProvider());
            this.K0 = xc0Var;
            xc0Var.setBackgroundColor(getThemedColor(i12));
            this.K0.addView(this.L0, w7.x5.e(-1, 32, 55));
            this.T.f10803h0 = this.K0;
            this.U.setOverScrollMode(2);
            s4.j jVar = new s4.j();
            z12 = false;
            jVar.f47696m = false;
            jVar.C = false;
            jVar.o(org.telegram.ui.Components.hs.h);
            jVar.n(350L);
            this.U.setItemAnimator(jVar);
        } else {
            z12 = false;
        }
        this.T.O(this.f38258c0, z12);
        this.T.getClass();
        this.U.setVerticalScrollBarEnabled(z12);
        fd0Var.addView(this.U, w7.x5.e(-1, -1, 51));
        MessageObject messageObject4 = this.B0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            vc0 vc0Var3 = this.T;
            vc0Var3.Q = this.B0.messageOwner.media.address;
            vc0Var3.Q();
        }
        this.U.setOnScrollListener(new yc0(this));
        ((s4.j) this.U.getItemAnimator()).C = false;
        this.U.setOnItemLongClickListener(new rw(13, this, context));
        this.U.setOnItemClickListener(new i(this, 16));
        vc0 vc0Var4 = this.T;
        long j10 = this.f38261e0;
        pc0 pc0Var = new pc0(this, 5);
        vc0Var4.H = j10;
        vc0Var4.f10556y = pc0Var;
        vc0Var4.P(this.H0);
        fd0Var.addView(this.S, w7.x5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.K = onCreateMapView;
        onCreateMapView.getView().setAlpha(0.0f);
        this.K.setOnDispatchTouchEventInterceptor(new pc0(this, 6));
        this.K.setOnInterceptTouchEventInterceptor(new pc0(this, 7));
        this.K.setOnLayoutListener(new rc0(this, 5));
        new Thread(new sc0(this, this.K, 1)).start();
        MessageObject messageObject5 = this.B0;
        if (messageObject5 == null && this.f38288z0 == null) {
            i10 = i14;
            if (chat != null && i10 == 4 && this.f38261e0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.S.addView(frameLayout, w7.x5.e(62, 76, 49));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                y9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                y9Var.e(chat, new org.telegram.ui.Components.j9(chat));
                frameLayout.addView(y9Var, w7.x5.a(52.0f, 5.0f, 5.0f, 0.0f, 0.0f, 52, 51));
                this.X = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.X == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.S.addView(imageView4, w7.x5.e(28, 48, 49));
                this.X = imageView4;
            }
            org.telegram.ui.Components.qm0 qm0Var3 = new org.telegram.ui.Components.qm0(context, null);
            this.V = qm0Var3;
            qm0Var3.setVisibility(8);
            i11 = 0;
            this.V.setLayoutManager(new s4.d0(1, false));
            org.telegram.ui.ActionBar.e6 resourceProvider2 = getResourceProvider();
            if (i10 == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            ad0 ad0Var2 = new ad0(this, context, resourceProvider2, z13);
            this.W = ad0Var2;
            pc0 pc0Var2 = new pc0(this, 8);
            ad0Var2.H = 0L;
            ad0Var2.f10556y = pc0Var2;
            fd0Var.addView(this.V, w7.x5.e(-1, -1, 51));
            this.V.setOnScrollListener(new i3(this, 18));
            this.V.setOnItemClickListener(new ai.o6(18, this, o9));
        } else {
            i10 = i14;
            i11 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.f38288z0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.f38288z0;
                if (tL_channelLocation2 != null) {
                    this.T.X = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.B0;
                    if (messageObject6 != null) {
                        vc0 vc0Var5 = this.T;
                        vc0Var5.W = messageObject6;
                        vc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.B0;
        if (messageObject7 != null && i10 == 6) {
            vc0 vc0Var6 = this.T;
            vc0Var6.W = messageObject7;
            vc0Var6.l();
        }
        while (i11 < 2) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.F;
            undoViewArr[i11] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i11].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.S.addView(undoViewArr[i11], w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
            i11++;
        }
        ai.o4 o4Var = new ai.o4(this, context, rect);
        this.v = o4Var;
        o4Var.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.S.addView(this.v, layoutParams2);
        if (this.B0 == null && this.f38288z0 == null && this.A0 != null) {
            this.C0 = true;
            ImageView imageView5 = this.f38253a;
            int i20 = org.telegram.ui.ActionBar.i6.ui;
            imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i20), PorterDuff.Mode.MULTIPLY));
            this.f38253a.setTag(Integer.valueOf(i20));
        }
        fd0Var.addView(this.actionBar);
        A0();
        return this.fragmentView;
    }

    public final void d0(int i10) {
        if (this.I == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.f38283w0.getLatitude(), this.f38283w0.getLongitude()));
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
        vc0 vc0Var;
        long dialogId;
        vc0 vc0Var2;
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.locationPermissionGranted) {
            this.f38258c0 = false;
            vc0 vc0Var3 = this.T;
            if (vc0Var3 != null) {
                vc0Var3.O(false, false);
            }
            IMapsProvider.IMap iMap = this.I;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.f38258c0 = true;
            vc0 vc0Var4 = this.T;
            if (vc0Var4 != null) {
                vc0Var4.O(true, false);
            }
        } else if (i10 == NotificationCenter.liveLocationsChanged) {
            vc0 vc0Var5 = this.T;
            if (vc0Var5 != null) {
                vc0Var5.l();
            }
            B0();
        } else if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.f38261e0 && this.B0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i12);
                    if (messageObject.isLiveLocation()) {
                        b0(messageObject.messageOwner);
                        z10 = true;
                    } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                        this.f38257c.setImageResource(R.drawable.msg_location_alert);
                        IMapsProvider.ICircle iCircle = this.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            this.O = null;
                        }
                    }
                }
                if (z10 && (vc0Var2 = this.T) != null) {
                    vc0Var2.N(this.f38264g0);
                }
            }
        } else if (i10 == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.f38261e0 && this.B0 != null) {
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
                        bd0 bd0Var = (bd0) this.f38265h0.f(dialogId);
                        if (bd0Var != null) {
                            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                            if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                                TLRPC.Message message2 = messageObject2.messageOwner;
                                bd0Var.f36281b = message2;
                                TLRPC.GeoPoint geoPoint = message2.media.geo;
                                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                                bd0Var.f36283e.setPosition(latLng);
                                if (this.f38266i0 == bd0Var.f36280a) {
                                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(bd0Var.f36283e.getPosition()));
                                }
                                IMapsProvider.IMarker iMarker = bd0Var.f36284f;
                                if (iMarker != null) {
                                    iMarker.getPosition();
                                    bd0Var.f36284f.setPosition(latLng);
                                    int i14 = messageObject2.messageOwner.media.heading;
                                    if (i14 != 0) {
                                        bd0Var.f36284f.setRotation(i14);
                                        if (!bd0Var.f36285g) {
                                            bd0Var.f36284f.setIcon(R.drawable.map_pin_cone2);
                                            bd0Var.f36285g = true;
                                        }
                                    } else if (bd0Var.f36285g) {
                                        bd0Var.f36284f.setRotation(0);
                                        bd0Var.f36284f.setIcon(R.drawable.map_pin_circle);
                                        bd0Var.f36285g = false;
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                }
                if (z11 && (vc0Var = this.T) != null) {
                    vc0Var.l();
                    org.telegram.ui.Components.jj0 jj0Var = this.R;
                    if (jj0Var != null) {
                        jj0Var.c(true);
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

    public final Bitmap f0(bd0 bd0Var) {
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
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
                TLRPC.User user = bd0Var.f36282c;
                if (user != null) {
                    j9Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = bd0Var.d;
                    if (chat != null) {
                        j9Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                j9Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                j9Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = bd0Var.h;
                if (imageReceiver != null && imageReceiver.hasImageLoaded()) {
                    bitmap = bd0Var.h.getBitmap();
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
        return this instanceof in;
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
            int i11 = org.telegram.ui.ActionBar.i6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoView, 32, null, null, null, null, i11));
            int i12 = org.telegram.ui.ActionBar.i6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i12));
            int i13 = org.telegram.ui.ActionBar.i6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", i11));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", i11));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", i13));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", i13));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main", i13));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top", i13));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line", i13));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big", i13));
            arrayList.add(new org.telegram.ui.ActionBar.k6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small", i13));
            i10++;
        }
        View view = this.fragmentView;
        int i14 = org.telegram.ui.ActionBar.i6.f20868h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 32768, null, null, null, null, i14));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.i6.f20905j5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 64, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.Vd));
        org.telegram.ui.ActionBar.v0 v0Var = this.f38282w;
        if (v0Var != null) {
            editTextBoldCursor = v0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 16777216, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.i6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.i6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        ImageView imageView = this.h;
        int i16 = org.telegram.ui.ActionBar.i6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 8, null, null, null, null, i16));
        TextView textView = this.f38270n;
        int i17 = org.telegram.ui.ActionBar.i6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(textView, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38275r, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ii));
        ImageView imageView2 = this.f38253a;
        int i18 = org.telegram.ui.ActionBar.i6.ui;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView2, 262152, null, null, null, null, i18));
        ImageView imageView3 = this.f38253a;
        int i19 = org.telegram.ui.ActionBar.i6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView3, 262152, null, null, null, null, i19));
        ImageView imageView4 = this.f38253a;
        int i20 = org.telegram.ui.ActionBar.i6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView4, 32, null, null, null, null, i20));
        ImageView imageView5 = this.f38253a;
        int i21 = org.telegram.ui.ActionBar.i6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView5, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, null, null, null, eVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38257c, 0, null, null, null, eVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38257c, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38257c, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38260e, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38260e, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38260e, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, org.telegram.ui.ActionBar.i6.f21049r0, eVar, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.si));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20992ni));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20974mi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21029pi));
        int i22 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21010oi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20761b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20981n5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.V, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.V, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.V, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20869h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i17));
        return arrayList;
    }

    public final void h0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilder;
        if (this.f38263f0) {
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
                if (this.f38257c.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.f38257c.setVisibility(0);
                    this.H = true;
                    this.f38257c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new org.telegram.ui.Components.i91(this, 25)).start();
                }
            }
        }
        if (iLatLngBoundsBuilder != null) {
            if (this.f38263f0) {
                this.U.v0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.f38263f0 = false;
            this.T.N(this.f38264g0);
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
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
            ArrayList arrayList2 = this.f38264g0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                bd0 bd0Var = (bd0) arrayList2.get(i12);
                IMapsProvider.IMarker iMarker = bd0Var.f36283e;
                if (iMarker != null && (message = bd0Var.f36281b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            if (this.f38265h0.f(getUserConfig().getClientUserId()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Location location = this.f38283w0;
            if (location != null && !z10) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.f38283w0.getLongitude()));
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6)) > 0.699999988079071d) {
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
                    this.H0 = org.telegram.messenger.q.B(66.0f, measuredHeight, currentActionBarHeight);
                } else if (i12 == 2) {
                    this.H0 = org.telegram.messenger.q.B(73.0f, measuredHeight, currentActionBarHeight);
                } else {
                    this.H0 = org.telegram.messenger.q.B(66.0f, measuredHeight, currentActionBarHeight);
                }
                xc0 xc0Var = this.K0;
                if (xc0Var != null && xc0Var.c0(8) > 0) {
                    this.H0 -= AndroidUtilities.dp(200.0f);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.U.getLayoutParams();
                layoutParams2.topMargin = currentActionBarHeight;
                this.U.setLayoutParams(layoutParams2);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.S.getLayoutParams();
                layoutParams3.topMargin = currentActionBarHeight;
                layoutParams3.height = this.H0;
                this.S.setLayoutParams(layoutParams3);
                org.telegram.ui.Components.qm0 qm0Var = this.V;
                if (qm0Var != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) qm0Var.getLayoutParams();
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
                ed0 ed0Var = this.f38284x;
                if (ed0Var != null && (layoutParams = (FrameLayout.LayoutParams) ed0Var.getLayoutParams()) != null) {
                    layoutParams.height = AndroidUtilities.dp(10.0f) + this.H0;
                    this.f38284x.setLayoutParams(layoutParams);
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
                    this.U.post(new org.telegram.ui.Components.nd(this, i11, 17));
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
        if (DialogObject.isChatDialog(this.f38261e0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f38261e0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.B0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new ai.d8(this, dialogId, 6));
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
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.i6.I.q()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void n0() {
        SharedPreferences globalMainSettings;
        int i10;
        ImageView imageView = this.f38257c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.H && (i10 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) < 3) {
            globalMainSettings.edit().putInt("proximityhint", i10 + 1).commit();
            if (DialogObject.isUserDialog(this.f38261e0)) {
                this.f38286y.s(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.f38261e0)))));
            } else {
                this.f38286y.s(LocaleController.getString(R.string.ProximityTooltioGroup));
            }
            this.f38286y.u();
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.jj0 jj0Var = this.R;
        if (jj0Var != null) {
            if (z10) {
                jj0Var.a();
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            IMapsProvider.IMapView iMapView = this.K;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        vc0 vc0Var = this.T;
        if (vc0Var != null) {
            vc0Var.F();
        }
        ad0 ad0Var = this.W;
        if (ad0Var != null) {
            ad0Var.F();
        }
        rc0 rc0Var = this.J0;
        if (rc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rc0Var);
            this.J0 = null;
        }
        ArrayList arrayList = this.f38264g0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            bd0 bd0Var = (bd0) arrayList.get(i10);
            ImageReceiver imageReceiver = bd0Var.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                bd0Var.h = null;
            }
        }
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f38280u0) {
            iMapView.onLowMemory();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f38280u0) {
            try {
                iMapView.onPause();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f38281v0 = false;
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
        if (iMapView != null && this.f38280u0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f38281v0 = true;
        IMapsProvider.IMap iMap = this.I;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        j0(true);
        if (g0()) {
            this.f38273p0 = false;
        } else if (this.f38273p0 && (parentActivity = getParentActivity()) != null) {
            this.f38273p0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        rc0 rc0Var = this.J0;
        if (rc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rc0Var);
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
                k0Var.addView(this.K.getView(), 0, w7.x5.e(-1, AndroidUtilities.dp(10.0f) + this.H0, 51));
                ed0 ed0Var = this.f38284x;
                if (ed0Var != null) {
                    try {
                        if (ed0Var.getParent() instanceof ViewGroup) {
                            ((ViewGroup) this.f38284x.getParent()).removeView(this.f38284x);
                        }
                    } catch (Exception unused2) {
                    }
                    this.S.addView(this.f38284x, 1, w7.x5.e(-1, AndroidUtilities.dp(10.0f) + this.H0, 51));
                }
                z0(false);
                n0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.K.getView(), 0, w7.x5.e(-1, -1, 51));
            }
        }
    }

    public final boolean p0() {
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && iMapView.getGlSurfaceView() != null && !this.M) {
            GLSurfaceView glSurfaceView = this.K.getGlSurfaceView();
            glSurfaceView.queueEvent(new m70(19, this, glSurfaceView));
            return true;
        }
        return false;
    }

    public final void q0(bd0 bd0Var) {
        double d;
        double d10;
        String str;
        TLRPC.Message message;
        if (bd0Var != null && (message = bd0Var.f36281b) != null) {
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
                TLRPC.GeoPoint geoPoint3 = this.f38288z0.geo_point;
                d = geoPoint3.lat;
                d10 = geoPoint3._long;
            }
        }
        if (BuildVars.isHuaweiStoreApp()) {
            str = "mapapp://navigation";
        } else {
            str = "http://maps.google.com/maps";
        }
        if (this.f38283w0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f38283w0.getLatitude()), Double.valueOf(this.f38283w0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void r0(final boolean z10) {
        final TLRPC.User user;
        Activity parentActivity;
        if (this.F0 != null && !g0() && getParentActivity() != null && this.f38283w0 != null && c0()) {
            if (this.f38274q0 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f38274q0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    org.telegram.ui.Components.g5.k(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new nc0(this, z10, 1), null).o();
                    return;
                }
            }
            if (DialogObject.isUserDialog(this.f38261e0)) {
                user = getMessagesController().getUser(Long.valueOf(this.f38261e0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.g5.D(getParentActivity(), z10, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    hd0.U(hd0.this, z10, user, i10);
                }
            }, null));
        }
    }

    public final void s0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.f38283w0 = new Location(location);
        bd0 bd0Var = (bd0) this.f38265h0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f38261e0);
        if (bd0Var != null && sharingLocationInfo != null && bd0Var.f36281b.f20059id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            bd0Var.f36283e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = bd0Var.f36284f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.f38266i0 == bd0Var.f36280a) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(bd0Var.f36283e.getPosition()));
            }
        }
        if (this.B0 == null && this.f38288z0 == null && this.I != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            vc0 vc0Var = this.T;
            if (vc0Var != null) {
                if (!this.D0 && (i10 = this.G0) != 4 && i10 != 8) {
                    vc0Var.H(null, this.f38283w0, true);
                }
                this.T.M(this.f38283w0);
            }
            if (!this.C0) {
                this.f38285x0 = new Location(location);
                if (this.E0) {
                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.E0 = true;
                    this.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.I.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.T.M(this.f38283w0);
        }
        org.telegram.ui.Components.jj0 jj0Var = this.R;
        if (jj0Var != null) {
            jj0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.O;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.f38283w0.getLatitude(), this.f38283w0.getLongitude()));
        }
        B0();
    }

    public final void t0(MessageObject messageObject) {
        this.B0 = messageObject;
        this.f38261e0 = messageObject.getDialogId();
    }

    public final void u0(bd0 bd0Var) {
        if (bd0Var.h == null) {
            TLRPC.User user = bd0Var.f36282c;
            TLRPC.Chat chat = bd0Var.d;
            if (user == null && chat == 0) {
                return;
            }
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
            if (user != null) {
                j9Var.m(this.currentAccount, user);
            } else {
                j9Var.k(this.currentAccount, chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.setCurrentAccount(this.currentAccount);
            imageReceiver.setDelegate(new rw(14, this, bd0Var));
            imageReceiver.onAttachedToWindow();
            if (user == null) {
                user = chat;
            }
            imageReceiver.setForUserOrChat(user, j9Var);
            bd0Var.h = imageReceiver;
        }
    }

    public final void v0(int i10, TLRPC.User user, int i11) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.f38283w0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.f38283w0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.f38283w0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.F0.b(tL_messageMediaGeoLive, this.G0, true, 0, 0L);
        if (i11 > 0) {
            this.R.L = true;
            this.f38257c.setImageResource(R.drawable.msg_location_alert2);
            org.telegram.ui.Components.jj0 jj0Var = this.R;
            if (jj0Var != null) {
                jj0Var.a();
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
        org.telegram.ui.Components.vl vlVar;
        Location location;
        Location location2;
        if (this.G0 == 3) {
            z10 = true;
        }
        if (z10 && (vlVar = this.f38260e) != null && vlVar.getTag() == null && ((location = this.f38283w0) == null || (location2 = this.f38285x0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        org.telegram.ui.Components.vl vlVar2 = this.f38260e;
        if (vlVar2 != null) {
            if (!z10 || vlVar2.getTag() == null) {
                if (z10 || this.f38260e.getTag() != null) {
                    org.telegram.ui.Components.vl vlVar3 = this.f38260e;
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    vlVar3.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    org.telegram.ui.Components.vl vlVar4 = this.f38260e;
                    Property property = View.TRANSLATION_X;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(vlVar4, property, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.hs.f27119g);
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
            TextView textView = this.f38255b;
            if (!z10) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            TextView textView2 = this.f38255b;
            if (z10) {
                f11 = 1.0f;
            }
            textView2.setAlpha(f11);
            TextView textView3 = this.f38255b;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            textView3.setScaleX(f10);
            TextView textView4 = this.f38255b;
            if (z10) {
                f12 = 1.0f;
            }
            textView4.setScaleY(f12);
            return;
        }
        this.f38255b.setVisibility(0);
        ViewPropertyAnimator animate = this.f38255b.animate();
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
        scaleX.scaleY(f12).setInterpolator(org.telegram.ui.Components.hs.h).setDuration(420L).withEndAction(new nc0(this, z10, 0)).start();
    }

    public final void z0(boolean z10) {
        int i10;
        int i11;
        int i12;
        FrameLayout.LayoutParams layoutParams;
        float f7;
        s4.d1 K = this.U.K(0);
        if (K != null) {
            i10 = (int) K.f47656a.getY();
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
                    ed0 ed0Var = this.f38284x;
                    if (ed0Var != null) {
                        ed0Var.setVisibility(4);
                    }
                }
            } else if (this.K.getView().getVisibility() == 4) {
                this.K.getView().setVisibility(0);
                this.S.setVisibility(0);
                ed0 ed0Var2 = this.f38284x;
                if (ed0Var2 != null) {
                    ed0Var2.setVisibility(0);
                }
            }
            this.S.setTranslationY(Math.min(0, i10));
            int i13 = -i10;
            int i14 = i13 / 2;
            this.K.getView().setTranslationY(Math.max(0, i14));
            ed0 ed0Var3 = this.f38284x;
            if (ed0Var3 != null) {
                ed0Var3.setTranslationY(Math.max(0, i14));
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
            this.f38257c.setTranslationY(min);
            ci.d4 d4Var = this.f38286y;
            if (d4Var != null) {
                d4Var.setTranslationY(min);
            }
            org.telegram.ui.Components.vl vlVar = this.f38260e;
            if (vlVar != null) {
                vlVar.f31815c = min;
                vlVar.setTranslationY(min + vlVar.f31814b);
            }
            View view = this.X;
            if (view != null) {
                if (view.getTag() == null) {
                    f7 = 48.0f;
                } else {
                    f7 = 69.0f;
                }
                int dp = (i11 / 2) + (i13 - AndroidUtilities.dp(f7));
                this.f38287y0 = dp;
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
                ed0 ed0Var4 = this.f38284x;
                if (ed0Var4 != null && (layoutParams = (FrameLayout.LayoutParams) ed0Var4.getLayoutParams()) != null) {
                    if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.H0) {
                        layoutParams.height = AndroidUtilities.dp(10.0f) + this.H0;
                        this.f38284x.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }
}
