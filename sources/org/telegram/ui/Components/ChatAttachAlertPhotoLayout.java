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
import android.view.Window;
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
public class ChatAttachAlertPhotoLayout extends li implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f26017q1;
    public static final ArrayList f26018r1 = new ArrayList();
    public static final HashMap f26019s1 = new HashMap();
    public static final ArrayList f26020t1 = new ArrayList();
    public static int f26021u1 = -1;
    public float A0;
    public float B0;
    public boolean C0;
    public boolean D0;
    public final fm E;
    public final Rect E0;
    public final ei.k F;
    public float F0;
    public final tm G;
    public boolean G0;
    public final uz H;
    public boolean H0;
    public final rm0 I;
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
    public pm P;
    public boolean P0;
    public final qm Q;
    public boolean Q0;
    public final nm R;
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
    public final org.telegram.ui.ActionBar.g1 Y0;
    public final org.telegram.ui.ActionBar.g1 Z0;
    public float f26022a0;
    public final org.telegram.ui.ActionBar.g1 f26023a1;
    public boolean f26024b0;
    public final org.telegram.ui.ActionBar.g1 f26025b1;
    public boolean f26026c0;
    public final org.telegram.ui.ActionBar.g1 f26027c1;
    public boolean f26028d0;
    public final nc0 f26029d1;
    public float f26030e0;
    public final boolean f26031e1;
    public final int[] f26032f0;
    public final AnimationNotificationsLocker f26033f1;
    public int f26034g0;
    public boolean f26035g1;
    public cm f26036h0;
    public final jm f26037h1;
    public final DecelerateInterpolator f26038i0;
    public boolean f26039i1;
    public final bh.r f26040j0;
    public float f26041j1;
    public final ShutterButton f26042k0;
    public float f26043k1;
    public final kc1 f26044l0;
    public float l1;
    public AnimatorSet m0;
    public float f26045m1;
    public final boolean f26046n;
    public Runnable f26047n0;
    public float f26048n1;
    public Boolean f26049o0;
    public ViewPropertyAnimator f26050o1;
    public final TextView f26051p0;
    public int f26052p1;
    public final TextView f26053q0;
    public final fm f26054r;
    public final ImageView f26055r0;
    public final ig.a0 f26056s;
    public boolean f26057s0;
    public boolean f26058t0;
    public boolean f26059u0;
    public final tm v;
    public boolean f26060v0;
    public final km f26061w;
    public boolean f26062w0;
    public final TextView f26063x;
    public boolean f26064x0;
    public final Drawable f26065y;
    public boolean f26066y0;
    public boolean f26067z0;

    public ChatAttachAlertPhotoLayout(ti tiVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, tiVar);
        boolean z12;
        this.S = new ImageView[2];
        this.U = new float[2];
        this.V = new int[2];
        this.f26032f0 = new int[5];
        this.f26038i0 = new DecelerateInterpolator(1.5f);
        this.f26049o0 = null;
        this.E0 = new Rect();
        int dp = AndroidUtilities.dp(80.0f);
        this.K0 = dp;
        this.L0 = dp;
        this.M0 = 3;
        this.X0 = true;
        this.f26033f1 = new AnimationNotificationsLocker();
        this.f26037h1 = new jm(this);
        this.f26031e1 = z10;
        this.f26046n = z11;
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.cameraInitied);
        org.telegram.ui.ActionBar.h3 container = tiVar.getContainer();
        ti tiVar2 = this.f30254b;
        if (tiVar2.T0 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f26035g1 = z12;
        km kmVar = new km(this, context, tiVar2.f32974a1.l(), u6Var, 0);
        this.f26061w = kmVar;
        kmVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams h = kb1.h(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        h.topMargin = AndroidUtilities.statusBarHeight;
        this.f30254b.f32974a1.addView(kmVar, 0, h);
        kmVar.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f33079b;

            {
                this.f33079b = this;
            }

            @Override
            public final void onClick(View view) {
                pm pmVar;
                pm pmVar2;
                int i10 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33079b;
                switch (i10) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.k0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f26057s0 && (pmVar = chatAttachAlertPhotoLayout.P) != null && pmVar.isInited()) {
                            chatAttachAlertPhotoLayout.f26026c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26055r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new em(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (pmVar2 = chatAttachAlertPhotoLayout.P) != null && pmVar2.isInited() && chatAttachAlertPhotoLayout.f26024b0) {
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
                                ChatAttachAlertPhotoLayout.p0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(ds.f27530f);
                                animatorSet.addListener(new di.o3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f26061w.U(null, null);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f26063x = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.f26065y = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.y(this, mutate, i10, u6Var, mode);
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        kmVar.addView(textView, kb1.h(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        V(false);
        nc0 nc0Var = new nc0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), u6Var);
        this.f26029d1 = nc0Var;
        nc0Var.a(!this.f30254b.f32980c0, false);
        this.f26027c1 = this.f30254b.f32984d1.e(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.f30254b.f32984d1.a(5);
        this.f30254b.f32984d1.e(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.Z0 = this.f30254b.f32984d1.e(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.f30254b.f32984d1.e(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.f30254b.f32984d1.a(6);
        this.Y0 = this.f30254b.f32984d1.e(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.f26023a1 = this.f30254b.f32984d1.e(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        org.telegram.ui.ActionBar.w0 w0Var = this.f30254b.f32984d1;
        w0Var.p();
        nc0Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        nc0Var.setTag(8);
        w0Var.f23177b.addView(nc0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nc0Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        nc0Var.setLayoutParams(layoutParams);
        nc0Var.setOnClickListener(new org.telegram.ui.ActionBar.b0(w0Var, 2));
        this.f26025b1 = this.f30254b.f32984d1.e(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.f30254b.f32984d1.setFitSubItems(true);
        fm fmVar = new fm(this, context, u6Var, 1);
        this.E = fmVar;
        fmVar.setFastScrollEnabled(1);
        fmVar.setFastScrollVisible(true);
        fmVar.getFastScroll().setAlpha(0.0f);
        fmVar.getFastScroll().f33080a = false;
        fmVar.getFastScroll().f33091h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        tm tmVar = new tm(this, context, z11);
        this.G = tmVar;
        fmVar.setAdapter(tmVar);
        qm qmVar = new qm(this, fmVar);
        this.Q = qmVar;
        fmVar.i(qmVar);
        for (int i11 = 0; i11 < 8; i11++) {
            tmVar.h.add(tmVar.L());
        }
        fmVar.setClipToPadding(false);
        fmVar.setItemAnimator(null);
        fmVar.setLayoutAnimation(null);
        fmVar.setVerticalScrollBarEnabled(false);
        org.telegram.ui.ActionBar.f7.m(fmVar, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
        addView(fmVar, kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        fmVar.setOnScrollListener(new fi.a9(1, this));
        ei.k kVar = new ei.k(this, this.K0, 2);
        this.F = kVar;
        kVar.O = new ai.l(this, 5);
        fmVar.setLayoutManager(kVar);
        fmVar.setOnItemClickListener(new bi.z3(this, z11, u6Var, 7));
        fmVar.setOnItemLongClickListener(new ul(this, 3));
        rm0 rm0Var = new rm0(new mm(this));
        this.I = rm0Var;
        fmVar.E.add(rm0Var);
        setBlur3Capture(fmVar);
        this.d = fmVar;
        this.f30256f = true;
        uz uzVar = new uz(context, u6Var);
        this.H = uzVar;
        uzVar.setText(LocaleController.getString(R.string.NoPhotos));
        uzVar.setOnTouchListener(null);
        uzVar.setTextSize(16);
        addView(uzVar, kb1.g(-2.0f, -1));
        if (this.X0) {
            uzVar.b();
        } else {
            uzVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        nm nmVar = new nm(context, paint);
        this.R = nmVar;
        AndroidUtilities.updateViewVisibilityAnimated(nmVar, false, 1.0f, false);
        nmVar.setBackgroundResource(R.drawable.system);
        nmVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        nmVar.setTextSize(1, 15.0f);
        nmVar.setTypeface(AndroidUtilities.bold());
        nmVar.setAlpha(0.0f);
        nmVar.setTextColor(-1);
        nmVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(nmVar, kb1.h(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        bh.r rVar = new bh.r(this, context, 13);
        this.f26040j0 = rVar;
        rVar.setVisibility(8);
        rVar.setAlpha(0.0f);
        container.addView(rVar, kb1.i(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f26051p0 = textView2;
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
        container.addView(textView2, kb1.h(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f33079b;

            {
                this.f33079b = this;
            }

            @Override
            public final void onClick(View view) {
                pm pmVar;
                pm pmVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33079b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.k0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f26057s0 && (pmVar = chatAttachAlertPhotoLayout.P) != null && pmVar.isInited()) {
                            chatAttachAlertPhotoLayout.f26026c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26055r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new em(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (pmVar2 = chatAttachAlertPhotoLayout.P) != null && pmVar2.isInited() && chatAttachAlertPhotoLayout.f26024b0) {
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
                                ChatAttachAlertPhotoLayout.p0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(ds.f27530f);
                                animatorSet.addListener(new di.o3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f26061w.U(null, null);
                        return;
                }
            }
        });
        kc1 kc1Var = new kc1(context);
        this.f26044l0 = kc1Var;
        kc1Var.setVisibility(8);
        kc1Var.setAlpha(0.0f);
        container.addView(kc1Var, kb1.h(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        kc1Var.setDelegate(new ul(this, 0));
        ?? view = new View(context);
        view.f26310b = new DecelerateInterpolator();
        view.f26316w = new m.g3((Object) view, 28);
        view.f26309a = view.getResources().getDrawable(R.drawable.camera_btn);
        Paint paint2 = new Paint(1);
        view.f26311c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f26312f = hw0.f29086a;
        this.f26042k0 = view;
        rVar.addView((View) view, kb1.i(84, 84, 17));
        view.setDelegate(new dm(this, u6Var, container));
        view.setFocusable(true);
        view.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.f26055r0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        rVar.addView(imageView, kb1.i(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f33079b;

            {
                this.f33079b = this;
            }

            @Override
            public final void onClick(View view2) {
                pm pmVar;
                pm pmVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33079b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.k0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f26057s0 && (pmVar = chatAttachAlertPhotoLayout.P) != null && pmVar.isInited()) {
                            chatAttachAlertPhotoLayout.f26026c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26055r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new em(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (pmVar2 = chatAttachAlertPhotoLayout.P) != null && pmVar2.isInited() && chatAttachAlertPhotoLayout.f26024b0) {
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
                                ChatAttachAlertPhotoLayout.p0(imageView2, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(ds.f27530f);
                                animatorSet.addListener(new di.o3(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f26061w.U(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i12 = 0; i12 < 2; i12++) {
            this.S[i12] = new ImageView(context);
            this.S[i12].setScaleType(ImageView.ScaleType.CENTER);
            this.S[i12].setVisibility(4);
            this.f26040j0.addView(this.S[i12], kb1.i(48, 48, 51));
            this.S[i12].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f33079b;

                {
                    this.f33079b = this;
                }

                @Override
                public final void onClick(View view2) {
                    pm pmVar;
                    pm pmVar2;
                    int i102 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33079b;
                    switch (i102) {
                        case 0:
                            if (chatAttachAlertPhotoLayout.P != null) {
                                chatAttachAlertPhotoLayout.k0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.f26057s0 && (pmVar = chatAttachAlertPhotoLayout.P) != null && pmVar.isInited()) {
                                chatAttachAlertPhotoLayout.f26026c0 = false;
                                chatAttachAlertPhotoLayout.P.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26055r0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new em(chatAttachAlertPhotoLayout));
                                duration.start();
                                return;
                            }
                            return;
                        case 2:
                            if (!chatAttachAlertPhotoLayout.T && (pmVar2 = chatAttachAlertPhotoLayout.P) != null && pmVar2.isInited() && chatAttachAlertPhotoLayout.f26024b0) {
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
                                    ChatAttachAlertPhotoLayout.p0(imageView2, nextFlashMode);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, AndroidUtilities.dp(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -AndroidUtilities.dp(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(ds.f27530f);
                                    animatorSet.addListener(new di.o3(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            chatAttachAlertPhotoLayout.f26061w.U(null, null);
                            return;
                    }
                }
            });
            this.S[i12].setContentDescription("flash mode " + i12);
        }
        TextView textView3 = new TextView(context);
        this.f26053q0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(org.telegram.ui.d3.h(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.f26040j0.addView(textView3, kb1.h(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        fm fmVar2 = new fm(this, context, u6Var, 0);
        this.f26054r = fmVar2;
        fmVar2.setVerticalScrollBarEnabled(true);
        tm tmVar2 = new tm(this, context, false);
        this.v = tmVar2;
        fmVar2.setAdapter(tmVar2);
        for (int i13 = 0; i13 < 8; i13++) {
            tmVar2.h.add(tmVar2.L());
        }
        fmVar2.setClipToPadding(false);
        fmVar2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        fmVar2.setItemAnimator(null);
        fmVar2.setLayoutAnimation(null);
        fmVar2.setOverScrollMode(2);
        fmVar2.setVisibility(4);
        fmVar2.setAlpha(0.0f);
        container.addView(fmVar2, kb1.g(80.0f, -1));
        ig.a0 a0Var = new ig.a0(0, false, 7);
        this.f26056s = a0Var;
        fmVar2.setLayoutManager(a0Var);
        fmVar2.setOnItemClickListener(new p7(1));
    }

    public static org.telegram.ui.Cells.x5 N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        fm fmVar = chatAttachAlertPhotoLayout.E;
        int childCount = fmVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = fmVar.getChildAt(i11);
            if (childAt.getTop() < fmVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f30254b.r1() && (childAt instanceof org.telegram.ui.Cells.x5)) {
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                if (x5Var.getImageView().getTag() != null && ((Integer) x5Var.getImageView().getTag()).intValue() == i10) {
                    return x5Var;
                }
            }
        }
        return null;
    }

    public static int P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ti tiVar = chatAttachAlertPhotoLayout.f30254b;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
        if ((r2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) r2Var).f45091d4 == 5) {
            return r2Var.getMessagesController().config.quickReplyMessagesLimit.get() - ((org.telegram.ui.wn) tiVar.f32990f0).K6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static boolean T() {
        HashMap hashMap = f26019s1;
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

    public static boolean U() {
        CharSequence charSequence;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = f26020t1;
            if (i10 >= arrayList.size()) {
                break;
            }
            Object obj = f26019s1.get(arrayList.get(i10));
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

    public static boolean d0() {
        HashMap hashMap = f26019s1;
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
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.f26052p1;
    }

    public static void p0(ImageView imageView, String str) {
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

    public void setAlertKeepScreenOn(boolean z10) {
        Window window = this.f30254b.getWindow();
        if (window != null) {
            View peekDecorView = window.peekDecorView();
            if (peekDecorView != null && !peekDecorView.isAttachedToWindow()) {
                return;
            }
            if (z10) {
                window.addFlags(128);
            } else {
                window.clearFlags(128);
            }
        }
    }

    @Override
    public final void A() {
        ShutterButton shutterButton = this.f26042k0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.Q0;
        hw0 hw0Var = hw0.f29086a;
        hw0 hw0Var2 = hw0.f29087b;
        if (!z10) {
            if (this.P != null && shutterButton.getState() == hw0Var2) {
                m0();
                CameraController.getInstance().stopVideoRecording(this.P.getCameraSession(), false);
                shutterButton.a(hw0Var);
            }
            if (this.f26024b0) {
                b0(false);
            }
            e0(true);
            return;
        }
        if (this.P != null && shutterButton.getState() == hw0Var2) {
            shutterButton.a(hw0Var);
        }
        this.Q0 = false;
    }

    @Override
    public final void B(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.B(int, int):void");
    }

    @Override
    public final void C() {
        ti tiVar = this.f30254b;
        if (tiVar.isShowing() && !tiVar.isDismissed() && !PhotoViewer.v1().U1()) {
            V(false);
        }
    }

    @Override
    public final void D(int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.D(int):void");
    }

    @Override
    public final boolean F(int i10) {
        if (this.f26024b0) {
            if (i10 == 24 || i10 == 25 || i10 == 79 || i10 == 85) {
                ((dm) this.f26042k0.getDelegate()).a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void G(li liVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f26050o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f26061w.setVisibility(0);
        boolean z10 = liVar instanceof cn;
        TextView textView = this.f26063x;
        if (!z10) {
            a0();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(ds.f27533j);
            this.f26050o1 = interpolator;
            interpolator.start();
        }
        this.f30254b.f32974a1.setTitle("");
        this.F.h1(0, 0);
        if (z10) {
            this.E.post(new org.telegram.ui.kp(27, this, liVar));
        }
        W();
        n0();
    }

    @Override
    public final void H() {
        this.N = false;
        pm pmVar = this.P;
        if (pmVar != null) {
            pmVar.setVisibility(0);
        }
        if (this.f26059u0) {
            this.f26059u0 = false;
            V(true);
        }
    }

    @Override
    public final void J() {
        this.E.y0(0);
    }

    public final int R(MediaController.PhotoEntry photoEntry, int i10) {
        boolean z10;
        Integer valueOf = Integer.valueOf(photoEntry.imageId);
        HashMap hashMap = f26019s1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f26020t1;
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
            z0(false);
            x0();
            if (i10 >= 0) {
                photoEntry.reset();
                this.f26037h1.X(i10);
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
        if (d0()) {
            photoEntry.discardLivePhoto = Boolean.valueOf(!T());
        }
        photoEntry.highQuality = Boolean.valueOf(photoEntry.isHighQuality());
        boolean X = X(true);
        hashMap.put(valueOf, photoEntry);
        arrayList.add(valueOf);
        if (X) {
            y0();
            return -1;
        }
        z0(true);
        return -1;
    }

    public final void S() {
        pm pmVar = this.P;
        if (pmVar != null) {
            if (!this.f26024b0) {
                pmVar.setTranslationX(this.U[0]);
            }
            int i10 = this.K0;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2);
            if (!this.f26024b0) {
                this.P.setClipTop((int) this.W);
                this.P.setClipBottom((int) this.f26022a0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                if (layoutParams.height != dp || layoutParams.width != i10) {
                    layoutParams.width = i10;
                    layoutParams.height = dp;
                    this.P.setLayoutParams(layoutParams);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.kp(28, this, layoutParams));
                }
            }
        }
    }

    public final void V(boolean z10) {
        org.telegram.ui.ActionBar.r2 r2Var;
        boolean z11;
        tm tmVar;
        ti tiVar = this.f30254b;
        boolean z12 = tiVar.V;
        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f32990f0;
        if (!z12 && this.f26046n) {
            boolean z13 = this.N0;
            boolean z14 = this.O0;
            if (r2Var2 == null) {
                r2Var = LaunchActivity.R();
            } else {
                r2Var = r2Var2;
            }
            if (r2Var != null && r2Var.getParentActivity() != null) {
                if (!SharedConfig.inappCamera) {
                    this.N0 = false;
                } else {
                    if (r2Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.O0 = z11;
                    if (z11) {
                        if (z10) {
                            try {
                                r2Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
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
                if ((z13 != this.N0 || z14 != this.O0) && (tmVar = this.G) != null) {
                    tmVar.l();
                }
                if (!tiVar.V && tiVar.isShowing() && this.N0 && tiVar.getBackDrawable().getAlpha() != 0 && !this.f26024b0) {
                    t0();
                }
            }
        }
    }

    public final void W() {
        s4.e1 K;
        float[] fArr;
        int i10;
        float f7;
        int systemWindowInsetTop;
        if (!PhotoViewer.F1() || PhotoViewer.v1().f35771p5 == null || !PhotoViewer.v1().f35771p5.V) {
            pm pmVar = this.P;
            if (pmVar != null) {
                pmVar.invalidateOutline();
            }
            fm fmVar = this.E;
            s4.e1 K2 = fmVar.K(this.M0 - 1);
            if (K2 != null) {
                K2.f47773a.invalidateOutline();
            }
            if ((!this.G.d || !this.N0 || this.T0 != this.U0) && (K = fmVar.K(0)) != null) {
                K.f47773a.invalidateOutline();
            }
            pm pmVar2 = this.P;
            if (pmVar2 != null) {
                pmVar2.invalidate();
            }
            nm nmVar = this.R;
            if (nmVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nmVar.getLayoutParams();
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
            int childCount = fmVar.getChildCount();
            int i11 = 0;
            while (true) {
                fArr = this.U;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = fmVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    if (childAt.isAttachedToWindow()) {
                        float y3 = getY() + fmVar.getY() + childAt.getY();
                        ti tiVar = this.f30254b;
                        ViewGroup sheetContainer = tiVar.getSheetContainer();
                        uh uhVar = tiVar.B1;
                        bh.p pVar = tiVar.R0;
                        float y10 = sheetContainer.getY() + y3;
                        float x9 = (tiVar.getSheetContainer().getX() + (getX() + (fmVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                        if (!tiVar.f32993g0) {
                            i10 = AndroidUtilities.statusBarHeight;
                        } else {
                            i10 = 0;
                        }
                        float alpha = (pVar.getAlpha() * pVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
                        fi.i iVar = tiVar.H2;
                        if (iVar != null && iVar.g()) {
                            alpha = Math.max(alpha, (tiVar.H2.e() + tiVar.H2.getY()) - tiVar.f33018o2);
                        }
                        if (y3 < alpha) {
                            f7 = alpha - y3;
                        } else {
                            f7 = 0.0f;
                        }
                        if (f7 != this.W) {
                            this.W = f7;
                            pm pmVar3 = this.P;
                            if (pmVar3 != null) {
                                pmVar3.invalidateOutline();
                                this.P.invalidate();
                            }
                        }
                        float translationY = (int) (uhVar.getTranslationY() + (tiVar.getSheetContainer().getMeasuredHeight() - uhVar.getMeasuredHeight()));
                        fi.i iVar2 = tiVar.H2;
                        if (iVar2 != null) {
                            translationY -= iVar2.d() - AndroidUtilities.dp(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y3 > translationY) {
                            this.f26022a0 = Math.min(-AndroidUtilities.dp(5.0f), y3 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.f26022a0 = 0.0f;
                        }
                        fArr[0] = x9;
                        fArr[1] = y10;
                        S();
                        return;
                    }
                } else {
                    i11++;
                }
            }
            if (this.W != 0.0f) {
                this.W = 0.0f;
                pm pmVar4 = this.P;
                if (pmVar4 != null) {
                    pmVar4.invalidateOutline();
                    this.P.invalidate();
                }
            }
            fArr[0] = AndroidUtilities.dp(-400.0f);
            fArr[1] = 0.0f;
            S();
        }
    }

    public final boolean X(boolean z10) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            HashMap hashMap = f26019s1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f26020t1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof MediaController.PhotoEntry)) {
                break;
            }
            R((MediaController.PhotoEntry) obj, -1);
            z11 = true;
        }
        return z11;
    }

    public final boolean Y(MediaController.PhotoEntry photoEntry) {
        boolean z10 = this.f26062w0;
        org.telegram.ui.ActionBar.u6 u6Var = this.f30253a;
        ti tiVar = this.f30254b;
        if (!z10 && photoEntry.isVideo) {
            if (!tiVar.f1()) {
                org.telegram.messenger.wh.n(R.string.GlobalAttachVideoRestricted, new wc(tiVar.f33037u1, u6Var), null);
                return true;
            }
        } else if (!this.f26064x0 && !photoEntry.isVideo) {
            if (!tiVar.f1()) {
                org.telegram.messenger.wh.n(R.string.GlobalAttachPhotoRestricted, new wc(tiVar.f33037u1, u6Var), null);
                return true;
            }
        } else {
            return false;
        }
        return true;
    }

    public final void Z() {
        if (this.P0) {
            boolean f02 = f0();
            this.P0 = f02;
            if (!f02) {
                g0();
            }
            this.G.l();
            this.v.l();
        }
    }

    @Override
    public final void a(CharSequence charSequence) {
        MediaController.PhotoEntry photoEntry;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = f26020t1;
            if (i10 < arrayList.size()) {
                if (i10 == 0) {
                    Object obj = arrayList.get(i10);
                    HashMap hashMap = f26019s1;
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

    public final void a0() {
        String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
        org.telegram.ui.ActionBar.g1 g1Var = this.Y0;
        g1Var.setText(string);
        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.f30254b.f32984d1.S(1);
        HashMap hashMap = f26019s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((MediaController.PhotoEntry) entry.getValue()).reset();
            }
            hashMap.clear();
            f26020t1.clear();
        }
        ArrayList arrayList = f26018r1;
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
    public final boolean b() {
        return !this.f26024b0;
    }

    public final void b0(boolean z10) {
        boolean z11;
        pm pmVar;
        if (!this.f26057s0 && this.P != null) {
            int i10 = this.K0;
            int[] iArr = this.f26032f0;
            iArr[1] = i10;
            iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
            Runnable runnable = this.f26047n0;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.f26047n0 = null;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23300a7, this.f30253a)) > 0.721d) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.setLightNavigationBar(this.f30254b, z11);
            TextView textView = this.f26051p0;
            fm fmVar = this.f26054r;
            bh.r rVar = this.f26040j0;
            fm fmVar2 = this.E;
            ImageView[] imageViewArr = this.S;
            kc1 kc1Var = this.f26044l0;
            if (z10) {
                this.f26041j1 = this.P.getTranslationY();
                this.f26028d0 = true;
                if (fmVar2 != null) {
                    fmVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(rVar, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(kc1Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(fmVar, property, 0.0f));
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
                this.f26033f1.lock();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(ds.f27530f);
                animatorSet.addListener(new hm(this, 2));
                animatorSet.start();
            } else {
                this.f26039i1 = false;
                setAlertKeepScreenOn(false);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                rVar.setAlpha(0.0f);
                rVar.setVisibility(8);
                kc1Var.setAlpha(0.0f);
                kc1Var.setTag(null);
                kc1Var.setVisibility(8);
                fmVar.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                fmVar.setVisibility(8);
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
                this.f26024b0 = false;
                pm pmVar2 = this.P;
                if (pmVar2 != null) {
                    pmVar2.setFpsLimit(30);
                    this.P.setSystemUiVisibility(1024);
                }
                if (fmVar2 != null) {
                    fmVar2.invalidate();
                }
            }
            pm pmVar3 = this.P;
            if (pmVar3 != null) {
                pmVar3.setImportantForAccessibility(0);
            }
            fmVar2.setImportantForAccessibility(0);
            if (!LiteMode.isEnabled(360928) && (pmVar = this.P) != null) {
                pmVar.showTexture(false, z10);
            }
        }
    }

    @Override
    public final boolean c() {
        for (Map.Entry entry : f26019s1.entrySet()) {
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

    public final MediaController.PhotoEntry c0(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = f26018r1;
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
    public final void d() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10 = this.f26031e1;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.y6.f23439hg;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.f23465j5;
        }
        int i14 = org.telegram.ui.ActionBar.y6.f23339c7;
        org.telegram.ui.ActionBar.u6 u6Var = this.f30253a;
        this.H.setTextColor(org.telegram.ui.ActionBar.y6.w0(i14, u6Var));
        int i15 = org.telegram.ui.ActionBar.y6.A5;
        fm fmVar = this.E;
        org.telegram.ui.ActionBar.f7.I(fmVar, i15, u6Var);
        fmVar.K(0);
        org.telegram.ui.ActionBar.f7.V(this.f26063x, i10, u6Var);
        if (z10) {
            i11 = org.telegram.ui.ActionBar.y6.f23439hg;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.E8;
        }
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        km kmVar = this.f26061w;
        kmVar.O(w02, false);
        if (z10) {
            i12 = org.telegram.ui.ActionBar.y6.f23439hg;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.E8;
        }
        kmVar.O(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), true);
        if (z10) {
            i13 = org.telegram.ui.ActionBar.y6.f23475jg;
        } else {
            i13 = org.telegram.ui.ActionBar.y6.G8;
        }
        kmVar.H(org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
        org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), this.f26065y);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ti tiVar;
        if (i10 == NotificationCenter.albumsDidLoad) {
            tm tmVar = this.G;
            if (tmVar != null) {
                if (r0()) {
                    this.U0 = MediaController.allMediaAlbumEntry;
                } else {
                    this.U0 = MediaController.allPhotosAlbumEntry;
                }
                if (this.T0 != null && ((tiVar = this.f30254b) == null || !tiVar.G)) {
                    if (r0()) {
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
                tmVar.l();
                this.v.l();
                ArrayList arrayList = f26020t1;
                if (!arrayList.isEmpty() && this.U0 != null) {
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        Integer num = (Integer) arrayList.get(i14);
                        HashMap hashMap = f26019s1;
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
                v0();
            }
        } else if (i10 == NotificationCenter.cameraInitied) {
            V(false);
        }
    }

    public final void e0(boolean z10) {
        if (this.N0 && this.P != null) {
            o0();
            this.Q.i();
            this.P.destroy(z10, null);
            AnimatorSet animatorSet = this.O;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.O = null;
            }
            AndroidUtilities.runOnUIThread(new xl(this, 0), 300L);
            this.f26026c0 = false;
        }
    }

    public final boolean f0() {
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (findActivity == null) {
            findActivity = this.f30254b.f32990f0.getParentActivity();
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

    public final void g0() {
        MediaController.AlbumEntry albumEntry;
        if (r0()) {
            albumEntry = MediaController.allMediaAlbumEntry;
        } else {
            albumEntry = MediaController.allPhotosAlbumEntry;
        }
        if (albumEntry == null) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
    }

    public ArrayList<Object> getAllPhotosArray() {
        MediaController.AlbumEntry albumEntry = this.T0;
        ArrayList<Object> arrayList = f26018r1;
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
        return this.f26030e0;
    }

    @Override
    public int getCurrentItemTop() {
        fm fmVar = this.E;
        int childCount = fmVar.getChildCount();
        uz uzVar = this.H;
        if (childCount <= 0) {
            fmVar.setTopGlowOffset(fmVar.getPaddingTop());
            uzVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = fmVar.getChildAt(0);
        wl0 wl0Var = (wl0) fmVar.G(childAt);
        int top = childAt.getTop() - this.f26052p1;
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wl0Var == null || wl0Var.b() != 0) {
            top = dp;
        }
        uzVar.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - uzVar.getMeasuredHeight()) / 2.0f) + top);
        fmVar.setTopGlowOffset(top);
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
        return f26020t1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f26019s1;
    }

    public int getSelectedPhotosCount() {
        int i10 = 0;
        for (Object obj : f26019s1.values()) {
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
        for (Object obj : f26019s1.values()) {
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
        return f26020t1;
    }

    public long getStarsPrice() {
        Iterator it = f26019s1.entrySet().iterator();
        if (it.hasNext()) {
            return ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).starsAmount;
        }
        return 0L;
    }

    public final void h0(int r29, android.content.Intent r30, java.lang.String r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.h0(int, android.content.Intent, java.lang.String):void");
    }

    @Override
    public final int i() {
        return 1;
    }

    public final void i0(boolean z10) {
        pm pmVar;
        if (this.P != null && this.O == null) {
            ti tiVar = this.f30254b;
            if (!tiVar.isDismissed()) {
                this.P.initTexture();
                boolean r02 = r0();
                TextView textView = this.f26053q0;
                int i10 = 0;
                if (r02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f26018r1.isEmpty();
                fm fmVar = this.f26054r;
                TextView textView2 = this.f26051p0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    fmVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    fmVar.setVisibility(0);
                }
                if (tiVar.s1().v && isFocusable()) {
                    tiVar.s1().d();
                }
                kc1 kc1Var = this.f26044l0;
                kc1Var.setVisibility(0);
                kc1Var.setAlpha(0.0f);
                bh.r rVar = this.f26040j0;
                rVar.setVisibility(0);
                rVar.setTag(null);
                int[] iArr = this.f26032f0;
                iArr[0] = 0;
                int i11 = this.K0;
                iArr[1] = i11;
                iArr[2] = AndroidUtilities.dp(2.0f) + (i11 * 2);
                this.f26041j1 = 0.0f;
                this.f26039i1 = true;
                pm pmVar2 = this.P;
                if (pmVar2 != null) {
                    pmVar2.setFpsLimit(-1);
                }
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.setLightNavigationBar((Dialog) tiVar, false);
                setAlertKeepScreenOn(true);
                fm fmVar2 = this.E;
                ImageView[] imageViewArr = this.S;
                if (z10) {
                    setCameraOpenProgress(0.0f);
                    this.f26028d0 = true;
                    if (fmVar2 != null) {
                        fmVar2.invalidate();
                    }
                    this.f26033f1.lock();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(rVar, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(fmVar, property, 1.0f));
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
                    animatorSet.setInterpolator(ds.f27530f);
                    animatorSet.addListener(new hm(this, 1));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    rVar.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    fmVar.setAlpha(1.0f);
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
                    tiVar.f32982c2.R();
                    pm pmVar3 = this.P;
                    if (pmVar3 != null) {
                        pmVar3.setSystemUiVisibility(1028);
                    }
                }
                this.f26024b0 = true;
                pm pmVar4 = this.P;
                if (pmVar4 != null) {
                    pmVar4.setImportantForAccessibility(2);
                }
                fmVar2.setImportantForAccessibility(4);
                fmVar2.invalidate();
                if (!LiteMode.isEnabled(360928) && (pmVar = this.P) != null && pmVar.isInited()) {
                    this.P.showTexture(true, z10);
                }
            }
        }
    }

    public final void j0() {
        if (SharedConfig.inappCamera) {
            i0(true);
            return;
        }
        ti tiVar = this.f30254b;
        ri riVar = tiVar.f32982c2;
        if (riVar != null) {
            riVar.p0(0, false, true, 0, 0, 0L, tiVar.x1(), false, 0L);
        }
    }

    @Override
    public final void k() {
        W();
        invalidate();
    }

    public final void k0(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        int i10;
        org.telegram.ui.wn wnVar;
        org.telegram.ui.wn wnVar2;
        ArrayList<Object> arrayList;
        int i11;
        ArrayList arrayList2 = f26018r1;
        ti tiVar = this.f30254b;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            f26019s1.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            f26020t1.add(Integer.valueOf(photoEntry.imageId));
            tiVar.d2(0);
            this.G.l();
            this.v.l();
        }
        if (photoEntry != null && !z11 && arrayList2.size() > 1) {
            z0(false);
            if (this.P != null) {
                this.f26044l0.b(0.0f, false);
                this.B0 = 0.0f;
                this.P.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f26058t0 = true;
            org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
            org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f32990f0;
            if (r2Var == null) {
                r2Var = LaunchActivity.R();
            }
            if (r2Var != null) {
                PhotoViewer.v1().N2(r2Var.getParentActivity(), null, this.f30253a);
                PhotoViewer.v1().O2(tiVar);
                PhotoViewer v12 = PhotoViewer.v1();
                int i12 = tiVar.V1;
                boolean z12 = tiVar.W1;
                v12.h = i12;
                v12.f35747n = z12;
                if (tiVar.F && tiVar.G) {
                    wnVar = (org.telegram.ui.wn) r2Var2;
                    i10 = 11;
                } else {
                    if (tiVar.T0 != 0) {
                        i10 = 1;
                    } else if (r2Var2 instanceof org.telegram.ui.wn) {
                        wnVar = (org.telegram.ui.wn) r2Var2;
                        i10 = 2;
                    } else {
                        i10 = 5;
                    }
                    wnVar = null;
                }
                boolean z13 = tiVar.H;
                if (z13) {
                    i10 = 13;
                    wnVar2 = null;
                } else {
                    wnVar2 = wnVar;
                }
                int i13 = i10;
                if (tiVar.T0 == 0 && !z13) {
                    arrayList = getAllPhotosArray();
                    i11 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(photoEntry);
                    i11 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                e50 e50Var = tiVar.Q;
                if (e50Var != null && photoEntry != null) {
                    e50Var.e = photoEntry.isVideo;
                }
                PhotoViewer.v1().j2(arrayList3, i11, i13, false, new gm(this, z10), wnVar2);
                PhotoViewer.v1().A2(tiVar.Q);
                if (tiVar.G) {
                    PhotoViewer.v1().Z0(null, null, false, tiVar.J);
                    PhotoViewer.v1().p2();
                }
            }
        }
    }

    @Override
    public final void l(float f7) {
        this.W0 = f7;
        W();
        pm pmVar = this.P;
        if (pmVar != null) {
            pmVar.invalidateOutline();
            this.P.invalidate();
        }
        invalidate();
    }

    public final void l0() {
        try {
            if (this.P != null) {
                CameraController.getInstance().stopPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void m0() {
        if (this.f30254b.V) {
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.S[i10].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(ds.f27530f).start();
        }
        ViewPropertyAnimator duration = this.f26055r0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        ds dsVar = ds.f27530f;
        duration.setInterpolator(dsVar).start();
        this.f26053q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
        AndroidUtilities.updateViewVisibilityAnimated(this.R, false);
        AndroidUtilities.cancelRunOnUIThread(this.f26036h0);
        this.f26036h0 = null;
        AndroidUtilities.unlockOrientation(AndroidUtilities.findActivity(getContext()));
    }

    @Override
    public final boolean n(MotionEvent motionEvent) {
        pm pmVar;
        if (!this.f26028d0) {
            if (this.f26024b0 && motionEvent != null) {
                boolean z10 = this.G0;
                kc1 kc1Var = this.f26044l0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.E0;
                    kc1Var.getHitRect(rect);
                    if (kc1Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f26057s0 && !this.I0) {
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
                    fm fmVar = this.f26054r;
                    TextView textView = this.f26051p0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.S;
                    bh.r rVar = this.f26040j0;
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
                                kc1Var.b(this.B0, false);
                                this.f30254b.getSheetContainer().invalidate();
                                this.P.setZoom(this.B0);
                                u0(true);
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
                            } else if (this.I0 && (pmVar = this.P) != null) {
                                pmVar.setTranslationY(pmVar.getTranslationY() + f7);
                                this.F0 = y3;
                                kc1Var.setTag(null);
                                Runnable runnable = this.f26047n0;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.f26047n0 = null;
                                }
                                if (rVar.getTag() == null) {
                                    rVar.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(rVar, property, 0.0f), ObjectAnimator.ofFloat(kc1Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(fmVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(ds.f27530f);
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
                            pm pmVar2 = this.P;
                            if (pmVar2 != null) {
                                if (Math.abs(pmVar2.getTranslationY()) > this.P.getMeasuredHeight() / 6.0f) {
                                    b0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.P, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(rVar, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(fmVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f26038i0);
                                animatorSet2.start();
                                rVar.setTag(null);
                                return true;
                            }
                        } else {
                            pm pmVar3 = this.P;
                            if (pmVar3 != null && !this.D0) {
                                int[] iArr = this.V;
                                pmVar3.getLocationOnScreen(iArr);
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

    public final void n0() {
        try {
            V(false);
            if (this.P != null) {
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void o() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.cameraInitied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
    }

    public final void o0() {
        if (this.f26026c0) {
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.S0 != i14) {
            this.S0 = i14;
            tm tmVar = this.G;
            if (tmVar != null) {
                tmVar.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        W();
    }

    @Override
    public final boolean p() {
        if (this.f26028d0) {
            return true;
        }
        if (this.f26024b0) {
            b0(true);
            return true;
        }
        e0(true);
        return false;
    }

    @Override
    public final void q(int i10) {
        boolean z10;
        if (i10 != 0 && i10 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        e0(z10);
    }

    public final void q0(int i10, final boolean z10) {
        PhotoViewer v12 = PhotoViewer.v1();
        if (i10 == -1) {
            i10 = v12.P4;
        }
        ArrayList arrayList = v12.g7;
        if (arrayList != null && !arrayList.isEmpty() && i10 < arrayList.size() && (arrayList.get(i10) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) arrayList.get(i10)).hasSpoiler) {
            final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
            this.E.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z11 = ChatAttachAlertPhotoLayout.f26017q1;
                    if (view instanceof org.telegram.ui.Cells.x5) {
                        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
                        if (x5Var.getPhotoEntry() == photoEntry) {
                            x5Var.c(z10, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z12 = true;
                            if (ChatAttachAlertPhotoLayout.f26019s1.size() <= 1) {
                                z12 = false;
                            }
                            x5Var.f(starsPrice, z12);
                        }
                    }
                }
            });
        }
    }

    public final boolean r0() {
        if (!this.f26066y0) {
            ti tiVar = this.f30254b;
            if (!tiVar.F) {
                if (!(tiVar.f32990f0 instanceof org.telegram.ui.wn) && !tiVar.W0 && tiVar.T0 != 2) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.R0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s() {
        pm pmVar = this.P;
        if (pmVar != null) {
            pmVar.setVisibility(8);
        }
        for (Map.Entry entry : f26019s1.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.G.l();
    }

    public final void s0(i9 i9Var, TLRPC.VideoSize videoSize, long j10) {
        boolean z10;
        ti tiVar = this.f30254b;
        g9 g9Var = new g9(tiVar.U, tiVar.Q);
        e50 e50Var = tiVar.Q;
        if (e50Var != null && e50Var.f27715c == 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        g9Var.Q = z10;
        tiVar.f32990f0.presentFragment(g9Var);
        if (i9Var != null) {
            g9Var.n0(i9Var);
        }
        if (videoSize != null) {
            g9Var.m0(videoSize);
        }
        if (j10 != 0) {
            g9Var.l0(j10);
        }
        g9Var.I = new p1(13, this, g9Var);
    }

    public void setCameraOpenProgress(float f7) {
        int i10;
        int i11;
        if (this.P == null) {
            return;
        }
        this.f26030e0 = f7;
        int[] iArr = this.f26032f0;
        float f10 = iArr[1];
        float f11 = iArr[2];
        int i12 = AndroidUtilities.displaySize.x;
        ti tiVar = this.f30254b;
        float width = tiVar.getContainer().getWidth();
        float height = tiVar.getContainer().getHeight();
        float[] fArr = this.U;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = this.f26041j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
        float textureHeight = this.P.getTextureHeight(f10, f11) / this.P.getTextureHeight(width, height);
        float f15 = f11 / height;
        float f16 = f10 / width;
        if (this.f26039i1) {
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
            this.f26043k1 = f20 - this.P.getTranslationY();
            this.l1 = (height * f7) + (((f13 + f11) * f17) - this.P.getTranslationY());
            this.f26048n1 = f19 - this.P.getTranslationX();
            this.f26045m1 = (width * f7) + (((f12 + f10) * f17) - this.P.getTranslationX());
        } else {
            i10 = (int) f10;
            i11 = (int) f11;
            this.P.getTextureView().setScaleX(1.0f);
            this.P.getTextureView().setScaleY(1.0f);
            this.f26043k1 = 0.0f;
            this.l1 = height;
            this.f26048n1 = 0.0f;
            this.f26045m1 = width;
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
        this.f26059u0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.f26066y0 = z10;
    }

    public void setStarsPrice(long j10) {
        boolean z10;
        HashMap hashMap = f26019s1;
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
        D(getSelectedItemsCount());
        if (X(false)) {
            y0();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        ti tiVar = this.f30254b;
        if (tiVar.getSheetAnimationType() == 1) {
            float f10 = (f7 / 40.0f) * (-0.1f);
            fm fmVar = this.E;
            int childCount = fmVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = fmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                    float f11 = 1.0f + f10;
                    x5Var.getCheckBox().setScaleX(f11);
                    x5Var.getCheckBox().setScaleY(f11);
                }
            }
        }
        super.setTranslationY(f7);
        tiVar.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void t() {
        this.N = true;
        fm fmVar = this.E;
        int childCount = fmVar.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (fmVar.getChildAt(i10) instanceof org.telegram.ui.Cells.q5) {
                o0();
                break;
            } else {
                this.Q.i();
                i10++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f26050o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f26063x.animate().alpha(0.0f).setDuration(150L).setInterpolator(ds.f27533j).withEndAction(new xl(this, 1));
        this.f26050o1 = withEndAction;
        withEndAction.start();
        l0();
    }

    public final void t0() {
        boolean z10;
        boolean z11;
        float f7;
        ti tiVar = this.f30254b;
        if (!tiVar.f33001i2 && this.f26060v0 && CameraView.isCameraAllowed()) {
            if (this.P == null) {
                boolean z12 = !LiteMode.isEnabled(360928);
                Context context = getContext();
                Boolean bool = this.f26049o0;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = tiVar.X1;
                }
                pm pmVar = new pm(this, context, z10, z12);
                this.P = pmVar;
                org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
                if ((r2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) r2Var).w()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                pmVar.setRecordFile(AndroidUtilities.generateVideoPath(z11));
                this.P.setFocusable(true);
                this.P.setFpsLimit(30);
                this.P.setOutlineProvider(new eh.b(this, 1));
                this.P.setClipToOutline(true);
                this.P.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                org.telegram.ui.ActionBar.h3 container = tiVar.getContainer();
                pm pmVar2 = this.P;
                int i10 = this.K0;
                container.addView(pmVar2, 1, new FrameLayout.LayoutParams(i10, i10));
                this.P.setDelegate(new im(this));
                pm pmVar3 = this.P;
                if (this.f26060v0) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.2f;
                }
                pmVar3.setAlpha(f7);
                this.P.setEnabled(this.f26060v0);
                if (this.N) {
                    this.P.setVisibility(8);
                }
                if (!this.f26024b0) {
                    W();
                }
                fm fmVar = this.E;
                if (fmVar != null) {
                    fmVar.invalidate();
                }
                invalidate();
            }
            kc1 kc1Var = this.f26044l0;
            if (kc1Var != null) {
                kc1Var.b(0.0f, false);
                this.B0 = 0.0f;
            }
            if (!this.f26024b0) {
                this.P.setTranslationX(this.U[0]);
            }
        }
    }

    @Override
    public final void u(float f7) {
        pm pmVar = this.P;
        if (pmVar != null) {
            pmVar.setAlpha(f7);
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i10 != 0 && this.P.getVisibility() != 0) {
                this.P.setVisibility(0);
            } else if (i10 == 0 && this.P.getVisibility() != 4) {
                this.P.setVisibility(4);
            }
        }
    }

    public final void u0(boolean z10) {
        Integer num;
        float f7;
        kc1 kc1Var = this.f26044l0;
        if ((kc1Var.getTag() != null && z10) || (kc1Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f26047n0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                xl xlVar = new xl(this, 3);
                this.f26047n0 = xlVar;
                AndroidUtilities.runOnUIThread(xlVar, 2000L);
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
        kc1Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.m0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(kc1Var, View.ALPHA, f7));
        this.m0.addListener(new hm(this, 0));
        this.m0.start();
        if (z10) {
            xl xlVar2 = new xl(this, 4);
            this.f26047n0 = xlVar2;
            AndroidUtilities.runOnUIThread(xlVar2, 2000L);
        }
    }

    @Override
    public final void v(int i10) {
        TLRPC.Chat q12;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        ti tiVar = this.f30254b;
        if (i10 == 8) {
            tiVar.O1(!tiVar.f32980c0, true);
            this.f26029d1.a(!tiVar.f32980c0, true);
        } else if ((i10 == 0 || i10 == 1) && tiVar.V1 > 0 && f26020t1.size() > 1 && (q12 = tiVar.q1()) != null && !ChatObject.hasAdminRights(q12) && q12.slowmode_enabled) {
            g5.N(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.f30253a).p();
        } else {
            org.telegram.ui.ActionBar.u6 u6Var = this.f30253a;
            HashMap hashMap = f26019s1;
            if (i10 == 0) {
                MessageObject messageObject = tiVar.K1;
                org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
                if (messageObject == null && (r2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) r2Var).c()) {
                    g5.L(getContext(), ((org.telegram.ui.wn) r2Var).a(), new ul(this, 1), u6Var);
                } else {
                    g5.Z(tiVar.M1, tiVar.p1() + hashMap.size(), tiVar.t1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f33764b;

                        {
                            this.f33764b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33764b;
                            Long l4 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f26017q1;
                                    ti tiVar2 = chatAttachAlertPhotoLayout.f30254b;
                                    tiVar2.e1();
                                    tiVar2.f32982c2.p0(7, false, true, 0, 0, 0L, tiVar2.x1(), false, l4.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f26017q1;
                                    ti tiVar3 = chatAttachAlertPhotoLayout.f30254b;
                                    tiVar3.e1();
                                    tiVar3.f32982c2.p0(4, true, true, 0, 0, 0L, tiVar3.x1(), false, l4.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i10 == 1) {
                MessageObject messageObject2 = tiVar.K1;
                org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f32990f0;
                if (messageObject2 == null && (r2Var2 instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) r2Var2).c()) {
                    g5.L(getContext(), ((org.telegram.ui.wn) r2Var2).a(), new ul(this, 2), u6Var);
                } else {
                    g5.Z(tiVar.M1, tiVar.p1() + hashMap.size(), tiVar.t1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f33764b;

                        {
                            this.f33764b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33764b;
                            Long l4 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f26017q1;
                                    ti tiVar2 = chatAttachAlertPhotoLayout.f30254b;
                                    tiVar2.e1();
                                    tiVar2.f32982c2.p0(7, false, true, 0, 0, 0L, tiVar2.x1(), false, l4.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f26017q1;
                                    ti tiVar3 = chatAttachAlertPhotoLayout.f30254b;
                                    tiVar3.e1();
                                    tiVar3.f32982c2.p0(4, true, true, 0, 0, 0L, tiVar3.x1(), false, l4.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                tm tmVar = this.G;
                fm fmVar = this.E;
                if (i10 == 3) {
                    cn cnVar = tiVar.f33022q0;
                    if (cnVar != null) {
                        cnVar.N();
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
                        public final ChatAttachAlertPhotoLayout f34539b;

                        {
                            this.f34539b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z14 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34539b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f26017q1;
                                    ti tiVar2 = chatAttachAlertPhotoLayout.f30254b;
                                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.Y0;
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
                                        tiVar2.f32984d1.t(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            tiVar2.f32984d1.t(6);
                                            return;
                                        }
                                        return;
                                    }
                                    tiVar2.f32984d1.S(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        tiVar2.f32984d1.S(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.f26023a1;
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
                    fmVar.M(new yl(0, arrayList, z13));
                    if (tiVar.B0 != this) {
                        tmVar.l();
                    }
                    cn cnVar2 = tiVar.f33022q0;
                    if (cnVar2 != null) {
                        cnVar2.v.invalidate();
                    }
                } else if (i10 == 2) {
                    cn cnVar3 = tiVar.f33022q0;
                    if (cnVar3 != null) {
                        cnVar3.N();
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
                        public final ChatAttachAlertPhotoLayout f34539b;

                        {
                            this.f34539b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z142 = z14;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34539b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f26017q1;
                                    ti tiVar2 = chatAttachAlertPhotoLayout.f30254b;
                                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.Y0;
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
                                        tiVar2.f32984d1.t(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            tiVar2.f32984d1.t(6);
                                            return;
                                        }
                                        return;
                                    }
                                    tiVar2.f32984d1.S(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        tiVar2.f32984d1.S(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.f26023a1;
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
                    fmVar.M(new yl(1, arrayList2, z14));
                    if (tiVar.B0 != this) {
                        tmVar.l();
                    }
                    cn cnVar4 = tiVar.f33022q0;
                    if (cnVar4 != null) {
                        cnVar4.v.invalidate();
                    }
                } else if (i10 == 4) {
                    try {
                        if (r0()) {
                            Intent intent = new Intent();
                            intent.setType("video/*");
                            intent.setAction("android.intent.action.GET_CONTENT");
                            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                            Intent intent2 = new Intent("android.intent.action.PICK");
                            intent2.setType("image/*");
                            Intent createChooser = Intent.createChooser(intent2, null);
                            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                            int i11 = tiVar.T0;
                            org.telegram.ui.ActionBar.r2 r2Var3 = tiVar.f32990f0;
                            if (i11 != 0) {
                                r2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                r2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i12 = tiVar.T0;
                            org.telegram.ui.ActionBar.r2 r2Var4 = tiVar.f32990f0;
                            if (i12 != 0) {
                                r2Var4.startActivityForResult(intent3, 14);
                            } else {
                                r2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        tiVar.dismiss(true);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (i10 == 7) {
                    if (tiVar.B0 == tiVar.f33022q0) {
                        z12 = false;
                    }
                    tiVar.h2(z12);
                } else if (i10 == 9) {
                    bi.dd.f1(getContext(), getStarsPrice(), true, new d(this, 6), this.f30253a);
                } else if (i10 >= 10) {
                    MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.V0.get(i10 - 10);
                    this.T0 = albumEntry;
                    MediaController.AlbumEntry albumEntry2 = this.U0;
                    TextView textView = this.f26063x;
                    if (albumEntry == albumEntry2) {
                        textView.setText(LocaleController.getString(R.string.ChatGallery));
                    } else {
                        textView.setText(albumEntry.bucketName);
                    }
                    tmVar.l();
                    this.v.l();
                    this.F.h1(0, -(fmVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void v0() {
        ArrayList<MediaController.AlbumEntry> arrayList;
        km kmVar = this.f26061w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kmVar.f23177b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f26060v0) {
            if (r0()) {
                arrayList = MediaController.allMediaAlbums;
            } else {
                arrayList = MediaController.allPhotoAlbums;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.V0 = arrayList2;
            Collections.sort(arrayList2, new am(arrayList, 0));
        } else {
            this.V0 = new ArrayList();
        }
        boolean isEmpty = this.V0.isEmpty();
        TextView textView = this.f26063x;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f26065y, (Drawable) null);
        int size = this.V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.V0.get(i10);
            fi.a aVar = new fi.a(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.f30253a);
            kmVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.w(this, i10 + 10, 12));
        }
    }

    @Override
    public final void w() {
        boolean z10;
        ti tiVar = this.f30254b;
        if (tiVar != null && (tiVar.f32990f0 instanceof org.telegram.ui.wn)) {
            z10 = true;
        } else {
            z10 = false;
        }
        V(z10);
    }

    public final void w0() {
        fm fmVar = this.E;
        if (fmVar != null) {
            for (int i10 = 0; i10 < fmVar.getChildCount(); i10++) {
                View childAt = fmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.x5) {
                    ((org.telegram.ui.Cells.x5) childAt).f25701a.invalidate();
                }
            }
        }
    }

    public final void x0() {
        ArrayList arrayList;
        if (this.f30254b.f32990f0 instanceof org.telegram.ui.wn) {
            fm fmVar = this.E;
            int childCount = fmVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f26020t1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = fmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                    MediaController.PhotoEntry c02 = c0(((Integer) x5Var.getTag()).intValue());
                    if (c02 != null) {
                        x5Var.setNum(arrayList.indexOf(Integer.valueOf(c02.imageId)));
                    }
                }
                i10++;
            }
            fm fmVar2 = this.f26054r;
            int childCount2 = fmVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = fmVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var2 = (org.telegram.ui.Cells.x5) childAt2;
                    MediaController.PhotoEntry c03 = c0(((Integer) x5Var2.getTag()).intValue());
                    if (c03 != null) {
                        x5Var2.setNum(arrayList.indexOf(Integer.valueOf(c03.imageId)));
                    }
                }
            }
        }
    }

    @Override
    public final void y(int i10, boolean z10) {
        W();
        pm pmVar = this.P;
        if (pmVar != null) {
            pmVar.invalidateOutline();
            this.P.invalidate();
        }
    }

    public final void y0() {
        ArrayList arrayList;
        tm tmVar;
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
        ti tiVar = this.f30254b;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
        org.telegram.ui.ActionBar.r2 r2Var2 = tiVar.f32990f0;
        if (r2Var instanceof org.telegram.ui.wn) {
            fm fmVar = this.E;
            int childCount = fmVar.getChildCount();
            int i11 = 0;
            while (true) {
                arrayList = f26020t1;
                tmVar = this.G;
                hashMap = f26019s1;
                int i12 = -1;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = fmVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (tmVar.f33106f && R > this.M0) {
                        R--;
                    }
                    if (tmVar.d && this.T0 == this.U0) {
                        R--;
                    }
                    MediaController.PhotoEntry c02 = c0(R);
                    if (c02 != null && c02.hasSpoiler) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    x5Var.setHasSpoiler(z14);
                    if (c02 != null && c02.isHighQuality()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    x5Var.setHighQuality(z15);
                    if ((r2Var2 instanceof org.telegram.ui.wn) && tiVar.W1) {
                        if (c02 != null) {
                            i12 = arrayList.indexOf(Integer.valueOf(c02.imageId));
                        }
                        if (c02 != null && hashMap.containsKey(Integer.valueOf(c02.imageId))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        x5Var.b(i12, z17, true);
                    } else {
                        if (c02 != null && hashMap.containsKey(Integer.valueOf(c02.imageId))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        x5Var.b(-1, z16, true);
                    }
                }
                i11++;
            }
            fm fmVar2 = this.f26054r;
            int childCount2 = fmVar2.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = fmVar2.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var2 = (org.telegram.ui.Cells.x5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (tmVar.f33106f && R2 > this.M0) {
                        R2--;
                    }
                    if (tmVar.d && this.T0 == this.U0) {
                        R2--;
                    }
                    MediaController.PhotoEntry c03 = c0(R2);
                    if (c03 != null && c03.hasSpoiler) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x5Var2.setHasSpoiler(z10);
                    if (c03 != null && c03.isHighQuality()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    x5Var2.setHighQuality(z11);
                    if ((r2Var2 instanceof org.telegram.ui.wn) && tiVar.W1) {
                        if (c03 != null) {
                            i10 = arrayList.indexOf(Integer.valueOf(c03.imageId));
                        } else {
                            i10 = -1;
                        }
                        if (c03 != null && hashMap.containsKey(Integer.valueOf(c03.imageId))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        x5Var2.b(i10, z13, true);
                    } else {
                        if (c03 != null && hashMap.containsKey(Integer.valueOf(c03.imageId))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        x5Var2.b(-1, z12, true);
                    }
                }
            }
        }
    }

    public final void z0(boolean z10) {
        boolean z11;
        TextView textView = this.f26051p0;
        if (textView != null) {
            ti tiVar = this.f30254b;
            int i10 = tiVar.T0;
            TextView textView2 = tiVar.f33010m1;
            if (i10 == 0 && !tiVar.W0 && !tiVar.H) {
                HashMap hashMap = f26019s1;
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
                tiVar.M = z11;
                tiVar.f33020p1.setVisibility((!z11 || tiVar.T0 == 2) ? 8 : 8);
                this.M = max;
            }
        }
    }
}
