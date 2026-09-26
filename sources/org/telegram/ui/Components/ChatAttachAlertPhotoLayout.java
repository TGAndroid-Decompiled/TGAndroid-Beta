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
public class ChatAttachAlertPhotoLayout extends oi implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f22120q1;
    public static final ArrayList f22121r1 = new ArrayList();
    public static final HashMap f22122s1 = new HashMap();
    public static final ArrayList f22123t1 = new ArrayList();
    public static int f22124u1 = -1;
    public float A0;
    public float B0;
    public boolean C0;
    public boolean D0;
    public final ul E;
    public final Rect E0;
    public final bi.l F;
    public float F0;
    public final im G;
    public boolean G0;
    public final nz H;
    public boolean H0;
    public final yl0 I;
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
    public em P;
    public boolean P0;
    public final fm Q;
    public boolean Q0;
    public final cm R;
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
    public float f22125a0;
    public final org.telegram.ui.ActionBar.e1 f22126a1;
    public boolean f22127b0;
    public final org.telegram.ui.ActionBar.e1 f22128b1;
    public boolean f22129c0;
    public final org.telegram.ui.ActionBar.e1 f22130c1;
    public boolean f22131d0;
    public final ec0 f22132d1;
    public float f22133e0;
    public final boolean f22134e1;
    public final int[] f22135f0;
    public final AnimationNotificationsLocker f22136f1;
    public int f22137g0;
    public boolean f22138g1;
    public rl f22139h0;
    public final yl f22140h1;
    public final DecelerateInterpolator f22141i0;
    public boolean f22142i1;
    public final ai.f0 f22143j0;
    public float f22144j1;
    public final ShutterButton f22145k0;
    public float f22146k1;
    public final q91 f22147l0;
    public float l1;
    public AnimatorSet m0;
    public float f22148m1;
    public final boolean f22149n;
    public Runnable f22150n0;
    public float f22151n1;
    public Boolean f22152o0;
    public ViewPropertyAnimator f22153o1;
    public final TextView f22154p0;
    public int f22155p1;
    public final TextView f22156q0;
    public final ul f22157r;
    public final ImageView f22158r0;
    public final gg.b0 f22159s;
    public boolean f22160s0;
    public boolean f22161t0;
    public boolean f22162u0;
    public final im v;
    public boolean f22163v0;
    public final zl f22164w;
    public boolean f22165w0;
    public final TextView f22166x;
    public boolean f22167x0;
    public final Drawable f22168y;
    public boolean f22169y0;
    public boolean f22170z0;

    public ChatAttachAlertPhotoLayout(wi wiVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, wiVar);
        boolean z12;
        this.S = new ImageView[2];
        this.U = new float[2];
        this.V = new int[2];
        this.f22135f0 = new int[5];
        this.f22141i0 = new DecelerateInterpolator(1.5f);
        this.f22152o0 = null;
        this.E0 = new Rect();
        int dp = AndroidUtilities.dp(80.0f);
        this.K0 = dp;
        this.L0 = dp;
        this.M0 = 3;
        this.X0 = true;
        this.f22136f1 = new AnimationNotificationsLocker();
        this.f22140h1 = new yl(this);
        this.f22134e1 = z10;
        this.f22149n = z11;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.cameraInitied);
        org.telegram.ui.ActionBar.c3 container = wiVar.getContainer();
        wi wiVar2 = this.f27087b;
        if (wiVar2.Q0 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f22138g1 = z12;
        zl zlVar = new zl(this, context, wiVar2.X0.n(), d6Var, 0);
        this.f22164w = zlVar;
        zlVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = w7.y5.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = AndroidUtilities.statusBarHeight;
        this.f27087b.X0.addView(zlVar, 0, d);
        zlVar.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f25107b;

            {
                this.f25107b = this;
            }

            @Override
            public final void onClick(View view) {
                em emVar;
                em emVar2;
                int i10 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25107b;
                switch (i10) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f22160s0 && (emVar = chatAttachAlertPhotoLayout.P) != null && emVar.isInited()) {
                            chatAttachAlertPhotoLayout.f22129c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22158r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new tl(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (emVar2 = chatAttachAlertPhotoLayout.P) != null && emVar2.isInited() && chatAttachAlertPhotoLayout.f22127b0) {
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
                                animatorSet.setInterpolator(rr.f28030f);
                                animatorSet.addListener(new ai.y4(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f22164w.M(null, null);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f22166x = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.h6.f19165j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, this.f27086a));
        textView.setText(LocaleController.getString(R.string.ChatGallery));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.f22168y = mutate;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, this.f27086a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        zlVar.addView(textView, w7.y5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        U(false);
        ec0 ec0Var = new ec0(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), d6Var);
        this.f22132d1 = ec0Var;
        ec0Var.a(!this.f27087b.f29995c0, false);
        this.f22130c1 = this.f27087b.f29989a1.e(7, R.drawable.msg_view_file, LocaleController.getString(R.string.AttachMediaPreviewButton));
        this.f27087b.f29989a1.a(5);
        this.f27087b.f29989a1.e(4, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.Z0 = this.f27087b.f29989a1.e(1, R.drawable.msg_filehq, LocaleController.getString(R.string.SendWithoutCompression));
        this.f27087b.f29989a1.e(0, R.drawable.msg_ungroup, LocaleController.getString(R.string.SendWithoutGrouping));
        this.f27087b.f29989a1.a(6);
        this.Y0 = this.f27087b.f29989a1.e(3, R.drawable.msg_spoiler, LocaleController.getString(R.string.EnablePhotoSpoiler));
        this.f22126a1 = this.f27087b.f29989a1.e(2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.SendInHighQuality));
        org.telegram.ui.ActionBar.u0 u0Var = this.f27087b.f29989a1;
        u0Var.o();
        ec0Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        ec0Var.setTag(8);
        u0Var.f19788b.addView(ec0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ec0Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        ec0Var.setLayoutParams(layoutParams);
        ec0Var.setOnClickListener(new org.telegram.ui.ActionBar.a0(u0Var, 2));
        this.f22128b1 = this.f27087b.f29989a1.e(9, R.drawable.menu_feature_paid, LocaleController.getString(R.string.PaidMediaButton));
        this.f27087b.f29989a1.setFitSubItems(true);
        ul ulVar = new ul(this, context, d6Var, 1);
        this.E = ulVar;
        ulVar.setFastScrollEnabled(1);
        ulVar.setFastScrollVisible(true);
        ulVar.getFastScroll().setAlpha(0.0f);
        ulVar.getFastScroll().f23650a = false;
        ulVar.getFastScroll().f23661h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        im imVar = new im(this, context, z11);
        this.G = imVar;
        ulVar.setAdapter(imVar);
        fm fmVar = new fm(this, ulVar);
        this.Q = fmVar;
        ulVar.i(fmVar);
        for (int i11 = 0; i11 < 8; i11++) {
            imVar.h.add(imVar.L());
        }
        ulVar.setClipToPadding(false);
        ulVar.setItemAnimator(null);
        ulVar.setLayoutAnimation(null);
        ulVar.setVerticalScrollBarEnabled(false);
        ulVar.setGlowColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A5, this.f27086a));
        addView(ulVar, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        ulVar.setOnScrollListener(new ci.s9(this, 2));
        bi.l lVar = new bi.l(this, this.K0, 2);
        this.F = lVar;
        lVar.O = new ci.x1(this, 3);
        ulVar.setLayoutManager(lVar);
        ulVar.setOnItemClickListener(new com.google.firebase.messaging.i(this, z11, d6Var, 7));
        ulVar.setOnItemLongClickListener(new jl(this, 3));
        yl0 yl0Var = new yl0(new bm(this));
        this.I = yl0Var;
        ulVar.E.add(yl0Var);
        this.f27088c = ulVar;
        this.d = ulVar;
        this.f27089f = true;
        nz nzVar = new nz(context, d6Var);
        this.H = nzVar;
        nzVar.setText(LocaleController.getString(R.string.NoPhotos));
        nzVar.setOnTouchListener(null);
        nzVar.setTextSize(16);
        addView(nzVar, w7.y5.c(-2.0f, -1));
        if (this.X0) {
            nzVar.b();
        } else {
            nzVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        cm cmVar = new cm(context, paint);
        this.R = cmVar;
        AndroidUtilities.updateViewVisibilityAnimated(cmVar, false, 1.0f, false);
        cmVar.setBackgroundResource(R.drawable.system);
        cmVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        cmVar.setTextSize(1, 15.0f);
        cmVar.setTypeface(AndroidUtilities.bold());
        cmVar.setAlpha(0.0f);
        cmVar.setTextColor(-1);
        cmVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        container.addView(cmVar, w7.y5.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        ai.f0 f0Var = new ai.f0(this, context, 10);
        this.f22143j0 = f0Var;
        f0Var.setVisibility(8);
        f0Var.setAlpha(0.0f);
        container.addView(f0Var, w7.y5.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f22154p0 = textView2;
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
        container.addView(textView2, w7.y5.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f25107b;

            {
                this.f25107b = this;
            }

            @Override
            public final void onClick(View view) {
                em emVar;
                em emVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25107b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f22160s0 && (emVar = chatAttachAlertPhotoLayout.P) != null && emVar.isInited()) {
                            chatAttachAlertPhotoLayout.f22129c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22158r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new tl(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (emVar2 = chatAttachAlertPhotoLayout.P) != null && emVar2.isInited() && chatAttachAlertPhotoLayout.f22127b0) {
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
                                animatorSet.setInterpolator(rr.f28030f);
                                animatorSet.addListener(new ai.y4(chatAttachAlertPhotoLayout, view, imageView, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f22164w.M(null, null);
                        return;
                }
            }
        });
        q91 q91Var = new q91(context);
        this.f22147l0 = q91Var;
        q91Var.setVisibility(8);
        q91Var.setAlpha(0.0f);
        container.addView(q91Var, w7.y5.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        q91Var.setDelegate(new jl(this, 0));
        ?? view = new View(context);
        view.f22412b = new DecelerateInterpolator();
        view.f22418w = new org.telegram.ui.Cells.t6(view, 24);
        view.f22411a = view.getResources().getDrawable(R.drawable.camera_btn);
        Paint paint2 = new Paint(1);
        view.f22413c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f22414f = pv0.f27437a;
        this.f22145k0 = view;
        f0Var.addView((View) view, w7.y5.e(84, 84, 17));
        view.setDelegate(new sl(this, d6Var, container));
        view.setFocusable(true);
        view.setContentDescription(LocaleController.getString(R.string.AccDescrShutter));
        ImageView imageView = new ImageView(context);
        this.f22158r0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        f0Var.addView(imageView, w7.y5.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f25107b;

            {
                this.f25107b = this;
            }

            @Override
            public final void onClick(View view2) {
                em emVar;
                em emVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25107b;
                switch (i102) {
                    case 0:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.j0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.f22160s0 && (emVar = chatAttachAlertPhotoLayout.P) != null && emVar.isInited()) {
                            chatAttachAlertPhotoLayout.f22129c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22158r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new tl(chatAttachAlertPhotoLayout));
                            duration.start();
                            return;
                        }
                        return;
                    case 2:
                        if (!chatAttachAlertPhotoLayout.T && (emVar2 = chatAttachAlertPhotoLayout.P) != null && emVar2.isInited() && chatAttachAlertPhotoLayout.f22127b0) {
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
                                animatorSet.setInterpolator(rr.f28030f);
                                animatorSet.addListener(new ai.y4(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        chatAttachAlertPhotoLayout.f22164w.M(null, null);
                        return;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        for (int i12 = 0; i12 < 2; i12++) {
            this.S[i12] = new ImageView(context);
            this.S[i12].setScaleType(ImageView.ScaleType.CENTER);
            this.S[i12].setVisibility(4);
            this.f22143j0.addView(this.S[i12], w7.y5.e(48, 48, 51));
            this.S[i12].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f25107b;

                {
                    this.f25107b = this;
                }

                @Override
                public final void onClick(View view2) {
                    em emVar;
                    em emVar2;
                    int i102 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25107b;
                    switch (i102) {
                        case 0:
                            if (chatAttachAlertPhotoLayout.P != null) {
                                chatAttachAlertPhotoLayout.j0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.f22160s0 && (emVar = chatAttachAlertPhotoLayout.P) != null && emVar.isInited()) {
                                chatAttachAlertPhotoLayout.f22129c0 = false;
                                chatAttachAlertPhotoLayout.P.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f22158r0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new tl(chatAttachAlertPhotoLayout));
                                duration.start();
                                return;
                            }
                            return;
                        case 2:
                            if (!chatAttachAlertPhotoLayout.T && (emVar2 = chatAttachAlertPhotoLayout.P) != null && emVar2.isInited() && chatAttachAlertPhotoLayout.f22127b0) {
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
                                    animatorSet.setInterpolator(rr.f28030f);
                                    animatorSet.addListener(new ai.y4(chatAttachAlertPhotoLayout, view2, imageView2, 3));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            chatAttachAlertPhotoLayout.f22164w.M(null, null);
                            return;
                    }
                }
            });
            ImageView imageView2 = this.S[i12];
            imageView2.setContentDescription("flash mode " + i12);
        }
        TextView textView3 = new TextView(context);
        this.f22156q0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setShadowLayer(org.telegram.ui.Cells.c1.c(3.33333f, R.string.TapForVideo, textView3), 0.0f, AndroidUtilities.dp(0.666f), 1275068416);
        textView3.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.f22143j0.addView(textView3, w7.y5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        ul ulVar2 = new ul(this, context, d6Var, 0);
        this.f22157r = ulVar2;
        ulVar2.setVerticalScrollBarEnabled(true);
        im imVar2 = new im(this, context, false);
        this.v = imVar2;
        ulVar2.setAdapter(imVar2);
        for (int i13 = 0; i13 < 8; i13++) {
            imVar2.h.add(imVar2.L());
        }
        ulVar2.setClipToPadding(false);
        ulVar2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ulVar2.setItemAnimator(null);
        ulVar2.setLayoutAnimation(null);
        ulVar2.setOverScrollMode(2);
        ulVar2.setVisibility(4);
        ulVar2.setAlpha(0.0f);
        container.addView(ulVar2, w7.y5.c(80.0f, -1));
        gg.b0 b0Var = new gg.b0(0, false, 7);
        this.f22159s = b0Var;
        ulVar2.setLayoutManager(b0Var);
        ulVar2.setOnItemClickListener(new m7(1));
    }

    public static void K(org.telegram.ui.Components.ChatAttachAlertPhotoLayout r25, boolean r26, org.telegram.ui.ActionBar.d6 r27, android.view.View r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.K(org.telegram.ui.Components.ChatAttachAlertPhotoLayout, boolean, org.telegram.ui.ActionBar.d6, android.view.View, int):void");
    }

    public static org.telegram.ui.Cells.t5 L(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        ul ulVar = chatAttachAlertPhotoLayout.E;
        int childCount = ulVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ulVar.getChildAt(i11);
            if (childAt.getTop() < ulVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f27087b.l1() && (childAt instanceof org.telegram.ui.Cells.t5)) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (t5Var.getImageView().getTag() != null && ((Integer) t5Var.getImageView().getTag()).intValue() == i10) {
                    return t5Var;
                }
            }
        }
        return null;
    }

    public static int N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        wi wiVar = chatAttachAlertPhotoLayout.f27087b;
        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
        if ((m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).R3 == 5) {
            return m2Var.getMessagesController().config.quickReplyMessagesLimit.get() - ((org.telegram.ui.wn) wiVar.f30005f0).f39662u6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static void O(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        wi wiVar = chatAttachAlertPhotoLayout.f27087b;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                wiVar.f30005f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 4);
            } else if (i10 >= 23) {
                wiVar.f30005f0.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            }
        } catch (Exception unused) {
        }
    }

    public static void P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        wi wiVar = chatAttachAlertPhotoLayout.f27087b;
        if (Build.VERSION.SDK_INT >= 23 && f0.e.b(wiVar.f30005f0.getParentActivity(), "android.permission.CAMERA") != 0) {
            try {
                wiVar.f30005f0.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 18);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        chatAttachAlertPhotoLayout.i0();
    }

    public static boolean S() {
        HashMap hashMap = f22122s1;
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
            ArrayList arrayList = f22123t1;
            if (i10 >= arrayList.size()) {
                break;
            }
            Object obj = f22122s1.get(arrayList.get(i10));
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
        HashMap hashMap = f22122s1;
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
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(7.0f) + this.f22155p1;
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
    public final void A(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.A(int):void");
    }

    @Override
    public final boolean B(int i10) {
        if (this.f22127b0) {
            if (i10 == 24 || i10 == 25 || i10 == 79 || i10 == 85) {
                ((sl) this.f22145k0.getDelegate()).b();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void E(oi oiVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f22153o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f22164w.setVisibility(0);
        boolean z10 = oiVar instanceof rm;
        TextView textView = this.f22166x;
        if (!z10) {
            Z();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(rr.f28033j);
            this.f22153o1 = interpolator;
            interpolator.start();
        }
        this.f27087b.X0.setTitle("");
        this.F.h1(0, 0);
        if (z10) {
            this.E.post(new kd(16, this, oiVar));
        }
        V();
        m0();
    }

    @Override
    public final void F() {
        this.N = false;
        em emVar = this.P;
        if (emVar != null) {
            emVar.setVisibility(0);
        }
        if (this.f22162u0) {
            this.f22162u0 = false;
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
        HashMap hashMap = f22122s1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f22123t1;
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
                this.f22140h1.W(i10);
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
        em emVar = this.P;
        if (emVar != null) {
            if (!this.f22127b0) {
                emVar.setTranslationX(this.U[0]);
            }
            int i10 = this.K0;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2);
            if (!this.f22127b0) {
                this.P.setClipTop((int) this.W);
                this.P.setClipBottom((int) this.f22125a0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                if (layoutParams.height != dp || layoutParams.width != i10) {
                    layoutParams.width = i10;
                    layoutParams.height = dp;
                    this.P.setLayoutParams(layoutParams);
                    AndroidUtilities.runOnUIThread(new kd(17, this, layoutParams));
                }
            }
        }
    }

    public final void U(boolean z10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z11;
        im imVar;
        wi wiVar = this.f27087b;
        boolean z12 = wiVar.V;
        org.telegram.ui.ActionBar.m2 m2Var2 = wiVar.f30005f0;
        if (!z12 && this.f22149n) {
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
                } else if (Build.VERSION.SDK_INT >= 23) {
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
                } else {
                    if (z10 || SharedConfig.hasCameraCache) {
                        CameraController.getInstance().initCamera(null);
                    }
                    this.N0 = CameraController.getInstance().isCameraInitied();
                }
                if ((z13 != this.N0 || z14 != this.O0) && (imVar = this.G) != null) {
                    imVar.l();
                }
                if (!wiVar.V && wiVar.isShowing() && this.N0 && wiVar.getBackDrawable().getAlpha() != 0 && !this.f22127b0) {
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
        cm cmVar;
        int systemWindowInsetTop;
        if (!PhotoViewer.C1() || PhotoViewer.t1().p5 == null || !PhotoViewer.t1().p5.V) {
            em emVar = this.P;
            if (emVar != null) {
                emVar.invalidateOutline();
            }
            ul ulVar = this.E;
            s4.c1 K2 = ulVar.K(this.M0 - 1);
            if (K2 != null) {
                K2.f42960a.invalidateOutline();
            }
            if ((!this.G.d || !this.N0 || this.T0 != this.U0) && (K = ulVar.K(0)) != null) {
                K.f42960a.invalidateOutline();
            }
            em emVar2 = this.P;
            if (emVar2 != null) {
                emVar2.invalidate();
            }
            if (Build.VERSION.SDK_INT >= 23 && (cmVar = this.R) != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cmVar.getLayoutParams();
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
            int childCount = ulVar.getChildCount();
            int i11 = 0;
            while (true) {
                fArr = this.U;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = ulVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.m5) {
                    if (childAt.isAttachedToWindow()) {
                        float y3 = getY() + ulVar.getY() + childAt.getY();
                        wi wiVar = this.f27087b;
                        ViewGroup sheetContainer = wiVar.getSheetContainer();
                        zh zhVar = wiVar.f30067y1;
                        ci.m6 m6Var = wiVar.O0;
                        float y10 = sheetContainer.getY() + y3;
                        float x10 = wiVar.getSheetContainer().getX() + getX() + ulVar.getX() + childAt.getX();
                        if (Build.VERSION.SDK_INT >= 23) {
                            x10 -= getRootWindowInsets().getSystemWindowInsetLeft();
                        }
                        if (!wiVar.f30008g0) {
                            i10 = AndroidUtilities.statusBarHeight;
                        } else {
                            i10 = 0;
                        }
                        float alpha = (m6Var.getAlpha() * m6Var.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
                        ci.i iVar = wiVar.B2;
                        if (iVar != null && iVar.g()) {
                            alpha = Math.max(alpha, (wiVar.B2.e() + wiVar.B2.getY()) - wiVar.f30024l2);
                        }
                        if (y3 < alpha) {
                            f7 = alpha - y3;
                        } else {
                            f7 = 0.0f;
                        }
                        if (f7 != this.W) {
                            this.W = f7;
                            em emVar3 = this.P;
                            if (emVar3 != null) {
                                emVar3.invalidateOutline();
                                this.P.invalidate();
                            }
                        }
                        float translationY = (int) (zhVar.getTranslationY() + (wiVar.getSheetContainer().getMeasuredHeight() - zhVar.getMeasuredHeight()));
                        ci.i iVar2 = wiVar.B2;
                        if (iVar2 != null) {
                            translationY -= iVar2.d() - AndroidUtilities.dp(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y3 > translationY) {
                            this.f22125a0 = Math.min(-AndroidUtilities.dp(5.0f), y3 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.f22125a0 = 0.0f;
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
                em emVar4 = this.P;
                if (emVar4 != null) {
                    emVar4.invalidateOutline();
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
            HashMap hashMap = f22122s1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f22123t1;
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
        boolean z10 = this.f22165w0;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27086a;
        wi wiVar = this.f27087b;
        if (!z10 && photoEntry.isVideo) {
            if (!wiVar.a1()) {
                org.telegram.messenger.ok.p(R.string.GlobalAttachVideoRestricted, new xc(wiVar.f30042r1, d6Var), null);
                return true;
            }
        } else if (!this.f22167x0 && !photoEntry.isVideo) {
            if (!wiVar.a1()) {
                org.telegram.messenger.ok.p(R.string.GlobalAttachPhotoRestricted, new xc(wiVar.f30042r1, d6Var), null);
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
        org.telegram.ui.ActionBar.e1 e1Var = this.Y0;
        e1Var.setText(string);
        e1Var.setAnimatedIcon(R.raw.photo_spoiler);
        this.f27087b.f29989a1.K(1);
        HashMap hashMap = f22122s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((MediaController.PhotoEntry) entry.getValue()).reset();
            }
            hashMap.clear();
            f22123t1.clear();
        }
        ArrayList arrayList = f22121r1;
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
            ArrayList arrayList = f22123t1;
            if (i10 < arrayList.size()) {
                if (i10 == 0) {
                    Object obj = arrayList.get(i10);
                    HashMap hashMap = f22122s1;
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
        em emVar;
        if (!this.f22160s0 && this.P != null) {
            int i10 = this.K0;
            int[] iArr = this.f22135f0;
            iArr[1] = i10;
            iArr[2] = AndroidUtilities.dp(2.0f) + (i10 * 2);
            Runnable runnable = this.f22150n0;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.f22150n0 = null;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19003a7, this.f27086a)) > 0.721d) {
                z11 = true;
            } else {
                z11 = false;
            }
            wi wiVar = this.f27087b;
            AndroidUtilities.setLightNavigationBar(wiVar, z11);
            TextView textView = this.f22154p0;
            ul ulVar = this.f22157r;
            ai.f0 f0Var = this.f22143j0;
            ul ulVar2 = this.E;
            ImageView[] imageViewArr = this.S;
            q91 q91Var = this.f22147l0;
            if (z10) {
                this.f22144j1 = this.P.getTranslationY();
                this.f22131d0 = true;
                if (ulVar2 != null) {
                    ulVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(f0Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(q91Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ulVar, property, 0.0f));
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
                this.f22136f1.lock();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(rr.f28030f);
                animatorSet.addListener(new wl(this, 2));
                animatorSet.start();
            } else {
                this.f22142i1 = false;
                wiVar.getWindow().clearFlags(128);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                f0Var.setAlpha(0.0f);
                f0Var.setVisibility(8);
                q91Var.setAlpha(0.0f);
                q91Var.setTag(null);
                q91Var.setVisibility(8);
                ulVar.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                ulVar.setVisibility(8);
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
                this.f22127b0 = false;
                em emVar2 = this.P;
                if (emVar2 != null) {
                    emVar2.setFpsLimit(30);
                    this.P.setSystemUiVisibility(1024);
                }
                if (ulVar2 != null) {
                    ulVar2.invalidate();
                }
            }
            em emVar3 = this.P;
            if (emVar3 != null) {
                emVar3.setImportantForAccessibility(0);
            }
            ulVar2.setImportantForAccessibility(0);
            if (!LiteMode.isEnabled(360928) && (emVar = this.P) != null) {
                emVar.showTexture(false, z10);
            }
        }
    }

    @Override
    public final boolean b() {
        return !this.f22127b0;
    }

    public final MediaController.PhotoEntry b0(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = f22121r1;
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
        for (Map.Entry entry : f22122s1.entrySet()) {
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
        boolean z10 = this.f22134e1;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.h6.f19138hg;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f19165j5;
        }
        int i14 = org.telegram.ui.ActionBar.h6.f19042c7;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27086a;
        this.H.setTextColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A5, d6Var);
        ul ulVar = this.E;
        ulVar.setGlowColor(v02);
        ulVar.K(0);
        this.f22166x.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        if (z10) {
            i11 = org.telegram.ui.ActionBar.h6.f19138hg;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.E8;
        }
        int v03 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        zl zlVar = this.f22164w;
        zlVar.G(v03, false);
        if (z10) {
            i12 = org.telegram.ui.ActionBar.h6.f19138hg;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.E8;
        }
        zlVar.G(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), true);
        if (z10) {
            i13 = org.telegram.ui.ActionBar.h6.f19176jg;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.G8;
        }
        zlVar.B(org.telegram.ui.ActionBar.h6.v0(i13, d6Var));
        org.telegram.ui.ActionBar.h6.w1(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), this.f22168y);
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
            AndroidUtilities.runOnUIThread(new ml(this, 0), 300L);
            this.f22129c0 = false;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        wi wiVar;
        if (i10 == NotificationCenter.albumsDidLoad) {
            im imVar = this.G;
            if (imVar != null) {
                if (q0()) {
                    this.U0 = MediaController.allMediaAlbumEntry;
                } else {
                    this.U0 = MediaController.allPhotosAlbumEntry;
                }
                if (this.T0 != null && ((wiVar = this.f27087b) == null || !wiVar.G)) {
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
                imVar.l();
                this.v.l();
                ArrayList arrayList = f22123t1;
                if (!arrayList.isEmpty() && this.U0 != null) {
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        Integer num = (Integer) arrayList.get(i14);
                        HashMap hashMap = f22122s1;
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
            findActivity = this.f27087b.f30005f0.getParentActivity();
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
        ArrayList<Object> arrayList = f22121r1;
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
        return this.f22133e0;
    }

    @Override
    public int getCurrentItemTop() {
        ul ulVar = this.E;
        int childCount = ulVar.getChildCount();
        nz nzVar = this.H;
        if (childCount <= 0) {
            ulVar.setTopGlowOffset(ulVar.getPaddingTop());
            nzVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = ulVar.getChildAt(0);
        gl0 gl0Var = (gl0) ulVar.G(childAt);
        int top = childAt.getTop() - this.f22155p1;
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || gl0Var == null || gl0Var.b() != 0) {
            top = dp;
        }
        nzVar.setTranslationY(((((getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f)) - nzVar.getMeasuredHeight()) / 2.0f) + top);
        ulVar.setTopGlowOffset(top);
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
        return f22123t1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f22122s1;
    }

    public int getSelectedPhotosCount() {
        int i10 = 0;
        for (Object obj : f22122s1.values()) {
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
        for (Object obj : f22122s1.values()) {
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
        return f22123t1;
    }

    public long getStarsPrice() {
        Iterator it = f22122s1.entrySet().iterator();
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
        em emVar;
        if (this.P != null && this.O == null) {
            wi wiVar = this.f27087b;
            if (!wiVar.isDismissed()) {
                this.P.initTexture();
                boolean q02 = q0();
                TextView textView = this.f22156q0;
                int i10 = 0;
                if (q02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f22121r1.isEmpty();
                ul ulVar = this.f22157r;
                TextView textView2 = this.f22154p0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    ulVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    ulVar.setVisibility(0);
                }
                if (wiVar.m1().v && isFocusable()) {
                    wiVar.m1().d();
                }
                q91 q91Var = this.f22147l0;
                q91Var.setVisibility(0);
                q91Var.setAlpha(0.0f);
                ai.f0 f0Var = this.f22143j0;
                f0Var.setVisibility(0);
                f0Var.setTag(null);
                int[] iArr = this.f22135f0;
                iArr[0] = 0;
                int i11 = this.K0;
                iArr[1] = i11;
                iArr[2] = AndroidUtilities.dp(2.0f) + (i11 * 2);
                this.f22144j1 = 0.0f;
                this.f22142i1 = true;
                em emVar2 = this.P;
                if (emVar2 != null) {
                    emVar2.setFpsLimit(-1);
                }
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.setLightNavigationBar((Dialog) wiVar, false);
                wiVar.getWindow().addFlags(128);
                ul ulVar2 = this.E;
                ImageView[] imageViewArr = this.S;
                if (z10) {
                    setCameraOpenProgress(0.0f);
                    this.f22131d0 = true;
                    if (ulVar2 != null) {
                        ulVar2.invalidate();
                    }
                    this.f22136f1.lock();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(f0Var, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(ulVar, property, 1.0f));
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
                    animatorSet.setInterpolator(rr.f28030f);
                    animatorSet.addListener(new wl(this, 1));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    f0Var.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    ulVar.setAlpha(1.0f);
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
                    wiVar.Z1.K0();
                    em emVar3 = this.P;
                    if (emVar3 != null) {
                        emVar3.setSystemUiVisibility(1028);
                    }
                }
                this.f22127b0 = true;
                em emVar4 = this.P;
                if (emVar4 != null) {
                    emVar4.setImportantForAccessibility(2);
                }
                ulVar2.setImportantForAccessibility(4);
                ulVar2.invalidate();
                if (!LiteMode.isEnabled(360928) && (emVar = this.P) != null && emVar.isInited()) {
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
        wi wiVar = this.f27087b;
        ui uiVar = wiVar.Z1;
        if (uiVar != null) {
            uiVar.B1(0, false, true, 0, 0, 0L, wiVar.s1(), false, 0L);
        }
    }

    @Override
    public final void j() {
        V();
        invalidate();
    }

    public final void j0(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        int i10;
        org.telegram.ui.wn wnVar;
        int i11;
        org.telegram.ui.wn wnVar2;
        ArrayList<Object> arrayList;
        int i12;
        ArrayList arrayList2 = f22121r1;
        wi wiVar = this.f27087b;
        if (photoEntry != null) {
            arrayList2.add(photoEntry);
            f22122s1.put(Integer.valueOf(photoEntry.imageId), photoEntry);
            f22123t1.add(Integer.valueOf(photoEntry.imageId));
            wiVar.V1(0);
            this.G.l();
            this.v.l();
        }
        if (photoEntry != null && !z11 && arrayList2.size() > 1) {
            y0(false);
            if (this.P != null) {
                this.f22147l0.b(0.0f, false);
                this.B0 = 0.0f;
                this.P.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f22161t0 = true;
            org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
            org.telegram.ui.ActionBar.m2 m2Var2 = wiVar.f30005f0;
            if (m2Var == null) {
                m2Var = LaunchActivity.R();
            }
            if (m2Var != null) {
                PhotoViewer.t1().J2(m2Var.getParentActivity(), null, this.f27086a);
                PhotoViewer.t1().K2(wiVar);
                PhotoViewer t12 = PhotoViewer.t1();
                int i13 = wiVar.S1;
                boolean z12 = wiVar.T1;
                t12.h = i13;
                t12.f31299n = z12;
                if (wiVar.F && wiVar.G) {
                    wnVar = (org.telegram.ui.wn) m2Var2;
                    i10 = 11;
                } else if (wiVar.Q0 != 0) {
                    wnVar = null;
                    i10 = 1;
                } else if (m2Var2 instanceof org.telegram.ui.wn) {
                    wnVar = (org.telegram.ui.wn) m2Var2;
                    i10 = 2;
                } else {
                    i10 = 5;
                    wnVar = null;
                }
                boolean z13 = wiVar.H;
                if (z13) {
                    wnVar2 = null;
                    i11 = 13;
                } else {
                    i11 = i10;
                    wnVar2 = wnVar;
                }
                if (wiVar.Q0 == 0 && !z13) {
                    arrayList = getAllPhotosArray();
                    i12 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(photoEntry);
                    i12 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                t40 t40Var = wiVar.Q;
                if (t40Var != null && photoEntry != null) {
                    t40Var.e = photoEntry.isVideo;
                }
                PhotoViewer.t1().f2(arrayList3, i12, i11, false, new vl(this, z10), wnVar2);
                PhotoViewer.t1().w2(wiVar.Q);
                if (wiVar.G) {
                    PhotoViewer.t1().X0(null, null, false, wiVar.J);
                    PhotoViewer.t1().l2();
                }
            }
        }
    }

    @Override
    public final void k(float f7) {
        this.W0 = f7;
        V();
        em emVar = this.P;
        if (emVar != null) {
            emVar.invalidateOutline();
            this.P.invalidate();
        }
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
    public final boolean l(MotionEvent motionEvent) {
        em emVar;
        if (!this.f22131d0) {
            if (this.f22127b0 && motionEvent != null) {
                boolean z10 = this.G0;
                q91 q91Var = this.f22147l0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.E0;
                    q91Var.getHitRect(rect);
                    if (q91Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f22160s0 && !this.I0) {
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
                    ul ulVar = this.f22157r;
                    TextView textView = this.f22154p0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.S;
                    ai.f0 f0Var = this.f22143j0;
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
                                q91Var.b(this.B0, false);
                                this.f27087b.getSheetContainer().invalidate();
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
                            } else if (this.I0 && (emVar = this.P) != null) {
                                emVar.setTranslationY(emVar.getTranslationY() + f7);
                                this.F0 = y3;
                                q91Var.setTag(null);
                                Runnable runnable = this.f22150n0;
                                if (runnable != null) {
                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                    this.f22150n0 = null;
                                }
                                if (f0Var.getTag() == null) {
                                    f0Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(f0Var, property, 0.0f), ObjectAnimator.ofFloat(q91Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(ulVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(rr.f28030f);
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
                            em emVar2 = this.P;
                            if (emVar2 != null) {
                                if (Math.abs(emVar2.getTranslationY()) > this.P.getMeasuredHeight() / 6.0f) {
                                    a0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.P, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(f0Var, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(ulVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f22141i0);
                                animatorSet2.start();
                                f0Var.setTag(null);
                                return true;
                            }
                        } else {
                            em emVar3 = this.P;
                            if (emVar3 != null && !this.D0) {
                                int[] iArr = this.V;
                                emVar3.getLocationOnScreen(iArr);
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
        if (this.f27087b.V) {
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.S[i10].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(rr.f28030f).start();
        }
        ViewPropertyAnimator duration = this.f22158r0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        rr rrVar = rr.f28030f;
        duration.setInterpolator(rrVar).start();
        this.f22156q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
        AndroidUtilities.updateViewVisibilityAnimated(this.R, false);
        AndroidUtilities.cancelRunOnUIThread(this.f22139h0);
        this.f22139h0 = null;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean n() {
        if (this.f22131d0) {
            return true;
        }
        if (this.f22127b0) {
            a0(true);
            return true;
        }
        d0(true);
        return false;
    }

    public final void n0() {
        if (this.f22129c0) {
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
            im imVar = this.G;
            if (imVar != null) {
                imVar.l();
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
        ArrayList arrayList = t12.f31247g7;
        if (arrayList != null && !arrayList.isEmpty() && i10 < arrayList.size() && (arrayList.get(i10) instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) arrayList.get(i10)).hasSpoiler) {
            final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
            this.E.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z11 = ChatAttachAlertPhotoLayout.f22120q1;
                    if (view instanceof org.telegram.ui.Cells.t5) {
                        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                        if (t5Var.getPhotoEntry() == photoEntry) {
                            t5Var.c(z10, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z12 = true;
                            if (ChatAttachAlertPhotoLayout.f22122s1.size() <= 1) {
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
    public final void q() {
        em emVar = this.P;
        if (emVar != null) {
            emVar.setVisibility(8);
        }
        for (Map.Entry entry : f22122s1.entrySet()) {
            if (entry.getValue() instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) entry.getValue()).isAttachSpoilerRevealed = false;
            }
        }
        this.G.l();
    }

    public final boolean q0() {
        if (!this.f22169y0) {
            wi wiVar = this.f27087b;
            if (!wiVar.F) {
                if (!(wiVar.f30005f0 instanceof org.telegram.ui.wn) && !wiVar.T0 && wiVar.Q0 != 2) {
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
        ul ulVar = this.E;
        int childCount = ulVar.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (ulVar.getChildAt(i10) instanceof org.telegram.ui.Cells.m5) {
                n0();
                break;
            } else {
                this.Q.g();
                i10++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f22153o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f22166x.animate().alpha(0.0f).setDuration(150L).setInterpolator(rr.f28033j).withEndAction(new ml(this, 1));
        this.f22153o1 = withEndAction;
        withEndAction.start();
        k0();
    }

    public final void r0(g9 g9Var, TLRPC.VideoSize videoSize, long j3) {
        boolean z10;
        wi wiVar = this.f27087b;
        e9 e9Var = new e9(wiVar.U, wiVar.Q);
        t40 t40Var = wiVar.Q;
        if (t40Var != null && t40Var.f28405c == 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        e9Var.Q = z10;
        wiVar.f30005f0.presentFragment(e9Var);
        if (g9Var != null) {
            e9Var.m0(g9Var);
        }
        if (videoSize != null) {
            e9Var.l0(videoSize);
        }
        if (j3 != 0) {
            e9Var.k0(j3);
        }
        e9Var.I = new w2(5, this, e9Var);
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
        em emVar = this.P;
        if (emVar != null) {
            emVar.setAlpha(f7);
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
        wi wiVar = this.f27087b;
        if (!wiVar.f30007f2 && this.f22163v0 && CameraView.isCameraAllowed()) {
            if (this.P == null) {
                boolean z12 = !LiteMode.isEnabled(360928);
                Context context = getContext();
                Boolean bool = this.f22152o0;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = wiVar.U1;
                }
                em emVar = new em(this, context, z10, z12);
                this.P = emVar;
                org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
                if ((m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).v()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                emVar.setRecordFile(AndroidUtilities.generateVideoPath(z11));
                this.P.setFocusable(true);
                this.P.setFpsLimit(30);
                this.P.setOutlineProvider(new ch.b(this, 1));
                this.P.setClipToOutline(true);
                this.P.setContentDescription(LocaleController.getString(R.string.AccDescrInstantCamera));
                org.telegram.ui.ActionBar.c3 container = wiVar.getContainer();
                em emVar2 = this.P;
                int i10 = this.K0;
                container.addView(emVar2, 1, new FrameLayout.LayoutParams(i10, i10));
                this.P.setDelegate(new xl(this));
                em emVar3 = this.P;
                if (this.f22163v0) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.2f;
                }
                emVar3.setAlpha(f7);
                this.P.setEnabled(this.f22163v0);
                if (this.N) {
                    this.P.setVisibility(8);
                }
                if (!this.f22127b0) {
                    V();
                }
                ul ulVar = this.E;
                if (ulVar != null) {
                    ulVar.invalidate();
                }
                invalidate();
            }
            q91 q91Var = this.f22147l0;
            if (q91Var != null) {
                q91Var.b(0.0f, false);
                this.B0 = 0.0f;
            }
            if (!this.f22127b0) {
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
        this.f22133e0 = f7;
        int[] iArr = this.f22135f0;
        float f10 = iArr[1];
        float f11 = iArr[2];
        int i12 = AndroidUtilities.displaySize.x;
        wi wiVar = this.f27087b;
        float width = (wiVar.getContainer().getWidth() - wiVar.getLeftInset()) - wiVar.getRightInset();
        float height = wiVar.getContainer().getHeight();
        float[] fArr = this.U;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = this.f22144j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
        float textureHeight = this.P.getTextureHeight(f10, f11) / this.P.getTextureHeight(width, height);
        float f15 = f11 / height;
        float f16 = f10 / width;
        if (this.f22142i1) {
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
            this.f22146k1 = f20 - this.P.getTranslationY();
            this.l1 = (height * f7) + (((f13 + f11) * f17) - this.P.getTranslationY());
            this.f22151n1 = f19 - this.P.getTranslationX();
            this.f22148m1 = (width * f7) + (((f12 + f10) * f17) - this.P.getTranslationX());
        } else {
            i10 = (int) f10;
            i11 = (int) f11;
            this.P.getTextureView().setScaleX(1.0f);
            this.P.getTextureView().setScaleY(1.0f);
            this.f22146k1 = 0.0f;
            this.l1 = height;
            this.f22151n1 = 0.0f;
            this.f22148m1 = width;
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
        this.f22162u0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.f22169y0 = z10;
    }

    public void setStarsPrice(long j3) {
        boolean z10;
        HashMap hashMap = f22122s1;
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
        A(getSelectedItemsCount());
        if (W(false)) {
            x0();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        wi wiVar = this.f27087b;
        if (wiVar.getSheetAnimationType() == 1) {
            float f10 = (f7 / 40.0f) * (-0.1f);
            ul ulVar = this.E;
            int childCount = ulVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ulVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    float f11 = 1.0f + f10;
                    t5Var.getCheckBox().setScaleX(f11);
                    t5Var.getCheckBox().setScaleY(f11);
                }
            }
        }
        super.setTranslationY(f7);
        wiVar.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void t(int i10) {
        TLRPC.Chat k12;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        wi wiVar = this.f27087b;
        if (i10 == 8) {
            wiVar.H1(!wiVar.f29995c0, true);
            this.f22132d1.a(!wiVar.f29995c0, true);
        } else if ((i10 == 0 || i10 == 1) && wiVar.S1 > 0 && f22123t1.size() > 1 && (k12 = wiVar.k1()) != null && !ChatObject.hasAdminRights(k12) && k12.slowmode_enabled) {
            e5.O(getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null, null, this.f27086a).o();
        } else {
            org.telegram.ui.ActionBar.d6 d6Var = this.f27086a;
            HashMap hashMap = f22122s1;
            if (i10 == 0) {
                MessageObject messageObject = wiVar.H1;
                org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
                if (messageObject == null && (m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).c()) {
                    e5.M(getContext(), ((org.telegram.ui.wn) m2Var).a(), new jl(this, 1), d6Var);
                } else {
                    e5.a0(wiVar.J1, wiVar.j1() + hashMap.size(), wiVar.n1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f25813b;

                        {
                            this.f25813b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25813b;
                            Long l4 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f22120q1;
                                    wi wiVar2 = chatAttachAlertPhotoLayout.f27087b;
                                    wiVar2.Y0();
                                    wiVar2.Z1.B1(7, false, true, 0, 0, 0L, wiVar2.s1(), false, l4.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f22120q1;
                                    wi wiVar3 = chatAttachAlertPhotoLayout.f27087b;
                                    wiVar3.Y0();
                                    wiVar3.Z1.B1(4, true, true, 0, 0, 0L, wiVar3.s1(), false, l4.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i10 == 1) {
                MessageObject messageObject2 = wiVar.H1;
                org.telegram.ui.ActionBar.m2 m2Var2 = wiVar.f30005f0;
                if (messageObject2 == null && (m2Var2 instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var2).c()) {
                    e5.M(getContext(), ((org.telegram.ui.wn) m2Var2).a(), new jl(this, 2), d6Var);
                } else {
                    e5.a0(wiVar.J1, wiVar.j1() + hashMap.size(), wiVar.n1(), new Utilities.Callback(this) {
                        public final ChatAttachAlertPhotoLayout f25813b;

                        {
                            this.f25813b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25813b;
                            Long l4 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f22120q1;
                                    wi wiVar2 = chatAttachAlertPhotoLayout.f27087b;
                                    wiVar2.Y0();
                                    wiVar2.Z1.B1(7, false, true, 0, 0, 0L, wiVar2.s1(), false, l4.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f22120q1;
                                    wi wiVar3 = chatAttachAlertPhotoLayout.f27087b;
                                    wiVar3.Y0();
                                    wiVar3.Z1.B1(4, true, true, 0, 0, 0L, wiVar3.s1(), false, l4.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                im imVar = this.G;
                ul ulVar = this.E;
                if (i10 == 3) {
                    rm rmVar = wiVar.f30037q0;
                    if (rmVar != null) {
                        rmVar.K();
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
                        public final ChatAttachAlertPhotoLayout f26132b;

                        {
                            this.f26132b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z14 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26132b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f22120q1;
                                    wi wiVar2 = chatAttachAlertPhotoLayout.f27087b;
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
                                        wiVar2.f29989a1.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            wiVar2.f29989a1.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    wiVar2.f29989a1.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        wiVar2.f29989a1.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.e1 e1Var2 = chatAttachAlertPhotoLayout.f22126a1;
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
                    ulVar.M(new nl(0, arrayList, z13));
                    if (wiVar.f30066y0 != this) {
                        imVar.l();
                    }
                    rm rmVar2 = wiVar.f30037q0;
                    if (rmVar2 != null) {
                        rmVar2.v.invalidate();
                    }
                } else if (i10 == 2) {
                    rm rmVar3 = wiVar.f30037q0;
                    if (rmVar3 != null) {
                        rmVar3.K();
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
                        public final ChatAttachAlertPhotoLayout f26132b;

                        {
                            this.f26132b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z142 = z14;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26132b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f22120q1;
                                    wi wiVar2 = chatAttachAlertPhotoLayout.f27087b;
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
                                        wiVar2.f29989a1.r(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            wiVar2.f29989a1.r(6);
                                            return;
                                        }
                                        return;
                                    }
                                    wiVar2.f29989a1.K(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        wiVar2.f29989a1.K(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.e1 e1Var2 = chatAttachAlertPhotoLayout.f22126a1;
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
                    ulVar.M(new nl(1, arrayList2, z14));
                    if (wiVar.f30066y0 != this) {
                        imVar.l();
                    }
                    rm rmVar4 = wiVar.f30037q0;
                    if (rmVar4 != null) {
                        rmVar4.v.invalidate();
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
                            int i11 = wiVar.Q0;
                            org.telegram.ui.ActionBar.m2 m2Var3 = wiVar.f30005f0;
                            if (i11 != 0) {
                                m2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                m2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i12 = wiVar.Q0;
                            org.telegram.ui.ActionBar.m2 m2Var4 = wiVar.f30005f0;
                            if (i12 != 0) {
                                m2Var4.startActivityForResult(intent3, 14);
                            } else {
                                m2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        wiVar.dismiss(true);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (i10 == 7) {
                    if (wiVar.f30066y0 == wiVar.f30037q0) {
                        z12 = false;
                    }
                    wiVar.Z1(z12);
                } else if (i10 == 9) {
                    yh.w7.g1(getContext(), getStarsPrice(), true, new d(this, 6), this.f27086a);
                } else if (i10 >= 10) {
                    MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.V0.get(i10 - 10);
                    this.T0 = albumEntry;
                    MediaController.AlbumEntry albumEntry2 = this.U0;
                    TextView textView = this.f22166x;
                    if (albumEntry == albumEntry2) {
                        textView.setText(LocaleController.getString(R.string.ChatGallery));
                    } else {
                        textView.setText(albumEntry.bucketName);
                    }
                    imVar.l();
                    this.v.l();
                    this.F.h1(0, -(ulVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void t0(boolean z10) {
        Integer num;
        float f7;
        q91 q91Var = this.f22147l0;
        if ((q91Var.getTag() != null && z10) || (q91Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f22150n0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                ml mlVar = new ml(this, 3);
                this.f22150n0 = mlVar;
                AndroidUtilities.runOnUIThread(mlVar, 2000L);
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
        q91Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.m0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(q91Var, View.ALPHA, f7));
        this.m0.addListener(new wl(this, 0));
        this.m0.start();
        if (z10) {
            ml mlVar2 = new ml(this, 4);
            this.f22150n0 = mlVar2;
            AndroidUtilities.runOnUIThread(mlVar2, 2000L);
        }
    }

    @Override
    public final void u() {
        boolean z10;
        wi wiVar = this.f27087b;
        if (wiVar != null && (wiVar.f30005f0 instanceof org.telegram.ui.wn)) {
            z10 = true;
        } else {
            z10 = false;
        }
        U(z10);
    }

    public final void u0() {
        ArrayList<MediaController.AlbumEntry> arrayList;
        zl zlVar = this.f22164w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = zlVar.f19788b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f22163v0) {
            if (q0()) {
                arrayList = MediaController.allMediaAlbums;
            } else {
                arrayList = MediaController.allPhotoAlbums;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.V0 = arrayList2;
            Collections.sort(arrayList2, new pl(arrayList, 0));
        } else {
            this.V0 = new ArrayList();
        }
        boolean isEmpty = this.V0.isEmpty();
        TextView textView = this.f22166x;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f22168y, (Drawable) null);
        int size = this.V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.V0.get(i10);
            ci.a aVar = new ci.a(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, albumEntry.photos.size(), this.f27086a);
            zlVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ci.n4(this, i10 + 10, 8));
        }
    }

    public final void v0() {
        ul ulVar = this.E;
        if (ulVar != null) {
            for (int i10 = 0; i10 < ulVar.getChildCount(); i10++) {
                View childAt = ulVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    ((org.telegram.ui.Cells.t5) childAt).f21198a.invalidate();
                }
            }
        }
    }

    @Override
    public final void w(int i10, boolean z10) {
        V();
        em emVar = this.P;
        if (emVar != null) {
            emVar.invalidateOutline();
            this.P.invalidate();
        }
    }

    public final void w0() {
        ArrayList arrayList;
        if (this.f27087b.f30005f0 instanceof org.telegram.ui.wn) {
            ul ulVar = this.E;
            int childCount = ulVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f22123t1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = ulVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    MediaController.PhotoEntry b02 = b0(((Integer) t5Var.getTag()).intValue());
                    if (b02 != null) {
                        t5Var.setNum(arrayList.indexOf(Integer.valueOf(b02.imageId)));
                    }
                }
                i10++;
            }
            ul ulVar2 = this.f22157r;
            int childCount2 = ulVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = ulVar2.getChildAt(i11);
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
        ShutterButton shutterButton = this.f22145k0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.Q0;
        pv0 pv0Var = pv0.f27437a;
        pv0 pv0Var2 = pv0.f27438b;
        if (!z10) {
            if (this.P != null && shutterButton.getState() == pv0Var2) {
                l0();
                CameraController.getInstance().stopVideoRecording(this.P.getCameraSession(), false);
                shutterButton.a(pv0Var);
            }
            if (this.f22127b0) {
                a0(false);
            }
            d0(true);
            return;
        }
        if (this.P != null && shutterButton.getState() == pv0Var2) {
            shutterButton.a(pv0Var);
        }
        this.Q0 = false;
    }

    public final void x0() {
        ArrayList arrayList;
        im imVar;
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
        wi wiVar = this.f27087b;
        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
        org.telegram.ui.ActionBar.m2 m2Var2 = wiVar.f30005f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            ul ulVar = this.E;
            int childCount = ulVar.getChildCount();
            int i11 = 0;
            while (true) {
                arrayList = f22123t1;
                imVar = this.G;
                hashMap = f22122s1;
                int i12 = -1;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = ulVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (imVar.f25112f && R > this.M0) {
                        R--;
                    }
                    if (imVar.d && this.T0 == this.U0) {
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
                    if ((m2Var2 instanceof org.telegram.ui.wn) && wiVar.T1) {
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
            ul ulVar2 = this.f22157r;
            int childCount2 = ulVar2.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = ulVar2.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (imVar.f25112f && R2 > this.M0) {
                        R2--;
                    }
                    if (imVar.d && this.T0 == this.U0) {
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
                    if ((m2Var2 instanceof org.telegram.ui.wn) && wiVar.T1) {
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

    @Override
    public final void y(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.y(int, int):void");
    }

    public final void y0(boolean z10) {
        boolean z11;
        TextView textView = this.f22154p0;
        if (textView != null) {
            wi wiVar = this.f27087b;
            int i10 = wiVar.Q0;
            TextView textView2 = wiVar.f30018j1;
            if (i10 == 0 && !wiVar.T0 && !wiVar.H) {
                HashMap hashMap = f22122s1;
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
                wiVar.M = z11;
                wiVar.f30025m1.setVisibility((!z11 || wiVar.Q0 == 2) ? 8 : 8);
                this.M = max;
            }
        }
    }

    @Override
    public final void z() {
        wi wiVar = this.f27087b;
        if (wiVar.isShowing() && !wiVar.isDismissed() && !PhotoViewer.t1().Q1()) {
            U(false);
        }
    }
}
