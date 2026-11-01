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
public class ChatAttachAlertPhotoLayout extends uh implements org.telegram.messenger.vs {
    public static boolean f23846q1;
    public static final ArrayList f23847r1 = new ArrayList();
    public static final HashMap f23848s1 = new HashMap();
    public static final ArrayList f23849t1 = new ArrayList();
    public static int f23850u1 = -1;
    public float A0;
    public float B0;
    public boolean C0;
    public final Drawable D;
    public boolean D0;
    public final pl E;
    public final Rect E0;
    public final oi F;
    public float F0;
    public final bm G;
    public boolean G0;
    public final xy H;
    public boolean H0;
    public final yk0 I;
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
    public yl P;
    public boolean P0;
    public final zl Q;
    public boolean Q0;
    public final wl R;
    public boolean R0;
    public final ImageView[] S;
    public int S0;
    public boolean T;
    public org.telegram.messenger.xe T0;
    public final float[] U;
    public org.telegram.messenger.xe U0;
    public final int[] V;
    public ArrayList V0;
    public float W;
    public float W0;
    public boolean X0;
    public final org.telegram.ui.ActionBar.b1 Y0;
    public final org.telegram.ui.ActionBar.b1 Z0;
    public float f23851a0;
    public final org.telegram.ui.ActionBar.b1 f23852a1;
    public boolean f23853b0;
    public final org.telegram.ui.ActionBar.b1 f23854b1;
    public boolean f23855c0;
    public final org.telegram.ui.ActionBar.b1 f23856c1;
    public boolean f23857d0;
    public final za0 f23858d1;
    public float f23859e0;
    public final boolean f23860e1;
    public final int[] f23861f0;
    public final e2.f f23862f1;
    public int f23863g0;
    public boolean f23864g1;
    public ml f23865h0;
    public final sl f23866h1;
    public final DecelerateInterpolator f23867i0;
    public boolean f23868i1;
    public final jg.l0 f23869j0;
    public float f23870j1;
    public final ShutterButton f23871k0;
    public float f23872k1;
    public final t81 f23873l0;
    public float l1;
    public AnimatorSet m0;
    public float f23874m1;
    public final boolean f23875n;
    public Runnable f23876n0;
    public float f23877n1;
    public Boolean f23878o0;
    public ViewPropertyAnimator f23879o1;
    public final TextView f23880p0;
    public int f23881p1;
    public final TextView f23882q0;
    public final pl f23883r;
    public final ImageView f23884r0;
    public final dh.f f23885s;
    public boolean f23886s0;
    public boolean f23887t0;
    public boolean f23888u0;
    public boolean f23889v0;
    public final bm f23890w;
    public boolean f23891w0;
    public final tl f23892x;
    public boolean f23893x0;
    public final TextView f23894y;
    public boolean f23895y0;
    public boolean f23896z0;

    public ChatAttachAlertPhotoLayout(bi biVar, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, biVar);
        boolean z12;
        this.S = new ImageView[2];
        this.U = new float[2];
        this.V = new int[2];
        this.f23861f0 = new int[5];
        this.f23867i0 = new DecelerateInterpolator(1.5f);
        this.f23878o0 = null;
        this.E0 = new Rect();
        int L = org.telegram.messenger.i0.L(80.0f);
        this.K0 = L;
        this.L0 = L;
        this.M0 = 3;
        this.X0 = true;
        this.f23862f1 = new e2.f((int[]) null);
        this.f23866h1 = new sl(this);
        this.f23860e1 = z10;
        this.f23875n = z11;
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14775r2);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.l4);
        org.telegram.ui.ActionBar.p2 p2Var = biVar.f21590c;
        bi biVar2 = this.f30964b;
        if (biVar2.K2 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f23864g1 = z12;
        tl tlVar = new tl(this, context, biVar2.R2.p(), p6Var, 0);
        this.f23892x = tlVar;
        tlVar.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = w7.b6.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = org.telegram.messenger.i0.f16166m;
        this.f30964b.R2.addView(tlVar, 0, d);
        tlVar.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f25174b;

            {
                this.f25174b = this;
            }

            @Override
            public final void onClick(View view) {
                yl ylVar;
                yl ylVar2;
                int i10 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25174b;
                switch (i10) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f23886s0 && (ylVar = chatAttachAlertPhotoLayout.P) != null && ylVar.isInited()) {
                            chatAttachAlertPhotoLayout.f23855c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f23884r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new ol(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.T && (ylVar2 = chatAttachAlertPhotoLayout.P) != null && ylVar2.isInited() && chatAttachAlertPhotoLayout.f23853b0) {
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
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, org.telegram.messenger.i0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -org.telegram.messenger.i0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(gr.f26523f);
                                animatorSet.addListener(new org.telegram.ui.ActionBar.g1(chatAttachAlertPhotoLayout, view, imageView));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f23892x.U(null, null);
                        return;
                    default:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.k0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f23894y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        textView.setText(org.telegram.messenger.dd.L0(2131752238, null));
        textView.setTypeface(org.telegram.messenger.i0.o());
        Drawable f7 = i0.a.f(context, 2131231254);
        this.D = f7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.y(this, f7, i10, p6Var, mode);
        textView.setPadding(0, 0, org.telegram.messenger.i0.L(10.0f), 0);
        tlVar.addView(textView, w7.b6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        V(false);
        za0 za0Var = new za0(context, 2131624137, org.telegram.messenger.dd.L0(2131752560, null), 2131624136, org.telegram.messenger.dd.L0(2131752559, null), p6Var);
        this.f23858d1 = za0Var;
        za0Var.a(!this.f30964b.T1, false);
        this.f23856c1 = this.f30964b.U2.e(7, 2131232419, org.telegram.messenger.dd.L0(2131753957, null));
        this.f30964b.U2.a(5);
        this.f30964b.U2.e(4, 2131232264, org.telegram.messenger.dd.L0(2131747812, null));
        this.Z0 = this.f30964b.U2.e(1, 2131232131, org.telegram.messenger.dd.L0(2131745602, null));
        this.f30964b.U2.e(0, 2131232410, org.telegram.messenger.dd.L0(2131745601, null));
        this.f30964b.U2.a(6);
        this.Y0 = this.f30964b.U2.e(3, 2131232375, org.telegram.messenger.dd.L0(2131751155, null));
        this.f23852a1 = this.f30964b.U2.e(2, 2131231864, org.telegram.messenger.dd.L0(2131745638, null));
        org.telegram.ui.ActionBar.t0 t0Var = this.f30964b.U2;
        t0Var.p();
        za0Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        za0Var.setTag(8);
        t0Var.f20827b.addView(za0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) za0Var.getLayoutParams();
        if (org.telegram.messenger.dd.X) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.i0.L(48.0f);
        za0Var.setLayoutParams(layoutParams);
        za0Var.setOnClickListener(new org.telegram.ui.ActionBar.z(t0Var, 2));
        this.f23854b1 = this.f30964b.U2.e(9, 2131231808, org.telegram.messenger.dd.L0(2131747746, null));
        this.f30964b.U2.setFitSubItems(true);
        pl plVar = new pl(this, context, p6Var, 1);
        this.E = plVar;
        plVar.setFastScrollEnabled(1);
        plVar.setFastScrollVisible(true);
        plVar.getFastScroll().setAlpha(0.0f);
        plVar.getFastScroll().f24411a = false;
        plVar.getFastScroll().f24422h0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        bm bmVar = new bm(this, context, z11);
        this.G = bmVar;
        plVar.setAdapter(bmVar);
        zl zlVar = new zl(this, plVar);
        this.Q = zlVar;
        plVar.i(zlVar);
        int i11 = 0;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            bmVar.h.add(bmVar.L());
            i11++;
        }
        plVar.setClipToPadding(false);
        plVar.setItemAnimator(null);
        plVar.setLayoutAnimation(null);
        plVar.setVerticalScrollBarEnabled(false);
        org.telegram.ui.ActionBar.a7.m(plVar, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
        addView(plVar, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        plVar.setOnScrollListener(new ul(0, this));
        oi oiVar = new oi(this, this.K0, 1);
        this.F = oiVar;
        oiVar.O = new jg.h1(this, 3);
        plVar.setLayoutManager(oiVar);
        plVar.setOnItemClickListener(new ag.v0(this, z11, p6Var, 5));
        plVar.setOnItemLongClickListener(new dl(this, 2));
        yk0 yk0Var = new yk0(new m2.t(this, 9));
        this.I = yk0Var;
        plVar.E.add(yk0Var);
        setBlur3Capture(plVar);
        this.d = plVar;
        this.f30966f = true;
        xy xyVar = new xy(context, p6Var);
        this.H = xyVar;
        xyVar.setText(org.telegram.messenger.dd.L0(2131748197, null));
        xyVar.setOnTouchListener(null);
        xyVar.setTextSize(16);
        addView(xyVar, w7.b6.c(-2.0f, -1));
        if (this.X0) {
            xyVar.b();
        } else {
            xyVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        wl wlVar = new wl(context, paint);
        this.R = wlVar;
        org.telegram.messenger.i0.Y3(wlVar, false, 1.0f, true, false);
        wlVar.setBackgroundResource(2131232768);
        wlVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        wlVar.setTextSize(1, 15.0f);
        wlVar.setTypeface(org.telegram.messenger.i0.o());
        wlVar.setAlpha(0.0f);
        wlVar.setTextColor(-1);
        wlVar.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f));
        p2Var.addView(wlVar, w7.b6.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        jg.l0 l0Var = new jg.l0(this, context, 14);
        this.f23869j0 = l0Var;
        l0Var.setVisibility(8);
        l0Var.setAlpha(0.0f);
        p2Var.addView(l0Var, w7.b6.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f23880p0 = textView2;
        textView2.setBackgroundResource(2131232535);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131232533, 0);
        textView2.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
        textView2.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        p2Var.addView(textView2, w7.b6.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f25174b;

            {
                this.f25174b = this;
            }

            @Override
            public final void onClick(View view) {
                yl ylVar;
                yl ylVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25174b;
                switch (i102) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f23886s0 && (ylVar = chatAttachAlertPhotoLayout.P) != null && ylVar.isInited()) {
                            chatAttachAlertPhotoLayout.f23855c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f23884r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new ol(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.T && (ylVar2 = chatAttachAlertPhotoLayout.P) != null && ylVar2.isInited() && chatAttachAlertPhotoLayout.f23853b0) {
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
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, org.telegram.messenger.i0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -org.telegram.messenger.i0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(gr.f26523f);
                                animatorSet.addListener(new org.telegram.ui.ActionBar.g1(chatAttachAlertPhotoLayout, view, imageView));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f23892x.U(null, null);
                        return;
                    default:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.k0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                }
            }
        });
        t81 t81Var = new t81(context);
        this.f23873l0 = t81Var;
        t81Var.setVisibility(8);
        t81Var.setAlpha(0.0f);
        p2Var.addView(t81Var, w7.b6.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        t81Var.setDelegate(new dl(this, 3));
        ?? view = new View(context);
        view.f24190b = new DecelerateInterpolator();
        view.f24197x = new ew(view, 12);
        view.f24189a = view.getResources().getDrawable(2131230928);
        Paint paint2 = new Paint(1);
        view.f24191c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f24192f = gu0.f26549a;
        this.f23871k0 = view;
        l0Var.addView((View) view, w7.b6.e(84, 84, 17));
        view.setDelegate(new nl(this, p6Var, p2Var));
        view.setFocusable(true);
        view.setContentDescription(org.telegram.messenger.dd.L0(2131754760, null));
        ImageView imageView = new ImageView(context);
        this.f23884r0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        l0Var.addView(imageView, w7.b6.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f25174b;

            {
                this.f25174b = this;
            }

            @Override
            public final void onClick(View view2) {
                yl ylVar;
                yl ylVar2;
                int i102 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25174b;
                switch (i102) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f23886s0 && (ylVar = chatAttachAlertPhotoLayout.P) != null && ylVar.isInited()) {
                            chatAttachAlertPhotoLayout.f23855c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f23884r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new ol(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.T && (ylVar2 = chatAttachAlertPhotoLayout.P) != null && ylVar2.isInited() && chatAttachAlertPhotoLayout.f23853b0) {
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
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, org.telegram.messenger.i0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -org.telegram.messenger.i0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(gr.f26523f);
                                animatorSet.addListener(new org.telegram.ui.ActionBar.g1(chatAttachAlertPhotoLayout, view2, imageView2));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f23892x.U(null, null);
                        return;
                    default:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.k0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setContentDescription(org.telegram.messenger.dd.L0(2131754752, null));
        for (int i13 = 0; i13 < 2; i13++) {
            this.S[i13] = new ImageView(context);
            this.S[i13].setScaleType(ImageView.ScaleType.CENTER);
            this.S[i13].setVisibility(4);
            this.f23869j0.addView(this.S[i13], w7.b6.e(48, 48, 51));
            this.S[i13].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f25174b;

                {
                    this.f25174b = this;
                }

                @Override
                public final void onClick(View view2) {
                    yl ylVar;
                    yl ylVar2;
                    int i102 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25174b;
                    switch (i102) {
                        case 0:
                            if (!chatAttachAlertPhotoLayout.f23886s0 && (ylVar = chatAttachAlertPhotoLayout.P) != null && ylVar.isInited()) {
                                chatAttachAlertPhotoLayout.f23855c0 = false;
                                chatAttachAlertPhotoLayout.P.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f23884r0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new ol(chatAttachAlertPhotoLayout, 0));
                                duration.start();
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.T && (ylVar2 = chatAttachAlertPhotoLayout.P) != null && ylVar2.isInited() && chatAttachAlertPhotoLayout.f23853b0) {
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
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, org.telegram.messenger.i0.L(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -org.telegram.messenger.i0.L(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(gr.f26523f);
                                    animatorSet.addListener(new org.telegram.ui.ActionBar.g1(chatAttachAlertPhotoLayout, view2, imageView2));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        case 2:
                            chatAttachAlertPhotoLayout.f23892x.U(null, null);
                            return;
                        default:
                            if (chatAttachAlertPhotoLayout.P != null) {
                                chatAttachAlertPhotoLayout.k0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                                return;
                            }
                            return;
                    }
                }
            });
            this.S[i13].setContentDescription("flash mode " + i13);
        }
        TextView textView3 = new TextView(context);
        this.f23882q0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setText(org.telegram.messenger.dd.L0(2131744296, null));
        textView3.setShadowLayer(org.telegram.messenger.i0.L(3.33333f), 0.0f, org.telegram.messenger.i0.L(0.666f), 1275068416);
        textView3.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
        this.f23869j0.addView(textView3, w7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        pl plVar2 = new pl(this, context, p6Var, 0);
        this.f23883r = plVar2;
        plVar2.setVerticalScrollBarEnabled(true);
        bm bmVar2 = new bm(this, context, false);
        this.f23890w = bmVar2;
        plVar2.setAdapter(bmVar2);
        for (int i14 = 0; i14 < 8; i14++) {
            bmVar2.h.add(bmVar2.L());
        }
        plVar2.setClipToPadding(false);
        plVar2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        plVar2.setItemAnimator(null);
        plVar2.setLayoutAnimation(null);
        plVar2.setOverScrollMode(2);
        plVar2.setVisibility(4);
        plVar2.setAlpha(0.0f);
        p2Var.addView(plVar2, w7.b6.c(80.0f, -1));
        dh.f fVar = new dh.f(0, false, 6);
        this.f23885s = fVar;
        plVar2.setLayoutManager(fVar);
        plVar2.setOnItemClickListener(new c7(1));
    }

    public static org.telegram.ui.Cells.v5 N(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        pl plVar = chatAttachAlertPhotoLayout.E;
        int childCount = plVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = plVar.getChildAt(i11);
            if (childAt.getTop() < plVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f30964b.Y0() && (childAt instanceof org.telegram.ui.Cells.v5)) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                if (v5Var.getImageView().getTag() != null && ((Integer) v5Var.getImageView().getTag()).intValue() == i10) {
                    return v5Var;
                }
            }
        }
        return null;
    }

    public static int P(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        bi biVar = chatAttachAlertPhotoLayout.f30964b;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).f42059f4 == 5) {
            return ((org.telegram.messenger.l0) k2Var.getMessagesController().f19300y7.f18023d0.f10701a).f16855c - ((org.telegram.ui.un) biVar.W1).K6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static boolean T() {
        HashMap hashMap = f23848s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                    if (ffVar.d() && ffVar.i()) {
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
            ArrayList arrayList = f23849t1;
            if (i10 >= arrayList.size()) {
                break;
            }
            Object obj = f23848s1.get(arrayList.get(i10));
            if (obj instanceof org.telegram.messenger.ff) {
                charSequence = ((org.telegram.messenger.ff) obj).f14602a;
            } else if (obj instanceof org.telegram.messenger.jf) {
                charSequence = ((org.telegram.messenger.jf) obj).I;
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
        HashMap hashMap = f23848s1;
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
        return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.L(7.0f) + this.f23881p1;
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
                imageView.setImageResource(2131231194);
                imageView.setContentDescription(org.telegram.messenger.dd.L0(2131754913, null));
                return;
            case 1:
                imageView.setImageResource(2131231193);
                imageView.setContentDescription(org.telegram.messenger.dd.L0(2131754914, null));
                return;
            case 2:
                imageView.setImageResource(2131231192);
                imageView.setContentDescription(org.telegram.messenger.dd.L0(2131754915, null));
                return;
            default:
                return;
        }
    }

    public void setAlertKeepScreenOn(boolean z10) {
        Window window = this.f30964b.getWindow();
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
        ShutterButton shutterButton = this.f23871k0;
        if (shutterButton == null) {
            return;
        }
        boolean z10 = this.Q0;
        gu0 gu0Var = gu0.f26549a;
        gu0 gu0Var2 = gu0.f26550b;
        if (!z10) {
            if (this.P != null && shutterButton.getState() == gu0Var2) {
                m0();
                CameraController.getInstance().stopVideoRecording(this.P.getCameraSession(), false);
                shutterButton.a(gu0Var);
            }
            if (this.f23853b0) {
                b0(false);
            }
            e0(true);
            return;
        }
        if (this.P != null && shutterButton.getState() == gu0Var2) {
            shutterButton.a(gu0Var);
        }
        this.Q0 = false;
    }

    @Override
    public final void B(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.B(int, int):void");
    }

    @Override
    public final void C() {
        bi biVar = this.f30964b;
        if (biVar.isShowing() && !biVar.I && !PhotoViewer.v1().U1()) {
            V(false);
        }
    }

    @Override
    public final void D(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.D(int):void");
    }

    @Override
    public final boolean F(int i10) {
        if (this.f23853b0) {
            if (i10 == 24 || i10 == 25 || i10 == 79 || i10 == 85) {
                ((nl) this.f23871k0.getDelegate()).a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void G(uh uhVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f23879o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f23892x.setVisibility(0);
        boolean z10 = uhVar instanceof jm;
        TextView textView = this.f23894y;
        if (!z10) {
            a0();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(gr.f26526j);
            this.f23879o1 = interpolator;
            interpolator.start();
        }
        this.f30964b.R2.setTitle("");
        this.F.h1(0, 0);
        if (z10) {
            this.E.post(new cd(18, this, uhVar));
        }
        W();
        n0();
    }

    @Override
    public final void H() {
        this.N = false;
        yl ylVar = this.P;
        if (ylVar != null) {
            ylVar.setVisibility(0);
        }
        if (this.f23888u0) {
            this.f23888u0 = false;
            V(true);
        }
    }

    @Override
    public final void I() {
        this.E.y0(0);
    }

    public final int R(org.telegram.messenger.ff ffVar, int i10) {
        boolean z10;
        Integer valueOf = Integer.valueOf(ffVar.C);
        HashMap hashMap = f23848s1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f23849t1;
        if (containsKey) {
            ffVar.N = 0L;
            ffVar.M = false;
            ffVar.O = null;
            ffVar.f14623z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            z0(false);
            x0();
            if (i10 >= 0) {
                ffVar.e();
                this.f23866h1.X(i10);
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
        if (d0()) {
            ffVar.O = Boolean.valueOf(!T());
        }
        ffVar.f14623z = Boolean.valueOf(ffVar.c());
        boolean X = X(true);
        hashMap.put(valueOf, ffVar);
        arrayList.add(valueOf);
        if (X) {
            y0();
            return -1;
        }
        z0(true);
        return -1;
    }

    public final void S() {
        yl ylVar = this.P;
        if (ylVar != null) {
            if (!this.f23853b0) {
                ylVar.setTranslationX(this.U[0]);
            }
            int i10 = this.K0;
            int L = org.telegram.messenger.i0.L(2.0f) + (i10 * 2);
            if (!this.f23853b0) {
                this.P.setClipTop((int) this.W);
                this.P.setClipBottom((int) this.f23851a0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                if (layoutParams.height != L || layoutParams.width != i10) {
                    layoutParams.width = i10;
                    layoutParams.height = L;
                    this.P.setLayoutParams(layoutParams);
                    org.telegram.messenger.i0.g3(new cd(19, this, layoutParams));
                }
            }
        }
    }

    public final void V(boolean z10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        boolean z11;
        bm bmVar;
        bi biVar = this.f30964b;
        boolean z12 = biVar.M1;
        org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
        if (!z12 && this.f23875n) {
            boolean z13 = this.N0;
            boolean z14 = this.O0;
            if (k2Var2 == null) {
                k2Var = LaunchActivity.Q();
            } else {
                k2Var = k2Var2;
            }
            if (k2Var != null && k2Var.getParentActivity() != null) {
                if (!org.telegram.messenger.uz.f18567y0) {
                    this.N0 = false;
                } else {
                    if (k2Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.O0 = z11;
                    if (z11) {
                        if (z10) {
                            try {
                                k2Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                            } catch (Exception unused) {
                            }
                        }
                        this.N0 = false;
                    } else {
                        if (z10 || org.telegram.messenger.uz.P0) {
                            CameraController.getInstance().initCamera(null);
                        }
                        this.N0 = CameraController.getInstance().isCameraInitied();
                    }
                }
                if ((z13 != this.N0 || z14 != this.O0) && (bmVar = this.G) != null) {
                    bmVar.f();
                }
                if (!biVar.M1 && biVar.isShowing() && this.N0 && ((Paint) biVar.Y.f21557b).getAlpha() != 0 && !this.f23853b0) {
                    t0();
                }
            }
        }
    }

    public final void W() {
        s4.c1 K;
        float[] fArr;
        int i10;
        float f7;
        int systemWindowInsetTop;
        if (!PhotoViewer.F1() || PhotoViewer.v1().p5 == null || !PhotoViewer.v1().p5.V) {
            yl ylVar = this.P;
            if (ylVar != null) {
                ylVar.invalidateOutline();
            }
            pl plVar = this.E;
            s4.c1 K2 = plVar.K(this.M0 - 1);
            if (K2 != null) {
                K2.f47909a.invalidateOutline();
            }
            if ((!this.G.d || !this.N0 || this.T0 != this.U0) && (K = plVar.K(0)) != null) {
                K.f47909a.invalidateOutline();
            }
            yl ylVar2 = this.P;
            if (ylVar2 != null) {
                ylVar2.invalidate();
            }
            wl wlVar = this.R;
            if (wlVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wlVar.getLayoutParams();
                if (getRootWindowInsets() == null) {
                    systemWindowInsetTop = org.telegram.messenger.i0.L(16.0f);
                } else {
                    systemWindowInsetTop = getRootWindowInsets().getSystemWindowInsetTop() + org.telegram.messenger.i0.L(2.0f);
                }
                marginLayoutParams.topMargin = systemWindowInsetTop;
            }
            if (!this.N0) {
                return;
            }
            int childCount = plVar.getChildCount();
            int i11 = 0;
            while (true) {
                fArr = this.U;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = plVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.p5) {
                    if (childAt.isAttachedToWindow()) {
                        float y3 = getY() + plVar.getY() + childAt.getY();
                        bi biVar = this.f30964b;
                        ViewGroup viewGroup = biVar.f21587b;
                        bh bhVar = biVar.f24813s3;
                        fg.i iVar = biVar.I2;
                        float y10 = viewGroup.getY() + y3;
                        float x10 = (biVar.f21587b.getX() + (getX() + (plVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                        if (!biVar.X1) {
                            i10 = org.telegram.messenger.i0.f16166m;
                        } else {
                            i10 = 0;
                        }
                        float alpha = (iVar.getAlpha() * iVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
                        oh ohVar = biVar.f24837y4;
                        if (ohVar != null && ohVar.g()) {
                            alpha = Math.max(alpha, (biVar.f24837y4.e() + biVar.f24837y4.getY()) - biVar.f24766f4);
                        }
                        if (y3 < alpha) {
                            f7 = alpha - y3;
                        } else {
                            f7 = 0.0f;
                        }
                        if (f7 != this.W) {
                            this.W = f7;
                            yl ylVar3 = this.P;
                            if (ylVar3 != null) {
                                ylVar3.invalidateOutline();
                                this.P.invalidate();
                            }
                        }
                        float translationY = (int) (bhVar.getTranslationY() + (biVar.f21587b.getMeasuredHeight() - bhVar.getMeasuredHeight()));
                        oh ohVar2 = biVar.f24837y4;
                        if (ohVar2 != null) {
                            translationY -= ohVar2.d() - org.telegram.messenger.i0.L(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y3 > translationY) {
                            this.f23851a0 = Math.min(-org.telegram.messenger.i0.L(5.0f), y3 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.f23851a0 = 0.0f;
                        }
                        fArr[0] = x10;
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
                yl ylVar4 = this.P;
                if (ylVar4 != null) {
                    ylVar4.invalidateOutline();
                    this.P.invalidate();
                }
            }
            fArr[0] = org.telegram.messenger.i0.L(-400.0f);
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
            HashMap hashMap = f23848s1;
            if (hashMap.size() <= 10 - (z10 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f23849t1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof org.telegram.messenger.ff)) {
                break;
            }
            R((org.telegram.messenger.ff) obj, -1);
            z11 = true;
        }
        return z11;
    }

    public final boolean Y(org.telegram.messenger.ff ffVar) {
        boolean z10 = this.f23891w0;
        org.telegram.ui.ActionBar.p6 p6Var = this.f30963a;
        bi biVar = this.f30964b;
        if (!z10 && ffVar.f14603b) {
            if (!biVar.N0()) {
                org.telegram.messenger.m5.o(null, 2131749547, new cc(biVar.f24786l3, p6Var), null);
                return true;
            }
        } else if (!this.f23893x0 && !ffVar.f14603b) {
            if (!biVar.N0()) {
                org.telegram.messenger.m5.o(null, 2131749551, new cc(biVar.f24786l3, p6Var), null);
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
            this.G.f();
            this.f23890w.f();
        }
    }

    @Override
    public final void a(CharSequence charSequence) {
        org.telegram.messenger.ff ffVar;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = f23849t1;
            if (i10 < arrayList.size()) {
                if (i10 == 0) {
                    Object obj = arrayList.get(i10);
                    HashMap hashMap = f23848s1;
                    Object obj2 = hashMap.get(obj);
                    if (obj2 instanceof org.telegram.messenger.ff) {
                        org.telegram.messenger.ff clone = ((org.telegram.messenger.ff) obj2).clone();
                        CharSequence[] charSequenceArr = {charSequence};
                        clone.f14612n = org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).W(charSequenceArr, false, true);
                        clone.f14602a = charSequenceArr[0];
                        ffVar = clone;
                    } else {
                        boolean z10 = obj2 instanceof org.telegram.messenger.jf;
                        ffVar = obj2;
                        if (z10) {
                            org.telegram.messenger.jf clone2 = ((org.telegram.messenger.jf) obj2).clone();
                            CharSequence[] charSequenceArr2 = {charSequence};
                            clone2.f14612n = org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).W(charSequenceArr2, false, true);
                            clone2.I = charSequenceArr2[0];
                            ffVar = clone2;
                        }
                    }
                    hashMap.put(obj, ffVar);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a0() {
        String L0 = org.telegram.messenger.dd.L0(2131751155, null);
        org.telegram.ui.ActionBar.b1 b1Var = this.Y0;
        b1Var.setText(L0);
        b1Var.setAnimatedIcon(2131624129);
        this.f30964b.U2.S(1);
        HashMap hashMap = f23848s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((org.telegram.messenger.ff) entry.getValue()).e();
            }
            hashMap.clear();
            f23849t1.clear();
        }
        ArrayList arrayList = f23847r1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList.get(i10);
                new File(ffVar.I).delete();
                if (ffVar.h != null) {
                    new File(ffVar.h).delete();
                }
                if (ffVar.f14604c != null) {
                    new File(ffVar.f14604c).delete();
                }
            }
            arrayList.clear();
        }
        this.G.f();
        this.f23890w.f();
    }

    @Override
    public final boolean b() {
        return !this.f23853b0;
    }

    public final void b0(boolean z10) {
        boolean z11;
        yl ylVar;
        if (!this.f23886s0 && this.P != null) {
            int i10 = this.K0;
            int[] iArr = this.f23861f0;
            iArr[1] = i10;
            iArr[2] = org.telegram.messenger.i0.L(2.0f) + (i10 * 2);
            Runnable runnable = this.f23876n0;
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
                this.f23876n0 = null;
            }
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, this.f30963a)) > 0.721d) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.i0.m3(this.f30964b, z11);
            TextView textView = this.f23880p0;
            pl plVar = this.f23883r;
            jg.l0 l0Var = this.f23869j0;
            pl plVar2 = this.E;
            ImageView[] imageViewArr = this.S;
            t81 t81Var = this.f23873l0;
            if (z10) {
                this.f23870j1 = this.P.getTranslationY();
                this.f23857d0 = true;
                if (plVar2 != null) {
                    plVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(l0Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(t81Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(plVar, property, 0.0f));
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
                this.f23862f1.d();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(gr.f26523f);
                animatorSet.addListener(new ol(this, 3));
                animatorSet.start();
            } else {
                this.f23868i1 = false;
                setAlertKeepScreenOn(false);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                l0Var.setAlpha(0.0f);
                l0Var.setVisibility(8);
                t81Var.setAlpha(0.0f);
                t81Var.setTag(null);
                t81Var.setVisibility(8);
                plVar.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                plVar.setVisibility(8);
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
                this.f23853b0 = false;
                yl ylVar2 = this.P;
                if (ylVar2 != null) {
                    ylVar2.setFpsLimit(30);
                    this.P.setSystemUiVisibility(1024);
                }
                if (plVar2 != null) {
                    plVar2.invalidate();
                }
            }
            yl ylVar3 = this.P;
            if (ylVar3 != null) {
                ylVar3.setImportantForAccessibility(0);
            }
            plVar2.setImportantForAccessibility(0);
            if (!org.telegram.messenger.tc.e(360928) && (ylVar = this.P) != null) {
                ylVar.showTexture(false, z10);
            }
        }
    }

    @Override
    public final boolean c() {
        for (Map.Entry entry : f23848s1.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof org.telegram.messenger.ff) {
                if (((org.telegram.messenger.ff) value).f14621x != 0) {
                    return false;
                }
            } else if ((value instanceof org.telegram.messenger.jf) && ((org.telegram.messenger.jf) value).f14621x != 0) {
                return false;
            }
        }
        return true;
    }

    public final org.telegram.messenger.ff c0(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = f23847r1;
        int size = arrayList.size();
        if (i10 < size) {
            return (org.telegram.messenger.ff) arrayList.get(i10);
        }
        int i11 = i10 - size;
        org.telegram.messenger.xe xeVar = this.T0;
        if (xeVar == null || i11 >= xeVar.e.size()) {
            return null;
        }
        return (org.telegram.messenger.ff) this.T0.e.get(i11);
    }

    @Override
    public final void d() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10 = this.f23860e1;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.t6.Vg;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21038j5;
        }
        int i14 = org.telegram.ui.ActionBar.t6.f20912c7;
        org.telegram.ui.ActionBar.p6 p6Var = this.f30963a;
        this.H.setTextColor(org.telegram.ui.ActionBar.t6.w0(i14, p6Var));
        int i15 = org.telegram.ui.ActionBar.t6.A5;
        pl plVar = this.E;
        org.telegram.ui.ActionBar.a7.I(plVar, i15, p6Var);
        plVar.K(0);
        org.telegram.ui.ActionBar.a7.V(this.f23894y, i10, p6Var);
        if (z10) {
            i11 = org.telegram.ui.ActionBar.t6.Vg;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.E8;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        tl tlVar = this.f23892x;
        tlVar.O(w02, false);
        if (z10) {
            i12 = org.telegram.ui.ActionBar.t6.Vg;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.E8;
        }
        tlVar.O(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), true);
        if (z10) {
            i13 = org.telegram.ui.ActionBar.t6.Xg;
        } else {
            i13 = org.telegram.ui.ActionBar.t6.G8;
        }
        tlVar.H(org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), this.D);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        bi biVar;
        if (i10 == org.telegram.messenger.at.f14775r2) {
            bm bmVar = this.G;
            if (bmVar != null) {
                if (r0()) {
                    this.U0 = MediaController.Y1;
                } else {
                    this.U0 = MediaController.Z1;
                }
                if (this.T0 != null && ((biVar = this.f30964b) == null || !biVar.f24831x1)) {
                    if (r0()) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= MediaController.a2.size()) {
                                break;
                            }
                            org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) MediaController.a2.get(i12);
                            int i13 = xeVar.f19428a;
                            org.telegram.messenger.xe xeVar2 = this.T0;
                            if (i13 == xeVar2.f19428a && xeVar.f19429b == xeVar2.f19429b) {
                                this.T0 = xeVar;
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
                bmVar.f();
                this.f23890w.f();
                ArrayList arrayList = f23849t1;
                if (!arrayList.isEmpty() && this.U0 != null) {
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        Integer num = (Integer) arrayList.get(i14);
                        HashMap hashMap = f23848s1;
                        Object obj = hashMap.get(num);
                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) this.U0.f19431f.get(num.intValue());
                        if (ffVar != null) {
                            if (obj instanceof org.telegram.messenger.ff) {
                                ffVar.g((org.telegram.messenger.ff) obj);
                            }
                            hashMap.put(num, ffVar);
                        }
                    }
                }
                v0();
            }
        } else if (i10 == org.telegram.messenger.at.l4) {
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
            org.telegram.messenger.i0.h3(new hl(this, 0), 300L);
            this.f23855c0 = false;
        }
    }

    public final boolean f0() {
        Activity W = org.telegram.messenger.i0.W(getContext());
        if (W == null) {
            W = this.f30964b.W1.getParentActivity();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (W != null) {
            if (i10 < 33 || (W.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && W.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0)) {
                if (i10 >= 33 || W.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void g0() {
        org.telegram.messenger.xe xeVar;
        if (r0()) {
            xeVar = MediaController.Y1;
        } else {
            xeVar = MediaController.Z1;
        }
        if (xeVar == null) {
            MediaController.O(0);
        }
    }

    public ArrayList<Object> getAllPhotosArray() {
        org.telegram.messenger.xe xeVar = this.T0;
        ArrayList<Object> arrayList = f23847r1;
        if (xeVar != null) {
            if (!arrayList.isEmpty()) {
                ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.T0.e.size());
                arrayList2.addAll(arrayList);
                arrayList2.addAll(this.T0.e);
                return arrayList2;
            }
            return this.T0.e;
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
        return this.f23859e0;
    }

    @Override
    public int getCurrentItemTop() {
        pl plVar = this.E;
        int childCount = plVar.getChildCount();
        xy xyVar = this.H;
        if (childCount <= 0) {
            plVar.setTopGlowOffset(plVar.getPaddingTop());
            xyVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = plVar.getChildAt(0);
        dk0 dk0Var = (dk0) plVar.G(childAt);
        int top = childAt.getTop() - this.f23881p1;
        int L = org.telegram.messenger.i0.L(7.0f);
        if (top < org.telegram.messenger.i0.L(7.0f) || dk0Var == null || dk0Var.b() != 0) {
            top = L;
        }
        xyVar.setTranslationY(((((getMeasuredHeight() - top) - org.telegram.messenger.i0.L(50.0f)) - xyVar.getMeasuredHeight()) / 2.0f) + top);
        plVar.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.E.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return f23849t1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f23848s1;
    }

    public int getSelectedPhotosCount() {
        int i10 = 0;
        for (Object obj : f23848s1.values()) {
            if (obj instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                if (!ffVar.f14603b && ffVar.f14617s == null) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i10 = 0;
        for (Object obj : f23848s1.values()) {
            if (obj instanceof org.telegram.messenger.ff) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                if (ffVar.c() && !ffVar.f14603b && ffVar.f14617s == null) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return f23849t1;
    }

    public long getStarsPrice() {
        Iterator it = f23848s1.entrySet().iterator();
        if (it.hasNext()) {
            return ((org.telegram.messenger.ff) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    public final void h0(int r13, android.content.Intent r14, java.lang.String r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.h0(int, android.content.Intent, java.lang.String):void");
    }

    @Override
    public final int i() {
        return 1;
    }

    public final void i0(boolean z10) {
        yl ylVar;
        yl ylVar2 = this.P;
        if (ylVar2 != null && this.O == null) {
            bi biVar = this.f30964b;
            if (!biVar.I) {
                ylVar2.initTexture();
                boolean r02 = r0();
                TextView textView = this.f23882q0;
                int i10 = 0;
                if (r02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f23847r1.isEmpty();
                pl plVar = this.f23883r;
                TextView textView2 = this.f23880p0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    plVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    plVar.setVisibility(0);
                }
                if (biVar.Z0().f32315w && isFocusable()) {
                    biVar.Z0().d();
                }
                t81 t81Var = this.f23873l0;
                t81Var.setVisibility(0);
                t81Var.setAlpha(0.0f);
                jg.l0 l0Var = this.f23869j0;
                l0Var.setVisibility(0);
                l0Var.setTag(null);
                int[] iArr = this.f23861f0;
                iArr[0] = 0;
                int i11 = this.K0;
                iArr[1] = i11;
                iArr[2] = org.telegram.messenger.i0.L(2.0f) + (i11 * 2);
                this.f23870j1 = 0.0f;
                this.f23868i1 = true;
                yl ylVar3 = this.P;
                if (ylVar3 != null) {
                    ylVar3.setFpsLimit(-1);
                }
                org.telegram.messenger.i0.v1(this);
                org.telegram.messenger.i0.m3(biVar, false);
                setAlertKeepScreenOn(true);
                pl plVar2 = this.E;
                ImageView[] imageViewArr = this.S;
                if (z10) {
                    setCameraOpenProgress(0.0f);
                    this.f23857d0 = true;
                    if (plVar2 != null) {
                        plVar2.invalidate();
                    }
                    this.f23862f1.d();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(l0Var, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(plVar, property, 1.0f));
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
                    animatorSet.setInterpolator(gr.f26523f);
                    animatorSet.addListener(new ol(this, 2));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    l0Var.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    plVar.setAlpha(1.0f);
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
                    biVar.T3.j0();
                    yl ylVar4 = this.P;
                    if (ylVar4 != null) {
                        ylVar4.setSystemUiVisibility(1028);
                    }
                }
                this.f23853b0 = true;
                yl ylVar5 = this.P;
                if (ylVar5 != null) {
                    ylVar5.setImportantForAccessibility(2);
                }
                plVar2.setImportantForAccessibility(4);
                plVar2.invalidate();
                if (!org.telegram.messenger.tc.e(360928) && (ylVar = this.P) != null && ylVar.isInited()) {
                    this.P.showTexture(true, z10);
                }
            }
        }
    }

    public final void j0() {
        if (org.telegram.messenger.uz.f18567y0) {
            i0(true);
            return;
        }
        bi biVar = this.f30964b;
        ai aiVar = biVar.T3;
        if (aiVar != null) {
            aiVar.H0(0, false, true, 0, 0, 0L, biVar.e1(), false, 0L);
        }
    }

    @Override
    public final void k() {
        W();
        invalidate();
    }

    public final void k0(org.telegram.messenger.ff ffVar, boolean z10, boolean z11) {
        int i10;
        org.telegram.ui.un unVar;
        org.telegram.ui.un unVar2;
        ArrayList<Object> arrayList;
        int i11;
        ArrayList arrayList2 = f23847r1;
        bi biVar = this.f30964b;
        if (ffVar != null) {
            int i12 = ffVar.C;
            arrayList2.add(ffVar);
            f23848s1.put(Integer.valueOf(i12), ffVar);
            f23849t1.add(Integer.valueOf(i12));
            biVar.J1(0);
            this.G.f();
            this.f23890w.f();
        }
        if (ffVar != null && !z11 && arrayList2.size() > 1) {
            z0(false);
            if (this.P != null) {
                this.f23873l0.b(false, 0.0f);
                this.B0 = 0.0f;
                this.P.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f23887t0 = true;
            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
            org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
            if (k2Var == null) {
                k2Var = LaunchActivity.Q();
            }
            if (k2Var != null) {
                PhotoViewer.v1().N2(k2Var.getParentActivity(), null, this.f30963a);
                PhotoViewer.v1().O2(biVar);
                PhotoViewer v12 = PhotoViewer.v1();
                int i13 = biVar.M3;
                boolean z12 = biVar.N3;
                v12.h = i13;
                v12.f33554n = z12;
                if (biVar.f24827w1 && biVar.f24831x1) {
                    unVar = (org.telegram.ui.un) k2Var2;
                    i10 = 11;
                } else {
                    if (biVar.K2 != 0) {
                        i10 = 1;
                    } else if (k2Var2 instanceof org.telegram.ui.un) {
                        unVar = (org.telegram.ui.un) k2Var2;
                        i10 = 2;
                    } else {
                        i10 = 5;
                    }
                    unVar = null;
                }
                boolean z13 = biVar.f24835y1;
                if (z13) {
                    i10 = 13;
                    unVar2 = null;
                } else {
                    unVar2 = unVar;
                }
                int i14 = i10;
                if (biVar.K2 == 0 && !z13) {
                    arrayList = getAllPhotosArray();
                    i11 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(ffVar);
                    i11 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                z30 z30Var = biVar.H1;
                if (z30Var != null && ffVar != null) {
                    z30Var.e = ffVar.f14603b;
                }
                PhotoViewer.v1().j2(arrayList3, i11, i14, false, new ql(this, z10), unVar2);
                PhotoViewer.v1().A2(biVar.H1);
                if (biVar.f24831x1) {
                    PhotoViewer.v1().Z0(null, null, false, biVar.A1);
                    PhotoViewer.v1().p2();
                }
            }
        }
    }

    @Override
    public final void l(float f7) {
        this.W0 = f7;
        W();
        yl ylVar = this.P;
        if (ylVar != null) {
            ylVar.invalidateOutline();
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
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void m0() {
        if (this.f30964b.M1) {
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.S[i10].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(gr.f26523f).start();
        }
        ViewPropertyAnimator duration = this.f23884r0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        gr grVar = gr.f26523f;
        duration.setInterpolator(grVar).start();
        this.f23882q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
        org.telegram.messenger.i0.W3(this.R, false);
        org.telegram.messenger.i0.r(this.f23865h0);
        this.f23865h0 = null;
        org.telegram.messenger.i0.P3(org.telegram.messenger.i0.W(getContext()));
    }

    @Override
    public final boolean n(MotionEvent motionEvent) {
        yl ylVar;
        if (!this.f23857d0) {
            if (this.f23853b0 && motionEvent != null) {
                boolean z10 = this.G0;
                t81 t81Var = this.f23873l0;
                if ((!z10 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.E0;
                    t81Var.getHitRect(rect);
                    if (t81Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f23886s0 && !this.I0) {
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
                    pl plVar = this.f23883r;
                    TextView textView = this.f23880p0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.S;
                    jg.l0 l0Var = this.f23869j0;
                    if (actionMasked == 2) {
                        if (this.C0 && motionEvent.getPointerCount() == 2 && !this.I0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (!this.D0) {
                                if (Math.abs(hypot - this.A0) >= org.telegram.messenger.i0.a1(false, 0.4f)) {
                                    this.A0 = hypot;
                                    this.D0 = true;
                                    return true;
                                }
                            } else if (this.P != null) {
                                this.A0 = hypot;
                                float L = this.B0 + ((hypot - this.A0) / org.telegram.messenger.i0.L(100.0f));
                                this.B0 = L;
                                if (L < 0.0f) {
                                    this.B0 = 0.0f;
                                } else if (L > 1.0f) {
                                    this.B0 = 1.0f;
                                }
                                t81Var.b(false, this.B0);
                                this.f30964b.f21587b.invalidate();
                                this.P.setZoom(this.B0);
                                u0(true);
                                return true;
                            }
                        } else {
                            float y3 = motionEvent.getY();
                            float f7 = y3 - this.F0;
                            if (this.H0) {
                                if (Math.abs(f7) > org.telegram.messenger.i0.a1(false, 0.4f)) {
                                    this.H0 = false;
                                    this.I0 = true;
                                    return true;
                                }
                            } else if (this.I0 && (ylVar = this.P) != null) {
                                ylVar.setTranslationY(ylVar.getTranslationY() + f7);
                                this.F0 = y3;
                                t81Var.setTag(null);
                                Runnable runnable = this.f23876n0;
                                if (runnable != null) {
                                    org.telegram.messenger.i0.r(runnable);
                                    this.f23876n0 = null;
                                }
                                if (l0Var.getTag() == null) {
                                    l0Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(l0Var, property, 0.0f), ObjectAnimator.ofFloat(t81Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(plVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(gr.f26523f);
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
                            yl ylVar2 = this.P;
                            if (ylVar2 != null) {
                                if (Math.abs(ylVar2.getTranslationY()) > this.P.getMeasuredHeight() / 6.0f) {
                                    b0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.P, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(l0Var, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(plVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f23867i0);
                                animatorSet2.start();
                                l0Var.setTag(null);
                                return true;
                            }
                        } else {
                            yl ylVar3 = this.P;
                            if (ylVar3 != null && !this.D0) {
                                int[] iArr = this.V;
                                ylVar3.getLocationOnScreen(iArr);
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
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void o() {
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.l4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14775r2);
    }

    public final void o0() {
        if (this.f23855c0) {
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
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.w0.h(), "cthumb.jpg"));
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
            bm bmVar = this.G;
            if (bmVar != null) {
                bmVar.f();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        W();
    }

    @Override
    public final boolean p() {
        if (this.f23857d0) {
            return true;
        }
        if (this.f23853b0) {
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
        ArrayList arrayList = v12.f33501g7;
        if (arrayList != null && !arrayList.isEmpty() && i10 < arrayList.size() && (arrayList.get(i10) instanceof org.telegram.messenger.ff) && ((org.telegram.messenger.ff) arrayList.get(i10)).M) {
            final org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList.get(i10);
            this.E.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z11 = ChatAttachAlertPhotoLayout.f23846q1;
                    if (view instanceof org.telegram.ui.Cells.v5) {
                        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                        if (v5Var.getPhotoEntry() == ffVar) {
                            v5Var.c(z10, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z12 = true;
                            if (ChatAttachAlertPhotoLayout.f23848s1.size() <= 1) {
                                z12 = false;
                            }
                            v5Var.f(starsPrice, z12);
                        }
                    }
                }
            });
        }
    }

    public final boolean r0() {
        if (!this.f23895y0) {
            bi biVar = this.f30964b;
            if (!biVar.f24827w1) {
                if (!(biVar.W1 instanceof org.telegram.ui.un) && !biVar.N2 && biVar.K2 != 2) {
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
        yl ylVar = this.P;
        if (ylVar != null) {
            ylVar.setVisibility(8);
        }
        for (Map.Entry entry : f23848s1.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.ff) {
                ((org.telegram.messenger.ff) entry.getValue()).getClass();
            }
        }
        this.G.f();
    }

    public final void s0(q8 q8Var, TLRPC.VideoSize videoSize, long j10) {
        boolean z10;
        bi biVar = this.f30964b;
        o8 o8Var = new o8(biVar.L1, biVar.H1);
        z30 z30Var = biVar.H1;
        if (z30Var != null && z30Var.f32985c == 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        o8Var.Q = z10;
        biVar.W1.presentFragment(o8Var);
        if (q8Var != null) {
            o8Var.r0(q8Var);
        }
        if (videoSize != null) {
            o8Var.q0(videoSize);
        }
        if (j10 != 0) {
            o8Var.p0(j10);
        }
        o8Var.I = new f2(8, this, o8Var);
    }

    public void setCameraOpenProgress(float f7) {
        int i10;
        int i11;
        if (this.P == null) {
            return;
        }
        this.f23859e0 = f7;
        int[] iArr = this.f23861f0;
        float f10 = iArr[1];
        float f11 = iArr[2];
        int i12 = org.telegram.messenger.i0.f16172q.x;
        bi biVar = this.f30964b;
        float width = biVar.f21590c.getWidth();
        float height = biVar.f21590c.getHeight();
        float[] fArr = this.U;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = this.f23870j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
        float textureHeight = this.P.getTextureHeight(f10, f11) / this.P.getTextureHeight(width, height);
        float f15 = f11 / height;
        float f16 = f10 / width;
        if (this.f23868i1) {
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
            this.f23872k1 = f20 - this.P.getTranslationY();
            this.l1 = (height * f7) + (((f13 + f11) * f17) - this.P.getTranslationY());
            this.f23877n1 = f19 - this.P.getTranslationX();
            this.f23874m1 = (width * f7) + (((f12 + f10) * f17) - this.P.getTranslationX());
        } else {
            i10 = (int) f10;
            i11 = (int) f11;
            this.P.getTextureView().setScaleX(1.0f);
            this.P.getTextureView().setScaleY(1.0f);
            this.f23872k1 = 0.0f;
            this.l1 = height;
            this.f23877n1 = 0.0f;
            this.f23874m1 = width;
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
        this.f23888u0 = z10;
    }

    public void setIncludeVideosInGallery(boolean z10) {
        this.f23895y0 = z10;
    }

    public void setStarsPrice(long j10) {
        boolean z10;
        HashMap hashMap = f23848s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) entry.getValue();
                ffVar.N = j10;
                if (j10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ffVar.M = z10;
                ffVar.R = false;
            }
        }
        D(getSelectedItemsCount());
        if (X(false)) {
            y0();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        bi biVar = this.f30964b;
        if (biVar.A0 == 1) {
            float f10 = (f7 / 40.0f) * (-0.1f);
            pl plVar = this.E;
            int childCount = plVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                    float f11 = 1.0f + f10;
                    v5Var.getCheckBox().setScaleX(f11);
                    v5Var.getCheckBox().setScaleY(f11);
                }
            }
        }
        super.setTranslationY(f7);
        biVar.f21587b.invalidate();
        invalidate();
    }

    @Override
    public final void t() {
        this.N = true;
        pl plVar = this.E;
        int childCount = plVar.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (plVar.getChildAt(i10) instanceof org.telegram.ui.Cells.p5) {
                o0();
                break;
            } else {
                this.Q.i();
                i10++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f23879o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f23894y.animate().alpha(0.0f).setDuration(150L).setInterpolator(gr.f26526j).withEndAction(new hl(this, 3));
        this.f23879o1 = withEndAction;
        withEndAction.start();
        l0();
    }

    public final void t0() {
        boolean z10;
        boolean z11;
        float f7;
        bi biVar = this.f30964b;
        if (!biVar.Z3 && this.f23889v0 && CameraView.isCameraAllowed()) {
            if (this.P == null) {
                boolean z12 = !org.telegram.messenger.tc.e(360928);
                Context context = getContext();
                Boolean bool = this.f23878o0;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = biVar.O3;
                }
                yl ylVar = new yl(this, context, z10, z12);
                this.P = ylVar;
                org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).A()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ylVar.setRecordFile(org.telegram.messenger.i0.s0(z11));
                this.P.setFocusable(true);
                this.P.setFpsLimit(30);
                this.P.setOutlineProvider(new org.telegram.ui.ol(this, 1));
                this.P.setClipToOutline(true);
                this.P.setContentDescription(org.telegram.messenger.dd.L0(2131754852, null));
                org.telegram.ui.ActionBar.p2 p2Var = biVar.f21590c;
                yl ylVar2 = this.P;
                int i10 = this.K0;
                p2Var.addView(ylVar2, 1, new FrameLayout.LayoutParams(i10, i10));
                this.P.setDelegate(new rl(this));
                yl ylVar3 = this.P;
                if (this.f23889v0) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.2f;
                }
                ylVar3.setAlpha(f7);
                this.P.setEnabled(this.f23889v0);
                if (this.N) {
                    this.P.setVisibility(8);
                }
                if (!this.f23853b0) {
                    W();
                }
                pl plVar = this.E;
                if (plVar != null) {
                    plVar.invalidate();
                }
                invalidate();
            }
            t81 t81Var = this.f23873l0;
            if (t81Var != null) {
                t81Var.b(false, 0.0f);
                this.B0 = 0.0f;
            }
            if (!this.f23853b0) {
                this.P.setTranslationX(this.U[0]);
            }
        }
    }

    @Override
    public final void u(float f7) {
        yl ylVar = this.P;
        if (ylVar != null) {
            ylVar.setAlpha(f7);
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
        t81 t81Var = this.f23873l0;
        if ((t81Var.getTag() != null && z10) || (t81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f23876n0;
                if (runnable != null) {
                    org.telegram.messenger.i0.r(runnable);
                }
                hl hlVar = new hl(this, 1);
                this.f23876n0 = hlVar;
                org.telegram.messenger.i0.h3(hlVar, 2000L);
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
        t81Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.m0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(t81Var, View.ALPHA, f7));
        this.m0.addListener(new ol(this, 1));
        this.m0.start();
        if (z10) {
            hl hlVar2 = new hl(this, 2);
            this.f23876n0 = hlVar2;
            org.telegram.messenger.i0.h3(hlVar2, 2000L);
        }
    }

    public final void v0() {
        ArrayList arrayList;
        tl tlVar = this.f23892x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = tlVar.f20827b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f23889v0) {
            if (r0()) {
                arrayList = MediaController.a2;
            } else {
                arrayList = MediaController.f14433b2;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.V0 = arrayList2;
            Collections.sort(arrayList2, new jl(arrayList, 0));
        } else {
            this.V0 = new ArrayList();
        }
        boolean isEmpty = this.V0.isEmpty();
        TextView textView = this.f23894y;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.D, (Drawable) null);
        int size = this.V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) this.V0.get(i10);
            vh.a aVar = new vh.a(getContext(), xeVar.d, xeVar.f19430c, xeVar.e.size(), this.f30963a);
            tlVar.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new bh.f(this, i10 + 10, 6));
        }
    }

    @Override
    public final void w(int i10) {
        TLRPC.Chat X0;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        bi biVar = this.f30964b;
        if (i10 == 8) {
            biVar.u1(!biVar.T1, true);
            this.f23858d1.a(!biVar.T1, true);
        } else if ((i10 == 0 || i10 == 1) && biVar.M3 > 0 && f23849t1.size() > 1 && (X0 = biVar.X0()) != null && !org.telegram.messenger.w3.N(X0) && X0.slowmode_enabled) {
            s4.N(getContext(), org.telegram.messenger.dd.L0(2131745328, null), org.telegram.messenger.dd.L0(2131745320, null), null, null, this.f30963a).p();
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.f30963a;
            HashMap hashMap = f23848s1;
            if (i10 == 0) {
                org.telegram.messenger.kj kjVar = biVar.B3;
                org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                if (kjVar == null && (k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).c()) {
                    s4.L(getContext(), ((org.telegram.ui.un) k2Var).a(), new dl(this, 0), p6Var);
                } else {
                    s4.Z(biVar.D3, biVar.W0() + hashMap.size(), biVar.a1(), new org.telegram.messenger.r20(this) {
                        public final ChatAttachAlertPhotoLayout f25856b;

                        {
                            this.f25856b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25856b;
                            Long l4 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f23846q1;
                                    bi biVar2 = chatAttachAlertPhotoLayout.f30964b;
                                    biVar2.M0();
                                    biVar2.T3.H0(7, false, true, 0, 0, 0L, biVar2.e1(), false, l4.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f23846q1;
                                    bi biVar3 = chatAttachAlertPhotoLayout.f30964b;
                                    biVar3.M0();
                                    biVar3.T3.H0(4, true, true, 0, 0, 0L, biVar3.e1(), false, l4.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i10 == 1) {
                org.telegram.messenger.kj kjVar2 = biVar.B3;
                org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
                if (kjVar2 == null && (k2Var2 instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var2).c()) {
                    s4.L(getContext(), ((org.telegram.ui.un) k2Var2).a(), new dl(this, 1), p6Var);
                } else {
                    s4.Z(biVar.D3, biVar.W0() + hashMap.size(), biVar.a1(), new org.telegram.messenger.r20(this) {
                        public final ChatAttachAlertPhotoLayout f25856b;

                        {
                            this.f25856b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            int i11 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25856b;
                            Long l4 = (Long) obj;
                            switch (i11) {
                                case 0:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f23846q1;
                                    bi biVar2 = chatAttachAlertPhotoLayout.f30964b;
                                    biVar2.M0();
                                    biVar2.T3.H0(7, false, true, 0, 0, 0L, biVar2.e1(), false, l4.longValue());
                                    return;
                                default:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f23846q1;
                                    bi biVar3 = chatAttachAlertPhotoLayout.f30964b;
                                    biVar3.M0();
                                    biVar3.T3.H0(4, true, true, 0, 0, 0L, biVar3.e1(), false, l4.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                bm bmVar = this.G;
                pl plVar = this.E;
                if (i10 == 3) {
                    jm jmVar = biVar.f24770h2;
                    if (jmVar != null) {
                        jmVar.N();
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
                    org.telegram.messenger.i0.h3(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout f26186b;

                        {
                            this.f26186b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z14 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26186b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f23846q1;
                                    bi biVar2 = chatAttachAlertPhotoLayout.f30964b;
                                    org.telegram.ui.ActionBar.b1 b1Var = chatAttachAlertPhotoLayout.Y0;
                                    if (z14) {
                                        i11 = 2131751431;
                                    } else {
                                        i11 = 2131751155;
                                    }
                                    b1Var.setText(org.telegram.messenger.dd.L0(i11, null));
                                    if (z14) {
                                        b1Var.setIcon(2131232376);
                                    } else {
                                        b1Var.setAnimatedIcon(2131624129);
                                    }
                                    if (z14) {
                                        biVar2.U2.t(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            biVar2.U2.t(6);
                                            return;
                                        }
                                        return;
                                    }
                                    biVar2.U2.S(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        biVar2.U2.S(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.b1 b1Var2 = chatAttachAlertPhotoLayout.f23852a1;
                                    if (z14) {
                                        i12 = 2131745637;
                                    } else {
                                        i12 = 2131745638;
                                    }
                                    b1Var2.setText(org.telegram.messenger.dd.L0(i12, null));
                                    if (z14) {
                                        b1Var2.setIcon(2131231867);
                                        return;
                                    } else {
                                        b1Var2.setIcon(2131231864);
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
                    plVar.M(new gl(0, arrayList, z13));
                    if (biVar.f24812s2 != this) {
                        bmVar.f();
                    }
                    jm jmVar2 = biVar.f24770h2;
                    if (jmVar2 != null) {
                        jmVar2.f27457w.invalidate();
                    }
                } else if (i10 == 2) {
                    jm jmVar3 = biVar.f24770h2;
                    if (jmVar3 != null) {
                        jmVar3.N();
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
                    org.telegram.messenger.i0.h3(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout f26186b;

                        {
                            this.f26186b = this;
                        }

                        @Override
                        public final void run() {
                            int i11;
                            int i12;
                            int i13 = r3;
                            boolean z142 = z14;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f26186b;
                            switch (i13) {
                                case 0:
                                    boolean z15 = ChatAttachAlertPhotoLayout.f23846q1;
                                    bi biVar2 = chatAttachAlertPhotoLayout.f30964b;
                                    org.telegram.ui.ActionBar.b1 b1Var = chatAttachAlertPhotoLayout.Y0;
                                    if (z142) {
                                        i11 = 2131751431;
                                    } else {
                                        i11 = 2131751155;
                                    }
                                    b1Var.setText(org.telegram.messenger.dd.L0(i11, null));
                                    if (z142) {
                                        b1Var.setIcon(2131232376);
                                    } else {
                                        b1Var.setAnimatedIcon(2131624129);
                                    }
                                    if (z142) {
                                        biVar2.U2.t(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            biVar2.U2.t(6);
                                            return;
                                        }
                                        return;
                                    }
                                    biVar2.U2.S(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        biVar2.U2.S(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.b1 b1Var2 = chatAttachAlertPhotoLayout.f23852a1;
                                    if (z142) {
                                        i12 = 2131745637;
                                    } else {
                                        i12 = 2131745638;
                                    }
                                    b1Var2.setText(org.telegram.messenger.dd.L0(i12, null));
                                    if (z142) {
                                        b1Var2.setIcon(2131231867);
                                        return;
                                    } else {
                                        b1Var2.setIcon(2131231864);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        if (entry2.getValue() instanceof org.telegram.messenger.ff) {
                            org.telegram.messenger.ff ffVar2 = (org.telegram.messenger.ff) entry2.getValue();
                            ffVar2.f14623z = Boolean.valueOf(z14);
                            ffVar2.R = false;
                            arrayList2.add(Integer.valueOf(ffVar2.C));
                        }
                    }
                    plVar.M(new gl(1, arrayList2, z14));
                    if (biVar.f24812s2 != this) {
                        bmVar.f();
                    }
                    jm jmVar4 = biVar.f24770h2;
                    if (jmVar4 != null) {
                        jmVar4.f27457w.invalidate();
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
                            int i11 = biVar.K2;
                            org.telegram.ui.ActionBar.k2 k2Var3 = biVar.W1;
                            if (i11 != 0) {
                                k2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                k2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i12 = biVar.K2;
                            org.telegram.ui.ActionBar.k2 k2Var4 = biVar.W1;
                            if (i12 != 0) {
                                k2Var4.startActivityForResult(intent3, 14);
                            } else {
                                k2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        biVar.a(true);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                } else if (i10 == 7) {
                    if (biVar.f24812s2 == biVar.f24770h2) {
                        z12 = false;
                    }
                    biVar.N1(z12);
                } else if (i10 == 9) {
                    rh.h8.j1(getContext(), getStarsPrice(), true, new d(this, 6), this.f30963a);
                } else if (i10 >= 10) {
                    org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) this.V0.get(i10 - 10);
                    this.T0 = xeVar;
                    org.telegram.messenger.xe xeVar2 = this.U0;
                    TextView textView = this.f23894y;
                    if (xeVar == xeVar2) {
                        textView.setText(org.telegram.messenger.dd.L0(2131752238, null));
                    } else {
                        textView.setText(xeVar.f19430c);
                    }
                    bmVar.f();
                    this.f23890w.f();
                    this.F.h1(0, -(plVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void w0() {
        pl plVar = this.E;
        if (plVar != null) {
            for (int i10 = 0; i10 < plVar.getChildCount(); i10++) {
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.v5) {
                    ((org.telegram.ui.Cells.v5) childAt).f23308a.invalidate();
                }
            }
        }
    }

    @Override
    public final void x() {
        boolean z10;
        bi biVar = this.f30964b;
        if (biVar != null && (biVar.W1 instanceof org.telegram.ui.un)) {
            z10 = true;
        } else {
            z10 = false;
        }
        V(z10);
    }

    public final void x0() {
        ArrayList arrayList;
        if (this.f30964b.W1 instanceof org.telegram.ui.un) {
            pl plVar = this.E;
            int childCount = plVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f23849t1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                    org.telegram.messenger.ff c02 = c0(((Integer) v5Var.getTag()).intValue());
                    if (c02 != null) {
                        v5Var.setNum(arrayList.indexOf(Integer.valueOf(c02.C)));
                    }
                }
                i10++;
            }
            pl plVar2 = this.f23883r;
            int childCount2 = plVar2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = plVar2.getChildAt(i11);
                if (childAt2 instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var2 = (org.telegram.ui.Cells.v5) childAt2;
                    org.telegram.messenger.ff c03 = c0(((Integer) v5Var2.getTag()).intValue());
                    if (c03 != null) {
                        v5Var2.setNum(arrayList.indexOf(Integer.valueOf(c03.C)));
                    }
                }
            }
        }
    }

    public final void y0() {
        ArrayList arrayList;
        bm bmVar;
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
        bi biVar = this.f30964b;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            pl plVar = this.E;
            int childCount = plVar.getChildCount();
            int i11 = 0;
            while (true) {
                arrayList = f23849t1;
                bmVar = this.G;
                hashMap = f23848s1;
                int i12 = -1;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = plVar.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (bmVar.f24888f && R > this.M0) {
                        R--;
                    }
                    if (bmVar.d && this.T0 == this.U0) {
                        R--;
                    }
                    org.telegram.messenger.ff c02 = c0(R);
                    if (c02 != null && c02.M) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    v5Var.setHasSpoiler(z14);
                    if (c02 != null && c02.c()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    v5Var.setHighQuality(z15);
                    if ((k2Var2 instanceof org.telegram.ui.un) && biVar.N3) {
                        if (c02 != null) {
                            i12 = arrayList.indexOf(Integer.valueOf(c02.C));
                        }
                        if (c02 != null && hashMap.containsKey(Integer.valueOf(c02.C))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        v5Var.b(i12, z17, true);
                    } else {
                        if (c02 != null && hashMap.containsKey(Integer.valueOf(c02.C))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        v5Var.b(-1, z16, true);
                    }
                }
                i11++;
            }
            pl plVar2 = this.f23883r;
            int childCount2 = plVar2.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = plVar2.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var2 = (org.telegram.ui.Cells.v5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (bmVar.f24888f && R2 > this.M0) {
                        R2--;
                    }
                    if (bmVar.d && this.T0 == this.U0) {
                        R2--;
                    }
                    org.telegram.messenger.ff c03 = c0(R2);
                    if (c03 != null && c03.M) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v5Var2.setHasSpoiler(z10);
                    if (c03 != null && c03.c()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v5Var2.setHighQuality(z11);
                    if ((k2Var2 instanceof org.telegram.ui.un) && biVar.N3) {
                        if (c03 != null) {
                            i10 = arrayList.indexOf(Integer.valueOf(c03.C));
                        } else {
                            i10 = -1;
                        }
                        if (c03 != null && hashMap.containsKey(Integer.valueOf(c03.C))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        v5Var2.b(i10, z13, true);
                    } else {
                        if (c03 != null && hashMap.containsKey(Integer.valueOf(c03.C))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        v5Var2.b(-1, z12, true);
                    }
                }
            }
        }
    }

    @Override
    public final void z(int i10, boolean z10) {
        W();
        yl ylVar = this.P;
        if (ylVar != null) {
            ylVar.invalidateOutline();
            this.P.invalidate();
        }
    }

    public final void z0(boolean z10) {
        boolean z11;
        TextView textView = this.f23880p0;
        if (textView != null) {
            bi biVar = this.f30964b;
            int i10 = biVar.K2;
            TextView textView2 = biVar.f24759d3;
            if (i10 == 0 && !biVar.N2 && !biVar.f24835y1) {
                HashMap hashMap = f23848s1;
                Iterator it = hashMap.entrySet().iterator();
                int i11 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    z11 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((org.telegram.messenger.ff) ((Map.Entry) it.next()).getValue()).f14603b) {
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
                    textView.setText(org.telegram.messenger.dd.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                    if (max != this.M || z10) {
                        textView2.setText(org.telegram.messenger.dd.G(max, "MediaSelected", new Object[0]));
                    }
                } else if (z12) {
                    textView.setText(org.telegram.messenger.dd.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                    if (max != this.M || z10) {
                        textView2.setText(org.telegram.messenger.dd.G(max, "VideosSelected", new Object[0]));
                    }
                } else {
                    textView.setText(org.telegram.messenger.dd.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                    if (max != this.M || z10) {
                        textView2.setText(org.telegram.messenger.dd.G(max, "PhotosSelected", new Object[0]));
                    }
                }
                if (max <= 1) {
                    z11 = false;
                }
                biVar.D1 = z11;
                biVar.f24768g3.setVisibility((!z11 || biVar.K2 == 2) ? 8 : 8);
                this.M = max;
            }
        }
    }
}
