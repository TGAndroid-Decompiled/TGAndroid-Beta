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
public class ChatAttachAlertPhotoLayout extends fi implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f26252m1;
    public static final ArrayList f26253n1 = new ArrayList();
    public static final HashMap f26254o1 = new HashMap();
    public static final ArrayList f26255p1 = new ArrayList();
    public static int f26256q1 = -1;
    public final ol A;
    public final Rect A0;
    public final mh.k B;
    public float B0;
    public final cm C;
    public boolean C0;
    public final hz D;
    public boolean D0;
    public final ll0 E;
    public boolean E0;
    public int F;
    public boolean F0;
    public boolean G;
    public int G0;
    public int H;
    public int H0;
    public int I;
    public int I0;
    public boolean J;
    public boolean J0;
    public AnimatorSet K;
    public boolean K0;
    public yl L;
    public boolean L0;
    public final zl M;
    public boolean M0;
    public final wl N;
    public boolean N0;
    public final ImageView[] O;
    public int O0;
    public boolean P;
    public MediaController.AlbumEntry P0;
    public final float[] Q;
    public MediaController.AlbumEntry Q0;
    public final int[] R;
    public ArrayList R0;
    public float S;
    public float S0;
    public float T;
    public boolean T0;
    public boolean U;
    public final org.telegram.ui.ActionBar.g1 U0;
    public boolean V;
    public final org.telegram.ui.ActionBar.g1 V0;
    public boolean W;
    public final org.telegram.ui.ActionBar.g1 W0;
    public final org.telegram.ui.ActionBar.g1 X0;
    public final org.telegram.ui.ActionBar.g1 Y0;
    public final qb0 Z0;
    public float f26257a0;
    public final boolean f26258a1;
    public final int[] f26259b0;
    public final AnimationNotificationsLocker f26260b1;
    public int f26261c0;
    public boolean f26262c1;
    public ll f26263d0;
    public final sl f26264d1;
    public final DecelerateInterpolator f26265e0;
    public boolean f26266e1;
    public final bg.x2 f26267f0;
    public float f26268f1;
    public final ShutterButton f26269g0;
    public float f26270g1;
    public final u81 f26271h0;
    public float f26272h1;
    public AnimatorSet f26273i0;
    public float f26274i1;
    public Runnable f26275j0;
    public float f26276j1;
    public Boolean f26277k0;
    public ViewPropertyAnimator f26278k1;
    public final TextView f26279l0;
    public int l1;
    public final TextView m0;
    public final boolean f26280n;
    public final ImageView f26281n0;
    public boolean f26282o0;
    public boolean f26283p0;
    public boolean f26284q0;
    public final ol f26285r;
    public boolean f26286r0;
    public final org.telegram.ui.k f26287s;
    public boolean f26288s0;
    public boolean f26289t0;
    public boolean f26290u0;
    public final cm v;
    public boolean f26291v0;
    public final tl f26292w;
    public float f26293w0;
    public final TextView f26294x;
    public float f26295x0;
    public final Drawable f26296y;
    public boolean f26297y0;
    public boolean f26298z0;

    public ChatAttachAlertPhotoLayout(ni niVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, niVar);
        boolean z12;
        this.O = new ImageView[2];
        this.Q = new float[2];
        this.R = new int[2];
        this.f26259b0 = new int[5];
        this.f26265e0 = new DecelerateInterpolator(1.5f);
        this.f26277k0 = null;
        this.A0 = new Rect();
        int dp = AndroidUtilities.dp(80.0f);
        this.G0 = dp;
        this.H0 = dp;
        this.I0 = 3;
        this.T0 = true;
        this.f26260b1 = new AnimationNotificationsLocker();
        this.f26264d1 = new sl(this);
        this.f26258a1 = z10;
        this.f26280n = z11;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        org.telegram.ui.ActionBar.d3 container = niVar.getContainer();
        ni niVar2 = this.f28403b;
        if (niVar2.M0 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f26262c1 = z12;
        tl tlVar = new tl(this, context, niVar2.T0.n(), c6Var, 0);
        this.f26292w = tlVar;
        tlVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = i7.f6.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = AndroidUtilities.statusBarHeight;
        this.f28403b.T0.addView(tlVar, 0, d);
        tlVar.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f27502b;

            {
                this.f27502b = this;
            }

            @Override
            public final void onClick(View view) {
                yl ylVar;
                yl ylVar2;
                int i10 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27502b;
                switch (i10) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.L != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f26282o0 && (ylVar = chatAttachAlertPhotoLayout.L) != null && ylVar.isInited()) {
                            chatAttachAlertPhotoLayout.V = false;
                            chatAttachAlertPhotoLayout.L.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26281n0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new nl(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.P && (ylVar2 = chatAttachAlertPhotoLayout.L) != null && ylVar2.isInited() && chatAttachAlertPhotoLayout.U) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.L.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.P = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
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
                                animatorSet.setInterpolator(jr.f29800f);
                                animatorSet.addListener(new lh.f3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f26292w.M(null, null);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f26294x = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.g6.f23169j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, this.f28402a));
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.f26296y = mutate;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, this.f28402a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        tlVar.addView(textView, i7.f6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        U(false);
        qb0 qb0Var = new qb0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), c6Var);
        this.Z0 = qb0Var;
        qb0Var.a(!this.f28403b.Y, false);
        this.Y0 = this.f28403b.W0.e(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.f28403b.W0.a(5);
        this.f28403b.W0.e(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.V0 = this.f28403b.W0.e(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.f28403b.W0.e(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.f28403b.W0.a(6);
        this.U0 = this.f28403b.W0.e(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.W0 = this.f28403b.W0.e(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        org.telegram.ui.ActionBar.w0 w0Var = this.f28403b.W0;
        w0Var.o();
        qb0Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        qb0Var.setTag(8);
        w0Var.f23915b.addView(qb0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) qb0Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        qb0Var.setLayoutParams(layoutParams);
        qb0Var.setOnClickListener(new org.telegram.ui.ActionBar.c0(w0Var, 2));
        this.X0 = this.f28403b.W0.e(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.f28403b.W0.setFitSubItems(true);
        ol olVar = new ol(this, context, c6Var, 1);
        this.A = olVar;
        olVar.setFastScrollEnabled(1);
        olVar.setFastScrollVisible(true);
        olVar.getFastScroll().setAlpha(0.0f);
        olVar.getFastScroll().f32664a = false;
        olVar.getFastScroll().f32670d0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        cm cmVar = new cm(this, context, z11);
        this.C = cmVar;
        olVar.setAdapter(cmVar);
        zl zlVar = new zl(this, olVar);
        this.M = zlVar;
        olVar.i(zlVar);
        for (int i11 = 0; i11 < 8; i11++) {
            cmVar.h.add(cmVar.L());
        }
        olVar.setClipToPadding(false);
        olVar.setItemAnimator(null);
        olVar.setLayoutAnimation(null);
        olVar.setVerticalScrollBarEnabled(false);
        olVar.setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, this.f28402a));
        addView(olVar, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        olVar.setOnScrollListener(new nh.s8(this, 2));
        mh.k kVar = new mh.k(this, this.G0, 2);
        this.B = kVar;
        kVar.O = new ih.n5(this, 5);
        olVar.setLayoutManager(kVar);
        olVar.setOnItemClickListener(new com.google.firebase.messaging.i(this, z11, c6Var, 6));
        olVar.setOnItemLongClickListener(new dl(this, 3));
        ll0 ll0Var = new ll0(new vl(this));
        this.E = ll0Var;
        olVar.A.add(ll0Var);
        this.f28404c = olVar;
        this.d = olVar;
        this.f28406f = true;
        hz hzVar = new hz(context, c6Var);
        this.D = hzVar;
        hzVar.setText(LocaleController.getString(R.string.NoPhotos));
        hzVar.setOnTouchListener(null);
        hzVar.setTextSize(16);
        addView(hzVar, i7.f6.c(-2.0f, -1));
        if (this.T0) {
            hzVar.b();
        } else {
            hzVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        wl wlVar = new wl(context, paint);
        this.N = wlVar;
        AndroidUtilities.updateViewVisibilityAnimated(wlVar, false, 1.0f, false);
        wlVar.setBackgroundResource(R.drawable.system);
        wlVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        wlVar.setTextSize(1, 15.0f);
        wlVar.setTypeface(AndroidUtilities.bold());
        wlVar.setAlpha(0.0f);
        wlVar.setTextColor(-1);
        wlVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(wlVar, i7.f6.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        bg.x2 x2Var = new bg.x2(this, context, 18);
        this.f26267f0 = x2Var;
        x2Var.setVisibility(8);
        x2Var.setAlpha(0.0f);
        container.addView(x2Var, i7.f6.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f26279l0 = textView2;
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
        container.addView(textView2, i7.f6.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f27502b;

            {
                this.f27502b = this;
            }

            @Override
            public final void onClick(View view) {
                yl ylVar;
                yl ylVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27502b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.L != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f26282o0 && (ylVar = chatAttachAlertPhotoLayout.L) != null && ylVar.isInited()) {
                            chatAttachAlertPhotoLayout.V = false;
                            chatAttachAlertPhotoLayout.L.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26281n0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new nl(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.P && (ylVar2 = chatAttachAlertPhotoLayout.L) != null && ylVar2.isInited() && chatAttachAlertPhotoLayout.U) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.L.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.P = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
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
                                animatorSet.setInterpolator(jr.f29800f);
                                animatorSet.addListener(new lh.f3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f26292w.M(null, null);
                        return;
                }
            }
        });
        u81 u81Var = new u81(context);
        this.f26271h0 = u81Var;
        u81Var.setVisibility(8);
        u81Var.setAlpha(0.0f);
        container.addView(u81Var, i7.f6.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        u81Var.setDelegate(new dl(this, 0));
        ?? view = new View(context);
        view.f26545b = new DecelerateInterpolator();
        view.f26552w = new rk0(view, 3);
        view.f26544a = view.getResources().getDrawable(R.drawable.camera_btn);
        Paint paint2 = new Paint(1);
        view.f26546c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f26548f = wu0.f34494a;
        this.f26269g0 = view;
        x2Var.addView((View) view, i7.f6.e(84, 84, 17));
        view.setDelegate(new ml(this, c6Var, container));
        view.setFocusable(true);
        view.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.f26281n0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        x2Var.addView(imageView, i7.f6.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f27502b;

            {
                this.f27502b = this;
            }

            @Override
            public final void onClick(View view2) {
                yl ylVar;
                yl ylVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27502b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.L != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f26282o0 && (ylVar = chatAttachAlertPhotoLayout.L) != null && ylVar.isInited()) {
                            chatAttachAlertPhotoLayout.V = false;
                            chatAttachAlertPhotoLayout.L.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26281n0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new nl(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.P && (ylVar2 = chatAttachAlertPhotoLayout.L) != null && ylVar2.isInited() && chatAttachAlertPhotoLayout.U) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.L.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.P = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
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
                                animatorSet.setInterpolator(jr.f29800f);
                                animatorSet.addListener(new lh.f3(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f26292w.M(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i12 = 0; i12 < 2; i12++) {
            this.O[i12] = new ImageView(context);
            this.O[i12].setScaleType(ImageView.ScaleType.CENTER);
            this.O[i12].setVisibility(4);
            this.f26267f0.addView(this.O[i12], i7.f6.e(48, 48, 51));
            this.O[i12].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f27502b;

                {
                    this.f27502b = this;
                }

                @Override
                public final void onClick(View view2) {
                    yl ylVar;
                    yl ylVar2;
                    int i102 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27502b;
                    switch (i102) {
                        case 0:
                            if (chatAttachAlertPhotoLayout.L != null) {
                                chatAttachAlertPhotoLayout.j0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.f26282o0 && (ylVar = chatAttachAlertPhotoLayout.L) != null && ylVar.isInited()) {
                                chatAttachAlertPhotoLayout.V = false;
                                chatAttachAlertPhotoLayout.L.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26281n0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new nl(chatAttachAlertPhotoLayout));
                                duration.start();
                                return;
                            }
                            return;
                        case 2:
                            if (!chatAttachAlertPhotoLayout.P && (ylVar2 = chatAttachAlertPhotoLayout.L) != null && ylVar2.isInited() && chatAttachAlertPhotoLayout.U) {
                                String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
                                String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
                                if (!currentFlashMode.equals(nextFlashMode)) {
                                    chatAttachAlertPhotoLayout.L.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                    chatAttachAlertPhotoLayout.P = true;
                                    ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
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
                                    animatorSet.setInterpolator(jr.f29800f);
                                    animatorSet.addListener(new lh.f3(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            chatAttachAlertPhotoLayout.f26292w.M(null, null);
                            return;
                    }
                }
            });
            ImageView imageView2 = this.O[i12];
            imageView2.setContentDescription("flash mode " + i12);
        }
        TextView textView3 = new TextView(context);
        this.m0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(org.telegram.ui.b.e(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.f26267f0.addView(textView3, i7.f6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        ol olVar2 = new ol(this, context, c6Var, 0);
        this.f26285r = olVar2;
        olVar2.setVerticalScrollBarEnabled(true);
        cm cmVar2 = new cm(this, context, false);
        this.v = cmVar2;
        olVar2.setAdapter(cmVar2);
        for (int i13 = 0; i13 < 8; i13++) {
            cmVar2.h.add(cmVar2.L());
        }
        olVar2.setClipToPadding(false);
        olVar2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        olVar2.setItemAnimator(null);
        olVar2.setLayoutAnimation(null);
        olVar2.setOverScrollMode(2);
        olVar2.setVisibility(4);
        olVar2.setAlpha(0.0f);
        container.addView(olVar2, i7.f6.c(80.0f, -1));
        org.telegram.ui.k kVar2 = new org.telegram.ui.k(0, false, 5);
        this.f26287s = kVar2;
        olVar2.setLayoutManager(kVar2);
        olVar2.setOnItemClickListener(new ih.a(3));
    }

    public static void J(org.telegram.ui.Components.ChatAttachAlertPhotoLayout r25, boolean r26, org.telegram.ui.ActionBar.c6 r27, android.view.View r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.J(org.telegram.ui.Components.ChatAttachAlertPhotoLayout, boolean, org.telegram.ui.ActionBar.c6, android.view.View, int):void");
    }

    public static org.telegram.ui.Cells.r5 K(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        ol olVar = chatAttachAlertPhotoLayout.A;
        int childCount = olVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = olVar.getChildAt(i11);
            if (childAt.getTop() < olVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f28403b.l1() && (childAt instanceof org.telegram.ui.Cells.r5)) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                if (r5Var.getImageView().getTag() != null && ((Integer) r5Var.getImageView().getTag()).intValue() == i10) {
                    return r5Var;
                }
            }
        }
        return null;
    }

    public static int M(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
        if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).N3 == 5) {
            return o2Var.getMessagesController().config.quickReplyMessagesLimit.get() - ((org.telegram.ui.tn) niVar.f30990b0).q6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static void O(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                niVar.f30990b0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
            } else if (i10 >= 23) {
                niVar.f30990b0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            }
        } catch (Exception unused) {
        }
    }

    public static void P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        if (Build.VERSION.SDK_INT >= 23 && f0.e.b(niVar.f30990b0.getParentActivity(), "android.permission.CAMERA") != 0) {
            try {
                niVar.f30990b0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        chatAttachAlertPhotoLayout.i0();
    }

    public static boolean S() {
        HashMap hashMap = f26254o1;
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
            ArrayList arrayList = f26255p1;
            if (i10 >= arrayList.size()) {
                break;
            }
            Object obj = f26254o1.get(arrayList.get(i10));
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
        HashMap hashMap = f26254o1;
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
        return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.l1;
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
        ni niVar = this.f28403b;
        if (niVar.isShowing() && !niVar.isDismissed() && !PhotoViewer.t1().Q1()) {
            U(false);
        }
    }

    @Override
    public final void B(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.B(int):void");
    }

    @Override
    public final boolean C(int i10) {
        if (this.U) {
            if (i10 == 24 || i10 == 25 || i10 == 79 || i10 == 85) {
                ((ml) this.f26269g0.getDelegate()).b();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void D(fi fiVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f26278k1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f26292w.setVisibility(0);
        boolean z10 = fiVar instanceof lm;
        TextView textView = this.f26294x;
        if (!z10) {
            Z();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(jr.f29803j);
            this.f26278k1 = interpolator;
            interpolator.start();
        }
        this.f28403b.T0.setTitle("");
        this.B.h1(0, 0);
        if (z10) {
            this.A.post(new z2(20, this, fiVar));
        }
        V();
        m0();
    }

    @Override
    public final void E() {
        this.J = false;
        yl ylVar = this.L;
        if (ylVar != null) {
            ylVar.setVisibility(0);
        }
        if (this.f26284q0) {
            this.f26284q0 = false;
            U(true);
        }
    }

    @Override
    public final void F() {
        this.A.x0(0);
    }

    public final int Q(MediaController.PhotoEntry photoEntry, int i10) {
        boolean z10;
        Integer valueOf = Integer.valueOf(photoEntry.imageId);
        HashMap hashMap = f26254o1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f26255p1;
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
                this.f26264d1.W(i10);
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
        yl ylVar = this.L;
        if (ylVar != null) {
            if (!this.U) {
                ylVar.setTranslationX(this.Q[0]);
            }
            int i10 = this.G0;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2);
            if (!this.U) {
                this.L.setClipTop((int) this.S);
                this.L.setClipBottom((int) this.T);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.L.getLayoutParams();
                if (layoutParams.height != dp || layoutParams.width != i10) {
                    layoutParams.width = i10;
                    layoutParams.height = dp;
                    this.L.setLayoutParams(layoutParams);
                    AndroidUtilities.runOnUIThread(new z2(21, this, layoutParams));
                }
            }
        }
    }

    public final void U(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z11;
        cm cmVar;
        ni niVar = this.f28403b;
        boolean z12 = niVar.R;
        org.telegram.ui.ActionBar.o2 o2Var2 = niVar.f30990b0;
        if (!z12 && this.f26280n) {
            boolean z13 = this.J0;
            boolean z14 = this.K0;
            if (o2Var2 == null) {
                o2Var = LaunchActivity.R();
            } else {
                o2Var = o2Var2;
            }
            if (o2Var != null && o2Var.getParentActivity() != null) {
                if (!SharedConfig.inappCamera) {
                    this.J0 = false;
                } else if (Build.VERSION.SDK_INT >= 23) {
                    if (o2Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.K0 = z11;
                    if (z11) {
                        if (z10) {
                            try {
                                o2Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                            } catch (Exception unused) {
                            }
                        }
                        this.J0 = false;
                    } else {
                        if (z10 || SharedConfig.hasCameraCache) {
                            CameraController.getInstance().initCamera(null);
                        }
                        this.J0 = CameraController.getInstance().isCameraInitied();
                    }
                } else {
                    if (z10 || SharedConfig.hasCameraCache) {
                        CameraController.getInstance().initCamera(null);
                    }
                    this.J0 = CameraController.getInstance().isCameraInitied();
                }
                if ((z13 != this.J0 || z14 != this.K0) && (cmVar = this.C) != null) {
                    cmVar.l();
                }
                if (!niVar.R && niVar.isShowing() && this.J0 && niVar.getBackDrawable().getAlpha() != 0 && !this.U) {
                    s0();
                }
            }
        }
    }

    public final void V() {
        f2.n1 K;
        float[] fArr;
        int i10;
        float f9;
        wl wlVar;
        int systemWindowInsetTop;
        if (!PhotoViewer.C1() || PhotoViewer.t1().f35751l5 == null || !PhotoViewer.t1().f35751l5.R) {
            yl ylVar = this.L;
            if (ylVar != null) {
                ylVar.invalidateOutline();
            }
            ol olVar = this.A;
            f2.n1 K2 = olVar.K(this.I0 - 1);
            if (K2 != null) {
                K2.f6432a.invalidateOutline();
            }
            if ((!this.C.d || !this.J0 || this.P0 != this.Q0) && (K = olVar.K(0)) != null) {
                K.f6432a.invalidateOutline();
            }
            yl ylVar2 = this.L;
            if (ylVar2 != null) {
                ylVar2.invalidate();
            }
            if (Build.VERSION.SDK_INT >= 23 && (wlVar = this.N) != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wlVar.getLayoutParams();
                if (getRootWindowInsets() == null) {
                    systemWindowInsetTop = AndroidUtilities.dp(16.0f);
                } else {
                    systemWindowInsetTop = getRootWindowInsets().getSystemWindowInsetTop() + AndroidUtilities.dp(2.0f);
                }
                marginLayoutParams.topMargin = systemWindowInsetTop;
            }
            if (!this.J0) {
                return;
            }
            int childCount = olVar.getChildCount();
            int i11 = 0;
            while (true) {
                fArr = this.Q;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = olVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.k5) {
                    if (childAt.isAttachedToWindow()) {
                        float y8 = getY() + olVar.getY() + childAt.getY();
                        ni niVar = this.f28403b;
                        ViewGroup sheetContainer = niVar.getSheetContainer();
                        qh qhVar = niVar.f31052u1;
                        bg.d1 d1Var = niVar.K0;
                        float y10 = sheetContainer.getY() + y8;
                        float x4 = niVar.getSheetContainer().getX() + getX() + olVar.getX() + childAt.getX();
                        if (Build.VERSION.SDK_INT >= 23) {
                            x4 -= getRootWindowInsets().getSystemWindowInsetLeft();
                        }
                        if (!niVar.f30994c0) {
                            i10 = AndroidUtilities.statusBarHeight;
                        } else {
                            i10 = 0;
                        }
                        float alpha = (d1Var.getAlpha() * d1Var.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
                        nh.i iVar = niVar.f31064x2;
                        if (iVar != null && iVar.g()) {
                            alpha = Math.max(alpha, (niVar.f31064x2.e() + niVar.f31064x2.getY()) - niVar.f31013h2);
                        }
                        if (y8 < alpha) {
                            f9 = alpha - y8;
                        } else {
                            f9 = 0.0f;
                        }
                        if (f9 != this.S) {
                            this.S = f9;
                            yl ylVar3 = this.L;
                            if (ylVar3 != null) {
                                ylVar3.invalidateOutline();
                                this.L.invalidate();
                            }
                        }
                        float translationY = (int) (qhVar.getTranslationY() + (niVar.getSheetContainer().getMeasuredHeight() - qhVar.getMeasuredHeight()));
                        nh.i iVar2 = niVar.f31064x2;
                        if (iVar2 != null) {
                            translationY -= iVar2.d() - AndroidUtilities.dp(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y8 > translationY) {
                            this.T = Math.min(-AndroidUtilities.dp(5.0f), y8 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.T = 0.0f;
                        }
                        fArr[0] = x4;
                        fArr[1] = y10;
                        R();
                        return;
                    }
                } else {
                    i11++;
                }
            }
            if (this.S != 0.0f) {
                this.S = 0.0f;
                yl ylVar4 = this.L;
                if (ylVar4 != null) {
                    ylVar4.invalidateOutline();
                    this.L.invalidate();
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
            HashMap hashMap = f26254o1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f26255p1;
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
        boolean z10 = this.f26288s0;
        org.telegram.ui.ActionBar.c6 c6Var = this.f28402a;
        ni niVar = this.f28403b;
        if (!z10 && photoEntry.isVideo) {
            if (!niVar.a1()) {
                org.telegram.messenger.x3.s(R.string.GlobalAttachVideoRestricted, new tc(niVar.f31029n1, c6Var), null);
                return true;
            }
        } else if (!this.f26289t0 && !photoEntry.isVideo) {
            if (!niVar.a1()) {
                org.telegram.messenger.x3.s(R.string.GlobalAttachPhotoRestricted, new tc(niVar.f31029n1, c6Var), null);
                return true;
            }
        } else {
            return false;
        }
        return true;
    }

    public final void Y() {
        if (this.L0 && Build.VERSION.SDK_INT >= 23) {
            boolean e02 = e0();
            this.L0 = e02;
            if (!e02) {
                f0();
            }
            this.C.l();
            this.v.l();
        }
    }

    public final void Z() {
        String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
        org.telegram.ui.ActionBar.g1 g1Var = this.U0;
        g1Var.setText(string);
        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.f28403b.W0.K(1);
        HashMap hashMap = f26254o1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((MediaController.PhotoEntry) entry.getValue()).reset();
            }
            hashMap.clear();
            f26255p1.clear();
        }
        ArrayList arrayList = f26253n1;
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
        this.C.l();
        this.v.l();
    }

    @Override
    public final void a(CharSequence charSequence) {
        MediaController.PhotoEntry photoEntry;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = f26255p1;
            if (i10 < arrayList.size()) {
                if (i10 == 0) {
                    Object obj = arrayList.get(i10);
                    HashMap hashMap = f26254o1;
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
        yl ylVar;
        if (!this.f26282o0 && this.L != null) {
            int i10 = this.G0;
            int[] iArr = this.f26259b0;
            iArr[1] = i10;
            iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
            Runnable runnable = this.f26275j0;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.f26275j0 = null;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, this.f28402a)) > 0.721d) {
                z11 = true;
            } else {
                z11 = false;
            }
            ni niVar = this.f28403b;
            AndroidUtilities.setLightNavigationBar(niVar, z11);
            TextView textView = this.f26279l0;
            ol olVar = this.f26285r;
            bg.x2 x2Var = this.f26267f0;
            ol olVar2 = this.A;
            ImageView[] imageViewArr = this.O;
            u81 u81Var = this.f26271h0;
            if (z10) {
                this.f26268f1 = this.L.getTranslationY();
                this.W = true;
                if (olVar2 != null) {
                    olVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(x2Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(u81Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(olVar, property, 0.0f));
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
                this.f26260b1.lock();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(jr.f29800f);
                animatorSet.addListener(new ql(this, 2));
                animatorSet.start();
            } else {
                this.f26266e1 = false;
                niVar.getWindow().clearFlags(128);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                x2Var.setAlpha(0.0f);
                x2Var.setVisibility(8);
                u81Var.setAlpha(0.0f);
                u81Var.setTag(null);
                u81Var.setVisibility(8);
                olVar.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                olVar.setVisibility(8);
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
                this.U = false;
                yl ylVar2 = this.L;
                if (ylVar2 != null) {
                    ylVar2.setFpsLimit(30);
                    this.L.setSystemUiVisibility(1024);
                }
                if (olVar2 != null) {
                    olVar2.invalidate();
                }
            }
            yl ylVar3 = this.L;
            if (ylVar3 != null) {
                ylVar3.setImportantForAccessibility(0);
            }
            olVar2.setImportantForAccessibility(0);
            if (!LiteMode.isEnabled(360928) && (ylVar = this.L) != null) {
                ylVar.showTexture(false, z10);
            }
        }
    }

    @Override
    public final boolean b() {
        return !this.U;
    }

    public final MediaController.PhotoEntry b0(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = f26253n1;
        int size = arrayList.size();
        if (i10 < size) {
            return (MediaController.PhotoEntry) arrayList.get(i10);
        }
        int i11 = i10 - size;
        MediaController.AlbumEntry albumEntry = this.P0;
        if (albumEntry == null || i11 >= albumEntry.photos.size()) {
            return null;
        }
        return this.P0.photos.get(i11);
    }

    @Override
    public final boolean c() {
        for (Map.Entry entry : f26254o1.entrySet()) {
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
        boolean z10 = this.f26258a1;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.g6.f23143hg;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f23169j5;
        }
        int i14 = org.telegram.ui.ActionBar.g6.f23045c7;
        org.telegram.ui.ActionBar.c6 c6Var = this.f28402a;
        this.D.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, c6Var);
        ol olVar = this.A;
        olVar.setGlowColor(v02);
        olVar.K(0);
        this.f26294x.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        if (z10) {
            i11 = org.telegram.ui.ActionBar.g6.f23143hg;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.E8;
        }
        int v03 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        tl tlVar = this.f26292w;
        tlVar.G(v03, false);
        if (z10) {
            i12 = org.telegram.ui.ActionBar.g6.f23143hg;
        } else {
            i12 = org.telegram.ui.ActionBar.g6.E8;
        }
        tlVar.G(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), true);
        if (z10) {
            i13 = org.telegram.ui.ActionBar.g6.f23180jg;
        } else {
            i13 = org.telegram.ui.ActionBar.g6.G8;
        }
        tlVar.B(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        org.telegram.ui.ActionBar.g6.w1(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), this.f26296y);
    }

    public final void d0(boolean z10) {
        if (this.J0 && this.L != null) {
            n0();
            this.M.f();
            this.L.destroy(z10, null);
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.K = null;
            }
            AndroidUtilities.runOnUIThread(new gl(this, 0), 300L);
            this.V = false;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ni niVar;
        if (i10 == NotificationCenter.albumsDidLoad) {
            cm cmVar = this.C;
            if (cmVar != null) {
                if (q0()) {
                    this.Q0 = MediaController.allMediaAlbumEntry;
                } else {
                    this.Q0 = MediaController.allPhotosAlbumEntry;
                }
                if (this.P0 != null && ((niVar = this.f28403b) == null || !niVar.C)) {
                    if (q0()) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= MediaController.allMediaAlbums.size()) {
                                break;
                            }
                            MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                            int i13 = albumEntry.bucketId;
                            MediaController.AlbumEntry albumEntry2 = this.P0;
                            if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                                this.P0 = albumEntry;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    this.P0 = this.Q0;
                }
                this.T0 = false;
                this.D.c();
                cmVar.l();
                this.v.l();
                ArrayList arrayList = f26255p1;
                if (!arrayList.isEmpty() && this.Q0 != null) {
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        Integer num = (Integer) arrayList.get(i14);
                        HashMap hashMap = f26254o1;
                        Object obj = hashMap.get(num);
                        MediaController.PhotoEntry photoEntry = this.Q0.photosByIds.get(num.intValue());
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
            findActivity = this.f28403b.f30990b0.getParentActivity();
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
        MediaController.AlbumEntry albumEntry = this.P0;
        ArrayList<Object> arrayList = f26253n1;
        if (albumEntry != null) {
            if (!arrayList.isEmpty()) {
                ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.P0.photos.size());
                arrayList2.addAll(arrayList);
                arrayList2.addAll(this.P0.photos);
                return arrayList2;
            }
            return this.P0.photos;
        } else if (!arrayList.isEmpty()) {
            return arrayList;
        } else {
            return new ArrayList<>(0);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.f26257a0;
    }

    @Override
    public int getCurrentItemTop() {
        ol olVar = this.A;
        int childCount = olVar.getChildCount();
        hz hzVar = this.D;
        if (childCount <= 0) {
            olVar.setTopGlowOffset(olVar.getPaddingTop());
            hzVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = olVar.getChildAt(0);
        vk0 vk0Var = (vk0) olVar.G(childAt);
        int top = childAt.getTop() - this.l1;
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        hzVar.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - hzVar.getMeasuredHeight()) / 2.0f) + top);
        olVar.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.A.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return f26255p1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f26254o1;
    }

    public int getSelectedPhotosCount() {
        int i10 = 0;
        for (Object obj : f26254o1.values()) {
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
        for (Object obj : f26254o1.values()) {
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
        return f26255p1;
    }

    public long getStarsPrice() {
        Iterator it = f26254o1.entrySet().iterator();
        if (it.hasNext()) {
            return ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).starsAmount;
        }
        return 0L;
    }

    @Override
    public final int h() {
        return 1;
    }

    public final void h0(boolean z10) {
        yl ylVar;
        if (this.L != null && this.K == null) {
            ni niVar = this.f28403b;
            if (!niVar.isDismissed()) {
                this.L.initTexture();
                boolean q02 = q0();
                TextView textView = this.m0;
                int i10 = 0;
                if (q02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f26253n1.isEmpty();
                ol olVar = this.f26285r;
                TextView textView2 = this.f26279l0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    olVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    olVar.setVisibility(0);
                }
                if (niVar.m1().v && isFocusable()) {
                    niVar.m1().d();
                }
                u81 u81Var = this.f26271h0;
                u81Var.setVisibility(0);
                u81Var.setAlpha(0.0f);
                bg.x2 x2Var = this.f26267f0;
                x2Var.setVisibility(0);
                x2Var.setTag(null);
                int[] iArr = this.f26259b0;
                iArr[0] = 0;
                int i11 = this.G0;
                iArr[1] = i11;
                iArr[2] = AndroidUtilities.dp(2.0f) + (i11 * 2);
                this.f26268f1 = 0.0f;
                this.f26266e1 = true;
                yl ylVar2 = this.L;
                if (ylVar2 != null) {
                    ylVar2.setFpsLimit(-1);
                }
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.setLightNavigationBar((Dialog) niVar, false);
                niVar.getWindow().addFlags(128);
                ol olVar2 = this.A;
                ImageView[] imageViewArr = this.O;
                if (z10) {
                    setCameraOpenProgress(0.0f);
                    this.W = true;
                    if (olVar2 != null) {
                        olVar2.invalidate();
                    }
                    this.f26260b1.lock();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(x2Var, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(olVar, property, 1.0f));
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
                    animatorSet.setInterpolator(jr.f29800f);
                    animatorSet.addListener(new ql(this, 1));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    x2Var.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    olVar.setAlpha(1.0f);
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
                    niVar.V1.L0();
                    yl ylVar3 = this.L;
                    if (ylVar3 != null) {
                        ylVar3.setSystemUiVisibility(1028);
                    }
                }
                this.U = true;
                yl ylVar4 = this.L;
                if (ylVar4 != null) {
                    ylVar4.setImportantForAccessibility(2);
                }
                olVar2.setImportantForAccessibility(4);
                olVar2.invalidate();
                if (!LiteMode.isEnabled(360928) && (ylVar = this.L) != null && ylVar.isInited()) {
                    this.L.showTexture(true, z10);
                }
            }
        }
    }

    public final void i0() {
        if (SharedConfig.inappCamera) {
            h0(true);
            return;
        }
        ni niVar = this.f28403b;
        li liVar = niVar.V1;
        if (liVar != null) {
            liVar.B1(0, false, true, 0, 0, 0L, niVar.s1(), false, 0L);
        }
    }

    @Override
    public final void j() {
        V();
        invalidate();
    }

    public final void j0(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        int i10;
        org.telegram.ui.tn tnVar;
        int i11;
        org.telegram.ui.tn tnVar2;
        ArrayList<Object> arrayList;
        int i12;
        ArrayList arrayList2 = f26253n1;
        ni niVar = this.f28403b;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            f26254o1.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            f26255p1.add(Integer.valueOf(photoEntry.imageId));
            niVar.V1(0);
            this.C.l();
            this.v.l();
        }
        if (photoEntry != null && !z11 && arrayList2.size() > 1) {
            y0(false);
            if (this.L != null) {
                this.f26271h0.b(0.0f, false);
                this.f26295x0 = 0.0f;
                this.L.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.L.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f26283p0 = true;
            org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
            org.telegram.ui.ActionBar.o2 o2Var2 = niVar.f30990b0;
            if (o2Var == null) {
                o2Var = LaunchActivity.R();
            }
            if (o2Var != null) {
                PhotoViewer.t1().K2(o2Var.getParentActivity(), null, this.f28402a);
                PhotoViewer.t1().L2(niVar);
                PhotoViewer t12 = PhotoViewer.t1();
                int i13 = niVar.O1;
                boolean z12 = niVar.P1;
                t12.h = i13;
                t12.f35763n = z12;
                if (niVar.B && niVar.C) {
                    tnVar = (org.telegram.ui.tn) o2Var2;
                    i10 = 11;
                } else if (niVar.M0 != 0) {
                    tnVar = null;
                    i10 = 1;
                } else if (o2Var2 instanceof org.telegram.ui.tn) {
                    tnVar = (org.telegram.ui.tn) o2Var2;
                    i10 = 2;
                } else {
                    i10 = 5;
                    tnVar = null;
                }
                boolean z13 = niVar.D;
                if (z13) {
                    tnVar2 = null;
                    i11 = 13;
                } else {
                    i11 = i10;
                    tnVar2 = tnVar;
                }
                if (niVar.M0 == 0 && !z13) {
                    arrayList = getAllPhotosArray();
                    i12 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(photoEntry);
                    i12 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                q40 q40Var = niVar.M;
                if (q40Var != null && photoEntry != null) {
                    q40Var.f31855e = photoEntry.isVideo;
                }
                PhotoViewer.t1().f2(arrayList3, i12, i11, false, new pl(this, z10), tnVar2);
                PhotoViewer.t1().x2(niVar.M);
                if (niVar.C) {
                    PhotoViewer.t1().X0(null, null, false, niVar.F);
                    PhotoViewer.t1().l2();
                }
            }
        }
    }

    @Override
    public final void k(float f9) {
        this.S0 = f9;
        V();
        yl ylVar = this.L;
        if (ylVar != null) {
            ylVar.invalidateOutline();
            this.L.invalidate();
        }
        invalidate();
    }

    public final void k0() {
        try {
            if (this.L != null) {
                CameraController.getInstance().stopPreview(this.L.getCameraSessionObject());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final boolean l(MotionEvent motionEvent) {
        yl ylVar;
        if (!this.W) {
            if (this.U && motionEvent != null) {
                boolean z10 = this.C0;
                u81 u81Var = this.f26271h0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.A0;
                    u81Var.getHitRect(rect);
                    if (u81Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f26282o0 && !this.E0) {
                            if (motionEvent.getPointerCount() == 2) {
                                this.f26293w0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                this.f26297y0 = true;
                            } else {
                                this.D0 = true;
                                this.B0 = motionEvent.getY();
                                this.f26297y0 = false;
                            }
                            this.f26298z0 = false;
                            this.C0 = true;
                            return true;
                        }
                    }
                } else if (this.C0) {
                    int actionMasked = motionEvent.getActionMasked();
                    ol olVar = this.f26285r;
                    TextView textView = this.f26279l0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.O;
                    bg.x2 x2Var = this.f26267f0;
                    if (actionMasked == 2) {
                        if (this.f26297y0 && motionEvent.getPointerCount() == 2 && !this.E0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (!this.f26298z0) {
                                if (Math.abs(hypot - this.f26293w0) >= AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.f26293w0 = hypot;
                                    this.f26298z0 = true;
                                    return true;
                                }
                            } else if (this.L != null) {
                                this.f26293w0 = hypot;
                                float dp = this.f26295x0 + ((hypot - this.f26293w0) / AndroidUtilities.dp(100.0f));
                                this.f26295x0 = dp;
                                if (dp < 0.0f) {
                                    this.f26295x0 = 0.0f;
                                } else if (dp > 1.0f) {
                                    this.f26295x0 = 1.0f;
                                }
                                u81Var.b(this.f26295x0, false);
                                this.f28403b.getSheetContainer().invalidate();
                                this.L.setZoom(this.f26295x0);
                                t0(true);
                                return true;
                            }
                        } else {
                            float y8 = motionEvent.getY();
                            float f9 = y8 - this.B0;
                            if (this.D0) {
                                if (Math.abs(f9) > AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.D0 = false;
                                    this.E0 = true;
                                    return true;
                                }
                            } else if (this.E0 && (ylVar = this.L) != null) {
                                ylVar.setTranslationY(ylVar.getTranslationY() + f9);
                                this.B0 = y8;
                                u81Var.setTag(null);
                                Runnable runnable = this.f26275j0;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.f26275j0 = null;
                                }
                                if (x2Var.getTag() == null) {
                                    x2Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(x2Var, property, 0.0f), ObjectAnimator.ofFloat(u81Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(olVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(jr.f29800f);
                                    animatorSet.start();
                                    return true;
                                }
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                        this.C0 = false;
                        this.f26297y0 = false;
                        if (this.E0) {
                            this.E0 = false;
                            yl ylVar2 = this.L;
                            if (ylVar2 != null) {
                                if (Math.abs(ylVar2.getTranslationY()) > this.L.getMeasuredHeight() / 6.0f) {
                                    a0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.L, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(x2Var, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(olVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f26265e0);
                                animatorSet2.start();
                                x2Var.setTag(null);
                                return true;
                            }
                        } else {
                            yl ylVar3 = this.L;
                            if (ylVar3 != null && !this.f26298z0) {
                                int[] iArr = this.R;
                                ylVar3.getLocationOnScreen(iArr);
                                this.L.focusToPoint((int) (motionEvent.getRawX() - iArr[0]), (int) (motionEvent.getRawY() - iArr[1]));
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
        if (this.f28403b.R) {
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.O[i10].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(jr.f29800f).start();
        }
        ViewPropertyAnimator duration = this.f26281n0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        jr jrVar = jr.f29800f;
        duration.setInterpolator(jrVar).start();
        this.m0.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar).start();
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false);
        AndroidUtilities.cancelRunOnUIThread(this.f26263d0);
        this.f26263d0 = null;
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
            if (this.L != null) {
                CameraController.getInstance().startPreview(this.L.getCameraSessionObject());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final boolean n() {
        if (this.W) {
            return true;
        }
        if (this.U) {
            a0(true);
            return true;
        }
        d0(true);
        return false;
    }

    public final void n0() {
        if (this.V) {
            try {
                Bitmap bitmap = this.L.getTextureView().getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.L.getMatrix(), true);
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
        boolean z10;
        if (i10 != 0 && i10 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        d0(z10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.O0 != i14) {
            this.O0 = i14;
            cm cmVar = this.C;
            if (cmVar != null) {
                cmVar.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        V();
    }

    public final void p0(int i10, final boolean z10) {
        PhotoViewer t12 = PhotoViewer.t1();
        if (i10 == -1) {
            i10 = t12.L4;
        }
        ArrayList arrayList = t12.f35671c7;
        if (arrayList != null && !arrayList.isEmpty() && i10 < arrayList.size() && (arrayList.get(i10) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) arrayList.get(i10)).hasSpoiler) {
            final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
            this.A.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z11 = ChatAttachAlertPhotoLayout.f26252m1;
                    if (view instanceof org.telegram.ui.Cells.r5) {
                        org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                        if (r5Var.getPhotoEntry() == photoEntry) {
                            r5Var.c(z10, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z12 = true;
                            if (ChatAttachAlertPhotoLayout.f26254o1.size() <= 1) {
                                z12 = false;
                            }
                            r5Var.f(starsPrice, z12);
                        }
                    }
                }
            });
        }
    }

    @Override
    public final void q() {
        yl ylVar = this.L;
        if (ylVar != null) {
            ylVar.setVisibility(8);
        }
        for (Map.Entry entry : f26254o1.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.C.l();
    }

    public final boolean q0() {
        if (!this.f26290u0) {
            ni niVar = this.f28403b;
            if (!niVar.B) {
                if (!(niVar.f30990b0 instanceof org.telegram.ui.tn) && !niVar.P0 && niVar.M0 != 2) {
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
        this.J = true;
        ol olVar = this.A;
        int childCount = olVar.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (olVar.getChildAt(i10) instanceof org.telegram.ui.Cells.k5) {
                n0();
                break;
            } else {
                this.M.f();
                i10++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f26278k1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f26294x.animate().alpha(0.0f).setDuration(150L).setInterpolator(jr.f29803j).withEndAction(new gl(this, 1));
        this.f26278k1 = withEndAction;
        withEndAction.start();
        k0();
    }

    public final void r0(d9 d9Var, TLRPC.VideoSize videoSize, long j10) {
        boolean z10;
        ni niVar = this.f28403b;
        b9 b9Var = new b9(niVar.Q, niVar.M);
        q40 q40Var = niVar.M;
        if (q40Var != null && q40Var.f31854c == 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        b9Var.M = z10;
        niVar.f30990b0.presentFragment(b9Var);
        if (d9Var != null) {
            b9Var.m0(d9Var);
        }
        if (videoSize != null) {
            b9Var.l0(videoSize);
        }
        if (j10 != 0) {
            b9Var.k0(j10);
        }
        b9Var.E = new j1(13, this, b9Var);
    }

    @Override
    public final void requestLayout() {
        if (this.N0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(float f9) {
        yl ylVar = this.L;
        if (ylVar != null) {
            ylVar.setAlpha(f9);
            int i10 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
            if (i10 != 0 && this.L.getVisibility() != 0) {
                this.L.setVisibility(0);
            } else if (i10 == 0 && this.L.getVisibility() != 4) {
                this.L.setVisibility(4);
            }
        }
    }

    public final void s0() {
        boolean z10;
        boolean z11;
        float f9;
        ni niVar = this.f28403b;
        if (!niVar.f30992b2 && this.f26286r0 && CameraView.isCameraAllowed()) {
            if (this.L == null) {
                boolean z12 = !LiteMode.isEnabled(360928);
                Context context = getContext();
                Boolean bool = this.f26277k0;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = niVar.Q1;
                }
                yl ylVar = new yl(this, context, z10, z12);
                this.L = ylVar;
                org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
                if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).w()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ylVar.setRecordFile(AndroidUtilities.generateVideoPath(z11));
                this.L.setFocusable(true);
                this.L.setFpsLimit(30);
                this.L.setOutlineProvider(new ng.b(this, 1));
                this.L.setClipToOutline(true);
                this.L.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                org.telegram.ui.ActionBar.d3 container = niVar.getContainer();
                yl ylVar2 = this.L;
                int i10 = this.G0;
                container.addView(ylVar2, 1, new FrameLayout.LayoutParams(i10, i10));
                this.L.setDelegate(new rl(this));
                yl ylVar3 = this.L;
                if (this.f26286r0) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.2f;
                }
                ylVar3.setAlpha(f9);
                this.L.setEnabled(this.f26286r0);
                if (this.J) {
                    this.L.setVisibility(8);
                }
                if (!this.U) {
                    V();
                }
                ol olVar = this.A;
                if (olVar != null) {
                    olVar.invalidate();
                }
                invalidate();
            }
            u81 u81Var = this.f26271h0;
            if (u81Var != null) {
                u81Var.b(0.0f, false);
                this.f26295x0 = 0.0f;
            }
            if (!this.U) {
                this.L.setTranslationX(this.Q[0]);
            }
        }
    }

    public void setCameraOpenProgress(float f9) {
        int i10;
        int i11;
        if (this.L == null) {
            return;
        }
        this.f26257a0 = f9;
        int[] iArr = this.f26259b0;
        float f10 = iArr[1];
        float f11 = iArr[2];
        int i12 = AndroidUtilities.displaySize.x;
        ni niVar = this.f28403b;
        float width = (niVar.getContainer().getWidth() - niVar.getLeftInset()) - niVar.getRightInset();
        float height = niVar.getContainer().getHeight();
        float[] fArr = this.Q;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = this.f26268f1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.L.getLayoutParams();
        float textureHeight = this.L.getTextureHeight(f10, f11) / this.L.getTextureHeight(width, height);
        float f15 = f11 / height;
        float f16 = f10 / width;
        if (this.f26266e1) {
            i10 = (int) width;
            i11 = (int) height;
            float f17 = 1.0f - f9;
            float f18 = (textureHeight * f17) + f9;
            this.L.getTextureView().setScaleX(f18);
            this.L.getTextureView().setScaleY(f18);
            float f19 = f12 * f17;
            this.L.setTranslationX(((0.0f * f9) + f19) - (((1.0f - ((f16 * f17) + f9)) * width) / 2.0f));
            float f20 = f13 * f17;
            this.L.setTranslationY(((f14 * f9) + f20) - (((1.0f - ((f15 * f17) + f9)) * height) / 2.0f));
            this.f26270g1 = f20 - this.L.getTranslationY();
            this.f26272h1 = (height * f9) + (((f13 + f11) * f17) - this.L.getTranslationY());
            this.f26276j1 = f19 - this.L.getTranslationX();
            this.f26274i1 = (width * f9) + (((f12 + f10) * f17) - this.L.getTranslationX());
        } else {
            i10 = (int) f10;
            i11 = (int) f11;
            this.L.getTextureView().setScaleX(1.0f);
            this.L.getTextureView().setScaleY(1.0f);
            this.f26270g1 = 0.0f;
            this.f26272h1 = height;
            this.f26276j1 = 0.0f;
            this.f26274i1 = width;
            this.L.setTranslationX(f12);
            this.L.setTranslationY(f13);
        }
        if (layoutParams.width != i10 || layoutParams.height != i11) {
            layoutParams.width = i10;
            layoutParams.height = i11;
            this.L.requestLayout();
        }
        this.L.invalidateOutline();
        this.L.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z10) {
        this.f26284q0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.f26290u0 = z10;
    }

    public void setStarsPrice(long j10) {
        boolean z10;
        HashMap hashMap = f26254o1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                photoEntry.starsAmount = j10;
                if (j10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.hasSpoiler = z10;
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
    public void setTranslationY(float f9) {
        ni niVar = this.f28403b;
        if (niVar.getSheetAnimationType() == 1) {
            float f10 = (f9 / 40.0f) * (-0.1f);
            ol olVar = this.A;
            int childCount = olVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = olVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    float f11 = 1.0f + f10;
                    r5Var.getCheckBox().setScaleX(f11);
                    r5Var.getCheckBox().setScaleY(f11);
                }
            }
        }
        super.setTranslationY(f9);
        niVar.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void t(int i10) {
        TLRPC.Chat k12;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        ni niVar = this.f28403b;
        if (i10 == 8) {
            niVar.H1(!niVar.Y, true);
            this.Z0.a(!niVar.Y, true);
        } else if ((i10 == 0 || i10 == 1) && niVar.O1 > 0 && f26255p1.size() > 1 && (k12 = niVar.k1()) != null && !ChatObject.hasAdminRights(k12) && k12.slowmode_enabled) {
            c5.O(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.f28402a).o();
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = this.f28402a;
            HashMap hashMap = f26254o1;
            if (i10 == 0) {
                MessageObject messageObject = niVar.D1;
                org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
                if (messageObject == null && (o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).c()) {
                    c5.M(getContext(), ((org.telegram.ui.tn) o2Var).a(), new dl(this, 1), c6Var);
                } else {
                    c5.a0(niVar.F1, niVar.j1() + hashMap.size(), niVar.n1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f28104b;

                        {
                            this.f28104b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28104b;
                            Long l10 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f26252m1;
                                    ni niVar2 = chatAttachAlertPhotoLayout.f28403b;
                                    niVar2.Y0();
                                    niVar2.V1.B1(7, false, true, 0, 0, 0L, niVar2.s1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f26252m1;
                                    ni niVar3 = chatAttachAlertPhotoLayout.f28403b;
                                    niVar3.Y0();
                                    niVar3.V1.B1(4, true, true, 0, 0, 0L, niVar3.s1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i10 == 1) {
                MessageObject messageObject2 = niVar.D1;
                org.telegram.ui.ActionBar.o2 o2Var2 = niVar.f30990b0;
                if (messageObject2 == null && (o2Var2 instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var2).c()) {
                    c5.M(getContext(), ((org.telegram.ui.tn) o2Var2).a(), new dl(this, 2), c6Var);
                } else {
                    c5.a0(niVar.F1, niVar.j1() + hashMap.size(), niVar.n1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f28104b;

                        {
                            this.f28104b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28104b;
                            Long l10 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f26252m1;
                                    ni niVar2 = chatAttachAlertPhotoLayout.f28403b;
                                    niVar2.Y0();
                                    niVar2.V1.B1(7, false, true, 0, 0, 0L, niVar2.s1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f26252m1;
                                    ni niVar3 = chatAttachAlertPhotoLayout.f28403b;
                                    niVar3.Y0();
                                    niVar3.V1.B1(4, true, true, 0, 0, 0L, niVar3.s1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                cm cmVar = this.C;
                ol olVar = this.A;
                if (i10 == 3) {
                    lm lmVar = niVar.m0;
                    if (lmVar != null) {
                        lmVar.J();
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
                        public final ChatAttachAlertPhotoLayout f28474b;

                        {
                            this.f28474b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z14 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28474b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f26252m1;
                                    ni niVar2 = chatAttachAlertPhotoLayout.f28403b;
                                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.U0;
                                    if (z14) {
                                        i11 = R.string.DisablePhotoSpoiler;
                                    } else {
                                        i11 = R.string.EnablePhotoSpoiler;
                                    }
                                    g1Var.setText(LocaleController.getString(i11));
                                    if (z14) {
                                        g1Var.setIcon(R.drawable.msg_spoiler_off);
                                    } else {
                                        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
                                    }
                                    if (z14) {
                                        niVar2.W0.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            niVar2.W0.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    niVar2.W0.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        niVar2.W0.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.W0;
                                    if (z14) {
                                        i12 = R.string.SendInStandardQuality;
                                    } else {
                                        i12 = R.string.SendInHighQuality;
                                    }
                                    g1Var2.setText(LocaleController.getString(i12));
                                    if (z14) {
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
                            photoEntry.hasSpoiler = z13;
                            photoEntry.isChatPreviewSpoilerRevealed = false;
                            photoEntry.isAttachSpoilerRevealed = false;
                            arrayList.add(Integer.valueOf(photoEntry.imageId));
                        }
                    }
                    olVar.M(new hl(0, arrayList, z13));
                    if (niVar.f31051u0 != this) {
                        cmVar.l();
                    }
                    lm lmVar2 = niVar.m0;
                    if (lmVar2 != null) {
                        lmVar2.v.invalidate();
                    }
                } else if (i10 == 2) {
                    lm lmVar3 = niVar.m0;
                    if (lmVar3 != null) {
                        lmVar3.J();
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
                        public final ChatAttachAlertPhotoLayout f28474b;

                        {
                            this.f28474b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z142 = z14;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28474b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f26252m1;
                                    ni niVar2 = chatAttachAlertPhotoLayout.f28403b;
                                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.U0;
                                    if (z142) {
                                        i11 = R.string.DisablePhotoSpoiler;
                                    } else {
                                        i11 = R.string.EnablePhotoSpoiler;
                                    }
                                    g1Var.setText(LocaleController.getString(i11));
                                    if (z142) {
                                        g1Var.setIcon(R.drawable.msg_spoiler_off);
                                    } else {
                                        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
                                    }
                                    if (z142) {
                                        niVar2.W0.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            niVar2.W0.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    niVar2.W0.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        niVar2.W0.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.W0;
                                    if (z142) {
                                        i12 = R.string.SendInStandardQuality;
                                    } else {
                                        i12 = R.string.SendInHighQuality;
                                    }
                                    g1Var2.setText(LocaleController.getString(i12));
                                    if (z142) {
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
                            photoEntry2.highQuality = Boolean.valueOf(z14);
                            photoEntry2.isChatPreviewSpoilerRevealed = false;
                            photoEntry2.isAttachSpoilerRevealed = false;
                            arrayList2.add(Integer.valueOf(photoEntry2.imageId));
                        }
                    }
                    olVar.M(new hl(1, arrayList2, z14));
                    if (niVar.f31051u0 != this) {
                        cmVar.l();
                    }
                    lm lmVar4 = niVar.m0;
                    if (lmVar4 != null) {
                        lmVar4.v.invalidate();
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
                            int i11 = niVar.M0;
                            org.telegram.ui.ActionBar.o2 o2Var3 = niVar.f30990b0;
                            if (i11 != 0) {
                                o2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                o2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i12 = niVar.M0;
                            org.telegram.ui.ActionBar.o2 o2Var4 = niVar.f30990b0;
                            if (i12 != 0) {
                                o2Var4.startActivityForResult(intent3, 14);
                            } else {
                                o2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        niVar.dismiss(true);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } else if (i10 == 7) {
                    if (niVar.f31051u0 == niVar.m0) {
                        z12 = false;
                    }
                    niVar.Z1(z12);
                } else if (i10 == 9) {
                    jh.ia.g1(getContext(), getStarsPrice(), true, new d(this, 6), this.f28402a);
                } else if (i10 >= 10) {
                    MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.R0.get(i10 - 10);
                    this.P0 = albumEntry;
                    MediaController.AlbumEntry albumEntry2 = this.Q0;
                    TextView textView = this.f26294x;
                    if (albumEntry == albumEntry2) {
                        textView.setText(LocaleController.getString(R.string.ChatGallery));
                    } else {
                        textView.setText(albumEntry.bucketName);
                    }
                    cmVar.l();
                    this.v.l();
                    this.B.h1(0, -(olVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void t0(boolean z10) {
        Integer num;
        float f9;
        u81 u81Var = this.f26271h0;
        if ((u81Var.getTag() != null && z10) || (u81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f26275j0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                gl glVar = new gl(this, 3);
                this.f26275j0 = glVar;
                AndroidUtilities.runOnUIThread(glVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f26273i0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        u81Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26273i0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.f26273i0;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(u81Var, View.ALPHA, f9));
        this.f26273i0.addListener(new ql(this, 0));
        this.f26273i0.start();
        if (z10) {
            gl glVar2 = new gl(this, 4);
            this.f26275j0 = glVar2;
            AndroidUtilities.runOnUIThread(glVar2, 2000L);
        }
    }

    @Override
    public final void u() {
        boolean z10;
        ni niVar = this.f28403b;
        if (niVar != null && (niVar.f30990b0 instanceof org.telegram.ui.tn)) {
            z10 = true;
        } else {
            z10 = false;
        }
        U(z10);
    }

    public final void u0() {
        ArrayList<MediaController.AlbumEntry> arrayList;
        tl tlVar = this.f26292w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = tlVar.f23915b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f26286r0) {
            if (q0()) {
                arrayList = MediaController.allMediaAlbums;
            } else {
                arrayList = MediaController.allPhotoAlbums;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.R0 = arrayList2;
            Collections.sort(arrayList2, new jl(arrayList, 0));
        } else {
            this.R0 = new ArrayList();
        }
        boolean isEmpty = this.R0.isEmpty();
        TextView textView = this.f26294x;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f26296y, (Drawable) null);
        int size = this.R0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.R0.get(i10);
            nh.a aVar = new nh.a(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.f28402a);
            tlVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new jh.y0(this, i10 + 10, 7));
        }
    }

    public final void v0() {
        ol olVar = this.A;
        if (olVar != null) {
            for (int i10 = 0; i10 < olVar.getChildCount(); i10++) {
                View childAt = olVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r5) {
                    ((org.telegram.ui.Cells.r5) childAt).f25215a.invalidate();
                }
            }
        }
    }

    @Override
    public final void w(int i10, boolean z10) {
        V();
        yl ylVar = this.L;
        if (ylVar != null) {
            ylVar.invalidateOutline();
            this.L.invalidate();
        }
    }

    public final void w0() {
        ArrayList arrayList;
        if (this.f28403b.f30990b0 instanceof org.telegram.ui.tn) {
            ol olVar = this.A;
            int childCount = olVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f26255p1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = olVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    MediaController.PhotoEntry b02 = b0(((Integer) r5Var.getTag()).intValue());
                    if (b02 != null) {
                        r5Var.setNum(arrayList.indexOf(Integer.valueOf(b02.imageId)));
                    }
                }
                i10++;
            }
            ol olVar2 = this.f26285r;
            int childCount2 = olVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = olVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var2 = (org.telegram.ui.Cells.r5) childAt2;
                    MediaController.PhotoEntry b03 = b0(((Integer) r5Var2.getTag()).intValue());
                    if (b03 != null) {
                        r5Var2.setNum(arrayList.indexOf(Integer.valueOf(b03.imageId)));
                    }
                }
            }
        }
    }

    @Override
    public final void x() {
        ShutterButton shutterButton = this.f26269g0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.M0;
        wu0 wu0Var = wu0.f34494a;
        wu0 wu0Var2 = wu0.f34495b;
        if (!z10) {
            if (this.L != null && shutterButton.getState() == wu0Var2) {
                l0();
                CameraController.getInstance().stopVideoRecording(this.L.getCameraSession(), false);
                shutterButton.a(wu0Var);
            }
            if (this.U) {
                a0(false);
            }
            d0(true);
            return;
        }
        if (this.L != null && shutterButton.getState() == wu0Var2) {
            shutterButton.a(wu0Var);
        }
        this.M0 = false;
    }

    public final void x0() {
        ArrayList arrayList;
        cm cmVar;
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
        ni niVar = this.f28403b;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
        org.telegram.ui.ActionBar.o2 o2Var2 = niVar.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            ol olVar = this.A;
            int childCount = olVar.getChildCount();
            int i11 = 0;
            while (true) {
                arrayList = f26255p1;
                cmVar = this.C;
                hashMap = f26254o1;
                int i12 = -1;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = olVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (cmVar.f27505f && R > this.I0) {
                        R--;
                    }
                    if (cmVar.d && this.P0 == this.Q0) {
                        R--;
                    }
                    MediaController.PhotoEntry b02 = b0(R);
                    if (b02 != null && b02.hasSpoiler) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    r5Var.setHasSpoiler(z14);
                    if (b02 != null && b02.isHighQuality()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    r5Var.setHighQuality(z15);
                    if ((o2Var2 instanceof org.telegram.ui.tn) && niVar.P1) {
                        if (b02 != null) {
                            i12 = arrayList.indexOf(Integer.valueOf(b02.imageId));
                        }
                        if (b02 != null && hashMap.containsKey(Integer.valueOf(b02.imageId))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        r5Var.b(i12, z17, true);
                    } else {
                        if (b02 != null && hashMap.containsKey(Integer.valueOf(b02.imageId))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        r5Var.b(-1, z16, true);
                    }
                }
                i11++;
            }
            ol olVar2 = this.f26285r;
            int childCount2 = olVar2.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = olVar2.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var2 = (org.telegram.ui.Cells.r5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (cmVar.f27505f && R2 > this.I0) {
                        R2--;
                    }
                    if (cmVar.d && this.P0 == this.Q0) {
                        R2--;
                    }
                    MediaController.PhotoEntry b03 = b0(R2);
                    if (b03 != null && b03.hasSpoiler) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r5Var2.setHasSpoiler(z10);
                    if (b03 != null && b03.isHighQuality()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r5Var2.setHighQuality(z11);
                    if ((o2Var2 instanceof org.telegram.ui.tn) && niVar.P1) {
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
                        r5Var2.b(i10, z13, true);
                    } else {
                        if (b03 != null && hashMap.containsKey(Integer.valueOf(b03.imageId))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        r5Var2.b(-1, z12, true);
                    }
                }
            }
        }
    }

    @Override
    public final void y(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.y(int, int):void");
    }

    public final void y0(boolean z10) {
        boolean z11;
        TextView textView = this.f26279l0;
        if (textView != null) {
            ni niVar = this.f28403b;
            int i10 = niVar.M0;
            TextView textView2 = niVar.f31006f1;
            if (i10 == 0 && !niVar.P0 && !niVar.D) {
                HashMap hashMap = f26254o1;
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
                    if (max != this.I || z10) {
                        textView2.setText(LocaleController.formatPluralString("MediaSelected", max, new Object[0]));
                    }
                } else if (z12) {
                    textView.setText(LocaleController.formatPluralString("Videos", hashMap.size(), new Object[0]).toUpperCase());
                    if (max != this.I || z10) {
                        textView2.setText(LocaleController.formatPluralString("VideosSelected", max, new Object[0]));
                    }
                } else {
                    textView.setText(LocaleController.formatPluralString("Photos", hashMap.size(), new Object[0]).toUpperCase());
                    if (max != this.I || z10) {
                        textView2.setText(LocaleController.formatPluralString("PhotosSelected", max, new Object[0]));
                    }
                }
                if (max <= 1) {
                    z11 = false;
                }
                niVar.I = z11;
                niVar.f31015i1.setVisibility((!z11 || niVar.M0 == 2) ? 8 : 8);
                this.I = max;
            }
        }
    }
}
