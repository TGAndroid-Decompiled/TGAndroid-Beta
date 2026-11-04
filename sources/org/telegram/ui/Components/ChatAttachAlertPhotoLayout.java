package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class ChatAttachAlertPhotoLayout extends th implements org.telegram.messenger.cs {
    public static boolean f31258r1;
    public static final ArrayList f31259s1 = new ArrayList();
    public static final HashMap f31260t1 = new HashMap();
    public static final ArrayList f31261u1 = new ArrayList();
    public static int f31262v1 = -1;
    public boolean A0;
    public float B0;
    public float C0;
    public boolean D0;
    public final Drawable E;
    public boolean E0;
    public final il F;
    public final Rect F0;
    public final fi.g G;
    public float G0;
    public final sl H;
    public boolean H0;
    public final gy I;
    public boolean I0;
    public final xj0 J;
    public boolean J0;
    public int K;
    public boolean K0;
    public boolean L;
    public int L0;
    public int M;
    public int M0;
    public int N;
    public int N0;
    public boolean O;
    public boolean O0;
    public AnimatorSet P;
    public boolean P0;
    public pl Q;
    public boolean Q0;
    public final ql R;
    public boolean R0;
    public final nl S;
    public boolean S0;
    public final ImageView[] T;
    public int T0;
    public boolean U;
    public org.telegram.messenger.pe U0;
    public final float[] V;
    public org.telegram.messenger.pe V0;
    public final int[] W;
    public ArrayList W0;
    public float X0;
    public boolean Y0;
    public final org.telegram.ui.ActionBar.y0 Z0;
    public float f31263a0;
    public final org.telegram.ui.ActionBar.y0 f31264a1;
    public float f31265b0;
    public final org.telegram.ui.ActionBar.y0 f31266b1;
    public boolean f31267c0;
    public final org.telegram.ui.ActionBar.y0 f31268c1;
    public boolean f31269d0;
    public final org.telegram.ui.ActionBar.y0 f31270d1;
    public boolean f31271e0;
    public final ca0 f31272e1;
    public float f31273f0;
    public final boolean f31274f1;
    public final int[] f31275g0;
    public final g2.g f31276g1;
    public int f31277h0;
    public boolean f31278h1;
    public fl f31279i0;
    public final ll f31280i1;
    public final DecelerateInterpolator f31281j0;
    public boolean f31282j1;
    public final ai.o2 f31283k0;
    public float k1;
    public final ShutterButton f31284l0;
    public float f31285l1;
    public final j71 m0;
    public float m1;
    public final boolean f31286n;
    public AnimatorSet f31287n0;
    public float f31288n1;
    public Runnable f31289o0;
    public float f31290o1;
    public Boolean f31291p0;
    public ViewPropertyAnimator f31292p1;
    public final TextView f31293q0;
    public int f31294q1;
    public final il f31295r;
    public final TextView f31296r0;
    public final kg.y f31297s;
    public final ImageView f31298s0;
    public boolean f31299t0;
    public boolean f31300u0;
    public boolean f31301v0;
    public final sl f31302w;
    public boolean f31303w0;
    public final gi.u2 f31304x;
    public boolean f31305x0;
    public final TextView f31306y;
    public boolean f31307y0;
    public boolean f31308z0;

    public ChatAttachAlertPhotoLayout(bi biVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, biVar);
        boolean z12;
        this.T = new ImageView[2];
        this.V = new float[2];
        this.W = new int[2];
        this.f31275g0 = new int[5];
        this.f31281j0 = new DecelerateInterpolator(1.5f);
        this.f31291p0 = null;
        this.F0 = new Rect();
        int L = org.telegram.messenger.g0.L(80.0f);
        this.L0 = L;
        this.M0 = L;
        this.N0 = 3;
        this.Y0 = true;
        this.f31276g1 = new g2.g((int[]) null);
        this.f31280i1 = new ll(this);
        this.f31274f1 = z10;
        this.f31286n = z11;
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23295r2);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23263l4);
        org.telegram.ui.ActionBar.j2 j2Var = biVar.f28589c;
        bi biVar2 = this.f38416b;
        if (biVar2.L2 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f31278h1 = z12;
        gi.u2 u2Var = new gi.u2(this, context, biVar2.S2.q(), e6Var, 1);
        this.f31304x = u2Var;
        u2Var.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = b8.mf.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = org.telegram.messenger.g0.f22602m;
        this.f38416b.S2.addView(u2Var, 0, d);
        u2Var.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f39143b;

            {
                this.f39143b = this;
            }

            @Override
            public final void onClick(View view) {
                pl plVar;
                pl plVar2;
                int i3 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39143b;
                switch (i3) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f31299t0 && (plVar = chatAttachAlertPhotoLayout.Q) != null && plVar.isInited()) {
                            chatAttachAlertPhotoLayout.f31269d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f31298s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new hl(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (plVar2 = chatAttachAlertPhotoLayout.Q) != null && plVar2.isInited() && chatAttachAlertPhotoLayout.f31267c0) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.Q.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.U = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
                                ImageView imageView = imageViewArr[0];
                                if (imageView == view) {
                                    imageView = imageViewArr[1];
                                }
                                imageView.setVisibility(0);
                                ChatAttachAlertPhotoLayout.r0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(xq.f40452f);
                                animatorSet.addListener(new ei.k3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f31304x.U(null, null);
                        return;
                    default:
                        if (chatAttachAlertPhotoLayout.Q != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f31306y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        textView.setText(org.telegram.messenger.bd.M0(2131752238, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        Drawable g7 = k2.p1.g(context, 2131231253);
        this.E = g7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(this, g7, i3, e6Var, mode);
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
        u2Var.addView(textView, b8.mf.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        W(false);
        ca0 ca0Var = new ca0(context, 2131624139, org.telegram.messenger.bd.M0(2131752560, null), 2131624138, org.telegram.messenger.bd.M0(2131752559, null), e6Var);
        this.f31272e1 = ca0Var;
        ca0Var.a(!this.f38416b.U1, false);
        this.f31270d1 = this.f38416b.V2.e(7, 2131232420, org.telegram.messenger.bd.M0(2131753957, null));
        this.f38416b.V2.a(5);
        this.f38416b.V2.e(4, 2131232265, org.telegram.messenger.bd.M0(2131747804, null));
        this.f31264a1 = this.f38416b.V2.e(1, 2131232132, org.telegram.messenger.bd.M0(2131745595, null));
        this.f38416b.V2.e(0, 2131232411, org.telegram.messenger.bd.M0(2131745594, null));
        this.f38416b.V2.a(6);
        this.Z0 = this.f38416b.V2.e(3, 2131232376, org.telegram.messenger.bd.M0(2131751155, null));
        this.f31266b1 = this.f38416b.V2.e(2, 2131231865, org.telegram.messenger.bd.M0(2131745631, null));
        org.telegram.ui.ActionBar.q0 q0Var = this.f38416b.V2;
        q0Var.p();
        ca0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        ca0Var.setTag(8);
        q0Var.f28440b.addView(ca0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ca0Var.getLayoutParams();
        if (org.telegram.messenger.bd.f21784a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        ca0Var.setLayoutParams(layoutParams);
        ca0Var.setOnClickListener(new org.telegram.ui.ActionBar.y(q0Var, 2));
        this.f31268c1 = this.f38416b.V2.e(9, 2131231809, org.telegram.messenger.bd.M0(2131747738, null));
        this.f38416b.V2.setFitSubItems(true);
        il ilVar = new il(this, context, e6Var, 1);
        this.F = ilVar;
        ilVar.setFastScrollEnabled(1);
        ilVar.setFastScrollVisible(true);
        ilVar.getFastScroll().setAlpha(0.0f);
        ilVar.getFastScroll().f40728a = false;
        ilVar.getFastScroll().f40741i0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        sl slVar = new sl(this, context, z11);
        this.H = slVar;
        ilVar.setAdapter(slVar);
        ql qlVar = new ql(this, ilVar);
        this.R = qlVar;
        ilVar.i(qlVar);
        int i10 = 0;
        for (int i11 = 8; i10 < i11; i11 = 8) {
            slVar.h.add(slVar.L());
            i10++;
        }
        ilVar.setClipToPadding(false);
        ilVar.setItemAnimator(null);
        ilVar.setLayoutAnimation(null);
        ilVar.setVerticalScrollBarEnabled(false);
        org.telegram.ui.ActionBar.r6.m(ilVar, 21, org.telegram.ui.ActionBar.k6.A5, e6Var);
        addView(ilVar, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        ilVar.setOnScrollListener(new gi.g8(1, this));
        fi.g gVar = new fi.g(this, this.L0, 3);
        this.G = gVar;
        gVar.O = new ai.g2(this, 10);
        ilVar.setLayoutManager(gVar);
        ilVar.setOnItemClickListener(new ci.l3(this, z11, e6Var, 6));
        ilVar.setOnItemLongClickListener(new wk(this, 2));
        xj0 xj0Var = new xj0(new i9(this, 1));
        this.J = xj0Var;
        ilVar.F.add(xj0Var);
        setBlur3Capture(ilVar);
        this.d = ilVar;
        this.f38419f = true;
        gy gyVar = new gy(context, e6Var);
        this.I = gyVar;
        gyVar.setText(org.telegram.messenger.bd.M0(2131748188, null));
        gyVar.setOnTouchListener(null);
        gyVar.setTextSize(16);
        addView(gyVar, b8.mf.c(-2.0f, -1));
        if (this.Y0) {
            gyVar.b();
        } else {
            gyVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        nl nlVar = new nl(context, paint);
        this.S = nlVar;
        org.telegram.messenger.g0.Z3(nlVar, false, 1.0f, true, false);
        nlVar.setBackgroundResource(2131232769);
        nlVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        nlVar.setTextSize(1, 15.0f);
        nlVar.setTypeface(org.telegram.messenger.g0.o());
        nlVar.setAlpha(0.0f);
        nlVar.setTextColor(-1);
        nlVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        j2Var.addView(nlVar, b8.mf.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        ai.o2 o2Var = new ai.o2(17, context, this);
        this.f31283k0 = o2Var;
        o2Var.setVisibility(8);
        o2Var.setAlpha(0.0f);
        j2Var.addView(o2Var, b8.mf.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f31293q0 = textView2;
        textView2.setBackgroundResource(2131232536);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131232534, 0);
        textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        j2Var.addView(textView2, b8.mf.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f39143b;

            {
                this.f39143b = this;
            }

            @Override
            public final void onClick(View view) {
                pl plVar;
                pl plVar2;
                int i32 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39143b;
                switch (i32) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f31299t0 && (plVar = chatAttachAlertPhotoLayout.Q) != null && plVar.isInited()) {
                            chatAttachAlertPhotoLayout.f31269d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f31298s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new hl(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (plVar2 = chatAttachAlertPhotoLayout.Q) != null && plVar2.isInited() && chatAttachAlertPhotoLayout.f31267c0) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.Q.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.U = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
                                ImageView imageView = imageViewArr[0];
                                if (imageView == view) {
                                    imageView = imageViewArr[1];
                                }
                                imageView.setVisibility(0);
                                ChatAttachAlertPhotoLayout.r0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(xq.f40452f);
                                animatorSet.addListener(new ei.k3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f31304x.U(null, null);
                        return;
                    default:
                        if (chatAttachAlertPhotoLayout.Q != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                            return;
                        }
                        return;
                }
            }
        });
        j71 j71Var = new j71(context);
        this.m0 = j71Var;
        j71Var.setVisibility(8);
        j71Var.setAlpha(0.0f);
        j2Var.addView(j71Var, b8.mf.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        j71Var.setDelegate(new wk(this, 3));
        ?? view = new View(context);
        view.f31619b = new DecelerateInterpolator();
        view.f31627x = new lt(view, 13);
        view.f31618a = view.getResources().getDrawable(2131230928);
        Paint paint2 = new Paint(1);
        view.f31620c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f31622f = bt0.f32393a;
        this.f31284l0 = view;
        o2Var.addView((View) view, b8.mf.e(84, 84, 17));
        view.setDelegate(new gl(this, e6Var, j2Var));
        view.setFocusable(true);
        view.setContentDescription(org.telegram.messenger.bd.M0(2131754760, null));
        ImageView imageView = new ImageView(context);
        this.f31298s0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        o2Var.addView(imageView, b8.mf.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f39143b;

            {
                this.f39143b = this;
            }

            @Override
            public final void onClick(View view2) {
                pl plVar;
                pl plVar2;
                int i32 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39143b;
                switch (i32) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f31299t0 && (plVar = chatAttachAlertPhotoLayout.Q) != null && plVar.isInited()) {
                            chatAttachAlertPhotoLayout.f31269d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f31298s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new hl(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (plVar2 = chatAttachAlertPhotoLayout.Q) != null && plVar2.isInited() && chatAttachAlertPhotoLayout.f31267c0) {
                            String currentFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode();
                            String nextFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getNextFlashMode();
                            if (!currentFlashMode.equals(nextFlashMode)) {
                                chatAttachAlertPhotoLayout.Q.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                chatAttachAlertPhotoLayout.U = true;
                                ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
                                ImageView imageView2 = imageViewArr[0];
                                if (imageView2 == view2) {
                                    imageView2 = imageViewArr[1];
                                }
                                imageView2.setVisibility(0);
                                ChatAttachAlertPhotoLayout.r0(imageView2, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(xq.f40452f);
                                animatorSet.addListener(new ei.k3(chatAttachAlertPhotoLayout, view2, imageView2, 4));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f31304x.U(null, null);
                        return;
                    default:
                        if (chatAttachAlertPhotoLayout.Q != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754752, null));
        for (int i12 = 0; i12 < 2; i12++) {
            this.T[i12] = new ImageView(context);
            this.T[i12].setScaleType(ImageView.ScaleType.CENTER);
            this.T[i12].setVisibility(4);
            this.f31283k0.addView(this.T[i12], b8.mf.e(48, 48, 51));
            this.T[i12].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f39143b;

                {
                    this.f39143b = this;
                }

                @Override
                public final void onClick(View view2) {
                    pl plVar;
                    pl plVar2;
                    int i32 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39143b;
                    switch (i32) {
                        case 0:
                            if (!chatAttachAlertPhotoLayout.f31299t0 && (plVar = chatAttachAlertPhotoLayout.Q) != null && plVar.isInited()) {
                                chatAttachAlertPhotoLayout.f31269d0 = false;
                                chatAttachAlertPhotoLayout.Q.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f31298s0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new hl(chatAttachAlertPhotoLayout, 0));
                                duration.start();
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.U && (plVar2 = chatAttachAlertPhotoLayout.Q) != null && plVar2.isInited() && chatAttachAlertPhotoLayout.f31267c0) {
                                String currentFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode();
                                String nextFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getNextFlashMode();
                                if (!currentFlashMode.equals(nextFlashMode)) {
                                    chatAttachAlertPhotoLayout.Q.getCameraSession().setCurrentFlashMode(nextFlashMode);
                                    chatAttachAlertPhotoLayout.U = true;
                                    ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
                                    ImageView imageView2 = imageViewArr[0];
                                    if (imageView2 == view2) {
                                        imageView2 = imageViewArr[1];
                                    }
                                    imageView2.setVisibility(0);
                                    ChatAttachAlertPhotoLayout.r0(imageView2, nextFlashMode);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(xq.f40452f);
                                    animatorSet.addListener(new ei.k3(chatAttachAlertPhotoLayout, view2, imageView2, 4));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        case 2:
                            chatAttachAlertPhotoLayout.f31304x.U(null, null);
                            return;
                        default:
                            if (chatAttachAlertPhotoLayout.Q != null) {
                                chatAttachAlertPhotoLayout.m0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                                return;
                            }
                            return;
                    }
                }
            });
            this.T[i12].setContentDescription("flash mode " + i12);
        }
        TextView textView3 = new TextView(context);
        this.f31296r0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setText(org.telegram.messenger.bd.M0(2131744280, null));
        textView3.setShadowLayer(org.telegram.messenger.g0.L(3.33333f), 0.0f, org.telegram.messenger.g0.L(0.666f), 1275068416);
        textView3.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.f31283k0.addView(textView3, b8.mf.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        il ilVar2 = new il(this, context, e6Var, 0);
        this.f31295r = ilVar2;
        ilVar2.setVerticalScrollBarEnabled(true);
        sl slVar2 = new sl(this, context, false);
        this.f31302w = slVar2;
        ilVar2.setAdapter(slVar2);
        for (int i13 = 0; i13 < 8; i13++) {
            slVar2.h.add(slVar2.L());
        }
        ilVar2.setClipToPadding(false);
        ilVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        ilVar2.setItemAnimator(null);
        ilVar2.setLayoutAnimation(null);
        ilVar2.setOverScrollMode(2);
        ilVar2.setVisibility(4);
        ilVar2.setAlpha(0.0f);
        j2Var.addView(ilVar2, b8.mf.c(80.0f, -1));
        kg.y yVar = new kg.y(0, false, 7);
        this.f31297s = yVar;
        ilVar2.setLayoutManager(yVar);
        ilVar2.setOnItemClickListener(new ai.a(3));
    }

    public static org.telegram.ui.Cells.q5 O(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i3) {
        il ilVar = chatAttachAlertPhotoLayout.F;
        int childCount = ilVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ilVar.getChildAt(i10);
            if (childAt.getTop() < ilVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f38416b.Z0() && (childAt instanceof org.telegram.ui.Cells.q5)) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (q5Var.getImageView().getTag() != null && ((Integer) q5Var.getImageView().getTag()).intValue() == i3) {
                    return q5Var;
                }
            }
        }
        return null;
    }

    public static int Q(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).f51325g4 == 5) {
            return ((org.telegram.messenger.j0) d2Var.getMessagesController().f23167x7.f24651d0.f13798b).f23620c - ((org.telegram.ui.wm) biVar.X1).L6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static boolean U() {
        HashMap hashMap = f31260t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof org.telegram.messenger.ye) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                    if (yeVar.d() && yeVar.j()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean V() {
        CharSequence charSequence;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = f31261u1;
            if (i3 >= arrayList.size()) {
                break;
            }
            Object obj = f31260t1.get(arrayList.get(i3));
            if (obj instanceof org.telegram.messenger.ye) {
                charSequence = ((org.telegram.messenger.ye) obj).f25309a;
            } else if (obj instanceof org.telegram.messenger.bf) {
                charSequence = ((org.telegram.messenger.bf) obj).I;
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                i10++;
            }
            i3++;
        }
        if (i10 > 1) {
            return false;
        }
        return true;
    }

    public static boolean f0() {
        HashMap hashMap = f31260t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((entry.getValue() instanceof org.telegram.messenger.ye) && ((org.telegram.messenger.ye) entry.getValue()).d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(7.0f) + this.f31294q1;
    }

    public static void r0(ImageView imageView, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3551:
                if (str.equals("on")) {
                    c2 = 0;
                    break;
                }
                break;
            case 109935:
                if (str.equals("off")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                imageView.setImageResource(2131231194);
                imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754913, null));
                return;
            case 1:
                imageView.setImageResource(2131231193);
                imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754914, null));
                return;
            case 2:
                imageView.setImageResource(2131231192);
                imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754915, null));
                return;
            default:
                return;
        }
    }

    public void setAlertKeepScreenOn(boolean z10) {
        Window window = this.f38416b.getWindow();
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
        ShutterButton shutterButton = this.f31284l0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.R0;
        bt0 bt0Var = bt0.f32393a;
        bt0 bt0Var2 = bt0.f32394b;
        if (!z10) {
            if (this.Q != null && shutterButton.getState() == bt0Var2) {
                o0();
                CameraController.getInstance().stopVideoRecording(this.Q.getCameraSession(), false);
                shutterButton.a(bt0Var);
            }
            if (this.f31267c0) {
                d0(false);
            }
            g0(true);
            return;
        }
        if (this.Q != null && shutterButton.getState() == bt0Var2) {
            shutterButton.a(bt0Var);
        }
        this.R0 = false;
    }

    public final void A0() {
        ArrayList arrayList;
        sl slVar;
        HashMap hashMap;
        boolean z10;
        boolean z11;
        boolean z12;
        int i3;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        bi biVar = this.f38416b;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            il ilVar = this.F;
            int childCount = ilVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f31261u1;
                slVar = this.H;
                hashMap = f31260t1;
                int i11 = -1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = ilVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (slVar.f38051f && R > this.N0) {
                        R--;
                    }
                    if (slVar.d && this.U0 == this.V0) {
                        R--;
                    }
                    org.telegram.messenger.ye e02 = e0(R);
                    if (e02 != null && e02.M) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    q5Var.setHasSpoiler(z14);
                    if (e02 != null && e02.c()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    q5Var.setHighQuality(z15);
                    if ((d2Var2 instanceof org.telegram.ui.wm) && biVar.O3) {
                        if (e02 != null) {
                            i11 = arrayList.indexOf(Integer.valueOf(e02.C));
                        }
                        if (e02 != null && hashMap.containsKey(Integer.valueOf(e02.C))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        q5Var.b(i11, z17, true);
                    } else {
                        if (e02 != null && hashMap.containsKey(Integer.valueOf(e02.C))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        q5Var.b(-1, z16, true);
                    }
                }
                i10++;
            }
            il ilVar2 = this.f31295r;
            int childCount2 = ilVar2.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = ilVar2.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (slVar.f38051f && R2 > this.N0) {
                        R2--;
                    }
                    if (slVar.d && this.U0 == this.V0) {
                        R2--;
                    }
                    org.telegram.messenger.ye e03 = e0(R2);
                    if (e03 != null && e03.M) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q5Var2.setHasSpoiler(z10);
                    if (e03 != null && e03.c()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    q5Var2.setHighQuality(z11);
                    if ((d2Var2 instanceof org.telegram.ui.wm) && biVar.O3) {
                        if (e03 != null) {
                            i3 = arrayList.indexOf(Integer.valueOf(e03.C));
                        } else {
                            i3 = -1;
                        }
                        if (e03 != null && hashMap.containsKey(Integer.valueOf(e03.C))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        q5Var2.b(i3, z13, true);
                    } else {
                        if (e03 != null && hashMap.containsKey(Integer.valueOf(e03.C))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        q5Var2.b(-1, z12, true);
                    }
                }
            }
        }
    }

    @Override
    public final void B(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.B(int, int):void");
    }

    public final void B0(boolean z10) {
        boolean z11;
        TextView textView = this.f31293q0;
        if (textView != null) {
            bi biVar = this.f38416b;
            int i3 = biVar.L2;
            TextView textView2 = biVar.f32224e3;
            if (i3 == 0 && !biVar.O2 && !biVar.f32298z1) {
                HashMap hashMap = f31260t1;
                Iterator it = hashMap.entrySet().iterator();
                int i10 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    z11 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((org.telegram.messenger.ye) ((Map.Entry) it.next()).getValue()).f25310b) {
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
                    textView.setText(org.telegram.messenger.bd.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                    if (max != this.N || z10) {
                        textView2.setText(org.telegram.messenger.bd.G(max, "MediaSelected", new Object[0]));
                    }
                } else if (z12) {
                    textView.setText(org.telegram.messenger.bd.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                    if (max != this.N || z10) {
                        textView2.setText(org.telegram.messenger.bd.G(max, "VideosSelected", new Object[0]));
                    }
                } else {
                    textView.setText(org.telegram.messenger.bd.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                    if (max != this.N || z10) {
                        textView2.setText(org.telegram.messenger.bd.G(max, "PhotosSelected", new Object[0]));
                    }
                }
                if (max <= 1) {
                    z11 = false;
                }
                biVar.E1 = z11;
                biVar.f32233h3.setVisibility((!z11 || biVar.L2 == 2) ? 8 : 8);
                this.N = max;
            }
        }
    }

    @Override
    public final void C() {
        bi biVar = this.f38416b;
        if (biVar.isShowing() && !biVar.J && !PhotoViewer.v1().U1()) {
            W(false);
        }
    }

    @Override
    public final void D(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.D(int):void");
    }

    @Override
    public final boolean G(int i3) {
        if (this.f31267c0) {
            if (i3 == 24 || i3 == 25 || i3 == 79 || i3 == 85) {
                ((gl) this.f31284l0.getDelegate()).a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void H(th thVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f31292p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f31304x.setVisibility(0);
        boolean z10 = thVar instanceof am;
        TextView textView = this.f31306y;
        if (!z10) {
            c0();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(xq.f40455j);
            this.f31292p1 = interpolator;
            interpolator.start();
        }
        this.f38416b.S2.setTitle("");
        this.G.h1(0, 0);
        if (z10) {
            this.F.post(new org.telegram.ui.lo(29, this, thVar));
        }
        X();
        p0();
    }

    @Override
    public final void I() {
        this.O = false;
        pl plVar = this.Q;
        if (plVar != null) {
            plVar.setVisibility(0);
        }
        if (this.f31301v0) {
            this.f31301v0 = false;
            W(true);
        }
    }

    @Override
    public final void J() {
        this.F.y0(0);
    }

    public final int S(org.telegram.messenger.ye yeVar, int i3) {
        boolean z10;
        Integer valueOf = Integer.valueOf(yeVar.C);
        HashMap hashMap = f31260t1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f31261u1;
        if (containsKey) {
            yeVar.N = 0L;
            yeVar.M = false;
            yeVar.O = null;
            yeVar.f25331z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            B0(false);
            z0();
            if (i3 >= 0) {
                yeVar.e();
                this.f31280i1.X(i3);
            }
            return indexOf;
        }
        yeVar.N = getStarsPrice();
        if (getStarsPrice() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yeVar.M = z10;
        yeVar.R = false;
        if (f0()) {
            yeVar.O = Boolean.valueOf(!U());
        }
        yeVar.f25331z = Boolean.valueOf(yeVar.c());
        boolean Z = Z(true);
        hashMap.put(valueOf, yeVar);
        arrayList.add(valueOf);
        if (Z) {
            A0();
            return -1;
        }
        B0(true);
        return -1;
    }

    public final void T() {
        pl plVar = this.Q;
        if (plVar != null) {
            if (!this.f31267c0) {
                plVar.setTranslationX(this.V[0]);
            }
            int i3 = this.L0;
            int L = org.telegram.messenger.g0.L(2.0f) + (i3 * 2);
            if (!this.f31267c0) {
                this.Q.setClipTop((int) this.f31263a0);
                this.Q.setClipBottom((int) this.f31265b0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
                if (layoutParams.height != L || layoutParams.width != i3) {
                    layoutParams.width = i3;
                    layoutParams.height = L;
                    this.Q.setLayoutParams(layoutParams);
                    org.telegram.messenger.g0.h3(new cl(0, this, layoutParams));
                }
            }
        }
    }

    public final void W(boolean z10) {
        org.telegram.ui.ActionBar.d2 d2Var;
        boolean z11;
        sl slVar;
        bi biVar = this.f38416b;
        boolean z12 = biVar.N1;
        org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
        if (!z12 && this.f31286n) {
            boolean z13 = this.O0;
            boolean z14 = this.P0;
            if (d2Var2 == null) {
                d2Var = LaunchActivity.Q();
            } else {
                d2Var = d2Var2;
            }
            if (d2Var != null && d2Var.getParentActivity() != null) {
                if (!org.telegram.messenger.az.f21679y0) {
                    this.O0 = false;
                } else {
                    if (d2Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.P0 = z11;
                    if (z11) {
                        if (z10) {
                            try {
                                d2Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                            } catch (Exception unused) {
                            }
                        }
                        this.O0 = false;
                    } else {
                        if (z10 || org.telegram.messenger.az.P0) {
                            CameraController.getInstance().initCamera(null);
                        }
                        this.O0 = CameraController.getInstance().isCameraInitied();
                    }
                }
                if ((z13 != this.O0 || z14 != this.P0) && (slVar = this.H) != null) {
                    slVar.f();
                }
                if (!biVar.N1 && biVar.isShowing() && this.O0 && ((Paint) biVar.Z.f28571b).getAlpha() != 0 && !this.f31267c0) {
                    v0();
                }
            }
        }
    }

    public final void X() {
        u4.d1 K;
        float[] fArr;
        int i3;
        float f10;
        int systemWindowInsetTop;
        if (!PhotoViewer.F1() || PhotoViewer.v1().f41518q5 == null || !PhotoViewer.v1().f41518q5.W) {
            pl plVar = this.Q;
            if (plVar != null) {
                plVar.invalidateOutline();
            }
            il ilVar = this.F;
            u4.d1 K2 = ilVar.K(this.N0 - 1);
            if (K2 != null) {
                K2.f55540a.invalidateOutline();
            }
            if ((!this.H.d || !this.O0 || this.U0 != this.V0) && (K = ilVar.K(0)) != null) {
                K.f55540a.invalidateOutline();
            }
            pl plVar2 = this.Q;
            if (plVar2 != null) {
                plVar2.invalidate();
            }
            nl nlVar = this.S;
            if (nlVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nlVar.getLayoutParams();
                if (getRootWindowInsets() == null) {
                    systemWindowInsetTop = org.telegram.messenger.g0.L(16.0f);
                } else {
                    systemWindowInsetTop = getRootWindowInsets().getSystemWindowInsetTop() + org.telegram.messenger.g0.L(2.0f);
                }
                marginLayoutParams.topMargin = systemWindowInsetTop;
            }
            if (!this.O0) {
                return;
            }
            int childCount = ilVar.getChildCount();
            int i10 = 0;
            while (true) {
                fArr = this.V;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = ilVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.k5) {
                    if (childAt.isAttachedToWindow()) {
                        float y9 = getY() + ilVar.getY() + childAt.getY();
                        bi biVar = this.f38416b;
                        ViewGroup viewGroup = biVar.f28586b;
                        bh bhVar = biVar.f32276t3;
                        ai.c0 c0Var = biVar.J2;
                        float y10 = viewGroup.getY() + y9;
                        float x10 = (biVar.f28586b.getX() + (getX() + (ilVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                        if (!biVar.Y1) {
                            i3 = org.telegram.messenger.g0.f22602m;
                        } else {
                            i3 = 0;
                        }
                        float alpha = (c0Var.getAlpha() * c0Var.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i3;
                        gi.i iVar = biVar.f32301z4;
                        if (iVar != null && iVar.g()) {
                            alpha = Math.max(alpha, (biVar.f32301z4.e() + biVar.f32301z4.getY()) - biVar.f32231g4);
                        }
                        if (y9 < alpha) {
                            f10 = alpha - y9;
                        } else {
                            f10 = 0.0f;
                        }
                        if (f10 != this.f31263a0) {
                            this.f31263a0 = f10;
                            pl plVar3 = this.Q;
                            if (plVar3 != null) {
                                plVar3.invalidateOutline();
                                this.Q.invalidate();
                            }
                        }
                        float translationY = (int) (bhVar.getTranslationY() + (biVar.f28586b.getMeasuredHeight() - bhVar.getMeasuredHeight()));
                        gi.i iVar2 = biVar.f32301z4;
                        if (iVar2 != null) {
                            translationY -= iVar2.d() - org.telegram.messenger.g0.L(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y9 > translationY) {
                            this.f31265b0 = Math.min(-org.telegram.messenger.g0.L(5.0f), y9 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.f31265b0 = 0.0f;
                        }
                        fArr[0] = x10;
                        fArr[1] = y10;
                        T();
                        return;
                    }
                } else {
                    i10++;
                }
            }
            if (this.f31263a0 != 0.0f) {
                this.f31263a0 = 0.0f;
                pl plVar4 = this.Q;
                if (plVar4 != null) {
                    plVar4.invalidateOutline();
                    this.Q.invalidate();
                }
            }
            fArr[0] = org.telegram.messenger.g0.L(-400.0f);
            fArr[1] = 0.0f;
            T();
        }
    }

    public final boolean Z(boolean z10) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            HashMap hashMap = f31260t1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f31261u1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof org.telegram.messenger.ye)) {
                break;
            }
            S((org.telegram.messenger.ye) obj, -1);
            z11 = true;
        }
        return z11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        org.telegram.messenger.ye yeVar;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = f31261u1;
            if (i3 < arrayList.size()) {
                if (i3 == 0) {
                    Object obj = arrayList.get(i3);
                    HashMap hashMap = f31260t1;
                    Object obj2 = hashMap.get(obj);
                    if (obj2 instanceof org.telegram.messenger.ye) {
                        org.telegram.messenger.ye clone = ((org.telegram.messenger.ye) obj2).clone();
                        CharSequence[] charSequenceArr = {charSequence};
                        clone.f25320n = org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).W(charSequenceArr, false, true);
                        clone.f25309a = charSequenceArr[0];
                        yeVar = clone;
                    } else {
                        boolean z10 = obj2 instanceof org.telegram.messenger.bf;
                        yeVar = obj2;
                        if (z10) {
                            org.telegram.messenger.bf clone2 = ((org.telegram.messenger.bf) obj2).clone();
                            CharSequence[] charSequenceArr2 = {charSequence};
                            clone2.f25320n = org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).W(charSequenceArr2, false, true);
                            clone2.I = charSequenceArr2[0];
                            yeVar = clone2;
                        }
                    }
                    hashMap.put(obj, yeVar);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final boolean a0(org.telegram.messenger.ye yeVar) {
        boolean z10 = this.f31305x0;
        org.telegram.ui.ActionBar.e6 e6Var = this.f38415a;
        bi biVar = this.f38416b;
        if (!z10 && yeVar.f25310b) {
            if (!biVar.N0()) {
                org.telegram.messenger.k5.p(null, 2131749546, new fc(biVar.f32249m3, e6Var), null);
                return true;
            }
        } else if (!this.f31307y0 && !yeVar.f25310b) {
            if (!biVar.N0()) {
                org.telegram.messenger.k5.p(null, 2131749550, new fc(biVar.f32249m3, e6Var), null);
                return true;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b() {
        return !this.f31267c0;
    }

    public final void b0() {
        if (this.Q0) {
            boolean h02 = h0();
            this.Q0 = h02;
            if (!h02) {
                i0();
            }
            this.H.f();
            this.f31302w.f();
        }
    }

    @Override
    public final boolean c() {
        for (Map.Entry entry : f31260t1.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof org.telegram.messenger.ye) {
                if (((org.telegram.messenger.ye) value).f25329x != 0) {
                    return false;
                }
            } else if ((value instanceof org.telegram.messenger.bf) && ((org.telegram.messenger.bf) value).f25329x != 0) {
                return false;
            }
        }
        return true;
    }

    public final void c0() {
        String M0 = org.telegram.messenger.bd.M0(2131751155, null);
        org.telegram.ui.ActionBar.y0 y0Var = this.Z0;
        y0Var.setText(M0);
        y0Var.setAnimatedIcon(2131624131);
        this.f38416b.V2.S(1);
        HashMap hashMap = f31260t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((org.telegram.messenger.ye) entry.getValue()).e();
            }
            hashMap.clear();
            f31261u1.clear();
        }
        ArrayList arrayList = f31259s1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) arrayList.get(i3);
                new File(yeVar.I).delete();
                if (yeVar.h != null) {
                    new File(yeVar.h).delete();
                }
                if (yeVar.f25311c != null) {
                    new File(yeVar.f25311c).delete();
                }
            }
            arrayList.clear();
        }
        this.H.f();
        this.f31302w.f();
    }

    @Override
    public final void d() {
        int i3;
        int i10;
        int i11;
        int i12;
        boolean z10 = this.f31274f1;
        if (z10) {
            i3 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f27988j5;
        }
        int i13 = org.telegram.ui.ActionBar.k6.f27862c7;
        org.telegram.ui.ActionBar.e6 e6Var = this.f38415a;
        this.I.setTextColor(org.telegram.ui.ActionBar.k6.w0(i13, e6Var));
        int i14 = org.telegram.ui.ActionBar.k6.A5;
        il ilVar = this.F;
        org.telegram.ui.ActionBar.r6.I(ilVar, i14, e6Var);
        ilVar.K(0);
        org.telegram.ui.ActionBar.r6.V(this.f31306y, i3, e6Var);
        if (z10) {
            i10 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.E8;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        gi.u2 u2Var = this.f31304x;
        u2Var.O(w02, false);
        if (z10) {
            i11 = org.telegram.ui.ActionBar.k6.Vg;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.E8;
        }
        u2Var.O(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), true);
        if (z10) {
            i12 = org.telegram.ui.ActionBar.k6.Xg;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.G8;
        }
        u2Var.H(org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), this.E);
    }

    public final void d0(boolean z10) {
        boolean z11;
        pl plVar;
        if (!this.f31299t0 && this.Q != null) {
            int i3 = this.L0;
            int[] iArr = this.f31275g0;
            iArr[1] = i3;
            iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i3 * 2);
            Runnable runnable = this.f31289o0;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f31289o0 = null;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.f38415a)) > 0.721d) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.g0.n3(this.f38416b, z11);
            TextView textView = this.f31293q0;
            il ilVar = this.f31295r;
            ai.o2 o2Var = this.f31283k0;
            il ilVar2 = this.F;
            ImageView[] imageViewArr = this.T;
            j71 j71Var = this.m0;
            if (z10) {
                this.k1 = this.Q.getTranslationY();
                this.f31271e0 = true;
                if (ilVar2 != null) {
                    ilVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(o2Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(j71Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(ilVar, property, 0.0f));
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
                this.f31276g1.d();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(xq.f40452f);
                animatorSet.addListener(new hl(this, 3));
                animatorSet.start();
            } else {
                this.f31282j1 = false;
                setAlertKeepScreenOn(false);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                o2Var.setAlpha(0.0f);
                o2Var.setVisibility(8);
                j71Var.setAlpha(0.0f);
                j71Var.setTag(null);
                j71Var.setVisibility(8);
                ilVar.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                ilVar.setVisibility(8);
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
                this.f31267c0 = false;
                pl plVar2 = this.Q;
                if (plVar2 != null) {
                    plVar2.setFpsLimit(30);
                    this.Q.setSystemUiVisibility(1024);
                }
                if (ilVar2 != null) {
                    ilVar2.invalidate();
                }
            }
            pl plVar3 = this.Q;
            if (plVar3 != null) {
                plVar3.setImportantForAccessibility(0);
            }
            ilVar2.setImportantForAccessibility(0);
            if (!org.telegram.messenger.lc.e(360928) && (plVar = this.Q) != null) {
                plVar.showTexture(false, z10);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        bi biVar;
        if (i3 == org.telegram.messenger.hs.f23295r2) {
            sl slVar = this.H;
            if (slVar != null) {
                if (t0()) {
                    this.V0 = MediaController.f21294a2;
                } else {
                    this.V0 = MediaController.f21295b2;
                }
                if (this.U0 != null && ((biVar = this.f38416b) == null || !biVar.f32294y1)) {
                    if (t0()) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= MediaController.c2.size()) {
                                break;
                            }
                            org.telegram.messenger.pe peVar = (org.telegram.messenger.pe) MediaController.c2.get(i11);
                            int i12 = peVar.f24735a;
                            org.telegram.messenger.pe peVar2 = this.U0;
                            if (i12 == peVar2.f24735a && peVar.f24736b == peVar2.f24736b) {
                                this.U0 = peVar;
                                break;
                            }
                            i11++;
                        }
                    }
                } else {
                    this.U0 = this.V0;
                }
                this.Y0 = false;
                this.I.c();
                slVar.f();
                this.f31302w.f();
                ArrayList arrayList = f31261u1;
                if (!arrayList.isEmpty() && this.V0 != null) {
                    int size = arrayList.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        Integer num = (Integer) arrayList.get(i13);
                        HashMap hashMap = f31260t1;
                        Object obj = hashMap.get(num);
                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) this.V0.f24739f.get(num.intValue());
                        if (yeVar != null) {
                            if (obj instanceof org.telegram.messenger.ye) {
                                yeVar.g((org.telegram.messenger.ye) obj);
                            }
                            hashMap.put(num, yeVar);
                        }
                    }
                }
                x0();
            }
        } else if (i3 == org.telegram.messenger.hs.f23263l4) {
            W(false);
        }
    }

    public final org.telegram.messenger.ye e0(int i3) {
        if (i3 < 0) {
            return null;
        }
        ArrayList arrayList = f31259s1;
        int size = arrayList.size();
        if (i3 < size) {
            return (org.telegram.messenger.ye) arrayList.get(i3);
        }
        int i10 = i3 - size;
        org.telegram.messenger.pe peVar = this.U0;
        if (peVar == null || i10 >= peVar.f24738e.size()) {
            return null;
        }
        return (org.telegram.messenger.ye) this.U0.f24738e.get(i10);
    }

    public final void g0(boolean z10) {
        if (this.O0 && this.Q != null) {
            q0();
            this.R.i();
            this.Q.destroy(z10, null);
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P = null;
            }
            org.telegram.messenger.g0.i3(new al(this, 0), 300L);
            this.f31269d0 = false;
        }
    }

    public ArrayList<Object> getAllPhotosArray() {
        org.telegram.messenger.pe peVar = this.U0;
        ArrayList<Object> arrayList = f31259s1;
        if (peVar != null) {
            if (!arrayList.isEmpty()) {
                ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.U0.f24738e.size());
                arrayList2.addAll(arrayList);
                arrayList2.addAll(this.U0.f24738e);
                return arrayList2;
            }
            return this.U0.f24738e;
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
        return this.f31273f0;
    }

    @Override
    public int getCurrentItemTop() {
        il ilVar = this.F;
        int childCount = ilVar.getChildCount();
        gy gyVar = this.I;
        if (childCount <= 0) {
            ilVar.setTopGlowOffset(ilVar.getPaddingTop());
            gyVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = ilVar.getChildAt(0);
        bj0 bj0Var = (bj0) ilVar.G(childAt);
        int top = childAt.getTop() - this.f31294q1;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || bj0Var == null || bj0Var.b() != 0) {
            top = L;
        }
        gyVar.setTranslationY(((((getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f)) - gyVar.getMeasuredHeight()) / 2.0f) + top);
        ilVar.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.F.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return f31261u1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f31260t1;
    }

    public int getSelectedPhotosCount() {
        int i3 = 0;
        for (Object obj : f31260t1.values()) {
            if (obj instanceof org.telegram.messenger.ye) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                if (!yeVar.f25310b && yeVar.f25325s == null) {
                    i3++;
                }
            }
        }
        return i3;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i3 = 0;
        for (Object obj : f31260t1.values()) {
            if (obj instanceof org.telegram.messenger.ye) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                if (yeVar.c() && !yeVar.f25310b && yeVar.f25325s == null) {
                    i3++;
                }
            }
        }
        return i3;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return f31261u1;
    }

    public long getStarsPrice() {
        Iterator it = f31260t1.entrySet().iterator();
        if (it.hasNext()) {
            return ((org.telegram.messenger.ye) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    public final boolean h0() {
        Activity W = org.telegram.messenger.g0.W(getContext());
        if (W == null) {
            W = this.f38416b.X1.getParentActivity();
        }
        int i3 = Build.VERSION.SDK_INT;
        if (W != null) {
            if (i3 < 33 || (W.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && W.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
                if (i3 >= 33 || W.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void i0() {
        org.telegram.messenger.pe peVar;
        if (t0()) {
            peVar = MediaController.f21294a2;
        } else {
            peVar = MediaController.f21295b2;
        }
        if (peVar == null) {
            MediaController.O(0);
        }
    }

    @Override
    public final int j() {
        return 1;
    }

    public final void j0(int r13, android.content.Intent r14, java.lang.String r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.j0(int, android.content.Intent, java.lang.String):void");
    }

    public final void k0(boolean z10) {
        pl plVar;
        pl plVar2 = this.Q;
        if (plVar2 != null && this.P == null) {
            bi biVar = this.f38416b;
            if (!biVar.J) {
                plVar2.initTexture();
                boolean t02 = t0();
                TextView textView = this.f31296r0;
                int i3 = 0;
                if (t02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f31259s1.isEmpty();
                il ilVar = this.f31295r;
                TextView textView2 = this.f31293q0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    ilVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    ilVar.setVisibility(0);
                }
                if (biVar.a1().f35196w && isFocusable()) {
                    biVar.a1().d();
                }
                j71 j71Var = this.m0;
                j71Var.setVisibility(0);
                j71Var.setAlpha(0.0f);
                ai.o2 o2Var = this.f31283k0;
                o2Var.setVisibility(0);
                o2Var.setTag(null);
                int[] iArr = this.f31275g0;
                iArr[0] = 0;
                int i10 = this.L0;
                iArr[1] = i10;
                iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i10 * 2);
                this.k1 = 0.0f;
                this.f31282j1 = true;
                pl plVar3 = this.Q;
                if (plVar3 != null) {
                    plVar3.setFpsLimit(-1);
                }
                org.telegram.messenger.g0.v1(this);
                org.telegram.messenger.g0.n3(biVar, false);
                setAlertKeepScreenOn(true);
                il ilVar2 = this.F;
                ImageView[] imageViewArr = this.T;
                if (z10) {
                    setCameraOpenProgress(0.0f);
                    this.f31271e0 = true;
                    if (ilVar2 != null) {
                        ilVar2.invalidate();
                    }
                    this.f31276g1.d();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(o2Var, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(ilVar, property, 1.0f));
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
                    animatorSet.setInterpolator(xq.f40452f);
                    animatorSet.addListener(new hl(this, 2));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    o2Var.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    ilVar.setAlpha(1.0f);
                    while (true) {
                        if (i3 >= 2) {
                            break;
                        } else if (imageViewArr[i3].getVisibility() == 0) {
                            imageViewArr[i3].setAlpha(1.0f);
                            break;
                        } else {
                            i3++;
                        }
                    }
                    biVar.U3.v0();
                    pl plVar4 = this.Q;
                    if (plVar4 != null) {
                        plVar4.setSystemUiVisibility(1028);
                    }
                }
                this.f31267c0 = true;
                pl plVar5 = this.Q;
                if (plVar5 != null) {
                    plVar5.setImportantForAccessibility(2);
                }
                ilVar2.setImportantForAccessibility(4);
                ilVar2.invalidate();
                if (!org.telegram.messenger.lc.e(360928) && (plVar = this.Q) != null && plVar.isInited()) {
                    this.Q.showTexture(true, z10);
                }
            }
        }
    }

    @Override
    public final void l() {
        X();
        invalidate();
    }

    public final void l0() {
        if (org.telegram.messenger.az.f21679y0) {
            k0(true);
            return;
        }
        bi biVar = this.f38416b;
        zh zhVar = biVar.U3;
        if (zhVar != null) {
            zhVar.o1(0, false, true, 0, 0, 0L, biVar.f1(), false, 0L);
        }
    }

    @Override
    public final void m(float f10) {
        this.X0 = f10;
        X();
        pl plVar = this.Q;
        if (plVar != null) {
            plVar.invalidateOutline();
            this.Q.invalidate();
        }
        invalidate();
    }

    public final void m0(org.telegram.messenger.ye yeVar, boolean z10, boolean z11) {
        int i3;
        org.telegram.ui.wm wmVar;
        org.telegram.ui.wm wmVar2;
        ArrayList<Object> arrayList;
        int i10;
        ArrayList arrayList2 = f31259s1;
        bi biVar = this.f38416b;
        if (yeVar != null) {
            int i11 = yeVar.C;
            arrayList2.add(yeVar);
            f31260t1.put(Integer.valueOf(i11), yeVar);
            f31261u1.add(Integer.valueOf(i11));
            biVar.K1(0);
            this.H.f();
            this.f31302w.f();
        }
        if (yeVar != null && !z11 && arrayList2.size() > 1) {
            B0(false);
            if (this.Q != null) {
                this.m0.b(false, 0.0f);
                this.C0 = 0.0f;
                this.Q.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f31300u0 = true;
            org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
            org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
            if (d2Var == null) {
                d2Var = LaunchActivity.Q();
            }
            if (d2Var != null) {
                PhotoViewer.v1().N2(d2Var.getParentActivity(), null, this.f38415a);
                PhotoViewer.v1().O2(biVar);
                PhotoViewer v12 = PhotoViewer.v1();
                int i12 = biVar.N3;
                boolean z12 = biVar.O3;
                v12.h = i12;
                v12.f41486n = z12;
                if (biVar.f32290x1 && biVar.f32294y1) {
                    wmVar = (org.telegram.ui.wm) d2Var2;
                    i3 = 11;
                } else {
                    if (biVar.L2 != 0) {
                        i3 = 1;
                    } else if (d2Var2 instanceof org.telegram.ui.wm) {
                        wmVar = (org.telegram.ui.wm) d2Var2;
                        i3 = 2;
                    } else {
                        i3 = 5;
                    }
                    wmVar = null;
                }
                boolean z13 = biVar.f32298z1;
                if (z13) {
                    i3 = 13;
                    wmVar2 = null;
                } else {
                    wmVar2 = wmVar;
                }
                int i13 = i3;
                if (biVar.L2 == 0 && !z13) {
                    arrayList = getAllPhotosArray();
                    i10 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(yeVar);
                    i10 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                d30 d30Var = biVar.I1;
                if (d30Var != null && yeVar != null) {
                    d30Var.f32926e = yeVar.f25310b;
                }
                PhotoViewer.v1().j2(arrayList3, i10, i13, false, new jl(this, z10), wmVar2);
                PhotoViewer.v1().A2(biVar.I1);
                if (biVar.f32294y1) {
                    PhotoViewer.v1().Z0(null, null, false, biVar.B1);
                    PhotoViewer.v1().p2();
                }
            }
        }
    }

    public final void n0() {
        try {
            if (this.Q != null) {
                CameraController.getInstance().stopPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean o(MotionEvent motionEvent) {
        pl plVar;
        if (!this.f31271e0) {
            if (this.f31267c0 && motionEvent != null) {
                boolean z10 = this.H0;
                j71 j71Var = this.m0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.F0;
                    j71Var.getHitRect(rect);
                    if (j71Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f31299t0 && !this.J0) {
                            if (motionEvent.getPointerCount() == 2) {
                                this.B0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                this.D0 = true;
                            } else {
                                this.I0 = true;
                                this.G0 = motionEvent.getY();
                                this.D0 = false;
                            }
                            this.E0 = false;
                            this.H0 = true;
                            return true;
                        }
                    }
                } else if (this.H0) {
                    int actionMasked = motionEvent.getActionMasked();
                    il ilVar = this.f31295r;
                    TextView textView = this.f31293q0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.T;
                    ai.o2 o2Var = this.f31283k0;
                    if (actionMasked == 2) {
                        if (this.D0 && motionEvent.getPointerCount() == 2 && !this.J0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (!this.E0) {
                                if (Math.abs(hypot - this.B0) >= org.telegram.messenger.g0.a1(false, 0.4f)) {
                                    this.B0 = hypot;
                                    this.E0 = true;
                                    return true;
                                }
                            } else if (this.Q != null) {
                                this.B0 = hypot;
                                float L = this.C0 + ((hypot - this.B0) / org.telegram.messenger.g0.L(100.0f));
                                this.C0 = L;
                                if (L < 0.0f) {
                                    this.C0 = 0.0f;
                                } else if (L > 1.0f) {
                                    this.C0 = 1.0f;
                                }
                                j71Var.b(false, this.C0);
                                this.f38416b.f28586b.invalidate();
                                this.Q.setZoom(this.C0);
                                w0(true);
                                return true;
                            }
                        } else {
                            float y9 = motionEvent.getY();
                            float f10 = y9 - this.G0;
                            if (this.I0) {
                                if (Math.abs(f10) > org.telegram.messenger.g0.a1(false, 0.4f)) {
                                    this.I0 = false;
                                    this.J0 = true;
                                    return true;
                                }
                            } else if (this.J0 && (plVar = this.Q) != null) {
                                plVar.setTranslationY(plVar.getTranslationY() + f10);
                                this.G0 = y9;
                                j71Var.setTag(null);
                                Runnable runnable = this.f31289o0;
                                if (runnable != null) {
                                    org.telegram.messenger.g0.r(runnable);
                                    this.f31289o0 = null;
                                }
                                if (o2Var.getTag() == null) {
                                    o2Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(o2Var, property, 0.0f), ObjectAnimator.ofFloat(j71Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(ilVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(xq.f40452f);
                                    animatorSet.start();
                                    return true;
                                }
                            }
                        }
                    } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                        this.H0 = false;
                        this.D0 = false;
                        if (this.J0) {
                            this.J0 = false;
                            pl plVar2 = this.Q;
                            if (plVar2 != null) {
                                if (Math.abs(plVar2.getTranslationY()) > this.Q.getMeasuredHeight() / 6.0f) {
                                    d0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(o2Var, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(ilVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f31281j0);
                                animatorSet2.start();
                                o2Var.setTag(null);
                                return true;
                            }
                        } else {
                            pl plVar3 = this.Q;
                            if (plVar3 != null && !this.E0) {
                                int[] iArr = this.W;
                                plVar3.getLocationOnScreen(iArr);
                                this.Q.focusToPoint((int) (motionEvent.getRawX() - iArr[0]), (int) (motionEvent.getRawY() - iArr[1]));
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void o0() {
        if (this.f38416b.N1) {
            return;
        }
        for (int i3 = 0; i3 < 2; i3++) {
            this.T[i3].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(xq.f40452f).start();
        }
        ViewPropertyAnimator duration = this.f31298s0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        xq xqVar = xq.f40452f;
        duration.setInterpolator(xqVar).start();
        this.f31296r0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
        org.telegram.messenger.g0.X3(this.S, false);
        org.telegram.messenger.g0.r(this.f31279i0);
        this.f31279i0 = null;
        org.telegram.messenger.g0.Q3(org.telegram.messenger.g0.W(getContext()));
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
        if (this.T0 != i13) {
            this.T0 = i13;
            sl slVar = this.H;
            if (slVar != null) {
                slVar.f();
            }
        }
        super.onLayout(z10, i3, i10, i11, i12);
        X();
    }

    @Override
    public final void p() {
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23263l4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23295r2);
    }

    public final void p0() {
        try {
            W(false);
            if (this.Q != null) {
                CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean q() {
        if (this.f31271e0) {
            return true;
        }
        if (this.f31267c0) {
            d0(true);
            return true;
        }
        g0(true);
        return false;
    }

    public final void q0() {
        if (this.f31269d0) {
            try {
                Bitmap bitmap = this.Q.getTextureView().getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.Q.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "cthumb.jpg"));
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
    public final void r(int i3) {
        boolean z10;
        if (i3 != 0 && i3 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0(z10);
    }

    @Override
    public final void requestLayout() {
        if (this.S0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(int i3, final boolean z10) {
        PhotoViewer v12 = PhotoViewer.v1();
        if (i3 == -1) {
            i3 = v12.Q4;
        }
        ArrayList arrayList = v12.h7;
        if (arrayList != null && !arrayList.isEmpty() && i3 < arrayList.size() && (arrayList.get(i3) instanceof org.telegram.messenger.ye) && ((org.telegram.messenger.ye) arrayList.get(i3)).M) {
            final org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) arrayList.get(i3);
            this.F.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z11 = ChatAttachAlertPhotoLayout.f31258r1;
                    if (view instanceof org.telegram.ui.Cells.q5) {
                        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                        if (q5Var.getPhotoEntry() == yeVar) {
                            q5Var.c(z10, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z12 = true;
                            if (ChatAttachAlertPhotoLayout.f31260t1.size() <= 1) {
                                z12 = false;
                            }
                            q5Var.f(starsPrice, z12);
                        }
                    }
                }
            });
        }
    }

    public void setCameraOpenProgress(float f10) {
        int i3;
        int i10;
        if (this.Q == null) {
            return;
        }
        this.f31273f0 = f10;
        int[] iArr = this.f31275g0;
        float f11 = iArr[1];
        float f12 = iArr[2];
        int i11 = org.telegram.messenger.g0.f22608q.x;
        bi biVar = this.f38416b;
        float width = biVar.f28589c.getWidth();
        float height = biVar.f28589c.getHeight();
        float[] fArr = this.V;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = this.k1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
        float textureHeight = this.Q.getTextureHeight(f11, f12) / this.Q.getTextureHeight(width, height);
        float f16 = f12 / height;
        float f17 = f11 / width;
        if (this.f31282j1) {
            i3 = (int) width;
            i10 = (int) height;
            float f18 = 1.0f - f10;
            float f19 = (textureHeight * f18) + f10;
            this.Q.getTextureView().setScaleX(f19);
            this.Q.getTextureView().setScaleY(f19);
            float f20 = f13 * f18;
            this.Q.setTranslationX(((0.0f * f10) + f20) - (((1.0f - ((f17 * f18) + f10)) * width) / 2.0f));
            float f21 = f14 * f18;
            this.Q.setTranslationY(((f15 * f10) + f21) - (((1.0f - ((f16 * f18) + f10)) * height) / 2.0f));
            this.f31285l1 = f21 - this.Q.getTranslationY();
            this.m1 = (height * f10) + (((f14 + f12) * f18) - this.Q.getTranslationY());
            this.f31290o1 = f20 - this.Q.getTranslationX();
            this.f31288n1 = (width * f10) + (((f13 + f11) * f18) - this.Q.getTranslationX());
        } else {
            i3 = (int) f11;
            i10 = (int) f12;
            this.Q.getTextureView().setScaleX(1.0f);
            this.Q.getTextureView().setScaleY(1.0f);
            this.f31285l1 = 0.0f;
            this.m1 = height;
            this.f31290o1 = 0.0f;
            this.f31288n1 = width;
            this.Q.setTranslationX(f13);
            this.Q.setTranslationY(f14);
        }
        if (layoutParams.width != i3 || layoutParams.height != i10) {
            layoutParams.width = i3;
            layoutParams.height = i10;
            this.Q.requestLayout();
        }
        this.Q.invalidateOutline();
        this.Q.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z10) {
        this.f31301v0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.f31308z0 = z10;
    }

    public void setStarsPrice(long j10) {
        boolean z10;
        HashMap hashMap = f31260t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                yeVar.N = j10;
                if (j10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yeVar.M = z10;
                yeVar.R = false;
            }
        }
        D(getSelectedItemsCount());
        if (Z(false)) {
            A0();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        bi biVar = this.f38416b;
        if (biVar.B0 == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            il ilVar = this.F;
            int childCount = ilVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = ilVar.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    float f12 = 1.0f + f11;
                    q5Var.getCheckBox().setScaleX(f12);
                    q5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        biVar.f28586b.invalidate();
        invalidate();
    }

    @Override
    public final void t() {
        pl plVar = this.Q;
        if (plVar != null) {
            plVar.setVisibility(8);
        }
        for (Map.Entry entry : f31260t1.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.ye) {
                ((org.telegram.messenger.ye) entry.getValue()).getClass();
            }
        }
        this.H.f();
    }

    public final boolean t0() {
        if (!this.f31308z0) {
            bi biVar = this.f38416b;
            if (!biVar.f32290x1) {
                if (!(biVar.X1 instanceof org.telegram.ui.wm) && !biVar.O2 && biVar.L2 != 2) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void u() {
        this.O = true;
        il ilVar = this.F;
        int childCount = ilVar.getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            } else if (ilVar.getChildAt(i3) instanceof org.telegram.ui.Cells.k5) {
                q0();
                break;
            } else {
                this.R.i();
                i3++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f31292p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f31306y.animate().alpha(0.0f).setDuration(150L).setInterpolator(xq.f40455j).withEndAction(new al(this, 3));
        this.f31292p1 = withEndAction;
        withEndAction.start();
        n0();
    }

    public final void u0(t8 t8Var, TLRPC.VideoSize videoSize, long j10) {
        boolean z10;
        bi biVar = this.f38416b;
        r8 r8Var = new r8(biVar.M1, biVar.I1);
        d30 d30Var = biVar.I1;
        if (d30Var != null && d30Var.f32925c == 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        r8Var.R = z10;
        biVar.X1.presentFragment(r8Var);
        if (t8Var != null) {
            r8Var.r0(t8Var);
        }
        if (videoSize != null) {
            r8Var.q0(videoSize);
        }
        if (j10 != 0) {
            r8Var.p0(j10);
        }
        r8Var.J = new org.telegram.ui.jo(17, this, r8Var);
    }

    @Override
    public final void v(float f10) {
        pl plVar = this.Q;
        if (plVar != null) {
            plVar.setAlpha(f10);
            int i3 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i3 != 0 && this.Q.getVisibility() != 0) {
                this.Q.setVisibility(0);
            } else if (i3 == 0 && this.Q.getVisibility() != 4) {
                this.Q.setVisibility(4);
            }
        }
    }

    public final void v0() {
        boolean z10;
        boolean z11;
        float f10;
        bi biVar = this.f38416b;
        if (!biVar.f32214a4 && this.f31303w0 && CameraView.isCameraAllowed()) {
            if (this.Q == null) {
                boolean z12 = !org.telegram.messenger.lc.e(360928);
                Context context = getContext();
                Boolean bool = this.f31291p0;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = biVar.P3;
                }
                pl plVar = new pl(this, context, z10, z12);
                this.Q = plVar;
                org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                if ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).z()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                plVar.setRecordFile(org.telegram.messenger.g0.s0(z11));
                this.Q.setFocusable(true);
                this.Q.setFpsLimit(30);
                this.Q.setOutlineProvider(new gh.a(this, 2));
                this.Q.setClipToOutline(true);
                this.Q.setContentDescription(org.telegram.messenger.bd.M0(2131754852, null));
                org.telegram.ui.ActionBar.j2 j2Var = biVar.f28589c;
                pl plVar2 = this.Q;
                int i3 = this.L0;
                j2Var.addView(plVar2, 1, new FrameLayout.LayoutParams(i3, i3));
                this.Q.setDelegate(new kl(this));
                pl plVar3 = this.Q;
                if (this.f31303w0) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                plVar3.setAlpha(f10);
                this.Q.setEnabled(this.f31303w0);
                if (this.O) {
                    this.Q.setVisibility(8);
                }
                if (!this.f31267c0) {
                    X();
                }
                il ilVar = this.F;
                if (ilVar != null) {
                    ilVar.invalidate();
                }
                invalidate();
            }
            j71 j71Var = this.m0;
            if (j71Var != null) {
                j71Var.b(false, 0.0f);
                this.C0 = 0.0f;
            }
            if (!this.f31267c0) {
                this.Q.setTranslationX(this.V[0]);
            }
        }
    }

    @Override
    public final void w(int i3) {
        TLRPC.Chat Y0;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        bi biVar = this.f38416b;
        if (i3 == 8) {
            biVar.v1(!biVar.U1, true);
            this.f31272e1.a(!biVar.U1, true);
        } else if ((i3 == 0 || i3 == 1) && biVar.N3 > 0 && f31261u1.size() > 1 && (Y0 = biVar.Y0()) != null && !org.telegram.messenger.t3.N(Y0) && Y0.slowmode_enabled) {
            t4.N(getContext(), org.telegram.messenger.bd.M0(2131745320, null), org.telegram.messenger.bd.M0(2131745312, null), null, null, this.f38415a).p();
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.f38415a;
            HashMap hashMap = f31260t1;
            if (i3 == 0) {
                org.telegram.messenger.zi ziVar = biVar.C3;
                org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                if (ziVar == null && (d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).c()) {
                    t4.L(getContext(), ((org.telegram.ui.wm) d2Var).a(), new wk(this, 0), e6Var);
                } else {
                    t4.Z(biVar.E3, biVar.X0() + hashMap.size(), biVar.b1(), new org.telegram.messenger.u10(this) {
                        public final ChatAttachAlertPhotoLayout f40386b;

                        {
                            this.f40386b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            int i10 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40386b;
                            Long l10 = (Long) obj;
                            switch (i10) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f31258r1;
                                    bi biVar2 = chatAttachAlertPhotoLayout.f38416b;
                                    biVar2.M0();
                                    biVar2.U3.o1(7, false, true, 0, 0, 0L, biVar2.f1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f31258r1;
                                    bi biVar3 = chatAttachAlertPhotoLayout.f38416b;
                                    biVar3.M0();
                                    biVar3.U3.o1(4, true, true, 0, 0, 0L, biVar3.f1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i3 == 1) {
                org.telegram.messenger.zi ziVar2 = biVar.C3;
                org.telegram.ui.ActionBar.d2 d2Var2 = biVar.X1;
                if (ziVar2 == null && (d2Var2 instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var2).c()) {
                    t4.L(getContext(), ((org.telegram.ui.wm) d2Var2).a(), new wk(this, 1), e6Var);
                } else {
                    t4.Z(biVar.E3, biVar.X0() + hashMap.size(), biVar.b1(), new org.telegram.messenger.u10(this) {
                        public final ChatAttachAlertPhotoLayout f40386b;

                        {
                            this.f40386b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            int i10 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40386b;
                            Long l10 = (Long) obj;
                            switch (i10) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f31258r1;
                                    bi biVar2 = chatAttachAlertPhotoLayout.f38416b;
                                    biVar2.M0();
                                    biVar2.U3.o1(7, false, true, 0, 0, 0L, biVar2.f1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f31258r1;
                                    bi biVar3 = chatAttachAlertPhotoLayout.f38416b;
                                    biVar3.M0();
                                    biVar3.U3.o1(4, true, true, 0, 0, 0L, biVar3.f1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                sl slVar = this.H;
                il ilVar = this.F;
                if (i3 == 3) {
                    am amVar = biVar.f32235i2;
                    if (amVar != null) {
                        amVar.O();
                    }
                    Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((org.telegram.messenger.ye) ((Map.Entry) it.next()).getValue()).M) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    final boolean z13 = !z11;
                    org.telegram.messenger.g0.i3(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout f40759b;

                        {
                            this.f40759b = this;
                        }

                        @Override
                        public final void run() {
                            int i10;
                            int i11;
                            int i12 = r3;
                            boolean z14 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40759b;
                            switch (i12) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f31258r1;
                                    bi biVar2 = chatAttachAlertPhotoLayout.f38416b;
                                    org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.Z0;
                                    if (z14) {
                                        i10 = 2131751431;
                                    } else {
                                        i10 = 2131751155;
                                    }
                                    y0Var.setText(org.telegram.messenger.bd.M0(i10, null));
                                    if (z14) {
                                        y0Var.setIcon(2131232377);
                                    } else {
                                        y0Var.setAnimatedIcon(2131624131);
                                    }
                                    if (z14) {
                                        biVar2.V2.t(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            biVar2.V2.t(6);
                                            return;
                                        }
                                        return;
                                    }
                                    biVar2.V2.S(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        biVar2.V2.S(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.y0 y0Var2 = chatAttachAlertPhotoLayout.f31266b1;
                                    if (z14) {
                                        i11 = 2131745630;
                                    } else {
                                        i11 = 2131745631;
                                    }
                                    y0Var2.setText(org.telegram.messenger.bd.M0(i11, null));
                                    if (z14) {
                                        y0Var2.setIcon(2131231868);
                                        return;
                                    } else {
                                        y0Var2.setIcon(2131231865);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (entry.getValue() instanceof org.telegram.messenger.ye) {
                            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) entry.getValue();
                            yeVar.M = z13;
                            yeVar.R = false;
                            arrayList.add(Integer.valueOf(yeVar.C));
                        }
                    }
                    ilVar.M(new zk(0, arrayList, z13));
                    if (biVar.f32275t2 != this) {
                        slVar.f();
                    }
                    am amVar2 = biVar.f32235i2;
                    if (amVar2 != null) {
                        amVar2.f31898w.invalidate();
                    }
                } else if (i3 == 2) {
                    am amVar3 = biVar.f32235i2;
                    if (amVar3 != null) {
                        amVar3.O();
                    }
                    Iterator it2 = hashMap.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((org.telegram.messenger.ye) ((Map.Entry) it2.next()).getValue()).c()) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    final boolean z14 = !z10;
                    org.telegram.messenger.g0.i3(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout f40759b;

                        {
                            this.f40759b = this;
                        }

                        @Override
                        public final void run() {
                            int i10;
                            int i11;
                            int i12 = r3;
                            boolean z142 = z14;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40759b;
                            switch (i12) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f31258r1;
                                    bi biVar2 = chatAttachAlertPhotoLayout.f38416b;
                                    org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.Z0;
                                    if (z142) {
                                        i10 = 2131751431;
                                    } else {
                                        i10 = 2131751155;
                                    }
                                    y0Var.setText(org.telegram.messenger.bd.M0(i10, null));
                                    if (z142) {
                                        y0Var.setIcon(2131232377);
                                    } else {
                                        y0Var.setAnimatedIcon(2131624131);
                                    }
                                    if (z142) {
                                        biVar2.V2.t(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            biVar2.V2.t(6);
                                            return;
                                        }
                                        return;
                                    }
                                    biVar2.V2.S(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        biVar2.V2.S(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.y0 y0Var2 = chatAttachAlertPhotoLayout.f31266b1;
                                    if (z142) {
                                        i11 = 2131745630;
                                    } else {
                                        i11 = 2131745631;
                                    }
                                    y0Var2.setText(org.telegram.messenger.bd.M0(i11, null));
                                    if (z142) {
                                        y0Var2.setIcon(2131231868);
                                        return;
                                    } else {
                                        y0Var2.setIcon(2131231865);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        if (entry2.getValue() instanceof org.telegram.messenger.ye) {
                            org.telegram.messenger.ye yeVar2 = (org.telegram.messenger.ye) entry2.getValue();
                            yeVar2.f25331z = Boolean.valueOf(z14);
                            yeVar2.R = false;
                            arrayList2.add(Integer.valueOf(yeVar2.C));
                        }
                    }
                    ilVar.M(new zk(1, arrayList2, z14));
                    if (biVar.f32275t2 != this) {
                        slVar.f();
                    }
                    am amVar4 = biVar.f32235i2;
                    if (amVar4 != null) {
                        amVar4.f31898w.invalidate();
                    }
                } else if (i3 == 4) {
                    try {
                        if (t0()) {
                            Intent intent = new Intent();
                            intent.setType("video/*");
                            intent.setAction("android.intent.action.GET_CONTENT");
                            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                            Intent intent2 = new Intent("android.intent.action.PICK");
                            intent2.setType("image/*");
                            Intent createChooser = Intent.createChooser(intent2, null);
                            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                            int i10 = biVar.L2;
                            org.telegram.ui.ActionBar.d2 d2Var3 = biVar.X1;
                            if (i10 != 0) {
                                d2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                d2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i11 = biVar.L2;
                            org.telegram.ui.ActionBar.d2 d2Var4 = biVar.X1;
                            if (i11 != 0) {
                                d2Var4.startActivityForResult(intent3, 14);
                            } else {
                                d2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        biVar.a(true);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i3 == 7) {
                    if (biVar.f32275t2 == biVar.f32235i2) {
                        z12 = false;
                    }
                    biVar.O1(z12);
                } else if (i3 == 9) {
                    ci.wb.j1(getContext(), getStarsPrice(), true, new e(this, 6), this.f38415a);
                } else if (i3 >= 10) {
                    org.telegram.messenger.pe peVar = (org.telegram.messenger.pe) this.W0.get(i3 - 10);
                    this.U0 = peVar;
                    org.telegram.messenger.pe peVar2 = this.V0;
                    TextView textView = this.f31306y;
                    if (peVar == peVar2) {
                        textView.setText(org.telegram.messenger.bd.M0(2131752238, null));
                    } else {
                        textView.setText(peVar.f24737c);
                    }
                    slVar.f();
                    this.f31302w.f();
                    this.G.h1(0, -(ilVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void w0(boolean z10) {
        Integer num;
        float f10;
        j71 j71Var = this.m0;
        if ((j71Var.getTag() != null && z10) || (j71Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f31289o0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                al alVar = new al(this, 1);
                this.f31289o0 = alVar;
                org.telegram.messenger.g0.i3(alVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f31287n0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        j71Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31287n0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.f31287n0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(j71Var, View.ALPHA, f10));
        this.f31287n0.addListener(new hl(this, 1));
        this.f31287n0.start();
        if (z10) {
            al alVar2 = new al(this, 2);
            this.f31289o0 = alVar2;
            org.telegram.messenger.g0.i3(alVar2, 2000L);
        }
    }

    @Override
    public final void x() {
        boolean z10;
        bi biVar = this.f38416b;
        if (biVar != null && (biVar.X1 instanceof org.telegram.ui.wm)) {
            z10 = true;
        } else {
            z10 = false;
        }
        W(z10);
    }

    public final void x0() {
        ArrayList arrayList;
        gi.u2 u2Var = this.f31304x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u2Var.f28440b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f31303w0) {
            if (t0()) {
                arrayList = MediaController.c2;
            } else {
                arrayList = MediaController.f21296d2;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.W0 = arrayList2;
            Collections.sort(arrayList2, new dl(arrayList, 0));
        } else {
            this.W0 = new ArrayList();
        }
        boolean isEmpty = this.W0.isEmpty();
        TextView textView = this.f31306y;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.W0.size();
        for (int i3 = 0; i3 < size; i3++) {
            org.telegram.messenger.pe peVar = (org.telegram.messenger.pe) this.W0.get(i3);
            gi.a aVar = new gi.a(getContext(), peVar.d, peVar.f24737c, peVar.f24738e.size(), this.f38415a);
            u2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new bi.q(this, i3 + 10, 11));
        }
    }

    public final void y0() {
        il ilVar = this.F;
        if (ilVar != null) {
            for (int i3 = 0; i3 < ilVar.getChildCount(); i3++) {
                View childAt = ilVar.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    ((org.telegram.ui.Cells.q5) childAt).f30204a.invalidate();
                }
            }
        }
    }

    @Override
    public final void z(int i3, boolean z10) {
        X();
        pl plVar = this.Q;
        if (plVar != null) {
            plVar.invalidateOutline();
            this.Q.invalidate();
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (this.f38416b.X1 instanceof org.telegram.ui.wm) {
            il ilVar = this.F;
            int childCount = ilVar.getChildCount();
            int i3 = 0;
            while (true) {
                arrayList = f31261u1;
                if (i3 >= childCount) {
                    break;
                }
                View childAt = ilVar.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    org.telegram.messenger.ye e02 = e0(((Integer) q5Var.getTag()).intValue());
                    if (e02 != null) {
                        q5Var.setNum(arrayList.indexOf(Integer.valueOf(e02.C)));
                    }
                }
                i3++;
            }
            il ilVar2 = this.f31295r;
            int childCount2 = ilVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = ilVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    org.telegram.messenger.ye e03 = e0(((Integer) q5Var2.getTag()).intValue());
                    if (e03 != null) {
                        q5Var2.setNum(arrayList.indexOf(Integer.valueOf(e03.C)));
                    }
                }
            }
        }
    }
}
