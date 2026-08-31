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
public class bd0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public boolean B;
    public boolean B0;
    public final UndoView[] C;
    public wc0 C0;
    public boolean D;
    public final int D0;
    public boolean E;
    public int E0;
    public IMapsProvider.IMap F;
    public tc0 F0;
    public IMapsProvider.ICameraUpdate G;
    public kc0 G0;
    public IMapsProvider.IMapView H;
    public rc0 H0;
    public IMapsProvider.ICameraUpdate I;
    public org.telegram.ui.Cells.u3 I0;
    public boolean J;
    public TL_stories.MediaArea J0;
    public float K;
    public boolean K0;
    public IMapsProvider.ICircle L;
    public boolean L0;
    public double M;
    public Boolean M0;
    public boolean N;
    public final Bitmap[] N0;
    public org.telegram.ui.Components.ni0 O;
    public l0 P;
    public pc0 Q;
    public org.telegram.ui.Components.tl0 R;
    public org.telegram.ui.Components.tl0 S;
    public uc0 T;
    public View U;
    public f2.j0 V;
    public org.telegram.ui.ActionBar.w0 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public ImageView f35452a;
    public boolean f35453a0;
    public TextView f35454b;
    public long f35455b0;
    public ImageView f35456c;
    public boolean f35457c0;
    public org.telegram.ui.ActionBar.w0 d;
    public final ArrayList f35458d0;
    public org.telegram.ui.Components.al f35459e;
    public final a0.h f35460e0;
    public LinearLayout f35461f;
    public long f35462f0;
    public boolean f35463g0;
    public ImageView h;
    public final ArrayList f35464h0;
    public AnimatorSet f35465i0;
    public IMapsProvider.IMarker f35466j0;
    public ad0 f35467k0;
    public FrameLayout f35468l0;
    public boolean m0;
    public TextView f35469n;
    public boolean f35470n0;
    public boolean f35471o0;
    public boolean f35472p0;
    public boolean f35473q0;
    public TextView f35474r;
    public boolean f35475r0;
    public Drawable f35476s;
    public boolean f35477s0;
    public Location f35478t0;
    public Location f35479u0;
    public oh.b3 v;
    public int f35480v0;
    public org.telegram.ui.ActionBar.w0 f35481w;
    public TLRPC.TL_channelLocation f35482w0;
    public yc0 f35483x;
    public TLRPC.TL_channelLocation f35484x0;
    public qh.f3 f35485y;
    public MessageObject f35486y0;
    public boolean f35487z0;

    public bd0(int i10) {
        super(null);
        this.C = new UndoView[2];
        this.Y = true;
        this.Z = false;
        this.f35453a0 = true;
        this.f35457c0 = true;
        this.f35458d0 = new ArrayList();
        this.f35460e0 = new a0.h();
        this.f35462f0 = -1L;
        this.f35464h0 = new ArrayList();
        this.m0 = true;
        this.f35470n0 = true;
        this.E0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.L0 = true;
        this.N0 = new Bitmap[7];
        this.D0 = i10;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static void U(bd0 bd0Var) {
        IMapsProvider.IMap iMap;
        Activity parentActivity;
        int i10 = bd0Var.D0;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = bd0Var.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            if (bd0Var.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bd0Var.getParentActivity());
                alertDialog$Builder.m(R.raw.permission_request_location, 72, bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.L5), null);
                alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new ic0(bd0Var, 1));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                bd0Var.showDialog(alertDialog$Builder.f21166a);
            }
        } else if (bd0Var.d0() || i10 == 3) {
            if ((bd0Var.f35486y0 != null && i10 != 3) || bd0Var.f35482w0 != null) {
                if (bd0Var.f35478t0 != null && (iMap = bd0Var.F) != null) {
                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(bd0Var.f35478t0.getLatitude(), bd0Var.f35478t0.getLongitude()), bd0Var.F.getMaxZoomLevel() - 4.0f));
                }
            } else if (bd0Var.f35478t0 != null && bd0Var.F != null) {
                ImageView imageView = bd0Var.f35452a;
                int i11 = org.telegram.ui.ActionBar.k6.vi;
                imageView.setColorFilter(new PorterDuffColorFilter(bd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                bd0Var.f35452a.setTag(Integer.valueOf(i11));
                bd0Var.Q.L(null);
                bd0Var.f35487z0 = false;
                bd0Var.y0(false);
                bd0Var.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(bd0Var.f35478t0.getLatitude(), bd0Var.f35478t0.getLongitude())));
                if (bd0Var.A0 && i10 != 8) {
                    Location location = bd0Var.f35478t0;
                    if (location != null) {
                        bd0Var.Q.H(null, location, true);
                    }
                    bd0Var.A0 = false;
                    bd0Var.x0();
                }
            }
            if (bd0Var.f35466j0 != null) {
                bd0Var.U.setVisibility(0);
                yc0 yc0Var = bd0Var.f35483x;
                IMapsProvider.IMarker iMarker = bd0Var.f35466j0;
                HashMap hashMap = yc0Var.f43600a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    yc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                bd0Var.f35466j0 = null;
                bd0Var.f35467k0 = null;
                bd0Var.f35468l0 = null;
            }
        }
    }

    public static void V(bd0 bd0Var, boolean z4, TLRPC.User user, int i10) {
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z4) {
            LocationController.SharingLocationInfo sharingLocationInfo = bd0Var.getLocationController().getSharingLocationInfo(bd0Var.f35455b0);
            if (sharingLocationInfo != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = bd0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
                tL_messages_editMessage.f20926id = sharingLocationInfo.mid;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location lastKnownLocation = LocationController.getInstance(bd0Var.currentAccount).getLastKnownLocation();
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
                    bd0Var.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
                }
                bd0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
                return;
            }
            return;
        }
        bd0Var.w0(i10, user, 0);
    }

    public static void W(bd0 bd0Var) {
        kc0 kc0Var;
        bd0Var.getLocationController().markLiveLoactionsAsRead(bd0Var.f35455b0);
        if (!bd0Var.isPaused && (kc0Var = bd0Var.G0) != null) {
            AndroidUtilities.runOnUIThread(kc0Var, 5000L);
        }
    }

    public static IMapsProvider.LatLng p0(IMapsProvider.LatLng latLng, double d, double d10) {
        double degrees = Math.toDegrees(d10 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final void A0(boolean z4) {
        int i10;
        int i11;
        int i12;
        FrameLayout.LayoutParams layoutParams;
        float f10;
        f2.m1 K = this.R.K(0);
        if (K != null) {
            i10 = (int) K.f5875a.getY();
            i11 = Math.min(i10, 0) + this.E0;
        } else {
            i10 = -this.P.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            if (i11 <= 0) {
                if (this.H.getView().getVisibility() == 0) {
                    this.H.getView().setVisibility(4);
                    this.P.setVisibility(4);
                    yc0 yc0Var = this.f35483x;
                    if (yc0Var != null) {
                        yc0Var.setVisibility(4);
                    }
                }
            } else if (this.H.getView().getVisibility() == 4) {
                this.H.getView().setVisibility(0);
                this.P.setVisibility(0);
                yc0 yc0Var2 = this.f35483x;
                if (yc0Var2 != null) {
                    yc0Var2.setVisibility(0);
                }
            }
            this.P.setTranslationY(Math.min(0, i10));
            int i13 = -i10;
            int i14 = i13 / 2;
            this.H.getView().setTranslationY(Math.max(0, i14));
            yc0 yc0Var3 = this.f35483x;
            if (yc0Var3 != null) {
                yc0Var3.setTranslationY(Math.max(0, i14));
            }
            int measuredHeight = this.E0 - this.d.getMeasuredHeight();
            int i15 = this.D0;
            if (i15 != 0 && i15 != 1) {
                i12 = 10;
            } else {
                i12 = 30;
            }
            float min = Math.min(measuredHeight - AndroidUtilities.dp(64 + i12), i13);
            this.d.setTranslationY(min);
            this.f35456c.setTranslationY(min);
            qh.f3 f3Var = this.f35485y;
            if (f3Var != null) {
                f3Var.setTranslationY(min);
            }
            org.telegram.ui.Components.al alVar = this.f35459e;
            if (alVar != null) {
                alVar.f25284c = min;
                alVar.setTranslationY(min + alVar.f25283b);
            }
            View view = this.U;
            if (view != null) {
                if (view.getTag() == null) {
                    f10 = 48.0f;
                } else {
                    f10 = 69.0f;
                }
                int dp = (i11 / 2) + (i13 - AndroidUtilities.dp(f10));
                this.f35480v0 = dp;
                view.setTranslationY(dp);
            }
            if (!z4) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.H.getView().getLayoutParams();
                if (layoutParams2 != null) {
                    if (layoutParams2.height != AndroidUtilities.dp(10.0f) + this.E0) {
                        layoutParams2.height = AndroidUtilities.dp(10.0f) + this.E0;
                        IMapsProvider.IMap iMap = this.F;
                        if (iMap != null) {
                            iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                        }
                        this.H.getView().setLayoutParams(layoutParams2);
                    }
                }
                yc0 yc0Var4 = this.f35483x;
                if (yc0Var4 != null && (layoutParams = (FrameLayout.LayoutParams) yc0Var4.getLayoutParams()) != null) {
                    if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.E0) {
                        layoutParams.height = AndroidUtilities.dp(10.0f) + this.E0;
                        this.f35483x.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    public final void B0() {
        if (this.f35471o0) {
            if (this.f35473q0) {
                this.S.setEmptyView(null);
                this.f35461f.setVisibility(8);
                this.S.setVisibility(8);
                return;
            }
            this.S.setEmptyView(this.f35461f);
            return;
        }
        this.f35461f.setVisibility(8);
    }

    public final void C0() {
        int i10;
        boolean z4;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.f35454b == null) {
            return;
        }
        boolean z10 = false;
        if (this.f35463g0) {
            z0(false, true);
            j0();
            return;
        }
        if (getConnectionsManager() != null) {
            i10 = getConnectionsManager().getCurrentTime();
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.f35458d0;
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.Message message = ((vc0) arrayList.get(i13)).f42201b;
            if (message != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                i12++;
            }
        }
        if (this.f35460e0.f(getUserConfig().getClientUserId()) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f35478t0 != null && !z4) {
            i12++;
        }
        if (i12 >= 2) {
            z10 = true;
        }
        z0(z10, true);
    }

    public final vc0 c0(TLRPC.Message message) {
        vc0 vc0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.h hVar = this.f35460e0;
        vc0 vc0Var2 = (vc0) hVar.f(fromChatId);
        if (vc0Var2 == null) {
            ?? obj = new Object();
            obj.f42201b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f42202c = getMessagesController().getUser(Long.valueOf(obj.f42201b.from_id.user_id));
                obj.f42200a = obj.f42201b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    obj.f42202c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    obj.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                obj.f42200a = dialogId;
            }
            v0(obj);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap g02 = g0(obj);
                vc0Var = obj;
                if (g02 != null) {
                    position.icon(g02);
                    position.anchor(0.5f, 0.907f);
                    obj.f42203e = this.F.addMarker(position);
                    if (!UserObject.isUserSelf(obj.f42202c)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.F.addMarker(flat);
                        obj.f42204f = addMarker;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            addMarker.setRotation(i10);
                            obj.f42204f.setIcon(R.drawable.map_pin_cone2);
                            obj.f42205g = true;
                        } else {
                            addMarker.setRotation(0);
                            obj.f42204f.setIcon(R.drawable.map_pin_circle);
                            obj.f42205g = false;
                        }
                    }
                    this.f35458d0.add(obj);
                    hVar.k(obj, obj.f42200a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f35455b0);
                    int i11 = (obj.f42200a > getUserConfig().getClientUserId() ? 1 : (obj.f42200a == getUserConfig().getClientUserId() ? 0 : -1));
                    vc0Var = obj;
                    vc0Var = obj;
                    if (i11 == 0 && sharingLocationInfo != null) {
                        int i12 = obj.f42201b.f20864id;
                        vc0Var = obj;
                        if (i12 == sharingLocationInfo.mid) {
                            Location location = this.f35478t0;
                            vc0Var = obj;
                            if (location != null) {
                                obj.f42203e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.f35478t0.getLongitude()));
                                vc0Var = obj;
                            }
                        }
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                vc0Var = obj;
            }
        } else {
            vc0Var2.f42201b = message;
            vc0Var2.f42203e.setPosition(latLng);
            int i13 = (this.f35462f0 > vc0Var2.f42200a ? 1 : (this.f35462f0 == vc0Var2.f42200a ? 0 : -1));
            vc0Var = vc0Var2;
            if (i13 == 0) {
                this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(vc0Var2.f42203e.getPosition()));
                vc0Var = vc0Var2;
            }
        }
        org.telegram.ui.Components.ni0 ni0Var = this.O;
        if (ni0Var != null) {
            ni0Var.c(true);
        }
        C0();
        return vc0Var;
    }

    @Override
    public final View createView(Context context) {
        boolean z4;
        FrameLayout.LayoutParams layoutParams;
        TLRPC.Chat chat;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.f35472p0 = false;
        this.f35471o0 = false;
        this.f35473q0 = false;
        pc0 pc0Var = this.Q;
        if (pc0Var != null) {
            pc0Var.F();
        }
        uc0 uc0Var = this.T;
        if (uc0Var != null) {
            uc0Var.F();
        }
        if (this.f35482w0 != null) {
            Location location = new Location("network");
            this.f35479u0 = location;
            location.setLatitude(this.f35482w0.geo_point.lat);
            this.f35479u0.setLongitude(this.f35482w0.geo_point._long);
        } else if (this.f35486y0 != null) {
            Location location2 = new Location("network");
            this.f35479u0 = location2;
            location2.setLatitude(this.f35486y0.messageOwner.media.geo.lat);
            this.f35479u0.setLongitude(this.f35486y0.messageOwner.media.geo._long);
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.Z = z4;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.f21731h5;
        kVar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.k6.f21766j5;
        kVar2.setTitleColor(getThemedColor(i13));
        this.actionBar.C(getThemedColor(i13), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.k6.I5), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new oc0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        TLRPC.TL_channelLocation tL_channelLocation = this.f35482w0;
        int i14 = this.D0;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.f35486y0;
            if (messageObject != null) {
                if (messageObject.isLiveLocation()) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                    org.telegram.ui.ActionBar.w0 c3 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                    this.W = c3;
                    c3.e(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
                } else {
                    String str = this.f35486y0.messageOwner.media.title;
                    if (str != null && str.length() > 0) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                    }
                    if (i14 != 3) {
                        org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                        this.W = c10;
                        c10.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                        if (!getLocationController().isSharingLocation(this.f35455b0) && this.L0) {
                            this.W.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                        }
                        this.W.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                    }
                }
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i14 != 4) {
                    this.f35483x = new yc0(this, context);
                    org.telegram.ui.ActionBar.w0 c11 = n10.c(0, R.drawable.outline_header_search, getResourceProvider());
                    c11.F();
                    c11.E = new fb(this, 11);
                    this.f35481w = c11;
                    c11.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.f35481w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.f35481w.getSearchField();
                    searchField.setTextColor(getThemedColor(i13));
                    searchField.setCursorColor(getThemedColor(i13));
                    searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Vd));
                }
            }
        }
        zc0 zc0Var = new zc0(this, context);
        this.fragmentView = zc0Var;
        zc0Var.setBackgroundColor(getThemedColor(i12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f35476s = mutate;
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.f35476s.getPadding(rect);
        if (i14 != 0 && i14 != 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top);
        }
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        layoutParams2.gravity = 83;
        l0 l0Var = new l0(this, context, 11);
        this.P = l0Var;
        l0Var.setBackgroundDrawable(new ef.f(n0()));
        MessageObject messageObject2 = this.f35486y0;
        if ((messageObject2 == null && (i14 == 0 || i14 == 1)) || (messageObject2 != null && i14 == 3)) {
            org.telegram.ui.Components.al alVar = new org.telegram.ui.Components.al(context, 1);
            this.f35459e = alVar;
            alVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int dp = AndroidUtilities.dp(40.0f);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.wi);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.xi);
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3);
            k7.e6.a(this.f35459e);
            this.f35459e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.f35459e.setOutlineProvider(lf.q0.f12505b);
            this.f35459e.setBackgroundDrawable(i02);
            this.f35459e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.vi));
            this.f35459e.setTextSize(1, 14.0f);
            this.f35459e.setTypeface(AndroidUtilities.bold());
            this.f35459e.setGravity(17);
            this.f35459e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.P.addView(this.f35459e, k7.c6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (i14 == 3) {
                this.f35459e.setText(LocaleController.getString(R.string.OpenInMaps));
                this.f35459e.setOnClickListener(new View.OnClickListener(this) {
                    public final bd0 f37457b;

                    {
                        this.f37457b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        TLRPC.User user;
                        boolean z13;
                        int i15 = r2;
                        bd0 bd0Var = this.f37457b;
                        switch (i15) {
                            case 0:
                                bd0Var.y0(false);
                                bd0Var.Q.H(null, bd0Var.f35479u0, true);
                                bd0Var.A0 = true;
                                bd0Var.x0();
                                return;
                            case 1:
                                bd0Var.d.M(null, null);
                                return;
                            case 2:
                                bd0.U(bd0Var);
                                return;
                            case 3:
                                bd0Var.f35462f0 = -1L;
                                bd0Var.f35487z0 = true;
                                if (bd0Var.j0()) {
                                    bd0Var.f35463g0 = true;
                                    bd0Var.z0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (bd0Var.getParentActivity() != null && bd0Var.f35478t0 != null && bd0Var.d0() && bd0Var.F != null) {
                                    qh.f3 f3Var = bd0Var.f35485y;
                                    if (f3Var != null) {
                                        f3Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = bd0Var.getLocationController().getSharingLocationInfo(bd0Var.f35455b0);
                                    if (bd0Var.D) {
                                        bd0Var.C[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        bd0Var.f35456c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = bd0Var.L;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            bd0Var.L = null;
                                        }
                                        bd0Var.D = true;
                                        bd0Var.m0().k(0L, 25, 0, null, new kc0(bd0Var, 1), new v10(26, bd0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = bd0Var.L;
                                    if (iCircle2 == null) {
                                        bd0Var.e0(500);
                                    } else {
                                        bd0Var.M = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(bd0Var.f35455b0)) {
                                        user = bd0Var.getMessagesController().getUser(Long.valueOf(bd0Var.f35455b0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity = bd0Var.getParentActivity();
                                    ic0 ic0Var = new ic0(bd0Var, 3);
                                    rs rsVar = new rs(22, bd0Var, user);
                                    kc0 kc0Var = new kc0(bd0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity);
                                    frameLayout.f29511a = null;
                                    frameLayout.d = -1;
                                    frameLayout.f29514e = false;
                                    frameLayout.f29515f = false;
                                    frameLayout.h = null;
                                    frameLayout.f29516n = new Rect();
                                    new Paint();
                                    frameLayout.f29519w = true;
                                    frameLayout.C = org.telegram.ui.Components.pr.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.N = kc0Var;
                                    frameLayout.f29521y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false), PorterDuff.Mode.MULTIPLY));
                                    mutate2.getPadding(rect2);
                                    int i16 = rect2.left;
                                    frameLayout.f29520x = i16;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i16, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i16, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, k7.c6.e(-1, -2, 80));
                                    frameLayout.L = LocaleController.getUseImperialSystemType();
                                    frameLayout.J = user;
                                    frameLayout.F = ic0Var;
                                    org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(parentActivity, null);
                                    frameLayout.D = yc0Var;
                                    yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    yc0Var.setItemCount(5);
                                    org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0(parentActivity, null);
                                    frameLayout.E = yc0Var2;
                                    yc0Var2.setItemCount(5);
                                    yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(frameLayout, parentActivity);
                                    frameLayout.M = ki0Var;
                                    ki0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                    ki0Var.addView(frameLayout3, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false), 1, 20.0f);
                                    frameLayout3.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(19));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    ki0Var.addView(linearLayout, k7.c6.n(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                                    TextView textView2 = new TextView(parentActivity);
                                    frameLayout.H = textView2;
                                    ?? textView3 = new TextView(parentActivity);
                                    frameLayout.G = textView3;
                                    linearLayout.addView(yc0Var, k7.c6.l(0.5f, 0, 270));
                                    yc0Var.setFormatter(new org.telegram.ui.Components.ii0(frameLayout, 0));
                                    yc0Var.setMinValue(0);
                                    yc0Var.setMaxValue(10);
                                    yc0Var.setWrapSelectorWheel(false);
                                    yc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(frameLayout, 1);
                                    yc0Var.setOnValueChangedListener(ii0Var);
                                    yc0Var2.setMinValue(0);
                                    yc0Var2.setMaxValue(10);
                                    yc0Var2.setWrapSelectorWheel(false);
                                    yc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(yc0Var2, k7.c6.l(0.5f, 0, 270));
                                    yc0Var2.setFormatter(new org.telegram.ui.Components.ii0(frameLayout, 2));
                                    yc0Var2.setOnValueChangedListener(ii0Var);
                                    yc0Var.setValue(0);
                                    yc0Var2.setValue(6);
                                    ki0Var.addView(frameLayout4, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                                    frameLayout4.addView((View) textView3, k7.c6.c(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.w2(26, frameLayout, rsVar));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21893q5, false));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, k7.c6.c(48.0f, -1));
                                    frameLayout2.addView(ki0Var, k7.c6.e(-1, -2, 51));
                                    bd0Var.O = frameLayout;
                                    ((FrameLayout) bd0Var.fragmentView).addView((View) frameLayout, k7.c6.c(-1.0f, -1));
                                    org.telegram.ui.Components.ni0 ni0Var = bd0Var.O;
                                    ni0Var.f29517r = false;
                                    AnimatorSet animatorSet = ni0Var.f29518s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        ni0Var.f29518s = null;
                                    }
                                    org.telegram.ui.Components.ji0 ji0Var = ni0Var.v;
                                    ji0Var.measure(View.MeasureSpec.makeMeasureSpec((ni0Var.f29520x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (ni0Var.f29517r) {
                                        z13 = true;
                                    } else {
                                        ji0Var.setVisibility(0);
                                        if (ni0Var.f29519w) {
                                            ni0Var.setLayerType(2, null);
                                        }
                                        ji0Var.setTranslationY(ji0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        ni0Var.f29518s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ji0Var, View.TRANSLATION_Y, 0.0f));
                                        ni0Var.f29518s.setDuration(400L);
                                        ni0Var.f29518s.setStartDelay(20L);
                                        ni0Var.f29518s.setInterpolator(ni0Var.C);
                                        z13 = true;
                                        ni0Var.f29518s.addListener(new org.telegram.ui.Components.mi0(ni0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        ni0Var.f29518s.start();
                                    }
                                    ni0Var.c(z13);
                                    return;
                                }
                                return;
                            default:
                                bd0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = bd0Var.f35486y0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    bd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    return;
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    return;
                                }
                        }
                    }
                });
                this.f35459e.setTranslationX(0.0f);
            } else {
                this.f35459e.setText(LocaleController.getString(R.string.PlacesInThisArea));
                this.f35459e.setOnClickListener(new View.OnClickListener(this) {
                    public final bd0 f37457b;

                    {
                        this.f37457b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        TLRPC.User user;
                        boolean z13;
                        int i15 = r2;
                        bd0 bd0Var = this.f37457b;
                        switch (i15) {
                            case 0:
                                bd0Var.y0(false);
                                bd0Var.Q.H(null, bd0Var.f35479u0, true);
                                bd0Var.A0 = true;
                                bd0Var.x0();
                                return;
                            case 1:
                                bd0Var.d.M(null, null);
                                return;
                            case 2:
                                bd0.U(bd0Var);
                                return;
                            case 3:
                                bd0Var.f35462f0 = -1L;
                                bd0Var.f35487z0 = true;
                                if (bd0Var.j0()) {
                                    bd0Var.f35463g0 = true;
                                    bd0Var.z0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (bd0Var.getParentActivity() != null && bd0Var.f35478t0 != null && bd0Var.d0() && bd0Var.F != null) {
                                    qh.f3 f3Var = bd0Var.f35485y;
                                    if (f3Var != null) {
                                        f3Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = bd0Var.getLocationController().getSharingLocationInfo(bd0Var.f35455b0);
                                    if (bd0Var.D) {
                                        bd0Var.C[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        bd0Var.f35456c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = bd0Var.L;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            bd0Var.L = null;
                                        }
                                        bd0Var.D = true;
                                        bd0Var.m0().k(0L, 25, 0, null, new kc0(bd0Var, 1), new v10(26, bd0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = bd0Var.L;
                                    if (iCircle2 == null) {
                                        bd0Var.e0(500);
                                    } else {
                                        bd0Var.M = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(bd0Var.f35455b0)) {
                                        user = bd0Var.getMessagesController().getUser(Long.valueOf(bd0Var.f35455b0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity = bd0Var.getParentActivity();
                                    ic0 ic0Var = new ic0(bd0Var, 3);
                                    rs rsVar = new rs(22, bd0Var, user);
                                    kc0 kc0Var = new kc0(bd0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity);
                                    frameLayout.f29511a = null;
                                    frameLayout.d = -1;
                                    frameLayout.f29514e = false;
                                    frameLayout.f29515f = false;
                                    frameLayout.h = null;
                                    frameLayout.f29516n = new Rect();
                                    new Paint();
                                    frameLayout.f29519w = true;
                                    frameLayout.C = org.telegram.ui.Components.pr.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.N = kc0Var;
                                    frameLayout.f29521y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false), PorterDuff.Mode.MULTIPLY));
                                    mutate2.getPadding(rect2);
                                    int i16 = rect2.left;
                                    frameLayout.f29520x = i16;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i16, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i16, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, k7.c6.e(-1, -2, 80));
                                    frameLayout.L = LocaleController.getUseImperialSystemType();
                                    frameLayout.J = user;
                                    frameLayout.F = ic0Var;
                                    org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(parentActivity, null);
                                    frameLayout.D = yc0Var;
                                    yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    yc0Var.setItemCount(5);
                                    org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0(parentActivity, null);
                                    frameLayout.E = yc0Var2;
                                    yc0Var2.setItemCount(5);
                                    yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(frameLayout, parentActivity);
                                    frameLayout.M = ki0Var;
                                    ki0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                    ki0Var.addView(frameLayout3, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false), 1, 20.0f);
                                    frameLayout3.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(19));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    ki0Var.addView(linearLayout, k7.c6.n(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                                    TextView textView2 = new TextView(parentActivity);
                                    frameLayout.H = textView2;
                                    ?? textView3 = new TextView(parentActivity);
                                    frameLayout.G = textView3;
                                    linearLayout.addView(yc0Var, k7.c6.l(0.5f, 0, 270));
                                    yc0Var.setFormatter(new org.telegram.ui.Components.ii0(frameLayout, 0));
                                    yc0Var.setMinValue(0);
                                    yc0Var.setMaxValue(10);
                                    yc0Var.setWrapSelectorWheel(false);
                                    yc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(frameLayout, 1);
                                    yc0Var.setOnValueChangedListener(ii0Var);
                                    yc0Var2.setMinValue(0);
                                    yc0Var2.setMaxValue(10);
                                    yc0Var2.setWrapSelectorWheel(false);
                                    yc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(yc0Var2, k7.c6.l(0.5f, 0, 270));
                                    yc0Var2.setFormatter(new org.telegram.ui.Components.ii0(frameLayout, 2));
                                    yc0Var2.setOnValueChangedListener(ii0Var);
                                    yc0Var.setValue(0);
                                    yc0Var2.setValue(6);
                                    ki0Var.addView(frameLayout4, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                                    frameLayout4.addView((View) textView3, k7.c6.c(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.w2(26, frameLayout, rsVar));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21893q5, false));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, k7.c6.c(48.0f, -1));
                                    frameLayout2.addView(ki0Var, k7.c6.e(-1, -2, 51));
                                    bd0Var.O = frameLayout;
                                    ((FrameLayout) bd0Var.fragmentView).addView((View) frameLayout, k7.c6.c(-1.0f, -1));
                                    org.telegram.ui.Components.ni0 ni0Var = bd0Var.O;
                                    ni0Var.f29517r = false;
                                    AnimatorSet animatorSet = ni0Var.f29518s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        ni0Var.f29518s = null;
                                    }
                                    org.telegram.ui.Components.ji0 ji0Var = ni0Var.v;
                                    ji0Var.measure(View.MeasureSpec.makeMeasureSpec((ni0Var.f29520x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (ni0Var.f29517r) {
                                        z13 = true;
                                    } else {
                                        ji0Var.setVisibility(0);
                                        if (ni0Var.f29519w) {
                                            ni0Var.setLayerType(2, null);
                                        }
                                        ji0Var.setTranslationY(ji0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        ni0Var.f29518s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ji0Var, View.TRANSLATION_Y, 0.0f));
                                        ni0Var.f29518s.setDuration(400L);
                                        ni0Var.f29518s.setStartDelay(20L);
                                        ni0Var.f29518s.setInterpolator(ni0Var.C);
                                        z13 = true;
                                        ni0Var.f29518s.addListener(new org.telegram.ui.Components.mi0(ni0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        ni0Var.f29518s.start();
                                    }
                                    ni0Var.c(z13);
                                    return;
                                }
                                return;
                            default:
                                bd0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = bd0Var.f35486y0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    bd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    return;
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    return;
                                }
                        }
                    }
                });
            }
        }
        int i15 = org.telegram.ui.ActionBar.k6.ui;
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
        int i16 = org.telegram.ui.ActionBar.k6.wi;
        int themedColor4 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.k6.xi;
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.k6.h0(dp2, themedColor4, getThemedColor(i17));
        k7.e6.a(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.d;
        hg.j1 j1Var = lf.q0.f12504a;
        w0Var2.setOutlineProvider(j1Var);
        this.d.setBackgroundDrawable(h02);
        this.d.setIcon(R.drawable.msg_map_type);
        this.P.addView(this.d, k7.c6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final bd0 f37457b;

            {
                this.f37457b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z13;
                int i152 = r2;
                bd0 bd0Var = this.f37457b;
                switch (i152) {
                    case 0:
                        bd0Var.y0(false);
                        bd0Var.Q.H(null, bd0Var.f35479u0, true);
                        bd0Var.A0 = true;
                        bd0Var.x0();
                        return;
                    case 1:
                        bd0Var.d.M(null, null);
                        return;
                    case 2:
                        bd0.U(bd0Var);
                        return;
                    case 3:
                        bd0Var.f35462f0 = -1L;
                        bd0Var.f35487z0 = true;
                        if (bd0Var.j0()) {
                            bd0Var.f35463g0 = true;
                            bd0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (bd0Var.getParentActivity() != null && bd0Var.f35478t0 != null && bd0Var.d0() && bd0Var.F != null) {
                            qh.f3 f3Var = bd0Var.f35485y;
                            if (f3Var != null) {
                                f3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = bd0Var.getLocationController().getSharingLocationInfo(bd0Var.f35455b0);
                            if (bd0Var.D) {
                                bd0Var.C[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                bd0Var.f35456c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = bd0Var.L;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    bd0Var.L = null;
                                }
                                bd0Var.D = true;
                                bd0Var.m0().k(0L, 25, 0, null, new kc0(bd0Var, 1), new v10(26, bd0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = bd0Var.L;
                            if (iCircle2 == null) {
                                bd0Var.e0(500);
                            } else {
                                bd0Var.M = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(bd0Var.f35455b0)) {
                                user = bd0Var.getMessagesController().getUser(Long.valueOf(bd0Var.f35455b0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = bd0Var.getParentActivity();
                            ic0 ic0Var = new ic0(bd0Var, 3);
                            rs rsVar = new rs(22, bd0Var, user);
                            kc0 kc0Var = new kc0(bd0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f29511a = null;
                            frameLayout.d = -1;
                            frameLayout.f29514e = false;
                            frameLayout.f29515f = false;
                            frameLayout.h = null;
                            frameLayout.f29516n = new Rect();
                            new Paint();
                            frameLayout.f29519w = true;
                            frameLayout.C = org.telegram.ui.Components.pr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.N = kc0Var;
                            frameLayout.f29521y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f29520x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, k7.c6.e(-1, -2, 80));
                            frameLayout.L = LocaleController.getUseImperialSystemType();
                            frameLayout.J = user;
                            frameLayout.F = ic0Var;
                            org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(parentActivity, null);
                            frameLayout.D = yc0Var;
                            yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            yc0Var.setItemCount(5);
                            org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0(parentActivity, null);
                            frameLayout.E = yc0Var2;
                            yc0Var2.setItemCount(5);
                            yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(frameLayout, parentActivity);
                            frameLayout.M = ki0Var;
                            ki0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            ki0Var.addView(frameLayout3, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false), 1, 20.0f);
                            frameLayout3.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(19));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            ki0Var.addView(linearLayout, k7.c6.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView2 = new TextView(parentActivity);
                            frameLayout.H = textView2;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.G = textView3;
                            linearLayout.addView(yc0Var, k7.c6.l(0.5f, 0, 270));
                            yc0Var.setFormatter(new org.telegram.ui.Components.ii0(frameLayout, 0));
                            yc0Var.setMinValue(0);
                            yc0Var.setMaxValue(10);
                            yc0Var.setWrapSelectorWheel(false);
                            yc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(frameLayout, 1);
                            yc0Var.setOnValueChangedListener(ii0Var);
                            yc0Var2.setMinValue(0);
                            yc0Var2.setMaxValue(10);
                            yc0Var2.setWrapSelectorWheel(false);
                            yc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(yc0Var2, k7.c6.l(0.5f, 0, 270));
                            yc0Var2.setFormatter(new org.telegram.ui.Components.ii0(frameLayout, 2));
                            yc0Var2.setOnValueChangedListener(ii0Var);
                            yc0Var.setValue(0);
                            yc0Var2.setValue(6);
                            ki0Var.addView(frameLayout4, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                            frameLayout4.addView((View) textView3, k7.c6.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.w2(26, frameLayout, rsVar));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21893q5, false));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, k7.c6.c(48.0f, -1));
                            frameLayout2.addView(ki0Var, k7.c6.e(-1, -2, 51));
                            bd0Var.O = frameLayout;
                            ((FrameLayout) bd0Var.fragmentView).addView((View) frameLayout, k7.c6.c(-1.0f, -1));
                            org.telegram.ui.Components.ni0 ni0Var = bd0Var.O;
                            ni0Var.f29517r = false;
                            AnimatorSet animatorSet = ni0Var.f29518s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ni0Var.f29518s = null;
                            }
                            org.telegram.ui.Components.ji0 ji0Var = ni0Var.v;
                            ji0Var.measure(View.MeasureSpec.makeMeasureSpec((ni0Var.f29520x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (ni0Var.f29517r) {
                                z13 = true;
                            } else {
                                ji0Var.setVisibility(0);
                                if (ni0Var.f29519w) {
                                    ni0Var.setLayerType(2, null);
                                }
                                ji0Var.setTranslationY(ji0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ni0Var.f29518s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(ji0Var, View.TRANSLATION_Y, 0.0f));
                                ni0Var.f29518s.setDuration(400L);
                                ni0Var.f29518s.setStartDelay(20L);
                                ni0Var.f29518s.setInterpolator(ni0Var.C);
                                z13 = true;
                                ni0Var.f29518s.addListener(new org.telegram.ui.Components.mi0(ni0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                ni0Var.f29518s.start();
                            }
                            ni0Var.c(z13);
                            return;
                        }
                        return;
                    default:
                        bd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = bd0Var.f35486y0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            bd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                }
            }
        });
        this.d.setDelegate(new ic0(this, 0));
        this.f35452a = new ImageView(context);
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i16), getThemedColor(i17));
        k7.e6.a(this.f35452a);
        this.f35452a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f35452a.setOutlineProvider(j1Var);
        this.f35452a.setBackground(h03);
        this.f35452a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.f35452a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f35452a;
        int i18 = org.telegram.ui.ActionBar.k6.vi;
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), mode));
        this.f35452a.setTag(Integer.valueOf(i18));
        this.f35452a.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams d = k7.c6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        d.bottomMargin = (layoutParams2.height - rect.top) + d.bottomMargin;
        this.P.addView(this.f35452a, d);
        this.f35452a.setOnClickListener(new View.OnClickListener(this) {
            public final bd0 f37457b;

            {
                this.f37457b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z13;
                int i152 = r2;
                bd0 bd0Var = this.f37457b;
                switch (i152) {
                    case 0:
                        bd0Var.y0(false);
                        bd0Var.Q.H(null, bd0Var.f35479u0, true);
                        bd0Var.A0 = true;
                        bd0Var.x0();
                        return;
                    case 1:
                        bd0Var.d.M(null, null);
                        return;
                    case 2:
                        bd0.U(bd0Var);
                        return;
                    case 3:
                        bd0Var.f35462f0 = -1L;
                        bd0Var.f35487z0 = true;
                        if (bd0Var.j0()) {
                            bd0Var.f35463g0 = true;
                            bd0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (bd0Var.getParentActivity() != null && bd0Var.f35478t0 != null && bd0Var.d0() && bd0Var.F != null) {
                            qh.f3 f3Var = bd0Var.f35485y;
                            if (f3Var != null) {
                                f3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = bd0Var.getLocationController().getSharingLocationInfo(bd0Var.f35455b0);
                            if (bd0Var.D) {
                                bd0Var.C[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                bd0Var.f35456c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = bd0Var.L;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    bd0Var.L = null;
                                }
                                bd0Var.D = true;
                                bd0Var.m0().k(0L, 25, 0, null, new kc0(bd0Var, 1), new v10(26, bd0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = bd0Var.L;
                            if (iCircle2 == null) {
                                bd0Var.e0(500);
                            } else {
                                bd0Var.M = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(bd0Var.f35455b0)) {
                                user = bd0Var.getMessagesController().getUser(Long.valueOf(bd0Var.f35455b0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = bd0Var.getParentActivity();
                            ic0 ic0Var = new ic0(bd0Var, 3);
                            rs rsVar = new rs(22, bd0Var, user);
                            kc0 kc0Var = new kc0(bd0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f29511a = null;
                            frameLayout.d = -1;
                            frameLayout.f29514e = false;
                            frameLayout.f29515f = false;
                            frameLayout.h = null;
                            frameLayout.f29516n = new Rect();
                            new Paint();
                            frameLayout.f29519w = true;
                            frameLayout.C = org.telegram.ui.Components.pr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.N = kc0Var;
                            frameLayout.f29521y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f29520x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, k7.c6.e(-1, -2, 80));
                            frameLayout.L = LocaleController.getUseImperialSystemType();
                            frameLayout.J = user;
                            frameLayout.F = ic0Var;
                            org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(parentActivity, null);
                            frameLayout.D = yc0Var;
                            yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            yc0Var.setItemCount(5);
                            org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0(parentActivity, null);
                            frameLayout.E = yc0Var2;
                            yc0Var2.setItemCount(5);
                            yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(frameLayout, parentActivity);
                            frameLayout.M = ki0Var;
                            ki0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            ki0Var.addView(frameLayout3, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false), 1, 20.0f);
                            frameLayout3.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(19));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            ki0Var.addView(linearLayout, k7.c6.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView2 = new TextView(parentActivity);
                            frameLayout.H = textView2;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.G = textView3;
                            linearLayout.addView(yc0Var, k7.c6.l(0.5f, 0, 270));
                            yc0Var.setFormatter(new org.telegram.ui.Components.ii0(frameLayout, 0));
                            yc0Var.setMinValue(0);
                            yc0Var.setMaxValue(10);
                            yc0Var.setWrapSelectorWheel(false);
                            yc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(frameLayout, 1);
                            yc0Var.setOnValueChangedListener(ii0Var);
                            yc0Var2.setMinValue(0);
                            yc0Var2.setMaxValue(10);
                            yc0Var2.setWrapSelectorWheel(false);
                            yc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(yc0Var2, k7.c6.l(0.5f, 0, 270));
                            yc0Var2.setFormatter(new org.telegram.ui.Components.ii0(frameLayout, 2));
                            yc0Var2.setOnValueChangedListener(ii0Var);
                            yc0Var.setValue(0);
                            yc0Var2.setValue(6);
                            ki0Var.addView(frameLayout4, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                            frameLayout4.addView((View) textView3, k7.c6.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.w2(26, frameLayout, rsVar));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21893q5, false));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, k7.c6.c(48.0f, -1));
                            frameLayout2.addView(ki0Var, k7.c6.e(-1, -2, 51));
                            bd0Var.O = frameLayout;
                            ((FrameLayout) bd0Var.fragmentView).addView((View) frameLayout, k7.c6.c(-1.0f, -1));
                            org.telegram.ui.Components.ni0 ni0Var = bd0Var.O;
                            ni0Var.f29517r = false;
                            AnimatorSet animatorSet = ni0Var.f29518s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ni0Var.f29518s = null;
                            }
                            org.telegram.ui.Components.ji0 ji0Var = ni0Var.v;
                            ji0Var.measure(View.MeasureSpec.makeMeasureSpec((ni0Var.f29520x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (ni0Var.f29517r) {
                                z13 = true;
                            } else {
                                ji0Var.setVisibility(0);
                                if (ni0Var.f29519w) {
                                    ni0Var.setLayerType(2, null);
                                }
                                ji0Var.setTranslationY(ji0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ni0Var.f29518s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(ji0Var, View.TRANSLATION_Y, 0.0f));
                                ni0Var.f29518s.setDuration(400L);
                                ni0Var.f29518s.setStartDelay(20L);
                                ni0Var.f29518s.setInterpolator(ni0Var.C);
                                z13 = true;
                                ni0Var.f29518s.addListener(new org.telegram.ui.Components.mi0(ni0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                ni0Var.f29518s.start();
                            }
                            ni0Var.c(z13);
                            return;
                        }
                        return;
                    default:
                        bd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = bd0Var.f35486y0.messageOwner.media.geo;
                            double d10 = geoPoint.lat;
                            double d102 = geoPoint._long;
                            bd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d10 + "," + d102 + "?q=" + d10 + "," + d102)));
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                }
            }
        });
        TextView textView = new TextView(context);
        this.f35454b = textView;
        textView.setGravity(17);
        this.f35454b.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f35454b.setTextSize(1, 15.0f);
        this.f35454b.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, this.resourceProvider));
        this.f35454b.setTypeface(AndroidUtilities.bold());
        this.f35454b.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.f35454b.setText(LocaleController.getString(R.string.LocationsShowAll));
        this.f35454b.setBackground(org.telegram.ui.ActionBar.k6.Z(getThemedColor(i16), getThemedColor(i17), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams d10 = k7.c6.d(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        d10.bottomMargin = (layoutParams2.height - rect.top) + d10.bottomMargin;
        this.P.addView(this.f35454b, d10);
        k7.e6.a(this.f35454b);
        this.f35454b.setOnClickListener(new View.OnClickListener(this) {
            public final bd0 f37457b;

            {
                this.f37457b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z13;
                int i152 = r2;
                bd0 bd0Var = this.f37457b;
                switch (i152) {
                    case 0:
                        bd0Var.y0(false);
                        bd0Var.Q.H(null, bd0Var.f35479u0, true);
                        bd0Var.A0 = true;
                        bd0Var.x0();
                        return;
                    case 1:
                        bd0Var.d.M(null, null);
                        return;
                    case 2:
                        bd0.U(bd0Var);
                        return;
                    case 3:
                        bd0Var.f35462f0 = -1L;
                        bd0Var.f35487z0 = true;
                        if (bd0Var.j0()) {
                            bd0Var.f35463g0 = true;
                            bd0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (bd0Var.getParentActivity() != null && bd0Var.f35478t0 != null && bd0Var.d0() && bd0Var.F != null) {
                            qh.f3 f3Var = bd0Var.f35485y;
                            if (f3Var != null) {
                                f3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = bd0Var.getLocationController().getSharingLocationInfo(bd0Var.f35455b0);
                            if (bd0Var.D) {
                                bd0Var.C[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                bd0Var.f35456c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = bd0Var.L;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    bd0Var.L = null;
                                }
                                bd0Var.D = true;
                                bd0Var.m0().k(0L, 25, 0, null, new kc0(bd0Var, 1), new v10(26, bd0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = bd0Var.L;
                            if (iCircle2 == null) {
                                bd0Var.e0(500);
                            } else {
                                bd0Var.M = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(bd0Var.f35455b0)) {
                                user = bd0Var.getMessagesController().getUser(Long.valueOf(bd0Var.f35455b0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = bd0Var.getParentActivity();
                            ic0 ic0Var = new ic0(bd0Var, 3);
                            rs rsVar = new rs(22, bd0Var, user);
                            kc0 kc0Var = new kc0(bd0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f29511a = null;
                            frameLayout.d = -1;
                            frameLayout.f29514e = false;
                            frameLayout.f29515f = false;
                            frameLayout.h = null;
                            frameLayout.f29516n = new Rect();
                            new Paint();
                            frameLayout.f29519w = true;
                            frameLayout.C = org.telegram.ui.Components.pr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.N = kc0Var;
                            frameLayout.f29521y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f29520x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, k7.c6.e(-1, -2, 80));
                            frameLayout.L = LocaleController.getUseImperialSystemType();
                            frameLayout.J = user;
                            frameLayout.F = ic0Var;
                            org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(parentActivity, null);
                            frameLayout.D = yc0Var;
                            yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            yc0Var.setItemCount(5);
                            org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0(parentActivity, null);
                            frameLayout.E = yc0Var2;
                            yc0Var2.setItemCount(5);
                            yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(frameLayout, parentActivity);
                            frameLayout.M = ki0Var;
                            ki0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            ki0Var.addView(frameLayout3, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.y3.t(textView2, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false), 1, 20.0f);
                            frameLayout3.addView(textView2, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new org.telegram.ui.ActionBar.s2(19));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            ki0Var.addView(linearLayout, k7.c6.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView22 = new TextView(parentActivity);
                            frameLayout.H = textView22;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.G = textView3;
                            linearLayout.addView(yc0Var, k7.c6.l(0.5f, 0, 270));
                            yc0Var.setFormatter(new org.telegram.ui.Components.ii0(frameLayout, 0));
                            yc0Var.setMinValue(0);
                            yc0Var.setMaxValue(10);
                            yc0Var.setWrapSelectorWheel(false);
                            yc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(frameLayout, 1);
                            yc0Var.setOnValueChangedListener(ii0Var);
                            yc0Var2.setMinValue(0);
                            yc0Var2.setMaxValue(10);
                            yc0Var2.setWrapSelectorWheel(false);
                            yc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(yc0Var2, k7.c6.l(0.5f, 0, 270));
                            yc0Var2.setFormatter(new org.telegram.ui.Components.ii0(frameLayout, 2));
                            yc0Var2.setOnValueChangedListener(ii0Var);
                            yc0Var.setValue(0);
                            yc0Var2.setValue(6);
                            ki0Var.addView(frameLayout4, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                            frameLayout4.addView((View) textView3, k7.c6.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.w2(26, frameLayout, rsVar));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            textView22.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21893q5, false));
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, k7.c6.c(48.0f, -1));
                            frameLayout2.addView(ki0Var, k7.c6.e(-1, -2, 51));
                            bd0Var.O = frameLayout;
                            ((FrameLayout) bd0Var.fragmentView).addView((View) frameLayout, k7.c6.c(-1.0f, -1));
                            org.telegram.ui.Components.ni0 ni0Var = bd0Var.O;
                            ni0Var.f29517r = false;
                            AnimatorSet animatorSet = ni0Var.f29518s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ni0Var.f29518s = null;
                            }
                            org.telegram.ui.Components.ji0 ji0Var = ni0Var.v;
                            ji0Var.measure(View.MeasureSpec.makeMeasureSpec((ni0Var.f29520x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (ni0Var.f29517r) {
                                z13 = true;
                            } else {
                                ji0Var.setVisibility(0);
                                if (ni0Var.f29519w) {
                                    ni0Var.setLayerType(2, null);
                                }
                                ji0Var.setTranslationY(ji0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ni0Var.f29518s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(ji0Var, View.TRANSLATION_Y, 0.0f));
                                ni0Var.f29518s.setDuration(400L);
                                ni0Var.f29518s.setStartDelay(20L);
                                ni0Var.f29518s.setInterpolator(ni0Var.C);
                                z13 = true;
                                ni0Var.f29518s.addListener(new org.telegram.ui.Components.mi0(ni0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                ni0Var.f29518s.start();
                            }
                            ni0Var.c(z13);
                            return;
                        }
                        return;
                    default:
                        bd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = bd0Var.f35486y0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            bd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                }
            }
        });
        z0(false, false);
        this.f35456c = new ImageView(context);
        org.telegram.ui.Cells.z h04 = org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i16), getThemedColor(i17));
        k7.e6.a(this.f35456c);
        this.f35456c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f35456c.setOutlineProvider(j1Var);
        this.f35456c.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        this.f35456c.setBackgroundDrawable(h04);
        this.f35456c.setScaleType(scaleType);
        this.f35456c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.P.addView(this.f35456c, k7.c6.d(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        this.f35456c.setOnClickListener(new View.OnClickListener(this) {
            public final bd0 f37457b;

            {
                this.f37457b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z13;
                int i152 = r2;
                bd0 bd0Var = this.f37457b;
                switch (i152) {
                    case 0:
                        bd0Var.y0(false);
                        bd0Var.Q.H(null, bd0Var.f35479u0, true);
                        bd0Var.A0 = true;
                        bd0Var.x0();
                        return;
                    case 1:
                        bd0Var.d.M(null, null);
                        return;
                    case 2:
                        bd0.U(bd0Var);
                        return;
                    case 3:
                        bd0Var.f35462f0 = -1L;
                        bd0Var.f35487z0 = true;
                        if (bd0Var.j0()) {
                            bd0Var.f35463g0 = true;
                            bd0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (bd0Var.getParentActivity() != null && bd0Var.f35478t0 != null && bd0Var.d0() && bd0Var.F != null) {
                            qh.f3 f3Var = bd0Var.f35485y;
                            if (f3Var != null) {
                                f3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = bd0Var.getLocationController().getSharingLocationInfo(bd0Var.f35455b0);
                            if (bd0Var.D) {
                                bd0Var.C[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                bd0Var.f35456c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = bd0Var.L;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    bd0Var.L = null;
                                }
                                bd0Var.D = true;
                                bd0Var.m0().k(0L, 25, 0, null, new kc0(bd0Var, 1), new v10(26, bd0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = bd0Var.L;
                            if (iCircle2 == null) {
                                bd0Var.e0(500);
                            } else {
                                bd0Var.M = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(bd0Var.f35455b0)) {
                                user = bd0Var.getMessagesController().getUser(Long.valueOf(bd0Var.f35455b0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = bd0Var.getParentActivity();
                            ic0 ic0Var = new ic0(bd0Var, 3);
                            rs rsVar = new rs(22, bd0Var, user);
                            kc0 kc0Var = new kc0(bd0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f29511a = null;
                            frameLayout.d = -1;
                            frameLayout.f29514e = false;
                            frameLayout.f29515f = false;
                            frameLayout.h = null;
                            frameLayout.f29516n = new Rect();
                            new Paint();
                            frameLayout.f29519w = true;
                            frameLayout.C = org.telegram.ui.Components.pr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.N = kc0Var;
                            frameLayout.f29521y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f29520x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, k7.c6.e(-1, -2, 80));
                            frameLayout.L = LocaleController.getUseImperialSystemType();
                            frameLayout.J = user;
                            frameLayout.F = ic0Var;
                            org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(parentActivity, null);
                            frameLayout.D = yc0Var;
                            yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            yc0Var.setItemCount(5);
                            org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0(parentActivity, null);
                            frameLayout.E = yc0Var2;
                            yc0Var2.setItemCount(5);
                            yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(frameLayout, parentActivity);
                            frameLayout.M = ki0Var;
                            ki0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            ki0Var.addView(frameLayout3, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.y3.t(textView2, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false), 1, 20.0f);
                            frameLayout3.addView(textView2, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new org.telegram.ui.ActionBar.s2(19));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            ki0Var.addView(linearLayout, k7.c6.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView22 = new TextView(parentActivity);
                            frameLayout.H = textView22;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.G = textView3;
                            linearLayout.addView(yc0Var, k7.c6.l(0.5f, 0, 270));
                            yc0Var.setFormatter(new org.telegram.ui.Components.ii0(frameLayout, 0));
                            yc0Var.setMinValue(0);
                            yc0Var.setMaxValue(10);
                            yc0Var.setWrapSelectorWheel(false);
                            yc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.ii0 ii0Var = new org.telegram.ui.Components.ii0(frameLayout, 1);
                            yc0Var.setOnValueChangedListener(ii0Var);
                            yc0Var2.setMinValue(0);
                            yc0Var2.setMaxValue(10);
                            yc0Var2.setWrapSelectorWheel(false);
                            yc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(yc0Var2, k7.c6.l(0.5f, 0, 270));
                            yc0Var2.setFormatter(new org.telegram.ui.Components.ii0(frameLayout, 2));
                            yc0Var2.setOnValueChangedListener(ii0Var);
                            yc0Var.setValue(0);
                            yc0Var2.setValue(6);
                            ki0Var.addView(frameLayout4, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                            frameLayout4.addView((View) textView3, k7.c6.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.w2(26, frameLayout, rsVar));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            textView22.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21893q5, false));
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, k7.c6.c(48.0f, -1));
                            frameLayout2.addView(ki0Var, k7.c6.e(-1, -2, 51));
                            bd0Var.O = frameLayout;
                            ((FrameLayout) bd0Var.fragmentView).addView((View) frameLayout, k7.c6.c(-1.0f, -1));
                            org.telegram.ui.Components.ni0 ni0Var = bd0Var.O;
                            ni0Var.f29517r = false;
                            AnimatorSet animatorSet = ni0Var.f29518s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ni0Var.f29518s = null;
                            }
                            org.telegram.ui.Components.ji0 ji0Var = ni0Var.v;
                            ji0Var.measure(View.MeasureSpec.makeMeasureSpec((ni0Var.f29520x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (ni0Var.f29517r) {
                                z13 = true;
                            } else {
                                ji0Var.setVisibility(0);
                                if (ni0Var.f29519w) {
                                    ni0Var.setLayerType(2, null);
                                }
                                ji0Var.setTranslationY(ji0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ni0Var.f29518s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(ji0Var, View.TRANSLATION_Y, 0.0f));
                                ni0Var.f29518s.setDuration(400L);
                                ni0Var.f29518s.setStartDelay(20L);
                                ni0Var.f29518s.setInterpolator(ni0Var.C);
                                z13 = true;
                                ni0Var.f29518s.addListener(new org.telegram.ui.Components.mi0(ni0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                ni0Var.f29518s.start();
                            }
                            ni0Var.c(z13);
                            return;
                        }
                        return;
                    default:
                        bd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = bd0Var.f35486y0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            bd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                }
            }
        });
        if (DialogObject.isChatDialog(this.f35455b0)) {
            chat = getMessagesController().getChat(Long.valueOf(-this.f35455b0));
        } else {
            chat = null;
        }
        MessageObject messageObject3 = this.f35486y0;
        if (messageObject3 != null && messageObject3.isLiveLocation() && !this.f35486y0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f35455b0);
            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                this.f35456c.setImageResource(R.drawable.msg_location_alert2);
            } else {
                if (DialogObject.isUserDialog(this.f35455b0) && this.f35486y0.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.f35456c.setVisibility(4);
                    this.f35456c.setAlpha(0.0f);
                    this.f35456c.setScaleX(0.4f);
                    this.f35456c.setScaleY(0.4f);
                }
                this.f35456c.setImageResource(R.drawable.msg_location_alert);
            }
        } else {
            this.f35456c.setVisibility(8);
            this.f35456c.setImageResource(R.drawable.msg_location_alert);
        }
        qh.f3 f3Var = new qh.f3(context, 1);
        this.f35485y = f3Var;
        f3Var.setLayerType(2, null);
        qh.f3 f3Var2 = this.f35485y;
        f3Var2.d = 4000L;
        f3Var2.m(1.0f, -25.0f);
        this.f35485y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.P.addView(this.f35485y, k7.c6.d(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35461f = linearLayout;
        linearLayout.setOrientation(1);
        this.f35461f.setGravity(1);
        this.f35461f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f35461f.setVisibility(8);
        zc0Var.addView(this.f35461f, k7.c6.c(-1.0f, -1));
        this.f35461f.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.W5), mode));
        this.f35461f.addView(this.h, k7.c6.n(-2, -2));
        TextView textView2 = new TextView(context);
        this.f35469n = textView2;
        int i19 = org.telegram.ui.ActionBar.k6.X5;
        textView2.setTextColor(getThemedColor(i19));
        this.f35469n.setGravity(17);
        this.f35469n.setTypeface(AndroidUtilities.bold());
        this.f35469n.setTextSize(1, 17.0f);
        this.f35469n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView i20 = yh.i(this.f35461f, this.f35469n, k7.c6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f35474r = i20;
        i20.setTextColor(getThemedColor(i19));
        this.f35474r.setGravity(17);
        this.f35474r.setTextSize(1, 15.0f);
        this.f35474r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f35461f.addView(this.f35474r, k7.c6.t(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.R = tl0Var;
        long j10 = this.f35455b0;
        org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
        boolean z13 = this.B;
        if (i14 == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        pc0 pc0Var2 = new pc0(this, context, this.D0, j10, resourceProvider, z13, z10);
        this.Q = pc0Var2;
        tl0Var.setAdapter(pc0Var2);
        org.telegram.ui.Components.tl0 tl0Var2 = this.R;
        f2.j0 j0Var = new f2.j0(1, false);
        this.V = j0Var;
        tl0Var2.setLayoutManager(j0Var);
        if (this.J0 != null) {
            this.I0 = new org.telegram.ui.Cells.u3(context, this.resourceProvider);
            rc0 rc0Var = new rc0(this, context, new org.telegram.ui.Components.ru0(this), this, new qc0(this), getResourceProvider());
            this.H0 = rc0Var;
            rc0Var.setBackgroundColor(getThemedColor(i12));
            this.H0.addView(this.I0, k7.c6.e(-1, 32, 55));
            this.Q.f48585e0 = this.H0;
            this.R.setOverScrollMode(2);
            f2.l lVar = new f2.l();
            z11 = false;
            lVar.f5910m = false;
            lVar.C = false;
            lVar.o(org.telegram.ui.Components.pr.h);
            lVar.n(350L);
            this.R.setItemAnimator(lVar);
        } else {
            z11 = false;
        }
        this.Q.O(this.Z, z11);
        this.Q.getClass();
        this.R.setVerticalScrollBarEnabled(z11);
        zc0Var.addView(this.R, k7.c6.e(-1, -1, 51));
        MessageObject messageObject4 = this.f35486y0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            pc0 pc0Var3 = this.Q;
            pc0Var3.N = this.f35486y0.messageOwner.media.address;
            pc0Var3.Q();
        }
        this.R.setOnScrollListener(new sc0(this));
        ((f2.l) this.R.getItemAnimator()).C = false;
        this.R.setOnItemLongClickListener(new rs(20, this, context));
        this.R.setOnItemClickListener(new j(this, 16));
        pc0 pc0Var4 = this.Q;
        long j11 = this.f35455b0;
        ic0 ic0Var = new ic0(this, 5);
        pc0Var4.E = j11;
        pc0Var4.f48515y = ic0Var;
        pc0Var4.P(this.E0);
        zc0Var.addView(this.P, k7.c6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.H = onCreateMapView;
        onCreateMapView.getView().setAlpha(0.0f);
        this.H.setOnDispatchTouchEventInterceptor(new ic0(this, 6));
        this.H.setOnInterceptTouchEventInterceptor(new ic0(this, 7));
        this.H.setOnLayoutListener(new kc0(this, 5));
        new Thread(new lc0(this, this.H, 1)).start();
        MessageObject messageObject5 = this.f35486y0;
        if (messageObject5 == null && this.f35482w0 == null) {
            i10 = i14;
            if (chat != null && i10 == 4 && this.f35455b0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.P.addView(frameLayout, k7.c6.e(62, 76, 49));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                p9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                p9Var.e(chat, new org.telegram.ui.Components.z8(chat));
                frameLayout.addView(p9Var, k7.c6.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.U = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.U == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.P.addView(imageView4, k7.c6.e(28, 48, 49));
                this.U = imageView4;
            }
            org.telegram.ui.Components.tl0 tl0Var3 = new org.telegram.ui.Components.tl0(context, null);
            this.S = tl0Var3;
            tl0Var3.setVisibility(8);
            i11 = 0;
            this.S.setLayoutManager(new f2.j0(1, false));
            org.telegram.ui.ActionBar.g6 resourceProvider2 = getResourceProvider();
            if (i10 == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            uc0 uc0Var2 = new uc0(this, context, resourceProvider2, z12);
            this.T = uc0Var2;
            ic0 ic0Var2 = new ic0(this, 8);
            uc0Var2.E = 0L;
            uc0Var2.f48515y = ic0Var2;
            zc0Var.addView(this.S, k7.c6.e(-1, -1, 51));
            this.S.setOnScrollListener(new l3(this, 18));
            this.S.setOnItemClickListener(new hg.v0(18, this, n10));
        } else {
            i10 = i14;
            i11 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.f35482w0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.f35482w0;
                if (tL_channelLocation2 != null) {
                    this.Q.U = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.f35486y0;
                    if (messageObject6 != null) {
                        pc0 pc0Var5 = this.Q;
                        pc0Var5.T = messageObject6;
                        pc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.f35486y0;
        if (messageObject7 != null && i10 == 6) {
            pc0 pc0Var6 = this.Q;
            pc0Var6.T = messageObject7;
            pc0Var6.l();
        }
        while (i11 < 2) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.C;
            undoViewArr[i11] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i11].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.P.addView(undoViewArr[i11], k7.c6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            i11++;
        }
        oh.b3 b3Var = new oh.b3(this, context, rect);
        this.v = b3Var;
        b3Var.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.P.addView(this.v, layoutParams2);
        if (this.f35486y0 == null && this.f35482w0 == null && this.f35484x0 != null) {
            this.f35487z0 = true;
            ImageView imageView5 = this.f35452a;
            int i21 = org.telegram.ui.ActionBar.k6.ui;
            imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i21), PorterDuff.Mode.MULTIPLY));
            this.f35452a.setTag(Integer.valueOf(i21));
        }
        zc0Var.addView(this.actionBar);
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
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(org.telegram.ui.ActionBar.k6.L5), null);
                    alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new ic0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.f21166a);
                    return false;
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                return true;
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        pc0 pc0Var;
        long dialogId;
        pc0 pc0Var2;
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.locationPermissionGranted) {
            this.Z = false;
            pc0 pc0Var3 = this.Q;
            if (pc0Var3 != null) {
                pc0Var3.O(false, false);
            }
            IMapsProvider.IMap iMap = this.F;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.Z = true;
            pc0 pc0Var4 = this.Q;
            if (pc0Var4 != null) {
                pc0Var4.O(true, false);
            }
        } else if (i10 == NotificationCenter.liveLocationsChanged) {
            pc0 pc0Var5 = this.Q;
            if (pc0Var5 != null) {
                pc0Var5.l();
            }
            C0();
        } else if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.f35455b0 && this.f35486y0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z4 = false;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i12);
                    if (messageObject.isLiveLocation()) {
                        c0(messageObject.messageOwner);
                        z4 = true;
                    } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                        this.f35456c.setImageResource(R.drawable.msg_location_alert);
                        IMapsProvider.ICircle iCircle = this.L;
                        if (iCircle != null) {
                            iCircle.remove();
                            this.L = null;
                        }
                    }
                }
                if (z4 && (pc0Var2 = this.Q) != null) {
                    pc0Var2.N(this.f35458d0);
                }
            }
        } else if (i10 == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.f35455b0 && this.f35486y0 != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(i13);
                    if (messageObject2.isLiveLocation()) {
                        TLRPC.Message message = messageObject2.messageOwner;
                        if (message.from_id != null) {
                            dialogId = MessageObject.getFromChatId(message);
                        } else {
                            dialogId = MessageObject.getDialogId(message);
                        }
                        vc0 vc0Var = (vc0) this.f35460e0.f(dialogId);
                        if (vc0Var != null) {
                            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                            if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                                TLRPC.Message message2 = messageObject2.messageOwner;
                                vc0Var.f42201b = message2;
                                TLRPC.GeoPoint geoPoint = message2.media.geo;
                                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                                vc0Var.f42203e.setPosition(latLng);
                                if (this.f35462f0 == vc0Var.f42200a) {
                                    this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(vc0Var.f42203e.getPosition()));
                                }
                                IMapsProvider.IMarker iMarker = vc0Var.f42204f;
                                if (iMarker != null) {
                                    iMarker.getPosition();
                                    vc0Var.f42204f.setPosition(latLng);
                                    int i14 = messageObject2.messageOwner.media.heading;
                                    if (i14 != 0) {
                                        vc0Var.f42204f.setRotation(i14);
                                        if (!vc0Var.f42205g) {
                                            vc0Var.f42204f.setIcon(R.drawable.map_pin_cone2);
                                            vc0Var.f42205g = true;
                                        }
                                    } else if (vc0Var.f42205g) {
                                        vc0Var.f42204f.setRotation(0);
                                        vc0Var.f42204f.setIcon(R.drawable.map_pin_circle);
                                        vc0Var.f42205g = false;
                                    }
                                }
                            }
                            z10 = true;
                        }
                    }
                }
                if (z10 && (pc0Var = this.Q) != null) {
                    pc0Var.l();
                    org.telegram.ui.Components.ni0 ni0Var = this.O;
                    if (ni0Var != null) {
                        ni0Var.c(true);
                    }
                }
                if (z10) {
                    C0();
                }
            }
        }
    }

    public final void e0(int i10) {
        if (this.F == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.f35478t0.getLatitude(), this.f35478t0.getLongitude()));
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
        this.L = this.F.addCircle(onCreateCircleOptions);
    }

    public final Bitmap f0(int i10) {
        Bitmap[] bitmapArr = this.N0;
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
    public final boolean finishFragment(boolean z4) {
        if (q0()) {
            return false;
        }
        return super.finishFragment(z4);
    }

    public final Bitmap g0(vc0 vc0Var) {
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
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
                TLRPC.User user = vc0Var.f42202c;
                if (user != null) {
                    z8Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = vc0Var.d;
                    if (chat != null) {
                        z8Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                z8Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                z8Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = vc0Var.h;
                if (imageReceiver != null && imageReceiver.hasImageLoaded()) {
                    bitmap = vc0Var.h.getBitmap();
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
        f fVar = new f(this, 21);
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.C;
            if (i10 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i10];
            int i11 = org.telegram.ui.ActionBar.k6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoView, 32, null, null, null, null, i11));
            int i12 = org.telegram.ui.ActionBar.k6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i12));
            int i13 = org.telegram.ui.ActionBar.k6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", i11));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", i11));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", i13));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", i13));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main", i13));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top", i13));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line", i13));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big", i13));
            arrayList.add(new org.telegram.ui.ActionBar.m6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small", i13));
            i10++;
        }
        View view = this.fragmentView;
        int i14 = org.telegram.ui.ActionBar.k6.f21731h5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, fVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 32768, null, null, null, null, i14));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.k6.f21766j5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 64, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 134217728, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.f35481w;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursor, 16777216, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, Integer.MIN_VALUE, null, null, null, fVar, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741824, null, null, null, fVar, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741832, null, null, null, fVar, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        ImageView imageView = this.h;
        int i16 = org.telegram.ui.ActionBar.k6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 8, null, null, null, null, i16));
        TextView textView = this.f35469n;
        int i17 = org.telegram.ui.ActionBar.k6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(textView, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35474r, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ii));
        ImageView imageView2 = this.f35452a;
        int i18 = org.telegram.ui.ActionBar.k6.ui;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView2, 262152, null, null, null, null, i18));
        ImageView imageView3 = this.f35452a;
        int i19 = org.telegram.ui.ActionBar.k6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView3, 262152, null, null, null, null, i19));
        ImageView imageView4 = this.f35452a;
        int i20 = org.telegram.ui.ActionBar.k6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView4, 32, null, null, null, null, i20));
        ImageView imageView5 = this.f35452a;
        int i21 = org.telegram.ui.ActionBar.k6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView5, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, null, null, null, fVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35456c, 0, null, null, null, fVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35456c, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35456c, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35459e, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35459e, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35459e, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, org.telegram.ui.ActionBar.k6.f21906r0, fVar, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.si));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.pi));
        int i22 = org.telegram.ui.ActionBar.k6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21624b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21838n5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.S, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.S, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.S, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21732h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i17));
        return arrayList;
    }

    public boolean h0() {
        return this instanceof gn;
    }

    public final void i0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilder;
        if (this.f35457c0) {
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
                if (this.f35456c.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.f35456c.setVisibility(0);
                    this.E = true;
                    this.f35456c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new org.telegram.ui.Components.g91(this, 23)).start();
                }
            }
        }
        if (iLatLngBoundsBuilder != null) {
            if (this.f35457c0) {
                this.R.v0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.f35457c0 = false;
            this.Q.N(this.f35458d0);
            if (this.f35486y0.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = iLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng p02 = p0(center, 100.0d, 100.0d);
                    iLatLngBoundsBuilder.include(p0(center, -100.0d, -100.0d));
                    iLatLngBoundsBuilder.include(p02);
                    IMapsProvider.ILatLngBounds build = iLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, AndroidUtilities.dp(113.0f));
                            this.G = newCameraUpdateLatLngBounds;
                            this.F.moveCamera(newCameraUpdateLatLngBounds);
                            this.G = null;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6)) > 0.699999988079071d) {
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
        boolean z4;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.F != null) {
            ArrayList arrayList = new ArrayList();
            if (getConnectionsManager() != null) {
                i10 = getConnectionsManager().getCurrentTime();
            } else {
                i10 = 0;
            }
            ArrayList arrayList2 = this.f35458d0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                vc0 vc0Var = (vc0) arrayList2.get(i12);
                IMapsProvider.IMarker iMarker = vc0Var.f42203e;
                if (iMarker != null && (message = vc0Var.f42201b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            if (this.f35460e0.f(getUserConfig().getClientUserId()) != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            Location location = this.f35478t0;
            if (location != null && !z4) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.f35478t0.getLongitude()));
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
                    this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(onCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f)), 500, null);
                    return true;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return false;
                }
            }
        }
        return false;
    }

    public final void k0(boolean z4) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        if (this.R != null) {
            if (this.actionBar.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                int i12 = this.D0;
                if (i12 == 6) {
                    this.E0 = org.telegram.messenger.y3.B(66.0f, measuredHeight, currentActionBarHeight);
                } else if (i12 == 2) {
                    this.E0 = org.telegram.messenger.y3.B(73.0f, measuredHeight, currentActionBarHeight);
                } else {
                    this.E0 = org.telegram.messenger.y3.B(66.0f, measuredHeight, currentActionBarHeight);
                }
                rc0 rc0Var = this.H0;
                if (rc0Var != null && rc0Var.c0(8) > 0) {
                    this.E0 -= AndroidUtilities.dp(200.0f);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.R.getLayoutParams();
                layoutParams2.topMargin = currentActionBarHeight;
                this.R.setLayoutParams(layoutParams2);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                layoutParams3.topMargin = currentActionBarHeight;
                layoutParams3.height = this.E0;
                this.P.setLayoutParams(layoutParams3);
                org.telegram.ui.Components.tl0 tl0Var = this.S;
                if (tl0Var != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) tl0Var.getLayoutParams();
                    layoutParams4.topMargin = currentActionBarHeight;
                    this.S.setLayoutParams(layoutParams4);
                }
                this.Q.P(this.E0);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.H.getView().getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = AndroidUtilities.dp(10.0f) + this.E0;
                    IMapsProvider.IMap iMap = this.F;
                    if (iMap != null) {
                        iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                    }
                    this.H.getView().setLayoutParams(layoutParams5);
                }
                yc0 yc0Var = this.f35483x;
                if (yc0Var != null && (layoutParams = (FrameLayout.LayoutParams) yc0Var.getLayoutParams()) != null) {
                    layoutParams.height = AndroidUtilities.dp(10.0f) + this.E0;
                    this.f35483x.setLayoutParams(layoutParams);
                }
                this.Q.l();
                if (z4) {
                    if (i12 == 3) {
                        i11 = 73;
                    } else if (i12 != 1 && i12 != 2) {
                        i11 = 0;
                    } else {
                        i11 = 66;
                    }
                    this.V.h1(0, -AndroidUtilities.dp(i11));
                    A0(false);
                    this.R.post(new org.telegram.ui.Components.jm(this, i11, 15));
                    return;
                }
                A0(false);
            }
        }
    }

    public final boolean l0() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.f(this.f35486y0.getDialogId());
        if (arrayList != null && arrayList.isEmpty()) {
            i0(arrayList);
        } else {
            arrayList = null;
        }
        if (DialogObject.isChatDialog(this.f35455b0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f35455b0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.f35486y0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new oh.t5(this, dialogId, 6));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView m0() {
        UndoView[] undoViewArr = this.C;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            this.P.removeView(undoViewArr[0]);
            this.P.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean n0() {
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.k6.I.q()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void o0() {
        SharedPreferences globalMainSettings;
        int i10;
        ImageView imageView = this.f35456c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.E && (i10 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) < 3) {
            globalMainSettings.edit().putInt("proximityhint", i10 + 1).commit();
            if (DialogObject.isUserDialog(this.f35455b0)) {
                this.f35485y.t(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.f35455b0)))));
            } else {
                this.f35485y.t(LocaleController.getString(R.string.ProximityTooltioGroup));
            }
            this.f35485y.v();
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.ni0 ni0Var = this.O;
        if (ni0Var != null) {
            if (z4) {
                ni0Var.a();
                return false;
            }
        } else {
            IMapsProvider.IMapView iMapView = this.H;
            if (iMapView != null && iMapView.getGlSurfaceView() != null && !this.J) {
                if (z4) {
                    q0();
                }
            } else {
                return super.onBackPressed(z4);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.C[0];
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
        MessageObject messageObject = this.f35486y0;
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
            IMapsProvider.IMap iMap = this.F;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        try {
            IMapsProvider.IMapView iMapView = this.H;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        UndoView undoView = this.C[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        pc0 pc0Var = this.Q;
        if (pc0Var != null) {
            pc0Var.F();
        }
        uc0 uc0Var = this.T;
        if (uc0Var != null) {
            uc0Var.F();
        }
        kc0 kc0Var = this.G0;
        if (kc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kc0Var);
            this.G0 = null;
        }
        ArrayList arrayList = this.f35458d0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            vc0 vc0Var = (vc0) arrayList.get(i10);
            ImageReceiver imageReceiver = vc0Var.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                vc0Var.h = null;
            }
        }
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.H;
        if (iMapView != null && this.f35475r0) {
            iMapView.onLowMemory();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.H;
        if (iMapView != null && this.f35475r0) {
            try {
                iMapView.onPause();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        UndoView undoView = this.C[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f35477s0 = false;
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
        IMapsProvider.IMapView iMapView = this.H;
        if (iMapView != null && this.f35475r0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f35477s0 = true;
        IMapsProvider.IMap iMap = this.F;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        k0(true);
        if (h0()) {
            this.m0 = false;
        } else if (this.m0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.m0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        kc0 kc0Var = this.G0;
        if (kc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kc0Var);
            AndroidUtilities.runOnUIThread(this.G0, 5000L);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && !z10) {
            try {
                if (this.H.getView().getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.H.getView().getParent()).removeView(this.H.getView());
                }
            } catch (Exception unused) {
            }
            l0 l0Var = this.P;
            if (l0Var != null) {
                l0Var.addView(this.H.getView(), 0, k7.c6.e(-1, AndroidUtilities.dp(10.0f) + this.E0, 51));
                yc0 yc0Var = this.f35483x;
                if (yc0Var != null) {
                    try {
                        if (yc0Var.getParent() instanceof ViewGroup) {
                            ((ViewGroup) this.f35483x.getParent()).removeView(this.f35483x);
                        }
                    } catch (Exception unused2) {
                    }
                    this.P.addView(this.f35483x, 1, k7.c6.e(-1, AndroidUtilities.dp(10.0f) + this.E0, 51));
                }
                A0(false);
                o0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.H.getView(), 0, k7.c6.e(-1, -1, 51));
            }
        }
    }

    public final boolean q0() {
        IMapsProvider.IMapView iMapView = this.H;
        if (iMapView != null && iMapView.getGlSurfaceView() != null && !this.J) {
            GLSurfaceView glSurfaceView = this.H.getGlSurfaceView();
            glSurfaceView.queueEvent(new v10(25, this, glSurfaceView));
            return true;
        }
        return false;
    }

    public final void r0(vc0 vc0Var) {
        double d;
        double d10;
        String str;
        TLRPC.Message message;
        if (vc0Var != null && (message = vc0Var.f42201b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d10 = geoPoint._long;
        } else {
            MessageObject messageObject = this.f35486y0;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.f35482w0.geo_point;
                d = geoPoint3.lat;
                d10 = geoPoint3._long;
            }
        }
        if (BuildVars.isHuaweiStoreApp()) {
            str = "mapapp://navigation";
        } else {
            str = "http://maps.google.com/maps";
        }
        if (this.f35478t0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f35478t0.getLatitude()), Double.valueOf(this.f35478t0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e6) {
                FileLog.e(e6);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void s0(final boolean z4) {
        final TLRPC.User user;
        Activity parentActivity;
        if (this.C0 != null && !h0() && getParentActivity() != null && this.f35478t0 != null && d0()) {
            if (this.f35470n0 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f35470n0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    org.telegram.ui.Components.z4.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new gc0(this, z4, 1), null).o();
                    return;
                }
            }
            if (DialogObject.isUserDialog(this.f35455b0)) {
                user = getMessagesController().getUser(Long.valueOf(this.f35455b0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.z4.E(getParentActivity(), z4, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    bd0.V(bd0.this, z4, user, i10);
                }
            }, null));
        }
    }

    public final void t0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.f35478t0 = new Location(location);
        vc0 vc0Var = (vc0) this.f35460e0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f35455b0);
        if (vc0Var != null && sharingLocationInfo != null && vc0Var.f42201b.f20864id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            vc0Var.f42203e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = vc0Var.f42204f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.f35462f0 == vc0Var.f42200a) {
                this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(vc0Var.f42203e.getPosition()));
            }
        }
        if (this.f35486y0 == null && this.f35482w0 == null && this.F != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            pc0 pc0Var = this.Q;
            if (pc0Var != null) {
                if (!this.A0 && (i10 = this.D0) != 4 && i10 != 8) {
                    pc0Var.H(null, this.f35478t0, true);
                }
                this.Q.M(this.f35478t0);
            }
            if (!this.f35487z0) {
                this.f35479u0 = new Location(location);
                if (this.B0) {
                    this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.B0 = true;
                    this.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.F.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.f35478t0);
        }
        org.telegram.ui.Components.ni0 ni0Var = this.O;
        if (ni0Var != null) {
            ni0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.L;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.f35478t0.getLatitude(), this.f35478t0.getLongitude()));
        }
        C0();
    }

    public final void u0(MessageObject messageObject) {
        this.f35486y0 = messageObject;
        this.f35455b0 = messageObject.getDialogId();
    }

    public final void v0(vc0 vc0Var) {
        if (vc0Var.h == null) {
            TLRPC.User user = vc0Var.f42202c;
            TLRPC.Chat chat = vc0Var.d;
            if (user == null && chat == 0) {
                return;
            }
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
            if (user != null) {
                z8Var.m(this.currentAccount, user);
            } else {
                z8Var.k(this.currentAccount, chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.setCurrentAccount(this.currentAccount);
            imageReceiver.setDelegate(new rs(21, this, vc0Var));
            imageReceiver.onAttachedToWindow();
            if (user == null) {
                user = chat;
            }
            imageReceiver.setForUserOrChat(user, z8Var);
            vc0Var.h = imageReceiver;
        }
    }

    public final void w0(int i10, TLRPC.User user, int i11) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.f35478t0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.f35478t0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.f35478t0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.C0.d(tL_messageMediaGeoLive, this.D0, true, 0, 0L);
        if (i11 > 0) {
            this.O.I = true;
            this.f35456c.setImageResource(R.drawable.msg_location_alert2);
            org.telegram.ui.Components.ni0 ni0Var = this.O;
            if (ni0Var != null) {
                ni0Var.a();
            }
            m0().k(0L, 24, Integer.valueOf(i11), user, null, null);
            return;
        }
        finishFragment();
    }

    public final void x0() {
        if (this.Q.h() != 0 && this.V.L0() == 0) {
            View childAt = this.R.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                this.R.v0(0, top, null);
            }
        }
    }

    public final void y0(boolean z4) {
        Integer num;
        float f10;
        org.telegram.ui.Components.al alVar;
        Location location;
        Location location2;
        if (this.D0 == 3) {
            z4 = true;
        }
        if (z4 && (alVar = this.f35459e) != null && alVar.getTag() == null && ((location = this.f35478t0) == null || (location2 = this.f35479u0) == null || location2.distanceTo(location) < 300.0f)) {
            z4 = false;
        }
        org.telegram.ui.Components.al alVar2 = this.f35459e;
        if (alVar2 != null) {
            if (!z4 || alVar2.getTag() == null) {
                if (z4 || this.f35459e.getTag() != null) {
                    org.telegram.ui.Components.al alVar3 = this.f35459e;
                    if (z4) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    alVar3.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    org.telegram.ui.Components.al alVar4 = this.f35459e;
                    Property property = View.TRANSLATION_X;
                    if (z4) {
                        f10 = 0.0f;
                    } else {
                        f10 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(alVar4, property, f10));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.pr.f30184g);
                    animatorSet.start();
                }
            }
        }
    }

    public final void z0(boolean z4, boolean z10) {
        float f10;
        float f11;
        Boolean bool = this.M0;
        if (bool != null && bool.booleanValue() == z4) {
            return;
        }
        this.M0 = Boolean.valueOf(z4);
        float f12 = 0.0f;
        int i10 = 0;
        float f13 = 0.7f;
        if (!z10) {
            TextView textView = this.f35454b;
            if (!z4) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            TextView textView2 = this.f35454b;
            if (z4) {
                f12 = 1.0f;
            }
            textView2.setAlpha(f12);
            TextView textView3 = this.f35454b;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            textView3.setScaleX(f11);
            TextView textView4 = this.f35454b;
            if (z4) {
                f13 = 1.0f;
            }
            textView4.setScaleY(f13);
            return;
        }
        this.f35454b.setVisibility(0);
        ViewPropertyAnimator animate = this.f35454b.animate();
        if (z4) {
            f12 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f12);
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.7f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (z4) {
            f13 = 1.0f;
        }
        scaleX.scaleY(f13).setInterpolator(org.telegram.ui.Components.pr.h).setDuration(420L).withEndAction(new gc0(this, z4, 0)).start();
    }
}
