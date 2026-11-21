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
public class ChatAttachAlertPhotoLayout extends mi implements org.telegram.messenger.fs {
    public static boolean f32795r1;
    public static final ArrayList f32796s1 = new ArrayList();
    public static final HashMap f32797t1 = new HashMap();
    public static final ArrayList f32798u1 = new ArrayList();
    public static int f32799v1 = -1;
    public boolean A0;
    public float B0;
    public float C0;
    public boolean D0;
    public final Drawable E;
    public boolean E0;
    public final zl F;
    public final Rect F0;
    public final gi.g G;
    public float G0;
    public final jm H;
    public boolean H0;
    public final vy I;
    public boolean I0;
    public final ik0 J;
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
    public gm Q;
    public boolean Q0;
    public final hm R;
    public boolean R0;
    public final em S;
    public boolean S0;
    public final ImageView[] T;
    public int T0;
    public boolean U;
    public org.telegram.messenger.ue U0;
    public final float[] V;
    public org.telegram.messenger.ue V0;
    public final int[] W;
    public ArrayList W0;
    public float X0;
    public boolean Y0;
    public final org.telegram.ui.ActionBar.y0 Z0;
    public float f32800a0;
    public final org.telegram.ui.ActionBar.y0 f32801a1;
    public float f32802b0;
    public final org.telegram.ui.ActionBar.y0 f32803b1;
    public boolean f32804c0;
    public final org.telegram.ui.ActionBar.y0 f32805c1;
    public boolean f32806d0;
    public final org.telegram.ui.ActionBar.y0 f32807d1;
    public boolean f32808e0;
    public final va0 f32809e1;
    public float f32810f0;
    public final boolean f32811f1;
    public final int[] f32812g0;
    public final h2.f f32813g1;
    public int f32814h0;
    public boolean f32815h1;
    public wl f32816i0;
    public final cm f32817i1;
    public final DecelerateInterpolator f32818j0;
    public boolean f32819j1;
    public final bi.e3 f32820k0;
    public float f32821k1;
    public final ShutterButton f32822l0;
    public float l1;
    public final f81 m0;
    public float f32823m1;
    public final boolean f32824n;
    public AnimatorSet f32825n0;
    public float n1;
    public Runnable f32826o0;
    public float f32827o1;
    public Boolean f32828p0;
    public ViewPropertyAnimator f32829p1;
    public final TextView f32830q0;
    public int f32831q1;
    public final zl f32832r;
    public final TextView f32833r0;
    public final jg.b0 f32834s;
    public final ImageView f32835s0;
    public boolean f32836t0;
    public boolean f32837u0;
    public boolean f32838v0;
    public final jm f32839w;
    public boolean f32840w0;
    public final hi.u2 f32841x;
    public boolean f32842x0;
    public final TextView f32843y;
    public boolean f32844y0;
    public boolean f32845z0;

    public ChatAttachAlertPhotoLayout(ui uiVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, uiVar);
        boolean z12;
        this.T = new ImageView[2];
        this.V = new float[2];
        this.W = new int[2];
        this.f32812g0 = new int[5];
        this.f32818j0 = new DecelerateInterpolator(1.5f);
        this.f32828p0 = null;
        this.F0 = new Rect();
        int L = org.telegram.messenger.g0.L(80.0f);
        this.L0 = L;
        this.M0 = L;
        this.N0 = 3;
        this.Y0 = true;
        this.f32813g1 = new h2.f((int[]) null);
        this.f32817i1 = new cm(this);
        this.f32811f1 = z10;
        this.f32824n = z11;
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25208r2);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.o4);
        org.telegram.ui.ActionBar.m2 m2Var = uiVar.f30176c;
        ui uiVar2 = this.f37521b;
        if (uiVar2.O2 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f32815h1 = z12;
        hi.u2 u2Var = new hi.u2(this, context, uiVar2.V2.s(), h6Var, 1);
        this.f32841x = u2Var;
        u2Var.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = c8.ma.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = org.telegram.messenger.g0.f24140m;
        this.f37521b.V2.addView(u2Var, 0, d);
        u2Var.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f37892b;

            {
                this.f37892b = this;
            }

            @Override
            public final void onClick(View view) {
                gm gmVar;
                gm gmVar2;
                int i7 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37892b;
                switch (i7) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f32836t0 && (gmVar = chatAttachAlertPhotoLayout.Q) != null && gmVar.isInited()) {
                            chatAttachAlertPhotoLayout.f32806d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f32835s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new yl(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (gmVar2 = chatAttachAlertPhotoLayout.Q) != null && gmVar2.isInited() && chatAttachAlertPhotoLayout.f32804c0) {
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
                                animatorSet.setInterpolator(nr.f37956f);
                                animatorSet.addListener(new fi.a3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f32841x.V(null, null);
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
        this.f32843y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = org.telegram.ui.ActionBar.m6.f29486j5;
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        textView.setText(org.telegram.messenger.gd.N0(2131752226, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        Drawable g10 = i5.c.g(context, 2131231253);
        this.E = g10;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.x(this, g10, i7, h6Var, mode);
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
        u2Var.addView(textView, c8.ma.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        X(false);
        va0 va0Var = new va0(context, 2131624140, org.telegram.messenger.gd.N0(2131752548, null), 2131624139, org.telegram.messenger.gd.N0(2131752547, null), h6Var);
        this.f32809e1 = va0Var;
        va0Var.a(!this.f37521b.X1, false);
        this.f32807d1 = this.f37521b.Y2.e(7, 2131232422, org.telegram.messenger.gd.N0(2131753954, null));
        this.f37521b.Y2.a(5);
        this.f37521b.Y2.e(4, 2131232267, org.telegram.messenger.gd.N0(2131747602, null));
        this.f32801a1 = this.f37521b.Y2.e(1, 2131232134, org.telegram.messenger.gd.N0(2131745389, null));
        this.f37521b.Y2.e(0, 2131232413, org.telegram.messenger.gd.N0(2131745388, null));
        this.f37521b.Y2.a(6);
        this.Z0 = this.f37521b.Y2.e(3, 2131232378, org.telegram.messenger.gd.N0(2131751142, null));
        this.f32803b1 = this.f37521b.Y2.e(2, 2131231866, org.telegram.messenger.gd.N0(2131745425, null));
        org.telegram.ui.ActionBar.q0 q0Var = this.f37521b.Y2;
        q0Var.q();
        va0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        va0Var.setTag(8);
        q0Var.f29899b.addView(va0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) va0Var.getLayoutParams();
        if (org.telegram.messenger.gd.f24241a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        va0Var.setLayoutParams(layoutParams);
        va0Var.setOnClickListener(new org.telegram.ui.ActionBar.z(q0Var, 2));
        this.f32805c1 = this.f37521b.Y2.e(9, 2131231810, org.telegram.messenger.gd.N0(2131747536, null));
        this.f37521b.Y2.setFitSubItems(true);
        zl zlVar = new zl(this, context, h6Var, 1);
        this.F = zlVar;
        zlVar.setFastScrollEnabled(1);
        zlVar.setFastScrollVisible(true);
        zlVar.getFastScroll().setAlpha(0.0f);
        zlVar.getFastScroll().f36528a = false;
        zlVar.getFastScroll().f36541i0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        jm jmVar = new jm(this, context, z11);
        this.H = jmVar;
        zlVar.setAdapter(jmVar);
        hm hmVar = new hm(this, zlVar);
        this.R = hmVar;
        zlVar.i(hmVar);
        int i10 = 0;
        for (int i11 = 8; i10 < i11; i11 = 8) {
            jmVar.h.add(jmVar.L());
            i10++;
        }
        zlVar.setClipToPadding(false);
        zlVar.setItemAnimator(null);
        zlVar.setLayoutAnimation(null);
        zlVar.setVerticalScrollBarEnabled(false);
        org.telegram.ui.ActionBar.t6.l(zlVar, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        addView(zlVar, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        zlVar.setOnScrollListener(new hi.e8(1, this));
        gi.g gVar = new gi.g(this, this.L0, 3);
        this.G = gVar;
        gVar.O = new bi.w2(this, 10);
        zlVar.setLayoutManager(gVar);
        zlVar.setOnItemClickListener(new ab.j(this, z11, h6Var, 7));
        zlVar.setOnItemLongClickListener(new ol(this, 2));
        ik0 ik0Var = new ik0(new org.telegram.ui.Cells.c5(this));
        this.J = ik0Var;
        zlVar.F.add(ik0Var);
        setBlur3Capture(zlVar);
        this.d = zlVar;
        this.f37524f = true;
        vy vyVar = new vy(context, h6Var);
        this.I = vyVar;
        vyVar.setText(org.telegram.messenger.gd.N0(2131747987, null));
        vyVar.setOnTouchListener(null);
        vyVar.setTextSize(16);
        addView(vyVar, c8.ma.c(-2.0f, -1));
        if (this.Y0) {
            vyVar.b();
        } else {
            vyVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        em emVar = new em(context, paint);
        this.S = emVar;
        org.telegram.messenger.g0.X3(emVar, false, 1.0f, true, false);
        emVar.setBackgroundResource(2131232773);
        emVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        emVar.setTextSize(1, 15.0f);
        emVar.setTypeface(org.telegram.messenger.g0.o());
        emVar.setAlpha(0.0f);
        emVar.setTextColor(-1);
        emVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        m2Var.addView(emVar, c8.ma.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        bi.e3 e3Var = new bi.e3(16, context, this);
        this.f32820k0 = e3Var;
        e3Var.setVisibility(8);
        e3Var.setAlpha(0.0f);
        m2Var.addView(e3Var, c8.ma.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f32830q0 = textView2;
        textView2.setBackgroundResource(2131232538);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131232536, 0);
        textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        m2Var.addView(textView2, c8.ma.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f37892b;

            {
                this.f37892b = this;
            }

            @Override
            public final void onClick(View view) {
                gm gmVar;
                gm gmVar2;
                int i72 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37892b;
                switch (i72) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f32836t0 && (gmVar = chatAttachAlertPhotoLayout.Q) != null && gmVar.isInited()) {
                            chatAttachAlertPhotoLayout.f32806d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f32835s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new yl(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (gmVar2 = chatAttachAlertPhotoLayout.Q) != null && gmVar2.isInited() && chatAttachAlertPhotoLayout.f32804c0) {
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
                                animatorSet.setInterpolator(nr.f37956f);
                                animatorSet.addListener(new fi.a3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f32841x.V(null, null);
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
        f81 f81Var = new f81(context);
        this.m0 = f81Var;
        f81Var.setVisibility(8);
        f81Var.setAlpha(0.0f);
        m2Var.addView(f81Var, c8.ma.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        f81Var.setDelegate(new ol(this, 3));
        ?? view = new View(context);
        view.f33156b = new DecelerateInterpolator();
        view.f33164x = new ik(view, 17);
        view.f33155a = view.getResources().getDrawable(2131230928);
        Paint paint2 = new Paint(1);
        view.f33157c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f33159f = ot0.f38355a;
        this.f32822l0 = view;
        e3Var.addView((View) view, c8.ma.e(84, 84, 17));
        view.setDelegate(new xl(this, h6Var, m2Var));
        view.setFocusable(true);
        view.setContentDescription(org.telegram.messenger.gd.N0(2131754759, null));
        ImageView imageView = new ImageView(context);
        this.f32835s0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        e3Var.addView(imageView, c8.ma.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f37892b;

            {
                this.f37892b = this;
            }

            @Override
            public final void onClick(View view2) {
                gm gmVar;
                gm gmVar2;
                int i72 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37892b;
                switch (i72) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f32836t0 && (gmVar = chatAttachAlertPhotoLayout.Q) != null && gmVar.isInited()) {
                            chatAttachAlertPhotoLayout.f32806d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f32835s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new yl(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (gmVar2 = chatAttachAlertPhotoLayout.Q) != null && gmVar2.isInited() && chatAttachAlertPhotoLayout.f32804c0) {
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
                                animatorSet.setInterpolator(nr.f37956f);
                                animatorSet.addListener(new fi.a3(chatAttachAlertPhotoLayout, view2, imageView2, 4));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f32841x.V(null, null);
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
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754751, null));
        for (int i12 = 0; i12 < 2; i12++) {
            this.T[i12] = new ImageView(context);
            this.T[i12].setScaleType(ImageView.ScaleType.CENTER);
            this.T[i12].setVisibility(4);
            this.f32820k0.addView(this.T[i12], c8.ma.e(48, 48, 51));
            this.T[i12].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f37892b;

                {
                    this.f37892b = this;
                }

                @Override
                public final void onClick(View view2) {
                    gm gmVar;
                    gm gmVar2;
                    int i72 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37892b;
                    switch (i72) {
                        case 0:
                            if (!chatAttachAlertPhotoLayout.f32836t0 && (gmVar = chatAttachAlertPhotoLayout.Q) != null && gmVar.isInited()) {
                                chatAttachAlertPhotoLayout.f32806d0 = false;
                                chatAttachAlertPhotoLayout.Q.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f32835s0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new yl(chatAttachAlertPhotoLayout, 0));
                                duration.start();
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.U && (gmVar2 = chatAttachAlertPhotoLayout.Q) != null && gmVar2.isInited() && chatAttachAlertPhotoLayout.f32804c0) {
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
                                    animatorSet.setInterpolator(nr.f37956f);
                                    animatorSet.addListener(new fi.a3(chatAttachAlertPhotoLayout, view2, imageView2, 4));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        case 2:
                            chatAttachAlertPhotoLayout.f32841x.V(null, null);
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
        this.f32833r0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setText(org.telegram.messenger.gd.N0(2131744029, null));
        textView3.setShadowLayer(org.telegram.messenger.g0.L(3.33333f), 0.0f, org.telegram.messenger.g0.L(0.666f), 1275068416);
        textView3.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.f32820k0.addView(textView3, c8.ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        zl zlVar2 = new zl(this, context, h6Var, 0);
        this.f32832r = zlVar2;
        zlVar2.setVerticalScrollBarEnabled(true);
        jm jmVar2 = new jm(this, context, false);
        this.f32839w = jmVar2;
        zlVar2.setAdapter(jmVar2);
        for (int i13 = 0; i13 < 8; i13++) {
            jmVar2.h.add(jmVar2.L());
        }
        zlVar2.setClipToPadding(false);
        zlVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        zlVar2.setItemAnimator(null);
        zlVar2.setLayoutAnimation(null);
        zlVar2.setOverScrollMode(2);
        zlVar2.setVisibility(4);
        zlVar2.setAlpha(0.0f);
        m2Var.addView(zlVar2, c8.ma.c(80.0f, -1));
        jg.b0 b0Var = new jg.b0(0, false, 7);
        this.f32834s = b0Var;
        zlVar2.setLayoutManager(b0Var);
        zlVar2.setOnItemClickListener(new bi.a(3));
    }

    public static org.telegram.ui.Cells.s5 P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        zl zlVar = chatAttachAlertPhotoLayout.F;
        int childCount = zlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zlVar.getChildAt(i10);
            if (childAt.getTop() < zlVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f37521b.a1() && (childAt instanceof org.telegram.ui.Cells.s5)) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                if (s5Var.getImageView().getTag() != null && ((Integer) s5Var.getImageView().getTag()).intValue() == i7) {
                    return s5Var;
                }
            }
        }
        return null;
    }

    public static int R(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ui uiVar = chatAttachAlertPhotoLayout.f37521b;
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
        if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).f46032g4 == 5) {
            return ((org.telegram.messenger.j0) g2Var.getMessagesController().A7.f26176j0.f15505b).f24792c - ((org.telegram.ui.bn) uiVar.f40375a2).M6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static boolean V() {
        HashMap hashMap = f32797t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                    if (efVar.d() && efVar.j()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean W() {
        CharSequence charSequence;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = f32798u1;
            if (i7 >= arrayList.size()) {
                break;
            }
            Object obj = f32797t1.get(arrayList.get(i7));
            if (obj instanceof org.telegram.messenger.ef) {
                charSequence = ((org.telegram.messenger.ef) obj).f27874a;
            } else if (obj instanceof org.telegram.messenger.hf) {
                charSequence = ((org.telegram.messenger.hf) obj).I;
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                i10++;
            }
            i7++;
        }
        if (i10 > 1) {
            return false;
        }
        return true;
    }

    public static boolean f0() {
        HashMap hashMap = f32797t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((entry.getValue() instanceof org.telegram.messenger.ef) && ((org.telegram.messenger.ef) entry.getValue()).d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(7.0f) + this.f32831q1;
    }

    public static void r0(ImageView imageView, String str) {
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
                imageView.setImageResource(2131231194);
                imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754913, null));
                return;
            case 1:
                imageView.setImageResource(2131231193);
                imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754914, null));
                return;
            case 2:
                imageView.setImageResource(2131231192);
                imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754915, null));
                return;
            default:
                return;
        }
    }

    public void setAlertKeepScreenOn(boolean z10) {
        Window window = this.f37521b.getWindow();
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
        ShutterButton shutterButton = this.f32822l0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.R0;
        ot0 ot0Var = ot0.f38355a;
        ot0 ot0Var2 = ot0.f38356b;
        if (!z10) {
            if (this.Q != null && shutterButton.getState() == ot0Var2) {
                o0();
                CameraController.getInstance().stopVideoRecording(this.Q.getCameraSession(), false);
                shutterButton.a(ot0Var);
            }
            if (this.f32804c0) {
                d0(false);
            }
            g0(true);
            return;
        }
        if (this.Q != null && shutterButton.getState() == ot0Var2) {
            shutterButton.a(ot0Var);
        }
        this.R0 = false;
    }

    public final void A0() {
        ArrayList arrayList;
        jm jmVar;
        HashMap hashMap;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ui uiVar = this.f37521b;
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
        org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.f40375a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            zl zlVar = this.F;
            int childCount = zlVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f32798u1;
                jmVar = this.H;
                hashMap = f32797t1;
                int i11 = -1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = zlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (jmVar.f36562f && R > this.N0) {
                        R--;
                    }
                    if (jmVar.d && this.U0 == this.V0) {
                        R--;
                    }
                    org.telegram.messenger.ef e02 = e0(R);
                    if (e02 != null && e02.M) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    s5Var.setHasSpoiler(z14);
                    if (e02 != null && e02.c()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    s5Var.setHighQuality(z15);
                    if ((g2Var2 instanceof org.telegram.ui.bn) && uiVar.R3) {
                        if (e02 != null) {
                            i11 = arrayList.indexOf(Integer.valueOf(e02.C));
                        }
                        if (e02 != null && hashMap.containsKey(Integer.valueOf(e02.C))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        s5Var.b(i11, z17, true);
                    } else {
                        if (e02 != null && hashMap.containsKey(Integer.valueOf(e02.C))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        s5Var.b(-1, z16, true);
                    }
                }
                i10++;
            }
            zl zlVar2 = this.f32832r;
            int childCount2 = zlVar2.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = zlVar2.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (jmVar.f36562f && R2 > this.N0) {
                        R2--;
                    }
                    if (jmVar.d && this.U0 == this.V0) {
                        R2--;
                    }
                    org.telegram.messenger.ef e03 = e0(R2);
                    if (e03 != null && e03.M) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s5Var2.setHasSpoiler(z10);
                    if (e03 != null && e03.c()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    s5Var2.setHighQuality(z11);
                    if ((g2Var2 instanceof org.telegram.ui.bn) && uiVar.R3) {
                        if (e03 != null) {
                            i7 = arrayList.indexOf(Integer.valueOf(e03.C));
                        } else {
                            i7 = -1;
                        }
                        if (e03 != null && hashMap.containsKey(Integer.valueOf(e03.C))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        s5Var2.b(i7, z13, true);
                    } else {
                        if (e03 != null && hashMap.containsKey(Integer.valueOf(e03.C))) {
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
    public final void B(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.B(int, int):void");
    }

    public final void B0(boolean z10) {
        boolean z11;
        TextView textView = this.f32830q0;
        if (textView != null) {
            ui uiVar = this.f37521b;
            int i7 = uiVar.O2;
            TextView textView2 = uiVar.f40396h3;
            if (i7 == 0 && !uiVar.R2 && !uiVar.C1) {
                HashMap hashMap = f32797t1;
                Iterator it = hashMap.entrySet().iterator();
                int i10 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    z11 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((org.telegram.messenger.ef) ((Map.Entry) it.next()).getValue()).f27875b) {
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
                    textView.setText(org.telegram.messenger.gd.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                    if (max != this.N || z10) {
                        textView2.setText(org.telegram.messenger.gd.G(max, "MediaSelected", new Object[0]));
                    }
                } else if (z12) {
                    textView.setText(org.telegram.messenger.gd.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                    if (max != this.N || z10) {
                        textView2.setText(org.telegram.messenger.gd.G(max, "VideosSelected", new Object[0]));
                    }
                } else {
                    textView.setText(org.telegram.messenger.gd.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                    if (max != this.N || z10) {
                        textView2.setText(org.telegram.messenger.gd.G(max, "PhotosSelected", new Object[0]));
                    }
                }
                if (max <= 1) {
                    z11 = false;
                }
                uiVar.H1 = z11;
                uiVar.f40404k3.setVisibility((!z11 || uiVar.O2 == 2) ? 8 : 8);
                this.N = max;
            }
        }
    }

    @Override
    public final void C() {
        ui uiVar = this.f37521b;
        if (uiVar.isShowing() && !uiVar.J && !PhotoViewer.p1().P1()) {
            X(false);
        }
    }

    @Override
    public final void E(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.E(int):void");
    }

    @Override
    public final boolean G(int i7) {
        if (this.f32804c0) {
            if (i7 == 24 || i7 == 25 || i7 == 79 || i7 == 85) {
                ((xl) this.f32822l0.getDelegate()).a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void I(mi miVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f32829p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f32841x.setVisibility(0);
        boolean z10 = miVar instanceof rm;
        TextView textView = this.f32843y;
        if (!z10) {
            c0();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(nr.f37959j);
            this.f32829p1 = interpolator;
            interpolator.start();
        }
        this.f37521b.V2.setTitle("");
        this.G.h1(0, 0);
        if (z10) {
            this.F.post(new mf(16, this, miVar));
        }
        Y();
        p0();
    }

    @Override
    public final void J() {
        this.O = false;
        gm gmVar = this.Q;
        if (gmVar != null) {
            gmVar.setVisibility(0);
        }
        if (this.f32838v0) {
            this.f32838v0 = false;
            X(true);
        }
    }

    @Override
    public final void K() {
        this.F.y0(0);
    }

    public final int T(org.telegram.messenger.ef efVar, int i7) {
        boolean z10;
        Integer valueOf = Integer.valueOf(efVar.C);
        HashMap hashMap = f32797t1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f32798u1;
        if (containsKey) {
            efVar.N = 0L;
            efVar.M = false;
            efVar.O = null;
            efVar.f27896z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            B0(false);
            z0();
            if (i7 >= 0) {
                efVar.e();
                this.f32817i1.X(i7);
            }
            return indexOf;
        }
        efVar.N = getStarsPrice();
        if (getStarsPrice() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        efVar.M = z10;
        efVar.R = false;
        if (f0()) {
            efVar.O = Boolean.valueOf(!V());
        }
        efVar.f27896z = Boolean.valueOf(efVar.c());
        boolean Z = Z(true);
        hashMap.put(valueOf, efVar);
        arrayList.add(valueOf);
        if (Z) {
            A0();
            return -1;
        }
        B0(true);
        return -1;
    }

    public final void U() {
        gm gmVar = this.Q;
        if (gmVar != null) {
            if (!this.f32804c0) {
                gmVar.setTranslationX(this.V[0]);
            }
            int i7 = this.L0;
            int L = org.telegram.messenger.g0.L(2.0f) + (i7 * 2);
            if (!this.f32804c0) {
                this.Q.setClipTop((int) this.f32800a0);
                this.Q.setClipBottom((int) this.f32802b0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
                if (layoutParams.height != L || layoutParams.width != i7) {
                    layoutParams.width = i7;
                    layoutParams.height = L;
                    this.Q.setLayoutParams(layoutParams);
                    org.telegram.messenger.g0.g3(new mf(17, this, layoutParams));
                }
            }
        }
    }

    public final void X(boolean z10) {
        org.telegram.ui.ActionBar.g2 g2Var;
        boolean z11;
        jm jmVar;
        ui uiVar = this.f37521b;
        boolean z12 = uiVar.Q1;
        org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.f40375a2;
        if (!z12 && this.f32824n) {
            boolean z13 = this.O0;
            boolean z14 = this.P0;
            if (g2Var2 == null) {
                g2Var = LaunchActivity.Q();
            } else {
                g2Var = g2Var2;
            }
            if (g2Var != null && g2Var.getParentActivity() != null) {
                if (!org.telegram.messenger.bz.f23240y0) {
                    this.O0 = false;
                } else {
                    if (g2Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.P0 = z11;
                    if (z11) {
                        if (z10) {
                            try {
                                g2Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                            } catch (Exception unused) {
                            }
                        }
                        this.O0 = false;
                    } else {
                        if (z10 || org.telegram.messenger.bz.P0) {
                            CameraController.getInstance().initCamera(null);
                        }
                        this.O0 = CameraController.getInstance().isCameraInitied();
                    }
                }
                if ((z13 != this.O0 || z14 != this.P0) && (jmVar = this.H) != null) {
                    jmVar.f();
                }
                if (!uiVar.Q1 && uiVar.isShowing() && this.O0 && ((Paint) uiVar.Z.f30125b).getAlpha() != 0 && !this.f32804c0) {
                    v0();
                }
            }
        }
    }

    public final void Y() {
        v4.f1 K;
        float[] fArr;
        int i7;
        float f10;
        int systemWindowInsetTop;
        if (!PhotoViewer.A1() || PhotoViewer.p1().f43338p5 == null || !PhotoViewer.p1().f43338p5.W) {
            gm gmVar = this.Q;
            if (gmVar != null) {
                gmVar.invalidateOutline();
            }
            zl zlVar = this.F;
            v4.f1 K2 = zlVar.K(this.N0 - 1);
            if (K2 != null) {
                K2.f59161a.invalidateOutline();
            }
            if ((!this.H.d || !this.O0 || this.U0 != this.V0) && (K = zlVar.K(0)) != null) {
                K.f59161a.invalidateOutline();
            }
            gm gmVar2 = this.Q;
            if (gmVar2 != null) {
                gmVar2.invalidate();
            }
            em emVar = this.S;
            if (emVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) emVar.getLayoutParams();
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
            int childCount = zlVar.getChildCount();
            int i10 = 0;
            while (true) {
                fArr = this.V;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = zlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.m5) {
                    if (childAt.isAttachedToWindow()) {
                        float y10 = getY() + zlVar.getY() + childAt.getY();
                        ui uiVar = this.f37521b;
                        ViewGroup viewGroup = uiVar.f30173b;
                        vh vhVar = uiVar.f40449w3;
                        ai.l0 l0Var = uiVar.M2;
                        float y11 = viewGroup.getY() + y10;
                        float x10 = (uiVar.f30173b.getX() + (getX() + (zlVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                        if (!uiVar.f40378b2) {
                            i7 = org.telegram.messenger.g0.f24140m;
                        } else {
                            i7 = 0;
                        }
                        float alpha = (l0Var.getAlpha() * l0Var.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
                        hi.j jVar = uiVar.C4;
                        if (jVar != null && jVar.g()) {
                            alpha = Math.max(alpha, (uiVar.C4.e() + uiVar.C4.getY()) - uiVar.f40402j4);
                        }
                        if (y10 < alpha) {
                            f10 = alpha - y10;
                        } else {
                            f10 = 0.0f;
                        }
                        if (f10 != this.f32800a0) {
                            this.f32800a0 = f10;
                            gm gmVar3 = this.Q;
                            if (gmVar3 != null) {
                                gmVar3.invalidateOutline();
                                this.Q.invalidate();
                            }
                        }
                        float translationY = (int) (vhVar.getTranslationY() + (uiVar.f30173b.getMeasuredHeight() - vhVar.getMeasuredHeight()));
                        hi.j jVar2 = uiVar.C4;
                        if (jVar2 != null) {
                            translationY -= jVar2.d() - org.telegram.messenger.g0.L(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y10 > translationY) {
                            this.f32802b0 = Math.min(-org.telegram.messenger.g0.L(5.0f), y10 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.f32802b0 = 0.0f;
                        }
                        fArr[0] = x10;
                        fArr[1] = y11;
                        U();
                        return;
                    }
                } else {
                    i10++;
                }
            }
            if (this.f32800a0 != 0.0f) {
                this.f32800a0 = 0.0f;
                gm gmVar4 = this.Q;
                if (gmVar4 != null) {
                    gmVar4.invalidateOutline();
                    this.Q.invalidate();
                }
            }
            fArr[0] = org.telegram.messenger.g0.L(-400.0f);
            fArr[1] = 0.0f;
            U();
        }
    }

    public final boolean Z(boolean z10) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            HashMap hashMap = f32797t1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f32798u1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof org.telegram.messenger.ef)) {
                break;
            }
            T((org.telegram.messenger.ef) obj, -1);
            z11 = true;
        }
        return z11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        org.telegram.messenger.ef efVar;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = f32798u1;
            if (i7 < arrayList.size()) {
                if (i7 == 0) {
                    Object obj = arrayList.get(i7);
                    HashMap hashMap = f32797t1;
                    Object obj2 = hashMap.get(obj);
                    if (obj2 instanceof org.telegram.messenger.ef) {
                        org.telegram.messenger.ef clone = ((org.telegram.messenger.ef) obj2).clone();
                        CharSequence[] charSequenceArr = {charSequence};
                        clone.f27885n = org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24798t0).Y(charSequenceArr, false, true);
                        clone.f27874a = charSequenceArr[0];
                        efVar = clone;
                    } else {
                        boolean z10 = obj2 instanceof org.telegram.messenger.hf;
                        efVar = obj2;
                        if (z10) {
                            org.telegram.messenger.hf clone2 = ((org.telegram.messenger.hf) obj2).clone();
                            CharSequence[] charSequenceArr2 = {charSequence};
                            clone2.f27885n = org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24798t0).Y(charSequenceArr2, false, true);
                            clone2.I = charSequenceArr2[0];
                            efVar = clone2;
                        }
                    }
                    hashMap.put(obj, efVar);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean a0(org.telegram.messenger.ef efVar) {
        boolean z10 = this.f32842x0;
        org.telegram.ui.ActionBar.h6 h6Var = this.f37520a;
        ui uiVar = this.f37521b;
        if (!z10 && efVar.f27875b) {
            if (!uiVar.O0()) {
                org.telegram.messenger.f3.o(null, 2131749362, new lc(uiVar.f40421p3, h6Var), null);
                return true;
            }
        } else if (!this.f32844y0 && !efVar.f27875b) {
            if (!uiVar.O0()) {
                org.telegram.messenger.f3.o(null, 2131749366, new lc(uiVar.f40421p3, h6Var), null);
                return true;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b() {
        return !this.f32804c0;
    }

    public final void b0() {
        if (this.Q0) {
            boolean h02 = h0();
            this.Q0 = h02;
            if (!h02) {
                i0();
            }
            this.H.f();
            this.f32839w.f();
        }
    }

    @Override
    public final boolean c() {
        for (Map.Entry entry : f32797t1.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof org.telegram.messenger.ef) {
                if (((org.telegram.messenger.ef) value).f27894x != 0) {
                    return false;
                }
            } else if ((value instanceof org.telegram.messenger.hf) && ((org.telegram.messenger.hf) value).f27894x != 0) {
                return false;
            }
        }
        return true;
    }

    public final void c0() {
        String N0 = org.telegram.messenger.gd.N0(2131751142, null);
        org.telegram.ui.ActionBar.y0 y0Var = this.Z0;
        y0Var.setText(N0);
        y0Var.setAnimatedIcon(2131624132);
        this.f37521b.Y2.T(1);
        HashMap hashMap = f32797t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((org.telegram.messenger.ef) entry.getValue()).e();
            }
            hashMap.clear();
            f32798u1.clear();
        }
        ArrayList arrayList = f32796s1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList.get(i7);
                new File(efVar.I).delete();
                if (efVar.h != null) {
                    new File(efVar.h).delete();
                }
                if (efVar.f27876c != null) {
                    new File(efVar.f27876c).delete();
                }
            }
            arrayList.clear();
        }
        this.H.f();
        this.f32839w.f();
    }

    @Override
    public final void d() {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z10 = this.f32811f1;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.m6.Yg;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f29486j5;
        }
        int i13 = org.telegram.ui.ActionBar.m6.f29361c7;
        org.telegram.ui.ActionBar.h6 h6Var = this.f37520a;
        this.I.setTextColor(org.telegram.ui.ActionBar.m6.w0(i13, h6Var));
        int i14 = org.telegram.ui.ActionBar.m6.A5;
        zl zlVar = this.F;
        org.telegram.ui.ActionBar.t6.H(zlVar, i14, h6Var);
        zlVar.K(0);
        org.telegram.ui.ActionBar.t6.U(this.f32843y, i7, h6Var);
        if (z10) {
            i10 = org.telegram.ui.ActionBar.m6.Yg;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.E8;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        hi.u2 u2Var = this.f32841x;
        u2Var.P(w02, false);
        if (z10) {
            i11 = org.telegram.ui.ActionBar.m6.Yg;
        } else {
            i11 = org.telegram.ui.ActionBar.m6.E8;
        }
        u2Var.P(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), true);
        if (z10) {
            i12 = org.telegram.ui.ActionBar.m6.f29331ah;
        } else {
            i12 = org.telegram.ui.ActionBar.m6.G8;
        }
        u2Var.I(org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), this.E);
    }

    public final void d0(boolean z10) {
        boolean z11;
        gm gmVar;
        if (!this.f32836t0 && this.Q != null) {
            int i7 = this.L0;
            int[] iArr = this.f32812g0;
            iArr[1] = i7;
            iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i7 * 2);
            Runnable runnable = this.f32826o0;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f32826o0 = null;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29321a7, this.f37520a)) > 0.721d) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.g0.m3(this.f37521b, z11);
            TextView textView = this.f32830q0;
            zl zlVar = this.f32832r;
            bi.e3 e3Var = this.f32820k0;
            zl zlVar2 = this.F;
            ImageView[] imageViewArr = this.T;
            f81 f81Var = this.m0;
            if (z10) {
                this.f32821k1 = this.Q.getTranslationY();
                this.f32808e0 = true;
                if (zlVar2 != null) {
                    zlVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(e3Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(f81Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(zlVar, property, 0.0f));
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
                this.f32813g1.d();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(nr.f37956f);
                animatorSet.addListener(new yl(this, 3));
                animatorSet.start();
            } else {
                this.f32819j1 = false;
                setAlertKeepScreenOn(false);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                e3Var.setAlpha(0.0f);
                e3Var.setVisibility(8);
                f81Var.setAlpha(0.0f);
                f81Var.setTag(null);
                f81Var.setVisibility(8);
                zlVar.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                zlVar.setVisibility(8);
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
                this.f32804c0 = false;
                gm gmVar2 = this.Q;
                if (gmVar2 != null) {
                    gmVar2.setFpsLimit(30);
                    this.Q.setSystemUiVisibility(1024);
                }
                if (zlVar2 != null) {
                    zlVar2.invalidate();
                }
            }
            gm gmVar3 = this.Q;
            if (gmVar3 != null) {
                gmVar3.setImportantForAccessibility(0);
            }
            zlVar2.setImportantForAccessibility(0);
            if (!org.telegram.messenger.pc.e(360928) && (gmVar = this.Q) != null) {
                gmVar.showTexture(false, z10);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ui uiVar;
        if (i7 == org.telegram.messenger.ks.f25208r2) {
            jm jmVar = this.H;
            if (jmVar != null) {
                if (t0()) {
                    this.V0 = MediaController.f22714a2;
                } else {
                    this.V0 = MediaController.f22715b2;
                }
                if (this.U0 != null && ((uiVar = this.f37521b) == null || !uiVar.B1)) {
                    if (t0()) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= MediaController.f22716c2.size()) {
                                break;
                            }
                            org.telegram.messenger.ue ueVar = (org.telegram.messenger.ue) MediaController.f22716c2.get(i11);
                            int i12 = ueVar.f27183a;
                            org.telegram.messenger.ue ueVar2 = this.U0;
                            if (i12 == ueVar2.f27183a && ueVar.f27184b == ueVar2.f27184b) {
                                this.U0 = ueVar;
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
                jmVar.f();
                this.f32839w.f();
                ArrayList arrayList = f32798u1;
                if (!arrayList.isEmpty() && this.V0 != null) {
                    int size = arrayList.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        Integer num = (Integer) arrayList.get(i13);
                        HashMap hashMap = f32797t1;
                        Object obj = hashMap.get(num);
                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.V0.f27187f.get(num.intValue());
                        if (efVar != null) {
                            if (obj instanceof org.telegram.messenger.ef) {
                                efVar.g((org.telegram.messenger.ef) obj);
                            }
                            hashMap.put(num, efVar);
                        }
                    }
                }
                x0();
            }
        } else if (i7 == org.telegram.messenger.ks.o4) {
            X(false);
        }
    }

    public final org.telegram.messenger.ef e0(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = f32796s1;
        int size = arrayList.size();
        if (i7 < size) {
            return (org.telegram.messenger.ef) arrayList.get(i7);
        }
        int i10 = i7 - size;
        org.telegram.messenger.ue ueVar = this.U0;
        if (ueVar == null || i10 >= ueVar.f27186e.size()) {
            return null;
        }
        return (org.telegram.messenger.ef) this.U0.f27186e.get(i10);
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
            org.telegram.messenger.g0.h3(new sl(this, 0), 300L);
            this.f32806d0 = false;
        }
    }

    public ArrayList<Object> getAllPhotosArray() {
        org.telegram.messenger.ue ueVar = this.U0;
        ArrayList<Object> arrayList = f32796s1;
        if (ueVar != null) {
            if (!arrayList.isEmpty()) {
                ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.U0.f27186e.size());
                arrayList2.addAll(arrayList);
                arrayList2.addAll(this.U0.f27186e);
                return arrayList2;
            }
            return this.U0.f27186e;
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
        return this.f32810f0;
    }

    @Override
    public int getCurrentItemTop() {
        zl zlVar = this.F;
        int childCount = zlVar.getChildCount();
        vy vyVar = this.I;
        if (childCount <= 0) {
            zlVar.setTopGlowOffset(zlVar.getPaddingTop());
            vyVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = zlVar.getChildAt(0);
        mj0 mj0Var = (mj0) zlVar.G(childAt);
        int top = childAt.getTop() - this.f32831q1;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || mj0Var == null || mj0Var.b() != 0) {
            top = L;
        }
        vyVar.setTranslationY(((((getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f)) - vyVar.getMeasuredHeight()) / 2.0f) + top);
        zlVar.setTopGlowOffset(top);
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
        return f32798u1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f32797t1;
    }

    public int getSelectedPhotosCount() {
        int i7 = 0;
        for (Object obj : f32797t1.values()) {
            if (obj instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (!efVar.f27875b && efVar.f27890s == null) {
                    i7++;
                }
            }
        }
        return i7;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i7 = 0;
        for (Object obj : f32797t1.values()) {
            if (obj instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (efVar.c() && !efVar.f27875b && efVar.f27890s == null) {
                    i7++;
                }
            }
        }
        return i7;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return f32798u1;
    }

    public long getStarsPrice() {
        Iterator it = f32797t1.entrySet().iterator();
        if (it.hasNext()) {
            return ((org.telegram.messenger.ef) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    public final boolean h0() {
        Activity W = org.telegram.messenger.g0.W(getContext());
        if (W == null) {
            W = this.f37521b.f40375a2.getParentActivity();
        }
        int i7 = Build.VERSION.SDK_INT;
        if (W != null) {
            if (i7 < 33 || (W.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && W.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
                if (i7 >= 33 || W.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void i0() {
        org.telegram.messenger.ue ueVar;
        if (t0()) {
            ueVar = MediaController.f22714a2;
        } else {
            ueVar = MediaController.f22715b2;
        }
        if (ueVar == null) {
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
        gm gmVar;
        gm gmVar2 = this.Q;
        if (gmVar2 != null && this.P == null) {
            ui uiVar = this.f37521b;
            if (!uiVar.J) {
                gmVar2.initTexture();
                boolean t02 = t0();
                TextView textView = this.f32833r0;
                int i7 = 0;
                if (t02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f32796s1.isEmpty();
                zl zlVar = this.f32832r;
                TextView textView2 = this.f32830q0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    zlVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    zlVar.setVisibility(0);
                }
                if (uiVar.b1().f42550w && isFocusable()) {
                    uiVar.b1().d();
                }
                f81 f81Var = this.m0;
                f81Var.setVisibility(0);
                f81Var.setAlpha(0.0f);
                bi.e3 e3Var = this.f32820k0;
                e3Var.setVisibility(0);
                e3Var.setTag(null);
                int[] iArr = this.f32812g0;
                iArr[0] = 0;
                int i10 = this.L0;
                iArr[1] = i10;
                iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i10 * 2);
                this.f32821k1 = 0.0f;
                this.f32819j1 = true;
                gm gmVar3 = this.Q;
                if (gmVar3 != null) {
                    gmVar3.setFpsLimit(-1);
                }
                org.telegram.messenger.g0.v1(this);
                org.telegram.messenger.g0.m3(uiVar, false);
                setAlertKeepScreenOn(true);
                zl zlVar2 = this.F;
                ImageView[] imageViewArr = this.T;
                if (z10) {
                    setCameraOpenProgress(0.0f);
                    this.f32808e0 = true;
                    if (zlVar2 != null) {
                        zlVar2.invalidate();
                    }
                    this.f32813g1.d();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(e3Var, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(zlVar, property, 1.0f));
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
                    animatorSet.setInterpolator(nr.f37956f);
                    animatorSet.addListener(new yl(this, 2));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    e3Var.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    zlVar.setAlpha(1.0f);
                    while (true) {
                        if (i7 >= 2) {
                            break;
                        } else if (imageViewArr[i7].getVisibility() == 0) {
                            imageViewArr[i7].setAlpha(1.0f);
                            break;
                        } else {
                            i7++;
                        }
                    }
                    uiVar.X3.K0();
                    gm gmVar4 = this.Q;
                    if (gmVar4 != null) {
                        gmVar4.setSystemUiVisibility(1028);
                    }
                }
                this.f32804c0 = true;
                gm gmVar5 = this.Q;
                if (gmVar5 != null) {
                    gmVar5.setImportantForAccessibility(2);
                }
                zlVar2.setImportantForAccessibility(4);
                zlVar2.invalidate();
                if (!org.telegram.messenger.pc.e(360928) && (gmVar = this.Q) != null && gmVar.isInited()) {
                    this.Q.showTexture(true, z10);
                }
            }
        }
    }

    @Override
    public final void l() {
        Y();
        invalidate();
    }

    public final void l0() {
        if (org.telegram.messenger.bz.f23240y0) {
            k0(true);
            return;
        }
        ui uiVar = this.f37521b;
        si siVar = uiVar.X3;
        if (siVar != null) {
            siVar.y1(0, false, true, 0, 0, 0L, uiVar.g1(), false, 0L);
        }
    }

    @Override
    public final void m(float f10) {
        this.X0 = f10;
        Y();
        gm gmVar = this.Q;
        if (gmVar != null) {
            gmVar.invalidateOutline();
            this.Q.invalidate();
        }
        invalidate();
    }

    public final void m0(org.telegram.messenger.ef efVar, boolean z10, boolean z11) {
        int i7;
        org.telegram.ui.bn bnVar;
        org.telegram.ui.bn bnVar2;
        ArrayList<Object> arrayList;
        int i10;
        ArrayList arrayList2 = f32796s1;
        ui uiVar = this.f37521b;
        if (efVar != null) {
            int i11 = efVar.C;
            arrayList2.add(efVar);
            f32797t1.put(Integer.valueOf(i11), efVar);
            f32798u1.add(Integer.valueOf(i11));
            uiVar.L1(0);
            this.H.f();
            this.f32839w.f();
        }
        if (efVar != null && !z11 && arrayList2.size() > 1) {
            B0(false);
            if (this.Q != null) {
                this.m0.b(false, 0.0f);
                this.C0 = 0.0f;
                this.Q.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f32837u0 = true;
            org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
            org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.f40375a2;
            if (g2Var == null) {
                g2Var = LaunchActivity.Q();
            }
            if (g2Var != null) {
                PhotoViewer.p1().I2(g2Var.getParentActivity(), null, this.f37520a);
                PhotoViewer.p1().J2(uiVar);
                PhotoViewer p12 = PhotoViewer.p1();
                int i12 = uiVar.Q3;
                boolean z12 = uiVar.R3;
                p12.h = i12;
                p12.f43316n = z12;
                if (uiVar.A1 && uiVar.B1) {
                    bnVar = (org.telegram.ui.bn) g2Var2;
                    i7 = 11;
                } else {
                    if (uiVar.O2 != 0) {
                        i7 = 1;
                    } else if (g2Var2 instanceof org.telegram.ui.bn) {
                        bnVar = (org.telegram.ui.bn) g2Var2;
                        i7 = 2;
                    } else {
                        i7 = 5;
                    }
                    bnVar = null;
                }
                boolean z13 = uiVar.C1;
                if (z13) {
                    i7 = 13;
                    bnVar2 = null;
                } else {
                    bnVar2 = bnVar;
                }
                int i13 = i7;
                if (uiVar.O2 == 0 && !z13) {
                    arrayList = getAllPhotosArray();
                    i10 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(efVar);
                    i10 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                v30 v30Var = uiVar.L1;
                if (v30Var != null && efVar != null) {
                    v30Var.f40671e = efVar.f27875b;
                }
                PhotoViewer.p1().f2(arrayList3, i10, i13, false, new am(this, z10), bnVar2);
                PhotoViewer.p1().v2(uiVar.L1);
                if (uiVar.B1) {
                    PhotoViewer.p1().S0(null, null, false, uiVar.E1);
                    PhotoViewer.p1().k2();
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
        gm gmVar;
        if (!this.f32808e0) {
            if (this.f32804c0 && motionEvent != null) {
                boolean z10 = this.H0;
                f81 f81Var = this.m0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.F0;
                    f81Var.getHitRect(rect);
                    if (f81Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f32836t0 && !this.J0) {
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
                    zl zlVar = this.f32832r;
                    TextView textView = this.f32830q0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.T;
                    bi.e3 e3Var = this.f32820k0;
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
                                f81Var.b(false, this.C0);
                                this.f37521b.f30173b.invalidate();
                                this.Q.setZoom(this.C0);
                                w0(true);
                                return true;
                            }
                        } else {
                            float y10 = motionEvent.getY();
                            float f10 = y10 - this.G0;
                            if (this.I0) {
                                if (Math.abs(f10) > org.telegram.messenger.g0.a1(false, 0.4f)) {
                                    this.I0 = false;
                                    this.J0 = true;
                                    return true;
                                }
                            } else if (this.J0 && (gmVar = this.Q) != null) {
                                gmVar.setTranslationY(gmVar.getTranslationY() + f10);
                                this.G0 = y10;
                                f81Var.setTag(null);
                                Runnable runnable = this.f32826o0;
                                if (runnable != null) {
                                    org.telegram.messenger.g0.r(runnable);
                                    this.f32826o0 = null;
                                }
                                if (e3Var.getTag() == null) {
                                    e3Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(e3Var, property, 0.0f), ObjectAnimator.ofFloat(f81Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(zlVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(nr.f37956f);
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
                            gm gmVar2 = this.Q;
                            if (gmVar2 != null) {
                                if (Math.abs(gmVar2.getTranslationY()) > this.Q.getMeasuredHeight() / 6.0f) {
                                    d0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(e3Var, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(zlVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f32818j0);
                                animatorSet2.start();
                                e3Var.setTag(null);
                                return true;
                            }
                        } else {
                            gm gmVar3 = this.Q;
                            if (gmVar3 != null && !this.E0) {
                                int[] iArr = this.W;
                                gmVar3.getLocationOnScreen(iArr);
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
        if (this.f37521b.Q1) {
            return;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            this.T[i7].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(nr.f37956f).start();
        }
        ViewPropertyAnimator duration = this.f32835s0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        nr nrVar = nr.f37956f;
        duration.setInterpolator(nrVar).start();
        this.f32833r0.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
        org.telegram.messenger.g0.V3(this.S, false);
        org.telegram.messenger.g0.r(this.f32816i0);
        this.f32816i0 = null;
        org.telegram.messenger.g0.O3(org.telegram.messenger.g0.W(getContext()));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        if (this.T0 != i13) {
            this.T0 = i13;
            jm jmVar = this.H;
            if (jmVar != null) {
                jmVar.f();
            }
        }
        super.onLayout(z10, i7, i10, i11, i12);
        Y();
    }

    @Override
    public final void p() {
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.o4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25208r2);
    }

    public final void p0() {
        try {
            X(false);
            if (this.Q != null) {
                CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean q() {
        if (this.f32808e0) {
            return true;
        }
        if (this.f32804c0) {
            d0(true);
            return true;
        }
        g0(true);
        return false;
    }

    public final void q0() {
        if (this.f32806d0) {
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
    public final void r(int i7) {
        boolean z10;
        if (i7 != 0 && i7 != 2) {
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

    public final void s0(int i7, final boolean z10) {
        PhotoViewer p12 = PhotoViewer.p1();
        if (i7 == -1) {
            i7 = p12.P4;
        }
        ArrayList arrayList = p12.f43265g7;
        if (arrayList != null && !arrayList.isEmpty() && i7 < arrayList.size() && (arrayList.get(i7) instanceof org.telegram.messenger.ef) && ((org.telegram.messenger.ef) arrayList.get(i7)).M) {
            final org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList.get(i7);
            this.F.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z11 = ChatAttachAlertPhotoLayout.f32795r1;
                    if (view instanceof org.telegram.ui.Cells.s5) {
                        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                        if (s5Var.getPhotoEntry() == efVar) {
                            s5Var.c(z10, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z12 = true;
                            if (ChatAttachAlertPhotoLayout.f32797t1.size() <= 1) {
                                z12 = false;
                            }
                            s5Var.f(starsPrice, z12);
                        }
                    }
                }
            });
        }
    }

    public void setCameraOpenProgress(float f10) {
        int i7;
        int i10;
        if (this.Q == null) {
            return;
        }
        this.f32810f0 = f10;
        int[] iArr = this.f32812g0;
        float f11 = iArr[1];
        float f12 = iArr[2];
        int i11 = org.telegram.messenger.g0.f24146q.x;
        ui uiVar = this.f37521b;
        float width = uiVar.f30176c.getWidth();
        float height = uiVar.f30176c.getHeight();
        float[] fArr = this.V;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = this.f32821k1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
        float textureHeight = this.Q.getTextureHeight(f11, f12) / this.Q.getTextureHeight(width, height);
        float f16 = f12 / height;
        float f17 = f11 / width;
        if (this.f32819j1) {
            i7 = (int) width;
            i10 = (int) height;
            float f18 = 1.0f - f10;
            float f19 = (textureHeight * f18) + f10;
            this.Q.getTextureView().setScaleX(f19);
            this.Q.getTextureView().setScaleY(f19);
            float f20 = f13 * f18;
            this.Q.setTranslationX(((0.0f * f10) + f20) - (((1.0f - ((f17 * f18) + f10)) * width) / 2.0f));
            float f21 = f14 * f18;
            this.Q.setTranslationY(((f15 * f10) + f21) - (((1.0f - ((f16 * f18) + f10)) * height) / 2.0f));
            this.l1 = f21 - this.Q.getTranslationY();
            this.f32823m1 = (height * f10) + (((f14 + f12) * f18) - this.Q.getTranslationY());
            this.f32827o1 = f20 - this.Q.getTranslationX();
            this.n1 = (width * f10) + (((f13 + f11) * f18) - this.Q.getTranslationX());
        } else {
            i7 = (int) f11;
            i10 = (int) f12;
            this.Q.getTextureView().setScaleX(1.0f);
            this.Q.getTextureView().setScaleY(1.0f);
            this.l1 = 0.0f;
            this.f32823m1 = height;
            this.f32827o1 = 0.0f;
            this.n1 = width;
            this.Q.setTranslationX(f13);
            this.Q.setTranslationY(f14);
        }
        if (layoutParams.width != i7 || layoutParams.height != i10) {
            layoutParams.width = i7;
            layoutParams.height = i10;
            this.Q.requestLayout();
        }
        this.Q.invalidateOutline();
        this.Q.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z10) {
        this.f32838v0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.f32845z0 = z10;
    }

    public void setStarsPrice(long j3) {
        boolean z10;
        HashMap hashMap = f32797t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                efVar.N = j3;
                if (j3 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                efVar.M = z10;
                efVar.R = false;
            }
        }
        E(getSelectedItemsCount());
        if (Z(false)) {
            A0();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        ui uiVar = this.f37521b;
        if (uiVar.B0 == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            zl zlVar = this.F;
            int childCount = zlVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = zlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    float f12 = 1.0f + f11;
                    s5Var.getCheckBox().setScaleX(f12);
                    s5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        uiVar.f30173b.invalidate();
        invalidate();
    }

    @Override
    public final void t() {
        gm gmVar = this.Q;
        if (gmVar != null) {
            gmVar.setVisibility(8);
        }
        for (Map.Entry entry : f32797t1.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.ef) {
                ((org.telegram.messenger.ef) entry.getValue()).getClass();
            }
        }
        this.H.f();
    }

    public final boolean t0() {
        if (!this.f32845z0) {
            ui uiVar = this.f37521b;
            if (!uiVar.A1) {
                if (!(uiVar.f40375a2 instanceof org.telegram.ui.bn) && !uiVar.R2 && uiVar.O2 != 2) {
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
        zl zlVar = this.F;
        int childCount = zlVar.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            } else if (zlVar.getChildAt(i7) instanceof org.telegram.ui.Cells.m5) {
                q0();
                break;
            } else {
                this.R.i();
                i7++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f32829p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f32843y.animate().alpha(0.0f).setDuration(150L).setInterpolator(nr.f37959j).withEndAction(new sl(this, 3));
        this.f32829p1 = withEndAction;
        withEndAction.start();
        n0();
    }

    public final void u0(a9 a9Var, TLRPC.VideoSize videoSize, long j3) {
        boolean z10;
        ui uiVar = this.f37521b;
        y8 y8Var = new y8(uiVar.P1, uiVar.L1);
        v30 v30Var = uiVar.L1;
        if (v30Var != null && v30Var.f40670c == 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        y8Var.R = z10;
        uiVar.f40375a2.presentFragment(y8Var);
        if (a9Var != null) {
            y8Var.r0(a9Var);
        }
        if (videoSize != null) {
            y8Var.q0(videoSize);
        }
        if (j3 != 0) {
            y8Var.p0(j3);
        }
        y8Var.J = new h2(10, this, y8Var);
    }

    @Override
    public final void v(float f10) {
        gm gmVar = this.Q;
        if (gmVar != null) {
            gmVar.setAlpha(f10);
            int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i7 != 0 && this.Q.getVisibility() != 0) {
                this.Q.setVisibility(0);
            } else if (i7 == 0 && this.Q.getVisibility() != 4) {
                this.Q.setVisibility(4);
            }
        }
    }

    public final void v0() {
        boolean z10;
        boolean z11;
        float f10;
        ui uiVar = this.f37521b;
        if (!uiVar.f40385d4 && this.f32840w0 && CameraView.isCameraAllowed()) {
            if (this.Q == null) {
                boolean z12 = !org.telegram.messenger.pc.e(360928);
                Context context = getContext();
                Boolean bool = this.f32828p0;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = uiVar.S3;
                }
                gm gmVar = new gm(this, context, z10, z12);
                this.Q = gmVar;
                org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
                if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).z()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                gmVar.setRecordFile(org.telegram.messenger.g0.s0(z11));
                this.Q.setFocusable(true);
                this.Q.setFpsLimit(30);
                this.Q.setOutlineProvider(new fh.a(this, 2));
                this.Q.setClipToOutline(true);
                this.Q.setContentDescription(org.telegram.messenger.gd.N0(2131754851, null));
                org.telegram.ui.ActionBar.m2 m2Var = uiVar.f30176c;
                gm gmVar2 = this.Q;
                int i7 = this.L0;
                m2Var.addView(gmVar2, 1, new FrameLayout.LayoutParams(i7, i7));
                this.Q.setDelegate(new bm(this));
                gm gmVar3 = this.Q;
                if (this.f32840w0) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                gmVar3.setAlpha(f10);
                this.Q.setEnabled(this.f32840w0);
                if (this.O) {
                    this.Q.setVisibility(8);
                }
                if (!this.f32804c0) {
                    Y();
                }
                zl zlVar = this.F;
                if (zlVar != null) {
                    zlVar.invalidate();
                }
                invalidate();
            }
            f81 f81Var = this.m0;
            if (f81Var != null) {
                f81Var.b(false, 0.0f);
                this.C0 = 0.0f;
            }
            if (!this.f32804c0) {
                this.Q.setTranslationX(this.V[0]);
            }
        }
    }

    @Override
    public final void w(int i7) {
        TLRPC.Chat Z0;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        ui uiVar = this.f37521b;
        if (i7 == 8) {
            uiVar.w1(!uiVar.X1, true);
            this.f32809e1.a(!uiVar.X1, true);
        } else if ((i7 == 0 || i7 == 1) && uiVar.Q3 > 0 && f32798u1.size() > 1 && (Z0 = uiVar.Z0()) != null && !org.telegram.messenger.v3.N(Z0) && Z0.slowmode_enabled) {
            c5.L(getContext(), org.telegram.messenger.gd.N0(2131745114, null), org.telegram.messenger.gd.N0(2131745106, null), null, null, this.f37520a).p();
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.f37520a;
            HashMap hashMap = f32797t1;
            if (i7 == 0) {
                org.telegram.messenger.fj fjVar = uiVar.F3;
                org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
                if (fjVar == null && (g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).c()) {
                    c5.J(getContext(), ((org.telegram.ui.bn) g2Var).a(), new ol(this, 0), h6Var);
                } else {
                    c5.X(uiVar.H3, uiVar.Y0() + hashMap.size(), uiVar.c1(), new org.telegram.messenger.x10(this) {
                        public final ChatAttachAlertPhotoLayout f38614b;

                        {
                            this.f38614b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            int i10 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38614b;
                            Long l10 = (Long) obj;
                            switch (i10) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f32795r1;
                                    ui uiVar2 = chatAttachAlertPhotoLayout.f37521b;
                                    uiVar2.N0();
                                    uiVar2.X3.y1(7, false, true, 0, 0, 0L, uiVar2.g1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f32795r1;
                                    ui uiVar3 = chatAttachAlertPhotoLayout.f37521b;
                                    uiVar3.N0();
                                    uiVar3.X3.y1(4, true, true, 0, 0, 0L, uiVar3.g1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i7 == 1) {
                org.telegram.messenger.fj fjVar2 = uiVar.F3;
                org.telegram.ui.ActionBar.g2 g2Var2 = uiVar.f40375a2;
                if (fjVar2 == null && (g2Var2 instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var2).c()) {
                    c5.J(getContext(), ((org.telegram.ui.bn) g2Var2).a(), new ol(this, 1), h6Var);
                } else {
                    c5.X(uiVar.H3, uiVar.Y0() + hashMap.size(), uiVar.c1(), new org.telegram.messenger.x10(this) {
                        public final ChatAttachAlertPhotoLayout f38614b;

                        {
                            this.f38614b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            int i10 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38614b;
                            Long l10 = (Long) obj;
                            switch (i10) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f32795r1;
                                    ui uiVar2 = chatAttachAlertPhotoLayout.f37521b;
                                    uiVar2.N0();
                                    uiVar2.X3.y1(7, false, true, 0, 0, 0L, uiVar2.g1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f32795r1;
                                    ui uiVar3 = chatAttachAlertPhotoLayout.f37521b;
                                    uiVar3.N0();
                                    uiVar3.X3.y1(4, true, true, 0, 0, 0L, uiVar3.g1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                jm jmVar = this.H;
                zl zlVar = this.F;
                if (i7 == 3) {
                    rm rmVar = uiVar.f40406l2;
                    if (rmVar != null) {
                        rmVar.P();
                    }
                    Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((org.telegram.messenger.ef) ((Map.Entry) it.next()).getValue()).M) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    final boolean z13 = !z11;
                    org.telegram.messenger.g0.h3(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout f38948b;

                        {
                            this.f38948b = this;
                        }

                        @Override
                        public final void run() {
                            int i10;
                            int i11;
                            int i12 = r3;
                            boolean z14 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38948b;
                            switch (i12) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f32795r1;
                                    ui uiVar2 = chatAttachAlertPhotoLayout.f37521b;
                                    org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.Z0;
                                    if (z14) {
                                        i10 = 2131751418;
                                    } else {
                                        i10 = 2131751142;
                                    }
                                    y0Var.setText(org.telegram.messenger.gd.N0(i10, null));
                                    if (z14) {
                                        y0Var.setIcon(2131232379);
                                    } else {
                                        y0Var.setAnimatedIcon(2131624132);
                                    }
                                    if (z14) {
                                        uiVar2.Y2.u(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            uiVar2.Y2.u(6);
                                            return;
                                        }
                                        return;
                                    }
                                    uiVar2.Y2.T(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        uiVar2.Y2.T(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.y0 y0Var2 = chatAttachAlertPhotoLayout.f32803b1;
                                    if (z14) {
                                        i11 = 2131745424;
                                    } else {
                                        i11 = 2131745425;
                                    }
                                    y0Var2.setText(org.telegram.messenger.gd.N0(i11, null));
                                    if (z14) {
                                        y0Var2.setIcon(2131231869);
                                        return;
                                    } else {
                                        y0Var2.setIcon(2131231866);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (entry.getValue() instanceof org.telegram.messenger.ef) {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) entry.getValue();
                            efVar.M = z13;
                            efVar.R = false;
                            arrayList.add(Integer.valueOf(efVar.C));
                        }
                    }
                    zlVar.M(new rl(0, arrayList, z13));
                    if (uiVar.f40448w2 != this) {
                        jmVar.f();
                    }
                    rm rmVar2 = uiVar.f40406l2;
                    if (rmVar2 != null) {
                        rmVar2.f39273w.invalidate();
                    }
                } else if (i7 == 2) {
                    rm rmVar3 = uiVar.f40406l2;
                    if (rmVar3 != null) {
                        rmVar3.P();
                    }
                    Iterator it2 = hashMap.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((org.telegram.messenger.ef) ((Map.Entry) it2.next()).getValue()).c()) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    final boolean z14 = !z10;
                    org.telegram.messenger.g0.h3(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout f38948b;

                        {
                            this.f38948b = this;
                        }

                        @Override
                        public final void run() {
                            int i10;
                            int i11;
                            int i12 = r3;
                            boolean z142 = z14;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38948b;
                            switch (i12) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f32795r1;
                                    ui uiVar2 = chatAttachAlertPhotoLayout.f37521b;
                                    org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.Z0;
                                    if (z142) {
                                        i10 = 2131751418;
                                    } else {
                                        i10 = 2131751142;
                                    }
                                    y0Var.setText(org.telegram.messenger.gd.N0(i10, null));
                                    if (z142) {
                                        y0Var.setIcon(2131232379);
                                    } else {
                                        y0Var.setAnimatedIcon(2131624132);
                                    }
                                    if (z142) {
                                        uiVar2.Y2.u(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            uiVar2.Y2.u(6);
                                            return;
                                        }
                                        return;
                                    }
                                    uiVar2.Y2.T(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        uiVar2.Y2.T(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.y0 y0Var2 = chatAttachAlertPhotoLayout.f32803b1;
                                    if (z142) {
                                        i11 = 2131745424;
                                    } else {
                                        i11 = 2131745425;
                                    }
                                    y0Var2.setText(org.telegram.messenger.gd.N0(i11, null));
                                    if (z142) {
                                        y0Var2.setIcon(2131231869);
                                        return;
                                    } else {
                                        y0Var2.setIcon(2131231866);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        if (entry2.getValue() instanceof org.telegram.messenger.ef) {
                            org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) entry2.getValue();
                            efVar2.f27896z = Boolean.valueOf(z14);
                            efVar2.R = false;
                            arrayList2.add(Integer.valueOf(efVar2.C));
                        }
                    }
                    zlVar.M(new rl(1, arrayList2, z14));
                    if (uiVar.f40448w2 != this) {
                        jmVar.f();
                    }
                    rm rmVar4 = uiVar.f40406l2;
                    if (rmVar4 != null) {
                        rmVar4.f39273w.invalidate();
                    }
                } else if (i7 == 4) {
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
                            int i10 = uiVar.O2;
                            org.telegram.ui.ActionBar.g2 g2Var3 = uiVar.f40375a2;
                            if (i10 != 0) {
                                g2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                g2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i11 = uiVar.O2;
                            org.telegram.ui.ActionBar.g2 g2Var4 = uiVar.f40375a2;
                            if (i11 != 0) {
                                g2Var4.startActivityForResult(intent3, 14);
                            } else {
                                g2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        uiVar.a(true);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i7 == 7) {
                    if (uiVar.f40448w2 == uiVar.f40406l2) {
                        z12 = false;
                    }
                    uiVar.P1(z12);
                } else if (i7 == 9) {
                    di.pb.k1(getContext(), getStarsPrice(), true, new d(this, 7), this.f37520a);
                } else if (i7 >= 10) {
                    org.telegram.messenger.ue ueVar = (org.telegram.messenger.ue) this.W0.get(i7 - 10);
                    this.U0 = ueVar;
                    org.telegram.messenger.ue ueVar2 = this.V0;
                    TextView textView = this.f32843y;
                    if (ueVar == ueVar2) {
                        textView.setText(org.telegram.messenger.gd.N0(2131752226, null));
                    } else {
                        textView.setText(ueVar.f27185c);
                    }
                    jmVar.f();
                    this.f32839w.f();
                    this.G.h1(0, -(zlVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void w0(boolean z10) {
        Integer num;
        float f10;
        f81 f81Var = this.m0;
        if ((f81Var.getTag() != null && z10) || (f81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f32826o0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                sl slVar = new sl(this, 1);
                this.f32826o0 = slVar;
                org.telegram.messenger.g0.h3(slVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f32825n0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        f81Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32825n0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.f32825n0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(f81Var, View.ALPHA, f10));
        this.f32825n0.addListener(new yl(this, 1));
        this.f32825n0.start();
        if (z10) {
            sl slVar2 = new sl(this, 2);
            this.f32826o0 = slVar2;
            org.telegram.messenger.g0.h3(slVar2, 2000L);
        }
    }

    @Override
    public final void x() {
        boolean z10;
        ui uiVar = this.f37521b;
        if (uiVar != null && (uiVar.f40375a2 instanceof org.telegram.ui.bn)) {
            z10 = true;
        } else {
            z10 = false;
        }
        X(z10);
    }

    public final void x0() {
        ArrayList arrayList;
        hi.u2 u2Var = this.f32841x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u2Var.f29899b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f32840w0) {
            if (t0()) {
                arrayList = MediaController.f22716c2;
            } else {
                arrayList = MediaController.d2;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.W0 = arrayList2;
            Collections.sort(arrayList2, new ul(arrayList, 0));
        } else {
            this.W0 = new ArrayList();
        }
        boolean isEmpty = this.W0.isEmpty();
        TextView textView = this.f32843y;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.W0.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.ue ueVar = (org.telegram.messenger.ue) this.W0.get(i7);
            hi.a aVar = new hi.a(getContext(), ueVar.d, ueVar.f27185c, ueVar.f27186e.size(), this.f37520a);
            u2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ci.q(this, i7 + 10, 13));
        }
    }

    public final void y0() {
        zl zlVar = this.F;
        if (zlVar != null) {
            for (int i7 = 0; i7 < zlVar.getChildCount(); i7++) {
                View childAt = zlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    ((org.telegram.ui.Cells.s5) childAt).f31781a.invalidate();
                }
            }
        }
    }

    @Override
    public final void z(int i7, boolean z10) {
        Y();
        gm gmVar = this.Q;
        if (gmVar != null) {
            gmVar.invalidateOutline();
            this.Q.invalidate();
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (this.f37521b.f40375a2 instanceof org.telegram.ui.bn) {
            zl zlVar = this.F;
            int childCount = zlVar.getChildCount();
            int i7 = 0;
            while (true) {
                arrayList = f32798u1;
                if (i7 >= childCount) {
                    break;
                }
                View childAt = zlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    org.telegram.messenger.ef e02 = e0(((Integer) s5Var.getTag()).intValue());
                    if (e02 != null) {
                        s5Var.setNum(arrayList.indexOf(Integer.valueOf(e02.C)));
                    }
                }
                i7++;
            }
            zl zlVar2 = this.f32832r;
            int childCount2 = zlVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = zlVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) childAt2;
                    org.telegram.messenger.ef e03 = e0(((Integer) s5Var2.getTag()).intValue());
                    if (e03 != null) {
                        s5Var2.setNum(arrayList.indexOf(Integer.valueOf(e03.C)));
                    }
                }
            }
        }
    }
}
