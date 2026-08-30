package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class ChatAttachAlertPhotoLayout extends di implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f22894n1;
    public static final ArrayList f22895o1 = new ArrayList();
    public static final HashMap f22896p1 = new HashMap();
    public static final ArrayList f22897q1 = new ArrayList();
    public static int f22898r1 = -1;
    public boolean A0;
    public final pl B;
    public final Rect B0;
    public final oh.k C;
    public float C0;
    public final em D;
    public boolean D0;
    public final mz E;
    public boolean E0;
    public final vl0 F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public int H0;
    public int I;
    public int I0;
    public int J;
    public int J0;
    public boolean K;
    public boolean K0;
    public AnimatorSet L;
    public boolean L0;
    public am M;
    public boolean M0;
    public final bm N;
    public boolean N0;
    public final yl O;
    public boolean O0;
    public final ImageView[] P;
    public int P0;
    public boolean Q;
    public MediaController.AlbumEntry Q0;
    public final float[] R;
    public MediaController.AlbumEntry R0;
    public final int[] S;
    public ArrayList S0;
    public float T;
    public float T0;
    public float U;
    public boolean U0;
    public boolean V;
    public final org.telegram.ui.ActionBar.g1 V0;
    public boolean W;
    public final org.telegram.ui.ActionBar.g1 W0;
    public final org.telegram.ui.ActionBar.g1 X0;
    public final org.telegram.ui.ActionBar.g1 Y0;
    public final org.telegram.ui.ActionBar.g1 Z0;
    public boolean f22899a0;
    public final vb0 f22900a1;
    public float f22901b0;
    public final boolean f22902b1;
    public final int[] f22903c0;
    public final AnimationNotificationsLocker f22904c1;
    public int f22905d0;
    public boolean f22906d1;
    public ml f22907e0;
    public final ul f22908e1;
    public final DecelerateInterpolator f22909f0;
    public boolean f22910f1;
    public final dg.u2 f22911g0;
    public float f22912g1;
    public final ShutterButton f22913h0;
    public float f22914h1;
    public final h91 f22915i0;
    public float f22916i1;
    public AnimatorSet f22917j0;
    public float f22918j1;
    public Runnable f22919k0;
    public float f22920k1;
    public Boolean f22921l0;
    public ViewPropertyAnimator l1;
    public final TextView m0;
    public int f22922m1;
    public final boolean f22923n;
    public final TextView f22924n0;
    public final ImageView f22925o0;
    public boolean f22926p0;
    public boolean f22927q0;
    public final pl f22928r;
    public boolean f22929r0;
    public final org.telegram.ui.k f22930s;
    public boolean f22931s0;
    public boolean f22932t0;
    public boolean f22933u0;
    public final em v;
    public boolean f22934v0;
    public final vl f22935w;
    public boolean f22936w0;
    public final TextView f22937x;
    public float f22938x0;
    public final Drawable f22939y;
    public float f22940y0;
    public boolean f22941z0;

    public ChatAttachAlertPhotoLayout(li liVar, Context context, boolean z4, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, liVar);
        boolean z11;
        this.P = new ImageView[2];
        this.R = new float[2];
        this.S = new int[2];
        this.f22903c0 = new int[5];
        this.f22909f0 = new DecelerateInterpolator(1.5f);
        this.f22921l0 = null;
        this.B0 = new Rect();
        int dp = AndroidUtilities.dp(80.0f);
        this.H0 = dp;
        this.I0 = dp;
        this.J0 = 3;
        this.U0 = true;
        this.f22904c1 = new AnimationNotificationsLocker();
        this.f22908e1 = new ul(this);
        this.f22902b1 = z4;
        this.f22923n = z10;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        org.telegram.ui.ActionBar.e3 container = liVar.getContainer();
        li liVar2 = this.f24278b;
        if (liVar2.N0 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22906d1 = z11;
        vl vlVar = new vl(this, context, liVar2.U0.n(), f6Var, 0);
        this.f22935w = vlVar;
        vlVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = k7.b6.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = AndroidUtilities.statusBarHeight;
        this.f24278b.U0.addView(vlVar, 0, d);
        vlVar.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f23696b;

            {
                this.f23696b = this;
            }

            @Override
            public final void onClick(View view) {
                am amVar;
                am amVar2;
                int i10 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f23696b;
                switch (i10) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.M != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.M.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f22926p0 && (amVar = chatAttachAlertPhotoLayout.M) != null && amVar.isInited()) {
                            chatAttachAlertPhotoLayout.W = false;
                            chatAttachAlertPhotoLayout.M.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22925o0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new ol(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.Q && (amVar2 = chatAttachAlertPhotoLayout.M) != null && amVar2.isInited() && chatAttachAlertPhotoLayout.V) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.M.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.Q = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.P;
                                ImageView imageView = imageViewArr[0];
                                if (imageView == view) {
                                    imageView = imageViewArr[1];
                                }
                                imageView.setVisibility(0);
                                ChatAttachAlertPhotoLayout.o0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(nr.f27346f);
                                animatorSet.addListener(new nh.g3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f22935w.M(null, null);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f22937x = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.j6.f20012j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, this.f24277a));
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.f22939y = mutate;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.f24277a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        vlVar.addView(textView, k7.b6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        U(false);
        vb0 vb0Var = new vb0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), f6Var);
        this.f22900a1 = vb0Var;
        vb0Var.a(!this.f24278b.Z, false);
        this.Z0 = this.f24278b.X0.e(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.f24278b.X0.a(5);
        this.f24278b.X0.e(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.W0 = this.f24278b.X0.e(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.f24278b.X0.e(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.f24278b.X0.a(6);
        this.V0 = this.f24278b.X0.e(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.X0 = this.f24278b.X0.e(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        org.telegram.ui.ActionBar.w0 w0Var = this.f24278b.X0;
        w0Var.o();
        vb0Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        vb0Var.setTag(8);
        w0Var.f20649b.addView(vb0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) vb0Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        vb0Var.setLayoutParams(layoutParams);
        vb0Var.setOnClickListener(new org.telegram.ui.ActionBar.b0(w0Var, 2));
        this.Y0 = this.f24278b.X0.e(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.f24278b.X0.setFitSubItems(true);
        pl plVar = new pl(this, context, f6Var, 1);
        this.B = plVar;
        plVar.setFastScrollEnabled(1);
        plVar.setFastScrollVisible(true);
        plVar.getFastScroll().setAlpha(0.0f);
        plVar.getFastScroll().f23697a = false;
        plVar.getFastScroll().f23704e0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        em emVar = new em(this, context, z10);
        this.D = emVar;
        plVar.setAdapter(emVar);
        bm bmVar = new bm(this, plVar);
        this.N = bmVar;
        plVar.i(bmVar);
        for (int i11 = 0; i11 < 8; i11++) {
            emVar.h.add(emVar.L());
        }
        plVar.setClipToPadding(false);
        plVar.setItemAnimator(null);
        plVar.setLayoutAnimation(null);
        plVar.setVerticalScrollBarEnabled(false);
        plVar.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, this.f24277a));
        addView(plVar, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        plVar.setOnScrollListener(new org.telegram.ui.l6(this, 1));
        oh.k kVar = new oh.k(this, this.H0, 2);
        this.C = kVar;
        kVar.O = new kh.n5(this, 3);
        plVar.setLayoutManager(kVar);
        plVar.setOnItemClickListener(new com.google.firebase.messaging.i(this, z10, f6Var, 6));
        plVar.setOnItemLongClickListener(new cl(this, 3));
        vl0 vl0Var = new vl0(new xl(this));
        this.F = vl0Var;
        plVar.B.add(vl0Var);
        this.f24279c = plVar;
        this.d = plVar;
        this.f24280f = true;
        mz mzVar = new mz(context, f6Var);
        this.E = mzVar;
        mzVar.setText(LocaleController.getString(R.string.NoPhotos));
        mzVar.setOnTouchListener(null);
        mzVar.setTextSize(16);
        addView(mzVar, k7.b6.c(-2.0f, -1));
        if (this.U0) {
            mzVar.b();
        } else {
            mzVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        yl ylVar = new yl(context, paint);
        this.O = ylVar;
        AndroidUtilities.updateViewVisibilityAnimated(ylVar, false, 1.0f, false);
        ylVar.setBackgroundResource(R.drawable.system);
        ylVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        ylVar.setTextSize(1, 15.0f);
        ylVar.setTypeface(AndroidUtilities.bold());
        ylVar.setAlpha(0.0f);
        ylVar.setTextColor(-1);
        ylVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(ylVar, k7.b6.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        dg.u2 u2Var = new dg.u2(this, context, 16);
        this.f22911g0 = u2Var;
        u2Var.setVisibility(8);
        u2Var.setAlpha(0.0f);
        container.addView(u2Var, k7.b6.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.m0 = textView2;
        textView2.setBackgroundResource(R.drawable.photos_rounded);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.photos_arrow, 0);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        container.addView(textView2, k7.b6.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f23696b;

            {
                this.f23696b = this;
            }

            @Override
            public final void onClick(View view) {
                am amVar;
                am amVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f23696b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.M != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.M.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f22926p0 && (amVar = chatAttachAlertPhotoLayout.M) != null && amVar.isInited()) {
                            chatAttachAlertPhotoLayout.W = false;
                            chatAttachAlertPhotoLayout.M.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22925o0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new ol(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.Q && (amVar2 = chatAttachAlertPhotoLayout.M) != null && amVar2.isInited() && chatAttachAlertPhotoLayout.V) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.M.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.Q = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.P;
                                ImageView imageView = imageViewArr[0];
                                if (imageView == view) {
                                    imageView = imageViewArr[1];
                                }
                                imageView.setVisibility(0);
                                ChatAttachAlertPhotoLayout.o0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(nr.f27346f);
                                animatorSet.addListener(new nh.g3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f22935w.M(null, null);
                        return;
                }
            }
        });
        h91 h91Var = new h91(context);
        this.f22915i0 = h91Var;
        h91Var.setVisibility(8);
        h91Var.setAlpha(0.0f);
        container.addView(h91Var, k7.b6.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        h91Var.setDelegate(new cl(this, 0));
        ?? view = new View(context);
        view.f23175b = new DecelerateInterpolator();
        view.f23181w = new tl0(view, 2);
        view.f23174a = view.getResources().getDrawable(R.drawable.camera_btn);
        Paint paint2 = new Paint(1);
        view.f23176c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f23177f = ev0.f24682a;
        this.f22913h0 = view;
        u2Var.addView((View) view, k7.b6.e(84, 84, 17));
        view.setDelegate(new nl(this, f6Var, container));
        view.setFocusable(true);
        view.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.f22925o0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        u2Var.addView(imageView, k7.b6.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f23696b;

            {
                this.f23696b = this;
            }

            @Override
            public final void onClick(View view2) {
                am amVar;
                am amVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f23696b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.M != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.M.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f22926p0 && (amVar = chatAttachAlertPhotoLayout.M) != null && amVar.isInited()) {
                            chatAttachAlertPhotoLayout.W = false;
                            chatAttachAlertPhotoLayout.M.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22925o0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new ol(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.Q && (amVar2 = chatAttachAlertPhotoLayout.M) != null && amVar2.isInited() && chatAttachAlertPhotoLayout.V) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.M.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.Q = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.P;
                                ImageView imageView2 = imageViewArr[0];
                                if (imageView2 == view2) {
                                    imageView2 = imageViewArr[1];
                                }
                                imageView2.setVisibility(0);
                                ChatAttachAlertPhotoLayout.o0(imageView2, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(nr.f27346f);
                                animatorSet.addListener(new nh.g3(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f22935w.M(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i12 = 0; i12 < 2; i12++) {
            this.P[i12] = new ImageView(context);
            this.P[i12].setScaleType(ImageView.ScaleType.CENTER);
            this.P[i12].setVisibility(4);
            this.f22911g0.addView(this.P[i12], k7.b6.e(48, 48, 51));
            this.P[i12].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f23696b;

                {
                    this.f23696b = this;
                }

                @Override
                public final void onClick(View view2) {
                    am amVar;
                    am amVar2;
                    int i102 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f23696b;
                    switch (i102) {
                        case 0:
                            if (chatAttachAlertPhotoLayout.M != null) {
                                chatAttachAlertPhotoLayout.j0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.M.getCameraSessionObject());
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.f22926p0 && (amVar = chatAttachAlertPhotoLayout.M) != null && amVar.isInited()) {
                                chatAttachAlertPhotoLayout.W = false;
                                chatAttachAlertPhotoLayout.M.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22925o0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new ol(chatAttachAlertPhotoLayout));
                                duration.start();
                                return;
                            }
                            return;
                        case 2:
                            if (!chatAttachAlertPhotoLayout.Q && (amVar2 = chatAttachAlertPhotoLayout.M) != null && amVar2.isInited() && chatAttachAlertPhotoLayout.V) {
                                String currentFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getCurrentFlashMode();
                                String nextFlashMode = chatAttachAlertPhotoLayout.M.getCameraSession().getNextFlashMode();
                                if (!currentFlashMode.equals(nextFlashMode)) {
                                    chatAttachAlertPhotoLayout.M.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                    chatAttachAlertPhotoLayout.Q = true;
                                    ImageView[] imageViewArr = chatAttachAlertPhotoLayout.P;
                                    ImageView imageView2 = imageViewArr[0];
                                    if (imageView2 == view2) {
                                        imageView2 = imageViewArr[1];
                                    }
                                    imageView2.setVisibility(0);
                                    ChatAttachAlertPhotoLayout.o0(imageView2, nextFlashMode);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, AndroidUtilities.dp(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -AndroidUtilities.dp(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(nr.f27346f);
                                    animatorSet.addListener(new nh.g3(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            chatAttachAlertPhotoLayout.f22935w.M(null, null);
                            return;
                    }
                }
            });
            ImageView imageView2 = this.P[i12];
            imageView2.setContentDescription("flash mode " + i12);
        }
        TextView textView3 = new TextView(context);
        this.f22924n0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(org.telegram.ui.b.e(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.f22911g0.addView(textView3, k7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        pl plVar2 = new pl(this, context, f6Var, 0);
        this.f22928r = plVar2;
        plVar2.setVerticalScrollBarEnabled(true);
        em emVar2 = new em(this, context, false);
        this.v = emVar2;
        plVar2.setAdapter(emVar2);
        for (int i13 = 0; i13 < 8; i13++) {
            emVar2.h.add(emVar2.L());
        }
        plVar2.setClipToPadding(false);
        plVar2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        plVar2.setItemAnimator(null);
        plVar2.setLayoutAnimation(null);
        plVar2.setOverScrollMode(2);
        plVar2.setVisibility(4);
        plVar2.setAlpha(0.0f);
        container.addView(plVar2, k7.b6.c(80.0f, -1));
        org.telegram.ui.k kVar2 = new org.telegram.ui.k(0, false, 5);
        this.f22930s = kVar2;
        plVar2.setLayoutManager(kVar2);
        plVar2.setOnItemClickListener(new kh.a(3));
    }

    public static void J(org.telegram.ui.Components.ChatAttachAlertPhotoLayout r25, boolean r26, org.telegram.ui.ActionBar.f6 r27, android.view.View r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.J(org.telegram.ui.Components.ChatAttachAlertPhotoLayout, boolean, org.telegram.ui.ActionBar.f6, android.view.View, int):void");
    }

    public static org.telegram.ui.Cells.t5 K(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        pl plVar = chatAttachAlertPhotoLayout.B;
        int childCount = plVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = plVar.getChildAt(i11);
            if (childAt.getTop() < plVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f24278b.l1() && (childAt instanceof org.telegram.ui.Cells.t5)) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (t5Var.getImageView().getTag() != null && ((Integer) t5Var.getImageView().getTag()).intValue() == i10) {
                    return t5Var;
                }
            }
        }
        return null;
    }

    public static int N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        li liVar = chatAttachAlertPhotoLayout.f24278b;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
        if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).O3 == 5) {
            return p2Var.getMessagesController().config.quickReplyMessagesLimit.get() - ((org.telegram.ui.xn) liVar.f26689c0).f40164r6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static void O(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        li liVar = chatAttachAlertPhotoLayout.f24278b;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                liVar.f26689c0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
            } else if (i10 >= 23) {
                liVar.f26689c0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            }
        } catch (Exception unused) {
        }
    }

    public static void P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        li liVar = chatAttachAlertPhotoLayout.f24278b;
        if (Build.VERSION.SDK_INT >= 23 && f0.f.b(liVar.f26689c0.getParentActivity(), "android.permission.CAMERA") != 0) {
            try {
                liVar.f26689c0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        chatAttachAlertPhotoLayout.i0();
    }

    public static boolean S() {
        HashMap hashMap = f22896p1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto() && photoEntry.isUnalivePhoto()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean T() {
        CharSequence charSequence;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = f22897q1;
            if (i10 >= arrayList.size()) {
                break;
            }
            Object obj = f22896p1.get(arrayList.get(i10));
            if (obj instanceof MediaController.PhotoEntry) {
                charSequence = ((MediaController.PhotoEntry) obj).caption;
            } else if (obj instanceof MediaController.SearchImage) {
                charSequence = ((MediaController.SearchImage) obj).caption;
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                i11++;
            }
            i10++;
        }
        if (i11 > 1) {
            return false;
        }
        return true;
    }

    public static boolean c0() {
        HashMap hashMap = f22896p1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((entry.getValue() instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) entry.getValue()).isLivePhoto()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.f22922m1;
    }

    public static void o0(ImageView imageView, String str) {
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case 3551:
                if (str.equals("on")) {
                    c3 = 0;
                    break;
                }
                break;
            case 109935:
                if (str.equals("off")) {
                    c3 = 1;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c3 = 2;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                imageView.setImageResource(R.drawable.flash_on);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
                return;
            case 1:
                imageView.setImageResource(R.drawable.flash_off);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
                return;
            case 2:
                imageView.setImageResource(R.drawable.flash_auto);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
                return;
            default:
                return;
        }
    }

    @Override
    public final void A() {
        li liVar = this.f24278b;
        if (liVar.isShowing() && !liVar.isDismissed() && !PhotoViewer.t1().Q1()) {
            U(false);
        }
    }

    @Override
    public final void B(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.B(int):void");
    }

    @Override
    public final boolean C(int i10) {
        if (this.V) {
            if (i10 == 24 || i10 == 25 || i10 == 79 || i10 == 85) {
                ((nl) this.f22913h0.getDelegate()).b();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void D(di diVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.l1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f22935w.setVisibility(0);
        boolean z4 = diVar instanceof om;
        TextView textView = this.f22937x;
        if (!z4) {
            Z();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(nr.f27349j);
            this.l1 = interpolator;
            interpolator.start();
        }
        this.f24278b.U0.setTitle("");
        this.C.h1(0, 0);
        if (z4) {
            this.B.post(new org.telegram.ui.hp(29, this, diVar));
        }
        V();
        m0();
    }

    @Override
    public final void E() {
        this.K = false;
        am amVar = this.M;
        if (amVar != null) {
            amVar.setVisibility(0);
        }
        if (this.f22929r0) {
            this.f22929r0 = false;
            U(true);
        }
    }

    @Override
    public final void F() {
        this.B.x0(0);
    }

    public final int Q(MediaController.PhotoEntry photoEntry, int i10) {
        boolean z4;
        Integer valueOf = Integer.valueOf(photoEntry.imageId);
        HashMap hashMap = f22896p1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f22897q1;
        if (containsKey) {
            photoEntry.starsAmount = 0L;
            photoEntry.hasSpoiler = false;
            photoEntry.discardLivePhoto = null;
            photoEntry.highQuality = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            y0(false);
            w0();
            if (i10 >= 0) {
                photoEntry.reset();
                this.f22908e1.W(i10);
            }
            return indexOf;
        }
        photoEntry.starsAmount = getStarsPrice();
        if (getStarsPrice() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        photoEntry.hasSpoiler = z4;
        photoEntry.isChatPreviewSpoilerRevealed = false;
        photoEntry.isAttachSpoilerRevealed = false;
        if (c0()) {
            photoEntry.discardLivePhoto = Boolean.valueOf(!S());
        }
        photoEntry.highQuality = Boolean.valueOf(photoEntry.isHighQuality());
        boolean W = W(true);
        hashMap.put(valueOf, photoEntry);
        arrayList.add(valueOf);
        if (W) {
            x0();
            return -1;
        }
        y0(true);
        return -1;
    }

    public final void R() {
        am amVar = this.M;
        if (amVar != null) {
            if (!this.V) {
                amVar.setTranslationX(this.R[0]);
            }
            int i10 = this.H0;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2);
            if (!this.V) {
                this.M.setClipTop((int) this.T);
                this.M.setClipBottom((int) this.U);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.M.getLayoutParams();
                if (layoutParams.height != dp || layoutParams.width != i10) {
                    layoutParams.width = i10;
                    layoutParams.height = dp;
                    this.M.setLayoutParams(layoutParams);
                    AndroidUtilities.runOnUIThread(new il(0, this, layoutParams));
                }
            }
        }
    }

    public final void U(boolean z4) {
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z10;
        em emVar;
        li liVar = this.f24278b;
        boolean z11 = liVar.S;
        org.telegram.ui.ActionBar.p2 p2Var2 = liVar.f26689c0;
        if (!z11 && this.f22923n) {
            boolean z12 = this.K0;
            boolean z13 = this.L0;
            if (p2Var2 == null) {
                p2Var = LaunchActivity.R();
            } else {
                p2Var = p2Var2;
            }
            if (p2Var != null && p2Var.getParentActivity() != null) {
                if (!SharedConfig.inappCamera) {
                    this.K0 = false;
                } else if (Build.VERSION.SDK_INT >= 23) {
                    if (p2Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.L0 = z10;
                    if (z10) {
                        if (z4) {
                            try {
                                p2Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                            } catch (Exception unused) {
                            }
                        }
                        this.K0 = false;
                    } else {
                        if (z4 || SharedConfig.hasCameraCache) {
                            CameraController.getInstance().initCamera(null);
                        }
                        this.K0 = CameraController.getInstance().isCameraInitied();
                    }
                } else {
                    if (z4 || SharedConfig.hasCameraCache) {
                        CameraController.getInstance().initCamera(null);
                    }
                    this.K0 = CameraController.getInstance().isCameraInitied();
                }
                if ((z12 != this.K0 || z13 != this.L0) && (emVar = this.D) != null) {
                    emVar.l();
                }
                if (!liVar.S && liVar.isShowing() && this.K0 && liVar.getBackDrawable().getAlpha() != 0 && !this.V) {
                    s0();
                }
            }
        }
    }

    public final void V() {
        f2.l1 K;
        float[] fArr;
        int i10;
        float f10;
        yl ylVar;
        int systemWindowInsetTop;
        if (!PhotoViewer.C1() || PhotoViewer.t1().f31807m5 == null || !PhotoViewer.t1().f31807m5.S) {
            am amVar = this.M;
            if (amVar != null) {
                amVar.invalidateOutline();
            }
            pl plVar = this.B;
            f2.l1 K2 = plVar.K(this.J0 - 1);
            if (K2 != null) {
                K2.f5785a.invalidateOutline();
            }
            if ((!this.D.d || !this.K0 || this.Q0 != this.R0) && (K = plVar.K(0)) != null) {
                K.f5785a.invalidateOutline();
            }
            am amVar2 = this.M;
            if (amVar2 != null) {
                amVar2.invalidate();
            }
            if (Build.VERSION.SDK_INT >= 23 && (ylVar = this.O) != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ylVar.getLayoutParams();
                if (getRootWindowInsets() == null) {
                    systemWindowInsetTop = AndroidUtilities.dp(16.0f);
                } else {
                    systemWindowInsetTop = getRootWindowInsets().getSystemWindowInsetTop() + AndroidUtilities.dp(2.0f);
                }
                marginLayoutParams.topMargin = systemWindowInsetTop;
            }
            if (!this.K0) {
                return;
            }
            int childCount = plVar.getChildCount();
            int i11 = 0;
            while (true) {
                fArr = this.R;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = plVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.m5) {
                    if (childAt.isAttachedToWindow()) {
                        float y10 = getY() + plVar.getY() + childAt.getY();
                        li liVar = this.f24278b;
                        ViewGroup sheetContainer = liVar.getSheetContainer();
                        nh nhVar = liVar.f26749v1;
                        ah.d dVar = liVar.L0;
                        float y11 = sheetContainer.getY() + y10;
                        float x10 = liVar.getSheetContainer().getX() + getX() + plVar.getX() + childAt.getX();
                        if (Build.VERSION.SDK_INT >= 23) {
                            x10 -= getRootWindowInsets().getSystemWindowInsetLeft();
                        }
                        if (!liVar.f26692d0) {
                            i10 = AndroidUtilities.statusBarHeight;
                        } else {
                            i10 = 0;
                        }
                        float alpha = (dVar.getAlpha() * dVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
                        zh zhVar = liVar.f26762y2;
                        if (zhVar != null && zhVar.g()) {
                            alpha = Math.max(alpha, (liVar.f26762y2.e() + liVar.f26762y2.getY()) - liVar.f26710i2);
                        }
                        if (y10 < alpha) {
                            f10 = alpha - y10;
                        } else {
                            f10 = 0.0f;
                        }
                        if (f10 != this.T) {
                            this.T = f10;
                            am amVar3 = this.M;
                            if (amVar3 != null) {
                                amVar3.invalidateOutline();
                                this.M.invalidate();
                            }
                        }
                        float translationY = (int) (nhVar.getTranslationY() + (liVar.getSheetContainer().getMeasuredHeight() - nhVar.getMeasuredHeight()));
                        zh zhVar2 = liVar.f26762y2;
                        if (zhVar2 != null) {
                            translationY -= zhVar2.d() - AndroidUtilities.dp(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y10 > translationY) {
                            this.U = Math.min(-AndroidUtilities.dp(5.0f), y10 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.U = 0.0f;
                        }
                        fArr[0] = x10;
                        fArr[1] = y11;
                        R();
                        return;
                    }
                } else {
                    i11++;
                }
            }
            if (this.T != 0.0f) {
                this.T = 0.0f;
                am amVar4 = this.M;
                if (amVar4 != null) {
                    amVar4.invalidateOutline();
                    this.M.invalidate();
                }
            }
            fArr[0] = AndroidUtilities.dp(-400.0f);
            fArr[1] = 0.0f;
            R();
        }
    }

    public final boolean W(boolean z4) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            HashMap hashMap = f22896p1;
            if (hashMap.size() <= 10 - (z4 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f22897q1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof MediaController.PhotoEntry)) {
                break;
            }
            Q((MediaController.PhotoEntry) obj, -1);
            z10 = true;
        }
        return z10;
    }

    public final boolean X(MediaController.PhotoEntry photoEntry) {
        boolean z4 = this.f22932t0;
        org.telegram.ui.ActionBar.f6 f6Var = this.f24277a;
        li liVar = this.f24278b;
        if (!z4 && photoEntry.isVideo) {
            if (!liVar.a1()) {
                org.telegram.messenger.y3.s(R.string.GlobalAttachVideoRestricted, new qc(liVar.f26726o1, f6Var), null);
                return true;
            }
        } else if (!this.f22933u0 && !photoEntry.isVideo) {
            if (!liVar.a1()) {
                org.telegram.messenger.y3.s(R.string.GlobalAttachPhotoRestricted, new qc(liVar.f26726o1, f6Var), null);
                return true;
            }
        } else {
            return false;
        }
        return true;
    }

    public final void Y() {
        if (this.M0 && Build.VERSION.SDK_INT >= 23) {
            boolean e02 = e0();
            this.M0 = e02;
            if (!e02) {
                f0();
            }
            this.D.l();
            this.v.l();
        }
    }

    public final void Z() {
        String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
        org.telegram.ui.ActionBar.g1 g1Var = this.V0;
        g1Var.setText(string);
        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.f24278b.X0.K(1);
        HashMap hashMap = f22896p1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((MediaController.PhotoEntry) entry.getValue()).reset();
            }
            hashMap.clear();
            f22897q1.clear();
        }
        ArrayList arrayList = f22895o1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
                new File(photoEntry.path).delete();
                if (photoEntry.imagePath != null) {
                    new File(photoEntry.imagePath).delete();
                }
                if (photoEntry.thumbPath != null) {
                    new File(photoEntry.thumbPath).delete();
                }
            }
            arrayList.clear();
        }
        this.D.l();
        this.v.l();
    }

    @Override
    public final void a(CharSequence charSequence) {
        MediaController.PhotoEntry photoEntry;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = f22897q1;
            if (i10 < arrayList.size()) {
                if (i10 == 0) {
                    Object obj = arrayList.get(i10);
                    HashMap hashMap = f22896p1;
                    Object obj2 = hashMap.get(obj);
                    if (obj2 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry clone = ((MediaController.PhotoEntry) obj2).clone();
                        CharSequence[] charSequenceArr = {charSequence};
                        clone.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                        clone.caption = charSequenceArr[0];
                        photoEntry = clone;
                    } else {
                        boolean z4 = obj2 instanceof MediaController.SearchImage;
                        photoEntry = obj2;
                        if (z4) {
                            MediaController.SearchImage clone2 = ((MediaController.SearchImage) obj2).clone();
                            CharSequence[] charSequenceArr2 = {charSequence};
                            clone2.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr2, false);
                            clone2.caption = charSequenceArr2[0];
                            photoEntry = clone2;
                        }
                    }
                    hashMap.put(obj, photoEntry);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a0(boolean z4) {
        boolean z10;
        am amVar;
        if (!this.f22926p0 && this.M != null) {
            int i10 = this.H0;
            int[] iArr = this.f22903c0;
            iArr[1] = i10;
            iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
            Runnable runnable = this.f22919k0;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.f22919k0 = null;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, this.f24277a)) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            li liVar = this.f24278b;
            AndroidUtilities.setLightNavigationBar(liVar, z10);
            TextView textView = this.m0;
            pl plVar = this.f22928r;
            dg.u2 u2Var = this.f22911g0;
            pl plVar2 = this.B;
            ImageView[] imageViewArr = this.P;
            h91 h91Var = this.f22915i0;
            if (z4) {
                this.f22912g1 = this.M.getTranslationY();
                this.f22899a0 = true;
                if (plVar2 != null) {
                    plVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(h91Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(plVar, property, 0.0f));
                int i11 = 0;
                while (true) {
                    if (i11 >= 2) {
                        break;
                    } else if (imageViewArr[i11].getVisibility() == 0) {
                        arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i11], property, 0.0f));
                        break;
                    } else {
                        i11++;
                    }
                }
                this.f22904c1.lock();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(nr.f27346f);
                animatorSet.addListener(new rl(this, 2));
                animatorSet.start();
            } else {
                this.f22910f1 = false;
                liVar.getWindow().clearFlags(128);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                u2Var.setAlpha(0.0f);
                u2Var.setVisibility(8);
                h91Var.setAlpha(0.0f);
                h91Var.setTag(null);
                h91Var.setVisibility(8);
                plVar.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                plVar.setVisibility(8);
                int i12 = 0;
                while (true) {
                    if (i12 >= 2) {
                        break;
                    } else if (imageViewArr[i12].getVisibility() == 0) {
                        imageViewArr[i12].setAlpha(0.0f);
                        break;
                    } else {
                        i12++;
                    }
                }
                this.V = false;
                am amVar2 = this.M;
                if (amVar2 != null) {
                    amVar2.setFpsLimit(30);
                    this.M.setSystemUiVisibility(1024);
                }
                if (plVar2 != null) {
                    plVar2.invalidate();
                }
            }
            am amVar3 = this.M;
            if (amVar3 != null) {
                amVar3.setImportantForAccessibility(0);
            }
            plVar2.setImportantForAccessibility(0);
            if (!LiteMode.isEnabled(360928) && (amVar = this.M) != null) {
                amVar.showTexture(false, z4);
            }
        }
    }

    @Override
    public final boolean b() {
        return !this.V;
    }

    public final MediaController.PhotoEntry b0(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = f22895o1;
        int size = arrayList.size();
        if (i10 < size) {
            return (MediaController.PhotoEntry) arrayList.get(i10);
        }
        int i11 = i10 - size;
        MediaController.AlbumEntry albumEntry = this.Q0;
        if (albumEntry == null || i11 >= albumEntry.photos.size()) {
            return null;
        }
        return this.Q0.photos.get(i11);
    }

    @Override
    public final boolean c() {
        for (Map.Entry entry : f22896p1.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof MediaController.PhotoEntry) {
                if (((MediaController.PhotoEntry) value).ttl != 0) {
                    return false;
                }
            } else if ((value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void d() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4 = this.f22902b1;
        if (z4) {
            i10 = org.telegram.ui.ActionBar.j6.f19987hg;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20012j5;
        }
        int i14 = org.telegram.ui.ActionBar.j6.f19889c7;
        org.telegram.ui.ActionBar.f6 f6Var = this.f24277a;
        this.E.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, f6Var);
        pl plVar = this.B;
        plVar.setGlowColor(v02);
        plVar.K(0);
        this.f22937x.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        if (z4) {
            i11 = org.telegram.ui.ActionBar.j6.f19987hg;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.E8;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        vl vlVar = this.f22935w;
        vlVar.G(v03, false);
        if (z4) {
            i12 = org.telegram.ui.ActionBar.j6.f19987hg;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.E8;
        }
        vlVar.G(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), true);
        if (z4) {
            i13 = org.telegram.ui.ActionBar.j6.f20022jg;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.G8;
        }
        vlVar.B(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), this.f22939y);
    }

    public final void d0(boolean z4) {
        if (this.K0 && this.M != null) {
            n0();
            this.N.f();
            this.M.destroy(z4, null);
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.L = null;
            }
            AndroidUtilities.runOnUIThread(new fl(this, 0), 300L);
            this.W = false;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        li liVar;
        if (i10 == NotificationCenter.albumsDidLoad) {
            em emVar = this.D;
            if (emVar != null) {
                if (q0()) {
                    this.R0 = MediaController.allMediaAlbumEntry;
                } else {
                    this.R0 = MediaController.allPhotosAlbumEntry;
                }
                if (this.Q0 != null && ((liVar = this.f24278b) == null || !liVar.D)) {
                    if (q0()) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= MediaController.allMediaAlbums.size()) {
                                break;
                            }
                            MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                            int i13 = albumEntry.bucketId;
                            MediaController.AlbumEntry albumEntry2 = this.Q0;
                            if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                                this.Q0 = albumEntry;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    this.Q0 = this.R0;
                }
                this.U0 = false;
                this.E.c();
                emVar.l();
                this.v.l();
                ArrayList arrayList = f22897q1;
                if (!arrayList.isEmpty() && this.R0 != null) {
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        Integer num = (Integer) arrayList.get(i14);
                        HashMap hashMap = f22896p1;
                        Object obj = hashMap.get(num);
                        MediaController.PhotoEntry photoEntry = this.R0.photosByIds.get(num.intValue());
                        if (photoEntry != null) {
                            if (obj instanceof MediaController.PhotoEntry) {
                                photoEntry.copyFrom((MediaController.PhotoEntry) obj);
                            }
                            hashMap.put(num, photoEntry);
                        }
                    }
                }
                u0();
            }
        } else if (i10 == NotificationCenter.cameraInitied) {
            U(false);
        }
    }

    public final boolean e0() {
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (findActivity == null) {
            findActivity = this.f24278b.f26689c0.getParentActivity();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (findActivity != null) {
                if (i10 < 33 || (findActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && findActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
                    if (i10 < 33 && findActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void f0() {
        MediaController.AlbumEntry albumEntry;
        if (q0()) {
            albumEntry = MediaController.allMediaAlbumEntry;
        } else {
            albumEntry = MediaController.allPhotosAlbumEntry;
        }
        if (albumEntry == null) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
    }

    public final void g0(int r29, android.content.Intent r30, java.lang.String r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.g0(int, android.content.Intent, java.lang.String):void");
    }

    public ArrayList<Object> getAllPhotosArray() {
        MediaController.AlbumEntry albumEntry = this.Q0;
        ArrayList<Object> arrayList = f22895o1;
        if (albumEntry != null) {
            if (!arrayList.isEmpty()) {
                ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.Q0.photos.size());
                arrayList2.addAll(arrayList);
                arrayList2.addAll(this.Q0.photos);
                return arrayList2;
            }
            return this.Q0.photos;
        } else if (!arrayList.isEmpty()) {
            return arrayList;
        } else {
            return new ArrayList<>(0);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.f22901b0;
    }

    @Override
    public int getCurrentItemTop() {
        pl plVar = this.B;
        int childCount = plVar.getChildCount();
        mz mzVar = this.E;
        if (childCount <= 0) {
            plVar.setTopGlowOffset(plVar.getPaddingTop());
            mzVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = plVar.getChildAt(0);
        el0 el0Var = (el0) plVar.G(childAt);
        int top = childAt.getTop() - this.f22922m1;
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || el0Var == null || el0Var.b() != 0) {
            top = dp;
        }
        mzVar.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - mzVar.getMeasuredHeight()) / 2.0f) + top);
        plVar.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.B.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return f22897q1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f22896p1;
    }

    public int getSelectedPhotosCount() {
        int i10 = 0;
        for (Object obj : f22896p1.values()) {
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoEntry.isVideo && photoEntry.editedInfo == null) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i10 = 0;
        for (Object obj : f22896p1.values()) {
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.isHighQuality() && !photoEntry.isVideo && photoEntry.editedInfo == null) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return f22897q1;
    }

    public long getStarsPrice() {
        Iterator it = f22896p1.entrySet().iterator();
        if (it.hasNext()) {
            return ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).starsAmount;
        }
        return 0L;
    }

    @Override
    public final int h() {
        return 1;
    }

    public final void h0(boolean z4) {
        am amVar;
        if (this.M != null && this.L == null) {
            li liVar = this.f24278b;
            if (!liVar.isDismissed()) {
                this.M.initTexture();
                boolean q02 = q0();
                TextView textView = this.f22924n0;
                int i10 = 0;
                if (q02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f22895o1.isEmpty();
                pl plVar = this.f22928r;
                TextView textView2 = this.m0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    plVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    plVar.setVisibility(0);
                }
                if (liVar.m1().v && isFocusable()) {
                    liVar.m1().d();
                }
                h91 h91Var = this.f22915i0;
                h91Var.setVisibility(0);
                h91Var.setAlpha(0.0f);
                dg.u2 u2Var = this.f22911g0;
                u2Var.setVisibility(0);
                u2Var.setTag(null);
                int[] iArr = this.f22903c0;
                iArr[0] = 0;
                int i11 = this.H0;
                iArr[1] = i11;
                iArr[2] = AndroidUtilities.dp(2.0f) + (i11 * 2);
                this.f22912g1 = 0.0f;
                this.f22910f1 = true;
                am amVar2 = this.M;
                if (amVar2 != null) {
                    amVar2.setFpsLimit(-1);
                }
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.setLightNavigationBar((Dialog) liVar, false);
                liVar.getWindow().addFlags(128);
                pl plVar2 = this.B;
                ImageView[] imageViewArr = this.P;
                if (z4) {
                    setCameraOpenProgress(0.0f);
                    this.f22899a0 = true;
                    if (plVar2 != null) {
                        plVar2.invalidate();
                    }
                    this.f22904c1.lock();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(u2Var, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(plVar, property, 1.0f));
                    int i12 = 0;
                    while (true) {
                        if (i12 >= 2) {
                            break;
                        } else if (imageViewArr[i12].getVisibility() == 0) {
                            arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i12], property, 1.0f));
                            break;
                        } else {
                            i12++;
                        }
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(350L);
                    animatorSet.setInterpolator(nr.f27346f);
                    animatorSet.addListener(new rl(this, 1));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    u2Var.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    plVar.setAlpha(1.0f);
                    while (true) {
                        if (i10 >= 2) {
                            break;
                        } else if (imageViewArr[i10].getVisibility() == 0) {
                            imageViewArr[i10].setAlpha(1.0f);
                            break;
                        } else {
                            i10++;
                        }
                    }
                    liVar.W1.C();
                    am amVar3 = this.M;
                    if (amVar3 != null) {
                        amVar3.setSystemUiVisibility(1028);
                    }
                }
                this.V = true;
                am amVar4 = this.M;
                if (amVar4 != null) {
                    amVar4.setImportantForAccessibility(2);
                }
                plVar2.setImportantForAccessibility(4);
                plVar2.invalidate();
                if (!LiteMode.isEnabled(360928) && (amVar = this.M) != null && amVar.isInited()) {
                    this.M.showTexture(true, z4);
                }
            }
        }
    }

    public final void i0() {
        if (SharedConfig.inappCamera) {
            h0(true);
            return;
        }
        li liVar = this.f24278b;
        ji jiVar = liVar.W1;
        if (jiVar != null) {
            jiVar.H(0, false, true, 0, 0, 0L, liVar.s1(), false, 0L);
        }
    }

    @Override
    public final void j() {
        V();
        invalidate();
    }

    public final void j0(MediaController.PhotoEntry photoEntry, boolean z4, boolean z10) {
        int i10;
        org.telegram.ui.xn xnVar;
        int i11;
        org.telegram.ui.xn xnVar2;
        ArrayList<Object> arrayList;
        int i12;
        ArrayList arrayList2 = f22895o1;
        li liVar = this.f24278b;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            f22896p1.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            f22897q1.add(Integer.valueOf(photoEntry.imageId));
            liVar.V1(0);
            this.D.l();
            this.v.l();
        }
        if (photoEntry != null && !z10 && arrayList2.size() > 1) {
            y0(false);
            if (this.M != null) {
                this.f22915i0.b(0.0f, false);
                this.f22940y0 = 0.0f;
                this.M.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.M.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f22927q0 = true;
            org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
            org.telegram.ui.ActionBar.p2 p2Var2 = liVar.f26689c0;
            if (p2Var == null) {
                p2Var = LaunchActivity.R();
            }
            if (p2Var != null) {
                PhotoViewer.t1().K2(p2Var.getParentActivity(), null, this.f24277a);
                PhotoViewer.t1().L2(liVar);
                PhotoViewer t12 = PhotoViewer.t1();
                int i13 = liVar.P1;
                boolean z11 = liVar.Q1;
                t12.h = i13;
                t12.f31811n = z11;
                if (liVar.C && liVar.D) {
                    xnVar = (org.telegram.ui.xn) p2Var2;
                    i10 = 11;
                } else if (liVar.N0 != 0) {
                    xnVar = null;
                    i10 = 1;
                } else if (p2Var2 instanceof org.telegram.ui.xn) {
                    xnVar = (org.telegram.ui.xn) p2Var2;
                    i10 = 2;
                } else {
                    i10 = 5;
                    xnVar = null;
                }
                boolean z12 = liVar.E;
                if (z12) {
                    xnVar2 = null;
                    i11 = 13;
                } else {
                    i11 = i10;
                    xnVar2 = xnVar;
                }
                if (liVar.N0 == 0 && !z12) {
                    arrayList = getAllPhotosArray();
                    i12 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(photoEntry);
                    i12 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                u40 u40Var = liVar.N;
                if (u40Var != null && photoEntry != null) {
                    u40Var.e = photoEntry.isVideo;
                }
                PhotoViewer.t1().f2(arrayList3, i12, i11, false, new ql(this, z4), xnVar2);
                PhotoViewer.t1().x2(liVar.N);
                if (liVar.D) {
                    PhotoViewer.t1().X0(null, null, false, liVar.G);
                    PhotoViewer.t1().l2();
                }
            }
        }
    }

    @Override
    public final void k(float f10) {
        this.T0 = f10;
        V();
        am amVar = this.M;
        if (amVar != null) {
            amVar.invalidateOutline();
            this.M.invalidate();
        }
        invalidate();
    }

    public final void k0() {
        try {
            if (this.M != null) {
                CameraController.getInstance().stopPreview(this.M.getCameraSessionObject());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean l(MotionEvent motionEvent) {
        am amVar;
        if (!this.f22899a0) {
            if (this.V && motionEvent != null) {
                boolean z4 = this.D0;
                h91 h91Var = this.f22915i0;
                if ((!z4 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.B0;
                    h91Var.getHitRect(rect);
                    if (h91Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f22926p0 && !this.F0) {
                            if (motionEvent.getPointerCount() == 2) {
                                this.f22938x0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                this.f22941z0 = true;
                            } else {
                                this.E0 = true;
                                this.C0 = motionEvent.getY();
                                this.f22941z0 = false;
                            }
                            this.A0 = false;
                            this.D0 = true;
                            return true;
                        }
                    }
                } else if (this.D0) {
                    int actionMasked = motionEvent.getActionMasked();
                    pl plVar = this.f22928r;
                    TextView textView = this.m0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.P;
                    dg.u2 u2Var = this.f22911g0;
                    if (actionMasked == 2) {
                        if (this.f22941z0 && motionEvent.getPointerCount() == 2 && !this.F0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (!this.A0) {
                                if (Math.abs(hypot - this.f22938x0) >= AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.f22938x0 = hypot;
                                    this.A0 = true;
                                    return true;
                                }
                            } else if (this.M != null) {
                                this.f22938x0 = hypot;
                                float dp = this.f22940y0 + ((hypot - this.f22938x0) / AndroidUtilities.dp(100.0f));
                                this.f22940y0 = dp;
                                if (dp < 0.0f) {
                                    this.f22940y0 = 0.0f;
                                } else if (dp > 1.0f) {
                                    this.f22940y0 = 1.0f;
                                }
                                h91Var.b(this.f22940y0, false);
                                this.f24278b.getSheetContainer().invalidate();
                                this.M.setZoom(this.f22940y0);
                                t0(true);
                                return true;
                            }
                        } else {
                            float y10 = motionEvent.getY();
                            float f10 = y10 - this.C0;
                            if (this.E0) {
                                if (Math.abs(f10) > AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.E0 = false;
                                    this.F0 = true;
                                    return true;
                                }
                            } else if (this.F0 && (amVar = this.M) != null) {
                                amVar.setTranslationY(amVar.getTranslationY() + f10);
                                this.C0 = y10;
                                h91Var.setTag(null);
                                Runnable runnable = this.f22919k0;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.f22919k0 = null;
                                }
                                if (u2Var.getTag() == null) {
                                    u2Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(u2Var, property, 0.0f), ObjectAnimator.ofFloat(h91Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(plVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(nr.f27346f);
                                    animatorSet.start();
                                    return true;
                                }
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                        this.D0 = false;
                        this.f22941z0 = false;
                        if (this.F0) {
                            this.F0 = false;
                            am amVar2 = this.M;
                            if (amVar2 != null) {
                                if (Math.abs(amVar2.getTranslationY()) > this.M.getMeasuredHeight() / 6.0f) {
                                    a0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.M, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(u2Var, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(plVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f22909f0);
                                animatorSet2.start();
                                u2Var.setTag(null);
                                return true;
                            }
                        } else {
                            am amVar3 = this.M;
                            if (amVar3 != null && !this.A0) {
                                int[] iArr = this.S;
                                amVar3.getLocationOnScreen(iArr);
                                this.M.focusToPoint((int) (motionEvent.getRawX() - iArr[0]), (int) (motionEvent.getRawY() - iArr[1]));
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void l0() {
        if (this.f24278b.S) {
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.P[i10].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(nr.f27346f).start();
        }
        ViewPropertyAnimator duration = this.f22925o0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        nr nrVar = nr.f27346f;
        duration.setInterpolator(nrVar).start();
        this.f22924n0.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
        AndroidUtilities.updateViewVisibilityAnimated(this.O, false);
        AndroidUtilities.cancelRunOnUIThread(this.f22907e0);
        this.f22907e0 = null;
        AndroidUtilities.unlockOrientation(AndroidUtilities.findActivity(getContext()));
    }

    @Override
    public final void m() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.cameraInitied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
    }

    public final void m0() {
        try {
            U(false);
            if (this.M != null) {
                CameraController.getInstance().startPreview(this.M.getCameraSessionObject());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean n() {
        if (this.f22899a0) {
            return true;
        }
        if (this.V) {
            a0(true);
            return true;
        }
        d0(true);
        return false;
    }

    public final void n0() {
        if (this.W) {
            try {
                Bitmap bitmap = this.M.getTextureView().getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.M.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        createScaledBitmap.recycle();
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final void o(int i10) {
        boolean z4;
        if (i10 != 0 && i10 != 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        d0(z4);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.P0 != i14) {
            this.P0 = i14;
            em emVar = this.D;
            if (emVar != null) {
                emVar.l();
            }
        }
        super.onLayout(z4, i10, i11, i12, i13);
        V();
    }

    public final void p0(int i10, final boolean z4) {
        PhotoViewer t12 = PhotoViewer.t1();
        if (i10 == -1) {
            i10 = t12.M4;
        }
        ArrayList arrayList = t12.f31730d7;
        if (arrayList != null && !arrayList.isEmpty() && i10 < arrayList.size() && (arrayList.get(i10) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) arrayList.get(i10)).hasSpoiler) {
            final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
            this.B.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z10 = ChatAttachAlertPhotoLayout.f22894n1;
                    if (view instanceof org.telegram.ui.Cells.t5) {
                        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                        if (t5Var.getPhotoEntry() == photoEntry) {
                            t5Var.c(z4, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z11 = true;
                            if (ChatAttachAlertPhotoLayout.f22896p1.size() <= 1) {
                                z11 = false;
                            }
                            t5Var.f(starsPrice, z11);
                        }
                    }
                }
            });
        }
    }

    @Override
    public final void q() {
        am amVar = this.M;
        if (amVar != null) {
            amVar.setVisibility(8);
        }
        for (Map.Entry entry : f22896p1.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.D.l();
    }

    public final boolean q0() {
        if (!this.f22934v0) {
            li liVar = this.f24278b;
            if (!liVar.C) {
                if (!(liVar.f26689c0 instanceof org.telegram.ui.xn) && !liVar.Q0 && liVar.N0 != 2) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void r() {
        this.K = true;
        pl plVar = this.B;
        int childCount = plVar.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (plVar.getChildAt(i10) instanceof org.telegram.ui.Cells.m5) {
                n0();
                break;
            } else {
                this.N.f();
                i10++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f22937x.animate().alpha(0.0f).setDuration(150L).setInterpolator(nr.f27349j).withEndAction(new fl(this, 1));
        this.l1 = withEndAction;
        withEndAction.start();
        k0();
    }

    public final void r0(y8 y8Var, TLRPC.VideoSize videoSize, long j10) {
        boolean z4;
        li liVar = this.f24278b;
        w8 w8Var = new w8(liVar.R, liVar.N);
        u40 u40Var = liVar.N;
        if (u40Var != null && u40Var.f29106c == 2) {
            z4 = false;
        } else {
            z4 = true;
        }
        w8Var.N = z4;
        liVar.f26689c0.presentFragment(w8Var);
        if (y8Var != null) {
            w8Var.m0(y8Var);
        }
        if (videoSize != null) {
            w8Var.l0(videoSize);
        }
        if (j10 != 0) {
            w8Var.k0(j10);
        }
        w8Var.F = new o1(12, this, w8Var);
    }

    @Override
    public final void requestLayout() {
        if (this.O0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(float f10) {
        am amVar = this.M;
        if (amVar != null) {
            amVar.setAlpha(f10);
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 != 0 && this.M.getVisibility() != 0) {
                this.M.setVisibility(0);
            } else if (i10 == 0 && this.M.getVisibility() != 4) {
                this.M.setVisibility(4);
            }
        }
    }

    public final void s0() {
        boolean z4;
        boolean z10;
        float f10;
        li liVar = this.f24278b;
        if (!liVar.f26691c2 && this.f22931s0 && CameraView.isCameraAllowed()) {
            if (this.M == null) {
                boolean z11 = !LiteMode.isEnabled(360928);
                Context context = getContext();
                Boolean bool = this.f22921l0;
                if (bool != null) {
                    z4 = bool.booleanValue();
                } else {
                    z4 = liVar.R1;
                }
                am amVar = new am(this, context, z4, z11);
                this.M = amVar;
                org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
                if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                amVar.setRecordFile(AndroidUtilities.generateVideoPath(z10));
                this.M.setFocusable(true);
                this.M.setFpsLimit(30);
                this.M.setOutlineProvider(new sl(this, 0));
                this.M.setClipToOutline(true);
                this.M.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                org.telegram.ui.ActionBar.e3 container = liVar.getContainer();
                am amVar2 = this.M;
                int i10 = this.H0;
                container.addView(amVar2, 1, new FrameLayout.LayoutParams(i10, i10));
                this.M.setDelegate(new tl(this));
                am amVar3 = this.M;
                if (this.f22931s0) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                amVar3.setAlpha(f10);
                this.M.setEnabled(this.f22931s0);
                if (this.K) {
                    this.M.setVisibility(8);
                }
                if (!this.V) {
                    V();
                }
                pl plVar = this.B;
                if (plVar != null) {
                    plVar.invalidate();
                }
                invalidate();
            }
            h91 h91Var = this.f22915i0;
            if (h91Var != null) {
                h91Var.b(0.0f, false);
                this.f22940y0 = 0.0f;
            }
            if (!this.V) {
                this.M.setTranslationX(this.R[0]);
            }
        }
    }

    public void setCameraOpenProgress(float f10) {
        int i10;
        int i11;
        if (this.M == null) {
            return;
        }
        this.f22901b0 = f10;
        int[] iArr = this.f22903c0;
        float f11 = iArr[1];
        float f12 = iArr[2];
        int i12 = AndroidUtilities.displaySize.x;
        li liVar = this.f24278b;
        float width = (liVar.getContainer().getWidth() - liVar.getLeftInset()) - liVar.getRightInset();
        float height = liVar.getContainer().getHeight();
        float[] fArr = this.R;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = this.f22912g1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.M.getLayoutParams();
        float textureHeight = this.M.getTextureHeight(f11, f12) / this.M.getTextureHeight(width, height);
        float f16 = f12 / height;
        float f17 = f11 / width;
        if (this.f22910f1) {
            i10 = (int) width;
            i11 = (int) height;
            float f18 = 1.0f - f10;
            float f19 = (textureHeight * f18) + f10;
            this.M.getTextureView().setScaleX(f19);
            this.M.getTextureView().setScaleY(f19);
            float f20 = f13 * f18;
            this.M.setTranslationX(((0.0f * f10) + f20) - (((1.0f - ((f17 * f18) + f10)) * width) / 2.0f));
            float f21 = f14 * f18;
            this.M.setTranslationY(((f15 * f10) + f21) - (((1.0f - ((f16 * f18) + f10)) * height) / 2.0f));
            this.f22914h1 = f21 - this.M.getTranslationY();
            this.f22916i1 = (height * f10) + (((f14 + f12) * f18) - this.M.getTranslationY());
            this.f22920k1 = f20 - this.M.getTranslationX();
            this.f22918j1 = (width * f10) + (((f13 + f11) * f18) - this.M.getTranslationX());
        } else {
            i10 = (int) f11;
            i11 = (int) f12;
            this.M.getTextureView().setScaleX(1.0f);
            this.M.getTextureView().setScaleY(1.0f);
            this.f22914h1 = 0.0f;
            this.f22916i1 = height;
            this.f22920k1 = 0.0f;
            this.f22918j1 = width;
            this.M.setTranslationX(f13);
            this.M.setTranslationY(f14);
        }
        if (layoutParams.width != i10 || layoutParams.height != i11) {
            layoutParams.width = i10;
            layoutParams.height = i11;
            this.M.requestLayout();
        }
        this.M.invalidateOutline();
        this.M.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z4) {
        this.f22929r0 = z4;
    }

    public void setIncludeVideosInGallery(boolean z4) {
        this.f22934v0 = z4;
    }

    public void setStarsPrice(long j10) {
        boolean z4;
        HashMap hashMap = f22896p1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                photoEntry.starsAmount = j10;
                if (j10 > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                photoEntry.hasSpoiler = z4;
                photoEntry.isChatPreviewSpoilerRevealed = false;
                photoEntry.isAttachSpoilerRevealed = false;
            }
        }
        B(getSelectedItemsCount());
        if (W(false)) {
            x0();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        li liVar = this.f24278b;
        if (liVar.getSheetAnimationType() == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            pl plVar = this.B;
            int childCount = plVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    float f12 = 1.0f + f11;
                    t5Var.getCheckBox().setScaleX(f12);
                    t5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        liVar.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void t(int i10) {
        TLRPC.Chat k12;
        boolean z4;
        boolean z10;
        boolean z11 = true;
        li liVar = this.f24278b;
        if (i10 == 8) {
            liVar.H1(!liVar.Z, true);
            this.f22900a1.a(!liVar.Z, true);
        } else if ((i10 == 0 || i10 == 1) && liVar.P1 > 0 && f22897q1.size() > 1 && (k12 = liVar.k1()) != null && !ChatObject.hasAdminRights(k12) && k12.slowmode_enabled) {
            z4.O(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.f24277a).o();
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.f24277a;
            HashMap hashMap = f22896p1;
            if (i10 == 0) {
                MessageObject messageObject = liVar.E1;
                org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
                if (messageObject == null && (p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).c()) {
                    z4.M(getContext(), ((org.telegram.ui.xn) p2Var).a(), new cl(this, 1), f6Var);
                } else {
                    z4.a0(liVar.G1, liVar.j1() + hashMap.size(), liVar.n1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f24296b;

                        {
                            this.f24296b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24296b;
                            Long l10 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z12 = ChatAttachAlertPhotoLayout.f22894n1;
                                    li liVar2 = chatAttachAlertPhotoLayout.f24278b;
                                    liVar2.Y0();
                                    liVar2.W1.H(7, false, true, 0, 0, 0L, liVar2.s1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f22894n1;
                                    li liVar3 = chatAttachAlertPhotoLayout.f24278b;
                                    liVar3.Y0();
                                    liVar3.W1.H(4, true, true, 0, 0, 0L, liVar3.s1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i10 == 1) {
                MessageObject messageObject2 = liVar.E1;
                org.telegram.ui.ActionBar.p2 p2Var2 = liVar.f26689c0;
                if (messageObject2 == null && (p2Var2 instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var2).c()) {
                    z4.M(getContext(), ((org.telegram.ui.xn) p2Var2).a(), new cl(this, 2), f6Var);
                } else {
                    z4.a0(liVar.G1, liVar.j1() + hashMap.size(), liVar.n1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f24296b;

                        {
                            this.f24296b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24296b;
                            Long l10 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z12 = ChatAttachAlertPhotoLayout.f22894n1;
                                    li liVar2 = chatAttachAlertPhotoLayout.f24278b;
                                    liVar2.Y0();
                                    liVar2.W1.H(7, false, true, 0, 0, 0L, liVar2.s1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f22894n1;
                                    li liVar3 = chatAttachAlertPhotoLayout.f24278b;
                                    liVar3.Y0();
                                    liVar3.W1.H(4, true, true, 0, 0, 0L, liVar3.s1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                em emVar = this.D;
                pl plVar = this.B;
                if (i10 == 3) {
                    om omVar = liVar.f26722n0;
                    if (omVar != null) {
                        omVar.J();
                    }
                    Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).hasSpoiler) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    final boolean z12 = !z10;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout f24598b;

                        {
                            this.f24598b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z13 = z12;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24598b;
                            switch (i13) {
                                case 0:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f22894n1;
                                    li liVar2 = chatAttachAlertPhotoLayout.f24278b;
                                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.V0;
                                    if (z13) {
                                        i11 = R.string.DisablePhotoSpoiler;
                                    } else {
                                        i11 = R.string.EnablePhotoSpoiler;
                                    }
                                    g1Var.setText(LocaleController.getString(i11));
                                    if (z13) {
                                        g1Var.setIcon(R.drawable.msg_spoiler_off);
                                    } else {
                                        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
                                    }
                                    if (z13) {
                                        liVar2.X0.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            liVar2.X0.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    liVar2.X0.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        liVar2.X0.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.X0;
                                    if (z13) {
                                        i12 = R.string.SendInStandardQuality;
                                    } else {
                                        i12 = R.string.SendInHighQuality;
                                    }
                                    g1Var2.setText(LocaleController.getString(i12));
                                    if (z13) {
                                        g1Var2.setIcon(R.drawable.menu_quality_sd);
                                        return;
                                    } else {
                                        g1Var2.setIcon(R.drawable.menu_quality_hd);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (entry.getValue() instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                            photoEntry.hasSpoiler = z12;
                            photoEntry.isChatPreviewSpoilerRevealed = false;
                            photoEntry.isAttachSpoilerRevealed = false;
                            arrayList.add(Integer.valueOf(photoEntry.imageId));
                        }
                    }
                    plVar.M(new gl(0, arrayList, z12));
                    if (liVar.f26748v0 != this) {
                        emVar.l();
                    }
                    om omVar2 = liVar.f26722n0;
                    if (omVar2 != null) {
                        omVar2.v.invalidate();
                    }
                } else if (i10 == 2) {
                    om omVar3 = liVar.f26722n0;
                    if (omVar3 != null) {
                        omVar3.J();
                    }
                    Iterator it2 = hashMap.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((MediaController.PhotoEntry) ((Map.Entry) it2.next()).getValue()).isHighQuality()) {
                                z4 = true;
                                break;
                            }
                        } else {
                            z4 = false;
                            break;
                        }
                    }
                    final boolean z13 = !z4;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout f24598b;

                        {
                            this.f24598b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z132 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24598b;
                            switch (i13) {
                                case 0:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f22894n1;
                                    li liVar2 = chatAttachAlertPhotoLayout.f24278b;
                                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.V0;
                                    if (z132) {
                                        i11 = R.string.DisablePhotoSpoiler;
                                    } else {
                                        i11 = R.string.EnablePhotoSpoiler;
                                    }
                                    g1Var.setText(LocaleController.getString(i11));
                                    if (z132) {
                                        g1Var.setIcon(R.drawable.msg_spoiler_off);
                                    } else {
                                        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
                                    }
                                    if (z132) {
                                        liVar2.X0.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            liVar2.X0.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    liVar2.X0.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        liVar2.X0.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.X0;
                                    if (z132) {
                                        i12 = R.string.SendInStandardQuality;
                                    } else {
                                        i12 = R.string.SendInHighQuality;
                                    }
                                    g1Var2.setText(LocaleController.getString(i12));
                                    if (z132) {
                                        g1Var2.setIcon(R.drawable.menu_quality_sd);
                                        return;
                                    } else {
                                        g1Var2.setIcon(R.drawable.menu_quality_hd);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        if (entry2.getValue() instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) entry2.getValue();
                            photoEntry2.highQuality = Boolean.valueOf(z13);
                            photoEntry2.isChatPreviewSpoilerRevealed = false;
                            photoEntry2.isAttachSpoilerRevealed = false;
                            arrayList2.add(Integer.valueOf(photoEntry2.imageId));
                        }
                    }
                    plVar.M(new gl(1, arrayList2, z13));
                    if (liVar.f26748v0 != this) {
                        emVar.l();
                    }
                    om omVar4 = liVar.f26722n0;
                    if (omVar4 != null) {
                        omVar4.v.invalidate();
                    }
                } else if (i10 == 4) {
                    try {
                        if (q0()) {
                            Intent intent = new Intent();
                            intent.setType("video/*");
                            intent.setAction("android.intent.action.GET_CONTENT");
                            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                            Intent intent2 = new Intent("android.intent.action.PICK");
                            intent2.setType("image/*");
                            Intent createChooser = Intent.createChooser(intent2, null);
                            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                            int i11 = liVar.N0;
                            org.telegram.ui.ActionBar.p2 p2Var3 = liVar.f26689c0;
                            if (i11 != 0) {
                                p2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                p2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i12 = liVar.N0;
                            org.telegram.ui.ActionBar.p2 p2Var4 = liVar.f26689c0;
                            if (i12 != 0) {
                                p2Var4.startActivityForResult(intent3, 14);
                            } else {
                                p2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        liVar.dismiss(true);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (i10 == 7) {
                    if (liVar.f26748v0 == liVar.f26722n0) {
                        z11 = false;
                    }
                    liVar.Z1(z11);
                } else if (i10 == 9) {
                    lh.ja.g1(getContext(), getStarsPrice(), true, new d(this, 6), this.f24277a);
                } else if (i10 >= 10) {
                    MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.S0.get(i10 - 10);
                    this.Q0 = albumEntry;
                    MediaController.AlbumEntry albumEntry2 = this.R0;
                    TextView textView = this.f22937x;
                    if (albumEntry == albumEntry2) {
                        textView.setText(LocaleController.getString(R.string.ChatGallery));
                    } else {
                        textView.setText(albumEntry.bucketName);
                    }
                    emVar.l();
                    this.v.l();
                    this.C.h1(0, -(plVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void t0(boolean z4) {
        Integer num;
        float f10;
        h91 h91Var = this.f22915i0;
        if ((h91Var.getTag() != null && z4) || (h91Var.getTag() == null && !z4)) {
            if (z4) {
                Runnable runnable = this.f22919k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                fl flVar = new fl(this, 3);
                this.f22919k0 = flVar;
                AndroidUtilities.runOnUIThread(flVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f22917j0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4) {
            num = 1;
        } else {
            num = null;
        }
        h91Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22917j0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.f22917j0;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(h91Var, View.ALPHA, f10));
        this.f22917j0.addListener(new rl(this, 0));
        this.f22917j0.start();
        if (z4) {
            fl flVar2 = new fl(this, 4);
            this.f22919k0 = flVar2;
            AndroidUtilities.runOnUIThread(flVar2, 2000L);
        }
    }

    @Override
    public final void u() {
        boolean z4;
        li liVar = this.f24278b;
        if (liVar != null && (liVar.f26689c0 instanceof org.telegram.ui.xn)) {
            z4 = true;
        } else {
            z4 = false;
        }
        U(z4);
    }

    public final void u0() {
        ArrayList<MediaController.AlbumEntry> arrayList;
        vl vlVar = this.f22935w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = vlVar.f20649b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f22931s0) {
            if (q0()) {
                arrayList = MediaController.allMediaAlbums;
            } else {
                arrayList = MediaController.allPhotoAlbums;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.S0 = arrayList2;
            Collections.sort(arrayList2, new jl(arrayList, 0));
        } else {
            this.S0 = new ArrayList();
        }
        boolean isEmpty = this.S0.isEmpty();
        TextView textView = this.f22937x;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f22939y, (Drawable) null);
        int size = this.S0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.S0.get(i10);
            ph.a aVar = new ph.a(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.f24277a);
            vlVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new lh.y0(this, i10 + 10, 5));
        }
    }

    public final void v0() {
        pl plVar = this.B;
        if (plVar != null) {
            for (int i10 = 0; i10 < plVar.getChildCount(); i10++) {
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    ((org.telegram.ui.Cells.t5) childAt).f22347a.invalidate();
                }
            }
        }
    }

    @Override
    public final void w(int i10, boolean z4) {
        V();
        am amVar = this.M;
        if (amVar != null) {
            amVar.invalidateOutline();
            this.M.invalidate();
        }
    }

    public final void w0() {
        ArrayList arrayList;
        if (this.f24278b.f26689c0 instanceof org.telegram.ui.xn) {
            pl plVar = this.B;
            int childCount = plVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f22897q1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    MediaController.PhotoEntry b02 = b0(((Integer) t5Var.getTag()).intValue());
                    if (b02 != null) {
                        t5Var.setNum(arrayList.indexOf(Integer.valueOf(b02.imageId)));
                    }
                }
                i10++;
            }
            pl plVar2 = this.f22928r;
            int childCount2 = plVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = plVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) childAt2;
                    MediaController.PhotoEntry b03 = b0(((Integer) t5Var2.getTag()).intValue());
                    if (b03 != null) {
                        t5Var2.setNum(arrayList.indexOf(Integer.valueOf(b03.imageId)));
                    }
                }
            }
        }
    }

    @Override
    public final void x() {
        ShutterButton shutterButton = this.f22913h0;
        if (shutterButton == null) {
            return;
        }
        boolean z4 = this.N0;
        ev0 ev0Var = ev0.f24682a;
        ev0 ev0Var2 = ev0.f24683b;
        if (!z4) {
            if (this.M != null && shutterButton.getState() == ev0Var2) {
                l0();
                CameraController.getInstance().stopVideoRecording(this.M.getCameraSession(), false);
                shutterButton.a(ev0Var);
            }
            if (this.V) {
                a0(false);
            }
            d0(true);
            return;
        }
        if (this.M != null && shutterButton.getState() == ev0Var2) {
            shutterButton.a(ev0Var);
        }
        this.N0 = false;
    }

    public final void x0() {
        ArrayList arrayList;
        em emVar;
        HashMap hashMap;
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        li liVar = this.f24278b;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
        org.telegram.ui.ActionBar.p2 p2Var2 = liVar.f26689c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            pl plVar = this.B;
            int childCount = plVar.getChildCount();
            int i11 = 0;
            while (true) {
                arrayList = f22897q1;
                emVar = this.D;
                hashMap = f22896p1;
                int i12 = -1;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = plVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (emVar.f24601f && R > this.J0) {
                        R--;
                    }
                    if (emVar.d && this.Q0 == this.R0) {
                        R--;
                    }
                    MediaController.PhotoEntry b02 = b0(R);
                    if (b02 != null && b02.hasSpoiler) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    t5Var.setHasSpoiler(z13);
                    if (b02 != null && b02.isHighQuality()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    t5Var.setHighQuality(z14);
                    if ((p2Var2 instanceof org.telegram.ui.xn) && liVar.Q1) {
                        if (b02 != null) {
                            i12 = arrayList.indexOf(Integer.valueOf(b02.imageId));
                        }
                        if (b02 != null && hashMap.containsKey(Integer.valueOf(b02.imageId))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        t5Var.b(i12, z16, true);
                    } else {
                        if (b02 != null && hashMap.containsKey(Integer.valueOf(b02.imageId))) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        t5Var.b(-1, z15, true);
                    }
                }
                i11++;
            }
            pl plVar2 = this.f22928r;
            int childCount2 = plVar2.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = plVar2.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (emVar.f24601f && R2 > this.J0) {
                        R2--;
                    }
                    if (emVar.d && this.Q0 == this.R0) {
                        R2--;
                    }
                    MediaController.PhotoEntry b03 = b0(R2);
                    if (b03 != null && b03.hasSpoiler) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    t5Var2.setHasSpoiler(z4);
                    if (b03 != null && b03.isHighQuality()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t5Var2.setHighQuality(z10);
                    if ((p2Var2 instanceof org.telegram.ui.xn) && liVar.Q1) {
                        if (b03 != null) {
                            i10 = arrayList.indexOf(Integer.valueOf(b03.imageId));
                        } else {
                            i10 = -1;
                        }
                        if (b03 != null && hashMap.containsKey(Integer.valueOf(b03.imageId))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        t5Var2.b(i10, z12, true);
                    } else {
                        if (b03 != null && hashMap.containsKey(Integer.valueOf(b03.imageId))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        t5Var2.b(-1, z11, true);
                    }
                }
            }
        }
    }

    @Override
    public final void y(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.y(int, int):void");
    }

    public final void y0(boolean z4) {
        boolean z10;
        TextView textView = this.m0;
        if (textView != null) {
            li liVar = this.f24278b;
            int i10 = liVar.N0;
            TextView textView2 = liVar.f26703g1;
            if (i10 == 0 && !liVar.Q0 && !liVar.E) {
                HashMap hashMap = f22896p1;
                Iterator it = hashMap.entrySet().iterator();
                int i11 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).isVideo) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    if (z11 && z12) {
                        break;
                    }
                }
                int max = Math.max(1, hashMap.size());
                if (z11 && z12) {
                    textView.setText(LocaleController.formatPluralString("Media", hashMap.size(), new Object[0]).toUpperCase());
                    if (max != this.J || z4) {
                        textView2.setText(LocaleController.formatPluralString("MediaSelected", max, new Object[0]));
                    }
                } else if (z11) {
                    textView.setText(LocaleController.formatPluralString("Videos", hashMap.size(), new Object[0]).toUpperCase());
                    if (max != this.J || z4) {
                        textView2.setText(LocaleController.formatPluralString("VideosSelected", max, new Object[0]));
                    }
                } else {
                    textView.setText(LocaleController.formatPluralString("Photos", hashMap.size(), new Object[0]).toUpperCase());
                    if (max != this.J || z4) {
                        textView2.setText(LocaleController.formatPluralString("PhotosSelected", max, new Object[0]));
                    }
                }
                if (max <= 1) {
                    z10 = false;
                }
                liVar.J = z10;
                liVar.f26712j1.setVisibility((!z10 || liVar.N0 == 2) ? 8 : 8);
                this.J = max;
            }
        }
    }
}
