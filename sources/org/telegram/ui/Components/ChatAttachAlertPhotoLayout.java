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
public class ChatAttachAlertPhotoLayout extends qi implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f24049q1;
    public static final ArrayList f24050r1 = new ArrayList();
    public static final HashMap f24051s1 = new HashMap();
    public static final ArrayList f24052t1 = new ArrayList();
    public static int f24053u1 = -1;
    public float A0;
    public float B0;
    public boolean C0;
    public boolean D0;
    public final km E;
    public final Rect E0;
    public final bi.l F;
    public float F0;
    public final ym G;
    public boolean G0;
    public final d00 H;
    public boolean H0;
    public final tm0 I;
    public boolean I0;
    public int J;
    public boolean J0;
    public boolean K;
    public int K0;
    public int L;
    public int L0;
    public int M;
    public int M0;
    public boolean N;
    public boolean N0;
    public AnimatorSet O;
    public boolean O0;
    public um P;
    public boolean P0;
    public final vm Q;
    public boolean Q0;
    public final sm R;
    public boolean R0;
    public final ImageView[] S;
    public int S0;
    public boolean T;
    public MediaController.AlbumEntry T0;
    public final float[] U;
    public MediaController.AlbumEntry U0;
    public final int[] V;
    public ArrayList V0;
    public float W;
    public float W0;
    public boolean X0;
    public final org.telegram.ui.ActionBar.e1 Y0;
    public final org.telegram.ui.ActionBar.e1 Z0;
    public float f24054a0;
    public final org.telegram.ui.ActionBar.e1 f24055a1;
    public boolean f24056b0;
    public final org.telegram.ui.ActionBar.e1 f24057b1;
    public boolean f24058c0;
    public final org.telegram.ui.ActionBar.e1 f24059c1;
    public boolean f24060d0;
    public final uc0 f24061d1;
    public float f24062e0;
    public final boolean f24063e1;
    public final int[] f24064f0;
    public final AnimationNotificationsLocker f24065f1;
    public int f24066g0;
    public boolean f24067g1;
    public hm f24068h0;
    public final om f24069h1;
    public final DecelerateInterpolator f24070i0;
    public boolean f24071i1;
    public final ai.f0 f24072j0;
    public float f24073j1;
    public final ShutterButton f24074k0;
    public float f24075k1;
    public final ja1 f24076l0;
    public float l1;
    public AnimatorSet m0;
    public float f24077m1;
    public final boolean f24078n;
    public Runnable f24079n0;
    public float f24080n1;
    public Boolean f24081o0;
    public ViewPropertyAnimator f24082o1;
    public final TextView f24083p0;
    public int f24084p1;
    public final TextView f24085q0;
    public final km f24086r;
    public final ImageView f24087r0;
    public final gg.a0 f24088s;
    public boolean f24089s0;
    public boolean f24090t0;
    public boolean f24091u0;
    public final ym v;
    public boolean f24092v0;
    public final pm f24093w;
    public boolean f24094w0;
    public final TextView f24095x;
    public boolean f24096x0;
    public final Drawable f24097y;
    public boolean f24098y0;
    public boolean f24099z0;

    public ChatAttachAlertPhotoLayout(yi yiVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, yiVar);
        boolean z12;
        this.S = new ImageView[2];
        this.U = new float[2];
        this.V = new int[2];
        this.f24064f0 = new int[5];
        this.f24070i0 = new DecelerateInterpolator(1.5f);
        this.f24081o0 = null;
        this.E0 = new Rect();
        int dp = AndroidUtilities.dp(80.0f);
        this.K0 = dp;
        this.L0 = dp;
        this.M0 = 3;
        this.X0 = true;
        this.f24065f1 = new AnimationNotificationsLocker();
        this.f24069h1 = new om(this);
        this.f24063e1 = z10;
        this.f24078n = z11;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        org.telegram.ui.ActionBar.c3 container = yiVar.getContainer();
        yi yiVar2 = this.f30245b;
        if (yiVar2.T0 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f24067g1 = z12;
        pm pmVar = new pm(this, context, yiVar2.f33272a1.o(), d6Var, 0);
        this.f24093w = pmVar;
        pmVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams a2 = w7.x5.a(-1.0f, 60.0f, 0.0f, 40.0f, 0.0f, -2, 51);
        a2.topMargin = AndroidUtilities.statusBarHeight;
        this.f30245b.f33272a1.addView(pmVar, 0, a2);
        pmVar.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f33382b;

            {
                this.f33382b = this;
            }

            @Override
            public final void onClick(View view) {
                um umVar;
                um umVar2;
                int i10 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33382b;
                switch (i10) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f24089s0 && (umVar = chatAttachAlertPhotoLayout.P) != null && umVar.isInited()) {
                            chatAttachAlertPhotoLayout.f24058c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24087r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new jm(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (umVar2 = chatAttachAlertPhotoLayout.P) != null && umVar2.isInited() && chatAttachAlertPhotoLayout.f24056b0) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.P.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.T = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.S;
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
                                animatorSet.setInterpolator(is.f27500f);
                                animatorSet.addListener(new ai.z4(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f24093w.M(null, null);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f24095x = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.h6.f20930j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, this.f30244a));
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.f24097y = mutate;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, this.f30244a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        pmVar.addView(textView, w7.x5.a(-2.0f, 16.0f, 0.0f, 0.0f, 0.0f, -2, 16));
        U(false);
        uc0 uc0Var = new uc0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), d6Var);
        this.f24061d1 = uc0Var;
        uc0Var.a(!this.f30245b.f33278c0, false);
        this.f24059c1 = this.f30245b.f33282d1.e(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.f30245b.f33282d1.a(5);
        this.f30245b.f33282d1.e(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.Z0 = this.f30245b.f33282d1.e(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.f30245b.f33282d1.e(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.f30245b.f33282d1.a(6);
        this.Y0 = this.f30245b.f33282d1.e(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.f24055a1 = this.f30245b.f33282d1.e(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        org.telegram.ui.ActionBar.u0 u0Var = this.f30245b.f33282d1;
        u0Var.o();
        uc0Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        uc0Var.setTag(8);
        u0Var.f21571b.addView(uc0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) uc0Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        uc0Var.setLayoutParams(layoutParams);
        uc0Var.setOnClickListener(new org.telegram.ui.ActionBar.a0(u0Var, 2));
        this.f24057b1 = this.f30245b.f33282d1.e(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.f30245b.f33282d1.setFitSubItems(true);
        km kmVar = new km(this, context, d6Var, 1);
        this.E = kmVar;
        kmVar.setFastScrollEnabled(1);
        kmVar.setFastScrollVisible(true);
        kmVar.getFastScroll().setAlpha(0.0f);
        kmVar.getFastScroll().f33383a = false;
        kmVar.getFastScroll().f33395h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ym ymVar = new ym(this, context, z11);
        this.G = ymVar;
        kmVar.setAdapter(ymVar);
        vm vmVar = new vm(this, kmVar);
        this.Q = vmVar;
        kmVar.i(vmVar);
        for (int i11 = 0; i11 < 8; i11++) {
            ymVar.h.add(ymVar.L());
        }
        kmVar.setClipToPadding(false);
        kmVar.setItemAnimator(null);
        kmVar.setLayoutAnimation(null);
        kmVar.setVerticalScrollBarEnabled(false);
        kmVar.setGlowColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A5, this.f30244a));
        addView(kmVar, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, -48.0f, -1, 119));
        kmVar.setOnScrollListener(new ci.s9(this, 2));
        bi.l lVar = new bi.l(this, this.K0, 2);
        this.F = lVar;
        lVar.O = new ci.w1(this, 3);
        kmVar.setLayoutManager(lVar);
        kmVar.setOnItemClickListener(new com.google.firebase.messaging.i(this, z11, d6Var, 7));
        kmVar.setOnItemLongClickListener(new zl(this, 3));
        tm0 tm0Var = new tm0(new rm(this));
        this.I = tm0Var;
        kmVar.E.add(tm0Var);
        this.f30246c = kmVar;
        this.d = kmVar;
        this.f30248f = true;
        d00 d00Var = new d00(context, d6Var);
        this.H = d00Var;
        d00Var.setText(LocaleController.getString(R.string.NoPhotos));
        d00Var.setOnTouchListener(null);
        d00Var.setTextSize(16);
        addView(d00Var, w7.x5.d(-2.0f, -1));
        if (this.X0) {
            d00Var.b();
        } else {
            d00Var.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        sm smVar = new sm(context, paint);
        this.R = smVar;
        AndroidUtilities.updateViewVisibilityAnimated(smVar, false, 1.0f, false);
        smVar.setBackgroundResource(R.drawable.system);
        smVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        smVar.setTextSize(1, 15.0f);
        smVar.setTypeface(AndroidUtilities.bold());
        smVar.setAlpha(0.0f);
        smVar.setTextColor(-1);
        smVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(smVar, w7.x5.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -2, 49));
        ai.f0 f0Var = new ai.f0(this, context, 10);
        this.f24072j0 = f0Var;
        f0Var.setVisibility(8);
        f0Var.setAlpha(0.0f);
        container.addView(f0Var, w7.x5.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f24083p0 = textView2;
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
        container.addView(textView2, w7.x5.a(38.0f, 0.0f, 0.0f, 0.0f, 116.0f, -2, 51));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f33382b;

            {
                this.f33382b = this;
            }

            @Override
            public final void onClick(View view) {
                um umVar;
                um umVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33382b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f24089s0 && (umVar = chatAttachAlertPhotoLayout.P) != null && umVar.isInited()) {
                            chatAttachAlertPhotoLayout.f24058c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24087r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new jm(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (umVar2 = chatAttachAlertPhotoLayout.P) != null && umVar2.isInited() && chatAttachAlertPhotoLayout.f24056b0) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.P.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.T = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.S;
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
                                animatorSet.setInterpolator(is.f27500f);
                                animatorSet.addListener(new ai.z4(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f24093w.M(null, null);
                        return;
                }
            }
        });
        ja1 ja1Var = new ja1(context);
        this.f24076l0 = ja1Var;
        ja1Var.setVisibility(8);
        ja1Var.setAlpha(0.0f);
        container.addView(ja1Var, w7.x5.a(50.0f, 0.0f, 0.0f, 0.0f, 116.0f, -2, 51));
        ja1Var.setDelegate(new zl(this, 0));
        ?? view = new View(context);
        view.f24357b = new DecelerateInterpolator();
        view.f24364w = new org.telegram.ui.Cells.t6(view, 23);
        view.f24356a = view.getResources().getDrawable(R.drawable.camera_btn);
        Paint paint2 = new Paint(1);
        view.f24358c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f24360f = iw0.f27519a;
        this.f24074k0 = view;
        f0Var.addView((View) view, w7.x5.e(84, 84, 17));
        view.setDelegate(new im(this, d6Var, container));
        view.setFocusable(true);
        view.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.f24087r0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        f0Var.addView(imageView, w7.x5.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f33382b;

            {
                this.f33382b = this;
            }

            @Override
            public final void onClick(View view2) {
                um umVar;
                um umVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33382b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f24089s0 && (umVar = chatAttachAlertPhotoLayout.P) != null && umVar.isInited()) {
                            chatAttachAlertPhotoLayout.f24058c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24087r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new jm(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (umVar2 = chatAttachAlertPhotoLayout.P) != null && umVar2.isInited() && chatAttachAlertPhotoLayout.f24056b0) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.P.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.T = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.S;
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
                                animatorSet.setInterpolator(is.f27500f);
                                animatorSet.addListener(new ai.z4(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f24093w.M(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i12 = 0; i12 < 2; i12++) {
            this.S[i12] = new ImageView(context);
            this.S[i12].setScaleType(ImageView.ScaleType.CENTER);
            this.S[i12].setVisibility(4);
            this.f24072j0.addView(this.S[i12], w7.x5.e(48, 48, 51));
            this.S[i12].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f33382b;

                {
                    this.f33382b = this;
                }

                @Override
                public final void onClick(View view2) {
                    um umVar;
                    um umVar2;
                    int i102 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33382b;
                    switch (i102) {
                        case 0:
                            if (chatAttachAlertPhotoLayout.P != null) {
                                chatAttachAlertPhotoLayout.j0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.f24089s0 && (umVar = chatAttachAlertPhotoLayout.P) != null && umVar.isInited()) {
                                chatAttachAlertPhotoLayout.f24058c0 = false;
                                chatAttachAlertPhotoLayout.P.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24087r0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new jm(chatAttachAlertPhotoLayout));
                                duration.start();
                                return;
                            }
                            return;
                        case 2:
                            if (!chatAttachAlertPhotoLayout.T && (umVar2 = chatAttachAlertPhotoLayout.P) != null && umVar2.isInited() && chatAttachAlertPhotoLayout.f24056b0) {
                                String currentFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getCurrentFlashMode();
                                String nextFlashMode = chatAttachAlertPhotoLayout.P.getCameraSession().getNextFlashMode();
                                if (!currentFlashMode.equals(nextFlashMode)) {
                                    chatAttachAlertPhotoLayout.P.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                    chatAttachAlertPhotoLayout.T = true;
                                    ImageView[] imageViewArr = chatAttachAlertPhotoLayout.S;
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
                                    animatorSet.setInterpolator(is.f27500f);
                                    animatorSet.addListener(new ai.z4(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            chatAttachAlertPhotoLayout.f24093w.M(null, null);
                            return;
                    }
                }
            });
            this.S[i12].setContentDescription("flash mode " + i12);
        }
        TextView textView3 = new TextView(context);
        this.f24085q0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(org.telegram.ui.Cells.c1.b(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.f24072j0.addView(textView3, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 16.0f, -2, 81));
        km kmVar2 = new km(this, context, d6Var, 0);
        this.f24086r = kmVar2;
        kmVar2.setVerticalScrollBarEnabled(true);
        ym ymVar2 = new ym(this, context, false);
        this.v = ymVar2;
        kmVar2.setAdapter(ymVar2);
        for (int i13 = 0; i13 < 8; i13++) {
            ymVar2.h.add(ymVar2.L());
        }
        kmVar2.setClipToPadding(false);
        kmVar2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        kmVar2.setItemAnimator(null);
        kmVar2.setLayoutAnimation(null);
        kmVar2.setOverScrollMode(2);
        kmVar2.setVisibility(4);
        kmVar2.setAlpha(0.0f);
        container.addView(kmVar2, w7.x5.d(80.0f, -1));
        gg.a0 a0Var = new gg.a0(0, false, 7);
        this.f24088s = a0Var;
        kmVar2.setLayoutManager(a0Var);
        kmVar2.setOnItemClickListener(new o7(1));
    }

    public static org.telegram.ui.Cells.t5 N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        km kmVar = chatAttachAlertPhotoLayout.E;
        int childCount = kmVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = kmVar.getChildAt(i11);
            if (childAt.getTop() < kmVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f30245b.n1() && (childAt instanceof org.telegram.ui.Cells.t5)) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (t5Var.getImageView().getTag() != null && ((Integer) t5Var.getImageView().getTag()).intValue() == i10) {
                    return t5Var;
                }
            }
        }
        return null;
    }

    public static int P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        yi yiVar = chatAttachAlertPhotoLayout.f30245b;
        org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
        if ((m2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) m2Var).R3 == 5) {
            return m2Var.getMessagesController().config.quickReplyMessagesLimit.get() - ((org.telegram.ui.zn) yiVar.f33289f0).f44989u6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static boolean S() {
        HashMap hashMap = f24051s1;
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
            ArrayList arrayList = f24052t1;
            if (i10 >= arrayList.size()) {
                break;
            }
            Object obj = f24051s1.get(arrayList.get(i10));
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
        HashMap hashMap = f24051s1;
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
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.f24084p1;
    }

    public static void o0(ImageView imageView, String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3551:
                if (str.equals("on")) {
                    c10 = 0;
                    break;
                }
                break;
            case 109935:
                if (str.equals("off")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
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
    public final void B() {
        ShutterButton shutterButton = this.f24074k0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.Q0;
        iw0 iw0Var = iw0.f27519a;
        iw0 iw0Var2 = iw0.f27520b;
        if (!z10) {
            if (this.P != null && shutterButton.getState() == iw0Var2) {
                l0();
                CameraController.getInstance().stopVideoRecording(this.P.getCameraSession(), false);
                shutterButton.a(iw0Var);
            }
            if (this.f24056b0) {
                a0(false);
            }
            d0(true);
            return;
        }
        if (this.P != null && shutterButton.getState() == iw0Var2) {
            shutterButton.a(iw0Var);
        }
        this.Q0 = false;
    }

    @Override
    public final void C(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.C(int, int):void");
    }

    @Override
    public final void D() {
        yi yiVar = this.f30245b;
        if (yiVar.isShowing() && !yiVar.isDismissed() && !PhotoViewer.t1().R1()) {
            U(false);
        }
    }

    @Override
    public final void E(int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.E(int):void");
    }

    @Override
    public final boolean F(int i10) {
        if (this.f24056b0) {
            if (i10 == 24 || i10 == 25 || i10 == 79 || i10 == 85) {
                ((im) this.f24074k0.getDelegate()).a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void G(qi qiVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f24082o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f24093w.setVisibility(0);
        boolean z10 = qiVar instanceof hn;
        TextView textView = this.f24095x;
        if (!z10) {
            Z();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(is.f27503j);
            this.f24082o1 = interpolator;
            interpolator.start();
        }
        this.f30245b.f33272a1.setTitle("");
        this.F.h1(0, 0);
        if (z10) {
            this.E.post(new wc(21, this, qiVar));
        }
        V();
        m0();
    }

    @Override
    public final void I() {
        this.N = false;
        um umVar = this.P;
        if (umVar != null) {
            umVar.setVisibility(0);
        }
        if (this.f24091u0) {
            this.f24091u0 = false;
            U(true);
        }
    }

    @Override
    public final void J() {
        this.E.x0(0);
    }

    public final int Q(MediaController.PhotoEntry photoEntry, int i10) {
        boolean z10;
        Integer valueOf = Integer.valueOf(photoEntry.imageId);
        HashMap hashMap = f24051s1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f24052t1;
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
                this.f24069h1.W(i10);
            }
            return indexOf;
        }
        photoEntry.starsAmount = getStarsPrice();
        if (getStarsPrice() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        photoEntry.hasSpoiler = z10;
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
        um umVar = this.P;
        if (umVar != null) {
            if (!this.f24056b0) {
                umVar.setTranslationX(this.U[0]);
            }
            int i10 = this.K0;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2);
            if (!this.f24056b0) {
                this.P.setClipTop((int) this.W);
                this.P.setClipBottom((int) this.f24054a0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                if (layoutParams.height != dp || layoutParams.width != i10) {
                    layoutParams.width = i10;
                    layoutParams.height = dp;
                    this.P.setLayoutParams(layoutParams);
                    AndroidUtilities.runOnUIThread(new wc(22, this, layoutParams));
                }
            }
        }
    }

    public final void U(boolean z10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z11;
        ym ymVar;
        yi yiVar = this.f30245b;
        boolean z12 = yiVar.V;
        org.telegram.ui.ActionBar.m2 m2Var2 = yiVar.f33289f0;
        if (!z12 && this.f24078n) {
            boolean z13 = this.N0;
            boolean z14 = this.O0;
            if (m2Var2 == null) {
                m2Var = LaunchActivity.R();
            } else {
                m2Var = m2Var2;
            }
            if (m2Var != null && m2Var.getParentActivity() != null) {
                if (!SharedConfig.inappCamera) {
                    this.N0 = false;
                } else {
                    if (m2Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.O0 = z11;
                    if (z11) {
                        if (z10) {
                            try {
                                m2Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                            } catch (Exception unused) {
                            }
                        }
                        this.N0 = false;
                    } else {
                        if (z10 || SharedConfig.hasCameraCache) {
                            CameraController.getInstance().initCamera(null);
                        }
                        this.N0 = CameraController.getInstance().isCameraInitied();
                    }
                }
                if ((z13 != this.N0 || z14 != this.O0) && (ymVar = this.G) != null) {
                    ymVar.l();
                }
                if (!yiVar.V && yiVar.isShowing() && this.N0 && yiVar.getBackDrawable().getAlpha() != 0 && !this.f24056b0) {
                    s0();
                }
            }
        }
    }

    public final void V() {
        s4.d1 K;
        float[] fArr;
        int i10;
        float f7;
        int systemWindowInsetTop;
        if (!PhotoViewer.D1() || PhotoViewer.t1().p5 == null || !PhotoViewer.t1().p5.V) {
            um umVar = this.P;
            if (umVar != null) {
                umVar.invalidateOutline();
            }
            km kmVar = this.E;
            s4.d1 K2 = kmVar.K(this.M0 - 1);
            if (K2 != null) {
                K2.f47782a.invalidateOutline();
            }
            if ((!this.G.d || !this.N0 || this.T0 != this.U0) && (K = kmVar.K(0)) != null) {
                K.f47782a.invalidateOutline();
            }
            um umVar2 = this.P;
            if (umVar2 != null) {
                umVar2.invalidate();
            }
            sm smVar = this.R;
            if (smVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) smVar.getLayoutParams();
                if (getRootWindowInsets() == null) {
                    systemWindowInsetTop = AndroidUtilities.dp(16.0f);
                } else {
                    systemWindowInsetTop = getRootWindowInsets().getSystemWindowInsetTop() + AndroidUtilities.dp(2.0f);
                }
                marginLayoutParams.topMargin = systemWindowInsetTop;
            }
            if (!this.N0) {
                return;
            }
            int childCount = kmVar.getChildCount();
            int i11 = 0;
            while (true) {
                fArr = this.U;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = kmVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.m5) {
                    if (childAt.isAttachedToWindow()) {
                        float y3 = getY() + kmVar.getY() + childAt.getY();
                        yi yiVar = this.f30245b;
                        ViewGroup sheetContainer = yiVar.getSheetContainer();
                        bi biVar = yiVar.B1;
                        ci.m6 m6Var = yiVar.R0;
                        float y10 = sheetContainer.getY() + y3;
                        float x10 = (yiVar.getSheetContainer().getX() + (getX() + (kmVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                        if (!yiVar.f33292g0) {
                            i10 = AndroidUtilities.statusBarHeight;
                        } else {
                            i10 = 0;
                        }
                        float alpha = (m6Var.getAlpha() * m6Var.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
                        ci.i iVar = yiVar.E2;
                        if (iVar != null && iVar.g()) {
                            alpha = Math.max(alpha, (yiVar.E2.e() + yiVar.E2.getY()) - yiVar.f33317o2);
                        }
                        if (y3 < alpha) {
                            f7 = alpha - y3;
                        } else {
                            f7 = 0.0f;
                        }
                        if (f7 != this.W) {
                            this.W = f7;
                            um umVar3 = this.P;
                            if (umVar3 != null) {
                                umVar3.invalidateOutline();
                                this.P.invalidate();
                            }
                        }
                        float translationY = (int) (biVar.getTranslationY() + (yiVar.getSheetContainer().getMeasuredHeight() - biVar.getMeasuredHeight()));
                        ci.i iVar2 = yiVar.E2;
                        if (iVar2 != null) {
                            translationY -= iVar2.d() - AndroidUtilities.dp(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y3 > translationY) {
                            this.f24054a0 = Math.min(-AndroidUtilities.dp(5.0f), y3 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.f24054a0 = 0.0f;
                        }
                        fArr[0] = x10;
                        fArr[1] = y10;
                        R();
                        return;
                    }
                } else {
                    i11++;
                }
            }
            if (this.W != 0.0f) {
                this.W = 0.0f;
                um umVar4 = this.P;
                if (umVar4 != null) {
                    umVar4.invalidateOutline();
                    this.P.invalidate();
                }
            }
            fArr[0] = AndroidUtilities.dp(-400.0f);
            fArr[1] = 0.0f;
            R();
        }
    }

    public final boolean W(boolean z10) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            HashMap hashMap = f24051s1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f24052t1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof MediaController.PhotoEntry)) {
                break;
            }
            Q((MediaController.PhotoEntry) obj, -1);
            z11 = true;
        }
        return z11;
    }

    public final boolean X(MediaController.PhotoEntry photoEntry) {
        boolean z10 = this.f24094w0;
        org.telegram.ui.ActionBar.d6 d6Var = this.f30244a;
        yi yiVar = this.f30245b;
        if (!z10 && photoEntry.isVideo) {
            if (!yiVar.c1()) {
                org.telegram.messenger.ai.q(R.string.GlobalAttachVideoRestricted, new ad(yiVar.f33336u1, d6Var), null);
                return true;
            }
        } else if (!this.f24096x0 && !photoEntry.isVideo) {
            if (!yiVar.c1()) {
                org.telegram.messenger.ai.q(R.string.GlobalAttachPhotoRestricted, new ad(yiVar.f33336u1, d6Var), null);
                return true;
            }
        } else {
            return false;
        }
        return true;
    }

    public final void Y() {
        if (this.P0) {
            boolean e02 = e0();
            this.P0 = e02;
            if (!e02) {
                f0();
            }
            this.G.l();
            this.v.l();
        }
    }

    public final void Z() {
        String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
        org.telegram.ui.ActionBar.e1 e1Var = this.Y0;
        e1Var.setText(string);
        e1Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.f30245b.f33282d1.K(1);
        HashMap hashMap = f24051s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((MediaController.PhotoEntry) entry.getValue()).reset();
            }
            hashMap.clear();
            f24052t1.clear();
        }
        ArrayList arrayList = f24050r1;
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
        this.G.l();
        this.v.l();
    }

    @Override
    public final void a(CharSequence charSequence) {
        MediaController.PhotoEntry photoEntry;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = f24052t1;
            if (i10 < arrayList.size()) {
                if (i10 == 0) {
                    Object obj = arrayList.get(i10);
                    HashMap hashMap = f24051s1;
                    Object obj2 = hashMap.get(obj);
                    if (obj2 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry clone = ((MediaController.PhotoEntry) obj2).clone();
                        CharSequence[] charSequenceArr = {charSequence};
                        clone.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                        clone.caption = charSequenceArr[0];
                        photoEntry = clone;
                    } else {
                        boolean z10 = obj2 instanceof MediaController.SearchImage;
                        photoEntry = obj2;
                        if (z10) {
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

    public final void a0(boolean z10) {
        boolean z11;
        um umVar;
        if (!this.f24089s0 && this.P != null) {
            int i10 = this.K0;
            int[] iArr = this.f24064f0;
            iArr[1] = i10;
            iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
            Runnable runnable = this.f24079n0;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.f24079n0 = null;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20766a7, this.f30244a)) > 0.721d) {
                z11 = true;
            } else {
                z11 = false;
            }
            yi yiVar = this.f30245b;
            AndroidUtilities.setLightNavigationBar(yiVar, z11);
            TextView textView = this.f24083p0;
            km kmVar = this.f24086r;
            ai.f0 f0Var = this.f24072j0;
            km kmVar2 = this.E;
            ImageView[] imageViewArr = this.S;
            ja1 ja1Var = this.f24076l0;
            if (z10) {
                this.f24073j1 = this.P.getTranslationY();
                this.f24060d0 = true;
                if (kmVar2 != null) {
                    kmVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(f0Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ja1Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(kmVar, property, 0.0f));
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
                this.f24065f1.lock();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(is.f27500f);
                animatorSet.addListener(new mm(this, 2));
                animatorSet.start();
            } else {
                this.f24071i1 = false;
                yiVar.getWindow().clearFlags(128);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                f0Var.setAlpha(0.0f);
                f0Var.setVisibility(8);
                ja1Var.setAlpha(0.0f);
                ja1Var.setTag(null);
                ja1Var.setVisibility(8);
                kmVar.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                kmVar.setVisibility(8);
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
                this.f24056b0 = false;
                um umVar2 = this.P;
                if (umVar2 != null) {
                    umVar2.setFpsLimit(30);
                    this.P.setSystemUiVisibility(1024);
                }
                if (kmVar2 != null) {
                    kmVar2.invalidate();
                }
            }
            um umVar3 = this.P;
            if (umVar3 != null) {
                umVar3.setImportantForAccessibility(0);
            }
            kmVar2.setImportantForAccessibility(0);
            if (!LiteMode.isEnabled(360928) && (umVar = this.P) != null) {
                umVar.showTexture(false, z10);
            }
        }
    }

    @Override
    public final boolean b() {
        return !this.f24056b0;
    }

    public final MediaController.PhotoEntry b0(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = f24050r1;
        int size = arrayList.size();
        if (i10 < size) {
            return (MediaController.PhotoEntry) arrayList.get(i10);
        }
        int i11 = i10 - size;
        MediaController.AlbumEntry albumEntry = this.T0;
        if (albumEntry == null || i11 >= albumEntry.photos.size()) {
            return null;
        }
        return this.T0.photos.get(i11);
    }

    @Override
    public final boolean c() {
        for (Map.Entry entry : f24051s1.entrySet()) {
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
        boolean z10 = this.f24063e1;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.h6.f20903hg;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f20930j5;
        }
        int i14 = org.telegram.ui.ActionBar.h6.f20806c7;
        org.telegram.ui.ActionBar.d6 d6Var = this.f30244a;
        this.H.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A5, d6Var);
        km kmVar = this.E;
        kmVar.setGlowColor(w02);
        kmVar.K(0);
        this.f24095x.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        if (z10) {
            i11 = org.telegram.ui.ActionBar.h6.f20903hg;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.E8;
        }
        int w03 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        pm pmVar = this.f24093w;
        pmVar.G(w03, false);
        if (z10) {
            i12 = org.telegram.ui.ActionBar.h6.f20903hg;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.E8;
        }
        pmVar.G(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), true);
        if (z10) {
            i13 = org.telegram.ui.ActionBar.h6.f20940jg;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.G8;
        }
        pmVar.B(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        org.telegram.ui.ActionBar.h6.x1(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), this.f24097y);
    }

    public final void d0(boolean z10) {
        if (this.N0 && this.P != null) {
            n0();
            this.Q.g();
            this.P.destroy(z10, null);
            AnimatorSet animatorSet = this.O;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.O = null;
            }
            AndroidUtilities.runOnUIThread(new cm(this, 0), 300L);
            this.f24058c0 = false;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        yi yiVar;
        if (i10 == NotificationCenter.albumsDidLoad) {
            ym ymVar = this.G;
            if (ymVar != null) {
                if (q0()) {
                    this.U0 = MediaController.allMediaAlbumEntry;
                } else {
                    this.U0 = MediaController.allPhotosAlbumEntry;
                }
                if (this.T0 != null && ((yiVar = this.f30245b) == null || !yiVar.G)) {
                    if (q0()) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= MediaController.allMediaAlbums.size()) {
                                break;
                            }
                            MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                            int i13 = albumEntry.bucketId;
                            MediaController.AlbumEntry albumEntry2 = this.T0;
                            if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                                this.T0 = albumEntry;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    this.T0 = this.U0;
                }
                this.X0 = false;
                this.H.c();
                ymVar.l();
                this.v.l();
                ArrayList arrayList = f24052t1;
                if (!arrayList.isEmpty() && this.U0 != null) {
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        Integer num = (Integer) arrayList.get(i14);
                        HashMap hashMap = f24051s1;
                        Object obj = hashMap.get(num);
                        MediaController.PhotoEntry photoEntry = this.U0.photosByIds.get(num.intValue());
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
            findActivity = this.f30245b.f33289f0.getParentActivity();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (findActivity != null) {
            if (i10 < 33 || (findActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && findActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
                if (i10 >= 33 || findActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
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
        MediaController.AlbumEntry albumEntry = this.T0;
        ArrayList<Object> arrayList = f24050r1;
        if (albumEntry != null) {
            if (!arrayList.isEmpty()) {
                ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.T0.photos.size());
                arrayList2.addAll(arrayList);
                arrayList2.addAll(this.T0.photos);
                return arrayList2;
            }
            return this.T0.photos;
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
        return this.f24062e0;
    }

    @Override
    public int getCurrentItemTop() {
        km kmVar = this.E;
        int childCount = kmVar.getChildCount();
        d00 d00Var = this.H;
        if (childCount <= 0) {
            kmVar.setTopGlowOffset(kmVar.getPaddingTop());
            d00Var.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = kmVar.getChildAt(0);
        bm0 bm0Var = (bm0) kmVar.G(childAt);
        int top = childAt.getTop() - this.f24084p1;
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || bm0Var == null || bm0Var.b() != 0) {
            top = dp;
        }
        d00Var.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - d00Var.getMeasuredHeight()) / 2.0f) + top);
        kmVar.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.E.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return f24052t1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f24051s1;
    }

    public int getSelectedPhotosCount() {
        int i10 = 0;
        for (Object obj : f24051s1.values()) {
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
        for (Object obj : f24051s1.values()) {
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
        return f24052t1;
    }

    public long getStarsPrice() {
        Iterator it = f24051s1.entrySet().iterator();
        if (it.hasNext()) {
            return ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).starsAmount;
        }
        return 0L;
    }

    public final void h0(boolean z10) {
        um umVar;
        if (this.P != null && this.O == null) {
            yi yiVar = this.f30245b;
            if (!yiVar.isDismissed()) {
                this.P.initTexture();
                boolean q02 = q0();
                TextView textView = this.f24085q0;
                int i10 = 0;
                if (q02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f24050r1.isEmpty();
                km kmVar = this.f24086r;
                TextView textView2 = this.f24083p0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    kmVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    kmVar.setVisibility(0);
                }
                if (yiVar.o1().v && isFocusable()) {
                    yiVar.o1().d();
                }
                ja1 ja1Var = this.f24076l0;
                ja1Var.setVisibility(0);
                ja1Var.setAlpha(0.0f);
                ai.f0 f0Var = this.f24072j0;
                f0Var.setVisibility(0);
                f0Var.setTag(null);
                int[] iArr = this.f24064f0;
                iArr[0] = 0;
                int i11 = this.K0;
                iArr[1] = i11;
                iArr[2] = AndroidUtilities.dp(2.0f) + (i11 * 2);
                this.f24073j1 = 0.0f;
                this.f24071i1 = true;
                um umVar2 = this.P;
                if (umVar2 != null) {
                    umVar2.setFpsLimit(-1);
                }
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.setLightNavigationBar((Dialog) yiVar, false);
                yiVar.getWindow().addFlags(128);
                km kmVar2 = this.E;
                ImageView[] imageViewArr = this.S;
                if (z10) {
                    setCameraOpenProgress(0.0f);
                    this.f24060d0 = true;
                    if (kmVar2 != null) {
                        kmVar2.invalidate();
                    }
                    this.f24065f1.lock();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(f0Var, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kmVar, property, 1.0f));
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
                    animatorSet.setInterpolator(is.f27500f);
                    animatorSet.addListener(new mm(this, 1));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    f0Var.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    kmVar.setAlpha(1.0f);
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
                    yiVar.f33280c2.P0();
                    um umVar3 = this.P;
                    if (umVar3 != null) {
                        umVar3.setSystemUiVisibility(1028);
                    }
                }
                this.f24056b0 = true;
                um umVar4 = this.P;
                if (umVar4 != null) {
                    umVar4.setImportantForAccessibility(2);
                }
                kmVar2.setImportantForAccessibility(4);
                kmVar2.invalidate();
                if (!LiteMode.isEnabled(360928) && (umVar = this.P) != null && umVar.isInited()) {
                    this.P.showTexture(true, z10);
                }
            }
        }
    }

    @Override
    public final int i() {
        return 1;
    }

    public final void i0() {
        if (SharedConfig.inappCamera) {
            h0(true);
            return;
        }
        yi yiVar = this.f30245b;
        wi wiVar = yiVar.f33280c2;
        if (wiVar != null) {
            wiVar.I1(0, false, true, 0, 0, 0L, yiVar.u1(), false, 0L);
        }
    }

    public final void j0(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        int i10;
        org.telegram.ui.zn znVar;
        org.telegram.ui.zn znVar2;
        ArrayList<Object> arrayList;
        int i11;
        ArrayList arrayList2 = f24050r1;
        yi yiVar = this.f30245b;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            f24051s1.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            f24052t1.add(Integer.valueOf(photoEntry.imageId));
            yiVar.Z1(0);
            this.G.l();
            this.v.l();
        }
        if (photoEntry != null && !z11 && arrayList2.size() > 1) {
            y0(false);
            if (this.P != null) {
                this.f24076l0.b(0.0f, false);
                this.B0 = 0.0f;
                this.P.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f24090t0 = true;
            org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
            org.telegram.ui.ActionBar.m2 m2Var2 = yiVar.f33289f0;
            if (m2Var == null) {
                m2Var = LaunchActivity.R();
            }
            if (m2Var != null) {
                PhotoViewer.t1().K2(m2Var.getParentActivity(), null, this.f30244a);
                PhotoViewer.t1().L2(yiVar);
                PhotoViewer t12 = PhotoViewer.t1();
                int i12 = yiVar.V1;
                boolean z12 = yiVar.W1;
                t12.h = i12;
                t12.f34042n = z12;
                if (yiVar.F && yiVar.G) {
                    znVar = (org.telegram.ui.zn) m2Var2;
                    i10 = 11;
                } else {
                    if (yiVar.T0 != 0) {
                        i10 = 1;
                    } else if (m2Var2 instanceof org.telegram.ui.zn) {
                        znVar = (org.telegram.ui.zn) m2Var2;
                        i10 = 2;
                    } else {
                        i10 = 5;
                    }
                    znVar = null;
                }
                boolean z13 = yiVar.H;
                if (z13) {
                    i10 = 13;
                    znVar2 = null;
                } else {
                    znVar2 = znVar;
                }
                int i13 = i10;
                if (yiVar.T0 == 0 && !z13) {
                    arrayList = getAllPhotosArray();
                    i11 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(photoEntry);
                    i11 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                l50 l50Var = yiVar.Q;
                if (l50Var != null && photoEntry != null) {
                    l50Var.f28205e = photoEntry.isVideo;
                }
                PhotoViewer.t1().g2(arrayList3, i11, i13, false, new lm(this, z10), znVar2);
                PhotoViewer.t1().x2(yiVar.Q);
                if (yiVar.G) {
                    PhotoViewer.t1().Y0(null, null, false, yiVar.J);
                    PhotoViewer.t1().m2();
                }
            }
        }
    }

    @Override
    public final void k() {
        V();
        invalidate();
    }

    public final void k0() {
        try {
            if (this.P != null) {
                CameraController.getInstance().stopPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void l(float f7) {
        this.W0 = f7;
        V();
        um umVar = this.P;
        if (umVar != null) {
            umVar.invalidateOutline();
            this.P.invalidate();
        }
        invalidate();
    }

    public final void l0() {
        if (this.f30245b.V) {
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.S[i10].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(is.f27500f).start();
        }
        ViewPropertyAnimator duration = this.f24087r0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        is isVar = is.f27500f;
        duration.setInterpolator(isVar).start();
        this.f24085q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(isVar).start();
        AndroidUtilities.updateViewVisibilityAnimated(this.R, false);
        AndroidUtilities.cancelRunOnUIThread(this.f24068h0);
        this.f24068h0 = null;
        AndroidUtilities.unlockOrientation(AndroidUtilities.findActivity(getContext()));
    }

    public final void m0() {
        try {
            U(false);
            if (this.P != null) {
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void n0() {
        if (this.f24058c0) {
            try {
                Bitmap bitmap = this.P.getTextureView().getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.P.getMatrix(), true);
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
    public final boolean o(MotionEvent motionEvent) {
        um umVar;
        if (!this.f24060d0) {
            if (this.f24056b0 && motionEvent != null) {
                boolean z10 = this.G0;
                ja1 ja1Var = this.f24076l0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.E0;
                    ja1Var.getHitRect(rect);
                    if (ja1Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f24089s0 && !this.I0) {
                            if (motionEvent.getPointerCount() == 2) {
                                this.A0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                this.C0 = true;
                            } else {
                                this.H0 = true;
                                this.F0 = motionEvent.getY();
                                this.C0 = false;
                            }
                            this.D0 = false;
                            this.G0 = true;
                            return true;
                        }
                    }
                } else if (this.G0) {
                    int actionMasked = motionEvent.getActionMasked();
                    km kmVar = this.f24086r;
                    TextView textView = this.f24083p0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.S;
                    ai.f0 f0Var = this.f24072j0;
                    if (actionMasked == 2) {
                        if (this.C0 && motionEvent.getPointerCount() == 2 && !this.I0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (!this.D0) {
                                if (Math.abs(hypot - this.A0) >= AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.A0 = hypot;
                                    this.D0 = true;
                                    return true;
                                }
                            } else if (this.P != null) {
                                this.A0 = hypot;
                                float dp = this.B0 + ((hypot - this.A0) / AndroidUtilities.dp(100.0f));
                                this.B0 = dp;
                                if (dp < 0.0f) {
                                    this.B0 = 0.0f;
                                } else if (dp > 1.0f) {
                                    this.B0 = 1.0f;
                                }
                                ja1Var.b(this.B0, false);
                                this.f30245b.getSheetContainer().invalidate();
                                this.P.setZoom(this.B0);
                                t0(true);
                                return true;
                            }
                        } else {
                            float y3 = motionEvent.getY();
                            float f7 = y3 - this.F0;
                            if (this.H0) {
                                if (Math.abs(f7) > AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.H0 = false;
                                    this.I0 = true;
                                    return true;
                                }
                            } else if (this.I0 && (umVar = this.P) != null) {
                                umVar.setTranslationY(umVar.getTranslationY() + f7);
                                this.F0 = y3;
                                ja1Var.setTag(null);
                                Runnable runnable = this.f24079n0;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.f24079n0 = null;
                                }
                                if (f0Var.getTag() == null) {
                                    f0Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(f0Var, property, 0.0f), ObjectAnimator.ofFloat(ja1Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(kmVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(is.f27500f);
                                    animatorSet.start();
                                    return true;
                                }
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                        this.G0 = false;
                        this.C0 = false;
                        if (this.I0) {
                            this.I0 = false;
                            um umVar2 = this.P;
                            if (umVar2 != null) {
                                if (Math.abs(umVar2.getTranslationY()) > this.P.getMeasuredHeight() / 6.0f) {
                                    a0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.P, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(f0Var, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(kmVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f24070i0);
                                animatorSet2.start();
                                f0Var.setTag(null);
                                return true;
                            }
                        } else {
                            um umVar3 = this.P;
                            if (umVar3 != null && !this.D0) {
                                int[] iArr = this.V;
                                umVar3.getLocationOnScreen(iArr);
                                this.P.focusToPoint((int) (motionEvent.getRawX() - iArr[0]), (int) (motionEvent.getRawY() - iArr[1]));
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.S0 != i14) {
            this.S0 = i14;
            ym ymVar = this.G;
            if (ymVar != null) {
                ymVar.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        V();
    }

    @Override
    public final void p() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.cameraInitied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
    }

    public final void p0(int i10, final boolean z10) {
        PhotoViewer t12 = PhotoViewer.t1();
        if (i10 == -1) {
            i10 = t12.P4;
        }
        ArrayList arrayList = t12.f33990g7;
        if (arrayList != null && !arrayList.isEmpty() && i10 < arrayList.size() && (arrayList.get(i10) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) arrayList.get(i10)).hasSpoiler) {
            final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
            this.E.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z11 = ChatAttachAlertPhotoLayout.f24049q1;
                    if (view instanceof org.telegram.ui.Cells.t5) {
                        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                        if (t5Var.getPhotoEntry() == photoEntry) {
                            t5Var.c(z10, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z12 = true;
                            if (ChatAttachAlertPhotoLayout.f24051s1.size() <= 1) {
                                z12 = false;
                            }
                            t5Var.f(starsPrice, z12);
                        }
                    }
                }
            });
        }
    }

    @Override
    public final boolean q() {
        if (this.f24060d0) {
            return true;
        }
        if (this.f24056b0) {
            a0(true);
            return true;
        }
        d0(true);
        return false;
    }

    public final boolean q0() {
        if (!this.f24098y0) {
            yi yiVar = this.f30245b;
            if (!yiVar.F) {
                if (!(yiVar.f33289f0 instanceof org.telegram.ui.zn) && !yiVar.W0 && yiVar.T0 != 2) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void r(int i10) {
        boolean z10;
        if (i10 != 0 && i10 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        d0(z10);
    }

    public final void r0(i9 i9Var, TLRPC.VideoSize videoSize, long j3) {
        boolean z10;
        yi yiVar = this.f30245b;
        g9 g9Var = new g9(yiVar.U, yiVar.Q);
        l50 l50Var = yiVar.Q;
        if (l50Var != null && l50Var.f28204c == 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        g9Var.Q = z10;
        yiVar.f33289f0.presentFragment(g9Var);
        if (i9Var != null) {
            g9Var.m0(i9Var);
        }
        if (videoSize != null) {
            g9Var.l0(videoSize);
        }
        if (j3 != 0) {
            g9Var.k0(j3);
        }
        g9Var.I = new y2(6, this, g9Var);
    }

    @Override
    public final void requestLayout() {
        if (this.R0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0() {
        boolean z10;
        boolean z11;
        float f7;
        yi yiVar = this.f30245b;
        if (!yiVar.f33300i2 && this.f24092v0 && CameraView.isCameraAllowed()) {
            if (this.P == null) {
                boolean z12 = !LiteMode.isEnabled(360928);
                Context context = getContext();
                Boolean bool = this.f24081o0;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = yiVar.X1;
                }
                um umVar = new um(this, context, z10, z12);
                this.P = umVar;
                org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
                if ((m2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) m2Var).v()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                umVar.setRecordFile(AndroidUtilities.generateVideoPath(z11));
                this.P.setFocusable(true);
                this.P.setFpsLimit(30);
                this.P.setOutlineProvider(new ch.b(this, 1));
                this.P.setClipToOutline(true);
                this.P.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                org.telegram.ui.ActionBar.c3 container = yiVar.getContainer();
                um umVar2 = this.P;
                int i10 = this.K0;
                container.addView(umVar2, 1, new FrameLayout.LayoutParams(i10, i10));
                this.P.setDelegate(new nm(this));
                um umVar3 = this.P;
                if (this.f24092v0) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.2f;
                }
                umVar3.setAlpha(f7);
                this.P.setEnabled(this.f24092v0);
                if (this.N) {
                    this.P.setVisibility(8);
                }
                if (!this.f24056b0) {
                    V();
                }
                km kmVar = this.E;
                if (kmVar != null) {
                    kmVar.invalidate();
                }
                invalidate();
            }
            ja1 ja1Var = this.f24076l0;
            if (ja1Var != null) {
                ja1Var.b(0.0f, false);
                this.B0 = 0.0f;
            }
            if (!this.f24056b0) {
                this.P.setTranslationX(this.U[0]);
            }
        }
    }

    public void setCameraOpenProgress(float f7) {
        int i10;
        int i11;
        if (this.P == null) {
            return;
        }
        this.f24062e0 = f7;
        int[] iArr = this.f24064f0;
        float f10 = iArr[1];
        float f11 = iArr[2];
        int i12 = AndroidUtilities.displaySize.x;
        yi yiVar = this.f30245b;
        float width = (yiVar.getContainer().getWidth() - yiVar.getLeftInset()) - yiVar.getRightInset();
        float height = yiVar.getContainer().getHeight();
        float[] fArr = this.U;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = this.f24073j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
        float textureHeight = this.P.getTextureHeight(f10, f11) / this.P.getTextureHeight(width, height);
        float f15 = f11 / height;
        float f16 = f10 / width;
        if (this.f24071i1) {
            i10 = (int) width;
            i11 = (int) height;
            float f17 = 1.0f - f7;
            float f18 = (textureHeight * f17) + f7;
            this.P.getTextureView().setScaleX(f18);
            this.P.getTextureView().setScaleY(f18);
            float f19 = f12 * f17;
            this.P.setTranslationX(((0.0f * f7) + f19) - (((1.0f - ((f16 * f17) + f7)) * width) / 2.0f));
            float f20 = f13 * f17;
            this.P.setTranslationY(((f14 * f7) + f20) - (((1.0f - ((f15 * f17) + f7)) * height) / 2.0f));
            this.f24075k1 = f20 - this.P.getTranslationY();
            this.l1 = (height * f7) + (((f13 + f11) * f17) - this.P.getTranslationY());
            this.f24080n1 = f19 - this.P.getTranslationX();
            this.f24077m1 = (width * f7) + (((f12 + f10) * f17) - this.P.getTranslationX());
        } else {
            i10 = (int) f10;
            i11 = (int) f11;
            this.P.getTextureView().setScaleX(1.0f);
            this.P.getTextureView().setScaleY(1.0f);
            this.f24075k1 = 0.0f;
            this.l1 = height;
            this.f24080n1 = 0.0f;
            this.f24077m1 = width;
            this.P.setTranslationX(f12);
            this.P.setTranslationY(f13);
        }
        if (layoutParams.width != i10 || layoutParams.height != i11) {
            layoutParams.width = i10;
            layoutParams.height = i11;
            this.P.requestLayout();
        }
        this.P.invalidateOutline();
        this.P.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z10) {
        this.f24091u0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.f24098y0 = z10;
    }

    public void setStarsPrice(long j3) {
        boolean z10;
        HashMap hashMap = f24051s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                photoEntry.starsAmount = j3;
                if (j3 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.hasSpoiler = z10;
                photoEntry.isChatPreviewSpoilerRevealed = false;
                photoEntry.isAttachSpoilerRevealed = false;
            }
        }
        E(getSelectedItemsCount());
        if (W(false)) {
            x0();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        yi yiVar = this.f30245b;
        if (yiVar.getSheetAnimationType() == 1) {
            float f10 = (f7 / 40.0f) * (-0.1f);
            km kmVar = this.E;
            int childCount = kmVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = kmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    float f11 = 1.0f + f10;
                    t5Var.getCheckBox().setScaleX(f11);
                    t5Var.getCheckBox().setScaleY(f11);
                }
            }
        }
        super.setTranslationY(f7);
        yiVar.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void t() {
        um umVar = this.P;
        if (umVar != null) {
            umVar.setVisibility(8);
        }
        for (Map.Entry entry : f24051s1.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.G.l();
    }

    public final void t0(boolean z10) {
        Integer num;
        float f7;
        ja1 ja1Var = this.f24076l0;
        if ((ja1Var.getTag() != null && z10) || (ja1Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f24079n0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                cm cmVar = new cm(this, 3);
                this.f24079n0 = cmVar;
                AndroidUtilities.runOnUIThread(cmVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.m0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        ja1Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.m0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(ja1Var, View.ALPHA, f7));
        this.m0.addListener(new mm(this, 0));
        this.m0.start();
        if (z10) {
            cm cmVar2 = new cm(this, 4);
            this.f24079n0 = cmVar2;
            AndroidUtilities.runOnUIThread(cmVar2, 2000L);
        }
    }

    @Override
    public final void u() {
        this.N = true;
        km kmVar = this.E;
        int childCount = kmVar.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (kmVar.getChildAt(i10) instanceof org.telegram.ui.Cells.m5) {
                n0();
                break;
            } else {
                this.Q.g();
                i10++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f24082o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f24095x.animate().alpha(0.0f).setDuration(150L).setInterpolator(is.f27503j).withEndAction(new cm(this, 1));
        this.f24082o1 = withEndAction;
        withEndAction.start();
        k0();
    }

    public final void u0() {
        ArrayList<MediaController.AlbumEntry> arrayList;
        pm pmVar = this.f24093w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pmVar.f21571b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f24092v0) {
            if (q0()) {
                arrayList = MediaController.allMediaAlbums;
            } else {
                arrayList = MediaController.allPhotoAlbums;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.V0 = arrayList2;
            Collections.sort(arrayList2, new fm(arrayList, 0));
        } else {
            this.V0 = new ArrayList();
        }
        boolean isEmpty = this.V0.isEmpty();
        TextView textView = this.f24095x;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f24097y, (Drawable) null);
        int size = this.V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.V0.get(i10);
            ci.a aVar = new ci.a(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.f30244a);
            pmVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ci.m4(this, i10 + 10, 8));
        }
    }

    @Override
    public final void v(float f7) {
        um umVar = this.P;
        if (umVar != null) {
            umVar.setAlpha(f7);
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i10 != 0 && this.P.getVisibility() != 0) {
                this.P.setVisibility(0);
            } else if (i10 == 0 && this.P.getVisibility() != 4) {
                this.P.setVisibility(4);
            }
        }
    }

    public final void v0() {
        km kmVar = this.E;
        if (kmVar != null) {
            for (int i10 = 0; i10 < kmVar.getChildCount(); i10++) {
                View childAt = kmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    ((org.telegram.ui.Cells.t5) childAt).f23076a.invalidate();
                }
            }
        }
    }

    @Override
    public final void w(int i10) {
        TLRPC.Chat m12;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        yi yiVar = this.f30245b;
        if (i10 == 8) {
            yiVar.K1(!yiVar.f33278c0, true);
            this.f24061d1.a(!yiVar.f33278c0, true);
        } else if ((i10 == 0 || i10 == 1) && yiVar.V1 > 0 && f24052t1.size() > 1 && (m12 = yiVar.m1()) != null && !ChatObject.hasAdminRights(m12) && m12.slowmode_enabled) {
            g5.N(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.f30244a).o();
        } else {
            org.telegram.ui.ActionBar.d6 d6Var = this.f30244a;
            HashMap hashMap = f24051s1;
            if (i10 == 0) {
                MessageObject messageObject = yiVar.K1;
                org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
                if (messageObject == null && (m2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) m2Var).c()) {
                    g5.L(getContext(), ((org.telegram.ui.zn) m2Var).a(), new zl(this, 1), d6Var);
                } else {
                    g5.Z(yiVar.M1, yiVar.l1() + hashMap.size(), yiVar.p1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f24624b;

                        {
                            this.f24624b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24624b;
                            Long l4 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f24049q1;
                                    yi yiVar2 = chatAttachAlertPhotoLayout.f30245b;
                                    yiVar2.a1();
                                    yiVar2.f33280c2.I1(7, false, true, 0, 0, 0L, yiVar2.u1(), false, l4.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f24049q1;
                                    yi yiVar3 = chatAttachAlertPhotoLayout.f30245b;
                                    yiVar3.a1();
                                    yiVar3.f33280c2.I1(4, true, true, 0, 0, 0L, yiVar3.u1(), false, l4.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i10 == 1) {
                MessageObject messageObject2 = yiVar.K1;
                org.telegram.ui.ActionBar.m2 m2Var2 = yiVar.f33289f0;
                if (messageObject2 == null && (m2Var2 instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) m2Var2).c()) {
                    g5.L(getContext(), ((org.telegram.ui.zn) m2Var2).a(), new zl(this, 2), d6Var);
                } else {
                    g5.Z(yiVar.M1, yiVar.l1() + hashMap.size(), yiVar.p1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f24624b;

                        {
                            this.f24624b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f24624b;
                            Long l4 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f24049q1;
                                    yi yiVar2 = chatAttachAlertPhotoLayout.f30245b;
                                    yiVar2.a1();
                                    yiVar2.f33280c2.I1(7, false, true, 0, 0, 0L, yiVar2.u1(), false, l4.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f24049q1;
                                    yi yiVar3 = chatAttachAlertPhotoLayout.f30245b;
                                    yiVar3.a1();
                                    yiVar3.f33280c2.I1(4, true, true, 0, 0, 0L, yiVar3.u1(), false, l4.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                ym ymVar = this.G;
                km kmVar = this.E;
                if (i10 == 3) {
                    hn hnVar = yiVar.f33321q0;
                    if (hnVar != null) {
                        hnVar.N();
                    }
                    Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).hasSpoiler) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    final boolean z13 = !z11;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout f25041b;

                        {
                            this.f25041b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z14 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25041b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f24049q1;
                                    yi yiVar2 = chatAttachAlertPhotoLayout.f30245b;
                                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.Y0;
                                    if (z14) {
                                        i11 = R.string.DisablePhotoSpoiler;
                                    } else {
                                        i11 = R.string.EnablePhotoSpoiler;
                                    }
                                    e1Var.setText(LocaleController.getString(i11));
                                    if (z14) {
                                        e1Var.setIcon(R.drawable.msg_spoiler_off);
                                    } else {
                                        e1Var.setAnimatedIcon(R.raw.photo_spoiler);
                                    }
                                    if (z14) {
                                        yiVar2.f33282d1.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            yiVar2.f33282d1.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    yiVar2.f33282d1.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        yiVar2.f33282d1.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.e1 e1Var2 = chatAttachAlertPhotoLayout.f24055a1;
                                    if (z14) {
                                        i12 = R.string.SendInStandardQuality;
                                    } else {
                                        i12 = R.string.SendInHighQuality;
                                    }
                                    e1Var2.setText(LocaleController.getString(i12));
                                    if (z14) {
                                        e1Var2.setIcon(R.drawable.menu_quality_sd);
                                        return;
                                    } else {
                                        e1Var2.setIcon(R.drawable.menu_quality_hd);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (entry.getValue() instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                            photoEntry.hasSpoiler = z13;
                            photoEntry.isChatPreviewSpoilerRevealed = false;
                            photoEntry.isAttachSpoilerRevealed = false;
                            arrayList.add(Integer.valueOf(photoEntry.imageId));
                        }
                    }
                    kmVar.M(new dm(0, arrayList, z13));
                    if (yiVar.B0 != this) {
                        ymVar.l();
                    }
                    hn hnVar2 = yiVar.f33321q0;
                    if (hnVar2 != null) {
                        hnVar2.v.invalidate();
                    }
                } else if (i10 == 2) {
                    hn hnVar3 = yiVar.f33321q0;
                    if (hnVar3 != null) {
                        hnVar3.N();
                    }
                    Iterator it2 = hashMap.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((MediaController.PhotoEntry) ((Map.Entry) it2.next()).getValue()).isHighQuality()) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    final boolean z14 = !z10;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout f25041b;

                        {
                            this.f25041b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z142 = z14;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25041b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f24049q1;
                                    yi yiVar2 = chatAttachAlertPhotoLayout.f30245b;
                                    org.telegram.ui.ActionBar.e1 e1Var = chatAttachAlertPhotoLayout.Y0;
                                    if (z142) {
                                        i11 = R.string.DisablePhotoSpoiler;
                                    } else {
                                        i11 = R.string.EnablePhotoSpoiler;
                                    }
                                    e1Var.setText(LocaleController.getString(i11));
                                    if (z142) {
                                        e1Var.setIcon(R.drawable.msg_spoiler_off);
                                    } else {
                                        e1Var.setAnimatedIcon(R.raw.photo_spoiler);
                                    }
                                    if (z142) {
                                        yiVar2.f33282d1.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            yiVar2.f33282d1.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    yiVar2.f33282d1.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        yiVar2.f33282d1.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.e1 e1Var2 = chatAttachAlertPhotoLayout.f24055a1;
                                    if (z142) {
                                        i12 = R.string.SendInStandardQuality;
                                    } else {
                                        i12 = R.string.SendInHighQuality;
                                    }
                                    e1Var2.setText(LocaleController.getString(i12));
                                    if (z142) {
                                        e1Var2.setIcon(R.drawable.menu_quality_sd);
                                        return;
                                    } else {
                                        e1Var2.setIcon(R.drawable.menu_quality_hd);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        if (entry2.getValue() instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) entry2.getValue();
                            photoEntry2.highQuality = Boolean.valueOf(z14);
                            photoEntry2.isChatPreviewSpoilerRevealed = false;
                            photoEntry2.isAttachSpoilerRevealed = false;
                            arrayList2.add(Integer.valueOf(photoEntry2.imageId));
                        }
                    }
                    kmVar.M(new dm(1, arrayList2, z14));
                    if (yiVar.B0 != this) {
                        ymVar.l();
                    }
                    hn hnVar4 = yiVar.f33321q0;
                    if (hnVar4 != null) {
                        hnVar4.v.invalidate();
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
                            int i11 = yiVar.T0;
                            org.telegram.ui.ActionBar.m2 m2Var3 = yiVar.f33289f0;
                            if (i11 != 0) {
                                m2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                m2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i12 = yiVar.T0;
                            org.telegram.ui.ActionBar.m2 m2Var4 = yiVar.f33289f0;
                            if (i12 != 0) {
                                m2Var4.startActivityForResult(intent3, 14);
                            } else {
                                m2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        yiVar.dismiss(true);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else if (i10 == 7) {
                    if (yiVar.B0 == yiVar.f33321q0) {
                        z12 = false;
                    }
                    yiVar.d2(z12);
                } else if (i10 == 9) {
                    yh.p7.h1(getContext(), getStarsPrice(), true, new d(this, 6), this.f30244a);
                } else if (i10 >= 10) {
                    MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.V0.get(i10 - 10);
                    this.T0 = albumEntry;
                    MediaController.AlbumEntry albumEntry2 = this.U0;
                    TextView textView = this.f24095x;
                    if (albumEntry == albumEntry2) {
                        textView.setText(LocaleController.getString(R.string.ChatGallery));
                    } else {
                        textView.setText(albumEntry.bucketName);
                    }
                    ymVar.l();
                    this.v.l();
                    this.F.h1(0, -(kmVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void w0() {
        ArrayList arrayList;
        if (this.f30245b.f33289f0 instanceof org.telegram.ui.zn) {
            km kmVar = this.E;
            int childCount = kmVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f24052t1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = kmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    MediaController.PhotoEntry b02 = b0(((Integer) t5Var.getTag()).intValue());
                    if (b02 != null) {
                        t5Var.setNum(arrayList.indexOf(Integer.valueOf(b02.imageId)));
                    }
                }
                i10++;
            }
            km kmVar2 = this.f24086r;
            int childCount2 = kmVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = kmVar2.getChildAt(i11);
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
        boolean z10;
        yi yiVar = this.f30245b;
        if (yiVar != null && (yiVar.f33289f0 instanceof org.telegram.ui.zn)) {
            z10 = true;
        } else {
            z10 = false;
        }
        U(z10);
    }

    public final void x0() {
        ArrayList arrayList;
        ym ymVar;
        HashMap hashMap;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        yi yiVar = this.f30245b;
        org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
        org.telegram.ui.ActionBar.m2 m2Var2 = yiVar.f33289f0;
        if (m2Var instanceof org.telegram.ui.zn) {
            km kmVar = this.E;
            int childCount = kmVar.getChildCount();
            int i11 = 0;
            while (true) {
                arrayList = f24052t1;
                ymVar = this.G;
                hashMap = f24051s1;
                int i12 = -1;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = kmVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (ymVar.f33410f && R > this.M0) {
                        R--;
                    }
                    if (ymVar.d && this.T0 == this.U0) {
                        R--;
                    }
                    MediaController.PhotoEntry b02 = b0(R);
                    if (b02 != null && b02.hasSpoiler) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    t5Var.setHasSpoiler(z14);
                    if (b02 != null && b02.isHighQuality()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    t5Var.setHighQuality(z15);
                    if ((m2Var2 instanceof org.telegram.ui.zn) && yiVar.W1) {
                        if (b02 != null) {
                            i12 = arrayList.indexOf(Integer.valueOf(b02.imageId));
                        }
                        if (b02 != null && hashMap.containsKey(Integer.valueOf(b02.imageId))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        t5Var.b(i12, z17, true);
                    } else {
                        if (b02 != null && hashMap.containsKey(Integer.valueOf(b02.imageId))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        t5Var.b(-1, z16, true);
                    }
                }
                i11++;
            }
            km kmVar2 = this.f24086r;
            int childCount2 = kmVar2.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = kmVar2.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (ymVar.f33410f && R2 > this.M0) {
                        R2--;
                    }
                    if (ymVar.d && this.T0 == this.U0) {
                        R2--;
                    }
                    MediaController.PhotoEntry b03 = b0(R2);
                    if (b03 != null && b03.hasSpoiler) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t5Var2.setHasSpoiler(z10);
                    if (b03 != null && b03.isHighQuality()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t5Var2.setHighQuality(z11);
                    if ((m2Var2 instanceof org.telegram.ui.zn) && yiVar.W1) {
                        if (b03 != null) {
                            i10 = arrayList.indexOf(Integer.valueOf(b03.imageId));
                        } else {
                            i10 = -1;
                        }
                        if (b03 != null && hashMap.containsKey(Integer.valueOf(b03.imageId))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        t5Var2.b(i10, z13, true);
                    } else {
                        if (b03 != null && hashMap.containsKey(Integer.valueOf(b03.imageId))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        t5Var2.b(-1, z12, true);
                    }
                }
            }
        }
    }

    public final void y0(boolean z10) {
        boolean z11;
        TextView textView = this.f24083p0;
        if (textView != null) {
            yi yiVar = this.f30245b;
            int i10 = yiVar.T0;
            TextView textView2 = yiVar.f33309m1;
            if (i10 == 0 && !yiVar.W0 && !yiVar.H) {
                HashMap hashMap = f24051s1;
                Iterator it = hashMap.entrySet().iterator();
                int i11 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    z11 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).isVideo) {
                        z12 = true;
                    } else {
                        z13 = true;
                    }
                    if (z12 && z13) {
                        break;
                    }
                }
                int max = Math.max(1, hashMap.size());
                if (z12 && z13) {
                    textView.setText(LocaleController.formatPluralString("Media", hashMap.size(), new Object[0]).toUpperCase());
                    if (max != this.M || z10) {
                        textView2.setText(LocaleController.formatPluralString("MediaSelected", max, new Object[0]));
                    }
                } else if (z12) {
                    textView.setText(LocaleController.formatPluralString("Videos", hashMap.size(), new Object[0]).toUpperCase());
                    if (max != this.M || z10) {
                        textView2.setText(LocaleController.formatPluralString("VideosSelected", max, new Object[0]));
                    }
                } else {
                    textView.setText(LocaleController.formatPluralString("Photos", hashMap.size(), new Object[0]).toUpperCase());
                    if (max != this.M || z10) {
                        textView2.setText(LocaleController.formatPluralString("PhotosSelected", max, new Object[0]));
                    }
                }
                if (max <= 1) {
                    z11 = false;
                }
                yiVar.M = z11;
                yiVar.f33319p1.setVisibility((!z11 || yiVar.T0 == 2) ? 8 : 8);
                this.M = max;
            }
        }
    }

    @Override
    public final void z(int i10, boolean z10) {
        V();
        um umVar = this.P;
        if (umVar != null) {
            umVar.invalidateOutline();
            this.P.invalidate();
        }
    }
}
