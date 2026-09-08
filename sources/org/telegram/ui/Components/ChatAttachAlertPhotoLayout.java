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
public class ChatAttachAlertPhotoLayout extends ni implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f23858q1;
    public static final ArrayList f23859r1 = new ArrayList();
    public static final HashMap f23860s1 = new HashMap();
    public static final ArrayList f23861t1 = new ArrayList();
    public static int f23862u1 = -1;
    public float A0;
    public float B0;
    public boolean C0;
    public boolean D0;
    public final tl E;
    public final Rect E0;
    public final ci.k F;
    public float F0;
    public final hm G;
    public boolean G0;
    public final mz H;
    public boolean H0;
    public final nl0 I;
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
    public dm P;
    public boolean P0;
    public final em Q;
    public boolean Q0;
    public final bm R;
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
    public final org.telegram.ui.ActionBar.f1 Y0;
    public final org.telegram.ui.ActionBar.f1 Z0;
    public float f23863a0;
    public final org.telegram.ui.ActionBar.f1 f23864a1;
    public boolean f23865b0;
    public final org.telegram.ui.ActionBar.f1 f23866b1;
    public boolean f23867c0;
    public final org.telegram.ui.ActionBar.f1 f23868c1;
    public boolean f23869d0;
    public final vb0 f23870d1;
    public float f23871e0;
    public final boolean f23872e1;
    public final int[] f23873f0;
    public final AnimationNotificationsLocker f23874f1;
    public int f23875g0;
    public boolean f23876g1;
    public ql f23877h0;
    public final xl f23878h1;
    public final DecelerateInterpolator f23879i0;
    public boolean f23880i1;
    public final ah.y f23881j0;
    public float f23882j1;
    public final ShutterButton f23883k0;
    public float f23884k1;
    public final d91 f23885l0;
    public float l1;
    public AnimatorSet m0;
    public float f23886m1;
    public final boolean f23887n;
    public Runnable f23888n0;
    public float f23889n1;
    public Boolean f23890o0;
    public ViewPropertyAnimator f23891o1;
    public final TextView f23892p0;
    public int f23893p1;
    public final TextView f23894q0;
    public final tl f23895r;
    public final ImageView f23896r0;
    public final hg.b0 f23897s;
    public boolean f23898s0;
    public boolean f23899t0;
    public boolean f23900u0;
    public final hm v;
    public boolean f23901v0;
    public final yl f23902w;
    public boolean f23903w0;
    public final TextView f23904x;
    public boolean f23905x0;
    public final Drawable f23906y;
    public boolean f23907y0;
    public boolean f23908z0;

    public ChatAttachAlertPhotoLayout(vi viVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, viVar);
        boolean z12;
        this.S = new ImageView[2];
        this.U = new float[2];
        this.V = new int[2];
        this.f23873f0 = new int[5];
        this.f23879i0 = new DecelerateInterpolator(1.5f);
        this.f23890o0 = null;
        this.E0 = new Rect();
        int dp = AndroidUtilities.dp(80.0f);
        this.K0 = dp;
        this.L0 = dp;
        this.M0 = 3;
        this.X0 = true;
        this.f23874f1 = new AnimationNotificationsLocker();
        this.f23878h1 = new xl(this);
        this.f23872e1 = z10;
        this.f23887n = z11;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        org.telegram.ui.ActionBar.d3 container = viVar.getContainer();
        vi viVar2 = this.f28780b;
        if (viVar2.Q0 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f23876g1 = z12;
        yl ylVar = new yl(this, context, viVar2.X0.n(), f6Var, 0);
        this.f23902w = ylVar;
        ylVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = w7.x5.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = AndroidUtilities.statusBarHeight;
        this.f28780b.X0.addView(ylVar, 0, d);
        ylVar.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f26774b;

            {
                this.f26774b = this;
            }

            @Override
            public final void onClick(View view) {
                dm dmVar;
                dm dmVar2;
                int i10 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26774b;
                switch (i10) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f23898s0 && (dmVar = chatAttachAlertPhotoLayout.P) != null && dmVar.isInited()) {
                            chatAttachAlertPhotoLayout.f23867c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f23896r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new sl(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (dmVar2 = chatAttachAlertPhotoLayout.P) != null && dmVar2.isInited() && chatAttachAlertPhotoLayout.f23865b0) {
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
                                animatorSet.setInterpolator(pr.f29493f);
                                animatorSet.addListener(new bi.j4(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f23902w.M(null, null);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f23904x = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.j6.f20797j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, this.f28779a));
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.f23906y = mutate;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.f28779a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        ylVar.addView(textView, w7.x5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        U(false);
        vb0 vb0Var = new vb0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), f6Var);
        this.f23870d1 = vb0Var;
        vb0Var.a(!this.f28780b.f31295c0, false);
        this.f23868c1 = this.f28780b.f31289a1.e(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.f28780b.f31289a1.a(5);
        this.f28780b.f31289a1.e(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.Z0 = this.f28780b.f31289a1.e(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.f28780b.f31289a1.e(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.f28780b.f31289a1.a(6);
        this.Y0 = this.f28780b.f31289a1.e(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.f23864a1 = this.f28780b.f31289a1.e(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        org.telegram.ui.ActionBar.v0 v0Var = this.f28780b.f31289a1;
        v0Var.o();
        vb0Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        vb0Var.setTag(8);
        v0Var.f21405b.addView(vb0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) vb0Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        vb0Var.setLayoutParams(layoutParams);
        vb0Var.setOnClickListener(new org.telegram.ui.ActionBar.b0(v0Var, 2));
        this.f23866b1 = this.f28780b.f31289a1.e(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.f28780b.f31289a1.setFitSubItems(true);
        tl tlVar = new tl(this, context, f6Var, 1);
        this.E = tlVar;
        tlVar.setFastScrollEnabled(1);
        tlVar.setFastScrollVisible(true);
        tlVar.getFastScroll().setAlpha(0.0f);
        tlVar.getFastScroll().f30352a = false;
        tlVar.getFastScroll().f30364h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        hm hmVar = new hm(this, context, z11);
        this.G = hmVar;
        tlVar.setAdapter(hmVar);
        em emVar = new em(this, tlVar);
        this.Q = emVar;
        tlVar.i(emVar);
        for (int i11 = 0; i11 < 8; i11++) {
            hmVar.h.add(hmVar.L());
        }
        tlVar.setClipToPadding(false);
        tlVar.setItemAnimator(null);
        tlVar.setLayoutAnimation(null);
        tlVar.setVerticalScrollBarEnabled(false);
        tlVar.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, this.f28779a));
        addView(tlVar, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        tlVar.setOnScrollListener(new di.u9(this, 2));
        ci.k kVar = new ci.k(this, this.K0, 2);
        this.F = kVar;
        kVar.O = new di.x1(this, 3);
        tlVar.setLayoutManager(kVar);
        tlVar.setOnItemClickListener(new com.google.firebase.messaging.i(this, z11, f6Var, 7));
        tlVar.setOnItemLongClickListener(new il(this, 3));
        nl0 nl0Var = new nl0(new am(this));
        this.I = nl0Var;
        tlVar.E.add(nl0Var);
        this.f28781c = tlVar;
        this.d = tlVar;
        this.f28783f = true;
        mz mzVar = new mz(context, f6Var);
        this.H = mzVar;
        mzVar.setText(LocaleController.getString(R.string.NoPhotos));
        mzVar.setOnTouchListener(null);
        mzVar.setTextSize(16);
        addView(mzVar, w7.x5.c(-2.0f, -1));
        if (this.X0) {
            mzVar.b();
        } else {
            mzVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        bm bmVar = new bm(context, paint);
        this.R = bmVar;
        AndroidUtilities.updateViewVisibilityAnimated(bmVar, false, 1.0f, false);
        bmVar.setBackgroundResource(R.drawable.system);
        bmVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        bmVar.setTextSize(1, 15.0f);
        bmVar.setTypeface(AndroidUtilities.bold());
        bmVar.setAlpha(0.0f);
        bmVar.setTextColor(-1);
        bmVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(bmVar, w7.x5.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        ah.y yVar = new ah.y(this, context, 11);
        this.f23881j0 = yVar;
        yVar.setVisibility(8);
        yVar.setAlpha(0.0f);
        container.addView(yVar, w7.x5.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f23892p0 = textView2;
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
        container.addView(textView2, w7.x5.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f26774b;

            {
                this.f26774b = this;
            }

            @Override
            public final void onClick(View view) {
                dm dmVar;
                dm dmVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26774b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f23898s0 && (dmVar = chatAttachAlertPhotoLayout.P) != null && dmVar.isInited()) {
                            chatAttachAlertPhotoLayout.f23867c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f23896r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new sl(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (dmVar2 = chatAttachAlertPhotoLayout.P) != null && dmVar2.isInited() && chatAttachAlertPhotoLayout.f23865b0) {
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
                                animatorSet.setInterpolator(pr.f29493f);
                                animatorSet.addListener(new bi.j4(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f23902w.M(null, null);
                        return;
                }
            }
        });
        d91 d91Var = new d91(context);
        this.f23885l0 = d91Var;
        d91Var.setVisibility(8);
        d91Var.setAlpha(0.0f);
        container.addView(d91Var, w7.x5.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        d91Var.setDelegate(new il(this, 0));
        ?? view = new View(context);
        view.f24166b = new DecelerateInterpolator();
        view.f24173w = new org.telegram.ui.Cells.l7(view, 23);
        view.f24165a = view.getResources().getDrawable(R.drawable.camera_btn);
        Paint paint2 = new Paint(1);
        view.f24167c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f24169f = dv0.f25495a;
        this.f23883k0 = view;
        yVar.addView((View) view, w7.x5.e(84, 84, 17));
        view.setDelegate(new rl(this, f6Var, container));
        view.setFocusable(true);
        view.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.f23896r0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yVar.addView(imageView, w7.x5.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f26774b;

            {
                this.f26774b = this;
            }

            @Override
            public final void onClick(View view2) {
                dm dmVar;
                dm dmVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26774b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f23898s0 && (dmVar = chatAttachAlertPhotoLayout.P) != null && dmVar.isInited()) {
                            chatAttachAlertPhotoLayout.f23867c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f23896r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new sl(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (dmVar2 = chatAttachAlertPhotoLayout.P) != null && dmVar2.isInited() && chatAttachAlertPhotoLayout.f23865b0) {
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
                                animatorSet.setInterpolator(pr.f29493f);
                                animatorSet.addListener(new bi.j4(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f23902w.M(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i12 = 0; i12 < 2; i12++) {
            this.S[i12] = new ImageView(context);
            this.S[i12].setScaleType(ImageView.ScaleType.CENTER);
            this.S[i12].setVisibility(4);
            this.f23881j0.addView(this.S[i12], w7.x5.e(48, 48, 51));
            this.S[i12].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f26774b;

                {
                    this.f26774b = this;
                }

                @Override
                public final void onClick(View view2) {
                    dm dmVar;
                    dm dmVar2;
                    int i102 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26774b;
                    switch (i102) {
                        case 0:
                            if (chatAttachAlertPhotoLayout.P != null) {
                                chatAttachAlertPhotoLayout.j0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.f23898s0 && (dmVar = chatAttachAlertPhotoLayout.P) != null && dmVar.isInited()) {
                                chatAttachAlertPhotoLayout.f23867c0 = false;
                                chatAttachAlertPhotoLayout.P.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f23896r0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new sl(chatAttachAlertPhotoLayout));
                                duration.start();
                                return;
                            }
                            return;
                        case 2:
                            if (!chatAttachAlertPhotoLayout.T && (dmVar2 = chatAttachAlertPhotoLayout.P) != null && dmVar2.isInited() && chatAttachAlertPhotoLayout.f23865b0) {
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
                                    animatorSet.setInterpolator(pr.f29493f);
                                    animatorSet.addListener(new bi.j4(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            chatAttachAlertPhotoLayout.f23902w.M(null, null);
                            return;
                    }
                }
            });
            ImageView imageView2 = this.S[i12];
            imageView2.setContentDescription("flash mode " + i12);
        }
        TextView textView3 = new TextView(context);
        this.f23894q0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(org.telegram.ui.Cells.p6.b(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.f23881j0.addView(textView3, w7.x5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        tl tlVar2 = new tl(this, context, f6Var, 0);
        this.f23895r = tlVar2;
        tlVar2.setVerticalScrollBarEnabled(true);
        hm hmVar2 = new hm(this, context, false);
        this.v = hmVar2;
        tlVar2.setAdapter(hmVar2);
        for (int i13 = 0; i13 < 8; i13++) {
            hmVar2.h.add(hmVar2.L());
        }
        tlVar2.setClipToPadding(false);
        tlVar2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        tlVar2.setItemAnimator(null);
        tlVar2.setLayoutAnimation(null);
        tlVar2.setOverScrollMode(2);
        tlVar2.setVisibility(4);
        tlVar2.setAlpha(0.0f);
        container.addView(tlVar2, w7.x5.c(80.0f, -1));
        hg.b0 b0Var = new hg.b0(0, false, 7);
        this.f23897s = b0Var;
        tlVar2.setLayoutManager(b0Var);
        tlVar2.setOnItemClickListener(new n7(1));
    }

    public static void K(org.telegram.ui.Components.ChatAttachAlertPhotoLayout r25, boolean r26, org.telegram.ui.ActionBar.f6 r27, android.view.View r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.K(org.telegram.ui.Components.ChatAttachAlertPhotoLayout, boolean, org.telegram.ui.ActionBar.f6, android.view.View, int):void");
    }

    public static org.telegram.ui.Cells.s5 L(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        tl tlVar = chatAttachAlertPhotoLayout.E;
        int childCount = tlVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = tlVar.getChildAt(i11);
            if (childAt.getTop() < tlVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f28780b.l1() && (childAt instanceof org.telegram.ui.Cells.s5)) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                if (s5Var.getImageView().getTag() != null && ((Integer) s5Var.getImageView().getTag()).intValue() == i10) {
                    return s5Var;
                }
            }
        }
        return null;
    }

    public static int N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        vi viVar = chatAttachAlertPhotoLayout.f28780b;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
        if ((n2Var instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var).R3 == 5) {
            return n2Var.getMessagesController().config.quickReplyMessagesLimit.get() - ((org.telegram.ui.co) viVar.f31306f0).f35467u6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static void O(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        vi viVar = chatAttachAlertPhotoLayout.f28780b;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                viVar.f31306f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
            } else if (i10 >= 23) {
                viVar.f31306f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            }
        } catch (Exception unused) {
        }
    }

    public static void P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        vi viVar = chatAttachAlertPhotoLayout.f28780b;
        if (Build.VERSION.SDK_INT >= 23 && f0.e.b(viVar.f31306f0.getParentActivity(), "android.permission.CAMERA") != 0) {
            try {
                viVar.f31306f0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        chatAttachAlertPhotoLayout.i0();
    }

    public static boolean S() {
        HashMap hashMap = f23860s1;
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
            ArrayList arrayList = f23861t1;
            if (i10 >= arrayList.size()) {
                break;
            }
            Object obj = f23860s1.get(arrayList.get(i10));
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
        HashMap hashMap = f23860s1;
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
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.f23893p1;
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
    public final void A() {
        vi viVar = this.f28780b;
        if (viVar.isShowing() && !viVar.isDismissed() && !PhotoViewer.t1().Q1()) {
            U(false);
        }
    }

    @Override
    public final void B(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.B(int):void");
    }

    @Override
    public final boolean C(int i10) {
        if (this.f23865b0) {
            if (i10 == 24 || i10 == 25 || i10 == 79 || i10 == 85) {
                ((rl) this.f23883k0.getDelegate()).b();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void D(ni niVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f23891o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f23902w.setVisibility(0);
        boolean z10 = niVar instanceof qm;
        TextView textView = this.f23904x;
        if (!z10) {
            Z();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(pr.f29496j);
            this.f23891o1 = interpolator;
            interpolator.start();
        }
        this.f28780b.X0.setTitle("");
        this.F.h1(0, 0);
        if (z10) {
            this.E.post(new uc(17, this, niVar));
        }
        V();
        m0();
    }

    @Override
    public final void F() {
        this.N = false;
        dm dmVar = this.P;
        if (dmVar != null) {
            dmVar.setVisibility(0);
        }
        if (this.f23900u0) {
            this.f23900u0 = false;
            U(true);
        }
    }

    @Override
    public final void G() {
        this.E.x0(0);
    }

    public final int Q(MediaController.PhotoEntry photoEntry, int i10) {
        boolean z10;
        Integer valueOf = Integer.valueOf(photoEntry.imageId);
        HashMap hashMap = f23860s1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f23861t1;
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
                this.f23878h1.W(i10);
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
        dm dmVar = this.P;
        if (dmVar != null) {
            if (!this.f23865b0) {
                dmVar.setTranslationX(this.U[0]);
            }
            int i10 = this.K0;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2);
            if (!this.f23865b0) {
                this.P.setClipTop((int) this.W);
                this.P.setClipBottom((int) this.f23863a0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                if (layoutParams.height != dp || layoutParams.width != i10) {
                    layoutParams.width = i10;
                    layoutParams.height = dp;
                    this.P.setLayoutParams(layoutParams);
                    AndroidUtilities.runOnUIThread(new uc(18, this, layoutParams));
                }
            }
        }
    }

    public final void U(boolean z10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z11;
        hm hmVar;
        vi viVar = this.f28780b;
        boolean z12 = viVar.V;
        org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f31306f0;
        if (!z12 && this.f23887n) {
            boolean z13 = this.N0;
            boolean z14 = this.O0;
            if (n2Var2 == null) {
                n2Var = LaunchActivity.R();
            } else {
                n2Var = n2Var2;
            }
            if (n2Var != null && n2Var.getParentActivity() != null) {
                if (!SharedConfig.inappCamera) {
                    this.N0 = false;
                } else if (Build.VERSION.SDK_INT >= 23) {
                    if (n2Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.O0 = z11;
                    if (z11) {
                        if (z10) {
                            try {
                                n2Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
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
                } else {
                    if (z10 || SharedConfig.hasCameraCache) {
                        CameraController.getInstance().initCamera(null);
                    }
                    this.N0 = CameraController.getInstance().isCameraInitied();
                }
                if ((z13 != this.N0 || z14 != this.O0) && (hmVar = this.G) != null) {
                    hmVar.l();
                }
                if (!viVar.V && viVar.isShowing() && this.N0 && viVar.getBackDrawable().getAlpha() != 0 && !this.f23865b0) {
                    s0();
                }
            }
        }
    }

    public final void V() {
        s4.c1 K;
        float[] fArr;
        int i10;
        float f7;
        bm bmVar;
        int systemWindowInsetTop;
        if (!PhotoViewer.C1() || PhotoViewer.t1().p5 == null || !PhotoViewer.t1().p5.V) {
            dm dmVar = this.P;
            if (dmVar != null) {
                dmVar.invalidateOutline();
            }
            tl tlVar = this.E;
            s4.c1 K2 = tlVar.K(this.M0 - 1);
            if (K2 != null) {
                K2.f45766a.invalidateOutline();
            }
            if ((!this.G.d || !this.N0 || this.T0 != this.U0) && (K = tlVar.K(0)) != null) {
                K.f45766a.invalidateOutline();
            }
            dm dmVar2 = this.P;
            if (dmVar2 != null) {
                dmVar2.invalidate();
            }
            if (Build.VERSION.SDK_INT >= 23 && (bmVar = this.R) != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bmVar.getLayoutParams();
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
            int childCount = tlVar.getChildCount();
            int i11 = 0;
            while (true) {
                fArr = this.U;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = tlVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.l5) {
                    if (childAt.isAttachedToWindow()) {
                        float y3 = getY() + tlVar.getY() + childAt.getY();
                        vi viVar = this.f28780b;
                        ViewGroup sheetContainer = viVar.getSheetContainer();
                        yh yhVar = viVar.f31368y1;
                        ah.w wVar = viVar.O0;
                        float y10 = sheetContainer.getY() + y3;
                        float x10 = viVar.getSheetContainer().getX() + getX() + tlVar.getX() + childAt.getX();
                        if (Build.VERSION.SDK_INT >= 23) {
                            x10 -= getRootWindowInsets().getSystemWindowInsetLeft();
                        }
                        if (!viVar.f31309g0) {
                            i10 = AndroidUtilities.statusBarHeight;
                        } else {
                            i10 = 0;
                        }
                        float alpha = (wVar.getAlpha() * wVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
                        di.i iVar = viVar.B2;
                        if (iVar != null && iVar.g()) {
                            alpha = Math.max(alpha, (viVar.B2.e() + viVar.B2.getY()) - viVar.f31325l2);
                        }
                        if (y3 < alpha) {
                            f7 = alpha - y3;
                        } else {
                            f7 = 0.0f;
                        }
                        if (f7 != this.W) {
                            this.W = f7;
                            dm dmVar3 = this.P;
                            if (dmVar3 != null) {
                                dmVar3.invalidateOutline();
                                this.P.invalidate();
                            }
                        }
                        float translationY = (int) (yhVar.getTranslationY() + (viVar.getSheetContainer().getMeasuredHeight() - yhVar.getMeasuredHeight()));
                        di.i iVar2 = viVar.B2;
                        if (iVar2 != null) {
                            translationY -= iVar2.d() - AndroidUtilities.dp(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y3 > translationY) {
                            this.f23863a0 = Math.min(-AndroidUtilities.dp(5.0f), y3 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.f23863a0 = 0.0f;
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
                dm dmVar4 = this.P;
                if (dmVar4 != null) {
                    dmVar4.invalidateOutline();
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
            HashMap hashMap = f23860s1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f23861t1;
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
        boolean z10 = this.f23903w0;
        org.telegram.ui.ActionBar.f6 f6Var = this.f28779a;
        vi viVar = this.f28780b;
        if (!z10 && photoEntry.isVideo) {
            if (!viVar.a1()) {
                org.telegram.messenger.w1.p(R.string.GlobalAttachVideoRestricted, new yc(viVar.f31343r1, f6Var), null);
                return true;
            }
        } else if (!this.f23905x0 && !photoEntry.isVideo) {
            if (!viVar.a1()) {
                org.telegram.messenger.w1.p(R.string.GlobalAttachPhotoRestricted, new yc(viVar.f31343r1, f6Var), null);
                return true;
            }
        } else {
            return false;
        }
        return true;
    }

    public final void Y() {
        if (this.P0 && Build.VERSION.SDK_INT >= 23) {
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
        org.telegram.ui.ActionBar.f1 f1Var = this.Y0;
        f1Var.setText(string);
        f1Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.f28780b.f31289a1.K(1);
        HashMap hashMap = f23860s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((MediaController.PhotoEntry) entry.getValue()).reset();
            }
            hashMap.clear();
            f23861t1.clear();
        }
        ArrayList arrayList = f23859r1;
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
            ArrayList arrayList = f23861t1;
            if (i10 < arrayList.size()) {
                if (i10 == 0) {
                    Object obj = arrayList.get(i10);
                    HashMap hashMap = f23860s1;
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
        dm dmVar;
        if (!this.f23898s0 && this.P != null) {
            int i10 = this.K0;
            int[] iArr = this.f23873f0;
            iArr[1] = i10;
            iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
            Runnable runnable = this.f23888n0;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.f23888n0 = null;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20634a7, this.f28779a)) > 0.721d) {
                z11 = true;
            } else {
                z11 = false;
            }
            vi viVar = this.f28780b;
            AndroidUtilities.setLightNavigationBar(viVar, z11);
            TextView textView = this.f23892p0;
            tl tlVar = this.f23895r;
            ah.y yVar = this.f23881j0;
            tl tlVar2 = this.E;
            ImageView[] imageViewArr = this.S;
            d91 d91Var = this.f23885l0;
            if (z10) {
                this.f23882j1 = this.P.getTranslationY();
                this.f23869d0 = true;
                if (tlVar2 != null) {
                    tlVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(yVar, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(d91Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(tlVar, property, 0.0f));
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
                this.f23874f1.lock();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(pr.f29493f);
                animatorSet.addListener(new vl(this, 2));
                animatorSet.start();
            } else {
                this.f23880i1 = false;
                viVar.getWindow().clearFlags(128);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                yVar.setAlpha(0.0f);
                yVar.setVisibility(8);
                d91Var.setAlpha(0.0f);
                d91Var.setTag(null);
                d91Var.setVisibility(8);
                tlVar.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                tlVar.setVisibility(8);
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
                this.f23865b0 = false;
                dm dmVar2 = this.P;
                if (dmVar2 != null) {
                    dmVar2.setFpsLimit(30);
                    this.P.setSystemUiVisibility(1024);
                }
                if (tlVar2 != null) {
                    tlVar2.invalidate();
                }
            }
            dm dmVar3 = this.P;
            if (dmVar3 != null) {
                dmVar3.setImportantForAccessibility(0);
            }
            tlVar2.setImportantForAccessibility(0);
            if (!LiteMode.isEnabled(360928) && (dmVar = this.P) != null) {
                dmVar.showTexture(false, z10);
            }
        }
    }

    @Override
    public final boolean b() {
        return !this.f23865b0;
    }

    public final MediaController.PhotoEntry b0(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = f23859r1;
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
        for (Map.Entry entry : f23860s1.entrySet()) {
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
        boolean z10 = this.f23872e1;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.j6.f20770hg;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20797j5;
        }
        int i14 = org.telegram.ui.ActionBar.j6.f20673c7;
        org.telegram.ui.ActionBar.f6 f6Var = this.f28779a;
        this.H.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, f6Var);
        tl tlVar = this.E;
        tlVar.setGlowColor(v02);
        tlVar.K(0);
        this.f23904x.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        if (z10) {
            i11 = org.telegram.ui.ActionBar.j6.f20770hg;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.E8;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        yl ylVar = this.f23902w;
        ylVar.G(v03, false);
        if (z10) {
            i12 = org.telegram.ui.ActionBar.j6.f20770hg;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.E8;
        }
        ylVar.G(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), true);
        if (z10) {
            i13 = org.telegram.ui.ActionBar.j6.f20808jg;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.G8;
        }
        ylVar.B(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), this.f23906y);
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
            AndroidUtilities.runOnUIThread(new ll(this, 0), 300L);
            this.f23867c0 = false;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        vi viVar;
        if (i10 == NotificationCenter.albumsDidLoad) {
            hm hmVar = this.G;
            if (hmVar != null) {
                if (q0()) {
                    this.U0 = MediaController.allMediaAlbumEntry;
                } else {
                    this.U0 = MediaController.allPhotosAlbumEntry;
                }
                if (this.T0 != null && ((viVar = this.f28780b) == null || !viVar.G)) {
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
                hmVar.l();
                this.v.l();
                ArrayList arrayList = f23861t1;
                if (!arrayList.isEmpty() && this.U0 != null) {
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        Integer num = (Integer) arrayList.get(i14);
                        HashMap hashMap = f23860s1;
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
            findActivity = this.f28780b.f31306f0.getParentActivity();
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
        MediaController.AlbumEntry albumEntry = this.T0;
        ArrayList<Object> arrayList = f23859r1;
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
        return this.f23871e0;
    }

    @Override
    public int getCurrentItemTop() {
        tl tlVar = this.E;
        int childCount = tlVar.getChildCount();
        mz mzVar = this.H;
        if (childCount <= 0) {
            tlVar.setTopGlowOffset(tlVar.getPaddingTop());
            mzVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = tlVar.getChildAt(0);
        vk0 vk0Var = (vk0) tlVar.G(childAt);
        int top = childAt.getTop() - this.f23893p1;
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        mzVar.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - mzVar.getMeasuredHeight()) / 2.0f) + top);
        tlVar.setTopGlowOffset(top);
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
        return f23861t1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f23860s1;
    }

    public int getSelectedPhotosCount() {
        int i10 = 0;
        for (Object obj : f23860s1.values()) {
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
        for (Object obj : f23860s1.values()) {
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
        return f23861t1;
    }

    public long getStarsPrice() {
        Iterator it = f23860s1.entrySet().iterator();
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
        dm dmVar;
        if (this.P != null && this.O == null) {
            vi viVar = this.f28780b;
            if (!viVar.isDismissed()) {
                this.P.initTexture();
                boolean q02 = q0();
                TextView textView = this.f23894q0;
                int i10 = 0;
                if (q02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f23859r1.isEmpty();
                tl tlVar = this.f23895r;
                TextView textView2 = this.f23892p0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    tlVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    tlVar.setVisibility(0);
                }
                if (viVar.m1().v && isFocusable()) {
                    viVar.m1().d();
                }
                d91 d91Var = this.f23885l0;
                d91Var.setVisibility(0);
                d91Var.setAlpha(0.0f);
                ah.y yVar = this.f23881j0;
                yVar.setVisibility(0);
                yVar.setTag(null);
                int[] iArr = this.f23873f0;
                iArr[0] = 0;
                int i11 = this.K0;
                iArr[1] = i11;
                iArr[2] = AndroidUtilities.dp(2.0f) + (i11 * 2);
                this.f23882j1 = 0.0f;
                this.f23880i1 = true;
                dm dmVar2 = this.P;
                if (dmVar2 != null) {
                    dmVar2.setFpsLimit(-1);
                }
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.setLightNavigationBar((Dialog) viVar, false);
                viVar.getWindow().addFlags(128);
                tl tlVar2 = this.E;
                ImageView[] imageViewArr = this.S;
                if (z10) {
                    setCameraOpenProgress(0.0f);
                    this.f23869d0 = true;
                    if (tlVar2 != null) {
                        tlVar2.invalidate();
                    }
                    this.f23874f1.lock();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(yVar, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(tlVar, property, 1.0f));
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
                    animatorSet.setInterpolator(pr.f29493f);
                    animatorSet.addListener(new vl(this, 1));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    yVar.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    tlVar.setAlpha(1.0f);
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
                    viVar.Z1.H();
                    dm dmVar3 = this.P;
                    if (dmVar3 != null) {
                        dmVar3.setSystemUiVisibility(1028);
                    }
                }
                this.f23865b0 = true;
                dm dmVar4 = this.P;
                if (dmVar4 != null) {
                    dmVar4.setImportantForAccessibility(2);
                }
                tlVar2.setImportantForAccessibility(4);
                tlVar2.invalidate();
                if (!LiteMode.isEnabled(360928) && (dmVar = this.P) != null && dmVar.isInited()) {
                    this.P.showTexture(true, z10);
                }
            }
        }
    }

    public final void i0() {
        if (SharedConfig.inappCamera) {
            h0(true);
            return;
        }
        vi viVar = this.f28780b;
        ti tiVar = viVar.Z1;
        if (tiVar != null) {
            tiVar.l0(0, false, true, 0, 0, 0L, viVar.s1(), false, 0L);
        }
    }

    @Override
    public final void j() {
        V();
        invalidate();
    }

    public final void j0(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        int i10;
        org.telegram.ui.co coVar;
        int i11;
        org.telegram.ui.co coVar2;
        ArrayList<Object> arrayList;
        int i12;
        ArrayList arrayList2 = f23859r1;
        vi viVar = this.f28780b;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            f23860s1.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            f23861t1.add(Integer.valueOf(photoEntry.imageId));
            viVar.V1(0);
            this.G.l();
            this.v.l();
        }
        if (photoEntry != null && !z11 && arrayList2.size() > 1) {
            y0(false);
            if (this.P != null) {
                this.f23885l0.b(0.0f, false);
                this.B0 = 0.0f;
                this.P.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f23899t0 = true;
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
            org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f31306f0;
            if (n2Var == null) {
                n2Var = LaunchActivity.R();
            }
            if (n2Var != null) {
                PhotoViewer.t1().K2(n2Var.getParentActivity(), null, this.f28779a);
                PhotoViewer.t1().L2(viVar);
                PhotoViewer t12 = PhotoViewer.t1();
                int i13 = viVar.S1;
                boolean z12 = viVar.T1;
                t12.h = i13;
                t12.f33652n = z12;
                if (viVar.F && viVar.G) {
                    coVar = (org.telegram.ui.co) n2Var2;
                    i10 = 11;
                } else if (viVar.Q0 != 0) {
                    coVar = null;
                    i10 = 1;
                } else if (n2Var2 instanceof org.telegram.ui.co) {
                    coVar = (org.telegram.ui.co) n2Var2;
                    i10 = 2;
                } else {
                    i10 = 5;
                    coVar = null;
                }
                boolean z13 = viVar.H;
                if (z13) {
                    coVar2 = null;
                    i11 = 13;
                } else {
                    i11 = i10;
                    coVar2 = coVar;
                }
                if (viVar.Q0 == 0 && !z13) {
                    arrayList = getAllPhotosArray();
                    i12 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(photoEntry);
                    i12 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                s40 s40Var = viVar.Q;
                if (s40Var != null && photoEntry != null) {
                    s40Var.f30216e = photoEntry.isVideo;
                }
                PhotoViewer.t1().f2(arrayList3, i12, i11, false, new ul(this, z10), coVar2);
                PhotoViewer.t1().x2(viVar.Q);
                if (viVar.G) {
                    PhotoViewer.t1().X0(null, null, false, viVar.J);
                    PhotoViewer.t1().l2();
                }
            }
        }
    }

    @Override
    public final void k(float f7) {
        this.W0 = f7;
        V();
        dm dmVar = this.P;
        if (dmVar != null) {
            dmVar.invalidateOutline();
            this.P.invalidate();
        }
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
    public final boolean l(MotionEvent motionEvent) {
        dm dmVar;
        if (!this.f23869d0) {
            if (this.f23865b0 && motionEvent != null) {
                boolean z10 = this.G0;
                d91 d91Var = this.f23885l0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.E0;
                    d91Var.getHitRect(rect);
                    if (d91Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f23898s0 && !this.I0) {
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
                    tl tlVar = this.f23895r;
                    TextView textView = this.f23892p0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.S;
                    ah.y yVar = this.f23881j0;
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
                                d91Var.b(this.B0, false);
                                this.f28780b.getSheetContainer().invalidate();
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
                            } else if (this.I0 && (dmVar = this.P) != null) {
                                dmVar.setTranslationY(dmVar.getTranslationY() + f7);
                                this.F0 = y3;
                                d91Var.setTag(null);
                                Runnable runnable = this.f23888n0;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.f23888n0 = null;
                                }
                                if (yVar.getTag() == null) {
                                    yVar.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(yVar, property, 0.0f), ObjectAnimator.ofFloat(d91Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(tlVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(pr.f29493f);
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
                            dm dmVar2 = this.P;
                            if (dmVar2 != null) {
                                if (Math.abs(dmVar2.getTranslationY()) > this.P.getMeasuredHeight() / 6.0f) {
                                    a0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.P, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(yVar, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(tlVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f23879i0);
                                animatorSet2.start();
                                yVar.setTag(null);
                                return true;
                            }
                        } else {
                            dm dmVar3 = this.P;
                            if (dmVar3 != null && !this.D0) {
                                int[] iArr = this.V;
                                dmVar3.getLocationOnScreen(iArr);
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

    public final void l0() {
        if (this.f28780b.V) {
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.S[i10].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(pr.f29493f).start();
        }
        ViewPropertyAnimator duration = this.f23896r0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        pr prVar = pr.f29493f;
        duration.setInterpolator(prVar).start();
        this.f23894q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
        AndroidUtilities.updateViewVisibilityAnimated(this.R, false);
        AndroidUtilities.cancelRunOnUIThread(this.f23877h0);
        this.f23877h0 = null;
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
            if (this.P != null) {
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final boolean n() {
        if (this.f23869d0) {
            return true;
        }
        if (this.f23865b0) {
            a0(true);
            return true;
        }
        d0(true);
        return false;
    }

    public final void n0() {
        if (this.f23867c0) {
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
        if (this.S0 != i14) {
            this.S0 = i14;
            hm hmVar = this.G;
            if (hmVar != null) {
                hmVar.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        V();
    }

    public final void p0(int i10, final boolean z10) {
        PhotoViewer t12 = PhotoViewer.t1();
        if (i10 == -1) {
            i10 = t12.P4;
        }
        ArrayList arrayList = t12.f33600g7;
        if (arrayList != null && !arrayList.isEmpty() && i10 < arrayList.size() && (arrayList.get(i10) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) arrayList.get(i10)).hasSpoiler) {
            final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
            this.E.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z11 = ChatAttachAlertPhotoLayout.f23858q1;
                    if (view instanceof org.telegram.ui.Cells.s5) {
                        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                        if (s5Var.getPhotoEntry() == photoEntry) {
                            s5Var.c(z10, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z12 = true;
                            if (ChatAttachAlertPhotoLayout.f23860s1.size() <= 1) {
                                z12 = false;
                            }
                            s5Var.f(starsPrice, z12);
                        }
                    }
                }
            });
        }
    }

    @Override
    public final void q() {
        dm dmVar = this.P;
        if (dmVar != null) {
            dmVar.setVisibility(8);
        }
        for (Map.Entry entry : f23860s1.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.G.l();
    }

    public final boolean q0() {
        if (!this.f23907y0) {
            vi viVar = this.f28780b;
            if (!viVar.F) {
                if (!(viVar.f31306f0 instanceof org.telegram.ui.co) && !viVar.T0 && viVar.Q0 != 2) {
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
        this.N = true;
        tl tlVar = this.E;
        int childCount = tlVar.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (tlVar.getChildAt(i10) instanceof org.telegram.ui.Cells.l5) {
                n0();
                break;
            } else {
                this.Q.g();
                i10++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f23891o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f23904x.animate().alpha(0.0f).setDuration(150L).setInterpolator(pr.f29496j).withEndAction(new ll(this, 1));
        this.f23891o1 = withEndAction;
        withEndAction.start();
        k0();
    }

    public final void r0(h9 h9Var, TLRPC.VideoSize videoSize, long j3) {
        boolean z10;
        vi viVar = this.f28780b;
        f9 f9Var = new f9(viVar.U, viVar.Q);
        s40 s40Var = viVar.Q;
        if (s40Var != null && s40Var.f30215c == 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        f9Var.Q = z10;
        viVar.f31306f0.presentFragment(f9Var);
        if (h9Var != null) {
            f9Var.m0(h9Var);
        }
        if (videoSize != null) {
            f9Var.l0(videoSize);
        }
        if (j3 != 0) {
            f9Var.k0(j3);
        }
        f9Var.I = new b3(4, this, f9Var);
    }

    @Override
    public final void requestLayout() {
        if (this.R0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(float f7) {
        dm dmVar = this.P;
        if (dmVar != null) {
            dmVar.setAlpha(f7);
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i10 != 0 && this.P.getVisibility() != 0) {
                this.P.setVisibility(0);
            } else if (i10 == 0 && this.P.getVisibility() != 4) {
                this.P.setVisibility(4);
            }
        }
    }

    public final void s0() {
        boolean z10;
        boolean z11;
        float f7;
        vi viVar = this.f28780b;
        if (!viVar.f31308f2 && this.f23901v0 && CameraView.isCameraAllowed()) {
            if (this.P == null) {
                boolean z12 = !LiteMode.isEnabled(360928);
                Context context = getContext();
                Boolean bool = this.f23890o0;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = viVar.U1;
                }
                dm dmVar = new dm(this, context, z10, z12);
                this.P = dmVar;
                org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
                if ((n2Var instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var).v()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dmVar.setRecordFile(AndroidUtilities.generateVideoPath(z11));
                this.P.setFocusable(true);
                this.P.setFpsLimit(30);
                this.P.setOutlineProvider(new dh.b(this, 1));
                this.P.setClipToOutline(true);
                this.P.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                org.telegram.ui.ActionBar.d3 container = viVar.getContainer();
                dm dmVar2 = this.P;
                int i10 = this.K0;
                container.addView(dmVar2, 1, new FrameLayout.LayoutParams(i10, i10));
                this.P.setDelegate(new wl(this));
                dm dmVar3 = this.P;
                if (this.f23901v0) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.2f;
                }
                dmVar3.setAlpha(f7);
                this.P.setEnabled(this.f23901v0);
                if (this.N) {
                    this.P.setVisibility(8);
                }
                if (!this.f23865b0) {
                    V();
                }
                tl tlVar = this.E;
                if (tlVar != null) {
                    tlVar.invalidate();
                }
                invalidate();
            }
            d91 d91Var = this.f23885l0;
            if (d91Var != null) {
                d91Var.b(0.0f, false);
                this.B0 = 0.0f;
            }
            if (!this.f23865b0) {
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
        this.f23871e0 = f7;
        int[] iArr = this.f23873f0;
        float f10 = iArr[1];
        float f11 = iArr[2];
        int i12 = AndroidUtilities.displaySize.x;
        vi viVar = this.f28780b;
        float width = (viVar.getContainer().getWidth() - viVar.getLeftInset()) - viVar.getRightInset();
        float height = viVar.getContainer().getHeight();
        float[] fArr = this.U;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = this.f23882j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
        float textureHeight = this.P.getTextureHeight(f10, f11) / this.P.getTextureHeight(width, height);
        float f15 = f11 / height;
        float f16 = f10 / width;
        if (this.f23880i1) {
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
            this.f23884k1 = f20 - this.P.getTranslationY();
            this.l1 = (height * f7) + (((f13 + f11) * f17) - this.P.getTranslationY());
            this.f23889n1 = f19 - this.P.getTranslationX();
            this.f23886m1 = (width * f7) + (((f12 + f10) * f17) - this.P.getTranslationX());
        } else {
            i10 = (int) f10;
            i11 = (int) f11;
            this.P.getTextureView().setScaleX(1.0f);
            this.P.getTextureView().setScaleY(1.0f);
            this.f23884k1 = 0.0f;
            this.l1 = height;
            this.f23889n1 = 0.0f;
            this.f23886m1 = width;
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
        this.f23900u0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.f23907y0 = z10;
    }

    public void setStarsPrice(long j3) {
        boolean z10;
        HashMap hashMap = f23860s1;
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
        B(getSelectedItemsCount());
        if (W(false)) {
            x0();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        vi viVar = this.f28780b;
        if (viVar.getSheetAnimationType() == 1) {
            float f10 = (f7 / 40.0f) * (-0.1f);
            tl tlVar = this.E;
            int childCount = tlVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = tlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    float f11 = 1.0f + f10;
                    s5Var.getCheckBox().setScaleX(f11);
                    s5Var.getCheckBox().setScaleY(f11);
                }
            }
        }
        super.setTranslationY(f7);
        viVar.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void t(int i10) {
        TLRPC.Chat k12;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        vi viVar = this.f28780b;
        if (i10 == 8) {
            viVar.H1(!viVar.f31295c0, true);
            this.f23870d1.a(!viVar.f31295c0, true);
        } else if ((i10 == 0 || i10 == 1) && viVar.S1 > 0 && f23861t1.size() > 1 && (k12 = viVar.k1()) != null && !ChatObject.hasAdminRights(k12) && k12.slowmode_enabled) {
            e5.O(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.f28779a).o();
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.f28779a;
            HashMap hashMap = f23860s1;
            if (i10 == 0) {
                MessageObject messageObject = viVar.H1;
                org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
                if (messageObject == null && (n2Var instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var).c()) {
                    e5.M(getContext(), ((org.telegram.ui.co) n2Var).a(), new il(this, 1), f6Var);
                } else {
                    e5.a0(viVar.J1, viVar.j1() + hashMap.size(), viVar.n1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f27558b;

                        {
                            this.f27558b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27558b;
                            Long l4 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f23858q1;
                                    vi viVar2 = chatAttachAlertPhotoLayout.f28780b;
                                    viVar2.Y0();
                                    viVar2.Z1.l0(7, false, true, 0, 0, 0L, viVar2.s1(), false, l4.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f23858q1;
                                    vi viVar3 = chatAttachAlertPhotoLayout.f28780b;
                                    viVar3.Y0();
                                    viVar3.Z1.l0(4, true, true, 0, 0, 0L, viVar3.s1(), false, l4.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i10 == 1) {
                MessageObject messageObject2 = viVar.H1;
                org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f31306f0;
                if (messageObject2 == null && (n2Var2 instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var2).c()) {
                    e5.M(getContext(), ((org.telegram.ui.co) n2Var2).a(), new il(this, 2), f6Var);
                } else {
                    e5.a0(viVar.J1, viVar.j1() + hashMap.size(), viVar.n1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f27558b;

                        {
                            this.f27558b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27558b;
                            Long l4 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f23858q1;
                                    vi viVar2 = chatAttachAlertPhotoLayout.f28780b;
                                    viVar2.Y0();
                                    viVar2.Z1.l0(7, false, true, 0, 0, 0L, viVar2.s1(), false, l4.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f23858q1;
                                    vi viVar3 = chatAttachAlertPhotoLayout.f28780b;
                                    viVar3.Y0();
                                    viVar3.Z1.l0(4, true, true, 0, 0, 0L, viVar3.s1(), false, l4.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                hm hmVar = this.G;
                tl tlVar = this.E;
                if (i10 == 3) {
                    qm qmVar = viVar.f31338q0;
                    if (qmVar != null) {
                        qmVar.K();
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
                        public final ChatAttachAlertPhotoLayout f27877b;

                        {
                            this.f27877b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z14 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27877b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f23858q1;
                                    vi viVar2 = chatAttachAlertPhotoLayout.f28780b;
                                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.Y0;
                                    if (z14) {
                                        i11 = R.string.DisablePhotoSpoiler;
                                    } else {
                                        i11 = R.string.EnablePhotoSpoiler;
                                    }
                                    f1Var.setText(LocaleController.getString(i11));
                                    if (z14) {
                                        f1Var.setIcon(R.drawable.msg_spoiler_off);
                                    } else {
                                        f1Var.setAnimatedIcon(R.raw.photo_spoiler);
                                    }
                                    if (z14) {
                                        viVar2.f31289a1.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            viVar2.f31289a1.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    viVar2.f31289a1.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        viVar2.f31289a1.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.f1 f1Var2 = chatAttachAlertPhotoLayout.f23864a1;
                                    if (z14) {
                                        i12 = R.string.SendInStandardQuality;
                                    } else {
                                        i12 = R.string.SendInHighQuality;
                                    }
                                    f1Var2.setText(LocaleController.getString(i12));
                                    if (z14) {
                                        f1Var2.setIcon(R.drawable.menu_quality_sd);
                                        return;
                                    } else {
                                        f1Var2.setIcon(R.drawable.menu_quality_hd);
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
                    tlVar.M(new ml(0, arrayList, z13));
                    if (viVar.f31367y0 != this) {
                        hmVar.l();
                    }
                    qm qmVar2 = viVar.f31338q0;
                    if (qmVar2 != null) {
                        qmVar2.v.invalidate();
                    }
                } else if (i10 == 2) {
                    qm qmVar3 = viVar.f31338q0;
                    if (qmVar3 != null) {
                        qmVar3.K();
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
                        public final ChatAttachAlertPhotoLayout f27877b;

                        {
                            this.f27877b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z142 = z14;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27877b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f23858q1;
                                    vi viVar2 = chatAttachAlertPhotoLayout.f28780b;
                                    org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.Y0;
                                    if (z142) {
                                        i11 = R.string.DisablePhotoSpoiler;
                                    } else {
                                        i11 = R.string.EnablePhotoSpoiler;
                                    }
                                    f1Var.setText(LocaleController.getString(i11));
                                    if (z142) {
                                        f1Var.setIcon(R.drawable.msg_spoiler_off);
                                    } else {
                                        f1Var.setAnimatedIcon(R.raw.photo_spoiler);
                                    }
                                    if (z142) {
                                        viVar2.f31289a1.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            viVar2.f31289a1.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    viVar2.f31289a1.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        viVar2.f31289a1.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.f1 f1Var2 = chatAttachAlertPhotoLayout.f23864a1;
                                    if (z142) {
                                        i12 = R.string.SendInStandardQuality;
                                    } else {
                                        i12 = R.string.SendInHighQuality;
                                    }
                                    f1Var2.setText(LocaleController.getString(i12));
                                    if (z142) {
                                        f1Var2.setIcon(R.drawable.menu_quality_sd);
                                        return;
                                    } else {
                                        f1Var2.setIcon(R.drawable.menu_quality_hd);
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
                    tlVar.M(new ml(1, arrayList2, z14));
                    if (viVar.f31367y0 != this) {
                        hmVar.l();
                    }
                    qm qmVar4 = viVar.f31338q0;
                    if (qmVar4 != null) {
                        qmVar4.v.invalidate();
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
                            int i11 = viVar.Q0;
                            org.telegram.ui.ActionBar.n2 n2Var3 = viVar.f31306f0;
                            if (i11 != 0) {
                                n2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                n2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i12 = viVar.Q0;
                            org.telegram.ui.ActionBar.n2 n2Var4 = viVar.f31306f0;
                            if (i12 != 0) {
                                n2Var4.startActivityForResult(intent3, 14);
                            } else {
                                n2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        viVar.dismiss(true);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else if (i10 == 7) {
                    if (viVar.f31367y0 == viVar.f31338q0) {
                        z12 = false;
                    }
                    viVar.Z1(z12);
                } else if (i10 == 9) {
                    zh.v7.g1(getContext(), getStarsPrice(), true, new d(this, 6), this.f28779a);
                } else if (i10 >= 10) {
                    MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.V0.get(i10 - 10);
                    this.T0 = albumEntry;
                    MediaController.AlbumEntry albumEntry2 = this.U0;
                    TextView textView = this.f23904x;
                    if (albumEntry == albumEntry2) {
                        textView.setText(LocaleController.getString(R.string.ChatGallery));
                    } else {
                        textView.setText(albumEntry.bucketName);
                    }
                    hmVar.l();
                    this.v.l();
                    this.F.h1(0, -(tlVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void t0(boolean z10) {
        Integer num;
        float f7;
        d91 d91Var = this.f23885l0;
        if ((d91Var.getTag() != null && z10) || (d91Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f23888n0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                ll llVar = new ll(this, 3);
                this.f23888n0 = llVar;
                AndroidUtilities.runOnUIThread(llVar, 2000L);
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
        d91Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.m0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(d91Var, View.ALPHA, f7));
        this.m0.addListener(new vl(this, 0));
        this.m0.start();
        if (z10) {
            ll llVar2 = new ll(this, 4);
            this.f23888n0 = llVar2;
            AndroidUtilities.runOnUIThread(llVar2, 2000L);
        }
    }

    @Override
    public final void u() {
        boolean z10;
        vi viVar = this.f28780b;
        if (viVar != null && (viVar.f31306f0 instanceof org.telegram.ui.co)) {
            z10 = true;
        } else {
            z10 = false;
        }
        U(z10);
    }

    public final void u0() {
        ArrayList<MediaController.AlbumEntry> arrayList;
        yl ylVar = this.f23902w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ylVar.f21405b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f23901v0) {
            if (q0()) {
                arrayList = MediaController.allMediaAlbums;
            } else {
                arrayList = MediaController.allPhotoAlbums;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.V0 = arrayList2;
            Collections.sort(arrayList2, new ol(arrayList, 0));
        } else {
            this.V0 = new ArrayList();
        }
        boolean isEmpty = this.V0.isEmpty();
        TextView textView = this.f23904x;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f23906y, (Drawable) null);
        int size = this.V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.V0.get(i10);
            di.a aVar = new di.a(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.f28779a);
            ylVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new di.o4(this, i10 + 10, 8));
        }
    }

    public final void v0() {
        tl tlVar = this.E;
        if (tlVar != null) {
            for (int i10 = 0; i10 < tlVar.getChildCount(); i10++) {
                View childAt = tlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    ((org.telegram.ui.Cells.s5) childAt).f22858a.invalidate();
                }
            }
        }
    }

    @Override
    public final void w(int i10, boolean z10) {
        V();
        dm dmVar = this.P;
        if (dmVar != null) {
            dmVar.invalidateOutline();
            this.P.invalidate();
        }
    }

    public final void w0() {
        ArrayList arrayList;
        if (this.f28780b.f31306f0 instanceof org.telegram.ui.co) {
            tl tlVar = this.E;
            int childCount = tlVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f23861t1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = tlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    MediaController.PhotoEntry b02 = b0(((Integer) s5Var.getTag()).intValue());
                    if (b02 != null) {
                        s5Var.setNum(arrayList.indexOf(Integer.valueOf(b02.imageId)));
                    }
                }
                i10++;
            }
            tl tlVar2 = this.f23895r;
            int childCount2 = tlVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = tlVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) childAt2;
                    MediaController.PhotoEntry b03 = b0(((Integer) s5Var2.getTag()).intValue());
                    if (b03 != null) {
                        s5Var2.setNum(arrayList.indexOf(Integer.valueOf(b03.imageId)));
                    }
                }
            }
        }
    }

    @Override
    public final void x() {
        ShutterButton shutterButton = this.f23883k0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.Q0;
        dv0 dv0Var = dv0.f25495a;
        dv0 dv0Var2 = dv0.f25496b;
        if (!z10) {
            if (this.P != null && shutterButton.getState() == dv0Var2) {
                l0();
                CameraController.getInstance().stopVideoRecording(this.P.getCameraSession(), false);
                shutterButton.a(dv0Var);
            }
            if (this.f23865b0) {
                a0(false);
            }
            d0(true);
            return;
        }
        if (this.P != null && shutterButton.getState() == dv0Var2) {
            shutterButton.a(dv0Var);
        }
        this.Q0 = false;
    }

    public final void x0() {
        ArrayList arrayList;
        hm hmVar;
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
        vi viVar = this.f28780b;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
        org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f31306f0;
        if (n2Var instanceof org.telegram.ui.co) {
            tl tlVar = this.E;
            int childCount = tlVar.getChildCount();
            int i11 = 0;
            while (true) {
                arrayList = f23861t1;
                hmVar = this.G;
                hashMap = f23860s1;
                int i12 = -1;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = tlVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (hmVar.f26781f && R > this.M0) {
                        R--;
                    }
                    if (hmVar.d && this.T0 == this.U0) {
                        R--;
                    }
                    MediaController.PhotoEntry b02 = b0(R);
                    if (b02 != null && b02.hasSpoiler) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    s5Var.setHasSpoiler(z14);
                    if (b02 != null && b02.isHighQuality()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    s5Var.setHighQuality(z15);
                    if ((n2Var2 instanceof org.telegram.ui.co) && viVar.T1) {
                        if (b02 != null) {
                            i12 = arrayList.indexOf(Integer.valueOf(b02.imageId));
                        }
                        if (b02 != null && hashMap.containsKey(Integer.valueOf(b02.imageId))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        s5Var.b(i12, z17, true);
                    } else {
                        if (b02 != null && hashMap.containsKey(Integer.valueOf(b02.imageId))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        s5Var.b(-1, z16, true);
                    }
                }
                i11++;
            }
            tl tlVar2 = this.f23895r;
            int childCount2 = tlVar2.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = tlVar2.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (hmVar.f26781f && R2 > this.M0) {
                        R2--;
                    }
                    if (hmVar.d && this.T0 == this.U0) {
                        R2--;
                    }
                    MediaController.PhotoEntry b03 = b0(R2);
                    if (b03 != null && b03.hasSpoiler) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s5Var2.setHasSpoiler(z10);
                    if (b03 != null && b03.isHighQuality()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    s5Var2.setHighQuality(z11);
                    if ((n2Var2 instanceof org.telegram.ui.co) && viVar.T1) {
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
                        s5Var2.b(i10, z13, true);
                    } else {
                        if (b03 != null && hashMap.containsKey(Integer.valueOf(b03.imageId))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        s5Var2.b(-1, z12, true);
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
        TextView textView = this.f23892p0;
        if (textView != null) {
            vi viVar = this.f28780b;
            int i10 = viVar.Q0;
            TextView textView2 = viVar.f31319j1;
            if (i10 == 0 && !viVar.T0 && !viVar.H) {
                HashMap hashMap = f23860s1;
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
                viVar.M = z11;
                viVar.f31326m1.setVisibility((!z11 || viVar.Q0 == 2) ? 8 : 8);
                this.M = max;
            }
        }
    }
}
