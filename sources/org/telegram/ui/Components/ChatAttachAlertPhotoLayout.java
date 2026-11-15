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
public class ChatAttachAlertPhotoLayout extends ci implements org.telegram.messenger.is {
    public static boolean f32365r1;
    public static final ArrayList f32366s1 = new ArrayList();
    public static final HashMap f32367t1 = new HashMap();
    public static final ArrayList f32368u1 = new ArrayList();
    public static int f32369v1 = -1;
    public boolean A0;
    public float B0;
    public float C0;
    public boolean D0;
    public final Drawable E;
    public boolean E0;
    public final ql F;
    public final Rect F0;
    public final gi.g G;
    public float G0;
    public final am H;
    public boolean H0;
    public final ny I;
    public boolean I0;
    public final yj0 J;
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
    public xl Q;
    public boolean Q0;
    public final yl R;
    public boolean R0;
    public final vl S;
    public boolean S0;
    public final ImageView[] T;
    public int T0;
    public boolean U;
    public org.telegram.messenger.ve U0;
    public final float[] V;
    public org.telegram.messenger.ve V0;
    public final int[] W;
    public ArrayList W0;
    public float X0;
    public boolean Y0;
    public final org.telegram.ui.ActionBar.z0 Z0;
    public float f32370a0;
    public final org.telegram.ui.ActionBar.z0 f32371a1;
    public float f32372b0;
    public final org.telegram.ui.ActionBar.z0 f32373b1;
    public boolean f32374c0;
    public final org.telegram.ui.ActionBar.z0 f32375c1;
    public boolean f32376d0;
    public final org.telegram.ui.ActionBar.z0 f32377d1;
    public boolean f32378e0;
    public final ja0 f32379e1;
    public float f32380f0;
    public final boolean f32381f1;
    public final int[] f32382g0;
    public final h2.f f32383g1;
    public int f32384h0;
    public boolean f32385h1;
    public nl f32386i0;
    public final tl f32387i1;
    public final DecelerateInterpolator f32388j0;
    public boolean f32389j1;
    public final bi.g2 f32390k0;
    public float f32391k1;
    public final ShutterButton f32392l0;
    public float l1;
    public final s71 m0;
    public float f32393m1;
    public final boolean f32394n;
    public AnimatorSet f32395n0;
    public float n1;
    public Runnable f32396o0;
    public float f32397o1;
    public Boolean f32398p0;
    public ViewPropertyAnimator f32399p1;
    public final TextView f32400q0;
    public int f32401q1;
    public final ql f32402r;
    public final TextView f32403r0;
    public final jg.b0 f32404s;
    public final ImageView f32405s0;
    public boolean f32406t0;
    public boolean f32407u0;
    public boolean f32408v0;
    public final am f32409w;
    public boolean f32410w0;
    public final hi.u2 f32411x;
    public boolean f32412x0;
    public final TextView f32413y;
    public boolean f32414y0;
    public boolean f32415z0;

    public ChatAttachAlertPhotoLayout(ki kiVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, kiVar);
        boolean z12;
        this.T = new ImageView[2];
        this.V = new float[2];
        this.W = new int[2];
        this.f32382g0 = new int[5];
        this.f32388j0 = new DecelerateInterpolator(1.5f);
        this.f32398p0 = null;
        this.F0 = new Rect();
        int L = org.telegram.messenger.g0.L(80.0f);
        this.L0 = L;
        this.M0 = L;
        this.N0 = 3;
        this.Y0 = true;
        this.f32383g1 = new h2.f((int[]) null);
        this.f32387i1 = new tl(this);
        this.f32381f1 = z10;
        this.f32394n = z11;
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25563r2);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25531l4);
        org.telegram.ui.ActionBar.k2 k2Var = kiVar.f29685c;
        ki kiVar2 = this.f33609b;
        if (kiVar2.O2 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f32385h1 = z12;
        hi.u2 u2Var = new hi.u2(this, context, kiVar2.V2.s(), e6Var, 1);
        this.f32411x = u2Var;
        u2Var.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = c8.ja.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = org.telegram.messenger.g0.f23605m;
        this.f33609b.V2.addView(u2Var, 0, d);
        u2Var.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f34362b;

            {
                this.f34362b = this;
            }

            @Override
            public final void onClick(View view) {
                xl xlVar;
                xl xlVar2;
                int i7 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34362b;
                switch (i7) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f32406t0 && (xlVar = chatAttachAlertPhotoLayout.Q) != null && xlVar.isInited()) {
                            chatAttachAlertPhotoLayout.f32376d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f32405s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new pl(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (xlVar2 = chatAttachAlertPhotoLayout.Q) != null && xlVar2.isInited() && chatAttachAlertPhotoLayout.f32374c0) {
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
                                animatorSet.setInterpolator(er.f34419f);
                                animatorSet.addListener(new fi.c3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f32411x.V(null, null);
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
        this.f32413y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        textView.setText(org.telegram.messenger.hd.M0(2131752238, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        Drawable g10 = i5.c.g(context, 2131231253);
        this.E = g10;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.x(this, g10, i7, e6Var, mode);
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
        u2Var.addView(textView, c8.ja.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        X(false);
        ja0 ja0Var = new ja0(context, 2131624140, org.telegram.messenger.hd.M0(2131752560, null), 2131624139, org.telegram.messenger.hd.M0(2131752559, null), e6Var);
        this.f32379e1 = ja0Var;
        ja0Var.a(!this.f33609b.X1, false);
        this.f32377d1 = this.f33609b.Y2.e(7, 2131232421, org.telegram.messenger.hd.M0(2131753957, null));
        this.f33609b.Y2.a(5);
        this.f33609b.Y2.e(4, 2131232266, org.telegram.messenger.hd.M0(2131747796, null));
        this.f32371a1 = this.f33609b.Y2.e(1, 2131232133, org.telegram.messenger.hd.M0(2131745585, null));
        this.f33609b.Y2.e(0, 2131232412, org.telegram.messenger.hd.M0(2131745584, null));
        this.f33609b.Y2.a(6);
        this.Z0 = this.f33609b.Y2.e(3, 2131232377, org.telegram.messenger.hd.M0(2131751154, null));
        this.f32373b1 = this.f33609b.Y2.e(2, 2131231865, org.telegram.messenger.hd.M0(2131745621, null));
        org.telegram.ui.ActionBar.q0 q0Var = this.f33609b.Y2;
        q0Var.q();
        ja0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        ja0Var.setTag(8);
        q0Var.f29497b.addView(ja0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ja0Var.getLayoutParams();
        if (org.telegram.messenger.hd.f24104a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        ja0Var.setLayoutParams(layoutParams);
        ja0Var.setOnClickListener(new org.telegram.ui.ActionBar.a0(q0Var, 2));
        this.f32375c1 = this.f33609b.Y2.e(9, 2131231809, org.telegram.messenger.hd.M0(2131747730, null));
        this.f33609b.Y2.setFitSubItems(true);
        ql qlVar = new ql(this, context, e6Var, 1);
        this.F = qlVar;
        qlVar.setFastScrollEnabled(1);
        qlVar.setFastScrollVisible(true);
        qlVar.getFastScroll().setAlpha(0.0f);
        qlVar.getFastScroll().f42368a = false;
        qlVar.getFastScroll().f42381i0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        am amVar = new am(this, context, z11);
        this.H = amVar;
        qlVar.setAdapter(amVar);
        yl ylVar = new yl(this, qlVar);
        this.R = ylVar;
        qlVar.i(ylVar);
        int i10 = 0;
        for (int i11 = 8; i10 < i11; i11 = 8) {
            amVar.h.add(amVar.L());
            i10++;
        }
        qlVar.setClipToPadding(false);
        qlVar.setItemAnimator(null);
        qlVar.setLayoutAnimation(null);
        qlVar.setVerticalScrollBarEnabled(false);
        org.telegram.ui.ActionBar.q6.l(qlVar, 21, org.telegram.ui.ActionBar.j6.A5, e6Var);
        addView(qlVar, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        qlVar.setOnScrollListener(new hi.f8(1, this));
        gi.g gVar = new gi.g(this, this.L0, 3);
        this.G = gVar;
        gVar.O = new bi.y1(this, 10);
        qlVar.setLayoutManager(gVar);
        qlVar.setOnItemClickListener(new ab.j(this, z11, e6Var, 7));
        qlVar.setOnItemLongClickListener(new fl(this, 2));
        yj0 yj0Var = new yj0(new cf(this));
        this.J = yj0Var;
        qlVar.F.add(yj0Var);
        setBlur3Capture(qlVar);
        this.d = qlVar;
        this.f33612f = true;
        ny nyVar = new ny(context, e6Var);
        this.I = nyVar;
        nyVar.setText(org.telegram.messenger.hd.M0(2131748180, null));
        nyVar.setOnTouchListener(null);
        nyVar.setTextSize(16);
        addView(nyVar, c8.ja.c(-2.0f, -1));
        if (this.Y0) {
            nyVar.b();
        } else {
            nyVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        vl vlVar = new vl(context, paint);
        this.S = vlVar;
        org.telegram.messenger.g0.Y3(vlVar, false, 1.0f, true, false);
        vlVar.setBackgroundResource(2131232772);
        vlVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        vlVar.setTextSize(1, 15.0f);
        vlVar.setTypeface(org.telegram.messenger.g0.o());
        vlVar.setAlpha(0.0f);
        vlVar.setTextColor(-1);
        vlVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        k2Var.addView(vlVar, c8.ja.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        bi.g2 g2Var = new bi.g2(16, context, this);
        this.f32390k0 = g2Var;
        g2Var.setVisibility(8);
        g2Var.setAlpha(0.0f);
        k2Var.addView(g2Var, c8.ja.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f32400q0 = textView2;
        textView2.setBackgroundResource(2131232537);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131232535, 0);
        textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        k2Var.addView(textView2, c8.ja.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f34362b;

            {
                this.f34362b = this;
            }

            @Override
            public final void onClick(View view) {
                xl xlVar;
                xl xlVar2;
                int i72 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34362b;
                switch (i72) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f32406t0 && (xlVar = chatAttachAlertPhotoLayout.Q) != null && xlVar.isInited()) {
                            chatAttachAlertPhotoLayout.f32376d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f32405s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new pl(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (xlVar2 = chatAttachAlertPhotoLayout.Q) != null && xlVar2.isInited() && chatAttachAlertPhotoLayout.f32374c0) {
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
                                animatorSet.setInterpolator(er.f34419f);
                                animatorSet.addListener(new fi.c3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f32411x.V(null, null);
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
        s71 s71Var = new s71(context);
        this.m0 = s71Var;
        s71Var.setVisibility(8);
        s71Var.setAlpha(0.0f);
        k2Var.addView(s71Var, c8.ja.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        s71Var.setDelegate(new fl(this, 3));
        ?? view = new View(context);
        view.f32726b = new DecelerateInterpolator();
        view.f32734x = new zj(view, 17);
        view.f32725a = view.getResources().getDrawable(2131230928);
        Paint paint2 = new Paint(1);
        view.f32727c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f32729f = dt0.f34049a;
        this.f32392l0 = view;
        g2Var.addView((View) view, c8.ja.e(84, 84, 17));
        view.setDelegate(new ol(this, e6Var, k2Var));
        view.setFocusable(true);
        view.setContentDescription(org.telegram.messenger.hd.M0(2131754760, null));
        ImageView imageView = new ImageView(context);
        this.f32405s0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        g2Var.addView(imageView, c8.ja.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f34362b;

            {
                this.f34362b = this;
            }

            @Override
            public final void onClick(View view2) {
                xl xlVar;
                xl xlVar2;
                int i72 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34362b;
                switch (i72) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f32406t0 && (xlVar = chatAttachAlertPhotoLayout.Q) != null && xlVar.isInited()) {
                            chatAttachAlertPhotoLayout.f32376d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f32405s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new pl(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.U && (xlVar2 = chatAttachAlertPhotoLayout.Q) != null && xlVar2.isInited() && chatAttachAlertPhotoLayout.f32374c0) {
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
                                animatorSet.setInterpolator(er.f34419f);
                                animatorSet.addListener(new fi.c3(chatAttachAlertPhotoLayout, view2, imageView2, 4));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f32411x.V(null, null);
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
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754752, null));
        for (int i12 = 0; i12 < 2; i12++) {
            this.T[i12] = new ImageView(context);
            this.T[i12].setScaleType(ImageView.ScaleType.CENTER);
            this.T[i12].setVisibility(4);
            this.f32390k0.addView(this.T[i12], c8.ja.e(48, 48, 51));
            this.T[i12].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f34362b;

                {
                    this.f34362b = this;
                }

                @Override
                public final void onClick(View view2) {
                    xl xlVar;
                    xl xlVar2;
                    int i72 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34362b;
                    switch (i72) {
                        case 0:
                            if (!chatAttachAlertPhotoLayout.f32406t0 && (xlVar = chatAttachAlertPhotoLayout.Q) != null && xlVar.isInited()) {
                                chatAttachAlertPhotoLayout.f32376d0 = false;
                                chatAttachAlertPhotoLayout.Q.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f32405s0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new pl(chatAttachAlertPhotoLayout, 0));
                                duration.start();
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.U && (xlVar2 = chatAttachAlertPhotoLayout.Q) != null && xlVar2.isInited() && chatAttachAlertPhotoLayout.f32374c0) {
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
                                    animatorSet.setInterpolator(er.f34419f);
                                    animatorSet.addListener(new fi.c3(chatAttachAlertPhotoLayout, view2, imageView2, 4));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        case 2:
                            chatAttachAlertPhotoLayout.f32411x.V(null, null);
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
        this.f32403r0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setText(org.telegram.messenger.hd.M0(2131744270, null));
        textView3.setShadowLayer(org.telegram.messenger.g0.L(3.33333f), 0.0f, org.telegram.messenger.g0.L(0.666f), 1275068416);
        textView3.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.f32390k0.addView(textView3, c8.ja.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        ql qlVar2 = new ql(this, context, e6Var, 0);
        this.f32402r = qlVar2;
        qlVar2.setVerticalScrollBarEnabled(true);
        am amVar2 = new am(this, context, false);
        this.f32409w = amVar2;
        qlVar2.setAdapter(amVar2);
        for (int i13 = 0; i13 < 8; i13++) {
            amVar2.h.add(amVar2.L());
        }
        qlVar2.setClipToPadding(false);
        qlVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        qlVar2.setItemAnimator(null);
        qlVar2.setLayoutAnimation(null);
        qlVar2.setOverScrollMode(2);
        qlVar2.setVisibility(4);
        qlVar2.setAlpha(0.0f);
        k2Var.addView(qlVar2, c8.ja.c(80.0f, -1));
        jg.b0 b0Var = new jg.b0(0, false, 7);
        this.f32404s = b0Var;
        qlVar2.setLayoutManager(b0Var);
        qlVar2.setOnItemClickListener(new bi.a(3));
    }

    public static org.telegram.ui.Cells.q5 P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        ql qlVar = chatAttachAlertPhotoLayout.F;
        int childCount = qlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qlVar.getChildAt(i10);
            if (childAt.getTop() < qlVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f33609b.Z0() && (childAt instanceof org.telegram.ui.Cells.q5)) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (q5Var.getImageView().getTag() != null && ((Integer) q5Var.getImageView().getTag()).intValue() == i7) {
                    return q5Var;
                }
            }
        }
        return null;
    }

    public static int R(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ki kiVar = chatAttachAlertPhotoLayout.f33609b;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
        if ((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).f45203g4 == 5) {
            return ((org.telegram.messenger.j0) e2Var.getMessagesController().f25451y7.f25843d0.f15881b).f24498c - ((org.telegram.ui.an) kiVar.f36424a2).L6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static boolean V() {
        HashMap hashMap = f32367t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                    if (ffVar.d() && ffVar.j()) {
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
            ArrayList arrayList = f32368u1;
            if (i7 >= arrayList.size()) {
                break;
            }
            Object obj = f32367t1.get(arrayList.get(i7));
            if (obj instanceof org.telegram.messenger.ff) {
                charSequence = ((org.telegram.messenger.ff) obj).f27709a;
            } else if (obj instanceof org.telegram.messenger.jf) {
                charSequence = ((org.telegram.messenger.jf) obj).I;
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
        HashMap hashMap = f32367t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((entry.getValue() instanceof org.telegram.messenger.ff) && ((org.telegram.messenger.ff) entry.getValue()).d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(7.0f) + this.f32401q1;
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
                imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754913, null));
                return;
            case 1:
                imageView.setImageResource(2131231193);
                imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754914, null));
                return;
            case 2:
                imageView.setImageResource(2131231192);
                imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754915, null));
                return;
            default:
                return;
        }
    }

    public void setAlertKeepScreenOn(boolean z10) {
        Window window = this.f33609b.getWindow();
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
        ShutterButton shutterButton = this.f32392l0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.R0;
        dt0 dt0Var = dt0.f34049a;
        dt0 dt0Var2 = dt0.f34050b;
        if (!z10) {
            if (this.Q != null && shutterButton.getState() == dt0Var2) {
                o0();
                CameraController.getInstance().stopVideoRecording(this.Q.getCameraSession(), false);
                shutterButton.a(dt0Var);
            }
            if (this.f32374c0) {
                d0(false);
            }
            g0(true);
            return;
        }
        if (this.Q != null && shutterButton.getState() == dt0Var2) {
            shutterButton.a(dt0Var);
        }
        this.R0 = false;
    }

    public final void A0() {
        ArrayList arrayList;
        am amVar;
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
        ki kiVar = this.f33609b;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.f36424a2;
        if (e2Var instanceof org.telegram.ui.an) {
            ql qlVar = this.F;
            int childCount = qlVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f32368u1;
                amVar = this.H;
                hashMap = f32367t1;
                int i11 = -1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = qlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (amVar.f33019f && R > this.N0) {
                        R--;
                    }
                    if (amVar.d && this.U0 == this.V0) {
                        R--;
                    }
                    org.telegram.messenger.ff e02 = e0(R);
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
                    if ((e2Var2 instanceof org.telegram.ui.an) && kiVar.R3) {
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
            ql qlVar2 = this.f32402r;
            int childCount2 = qlVar2.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = qlVar2.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (amVar.f33019f && R2 > this.N0) {
                        R2--;
                    }
                    if (amVar.d && this.U0 == this.V0) {
                        R2--;
                    }
                    org.telegram.messenger.ff e03 = e0(R2);
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
                    if ((e2Var2 instanceof org.telegram.ui.an) && kiVar.R3) {
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
                        q5Var2.b(i7, z13, true);
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
        TextView textView = this.f32400q0;
        if (textView != null) {
            ki kiVar = this.f33609b;
            int i7 = kiVar.O2;
            TextView textView2 = kiVar.f36445h3;
            if (i7 == 0 && !kiVar.R2 && !kiVar.C1) {
                HashMap hashMap = f32367t1;
                Iterator it = hashMap.entrySet().iterator();
                int i10 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    z11 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((org.telegram.messenger.ff) ((Map.Entry) it.next()).getValue()).f27710b) {
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
                    textView.setText(org.telegram.messenger.hd.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                    if (max != this.N || z10) {
                        textView2.setText(org.telegram.messenger.hd.G(max, "MediaSelected", new Object[0]));
                    }
                } else if (z12) {
                    textView.setText(org.telegram.messenger.hd.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                    if (max != this.N || z10) {
                        textView2.setText(org.telegram.messenger.hd.G(max, "VideosSelected", new Object[0]));
                    }
                } else {
                    textView.setText(org.telegram.messenger.hd.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                    if (max != this.N || z10) {
                        textView2.setText(org.telegram.messenger.hd.G(max, "PhotosSelected", new Object[0]));
                    }
                }
                if (max <= 1) {
                    z11 = false;
                }
                kiVar.H1 = z11;
                kiVar.f36453k3.setVisibility((!z11 || kiVar.O2 == 2) ? 8 : 8);
                this.N = max;
            }
        }
    }

    @Override
    public final void C() {
        ki kiVar = this.f33609b;
        if (kiVar.isShowing() && !kiVar.J && !PhotoViewer.p1().P1()) {
            X(false);
        }
    }

    @Override
    public final void D(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.D(int):void");
    }

    @Override
    public final boolean H(int i7) {
        if (this.f32374c0) {
            if (i7 == 24 || i7 == 25 || i7 == 79 || i7 == 85) {
                ((ol) this.f32392l0.getDelegate()).a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void I(ci ciVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f32399p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f32411x.setVisibility(0);
        boolean z10 = ciVar instanceof im;
        TextView textView = this.f32413y;
        if (!z10) {
            c0();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(er.f34422j);
            this.f32399p1 = interpolator;
            interpolator.start();
        }
        this.f33609b.V2.setTitle("");
        this.G.h1(0, 0);
        if (z10) {
            this.F.post(new od(18, this, ciVar));
        }
        Y();
        p0();
    }

    @Override
    public final void J() {
        this.O = false;
        xl xlVar = this.Q;
        if (xlVar != null) {
            xlVar.setVisibility(0);
        }
        if (this.f32408v0) {
            this.f32408v0 = false;
            X(true);
        }
    }

    @Override
    public final void K() {
        this.F.y0(0);
    }

    public final int T(org.telegram.messenger.ff ffVar, int i7) {
        boolean z10;
        Integer valueOf = Integer.valueOf(ffVar.C);
        HashMap hashMap = f32367t1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f32368u1;
        if (containsKey) {
            ffVar.N = 0L;
            ffVar.M = false;
            ffVar.O = null;
            ffVar.f27731z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            B0(false);
            z0();
            if (i7 >= 0) {
                ffVar.e();
                this.f32387i1.X(i7);
            }
            return indexOf;
        }
        ffVar.N = getStarsPrice();
        if (getStarsPrice() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ffVar.M = z10;
        ffVar.R = false;
        if (f0()) {
            ffVar.O = Boolean.valueOf(!V());
        }
        ffVar.f27731z = Boolean.valueOf(ffVar.c());
        boolean Z = Z(true);
        hashMap.put(valueOf, ffVar);
        arrayList.add(valueOf);
        if (Z) {
            A0();
            return -1;
        }
        B0(true);
        return -1;
    }

    public final void U() {
        xl xlVar = this.Q;
        if (xlVar != null) {
            if (!this.f32374c0) {
                xlVar.setTranslationX(this.V[0]);
            }
            int i7 = this.L0;
            int L = org.telegram.messenger.g0.L(2.0f) + (i7 * 2);
            if (!this.f32374c0) {
                this.Q.setClipTop((int) this.f32370a0);
                this.Q.setClipBottom((int) this.f32372b0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
                if (layoutParams.height != L || layoutParams.width != i7) {
                    layoutParams.width = i7;
                    layoutParams.height = L;
                    this.Q.setLayoutParams(layoutParams);
                    org.telegram.messenger.g0.h3(new od(19, this, layoutParams));
                }
            }
        }
    }

    public final void X(boolean z10) {
        org.telegram.ui.ActionBar.e2 e2Var;
        boolean z11;
        am amVar;
        ki kiVar = this.f33609b;
        boolean z12 = kiVar.Q1;
        org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.f36424a2;
        if (!z12 && this.f32394n) {
            boolean z13 = this.O0;
            boolean z14 = this.P0;
            if (e2Var2 == null) {
                e2Var = LaunchActivity.Q();
            } else {
                e2Var = e2Var2;
            }
            if (e2Var != null && e2Var.getParentActivity() != null) {
                if (!org.telegram.messenger.gz.f23999y0) {
                    this.O0 = false;
                } else {
                    if (e2Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.P0 = z11;
                    if (z11) {
                        if (z10) {
                            try {
                                e2Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                            } catch (Exception unused) {
                            }
                        }
                        this.O0 = false;
                    } else {
                        if (z10 || org.telegram.messenger.gz.P0) {
                            CameraController.getInstance().initCamera(null);
                        }
                        this.O0 = CameraController.getInstance().isCameraInitied();
                    }
                }
                if ((z13 != this.O0 || z14 != this.P0) && (amVar = this.H) != null) {
                    amVar.f();
                }
                if (!kiVar.Q1 && kiVar.isShowing() && this.O0 && ((Paint) kiVar.Z.f29661b).getAlpha() != 0 && !this.f32374c0) {
                    v0();
                }
            }
        }
    }

    public final void Y() {
        v4.e1 K;
        float[] fArr;
        int i7;
        float f10;
        int systemWindowInsetTop;
        if (!PhotoViewer.A1() || PhotoViewer.p1().f42852p5 == null || !PhotoViewer.p1().f42852p5.W) {
            xl xlVar = this.Q;
            if (xlVar != null) {
                xlVar.invalidateOutline();
            }
            ql qlVar = this.F;
            v4.e1 K2 = qlVar.K(this.N0 - 1);
            if (K2 != null) {
                K2.f58535a.invalidateOutline();
            }
            if ((!this.H.d || !this.O0 || this.U0 != this.V0) && (K = qlVar.K(0)) != null) {
                K.f58535a.invalidateOutline();
            }
            xl xlVar2 = this.Q;
            if (xlVar2 != null) {
                xlVar2.invalidate();
            }
            vl vlVar = this.S;
            if (vlVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vlVar.getLayoutParams();
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
            int childCount = qlVar.getChildCount();
            int i10 = 0;
            while (true) {
                fArr = this.V;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = qlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.k5) {
                    if (childAt.isAttachedToWindow()) {
                        float y10 = getY() + qlVar.getY() + childAt.getY();
                        ki kiVar = this.f33609b;
                        ViewGroup viewGroup = kiVar.f29682b;
                        lh lhVar = kiVar.f36498w3;
                        ai.k0 k0Var = kiVar.M2;
                        float y11 = viewGroup.getY() + y10;
                        float x10 = (kiVar.f29682b.getX() + (getX() + (qlVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                        if (!kiVar.f36427b2) {
                            i7 = org.telegram.messenger.g0.f23605m;
                        } else {
                            i7 = 0;
                        }
                        float alpha = (k0Var.getAlpha() * k0Var.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
                        hi.i iVar = kiVar.C4;
                        if (iVar != null && iVar.g()) {
                            alpha = Math.max(alpha, (kiVar.C4.e() + kiVar.C4.getY()) - kiVar.f36451j4);
                        }
                        if (y10 < alpha) {
                            f10 = alpha - y10;
                        } else {
                            f10 = 0.0f;
                        }
                        if (f10 != this.f32370a0) {
                            this.f32370a0 = f10;
                            xl xlVar3 = this.Q;
                            if (xlVar3 != null) {
                                xlVar3.invalidateOutline();
                                this.Q.invalidate();
                            }
                        }
                        float translationY = (int) (lhVar.getTranslationY() + (kiVar.f29682b.getMeasuredHeight() - lhVar.getMeasuredHeight()));
                        hi.i iVar2 = kiVar.C4;
                        if (iVar2 != null) {
                            translationY -= iVar2.d() - org.telegram.messenger.g0.L(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y10 > translationY) {
                            this.f32372b0 = Math.min(-org.telegram.messenger.g0.L(5.0f), y10 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.f32372b0 = 0.0f;
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
            if (this.f32370a0 != 0.0f) {
                this.f32370a0 = 0.0f;
                xl xlVar4 = this.Q;
                if (xlVar4 != null) {
                    xlVar4.invalidateOutline();
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
            HashMap hashMap = f32367t1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f32368u1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof org.telegram.messenger.ff)) {
                break;
            }
            T((org.telegram.messenger.ff) obj, -1);
            z11 = true;
        }
        return z11;
    }

    @Override
    public final void a(CharSequence charSequence) {
        org.telegram.messenger.ff ffVar;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = f32368u1;
            if (i7 < arrayList.size()) {
                if (i7 == 0) {
                    Object obj = arrayList.get(i7);
                    HashMap hashMap = f32367t1;
                    Object obj2 = hashMap.get(obj);
                    if (obj2 instanceof org.telegram.messenger.ff) {
                        org.telegram.messenger.ff clone = ((org.telegram.messenger.ff) obj2).clone();
                        CharSequence[] charSequenceArr = {charSequence};
                        clone.f27720n = org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24940t0).W(charSequenceArr, false, true);
                        clone.f27709a = charSequenceArr[0];
                        ffVar = clone;
                    } else {
                        boolean z10 = obj2 instanceof org.telegram.messenger.jf;
                        ffVar = obj2;
                        if (z10) {
                            org.telegram.messenger.jf clone2 = ((org.telegram.messenger.jf) obj2).clone();
                            CharSequence[] charSequenceArr2 = {charSequence};
                            clone2.f27720n = org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24940t0).W(charSequenceArr2, false, true);
                            clone2.I = charSequenceArr2[0];
                            ffVar = clone2;
                        }
                    }
                    hashMap.put(obj, ffVar);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean a0(org.telegram.messenger.ff ffVar) {
        boolean z10 = this.f32412x0;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33608a;
        ki kiVar = this.f33609b;
        if (!z10 && ffVar.f27710b) {
            if (!kiVar.N0()) {
                org.telegram.messenger.k5.o(null, 2131749538, new cc(kiVar.f36470p3, e6Var), null);
                return true;
            }
        } else if (!this.f32414y0 && !ffVar.f27710b) {
            if (!kiVar.N0()) {
                org.telegram.messenger.k5.o(null, 2131749542, new cc(kiVar.f36470p3, e6Var), null);
                return true;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b() {
        return !this.f32374c0;
    }

    public final void b0() {
        if (this.Q0) {
            boolean h02 = h0();
            this.Q0 = h02;
            if (!h02) {
                i0();
            }
            this.H.f();
            this.f32409w.f();
        }
    }

    @Override
    public final boolean c() {
        for (Map.Entry entry : f32367t1.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof org.telegram.messenger.ff) {
                if (((org.telegram.messenger.ff) value).f27729x != 0) {
                    return false;
                }
            } else if ((value instanceof org.telegram.messenger.jf) && ((org.telegram.messenger.jf) value).f27729x != 0) {
                return false;
            }
        }
        return true;
    }

    public final void c0() {
        String M0 = org.telegram.messenger.hd.M0(2131751154, null);
        org.telegram.ui.ActionBar.z0 z0Var = this.Z0;
        z0Var.setText(M0);
        z0Var.setAnimatedIcon(2131624132);
        this.f33609b.Y2.T(1);
        HashMap hashMap = f32367t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((org.telegram.messenger.ff) entry.getValue()).e();
            }
            hashMap.clear();
            f32368u1.clear();
        }
        ArrayList arrayList = f32366s1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList.get(i7);
                new File(ffVar.I).delete();
                if (ffVar.h != null) {
                    new File(ffVar.h).delete();
                }
                if (ffVar.f27711c != null) {
                    new File(ffVar.f27711c).delete();
                }
            }
            arrayList.clear();
        }
        this.H.f();
        this.f32409w.f();
    }

    @Override
    public final void d() {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z10 = this.f32381f1;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.j6.Yg;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        }
        int i13 = org.telegram.ui.ActionBar.j6.f28832c7;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33608a;
        this.I.setTextColor(org.telegram.ui.ActionBar.j6.w0(i13, e6Var));
        int i14 = org.telegram.ui.ActionBar.j6.A5;
        ql qlVar = this.F;
        org.telegram.ui.ActionBar.q6.H(qlVar, i14, e6Var);
        qlVar.K(0);
        org.telegram.ui.ActionBar.q6.U(this.f32413y, i7, e6Var);
        if (z10) {
            i10 = org.telegram.ui.ActionBar.j6.Yg;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.E8;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        hi.u2 u2Var = this.f32411x;
        u2Var.P(w02, false);
        if (z10) {
            i11 = org.telegram.ui.ActionBar.j6.Yg;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.E8;
        }
        u2Var.P(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), true);
        if (z10) {
            i12 = org.telegram.ui.ActionBar.j6.f28802ah;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.G8;
        }
        u2Var.I(org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
        org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), this.E);
    }

    public final void d0(boolean z10) {
        boolean z11;
        xl xlVar;
        if (!this.f32406t0 && this.Q != null) {
            int i7 = this.L0;
            int[] iArr = this.f32382g0;
            iArr[1] = i7;
            iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i7 * 2);
            Runnable runnable = this.f32396o0;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f32396o0 = null;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.f33608a)) > 0.721d) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.g0.n3(this.f33609b, z11);
            TextView textView = this.f32400q0;
            ql qlVar = this.f32402r;
            bi.g2 g2Var = this.f32390k0;
            ql qlVar2 = this.F;
            ImageView[] imageViewArr = this.T;
            s71 s71Var = this.m0;
            if (z10) {
                this.f32391k1 = this.Q.getTranslationY();
                this.f32378e0 = true;
                if (qlVar2 != null) {
                    qlVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(g2Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(s71Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(qlVar, property, 0.0f));
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
                this.f32383g1.d();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(er.f34419f);
                animatorSet.addListener(new pl(this, 3));
                animatorSet.start();
            } else {
                this.f32389j1 = false;
                setAlertKeepScreenOn(false);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                g2Var.setAlpha(0.0f);
                g2Var.setVisibility(8);
                s71Var.setAlpha(0.0f);
                s71Var.setTag(null);
                s71Var.setVisibility(8);
                qlVar.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                qlVar.setVisibility(8);
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
                this.f32374c0 = false;
                xl xlVar2 = this.Q;
                if (xlVar2 != null) {
                    xlVar2.setFpsLimit(30);
                    this.Q.setSystemUiVisibility(1024);
                }
                if (qlVar2 != null) {
                    qlVar2.invalidate();
                }
            }
            xl xlVar3 = this.Q;
            if (xlVar3 != null) {
                xlVar3.setImportantForAccessibility(0);
            }
            qlVar2.setImportantForAccessibility(0);
            if (!org.telegram.messenger.qc.e(360928) && (xlVar = this.Q) != null) {
                xlVar.showTexture(false, z10);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ki kiVar;
        if (i7 == org.telegram.messenger.ns.f25563r2) {
            am amVar = this.H;
            if (amVar != null) {
                if (t0()) {
                    this.V0 = MediaController.f22323a2;
                } else {
                    this.V0 = MediaController.f22324b2;
                }
                if (this.U0 != null && ((kiVar = this.f33609b) == null || !kiVar.B1)) {
                    if (t0()) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= MediaController.f22325c2.size()) {
                                break;
                            }
                            org.telegram.messenger.ve veVar = (org.telegram.messenger.ve) MediaController.f22325c2.get(i11);
                            int i12 = veVar.f26969a;
                            org.telegram.messenger.ve veVar2 = this.U0;
                            if (i12 == veVar2.f26969a && veVar.f26970b == veVar2.f26970b) {
                                this.U0 = veVar;
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
                amVar.f();
                this.f32409w.f();
                ArrayList arrayList = f32368u1;
                if (!arrayList.isEmpty() && this.V0 != null) {
                    int size = arrayList.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        Integer num = (Integer) arrayList.get(i13);
                        HashMap hashMap = f32367t1;
                        Object obj = hashMap.get(num);
                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.V0.f26973f.get(num.intValue());
                        if (ffVar != null) {
                            if (obj instanceof org.telegram.messenger.ff) {
                                ffVar.g((org.telegram.messenger.ff) obj);
                            }
                            hashMap.put(num, ffVar);
                        }
                    }
                }
                x0();
            }
        } else if (i7 == org.telegram.messenger.ns.f25531l4) {
            X(false);
        }
    }

    public final org.telegram.messenger.ff e0(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = f32366s1;
        int size = arrayList.size();
        if (i7 < size) {
            return (org.telegram.messenger.ff) arrayList.get(i7);
        }
        int i10 = i7 - size;
        org.telegram.messenger.ve veVar = this.U0;
        if (veVar == null || i10 >= veVar.f26972e.size()) {
            return null;
        }
        return (org.telegram.messenger.ff) this.U0.f26972e.get(i10);
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
            org.telegram.messenger.g0.i3(new jl(this, 0), 300L);
            this.f32376d0 = false;
        }
    }

    public ArrayList<Object> getAllPhotosArray() {
        org.telegram.messenger.ve veVar = this.U0;
        ArrayList<Object> arrayList = f32366s1;
        if (veVar != null) {
            if (!arrayList.isEmpty()) {
                ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.U0.f26972e.size());
                arrayList2.addAll(arrayList);
                arrayList2.addAll(this.U0.f26972e);
                return arrayList2;
            }
            return this.U0.f26972e;
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
        return this.f32380f0;
    }

    @Override
    public int getCurrentItemTop() {
        ql qlVar = this.F;
        int childCount = qlVar.getChildCount();
        ny nyVar = this.I;
        if (childCount <= 0) {
            qlVar.setTopGlowOffset(qlVar.getPaddingTop());
            nyVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = qlVar.getChildAt(0);
        cj0 cj0Var = (cj0) qlVar.G(childAt);
        int top = childAt.getTop() - this.f32401q1;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || cj0Var == null || cj0Var.b() != 0) {
            top = L;
        }
        nyVar.setTranslationY(((((getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f)) - nyVar.getMeasuredHeight()) / 2.0f) + top);
        qlVar.setTopGlowOffset(top);
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
        return f32368u1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f32367t1;
    }

    public int getSelectedPhotosCount() {
        int i7 = 0;
        for (Object obj : f32367t1.values()) {
            if (obj instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                if (!ffVar.f27710b && ffVar.f27725s == null) {
                    i7++;
                }
            }
        }
        return i7;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i7 = 0;
        for (Object obj : f32367t1.values()) {
            if (obj instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                if (ffVar.c() && !ffVar.f27710b && ffVar.f27725s == null) {
                    i7++;
                }
            }
        }
        return i7;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return f32368u1;
    }

    public long getStarsPrice() {
        Iterator it = f32367t1.entrySet().iterator();
        if (it.hasNext()) {
            return ((org.telegram.messenger.ff) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    public final boolean h0() {
        Activity W = org.telegram.messenger.g0.W(getContext());
        if (W == null) {
            W = this.f33609b.f36424a2.getParentActivity();
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
        org.telegram.messenger.ve veVar;
        if (t0()) {
            veVar = MediaController.f22323a2;
        } else {
            veVar = MediaController.f22324b2;
        }
        if (veVar == null) {
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
        xl xlVar;
        xl xlVar2 = this.Q;
        if (xlVar2 != null && this.P == null) {
            ki kiVar = this.f33609b;
            if (!kiVar.J) {
                xlVar2.initTexture();
                boolean t02 = t0();
                TextView textView = this.f32403r0;
                int i7 = 0;
                if (t02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f32366s1.isEmpty();
                ql qlVar = this.f32402r;
                TextView textView2 = this.f32400q0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    qlVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    qlVar.setVisibility(0);
                }
                if (kiVar.a1().f39061w && isFocusable()) {
                    kiVar.a1().d();
                }
                s71 s71Var = this.m0;
                s71Var.setVisibility(0);
                s71Var.setAlpha(0.0f);
                bi.g2 g2Var = this.f32390k0;
                g2Var.setVisibility(0);
                g2Var.setTag(null);
                int[] iArr = this.f32382g0;
                iArr[0] = 0;
                int i10 = this.L0;
                iArr[1] = i10;
                iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i10 * 2);
                this.f32391k1 = 0.0f;
                this.f32389j1 = true;
                xl xlVar3 = this.Q;
                if (xlVar3 != null) {
                    xlVar3.setFpsLimit(-1);
                }
                org.telegram.messenger.g0.v1(this);
                org.telegram.messenger.g0.n3(kiVar, false);
                setAlertKeepScreenOn(true);
                ql qlVar2 = this.F;
                ImageView[] imageViewArr = this.T;
                if (z10) {
                    setCameraOpenProgress(0.0f);
                    this.f32378e0 = true;
                    if (qlVar2 != null) {
                        qlVar2.invalidate();
                    }
                    this.f32383g1.d();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(g2Var, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(qlVar, property, 1.0f));
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
                    animatorSet.setInterpolator(er.f34419f);
                    animatorSet.addListener(new pl(this, 2));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    g2Var.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    qlVar.setAlpha(1.0f);
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
                    kiVar.X3.K0();
                    xl xlVar4 = this.Q;
                    if (xlVar4 != null) {
                        xlVar4.setSystemUiVisibility(1028);
                    }
                }
                this.f32374c0 = true;
                xl xlVar5 = this.Q;
                if (xlVar5 != null) {
                    xlVar5.setImportantForAccessibility(2);
                }
                qlVar2.setImportantForAccessibility(4);
                qlVar2.invalidate();
                if (!org.telegram.messenger.qc.e(360928) && (xlVar = this.Q) != null && xlVar.isInited()) {
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
        if (org.telegram.messenger.gz.f23999y0) {
            k0(true);
            return;
        }
        ki kiVar = this.f33609b;
        ii iiVar = kiVar.X3;
        if (iiVar != null) {
            iiVar.y1(0, false, true, 0, 0, 0L, kiVar.f1(), false, 0L);
        }
    }

    @Override
    public final void m(float f10) {
        this.X0 = f10;
        Y();
        xl xlVar = this.Q;
        if (xlVar != null) {
            xlVar.invalidateOutline();
            this.Q.invalidate();
        }
        invalidate();
    }

    public final void m0(org.telegram.messenger.ff ffVar, boolean z10, boolean z11) {
        int i7;
        org.telegram.ui.an anVar;
        org.telegram.ui.an anVar2;
        ArrayList<Object> arrayList;
        int i10;
        ArrayList arrayList2 = f32366s1;
        ki kiVar = this.f33609b;
        if (ffVar != null) {
            int i11 = ffVar.C;
            arrayList2.add(ffVar);
            f32367t1.put(Integer.valueOf(i11), ffVar);
            f32368u1.add(Integer.valueOf(i11));
            kiVar.K1(0);
            this.H.f();
            this.f32409w.f();
        }
        if (ffVar != null && !z11 && arrayList2.size() > 1) {
            B0(false);
            if (this.Q != null) {
                this.m0.b(false, 0.0f);
                this.C0 = 0.0f;
                this.Q.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f32407u0 = true;
            org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
            org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.f36424a2;
            if (e2Var == null) {
                e2Var = LaunchActivity.Q();
            }
            if (e2Var != null) {
                PhotoViewer.p1().I2(e2Var.getParentActivity(), null, this.f33608a);
                PhotoViewer.p1().J2(kiVar);
                PhotoViewer p12 = PhotoViewer.p1();
                int i12 = kiVar.Q3;
                boolean z12 = kiVar.R3;
                p12.h = i12;
                p12.f42830n = z12;
                if (kiVar.A1 && kiVar.B1) {
                    anVar = (org.telegram.ui.an) e2Var2;
                    i7 = 11;
                } else {
                    if (kiVar.O2 != 0) {
                        i7 = 1;
                    } else if (e2Var2 instanceof org.telegram.ui.an) {
                        anVar = (org.telegram.ui.an) e2Var2;
                        i7 = 2;
                    } else {
                        i7 = 5;
                    }
                    anVar = null;
                }
                boolean z13 = kiVar.C1;
                if (z13) {
                    i7 = 13;
                    anVar2 = null;
                } else {
                    anVar2 = anVar;
                }
                int i13 = i7;
                if (kiVar.O2 == 0 && !z13) {
                    arrayList = getAllPhotosArray();
                    i10 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(ffVar);
                    i10 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                k30 k30Var = kiVar.L1;
                if (k30Var != null && ffVar != null) {
                    k30Var.f36261e = ffVar.f27710b;
                }
                PhotoViewer.p1().f2(arrayList3, i10, i13, false, new rl(this, z10), anVar2);
                PhotoViewer.p1().v2(kiVar.L1);
                if (kiVar.B1) {
                    PhotoViewer.p1().S0(null, null, false, kiVar.E1);
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
        xl xlVar;
        if (!this.f32378e0) {
            if (this.f32374c0 && motionEvent != null) {
                boolean z10 = this.H0;
                s71 s71Var = this.m0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.F0;
                    s71Var.getHitRect(rect);
                    if (s71Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f32406t0 && !this.J0) {
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
                    ql qlVar = this.f32402r;
                    TextView textView = this.f32400q0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.T;
                    bi.g2 g2Var = this.f32390k0;
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
                                s71Var.b(false, this.C0);
                                this.f33609b.f29682b.invalidate();
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
                            } else if (this.J0 && (xlVar = this.Q) != null) {
                                xlVar.setTranslationY(xlVar.getTranslationY() + f10);
                                this.G0 = y10;
                                s71Var.setTag(null);
                                Runnable runnable = this.f32396o0;
                                if (runnable != null) {
                                    org.telegram.messenger.g0.r(runnable);
                                    this.f32396o0 = null;
                                }
                                if (g2Var.getTag() == null) {
                                    g2Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(g2Var, property, 0.0f), ObjectAnimator.ofFloat(s71Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(qlVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(er.f34419f);
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
                            xl xlVar2 = this.Q;
                            if (xlVar2 != null) {
                                if (Math.abs(xlVar2.getTranslationY()) > this.Q.getMeasuredHeight() / 6.0f) {
                                    d0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(g2Var, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(qlVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f32388j0);
                                animatorSet2.start();
                                g2Var.setTag(null);
                                return true;
                            }
                        } else {
                            xl xlVar3 = this.Q;
                            if (xlVar3 != null && !this.E0) {
                                int[] iArr = this.W;
                                xlVar3.getLocationOnScreen(iArr);
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
        if (this.f33609b.Q1) {
            return;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            this.T[i7].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(er.f34419f).start();
        }
        ViewPropertyAnimator duration = this.f32405s0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        er erVar = er.f34419f;
        duration.setInterpolator(erVar).start();
        this.f32403r0.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
        org.telegram.messenger.g0.W3(this.S, false);
        org.telegram.messenger.g0.r(this.f32386i0);
        this.f32386i0 = null;
        org.telegram.messenger.g0.P3(org.telegram.messenger.g0.W(getContext()));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        if (this.T0 != i13) {
            this.T0 = i13;
            am amVar = this.H;
            if (amVar != null) {
                amVar.f();
            }
        }
        super.onLayout(z10, i7, i10, i11, i12);
        Y();
    }

    @Override
    public final void p() {
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25531l4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25563r2);
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
        if (this.f32378e0) {
            return true;
        }
        if (this.f32374c0) {
            d0(true);
            return true;
        }
        g0(true);
        return false;
    }

    public final void q0() {
        if (this.f32376d0) {
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
        ArrayList arrayList = p12.f42779g7;
        if (arrayList != null && !arrayList.isEmpty() && i7 < arrayList.size() && (arrayList.get(i7) instanceof org.telegram.messenger.ff) && ((org.telegram.messenger.ff) arrayList.get(i7)).M) {
            final org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList.get(i7);
            this.F.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z11 = ChatAttachAlertPhotoLayout.f32365r1;
                    if (view instanceof org.telegram.ui.Cells.q5) {
                        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                        if (q5Var.getPhotoEntry() == ffVar) {
                            q5Var.c(z10, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z12 = true;
                            if (ChatAttachAlertPhotoLayout.f32367t1.size() <= 1) {
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
        int i7;
        int i10;
        if (this.Q == null) {
            return;
        }
        this.f32380f0 = f10;
        int[] iArr = this.f32382g0;
        float f11 = iArr[1];
        float f12 = iArr[2];
        int i11 = org.telegram.messenger.g0.f23611q.x;
        ki kiVar = this.f33609b;
        float width = kiVar.f29685c.getWidth();
        float height = kiVar.f29685c.getHeight();
        float[] fArr = this.V;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = this.f32391k1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
        float textureHeight = this.Q.getTextureHeight(f11, f12) / this.Q.getTextureHeight(width, height);
        float f16 = f12 / height;
        float f17 = f11 / width;
        if (this.f32389j1) {
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
            this.f32393m1 = (height * f10) + (((f14 + f12) * f18) - this.Q.getTranslationY());
            this.f32397o1 = f20 - this.Q.getTranslationX();
            this.n1 = (width * f10) + (((f13 + f11) * f18) - this.Q.getTranslationX());
        } else {
            i7 = (int) f11;
            i10 = (int) f12;
            this.Q.getTextureView().setScaleX(1.0f);
            this.Q.getTextureView().setScaleY(1.0f);
            this.l1 = 0.0f;
            this.f32393m1 = height;
            this.f32397o1 = 0.0f;
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
        this.f32408v0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.f32415z0 = z10;
    }

    public void setStarsPrice(long j3) {
        boolean z10;
        HashMap hashMap = f32367t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                ffVar.N = j3;
                if (j3 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ffVar.M = z10;
                ffVar.R = false;
            }
        }
        D(getSelectedItemsCount());
        if (Z(false)) {
            A0();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        ki kiVar = this.f33609b;
        if (kiVar.B0 == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            ql qlVar = this.F;
            int childCount = qlVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = qlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    float f12 = 1.0f + f11;
                    q5Var.getCheckBox().setScaleX(f12);
                    q5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        kiVar.f29682b.invalidate();
        invalidate();
    }

    @Override
    public final void t() {
        xl xlVar = this.Q;
        if (xlVar != null) {
            xlVar.setVisibility(8);
        }
        for (Map.Entry entry : f32367t1.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.ff) {
                ((org.telegram.messenger.ff) entry.getValue()).getClass();
            }
        }
        this.H.f();
    }

    public final boolean t0() {
        if (!this.f32415z0) {
            ki kiVar = this.f33609b;
            if (!kiVar.A1) {
                if (!(kiVar.f36424a2 instanceof org.telegram.ui.an) && !kiVar.R2 && kiVar.O2 != 2) {
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
        ql qlVar = this.F;
        int childCount = qlVar.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            } else if (qlVar.getChildAt(i7) instanceof org.telegram.ui.Cells.k5) {
                q0();
                break;
            } else {
                this.R.i();
                i7++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f32399p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f32413y.animate().alpha(0.0f).setDuration(150L).setInterpolator(er.f34422j).withEndAction(new jl(this, 3));
        this.f32399p1 = withEndAction;
        withEndAction.start();
        n0();
    }

    public final void u0(s8 s8Var, TLRPC.VideoSize videoSize, long j3) {
        boolean z10;
        ki kiVar = this.f33609b;
        q8 q8Var = new q8(kiVar.P1, kiVar.L1);
        k30 k30Var = kiVar.L1;
        if (k30Var != null && k30Var.f36260c == 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        q8Var.R = z10;
        kiVar.f36424a2.presentFragment(q8Var);
        if (s8Var != null) {
            q8Var.r0(s8Var);
        }
        if (videoSize != null) {
            q8Var.q0(videoSize);
        }
        if (j3 != 0) {
            q8Var.p0(j3);
        }
        q8Var.J = new f1(11, this, q8Var);
    }

    @Override
    public final void v(float f10) {
        xl xlVar = this.Q;
        if (xlVar != null) {
            xlVar.setAlpha(f10);
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
        ki kiVar = this.f33609b;
        if (!kiVar.f36434d4 && this.f32410w0 && CameraView.isCameraAllowed()) {
            if (this.Q == null) {
                boolean z12 = !org.telegram.messenger.qc.e(360928);
                Context context = getContext();
                Boolean bool = this.f32398p0;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = kiVar.S3;
                }
                xl xlVar = new xl(this, context, z10, z12);
                this.Q = xlVar;
                org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
                if ((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).z()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                xlVar.setRecordFile(org.telegram.messenger.g0.s0(z11));
                this.Q.setFocusable(true);
                this.Q.setFpsLimit(30);
                this.Q.setOutlineProvider(new fh.a(this, 2));
                this.Q.setClipToOutline(true);
                this.Q.setContentDescription(org.telegram.messenger.hd.M0(2131754852, null));
                org.telegram.ui.ActionBar.k2 k2Var = kiVar.f29685c;
                xl xlVar2 = this.Q;
                int i7 = this.L0;
                k2Var.addView(xlVar2, 1, new FrameLayout.LayoutParams(i7, i7));
                this.Q.setDelegate(new sl(this));
                xl xlVar3 = this.Q;
                if (this.f32410w0) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                xlVar3.setAlpha(f10);
                this.Q.setEnabled(this.f32410w0);
                if (this.O) {
                    this.Q.setVisibility(8);
                }
                if (!this.f32374c0) {
                    Y();
                }
                ql qlVar = this.F;
                if (qlVar != null) {
                    qlVar.invalidate();
                }
                invalidate();
            }
            s71 s71Var = this.m0;
            if (s71Var != null) {
                s71Var.b(false, 0.0f);
                this.C0 = 0.0f;
            }
            if (!this.f32374c0) {
                this.Q.setTranslationX(this.V[0]);
            }
        }
    }

    @Override
    public final void w(int i7) {
        TLRPC.Chat Y0;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        ki kiVar = this.f33609b;
        if (i7 == 8) {
            kiVar.v1(!kiVar.X1, true);
            this.f32379e1.a(!kiVar.X1, true);
        } else if ((i7 == 0 || i7 == 1) && kiVar.Q3 > 0 && f32368u1.size() > 1 && (Y0 = kiVar.Y0()) != null && !org.telegram.messenger.t3.N(Y0) && Y0.slowmode_enabled) {
            t4.L(getContext(), org.telegram.messenger.hd.M0(2131745310, null), org.telegram.messenger.hd.M0(2131745302, null), null, null, this.f33608a).p();
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.f33608a;
            HashMap hashMap = f32367t1;
            if (i7 == 0) {
                org.telegram.messenger.gj gjVar = kiVar.F3;
                org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36424a2;
                if (gjVar == null && (e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).c()) {
                    t4.J(getContext(), ((org.telegram.ui.an) e2Var).a(), new fl(this, 0), e6Var);
                } else {
                    t4.X(kiVar.H3, kiVar.X0() + hashMap.size(), kiVar.b1(), new org.telegram.messenger.z10(this) {
                        public final ChatAttachAlertPhotoLayout f35002b;

                        {
                            this.f35002b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            int i10 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35002b;
                            Long l10 = (Long) obj;
                            switch (i10) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f32365r1;
                                    ki kiVar2 = chatAttachAlertPhotoLayout.f33609b;
                                    kiVar2.M0();
                                    kiVar2.X3.y1(7, false, true, 0, 0, 0L, kiVar2.f1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f32365r1;
                                    ki kiVar3 = chatAttachAlertPhotoLayout.f33609b;
                                    kiVar3.M0();
                                    kiVar3.X3.y1(4, true, true, 0, 0, 0L, kiVar3.f1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i7 == 1) {
                org.telegram.messenger.gj gjVar2 = kiVar.F3;
                org.telegram.ui.ActionBar.e2 e2Var2 = kiVar.f36424a2;
                if (gjVar2 == null && (e2Var2 instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var2).c()) {
                    t4.J(getContext(), ((org.telegram.ui.an) e2Var2).a(), new fl(this, 1), e6Var);
                } else {
                    t4.X(kiVar.H3, kiVar.X0() + hashMap.size(), kiVar.b1(), new org.telegram.messenger.z10(this) {
                        public final ChatAttachAlertPhotoLayout f35002b;

                        {
                            this.f35002b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            int i10 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35002b;
                            Long l10 = (Long) obj;
                            switch (i10) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f32365r1;
                                    ki kiVar2 = chatAttachAlertPhotoLayout.f33609b;
                                    kiVar2.M0();
                                    kiVar2.X3.y1(7, false, true, 0, 0, 0L, kiVar2.f1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f32365r1;
                                    ki kiVar3 = chatAttachAlertPhotoLayout.f33609b;
                                    kiVar3.M0();
                                    kiVar3.X3.y1(4, true, true, 0, 0, 0L, kiVar3.f1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                am amVar = this.H;
                ql qlVar = this.F;
                if (i7 == 3) {
                    im imVar = kiVar.f36455l2;
                    if (imVar != null) {
                        imVar.P();
                    }
                    Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((org.telegram.messenger.ff) ((Map.Entry) it.next()).getValue()).M) {
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
                        public final ChatAttachAlertPhotoLayout f35285b;

                        {
                            this.f35285b = this;
                        }

                        @Override
                        public final void run() {
                            int i10;
                            int i11;
                            int i12 = r3;
                            boolean z14 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35285b;
                            switch (i12) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f32365r1;
                                    ki kiVar2 = chatAttachAlertPhotoLayout.f33609b;
                                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.Z0;
                                    if (z14) {
                                        i10 = 2131751430;
                                    } else {
                                        i10 = 2131751154;
                                    }
                                    z0Var.setText(org.telegram.messenger.hd.M0(i10, null));
                                    if (z14) {
                                        z0Var.setIcon(2131232378);
                                    } else {
                                        z0Var.setAnimatedIcon(2131624132);
                                    }
                                    if (z14) {
                                        kiVar2.Y2.u(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            kiVar2.Y2.u(6);
                                            return;
                                        }
                                        return;
                                    }
                                    kiVar2.Y2.T(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        kiVar2.Y2.T(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.z0 z0Var2 = chatAttachAlertPhotoLayout.f32373b1;
                                    if (z14) {
                                        i11 = 2131745620;
                                    } else {
                                        i11 = 2131745621;
                                    }
                                    z0Var2.setText(org.telegram.messenger.hd.M0(i11, null));
                                    if (z14) {
                                        z0Var2.setIcon(2131231868);
                                        return;
                                    } else {
                                        z0Var2.setIcon(2131231865);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (entry.getValue() instanceof org.telegram.messenger.ff) {
                            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                            ffVar.M = z13;
                            ffVar.R = false;
                            arrayList.add(Integer.valueOf(ffVar.C));
                        }
                    }
                    qlVar.M(new il(0, arrayList, z13));
                    if (kiVar.f36497w2 != this) {
                        amVar.f();
                    }
                    im imVar2 = kiVar.f36455l2;
                    if (imVar2 != null) {
                        imVar2.f35652w.invalidate();
                    }
                } else if (i7 == 2) {
                    im imVar3 = kiVar.f36455l2;
                    if (imVar3 != null) {
                        imVar3.P();
                    }
                    Iterator it2 = hashMap.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((org.telegram.messenger.ff) ((Map.Entry) it2.next()).getValue()).c()) {
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
                        public final ChatAttachAlertPhotoLayout f35285b;

                        {
                            this.f35285b = this;
                        }

                        @Override
                        public final void run() {
                            int i10;
                            int i11;
                            int i12 = r3;
                            boolean z142 = z14;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35285b;
                            switch (i12) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f32365r1;
                                    ki kiVar2 = chatAttachAlertPhotoLayout.f33609b;
                                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.Z0;
                                    if (z142) {
                                        i10 = 2131751430;
                                    } else {
                                        i10 = 2131751154;
                                    }
                                    z0Var.setText(org.telegram.messenger.hd.M0(i10, null));
                                    if (z142) {
                                        z0Var.setIcon(2131232378);
                                    } else {
                                        z0Var.setAnimatedIcon(2131624132);
                                    }
                                    if (z142) {
                                        kiVar2.Y2.u(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            kiVar2.Y2.u(6);
                                            return;
                                        }
                                        return;
                                    }
                                    kiVar2.Y2.T(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        kiVar2.Y2.T(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.z0 z0Var2 = chatAttachAlertPhotoLayout.f32373b1;
                                    if (z142) {
                                        i11 = 2131745620;
                                    } else {
                                        i11 = 2131745621;
                                    }
                                    z0Var2.setText(org.telegram.messenger.hd.M0(i11, null));
                                    if (z142) {
                                        z0Var2.setIcon(2131231868);
                                        return;
                                    } else {
                                        z0Var2.setIcon(2131231865);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        if (entry2.getValue() instanceof org.telegram.messenger.ff) {
                            org.telegram.messenger.ff ffVar2 = (org.telegram.messenger.ff) entry2.getValue();
                            ffVar2.f27731z = Boolean.valueOf(z14);
                            ffVar2.R = false;
                            arrayList2.add(Integer.valueOf(ffVar2.C));
                        }
                    }
                    qlVar.M(new il(1, arrayList2, z14));
                    if (kiVar.f36497w2 != this) {
                        amVar.f();
                    }
                    im imVar4 = kiVar.f36455l2;
                    if (imVar4 != null) {
                        imVar4.f35652w.invalidate();
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
                            int i10 = kiVar.O2;
                            org.telegram.ui.ActionBar.e2 e2Var3 = kiVar.f36424a2;
                            if (i10 != 0) {
                                e2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                e2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i11 = kiVar.O2;
                            org.telegram.ui.ActionBar.e2 e2Var4 = kiVar.f36424a2;
                            if (i11 != 0) {
                                e2Var4.startActivityForResult(intent3, 14);
                            } else {
                                e2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        kiVar.a(true);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i7 == 7) {
                    if (kiVar.f36497w2 == kiVar.f36455l2) {
                        z12 = false;
                    }
                    kiVar.O1(z12);
                } else if (i7 == 9) {
                    di.lb.j1(getContext(), getStarsPrice(), true, new d(this, 6), this.f33608a);
                } else if (i7 >= 10) {
                    org.telegram.messenger.ve veVar = (org.telegram.messenger.ve) this.W0.get(i7 - 10);
                    this.U0 = veVar;
                    org.telegram.messenger.ve veVar2 = this.V0;
                    TextView textView = this.f32413y;
                    if (veVar == veVar2) {
                        textView.setText(org.telegram.messenger.hd.M0(2131752238, null));
                    } else {
                        textView.setText(veVar.f26971c);
                    }
                    amVar.f();
                    this.f32409w.f();
                    this.G.h1(0, -(qlVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void w0(boolean z10) {
        Integer num;
        float f10;
        s71 s71Var = this.m0;
        if ((s71Var.getTag() != null && z10) || (s71Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f32396o0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                jl jlVar = new jl(this, 1);
                this.f32396o0 = jlVar;
                org.telegram.messenger.g0.i3(jlVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f32395n0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        s71Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32395n0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.f32395n0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(s71Var, View.ALPHA, f10));
        this.f32395n0.addListener(new pl(this, 1));
        this.f32395n0.start();
        if (z10) {
            jl jlVar2 = new jl(this, 2);
            this.f32396o0 = jlVar2;
            org.telegram.messenger.g0.i3(jlVar2, 2000L);
        }
    }

    @Override
    public final void x() {
        boolean z10;
        ki kiVar = this.f33609b;
        if (kiVar != null && (kiVar.f36424a2 instanceof org.telegram.ui.an)) {
            z10 = true;
        } else {
            z10 = false;
        }
        X(z10);
    }

    public final void x0() {
        ArrayList arrayList;
        hi.u2 u2Var = this.f32411x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u2Var.f29497b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f32410w0) {
            if (t0()) {
                arrayList = MediaController.f22325c2;
            } else {
                arrayList = MediaController.d2;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.W0 = arrayList2;
            Collections.sort(arrayList2, new ll(arrayList, 0));
        } else {
            this.W0 = new ArrayList();
        }
        boolean isEmpty = this.W0.isEmpty();
        TextView textView = this.f32413y;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.W0.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.ve veVar = (org.telegram.messenger.ve) this.W0.get(i7);
            hi.a aVar = new hi.a(getContext(), veVar.d, veVar.f26971c, veVar.f26972e.size(), this.f33608a);
            u2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ci.q(this, i7 + 10, 11));
        }
    }

    public final void y0() {
        ql qlVar = this.F;
        if (qlVar != null) {
            for (int i7 = 0; i7 < qlVar.getChildCount(); i7++) {
                View childAt = qlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    ((org.telegram.ui.Cells.q5) childAt).f31280a.invalidate();
                }
            }
        }
    }

    @Override
    public final void z(int i7, boolean z10) {
        Y();
        xl xlVar = this.Q;
        if (xlVar != null) {
            xlVar.invalidateOutline();
            this.Q.invalidate();
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (this.f33609b.f36424a2 instanceof org.telegram.ui.an) {
            ql qlVar = this.F;
            int childCount = qlVar.getChildCount();
            int i7 = 0;
            while (true) {
                arrayList = f32368u1;
                if (i7 >= childCount) {
                    break;
                }
                View childAt = qlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    org.telegram.messenger.ff e02 = e0(((Integer) q5Var.getTag()).intValue());
                    if (e02 != null) {
                        q5Var.setNum(arrayList.indexOf(Integer.valueOf(e02.C)));
                    }
                }
                i7++;
            }
            ql qlVar2 = this.f32402r;
            int childCount2 = qlVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = qlVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    org.telegram.messenger.ff e03 = e0(((Integer) q5Var2.getTag()).intValue());
                    if (e03 != null) {
                        q5Var2.setNum(arrayList.indexOf(Integer.valueOf(e03.C)));
                    }
                }
            }
        }
    }
}
