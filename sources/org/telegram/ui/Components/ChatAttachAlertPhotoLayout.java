package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
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
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

public class ChatAttachAlertPhotoLayout extends yh implements NotificationCenter.NotificationCenterDelegate {

    public static boolean f26237m1;

    public static final ArrayList f26238n1 = new ArrayList();

    public static final HashMap f26239o1 = new HashMap();

    public static final ArrayList f26240p1 = new ArrayList();

    public static int f26241q1 = -1;
    public final gl A;
    public final Rect A0;
    public final kh.l B;
    public float B0;
    public final ul C;
    public boolean C0;
    public final az D;
    public boolean D0;
    public final bl0 E;
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
    public ql L;
    public boolean L0;
    public final rl M;
    public boolean M0;
    public final ol N;
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
    public final org.telegram.ui.ActionBar.f1 U0;
    public boolean V;
    public final org.telegram.ui.ActionBar.f1 V0;
    public boolean W;
    public final org.telegram.ui.ActionBar.f1 W0;
    public final org.telegram.ui.ActionBar.f1 X0;
    public final org.telegram.ui.ActionBar.f1 Y0;
    public final fb0 Z0;

    public float f26242a0;

    public final boolean f26243a1;

    public final int[] f26244b0;

    public final AnimationNotificationsLocker f26245b1;

    public int f26246c0;

    public boolean f26247c1;

    public dl f26248d0;

    public final kl f26249d1;

    public final DecelerateInterpolator f26250e0;

    public boolean f26251e1;

    public final ag.p1 f26252f0;

    public float f26253f1;

    public final ShutterButton f26254g0;

    public float f26255g1;

    public final k81 f26256h0;

    public float f26257h1;

    public AnimatorSet f26258i0;

    public float f26259i1;

    public Runnable f26260j0;

    public float f26261j1;

    public Boolean f26262k0;

    public ViewPropertyAnimator f26263k1;

    public final TextView f26264l0;
    public int l1;
    public final TextView m0;

    public final boolean f26265n;

    public final ImageView f26266n0;

    public boolean f26267o0;

    public boolean f26268p0;

    public boolean f26269q0;

    public final gl f26270r;

    public boolean f26271r0;

    public final org.telegram.ui.j f26272s;

    public boolean f26273s0;

    public boolean f26274t0;

    public boolean f26275u0;
    public final ul v;

    public boolean f26276v0;

    public final ll f26277w;

    public float f26278w0;

    public final TextView f26279x;

    public float f26280x0;

    public final Drawable f26281y;

    public boolean f26282y0;

    public boolean f26283z0;

    public ChatAttachAlertPhotoLayout(gi giVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, giVar);
        this.O = new ImageView[2];
        this.Q = new float[2];
        this.R = new int[2];
        this.f26244b0 = new int[5];
        this.f26250e0 = new DecelerateInterpolator(1.5f);
        this.f26262k0 = null;
        this.A0 = new Rect();
        int iDp = AndroidUtilities.dp(80.0f);
        this.G0 = iDp;
        this.H0 = iDp;
        this.I0 = 3;
        this.T0 = true;
        this.f26245b1 = new AnimationNotificationsLocker();
        this.f26249d1 = new kl(this);
        this.f26243a1 = z10;
        this.f26265n = z11;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        org.telegram.ui.ActionBar.c3 container = giVar.getContainer();
        gi giVar2 = this.f34900b;
        int i10 = 0;
        this.f26247c1 = giVar2.M0 != 0;
        ll llVar = new ll(this, context, giVar2.T0.n(), c6Var, 0);
        this.f26277w = llVar;
        llVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        layoutParamsD.topMargin = AndroidUtilities.statusBarHeight;
        this.f34900b.T0.addView(llVar, 0, layoutParamsD);
        final int i11 = 3;
        llVar.setOnClickListener(new View.OnClickListener(this) {

            public final ChatAttachAlertPhotoLayout f33111b;

            {
                this.f33111b = this;
            }

            @Override
            public final void onClick(View view) {
                ql qlVar;
                ql qlVar2;
                int i12 = i11;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33111b;
                switch (i12) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.L != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f26267o0 && (qlVar = chatAttachAlertPhotoLayout.L) != null && qlVar.isInited()) {
                            chatAttachAlertPhotoLayout.V = false;
                            chatAttachAlertPhotoLayout.L.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26266n0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new fl(chatAttachAlertPhotoLayout));
                            duration.start();
                            break;
                        }
                        break;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.P && (qlVar2 = chatAttachAlertPhotoLayout.L) != null && qlVar2.isInited() && chatAttachAlertPhotoLayout.U) {
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
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(er.f28122f);
                                animatorSet.addListener(new jh.h3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    default:
                        chatAttachAlertPhotoLayout.f26277w.M(null, null);
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f26279x = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i12 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, this.f34899a));
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.f26281y = drawableMutate;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i12, this.f34899a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(iV0, mode));
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        llVar.addView(textView, h7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        U(false);
        fb0 fb0Var = new fb0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), c6Var);
        this.Z0 = fb0Var;
        fb0Var.a(!this.f34900b.Y, false);
        this.Y0 = this.f34900b.W0.e(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.f34900b.W0.a(5);
        this.f34900b.W0.e(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.V0 = this.f34900b.W0.e(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.f34900b.W0.e(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.f34900b.W0.a(6);
        this.U0 = this.f34900b.W0.e(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.W0 = this.f34900b.W0.e(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        org.telegram.ui.ActionBar.v0 v0Var = this.f34900b.W0;
        v0Var.o();
        fb0Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        fb0Var.setTag(8);
        v0Var.f23854b.addView(fb0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) fb0Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        fb0Var.setLayoutParams(layoutParams);
        fb0Var.setOnClickListener(new org.telegram.ui.ActionBar.b0(v0Var, 2));
        this.X0 = this.f34900b.W0.e(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.f34900b.W0.setFitSubItems(true);
        gl glVar = new gl(this, context, c6Var, 1);
        this.A = glVar;
        glVar.setFastScrollEnabled(1);
        glVar.setFastScrollVisible(true);
        glVar.getFastScroll().setAlpha(0.0f);
        glVar.getFastScroll().f29380a = false;
        glVar.getFastScroll().f29386d0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ul ulVar = new ul(this, context, z11);
        this.C = ulVar;
        glVar.setAdapter(ulVar);
        rl rlVar = new rl(this, glVar);
        this.M = rlVar;
        glVar.i(rlVar);
        for (int i13 = 0; i13 < 8; i13++) {
            ulVar.h.add(ulVar.L());
        }
        glVar.setClipToPadding(false);
        glVar.setItemAnimator(null);
        glVar.setLayoutAnimation(null);
        glVar.setVerticalScrollBarEnabled(false);
        glVar.setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, this.f34899a));
        addView(glVar, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        glVar.setOnScrollListener(new lh.d9(this, 2));
        kh.l lVar = new kh.l(this, this.G0, 2);
        this.B = lVar;
        lVar.O = new gh.u5(this, 5);
        glVar.setLayoutManager(lVar);
        glVar.setOnItemClickListener(new b5.d(this, z11, c6Var, 6));
        glVar.setOnItemLongClickListener(new vk(this, 3));
        bl0 bl0Var = new bl0(new nl(this));
        this.E = bl0Var;
        glVar.A.add(bl0Var);
        this.f34901c = glVar;
        this.d = glVar;
        this.f34903f = true;
        az azVar = new az(context, c6Var);
        this.D = azVar;
        azVar.setText(LocaleController.getString(R.string.NoPhotos));
        azVar.setOnTouchListener(null);
        azVar.setTextSize(16);
        addView(azVar, h7.z5.c(-2.0f, -1));
        if (this.T0) {
            azVar.b();
        } else {
            azVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        ol olVar = new ol(context, paint);
        this.N = olVar;
        AndroidUtilities.updateViewVisibilityAnimated(olVar, false, 1.0f, false);
        olVar.setBackgroundResource(R.drawable.system);
        olVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        olVar.setTextSize(1, 15.0f);
        olVar.setTypeface(AndroidUtilities.bold());
        olVar.setAlpha(0.0f);
        olVar.setTextColor(-1);
        olVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(olVar, h7.z5.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        ag.p1 p1Var = new ag.p1(this, context, 16);
        this.f26252f0 = p1Var;
        p1Var.setVisibility(8);
        p1Var.setAlpha(0.0f);
        container.addView(p1Var, h7.z5.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f26264l0 = textView2;
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
        container.addView(textView2, h7.z5.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        final int i14 = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) {

            public final ChatAttachAlertPhotoLayout f33111b;

            {
                this.f33111b = this;
            }

            @Override
            public final void onClick(View view) {
                ql qlVar;
                ql qlVar2;
                int i15 = i14;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33111b;
                switch (i15) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.L != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f26267o0 && (qlVar = chatAttachAlertPhotoLayout.L) != null && qlVar.isInited()) {
                            chatAttachAlertPhotoLayout.V = false;
                            chatAttachAlertPhotoLayout.L.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26266n0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new fl(chatAttachAlertPhotoLayout));
                            duration.start();
                            break;
                        }
                        break;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.P && (qlVar2 = chatAttachAlertPhotoLayout.L) != null && qlVar2.isInited() && chatAttachAlertPhotoLayout.U) {
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
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(er.f28122f);
                                animatorSet.addListener(new jh.h3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    default:
                        chatAttachAlertPhotoLayout.f26277w.M(null, null);
                        break;
                }
            }
        });
        k81 k81Var = new k81(context);
        this.f26256h0 = k81Var;
        k81Var.setVisibility(8);
        k81Var.setAlpha(0.0f);
        container.addView(k81Var, h7.z5.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        k81Var.setDelegate(new vk(this, i14));
        ShutterButton shutterButton = new ShutterButton(context);
        shutterButton.f26530b = new DecelerateInterpolator();
        shutterButton.f26537w = new mu0(shutterButton, i14);
        shutterButton.f26529a = shutterButton.getResources().getDrawable(R.drawable.camera_btn);
        Paint paint2 = new Paint(1);
        shutterButton.f26531c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        shutterButton.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        shutterButton.f26533f = ou0.f31410a;
        this.f26254g0 = shutterButton;
        p1Var.addView(shutterButton, h7.z5.e(84, 84, 17));
        shutterButton.setDelegate(new el(this, c6Var, container));
        shutterButton.setFocusable(true);
        shutterButton.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.f26266n0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        p1Var.addView(imageView, h7.z5.e(48, 48, 21));
        final int i15 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final ChatAttachAlertPhotoLayout f33111b;

            {
                this.f33111b = this;
            }

            @Override
            public final void onClick(View view) {
                ql qlVar;
                ql qlVar2;
                int i16 = i15;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33111b;
                switch (i16) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.L != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                            break;
                        }
                        break;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f26267o0 && (qlVar = chatAttachAlertPhotoLayout.L) != null && qlVar.isInited()) {
                            chatAttachAlertPhotoLayout.V = false;
                            chatAttachAlertPhotoLayout.L.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26266n0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new fl(chatAttachAlertPhotoLayout));
                            duration.start();
                            break;
                        }
                        break;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.P && (qlVar2 = chatAttachAlertPhotoLayout.L) != null && qlVar2.isInited() && chatAttachAlertPhotoLayout.U) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.L.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.P = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
                                ImageView imageView2 = imageViewArr[0];
                                if (imageView2 == view) {
                                    imageView2 = imageViewArr[1];
                                }
                                imageView2.setVisibility(0);
                                ChatAttachAlertPhotoLayout.o0(imageView2, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, AndroidUtilities.dp(48.0f));
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(er.f28122f);
                                animatorSet.addListener(new jh.h3(chatAttachAlertPhotoLayout, view, imageView2, 3));
                                animatorSet.start();
                                break;
                            }
                        }
                        break;
                    default:
                        chatAttachAlertPhotoLayout.f26277w.M(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i16 = 0; i16 < 2; i16++) {
            this.O[i16] = new ImageView(context);
            this.O[i16].setScaleType(ImageView.ScaleType.CENTER);
            this.O[i16].setVisibility(4);
            this.f26252f0.addView(this.O[i16], h7.z5.e(48, 48, 51));
            final int i17 = 2;
            this.O[i16].setOnClickListener(new View.OnClickListener(this) {

                public final ChatAttachAlertPhotoLayout f33111b;

                {
                    this.f33111b = this;
                }

                @Override
                public final void onClick(View view) {
                    ql qlVar;
                    ql qlVar2;
                    int i18 = i17;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33111b;
                    switch (i18) {
                        case 0:
                            if (chatAttachAlertPhotoLayout.L != null) {
                                chatAttachAlertPhotoLayout.j0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.L.getCameraSessionObject());
                                break;
                            }
                            break;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.f26267o0 && (qlVar = chatAttachAlertPhotoLayout.L) != null && qlVar.isInited()) {
                                chatAttachAlertPhotoLayout.V = false;
                                chatAttachAlertPhotoLayout.L.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f26266n0, (Property<ImageView, Float>) View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new fl(chatAttachAlertPhotoLayout));
                                duration.start();
                                break;
                            }
                            break;
                        case 2:
                            if (!chatAttachAlertPhotoLayout.P && (qlVar2 = chatAttachAlertPhotoLayout.L) != null && qlVar2.isInited() && chatAttachAlertPhotoLayout.U) {
                                String currentFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getCurrentFlashMode();
                                String nextFlashMode = chatAttachAlertPhotoLayout.L.getCameraSession().getNextFlashMode();
                                if (!currentFlashMode.equals(nextFlashMode)) {
                                    chatAttachAlertPhotoLayout.L.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                    chatAttachAlertPhotoLayout.P = true;
                                    ImageView[] imageViewArr = chatAttachAlertPhotoLayout.O;
                                    ImageView imageView2 = imageViewArr[0];
                                    if (imageView2 == view) {
                                        imageView2 = imageViewArr[1];
                                    }
                                    imageView2.setVisibility(0);
                                    ChatAttachAlertPhotoLayout.o0(imageView2, nextFlashMode);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, AndroidUtilities.dp(48.0f));
                                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, -AndroidUtilities.dp(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(er.f28122f);
                                    animatorSet.addListener(new jh.h3(chatAttachAlertPhotoLayout, view, imageView2, 3));
                                    animatorSet.start();
                                    break;
                                }
                            }
                            break;
                        default:
                            chatAttachAlertPhotoLayout.f26277w.M(null, null);
                            break;
                    }
                }
            });
            this.O[i16].setContentDescription("flash mode " + i16);
        }
        TextView textView3 = new TextView(context);
        this.m0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(org.telegram.ui.Cells.pa.c(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.f26252f0.addView(textView3, h7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        gl glVar2 = new gl(this, context, c6Var, 0);
        this.f26270r = glVar2;
        glVar2.setVerticalScrollBarEnabled(true);
        ul ulVar2 = new ul(this, context, false);
        this.v = ulVar2;
        glVar2.setAdapter(ulVar2);
        for (int i18 = 0; i18 < 8; i18++) {
            ulVar2.h.add(ulVar2.L());
        }
        glVar2.setClipToPadding(false);
        glVar2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        glVar2.setItemAnimator(null);
        glVar2.setLayoutAnimation(null);
        glVar2.setOverScrollMode(2);
        glVar2.setVisibility(4);
        glVar2.setAlpha(0.0f);
        container.addView(glVar2, h7.z5.c(80.0f, -1));
        org.telegram.ui.j jVar = new org.telegram.ui.j(i10, null == true ? 1 : 0, 5);
        this.f26272s = jVar;
        glVar2.setLayoutManager(jVar);
        glVar2.setOnItemClickListener(new gh.a(3));
    }

    public static void K(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, View view, int i10) {
        org.telegram.ui.rn rnVar;
        boolean z11;
        Object obj;
        boolean z12;
        Object obj2;
        int i11 = i10;
        ul ulVar = chatAttachAlertPhotoLayout.C;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        if (chatAttachAlertPhotoLayout.f26271r0) {
            boolean z13 = giVar.R;
            org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
            if (z13) {
                return;
            }
            org.telegram.ui.ActionBar.n2 n2VarR = n2Var == null ? LaunchActivity.R() : n2Var;
            if (n2VarR == null || (view instanceof u10)) {
                return;
            }
            int i12 = Build.VERSION.SDK_INT;
            int i13 = 4;
            if (i12 >= 23) {
                try {
                    if (ulVar.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0 && i11 == 0 && chatAttachAlertPhotoLayout.K0) {
                        n2VarR.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                        return;
                    } else if (chatAttachAlertPhotoLayout.L0) {
                        if (i12 >= 33) {
                            n2VarR.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
                            return;
                        } else {
                            n2VarR.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                            return;
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            boolean z14 = ulVar.f33116f;
            if (z14 && i11 == chatAttachAlertPhotoLayout.I0) {
                chatAttachAlertPhotoLayout.i0();
                return;
            }
            if (i11 == 0 && z10 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                chatAttachAlertPhotoLayout.i0();
                return;
            }
            if (z14 && i11 > chatAttachAlertPhotoLayout.I0) {
                i11--;
            }
            if (chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0 && z10) {
                i11--;
            }
            org.telegram.ui.rn rnVar2 = null;
            if (chatAttachAlertPhotoLayout.f26247c1) {
                if (i11 == 0) {
                    if (!(view instanceof x8)) {
                        return;
                    }
                    chatAttachAlertPhotoLayout.r0((x8) view, null, 0L);
                    giVar.dismiss();
                }
                i11--;
            }
            ArrayList<Object> allPhotosArray = chatAttachAlertPhotoLayout.getAllPhotosArray();
            if (i11 < 0 || i11 >= allPhotosArray.size()) {
                return;
            }
            ei eiVar = giVar.V1;
            ArrayList arrayList = f26240p1;
            HashMap map = f26239o1;
            if (eiVar != null && eiVar.N0() && (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry)) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) allPhotosArray.get(i11);
                map.clear();
                if (photoEntry != null) {
                    chatAttachAlertPhotoLayout.Q(photoEntry, -1);
                }
                giVar.Y0();
                giVar.V1.n0(7, true, true, 0, 0, 0L, giVar.s1(), false, 0L);
                map.clear();
                f26238n1.clear();
                arrayList.clear();
                map.clear();
                return;
            }
            PhotoViewer.t1().K2(null, n2VarR, c6Var);
            PhotoViewer.t1().L2(giVar);
            PhotoViewer photoViewerT1 = PhotoViewer.t1();
            int i14 = giVar.O1;
            boolean z15 = giVar.P1;
            photoViewerT1.h = i14;
            photoViewerT1.f35700n = z15;
            if (!giVar.B || !giVar.C) {
                if (giVar.M0 != 0) {
                    rnVar = null;
                    i13 = 1;
                } else {
                    if (n2Var instanceof org.telegram.ui.rn) {
                        rnVar2 = (org.telegram.ui.rn) n2Var;
                    } else if (giVar.S) {
                    }
                    rnVar = rnVar2;
                    i13 = 0;
                }
                if (!giVar.V1.s()) {
                    AndroidUtilities.hideKeyboard(n2VarR.getFragmentView().findFocus());
                    AndroidUtilities.hideKeyboard(giVar.getContainer().findFocus());
                }
                if (map.size() > 0 && arrayList.size() > 0) {
                    obj2 = map.get(arrayList.get(0));
                    if (obj2 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj2).caption = giVar.m1().getText();
                    }
                    if (obj2 instanceof MediaController.SearchImage) {
                        ((MediaController.SearchImage) obj2).caption = giVar.m1().getText();
                    }
                }
                if (giVar.M != null) {
                    if (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry) {
                        z12 = ((MediaController.PhotoEntry) allPhotosArray.get(i11)).isVideo;
                    } else {
                        z12 = false;
                    }
                    giVar.M.f28927e = z12;
                }
                z11 = !(allPhotosArray.get(i11) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) allPhotosArray.get(i11)).hasSpoiler;
                obj = allPhotosArray.get(i11);
                if ((obj instanceof MediaController.PhotoEntry) || !chatAttachAlertPhotoLayout.X((MediaController.PhotoEntry) obj)) {
                    if (z11) {
                        chatAttachAlertPhotoLayout.p0(i11, false);
                    }
                    AndroidUtilities.runOnUIThread(new gj(chatAttachAlertPhotoLayout, i13, n2VarR, allPhotosArray, i11, rnVar), z11 ? 250L : 0L);
                }
                return;
            }
            i13 = 11;
            if (n2Var instanceof org.telegram.ui.rn) {
                rnVar2 = (org.telegram.ui.rn) n2Var;
            }
            rnVar = rnVar2;
            if (!giVar.V1.s()) {
                AndroidUtilities.hideKeyboard(n2VarR.getFragmentView().findFocus());
                AndroidUtilities.hideKeyboard(giVar.getContainer().findFocus());
            }
            if (map.size() > 0) {
                obj2 = map.get(arrayList.get(0));
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).caption = giVar.m1().getText();
                }
                if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).caption = giVar.m1().getText();
                }
            }
            if (giVar.M != null) {
                if (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry) {
                    z12 = ((MediaController.PhotoEntry) allPhotosArray.get(i11)).isVideo;
                } else {
                    z12 = false;
                }
                giVar.M.f28927e = z12;
            }
            if (allPhotosArray.get(i11) instanceof MediaController.PhotoEntry) {
            }
            obj = allPhotosArray.get(i11);
            if (obj instanceof MediaController.PhotoEntry) {
            }
            if (z11) {
                chatAttachAlertPhotoLayout.p0(i11, false);
            }
            AndroidUtilities.runOnUIThread(new gj(chatAttachAlertPhotoLayout, i13, n2VarR, allPhotosArray, i11, rnVar), z11 ? 250L : 0L);
        }
    }

    public static org.telegram.ui.Cells.q5 L(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        gl glVar = chatAttachAlertPhotoLayout.A;
        int childCount = glVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = glVar.getChildAt(i11);
            if (childAt.getTop() < glVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f34900b.l1() && (childAt instanceof org.telegram.ui.Cells.q5)) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (q5Var.getImageView().getTag() != null && ((Integer) q5Var.getImageView().getTag()).intValue() == i10) {
                    return q5Var;
                }
            }
        }
        return null;
    }

    public static int N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        if ((n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).N3 == 5) {
            return n2Var.getMessagesController().config.quickReplyMessagesLimit.get() - ((org.telegram.ui.rn) giVar.f28635b0).q6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static void O(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                giVar.f28635b0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
            } else if (i10 >= 23) {
                giVar.f28635b0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            }
        } catch (Exception unused) {
        }
    }

    public static void P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        if (Build.VERSION.SDK_INT < 23 || f0.e.b(giVar.f28635b0.getParentActivity(), "android.permission.CAMERA") == 0) {
            chatAttachAlertPhotoLayout.i0();
        } else {
            try {
                giVar.f28635b0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean S() {
        HashMap map = f26239o1;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                if (photoEntry.isLivePhoto() && photoEntry.isUnalivePhoto()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean T() {
        CharSequence charSequence;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = f26240p1;
            if (i10 >= arrayList.size()) {
                break;
            }
            Object obj = f26239o1.get(arrayList.get(i10));
            if (obj instanceof MediaController.PhotoEntry) {
                charSequence = ((MediaController.PhotoEntry) obj).caption;
            } else {
                charSequence = obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).caption : null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                i11++;
            }
            i10++;
        }
        return i11 <= 1;
    }

    public static boolean c0() {
        HashMap map = f26239o1;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((entry.getValue() instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) entry.getValue()).isLivePhoto()) {
                return true;
            }
        }
        return false;
    }

    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.l1;
    }

    public static void o0(ImageView imageView, String str) {
        str.getClass();
        switch (str) {
            case "on":
                imageView.setImageResource(R.drawable.flash_on);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
                break;
            case "off":
                imageView.setImageResource(R.drawable.flash_off);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
                break;
            case "auto":
                imageView.setImageResource(R.drawable.flash_auto);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
                break;
        }
    }

    @Override
    public final void B() {
        gi giVar = this.f34900b;
        if (!giVar.isShowing() || giVar.isDismissed() || PhotoViewer.t1().Q1()) {
            return;
        }
        U(false);
    }

    @Override
    public final void C(int i10) {
        org.telegram.ui.ActionBar.v0 v0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        boolean z14;
        fb0 fb0Var;
        org.telegram.ui.ActionBar.f1 f1Var;
        long starsPrice;
        org.telegram.ui.ActionBar.v0 v0Var2;
        int selectedPhotosHighQualityCount;
        org.telegram.ui.ActionBar.f1 f1Var2;
        TLRPC.ChatFull chatFull;
        boolean z15;
        long j11 = 0;
        gi giVar = this.f34900b;
        if (i10 > 1) {
            MessageObject messageObject = giVar.D1;
            org.telegram.ui.ActionBar.v0 v0Var3 = giVar.W0;
            if (messageObject != null) {
                org.telegram.ui.ActionBar.v0 v0Var4 = giVar.W0;
                v0Var = giVar.W0;
                v0Var4.r(0);
                if (i10 == 0) {
                    v0Var.K(4);
                    v0Var.r(1);
                } else if (this.f26276v0 || getStarsPrice() > 0 || giVar.D1 != null) {
                    v0Var.r(1);
                } else {
                    v0Var.K(1);
                    z10 = false;
                    z11 = true;
                }
                z10 = false;
                z11 = false;
            } else {
                if (getStarsPrice() <= 0) {
                    v0Var3.K(0);
                    z10 = true;
                } else {
                    v0Var3.r(0);
                    z10 = false;
                }
                if (!this.f26276v0 || getStarsPrice() > 0) {
                    v0Var3.r(1);
                    z11 = false;
                } else {
                    v0Var3.K(1);
                    z11 = true;
                }
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var5 = giVar.W0;
            v0Var = giVar.W0;
            v0Var5.r(0);
            if (i10 == 0) {
                v0Var.K(4);
                v0Var.r(1);
            } else {
                if (this.f26276v0) {
                }
                v0Var.r(1);
            }
            z10 = false;
            z11 = false;
        }
        if (i10 != 0) {
            giVar.W0.r(4);
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = this.V0;
        if (i10 > 1) {
            giVar.W0.K(5);
            giVar.W0.K(7);
            f1Var3.setText(LocaleController.getString(R.string.SendAsFiles));
        } else {
            giVar.W0.r(5);
            giVar.W0.r(7);
            if (i10 != 0) {
                f1Var3.setText(LocaleController.getString(R.string.SendAsFile));
            }
        }
        if (i10 > 0 && getStarsPrice() <= 0) {
            if (giVar != null) {
                org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
                z12 = (n2Var instanceof org.telegram.ui.rn) && !((org.telegram.ui.rn) n2Var).x();
            }
        }
        if (i10 > 0 && giVar != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f28650f0;
            if (chatAttachAlertPhotoLayout != null) {
                HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                if (!selectedPhotos.isEmpty()) {
                    int i11 = 0;
                    z15 = false;
                    loop0: while (true) {
                        j10 = j11;
                        if (i11 >= Math.ceil(selectedPhotos.size() / 10.0f)) {
                            break;
                        }
                        int i12 = i11 * 10;
                        int iMin = Math.min(10, selectedPhotos.size() - i12);
                        Utilities.random.nextLong();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= iMin) {
                                i11++;
                                j11 = j10;
                            } else {
                                int i14 = i12 + i13;
                                if (i14 < selectedPhotosOrder.size()) {
                                    CharSequence charSequence = ((MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i14))).caption;
                                    String string = charSequence == null ? "" : charSequence.toString();
                                    if (giVar.m1() != null && TextUtils.isEmpty(string) && i13 == 0) {
                                        string = giVar.m1().getText().toString();
                                    }
                                    if (TextUtils.isEmpty(string)) {
                                        continue;
                                    } else if (!z15) {
                                        z15 = true;
                                    }
                                }
                                i13++;
                            }
                        }
                    }
                } else {
                    j10 = 0;
                }
                z15 = false;
                break loop0;
            } else {
                j10 = 0;
                z15 = false;
                break loop0;
            }
            if (z15 && (giVar.f28635b0 instanceof org.telegram.ui.rn)) {
                z13 = true;
            }
            if (i10 > 0 || giVar == null) {
                z14 = false;
            } else {
                org.telegram.ui.ActionBar.n2 n2Var2 = giVar.f28635b0;
                if ((n2Var2 instanceof org.telegram.ui.rn) && ChatObject.isChannelAndNotMegaGroup(((org.telegram.ui.rn) n2Var2).f42026e) && (chatFull = ((org.telegram.ui.rn) n2Var2).V7) != null && chatFull.paid_media_allowed) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if (!z12) {
                String string2 = LocaleController.getString(R.string.EnablePhotoSpoiler);
                org.telegram.ui.ActionBar.f1 f1Var4 = this.U0;
                f1Var4.setText(string2);
                f1Var4.setAnimatedIcon(R.raw.photo_spoiler);
                giVar.W0.r(3);
            } else if (giVar != null) {
                giVar.W0.K(3);
            }
            if (giVar != null) {
                v0Var2 = giVar.W0;
                if (getSelectedPhotosCount() == i10) {
                    selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                    f1Var2 = this.W0;
                    if (selectedPhotosHighQualityCount > 0) {
                        f1Var2.setText(LocaleController.getString(R.string.SendInStandardQuality));
                        f1Var2.setIcon(R.drawable.menu_quality_sd);
                    } else {
                        f1Var2.setText(LocaleController.getString(R.string.SendInHighQuality));
                        f1Var2.setIcon(R.drawable.menu_quality_hd);
                    }
                    v0Var2.K(2);
                } else {
                    v0Var2.r(2);
                }
            }
            fb0Var = this.Z0;
            if (z13) {
                fb0Var.setVisibility(0);
            } else {
                fb0Var.setVisibility(8);
            }
            if ((!z12 || z13) && (z11 || z10)) {
                giVar.W0.K(6);
            } else {
                giVar.W0.r(6);
            }
            if (z14) {
                giVar.W0.r(9);
                return;
            }
            f1Var = this.X0;
            if (f1Var != null) {
                starsPrice = getStarsPrice();
                if (starsPrice > j10) {
                    f1Var.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    f1Var.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
                } else {
                    f1Var.setText(LocaleController.getString(R.string.PaidMediaButton));
                    f1Var.setSubtext(null);
                }
            }
            this.A.M(new org.telegram.ui.ar(1));
            giVar.W0.K(9);
        }
        j10 = 0;
        z13 = false;
        if (i10 > 0) {
            z14 = false;
        } else {
            z14 = false;
        }
        if (!z12) {
            String string3 = LocaleController.getString(R.string.EnablePhotoSpoiler);
            org.telegram.ui.ActionBar.f1 f1Var5 = this.U0;
            f1Var5.setText(string3);
            f1Var5.setAnimatedIcon(R.raw.photo_spoiler);
            giVar.W0.r(3);
        } else if (giVar != null) {
            giVar.W0.K(3);
        }
        if (giVar != null) {
            v0Var2 = giVar.W0;
            if (getSelectedPhotosCount() == i10) {
                selectedPhotosHighQualityCount = getSelectedPhotosHighQualityCount();
                f1Var2 = this.W0;
                if (selectedPhotosHighQualityCount > 0) {
                    f1Var2.setText(LocaleController.getString(R.string.SendInStandardQuality));
                    f1Var2.setIcon(R.drawable.menu_quality_sd);
                } else {
                    f1Var2.setText(LocaleController.getString(R.string.SendInHighQuality));
                    f1Var2.setIcon(R.drawable.menu_quality_hd);
                }
                v0Var2.K(2);
            } else {
                v0Var2.r(2);
            }
        }
        fb0Var = this.Z0;
        if (z13) {
            fb0Var.setVisibility(0);
        } else {
            fb0Var.setVisibility(8);
        }
        if (z12) {
            giVar.W0.K(6);
        } else {
            giVar.W0.K(6);
        }
        if (z14) {
            giVar.W0.r(9);
            return;
        }
        f1Var = this.X0;
        if (f1Var != null) {
            starsPrice = getStarsPrice();
            if (starsPrice > j10) {
                f1Var.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                f1Var.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                f1Var.setText(LocaleController.getString(R.string.PaidMediaButton));
                f1Var.setSubtext(null);
            }
        }
        this.A.M(new org.telegram.ui.ar(1));
        giVar.W0.K(9);
    }

    @Override
    public final boolean D(int i10) {
        if (!this.U) {
            return false;
        }
        if (i10 != 24 && i10 != 25 && i10 != 79 && i10 != 85) {
            return false;
        }
        ((el) this.f26254g0.getDelegate()).b();
        return true;
    }

    @Override
    public final void E(yh yhVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f26263k1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f26277w.setVisibility(0);
        boolean z10 = yhVar instanceof em;
        TextView textView = this.f26279x;
        if (z10) {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(er.f28125j);
            this.f26263k1 = interpolator;
            interpolator.start();
        } else {
            Z();
            textView.setAlpha(1.0f);
        }
        this.f34900b.T0.setTitle("");
        this.B.h1(0, 0);
        if (z10) {
            this.A.post(new org.telegram.ui.yq(23, this, yhVar));
        }
        V();
        m0();
    }

    @Override
    public final void F() {
        this.J = false;
        ql qlVar = this.L;
        if (qlVar != null) {
            qlVar.setVisibility(0);
        }
        if (this.f26269q0) {
            this.f26269q0 = false;
            U(true);
        }
    }

    @Override
    public final void G() {
        this.A.x0(0);
    }

    public final int Q(MediaController.PhotoEntry photoEntry, int i10) {
        Integer numValueOf = Integer.valueOf(photoEntry.imageId);
        HashMap map = f26239o1;
        boolean zContainsKey = map.containsKey(numValueOf);
        ArrayList arrayList = f26240p1;
        if (zContainsKey) {
            photoEntry.starsAmount = 0L;
            photoEntry.hasSpoiler = false;
            photoEntry.discardLivePhoto = null;
            photoEntry.highQuality = null;
            map.remove(numValueOf);
            int iIndexOf = arrayList.indexOf(numValueOf);
            if (iIndexOf >= 0) {
                arrayList.remove(iIndexOf);
            }
            y0(false);
            w0();
            if (i10 >= 0) {
                photoEntry.reset();
                this.f26249d1.W(i10);
            }
            return iIndexOf;
        }
        photoEntry.starsAmount = getStarsPrice();
        photoEntry.hasSpoiler = getStarsPrice() > 0;
        photoEntry.isChatPreviewSpoilerRevealed = false;
        photoEntry.isAttachSpoilerRevealed = false;
        if (c0()) {
            photoEntry.discardLivePhoto = Boolean.valueOf(!S());
        }
        photoEntry.highQuality = Boolean.valueOf(photoEntry.isHighQuality());
        boolean zW = W(true);
        map.put(numValueOf, photoEntry);
        arrayList.add(numValueOf);
        if (zW) {
            x0();
            return -1;
        }
        y0(true);
        return -1;
    }

    public final void R() {
        ql qlVar = this.L;
        if (qlVar != null) {
            if (!this.U) {
                qlVar.setTranslationX(this.Q[0]);
            }
            int i10 = this.G0;
            int iDp = AndroidUtilities.dp(2.0f) + (i10 * 2);
            if (this.U) {
                return;
            }
            this.L.setClipTop((int) this.S);
            this.L.setClipBottom((int) this.T);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.L.getLayoutParams();
            if (layoutParams.height == iDp && layoutParams.width == i10) {
                return;
            }
            layoutParams.width = i10;
            layoutParams.height = iDp;
            this.L.setLayoutParams(layoutParams);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.yq(24, this, layoutParams));
        }
    }

    public final void U(boolean z10) {
        ul ulVar;
        gi giVar = this.f34900b;
        boolean z11 = giVar.R;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        if (z11 || !this.f26265n) {
            return;
        }
        boolean z12 = this.J0;
        boolean z13 = this.K0;
        org.telegram.ui.ActionBar.n2 n2VarR = n2Var == null ? LaunchActivity.R() : n2Var;
        if (n2VarR == null || n2VarR.getParentActivity() == null) {
            return;
        }
        if (!SharedConfig.inappCamera) {
            this.J0 = false;
        } else if (Build.VERSION.SDK_INT >= 23) {
            boolean z14 = n2VarR.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0;
            this.K0 = z14;
            if (z14) {
                if (z10) {
                    try {
                        n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
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
        if ((z12 != this.J0 || z13 != this.K0) && (ulVar = this.C) != null) {
            ulVar.l();
        }
        if (giVar.R || !giVar.isShowing() || !this.J0 || giVar.getBackDrawable().getAlpha() == 0 || this.U) {
            return;
        }
        s0();
    }

    public final void V() {
        f2.o1 o1VarK;
        float[] fArr;
        ol olVar;
        if (PhotoViewer.C1() && PhotoViewer.t1().f35688l5 != null && PhotoViewer.t1().f35688l5.R) {
            return;
        }
        ql qlVar = this.L;
        if (qlVar != null) {
            qlVar.invalidateOutline();
        }
        int i10 = this.I0 - 1;
        gl glVar = this.A;
        f2.o1 o1VarK2 = glVar.K(i10);
        if (o1VarK2 != null) {
            o1VarK2.f5789a.invalidateOutline();
        }
        if ((!this.C.d || !this.J0 || this.P0 != this.Q0) && (o1VarK = glVar.K(0)) != null) {
            o1VarK.f5789a.invalidateOutline();
        }
        ql qlVar2 = this.L;
        if (qlVar2 != null) {
            qlVar2.invalidate();
        }
        if (Build.VERSION.SDK_INT >= 23 && (olVar = this.N) != null) {
            ((ViewGroup.MarginLayoutParams) olVar.getLayoutParams()).topMargin = getRootWindowInsets() == null ? AndroidUtilities.dp(16.0f) : getRootWindowInsets().getSystemWindowInsetTop() + AndroidUtilities.dp(2.0f);
        }
        if (this.J0) {
            int childCount = glVar.getChildCount();
            int i11 = 0;
            while (true) {
                fArr = this.Q;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = glVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.j5) {
                    if (!childAt.isAttachedToWindow()) {
                        break;
                    }
                    float y10 = getY() + glVar.getY() + childAt.getY();
                    gi giVar = this.f34900b;
                    ViewGroup sheetContainer = giVar.getSheetContainer();
                    jh jhVar = giVar.f28697u1;
                    ag.y1 y1Var = giVar.K0;
                    float y11 = sheetContainer.getY() + y10;
                    float x8 = giVar.getSheetContainer().getX() + getX() + glVar.getX() + childAt.getX();
                    if (Build.VERSION.SDK_INT >= 23) {
                        x8 -= getRootWindowInsets().getSystemWindowInsetLeft();
                    }
                    float alpha = (y1Var.getAlpha() * y1Var.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (!giVar.f28639c0 ? AndroidUtilities.statusBarHeight : 0);
                    lh.i iVar = giVar.f28709x2;
                    if (iVar != null && iVar.g()) {
                        alpha = Math.max(alpha, (giVar.f28709x2.e() + giVar.f28709x2.getY()) - giVar.f28658h2);
                    }
                    float f10 = y10 < alpha ? alpha - y10 : 0.0f;
                    if (f10 != this.S) {
                        this.S = f10;
                        ql qlVar3 = this.L;
                        if (qlVar3 != null) {
                            qlVar3.invalidateOutline();
                            this.L.invalidate();
                        }
                    }
                    float translationY = (int) (jhVar.getTranslationY() + (giVar.getSheetContainer().getMeasuredHeight() - jhVar.getMeasuredHeight()));
                    lh.i iVar2 = giVar.f28709x2;
                    if (iVar2 != null) {
                        translationY -= iVar2.d() - AndroidUtilities.dp(6.0f);
                    }
                    if (childAt.getMeasuredHeight() + y10 > translationY) {
                        this.T = Math.min(-AndroidUtilities.dp(5.0f), y10 - translationY) + childAt.getMeasuredHeight();
                    } else {
                        this.T = 0.0f;
                    }
                    fArr[0] = x8;
                    fArr[1] = y11;
                    R();
                    return;
                }
                i11++;
            }
            if (this.S != 0.0f) {
                this.S = 0.0f;
                ql qlVar4 = this.L;
                if (qlVar4 != null) {
                    qlVar4.invalidateOutline();
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
            HashMap map = f26239o1;
            if (map.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f26240p1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = map.get(arrayList.get(0));
            if (!(obj instanceof MediaController.PhotoEntry)) {
                break;
            }
            Q((MediaController.PhotoEntry) obj, -1);
            z11 = true;
        }
        return z11;
    }

    public final boolean X(MediaController.PhotoEntry photoEntry) {
        boolean z10 = this.f26273s0;
        org.telegram.ui.ActionBar.c6 c6Var = this.f34899a;
        gi giVar = this.f34900b;
        if (z10 || !photoEntry.isVideo) {
            if (this.f26274t0 || photoEntry.isVideo) {
                return false;
            }
            if (!giVar.a1()) {
                org.telegram.messenger.y1.r(R.string.GlobalAttachPhotoRestricted, new mc(giVar.f28674n1, c6Var), null);
                return true;
            }
        } else if (!giVar.a1()) {
            org.telegram.messenger.y1.r(R.string.GlobalAttachVideoRestricted, new mc(giVar.f28674n1, c6Var), null);
            return true;
        }
        return true;
    }

    public final void Y() {
        if (!this.L0 || Build.VERSION.SDK_INT < 23) {
            return;
        }
        boolean zE0 = e0();
        this.L0 = zE0;
        if (!zE0) {
            f0();
        }
        this.C.l();
        this.v.l();
    }

    public final void Z() {
        String string = LocaleController.getString(R.string.EnablePhotoSpoiler);
        org.telegram.ui.ActionBar.f1 f1Var = this.U0;
        f1Var.setText(string);
        f1Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.f34900b.W0.K(1);
        HashMap map = f26239o1;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).reset();
            }
            map.clear();
            f26240p1.clear();
        }
        ArrayList arrayList = f26238n1;
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
        Object obj;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = f26240p1;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (i10 == 0) {
                Object obj2 = arrayList.get(i10);
                HashMap map = f26239o1;
                Object obj3 = map.get(obj2);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntryClone = ((MediaController.PhotoEntry) obj3).clone();
                    CharSequence[] charSequenceArr = {charSequence};
                    photoEntryClone.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, false);
                    photoEntryClone.caption = charSequenceArr[0];
                    obj = photoEntryClone;
                } else if (obj3 instanceof MediaController.SearchImage) {
                    obj = obj3;
                    MediaController.SearchImage searchImageClone = ((MediaController.SearchImage) obj3).clone();
                    CharSequence[] charSequenceArr2 = {charSequence};
                    searchImageClone.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr2, false);
                    searchImageClone.caption = charSequenceArr2[0];
                    obj = searchImageClone;
                }
                obj = obj3;
                map.put(obj2, obj);
            }
            i10++;
        }
    }

    public final void a0(boolean z10) {
        ql qlVar;
        if (this.f26267o0 || this.L == null) {
            return;
        }
        int i10 = this.G0;
        int[] iArr = this.f26244b0;
        iArr[1] = i10;
        int i11 = 2;
        iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
        Runnable runnable = this.f26260j0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f26260j0 = null;
        }
        boolean z11 = ((double) AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, this.f34899a))) > 0.721d;
        gi giVar = this.f34900b;
        AndroidUtilities.setLightNavigationBar(giVar, z11);
        TextView textView = this.f26264l0;
        gl glVar = this.f26270r;
        ag.p1 p1Var = this.f26252f0;
        gl glVar2 = this.A;
        ImageView[] imageViewArr = this.O;
        k81 k81Var = this.f26256h0;
        if (z10) {
            this.f26253f1 = this.L.getTranslationY();
            this.W = true;
            if (glVar2 != null) {
                glVar2.invalidate();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(k81Var, (Property<k81, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(glVar, (Property<gl, Float>) property, 0.0f));
            for (int i12 = 0; i12 < 2; i12++) {
                if (imageViewArr[i12].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i12], (Property<ImageView, Float>) property, 0.0f));
                    break;
                }
            }
            this.f26245b1.lock();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(220L);
            animatorSet.setInterpolator(er.f28122f);
            animatorSet.addListener(new il(this, i11));
            animatorSet.start();
        } else {
            this.f26251e1 = false;
            giVar.getWindow().clearFlags(128);
            setCameraOpenProgress(0.0f);
            iArr[0] = 0;
            setCameraOpenProgress(0.0f);
            p1Var.setAlpha(0.0f);
            p1Var.setVisibility(8);
            k81Var.setAlpha(0.0f);
            k81Var.setTag(null);
            k81Var.setVisibility(8);
            glVar.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            glVar.setVisibility(8);
            for (int i13 = 0; i13 < 2; i13++) {
                if (imageViewArr[i13].getVisibility() == 0) {
                    imageViewArr[i13].setAlpha(0.0f);
                    break;
                }
            }
            this.U = false;
            ql qlVar2 = this.L;
            if (qlVar2 != null) {
                qlVar2.setFpsLimit(30);
                this.L.setSystemUiVisibility(1024);
            }
            if (glVar2 != null) {
                glVar2.invalidate();
            }
        }
        ql qlVar3 = this.L;
        if (qlVar3 != null) {
            qlVar3.setImportantForAccessibility(0);
        }
        glVar2.setImportantForAccessibility(0);
        if (LiteMode.isEnabled(360928) || (qlVar = this.L) == null) {
            return;
        }
        qlVar.showTexture(false, z10);
    }

    @Override
    public final boolean b() {
        return !this.U;
    }

    public final MediaController.PhotoEntry b0(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = f26238n1;
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
        Iterator it = f26239o1.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
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
        boolean z10 = this.f26243a1;
        int i10 = z10 ? org.telegram.ui.ActionBar.g6.f23135hg : org.telegram.ui.ActionBar.g6.f23161j5;
        int i11 = org.telegram.ui.ActionBar.g6.f23037c7;
        org.telegram.ui.ActionBar.c6 c6Var = this.f34899a;
        this.D.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, c6Var);
        gl glVar = this.A;
        glVar.setGlowColor(iV0);
        glVar.K(0);
        this.f26279x.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int iV1 = org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.f23135hg : org.telegram.ui.ActionBar.g6.E8, c6Var);
        ll llVar = this.f26277w;
        llVar.G(iV1, false);
        llVar.G(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.f23135hg : org.telegram.ui.ActionBar.g6.E8, c6Var), true);
        llVar.B(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.f23172jg : org.telegram.ui.ActionBar.g6.G8, c6Var));
        org.telegram.ui.ActionBar.g6.w1(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), this.f26281y);
    }

    public final void d0(boolean z10) {
        if (!this.J0 || this.L == null) {
            return;
        }
        n0();
        this.M.f();
        this.L.destroy(z10, null);
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.K = null;
        }
        AndroidUtilities.runOnUIThread(new yk(this, 0), 300L);
        this.V = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gi giVar;
        if (i10 != NotificationCenter.albumsDidLoad) {
            if (i10 == NotificationCenter.cameraInitied) {
                U(false);
                return;
            }
            return;
        }
        ul ulVar = this.C;
        if (ulVar != null) {
            if (q0()) {
                this.Q0 = MediaController.allMediaAlbumEntry;
            } else {
                this.Q0 = MediaController.allPhotosAlbumEntry;
            }
            if (this.P0 == null || ((giVar = this.f34900b) != null && giVar.C)) {
                this.P0 = this.Q0;
            } else if (q0()) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.P0;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.P0 = albumEntry;
                        break;
                    }
                }
            }
            this.T0 = false;
            this.D.c();
            ulVar.l();
            this.v.l();
            ArrayList arrayList = f26240p1;
            if (!arrayList.isEmpty() && this.Q0 != null) {
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Integer num = (Integer) arrayList.get(i14);
                    HashMap map = f26239o1;
                    Object obj = map.get(num);
                    MediaController.PhotoEntry photoEntry = this.Q0.photosByIds.get(num.intValue());
                    if (photoEntry != null) {
                        if (obj instanceof MediaController.PhotoEntry) {
                            photoEntry.copyFrom((MediaController.PhotoEntry) obj);
                        }
                        map.put(num, photoEntry);
                    }
                }
            }
            u0();
        }
    }

    public final boolean e0() {
        Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        if (activityFindActivity == null) {
            activityFindActivity = this.f34900b.f28635b0.getParentActivity();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            return false;
        }
        if (activityFindActivity == null) {
            return true;
        }
        if (i10 < 33 || (activityFindActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activityFindActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
            return i10 < 33 && activityFindActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
        }
        return true;
    }

    public final void f0() {
        if ((q0() ? MediaController.allMediaAlbumEntry : MediaController.allPhotosAlbumEntry) == null) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
    }

    public final void g0(int i10, Intent intent, String str) {
        String path;
        int i11;
        int i12;
        String str2 = str;
        gi giVar = this.f34900b;
        boolean z10 = giVar.R;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        if (z10) {
            return;
        }
        f26237m1 = true;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        if (i10 == 0) {
            PhotoViewer.t1().K2(n2Var.getParentActivity(), null, this.f34899a);
            PhotoViewer photoViewerT1 = PhotoViewer.t1();
            int i13 = giVar.O1;
            boolean z11 = giVar.P1;
            photoViewerT1.h = i13;
            photoViewerT1.f35700n = z11;
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str2);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str2).getAbsolutePath(), options);
                i11 = options.outWidth;
                try {
                    i12 = options.outHeight;
                } catch (Exception unused) {
                    i12 = 0;
                }
            } catch (Exception unused2) {
                i11 = 0;
            }
            int i14 = i11;
            int i15 = f26241q1;
            f26241q1 = i15 - 1;
            MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i15, 0L, str2, ((Integer) imageOrientation.first).intValue(), false, i14, i12, 0L).setOrientation(imageOrientation);
            orientation.canDeleteAfter = true;
            j0(orientation, false, true);
            return;
        }
        if (i10 != 2) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("pic path " + str2);
        }
        Intent intent2 = (intent == null || str2 == null || !com.google.android.recaptcha.internal.a.v(str2)) ? intent : null;
        if (intent2 != null) {
            Uri data = intent2.getData();
            if (data == null) {
                path = str2;
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("video record uri " + data.toString());
                }
                path = AndroidUtilities.getPath(data);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("resolved path = " + path);
                }
                if (path == null || !com.google.android.recaptcha.internal.a.v(path)) {
                    path = str2;
                }
            }
            if (!(n2Var instanceof org.telegram.ui.rn) || !((org.telegram.ui.rn) n2Var).x()) {
                AndroidUtilities.addMediaToGallery(str2);
            }
            str2 = null;
        } else {
            path = null;
        }
        if (path != null || str2 == null || !com.google.android.recaptcha.internal.a.v(str2)) {
            str2 = path;
        }
        long jCeil = 0;
        try {
            try {
                try {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever2.setDataSource(str2);
                            String strExtractMetadata = mediaMetadataRetriever2.extractMetadata(9);
                            jCeil = strExtractMetadata != null ? (int) Math.ceil(Long.parseLong(strExtractMetadata) / 1000.0f) : 0L;
                            mediaMetadataRetriever2.release();
                        } catch (Exception e9) {
                            e = e9;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            FileLog.e(e);
                            if (mediaMetadataRetriever != null) {
                                mediaMetadataRetriever.release();
                            }
                            Bitmap bitmapCreateVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str2, 1);
                            File file = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                            bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file));
                            SharedConfig.saveConfig();
                            int i16 = f26241q1;
                            f26241q1 = i16 - 1;
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i16, 0L, str2, 0, true, bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), 0L);
                            photoEntry.duration = (int) jCeil;
                            photoEntry.thumbPath = file.getAbsolutePath();
                            j0(photoEntry, false, true);
                        } catch (Throwable th) {
                            th = th;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            Throwable th2 = th;
                            if (mediaMetadataRetriever == null) {
                                throw th2;
                            }
                            try {
                                mediaMetadataRetriever.release();
                                throw th2;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                throw th2;
                            }
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                } catch (Exception e12) {
                    e = e12;
                }
                bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 55, new FileOutputStream(file));
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
            Bitmap bitmapCreateVideoThumbnail2 = SendMessagesHelper.createVideoThumbnail(str2, 1);
            File file2 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
            SharedConfig.saveConfig();
            int i17 = f26241q1;
            f26241q1 = i17 - 1;
            MediaController.PhotoEntry photoEntry2 = new MediaController.PhotoEntry(0, i17, 0L, str2, 0, true, bitmapCreateVideoThumbnail2.getWidth(), bitmapCreateVideoThumbnail2.getHeight(), 0L);
            photoEntry2.duration = (int) jCeil;
            photoEntry2.thumbPath = file2.getAbsolutePath();
            j0(photoEntry2, false, true);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public ArrayList<Object> getAllPhotosArray() {
        MediaController.AlbumEntry albumEntry = this.P0;
        ArrayList<Object> arrayList = f26238n1;
        if (albumEntry == null) {
            return !arrayList.isEmpty() ? arrayList : new ArrayList<>(0);
        }
        if (arrayList.isEmpty()) {
            return this.P0.photos;
        }
        ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.P0.photos.size());
        arrayList2.addAll(arrayList);
        arrayList2.addAll(this.P0.photos);
        return arrayList2;
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.f26242a0;
    }

    @Override
    public int getCurrentItemTop() {
        gl glVar = this.A;
        int childCount = glVar.getChildCount();
        az azVar = this.D;
        if (childCount <= 0) {
            glVar.setTopGlowOffset(glVar.getPaddingTop());
            azVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = glVar.getChildAt(0);
        lk0 lk0Var = (lk0) glVar.G(childAt);
        int top = childAt.getTop() - this.l1;
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || lk0Var == null || lk0Var.b() != 0) {
            top = iDp;
        }
        azVar.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - azVar.getMeasuredHeight()) / 2.0f) + top);
        glVar.setTopGlowOffset(top);
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
        return f26240p1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f26239o1;
    }

    public int getSelectedPhotosCount() {
        int i10 = 0;
        for (Object obj : f26239o1.values()) {
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
        for (Object obj : f26239o1.values()) {
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
        return f26240p1;
    }

    public long getStarsPrice() {
        Iterator it = f26239o1.entrySet().iterator();
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
        ql qlVar;
        if (this.L == null || this.K != null) {
            return;
        }
        gi giVar = this.f34900b;
        if (giVar.isDismissed()) {
            return;
        }
        this.L.initTexture();
        boolean zQ0 = q0();
        TextView textView = this.m0;
        if (zQ0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        boolean zIsEmpty = f26238n1.isEmpty();
        gl glVar = this.f26270r;
        TextView textView2 = this.f26264l0;
        if (zIsEmpty) {
            textView2.setVisibility(4);
            glVar.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            glVar.setVisibility(0);
        }
        if (giVar.m1().v && isFocusable()) {
            giVar.m1().d();
        }
        k81 k81Var = this.f26256h0;
        k81Var.setVisibility(0);
        k81Var.setAlpha(0.0f);
        ag.p1 p1Var = this.f26252f0;
        p1Var.setVisibility(0);
        p1Var.setTag(null);
        int[] iArr = this.f26244b0;
        iArr[0] = 0;
        int i10 = this.G0;
        int i11 = 1;
        iArr[1] = i10;
        iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
        this.f26253f1 = 0.0f;
        this.f26251e1 = true;
        ql qlVar2 = this.L;
        if (qlVar2 != null) {
            qlVar2.setFpsLimit(-1);
        }
        AndroidUtilities.hideKeyboard(this);
        AndroidUtilities.setLightNavigationBar((Dialog) giVar, false);
        giVar.getWindow().addFlags(128);
        gl glVar2 = this.A;
        ImageView[] imageViewArr = this.O;
        if (z10) {
            setCameraOpenProgress(0.0f);
            this.W = true;
            if (glVar2 != null) {
                glVar2.invalidate();
            }
            this.f26245b1.lock();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(glVar, (Property<gl, Float>) property, 1.0f));
            for (int i12 = 0; i12 < 2; i12++) {
                if (imageViewArr[i12].getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i12], (Property<ImageView, Float>) property, 1.0f));
                    break;
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(350L);
            animatorSet.setInterpolator(er.f28122f);
            animatorSet.addListener(new il(this, i11));
            animatorSet.start();
        } else {
            setCameraOpenProgress(1.0f);
            p1Var.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            glVar.setAlpha(1.0f);
            for (int i13 = 0; i13 < 2; i13++) {
                if (imageViewArr[i13].getVisibility() == 0) {
                    imageViewArr[i13].setAlpha(1.0f);
                    break;
                }
            }
            giVar.V1.F();
            ql qlVar3 = this.L;
            if (qlVar3 != null) {
                qlVar3.setSystemUiVisibility(1028);
            }
        }
        this.U = true;
        ql qlVar4 = this.L;
        if (qlVar4 != null) {
            qlVar4.setImportantForAccessibility(2);
        }
        glVar2.setImportantForAccessibility(4);
        glVar2.invalidate();
        if (LiteMode.isEnabled(360928) || (qlVar = this.L) == null || !qlVar.isInited()) {
            return;
        }
        this.L.showTexture(true, z10);
    }

    public final void i0() {
        if (SharedConfig.inappCamera) {
            h0(true);
            return;
        }
        gi giVar = this.f34900b;
        ei eiVar = giVar.V1;
        if (eiVar != null) {
            eiVar.n0(0, false, true, 0, 0, 0L, giVar.s1(), false, 0L);
        }
    }

    @Override
    public final void j() {
        V();
        invalidate();
    }

    public final void j0(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        int i10;
        org.telegram.ui.rn rnVar;
        int i11;
        org.telegram.ui.rn rnVar2;
        ArrayList<Object> arrayList;
        int size;
        ArrayList arrayList2 = f26238n1;
        gi giVar = this.f34900b;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            f26239o1.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            f26240p1.add(Integer.valueOf(photoEntry.imageId));
            giVar.V1(0);
            this.C.l();
            this.v.l();
        }
        if (photoEntry != null && !z11 && arrayList2.size() > 1) {
            y0(false);
            if (this.L != null) {
                this.f26256h0.b(0.0f, false);
                this.f26280x0 = 0.0f;
                this.L.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.L.getCameraSessionObject());
                return;
            }
            return;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.f26268p0 = true;
        org.telegram.ui.ActionBar.n2 n2VarR = giVar.f28635b0;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        if (n2VarR == null) {
            n2VarR = LaunchActivity.R();
        }
        if (n2VarR == null) {
            return;
        }
        PhotoViewer.t1().K2(n2VarR.getParentActivity(), null, this.f34899a);
        PhotoViewer.t1().L2(giVar);
        PhotoViewer photoViewerT1 = PhotoViewer.t1();
        int i12 = giVar.O1;
        boolean z12 = giVar.P1;
        photoViewerT1.h = i12;
        photoViewerT1.f35700n = z12;
        if (giVar.B && giVar.C) {
            rnVar = (org.telegram.ui.rn) n2Var;
            i10 = 11;
        } else if (giVar.M0 != 0) {
            rnVar = null;
            i10 = 1;
        } else if (n2Var instanceof org.telegram.ui.rn) {
            rnVar = (org.telegram.ui.rn) n2Var;
            i10 = 2;
        } else {
            i10 = 5;
            rnVar = null;
        }
        boolean z13 = giVar.D;
        if (z13) {
            rnVar2 = null;
            i11 = 13;
        } else {
            i11 = i10;
            rnVar2 = rnVar;
        }
        if (giVar.M0 != 0 || z13) {
            arrayList = new ArrayList<>();
            arrayList.add(photoEntry);
            size = 0;
        } else {
            arrayList = getAllPhotosArray();
            size = arrayList2.size() - 1;
        }
        ArrayList<Object> arrayList3 = arrayList;
        h40 h40Var = giVar.M;
        if (h40Var != null && photoEntry != null) {
            h40Var.f28927e = photoEntry.isVideo;
        }
        PhotoViewer.t1().f2(arrayList3, size, i11, false, new hl(this, z10), rnVar2);
        PhotoViewer.t1().x2(giVar.M);
        if (giVar.C) {
            PhotoViewer.t1().X0(null, null, false, giVar.F);
            PhotoViewer.t1().l2();
        }
    }

    @Override
    public final void k(float f10) {
        this.S0 = f10;
        V();
        ql qlVar = this.L;
        if (qlVar != null) {
            qlVar.invalidateOutline();
            this.L.invalidate();
        }
        invalidate();
    }

    public final void k0() {
        try {
            if (this.L != null) {
                CameraController.getInstance().stopPreview(this.L.getCameraSessionObject());
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final boolean l(MotionEvent motionEvent) {
        ql qlVar;
        if (!this.W) {
            if (this.U && motionEvent != null) {
                boolean z10 = this.C0;
                k81 k81Var = this.f26256h0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.A0;
                    k81Var.getHitRect(rect);
                    if (k81Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f26267o0 && !this.E0) {
                            if (motionEvent.getPointerCount() == 2) {
                                this.f26278w0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                this.f26282y0 = true;
                            } else {
                                this.D0 = true;
                                this.B0 = motionEvent.getY();
                                this.f26282y0 = false;
                            }
                            this.f26283z0 = false;
                            this.C0 = true;
                            return true;
                        }
                    }
                } else if (this.C0) {
                    int actionMasked = motionEvent.getActionMasked();
                    gl glVar = this.f26270r;
                    TextView textView = this.f26264l0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.O;
                    ag.p1 p1Var = this.f26252f0;
                    if (actionMasked == 2) {
                        if (this.f26282y0 && motionEvent.getPointerCount() == 2 && !this.E0) {
                            float fHypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (this.f26283z0) {
                                if (this.L != null) {
                                    float fDp = (fHypot - this.f26278w0) / AndroidUtilities.dp(100.0f);
                                    this.f26278w0 = fHypot;
                                    float f10 = this.f26280x0 + fDp;
                                    this.f26280x0 = f10;
                                    if (f10 < 0.0f) {
                                        this.f26280x0 = 0.0f;
                                    } else if (f10 > 1.0f) {
                                        this.f26280x0 = 1.0f;
                                    }
                                    k81Var.b(this.f26280x0, false);
                                    this.f34900b.getSheetContainer().invalidate();
                                    this.L.setZoom(this.f26280x0);
                                    t0(true);
                                    return true;
                                }
                            } else if (Math.abs(fHypot - this.f26278w0) >= AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                this.f26278w0 = fHypot;
                                this.f26283z0 = true;
                                return true;
                            }
                        } else {
                            float y10 = motionEvent.getY();
                            float f11 = y10 - this.B0;
                            if (this.D0) {
                                if (Math.abs(f11) > AndroidUtilities.getPixelsInCM(0.4f, false)) {
                                    this.D0 = false;
                                    this.E0 = true;
                                    return true;
                                }
                            } else if (this.E0 && (qlVar = this.L) != null) {
                                qlVar.setTranslationY(qlVar.getTranslationY() + f11);
                                this.B0 = y10;
                                k81Var.setTag(null);
                                Runnable runnable = this.f26260j0;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.f26260j0 = null;
                                }
                                if (p1Var.getTag() == null) {
                                    p1Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property, 0.0f), ObjectAnimator.ofFloat(k81Var, (Property<k81, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(glVar, (Property<gl, Float>) property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(er.f28122f);
                                    animatorSet.start();
                                    return true;
                                }
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                        this.C0 = false;
                        this.f26282y0 = false;
                        if (this.E0) {
                            this.E0 = false;
                            ql qlVar2 = this.L;
                            if (qlVar2 != null) {
                                if (Math.abs(qlVar2.getTranslationY()) > this.L.getMeasuredHeight() / 6.0f) {
                                    a0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.L, (Property<ql, Float>) View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(glVar, (Property<gl, Float>) property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f26250e0);
                                animatorSet2.start();
                                p1Var.setTag(null);
                                return true;
                            }
                        } else {
                            ql qlVar3 = this.L;
                            if (qlVar3 != null && !this.f26283z0) {
                                int[] iArr = this.R;
                                qlVar3.getLocationOnScreen(iArr);
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
        if (this.f34900b.R) {
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.O[i10].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(er.f28122f).start();
        }
        ViewPropertyAnimator duration = this.f26266n0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        er erVar = er.f28122f;
        duration.setInterpolator(erVar).start();
        this.m0.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false);
        AndroidUtilities.cancelRunOnUIThread(this.f26248d0);
        this.f26248d0 = null;
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
        } catch (Exception e9) {
            FileLog.e(e9);
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
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.L.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 80, (int) (bitmapCreateBitmap.getHeight() / (bitmapCreateBitmap.getWidth() / 80.0f)), true);
                    if (bitmapCreateScaledBitmap != null) {
                        if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                            bitmapCreateBitmap.recycle();
                        }
                        Utilities.blurBitmap(bitmapCreateScaledBitmap, 7);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        bitmapCreateScaledBitmap.recycle();
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
        if (this.O0 != i14) {
            this.O0 = i14;
            ul ulVar = this.C;
            if (ulVar != null) {
                ulVar.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        V();
    }

    @Override
    public final void p(int i10) {
        d0((i10 == 0 || i10 == 2) ? false : true);
    }

    public final void p0(int i10, final boolean z10) {
        PhotoViewer photoViewerT1 = PhotoViewer.t1();
        if (i10 == -1) {
            i10 = photoViewerT1.L4;
        }
        ArrayList arrayList = photoViewerT1.f35608c7;
        if (arrayList == null || arrayList.isEmpty() || i10 >= arrayList.size() || !(arrayList.get(i10) instanceof MediaController.PhotoEntry) || !((MediaController.PhotoEntry) arrayList.get(i10)).hasSpoiler) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
        this.A.M(new q0.a() {
            @Override
            public final void accept(Object obj) {
                View view = (View) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f26237m1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    if (q5Var.getPhotoEntry() == photoEntry) {
                        q5Var.c(z10, Float.valueOf(250.0f));
                        q5Var.f(this.f26762a.getStarsPrice(), ChatAttachAlertPhotoLayout.f26239o1.size() > 1);
                    }
                }
            }
        });
    }

    public final boolean q0() {
        if (this.f26275u0) {
            return true;
        }
        gi giVar = this.f34900b;
        if (giVar.B) {
            return false;
        }
        return (giVar.f28635b0 instanceof org.telegram.ui.rn) || giVar.P0 || giVar.M0 == 2;
    }

    @Override
    public final void r() {
        ql qlVar = this.L;
        if (qlVar != null) {
            qlVar.setVisibility(8);
        }
        for (Map.Entry entry : f26239o1.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.C.l();
    }

    public final void r0(x8 x8Var, TLRPC.VideoSize videoSize, long j10) {
        gi giVar = this.f34900b;
        v8 v8Var = new v8(giVar.Q, giVar.M);
        h40 h40Var = giVar.M;
        v8Var.M = h40Var == null || h40Var.f28926c != 2;
        giVar.f28635b0.presentFragment(v8Var);
        if (x8Var != null) {
            v8Var.m0(x8Var);
        }
        if (videoSize != null) {
            v8Var.l0(videoSize);
        }
        if (j10 != 0) {
            v8Var.k0(j10);
        }
        v8Var.E = new g1(13, this, v8Var);
    }

    @Override
    public final void requestLayout() {
        if (this.N0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s() {
        this.J = true;
        gl glVar = this.A;
        int childCount = glVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (glVar.getChildAt(i10) instanceof org.telegram.ui.Cells.j5) {
                n0();
                break;
            }
            this.M.f();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f26263k1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = this.f26279x.animate().alpha(0.0f).setDuration(150L).setInterpolator(er.f28125j).withEndAction(new yk(this, 1));
        this.f26263k1 = viewPropertyAnimatorWithEndAction;
        viewPropertyAnimatorWithEndAction.start();
        k0();
    }

    public final void s0() {
        gi giVar = this.f34900b;
        if (!giVar.f28637b2 && this.f26271r0 && CameraView.isCameraAllowed()) {
            if (this.L == null) {
                boolean z10 = !LiteMode.isEnabled(360928);
                Context context = getContext();
                Boolean bool = this.f26262k0;
                ql qlVar = new ql(this, context, bool != null ? bool.booleanValue() : giVar.Q1, z10);
                this.L = qlVar;
                org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
                qlVar.setRecordFile(AndroidUtilities.generateVideoPath((n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).x()));
                this.L.setFocusable(true);
                this.L.setFpsLimit(30);
                this.L.setOutlineProvider(new lg.b(this, 1));
                this.L.setClipToOutline(true);
                this.L.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                org.telegram.ui.ActionBar.c3 container = giVar.getContainer();
                ql qlVar2 = this.L;
                int i10 = this.G0;
                container.addView(qlVar2, 1, new FrameLayout.LayoutParams(i10, i10));
                this.L.setDelegate(new jl(this));
                this.L.setAlpha(this.f26271r0 ? 1.0f : 0.2f);
                this.L.setEnabled(this.f26271r0);
                if (this.J) {
                    this.L.setVisibility(8);
                }
                if (!this.U) {
                    V();
                }
                gl glVar = this.A;
                if (glVar != null) {
                    glVar.invalidate();
                }
                invalidate();
            }
            k81 k81Var = this.f26256h0;
            if (k81Var != null) {
                k81Var.b(0.0f, false);
                this.f26280x0 = 0.0f;
            }
            if (this.U) {
                return;
            }
            this.L.setTranslationX(this.Q[0]);
        }
    }

    public void setCameraOpenProgress(float f10) {
        int i10;
        int i11;
        if (this.L == null) {
            return;
        }
        this.f26242a0 = f10;
        int[] iArr = this.f26244b0;
        float f11 = iArr[1];
        float f12 = iArr[2];
        int i12 = AndroidUtilities.displaySize.x;
        gi giVar = this.f34900b;
        float width = (giVar.getContainer().getWidth() - giVar.getLeftInset()) - giVar.getRightInset();
        float height = giVar.getContainer().getHeight();
        float[] fArr = this.Q;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = this.f26253f1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.L.getLayoutParams();
        float textureHeight = this.L.getTextureHeight(f11, f12) / this.L.getTextureHeight(width, height);
        float f16 = f12 / height;
        float f17 = f11 / width;
        if (this.f26251e1) {
            i10 = (int) width;
            i11 = (int) height;
            float f18 = 1.0f - f10;
            float f19 = (textureHeight * f18) + f10;
            this.L.getTextureView().setScaleX(f19);
            this.L.getTextureView().setScaleY(f19);
            float f20 = ((1.0f - ((f16 * f18) + f10)) * height) / 2.0f;
            float f21 = ((1.0f - ((f17 * f18) + f10)) * width) / 2.0f;
            float f22 = f13 * f18;
            this.L.setTranslationX(((0.0f * f10) + f22) - f21);
            float f23 = f14 * f18;
            this.L.setTranslationY(((f15 * f10) + f23) - f20);
            this.f26255g1 = f23 - this.L.getTranslationY();
            this.f26257h1 = (height * f10) + (((f14 + f12) * f18) - this.L.getTranslationY());
            this.f26261j1 = f22 - this.L.getTranslationX();
            this.f26259i1 = (width * f10) + (((f13 + f11) * f18) - this.L.getTranslationX());
        } else {
            i10 = (int) f11;
            i11 = (int) f12;
            this.L.getTextureView().setScaleX(1.0f);
            this.L.getTextureView().setScaleY(1.0f);
            this.f26255g1 = 0.0f;
            this.f26257h1 = height;
            this.f26261j1 = 0.0f;
            this.f26259i1 = width;
            this.L.setTranslationX(f13);
            this.L.setTranslationY(f14);
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
        this.f26269q0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.f26275u0 = z10;
    }

    public void setStarsPrice(long j10) {
        HashMap map = f26239o1;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue();
                photoEntry.starsAmount = j10;
                photoEntry.hasSpoiler = j10 > 0;
                photoEntry.isChatPreviewSpoilerRevealed = false;
                photoEntry.isAttachSpoilerRevealed = false;
            }
        }
        C(getSelectedItemsCount());
        if (W(false)) {
            x0();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        gi giVar = this.f34900b;
        if (giVar.getSheetAnimationType() == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            gl glVar = this.A;
            int childCount = glVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = glVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    float f12 = 1.0f + f11;
                    q5Var.getCheckBox().setScaleX(f12);
                    q5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        giVar.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void t(float f10) {
        ql qlVar = this.L;
        if (qlVar != null) {
            qlVar.setAlpha(f10);
            if (f10 != 0.0f && this.L.getVisibility() != 0) {
                this.L.setVisibility(0);
            } else {
                if (f10 != 0.0f || this.L.getVisibility() == 4) {
                    return;
                }
                this.L.setVisibility(4);
            }
        }
    }

    public final void t0(boolean z10) {
        k81 k81Var = this.f26256h0;
        if ((k81Var.getTag() != null && z10) || (k81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f26260j0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                yk ykVar = new yk(this, 3);
                this.f26260j0 = ykVar;
                AndroidUtilities.runOnUIThread(ykVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f26258i0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        k81Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26258i0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.f26258i0.playTogether(ObjectAnimator.ofFloat(k81Var, (Property<k81, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.f26258i0.addListener(new il(this, 0));
        this.f26258i0.start();
        if (z10) {
            yk ykVar2 = new yk(this, 4);
            this.f26260j0 = ykVar2;
            AndroidUtilities.runOnUIThread(ykVar2, 2000L);
        }
    }

    @Override
    public final void u(int i10) {
        TLRPC.Chat chatK1;
        boolean z10;
        boolean z11;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        gi giVar = this.f34900b;
        if (i10 == 8) {
            giVar.H1(!giVar.Y, true);
            this.Z0.a(!giVar.Y, true);
            return;
        }
        if ((i10 == 0 || i10 == 1) && giVar.O1 > 0 && f26240p1.size() > 1 && (chatK1 = giVar.k1()) != null && !ChatObject.hasAdminRights(chatK1) && chatK1.slowmode_enabled) {
            y4.O(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.f34899a).o();
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f34899a;
        HashMap map = f26239o1;
        final int i11 = 0;
        if (i10 == 0) {
            MessageObject messageObject = giVar.D1;
            org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
            if (messageObject == null && (n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).c()) {
                y4.M(getContext(), ((org.telegram.ui.rn) n2Var).a(), new vk(this, c13 == true ? 1 : 0), c6Var);
                return;
            } else {
                y4.a0(giVar.F1, giVar.j1() + map.size(), giVar.n1(), new Utilities.Callback(this) {

                    public final ChatAttachAlertPhotoLayout f34276b;

                    {
                        this.f34276b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        int i12 = i11;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34276b;
                        Long l10 = (Long) obj;
                        switch (i12) {
                            case 0:
                                boolean z12 = ChatAttachAlertPhotoLayout.f26237m1;
                                gi giVar2 = chatAttachAlertPhotoLayout.f34900b;
                                giVar2.Y0();
                                giVar2.V1.n0(7, false, true, 0, 0, 0L, giVar2.s1(), false, l10.longValue());
                                break;
                            default:
                                boolean z13 = ChatAttachAlertPhotoLayout.f26237m1;
                                gi giVar3 = chatAttachAlertPhotoLayout.f34900b;
                                giVar3.Y0();
                                giVar3.V1.n0(4, true, true, 0, 0, 0L, giVar3.s1(), false, l10.longValue());
                                break;
                        }
                    }
                });
                return;
            }
        }
        int i12 = 2;
        if (i10 == 1) {
            MessageObject messageObject2 = giVar.D1;
            org.telegram.ui.ActionBar.n2 n2Var2 = giVar.f28635b0;
            if (messageObject2 == null && (n2Var2 instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var2).c()) {
                y4.M(getContext(), ((org.telegram.ui.rn) n2Var2).a(), new vk(this, i12), c6Var);
                return;
            }
            int i13 = giVar.F1;
            long jN1 = giVar.n1();
            int iJ1 = giVar.j1() + map.size();
            final char c14 = c12 == true ? 1 : 0;
            y4.a0(i13, iJ1, jN1, new Utilities.Callback(this) {

                public final ChatAttachAlertPhotoLayout f34276b;

                {
                    this.f34276b = this;
                }

                @Override
                public final void run(Object obj) {
                    int i14 = c14;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34276b;
                    Long l10 = (Long) obj;
                    switch (i14) {
                        case 0:
                            boolean z12 = ChatAttachAlertPhotoLayout.f26237m1;
                            gi giVar2 = chatAttachAlertPhotoLayout.f34900b;
                            giVar2.Y0();
                            giVar2.V1.n0(7, false, true, 0, 0, 0L, giVar2.s1(), false, l10.longValue());
                            break;
                        default:
                            boolean z13 = ChatAttachAlertPhotoLayout.f26237m1;
                            gi giVar3 = chatAttachAlertPhotoLayout.f34900b;
                            giVar3.Y0();
                            giVar3.V1.n0(4, true, true, 0, 0, 0L, giVar3.s1(), false, l10.longValue());
                            break;
                    }
                }
            });
            return;
        }
        ul ulVar = this.C;
        gl glVar = this.A;
        if (i10 == 3) {
            em emVar = giVar.m0;
            if (emVar != null) {
                emVar.K();
            }
            Iterator it = map.entrySet().iterator();
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
            final boolean z12 = !z11;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final ChatAttachAlertPhotoLayout f34642b;

                {
                    this.f34642b = this;
                }

                @Override
                public final void run() {
                    int i14 = i11;
                    boolean z13 = z12;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34642b;
                    switch (i14) {
                        case 0:
                            boolean z14 = ChatAttachAlertPhotoLayout.f26237m1;
                            gi giVar2 = chatAttachAlertPhotoLayout.f34900b;
                            org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.U0;
                            f1Var.setText(LocaleController.getString(z13 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler));
                            if (z13) {
                                f1Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                f1Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z13) {
                                giVar2.W0.K(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    giVar2.W0.K(6);
                                }
                            } else {
                                giVar2.W0.r(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    giVar2.W0.r(6);
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.f1 f1Var2 = chatAttachAlertPhotoLayout.W0;
                            f1Var2.setText(LocaleController.getString(z13 ? R.string.SendInStandardQuality : R.string.SendInHighQuality));
                            if (!z13) {
                                f1Var2.setIcon(R.drawable.menu_quality_hd);
                            } else {
                                f1Var2.setIcon(R.drawable.menu_quality_sd);
                            }
                            break;
                    }
                }
            }, 200L);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    photoEntry.hasSpoiler = z12;
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                    photoEntry.isAttachSpoilerRevealed = false;
                    arrayList.add(Integer.valueOf(photoEntry.imageId));
                }
            }
            glVar.M(new zk(i11, arrayList, z12));
            if (giVar.f28696u0 != this) {
                ulVar.l();
            }
            em emVar2 = giVar.m0;
            if (emVar2 != null) {
                emVar2.v.invalidate();
                return;
            }
            return;
        }
        if (i10 == 2) {
            em emVar3 = giVar.m0;
            if (emVar3 != null) {
                emVar3.K();
            }
            Iterator it2 = map.entrySet().iterator();
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
            final boolean z13 = !z10;
            final char c15 = c11 == true ? 1 : 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final ChatAttachAlertPhotoLayout f34642b;

                {
                    this.f34642b = this;
                }

                @Override
                public final void run() {
                    int i14 = c15;
                    boolean z14 = z13;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34642b;
                    switch (i14) {
                        case 0:
                            boolean z15 = ChatAttachAlertPhotoLayout.f26237m1;
                            gi giVar2 = chatAttachAlertPhotoLayout.f34900b;
                            org.telegram.ui.ActionBar.f1 f1Var = chatAttachAlertPhotoLayout.U0;
                            f1Var.setText(LocaleController.getString(z14 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler));
                            if (z14) {
                                f1Var.setIcon(R.drawable.msg_spoiler_off);
                            } else {
                                f1Var.setAnimatedIcon(R.raw.photo_spoiler);
                            }
                            if (!z14) {
                                giVar2.W0.K(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    giVar2.W0.K(6);
                                }
                            } else {
                                giVar2.W0.r(1);
                                if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                    giVar2.W0.r(6);
                                }
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.f1 f1Var2 = chatAttachAlertPhotoLayout.W0;
                            f1Var2.setText(LocaleController.getString(z14 ? R.string.SendInStandardQuality : R.string.SendInHighQuality));
                            if (!z14) {
                                f1Var2.setIcon(R.drawable.menu_quality_hd);
                            } else {
                                f1Var2.setIcon(R.drawable.menu_quality_sd);
                            }
                            break;
                    }
                }
            }, 200L);
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : map.entrySet()) {
                if (entry2.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) entry2.getValue();
                    photoEntry2.highQuality = Boolean.valueOf(z13);
                    photoEntry2.isChatPreviewSpoilerRevealed = false;
                    photoEntry2.isAttachSpoilerRevealed = false;
                    arrayList2.add(Integer.valueOf(photoEntry2.imageId));
                }
            }
            glVar.M(new zk(c10 == true ? 1 : 0, arrayList2, z13));
            if (giVar.f28696u0 != this) {
                ulVar.l();
            }
            em emVar4 = giVar.m0;
            if (emVar4 != null) {
                emVar4.v.invalidate();
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 == 7) {
                giVar.Z1(giVar.f28696u0 != giVar.m0);
                return;
            }
            if (i10 == 9) {
                hh.oa.g1(getContext(), getStarsPrice(), true, new d(this, 6), this.f34899a);
                return;
            }
            if (i10 >= 10) {
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.R0.get(i10 - 10);
                this.P0 = albumEntry;
                MediaController.AlbumEntry albumEntry2 = this.Q0;
                TextView textView = this.f26279x;
                if (albumEntry == albumEntry2) {
                    textView.setText(LocaleController.getString(R.string.ChatGallery));
                } else {
                    textView.setText(albumEntry.bucketName);
                }
                ulVar.l();
                this.v.l();
                this.B.h1(0, -(glVar.getPaddingTop() - getTopScrollOffset()));
                return;
            }
            return;
        }
        try {
            if (q0()) {
                Intent intent = new Intent();
                intent.setType("video/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                Intent intent2 = new Intent("android.intent.action.PICK");
                intent2.setType("image/*");
                Intent intentCreateChooser = Intent.createChooser(intent2, null);
                intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                int i14 = giVar.M0;
                org.telegram.ui.ActionBar.n2 n2Var3 = giVar.f28635b0;
                if (i14 != 0) {
                    n2Var3.startActivityForResult(intentCreateChooser, 14);
                } else {
                    n2Var3.startActivityForResult(intentCreateChooser, 1);
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.PICK");
                intent3.setType("image/*");
                int i15 = giVar.M0;
                org.telegram.ui.ActionBar.n2 n2Var4 = giVar.f28635b0;
                if (i15 != 0) {
                    n2Var4.startActivityForResult(intent3, 14);
                } else {
                    n2Var4.startActivityForResult(intent3, 1);
                }
            }
            giVar.dismiss(true);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void u0() {
        ll llVar = this.f26277w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = llVar.f23854b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f26271r0) {
            ArrayList<MediaController.AlbumEntry> arrayList = q0() ? MediaController.allMediaAlbums : MediaController.allPhotoAlbums;
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.R0 = arrayList2;
            Collections.sort(arrayList2, new bl(arrayList, 0));
        } else {
            this.R0 = new ArrayList();
        }
        boolean zIsEmpty = this.R0.isEmpty();
        TextView textView = this.f26279x;
        if (zIsEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f26281y, (Drawable) null);
        int size = this.R0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.R0.get(i10);
            lh.a aVar = new lh.a(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.f34899a);
            llVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new hh.z0(this, i10 + 10, 7));
        }
    }

    @Override
    public final void v() {
        gi giVar = this.f34900b;
        U(giVar != null && (giVar.f28635b0 instanceof org.telegram.ui.rn));
    }

    public final void v0() {
        gl glVar = this.A;
        if (glVar != null) {
            for (int i10 = 0; i10 < glVar.getChildCount(); i10++) {
                View childAt = glVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    ((org.telegram.ui.Cells.q5) childAt).f25053a.invalidate();
                }
            }
        }
    }

    public final void w0() {
        ArrayList arrayList;
        if (this.f34900b.f28635b0 instanceof org.telegram.ui.rn) {
            gl glVar = this.A;
            int childCount = glVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f26240p1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = glVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    MediaController.PhotoEntry photoEntryB0 = b0(((Integer) q5Var.getTag()).intValue());
                    if (photoEntryB0 != null) {
                        q5Var.setNum(arrayList.indexOf(Integer.valueOf(photoEntryB0.imageId)));
                    }
                }
                i10++;
            }
            gl glVar2 = this.f26270r;
            int childCount2 = glVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = glVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    MediaController.PhotoEntry photoEntryB1 = b0(((Integer) q5Var2.getTag()).intValue());
                    if (photoEntryB1 != null) {
                        q5Var2.setNum(arrayList.indexOf(Integer.valueOf(photoEntryB1.imageId)));
                    }
                }
            }
        }
    }

    @Override
    public final void x(int i10, boolean z10) {
        V();
        ql qlVar = this.L;
        if (qlVar != null) {
            qlVar.invalidateOutline();
            this.L.invalidate();
        }
    }

    public final void x0() {
        ArrayList arrayList;
        ul ulVar;
        HashMap map;
        gi giVar = this.f34900b;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        org.telegram.ui.ActionBar.n2 n2Var2 = giVar.f28635b0;
        if (n2Var instanceof org.telegram.ui.rn) {
            gl glVar = this.A;
            int childCount = glVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f26240p1;
                ulVar = this.C;
                map = f26239o1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = glVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    int iR = RecyclerView.R(childAt);
                    if (ulVar.f33116f && iR > this.I0) {
                        iR--;
                    }
                    if (ulVar.d && this.P0 == this.Q0) {
                        iR--;
                    }
                    MediaController.PhotoEntry photoEntryB0 = b0(iR);
                    q5Var.setHasSpoiler(photoEntryB0 != null && photoEntryB0.hasSpoiler);
                    q5Var.setHighQuality(photoEntryB0 != null && photoEntryB0.isHighQuality());
                    if ((n2Var2 instanceof org.telegram.ui.rn) && giVar.P1) {
                        q5Var.b(photoEntryB0 != null ? arrayList.indexOf(Integer.valueOf(photoEntryB0.imageId)) : -1, photoEntryB0 != null && map.containsKey(Integer.valueOf(photoEntryB0.imageId)), true);
                    } else {
                        q5Var.b(-1, photoEntryB0 != null && map.containsKey(Integer.valueOf(photoEntryB0.imageId)), true);
                    }
                }
                i10++;
            }
            gl glVar2 = this.f26270r;
            int childCount2 = glVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = glVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    int iR2 = RecyclerView.R(childAt2);
                    if (ulVar.f33116f && iR2 > this.I0) {
                        iR2--;
                    }
                    if (ulVar.d && this.P0 == this.Q0) {
                        iR2--;
                    }
                    MediaController.PhotoEntry photoEntryB1 = b0(iR2);
                    q5Var2.setHasSpoiler(photoEntryB1 != null && photoEntryB1.hasSpoiler);
                    q5Var2.setHighQuality(photoEntryB1 != null && photoEntryB1.isHighQuality());
                    if ((n2Var2 instanceof org.telegram.ui.rn) && giVar.P1) {
                        q5Var2.b(photoEntryB1 != null ? arrayList.indexOf(Integer.valueOf(photoEntryB1.imageId)) : -1, photoEntryB1 != null && map.containsKey(Integer.valueOf(photoEntryB1.imageId)), true);
                    } else {
                        q5Var2.b(-1, photoEntryB1 != null && map.containsKey(Integer.valueOf(photoEntryB1.imageId)), true);
                    }
                }
            }
        }
    }

    @Override
    public final void y() {
        ShutterButton shutterButton = this.f26254g0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.M0;
        ou0 ou0Var = ou0.f31410a;
        ou0 ou0Var2 = ou0.f31411b;
        if (z10) {
            if (this.L != null && shutterButton.getState() == ou0Var2) {
                shutterButton.a(ou0Var);
            }
            this.M0 = false;
            return;
        }
        if (this.L != null && shutterButton.getState() == ou0Var2) {
            l0();
            CameraController.getInstance().stopVideoRecording(this.L.getCameraSession(), false);
            shutterButton.a(ou0Var);
        }
        if (this.U) {
            a0(false);
        }
        d0(true);
    }

    public final void y0(boolean z10) {
        TextView textView = this.f26264l0;
        if (textView != null) {
            gi giVar = this.f34900b;
            int i10 = giVar.M0;
            TextView textView2 = giVar.f28651f1;
            if (i10 != 0 || giVar.P0 || giVar.D) {
                return;
            }
            HashMap map = f26239o1;
            Iterator it = map.entrySet().iterator();
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
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
            int iMax = Math.max(1, map.size());
            if (z11 && z12) {
                textView.setText(LocaleController.formatPluralString("Media", map.size(), new Object[0]).toUpperCase());
                if (iMax != this.I || z10) {
                    textView2.setText(LocaleController.formatPluralString("MediaSelected", iMax, new Object[0]));
                }
            } else if (z11) {
                textView.setText(LocaleController.formatPluralString("Videos", map.size(), new Object[0]).toUpperCase());
                if (iMax != this.I || z10) {
                    textView2.setText(LocaleController.formatPluralString("VideosSelected", iMax, new Object[0]));
                }
            } else {
                textView.setText(LocaleController.formatPluralString("Photos", map.size(), new Object[0]).toUpperCase());
                if (iMax != this.I || z10) {
                    textView2.setText(LocaleController.formatPluralString("PhotosSelected", iMax, new Object[0]));
                }
            }
            boolean z13 = iMax > 1;
            giVar.I = z13;
            giVar.f28660i1.setVisibility((!z13 || giVar.M0 == 2) ? 8 : 0);
            this.I = iMax;
        }
    }

    @Override
    public final void z(int i10, int i11) {
        int iD;
        int i12;
        this.N0 = true;
        int i13 = this.I0;
        if (AndroidUtilities.isTablet()) {
            this.I0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.I0 = 4;
            } else {
                this.I0 = 3;
            }
        }
        this.l1 = AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
        gl glVar = this.A;
        ((FrameLayout.LayoutParams) glVar.getLayoutParams()).topMargin = -this.l1;
        int iDp = (i10 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f);
        int i14 = this.I0;
        int i15 = iDp / i14;
        this.G0 = i15;
        if (this.H0 != i15 || i13 != i14) {
            this.H0 = i15;
            AndroidUtilities.runOnUIThread(new yk(this, 2));
        }
        this.B.y1(Math.max(1, ((this.I0 - 1) * AndroidUtilities.dp(2.0f)) + (this.G0 * this.I0)));
        ul ulVar = this.C;
        int iCeil = (int) Math.ceil((ulVar.h() - 1) / this.I0);
        if (this.L0) {
            iD = AndroidUtilities.dp(400.0f);
        } else {
            iD = org.telegram.messenger.y1.D(2.0f, iCeil - 1, this.G0 * iCeil);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int iB = org.telegram.messenger.y1.b(6.0f, (((i11 - iD) - currentActionBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(12.0f), 0);
        if (this.F != iB) {
            this.F = iB;
            ulVar.l();
        }
        if (AndroidUtilities.isTablet()) {
            i12 = (i11 / 5) * 2;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                i12 = (int) (i11 / 3.5f);
            } else {
                i12 = (i11 / 5) * 2;
            }
        }
        int iDp2 = ((i12 + currentActionBarHeight) - AndroidUtilities.dp(52.0f)) + this.l1;
        if (iDp2 < 0) {
            iDp2 = 0;
        }
        if (glVar.getPaddingTop() != iDp2 || glVar.getPaddingBottom() != this.f34902e) {
            glVar.setPadding(AndroidUtilities.dp(2.0f), iDp2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(48.0f) + this.f34902e);
        }
        this.f26279x.setTextSize(17.0f);
        this.N0 = false;
    }
}
