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
public class ChatAttachAlertPhotoLayout extends ci implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f26241m1;
    public static final ArrayList f26242n1 = new ArrayList();
    public static final HashMap f26243o1 = new HashMap();
    public static final ArrayList f26244p1 = new ArrayList();
    public static int f26245q1 = -1;
    public final kl A;
    public final Rect A0;
    public final jh.k B;
    public float B0;
    public final yl C;
    public boolean C0;
    public final yy D;
    public boolean D0;
    public final yk0 E;
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
    public ul L;
    public boolean L0;
    public final vl M;
    public boolean M0;
    public final sl N;
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
    public final bb0 Z0;
    public float f26246a0;
    public final boolean f26247a1;
    public final int[] f26248b0;
    public final AnimationNotificationsLocker f26249b1;
    public int f26250c0;
    public boolean f26251c1;
    public hl f26252d0;
    public final ol f26253d1;
    public final DecelerateInterpolator f26254e0;
    public boolean f26255e1;
    public final fh.d2 f26256f0;
    public float f26257f1;
    public final ShutterButton f26258g0;
    public float f26259g1;
    public final i81 f26260h0;
    public float f26261h1;
    public AnimatorSet f26262i0;
    public float f26263i1;
    public Runnable f26264j0;
    public float f26265j1;
    public Boolean f26266k0;
    public ViewPropertyAnimator f26267k1;
    public final TextView f26268l0;
    public int l1;
    public final TextView m0;
    public final boolean f26269n;
    public final ImageView f26270n0;
    public boolean f26271o0;
    public boolean f26272p0;
    public boolean f26273q0;
    public final kl f26274r;
    public boolean f26275r0;
    public final of.y f26276s;
    public boolean f26277s0;
    public boolean f26278t0;
    public boolean f26279u0;
    public final yl v;
    public boolean f26280v0;
    public final pl f26281w;
    public float f26282w0;
    public final TextView f26283x;
    public float f26284x0;
    public final Drawable f26285y;
    public boolean f26286y0;
    public boolean f26287z0;

    public ChatAttachAlertPhotoLayout(ki kiVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, kiVar);
        boolean z12;
        this.O = new ImageView[2];
        this.Q = new float[2];
        this.R = new int[2];
        this.f26248b0 = new int[5];
        this.f26254e0 = new DecelerateInterpolator(1.5f);
        this.f26266k0 = null;
        this.A0 = new Rect();
        int dp = AndroidUtilities.dp(80.0f);
        this.G0 = dp;
        this.H0 = dp;
        this.I0 = 3;
        this.T0 = true;
        this.f26249b1 = new AnimationNotificationsLocker();
        this.f26253d1 = new ol(this);
        this.f26247a1 = z10;
        this.f26269n = z11;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        org.telegram.ui.ActionBar.d3 container = kiVar.getContainer();
        ki kiVar2 = this.f27493b;
        if (kiVar2.M0 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f26251c1 = z12;
        pl plVar = new pl(this, context, kiVar2.T0.n(), b6Var, 0);
        this.f26281w = plVar;
        plVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = g7.e6.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = AndroidUtilities.statusBarHeight;
        this.f27493b.T0.addView(plVar, 0, d);
        plVar.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f34987b;

            {
                this.f34987b = this;
            }

            @Override
            public final void onClick(View view) {
                ul ulVar;
                ul ulVar2;
                int i9 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34987b;
                switch (i9) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.L != null) {
                            chatAttachAlertPhotoLayout.i0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f26271o0 && (ulVar = chatAttachAlertPhotoLayout.L) != null && ulVar.isInited()) {
                            chatAttachAlertPhotoLayout.V = false;
                            chatAttachAlertPhotoLayout.L.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26270n0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new jl(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.P && (ulVar2 = chatAttachAlertPhotoLayout.L) != null && ulVar2.isInited() && chatAttachAlertPhotoLayout.U) {
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
                                ChatAttachAlertPhotoLayout.n0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(gr.f28844f);
                                animatorSet.addListener(new ih.j3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f26281w.M(null, null);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f26283x = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, this.f27492a));
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.f26285y = mutate;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, this.f27492a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        plVar.addView(textView, g7.e6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        T(false);
        bb0 bb0Var = new bb0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), b6Var);
        this.Z0 = bb0Var;
        bb0Var.a(!this.f27493b.Y, false);
        this.Y0 = this.f27493b.W0.e(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.f27493b.W0.a(5);
        this.f27493b.W0.e(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.V0 = this.f27493b.W0.e(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.f27493b.W0.e(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.f27493b.W0.a(6);
        this.U0 = this.f27493b.W0.e(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.W0 = this.f27493b.W0.e(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        org.telegram.ui.ActionBar.w0 w0Var = this.f27493b.W0;
        w0Var.o();
        bb0Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        bb0Var.setTag(8);
        w0Var.f23901b.addView(bb0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bb0Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        bb0Var.setLayoutParams(layoutParams);
        bb0Var.setOnClickListener(new org.telegram.ui.ActionBar.b0(w0Var, 2));
        this.X0 = this.f27493b.W0.e(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.f27493b.W0.setFitSubItems(true);
        kl klVar = new kl(this, context, b6Var, 1);
        this.A = klVar;
        klVar.setFastScrollEnabled(1);
        klVar.setFastScrollVisible(true);
        klVar.getFastScroll().setAlpha(0.0f);
        klVar.getFastScroll().f28464a = false;
        klVar.getFastScroll().f28470d0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        yl ylVar = new yl(this, context, z11);
        this.C = ylVar;
        klVar.setAdapter(ylVar);
        vl vlVar = new vl(this, klVar);
        this.M = vlVar;
        klVar.i(vlVar);
        for (int i10 = 0; i10 < 8; i10++) {
            ylVar.h.add(ylVar.L());
        }
        klVar.setClipToPadding(false);
        klVar.setItemAnimator(null);
        klVar.setLayoutAnimation(null);
        klVar.setVerticalScrollBarEnabled(false);
        klVar.setGlowColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A5, this.f27492a));
        addView(klVar, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        klVar.setOnScrollListener(new kh.g9(this, 2));
        jh.k kVar = new jh.k(this, this.G0, 2);
        this.B = kVar;
        kVar.O = new fh.c6(this, 5);
        klVar.setLayoutManager(kVar);
        klVar.setOnItemClickListener(new b5.e(this, z11, b6Var, 6));
        klVar.setOnItemLongClickListener(new zk(this, 3));
        yk0 yk0Var = new yk0(new rl(this));
        this.E = yk0Var;
        klVar.A.add(yk0Var);
        this.f27494c = klVar;
        this.d = klVar;
        this.f27496f = true;
        yy yyVar = new yy(context, b6Var);
        this.D = yyVar;
        yyVar.setText(LocaleController.getString(R.string.NoPhotos));
        yyVar.setOnTouchListener(null);
        yyVar.setTextSize(16);
        addView(yyVar, g7.e6.c(-2.0f, -1));
        if (this.T0) {
            yyVar.b();
        } else {
            yyVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        sl slVar = new sl(context, paint);
        this.N = slVar;
        AndroidUtilities.updateViewVisibilityAnimated(slVar, false, 1.0f, false);
        slVar.setBackgroundResource(R.drawable.system);
        slVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        slVar.setTextSize(1, 15.0f);
        slVar.setTypeface(AndroidUtilities.bold());
        slVar.setAlpha(0.0f);
        slVar.setTextColor(-1);
        slVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(slVar, g7.e6.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        fh.d2 d2Var = new fh.d2(this, context, 13);
        this.f26256f0 = d2Var;
        d2Var.setVisibility(8);
        d2Var.setAlpha(0.0f);
        container.addView(d2Var, g7.e6.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f26268l0 = textView2;
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
        container.addView(textView2, g7.e6.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f34987b;

            {
                this.f34987b = this;
            }

            @Override
            public final void onClick(View view) {
                ul ulVar;
                ul ulVar2;
                int i92 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34987b;
                switch (i92) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.L != null) {
                            chatAttachAlertPhotoLayout.i0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f26271o0 && (ulVar = chatAttachAlertPhotoLayout.L) != null && ulVar.isInited()) {
                            chatAttachAlertPhotoLayout.V = false;
                            chatAttachAlertPhotoLayout.L.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26270n0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new jl(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.P && (ulVar2 = chatAttachAlertPhotoLayout.L) != null && ulVar2.isInited() && chatAttachAlertPhotoLayout.U) {
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
                                ChatAttachAlertPhotoLayout.n0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(gr.f28844f);
                                animatorSet.addListener(new ih.j3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f26281w.M(null, null);
                        return;
                }
            }
        });
        i81 i81Var = new i81(context);
        this.f26260h0 = i81Var;
        i81Var.setVisibility(8);
        i81Var.setAlpha(0.0f);
        container.addView(i81Var, g7.e6.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        i81Var.setDelegate(new zk(this, 0));
        ?? view = new View(context);
        view.f26534b = new DecelerateInterpolator();
        view.f26541w = new ju0(view, 0);
        view.f26533a = view.getResources().getDrawable(R.drawable.camera_btn);
        Paint paint2 = new Paint(1);
        view.f26535c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f26537f = lu0.f30557a;
        this.f26258g0 = view;
        d2Var.addView((View) view, g7.e6.e(84, 84, 17));
        view.setDelegate(new il(this, b6Var, container));
        view.setFocusable(true);
        view.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.f26270n0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        d2Var.addView(imageView, g7.e6.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f34987b;

            {
                this.f34987b = this;
            }

            @Override
            public final void onClick(View view2) {
                ul ulVar;
                ul ulVar2;
                int i92 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34987b;
                switch (i92) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.L != null) {
                            chatAttachAlertPhotoLayout.i0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f26271o0 && (ulVar = chatAttachAlertPhotoLayout.L) != null && ulVar.isInited()) {
                            chatAttachAlertPhotoLayout.V = false;
                            chatAttachAlertPhotoLayout.L.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26270n0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new jl(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.P && (ulVar2 = chatAttachAlertPhotoLayout.L) != null && ulVar2.isInited() && chatAttachAlertPhotoLayout.U) {
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
                                ChatAttachAlertPhotoLayout.n0(imageView2, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(gr.f28844f);
                                animatorSet.addListener(new ih.j3(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f26281w.M(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i11 = 0; i11 < 2; i11++) {
            this.O[i11] = new ImageView(context);
            this.O[i11].setScaleType(ImageView.ScaleType.CENTER);
            this.O[i11].setVisibility(4);
            this.f26256f0.addView(this.O[i11], g7.e6.e(48, 48, 51));
            this.O[i11].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f34987b;

                {
                    this.f34987b = this;
                }

                @Override
                public final void onClick(View view2) {
                    ul ulVar;
                    ul ulVar2;
                    int i92 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34987b;
                    switch (i92) {
                        case 0:
                            if (chatAttachAlertPhotoLayout.L != null) {
                                chatAttachAlertPhotoLayout.i0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.f26271o0 && (ulVar = chatAttachAlertPhotoLayout.L) != null && ulVar.isInited()) {
                                chatAttachAlertPhotoLayout.V = false;
                                chatAttachAlertPhotoLayout.L.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26270n0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new jl(chatAttachAlertPhotoLayout));
                                duration.start();
                                return;
                            }
                            return;
                        case 2:
                            if (!chatAttachAlertPhotoLayout.P && (ulVar2 = chatAttachAlertPhotoLayout.L) != null && ulVar2.isInited() && chatAttachAlertPhotoLayout.U) {
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
                                    ChatAttachAlertPhotoLayout.n0(imageView2, nextFlashMode);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, AndroidUtilities.dp(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -AndroidUtilities.dp(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(gr.f28844f);
                                    animatorSet.addListener(new ih.j3(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            chatAttachAlertPhotoLayout.f26281w.M(null, null);
                            return;
                    }
                }
            });
            ImageView imageView2 = this.O[i11];
            imageView2.setContentDescription("flash mode " + i11);
        }
        TextView textView3 = new TextView(context);
        this.m0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(org.telegram.ui.Cells.j2.c(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.f26256f0.addView(textView3, g7.e6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        kl klVar2 = new kl(this, context, b6Var, 0);
        this.f26274r = klVar2;
        klVar2.setVerticalScrollBarEnabled(true);
        yl ylVar2 = new yl(this, context, false);
        this.v = ylVar2;
        klVar2.setAdapter(ylVar2);
        for (int i12 = 0; i12 < 8; i12++) {
            ylVar2.h.add(ylVar2.L());
        }
        klVar2.setClipToPadding(false);
        klVar2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        klVar2.setItemAnimator(null);
        klVar2.setLayoutAnimation(null);
        klVar2.setOverScrollMode(2);
        klVar2.setVisibility(4);
        klVar2.setAlpha(0.0f);
        container.addView(klVar2, g7.e6.c(80.0f, -1));
        of.y yVar = new of.y(0, false, 6);
        this.f26276s = yVar;
        klVar2.setLayoutManager(yVar);
        klVar2.setOnItemClickListener(new fh.a(3));
    }

    public static void J(org.telegram.ui.Components.ChatAttachAlertPhotoLayout r25, boolean r26, org.telegram.ui.ActionBar.b6 r27, android.view.View r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.J(org.telegram.ui.Components.ChatAttachAlertPhotoLayout, boolean, org.telegram.ui.ActionBar.b6, android.view.View, int):void");
    }

    public static org.telegram.ui.Cells.t5 K(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i9) {
        kl klVar = chatAttachAlertPhotoLayout.A;
        int childCount = klVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = klVar.getChildAt(i10);
            if (childAt.getTop() < klVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f27493b.l1() && (childAt instanceof org.telegram.ui.Cells.t5)) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (t5Var.getImageView().getTag() != null && ((Integer) t5Var.getImageView().getTag()).intValue() == i9) {
                    return t5Var;
                }
            }
        }
        return null;
    }

    public static int M(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
        if ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).N3 == 5) {
            return o2Var.getMessagesController().config.quickReplyMessagesLimit.get() - ((org.telegram.ui.qn) kiVar.f30099b0).f42042q6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static void N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        try {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33) {
                kiVar.f30099b0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
            } else if (i9 >= 23) {
                kiVar.f30099b0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            }
        } catch (Exception unused) {
        }
    }

    public static void O(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        if (Build.VERSION.SDK_INT >= 23 && f0.e.b(kiVar.f30099b0.getParentActivity(), "android.permission.CAMERA") != 0) {
            try {
                kiVar.f30099b0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        chatAttachAlertPhotoLayout.h0();
    }

    public static boolean R() {
        HashMap hashMap = f26243o1;
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

    public static boolean S() {
        CharSequence charSequence;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = f26244p1;
            if (i9 >= arrayList.size()) {
                break;
            }
            Object obj = f26243o1.get(arrayList.get(i9));
            if (obj instanceof MediaController.PhotoEntry) {
                charSequence = ((MediaController.PhotoEntry) obj).caption;
            } else if (obj instanceof MediaController.SearchImage) {
                charSequence = ((MediaController.SearchImage) obj).caption;
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                i10++;
            }
            i9++;
        }
        if (i10 > 1) {
            return false;
        }
        return true;
    }

    public static boolean b0() {
        HashMap hashMap = f26243o1;
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
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.l1;
    }

    public static void n0(ImageView imageView, String str) {
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
    public final void A(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.A(int):void");
    }

    @Override
    public final boolean C(int i9) {
        if (this.U) {
            if (i9 == 24 || i9 == 25 || i9 == 79 || i9 == 85) {
                ((il) this.f26258g0.getDelegate()).b();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void D(ci ciVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f26267k1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f26281w.setVisibility(0);
        boolean z10 = ciVar instanceof hm;
        TextView textView = this.f26283x;
        if (!z10) {
            Y();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(gr.f28847j);
            this.f26267k1 = interpolator;
            interpolator.start();
        }
        this.f27493b.T0.setTitle("");
        this.B.h1(0, 0);
        if (z10) {
            this.A.post(new org.telegram.ui.wq(23, this, ciVar));
        }
        U();
        l0();
    }

    @Override
    public final void E() {
        this.J = false;
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.setVisibility(0);
        }
        if (this.f26273q0) {
            this.f26273q0 = false;
            T(true);
        }
    }

    @Override
    public final void F() {
        this.A.x0(0);
    }

    public final int P(MediaController.PhotoEntry photoEntry, int i9) {
        boolean z10;
        Integer valueOf = Integer.valueOf(photoEntry.imageId);
        HashMap hashMap = f26243o1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f26244p1;
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
            x0(false);
            v0();
            if (i9 >= 0) {
                photoEntry.reset();
                this.f26253d1.W(i9);
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
        if (b0()) {
            photoEntry.discardLivePhoto = Boolean.valueOf(!R());
        }
        photoEntry.highQuality = Boolean.valueOf(photoEntry.isHighQuality());
        boolean V = V(true);
        hashMap.put(valueOf, photoEntry);
        arrayList.add(valueOf);
        if (V) {
            w0();
            return -1;
        }
        x0(true);
        return -1;
    }

    public final void Q() {
        ul ulVar = this.L;
        if (ulVar != null) {
            if (!this.U) {
                ulVar.setTranslationX(this.Q[0]);
            }
            int i9 = this.G0;
            int dp = AndroidUtilities.dp(2.0f) + (i9 * 2);
            if (!this.U) {
                this.L.setClipTop((int) this.S);
                this.L.setClipBottom((int) this.T);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.L.getLayoutParams();
                if (layoutParams.height != dp || layoutParams.width != i9) {
                    layoutParams.width = i9;
                    layoutParams.height = dp;
                    this.L.setLayoutParams(layoutParams);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.wq(24, this, layoutParams));
                }
            }
        }
    }

    public final void T(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z11;
        yl ylVar;
        ki kiVar = this.f27493b;
        boolean z12 = kiVar.R;
        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.f30099b0;
        if (!z12 && this.f26269n) {
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
                if ((z13 != this.J0 || z14 != this.K0) && (ylVar = this.C) != null) {
                    ylVar.l();
                }
                if (!kiVar.R && kiVar.isShowing() && this.J0 && kiVar.getBackDrawable().getAlpha() != 0 && !this.U) {
                    r0();
                }
            }
        }
    }

    public final void U() {
        f2.q1 K;
        float[] fArr;
        int i9;
        float f10;
        sl slVar;
        int systemWindowInsetTop;
        if (!PhotoViewer.C1() || PhotoViewer.t1().f35685l5 == null || !PhotoViewer.t1().f35685l5.R) {
            ul ulVar = this.L;
            if (ulVar != null) {
                ulVar.invalidateOutline();
            }
            kl klVar = this.A;
            f2.q1 K2 = klVar.K(this.I0 - 1);
            if (K2 != null) {
                K2.f5501a.invalidateOutline();
            }
            if ((!this.C.d || !this.J0 || this.P0 != this.Q0) && (K = klVar.K(0)) != null) {
                K.f5501a.invalidateOutline();
            }
            ul ulVar2 = this.L;
            if (ulVar2 != null) {
                ulVar2.invalidate();
            }
            if (Build.VERSION.SDK_INT >= 23 && (slVar = this.N) != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) slVar.getLayoutParams();
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
            int childCount = klVar.getChildCount();
            int i10 = 0;
            while (true) {
                fArr = this.Q;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = klVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.m5) {
                    if (childAt.isAttachedToWindow()) {
                        float y10 = getY() + klVar.getY() + childAt.getY();
                        ki kiVar = this.f27493b;
                        ViewGroup sheetContainer = kiVar.getSheetContainer();
                        nh nhVar = kiVar.f30161u1;
                        fh.v vVar = kiVar.K0;
                        float y11 = sheetContainer.getY() + y10;
                        float x10 = kiVar.getSheetContainer().getX() + getX() + klVar.getX() + childAt.getX();
                        if (Build.VERSION.SDK_INT >= 23) {
                            x10 -= getRootWindowInsets().getSystemWindowInsetLeft();
                        }
                        if (!kiVar.f30103c0) {
                            i9 = AndroidUtilities.statusBarHeight;
                        } else {
                            i9 = 0;
                        }
                        float alpha = (vVar.getAlpha() * vVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i9;
                        kh.i iVar = kiVar.f30173x2;
                        if (iVar != null && iVar.g()) {
                            alpha = Math.max(alpha, (kiVar.f30173x2.e() + kiVar.f30173x2.getY()) - kiVar.f30122h2);
                        }
                        if (y10 < alpha) {
                            f10 = alpha - y10;
                        } else {
                            f10 = 0.0f;
                        }
                        if (f10 != this.S) {
                            this.S = f10;
                            ul ulVar3 = this.L;
                            if (ulVar3 != null) {
                                ulVar3.invalidateOutline();
                                this.L.invalidate();
                            }
                        }
                        float translationY = (int) (nhVar.getTranslationY() + (kiVar.getSheetContainer().getMeasuredHeight() - nhVar.getMeasuredHeight()));
                        kh.i iVar2 = kiVar.f30173x2;
                        if (iVar2 != null) {
                            translationY -= iVar2.d() - AndroidUtilities.dp(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y10 > translationY) {
                            this.T = Math.min(-AndroidUtilities.dp(5.0f), y10 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.T = 0.0f;
                        }
                        fArr[0] = x10;
                        fArr[1] = y11;
                        Q();
                        return;
                    }
                } else {
                    i10++;
                }
            }
            if (this.S != 0.0f) {
                this.S = 0.0f;
                ul ulVar4 = this.L;
                if (ulVar4 != null) {
                    ulVar4.invalidateOutline();
                    this.L.invalidate();
                }
            }
            fArr[0] = AndroidUtilities.dp(-400.0f);
            fArr[1] = 0.0f;
            Q();
        }
    }

    public final boolean V(boolean z10) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            HashMap hashMap = f26243o1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f26244p1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof MediaController.PhotoEntry)) {
                break;
            }
            P((MediaController.PhotoEntry) obj, -1);
            z11 = true;
        }
        return z11;
    }

    public final boolean W(MediaController.PhotoEntry photoEntry) {
        boolean z10 = this.f26277s0;
        org.telegram.ui.ActionBar.b6 b6Var = this.f27492a;
        ki kiVar = this.f27493b;
        if (!z10 && photoEntry.isVideo) {
            if (!kiVar.a1()) {
                org.telegram.messenger.ll.p(R.string.GlobalAttachVideoRestricted, new oc(kiVar.f30138n1, b6Var), null);
                return true;
            }
        } else if (!this.f26278t0 && !photoEntry.isVideo) {
            if (!kiVar.a1()) {
                org.telegram.messenger.ll.p(R.string.GlobalAttachPhotoRestricted, new oc(kiVar.f30138n1, b6Var), null);
                return true;
            }
        } else {
            return false;
        }
        return true;
    }

    public final void X() {
        if (this.L0 && Build.VERSION.SDK_INT >= 23) {
            boolean d02 = d0();
            this.L0 = d02;
            if (!d02) {
                e0();
            }
            this.C.l();
            this.v.l();
        }
    }

    public final void Y() {
        String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
        org.telegram.ui.ActionBar.g1 g1Var = this.U0;
        g1Var.setText(string);
        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.f27493b.W0.K(1);
        HashMap hashMap = f26243o1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((MediaController.PhotoEntry) entry.getValue()).reset();
            }
            hashMap.clear();
            f26244p1.clear();
        }
        ArrayList arrayList = f26242n1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i9);
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

    public final void Z(boolean z10) {
        boolean z11;
        ul ulVar;
        if (!this.f26271o0 && this.L != null) {
            int i9 = this.G0;
            int[] iArr = this.f26248b0;
            iArr[1] = i9;
            iArr[2] = AndroidUtilities.dp(2.0f) + (i9 * 2);
            Runnable runnable = this.f26264j0;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.f26264j0 = null;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, this.f27492a)) > 0.721d) {
                z11 = true;
            } else {
                z11 = false;
            }
            ki kiVar = this.f27493b;
            AndroidUtilities.setLightNavigationBar(kiVar, z11);
            TextView textView = this.f26268l0;
            kl klVar = this.f26274r;
            fh.d2 d2Var = this.f26256f0;
            kl klVar2 = this.A;
            ImageView[] imageViewArr = this.O;
            i81 i81Var = this.f26260h0;
            if (z10) {
                this.f26257f1 = this.L.getTranslationY();
                this.W = true;
                if (klVar2 != null) {
                    klVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(d2Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(i81Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(klVar, property, 0.0f));
                int i10 = 0;
                while (true) {
                    if (i10 >= 2) {
                        break;
                    } else if (imageViewArr[i10].getVisibility() == 0) {
                        arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i10], property, 0.0f));
                        break;
                    } else {
                        i10++;
                    }
                }
                this.f26249b1.lock();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(gr.f28844f);
                animatorSet.addListener(new ml(this, 2));
                animatorSet.start();
            } else {
                this.f26255e1 = false;
                kiVar.getWindow().clearFlags(128);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                d2Var.setAlpha(0.0f);
                d2Var.setVisibility(8);
                i81Var.setAlpha(0.0f);
                i81Var.setTag(null);
                i81Var.setVisibility(8);
                klVar.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                klVar.setVisibility(8);
                int i11 = 0;
                while (true) {
                    if (i11 >= 2) {
                        break;
                    } else if (imageViewArr[i11].getVisibility() == 0) {
                        imageViewArr[i11].setAlpha(0.0f);
                        break;
                    } else {
                        i11++;
                    }
                }
                this.U = false;
                ul ulVar2 = this.L;
                if (ulVar2 != null) {
                    ulVar2.setFpsLimit(30);
                    this.L.setSystemUiVisibility(1024);
                }
                if (klVar2 != null) {
                    klVar2.invalidate();
                }
            }
            ul ulVar3 = this.L;
            if (ulVar3 != null) {
                ulVar3.setImportantForAccessibility(0);
            }
            klVar2.setImportantForAccessibility(0);
            if (!LiteMode.isEnabled(360928) && (ulVar = this.L) != null) {
                ulVar.showTexture(false, z10);
            }
        }
    }

    @Override
    public final void a(CharSequence charSequence) {
        MediaController.PhotoEntry photoEntry;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = f26244p1;
            if (i9 < arrayList.size()) {
                if (i9 == 0) {
                    Object obj = arrayList.get(i9);
                    HashMap hashMap = f26243o1;
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
                i9++;
            } else {
                return;
            }
        }
    }

    public final MediaController.PhotoEntry a0(int i9) {
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = f26242n1;
        int size = arrayList.size();
        if (i9 < size) {
            return (MediaController.PhotoEntry) arrayList.get(i9);
        }
        int i10 = i9 - size;
        MediaController.AlbumEntry albumEntry = this.P0;
        if (albumEntry == null || i10 >= albumEntry.photos.size()) {
            return null;
        }
        return this.P0.photos.get(i10);
    }

    @Override
    public final boolean b() {
        return !this.U;
    }

    @Override
    public final boolean c() {
        for (Map.Entry entry : f26243o1.entrySet()) {
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

    public final void c0(boolean z10) {
        if (this.J0 && this.L != null) {
            m0();
            this.M.f();
            this.L.destroy(z10, null);
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.K = null;
            }
            AndroidUtilities.runOnUIThread(new cl(this, 0), 300L);
            this.V = false;
        }
    }

    @Override
    public final void d() {
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z10 = this.f26247a1;
        if (z10) {
            i9 = org.telegram.ui.ActionBar.f6.f23083hg;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23108j5;
        }
        int i13 = org.telegram.ui.ActionBar.f6.f22984c7;
        org.telegram.ui.ActionBar.b6 b6Var = this.f27492a;
        this.D.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A5, b6Var);
        kl klVar = this.A;
        klVar.setGlowColor(v02);
        klVar.K(0);
        this.f26283x.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        if (z10) {
            i10 = org.telegram.ui.ActionBar.f6.f23083hg;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.E8;
        }
        int v03 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        pl plVar = this.f26281w;
        plVar.G(v03, false);
        if (z10) {
            i11 = org.telegram.ui.ActionBar.f6.f23083hg;
        } else {
            i11 = org.telegram.ui.ActionBar.f6.E8;
        }
        plVar.G(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), true);
        if (z10) {
            i12 = org.telegram.ui.ActionBar.f6.f23118jg;
        } else {
            i12 = org.telegram.ui.ActionBar.f6.G8;
        }
        plVar.B(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        org.telegram.ui.ActionBar.f6.w1(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), this.f26285y);
    }

    public final boolean d0() {
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (findActivity == null) {
            findActivity = this.f27493b.f30099b0.getParentActivity();
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23) {
            if (findActivity != null) {
                if (i9 < 33 || (findActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && findActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
                    if (i9 < 33 && findActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
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

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ki kiVar;
        if (i9 == NotificationCenter.albumsDidLoad) {
            yl ylVar = this.C;
            if (ylVar != null) {
                if (p0()) {
                    this.Q0 = MediaController.allMediaAlbumEntry;
                } else {
                    this.Q0 = MediaController.allPhotosAlbumEntry;
                }
                if (this.P0 != null && ((kiVar = this.f27493b) == null || !kiVar.C)) {
                    if (p0()) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= MediaController.allMediaAlbums.size()) {
                                break;
                            }
                            MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i11);
                            int i12 = albumEntry.bucketId;
                            MediaController.AlbumEntry albumEntry2 = this.P0;
                            if (i12 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                                this.P0 = albumEntry;
                                break;
                            }
                            i11++;
                        }
                    }
                } else {
                    this.P0 = this.Q0;
                }
                this.T0 = false;
                this.D.c();
                ylVar.l();
                this.v.l();
                ArrayList arrayList = f26244p1;
                if (!arrayList.isEmpty() && this.Q0 != null) {
                    int size = arrayList.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        Integer num = (Integer) arrayList.get(i13);
                        HashMap hashMap = f26243o1;
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
                t0();
            }
        } else if (i9 == NotificationCenter.cameraInitied) {
            T(false);
        }
    }

    public final void e0() {
        MediaController.AlbumEntry albumEntry;
        if (p0()) {
            albumEntry = MediaController.allMediaAlbumEntry;
        } else {
            albumEntry = MediaController.allPhotosAlbumEntry;
        }
        if (albumEntry == null) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
    }

    public final void f0(int r29, android.content.Intent r30, java.lang.String r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.f0(int, android.content.Intent, java.lang.String):void");
    }

    public final void g0(boolean z10) {
        ul ulVar;
        if (this.L != null && this.K == null) {
            ki kiVar = this.f27493b;
            if (!kiVar.isDismissed()) {
                this.L.initTexture();
                boolean p02 = p0();
                TextView textView = this.m0;
                int i9 = 0;
                if (p02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f26242n1.isEmpty();
                kl klVar = this.f26274r;
                TextView textView2 = this.f26268l0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    klVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    klVar.setVisibility(0);
                }
                if (kiVar.m1().v && isFocusable()) {
                    kiVar.m1().d();
                }
                i81 i81Var = this.f26260h0;
                i81Var.setVisibility(0);
                i81Var.setAlpha(0.0f);
                fh.d2 d2Var = this.f26256f0;
                d2Var.setVisibility(0);
                d2Var.setTag(null);
                int[] iArr = this.f26248b0;
                iArr[0] = 0;
                int i10 = this.G0;
                iArr[1] = i10;
                iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
                this.f26257f1 = 0.0f;
                this.f26255e1 = true;
                ul ulVar2 = this.L;
                if (ulVar2 != null) {
                    ulVar2.setFpsLimit(-1);
                }
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.setLightNavigationBar((Dialog) kiVar, false);
                kiVar.getWindow().addFlags(128);
                kl klVar2 = this.A;
                ImageView[] imageViewArr = this.O;
                if (z10) {
                    setCameraOpenProgress(0.0f);
                    this.W = true;
                    if (klVar2 != null) {
                        klVar2.invalidate();
                    }
                    this.f26249b1.lock();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(d2Var, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(klVar, property, 1.0f));
                    int i11 = 0;
                    while (true) {
                        if (i11 >= 2) {
                            break;
                        } else if (imageViewArr[i11].getVisibility() == 0) {
                            arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i11], property, 1.0f));
                            break;
                        } else {
                            i11++;
                        }
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(350L);
                    animatorSet.setInterpolator(gr.f28844f);
                    animatorSet.addListener(new ml(this, 1));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    d2Var.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    klVar.setAlpha(1.0f);
                    while (true) {
                        if (i9 >= 2) {
                            break;
                        } else if (imageViewArr[i9].getVisibility() == 0) {
                            imageViewArr[i9].setAlpha(1.0f);
                            break;
                        } else {
                            i9++;
                        }
                    }
                    kiVar.V1.u();
                    ul ulVar3 = this.L;
                    if (ulVar3 != null) {
                        ulVar3.setSystemUiVisibility(1028);
                    }
                }
                this.U = true;
                ul ulVar4 = this.L;
                if (ulVar4 != null) {
                    ulVar4.setImportantForAccessibility(2);
                }
                klVar2.setImportantForAccessibility(4);
                klVar2.invalidate();
                if (!LiteMode.isEnabled(360928) && (ulVar = this.L) != null && ulVar.isInited()) {
                    this.L.showTexture(true, z10);
                }
            }
        }
    }

    public ArrayList<Object> getAllPhotosArray() {
        MediaController.AlbumEntry albumEntry = this.P0;
        ArrayList<Object> arrayList = f26242n1;
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
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.f26246a0;
    }

    @Override
    public int getCurrentItemTop() {
        kl klVar = this.A;
        int childCount = klVar.getChildCount();
        yy yyVar = this.D;
        if (childCount <= 0) {
            klVar.setTopGlowOffset(klVar.getPaddingTop());
            yyVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = klVar.getChildAt(0);
        ik0 ik0Var = (ik0) klVar.G(childAt);
        int top = childAt.getTop() - this.l1;
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || ik0Var == null || ik0Var.b() != 0) {
            top = dp;
        }
        yyVar.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - yyVar.getMeasuredHeight()) / 2.0f) + top);
        klVar.setTopGlowOffset(top);
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
        return f26244p1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f26243o1;
    }

    public int getSelectedPhotosCount() {
        int i9 = 0;
        for (Object obj : f26243o1.values()) {
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoEntry.isVideo && photoEntry.editedInfo == null) {
                    i9++;
                }
            }
        }
        return i9;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i9 = 0;
        for (Object obj : f26243o1.values()) {
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.isHighQuality() && !photoEntry.isVideo && photoEntry.editedInfo == null) {
                    i9++;
                }
            }
        }
        return i9;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return f26244p1;
    }

    public long getStarsPrice() {
        Iterator it = f26243o1.entrySet().iterator();
        if (it.hasNext()) {
            return ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).starsAmount;
        }
        return 0L;
    }

    @Override
    public final int h() {
        return 1;
    }

    public final void h0() {
        if (SharedConfig.inappCamera) {
            g0(true);
            return;
        }
        ki kiVar = this.f27493b;
        ii iiVar = kiVar.V1;
        if (iiVar != null) {
            iiVar.L(0, false, true, 0, 0, 0L, kiVar.s1(), false, 0L);
        }
    }

    public final void i0(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        int i9;
        org.telegram.ui.qn qnVar;
        int i10;
        org.telegram.ui.qn qnVar2;
        ArrayList<Object> arrayList;
        int i11;
        ArrayList arrayList2 = f26242n1;
        ki kiVar = this.f27493b;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            f26243o1.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            f26244p1.add(Integer.valueOf(photoEntry.imageId));
            kiVar.V1(0);
            this.C.l();
            this.v.l();
        }
        if (photoEntry != null && !z11 && arrayList2.size() > 1) {
            x0(false);
            if (this.L != null) {
                this.f26260h0.b(0.0f, false);
                this.f26284x0 = 0.0f;
                this.L.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.L.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f26272p0 = true;
            org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
            org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.f30099b0;
            if (o2Var == null) {
                o2Var = LaunchActivity.R();
            }
            if (o2Var != null) {
                PhotoViewer.t1().K2(o2Var.getParentActivity(), null, this.f27492a);
                PhotoViewer.t1().L2(kiVar);
                PhotoViewer t12 = PhotoViewer.t1();
                int i12 = kiVar.O1;
                boolean z12 = kiVar.P1;
                t12.h = i12;
                t12.f35697n = z12;
                if (kiVar.B && kiVar.C) {
                    qnVar = (org.telegram.ui.qn) o2Var2;
                    i9 = 11;
                } else if (kiVar.M0 != 0) {
                    qnVar = null;
                    i9 = 1;
                } else if (o2Var2 instanceof org.telegram.ui.qn) {
                    qnVar = (org.telegram.ui.qn) o2Var2;
                    i9 = 2;
                } else {
                    i9 = 5;
                    qnVar = null;
                }
                boolean z13 = kiVar.D;
                if (z13) {
                    qnVar2 = null;
                    i10 = 13;
                } else {
                    i10 = i9;
                    qnVar2 = qnVar;
                }
                if (kiVar.M0 == 0 && !z13) {
                    arrayList = getAllPhotosArray();
                    i11 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(photoEntry);
                    i11 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                c40 c40Var = kiVar.M;
                if (c40Var != null && photoEntry != null) {
                    c40Var.f27363e = photoEntry.isVideo;
                }
                PhotoViewer.t1().f2(arrayList3, i11, i10, false, new ll(this, z10), qnVar2);
                PhotoViewer.t1().x2(kiVar.M);
                if (kiVar.C) {
                    PhotoViewer.t1().X0(null, null, false, kiVar.F);
                    PhotoViewer.t1().l2();
                }
            }
        }
    }

    @Override
    public final void j() {
        U();
        invalidate();
    }

    public final void j0() {
        try {
            if (this.L != null) {
                CameraController.getInstance().stopPreview(this.L.getCameraSessionObject());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void k(float f10) {
        this.S0 = f10;
        U();
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.invalidateOutline();
            this.L.invalidate();
        }
        invalidate();
    }

    public final void k0() {
        if (this.f27493b.R) {
            return;
        }
        for (int i9 = 0; i9 < 2; i9++) {
            this.O[i9].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(gr.f28844f).start();
        }
        ViewPropertyAnimator duration = this.f26270n0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        gr grVar = gr.f28844f;
        duration.setInterpolator(grVar).start();
        this.m0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false);
        AndroidUtilities.cancelRunOnUIThread(this.f26252d0);
        this.f26252d0 = null;
        AndroidUtilities.unlockOrientation(AndroidUtilities.findActivity(getContext()));
    }

    @Override
    public final boolean l(MotionEvent motionEvent) {
        ul ulVar;
        if (!this.W) {
            if (this.U && motionEvent != null) {
                boolean z10 = this.C0;
                i81 i81Var = this.f26260h0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.A0;
                    i81Var.getHitRect(rect);
                    if (i81Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f26271o0 && !this.E0) {
                            if (motionEvent.getPointerCount() == 2) {
                                this.f26282w0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                this.f26286y0 = true;
                            } else {
                                this.D0 = true;
                                this.B0 = motionEvent.getY();
                                this.f26286y0 = false;
                            }
                            this.f26287z0 = false;
                            this.C0 = true;
                            return true;
                        }
                    }
                } else if (this.C0) {
                    int actionMasked = motionEvent.getActionMasked();
                    kl klVar = this.f26274r;
                    TextView textView = this.f26268l0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.O;
                    fh.d2 d2Var = this.f26256f0;
                    if (actionMasked == 2) {
                        if (this.f26286y0 && motionEvent.getPointerCount() == 2 && !this.E0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (!this.f26287z0) {
                                if (Math.abs(hypot - this.f26282w0) >= AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.f26282w0 = hypot;
                                    this.f26287z0 = true;
                                    return true;
                                }
                            } else if (this.L != null) {
                                this.f26282w0 = hypot;
                                float dp = this.f26284x0 + ((hypot - this.f26282w0) / AndroidUtilities.dp(100.0f));
                                this.f26284x0 = dp;
                                if (dp < 0.0f) {
                                    this.f26284x0 = 0.0f;
                                } else if (dp > 1.0f) {
                                    this.f26284x0 = 1.0f;
                                }
                                i81Var.b(this.f26284x0, false);
                                this.f27493b.getSheetContainer().invalidate();
                                this.L.setZoom(this.f26284x0);
                                s0(true);
                                return true;
                            }
                        } else {
                            float y10 = motionEvent.getY();
                            float f10 = y10 - this.B0;
                            if (this.D0) {
                                if (Math.abs(f10) > AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.D0 = false;
                                    this.E0 = true;
                                    return true;
                                }
                            } else if (this.E0 && (ulVar = this.L) != null) {
                                ulVar.setTranslationY(ulVar.getTranslationY() + f10);
                                this.B0 = y10;
                                i81Var.setTag(null);
                                Runnable runnable = this.f26264j0;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.f26264j0 = null;
                                }
                                if (d2Var.getTag() == null) {
                                    d2Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(d2Var, property, 0.0f), ObjectAnimator.ofFloat(i81Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(klVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(gr.f28844f);
                                    animatorSet.start();
                                    return true;
                                }
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                        this.C0 = false;
                        this.f26286y0 = false;
                        if (this.E0) {
                            this.E0 = false;
                            ul ulVar2 = this.L;
                            if (ulVar2 != null) {
                                if (Math.abs(ulVar2.getTranslationY()) > this.L.getMeasuredHeight() / 6.0f) {
                                    Z(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.L, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(d2Var, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(klVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f26254e0);
                                animatorSet2.start();
                                d2Var.setTag(null);
                                return true;
                            }
                        } else {
                            ul ulVar3 = this.L;
                            if (ulVar3 != null && !this.f26287z0) {
                                int[] iArr = this.R;
                                ulVar3.getLocationOnScreen(iArr);
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
        try {
            T(false);
            if (this.L != null) {
                CameraController.getInstance().startPreview(this.L.getCameraSessionObject());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void m() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.cameraInitied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
    }

    public final void m0() {
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
    public final boolean n() {
        if (this.W) {
            return true;
        }
        if (this.U) {
            Z(true);
            return true;
        }
        c0(true);
        return false;
    }

    @Override
    public final void o(int i9) {
        boolean z10;
        if (i9 != 0 && i9 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        c0(z10);
    }

    public final void o0(int i9, final boolean z10) {
        PhotoViewer t12 = PhotoViewer.t1();
        if (i9 == -1) {
            i9 = t12.L4;
        }
        ArrayList arrayList = t12.f35605c7;
        if (arrayList != null && !arrayList.isEmpty() && i9 < arrayList.size() && (arrayList.get(i9) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) arrayList.get(i9)).hasSpoiler) {
            final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i9);
            this.A.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z11 = ChatAttachAlertPhotoLayout.f26241m1;
                    if (view instanceof org.telegram.ui.Cells.t5) {
                        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                        if (t5Var.getPhotoEntry() == photoEntry) {
                            t5Var.c(z10, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z12 = true;
                            if (ChatAttachAlertPhotoLayout.f26243o1.size() <= 1) {
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
        if (this.O0 != i13) {
            this.O0 = i13;
            yl ylVar = this.C;
            if (ylVar != null) {
                ylVar.l();
            }
        }
        super.onLayout(z10, i9, i10, i11, i12);
        U();
    }

    public final boolean p0() {
        if (!this.f26279u0) {
            ki kiVar = this.f27493b;
            if (!kiVar.B) {
                if (!(kiVar.f30099b0 instanceof org.telegram.ui.qn) && !kiVar.P0 && kiVar.M0 != 2) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void q() {
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.setVisibility(8);
        }
        for (Map.Entry entry : f26243o1.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.C.l();
    }

    public final void q0(y8 y8Var, TLRPC.VideoSize videoSize, long j10) {
        boolean z10;
        ki kiVar = this.f27493b;
        w8 w8Var = new w8(kiVar.Q, kiVar.M);
        c40 c40Var = kiVar.M;
        if (c40Var != null && c40Var.f27362c == 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        w8Var.M = z10;
        kiVar.f30099b0.presentFragment(w8Var);
        if (y8Var != null) {
            w8Var.l0(y8Var);
        }
        if (videoSize != null) {
            w8Var.k0(videoSize);
        }
        if (j10 != 0) {
            w8Var.j0(j10);
        }
        w8Var.E = new g1(13, this, w8Var);
    }

    @Override
    public final void r() {
        this.J = true;
        kl klVar = this.A;
        int childCount = klVar.getChildCount();
        int i9 = 0;
        while (true) {
            if (i9 >= childCount) {
                break;
            } else if (klVar.getChildAt(i9) instanceof org.telegram.ui.Cells.m5) {
                m0();
                break;
            } else {
                this.M.f();
                i9++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f26267k1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f26283x.animate().alpha(0.0f).setDuration(150L).setInterpolator(gr.f28847j).withEndAction(new cl(this, 1));
        this.f26267k1 = withEndAction;
        withEndAction.start();
        j0();
    }

    public final void r0() {
        boolean z10;
        boolean z11;
        float f10;
        ki kiVar = this.f27493b;
        if (!kiVar.f30101b2 && this.f26275r0 && CameraView.isCameraAllowed()) {
            if (this.L == null) {
                boolean z12 = !LiteMode.isEnabled(360928);
                Context context = getContext();
                Boolean bool = this.f26266k0;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = kiVar.Q1;
                }
                ul ulVar = new ul(this, context, z10, z12);
                this.L = ulVar;
                org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
                if ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).w()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ulVar.setRecordFile(AndroidUtilities.generateVideoPath(z11));
                this.L.setFocusable(true);
                this.L.setFpsLimit(30);
                this.L.setOutlineProvider(new kg.b(this, 1));
                this.L.setClipToOutline(true);
                this.L.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                org.telegram.ui.ActionBar.d3 container = kiVar.getContainer();
                ul ulVar2 = this.L;
                int i9 = this.G0;
                container.addView(ulVar2, 1, new FrameLayout.LayoutParams(i9, i9));
                this.L.setDelegate(new nl(this));
                ul ulVar3 = this.L;
                if (this.f26275r0) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                ulVar3.setAlpha(f10);
                this.L.setEnabled(this.f26275r0);
                if (this.J) {
                    this.L.setVisibility(8);
                }
                if (!this.U) {
                    U();
                }
                kl klVar = this.A;
                if (klVar != null) {
                    klVar.invalidate();
                }
                invalidate();
            }
            i81 i81Var = this.f26260h0;
            if (i81Var != null) {
                i81Var.b(0.0f, false);
                this.f26284x0 = 0.0f;
            }
            if (!this.U) {
                this.L.setTranslationX(this.Q[0]);
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.N0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(float f10) {
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.setAlpha(f10);
            int i9 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i9 != 0 && this.L.getVisibility() != 0) {
                this.L.setVisibility(0);
            } else if (i9 == 0 && this.L.getVisibility() != 4) {
                this.L.setVisibility(4);
            }
        }
    }

    public final void s0(boolean z10) {
        Integer num;
        float f10;
        i81 i81Var = this.f26260h0;
        if ((i81Var.getTag() != null && z10) || (i81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f26264j0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                cl clVar = new cl(this, 3);
                this.f26264j0 = clVar;
                AndroidUtilities.runOnUIThread(clVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f26262i0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        i81Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26262i0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.f26262i0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(i81Var, View.ALPHA, f10));
        this.f26262i0.addListener(new ml(this, 0));
        this.f26262i0.start();
        if (z10) {
            cl clVar2 = new cl(this, 4);
            this.f26264j0 = clVar2;
            AndroidUtilities.runOnUIThread(clVar2, 2000L);
        }
    }

    public void setCameraOpenProgress(float f10) {
        int i9;
        int i10;
        if (this.L == null) {
            return;
        }
        this.f26246a0 = f10;
        int[] iArr = this.f26248b0;
        float f11 = iArr[1];
        float f12 = iArr[2];
        int i11 = AndroidUtilities.displaySize.x;
        ki kiVar = this.f27493b;
        float width = (kiVar.getContainer().getWidth() - kiVar.getLeftInset()) - kiVar.getRightInset();
        float height = kiVar.getContainer().getHeight();
        float[] fArr = this.Q;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = this.f26257f1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.L.getLayoutParams();
        float textureHeight = this.L.getTextureHeight(f11, f12) / this.L.getTextureHeight(width, height);
        float f16 = f12 / height;
        float f17 = f11 / width;
        if (this.f26255e1) {
            i9 = (int) width;
            i10 = (int) height;
            float f18 = 1.0f - f10;
            float f19 = (textureHeight * f18) + f10;
            this.L.getTextureView().setScaleX(f19);
            this.L.getTextureView().setScaleY(f19);
            float f20 = f13 * f18;
            this.L.setTranslationX(((0.0f * f10) + f20) - (((1.0f - ((f17 * f18) + f10)) * width) / 2.0f));
            float f21 = f14 * f18;
            this.L.setTranslationY(((f15 * f10) + f21) - (((1.0f - ((f16 * f18) + f10)) * height) / 2.0f));
            this.f26259g1 = f21 - this.L.getTranslationY();
            this.f26261h1 = (height * f10) + (((f14 + f12) * f18) - this.L.getTranslationY());
            this.f26265j1 = f20 - this.L.getTranslationX();
            this.f26263i1 = (width * f10) + (((f13 + f11) * f18) - this.L.getTranslationX());
        } else {
            i9 = (int) f11;
            i10 = (int) f12;
            this.L.getTextureView().setScaleX(1.0f);
            this.L.getTextureView().setScaleY(1.0f);
            this.f26259g1 = 0.0f;
            this.f26261h1 = height;
            this.f26265j1 = 0.0f;
            this.f26263i1 = width;
            this.L.setTranslationX(f13);
            this.L.setTranslationY(f14);
        }
        if (layoutParams.width != i9 || layoutParams.height != i10) {
            layoutParams.width = i9;
            layoutParams.height = i10;
            this.L.requestLayout();
        }
        this.L.invalidateOutline();
        this.L.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z10) {
        this.f26273q0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.f26279u0 = z10;
    }

    public void setStarsPrice(long j10) {
        boolean z10;
        HashMap hashMap = f26243o1;
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
        A(getSelectedItemsCount());
        if (V(false)) {
            w0();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        ki kiVar = this.f27493b;
        if (kiVar.getSheetAnimationType() == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            kl klVar = this.A;
            int childCount = klVar.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = klVar.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    float f12 = 1.0f + f11;
                    t5Var.getCheckBox().setScaleX(f12);
                    t5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        kiVar.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void t(int i9) {
        TLRPC.Chat k12;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        ki kiVar = this.f27493b;
        if (i9 == 8) {
            kiVar.H1(!kiVar.Y, true);
            this.Z0.a(!kiVar.Y, true);
        } else if ((i9 == 0 || i9 == 1) && kiVar.O1 > 0 && f26244p1.size() > 1 && (k12 = kiVar.k1()) != null && !ChatObject.hasAdminRights(k12) && k12.slowmode_enabled) {
            y4.O(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.f27492a).o();
        } else {
            org.telegram.ui.ActionBar.b6 b6Var = this.f27492a;
            HashMap hashMap = f26243o1;
            if (i9 == 0) {
                MessageObject messageObject = kiVar.D1;
                org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
                if (messageObject == null && (o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).c()) {
                    y4.M(getContext(), ((org.telegram.ui.qn) o2Var).a(), new zk(this, 1), b6Var);
                } else {
                    y4.a0(kiVar.F1, kiVar.j1() + hashMap.size(), kiVar.n1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f26854b;

                        {
                            this.f26854b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i10 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26854b;
                            Long l10 = (Long) obj;
                            switch (i10) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f26241m1;
                                    ki kiVar2 = chatAttachAlertPhotoLayout.f27493b;
                                    kiVar2.Y0();
                                    kiVar2.V1.L(7, false, true, 0, 0, 0L, kiVar2.s1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f26241m1;
                                    ki kiVar3 = chatAttachAlertPhotoLayout.f27493b;
                                    kiVar3.Y0();
                                    kiVar3.V1.L(4, true, true, 0, 0, 0L, kiVar3.s1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i9 == 1) {
                MessageObject messageObject2 = kiVar.D1;
                org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.f30099b0;
                if (messageObject2 == null && (o2Var2 instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var2).c()) {
                    y4.M(getContext(), ((org.telegram.ui.qn) o2Var2).a(), new zk(this, 2), b6Var);
                } else {
                    y4.a0(kiVar.F1, kiVar.j1() + hashMap.size(), kiVar.n1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f26854b;

                        {
                            this.f26854b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i10 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26854b;
                            Long l10 = (Long) obj;
                            switch (i10) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f26241m1;
                                    ki kiVar2 = chatAttachAlertPhotoLayout.f27493b;
                                    kiVar2.Y0();
                                    kiVar2.V1.L(7, false, true, 0, 0, 0L, kiVar2.s1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f26241m1;
                                    ki kiVar3 = chatAttachAlertPhotoLayout.f27493b;
                                    kiVar3.Y0();
                                    kiVar3.V1.L(4, true, true, 0, 0, 0L, kiVar3.s1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                yl ylVar = this.C;
                kl klVar = this.A;
                if (i9 == 3) {
                    hm hmVar = kiVar.m0;
                    if (hmVar != null) {
                        hmVar.J();
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
                        public final ChatAttachAlertPhotoLayout f27234b;

                        {
                            this.f27234b = this;
                        }

                        @Override
                        public final void run() {
                            int i10;
                            int i11;
                            int i12 = r3;
                            boolean z14 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27234b;
                            switch (i12) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f26241m1;
                                    ki kiVar2 = chatAttachAlertPhotoLayout.f27493b;
                                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.U0;
                                    if (z14) {
                                        i10 = R.string.DisablePhotoSpoiler;
                                    } else {
                                        i10 = R.string.EnablePhotoSpoiler;
                                    }
                                    g1Var.setText(LocaleController.getString(i10));
                                    if (z14) {
                                        g1Var.setIcon(R.drawable.msg_spoiler_off);
                                    } else {
                                        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
                                    }
                                    if (z14) {
                                        kiVar2.W0.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            kiVar2.W0.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    kiVar2.W0.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        kiVar2.W0.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.W0;
                                    if (z14) {
                                        i11 = R.string.SendInStandardQuality;
                                    } else {
                                        i11 = R.string.SendInHighQuality;
                                    }
                                    g1Var2.setText(LocaleController.getString(i11));
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
                    klVar.M(new dl(0, arrayList, z13));
                    if (kiVar.f30160u0 != this) {
                        ylVar.l();
                    }
                    hm hmVar2 = kiVar.m0;
                    if (hmVar2 != null) {
                        hmVar2.v.invalidate();
                    }
                } else if (i9 == 2) {
                    hm hmVar3 = kiVar.m0;
                    if (hmVar3 != null) {
                        hmVar3.J();
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
                        public final ChatAttachAlertPhotoLayout f27234b;

                        {
                            this.f27234b = this;
                        }

                        @Override
                        public final void run() {
                            int i10;
                            int i11;
                            int i12 = r3;
                            boolean z142 = z14;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27234b;
                            switch (i12) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f26241m1;
                                    ki kiVar2 = chatAttachAlertPhotoLayout.f27493b;
                                    org.telegram.ui.ActionBar.g1 g1Var = chatAttachAlertPhotoLayout.U0;
                                    if (z142) {
                                        i10 = R.string.DisablePhotoSpoiler;
                                    } else {
                                        i10 = R.string.EnablePhotoSpoiler;
                                    }
                                    g1Var.setText(LocaleController.getString(i10));
                                    if (z142) {
                                        g1Var.setIcon(R.drawable.msg_spoiler_off);
                                    } else {
                                        g1Var.setAnimatedIcon(R.raw.photo_spoiler);
                                    }
                                    if (z142) {
                                        kiVar2.W0.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            kiVar2.W0.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    kiVar2.W0.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        kiVar2.W0.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.g1 g1Var2 = chatAttachAlertPhotoLayout.W0;
                                    if (z142) {
                                        i11 = R.string.SendInStandardQuality;
                                    } else {
                                        i11 = R.string.SendInHighQuality;
                                    }
                                    g1Var2.setText(LocaleController.getString(i11));
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
                    klVar.M(new dl(1, arrayList2, z14));
                    if (kiVar.f30160u0 != this) {
                        ylVar.l();
                    }
                    hm hmVar4 = kiVar.m0;
                    if (hmVar4 != null) {
                        hmVar4.v.invalidate();
                    }
                } else if (i9 == 4) {
                    try {
                        if (p0()) {
                            Intent intent = new Intent();
                            intent.setType("video/*");
                            intent.setAction("android.intent.action.GET_CONTENT");
                            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                            Intent intent2 = new Intent("android.intent.action.PICK");
                            intent2.setType("image/*");
                            Intent createChooser = Intent.createChooser(intent2, null);
                            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                            int i10 = kiVar.M0;
                            org.telegram.ui.ActionBar.o2 o2Var3 = kiVar.f30099b0;
                            if (i10 != 0) {
                                o2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                o2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i11 = kiVar.M0;
                            org.telegram.ui.ActionBar.o2 o2Var4 = kiVar.f30099b0;
                            if (i11 != 0) {
                                o2Var4.startActivityForResult(intent3, 14);
                            } else {
                                o2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        kiVar.dismiss(true);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } else if (i9 == 7) {
                    if (kiVar.f30160u0 == kiVar.m0) {
                        z12 = false;
                    }
                    kiVar.Z1(z12);
                } else if (i9 == 9) {
                    gh.oa.g1(getContext(), getStarsPrice(), true, new d(this, 6), this.f27492a);
                } else if (i9 >= 10) {
                    MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.R0.get(i9 - 10);
                    this.P0 = albumEntry;
                    MediaController.AlbumEntry albumEntry2 = this.Q0;
                    TextView textView = this.f26283x;
                    if (albumEntry == albumEntry2) {
                        textView.setText(LocaleController.getString(R.string.ChatGallery));
                    } else {
                        textView.setText(albumEntry.bucketName);
                    }
                    ylVar.l();
                    this.v.l();
                    this.B.h1(0, -(klVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void t0() {
        ArrayList<MediaController.AlbumEntry> arrayList;
        pl plVar = this.f26281w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = plVar.f23901b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f26275r0) {
            if (p0()) {
                arrayList = MediaController.allMediaAlbums;
            } else {
                arrayList = MediaController.allPhotoAlbums;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.R0 = arrayList2;
            Collections.sort(arrayList2, new fl(arrayList, 0));
        } else {
            this.R0 = new ArrayList();
        }
        boolean isEmpty = this.R0.isEmpty();
        TextView textView = this.f26283x;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f26285y, (Drawable) null);
        int size = this.R0.size();
        for (int i9 = 0; i9 < size; i9++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.R0.get(i9);
            kh.a aVar = new kh.a(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.f27492a);
            plVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new gh.z0(this, i9 + 10, 7));
        }
    }

    @Override
    public final void u() {
        boolean z10;
        ki kiVar = this.f27493b;
        if (kiVar != null && (kiVar.f30099b0 instanceof org.telegram.ui.qn)) {
            z10 = true;
        } else {
            z10 = false;
        }
        T(z10);
    }

    public final void u0() {
        kl klVar = this.A;
        if (klVar != null) {
            for (int i9 = 0; i9 < klVar.getChildCount(); i9++) {
                View childAt = klVar.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    ((org.telegram.ui.Cells.t5) childAt).f25683a.invalidate();
                }
            }
        }
    }

    public final void v0() {
        ArrayList arrayList;
        if (this.f27493b.f30099b0 instanceof org.telegram.ui.qn) {
            kl klVar = this.A;
            int childCount = klVar.getChildCount();
            int i9 = 0;
            while (true) {
                arrayList = f26244p1;
                if (i9 >= childCount) {
                    break;
                }
                View childAt = klVar.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    MediaController.PhotoEntry a02 = a0(((Integer) t5Var.getTag()).intValue());
                    if (a02 != null) {
                        t5Var.setNum(arrayList.indexOf(Integer.valueOf(a02.imageId)));
                    }
                }
                i9++;
            }
            kl klVar2 = this.f26274r;
            int childCount2 = klVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = klVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) childAt2;
                    MediaController.PhotoEntry a03 = a0(((Integer) t5Var2.getTag()).intValue());
                    if (a03 != null) {
                        t5Var2.setNum(arrayList.indexOf(Integer.valueOf(a03.imageId)));
                    }
                }
            }
        }
    }

    @Override
    public final void w(int i9, boolean z10) {
        U();
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.invalidateOutline();
            this.L.invalidate();
        }
    }

    public final void w0() {
        ArrayList arrayList;
        yl ylVar;
        HashMap hashMap;
        boolean z10;
        boolean z11;
        boolean z12;
        int i9;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ki kiVar = this.f27493b;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.f30099b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            kl klVar = this.A;
            int childCount = klVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f26244p1;
                ylVar = this.C;
                hashMap = f26243o1;
                int i11 = -1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = klVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (ylVar.f35000f && R > this.I0) {
                        R--;
                    }
                    if (ylVar.d && this.P0 == this.Q0) {
                        R--;
                    }
                    MediaController.PhotoEntry a02 = a0(R);
                    if (a02 != null && a02.hasSpoiler) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    t5Var.setHasSpoiler(z14);
                    if (a02 != null && a02.isHighQuality()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    t5Var.setHighQuality(z15);
                    if ((o2Var2 instanceof org.telegram.ui.qn) && kiVar.P1) {
                        if (a02 != null) {
                            i11 = arrayList.indexOf(Integer.valueOf(a02.imageId));
                        }
                        if (a02 != null && hashMap.containsKey(Integer.valueOf(a02.imageId))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        t5Var.b(i11, z17, true);
                    } else {
                        if (a02 != null && hashMap.containsKey(Integer.valueOf(a02.imageId))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        t5Var.b(-1, z16, true);
                    }
                }
                i10++;
            }
            kl klVar2 = this.f26274r;
            int childCount2 = klVar2.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = klVar2.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (ylVar.f35000f && R2 > this.I0) {
                        R2--;
                    }
                    if (ylVar.d && this.P0 == this.Q0) {
                        R2--;
                    }
                    MediaController.PhotoEntry a03 = a0(R2);
                    if (a03 != null && a03.hasSpoiler) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t5Var2.setHasSpoiler(z10);
                    if (a03 != null && a03.isHighQuality()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t5Var2.setHighQuality(z11);
                    if ((o2Var2 instanceof org.telegram.ui.qn) && kiVar.P1) {
                        if (a03 != null) {
                            i9 = arrayList.indexOf(Integer.valueOf(a03.imageId));
                        } else {
                            i9 = -1;
                        }
                        if (a03 != null && hashMap.containsKey(Integer.valueOf(a03.imageId))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        t5Var2.b(i9, z13, true);
                    } else {
                        if (a03 != null && hashMap.containsKey(Integer.valueOf(a03.imageId))) {
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

    @Override
    public final void x() {
        ShutterButton shutterButton = this.f26258g0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.M0;
        lu0 lu0Var = lu0.f30557a;
        lu0 lu0Var2 = lu0.f30558b;
        if (!z10) {
            if (this.L != null && shutterButton.getState() == lu0Var2) {
                k0();
                CameraController.getInstance().stopVideoRecording(this.L.getCameraSession(), false);
                shutterButton.a(lu0Var);
            }
            if (this.U) {
                Z(false);
            }
            c0(true);
            return;
        }
        if (this.L != null && shutterButton.getState() == lu0Var2) {
            shutterButton.a(lu0Var);
        }
        this.M0 = false;
    }

    public final void x0(boolean z10) {
        boolean z11;
        TextView textView = this.f26268l0;
        if (textView != null) {
            ki kiVar = this.f27493b;
            int i9 = kiVar.M0;
            TextView textView2 = kiVar.f30115f1;
            if (i9 == 0 && !kiVar.P0 && !kiVar.D) {
                HashMap hashMap = f26243o1;
                Iterator it = hashMap.entrySet().iterator();
                int i10 = 0;
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
                kiVar.I = z11;
                kiVar.f30124i1.setVisibility((!z11 || kiVar.M0 == 2) ? 8 : 8);
                this.I = max;
            }
        }
    }

    @Override
    public final void y(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.y(int, int):void");
    }

    @Override
    public final void z() {
        ki kiVar = this.f27493b;
        if (kiVar.isShowing() && !kiVar.isDismissed() && !PhotoViewer.t1().Q1()) {
            T(false);
        }
    }
}
