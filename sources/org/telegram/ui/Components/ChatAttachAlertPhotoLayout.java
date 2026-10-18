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
public class ChatAttachAlertPhotoLayout extends li implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f24073q1;
    public static final ArrayList f24074r1 = new ArrayList();
    public static final HashMap f24075s1 = new HashMap();
    public static final ArrayList f24076t1 = new ArrayList();
    public static int f24077u1 = -1;
    public float A0;
    public float B0;
    public boolean C0;
    public boolean D0;
    public final em E;
    public final Rect E0;
    public final di.k F;
    public float F0;
    public final sm G;
    public boolean G0;
    public final vz H;
    public boolean H0;
    public final km0 I;
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
    public om P;
    public boolean P0;
    public final pm Q;
    public boolean Q0;
    public final mm R;
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
    public float f24078a0;
    public final org.telegram.ui.ActionBar.e1 f24079a1;
    public boolean f24080b0;
    public final org.telegram.ui.ActionBar.e1 f24081b1;
    public boolean f24082c0;
    public final org.telegram.ui.ActionBar.e1 f24083c1;
    public boolean f24084d0;
    public final nc0 f24085d1;
    public float f24086e0;
    public final boolean f24087e1;
    public final int[] f24088f0;
    public final AnimationNotificationsLocker f24089f1;
    public int f24090g0;
    public boolean f24091g1;
    public bm f24092h0;
    public final im f24093h1;
    public final DecelerateInterpolator f24094i0;
    public boolean f24095i1;
    public final ah.x f24096j0;
    public float f24097j1;
    public final ShutterButton f24098k0;
    public float f24099k1;
    public final w91 f24100l0;
    public float l1;
    public AnimatorSet m0;
    public float f24101m1;
    public final boolean f24102n;
    public Runnable f24103n0;
    public float f24104n1;
    public Boolean f24105o0;
    public ViewPropertyAnimator f24106o1;
    public final TextView f24107p0;
    public int f24108p1;
    public final TextView f24109q0;
    public final em f24110r;
    public final ImageView f24111r0;
    public final hg.a0 f24112s;
    public boolean f24113s0;
    public boolean f24114t0;
    public boolean f24115u0;
    public final sm v;
    public boolean f24116v0;
    public final jm f24117w;
    public boolean f24118w0;
    public final TextView f24119x;
    public boolean f24120x0;
    public final Drawable f24121y;
    public boolean f24122y0;
    public boolean f24123z0;

    public ChatAttachAlertPhotoLayout(ti tiVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, tiVar);
        boolean z12;
        this.S = new ImageView[2];
        this.U = new float[2];
        this.V = new int[2];
        this.f24088f0 = new int[5];
        this.f24094i0 = new DecelerateInterpolator(1.5f);
        this.f24105o0 = null;
        this.E0 = new Rect();
        int dp = AndroidUtilities.dp(80.0f);
        this.K0 = dp;
        this.L0 = dp;
        this.M0 = 3;
        this.X0 = true;
        this.f24089f1 = new AnimationNotificationsLocker();
        this.f24093h1 = new im(this);
        this.f24087e1 = z10;
        this.f24102n = z11;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        org.telegram.ui.ActionBar.d3 container = tiVar.getContainer();
        ti tiVar2 = this.f28238b;
        if (tiVar2.T0 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f24091g1 = z12;
        jm jmVar = new jm(this, context, tiVar2.f30558a1.n(), d6Var, 0);
        this.f24117w = jmVar;
        jmVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = w7.z5.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = AndroidUtilities.statusBarHeight;
        this.f28238b.f30558a1.addView(jmVar, 0, d);
        jmVar.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f30288b;

            {
                this.f30288b = this;
            }

            @Override
            public final void onClick(View view) {
                om omVar;
                om omVar2;
                int i10 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30288b;
                switch (i10) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f24113s0 && (omVar = chatAttachAlertPhotoLayout.P) != null && omVar.isInited()) {
                            chatAttachAlertPhotoLayout.f24082c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24111r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new dm(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (omVar2 = chatAttachAlertPhotoLayout.P) != null && omVar2.isInited() && chatAttachAlertPhotoLayout.f24080b0) {
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
                                animatorSet.setInterpolator(bs.f25030f);
                                animatorSet.addListener(new ci.o3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f24117w.M(null, null);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f24119x = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.h6.f21092j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, this.f28237a));
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.f24121y = mutate;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, this.f28237a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        jmVar.addView(textView, w7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        U(false);
        nc0 nc0Var = new nc0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), d6Var);
        this.f24085d1 = nc0Var;
        nc0Var.a(!this.f28238b.f30564c0, false);
        this.f24083c1 = this.f28238b.f30568d1.e(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.f28238b.f30568d1.a(5);
        this.f28238b.f30568d1.e(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.Z0 = this.f28238b.f30568d1.e(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.f28238b.f30568d1.e(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.f28238b.f30568d1.a(6);
        this.Y0 = this.f28238b.f30568d1.e(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.f24079a1 = this.f28238b.f30568d1.e(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        org.telegram.ui.ActionBar.u0 u0Var = this.f28238b.f30568d1;
        u0Var.o();
        nc0Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        nc0Var.setTag(8);
        u0Var.f21728b.addView(nc0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nc0Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        nc0Var.setLayoutParams(layoutParams);
        nc0Var.setOnClickListener(new org.telegram.ui.ActionBar.a0(u0Var, 2));
        this.f24081b1 = this.f28238b.f30568d1.e(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.f28238b.f30568d1.setFitSubItems(true);
        em emVar = new em(this, context, d6Var, 1);
        this.E = emVar;
        emVar.setFastScrollEnabled(1);
        emVar.setFastScrollVisible(true);
        emVar.getFastScroll().setAlpha(0.0f);
        emVar.getFastScroll().f29335a = false;
        emVar.getFastScroll().f29346h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        sm smVar = new sm(this, context, z11);
        this.G = smVar;
        emVar.setAdapter(smVar);
        pm pmVar = new pm(this, emVar);
        this.Q = pmVar;
        emVar.i(pmVar);
        for (int i11 = 0; i11 < 8; i11++) {
            smVar.h.add(smVar.L());
        }
        emVar.setClipToPadding(false);
        emVar.setItemAnimator(null);
        emVar.setLayoutAnimation(null);
        emVar.setVerticalScrollBarEnabled(false);
        emVar.setGlowColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A5, this.f28237a));
        addView(emVar, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        emVar.setOnScrollListener(new ei.e9(this, 2));
        di.k kVar = new di.k(this, this.K0, 2);
        this.F = kVar;
        kVar.O = new ai.q1(this, 4);
        emVar.setLayoutManager(kVar);
        emVar.setOnItemClickListener(new ai.d4(this, z11, d6Var, 7));
        emVar.setOnItemLongClickListener(new tl(this, 3));
        km0 km0Var = new km0(new lm(this));
        this.I = km0Var;
        emVar.E.add(km0Var);
        this.f28239c = emVar;
        this.d = emVar;
        this.f28240f = true;
        vz vzVar = new vz(context, d6Var);
        this.H = vzVar;
        vzVar.setText(LocaleController.getString(R.string.NoPhotos));
        vzVar.setOnTouchListener(null);
        vzVar.setTextSize(16);
        addView(vzVar, w7.z5.c(-2.0f, -1));
        if (this.X0) {
            vzVar.b();
        } else {
            vzVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        mm mmVar = new mm(context, paint);
        this.R = mmVar;
        AndroidUtilities.updateViewVisibilityAnimated(mmVar, false, 1.0f, false);
        mmVar.setBackgroundResource(R.drawable.system);
        mmVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        mmVar.setTextSize(1, 15.0f);
        mmVar.setTypeface(AndroidUtilities.bold());
        mmVar.setAlpha(0.0f);
        mmVar.setTextColor(-1);
        mmVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(mmVar, w7.z5.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        ah.x xVar = new ah.x(this, context, 14);
        this.f24096j0 = xVar;
        xVar.setVisibility(8);
        xVar.setAlpha(0.0f);
        container.addView(xVar, w7.z5.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f24107p0 = textView2;
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
        container.addView(textView2, w7.z5.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f30288b;

            {
                this.f30288b = this;
            }

            @Override
            public final void onClick(View view) {
                om omVar;
                om omVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30288b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f24113s0 && (omVar = chatAttachAlertPhotoLayout.P) != null && omVar.isInited()) {
                            chatAttachAlertPhotoLayout.f24082c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24111r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new dm(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (omVar2 = chatAttachAlertPhotoLayout.P) != null && omVar2.isInited() && chatAttachAlertPhotoLayout.f24080b0) {
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
                                animatorSet.setInterpolator(bs.f25030f);
                                animatorSet.addListener(new ci.o3(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f24117w.M(null, null);
                        return;
                }
            }
        });
        w91 w91Var = new w91(context);
        this.f24100l0 = w91Var;
        w91Var.setVisibility(8);
        w91Var.setAlpha(0.0f);
        container.addView(w91Var, w7.z5.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        w91Var.setDelegate(new tl(this, 0));
        ?? view = new View(context);
        view.f24365b = new DecelerateInterpolator();
        view.f24371w = new org.telegram.ui.Cells.k7(view, 22);
        view.f24364a = view.getResources().getDrawable(R.drawable.camera_btn);
        Paint paint2 = new Paint(1);
        view.f24366c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f24367f = yv0.f32760a;
        this.f24098k0 = view;
        xVar.addView((View) view, w7.z5.e(84, 84, 17));
        view.setDelegate(new cm(this, d6Var, container));
        view.setFocusable(true);
        view.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.f24111r0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        xVar.addView(imageView, w7.z5.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f30288b;

            {
                this.f30288b = this;
            }

            @Override
            public final void onClick(View view2) {
                om omVar;
                om omVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30288b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f24113s0 && (omVar = chatAttachAlertPhotoLayout.P) != null && omVar.isInited()) {
                            chatAttachAlertPhotoLayout.f24082c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24111r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new dm(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (omVar2 = chatAttachAlertPhotoLayout.P) != null && omVar2.isInited() && chatAttachAlertPhotoLayout.f24080b0) {
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
                                animatorSet.setInterpolator(bs.f25030f);
                                animatorSet.addListener(new ci.o3(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f24117w.M(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i12 = 0; i12 < 2; i12++) {
            this.S[i12] = new ImageView(context);
            this.S[i12].setScaleType(ImageView.ScaleType.CENTER);
            this.S[i12].setVisibility(4);
            this.f24096j0.addView(this.S[i12], w7.z5.e(48, 48, 51));
            this.S[i12].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f30288b;

                {
                    this.f30288b = this;
                }

                @Override
                public final void onClick(View view2) {
                    om omVar;
                    om omVar2;
                    int i102 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30288b;
                    switch (i102) {
                        case 0:
                            if (chatAttachAlertPhotoLayout.P != null) {
                                chatAttachAlertPhotoLayout.j0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.f24113s0 && (omVar = chatAttachAlertPhotoLayout.P) != null && omVar.isInited()) {
                                chatAttachAlertPhotoLayout.f24082c0 = false;
                                chatAttachAlertPhotoLayout.P.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f24111r0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new dm(chatAttachAlertPhotoLayout));
                                duration.start();
                                return;
                            }
                            return;
                        case 2:
                            if (!chatAttachAlertPhotoLayout.T && (omVar2 = chatAttachAlertPhotoLayout.P) != null && omVar2.isInited() && chatAttachAlertPhotoLayout.f24080b0) {
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
                                    animatorSet.setInterpolator(bs.f25030f);
                                    animatorSet.addListener(new ci.o3(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            chatAttachAlertPhotoLayout.f24117w.M(null, null);
                            return;
                    }
                }
            });
            this.S[i12].setContentDescription("flash mode " + i12);
        }
        TextView textView3 = new TextView(context);
        this.f24109q0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(org.telegram.ui.Cells.c1.e(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.f24096j0.addView(textView3, w7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        em emVar2 = new em(this, context, d6Var, 0);
        this.f24110r = emVar2;
        emVar2.setVerticalScrollBarEnabled(true);
        sm smVar2 = new sm(this, context, false);
        this.v = smVar2;
        emVar2.setAdapter(smVar2);
        for (int i13 = 0; i13 < 8; i13++) {
            smVar2.h.add(smVar2.L());
        }
        emVar2.setClipToPadding(false);
        emVar2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        emVar2.setItemAnimator(null);
        emVar2.setLayoutAnimation(null);
        emVar2.setOverScrollMode(2);
        emVar2.setVisibility(4);
        emVar2.setAlpha(0.0f);
        container.addView(emVar2, w7.z5.c(80.0f, -1));
        hg.a0 a0Var = new hg.a0(0, false, 7);
        this.f24112s = a0Var;
        emVar2.setLayoutManager(a0Var);
        emVar2.setOnItemClickListener(new n7(1));
    }

    public static org.telegram.ui.Cells.s5 N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        em emVar = chatAttachAlertPhotoLayout.E;
        int childCount = emVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = emVar.getChildAt(i11);
            if (childAt.getTop() < emVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f28238b.n1() && (childAt instanceof org.telegram.ui.Cells.s5)) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                if (s5Var.getImageView().getTag() != null && ((Integer) s5Var.getImageView().getTag()).intValue() == i10) {
                    return s5Var;
                }
            }
        }
        return null;
    }

    public static int P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ti tiVar = chatAttachAlertPhotoLayout.f28238b;
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30574f0;
        if ((n2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) n2Var).R3 == 5) {
            return n2Var.getMessagesController().config.quickReplyMessagesLimit.get() - ((org.telegram.ui.sn) tiVar.f30574f0).f41386u6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static boolean S() {
        HashMap hashMap = f24075s1;
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
            ArrayList arrayList = f24076t1;
            if (i10 >= arrayList.size()) {
                break;
            }
            Object obj = f24075s1.get(arrayList.get(i10));
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
        HashMap hashMap = f24075s1;
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
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.f24108p1;
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
        ShutterButton shutterButton = this.f24098k0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.Q0;
        yv0 yv0Var = yv0.f32760a;
        yv0 yv0Var2 = yv0.f32761b;
        if (!z10) {
            if (this.P != null && shutterButton.getState() == yv0Var2) {
                l0();
                CameraController.getInstance().stopVideoRecording(this.P.getCameraSession(), false);
                shutterButton.a(yv0Var);
            }
            if (this.f24080b0) {
                a0(false);
            }
            d0(true);
            return;
        }
        if (this.P != null && shutterButton.getState() == yv0Var2) {
            shutterButton.a(yv0Var);
        }
        this.Q0 = false;
    }

    @Override
    public final void B(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.B(int, int):void");
    }

    @Override
    public final void C() {
        ti tiVar = this.f28238b;
        if (tiVar.isShowing() && !tiVar.isDismissed() && !PhotoViewer.t1().R1()) {
            U(false);
        }
    }

    @Override
    public final void D(int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.D(int):void");
    }

    @Override
    public final boolean F(int i10) {
        if (this.f24080b0) {
            if (i10 == 24 || i10 == 25 || i10 == 79 || i10 == 85) {
                ((cm) this.f24098k0.getDelegate()).a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void G(li liVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f24106o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f24117w.setVisibility(0);
        boolean z10 = liVar instanceof bn;
        TextView textView = this.f24119x;
        if (!z10) {
            Z();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(bs.f25033j);
            this.f24106o1 = interpolator;
            interpolator.start();
        }
        this.f28238b.f30558a1.setTitle("");
        this.F.h1(0, 0);
        if (z10) {
            this.E.post(new ee(17, this, liVar));
        }
        V();
        m0();
    }

    @Override
    public final void I() {
        this.N = false;
        om omVar = this.P;
        if (omVar != null) {
            omVar.setVisibility(0);
        }
        if (this.f24115u0) {
            this.f24115u0 = false;
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
        HashMap hashMap = f24075s1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f24076t1;
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
                this.f24093h1.X(i10);
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
        om omVar = this.P;
        if (omVar != null) {
            if (!this.f24080b0) {
                omVar.setTranslationX(this.U[0]);
            }
            int i10 = this.K0;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2);
            if (!this.f24080b0) {
                this.P.setClipTop((int) this.W);
                this.P.setClipBottom((int) this.f24078a0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                if (layoutParams.height != dp || layoutParams.width != i10) {
                    layoutParams.width = i10;
                    layoutParams.height = dp;
                    this.P.setLayoutParams(layoutParams);
                    AndroidUtilities.runOnUIThread(new ee(18, this, layoutParams));
                }
            }
        }
    }

    public final void U(boolean z10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z11;
        sm smVar;
        ti tiVar = this.f28238b;
        boolean z12 = tiVar.V;
        org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f30574f0;
        if (!z12 && this.f24102n) {
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
                } else {
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
                }
                if ((z13 != this.N0 || z14 != this.O0) && (smVar = this.G) != null) {
                    smVar.l();
                }
                if (!tiVar.V && tiVar.isShowing() && this.N0 && tiVar.getBackDrawable().getAlpha() != 0 && !this.f24080b0) {
                    s0();
                }
            }
        }
    }

    public final void V() {
        s4.b1 K;
        float[] fArr;
        int i10;
        float f7;
        int systemWindowInsetTop;
        if (!PhotoViewer.D1() || PhotoViewer.t1().p5 == null || !PhotoViewer.t1().p5.V) {
            om omVar = this.P;
            if (omVar != null) {
                omVar.invalidateOutline();
            }
            em emVar = this.E;
            s4.b1 K2 = emVar.K(this.M0 - 1);
            if (K2 != null) {
                K2.f45910a.invalidateOutline();
            }
            if ((!this.G.d || !this.N0 || this.T0 != this.U0) && (K = emVar.K(0)) != null) {
                K.f45910a.invalidateOutline();
            }
            om omVar2 = this.P;
            if (omVar2 != null) {
                omVar2.invalidate();
            }
            mm mmVar = this.R;
            if (mmVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mmVar.getLayoutParams();
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
            int childCount = emVar.getChildCount();
            int i11 = 0;
            while (true) {
                fArr = this.U;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = emVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.l5) {
                    if (childAt.isAttachedToWindow()) {
                        float y3 = getY() + emVar.getY() + childAt.getY();
                        ti tiVar = this.f28238b;
                        ViewGroup sheetContainer = tiVar.getSheetContainer();
                        xh xhVar = tiVar.B1;
                        ah.v vVar = tiVar.R0;
                        float y10 = sheetContainer.getY() + y3;
                        float x10 = (tiVar.getSheetContainer().getX() + (getX() + (emVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                        if (!tiVar.f30577g0) {
                            i10 = AndroidUtilities.statusBarHeight;
                        } else {
                            i10 = 0;
                        }
                        float alpha = (vVar.getAlpha() * vVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
                        ei.i iVar = tiVar.E2;
                        if (iVar != null && iVar.g()) {
                            alpha = Math.max(alpha, (tiVar.E2.e() + tiVar.E2.getY()) - tiVar.f30602o2);
                        }
                        if (y3 < alpha) {
                            f7 = alpha - y3;
                        } else {
                            f7 = 0.0f;
                        }
                        if (f7 != this.W) {
                            this.W = f7;
                            om omVar3 = this.P;
                            if (omVar3 != null) {
                                omVar3.invalidateOutline();
                                this.P.invalidate();
                            }
                        }
                        float translationY = (int) (xhVar.getTranslationY() + (tiVar.getSheetContainer().getMeasuredHeight() - xhVar.getMeasuredHeight()));
                        ei.i iVar2 = tiVar.E2;
                        if (iVar2 != null) {
                            translationY -= iVar2.d() - AndroidUtilities.dp(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y3 > translationY) {
                            this.f24078a0 = Math.min(-AndroidUtilities.dp(5.0f), y3 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.f24078a0 = 0.0f;
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
                om omVar4 = this.P;
                if (omVar4 != null) {
                    omVar4.invalidateOutline();
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
            HashMap hashMap = f24075s1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f24076t1;
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
        boolean z10 = this.f24118w0;
        org.telegram.ui.ActionBar.d6 d6Var = this.f28237a;
        ti tiVar = this.f28238b;
        if (!z10 && photoEntry.isVideo) {
            if (!tiVar.c1()) {
                org.telegram.messenger.lk.q(R.string.GlobalAttachVideoRestricted, new xc(tiVar.f30621u1, d6Var), null);
                return true;
            }
        } else if (!this.f24120x0 && !photoEntry.isVideo) {
            if (!tiVar.c1()) {
                org.telegram.messenger.lk.q(R.string.GlobalAttachPhotoRestricted, new xc(tiVar.f30621u1, d6Var), null);
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
        this.f28238b.f30568d1.K(1);
        HashMap hashMap = f24075s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((MediaController.PhotoEntry) entry.getValue()).reset();
            }
            hashMap.clear();
            f24076t1.clear();
        }
        ArrayList arrayList = f24074r1;
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
            ArrayList arrayList = f24076t1;
            if (i10 < arrayList.size()) {
                if (i10 == 0) {
                    Object obj = arrayList.get(i10);
                    HashMap hashMap = f24075s1;
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
        om omVar;
        if (!this.f24113s0 && this.P != null) {
            int i10 = this.K0;
            int[] iArr = this.f24088f0;
            iArr[1] = i10;
            iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
            Runnable runnable = this.f24103n0;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.f24103n0 = null;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20928a7, this.f28237a)) > 0.721d) {
                z11 = true;
            } else {
                z11 = false;
            }
            ti tiVar = this.f28238b;
            AndroidUtilities.setLightNavigationBar(tiVar, z11);
            TextView textView = this.f24107p0;
            em emVar = this.f24110r;
            ah.x xVar = this.f24096j0;
            em emVar2 = this.E;
            ImageView[] imageViewArr = this.S;
            w91 w91Var = this.f24100l0;
            if (z10) {
                this.f24097j1 = this.P.getTranslationY();
                this.f24084d0 = true;
                if (emVar2 != null) {
                    emVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(xVar, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(w91Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(emVar, property, 0.0f));
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
                this.f24089f1.lock();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(bs.f25030f);
                animatorSet.addListener(new gm(this, 2));
                animatorSet.start();
            } else {
                this.f24095i1 = false;
                tiVar.getWindow().clearFlags(128);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                xVar.setAlpha(0.0f);
                xVar.setVisibility(8);
                w91Var.setAlpha(0.0f);
                w91Var.setTag(null);
                w91Var.setVisibility(8);
                emVar.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                emVar.setVisibility(8);
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
                this.f24080b0 = false;
                om omVar2 = this.P;
                if (omVar2 != null) {
                    omVar2.setFpsLimit(30);
                    this.P.setSystemUiVisibility(1024);
                }
                if (emVar2 != null) {
                    emVar2.invalidate();
                }
            }
            om omVar3 = this.P;
            if (omVar3 != null) {
                omVar3.setImportantForAccessibility(0);
            }
            emVar2.setImportantForAccessibility(0);
            if (!LiteMode.isEnabled(360928) && (omVar = this.P) != null) {
                omVar.showTexture(false, z10);
            }
        }
    }

    @Override
    public final boolean b() {
        return !this.f24080b0;
    }

    public final MediaController.PhotoEntry b0(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = f24074r1;
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
        for (Map.Entry entry : f24075s1.entrySet()) {
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
        boolean z10 = this.f24087e1;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.h6.f21065hg;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21092j5;
        }
        int i14 = org.telegram.ui.ActionBar.h6.f20968c7;
        org.telegram.ui.ActionBar.d6 d6Var = this.f28237a;
        this.H.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A5, d6Var);
        em emVar = this.E;
        emVar.setGlowColor(w02);
        emVar.K(0);
        this.f24119x.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        if (z10) {
            i11 = org.telegram.ui.ActionBar.h6.f21065hg;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.E8;
        }
        int w03 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        jm jmVar = this.f24117w;
        jmVar.G(w03, false);
        if (z10) {
            i12 = org.telegram.ui.ActionBar.h6.f21065hg;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.E8;
        }
        jmVar.G(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), true);
        if (z10) {
            i13 = org.telegram.ui.ActionBar.h6.f21103jg;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.G8;
        }
        jmVar.B(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        org.telegram.ui.ActionBar.h6.x1(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), this.f24121y);
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
            AndroidUtilities.runOnUIThread(new wl(this, 0), 300L);
            this.f24082c0 = false;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ti tiVar;
        if (i10 == NotificationCenter.albumsDidLoad) {
            sm smVar = this.G;
            if (smVar != null) {
                if (q0()) {
                    this.U0 = MediaController.allMediaAlbumEntry;
                } else {
                    this.U0 = MediaController.allPhotosAlbumEntry;
                }
                if (this.T0 != null && ((tiVar = this.f28238b) == null || !tiVar.G)) {
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
                smVar.l();
                this.v.l();
                ArrayList arrayList = f24076t1;
                if (!arrayList.isEmpty() && this.U0 != null) {
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        Integer num = (Integer) arrayList.get(i14);
                        HashMap hashMap = f24075s1;
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
            findActivity = this.f28238b.f30574f0.getParentActivity();
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
        ArrayList<Object> arrayList = f24074r1;
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
        return this.f24086e0;
    }

    @Override
    public int getCurrentItemTop() {
        em emVar = this.E;
        int childCount = emVar.getChildCount();
        vz vzVar = this.H;
        if (childCount <= 0) {
            emVar.setTopGlowOffset(emVar.getPaddingTop());
            vzVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = emVar.getChildAt(0);
        sl0 sl0Var = (sl0) emVar.G(childAt);
        int top = childAt.getTop() - this.f24108p1;
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || sl0Var == null || sl0Var.b() != 0) {
            top = dp;
        }
        vzVar.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - vzVar.getMeasuredHeight()) / 2.0f) + top);
        emVar.setTopGlowOffset(top);
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
        return f24076t1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f24075s1;
    }

    public int getSelectedPhotosCount() {
        int i10 = 0;
        for (Object obj : f24075s1.values()) {
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
        for (Object obj : f24075s1.values()) {
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
        return f24076t1;
    }

    public long getStarsPrice() {
        Iterator it = f24075s1.entrySet().iterator();
        if (it.hasNext()) {
            return ((MediaController.PhotoEntry) ((Map.Entry) it.next()).getValue()).starsAmount;
        }
        return 0L;
    }

    public final void h0(boolean z10) {
        om omVar;
        if (this.P != null && this.O == null) {
            ti tiVar = this.f28238b;
            if (!tiVar.isDismissed()) {
                this.P.initTexture();
                boolean q02 = q0();
                TextView textView = this.f24109q0;
                int i10 = 0;
                if (q02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f24074r1.isEmpty();
                em emVar = this.f24110r;
                TextView textView2 = this.f24107p0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    emVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    emVar.setVisibility(0);
                }
                if (tiVar.o1().v && isFocusable()) {
                    tiVar.o1().d();
                }
                w91 w91Var = this.f24100l0;
                w91Var.setVisibility(0);
                w91Var.setAlpha(0.0f);
                ah.x xVar = this.f24096j0;
                xVar.setVisibility(0);
                xVar.setTag(null);
                int[] iArr = this.f24088f0;
                iArr[0] = 0;
                int i11 = this.K0;
                iArr[1] = i11;
                iArr[2] = AndroidUtilities.dp(2.0f) + (i11 * 2);
                this.f24097j1 = 0.0f;
                this.f24095i1 = true;
                om omVar2 = this.P;
                if (omVar2 != null) {
                    omVar2.setFpsLimit(-1);
                }
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.setLightNavigationBar((Dialog) tiVar, false);
                tiVar.getWindow().addFlags(128);
                em emVar2 = this.E;
                ImageView[] imageViewArr = this.S;
                if (z10) {
                    setCameraOpenProgress(0.0f);
                    this.f24084d0 = true;
                    if (emVar2 != null) {
                        emVar2.invalidate();
                    }
                    this.f24089f1.lock();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(xVar, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(emVar, property, 1.0f));
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
                    animatorSet.setInterpolator(bs.f25030f);
                    animatorSet.addListener(new gm(this, 1));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    xVar.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    emVar.setAlpha(1.0f);
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
                    tiVar.f30566c2.J();
                    om omVar3 = this.P;
                    if (omVar3 != null) {
                        omVar3.setSystemUiVisibility(1028);
                    }
                }
                this.f24080b0 = true;
                om omVar4 = this.P;
                if (omVar4 != null) {
                    omVar4.setImportantForAccessibility(2);
                }
                emVar2.setImportantForAccessibility(4);
                emVar2.invalidate();
                if (!LiteMode.isEnabled(360928) && (omVar = this.P) != null && omVar.isInited()) {
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
        ti tiVar = this.f28238b;
        ri riVar = tiVar.f30566c2;
        if (riVar != null) {
            riVar.b0(0, false, true, 0, 0, 0L, tiVar.u1(), false, 0L);
        }
    }

    public final void j0(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        int i10;
        org.telegram.ui.sn snVar;
        org.telegram.ui.sn snVar2;
        ArrayList<Object> arrayList;
        int i11;
        ArrayList arrayList2 = f24074r1;
        ti tiVar = this.f28238b;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            f24075s1.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            f24076t1.add(Integer.valueOf(photoEntry.imageId));
            tiVar.Z1(0);
            this.G.l();
            this.v.l();
        }
        if (photoEntry != null && !z11 && arrayList2.size() > 1) {
            y0(false);
            if (this.P != null) {
                this.f24100l0.b(0.0f, false);
                this.B0 = 0.0f;
                this.P.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f24114t0 = true;
            org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30574f0;
            org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f30574f0;
            if (n2Var == null) {
                n2Var = LaunchActivity.R();
            }
            if (n2Var != null) {
                PhotoViewer.t1().K2(n2Var.getParentActivity(), null, this.f28237a);
                PhotoViewer.t1().L2(tiVar);
                PhotoViewer t12 = PhotoViewer.t1();
                int i12 = tiVar.V1;
                boolean z12 = tiVar.W1;
                t12.h = i12;
                t12.f33343n = z12;
                if (tiVar.F && tiVar.G) {
                    snVar = (org.telegram.ui.sn) n2Var2;
                    i10 = 11;
                } else {
                    if (tiVar.T0 != 0) {
                        i10 = 1;
                    } else if (n2Var2 instanceof org.telegram.ui.sn) {
                        snVar = (org.telegram.ui.sn) n2Var2;
                        i10 = 2;
                    } else {
                        i10 = 5;
                    }
                    snVar = null;
                }
                boolean z13 = tiVar.H;
                if (z13) {
                    i10 = 13;
                    snVar2 = null;
                } else {
                    snVar2 = snVar;
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
                c50 c50Var = tiVar.Q;
                if (c50Var != null && photoEntry != null) {
                    c50Var.e = photoEntry.isVideo;
                }
                PhotoViewer.t1().g2(arrayList3, i11, i13, false, new fm(this, z10), snVar2);
                PhotoViewer.t1().x2(tiVar.Q);
                if (tiVar.G) {
                    PhotoViewer.t1().Y0(null, null, false, tiVar.J);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void l(float f7) {
        this.W0 = f7;
        V();
        om omVar = this.P;
        if (omVar != null) {
            omVar.invalidateOutline();
            this.P.invalidate();
        }
        invalidate();
    }

    public final void l0() {
        if (this.f28238b.V) {
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.S[i10].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(bs.f25030f).start();
        }
        ViewPropertyAnimator duration = this.f24111r0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        bs bsVar = bs.f25030f;
        duration.setInterpolator(bsVar).start();
        this.f24109q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
        AndroidUtilities.updateViewVisibilityAnimated(this.R, false);
        AndroidUtilities.cancelRunOnUIThread(this.f24092h0);
        this.f24092h0 = null;
        AndroidUtilities.unlockOrientation(AndroidUtilities.findActivity(getContext()));
    }

    public final void m0() {
        try {
            U(false);
            if (this.P != null) {
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean n(MotionEvent motionEvent) {
        om omVar;
        if (!this.f24084d0) {
            if (this.f24080b0 && motionEvent != null) {
                boolean z10 = this.G0;
                w91 w91Var = this.f24100l0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.E0;
                    w91Var.getHitRect(rect);
                    if (w91Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f24113s0 && !this.I0) {
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
                    em emVar = this.f24110r;
                    TextView textView = this.f24107p0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.S;
                    ah.x xVar = this.f24096j0;
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
                                w91Var.b(this.B0, false);
                                this.f28238b.getSheetContainer().invalidate();
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
                            } else if (this.I0 && (omVar = this.P) != null) {
                                omVar.setTranslationY(omVar.getTranslationY() + f7);
                                this.F0 = y3;
                                w91Var.setTag(null);
                                Runnable runnable = this.f24103n0;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.f24103n0 = null;
                                }
                                if (xVar.getTag() == null) {
                                    xVar.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(xVar, property, 0.0f), ObjectAnimator.ofFloat(w91Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(emVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(bs.f25030f);
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
                            om omVar2 = this.P;
                            if (omVar2 != null) {
                                if (Math.abs(omVar2.getTranslationY()) > this.P.getMeasuredHeight() / 6.0f) {
                                    a0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.P, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(xVar, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(emVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f24094i0);
                                animatorSet2.start();
                                xVar.setTag(null);
                                return true;
                            }
                        } else {
                            om omVar3 = this.P;
                            if (omVar3 != null && !this.D0) {
                                int[] iArr = this.V;
                                omVar3.getLocationOnScreen(iArr);
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
        if (this.f24082c0) {
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
    public final void o() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.cameraInitied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (this.S0 != i14) {
            this.S0 = i14;
            sm smVar = this.G;
            if (smVar != null) {
                smVar.l();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        V();
    }

    @Override
    public final boolean p() {
        if (this.f24084d0) {
            return true;
        }
        if (this.f24080b0) {
            a0(true);
            return true;
        }
        d0(true);
        return false;
    }

    public final void p0(int i10, final boolean z10) {
        PhotoViewer t12 = PhotoViewer.t1();
        if (i10 == -1) {
            i10 = t12.P4;
        }
        ArrayList arrayList = t12.f33290g7;
        if (arrayList != null && !arrayList.isEmpty() && i10 < arrayList.size() && (arrayList.get(i10) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) arrayList.get(i10)).hasSpoiler) {
            final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
            this.E.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z11 = ChatAttachAlertPhotoLayout.f24073q1;
                    if (view instanceof org.telegram.ui.Cells.s5) {
                        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                        if (s5Var.getPhotoEntry() == photoEntry) {
                            s5Var.c(z10, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z12 = true;
                            if (ChatAttachAlertPhotoLayout.f24075s1.size() <= 1) {
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
    public final void q(int i10) {
        boolean z10;
        if (i10 != 0 && i10 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        d0(z10);
    }

    public final boolean q0() {
        if (!this.f24122y0) {
            ti tiVar = this.f28238b;
            if (!tiVar.F) {
                if (!(tiVar.f30574f0 instanceof org.telegram.ui.sn) && !tiVar.W0 && tiVar.T0 != 2) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void r0(g9 g9Var, TLRPC.VideoSize videoSize, long j10) {
        boolean z10;
        ti tiVar = this.f28238b;
        e9 e9Var = new e9(tiVar.U, tiVar.Q);
        c50 c50Var = tiVar.Q;
        if (c50Var != null && c50Var.f25087c == 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        e9Var.Q = z10;
        tiVar.f30574f0.presentFragment(e9Var);
        if (g9Var != null) {
            e9Var.m0(g9Var);
        }
        if (videoSize != null) {
            e9Var.l0(videoSize);
        }
        if (j10 != 0) {
            e9Var.k0(j10);
        }
        e9Var.I = new q2(9, this, e9Var);
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
        om omVar = this.P;
        if (omVar != null) {
            omVar.setVisibility(8);
        }
        for (Map.Entry entry : f24075s1.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.G.l();
    }

    public final void s0() {
        boolean z10;
        boolean z11;
        float f7;
        ti tiVar = this.f28238b;
        if (!tiVar.f30585i2 && this.f24116v0 && CameraView.isCameraAllowed()) {
            if (this.P == null) {
                boolean z12 = !LiteMode.isEnabled(360928);
                Context context = getContext();
                Boolean bool = this.f24105o0;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = tiVar.X1;
                }
                om omVar = new om(this, context, z10, z12);
                this.P = omVar;
                org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30574f0;
                if ((n2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) n2Var).x()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                omVar.setRecordFile(AndroidUtilities.generateVideoPath(z11));
                this.P.setFocusable(true);
                this.P.setFpsLimit(30);
                this.P.setOutlineProvider(new dh.b(this, 1));
                this.P.setClipToOutline(true);
                this.P.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                org.telegram.ui.ActionBar.d3 container = tiVar.getContainer();
                om omVar2 = this.P;
                int i10 = this.K0;
                container.addView(omVar2, 1, new FrameLayout.LayoutParams(i10, i10));
                this.P.setDelegate(new hm(this));
                om omVar3 = this.P;
                if (this.f24116v0) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.2f;
                }
                omVar3.setAlpha(f7);
                this.P.setEnabled(this.f24116v0);
                if (this.N) {
                    this.P.setVisibility(8);
                }
                if (!this.f24080b0) {
                    V();
                }
                em emVar = this.E;
                if (emVar != null) {
                    emVar.invalidate();
                }
                invalidate();
            }
            w91 w91Var = this.f24100l0;
            if (w91Var != null) {
                w91Var.b(0.0f, false);
                this.B0 = 0.0f;
            }
            if (!this.f24080b0) {
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
        this.f24086e0 = f7;
        int[] iArr = this.f24088f0;
        float f10 = iArr[1];
        float f11 = iArr[2];
        int i12 = AndroidUtilities.displaySize.x;
        ti tiVar = this.f28238b;
        float width = (tiVar.getContainer().getWidth() - tiVar.getLeftInset()) - tiVar.getRightInset();
        float height = tiVar.getContainer().getHeight();
        float[] fArr = this.U;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = this.f24097j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
        float textureHeight = this.P.getTextureHeight(f10, f11) / this.P.getTextureHeight(width, height);
        float f15 = f11 / height;
        float f16 = f10 / width;
        if (this.f24095i1) {
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
            this.f24099k1 = f20 - this.P.getTranslationY();
            this.l1 = (height * f7) + (((f13 + f11) * f17) - this.P.getTranslationY());
            this.f24104n1 = f19 - this.P.getTranslationX();
            this.f24101m1 = (width * f7) + (((f12 + f10) * f17) - this.P.getTranslationX());
        } else {
            i10 = (int) f10;
            i11 = (int) f11;
            this.P.getTextureView().setScaleX(1.0f);
            this.P.getTextureView().setScaleY(1.0f);
            this.f24099k1 = 0.0f;
            this.l1 = height;
            this.f24104n1 = 0.0f;
            this.f24101m1 = width;
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
        this.f24115u0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.f24122y0 = z10;
    }

    public void setStarsPrice(long j10) {
        boolean z10;
        HashMap hashMap = f24075s1;
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
        if (W(false)) {
            x0();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        ti tiVar = this.f28238b;
        if (tiVar.getSheetAnimationType() == 1) {
            float f10 = (f7 / 40.0f) * (-0.1f);
            em emVar = this.E;
            int childCount = emVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = emVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    float f11 = 1.0f + f10;
                    s5Var.getCheckBox().setScaleX(f11);
                    s5Var.getCheckBox().setScaleY(f11);
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
        em emVar = this.E;
        int childCount = emVar.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (emVar.getChildAt(i10) instanceof org.telegram.ui.Cells.l5) {
                n0();
                break;
            } else {
                this.Q.g();
                i10++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f24106o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f24119x.animate().alpha(0.0f).setDuration(150L).setInterpolator(bs.f25033j).withEndAction(new wl(this, 1));
        this.f24106o1 = withEndAction;
        withEndAction.start();
        k0();
    }

    public final void t0(boolean z10) {
        Integer num;
        float f7;
        w91 w91Var = this.f24100l0;
        if ((w91Var.getTag() != null && z10) || (w91Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f24103n0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wl wlVar = new wl(this, 3);
                this.f24103n0 = wlVar;
                AndroidUtilities.runOnUIThread(wlVar, 2000L);
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
        w91Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.m0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(w91Var, View.ALPHA, f7));
        this.m0.addListener(new gm(this, 0));
        this.m0.start();
        if (z10) {
            wl wlVar2 = new wl(this, 4);
            this.f24103n0 = wlVar2;
            AndroidUtilities.runOnUIThread(wlVar2, 2000L);
        }
    }

    public final void u0() {
        ArrayList<MediaController.AlbumEntry> arrayList;
        jm jmVar = this.f24117w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jmVar.f21728b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f24116v0) {
            if (q0()) {
                arrayList = MediaController.allMediaAlbums;
            } else {
                arrayList = MediaController.allPhotoAlbums;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.V0 = arrayList2;
            Collections.sort(arrayList2, new zl(arrayList, 0));
        } else {
            this.V0 = new ArrayList();
        }
        boolean isEmpty = this.V0.isEmpty();
        TextView textView = this.f24119x;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f24121y, (Drawable) null);
        int size = this.V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.V0.get(i10);
            ei.a aVar = new ei.a(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.f28237a);
            jmVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.n1(this, i10 + 10, 10));
        }
    }

    @Override
    public final void v(float f7) {
        om omVar = this.P;
        if (omVar != null) {
            omVar.setAlpha(f7);
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i10 != 0 && this.P.getVisibility() != 0) {
                this.P.setVisibility(0);
            } else if (i10 == 0 && this.P.getVisibility() != 4) {
                this.P.setVisibility(4);
            }
        }
    }

    public final void v0() {
        em emVar = this.E;
        if (emVar != null) {
            for (int i10 = 0; i10 < emVar.getChildCount(); i10++) {
                View childAt = emVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    ((org.telegram.ui.Cells.s5) childAt).f22999a.invalidate();
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
        ti tiVar = this.f28238b;
        if (i10 == 8) {
            tiVar.K1(!tiVar.f30564c0, true);
            this.f24085d1.a(!tiVar.f30564c0, true);
        } else if ((i10 == 0 || i10 == 1) && tiVar.V1 > 0 && f24076t1.size() > 1 && (m12 = tiVar.m1()) != null && !ChatObject.hasAdminRights(m12) && m12.slowmode_enabled) {
            f5.N(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.f28237a).o();
        } else {
            org.telegram.ui.ActionBar.d6 d6Var = this.f28237a;
            HashMap hashMap = f24075s1;
            if (i10 == 0) {
                MessageObject messageObject = tiVar.K1;
                org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30574f0;
                if (messageObject == null && (n2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) n2Var).c()) {
                    f5.L(getContext(), ((org.telegram.ui.sn) n2Var).a(), new tl(this, 1), d6Var);
                } else {
                    f5.Z(tiVar.M1, tiVar.l1() + hashMap.size(), tiVar.p1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f31040b;

                        {
                            this.f31040b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31040b;
                            Long l4 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f24073q1;
                                    ti tiVar2 = chatAttachAlertPhotoLayout.f28238b;
                                    tiVar2.a1();
                                    tiVar2.f30566c2.b0(7, false, true, 0, 0, 0L, tiVar2.u1(), false, l4.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f24073q1;
                                    ti tiVar3 = chatAttachAlertPhotoLayout.f28238b;
                                    tiVar3.a1();
                                    tiVar3.f30566c2.b0(4, true, true, 0, 0, 0L, tiVar3.u1(), false, l4.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i10 == 1) {
                MessageObject messageObject2 = tiVar.K1;
                org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f30574f0;
                if (messageObject2 == null && (n2Var2 instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) n2Var2).c()) {
                    f5.L(getContext(), ((org.telegram.ui.sn) n2Var2).a(), new tl(this, 2), d6Var);
                } else {
                    f5.Z(tiVar.M1, tiVar.l1() + hashMap.size(), tiVar.p1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f31040b;

                        {
                            this.f31040b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31040b;
                            Long l4 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f24073q1;
                                    ti tiVar2 = chatAttachAlertPhotoLayout.f28238b;
                                    tiVar2.a1();
                                    tiVar2.f30566c2.b0(7, false, true, 0, 0, 0L, tiVar2.u1(), false, l4.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f24073q1;
                                    ti tiVar3 = chatAttachAlertPhotoLayout.f28238b;
                                    tiVar3.a1();
                                    tiVar3.f30566c2.b0(4, true, true, 0, 0, 0L, tiVar3.u1(), false, l4.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                sm smVar = this.G;
                em emVar = this.E;
                if (i10 == 3) {
                    bn bnVar = tiVar.f30606q0;
                    if (bnVar != null) {
                        bnVar.N();
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
                        public final ChatAttachAlertPhotoLayout f31310b;

                        {
                            this.f31310b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z14 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31310b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f24073q1;
                                    ti tiVar2 = chatAttachAlertPhotoLayout.f28238b;
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
                                        tiVar2.f30568d1.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            tiVar2.f30568d1.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    tiVar2.f30568d1.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        tiVar2.f30568d1.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.e1 e1Var2 = chatAttachAlertPhotoLayout.f24079a1;
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
                    emVar.M(new xl(0, arrayList, z13));
                    if (tiVar.B0 != this) {
                        smVar.l();
                    }
                    bn bnVar2 = tiVar.f30606q0;
                    if (bnVar2 != null) {
                        bnVar2.v.invalidate();
                    }
                } else if (i10 == 2) {
                    bn bnVar3 = tiVar.f30606q0;
                    if (bnVar3 != null) {
                        bnVar3.N();
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
                        public final ChatAttachAlertPhotoLayout f31310b;

                        {
                            this.f31310b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z142 = z14;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f31310b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f24073q1;
                                    ti tiVar2 = chatAttachAlertPhotoLayout.f28238b;
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
                                        tiVar2.f30568d1.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            tiVar2.f30568d1.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    tiVar2.f30568d1.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        tiVar2.f30568d1.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.e1 e1Var2 = chatAttachAlertPhotoLayout.f24079a1;
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
                    emVar.M(new xl(1, arrayList2, z14));
                    if (tiVar.B0 != this) {
                        smVar.l();
                    }
                    bn bnVar4 = tiVar.f30606q0;
                    if (bnVar4 != null) {
                        bnVar4.v.invalidate();
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
                            int i11 = tiVar.T0;
                            org.telegram.ui.ActionBar.n2 n2Var3 = tiVar.f30574f0;
                            if (i11 != 0) {
                                n2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                n2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i12 = tiVar.T0;
                            org.telegram.ui.ActionBar.n2 n2Var4 = tiVar.f30574f0;
                            if (i12 != 0) {
                                n2Var4.startActivityForResult(intent3, 14);
                            } else {
                                n2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        tiVar.dismiss(true);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (i10 == 7) {
                    if (tiVar.B0 == tiVar.f30606q0) {
                        z12 = false;
                    }
                    tiVar.d2(z12);
                } else if (i10 == 9) {
                    ai.md.h1(getContext(), getStarsPrice(), true, new d(this, 6), this.f28237a);
                } else if (i10 >= 10) {
                    MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.V0.get(i10 - 10);
                    this.T0 = albumEntry;
                    MediaController.AlbumEntry albumEntry2 = this.U0;
                    TextView textView = this.f24119x;
                    if (albumEntry == albumEntry2) {
                        textView.setText(LocaleController.getString(R.string.ChatGallery));
                    } else {
                        textView.setText(albumEntry.bucketName);
                    }
                    smVar.l();
                    this.v.l();
                    this.F.h1(0, -(emVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void w0() {
        ArrayList arrayList;
        if (this.f28238b.f30574f0 instanceof org.telegram.ui.sn) {
            em emVar = this.E;
            int childCount = emVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f24076t1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = emVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    MediaController.PhotoEntry b02 = b0(((Integer) s5Var.getTag()).intValue());
                    if (b02 != null) {
                        s5Var.setNum(arrayList.indexOf(Integer.valueOf(b02.imageId)));
                    }
                }
                i10++;
            }
            em emVar2 = this.f24110r;
            int childCount2 = emVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = emVar2.getChildAt(i11);
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
        boolean z10;
        ti tiVar = this.f28238b;
        if (tiVar != null && (tiVar.f30574f0 instanceof org.telegram.ui.sn)) {
            z10 = true;
        } else {
            z10 = false;
        }
        U(z10);
    }

    public final void x0() {
        ArrayList arrayList;
        sm smVar;
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
        ti tiVar = this.f28238b;
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30574f0;
        org.telegram.ui.ActionBar.n2 n2Var2 = tiVar.f30574f0;
        if (n2Var instanceof org.telegram.ui.sn) {
            em emVar = this.E;
            int childCount = emVar.getChildCount();
            int i11 = 0;
            while (true) {
                arrayList = f24076t1;
                smVar = this.G;
                hashMap = f24075s1;
                int i12 = -1;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = emVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (smVar.f30290f && R > this.M0) {
                        R--;
                    }
                    if (smVar.d && this.T0 == this.U0) {
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
                    if ((n2Var2 instanceof org.telegram.ui.sn) && tiVar.W1) {
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
            em emVar2 = this.f24110r;
            int childCount2 = emVar2.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = emVar2.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (smVar.f30290f && R2 > this.M0) {
                        R2--;
                    }
                    if (smVar.d && this.T0 == this.U0) {
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
                    if ((n2Var2 instanceof org.telegram.ui.sn) && tiVar.W1) {
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

    public final void y0(boolean z10) {
        boolean z11;
        TextView textView = this.f24107p0;
        if (textView != null) {
            ti tiVar = this.f28238b;
            int i10 = tiVar.T0;
            TextView textView2 = tiVar.f30594m1;
            if (i10 == 0 && !tiVar.W0 && !tiVar.H) {
                HashMap hashMap = f24075s1;
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
                tiVar.f30604p1.setVisibility((!z11 || tiVar.T0 == 2) ? 8 : 8);
                this.M = max;
            }
        }
    }

    @Override
    public final void z(int i10, boolean z10) {
        V();
        om omVar = this.P;
        if (omVar != null) {
            omVar.invalidateOutline();
            this.P.invalidate();
        }
    }
}
