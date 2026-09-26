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
public class cd0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_channelLocation A0;
    public MessageObject B0;
    public boolean C0;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public final UndoView[] F;
    public xc0 F0;
    public boolean G;
    public final int G0;
    public boolean H;
    public int H0;
    public IMapsProvider.IMap I;
    public uc0 I0;
    public IMapsProvider.ICameraUpdate J;
    public mc0 J0;
    public IMapsProvider.IMapView K;
    public sc0 K0;
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
    public org.telegram.ui.Components.qi0 R;
    public k0 S;
    public qc0 T;
    public org.telegram.ui.Components.xl0 U;
    public org.telegram.ui.Components.xl0 V;
    public vc0 W;
    public View X;
    public s4.c0 Y;
    public org.telegram.ui.ActionBar.u0 Z;
    public ImageView f32654a;
    public boolean f32655a0;
    public TextView f32656b;
    public boolean f32657b0;
    public ImageView f32658c;
    public boolean f32659c0;
    public org.telegram.ui.ActionBar.u0 d;
    public boolean f32660d0;
    public org.telegram.ui.Components.gl e;
    public long f32661e0;
    public LinearLayout f32662f;
    public boolean f32663f0;
    public final ArrayList f32664g0;
    public ImageView h;
    public final a0.i f32665h0;
    public long f32666i0;
    public boolean f32667j0;
    public final ArrayList f32668k0;
    public AnimatorSet f32669l0;
    public IMapsProvider.IMarker m0;
    public TextView f32670n;
    public bd0 f32671n0;
    public FrameLayout f32672o0;
    public boolean f32673p0;
    public boolean f32674q0;
    public TextView f32675r;
    public boolean f32676r0;
    public Drawable f32677s;
    public boolean f32678s0;
    public boolean f32679t0;
    public boolean f32680u0;
    public ai.n4 v;
    public boolean f32681v0;
    public org.telegram.ui.ActionBar.u0 f32682w;
    public Location f32683w0;
    public zc0 f32684x;
    public Location f32685x0;
    public ci.e4 f32686y;
    public int f32687y0;
    public TLRPC.TL_channelLocation f32688z0;

    public cd0(int i10) {
        super(null);
        this.F = new UndoView[2];
        this.f32657b0 = true;
        this.f32659c0 = false;
        this.f32660d0 = true;
        this.f32663f0 = true;
        this.f32664g0 = new ArrayList();
        this.f32665h0 = new a0.i();
        this.f32666i0 = -1L;
        this.f32668k0 = new ArrayList();
        this.f32673p0 = true;
        this.f32674q0 = true;
        this.H0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.O0 = true;
        this.Q0 = new Bitmap[7];
        this.G0 = i10;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static void U(cd0 cd0Var) {
        IMapsProvider.IMap iMap;
        Activity parentActivity;
        int i10 = cd0Var.G0;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = cd0Var.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            if (cd0Var.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cd0Var.getParentActivity());
                alertDialog$Builder.m(R.raw.permission_request_location, 72, cd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.L5), null);
                alertDialog$Builder.f18661a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new kc0(cd0Var, 1));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                cd0Var.showDialog(alertDialog$Builder.f18661a);
            }
        } else if (cd0Var.d0() || i10 == 3) {
            if ((cd0Var.B0 != null && i10 != 3) || cd0Var.f32688z0 != null) {
                if (cd0Var.f32683w0 != null && (iMap = cd0Var.I) != null) {
                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(cd0Var.f32683w0.getLatitude(), cd0Var.f32683w0.getLongitude()), cd0Var.I.getMaxZoomLevel() - 4.0f));
                }
            } else if (cd0Var.f32683w0 != null && cd0Var.I != null) {
                ImageView imageView = cd0Var.f32654a;
                int i11 = org.telegram.ui.ActionBar.h6.vi;
                imageView.setColorFilter(new PorterDuffColorFilter(cd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                cd0Var.f32654a.setTag(Integer.valueOf(i11));
                cd0Var.T.L(null);
                cd0Var.C0 = false;
                cd0Var.y0(false);
                cd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(cd0Var.f32683w0.getLatitude(), cd0Var.f32683w0.getLongitude())));
                if (cd0Var.D0 && i10 != 8) {
                    Location location = cd0Var.f32683w0;
                    if (location != null) {
                        cd0Var.T.H(null, location, true);
                    }
                    cd0Var.D0 = false;
                    cd0Var.x0();
                }
            }
            if (cd0Var.m0 != null) {
                cd0Var.X.setVisibility(0);
                zc0 zc0Var = cd0Var.f32684x;
                IMapsProvider.IMarker iMarker = cd0Var.m0;
                HashMap hashMap = zc0Var.f40443a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    zc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                cd0Var.m0 = null;
                cd0Var.f32671n0 = null;
                cd0Var.f32672o0 = null;
            }
        }
    }

    public static void V(cd0 cd0Var, boolean z10, TLRPC.User user, int i10) {
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z10) {
            LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.f32661e0);
            if (sharingLocationInfo != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = cd0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
                tL_messages_editMessage.f18418id = sharingLocationInfo.mid;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location lastKnownLocation = LocationController.getInstance(cd0Var.currentAccount).getLastKnownLocation();
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
                    cd0Var.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
                }
                cd0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
                return;
            }
            return;
        }
        cd0Var.w0(i10, user, 0);
    }

    public static void W(cd0 cd0Var) {
        mc0 mc0Var;
        cd0Var.getLocationController().markLiveLoactionsAsRead(cd0Var.f32661e0);
        if (!cd0Var.isPaused && (mc0Var = cd0Var.J0) != null) {
            AndroidUtilities.runOnUIThread(mc0Var, 5000L);
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
            i10 = (int) K.f42959a.getY();
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
                    zc0 zc0Var = this.f32684x;
                    if (zc0Var != null) {
                        zc0Var.setVisibility(4);
                    }
                }
            } else if (this.K.getView().getVisibility() == 4) {
                this.K.getView().setVisibility(0);
                this.S.setVisibility(0);
                zc0 zc0Var2 = this.f32684x;
                if (zc0Var2 != null) {
                    zc0Var2.setVisibility(0);
                }
            }
            this.S.setTranslationY(Math.min(0, i10));
            int i13 = -i10;
            int i14 = i13 / 2;
            this.K.getView().setTranslationY(Math.max(0, i14));
            zc0 zc0Var3 = this.f32684x;
            if (zc0Var3 != null) {
                zc0Var3.setTranslationY(Math.max(0, i14));
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
            this.f32658c.setTranslationY(min);
            ci.e4 e4Var = this.f32686y;
            if (e4Var != null) {
                e4Var.setTranslationY(min);
            }
            org.telegram.ui.Components.gl glVar = this.e;
            if (glVar != null) {
                glVar.f24521c = min;
                glVar.setTranslationY(min + glVar.f24520b);
            }
            View view = this.X;
            if (view != null) {
                if (view.getTag() == null) {
                    f7 = 48.0f;
                } else {
                    f7 = 69.0f;
                }
                int dp = (i11 / 2) + (i13 - AndroidUtilities.dp(f7));
                this.f32687y0 = dp;
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
                zc0 zc0Var4 = this.f32684x;
                if (zc0Var4 != null && (layoutParams = (FrameLayout.LayoutParams) zc0Var4.getLayoutParams()) != null) {
                    if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.H0) {
                        layoutParams.height = AndroidUtilities.dp(10.0f) + this.H0;
                        this.f32684x.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    public final void B0() {
        if (this.f32676r0) {
            if (this.f32679t0) {
                this.V.setEmptyView(null);
                this.f32662f.setVisibility(8);
                this.V.setVisibility(8);
                return;
            }
            this.V.setEmptyView(this.f32662f);
            return;
        }
        this.f32662f.setVisibility(8);
    }

    public final void C0() {
        int i10;
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        int i11;
        if (this.f32656b == null) {
            return;
        }
        boolean z11 = false;
        if (this.f32667j0) {
            z0(false, true);
            j0();
            return;
        }
        if (getConnectionsManager() != null) {
            i10 = getConnectionsManager().getCurrentTime();
        } else {
            i10 = 0;
        }
        ArrayList arrayList = this.f32664g0;
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.Message message = ((wc0) arrayList.get(i13)).f38955b;
            if (message != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                i12++;
            }
        }
        if (this.f32665h0.f(getUserConfig().getClientUserId()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32683w0 != null && !z10) {
            i12++;
        }
        if (i12 >= 2) {
            z11 = true;
        }
        z0(z11, true);
    }

    public final wc0 c0(TLRPC.Message message) {
        wc0 wc0Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.i iVar = this.f32665h0;
        wc0 wc0Var2 = (wc0) iVar.f(fromChatId);
        if (wc0Var2 == null) {
            ?? obj = new Object();
            obj.f38955b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.f38956c = getMessagesController().getUser(Long.valueOf(obj.f38955b.from_id.user_id));
                obj.f38954a = obj.f38955b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    obj.f38956c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    obj.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                obj.f38954a = dialogId;
            }
            v0(obj);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap g02 = g0(obj);
                wc0Var = obj;
                if (g02 != null) {
                    position.icon(g02);
                    position.anchor(0.5f, 0.907f);
                    obj.e = this.I.addMarker(position);
                    if (!UserObject.isUserSelf(obj.f38956c)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.I.addMarker(flat);
                        obj.f38957f = addMarker;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            addMarker.setRotation(i10);
                            obj.f38957f.setIcon(R.drawable.map_pin_cone2);
                            obj.f38958g = true;
                        } else {
                            addMarker.setRotation(0);
                            obj.f38957f.setIcon(R.drawable.map_pin_circle);
                            obj.f38958g = false;
                        }
                    }
                    this.f32664g0.add(obj);
                    iVar.k(obj, obj.f38954a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f32661e0);
                    int i11 = (obj.f38954a > getUserConfig().getClientUserId() ? 1 : (obj.f38954a == getUserConfig().getClientUserId() ? 0 : -1));
                    wc0Var = obj;
                    wc0Var = obj;
                    if (i11 == 0 && sharingLocationInfo != null) {
                        int i12 = obj.f38955b.f18356id;
                        wc0Var = obj;
                        if (i12 == sharingLocationInfo.mid) {
                            Location location = this.f32683w0;
                            wc0Var = obj;
                            if (location != null) {
                                obj.e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.f32683w0.getLongitude()));
                                wc0Var = obj;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                wc0Var = obj;
            }
        } else {
            wc0Var2.f38955b = message;
            wc0Var2.e.setPosition(latLng);
            int i13 = (this.f32666i0 > wc0Var2.f38954a ? 1 : (this.f32666i0 == wc0Var2.f38954a ? 0 : -1));
            wc0Var = wc0Var2;
            if (i13 == 0) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(wc0Var2.e.getPosition()));
                wc0Var = wc0Var2;
            }
        }
        org.telegram.ui.Components.qi0 qi0Var = this.R;
        if (qi0Var != null) {
            qi0Var.c(true);
        }
        C0();
        return wc0Var;
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
        this.f32678s0 = false;
        this.f32676r0 = false;
        this.f32679t0 = false;
        qc0 qc0Var = this.T;
        if (qc0Var != null) {
            qc0Var.F();
        }
        vc0 vc0Var = this.W;
        if (vc0Var != null) {
            vc0Var.F();
        }
        if (this.f32688z0 != null) {
            Location location = new Location("network");
            this.f32685x0 = location;
            location.setLatitude(this.f32688z0.geo_point.lat);
            this.f32685x0.setLongitude(this.f32688z0.geo_point._long);
        } else if (this.B0 != null) {
            Location location2 = new Location("network");
            this.f32685x0 = location2;
            location2.setLatitude(this.B0.messageOwner.media.geo.lat);
            this.f32685x0.setLongitude(this.B0.messageOwner.media.geo._long);
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32659c0 = z10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.f19129h5;
        kVar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.h6.f19165j5;
        kVar2.setTitleColor(getThemedColor(i13));
        this.actionBar.B(getThemedColor(i13), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.h6.I5), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new pc0(this));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        TLRPC.TL_channelLocation tL_channelLocation = this.f32688z0;
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
                        if (!getLocationController().isSharingLocation(this.f32661e0) && this.O0) {
                            this.Z.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                        }
                        this.Z.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                    }
                }
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i14 != 4) {
                    this.f32684x = new zc0(this, context);
                    org.telegram.ui.ActionBar.u0 c12 = n10.c(0, R.drawable.outline_header_search, getResourceProvider());
                    c12.F();
                    c12.H = new hg.e2(this, 12);
                    this.f32682w = c12;
                    c12.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.f32682w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.f32682w.getSearchField();
                    searchField.setTextColor(getThemedColor(i13));
                    searchField.setCursorColor(getThemedColor(i13));
                    searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Vd));
                }
            }
        }
        ad0 ad0Var = new ad0(this, context);
        this.fragmentView = ad0Var;
        ad0Var.setBackgroundColor(getThemedColor(i12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f32677s = mutate;
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.f32677s.getPadding(rect);
        if (i14 != 0 && i14 != 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top);
        }
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        layoutParams2.gravity = 83;
        k0 k0Var = new k0(this, context, 11);
        this.S = k0Var;
        k0Var.setBackgroundDrawable(new org.telegram.ui.Components.ed(n0()));
        MessageObject messageObject2 = this.B0;
        if ((messageObject2 == null && (i14 == 0 || i14 == 1)) || (messageObject2 != null && i14 == 3)) {
            org.telegram.ui.Components.gl glVar = new org.telegram.ui.Components.gl(context, 1);
            this.e = glVar;
            glVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int dp = AndroidUtilities.dp(40.0f);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.wi);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.h6.xi);
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3);
            w7.a6.a(this.e);
            this.e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.e.setOutlineProvider(yf.i0.f47111b);
            this.e.setBackgroundDrawable(i02);
            this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.vi));
            this.e.setTextSize(1, 14.0f);
            this.e.setTypeface(AndroidUtilities.bold());
            this.e.setGravity(17);
            this.e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.S.addView(this.e, w7.y5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (i14 == 3) {
                this.e.setText(LocaleController.getString(R.string.OpenInMaps));
                this.e.setOnClickListener(new View.OnClickListener(this) {
                    public final cd0 f34746b;

                    {
                        this.f34746b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        TLRPC.User user;
                        boolean z14;
                        int i15 = r2;
                        cd0 cd0Var = this.f34746b;
                        switch (i15) {
                            case 0:
                                cd0Var.y0(false);
                                cd0Var.T.H(null, cd0Var.f32685x0, true);
                                cd0Var.D0 = true;
                                cd0Var.x0();
                                return;
                            case 1:
                                cd0Var.d.M(null, null);
                                return;
                            case 2:
                                cd0.U(cd0Var);
                                return;
                            case 3:
                                cd0Var.f32666i0 = -1L;
                                cd0Var.C0 = true;
                                if (cd0Var.j0()) {
                                    cd0Var.f32667j0 = true;
                                    cd0Var.z0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (cd0Var.getParentActivity() != null && cd0Var.f32683w0 != null && cd0Var.d0() && cd0Var.I != null) {
                                    ci.e4 e4Var = cd0Var.f32686y;
                                    if (e4Var != null) {
                                        e4Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.f32661e0);
                                    if (cd0Var.G) {
                                        cd0Var.F[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        cd0Var.f32658c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = cd0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            cd0Var.O = null;
                                        }
                                        cd0Var.G = true;
                                        cd0Var.m0().k(0L, 25, 0, null, new mc0(cd0Var, 1), new n80(14, cd0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = cd0Var.O;
                                    if (iCircle2 == null) {
                                        cd0Var.e0(500);
                                    } else {
                                        cd0Var.P = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(cd0Var.f32661e0)) {
                                        user = cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.f32661e0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity = cd0Var.getParentActivity();
                                    kc0 kc0Var = new kc0(cd0Var, 3);
                                    ow owVar = new ow(15, cd0Var, user);
                                    mc0 mc0Var = new mc0(cd0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity);
                                    frameLayout.f27682a = null;
                                    frameLayout.d = -1;
                                    frameLayout.e = false;
                                    frameLayout.f27685f = false;
                                    frameLayout.h = null;
                                    frameLayout.f27686n = new Rect();
                                    new Paint();
                                    frameLayout.f27689w = true;
                                    frameLayout.F = org.telegram.ui.Components.sr.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.Q = mc0Var;
                                    frameLayout.f27691y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false), PorterDuff.Mode.MULTIPLY));
                                    mutate2.getPadding(rect2);
                                    int i16 = rect2.left;
                                    frameLayout.f27690x = i16;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i16, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i16, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, w7.y5.e(-1, -2, 80));
                                    frameLayout.O = LocaleController.getUseImperialSystemType();
                                    frameLayout.M = user;
                                    frameLayout.I = kc0Var;
                                    org.telegram.ui.Components.fd0 fd0Var = new org.telegram.ui.Components.fd0(parentActivity, null);
                                    frameLayout.G = fd0Var;
                                    fd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    fd0Var.setItemCount(5);
                                    org.telegram.ui.Components.fd0 fd0Var2 = new org.telegram.ui.Components.fd0(parentActivity, null);
                                    frameLayout.H = fd0Var2;
                                    fd0Var2.setItemCount(5);
                                    fd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.ni0 ni0Var = new org.telegram.ui.Components.ni0(frameLayout, parentActivity);
                                    frameLayout.P = ni0Var;
                                    ni0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                    ni0Var.addView(frameLayout3, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.f0.q(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165j5, false), 1, 20.0f);
                                    frameLayout3.addView(textView, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView.setOnTouchListener(new bi.d(20));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    ni0Var.addView(linearLayout, w7.y5.n(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                                    TextView textView2 = new TextView(parentActivity);
                                    frameLayout.K = textView2;
                                    ?? textView3 = new TextView(parentActivity);
                                    frameLayout.J = textView3;
                                    linearLayout.addView(fd0Var, w7.y5.l(0.5f, 0, 270));
                                    fd0Var.setFormatter(new org.telegram.ui.Components.li0(frameLayout, 0));
                                    fd0Var.setMinValue(0);
                                    fd0Var.setMaxValue(10);
                                    fd0Var.setWrapSelectorWheel(false);
                                    fd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(frameLayout, 1);
                                    fd0Var.setOnValueChangedListener(li0Var);
                                    fd0Var2.setMinValue(0);
                                    fd0Var2.setMaxValue(10);
                                    fd0Var2.setWrapSelectorWheel(false);
                                    fd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(fd0Var2, w7.y5.l(0.5f, 0, 270));
                                    fd0Var2.setFormatter(new org.telegram.ui.Components.li0(frameLayout, 2));
                                    fd0Var2.setOnValueChangedListener(li0Var);
                                    fd0Var.setValue(0);
                                    fd0Var2.setValue(6);
                                    ni0Var.addView(frameLayout4, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                                    frameLayout4.addView((View) textView3, w7.y5.c(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.ft(11, frameLayout, owVar));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19297q5, false));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, w7.y5.c(48.0f, -1));
                                    frameLayout2.addView(ni0Var, w7.y5.e(-1, -2, 51));
                                    cd0Var.R = frameLayout;
                                    ((FrameLayout) cd0Var.fragmentView).addView((View) frameLayout, w7.y5.c(-1.0f, -1));
                                    org.telegram.ui.Components.qi0 qi0Var = cd0Var.R;
                                    qi0Var.f27687r = false;
                                    AnimatorSet animatorSet = qi0Var.f27688s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        qi0Var.f27688s = null;
                                    }
                                    org.telegram.ui.Components.mi0 mi0Var = qi0Var.v;
                                    mi0Var.measure(View.MeasureSpec.makeMeasureSpec((qi0Var.f27690x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (qi0Var.f27687r) {
                                        z14 = true;
                                    } else {
                                        mi0Var.setVisibility(0);
                                        if (qi0Var.f27689w) {
                                            qi0Var.setLayerType(2, null);
                                        }
                                        mi0Var.setTranslationY(mi0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        qi0Var.f27688s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(mi0Var, View.TRANSLATION_Y, 0.0f));
                                        qi0Var.f27688s.setDuration(400L);
                                        qi0Var.f27688s.setStartDelay(20L);
                                        qi0Var.f27688s.setInterpolator(qi0Var.F);
                                        z14 = true;
                                        qi0Var.f27688s.addListener(new org.telegram.ui.Components.pi0(qi0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        qi0Var.f27688s.start();
                                    }
                                    qi0Var.c(z14);
                                    return;
                                }
                                return;
                            default:
                                cd0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = cd0Var.B0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
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
                    public final cd0 f34746b;

                    {
                        this.f34746b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        TLRPC.User user;
                        boolean z14;
                        int i15 = r2;
                        cd0 cd0Var = this.f34746b;
                        switch (i15) {
                            case 0:
                                cd0Var.y0(false);
                                cd0Var.T.H(null, cd0Var.f32685x0, true);
                                cd0Var.D0 = true;
                                cd0Var.x0();
                                return;
                            case 1:
                                cd0Var.d.M(null, null);
                                return;
                            case 2:
                                cd0.U(cd0Var);
                                return;
                            case 3:
                                cd0Var.f32666i0 = -1L;
                                cd0Var.C0 = true;
                                if (cd0Var.j0()) {
                                    cd0Var.f32667j0 = true;
                                    cd0Var.z0(false, true);
                                    return;
                                }
                                return;
                            case 4:
                                if (cd0Var.getParentActivity() != null && cd0Var.f32683w0 != null && cd0Var.d0() && cd0Var.I != null) {
                                    ci.e4 e4Var = cd0Var.f32686y;
                                    if (e4Var != null) {
                                        e4Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.f32661e0);
                                    if (cd0Var.G) {
                                        cd0Var.F[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        cd0Var.f32658c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = cd0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            cd0Var.O = null;
                                        }
                                        cd0Var.G = true;
                                        cd0Var.m0().k(0L, 25, 0, null, new mc0(cd0Var, 1), new n80(14, cd0Var, sharingLocationInfo));
                                        return;
                                    }
                                    IMapsProvider.ICircle iCircle2 = cd0Var.O;
                                    if (iCircle2 == null) {
                                        cd0Var.e0(500);
                                    } else {
                                        cd0Var.P = iCircle2.getRadius();
                                    }
                                    if (DialogObject.isUserDialog(cd0Var.f32661e0)) {
                                        user = cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.f32661e0));
                                    } else {
                                        user = null;
                                    }
                                    Activity parentActivity = cd0Var.getParentActivity();
                                    kc0 kc0Var = new kc0(cd0Var, 3);
                                    ow owVar = new ow(15, cd0Var, user);
                                    mc0 mc0Var = new mc0(cd0Var, 2);
                                    ?? frameLayout = new FrameLayout(parentActivity);
                                    frameLayout.f27682a = null;
                                    frameLayout.d = -1;
                                    frameLayout.e = false;
                                    frameLayout.f27685f = false;
                                    frameLayout.h = null;
                                    frameLayout.f27686n = new Rect();
                                    new Paint();
                                    frameLayout.f27689w = true;
                                    frameLayout.F = org.telegram.ui.Components.sr.h;
                                    frameLayout.setWillNotDraw(false);
                                    frameLayout.Q = mc0Var;
                                    frameLayout.f27691y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                    Rect rect2 = new Rect();
                                    Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false), PorterDuff.Mode.MULTIPLY));
                                    mutate2.getPadding(rect2);
                                    int i16 = rect2.left;
                                    frameLayout.f27690x = i16;
                                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                                    frameLayout.v = frameLayout2;
                                    frameLayout2.setBackgroundDrawable(mutate2);
                                    frameLayout2.setPadding(i16, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i16, 0);
                                    frameLayout2.setVisibility(4);
                                    frameLayout.addView(frameLayout2, 0, w7.y5.e(-1, -2, 80));
                                    frameLayout.O = LocaleController.getUseImperialSystemType();
                                    frameLayout.M = user;
                                    frameLayout.I = kc0Var;
                                    org.telegram.ui.Components.fd0 fd0Var = new org.telegram.ui.Components.fd0(parentActivity, null);
                                    frameLayout.G = fd0Var;
                                    fd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                    fd0Var.setItemCount(5);
                                    org.telegram.ui.Components.fd0 fd0Var2 = new org.telegram.ui.Components.fd0(parentActivity, null);
                                    frameLayout.H = fd0Var2;
                                    fd0Var2.setItemCount(5);
                                    fd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                    org.telegram.ui.Components.ni0 ni0Var = new org.telegram.ui.Components.ni0(frameLayout, parentActivity);
                                    frameLayout.P = ni0Var;
                                    ni0Var.setOrientation(1);
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                    ni0Var.addView(frameLayout3, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView = new TextView(parentActivity);
                                    textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                    org.telegram.messenger.f0.q(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165j5, false), 1, 20.0f);
                                    frameLayout3.addView(textView, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView.setOnTouchListener(new bi.d(20));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    ni0Var.addView(linearLayout, w7.y5.n(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                                    TextView textView2 = new TextView(parentActivity);
                                    frameLayout.K = textView2;
                                    ?? textView3 = new TextView(parentActivity);
                                    frameLayout.J = textView3;
                                    linearLayout.addView(fd0Var, w7.y5.l(0.5f, 0, 270));
                                    fd0Var.setFormatter(new org.telegram.ui.Components.li0(frameLayout, 0));
                                    fd0Var.setMinValue(0);
                                    fd0Var.setMaxValue(10);
                                    fd0Var.setWrapSelectorWheel(false);
                                    fd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                    org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(frameLayout, 1);
                                    fd0Var.setOnValueChangedListener(li0Var);
                                    fd0Var2.setMinValue(0);
                                    fd0Var2.setMaxValue(10);
                                    fd0Var2.setWrapSelectorWheel(false);
                                    fd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                    linearLayout.addView(fd0Var2, w7.y5.l(0.5f, 0, 270));
                                    fd0Var2.setFormatter(new org.telegram.ui.Components.li0(frameLayout, 2));
                                    fd0Var2.setOnValueChangedListener(li0Var);
                                    fd0Var.setValue(0);
                                    fd0Var2.setValue(6);
                                    ni0Var.addView(frameLayout4, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                                    textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView3.setGravity(17);
                                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setMaxLines(2);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                                    frameLayout4.addView((View) textView3, w7.y5.c(48.0f, -1));
                                    textView3.setOnClickListener(new org.telegram.ui.Components.ft(11, frameLayout, owVar));
                                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                    textView2.setGravity(17);
                                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19297q5, false));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setAlpha(0.0f);
                                    textView2.setScaleX(0.5f);
                                    textView2.setScaleY(0.5f);
                                    frameLayout4.addView(textView2, w7.y5.c(48.0f, -1));
                                    frameLayout2.addView(ni0Var, w7.y5.e(-1, -2, 51));
                                    cd0Var.R = frameLayout;
                                    ((FrameLayout) cd0Var.fragmentView).addView((View) frameLayout, w7.y5.c(-1.0f, -1));
                                    org.telegram.ui.Components.qi0 qi0Var = cd0Var.R;
                                    qi0Var.f27687r = false;
                                    AnimatorSet animatorSet = qi0Var.f27688s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        qi0Var.f27688s = null;
                                    }
                                    org.telegram.ui.Components.mi0 mi0Var = qi0Var.v;
                                    mi0Var.measure(View.MeasureSpec.makeMeasureSpec((qi0Var.f27690x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                                    if (qi0Var.f27687r) {
                                        z14 = true;
                                    } else {
                                        mi0Var.setVisibility(0);
                                        if (qi0Var.f27689w) {
                                            qi0Var.setLayerType(2, null);
                                        }
                                        mi0Var.setTranslationY(mi0Var.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        qi0Var.f27688s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(mi0Var, View.TRANSLATION_Y, 0.0f));
                                        qi0Var.f27688s.setDuration(400L);
                                        qi0Var.f27688s.setStartDelay(20L);
                                        qi0Var.f27688s.setInterpolator(qi0Var.F);
                                        z14 = true;
                                        qi0Var.f27688s.addListener(new org.telegram.ui.Components.pi0(qi0Var, 1));
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                        qi0Var.f27688s.start();
                                    }
                                    qi0Var.c(z14);
                                    return;
                                }
                                return;
                            default:
                                cd0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = cd0Var.B0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
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
        int i15 = org.telegram.ui.ActionBar.h6.ui;
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
        int i16 = org.telegram.ui.ActionBar.h6.wi;
        int themedColor4 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.h6.xi;
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.h6.h0(dp2, themedColor4, getThemedColor(i17));
        w7.a6.a(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.d;
        ai.k2 k2Var = yf.i0.f47110a;
        u0Var2.setOutlineProvider(k2Var);
        this.d.setBackgroundDrawable(h02);
        this.d.setIcon(R.drawable.msg_map_type);
        this.S.addView(this.d, w7.y5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final cd0 f34746b;

            {
                this.f34746b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                cd0 cd0Var = this.f34746b;
                switch (i152) {
                    case 0:
                        cd0Var.y0(false);
                        cd0Var.T.H(null, cd0Var.f32685x0, true);
                        cd0Var.D0 = true;
                        cd0Var.x0();
                        return;
                    case 1:
                        cd0Var.d.M(null, null);
                        return;
                    case 2:
                        cd0.U(cd0Var);
                        return;
                    case 3:
                        cd0Var.f32666i0 = -1L;
                        cd0Var.C0 = true;
                        if (cd0Var.j0()) {
                            cd0Var.f32667j0 = true;
                            cd0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (cd0Var.getParentActivity() != null && cd0Var.f32683w0 != null && cd0Var.d0() && cd0Var.I != null) {
                            ci.e4 e4Var = cd0Var.f32686y;
                            if (e4Var != null) {
                                e4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.f32661e0);
                            if (cd0Var.G) {
                                cd0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                cd0Var.f32658c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = cd0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    cd0Var.O = null;
                                }
                                cd0Var.G = true;
                                cd0Var.m0().k(0L, 25, 0, null, new mc0(cd0Var, 1), new n80(14, cd0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = cd0Var.O;
                            if (iCircle2 == null) {
                                cd0Var.e0(500);
                            } else {
                                cd0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(cd0Var.f32661e0)) {
                                user = cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.f32661e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = cd0Var.getParentActivity();
                            kc0 kc0Var = new kc0(cd0Var, 3);
                            ow owVar = new ow(15, cd0Var, user);
                            mc0 mc0Var = new mc0(cd0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f27682a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f27685f = false;
                            frameLayout.h = null;
                            frameLayout.f27686n = new Rect();
                            new Paint();
                            frameLayout.f27689w = true;
                            frameLayout.F = org.telegram.ui.Components.sr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = mc0Var;
                            frameLayout.f27691y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f27690x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.y5.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = kc0Var;
                            org.telegram.ui.Components.fd0 fd0Var = new org.telegram.ui.Components.fd0(parentActivity, null);
                            frameLayout.G = fd0Var;
                            fd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            fd0Var.setItemCount(5);
                            org.telegram.ui.Components.fd0 fd0Var2 = new org.telegram.ui.Components.fd0(parentActivity, null);
                            frameLayout.H = fd0Var2;
                            fd0Var2.setItemCount(5);
                            fd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.ni0 ni0Var = new org.telegram.ui.Components.ni0(frameLayout, parentActivity);
                            frameLayout.P = ni0Var;
                            ni0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            ni0Var.addView(frameLayout3, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.f0.q(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165j5, false), 1, 20.0f);
                            frameLayout3.addView(textView, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new bi.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            ni0Var.addView(linearLayout, w7.y5.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView2 = new TextView(parentActivity);
                            frameLayout.K = textView2;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.J = textView3;
                            linearLayout.addView(fd0Var, w7.y5.l(0.5f, 0, 270));
                            fd0Var.setFormatter(new org.telegram.ui.Components.li0(frameLayout, 0));
                            fd0Var.setMinValue(0);
                            fd0Var.setMaxValue(10);
                            fd0Var.setWrapSelectorWheel(false);
                            fd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(frameLayout, 1);
                            fd0Var.setOnValueChangedListener(li0Var);
                            fd0Var2.setMinValue(0);
                            fd0Var2.setMaxValue(10);
                            fd0Var2.setWrapSelectorWheel(false);
                            fd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(fd0Var2, w7.y5.l(0.5f, 0, 270));
                            fd0Var2.setFormatter(new org.telegram.ui.Components.li0(frameLayout, 2));
                            fd0Var2.setOnValueChangedListener(li0Var);
                            fd0Var.setValue(0);
                            fd0Var2.setValue(6);
                            ni0Var.addView(frameLayout4, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                            frameLayout4.addView((View) textView3, w7.y5.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.ft(11, frameLayout, owVar));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19297q5, false));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, w7.y5.c(48.0f, -1));
                            frameLayout2.addView(ni0Var, w7.y5.e(-1, -2, 51));
                            cd0Var.R = frameLayout;
                            ((FrameLayout) cd0Var.fragmentView).addView((View) frameLayout, w7.y5.c(-1.0f, -1));
                            org.telegram.ui.Components.qi0 qi0Var = cd0Var.R;
                            qi0Var.f27687r = false;
                            AnimatorSet animatorSet = qi0Var.f27688s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                qi0Var.f27688s = null;
                            }
                            org.telegram.ui.Components.mi0 mi0Var = qi0Var.v;
                            mi0Var.measure(View.MeasureSpec.makeMeasureSpec((qi0Var.f27690x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (qi0Var.f27687r) {
                                z14 = true;
                            } else {
                                mi0Var.setVisibility(0);
                                if (qi0Var.f27689w) {
                                    qi0Var.setLayerType(2, null);
                                }
                                mi0Var.setTranslationY(mi0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                qi0Var.f27688s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(mi0Var, View.TRANSLATION_Y, 0.0f));
                                qi0Var.f27688s.setDuration(400L);
                                qi0Var.f27688s.setStartDelay(20L);
                                qi0Var.f27688s.setInterpolator(qi0Var.F);
                                z14 = true;
                                qi0Var.f27688s.addListener(new org.telegram.ui.Components.pi0(qi0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                qi0Var.f27688s.start();
                            }
                            qi0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        cd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = cd0Var.B0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        this.d.setDelegate(new kc0(this, 0));
        this.f32654a = new ImageView(context);
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i16), getThemedColor(i17));
        w7.a6.a(this.f32654a);
        this.f32654a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f32654a.setOutlineProvider(k2Var);
        this.f32654a.setBackground(h03);
        this.f32654a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.f32654a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f32654a;
        int i18 = org.telegram.ui.ActionBar.h6.vi;
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), mode));
        this.f32654a.setTag(Integer.valueOf(i18));
        this.f32654a.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams d = w7.y5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        d.bottomMargin = (layoutParams2.height - rect.top) + d.bottomMargin;
        this.S.addView(this.f32654a, d);
        this.f32654a.setOnClickListener(new View.OnClickListener(this) {
            public final cd0 f34746b;

            {
                this.f34746b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                cd0 cd0Var = this.f34746b;
                switch (i152) {
                    case 0:
                        cd0Var.y0(false);
                        cd0Var.T.H(null, cd0Var.f32685x0, true);
                        cd0Var.D0 = true;
                        cd0Var.x0();
                        return;
                    case 1:
                        cd0Var.d.M(null, null);
                        return;
                    case 2:
                        cd0.U(cd0Var);
                        return;
                    case 3:
                        cd0Var.f32666i0 = -1L;
                        cd0Var.C0 = true;
                        if (cd0Var.j0()) {
                            cd0Var.f32667j0 = true;
                            cd0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (cd0Var.getParentActivity() != null && cd0Var.f32683w0 != null && cd0Var.d0() && cd0Var.I != null) {
                            ci.e4 e4Var = cd0Var.f32686y;
                            if (e4Var != null) {
                                e4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.f32661e0);
                            if (cd0Var.G) {
                                cd0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                cd0Var.f32658c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = cd0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    cd0Var.O = null;
                                }
                                cd0Var.G = true;
                                cd0Var.m0().k(0L, 25, 0, null, new mc0(cd0Var, 1), new n80(14, cd0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = cd0Var.O;
                            if (iCircle2 == null) {
                                cd0Var.e0(500);
                            } else {
                                cd0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(cd0Var.f32661e0)) {
                                user = cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.f32661e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = cd0Var.getParentActivity();
                            kc0 kc0Var = new kc0(cd0Var, 3);
                            ow owVar = new ow(15, cd0Var, user);
                            mc0 mc0Var = new mc0(cd0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f27682a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f27685f = false;
                            frameLayout.h = null;
                            frameLayout.f27686n = new Rect();
                            new Paint();
                            frameLayout.f27689w = true;
                            frameLayout.F = org.telegram.ui.Components.sr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = mc0Var;
                            frameLayout.f27691y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f27690x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.y5.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = kc0Var;
                            org.telegram.ui.Components.fd0 fd0Var = new org.telegram.ui.Components.fd0(parentActivity, null);
                            frameLayout.G = fd0Var;
                            fd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            fd0Var.setItemCount(5);
                            org.telegram.ui.Components.fd0 fd0Var2 = new org.telegram.ui.Components.fd0(parentActivity, null);
                            frameLayout.H = fd0Var2;
                            fd0Var2.setItemCount(5);
                            fd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.ni0 ni0Var = new org.telegram.ui.Components.ni0(frameLayout, parentActivity);
                            frameLayout.P = ni0Var;
                            ni0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            ni0Var.addView(frameLayout3, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView = new TextView(parentActivity);
                            textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.f0.q(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165j5, false), 1, 20.0f);
                            frameLayout3.addView(textView, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new bi.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            ni0Var.addView(linearLayout, w7.y5.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView2 = new TextView(parentActivity);
                            frameLayout.K = textView2;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.J = textView3;
                            linearLayout.addView(fd0Var, w7.y5.l(0.5f, 0, 270));
                            fd0Var.setFormatter(new org.telegram.ui.Components.li0(frameLayout, 0));
                            fd0Var.setMinValue(0);
                            fd0Var.setMaxValue(10);
                            fd0Var.setWrapSelectorWheel(false);
                            fd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(frameLayout, 1);
                            fd0Var.setOnValueChangedListener(li0Var);
                            fd0Var2.setMinValue(0);
                            fd0Var2.setMaxValue(10);
                            fd0Var2.setWrapSelectorWheel(false);
                            fd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(fd0Var2, w7.y5.l(0.5f, 0, 270));
                            fd0Var2.setFormatter(new org.telegram.ui.Components.li0(frameLayout, 2));
                            fd0Var2.setOnValueChangedListener(li0Var);
                            fd0Var.setValue(0);
                            fd0Var2.setValue(6);
                            ni0Var.addView(frameLayout4, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                            frameLayout4.addView((View) textView3, w7.y5.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.ft(11, frameLayout, owVar));
                            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView2.setGravity(17);
                            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19297q5, false));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setAlpha(0.0f);
                            textView2.setScaleX(0.5f);
                            textView2.setScaleY(0.5f);
                            frameLayout4.addView(textView2, w7.y5.c(48.0f, -1));
                            frameLayout2.addView(ni0Var, w7.y5.e(-1, -2, 51));
                            cd0Var.R = frameLayout;
                            ((FrameLayout) cd0Var.fragmentView).addView((View) frameLayout, w7.y5.c(-1.0f, -1));
                            org.telegram.ui.Components.qi0 qi0Var = cd0Var.R;
                            qi0Var.f27687r = false;
                            AnimatorSet animatorSet = qi0Var.f27688s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                qi0Var.f27688s = null;
                            }
                            org.telegram.ui.Components.mi0 mi0Var = qi0Var.v;
                            mi0Var.measure(View.MeasureSpec.makeMeasureSpec((qi0Var.f27690x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (qi0Var.f27687r) {
                                z14 = true;
                            } else {
                                mi0Var.setVisibility(0);
                                if (qi0Var.f27689w) {
                                    qi0Var.setLayerType(2, null);
                                }
                                mi0Var.setTranslationY(mi0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                qi0Var.f27688s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(mi0Var, View.TRANSLATION_Y, 0.0f));
                                qi0Var.f27688s.setDuration(400L);
                                qi0Var.f27688s.setStartDelay(20L);
                                qi0Var.f27688s.setInterpolator(qi0Var.F);
                                z14 = true;
                                qi0Var.f27688s.addListener(new org.telegram.ui.Components.pi0(qi0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                qi0Var.f27688s.start();
                            }
                            qi0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        cd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = cd0Var.B0.messageOwner.media.geo;
                            double d10 = geoPoint.lat;
                            double d102 = geoPoint._long;
                            cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d10 + "," + d102 + "?q=" + d10 + "," + d102)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        TextView textView = new TextView(context);
        this.f32656b = textView;
        textView.setGravity(17);
        this.f32656b.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f32656b.setTextSize(1, 15.0f);
        this.f32656b.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, this.resourceProvider));
        this.f32656b.setTypeface(AndroidUtilities.bold());
        this.f32656b.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.f32656b.setText(LocaleController.getString(R.string.LocationsShowAll));
        this.f32656b.setBackground(org.telegram.ui.ActionBar.h6.Z(getThemedColor(i16), getThemedColor(i17), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams d10 = w7.y5.d(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        d10.bottomMargin = (layoutParams2.height - rect.top) + d10.bottomMargin;
        this.S.addView(this.f32656b, d10);
        w7.a6.a(this.f32656b);
        this.f32656b.setOnClickListener(new View.OnClickListener(this) {
            public final cd0 f34746b;

            {
                this.f34746b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                cd0 cd0Var = this.f34746b;
                switch (i152) {
                    case 0:
                        cd0Var.y0(false);
                        cd0Var.T.H(null, cd0Var.f32685x0, true);
                        cd0Var.D0 = true;
                        cd0Var.x0();
                        return;
                    case 1:
                        cd0Var.d.M(null, null);
                        return;
                    case 2:
                        cd0.U(cd0Var);
                        return;
                    case 3:
                        cd0Var.f32666i0 = -1L;
                        cd0Var.C0 = true;
                        if (cd0Var.j0()) {
                            cd0Var.f32667j0 = true;
                            cd0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (cd0Var.getParentActivity() != null && cd0Var.f32683w0 != null && cd0Var.d0() && cd0Var.I != null) {
                            ci.e4 e4Var = cd0Var.f32686y;
                            if (e4Var != null) {
                                e4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.f32661e0);
                            if (cd0Var.G) {
                                cd0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                cd0Var.f32658c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = cd0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    cd0Var.O = null;
                                }
                                cd0Var.G = true;
                                cd0Var.m0().k(0L, 25, 0, null, new mc0(cd0Var, 1), new n80(14, cd0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = cd0Var.O;
                            if (iCircle2 == null) {
                                cd0Var.e0(500);
                            } else {
                                cd0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(cd0Var.f32661e0)) {
                                user = cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.f32661e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = cd0Var.getParentActivity();
                            kc0 kc0Var = new kc0(cd0Var, 3);
                            ow owVar = new ow(15, cd0Var, user);
                            mc0 mc0Var = new mc0(cd0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f27682a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f27685f = false;
                            frameLayout.h = null;
                            frameLayout.f27686n = new Rect();
                            new Paint();
                            frameLayout.f27689w = true;
                            frameLayout.F = org.telegram.ui.Components.sr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = mc0Var;
                            frameLayout.f27691y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f27690x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.y5.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = kc0Var;
                            org.telegram.ui.Components.fd0 fd0Var = new org.telegram.ui.Components.fd0(parentActivity, null);
                            frameLayout.G = fd0Var;
                            fd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            fd0Var.setItemCount(5);
                            org.telegram.ui.Components.fd0 fd0Var2 = new org.telegram.ui.Components.fd0(parentActivity, null);
                            frameLayout.H = fd0Var2;
                            fd0Var2.setItemCount(5);
                            fd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.ni0 ni0Var = new org.telegram.ui.Components.ni0(frameLayout, parentActivity);
                            frameLayout.P = ni0Var;
                            ni0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            ni0Var.addView(frameLayout3, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.f0.q(textView2, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165j5, false), 1, 20.0f);
                            frameLayout3.addView(textView2, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new bi.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            ni0Var.addView(linearLayout, w7.y5.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView22 = new TextView(parentActivity);
                            frameLayout.K = textView22;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.J = textView3;
                            linearLayout.addView(fd0Var, w7.y5.l(0.5f, 0, 270));
                            fd0Var.setFormatter(new org.telegram.ui.Components.li0(frameLayout, 0));
                            fd0Var.setMinValue(0);
                            fd0Var.setMaxValue(10);
                            fd0Var.setWrapSelectorWheel(false);
                            fd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(frameLayout, 1);
                            fd0Var.setOnValueChangedListener(li0Var);
                            fd0Var2.setMinValue(0);
                            fd0Var2.setMaxValue(10);
                            fd0Var2.setWrapSelectorWheel(false);
                            fd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(fd0Var2, w7.y5.l(0.5f, 0, 270));
                            fd0Var2.setFormatter(new org.telegram.ui.Components.li0(frameLayout, 2));
                            fd0Var2.setOnValueChangedListener(li0Var);
                            fd0Var.setValue(0);
                            fd0Var2.setValue(6);
                            ni0Var.addView(frameLayout4, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                            frameLayout4.addView((View) textView3, w7.y5.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.ft(11, frameLayout, owVar));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            textView22.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19297q5, false));
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, w7.y5.c(48.0f, -1));
                            frameLayout2.addView(ni0Var, w7.y5.e(-1, -2, 51));
                            cd0Var.R = frameLayout;
                            ((FrameLayout) cd0Var.fragmentView).addView((View) frameLayout, w7.y5.c(-1.0f, -1));
                            org.telegram.ui.Components.qi0 qi0Var = cd0Var.R;
                            qi0Var.f27687r = false;
                            AnimatorSet animatorSet = qi0Var.f27688s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                qi0Var.f27688s = null;
                            }
                            org.telegram.ui.Components.mi0 mi0Var = qi0Var.v;
                            mi0Var.measure(View.MeasureSpec.makeMeasureSpec((qi0Var.f27690x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (qi0Var.f27687r) {
                                z14 = true;
                            } else {
                                mi0Var.setVisibility(0);
                                if (qi0Var.f27689w) {
                                    qi0Var.setLayerType(2, null);
                                }
                                mi0Var.setTranslationY(mi0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                qi0Var.f27688s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(mi0Var, View.TRANSLATION_Y, 0.0f));
                                qi0Var.f27688s.setDuration(400L);
                                qi0Var.f27688s.setStartDelay(20L);
                                qi0Var.f27688s.setInterpolator(qi0Var.F);
                                z14 = true;
                                qi0Var.f27688s.addListener(new org.telegram.ui.Components.pi0(qi0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                qi0Var.f27688s.start();
                            }
                            qi0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        cd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = cd0Var.B0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        z0(false, false);
        this.f32658c = new ImageView(context);
        org.telegram.ui.Cells.z h04 = org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i16), getThemedColor(i17));
        w7.a6.a(this.f32658c);
        this.f32658c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.f32658c.setOutlineProvider(k2Var);
        this.f32658c.setColorFilter(new PorterDuffColorFilter(getThemedColor(i15), mode));
        this.f32658c.setBackgroundDrawable(h04);
        this.f32658c.setScaleType(scaleType);
        this.f32658c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.S.addView(this.f32658c, w7.y5.d(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        this.f32658c.setOnClickListener(new View.OnClickListener(this) {
            public final cd0 f34746b;

            {
                this.f34746b = this;
            }

            @Override
            public final void onClick(View view) {
                TLRPC.User user;
                boolean z14;
                int i152 = r2;
                cd0 cd0Var = this.f34746b;
                switch (i152) {
                    case 0:
                        cd0Var.y0(false);
                        cd0Var.T.H(null, cd0Var.f32685x0, true);
                        cd0Var.D0 = true;
                        cd0Var.x0();
                        return;
                    case 1:
                        cd0Var.d.M(null, null);
                        return;
                    case 2:
                        cd0.U(cd0Var);
                        return;
                    case 3:
                        cd0Var.f32666i0 = -1L;
                        cd0Var.C0 = true;
                        if (cd0Var.j0()) {
                            cd0Var.f32667j0 = true;
                            cd0Var.z0(false, true);
                            return;
                        }
                        return;
                    case 4:
                        if (cd0Var.getParentActivity() != null && cd0Var.f32683w0 != null && cd0Var.d0() && cd0Var.I != null) {
                            ci.e4 e4Var = cd0Var.f32686y;
                            if (e4Var != null) {
                                e4Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.f32661e0);
                            if (cd0Var.G) {
                                cd0Var.F[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                cd0Var.f32658c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = cd0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    cd0Var.O = null;
                                }
                                cd0Var.G = true;
                                cd0Var.m0().k(0L, 25, 0, null, new mc0(cd0Var, 1), new n80(14, cd0Var, sharingLocationInfo));
                                return;
                            }
                            IMapsProvider.ICircle iCircle2 = cd0Var.O;
                            if (iCircle2 == null) {
                                cd0Var.e0(500);
                            } else {
                                cd0Var.P = iCircle2.getRadius();
                            }
                            if (DialogObject.isUserDialog(cd0Var.f32661e0)) {
                                user = cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.f32661e0));
                            } else {
                                user = null;
                            }
                            Activity parentActivity = cd0Var.getParentActivity();
                            kc0 kc0Var = new kc0(cd0Var, 3);
                            ow owVar = new ow(15, cd0Var, user);
                            mc0 mc0Var = new mc0(cd0Var, 2);
                            ?? frameLayout = new FrameLayout(parentActivity);
                            frameLayout.f27682a = null;
                            frameLayout.d = -1;
                            frameLayout.e = false;
                            frameLayout.f27685f = false;
                            frameLayout.h = null;
                            frameLayout.f27686n = new Rect();
                            new Paint();
                            frameLayout.f27689w = true;
                            frameLayout.F = org.telegram.ui.Components.sr.h;
                            frameLayout.setWillNotDraw(false);
                            frameLayout.Q = mc0Var;
                            frameLayout.f27691y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect2 = new Rect();
                            Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false), PorterDuff.Mode.MULTIPLY));
                            mutate2.getPadding(rect2);
                            int i162 = rect2.left;
                            frameLayout.f27690x = i162;
                            ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout.v = frameLayout2;
                            frameLayout2.setBackgroundDrawable(mutate2);
                            frameLayout2.setPadding(i162, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i162, 0);
                            frameLayout2.setVisibility(4);
                            frameLayout.addView(frameLayout2, 0, w7.y5.e(-1, -2, 80));
                            frameLayout.O = LocaleController.getUseImperialSystemType();
                            frameLayout.M = user;
                            frameLayout.I = kc0Var;
                            org.telegram.ui.Components.fd0 fd0Var = new org.telegram.ui.Components.fd0(parentActivity, null);
                            frameLayout.G = fd0Var;
                            fd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                            fd0Var.setItemCount(5);
                            org.telegram.ui.Components.fd0 fd0Var2 = new org.telegram.ui.Components.fd0(parentActivity, null);
                            frameLayout.H = fd0Var2;
                            fd0Var2.setItemCount(5);
                            fd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                            org.telegram.ui.Components.ni0 ni0Var = new org.telegram.ui.Components.ni0(frameLayout, parentActivity);
                            frameLayout.P = ni0Var;
                            ni0Var.setOrientation(1);
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            ni0Var.addView(frameLayout3, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity);
                            textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                            org.telegram.messenger.f0.q(textView2, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165j5, false), 1, 20.0f);
                            frameLayout3.addView(textView2, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new bi.d(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            ni0Var.addView(linearLayout, w7.y5.n(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout4 = new FrameLayout(parentActivity);
                            TextView textView22 = new TextView(parentActivity);
                            frameLayout.K = textView22;
                            ?? textView3 = new TextView(parentActivity);
                            frameLayout.J = textView3;
                            linearLayout.addView(fd0Var, w7.y5.l(0.5f, 0, 270));
                            fd0Var.setFormatter(new org.telegram.ui.Components.li0(frameLayout, 0));
                            fd0Var.setMinValue(0);
                            fd0Var.setMaxValue(10);
                            fd0Var.setWrapSelectorWheel(false);
                            fd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                            org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(frameLayout, 1);
                            fd0Var.setOnValueChangedListener(li0Var);
                            fd0Var2.setMinValue(0);
                            fd0Var2.setMaxValue(10);
                            fd0Var2.setWrapSelectorWheel(false);
                            fd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                            linearLayout.addView(fd0Var2, w7.y5.l(0.5f, 0, 270));
                            fd0Var2.setFormatter(new org.telegram.ui.Components.li0(frameLayout, 2));
                            fd0Var2.setOnValueChangedListener(li0Var);
                            fd0Var.setValue(0);
                            fd0Var2.setValue(6);
                            ni0Var.addView(frameLayout4, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView3.setGravity(17);
                            textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setMaxLines(2);
                            textView3.setTypeface(AndroidUtilities.bold());
                            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                            frameLayout4.addView((View) textView3, w7.y5.c(48.0f, -1));
                            textView3.setOnClickListener(new org.telegram.ui.Components.ft(11, frameLayout, owVar));
                            textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            textView22.setGravity(17);
                            textView22.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19297q5, false));
                            textView22.setTextSize(1, 14.0f);
                            textView22.setAlpha(0.0f);
                            textView22.setScaleX(0.5f);
                            textView22.setScaleY(0.5f);
                            frameLayout4.addView(textView22, w7.y5.c(48.0f, -1));
                            frameLayout2.addView(ni0Var, w7.y5.e(-1, -2, 51));
                            cd0Var.R = frameLayout;
                            ((FrameLayout) cd0Var.fragmentView).addView((View) frameLayout, w7.y5.c(-1.0f, -1));
                            org.telegram.ui.Components.qi0 qi0Var = cd0Var.R;
                            qi0Var.f27687r = false;
                            AnimatorSet animatorSet = qi0Var.f27688s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                qi0Var.f27688s = null;
                            }
                            org.telegram.ui.Components.mi0 mi0Var = qi0Var.v;
                            mi0Var.measure(View.MeasureSpec.makeMeasureSpec((qi0Var.f27690x * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                            if (qi0Var.f27687r) {
                                z14 = true;
                            } else {
                                mi0Var.setVisibility(0);
                                if (qi0Var.f27689w) {
                                    qi0Var.setLayerType(2, null);
                                }
                                mi0Var.setTranslationY(mi0Var.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                qi0Var.f27688s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(mi0Var, View.TRANSLATION_Y, 0.0f));
                                qi0Var.f27688s.setDuration(400L);
                                qi0Var.f27688s.setStartDelay(20L);
                                qi0Var.f27688s.setInterpolator(qi0Var.F);
                                z14 = true;
                                qi0Var.f27688s.addListener(new org.telegram.ui.Components.pi0(qi0Var, 1));
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                qi0Var.f27688s.start();
                            }
                            qi0Var.c(z14);
                            return;
                        }
                        return;
                    default:
                        cd0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = cd0Var.B0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
        if (DialogObject.isChatDialog(this.f32661e0)) {
            chat = getMessagesController().getChat(Long.valueOf(-this.f32661e0));
        } else {
            chat = null;
        }
        MessageObject messageObject3 = this.B0;
        if (messageObject3 != null && messageObject3.isLiveLocation() && !this.B0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f32661e0);
            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                this.f32658c.setImageResource(R.drawable.msg_location_alert2);
            } else {
                if (DialogObject.isUserDialog(this.f32661e0) && this.B0.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.f32658c.setVisibility(4);
                    this.f32658c.setAlpha(0.0f);
                    this.f32658c.setScaleX(0.4f);
                    this.f32658c.setScaleY(0.4f);
                }
                this.f32658c.setImageResource(R.drawable.msg_location_alert);
            }
        } else {
            this.f32658c.setVisibility(8);
            this.f32658c.setImageResource(R.drawable.msg_location_alert);
        }
        ci.e4 e4Var = new ci.e4(context, 1);
        this.f32686y = e4Var;
        e4Var.setLayerType(2, null);
        ci.e4 e4Var2 = this.f32686y;
        e4Var2.d = 4000L;
        e4Var2.l(1.0f, -25.0f);
        this.f32686y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.S.addView(this.f32686y, w7.y5.d(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f32662f = linearLayout;
        linearLayout.setOrientation(1);
        this.f32662f.setGravity(1);
        this.f32662f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f32662f.setVisibility(8);
        ad0Var.addView(this.f32662f, w7.y5.c(-1.0f, -1));
        this.f32662f.setOnTouchListener(new bi.d(2));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.W5), mode));
        this.f32662f.addView(this.h, w7.y5.n(-2, -2));
        TextView textView2 = new TextView(context);
        this.f32670n = textView2;
        int i19 = org.telegram.ui.ActionBar.h6.X5;
        textView2.setTextColor(getThemedColor(i19));
        this.f32670n.setGravity(17);
        this.f32670n.setTypeface(AndroidUtilities.bold());
        this.f32670n.setTextSize(1, 17.0f);
        this.f32670n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = com.google.android.gms.internal.vision.e2.h(this.f32662f, this.f32670n, w7.y5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f32675r = h;
        h.setTextColor(getThemedColor(i19));
        this.f32675r.setGravity(17);
        this.f32675r.setTextSize(1, 15.0f);
        this.f32675r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f32662f.addView(this.f32675r, w7.y5.t(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.xl0 xl0Var = new org.telegram.ui.Components.xl0(context, null);
        this.U = xl0Var;
        long j3 = this.f32661e0;
        org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
        boolean z14 = this.E;
        if (i14 == 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        qc0 qc0Var2 = new qc0(this, context, this.G0, j3, resourceProvider, z14, z11);
        this.T = qc0Var2;
        xl0Var.setAdapter(qc0Var2);
        org.telegram.ui.Components.xl0 xl0Var2 = this.U;
        s4.c0 c0Var = new s4.c0(1, false);
        this.Y = c0Var;
        xl0Var2.setLayoutManager(c0Var);
        if (this.M0 != null) {
            this.L0 = new org.telegram.ui.Cells.v3(context, this.resourceProvider);
            sc0 sc0Var = new sc0(this, context, new org.telegram.ui.Components.cv0(this), this, new rc0(this), getResourceProvider());
            this.K0 = sc0Var;
            sc0Var.setBackgroundColor(getThemedColor(i12));
            this.K0.addView(this.L0, w7.y5.e(-1, 32, 55));
            this.T.f9918h0 = this.K0;
            this.U.setOverScrollMode(2);
            s4.j jVar = new s4.j();
            z12 = false;
            jVar.f42994m = false;
            jVar.C = false;
            jVar.o(org.telegram.ui.Components.sr.h);
            jVar.n(350L);
            this.U.setItemAnimator(jVar);
        } else {
            z12 = false;
        }
        this.T.O(this.f32659c0, z12);
        this.T.getClass();
        this.U.setVerticalScrollBarEnabled(z12);
        ad0Var.addView(this.U, w7.y5.e(-1, -1, 51));
        MessageObject messageObject4 = this.B0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            qc0 qc0Var3 = this.T;
            qc0Var3.Q = this.B0.messageOwner.media.address;
            qc0Var3.Q();
        }
        this.U.setOnScrollListener(new tc0(this));
        ((s4.j) this.U.getItemAnimator()).C = false;
        this.U.setOnItemLongClickListener(new ow(13, this, context));
        this.U.setOnItemClickListener(new i(this, 16));
        qc0 qc0Var4 = this.T;
        long j10 = this.f32661e0;
        kc0 kc0Var = new kc0(this, 5);
        qc0Var4.H = j10;
        qc0Var4.f9666y = kc0Var;
        qc0Var4.P(this.H0);
        ad0Var.addView(this.S, w7.y5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.K = onCreateMapView;
        onCreateMapView.getView().setAlpha(0.0f);
        this.K.setOnDispatchTouchEventInterceptor(new kc0(this, 6));
        this.K.setOnInterceptTouchEventInterceptor(new kc0(this, 7));
        this.K.setOnLayoutListener(new mc0(this, 5));
        new Thread(new nc0(this, this.K, 1)).start();
        MessageObject messageObject5 = this.B0;
        if (messageObject5 == null && this.f32688z0 == null) {
            i10 = i14;
            if (chat != null && i10 == 4 && this.f32661e0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.S.addView(frameLayout, w7.y5.e(62, 76, 49));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                w9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                w9Var.e(chat, new org.telegram.ui.Components.h9(chat));
                frameLayout.addView(w9Var, w7.y5.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.X = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.X == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.S.addView(imageView4, w7.y5.e(28, 48, 49));
                this.X = imageView4;
            }
            org.telegram.ui.Components.xl0 xl0Var3 = new org.telegram.ui.Components.xl0(context, null);
            this.V = xl0Var3;
            xl0Var3.setVisibility(8);
            i11 = 0;
            this.V.setLayoutManager(new s4.c0(1, false));
            org.telegram.ui.ActionBar.d6 resourceProvider2 = getResourceProvider();
            if (i10 == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            vc0 vc0Var2 = new vc0(this, context, resourceProvider2, z13);
            this.W = vc0Var2;
            kc0 kc0Var2 = new kc0(this, 8);
            vc0Var2.H = 0L;
            vc0Var2.f9666y = kc0Var2;
            ad0Var.addView(this.V, w7.y5.e(-1, -1, 51));
            this.V.setOnScrollListener(new i3(this, 18));
            this.V.setOnItemClickListener(new ai.n6(18, this, n10));
        } else {
            i10 = i14;
            i11 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.f32688z0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.f32688z0;
                if (tL_channelLocation2 != null) {
                    this.T.X = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.B0;
                    if (messageObject6 != null) {
                        qc0 qc0Var5 = this.T;
                        qc0Var5.W = messageObject6;
                        qc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.B0;
        if (messageObject7 != null && i10 == 6) {
            qc0 qc0Var6 = this.T;
            qc0Var6.W = messageObject7;
            qc0Var6.l();
        }
        while (i11 < 2) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.F;
            undoViewArr[i11] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i11].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.S.addView(undoViewArr[i11], w7.y5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            i11++;
        }
        ai.n4 n4Var = new ai.n4(this, context, rect);
        this.v = n4Var;
        n4Var.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.S.addView(this.v, layoutParams2);
        if (this.B0 == null && this.f32688z0 == null && this.A0 != null) {
            this.C0 = true;
            ImageView imageView5 = this.f32654a;
            int i20 = org.telegram.ui.ActionBar.h6.ui;
            imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i20), PorterDuff.Mode.MULTIPLY));
            this.f32654a.setTag(Integer.valueOf(i20));
        }
        ad0Var.addView(this.actionBar);
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
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(org.telegram.ui.ActionBar.h6.L5), null);
                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new kc0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.f18661a);
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
        qc0 qc0Var;
        long dialogId;
        qc0 qc0Var2;
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.locationPermissionGranted) {
            this.f32659c0 = false;
            qc0 qc0Var3 = this.T;
            if (qc0Var3 != null) {
                qc0Var3.O(false, false);
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
            this.f32659c0 = true;
            qc0 qc0Var4 = this.T;
            if (qc0Var4 != null) {
                qc0Var4.O(true, false);
            }
        } else if (i10 == NotificationCenter.liveLocationsChanged) {
            qc0 qc0Var5 = this.T;
            if (qc0Var5 != null) {
                qc0Var5.l();
            }
            C0();
        } else if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.f32661e0 && this.B0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i12);
                    if (messageObject.isLiveLocation()) {
                        c0(messageObject.messageOwner);
                        z10 = true;
                    } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                        this.f32658c.setImageResource(R.drawable.msg_location_alert);
                        IMapsProvider.ICircle iCircle = this.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            this.O = null;
                        }
                    }
                }
                if (z10 && (qc0Var2 = this.T) != null) {
                    qc0Var2.N(this.f32664g0);
                }
            }
        } else if (i10 == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.f32661e0 && this.B0 != null) {
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
                        wc0 wc0Var = (wc0) this.f32665h0.f(dialogId);
                        if (wc0Var != null) {
                            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                            if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                                TLRPC.Message message2 = messageObject2.messageOwner;
                                wc0Var.f38955b = message2;
                                TLRPC.GeoPoint geoPoint = message2.media.geo;
                                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                                wc0Var.e.setPosition(latLng);
                                if (this.f32666i0 == wc0Var.f38954a) {
                                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(wc0Var.e.getPosition()));
                                }
                                IMapsProvider.IMarker iMarker = wc0Var.f38957f;
                                if (iMarker != null) {
                                    iMarker.getPosition();
                                    wc0Var.f38957f.setPosition(latLng);
                                    int i14 = messageObject2.messageOwner.media.heading;
                                    if (i14 != 0) {
                                        wc0Var.f38957f.setRotation(i14);
                                        if (!wc0Var.f38958g) {
                                            wc0Var.f38957f.setIcon(R.drawable.map_pin_cone2);
                                            wc0Var.f38958g = true;
                                        }
                                    } else if (wc0Var.f38958g) {
                                        wc0Var.f38957f.setRotation(0);
                                        wc0Var.f38957f.setIcon(R.drawable.map_pin_circle);
                                        wc0Var.f38958g = false;
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                }
                if (z11 && (qc0Var = this.T) != null) {
                    qc0Var.l();
                    org.telegram.ui.Components.qi0 qi0Var = this.R;
                    if (qi0Var != null) {
                        qi0Var.c(true);
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
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.f32683w0.getLatitude(), this.f32683w0.getLongitude()));
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

    public final Bitmap g0(wc0 wc0Var) {
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
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                TLRPC.User user = wc0Var.f38956c;
                if (user != null) {
                    h9Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = wc0Var.d;
                    if (chat != null) {
                        h9Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                h9Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                h9Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = wc0Var.h;
                if (imageReceiver != null && imageReceiver.hasImageLoaded()) {
                    bitmap = wc0Var.h.getBitmap();
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
            int i11 = org.telegram.ui.ActionBar.h6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoView, 32, null, null, null, null, i11));
            int i12 = org.telegram.ui.ActionBar.h6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i12));
            int i13 = org.telegram.ui.ActionBar.h6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", i11));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", i11));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main", i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top", i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line", i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big", i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small", i13));
            i10++;
        }
        View view = this.fragmentView;
        int i14 = org.telegram.ui.ActionBar.h6.f19129h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 32768, null, null, null, null, i14));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.h6.f19165j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.Vd));
        org.telegram.ui.ActionBar.u0 u0Var = this.f32682w;
        if (u0Var != null) {
            editTextBoldCursor = u0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursor, 16777216, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19148i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19180k0, null, null, org.telegram.ui.ActionBar.h6.f19060d7));
        ImageView imageView = this.h;
        int i16 = org.telegram.ui.ActionBar.h6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i16));
        TextView textView = this.f32670n;
        int i17 = org.telegram.ui.ActionBar.h6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32675r, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ii));
        ImageView imageView2 = this.f32654a;
        int i18 = org.telegram.ui.ActionBar.h6.ui;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 262152, null, null, null, null, i18));
        ImageView imageView3 = this.f32654a;
        int i19 = org.telegram.ui.ActionBar.h6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView3, 262152, null, null, null, null, i19));
        ImageView imageView4 = this.f32654a;
        int i20 = org.telegram.ui.ActionBar.h6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView4, 32, null, null, null, null, i20));
        ImageView imageView5 = this.f32654a;
        int i21 = org.telegram.ui.ActionBar.h6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView5, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, null, null, null, eVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32658c, 0, null, null, null, eVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32658c, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32658c, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f19310r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.si));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19252ni));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19235mi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19290pi));
        int i22 = org.telegram.ui.ActionBar.h6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19271oi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19023b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19003a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19242n5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19130h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i17));
        return arrayList;
    }

    public boolean h0() {
        return this instanceof fn;
    }

    public final void i0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilder;
        if (this.f32663f0) {
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
                if (this.f32658c.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.f32658c.setVisibility(0);
                    this.H = true;
                    this.f32658c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new org.telegram.ui.Components.r81(this, 25)).start();
                }
            }
        }
        if (iLatLngBoundsBuilder != null) {
            if (this.f32663f0) {
                this.U.v0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.f32663f0 = false;
            this.T.N(this.f32664g0);
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
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6)) > 0.699999988079071d) {
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
            ArrayList arrayList2 = this.f32664g0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                wc0 wc0Var = (wc0) arrayList2.get(i12);
                IMapsProvider.IMarker iMarker = wc0Var.e;
                if (iMarker != null && (message = wc0Var.f38955b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > i10)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            if (this.f32665h0.f(getUserConfig().getClientUserId()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Location location = this.f32683w0;
            if (location != null && !z10) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.f32683w0.getLongitude()));
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
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                int i12 = this.G0;
                if (i12 == 6) {
                    this.H0 = org.telegram.messenger.f0.B(66.0f, measuredHeight, currentActionBarHeight);
                } else if (i12 == 2) {
                    this.H0 = org.telegram.messenger.f0.B(73.0f, measuredHeight, currentActionBarHeight);
                } else {
                    this.H0 = org.telegram.messenger.f0.B(66.0f, measuredHeight, currentActionBarHeight);
                }
                sc0 sc0Var = this.K0;
                if (sc0Var != null && sc0Var.c0(8) > 0) {
                    this.H0 -= AndroidUtilities.dp(200.0f);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.U.getLayoutParams();
                layoutParams2.topMargin = currentActionBarHeight;
                this.U.setLayoutParams(layoutParams2);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.S.getLayoutParams();
                layoutParams3.topMargin = currentActionBarHeight;
                layoutParams3.height = this.H0;
                this.S.setLayoutParams(layoutParams3);
                org.telegram.ui.Components.xl0 xl0Var = this.V;
                if (xl0Var != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) xl0Var.getLayoutParams();
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
                zc0 zc0Var = this.f32684x;
                if (zc0Var != null && (layoutParams = (FrameLayout.LayoutParams) zc0Var.getLayoutParams()) != null) {
                    layoutParams.height = AndroidUtilities.dp(10.0f) + this.H0;
                    this.f32684x.setLayoutParams(layoutParams);
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
                    this.U.post(new org.telegram.ui.Components.ld(this, i11, 17));
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
        if (DialogObject.isChatDialog(this.f32661e0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f32661e0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.B0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new ai.c8(this, dialogId, 6));
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
        if ((getResourceProvider() == null && org.telegram.ui.ActionBar.h6.I.q()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void o0() {
        SharedPreferences globalMainSettings;
        int i10;
        ImageView imageView = this.f32658c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.H && (i10 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) < 3) {
            globalMainSettings.edit().putInt("proximityhint", i10 + 1).commit();
            if (DialogObject.isUserDialog(this.f32661e0)) {
                this.f32686y.s(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.f32661e0)))));
            } else {
                this.f32686y.s(LocaleController.getString(R.string.ProximityTooltioGroup));
            }
            this.f32686y.u();
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.qi0 qi0Var = this.R;
        if (qi0Var != null) {
            if (z10) {
                qi0Var.a();
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
        qc0 qc0Var = this.T;
        if (qc0Var != null) {
            qc0Var.F();
        }
        vc0 vc0Var = this.W;
        if (vc0Var != null) {
            vc0Var.F();
        }
        mc0 mc0Var = this.J0;
        if (mc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mc0Var);
            this.J0 = null;
        }
        ArrayList arrayList = this.f32664g0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            wc0 wc0Var = (wc0) arrayList.get(i10);
            ImageReceiver imageReceiver = wc0Var.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                wc0Var.h = null;
            }
        }
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f32680u0) {
            iMapView.onLowMemory();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.f32680u0) {
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
        this.f32681v0 = false;
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
        if (iMapView != null && this.f32680u0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f32681v0 = true;
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
            this.f32673p0 = false;
        } else if (this.f32673p0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.f32673p0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        mc0 mc0Var = this.J0;
        if (mc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mc0Var);
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
                k0Var.addView(this.K.getView(), 0, w7.y5.e(-1, AndroidUtilities.dp(10.0f) + this.H0, 51));
                zc0 zc0Var = this.f32684x;
                if (zc0Var != null) {
                    try {
                        if (zc0Var.getParent() instanceof ViewGroup) {
                            ((ViewGroup) this.f32684x.getParent()).removeView(this.f32684x);
                        }
                    } catch (Exception unused2) {
                    }
                    this.S.addView(this.f32684x, 1, w7.y5.e(-1, AndroidUtilities.dp(10.0f) + this.H0, 51));
                }
                A0(false);
                o0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.K.getView(), 0, w7.y5.e(-1, -1, 51));
            }
        }
    }

    public final boolean q0() {
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && iMapView.getGlSurfaceView() != null && !this.M) {
            GLSurfaceView glSurfaceView = this.K.getGlSurfaceView();
            glSurfaceView.queueEvent(new n80(13, this, glSurfaceView));
            return true;
        }
        return false;
    }

    public final void r0(wc0 wc0Var) {
        double d;
        double d10;
        String str;
        TLRPC.Message message;
        if (wc0Var != null && (message = wc0Var.f38955b) != null) {
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
                TLRPC.GeoPoint geoPoint3 = this.f32688z0.geo_point;
                d = geoPoint3.lat;
                d10 = geoPoint3._long;
            }
        }
        if (BuildVars.isHuaweiStoreApp()) {
            str = "mapapp://navigation";
        } else {
            str = "http://maps.google.com/maps";
        }
        if (this.f32683w0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.f32683w0.getLatitude()), Double.valueOf(this.f32683w0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
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
        if (this.F0 != null && !h0() && getParentActivity() != null && this.f32683w0 != null && d0()) {
            if (this.f32674q0 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f32674q0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    org.telegram.ui.Components.e5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new ic0(this, z10, 1), null).o();
                    return;
                }
            }
            if (DialogObject.isUserDialog(this.f32661e0)) {
                user = getMessagesController().getUser(Long.valueOf(this.f32661e0));
            } else {
                user = null;
            }
            showDialog(org.telegram.ui.Components.e5.E(getParentActivity(), z10, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    cd0.V(cd0.this, z10, user, i10);
                }
            }, null));
        }
    }

    public final void t0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.f32683w0 = new Location(location);
        wc0 wc0Var = (wc0) this.f32665h0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.f32661e0);
        if (wc0Var != null && sharingLocationInfo != null && wc0Var.f38955b.f18356id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            wc0Var.e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = wc0Var.f38957f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.f32666i0 == wc0Var.f38954a) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(wc0Var.e.getPosition()));
            }
        }
        if (this.B0 == null && this.f32688z0 == null && this.I != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            qc0 qc0Var = this.T;
            if (qc0Var != null) {
                if (!this.D0 && (i10 = this.G0) != 4 && i10 != 8) {
                    qc0Var.H(null, this.f32683w0, true);
                }
                this.T.M(this.f32683w0);
            }
            if (!this.C0) {
                this.f32685x0 = new Location(location);
                if (this.E0) {
                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.E0 = true;
                    this.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.I.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.T.M(this.f32683w0);
        }
        org.telegram.ui.Components.qi0 qi0Var = this.R;
        if (qi0Var != null) {
            qi0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.O;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.f32683w0.getLatitude(), this.f32683w0.getLongitude()));
        }
        C0();
    }

    public final void u0(MessageObject messageObject) {
        this.B0 = messageObject;
        this.f32661e0 = messageObject.getDialogId();
    }

    public final void v0(wc0 wc0Var) {
        if (wc0Var.h == null) {
            TLRPC.User user = wc0Var.f38956c;
            TLRPC.Chat chat = wc0Var.d;
            if (user == null && chat == 0) {
                return;
            }
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            if (user != null) {
                h9Var.m(this.currentAccount, user);
            } else {
                h9Var.k(this.currentAccount, chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.setCurrentAccount(this.currentAccount);
            imageReceiver.setDelegate(new ow(14, this, wc0Var));
            imageReceiver.onAttachedToWindow();
            if (user == null) {
                user = chat;
            }
            imageReceiver.setForUserOrChat(user, h9Var);
            wc0Var.h = imageReceiver;
        }
    }

    public final void w0(int i10, TLRPC.User user, int i11) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.f32683w0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.f32683w0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.f32683w0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.F0.b(tL_messageMediaGeoLive, this.G0, true, 0, 0L);
        if (i11 > 0) {
            this.R.L = true;
            this.f32658c.setImageResource(R.drawable.msg_location_alert2);
            org.telegram.ui.Components.qi0 qi0Var = this.R;
            if (qi0Var != null) {
                qi0Var.a();
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
        org.telegram.ui.Components.gl glVar;
        Location location;
        Location location2;
        if (this.G0 == 3) {
            z10 = true;
        }
        if (z10 && (glVar = this.e) != null && glVar.getTag() == null && ((location = this.f32683w0) == null || (location2 = this.f32685x0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        org.telegram.ui.Components.gl glVar2 = this.e;
        if (glVar2 != null) {
            if (!z10 || glVar2.getTag() == null) {
                if (z10 || this.e.getTag() != null) {
                    org.telegram.ui.Components.gl glVar3 = this.e;
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    glVar3.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    org.telegram.ui.Components.gl glVar4 = this.e;
                    Property property = View.TRANSLATION_X;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(glVar4, property, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.sr.f28340g);
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
            TextView textView = this.f32656b;
            if (!z10) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            TextView textView2 = this.f32656b;
            if (z10) {
                f11 = 1.0f;
            }
            textView2.setAlpha(f11);
            TextView textView3 = this.f32656b;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            textView3.setScaleX(f10);
            TextView textView4 = this.f32656b;
            if (z10) {
                f12 = 1.0f;
            }
            textView4.setScaleY(f12);
            return;
        }
        this.f32656b.setVisibility(0);
        ViewPropertyAnimator animate = this.f32656b.animate();
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
        scaleX.scaleY(f12).setInterpolator(org.telegram.ui.Components.sr.h).setDuration(420L).withEndAction(new ic0(this, z10, 0)).start();
    }
}
