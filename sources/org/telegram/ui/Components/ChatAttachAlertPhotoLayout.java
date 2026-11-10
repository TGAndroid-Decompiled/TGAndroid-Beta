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
public class ChatAttachAlertPhotoLayout extends uh implements org.telegram.messenger.ls {
    public static boolean f31204q1;
    public static final ArrayList f31205r1 = new ArrayList();
    public static final HashMap f31206s1 = new HashMap();
    public static final ArrayList f31207t1 = new ArrayList();
    public static int f31208u1 = -1;
    public float A0;
    public float B0;
    public boolean C0;
    public final Drawable D;
    public boolean D0;
    public final il E;
    public final Rect E0;
    public final ei.h F;
    public float F0;
    public final sl G;
    public boolean G0;
    public final iy H;
    public boolean H0;
    public final tj0 I;
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
    public pl P;
    public boolean P0;
    public final ql Q;
    public boolean Q0;
    public final nl R;
    public boolean R0;
    public final ImageView[] S;
    public int S0;
    public boolean T;
    public org.telegram.messenger.we T0;
    public final float[] U;
    public org.telegram.messenger.we U0;
    public final int[] V;
    public ArrayList V0;
    public float W;
    public float W0;
    public boolean X0;
    public final org.telegram.ui.ActionBar.z0 Y0;
    public final org.telegram.ui.ActionBar.z0 Z0;
    public float f31209a0;
    public final org.telegram.ui.ActionBar.z0 f31210a1;
    public boolean f31211b0;
    public final org.telegram.ui.ActionBar.z0 f31212b1;
    public boolean f31213c0;
    public final org.telegram.ui.ActionBar.z0 f31214c1;
    public boolean f31215d0;
    public final ha0 f31216d1;
    public float f31217e0;
    public final boolean f31218e1;
    public final int[] f31219f0;
    public final h2.f f31220f1;
    public int f31221g0;
    public boolean f31222g1;
    public fl f31223h0;
    public final ll f31224h1;
    public final DecelerateInterpolator f31225i0;
    public boolean f31226i1;
    public final bi.e5 f31227j0;
    public float f31228j1;
    public final ShutterButton f31229k0;
    public float f31230k1;
    public final r71 f31231l0;
    public float l1;
    public AnimatorSet m0;
    public float f31232m1;
    public final boolean f31233n;
    public Runnable f31234n0;
    public float n1;
    public Boolean f31235o0;
    public ViewPropertyAnimator f31236o1;
    public final TextView f31237p0;
    public int f31238p1;
    public final TextView f31239q0;
    public final il f31240r;
    public final ImageView f31241r0;
    public final jg.b0 f31242s;
    public boolean f31243s0;
    public boolean f31244t0;
    public boolean f31245u0;
    public boolean f31246v0;
    public final sl f31247w;
    public boolean f31248w0;
    public final fi.w2 f31249x;
    public boolean f31250x0;
    public final TextView f31251y;
    public boolean f31252y0;
    public boolean f31253z0;

    public ChatAttachAlertPhotoLayout(ci ciVar, Context context, boolean z9, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, ciVar);
        boolean z11;
        this.S = new ImageView[2];
        this.U = new float[2];
        this.V = new int[2];
        this.f31219f0 = new int[5];
        this.f31225i0 = new DecelerateInterpolator(1.5f);
        this.f31235o0 = null;
        this.E0 = new Rect();
        int L = org.telegram.messenger.g0.L(80.0f);
        this.K0 = L;
        this.L0 = L;
        this.M0 = 3;
        this.X0 = true;
        this.f31220f1 = new h2.f((int[]) null);
        this.f31224h1 = new ll(this);
        this.f31218e1 = z9;
        this.f31233n = z10;
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25070r2);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25038l4);
        org.telegram.ui.ActionBar.m2 m2Var = ciVar.f28675c;
        ci ciVar2 = this.f38656b;
        if (ciVar2.N2 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f31222g1 = z11;
        fi.w2 w2Var = new fi.w2(this, context, ciVar2.U2.s(), h6Var, 1);
        this.f31249x = w2Var;
        w2Var.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = c8.ha.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = org.telegram.messenger.g0.f22561m;
        this.f38656b.U2.addView(w2Var, 0, d);
        w2Var.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f39990b;

            {
                this.f39990b = this;
            }

            @Override
            public final void onClick(View view) {
                pl plVar;
                pl plVar2;
                int i7 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39990b;
                switch (i7) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f31243s0 && (plVar = chatAttachAlertPhotoLayout.P) != null && plVar.isInited()) {
                            chatAttachAlertPhotoLayout.f31213c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f31241r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new hl(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.T && (plVar2 = chatAttachAlertPhotoLayout.P) != null && plVar2.isInited() && chatAttachAlertPhotoLayout.f31211b0) {
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
                                ChatAttachAlertPhotoLayout.r0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(wq.f40046f);
                                animatorSet.addListener(new di.h3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f31249x.U(null, null);
                        return;
                    default:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f31251y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        textView.setText(org.telegram.messenger.id.M0(2131752238, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        Drawable h = jg.g.h(context, 2131231253);
        this.D = h;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.x(this, h, i7, h6Var, mode);
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
        w2Var.addView(textView, c8.ha.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        W(false);
        ha0 ha0Var = new ha0(context, 2131624139, org.telegram.messenger.id.M0(2131752560, null), 2131624138, org.telegram.messenger.id.M0(2131752559, null), h6Var);
        this.f31216d1 = ha0Var;
        ha0Var.a(!this.f38656b.W1, false);
        this.f31214c1 = this.f38656b.X2.e(7, 2131232420, org.telegram.messenger.id.M0(2131753957, null));
        this.f38656b.X2.a(5);
        this.f38656b.X2.e(4, 2131232265, org.telegram.messenger.id.M0(2131747796, null));
        this.Z0 = this.f38656b.X2.e(1, 2131232132, org.telegram.messenger.id.M0(2131745585, null));
        this.f38656b.X2.e(0, 2131232411, org.telegram.messenger.id.M0(2131745584, null));
        this.f38656b.X2.a(6);
        this.Y0 = this.f38656b.X2.e(3, 2131232376, org.telegram.messenger.id.M0(2131751154, null));
        this.f31210a1 = this.f38656b.X2.e(2, 2131231865, org.telegram.messenger.id.M0(2131745621, null));
        org.telegram.ui.ActionBar.r0 r0Var = this.f38656b.X2;
        r0Var.p();
        ha0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        ha0Var.setTag(8);
        r0Var.f28430b.addView(ha0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ha0Var.getLayoutParams();
        if (org.telegram.messenger.id.f23161a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        ha0Var.setLayoutParams(layoutParams);
        ha0Var.setOnClickListener(new org.telegram.ui.ActionBar.z(r0Var, 2));
        this.f31212b1 = this.f38656b.X2.e(9, 2131231809, org.telegram.messenger.id.M0(2131747730, null));
        this.f38656b.X2.setFitSubItems(true);
        il ilVar = new il(this, context, h6Var, 1);
        this.E = ilVar;
        ilVar.setFastScrollEnabled(1);
        ilVar.setFastScrollVisible(true);
        ilVar.getFastScroll().setAlpha(0.0f);
        ilVar.getFastScroll().f38664a = false;
        ilVar.getFastScroll().f38676h0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        sl slVar = new sl(this, context, z10);
        this.G = slVar;
        ilVar.setAdapter(slVar);
        ql qlVar = new ql(this, ilVar);
        this.Q = qlVar;
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
        org.telegram.ui.ActionBar.t6.l(ilVar, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        addView(ilVar, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        ilVar.setOnScrollListener(new fi.h8(1, this));
        ei.h hVar = new ei.h(this, this.K0, 3);
        this.F = hVar;
        hVar.O = new ai.l(this, 7);
        ilVar.setLayoutManager(hVar);
        ilVar.setOnItemClickListener(new ab.j(this, z10, h6Var, 7));
        ilVar.setOnItemLongClickListener(new xk(this, 2));
        tj0 tj0Var = new tj0(new m(this));
        this.I = tj0Var;
        ilVar.E.add(tj0Var);
        setBlur3Capture(ilVar);
        this.d = ilVar;
        this.f38659f = true;
        iy iyVar = new iy(context, h6Var);
        this.H = iyVar;
        iyVar.setText(org.telegram.messenger.id.M0(2131748180, null));
        iyVar.setOnTouchListener(null);
        iyVar.setTextSize(16);
        addView(iyVar, c8.ha.c(-2.0f, -1));
        if (this.X0) {
            iyVar.b();
        } else {
            iyVar.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        nl nlVar = new nl(context, paint);
        this.R = nlVar;
        org.telegram.messenger.g0.Z3(nlVar, false, 1.0f, true, false);
        nlVar.setBackgroundResource(2131232771);
        nlVar.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        nlVar.setTextSize(1, 15.0f);
        nlVar.setTypeface(org.telegram.messenger.g0.o());
        nlVar.setAlpha(0.0f);
        nlVar.setTextColor(-1);
        nlVar.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        m2Var.addView(nlVar, c8.ha.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        bi.e5 e5Var = new bi.e5(15, context, this);
        this.f31227j0 = e5Var;
        e5Var.setVisibility(8);
        e5Var.setAlpha(0.0f);
        m2Var.addView(e5Var, c8.ha.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.f31237p0 = textView2;
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
        m2Var.addView(textView2, c8.ha.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f39990b;

            {
                this.f39990b = this;
            }

            @Override
            public final void onClick(View view) {
                pl plVar;
                pl plVar2;
                int i72 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39990b;
                switch (i72) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f31243s0 && (plVar = chatAttachAlertPhotoLayout.P) != null && plVar.isInited()) {
                            chatAttachAlertPhotoLayout.f31213c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f31241r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new hl(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.T && (plVar2 = chatAttachAlertPhotoLayout.P) != null && plVar2.isInited() && chatAttachAlertPhotoLayout.f31211b0) {
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
                                ChatAttachAlertPhotoLayout.r0(imageView, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(wq.f40046f);
                                animatorSet.addListener(new di.h3(chatAttachAlertPhotoLayout, view, imageView, 4));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f31249x.U(null, null);
                        return;
                    default:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                }
            }
        });
        r71 r71Var = new r71(context);
        this.f31231l0 = r71Var;
        r71Var.setVisibility(8);
        r71Var.setAlpha(0.0f);
        m2Var.addView(r71Var, c8.ha.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        r71Var.setDelegate(new xk(this, 3));
        ?? view = new View(context);
        view.f31562b = new DecelerateInterpolator();
        view.f31570x = new dt(view, 14);
        view.f31561a = view.getResources().getDrawable(2131230928);
        Paint paint2 = new Paint(1);
        view.f31563c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f31565f = dt0.f33074a;
        this.f31229k0 = view;
        e5Var.addView((View) view, c8.ha.e(84, 84, 17));
        view.setDelegate(new gl(this, h6Var, m2Var));
        view.setFocusable(true);
        view.setContentDescription(org.telegram.messenger.id.M0(2131754760, null));
        ImageView imageView = new ImageView(context);
        this.f31241r0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        e5Var.addView(imageView, c8.ha.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout f39990b;

            {
                this.f39990b = this;
            }

            @Override
            public final void onClick(View view2) {
                pl plVar;
                pl plVar2;
                int i72 = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39990b;
                switch (i72) {
                    case 0:
                        if (!chatAttachAlertPhotoLayout.f31243s0 && (plVar = chatAttachAlertPhotoLayout.P) != null && plVar.isInited()) {
                            chatAttachAlertPhotoLayout.f31213c0 = false;
                            chatAttachAlertPhotoLayout.P.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f31241r0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new hl(chatAttachAlertPhotoLayout, 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        if (!chatAttachAlertPhotoLayout.T && (plVar2 = chatAttachAlertPhotoLayout.P) != null && plVar2.isInited() && chatAttachAlertPhotoLayout.f31211b0) {
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
                                ChatAttachAlertPhotoLayout.r0(imageView2, nextFlashMode);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(wq.f40046f);
                                animatorSet.addListener(new di.h3(chatAttachAlertPhotoLayout, view2, imageView2, 4));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        chatAttachAlertPhotoLayout.f31249x.U(null, null);
                        return;
                    default:
                        if (chatAttachAlertPhotoLayout.P != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754752, null));
        for (int i12 = 0; i12 < 2; i12++) {
            this.S[i12] = new ImageView(context);
            this.S[i12].setScaleType(ImageView.ScaleType.CENTER);
            this.S[i12].setVisibility(4);
            this.f31227j0.addView(this.S[i12], c8.ha.e(48, 48, 51));
            this.S[i12].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout f39990b;

                {
                    this.f39990b = this;
                }

                @Override
                public final void onClick(View view2) {
                    pl plVar;
                    pl plVar2;
                    int i72 = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f39990b;
                    switch (i72) {
                        case 0:
                            if (!chatAttachAlertPhotoLayout.f31243s0 && (plVar = chatAttachAlertPhotoLayout.P) != null && plVar.isInited()) {
                                chatAttachAlertPhotoLayout.f31213c0 = false;
                                chatAttachAlertPhotoLayout.P.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.f31241r0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new hl(chatAttachAlertPhotoLayout, 0));
                                duration.start();
                                return;
                            }
                            return;
                        case 1:
                            if (!chatAttachAlertPhotoLayout.T && (plVar2 = chatAttachAlertPhotoLayout.P) != null && plVar2.isInited() && chatAttachAlertPhotoLayout.f31211b0) {
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
                                    ChatAttachAlertPhotoLayout.r0(imageView2, nextFlashMode);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    Property property = View.TRANSLATION_Y;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, org.telegram.messenger.g0.L(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -org.telegram.messenger.g0.L(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(wq.f40046f);
                                    animatorSet.addListener(new di.h3(chatAttachAlertPhotoLayout, view2, imageView2, 4));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        case 2:
                            chatAttachAlertPhotoLayout.f31249x.U(null, null);
                            return;
                        default:
                            if (chatAttachAlertPhotoLayout.P != null) {
                                chatAttachAlertPhotoLayout.m0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.P.getCameraSessionObject());
                                return;
                            }
                            return;
                    }
                }
            });
            this.S[i12].setContentDescription("flash mode " + i12);
        }
        TextView textView3 = new TextView(context);
        this.f31239q0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setText(org.telegram.messenger.id.M0(2131744270, null));
        textView3.setShadowLayer(org.telegram.messenger.g0.L(3.33333f), 0.0f, org.telegram.messenger.g0.L(0.666f), 1275068416);
        textView3.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.f31227j0.addView(textView3, c8.ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        il ilVar2 = new il(this, context, h6Var, 0);
        this.f31240r = ilVar2;
        ilVar2.setVerticalScrollBarEnabled(true);
        sl slVar2 = new sl(this, context, false);
        this.f31247w = slVar2;
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
        m2Var.addView(ilVar2, c8.ha.c(80.0f, -1));
        jg.b0 b0Var = new jg.b0(0, false, 7);
        this.f31242s = b0Var;
        ilVar2.setLayoutManager(b0Var);
        ilVar2.setOnItemClickListener(new f7(1));
    }

    public static org.telegram.ui.Cells.q5 O(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        il ilVar = chatAttachAlertPhotoLayout.E;
        int childCount = ilVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ilVar.getChildAt(i10);
            if (childAt.getTop() < ilVar.getMeasuredHeight() - chatAttachAlertPhotoLayout.f38656b.Z0() && (childAt instanceof org.telegram.ui.Cells.q5)) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (q5Var.getImageView().getTag() != null && ((Integer) q5Var.getImageView().getTag()).intValue() == i7) {
                    return q5Var;
                }
            }
        }
        return null;
    }

    public static int Q(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        ci ciVar = chatAttachAlertPhotoLayout.f38656b;
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        if ((f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).f44492f4 == 5) {
            return ((org.telegram.messenger.j0) f2Var.getMessagesController().f24946x7.f24439d0.f13557b).f23464c - ((org.telegram.ui.cn) ciVar.Z1).K6.size();
        }
        return Integer.MAX_VALUE;
    }

    public static boolean U() {
        HashMap hashMap = f31206s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                    if (gfVar.d() && gfVar.j()) {
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
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = f31207t1;
            if (i7 >= arrayList.size()) {
                break;
            }
            Object obj = f31206s1.get(arrayList.get(i7));
            if (obj instanceof org.telegram.messenger.gf) {
                charSequence = ((org.telegram.messenger.gf) obj).f26848a;
            } else if (obj instanceof org.telegram.messenger.kf) {
                charSequence = ((org.telegram.messenger.kf) obj).I;
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
        HashMap hashMap = f31206s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((entry.getValue() instanceof org.telegram.messenger.gf) && ((org.telegram.messenger.gf) entry.getValue()).d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(7.0f) + this.f31238p1;
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
                imageView.setContentDescription(org.telegram.messenger.id.M0(2131754913, null));
                return;
            case 1:
                imageView.setImageResource(2131231193);
                imageView.setContentDescription(org.telegram.messenger.id.M0(2131754914, null));
                return;
            case 2:
                imageView.setImageResource(2131231192);
                imageView.setContentDescription(org.telegram.messenger.id.M0(2131754915, null));
                return;
            default:
                return;
        }
    }

    public void setAlertKeepScreenOn(boolean z9) {
        Window window = this.f38656b.getWindow();
        if (window != null) {
            View peekDecorView = window.peekDecorView();
            if (peekDecorView != null && !peekDecorView.isAttachedToWindow()) {
                return;
            }
            if (z9) {
                window.addFlags(128);
            } else {
                window.clearFlags(128);
            }
        }
    }

    @Override
    public final void A() {
        ShutterButton shutterButton = this.f31229k0;
        if (shutterButton == null) {
            return;
        }
        boolean z9 = this.Q0;
        dt0 dt0Var = dt0.f33074a;
        dt0 dt0Var2 = dt0.f33075b;
        if (!z9) {
            if (this.P != null && shutterButton.getState() == dt0Var2) {
                o0();
                CameraController.getInstance().stopVideoRecording(this.P.getCameraSession(), false);
                shutterButton.a(dt0Var);
            }
            if (this.f31211b0) {
                d0(false);
            }
            g0(true);
            return;
        }
        if (this.P != null && shutterButton.getState() == dt0Var2) {
            shutterButton.a(dt0Var);
        }
        this.Q0 = false;
    }

    public final void A0() {
        ArrayList arrayList;
        sl slVar;
        HashMap hashMap;
        boolean z9;
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        ci ciVar = this.f38656b;
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        org.telegram.ui.ActionBar.f2 f2Var2 = ciVar.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            il ilVar = this.E;
            int childCount = ilVar.getChildCount();
            int i10 = 0;
            while (true) {
                arrayList = f31207t1;
                slVar = this.G;
                hashMap = f31206s1;
                int i11 = -1;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = ilVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    int R = RecyclerView.R(childAt);
                    if (slVar.f38020f && R > this.M0) {
                        R--;
                    }
                    if (slVar.d && this.T0 == this.U0) {
                        R--;
                    }
                    org.telegram.messenger.gf e02 = e0(R);
                    if (e02 != null && e02.M) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    q5Var.setHasSpoiler(z13);
                    if (e02 != null && e02.c()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    q5Var.setHighQuality(z14);
                    if ((f2Var2 instanceof org.telegram.ui.cn) && ciVar.Q3) {
                        if (e02 != null) {
                            i11 = arrayList.indexOf(Integer.valueOf(e02.C));
                        }
                        if (e02 != null && hashMap.containsKey(Integer.valueOf(e02.C))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        q5Var.b(i11, z16, true);
                    } else {
                        if (e02 != null && hashMap.containsKey(Integer.valueOf(e02.C))) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        q5Var.b(-1, z15, true);
                    }
                }
                i10++;
            }
            il ilVar2 = this.f31240r;
            int childCount2 = ilVar2.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = ilVar2.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (slVar.f38020f && R2 > this.M0) {
                        R2--;
                    }
                    if (slVar.d && this.T0 == this.U0) {
                        R2--;
                    }
                    org.telegram.messenger.gf e03 = e0(R2);
                    if (e03 != null && e03.M) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    q5Var2.setHasSpoiler(z9);
                    if (e03 != null && e03.c()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q5Var2.setHighQuality(z10);
                    if ((f2Var2 instanceof org.telegram.ui.cn) && ciVar.Q3) {
                        if (e03 != null) {
                            i7 = arrayList.indexOf(Integer.valueOf(e03.C));
                        } else {
                            i7 = -1;
                        }
                        if (e03 != null && hashMap.containsKey(Integer.valueOf(e03.C))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        q5Var2.b(i7, z12, true);
                    } else {
                        if (e03 != null && hashMap.containsKey(Integer.valueOf(e03.C))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        q5Var2.b(-1, z11, true);
                    }
                }
            }
        }
    }

    @Override
    public final void B(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.B(int, int):void");
    }

    public final void B0(boolean z9) {
        boolean z10;
        TextView textView = this.f31237p0;
        if (textView != null) {
            ci ciVar = this.f38656b;
            int i7 = ciVar.N2;
            TextView textView2 = ciVar.f32609g3;
            if (i7 == 0 && !ciVar.Q2 && !ciVar.B1) {
                HashMap hashMap = f31206s1;
                Iterator it = hashMap.entrySet().iterator();
                int i10 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((org.telegram.messenger.gf) ((Map.Entry) it.next()).getValue()).f26849b) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    if (z11 && z12) {
                        break;
                    }
                }
                int max = Math.max(1, hashMap.size());
                if (z11 && z12) {
                    textView.setText(org.telegram.messenger.id.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                    if (max != this.M || z9) {
                        textView2.setText(org.telegram.messenger.id.G(max, "MediaSelected", new Object[0]));
                    }
                } else if (z11) {
                    textView.setText(org.telegram.messenger.id.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                    if (max != this.M || z9) {
                        textView2.setText(org.telegram.messenger.id.G(max, "VideosSelected", new Object[0]));
                    }
                } else {
                    textView.setText(org.telegram.messenger.id.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                    if (max != this.M || z9) {
                        textView2.setText(org.telegram.messenger.id.G(max, "PhotosSelected", new Object[0]));
                    }
                }
                if (max <= 1) {
                    z10 = false;
                }
                ciVar.G1 = z10;
                ciVar.j3.setVisibility((!z10 || ciVar.N2 == 2) ? 8 : 8);
                this.M = max;
            }
        }
    }

    @Override
    public final void C() {
        ci ciVar = this.f38656b;
        if (ciVar.isShowing() && !ciVar.I && !PhotoViewer.p1().P1()) {
            W(false);
        }
    }

    @Override
    public final void D(int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.D(int):void");
    }

    @Override
    public final boolean G(int i7) {
        if (this.f31211b0) {
            if (i7 == 24 || i7 == 25 || i7 == 79 || i7 == 85) {
                ((gl) this.f31229k0.getDelegate()).a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void H(uh uhVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f31236o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f31249x.setVisibility(0);
        boolean z9 = uhVar instanceof am;
        TextView textView = this.f31251y;
        if (!z9) {
            c0();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(wq.f40049j);
            this.f31236o1 = interpolator;
            interpolator.start();
        }
        this.f38656b.U2.setTitle("");
        this.F.h1(0, 0);
        if (z9) {
            this.E.post(new org.telegram.ui.fq(25, this, uhVar));
        }
        X();
        p0();
    }

    @Override
    public final void I() {
        this.N = false;
        pl plVar = this.P;
        if (plVar != null) {
            plVar.setVisibility(0);
        }
        if (this.f31245u0) {
            this.f31245u0 = false;
            W(true);
        }
    }

    @Override
    public final void J() {
        this.E.y0(0);
    }

    public final int S(org.telegram.messenger.gf gfVar, int i7) {
        boolean z9;
        Integer valueOf = Integer.valueOf(gfVar.C);
        HashMap hashMap = f31206s1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = f31207t1;
        if (containsKey) {
            gfVar.N = 0L;
            gfVar.M = false;
            gfVar.O = null;
            gfVar.f26870z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            B0(false);
            z0();
            if (i7 >= 0) {
                gfVar.e();
                this.f31224h1.X(i7);
            }
            return indexOf;
        }
        gfVar.N = getStarsPrice();
        if (getStarsPrice() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        gfVar.M = z9;
        gfVar.R = false;
        if (f0()) {
            gfVar.O = Boolean.valueOf(!U());
        }
        gfVar.f26870z = Boolean.valueOf(gfVar.c());
        boolean Z = Z(true);
        hashMap.put(valueOf, gfVar);
        arrayList.add(valueOf);
        if (Z) {
            A0();
            return -1;
        }
        B0(true);
        return -1;
    }

    public final void T() {
        pl plVar = this.P;
        if (plVar != null) {
            if (!this.f31211b0) {
                plVar.setTranslationX(this.U[0]);
            }
            int i7 = this.K0;
            int L = org.telegram.messenger.g0.L(2.0f) + (i7 * 2);
            if (!this.f31211b0) {
                this.P.setClipTop((int) this.W);
                this.P.setClipBottom((int) this.f31209a0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                if (layoutParams.height != L || layoutParams.width != i7) {
                    layoutParams.width = i7;
                    layoutParams.height = L;
                    this.P.setLayoutParams(layoutParams);
                    org.telegram.messenger.g0.h3(new org.telegram.ui.fq(26, this, layoutParams));
                }
            }
        }
    }

    public final void W(boolean z9) {
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z10;
        sl slVar;
        ci ciVar = this.f38656b;
        boolean z11 = ciVar.P1;
        org.telegram.ui.ActionBar.f2 f2Var2 = ciVar.Z1;
        if (!z11 && this.f31233n) {
            boolean z12 = this.N0;
            boolean z13 = this.O0;
            if (f2Var2 == null) {
                f2Var = LaunchActivity.Q();
            } else {
                f2Var = f2Var2;
            }
            if (f2Var != null && f2Var.getParentActivity() != null) {
                if (!org.telegram.messenger.iz.f23456y0) {
                    this.N0 = false;
                } else {
                    if (f2Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.O0 = z10;
                    if (z10) {
                        if (z9) {
                            try {
                                f2Var2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                            } catch (Exception unused) {
                            }
                        }
                        this.N0 = false;
                    } else {
                        if (z9 || org.telegram.messenger.iz.P0) {
                            CameraController.getInstance().initCamera(null);
                        }
                        this.N0 = CameraController.getInstance().isCameraInitied();
                    }
                }
                if ((z12 != this.N0 || z13 != this.O0) && (slVar = this.G) != null) {
                    slVar.f();
                }
                if (!ciVar.P1 && ciVar.isShowing() && this.N0 && ((Paint) ciVar.Y.f28616b).getAlpha() != 0 && !this.f31211b0) {
                    v0();
                }
            }
        }
    }

    public final void X() {
        v4.d1 K;
        float[] fArr;
        int i7;
        float f10;
        int systemWindowInsetTop;
        if (!PhotoViewer.A1() || PhotoViewer.p1().f41472o5 == null || !PhotoViewer.p1().f41472o5.V) {
            pl plVar = this.P;
            if (plVar != null) {
                plVar.invalidateOutline();
            }
            il ilVar = this.E;
            v4.d1 K2 = ilVar.K(this.M0 - 1);
            if (K2 != null) {
                K2.f57052a.invalidateOutline();
            }
            if ((!this.G.d || !this.N0 || this.T0 != this.U0) && (K = ilVar.K(0)) != null) {
                K.f57052a.invalidateOutline();
            }
            pl plVar2 = this.P;
            if (plVar2 != null) {
                plVar2.invalidate();
            }
            nl nlVar = this.R;
            if (nlVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nlVar.getLayoutParams();
                if (getRootWindowInsets() == null) {
                    systemWindowInsetTop = org.telegram.messenger.g0.L(16.0f);
                } else {
                    systemWindowInsetTop = getRootWindowInsets().getSystemWindowInsetTop() + org.telegram.messenger.g0.L(2.0f);
                }
                marginLayoutParams.topMargin = systemWindowInsetTop;
            }
            if (!this.N0) {
                return;
            }
            int childCount = ilVar.getChildCount();
            int i10 = 0;
            while (true) {
                fArr = this.U;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = ilVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.k5) {
                    if (childAt.isAttachedToWindow()) {
                        float y10 = getY() + ilVar.getY() + childAt.getY();
                        ci ciVar = this.f38656b;
                        ViewGroup viewGroup = ciVar.f28672b;
                        dh dhVar = ciVar.f32661v3;
                        bi.x5 x5Var = ciVar.L2;
                        float y11 = viewGroup.getY() + y10;
                        float x10 = (ciVar.f28672b.getX() + (getX() + (ilVar.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                        if (!ciVar.f32591a2) {
                            i7 = org.telegram.messenger.g0.f22561m;
                        } else {
                            i7 = 0;
                        }
                        float alpha = (x5Var.getAlpha() * x5Var.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i7;
                        fi.i iVar = ciVar.B4;
                        if (iVar != null && iVar.g()) {
                            alpha = Math.max(alpha, (ciVar.B4.e() + ciVar.B4.getY()) - ciVar.f32616i4);
                        }
                        if (y10 < alpha) {
                            f10 = alpha - y10;
                        } else {
                            f10 = 0.0f;
                        }
                        if (f10 != this.W) {
                            this.W = f10;
                            pl plVar3 = this.P;
                            if (plVar3 != null) {
                                plVar3.invalidateOutline();
                                this.P.invalidate();
                            }
                        }
                        float translationY = (int) (dhVar.getTranslationY() + (ciVar.f28672b.getMeasuredHeight() - dhVar.getMeasuredHeight()));
                        fi.i iVar2 = ciVar.B4;
                        if (iVar2 != null) {
                            translationY -= iVar2.d() - org.telegram.messenger.g0.L(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y10 > translationY) {
                            this.f31209a0 = Math.min(-org.telegram.messenger.g0.L(5.0f), y10 - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.f31209a0 = 0.0f;
                        }
                        fArr[0] = x10;
                        fArr[1] = y11;
                        T();
                        return;
                    }
                } else {
                    i10++;
                }
            }
            if (this.W != 0.0f) {
                this.W = 0.0f;
                pl plVar4 = this.P;
                if (plVar4 != null) {
                    plVar4.invalidateOutline();
                    this.P.invalidate();
                }
            }
            fArr[0] = org.telegram.messenger.g0.L(-400.0f);
            fArr[1] = 0.0f;
            T();
        }
    }

    public final boolean Z(boolean z9) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            HashMap hashMap = f31206s1;
            if (hashMap.size() <= 10 - (z9 ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = f31207t1;
            if (arrayList.isEmpty()) {
                break;
            }
            Object obj = hashMap.get(arrayList.get(0));
            if (!(obj instanceof org.telegram.messenger.gf)) {
                break;
            }
            S((org.telegram.messenger.gf) obj, -1);
            z10 = true;
        }
        return z10;
    }

    @Override
    public final void a(CharSequence charSequence) {
        org.telegram.messenger.gf gfVar;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = f31207t1;
            if (i7 < arrayList.size()) {
                if (i7 == 0) {
                    Object obj = arrayList.get(i7);
                    HashMap hashMap = f31206s1;
                    Object obj2 = hashMap.get(obj);
                    if (obj2 instanceof org.telegram.messenger.gf) {
                        org.telegram.messenger.gf clone = ((org.telegram.messenger.gf) obj2).clone();
                        CharSequence[] charSequenceArr = {charSequence};
                        clone.f26859n = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24474s0).W(charSequenceArr, false, true);
                        clone.f26848a = charSequenceArr[0];
                        gfVar = clone;
                    } else {
                        boolean z9 = obj2 instanceof org.telegram.messenger.kf;
                        gfVar = obj2;
                        if (z9) {
                            org.telegram.messenger.kf clone2 = ((org.telegram.messenger.kf) obj2).clone();
                            CharSequence[] charSequenceArr2 = {charSequence};
                            clone2.f26859n = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24474s0).W(charSequenceArr2, false, true);
                            clone2.I = charSequenceArr2[0];
                            gfVar = clone2;
                        }
                    }
                    hashMap.put(obj, gfVar);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean a0(org.telegram.messenger.gf gfVar) {
        boolean z9 = this.f31248w0;
        org.telegram.ui.ActionBar.h6 h6Var = this.f38655a;
        ci ciVar = this.f38656b;
        if (!z9 && gfVar.f26849b) {
            if (!ciVar.N0()) {
                org.telegram.messenger.k5.p(null, 2131749538, new gc(ciVar.f32634o3, h6Var), null);
                return true;
            }
        } else if (!this.f31250x0 && !gfVar.f26849b) {
            if (!ciVar.N0()) {
                org.telegram.messenger.k5.p(null, 2131749542, new gc(ciVar.f32634o3, h6Var), null);
                return true;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b() {
        return !this.f31211b0;
    }

    public final void b0() {
        if (this.P0) {
            boolean h02 = h0();
            this.P0 = h02;
            if (!h02) {
                i0();
            }
            this.G.f();
            this.f31247w.f();
        }
    }

    @Override
    public final boolean c() {
        for (Map.Entry entry : f31206s1.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof org.telegram.messenger.gf) {
                if (((org.telegram.messenger.gf) value).f26868x != 0) {
                    return false;
                }
            } else if ((value instanceof org.telegram.messenger.kf) && ((org.telegram.messenger.kf) value).f26868x != 0) {
                return false;
            }
        }
        return true;
    }

    public final void c0() {
        String M0 = org.telegram.messenger.id.M0(2131751154, null);
        org.telegram.ui.ActionBar.z0 z0Var = this.Y0;
        z0Var.setText(M0);
        z0Var.setAnimatedIcon(2131624131);
        this.f38656b.X2.S(1);
        HashMap hashMap = f31206s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((org.telegram.messenger.gf) entry.getValue()).e();
            }
            hashMap.clear();
            f31207t1.clear();
        }
        ArrayList arrayList = f31205r1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList.get(i7);
                new File(gfVar.I).delete();
                if (gfVar.h != null) {
                    new File(gfVar.h).delete();
                }
                if (gfVar.f26850c != null) {
                    new File(gfVar.f26850c).delete();
                }
            }
            arrayList.clear();
        }
        this.G.f();
        this.f31247w.f();
    }

    @Override
    public final void d() {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z9 = this.f31218e1;
        if (z9) {
            i7 = org.telegram.ui.ActionBar.m6.Vg;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f27998j5;
        }
        int i13 = org.telegram.ui.ActionBar.m6.f27873c7;
        org.telegram.ui.ActionBar.h6 h6Var = this.f38655a;
        this.H.setTextColor(org.telegram.ui.ActionBar.m6.w0(i13, h6Var));
        int i14 = org.telegram.ui.ActionBar.m6.A5;
        il ilVar = this.E;
        org.telegram.ui.ActionBar.t6.H(ilVar, i14, h6Var);
        ilVar.K(0);
        org.telegram.ui.ActionBar.t6.U(this.f31251y, i7, h6Var);
        if (z9) {
            i10 = org.telegram.ui.ActionBar.m6.Vg;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.E8;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        fi.w2 w2Var = this.f31249x;
        w2Var.O(w02, false);
        if (z9) {
            i11 = org.telegram.ui.ActionBar.m6.Vg;
        } else {
            i11 = org.telegram.ui.ActionBar.m6.E8;
        }
        w2Var.O(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), true);
        if (z9) {
            i12 = org.telegram.ui.ActionBar.m6.Xg;
        } else {
            i12 = org.telegram.ui.ActionBar.m6.G8;
        }
        w2Var.H(org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), this.D);
    }

    public final void d0(boolean z9) {
        boolean z10;
        pl plVar;
        if (!this.f31243s0 && this.P != null) {
            int i7 = this.K0;
            int[] iArr = this.f31219f0;
            iArr[1] = i7;
            iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i7 * 2);
            Runnable runnable = this.f31234n0;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f31234n0 = null;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, this.f38655a)) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.n3(this.f38656b, z10);
            TextView textView = this.f31237p0;
            il ilVar = this.f31240r;
            bi.e5 e5Var = this.f31227j0;
            il ilVar2 = this.E;
            ImageView[] imageViewArr = this.S;
            r71 r71Var = this.f31231l0;
            if (z9) {
                this.f31228j1 = this.P.getTranslationY();
                this.f31215d0 = true;
                if (ilVar2 != null) {
                    ilVar2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(e5Var, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(r71Var, property, 0.0f));
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
                this.f31220f1.d();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(wq.f40046f);
                animatorSet.addListener(new hl(this, 3));
                animatorSet.start();
            } else {
                this.f31226i1 = false;
                setAlertKeepScreenOn(false);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                e5Var.setAlpha(0.0f);
                e5Var.setVisibility(8);
                r71Var.setAlpha(0.0f);
                r71Var.setTag(null);
                r71Var.setVisibility(8);
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
                this.f31211b0 = false;
                pl plVar2 = this.P;
                if (plVar2 != null) {
                    plVar2.setFpsLimit(30);
                    this.P.setSystemUiVisibility(1024);
                }
                if (ilVar2 != null) {
                    ilVar2.invalidate();
                }
            }
            pl plVar3 = this.P;
            if (plVar3 != null) {
                plVar3.setImportantForAccessibility(0);
            }
            ilVar2.setImportantForAccessibility(0);
            if (!org.telegram.messenger.sc.e(360928) && (plVar = this.P) != null) {
                plVar.showTexture(false, z9);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ci ciVar;
        if (i7 == org.telegram.messenger.qs.f25070r2) {
            sl slVar = this.G;
            if (slVar != null) {
                if (t0()) {
                    this.U0 = MediaController.Z1;
                } else {
                    this.U0 = MediaController.f21249a2;
                }
                if (this.T0 != null && ((ciVar = this.f38656b) == null || !ciVar.A1)) {
                    if (t0()) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= MediaController.f21250b2.size()) {
                                break;
                            }
                            org.telegram.messenger.we weVar = (org.telegram.messenger.we) MediaController.f21250b2.get(i11);
                            int i12 = weVar.f26301a;
                            org.telegram.messenger.we weVar2 = this.T0;
                            if (i12 == weVar2.f26301a && weVar.f26302b == weVar2.f26302b) {
                                this.T0 = weVar;
                                break;
                            }
                            i11++;
                        }
                    }
                } else {
                    this.T0 = this.U0;
                }
                this.X0 = false;
                this.H.c();
                slVar.f();
                this.f31247w.f();
                ArrayList arrayList = f31207t1;
                if (!arrayList.isEmpty() && this.U0 != null) {
                    int size = arrayList.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        Integer num = (Integer) arrayList.get(i13);
                        HashMap hashMap = f31206s1;
                        Object obj = hashMap.get(num);
                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.U0.f26305f.get(num.intValue());
                        if (gfVar != null) {
                            if (obj instanceof org.telegram.messenger.gf) {
                                gfVar.g((org.telegram.messenger.gf) obj);
                            }
                            hashMap.put(num, gfVar);
                        }
                    }
                }
                x0();
            }
        } else if (i7 == org.telegram.messenger.qs.f25038l4) {
            W(false);
        }
    }

    public final org.telegram.messenger.gf e0(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = f31205r1;
        int size = arrayList.size();
        if (i7 < size) {
            return (org.telegram.messenger.gf) arrayList.get(i7);
        }
        int i10 = i7 - size;
        org.telegram.messenger.we weVar = this.T0;
        if (weVar == null || i10 >= weVar.f26304e.size()) {
            return null;
        }
        return (org.telegram.messenger.gf) this.T0.f26304e.get(i10);
    }

    public final void g0(boolean z9) {
        if (this.N0 && this.P != null) {
            q0();
            this.Q.i();
            this.P.destroy(z9, null);
            AnimatorSet animatorSet = this.O;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.O = null;
            }
            org.telegram.messenger.g0.i3(new bl(this, 0), 300L);
            this.f31213c0 = false;
        }
    }

    public ArrayList<Object> getAllPhotosArray() {
        org.telegram.messenger.we weVar = this.T0;
        ArrayList<Object> arrayList = f31205r1;
        if (weVar != null) {
            if (!arrayList.isEmpty()) {
                ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.T0.f26304e.size());
                arrayList2.addAll(arrayList);
                arrayList2.addAll(this.T0.f26304e);
                return arrayList2;
            }
            return this.T0.f26304e;
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
        return this.f31217e0;
    }

    @Override
    public int getCurrentItemTop() {
        il ilVar = this.E;
        int childCount = ilVar.getChildCount();
        iy iyVar = this.H;
        if (childCount <= 0) {
            ilVar.setTopGlowOffset(ilVar.getPaddingTop());
            iyVar.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = ilVar.getChildAt(0);
        xi0 xi0Var = (xi0) ilVar.G(childAt);
        int top = childAt.getTop() - this.f31238p1;
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || xi0Var == null || xi0Var.b() != 0) {
            top = L;
        }
        iyVar.setTranslationY(((((getMeasuredHeight() - top) - org.telegram.messenger.g0.L(50.0f)) - iyVar.getMeasuredHeight()) / 2.0f) + top);
        ilVar.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.E.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return f31207t1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return f31206s1;
    }

    public int getSelectedPhotosCount() {
        int i7 = 0;
        for (Object obj : f31206s1.values()) {
            if (obj instanceof org.telegram.messenger.gf) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                if (!gfVar.f26849b && gfVar.f26864s == null) {
                    i7++;
                }
            }
        }
        return i7;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i7 = 0;
        for (Object obj : f31206s1.values()) {
            if (obj instanceof org.telegram.messenger.gf) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                if (gfVar.c() && !gfVar.f26849b && gfVar.f26864s == null) {
                    i7++;
                }
            }
        }
        return i7;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return f31207t1;
    }

    public long getStarsPrice() {
        Iterator it = f31206s1.entrySet().iterator();
        if (it.hasNext()) {
            return ((org.telegram.messenger.gf) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    public final boolean h0() {
        Activity W = org.telegram.messenger.g0.W(getContext());
        if (W == null) {
            W = this.f38656b.Z1.getParentActivity();
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
        org.telegram.messenger.we weVar;
        if (t0()) {
            weVar = MediaController.Z1;
        } else {
            weVar = MediaController.f21249a2;
        }
        if (weVar == null) {
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

    public final void k0(boolean z9) {
        pl plVar;
        pl plVar2 = this.P;
        if (plVar2 != null && this.O == null) {
            ci ciVar = this.f38656b;
            if (!ciVar.I) {
                plVar2.initTexture();
                boolean t02 = t0();
                TextView textView = this.f31239q0;
                int i7 = 0;
                if (t02) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = f31205r1.isEmpty();
                il ilVar = this.f31240r;
                TextView textView2 = this.f31237p0;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    ilVar.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    ilVar.setVisibility(0);
                }
                if (ciVar.a1().f35441w && isFocusable()) {
                    ciVar.a1().d();
                }
                r71 r71Var = this.f31231l0;
                r71Var.setVisibility(0);
                r71Var.setAlpha(0.0f);
                bi.e5 e5Var = this.f31227j0;
                e5Var.setVisibility(0);
                e5Var.setTag(null);
                int[] iArr = this.f31219f0;
                iArr[0] = 0;
                int i10 = this.K0;
                iArr[1] = i10;
                iArr[2] = org.telegram.messenger.g0.L(2.0f) + (i10 * 2);
                this.f31228j1 = 0.0f;
                this.f31226i1 = true;
                pl plVar3 = this.P;
                if (plVar3 != null) {
                    plVar3.setFpsLimit(-1);
                }
                org.telegram.messenger.g0.v1(this);
                org.telegram.messenger.g0.n3(ciVar, false);
                setAlertKeepScreenOn(true);
                il ilVar2 = this.E;
                ImageView[] imageViewArr = this.S;
                if (z9) {
                    setCameraOpenProgress(0.0f);
                    this.f31215d0 = true;
                    if (ilVar2 != null) {
                        ilVar2.invalidate();
                    }
                    this.f31220f1.d();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(e5Var, property, 1.0f));
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
                    animatorSet.setInterpolator(wq.f40046f);
                    animatorSet.addListener(new hl(this, 2));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    e5Var.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    ilVar.setAlpha(1.0f);
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
                    ciVar.W3.F0();
                    pl plVar4 = this.P;
                    if (plVar4 != null) {
                        plVar4.setSystemUiVisibility(1028);
                    }
                }
                this.f31211b0 = true;
                pl plVar5 = this.P;
                if (plVar5 != null) {
                    plVar5.setImportantForAccessibility(2);
                }
                ilVar2.setImportantForAccessibility(4);
                ilVar2.invalidate();
                if (!org.telegram.messenger.sc.e(360928) && (plVar = this.P) != null && plVar.isInited()) {
                    this.P.showTexture(true, z9);
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
        if (org.telegram.messenger.iz.f23456y0) {
            k0(true);
            return;
        }
        ci ciVar = this.f38656b;
        ai aiVar = ciVar.W3;
        if (aiVar != null) {
            aiVar.o1(0, false, true, 0, 0, 0L, ciVar.f1(), false, 0L);
        }
    }

    @Override
    public final void m(float f10) {
        this.W0 = f10;
        X();
        pl plVar = this.P;
        if (plVar != null) {
            plVar.invalidateOutline();
            this.P.invalidate();
        }
        invalidate();
    }

    public final void m0(org.telegram.messenger.gf gfVar, boolean z9, boolean z10) {
        int i7;
        org.telegram.ui.cn cnVar;
        org.telegram.ui.cn cnVar2;
        ArrayList<Object> arrayList;
        int i10;
        ArrayList arrayList2 = f31205r1;
        ci ciVar = this.f38656b;
        if (gfVar != null) {
            int i11 = gfVar.C;
            arrayList2.add(gfVar);
            f31206s1.put(Integer.valueOf(i11), gfVar);
            f31207t1.add(Integer.valueOf(i11));
            ciVar.K1(0);
            this.G.f();
            this.f31247w.f();
        }
        if (gfVar != null && !z10 && arrayList2.size() > 1) {
            B0(false);
            if (this.P != null) {
                this.f31231l0.b(false, 0.0f);
                this.B0 = 0.0f;
                this.P.setZoom(0.0f);
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } else if (!arrayList2.isEmpty()) {
            this.f31244t0 = true;
            org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
            org.telegram.ui.ActionBar.f2 f2Var2 = ciVar.Z1;
            if (f2Var == null) {
                f2Var = LaunchActivity.Q();
            }
            if (f2Var != null) {
                PhotoViewer.p1().H2(f2Var.getParentActivity(), null, this.f38655a);
                PhotoViewer.p1().I2(ciVar);
                PhotoViewer p12 = PhotoViewer.p1();
                int i12 = ciVar.P3;
                boolean z11 = ciVar.Q3;
                p12.h = i12;
                p12.f41459n = z11;
                if (ciVar.f32675z1 && ciVar.A1) {
                    cnVar = (org.telegram.ui.cn) f2Var2;
                    i7 = 11;
                } else {
                    if (ciVar.N2 != 0) {
                        i7 = 1;
                    } else if (f2Var2 instanceof org.telegram.ui.cn) {
                        cnVar = (org.telegram.ui.cn) f2Var2;
                        i7 = 2;
                    } else {
                        i7 = 5;
                    }
                    cnVar = null;
                }
                boolean z12 = ciVar.B1;
                if (z12) {
                    i7 = 13;
                    cnVar2 = null;
                } else {
                    cnVar2 = cnVar;
                }
                int i13 = i7;
                if (ciVar.N2 == 0 && !z12) {
                    arrayList = getAllPhotosArray();
                    i10 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(gfVar);
                    i10 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                h30 h30Var = ciVar.K1;
                if (h30Var != null && gfVar != null) {
                    h30Var.f34153e = gfVar.f26849b;
                }
                PhotoViewer.p1().e2(arrayList3, i10, i13, false, new jl(this, z9), cnVar2);
                PhotoViewer.p1().u2(ciVar.K1);
                if (ciVar.A1) {
                    PhotoViewer.p1().S0(null, null, false, ciVar.D1);
                    PhotoViewer.p1().j2();
                }
            }
        }
    }

    public final void n0() {
        try {
            if (this.P != null) {
                CameraController.getInstance().stopPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean o(MotionEvent motionEvent) {
        pl plVar;
        if (!this.f31215d0) {
            if (this.f31211b0 && motionEvent != null) {
                boolean z9 = this.G0;
                r71 r71Var = this.f31231l0;
                if ((!z9 && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.E0;
                    r71Var.getHitRect(rect);
                    if (r71Var.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.f31243s0 && !this.I0) {
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
                    il ilVar = this.f31240r;
                    TextView textView = this.f31237p0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.S;
                    bi.e5 e5Var = this.f31227j0;
                    if (actionMasked == 2) {
                        if (this.C0 && motionEvent.getPointerCount() == 2 && !this.I0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (!this.D0) {
                                if (Math.abs(hypot - this.A0) >= org.telegram.messenger.g0.a1(false, 0.4f)) {
                                    this.A0 = hypot;
                                    this.D0 = true;
                                    return true;
                                }
                            } else if (this.P != null) {
                                this.A0 = hypot;
                                float L = this.B0 + ((hypot - this.A0) / org.telegram.messenger.g0.L(100.0f));
                                this.B0 = L;
                                if (L < 0.0f) {
                                    this.B0 = 0.0f;
                                } else if (L > 1.0f) {
                                    this.B0 = 1.0f;
                                }
                                r71Var.b(false, this.B0);
                                this.f38656b.f28672b.invalidate();
                                this.P.setZoom(this.B0);
                                w0(true);
                                return true;
                            }
                        } else {
                            float y10 = motionEvent.getY();
                            float f10 = y10 - this.F0;
                            if (this.H0) {
                                if (Math.abs(f10) > org.telegram.messenger.g0.a1(false, 0.4f)) {
                                    this.H0 = false;
                                    this.I0 = true;
                                    return true;
                                }
                            } else if (this.I0 && (plVar = this.P) != null) {
                                plVar.setTranslationY(plVar.getTranslationY() + f10);
                                this.F0 = y10;
                                r71Var.setTag(null);
                                Runnable runnable = this.f31234n0;
                                if (runnable != null) {
                                    org.telegram.messenger.g0.r(runnable);
                                    this.f31234n0 = null;
                                }
                                if (e5Var.getTag() == null) {
                                    e5Var.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(e5Var, property, 0.0f), ObjectAnimator.ofFloat(r71Var, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(ilVar, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(wq.f40046f);
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
                            pl plVar2 = this.P;
                            if (plVar2 != null) {
                                if (Math.abs(plVar2.getTranslationY()) > this.P.getMeasuredHeight() / 6.0f) {
                                    d0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.P, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(e5Var, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(ilVar, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.f31225i0);
                                animatorSet2.start();
                                e5Var.setTag(null);
                                return true;
                            }
                        } else {
                            pl plVar3 = this.P;
                            if (plVar3 != null && !this.D0) {
                                int[] iArr = this.V;
                                plVar3.getLocationOnScreen(iArr);
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

    public final void o0() {
        if (this.f38656b.P1) {
            return;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            this.S[i7].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(wq.f40046f).start();
        }
        ViewPropertyAnimator duration = this.f31241r0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        wq wqVar = wq.f40046f;
        duration.setInterpolator(wqVar).start();
        this.f31239q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(wqVar).start();
        org.telegram.messenger.g0.X3(this.R, false);
        org.telegram.messenger.g0.r(this.f31223h0);
        this.f31223h0 = null;
        org.telegram.messenger.g0.Q3(org.telegram.messenger.g0.W(getContext()));
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        if (this.S0 != i13) {
            this.S0 = i13;
            sl slVar = this.G;
            if (slVar != null) {
                slVar.f();
            }
        }
        super.onLayout(z9, i7, i10, i11, i12);
        X();
    }

    @Override
    public final void p() {
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25038l4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25070r2);
    }

    public final void p0() {
        try {
            W(false);
            if (this.P != null) {
                CameraController.getInstance().startPreview(this.P.getCameraSessionObject());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean q() {
        if (this.f31215d0) {
            return true;
        }
        if (this.f31211b0) {
            d0(true);
            return true;
        }
        g0(true);
        return false;
    }

    public final void q0() {
        if (this.f31213c0) {
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
        boolean z9;
        if (i7 != 0 && i7 != 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        g0(z9);
    }

    @Override
    public final void requestLayout() {
        if (this.R0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(int i7, final boolean z9) {
        PhotoViewer p12 = PhotoViewer.p1();
        if (i7 == -1) {
            i7 = p12.O4;
        }
        ArrayList arrayList = p12.f41399f7;
        if (arrayList != null && !arrayList.isEmpty() && i7 < arrayList.size() && (arrayList.get(i7) instanceof org.telegram.messenger.gf) && ((org.telegram.messenger.gf) arrayList.get(i7)).M) {
            final org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList.get(i7);
            this.E.M(new q0.a() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z10 = ChatAttachAlertPhotoLayout.f31204q1;
                    if (view instanceof org.telegram.ui.Cells.q5) {
                        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                        if (q5Var.getPhotoEntry() == gfVar) {
                            q5Var.c(z9, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z11 = true;
                            if (ChatAttachAlertPhotoLayout.f31206s1.size() <= 1) {
                                z11 = false;
                            }
                            q5Var.f(starsPrice, z11);
                        }
                    }
                }
            });
        }
    }

    public void setCameraOpenProgress(float f10) {
        int i7;
        int i10;
        if (this.P == null) {
            return;
        }
        this.f31217e0 = f10;
        int[] iArr = this.f31219f0;
        float f11 = iArr[1];
        float f12 = iArr[2];
        int i11 = org.telegram.messenger.g0.f22567q.x;
        ci ciVar = this.f38656b;
        float width = ciVar.f28675c.getWidth();
        float height = ciVar.f28675c.getHeight();
        float[] fArr = this.U;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = this.f31228j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
        float textureHeight = this.P.getTextureHeight(f11, f12) / this.P.getTextureHeight(width, height);
        float f16 = f12 / height;
        float f17 = f11 / width;
        if (this.f31226i1) {
            i7 = (int) width;
            i10 = (int) height;
            float f18 = 1.0f - f10;
            float f19 = (textureHeight * f18) + f10;
            this.P.getTextureView().setScaleX(f19);
            this.P.getTextureView().setScaleY(f19);
            float f20 = f13 * f18;
            this.P.setTranslationX(((0.0f * f10) + f20) - (((1.0f - ((f17 * f18) + f10)) * width) / 2.0f));
            float f21 = f14 * f18;
            this.P.setTranslationY(((f15 * f10) + f21) - (((1.0f - ((f16 * f18) + f10)) * height) / 2.0f));
            this.f31230k1 = f21 - this.P.getTranslationY();
            this.l1 = (height * f10) + (((f14 + f12) * f18) - this.P.getTranslationY());
            this.n1 = f20 - this.P.getTranslationX();
            this.f31232m1 = (width * f10) + (((f13 + f11) * f18) - this.P.getTranslationX());
        } else {
            i7 = (int) f11;
            i10 = (int) f12;
            this.P.getTextureView().setScaleX(1.0f);
            this.P.getTextureView().setScaleY(1.0f);
            this.f31230k1 = 0.0f;
            this.l1 = height;
            this.n1 = 0.0f;
            this.f31232m1 = width;
            this.P.setTranslationX(f13);
            this.P.setTranslationY(f14);
        }
        if (layoutParams.width != i7 || layoutParams.height != i10) {
            layoutParams.width = i7;
            layoutParams.height = i10;
            this.P.requestLayout();
        }
        this.P.invalidateOutline();
        this.P.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z9) {
        this.f31245u0 = z9;
    }

    public void setIncludeVideosInGallery(boolean z9) {
        this.f31252y0 = z9;
    }

    public void setStarsPrice(long j3) {
        boolean z9;
        HashMap hashMap = f31206s1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                gfVar.N = j3;
                if (j3 > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                gfVar.M = z9;
                gfVar.R = false;
            }
        }
        D(getSelectedItemsCount());
        if (Z(false)) {
            A0();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        ci ciVar = this.f38656b;
        if (ciVar.A0 == 1) {
            float f11 = (f10 / 40.0f) * (-0.1f);
            il ilVar = this.E;
            int childCount = ilVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = ilVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    float f12 = 1.0f + f11;
                    q5Var.getCheckBox().setScaleX(f12);
                    q5Var.getCheckBox().setScaleY(f12);
                }
            }
        }
        super.setTranslationY(f10);
        ciVar.f28672b.invalidate();
        invalidate();
    }

    @Override
    public final void t() {
        pl plVar = this.P;
        if (plVar != null) {
            plVar.setVisibility(8);
        }
        for (Map.Entry entry : f31206s1.entrySet()) {
            if (entry.getValue() instanceof org.telegram.messenger.gf) {
                ((org.telegram.messenger.gf) entry.getValue()).getClass();
            }
        }
        this.G.f();
    }

    public final boolean t0() {
        if (!this.f31252y0) {
            ci ciVar = this.f38656b;
            if (!ciVar.f32675z1) {
                if (!(ciVar.Z1 instanceof org.telegram.ui.cn) && !ciVar.Q2 && ciVar.N2 != 2) {
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
        this.N = true;
        il ilVar = this.E;
        int childCount = ilVar.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            } else if (ilVar.getChildAt(i7) instanceof org.telegram.ui.Cells.k5) {
                q0();
                break;
            } else {
                this.Q.i();
                i7++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f31236o1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.f31251y.animate().alpha(0.0f).setDuration(150L).setInterpolator(wq.f40049j).withEndAction(new bl(this, 3));
        this.f31236o1 = withEndAction;
        withEndAction.start();
        n0();
    }

    public final void u0(u8 u8Var, TLRPC.VideoSize videoSize, long j3) {
        boolean z9;
        ci ciVar = this.f38656b;
        s8 s8Var = new s8(ciVar.O1, ciVar.K1);
        h30 h30Var = ciVar.K1;
        if (h30Var != null && h30Var.f34152c == 2) {
            z9 = false;
        } else {
            z9 = true;
        }
        s8Var.Q = z9;
        ciVar.Z1.presentFragment(s8Var);
        if (u8Var != null) {
            s8Var.r0(u8Var);
        }
        if (videoSize != null) {
            s8Var.q0(videoSize);
        }
        if (j3 != 0) {
            s8Var.p0(j3);
        }
        s8Var.I = new e2(7, this, s8Var);
    }

    @Override
    public final void v(float f10) {
        pl plVar = this.P;
        if (plVar != null) {
            plVar.setAlpha(f10);
            int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i7 != 0 && this.P.getVisibility() != 0) {
                this.P.setVisibility(0);
            } else if (i7 == 0 && this.P.getVisibility() != 4) {
                this.P.setVisibility(4);
            }
        }
    }

    public final void v0() {
        boolean z9;
        boolean z10;
        float f10;
        ci ciVar = this.f38656b;
        if (!ciVar.f32599c4 && this.f31246v0 && CameraView.isCameraAllowed()) {
            if (this.P == null) {
                boolean z11 = !org.telegram.messenger.sc.e(360928);
                Context context = getContext();
                Boolean bool = this.f31235o0;
                if (bool != null) {
                    z9 = bool.booleanValue();
                } else {
                    z9 = ciVar.R3;
                }
                pl plVar = new pl(this, context, z9, z11);
                this.P = plVar;
                org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
                if ((f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).z()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                plVar.setRecordFile(org.telegram.messenger.g0.s0(z10));
                this.P.setFocusable(true);
                this.P.setFpsLimit(30);
                this.P.setOutlineProvider(new fh.a(this, 2));
                this.P.setClipToOutline(true);
                this.P.setContentDescription(org.telegram.messenger.id.M0(2131754852, null));
                org.telegram.ui.ActionBar.m2 m2Var = ciVar.f28675c;
                pl plVar2 = this.P;
                int i7 = this.K0;
                m2Var.addView(plVar2, 1, new FrameLayout.LayoutParams(i7, i7));
                this.P.setDelegate(new kl(this));
                pl plVar3 = this.P;
                if (this.f31246v0) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                plVar3.setAlpha(f10);
                this.P.setEnabled(this.f31246v0);
                if (this.N) {
                    this.P.setVisibility(8);
                }
                if (!this.f31211b0) {
                    X();
                }
                il ilVar = this.E;
                if (ilVar != null) {
                    ilVar.invalidate();
                }
                invalidate();
            }
            r71 r71Var = this.f31231l0;
            if (r71Var != null) {
                r71Var.b(false, 0.0f);
                this.B0 = 0.0f;
            }
            if (!this.f31211b0) {
                this.P.setTranslationX(this.U[0]);
            }
        }
    }

    @Override
    public final void w(int i7) {
        TLRPC.Chat Y0;
        boolean z9;
        boolean z10;
        boolean z11 = true;
        ci ciVar = this.f38656b;
        if (i7 == 8) {
            ciVar.v1(!ciVar.W1, true);
            this.f31216d1.a(!ciVar.W1, true);
        } else if ((i7 == 0 || i7 == 1) && ciVar.P3 > 0 && f31207t1.size() > 1 && (Y0 = ciVar.Y0()) != null && !org.telegram.messenger.t3.N(Y0) && Y0.slowmode_enabled) {
            u4.L(getContext(), org.telegram.messenger.id.M0(2131745310, null), org.telegram.messenger.id.M0(2131745302, null), null, null, this.f38655a).p();
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.f38655a;
            HashMap hashMap = f31206s1;
            if (i7 == 0) {
                org.telegram.messenger.ij ijVar = ciVar.E3;
                org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
                if (ijVar == null && (f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).c()) {
                    u4.J(getContext(), ((org.telegram.ui.cn) f2Var).a(), new xk(this, 0), h6Var);
                } else {
                    u4.X(ciVar.G3, ciVar.X0() + hashMap.size(), ciVar.b1(), new org.telegram.messenger.c20(this) {
                        public final ChatAttachAlertPhotoLayout f40591b;

                        {
                            this.f40591b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            int i10 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40591b;
                            Long l10 = (Long) obj;
                            switch (i10) {
                                case 0:
                                    boolean z12 = ChatAttachAlertPhotoLayout.f31204q1;
                                    ci ciVar2 = chatAttachAlertPhotoLayout.f38656b;
                                    ciVar2.M0();
                                    ciVar2.W3.o1(7, false, true, 0, 0, 0L, ciVar2.f1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f31204q1;
                                    ci ciVar3 = chatAttachAlertPhotoLayout.f38656b;
                                    ciVar3.M0();
                                    ciVar3.W3.o1(4, true, true, 0, 0, 0L, ciVar3.f1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i7 == 1) {
                org.telegram.messenger.ij ijVar2 = ciVar.E3;
                org.telegram.ui.ActionBar.f2 f2Var2 = ciVar.Z1;
                if (ijVar2 == null && (f2Var2 instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var2).c()) {
                    u4.J(getContext(), ((org.telegram.ui.cn) f2Var2).a(), new xk(this, 1), h6Var);
                } else {
                    u4.X(ciVar.G3, ciVar.X0() + hashMap.size(), ciVar.b1(), new org.telegram.messenger.c20(this) {
                        public final ChatAttachAlertPhotoLayout f40591b;

                        {
                            this.f40591b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            int i10 = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40591b;
                            Long l10 = (Long) obj;
                            switch (i10) {
                                case 0:
                                    boolean z12 = ChatAttachAlertPhotoLayout.f31204q1;
                                    ci ciVar2 = chatAttachAlertPhotoLayout.f38656b;
                                    ciVar2.M0();
                                    ciVar2.W3.o1(7, false, true, 0, 0, 0L, ciVar2.f1(), false, l10.longValue());
                                    return;
                                default:
                                    boolean z13 = ChatAttachAlertPhotoLayout.f31204q1;
                                    ci ciVar3 = chatAttachAlertPhotoLayout.f38656b;
                                    ciVar3.M0();
                                    ciVar3.W3.o1(4, true, true, 0, 0, 0L, ciVar3.f1(), false, l10.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                sl slVar = this.G;
                il ilVar = this.E;
                if (i7 == 3) {
                    am amVar = ciVar.f32619k2;
                    if (amVar != null) {
                        amVar.O();
                    }
                    Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((org.telegram.messenger.gf) ((Map.Entry) it.next()).getValue()).M) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    final boolean z12 = !z10;
                    org.telegram.messenger.g0.i3(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout f41043b;

                        {
                            this.f41043b = this;
                        }

                        @Override
                        public final void run() {
                            int i10;
                            int i11;
                            int i12 = r3;
                            boolean z13 = z12;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f41043b;
                            switch (i12) {
                                case 0:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f31204q1;
                                    ci ciVar2 = chatAttachAlertPhotoLayout.f38656b;
                                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.Y0;
                                    if (z13) {
                                        i10 = 2131751430;
                                    } else {
                                        i10 = 2131751154;
                                    }
                                    z0Var.setText(org.telegram.messenger.id.M0(i10, null));
                                    if (z13) {
                                        z0Var.setIcon(2131232377);
                                    } else {
                                        z0Var.setAnimatedIcon(2131624131);
                                    }
                                    if (z13) {
                                        ciVar2.X2.t(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            ciVar2.X2.t(6);
                                            return;
                                        }
                                        return;
                                    }
                                    ciVar2.X2.S(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        ciVar2.X2.S(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.z0 z0Var2 = chatAttachAlertPhotoLayout.f31210a1;
                                    if (z13) {
                                        i11 = 2131745620;
                                    } else {
                                        i11 = 2131745621;
                                    }
                                    z0Var2.setText(org.telegram.messenger.id.M0(i11, null));
                                    if (z13) {
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
                        if (entry.getValue() instanceof org.telegram.messenger.gf) {
                            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) entry.getValue();
                            gfVar.M = z12;
                            gfVar.R = false;
                            arrayList.add(Integer.valueOf(gfVar.C));
                        }
                    }
                    ilVar.M(new al(0, arrayList, z12));
                    if (ciVar.f32660v2 != this) {
                        slVar.f();
                    }
                    am amVar2 = ciVar.f32619k2;
                    if (amVar2 != null) {
                        amVar2.f31882w.invalidate();
                    }
                } else if (i7 == 2) {
                    am amVar3 = ciVar.f32619k2;
                    if (amVar3 != null) {
                        amVar3.O();
                    }
                    Iterator it2 = hashMap.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((org.telegram.messenger.gf) ((Map.Entry) it2.next()).getValue()).c()) {
                                z9 = true;
                                break;
                            }
                        } else {
                            z9 = false;
                            break;
                        }
                    }
                    final boolean z13 = !z9;
                    org.telegram.messenger.g0.i3(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout f41043b;

                        {
                            this.f41043b = this;
                        }

                        @Override
                        public final void run() {
                            int i10;
                            int i11;
                            int i12 = r3;
                            boolean z132 = z13;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f41043b;
                            switch (i12) {
                                case 0:
                                    boolean z14 = ChatAttachAlertPhotoLayout.f31204q1;
                                    ci ciVar2 = chatAttachAlertPhotoLayout.f38656b;
                                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.Y0;
                                    if (z132) {
                                        i10 = 2131751430;
                                    } else {
                                        i10 = 2131751154;
                                    }
                                    z0Var.setText(org.telegram.messenger.id.M0(i10, null));
                                    if (z132) {
                                        z0Var.setIcon(2131232377);
                                    } else {
                                        z0Var.setAnimatedIcon(2131624131);
                                    }
                                    if (z132) {
                                        ciVar2.X2.t(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            ciVar2.X2.t(6);
                                            return;
                                        }
                                        return;
                                    }
                                    ciVar2.X2.S(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        ciVar2.X2.S(6);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.z0 z0Var2 = chatAttachAlertPhotoLayout.f31210a1;
                                    if (z132) {
                                        i11 = 2131745620;
                                    } else {
                                        i11 = 2131745621;
                                    }
                                    z0Var2.setText(org.telegram.messenger.id.M0(i11, null));
                                    if (z132) {
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
                        if (entry2.getValue() instanceof org.telegram.messenger.gf) {
                            org.telegram.messenger.gf gfVar2 = (org.telegram.messenger.gf) entry2.getValue();
                            gfVar2.f26870z = Boolean.valueOf(z13);
                            gfVar2.R = false;
                            arrayList2.add(Integer.valueOf(gfVar2.C));
                        }
                    }
                    ilVar.M(new al(1, arrayList2, z13));
                    if (ciVar.f32660v2 != this) {
                        slVar.f();
                    }
                    am amVar4 = ciVar.f32619k2;
                    if (amVar4 != null) {
                        amVar4.f31882w.invalidate();
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
                            int i10 = ciVar.N2;
                            org.telegram.ui.ActionBar.f2 f2Var3 = ciVar.Z1;
                            if (i10 != 0) {
                                f2Var3.startActivityForResult(createChooser, 14);
                            } else {
                                f2Var3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            int i11 = ciVar.N2;
                            org.telegram.ui.ActionBar.f2 f2Var4 = ciVar.Z1;
                            if (i11 != 0) {
                                f2Var4.startActivityForResult(intent3, 14);
                            } else {
                                f2Var4.startActivityForResult(intent3, 1);
                            }
                        }
                        ciVar.a(true);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i7 == 7) {
                    if (ciVar.f32660v2 == ciVar.f32619k2) {
                        z11 = false;
                    }
                    ciVar.O1(z11);
                } else if (i7 == 9) {
                    bi.dd.j1(getContext(), getStarsPrice(), true, new d(this, 6), this.f38655a);
                } else if (i7 >= 10) {
                    org.telegram.messenger.we weVar = (org.telegram.messenger.we) this.V0.get(i7 - 10);
                    this.T0 = weVar;
                    org.telegram.messenger.we weVar2 = this.U0;
                    TextView textView = this.f31251y;
                    if (weVar == weVar2) {
                        textView.setText(org.telegram.messenger.id.M0(2131752238, null));
                    } else {
                        textView.setText(weVar.f26303c);
                    }
                    slVar.f();
                    this.f31247w.f();
                    this.F.h1(0, -(ilVar.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void w0(boolean z9) {
        Integer num;
        float f10;
        r71 r71Var = this.f31231l0;
        if ((r71Var.getTag() != null && z9) || (r71Var.getTag() == null && !z9)) {
            if (z9) {
                Runnable runnable = this.f31234n0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                bl blVar = new bl(this, 1);
                this.f31234n0 = blVar;
                org.telegram.messenger.g0.i3(blVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.m0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z9) {
            num = 1;
        } else {
            num = null;
        }
        r71Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m0 = animatorSet2;
        animatorSet2.setDuration(180L);
        AnimatorSet animatorSet3 = this.m0;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(r71Var, View.ALPHA, f10));
        this.m0.addListener(new hl(this, 1));
        this.m0.start();
        if (z9) {
            bl blVar2 = new bl(this, 2);
            this.f31234n0 = blVar2;
            org.telegram.messenger.g0.i3(blVar2, 2000L);
        }
    }

    @Override
    public final void x() {
        boolean z9;
        ci ciVar = this.f38656b;
        if (ciVar != null && (ciVar.Z1 instanceof org.telegram.ui.cn)) {
            z9 = true;
        } else {
            z9 = false;
        }
        W(z9);
    }

    public final void x0() {
        ArrayList arrayList;
        fi.w2 w2Var = this.f31249x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w2Var.f28430b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.f31246v0) {
            if (t0()) {
                arrayList = MediaController.f21250b2;
            } else {
                arrayList = MediaController.f21251c2;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.V0 = arrayList2;
            Collections.sort(arrayList2, new dl(arrayList, 0));
        } else {
            this.V0 = new ArrayList();
        }
        boolean isEmpty = this.V0.isEmpty();
        TextView textView = this.f31251y;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.D, (Drawable) null);
        int size = this.V0.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.we weVar = (org.telegram.messenger.we) this.V0.get(i7);
            fi.a aVar = new fi.a(getContext(), weVar.d, weVar.f26303c, weVar.f26304e.size(), this.f38655a);
            w2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.v(this, i7 + 10, 11));
        }
    }

    public final void y0() {
        il ilVar = this.E;
        if (ilVar != null) {
            for (int i7 = 0; i7 < ilVar.getChildCount(); i7++) {
                View childAt = ilVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    ((org.telegram.ui.Cells.q5) childAt).f30147a.invalidate();
                }
            }
        }
    }

    @Override
    public final void z(int i7, boolean z9) {
        X();
        pl plVar = this.P;
        if (plVar != null) {
            plVar.invalidateOutline();
            this.P.invalidate();
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (this.f38656b.Z1 instanceof org.telegram.ui.cn) {
            il ilVar = this.E;
            int childCount = ilVar.getChildCount();
            int i7 = 0;
            while (true) {
                arrayList = f31207t1;
                if (i7 >= childCount) {
                    break;
                }
                View childAt = ilVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    org.telegram.messenger.gf e02 = e0(((Integer) q5Var.getTag()).intValue());
                    if (e02 != null) {
                        q5Var.setNum(arrayList.indexOf(Integer.valueOf(e02.C)));
                    }
                }
                i7++;
            }
            il ilVar2 = this.f31240r;
            int childCount2 = ilVar2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = ilVar2.getChildAt(i10);
                if (childAt2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) childAt2;
                    org.telegram.messenger.gf e03 = e0(((Integer) q5Var2.getTag()).intValue());
                    if (e03 != null) {
                        q5Var2.setNum(arrayList.indexOf(Integer.valueOf(e03.C)));
                    }
                }
            }
        }
    }
}
