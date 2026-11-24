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
import android.text.Editable;
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
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public class ChatAttachAlertPhotoLayout extends p02 implements gk7 {
    public static boolean r1;
    public static final ArrayList s1 = new ArrayList();
    public static final HashMap t1 = new HashMap();
    public static final ArrayList u1 = new ArrayList();
    public static int v1 = -1;
    public boolean A0;
    public float B0;
    public float C0;
    public boolean D0;
    public final Drawable E;
    public boolean E0;
    public final s42 F;
    public final Rect F0;
    public final ar0 G;
    public float G0;
    public final e52 H;
    public boolean H0;
    public final g24 I;
    public boolean I0;
    public final w49 J;
    public boolean J0;
    public int K;
    public boolean K0;
    public boolean L;
    public int L0;
    public byte M;
    public int M0;
    public int N;
    public byte N0;
    public boolean O;
    public boolean O0;
    public AnimatorSet P;
    public boolean P0;
    public b52 Q;
    public boolean Q0;
    public final c52 R;
    public boolean R0;
    public final z42 S;
    public boolean S0;
    public final ImageView[] T;
    public int T0;
    public boolean U;
    public xl6 U0;
    public final float[] V;
    public xl6 V0;
    public final int[] W;
    public ArrayList W0;
    public float X0;
    public boolean Y0;
    public final a8 Z0;
    public float a0;
    public final a8 a1;
    public float b0;
    public final a8 b1;
    public boolean c0;
    public final a8 c1;
    public boolean d0;
    public final a8 d1;
    public boolean e0;
    public final k37 e1;
    public float f0;
    public final boolean f1;
    public final int[] g0;
    public final on g1;
    public int h0;
    public boolean h1;
    public p42 i0;
    public final v42 i1;
    public final DecelerateInterpolator j0;
    public boolean j1;
    public final yc k0;
    public float k1;
    public final ShutterButton l0;
    public float l1;
    public final azc m0;
    public float m1;
    public final boolean n;
    public AnimatorSet n0;
    public float n1;
    public Runnable o0;
    public float o1;
    public Boolean p0;
    public ViewPropertyAnimator p1;
    public final TextView q0;
    public int q1;
    public final s42 r;
    public final TextView r0;
    public final zr s;
    public final ImageView s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final e52 w;
    public boolean w0;
    public final w42 x;
    public boolean x0;
    public final TextView y;
    public boolean y0;
    public boolean z0;

    public ChatAttachAlertPhotoLayout(x02 x02Var, Context context, boolean z, boolean z2, wjb wjbVar) {
        super(x02Var, wjbVar, context);
        boolean z3;
        this.T = new ImageView[2];
        this.V = new float[2];
        this.W = new int[2];
        this.g0 = new int[5];
        this.j0 = new DecelerateInterpolator(1.5f);
        this.p0 = null;
        this.F0 = new Rect();
        int L = gl.L(80.0f);
        this.L0 = L;
        this.M0 = L;
        this.N0 = (byte) 3;
        this.Y0 = true;
        this.g1 = new on(null);
        this.i1 = new v42(this);
        this.f1 = z;
        this.n = z2;
        kk7.e().b(this, kk7.q2);
        kk7.e().b(this, kk7.n4);
        ww0 ww0Var = x02Var.c;
        x02 x02Var2 = this.b;
        if (x02Var2.N2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.h1 = z3;
        w42 w42Var = new w42(this, context, x02Var2.U2.t(), wjbVar, (byte) 0);
        this.x = w42Var;
        w42Var.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = nme.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = gl.m;
        this.b.U2.addView(w42Var, 0, d);
        w42Var.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                b52 b52Var;
                b52 b52Var2;
                byte b = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (b) {
                    case 0:
                        boolean z4 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.t0 && (b52Var = chatAttachAlertPhotoLayout.Q) != null && b52Var.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new r42(chatAttachAlertPhotoLayout, (byte) 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        boolean z5 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.U && (b52Var2 = chatAttachAlertPhotoLayout.Q) != null && b52Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, gl.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -gl.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(s33.f);
                                animatorSet.addListener(new i8(chatAttachAlertPhotoLayout, view, imageView));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = ChatAttachAlertPhotoLayout.r1;
                        chatAttachAlertPhotoLayout.x.U(null, null);
                        return;
                    default:
                        boolean z7 = ChatAttachAlertPhotoLayout.r1;
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
        this.y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i = bkb.i5;
        zkb.X(textView, i, wjbVar);
        textView.setText(k96.M0(2131752226, null));
        textView.setTypeface(gl.o());
        Drawable d2 = b00.d(context, 2131231256);
        this.E = d2;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.x(this, d2, i, wjbVar, mode);
        textView.setPadding(0, 0, gl.L(10.0f), 0);
        w42Var.addView(textView, nme.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        V(false);
        k37 k37Var = new k37(context, 2131624139, k96.M0(2131752548, null), 2131624138, k96.M0(2131752547, null), wjbVar);
        this.e1 = k37Var;
        k37Var.a(!this.b.W1, false);
        this.d1 = this.b.X2.e(7, 2131232425, k96.M0(2131753954, null));
        this.b.X2.a(5);
        this.b.X2.e(4, 2131232270, k96.M0(2131747603, null));
        this.a1 = this.b.X2.e(1, 2131232137, k96.M0(2131745393, null));
        this.b.X2.e(0, 2131232416, k96.M0(2131745392, null));
        this.b.X2.a(6);
        this.Z0 = this.b.X2.e(3, 2131232381, k96.M0(2131751142, null));
        this.b1 = this.b.X2.e(2, 2131231869, k96.M0(2131745429, null));
        r7 r7Var = this.b.X2;
        r7Var.q();
        k37Var.setMinimumWidth(gl.L(196.0f));
        k37Var.setTag(8);
        r7Var.b.addView(k37Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) k37Var.getLayoutParams();
        if (k96.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gl.L(48.0f);
        k37Var.setLayoutParams(layoutParams);
        k37Var.setOnClickListener(new s6(r7Var, (byte) 2));
        this.c1 = this.b.X2.e(9, 2131231813, k96.M0(2131747537, null));
        this.b.X2.setFitSubItems(true);
        s42 s42Var = new s42(this, context, wjbVar, (byte) 1);
        this.F = s42Var;
        s42Var.setFastScrollEnabled(1);
        s42Var.setFastScrollVisible(true);
        s42Var.getFastScroll().setAlpha(0.0f);
        s42Var.getFastScroll().a = false;
        s42Var.getFastScroll().i0 = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        e52 e52Var = new e52(this, context, z2);
        this.H = e52Var;
        s42Var.setAdapter(e52Var);
        c52 c52Var = new c52(this, s42Var);
        this.R = c52Var;
        s42Var.i(c52Var);
        int i2 = 0;
        for (int i3 = 8; i2 < i3; i3 = 8) {
            e52Var.h.add(e52Var.L());
            i2++;
        }
        s42Var.setClipToPadding(false);
        s42Var.setItemAnimator(null);
        s42Var.setLayoutAnimation(null);
        s42Var.setVerticalScrollBarEnabled(false);
        zkb.l(s42Var, 21, bkb.z5, wjbVar);
        addView(s42Var, nme.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        s42Var.setOnScrollListener(new x42(this, (byte) 0));
        ar0 ar0Var = new ar0(this, this.L0, (byte) 2);
        this.G = ar0Var;
        ar0Var.O = new nq1(this, (byte) 2);
        s42Var.setLayoutManager(ar0Var);
        s42Var.setOnItemClickListener(new ch(this, z2, wjbVar, (byte) 5));
        s42Var.setOnItemLongClickListener(new f42(this, (byte) 2));
        w49 w49Var = new w49(new i4d(this));
        this.J = w49Var;
        s42Var.F.add(w49Var);
        setBlur3Capture(s42Var);
        this.d = s42Var;
        this.f = true;
        g24 g24Var = new g24(context, wjbVar);
        this.I = g24Var;
        g24Var.setText(k96.M0(2131747988, null));
        g24Var.setOnTouchListener(null);
        g24Var.setTextSize(16);
        addView(g24Var, nme.c(-2.0f, -1));
        if (this.Y0) {
            g24Var.b();
        } else {
            g24Var.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        z42 z42Var = new z42(context, paint);
        this.S = z42Var;
        gl.T3(z42Var, false, 1.0f, true, false);
        z42Var.setBackgroundResource(2131232776);
        z42Var.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        z42Var.setTextSize(1, 15.0f);
        z42Var.setTypeface(gl.o());
        z42Var.setAlpha(0.0f);
        z42Var.setTextColor(-1);
        z42Var.setPadding(gl.L(24.0f), gl.L(5.0f), gl.L(10.0f), gl.L(5.0f));
        ww0Var.addView(z42Var, nme.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        yc ycVar = new yc((byte) 11, context, this);
        this.k0 = ycVar;
        ycVar.setVisibility(8);
        ycVar.setAlpha(0.0f);
        ww0Var.addView(ycVar, nme.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.q0 = textView2;
        textView2.setBackgroundResource(2131232541);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(gl.o());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131232539, 0);
        textView2.setCompoundDrawablePadding(gl.L(4.0f));
        textView2.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        ww0Var.addView(textView2, nme.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                b52 b52Var;
                b52 b52Var2;
                byte b = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (b) {
                    case 0:
                        boolean z4 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.t0 && (b52Var = chatAttachAlertPhotoLayout.Q) != null && b52Var.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new r42(chatAttachAlertPhotoLayout, (byte) 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        boolean z5 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.U && (b52Var2 = chatAttachAlertPhotoLayout.Q) != null && b52Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, gl.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -gl.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(s33.f);
                                animatorSet.addListener(new i8(chatAttachAlertPhotoLayout, view, imageView));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = ChatAttachAlertPhotoLayout.r1;
                        chatAttachAlertPhotoLayout.x.U(null, null);
                        return;
                    default:
                        boolean z7 = ChatAttachAlertPhotoLayout.r1;
                        if (chatAttachAlertPhotoLayout.Q != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                            return;
                        }
                        return;
                }
            }
        });
        azc azcVar = new azc(context);
        this.m0 = azcVar;
        azcVar.setVisibility(8);
        azcVar.setAlpha(0.0f);
        ww0Var.addView(azcVar, nme.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        azcVar.setDelegate(new f42(this, (byte) 3));
        ?? view = new View(context);
        view.b = new DecelerateInterpolator();
        view.x = new bg7(view, (byte) 29);
        view.a = view.getResources().getDrawable(2131230928);
        Paint paint2 = new Paint(1);
        view.c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f = yga.a;
        this.l0 = view;
        ycVar.addView((View) view, nme.e(84, 84, 17));
        view.setDelegate(new q42(this, wjbVar, ww0Var));
        view.setFocusable(true);
        view.setContentDescription(k96.M0(2131754759, null));
        ImageView imageView = new ImageView(context);
        this.s0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ycVar.addView(imageView, nme.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                b52 b52Var;
                b52 b52Var2;
                byte b = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (b) {
                    case 0:
                        boolean z4 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.t0 && (b52Var = chatAttachAlertPhotoLayout.Q) != null && b52Var.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new r42(chatAttachAlertPhotoLayout, (byte) 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        boolean z5 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.U && (b52Var2 = chatAttachAlertPhotoLayout.Q) != null && b52Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, gl.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -gl.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(s33.f);
                                animatorSet.addListener(new i8(chatAttachAlertPhotoLayout, view2, imageView2));
                                animatorSet.start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        boolean z6 = ChatAttachAlertPhotoLayout.r1;
                        chatAttachAlertPhotoLayout.x.U(null, null);
                        return;
                    default:
                        boolean z7 = ChatAttachAlertPhotoLayout.r1;
                        if (chatAttachAlertPhotoLayout.Q != null) {
                            chatAttachAlertPhotoLayout.m0(null, false, false);
                            CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setContentDescription(k96.M0(2131754751, null));
        for (int i4 = 0; i4 < 2; i4++) {
            this.T[i4] = new ImageView(context);
            this.T[i4].setScaleType(ImageView.ScaleType.CENTER);
            this.T[i4].setVisibility(4);
            this.k0.addView(this.T[i4], nme.e(48, 48, 51));
            this.T[i4].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    b52 b52Var;
                    b52 b52Var2;
                    byte b = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (b) {
                        case 0:
                            boolean z4 = ChatAttachAlertPhotoLayout.r1;
                            if (!chatAttachAlertPhotoLayout.t0 && (b52Var = chatAttachAlertPhotoLayout.Q) != null && b52Var.isInited()) {
                                chatAttachAlertPhotoLayout.d0 = false;
                                chatAttachAlertPhotoLayout.Q.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new r42(chatAttachAlertPhotoLayout, (byte) 0));
                                duration.start();
                                return;
                            }
                            return;
                        case 1:
                            boolean z5 = ChatAttachAlertPhotoLayout.r1;
                            if (!chatAttachAlertPhotoLayout.U && (b52Var2 = chatAttachAlertPhotoLayout.Q) != null && b52Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, gl.L(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -gl.L(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(s33.f);
                                    animatorSet.addListener(new i8(chatAttachAlertPhotoLayout, view2, imageView2));
                                    animatorSet.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        case 2:
                            boolean z6 = ChatAttachAlertPhotoLayout.r1;
                            chatAttachAlertPhotoLayout.x.U(null, null);
                            return;
                        default:
                            boolean z7 = ChatAttachAlertPhotoLayout.r1;
                            if (chatAttachAlertPhotoLayout.Q != null) {
                                chatAttachAlertPhotoLayout.m0(null, false, false);
                                CameraController.getInstance().stopPreview(chatAttachAlertPhotoLayout.Q.getCameraSessionObject());
                                return;
                            }
                            return;
                    }
                }
            });
            this.T[i4].setContentDescription("flash mode " + i4);
        }
        TextView textView3 = new TextView(context);
        this.r0 = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setText(k96.M0(2131744029, null));
        textView3.setShadowLayer(gl.L(3.33333f), 0.0f, gl.L(0.666f), 1275068416);
        textView3.setPadding(gl.L(6.0f), 0, gl.L(6.0f), 0);
        this.k0.addView(textView3, nme.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        s42 s42Var2 = new s42(this, context, wjbVar, (byte) 0);
        this.r = s42Var2;
        s42Var2.setVerticalScrollBarEnabled(true);
        e52 e52Var2 = new e52(this, context, false);
        this.w = e52Var2;
        s42Var2.setAdapter(e52Var2);
        for (int i5 = 0; i5 < 8; i5++) {
            e52Var2.h.add(e52Var2.L());
        }
        s42Var2.setClipToPadding(false);
        s42Var2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        s42Var2.setItemAnimator(null);
        s42Var2.setLayoutAnimation(null);
        s42Var2.setOverScrollMode(2);
        s42Var2.setVisibility(4);
        s42Var2.setAlpha(0.0f);
        ww0Var.addView(s42Var2, nme.c(80.0f, -1));
        zr zrVar = new zr((byte) 3, 0, false);
        this.s = zrVar;
        s42Var2.setLayoutManager(zrVar);
        s42Var2.setOnItemClickListener(new l5((byte) 2));
    }

    public static boolean T() {
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof jm6) {
                    jm6 jm6Var = (jm6) entry.getValue();
                    if (jm6Var.d() && jm6Var.j()) {
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
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = u1;
            if (i >= arrayList.size()) {
                break;
            }
            Object obj = t1.get(arrayList.get(i));
            if (obj instanceof jm6) {
                charSequence = ((jm6) obj).a;
            } else if (obj instanceof nm6) {
                charSequence = ((nm6) obj).I;
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                i2++;
            }
            i++;
        }
        if (i2 > 1) {
            return false;
        }
        return true;
    }

    public static boolean e0() {
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((entry.getValue() instanceof jm6) && ((jm6) entry.getValue()).d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gl.L(7.0f) + this.q1;
    }

    public static void r0(ImageView imageView, String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 3551:
                if (str.equals("on")) {
                    c = 0;
                    break;
                }
                break;
            case 109935:
                if (str.equals("off")) {
                    c = 1;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                imageView.setImageResource(2131231197);
                imageView.setContentDescription(k96.M0(2131754913, null));
                return;
            case 1:
                imageView.setImageResource(2131231196);
                imageView.setContentDescription(k96.M0(2131754914, null));
                return;
            case 2:
                imageView.setImageResource(2131231195);
                imageView.setContentDescription(k96.M0(2131754915, null));
                return;
            default:
                return;
        }
    }

    public void setAlertKeepScreenOn(boolean z) {
        Window window = this.b.getWindow();
        if (window != null) {
            View peekDecorView = window.peekDecorView();
            if (peekDecorView != null && !peekDecorView.isAttachedToWindow()) {
                return;
            }
            if (z) {
                window.addFlags(128);
            } else {
                window.clearFlags(128);
            }
        }
    }

    @Override
    public final void A(int i, boolean z) {
        W();
        b52 b52Var = this.Q;
        if (b52Var != null) {
            b52Var.invalidateOutline();
            this.Q.invalidate();
        }
    }

    public final void A0() {
        ArrayList arrayList;
        e52 e52Var;
        HashMap hashMap;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        x02 x02Var = this.b;
        org.telegram.ui.ActionBar.d dVar = x02Var.Z1;
        org.telegram.ui.ActionBar.d dVar2 = x02Var.Z1;
        if (dVar instanceof mu1) {
            s42 s42Var = this.F;
            int childCount = s42Var.getChildCount();
            int i2 = 0;
            while (true) {
                arrayList = u1;
                e52Var = this.H;
                hashMap = t1;
                int i3 = -1;
                if (i2 >= childCount) {
                    break;
                }
                View childAt = s42Var.getChildAt(i2);
                if (childAt instanceof o48) {
                    o48 o48Var = (o48) childAt;
                    int R = RecyclerView.R(childAt);
                    if (e52Var.f && R > this.N0) {
                        R--;
                    }
                    if (e52Var.d && this.U0 == this.V0) {
                        R--;
                    }
                    jm6 d0 = d0(R);
                    if (d0 != null && d0.M) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    o48Var.setHasSpoiler(z5);
                    if (d0 != null && d0.c()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    o48Var.setHighQuality(z6);
                    if ((dVar2 instanceof mu1) && x02Var.Q3) {
                        if (d0 != null) {
                            i3 = arrayList.indexOf(Integer.valueOf(d0.C));
                        }
                        if (d0 != null && hashMap.containsKey(Integer.valueOf(d0.C))) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        o48Var.b(i3, z8, true);
                    } else {
                        if (d0 != null && hashMap.containsKey(Integer.valueOf(d0.C))) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        o48Var.b(-1, z7, true);
                    }
                }
                i2++;
            }
            s42 s42Var2 = this.r;
            int childCount2 = s42Var2.getChildCount();
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = s42Var2.getChildAt(i4);
                if (childAt2 instanceof o48) {
                    o48 o48Var2 = (o48) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (e52Var.f && R2 > this.N0) {
                        R2--;
                    }
                    if (e52Var.d && this.U0 == this.V0) {
                        R2--;
                    }
                    jm6 d02 = d0(R2);
                    if (d02 != null && d02.M) {
                        z = true;
                    } else {
                        z = false;
                    }
                    o48Var2.setHasSpoiler(z);
                    if (d02 != null && d02.c()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    o48Var2.setHighQuality(z2);
                    if ((dVar2 instanceof mu1) && x02Var.Q3) {
                        if (d02 != null) {
                            i = arrayList.indexOf(Integer.valueOf(d02.C));
                        } else {
                            i = -1;
                        }
                        if (d02 != null && hashMap.containsKey(Integer.valueOf(d02.C))) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        o48Var2.b(i, z4, true);
                    } else {
                        if (d02 != null && hashMap.containsKey(Integer.valueOf(d02.C))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        o48Var2.b(-1, z3, true);
                    }
                }
            }
        }
    }

    @Override
    public final void B() {
        ShutterButton shutterButton = this.l0;
        if (shutterButton == null) {
            return;
        }
        boolean z = this.R0;
        b52 b52Var = this.Q;
        yga ygaVar = yga.a;
        yga ygaVar2 = yga.b;
        if (!z) {
            if (b52Var != null && shutterButton.getState() == ygaVar2) {
                o0();
                CameraController.getInstance().stopVideoRecording(this.Q.getCameraSession(), false);
                shutterButton.a(ygaVar);
            }
            if (this.c0) {
                b0(false);
            }
            f0(true);
            return;
        }
        if (b52Var != null && shutterButton.getState() == ygaVar2) {
            shutterButton.a(ygaVar);
        }
        this.R0 = false;
    }

    public final void B0(boolean z) {
        boolean z2;
        TextView textView = this.q0;
        if (textView != null) {
            x02 x02Var = this.b;
            byte b = x02Var.N2;
            TextView textView2 = x02Var.g3;
            if (b == 0 && !x02Var.Q2 && !x02Var.B1) {
                HashMap hashMap = t1;
                Iterator it = hashMap.entrySet().iterator();
                int i = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    z2 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((jm6) ((Map.Entry) it.next()).getValue()).b) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                    if (z3 && z4) {
                        break;
                    }
                }
                int max = Math.max(1, hashMap.size());
                if (z3) {
                    if (z4) {
                        textView.setText(k96.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                        if (max != this.N || z) {
                            textView2.setText(k96.G(max, "MediaSelected", new Object[0]));
                        }
                    } else {
                        textView.setText(k96.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                        if (max != this.N || z) {
                            textView2.setText(k96.G(max, "VideosSelected", new Object[0]));
                        }
                    }
                } else {
                    textView.setText(k96.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                    if (max != this.N || z) {
                        textView2.setText(k96.G(max, "PhotosSelected", new Object[0]));
                    }
                }
                if (max <= 1) {
                    z2 = false;
                }
                x02Var.G1 = z2;
                x02Var.j3.setVisibility((!z2 || x02Var.N2 == 2) ? 8 : 8);
                this.N = max;
            }
        }
    }

    @Override
    public final void C(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.C(int, int):void");
    }

    @Override
    public final void D() {
        x02 x02Var = this.b;
        if (x02Var.isShowing() && !x02Var.J && !PhotoViewer.r0().V0()) {
            V(false);
        }
    }

    @Override
    public final void E(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.E(int):void");
    }

    @Override
    public final boolean H(int i) {
        if (this.c0) {
            if (i == 24 || i == 25 || i == 79 || i == 85) {
                ((q42) this.l0.getDelegate()).a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void I(p02 p02Var) {
        ViewPropertyAnimator viewPropertyAnimator = this.p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.x.setVisibility(0);
        boolean z = p02Var instanceof m52;
        TextView textView = this.y;
        if (!z) {
            a0();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33.j);
            this.p1 = interpolator;
            interpolator.start();
        }
        this.b.U2.setTitle("");
        this.G.g1(0, 0);
        if (z) {
            this.F.post(new kx1(this, p02Var, (byte) 19));
        }
        W();
        p0();
    }

    @Override
    public final void J() {
        this.O = false;
        b52 b52Var = this.Q;
        if (b52Var != null) {
            b52Var.setVisibility(0);
        }
        if (this.v0) {
            this.v0 = false;
            V(true);
        }
    }

    @Override
    public final void K() {
        this.F.z0(0);
    }

    public final int R(jm6 jm6Var, int i) {
        boolean z;
        Integer valueOf = Integer.valueOf(jm6Var.C);
        HashMap hashMap = t1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = u1;
        if (containsKey) {
            jm6Var.N = 0L;
            jm6Var.M = false;
            jm6Var.O = null;
            jm6Var.z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            B0(false);
            z0();
            if (i >= 0) {
                jm6Var.e();
                this.i1.X(i);
            }
            return indexOf;
        }
        jm6Var.N = getStarsPrice();
        if (getStarsPrice() > 0) {
            z = true;
        } else {
            z = false;
        }
        jm6Var.M = z;
        jm6Var.R = false;
        if (e0()) {
            jm6Var.O = Boolean.valueOf(!T());
        }
        jm6Var.z = Boolean.valueOf(jm6Var.c());
        boolean X = X(true);
        hashMap.put(valueOf, jm6Var);
        arrayList.add(valueOf);
        if (X) {
            A0();
            return -1;
        }
        B0(true);
        return -1;
    }

    public final void S() {
        b52 b52Var = this.Q;
        if (b52Var != null) {
            if (!this.c0) {
                b52Var.setTranslationX(this.V[0]);
            }
            int i = this.L0;
            int L = gl.L(2.0f) + (i << 1);
            if (!this.c0) {
                this.Q.setClipTop((int) this.a0);
                this.Q.setClipBottom((int) this.b0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
                if (layoutParams.height != L || layoutParams.width != i) {
                    layoutParams.width = i;
                    layoutParams.height = L;
                    this.Q.setLayoutParams(layoutParams);
                    gl.c3(new kx1(this, layoutParams, (byte) 20));
                }
            }
        }
    }

    public final void V(boolean z) {
        org.telegram.ui.ActionBar.d dVar;
        boolean z2;
        e52 e52Var;
        x02 x02Var = this.b;
        boolean z3 = x02Var.P1;
        org.telegram.ui.ActionBar.d dVar2 = x02Var.Z1;
        if (!z3 && this.n) {
            boolean z4 = this.O0;
            boolean z5 = this.P0;
            if (dVar2 == null) {
                dVar = LaunchActivity.Q();
            } else {
                dVar = dVar2;
            }
            if (dVar != null && dVar.getParentActivity() != null) {
                boolean z6 = false;
                if (!gba.v0) {
                    this.O0 = false;
                } else {
                    if (dVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.P0 = z2;
                    if (z2) {
                        if (z) {
                            try {
                                dVar2.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}, 17);
                            } catch (Exception unused) {
                            }
                        }
                        this.O0 = false;
                    } else {
                        if (z || gba.L0) {
                            CameraController.getInstance().initCamera(null);
                        }
                        z6 = CameraController.getInstance().isCameraInitied();
                        this.O0 = z6;
                    }
                }
                if ((z4 != z6 || z5 != this.P0) && (e52Var = this.H) != null) {
                    e52Var.f();
                }
                if (!x02Var.P1 && x02Var.isShowing() && this.O0 && ((Paint) x02Var.Z.b).getAlpha() != 0 && !this.c0) {
                    v0();
                }
            }
        }
    }

    public final void W() {
        s49 K;
        float[] fArr;
        int i;
        float f;
        int systemWindowInsetTop;
        if (!PhotoViewer.C0() || PhotoViewer.r0().o5 == null || !PhotoViewer.r0().o5.W) {
            b52 b52Var = this.Q;
            if (b52Var != null) {
                b52Var.invalidateOutline();
            }
            s42 s42Var = this.F;
            s49 K2 = s42Var.K(this.N0 - 1);
            if (K2 != null) {
                K2.a.invalidateOutline();
            }
            if ((!this.H.d || !this.O0 || this.U0 != this.V0) && (K = s42Var.K(0)) != null) {
                K.a.invalidateOutline();
            }
            b52 b52Var2 = this.Q;
            if (b52Var2 != null) {
                b52Var2.invalidate();
            }
            z42 z42Var = this.S;
            if (z42Var != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) z42Var.getLayoutParams();
                if (getRootWindowInsets() == null) {
                    systemWindowInsetTop = gl.L(16.0f);
                } else {
                    systemWindowInsetTop = getRootWindowInsets().getSystemWindowInsetTop() + gl.L(2.0f);
                }
                marginLayoutParams.topMargin = systemWindowInsetTop;
            }
            if (!this.O0) {
                return;
            }
            int childCount = s42Var.getChildCount();
            int i2 = 0;
            while (true) {
                fArr = this.V;
                if (i2 >= childCount) {
                    break;
                }
                View childAt = s42Var.getChildAt(i2);
                if (childAt instanceof h48) {
                    if (childAt.isAttachedToWindow()) {
                        float y = getY() + s42Var.getY() + childAt.getY();
                        x02 x02Var = this.b;
                        ViewGroup viewGroup = x02Var.b;
                        xz1 xz1Var = x02Var.v3;
                        st stVar = x02Var.L2;
                        float y2 = viewGroup.getY() + y;
                        float x = (x02Var.b.getX() + (getX() + (s42Var.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                        if (!x02Var.a2) {
                            i = gl.m;
                        } else {
                            i = 0;
                        }
                        float alpha = (stVar.getAlpha() * stVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
                        eb1 eb1Var = x02Var.B4;
                        if (eb1Var != null && eb1Var.g()) {
                            alpha = Math.max(alpha, (x02Var.B4.e() + x02Var.B4.getY()) - x02Var.i4);
                        }
                        if (y < alpha) {
                            f = alpha - y;
                        } else {
                            f = 0.0f;
                        }
                        if (f != this.a0) {
                            this.a0 = f;
                            b52 b52Var3 = this.Q;
                            if (b52Var3 != null) {
                                b52Var3.invalidateOutline();
                                this.Q.invalidate();
                            }
                        }
                        float translationY = (int) (xz1Var.getTranslationY() + (x02Var.b.getMeasuredHeight() - xz1Var.getMeasuredHeight()));
                        eb1 eb1Var2 = x02Var.B4;
                        if (eb1Var2 != null) {
                            translationY -= eb1Var2.d() - gl.L(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y > translationY) {
                            this.b0 = Math.min(-gl.L(5.0f), y - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.b0 = 0.0f;
                        }
                        fArr[0] = x;
                        fArr[1] = y2;
                        S();
                        return;
                    }
                } else {
                    i2++;
                }
            }
            if (this.a0 != 0.0f) {
                this.a0 = 0.0f;
                b52 b52Var4 = this.Q;
                if (b52Var4 != null) {
                    b52Var4.invalidateOutline();
                    this.Q.invalidate();
                }
            }
            fArr[0] = gl.L(-400.0f);
            fArr[1] = 0.0f;
            S();
        }
    }

    public final boolean X(boolean z) {
        if (getStarsPrice() <= 0) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            HashMap hashMap = t1;
            if (hashMap.size() <= 10 - (z ? 1 : 0)) {
                break;
            }
            ArrayList arrayList = u1;
            if (!arrayList.isEmpty()) {
                Object obj = hashMap.get(arrayList.get(0));
                if (!(obj instanceof jm6)) {
                    break;
                }
                R((jm6) obj, -1);
                z2 = true;
            } else {
                break;
            }
        }
        return z2;
    }

    public final boolean Y(jm6 jm6Var) {
        boolean z = this.x0;
        wjb wjbVar = this.a;
        x02 x02Var = this.b;
        if (!z && jm6Var.b) {
            if (!x02Var.F0()) {
                yjb.x(null, 2131749363, new u21(x02Var.o3, wjbVar), null);
                return true;
            }
        } else if (!this.y0 && !jm6Var.b) {
            if (!x02Var.F0()) {
                yjb.x(null, 2131749367, new u21(x02Var.o3, wjbVar), null);
                return true;
            }
        } else {
            return false;
        }
        return true;
    }

    public final void Z() {
        if (this.Q0) {
            boolean g0 = g0();
            this.Q0 = g0;
            if (!g0) {
                h0();
            }
            this.H.f();
            this.w.f();
        }
    }

    @Override
    public final void a(Editable editable) {
        jm6 jm6Var;
        int i = 0;
        while (true) {
            ArrayList arrayList = u1;
            if (i < arrayList.size()) {
                if (i == 0) {
                    Object obj = arrayList.get(i);
                    HashMap hashMap = t1;
                    Object obj2 = hashMap.get(obj);
                    if (obj2 instanceof jm6) {
                        jm6 clone = ((jm6) obj2).clone();
                        CharSequence[] charSequenceArr = {editable};
                        clone.n = hq6.d0(y6c.t0).Y(charSequenceArr, false, true);
                        clone.a = charSequenceArr[0];
                        jm6Var = clone;
                    } else {
                        boolean z = obj2 instanceof nm6;
                        jm6Var = obj2;
                        if (z) {
                            nm6 clone2 = ((nm6) obj2).clone();
                            CharSequence[] charSequenceArr2 = {editable};
                            clone2.n = hq6.d0(y6c.t0).Y(charSequenceArr2, false, true);
                            clone2.I = charSequenceArr2[0];
                            jm6Var = clone2;
                        }
                    }
                    hashMap.put(obj, jm6Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void a0() {
        String M0 = k96.M0(2131751142, null);
        a8 a8Var = this.Z0;
        a8Var.setText(M0);
        a8Var.setAnimatedIcon(2131624132);
        this.b.X2.S(1);
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((jm6) entry.getValue()).e();
            }
            hashMap.clear();
            u1.clear();
        }
        ArrayList arrayList = s1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                jm6 jm6Var = (jm6) arrayList.get(i);
                new File(jm6Var.I).delete();
                if (jm6Var.h != null) {
                    new File(jm6Var.h).delete();
                }
                if (jm6Var.c != null) {
                    new File(jm6Var.c).delete();
                }
            }
            arrayList.clear();
        }
        this.H.f();
        this.w.f();
    }

    @Override
    public final boolean b() {
        return !this.c0;
    }

    public final void b0(boolean z) {
        boolean z2;
        b52 b52Var;
        if (!this.t0 && this.Q != null) {
            int i = this.L0;
            int[] iArr = this.g0;
            iArr[1] = i;
            iArr[2] = gl.L(2.0f) + (i << 1);
            Runnable runnable = this.o0;
            if (runnable != null) {
                gl.r(runnable);
                this.o0 = null;
            }
            if (gl.B(bkb.v0(bkb.Z6, this.a)) > 0.721d) {
                z2 = true;
            } else {
                z2 = false;
            }
            gl.i3(this.b, z2);
            TextView textView = this.q0;
            s42 s42Var = this.r;
            yc ycVar = this.k0;
            s42 s42Var2 = this.F;
            ImageView[] imageViewArr = this.T;
            azc azcVar = this.m0;
            if (z) {
                this.k1 = this.Q.getTranslationY();
                this.e0 = true;
                if (s42Var2 != null) {
                    s42Var2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(ycVar, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(azcVar, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(s42Var, property, 0.0f));
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        break;
                    } else if (imageViewArr[i2].getVisibility() == 0) {
                        arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i2], property, 0.0f));
                        break;
                    } else {
                        i2++;
                    }
                }
                this.g1.d();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(s33.f);
                animatorSet.addListener(new r42(this, (byte) 3));
                animatorSet.start();
            } else {
                this.j1 = false;
                setAlertKeepScreenOn(false);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                ycVar.setAlpha(0.0f);
                ycVar.setVisibility(8);
                azcVar.setAlpha(0.0f);
                azcVar.setTag(null);
                azcVar.setVisibility(8);
                s42Var.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                s42Var.setVisibility(8);
                int i3 = 0;
                while (true) {
                    if (i3 >= 2) {
                        break;
                    } else if (imageViewArr[i3].getVisibility() == 0) {
                        imageViewArr[i3].setAlpha(0.0f);
                        break;
                    } else {
                        i3++;
                    }
                }
                this.c0 = false;
                b52 b52Var2 = this.Q;
                if (b52Var2 != null) {
                    b52Var2.setFpsLimit(30);
                    this.Q.setSystemUiVisibility(1024);
                }
                if (s42Var2 != null) {
                    s42Var2.invalidate();
                }
            }
            b52 b52Var3 = this.Q;
            if (b52Var3 != null) {
                b52Var3.setImportantForAccessibility(0);
            }
            s42Var2.setImportantForAccessibility(0);
            if (!e66.e(360928) && (b52Var = this.Q) != null) {
                b52Var.showTexture(false, z);
            }
        }
    }

    @Override
    public final boolean c() {
        for (Map.Entry entry : t1.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof jm6) {
                if (((jm6) value).x != 0) {
                    return false;
                }
            } else if ((value instanceof nm6) && ((nm6) value).x != 0) {
                return false;
            }
        }
        return true;
    }

    public final o48 c0(int i) {
        s42 s42Var = this.F;
        int childCount = s42Var.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = s42Var.getChildAt(i2);
            if (childAt.getTop() < s42Var.getMeasuredHeight() - this.b.T0() && (childAt instanceof o48)) {
                o48 o48Var = (o48) childAt;
                if (o48Var.getImageView().getTag() != null && ((Integer) o48Var.getImageView().getTag()).intValue() == i) {
                    return o48Var;
                }
            }
        }
        return null;
    }

    @Override
    public final void d() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = this.f1;
        if (z) {
            i = bkb.Xg;
        } else {
            i = bkb.i5;
        }
        int i5 = bkb.b7;
        wjb wjbVar = this.a;
        this.I.setTextColor(bkb.v0(i5, wjbVar));
        int i6 = bkb.z5;
        s42 s42Var = this.F;
        zkb.H(s42Var, i6, wjbVar);
        s42Var.K(0);
        zkb.X(this.y, i, wjbVar);
        if (z) {
            i2 = bkb.Xg;
        } else {
            i2 = bkb.D8;
        }
        int v0 = bkb.v0(i2, wjbVar);
        w42 w42Var = this.x;
        w42Var.O(v0, false);
        if (z) {
            i3 = bkb.Xg;
        } else {
            i3 = bkb.D8;
        }
        w42Var.O(bkb.v0(i3, wjbVar), true);
        if (z) {
            i4 = bkb.Zg;
        } else {
            i4 = bkb.F8;
        }
        w42Var.I(bkb.v0(i4, wjbVar));
        bkb.A1(bkb.v0(i, wjbVar), this.E);
    }

    public final jm6 d0(int i) {
        if (i >= 0) {
            ArrayList arrayList = s1;
            int size = arrayList.size();
            if (i < size) {
                return (jm6) arrayList.get(i);
            }
            int i2 = i - size;
            xl6 xl6Var = this.U0;
            if (xl6Var != null && i2 < xl6Var.e.size()) {
                return (jm6) this.U0.e.get(i2);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        xl6 xl6Var;
        x02 x02Var;
        if (i == kk7.q2) {
            e52 e52Var = this.H;
            if (e52Var != null) {
                if (t0()) {
                    xl6Var = MediaController.a2;
                    this.V0 = xl6Var;
                } else {
                    xl6Var = MediaController.b2;
                    this.V0 = xl6Var;
                }
                if (this.U0 != null && ((x02Var = this.b) == null || !x02Var.A1)) {
                    if (t0()) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= MediaController.c2.size()) {
                                break;
                            }
                            xl6 xl6Var2 = (xl6) MediaController.c2.get(i3);
                            int i4 = xl6Var2.a;
                            xl6 xl6Var3 = this.U0;
                            if (i4 == xl6Var3.a && xl6Var2.b == xl6Var3.b) {
                                this.U0 = xl6Var2;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    this.U0 = xl6Var;
                }
                this.Y0 = false;
                this.I.c();
                e52Var.f();
                this.w.f();
                ArrayList arrayList = u1;
                if (!arrayList.isEmpty() && this.V0 != null) {
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        Integer num = (Integer) arrayList.get(i5);
                        HashMap hashMap = t1;
                        Object obj = hashMap.get(num);
                        jm6 jm6Var = (jm6) this.V0.f.get(num.intValue());
                        if (jm6Var != null) {
                            if (obj instanceof jm6) {
                                jm6Var.g((jm6) obj);
                            }
                            hashMap.put(num, jm6Var);
                        }
                    }
                }
                x0();
            }
        } else if (i == kk7.n4) {
            V(false);
        }
    }

    public final void f0(boolean z) {
        if (this.O0 && this.Q != null) {
            q0();
            this.R.i();
            this.Q.destroy(z, null);
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.P = null;
            }
            gl.d3(new j42(this, (byte) 0), 300L);
            this.d0 = false;
        }
    }

    public final boolean g0() {
        Activity W = gl.W(getContext());
        if (W == null) {
            W = this.b.Z1.getParentActivity();
        }
        if (W != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (W.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && W.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) {
                    return false;
                }
                return true;
            } else if (W.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public ArrayList<Object> getAllPhotosArray() {
        xl6 xl6Var = this.U0;
        ArrayList<Object> arrayList = s1;
        if (xl6Var != null) {
            if (!arrayList.isEmpty()) {
                ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size() + this.U0.e.size());
                arrayList2.addAll(arrayList);
                arrayList2.addAll(this.U0.e);
                return arrayList2;
            }
            return this.U0.e;
        } else if (!arrayList.isEmpty()) {
            return arrayList;
        } else {
            return new ArrayList<>(0);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + super.getButtonsHideOffset();
    }

    public float getCameraOpenProgress() {
        return this.f0;
    }

    @Override
    public int getCurrentItemTop() {
        s42 s42Var = this.F;
        int childCount = s42Var.getChildCount();
        g24 g24Var = this.I;
        if (childCount <= 0) {
            s42Var.setTopGlowOffset(s42Var.getPaddingTop());
            g24Var.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = s42Var.getChildAt(0);
        y29 y29Var = (y29) s42Var.G(childAt);
        int top = childAt.getTop() - this.q1;
        int L = gl.L(7.0f);
        if (top < gl.L(7.0f) || y29Var == null || y29Var.b() != 0) {
            top = L;
        }
        g24Var.setTranslationY(((((getMeasuredHeight() - top) - gl.L(50.0f)) - g24Var.getMeasuredHeight()) / 2.0f) + top);
        s42Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return gl.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.F.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return u1.size();
    }

    public HashMap<Object, Object> getSelectedPhotos() {
        return t1;
    }

    public int getSelectedPhotosCount() {
        int i = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof jm6) {
                jm6 jm6Var = (jm6) obj;
                if (!jm6Var.b && jm6Var.s == null) {
                    i++;
                }
            }
        }
        return i;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof jm6) {
                jm6 jm6Var = (jm6) obj;
                if (jm6Var.c() && !jm6Var.b && jm6Var.s == null) {
                    i++;
                }
            }
        }
        return i;
    }

    public ArrayList<Object> getSelectedPhotosOrder() {
        return u1;
    }

    public long getStarsPrice() {
        Iterator it = t1.entrySet().iterator();
        if (it.hasNext()) {
            return ((jm6) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    public final void h0() {
        xl6 xl6Var;
        if (t0()) {
            xl6Var = MediaController.a2;
        } else {
            xl6Var = MediaController.b2;
        }
        if (xl6Var == null) {
            MediaController.N(0);
        }
    }

    public final int i0() {
        x02 x02Var = this.b;
        org.telegram.ui.ActionBar.d dVar = x02Var.Z1;
        if ((dVar instanceof mu1) && ((mu1) dVar).g4 == 5) {
            return dVar.getMessagesController().k4.i0.f() - ((mu1) x02Var.Z1).M6.size();
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public final int j() {
        return 1;
    }

    public final void j0(int r13, android.content.Intent r14, java.lang.String r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.j0(int, android.content.Intent, java.lang.String):void");
    }

    public final void k0(boolean z) {
        b52 b52Var;
        b52 b52Var2 = this.Q;
        if (b52Var2 != null && this.P == null) {
            x02 x02Var = this.b;
            if (!x02Var.J) {
                b52Var2.initTexture();
                boolean t0 = t0();
                int i = 0;
                TextView textView = this.r0;
                if (t0) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                boolean isEmpty = s1.isEmpty();
                TextView textView2 = this.q0;
                s42 s42Var = this.r;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    s42Var.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    s42Var.setVisibility(0);
                }
                if (x02Var.U0().w && isFocusable()) {
                    x02Var.U0().d();
                }
                azc azcVar = this.m0;
                azcVar.setVisibility(0);
                azcVar.setAlpha(0.0f);
                yc ycVar = this.k0;
                ycVar.setVisibility(0);
                ycVar.setTag(null);
                int[] iArr = this.g0;
                iArr[0] = 0;
                int i2 = this.L0;
                iArr[1] = i2;
                iArr[2] = gl.L(2.0f) + (i2 << 1);
                this.k1 = 0.0f;
                this.j1 = true;
                b52 b52Var3 = this.Q;
                if (b52Var3 != null) {
                    b52Var3.setFpsLimit(-1);
                }
                gl.t1(this);
                gl.i3(x02Var, false);
                setAlertKeepScreenOn(true);
                s42 s42Var2 = this.F;
                ImageView[] imageViewArr = this.T;
                if (z) {
                    setCameraOpenProgress(0.0f);
                    this.e0 = true;
                    if (s42Var2 != null) {
                        s42Var2.invalidate();
                    }
                    this.g1.d();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(ycVar, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(s42Var, property, 1.0f));
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 2) {
                            break;
                        } else if (imageViewArr[i3].getVisibility() == 0) {
                            arrayList.add(ObjectAnimator.ofFloat(imageViewArr[i3], property, 1.0f));
                            break;
                        } else {
                            i3++;
                        }
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(350L);
                    animatorSet.setInterpolator(s33.f);
                    animatorSet.addListener(new r42(this, (byte) 2));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    ycVar.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    s42Var.setAlpha(1.0f);
                    while (true) {
                        if (i >= 2) {
                            break;
                        } else if (imageViewArr[i].getVisibility() == 0) {
                            imageViewArr[i].setAlpha(1.0f);
                            break;
                        } else {
                            i++;
                        }
                    }
                    x02Var.W3.I0();
                    b52 b52Var4 = this.Q;
                    if (b52Var4 != null) {
                        b52Var4.setSystemUiVisibility(1028);
                    }
                }
                this.c0 = true;
                b52 b52Var5 = this.Q;
                if (b52Var5 != null) {
                    b52Var5.setImportantForAccessibility(2);
                }
                s42Var2.setImportantForAccessibility(4);
                s42Var2.invalidate();
                if (!e66.e(360928) && (b52Var = this.Q) != null && b52Var.isInited()) {
                    this.Q.showTexture(true, z);
                }
            }
        }
    }

    @Override
    public final void l() {
        W();
        invalidate();
    }

    public final void l0() {
        if (gba.v0) {
            k0(true);
            return;
        }
        x02 x02Var = this.b;
        v02 v02Var = x02Var.W3;
        if (v02Var != null) {
            v02Var.B1(0, false, true, 0, 0, 0L, x02Var.a1(), false, 0L);
        }
    }

    @Override
    public final void m(float f) {
        this.X0 = f;
        W();
        b52 b52Var = this.Q;
        if (b52Var != null) {
            b52Var.invalidateOutline();
            this.Q.invalidate();
        }
        invalidate();
    }

    public final void m0(jm6 jm6Var, boolean z, boolean z2) {
        int i;
        mu1 mu1Var;
        mu1 mu1Var2;
        ArrayList<Object> arrayList;
        int i2;
        ArrayList arrayList2 = s1;
        x02 x02Var = this.b;
        if (jm6Var != null) {
            int i3 = jm6Var.C;
            arrayList2.add(jm6Var);
            t1.put(Integer.valueOf(i3), jm6Var);
            u1.add(Integer.valueOf(i3));
            x02Var.F1(0);
            this.H.f();
            this.w.f();
            if (!z2 && arrayList2.size() > 1) {
                B0(false);
                if (this.Q != null) {
                    this.m0.b(false, 0.0f);
                    this.C0 = 0.0f;
                    this.Q.setZoom(0.0f);
                    CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
                    return;
                }
                return;
            }
        }
        if (!arrayList2.isEmpty()) {
            this.u0 = true;
            org.telegram.ui.ActionBar.d dVar = x02Var.Z1;
            org.telegram.ui.ActionBar.d dVar2 = x02Var.Z1;
            if (dVar == null) {
                dVar = LaunchActivity.Q();
            }
            if (dVar != null) {
                PhotoViewer.r0().T1(dVar.getParentActivity(), null, this.a);
                PhotoViewer.r0().U1(x02Var);
                PhotoViewer r0 = PhotoViewer.r0();
                int i4 = x02Var.P3;
                boolean z3 = x02Var.Q3;
                r0.h = i4;
                r0.n = z3;
                if (x02Var.z1 && x02Var.A1) {
                    mu1Var = (mu1) dVar2;
                    i = 11;
                } else {
                    if (x02Var.N2 != 0) {
                        i = 1;
                    } else if (dVar2 instanceof mu1) {
                        mu1Var = (mu1) dVar2;
                        i = 2;
                    } else {
                        i = 5;
                    }
                    mu1Var = null;
                }
                boolean z4 = x02Var.B1;
                if (z4) {
                    i = 13;
                    mu1Var2 = null;
                } else {
                    mu1Var2 = mu1Var;
                }
                int i5 = i;
                if (x02Var.N2 == 0 && !z4) {
                    arrayList = getAllPhotosArray();
                    i2 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(jm6Var);
                    i2 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                ul5 ul5Var = x02Var.K1;
                if (ul5Var != null && jm6Var != null) {
                    ul5Var.e = jm6Var.b;
                }
                PhotoViewer.r0().o1(arrayList3, i2, i5, false, new t42(this, z), mu1Var2);
                PhotoViewer.r0().G1(x02Var.K1);
                if (x02Var.A1) {
                    PhotoViewer.r0().V(null, null, false, x02Var.D1);
                    PhotoViewer.r0().u1();
                }
            }
        }
    }

    public final void n0() {
        try {
            if (this.Q != null) {
                CameraController.getInstance().stopPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean o(MotionEvent motionEvent) {
        int[] iArr;
        b52 b52Var;
        if (!this.e0) {
            if (this.c0 && motionEvent != null) {
                boolean z = this.H0;
                azc azcVar = this.m0;
                if ((!z && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.F0;
                    azcVar.getHitRect(rect);
                    if (azcVar.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (!this.t0 && !this.J0) {
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
                    s42 s42Var = this.r;
                    TextView textView = this.q0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.T;
                    yc ycVar = this.k0;
                    float f = 1.0f;
                    if (actionMasked == 2) {
                        if (this.D0 && motionEvent.getPointerCount() == 2 && !this.J0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (!this.E0) {
                                if (Math.abs(hypot - this.B0) >= gl.Z0(false, 0.4f)) {
                                    this.B0 = hypot;
                                    this.E0 = true;
                                    return true;
                                }
                            } else if (this.Q != null) {
                                this.B0 = hypot;
                                float L = this.C0 + ((hypot - this.B0) / gl.L(100.0f));
                                this.C0 = L;
                                if (L < 0.0f) {
                                    this.C0 = 0.0f;
                                    f = 0.0f;
                                } else if (L > 1.0f) {
                                    this.C0 = 1.0f;
                                } else {
                                    f = L;
                                }
                                azcVar.b(false, f);
                                this.b.b.invalidate();
                                this.Q.setZoom(this.C0);
                                w0(true);
                                return true;
                            }
                        } else {
                            float y = motionEvent.getY();
                            float f2 = y - this.G0;
                            if (this.I0) {
                                if (Math.abs(f2) > gl.Z0(false, 0.4f)) {
                                    this.I0 = false;
                                    this.J0 = true;
                                    return true;
                                }
                            } else if (this.J0 && (b52Var = this.Q) != null) {
                                b52Var.setTranslationY(b52Var.getTranslationY() + f2);
                                this.G0 = y;
                                azcVar.setTag(null);
                                Runnable runnable = this.o0;
                                if (runnable != null) {
                                    gl.r(runnable);
                                    this.o0 = null;
                                }
                                if (ycVar.getTag() == null) {
                                    ycVar.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(ycVar, property, 0.0f), ObjectAnimator.ofFloat(azcVar, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(s42Var, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(s33.f);
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
                            b52 b52Var2 = this.Q;
                            if (b52Var2 != null) {
                                if (Math.abs(b52Var2.getTranslationY()) > this.Q.getMeasuredHeight() / 6.0f) {
                                    b0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(ycVar, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(s42Var, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.j0);
                                animatorSet2.start();
                                ycVar.setTag(null);
                                return true;
                            }
                        } else {
                            b52 b52Var3 = this.Q;
                            if (b52Var3 != null && !this.E0) {
                                b52Var3.getLocationOnScreen(this.W);
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
        if (this.b.P1) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            this.T[i].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(s33.f).start();
        }
        ViewPropertyAnimator duration = this.s0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        s33 s33Var = s33.f;
        duration.setInterpolator(s33Var).start();
        this.r0.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
        gl.R3(this.S, false);
        gl.r(this.i0);
        this.i0 = null;
        gl.K3(gl.W(getContext()));
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (this.T0 != i5) {
            this.T0 = i5;
            e52 e52Var = this.H;
            if (e52Var != null) {
                e52Var.f();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        W();
    }

    public final void p0() {
        try {
            V(false);
            if (this.Q != null) {
                CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void q() {
        kk7.e().n(this, kk7.n4);
        kk7.e().n(this, kk7.q2);
    }

    public final void q0() {
        if (this.d0) {
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
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.a.h(), "cthumb.jpg"));
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
    public final boolean r() {
        if (this.e0) {
            return true;
        }
        if (this.c0) {
            b0(true);
            return true;
        }
        f0(true);
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.S0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(int i) {
        boolean z;
        if (i != 0 && i != 2) {
            z = true;
        } else {
            z = false;
        }
        f0(z);
    }

    public final void s0(int i, final boolean z) {
        PhotoViewer r0 = PhotoViewer.r0();
        if (i == -1) {
            i = r0.O4;
        }
        ArrayList arrayList = r0.f7;
        if (arrayList != null && !arrayList.isEmpty() && i < arrayList.size() && (arrayList.get(i) instanceof jm6) && ((jm6) arrayList.get(i)).M) {
            final jm6 jm6Var = (jm6) arrayList.get(i);
            this.F.M(new vs2() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z2 = ChatAttachAlertPhotoLayout.r1;
                    if (view instanceof o48) {
                        o48 o48Var = (o48) view;
                        if (o48Var.getPhotoEntry() == jm6Var) {
                            o48Var.c(z, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z3 = true;
                            if (ChatAttachAlertPhotoLayout.t1.size() <= 1) {
                                z3 = false;
                            }
                            o48Var.f(starsPrice, z3);
                        }
                    }
                }
            });
        }
    }

    public void setCameraOpenProgress(float f) {
        int i;
        int i2;
        if (this.Q == null) {
            return;
        }
        this.f0 = f;
        int[] iArr = this.g0;
        float f2 = iArr[1];
        float f3 = iArr[2];
        int i3 = gl.q.x;
        x02 x02Var = this.b;
        float width = x02Var.c.getWidth();
        float height = x02Var.c.getHeight();
        float[] fArr = this.V;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = this.k1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
        float textureHeight = this.Q.getTextureHeight(f2, f3) / this.Q.getTextureHeight(width, height);
        float f7 = f3 / height;
        float f8 = f2 / width;
        boolean z = this.j1;
        b52 b52Var = this.Q;
        if (z) {
            i = (int) width;
            i2 = (int) height;
            float f9 = 1.0f - f;
            float f10 = (textureHeight * f9) + f;
            b52Var.getTextureView().setScaleX(f10);
            this.Q.getTextureView().setScaleY(f10);
            float f11 = f4 * f9;
            this.Q.setTranslationX(((0.0f * f) + f11) - (((1.0f - ((f8 * f9) + f)) * width) / 2.0f));
            float f12 = f5 * f9;
            this.Q.setTranslationY(((f6 * f) + f12) - (((1.0f - ((f7 * f9) + f)) * height) / 2.0f));
            this.l1 = f12 - this.Q.getTranslationY();
            this.m1 = (height * f) + (((f5 + f3) * f9) - this.Q.getTranslationY());
            this.o1 = f11 - this.Q.getTranslationX();
            this.n1 = (width * f) + (((f4 + f2) * f9) - this.Q.getTranslationX());
        } else {
            i = (int) f2;
            i2 = (int) f3;
            b52Var.getTextureView().setScaleX(1.0f);
            this.Q.getTextureView().setScaleY(1.0f);
            this.l1 = 0.0f;
            this.m1 = height;
            this.o1 = 0.0f;
            this.n1 = width;
            this.Q.setTranslationX(f4);
            this.Q.setTranslationY(f5);
        }
        if (layoutParams.width != i || layoutParams.height != i2) {
            layoutParams.width = i;
            layoutParams.height = i2;
            this.Q.requestLayout();
        }
        this.Q.invalidateOutline();
        this.Q.invalidate();
    }

    public void setCheckCameraWhenShown(boolean z) {
        this.v0 = z;
    }

    public void setIncludeVideosInGallery(boolean z) {
        this.z0 = z;
    }

    public void setStarsPrice(long j) {
        boolean z;
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                jm6 jm6Var = (jm6) entry.getValue();
                jm6Var.N = j;
                if (j > 0) {
                    z = true;
                } else {
                    z = false;
                }
                jm6Var.M = z;
                jm6Var.R = false;
            }
        }
        E(getSelectedItemsCount());
        if (X(false)) {
            A0();
        }
    }

    @Override
    public void setTranslationY(float f) {
        x02 x02Var = this.b;
        if (x02Var.B0 == 1) {
            float f2 = (f / 40.0f) * (-0.1f);
            s42 s42Var = this.F;
            int childCount = s42Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = s42Var.getChildAt(i);
                if (childAt instanceof o48) {
                    o48 o48Var = (o48) childAt;
                    float f3 = 1.0f + f2;
                    o48Var.getCheckBox().setScaleX(f3);
                    o48Var.getCheckBox().setScaleY(f3);
                }
            }
        }
        super.setTranslationY(f);
        x02Var.b.invalidate();
        invalidate();
    }

    public final boolean t0() {
        if (!this.z0) {
            x02 x02Var = this.b;
            if (!x02Var.z1) {
                if (!(x02Var.Z1 instanceof mu1) && !x02Var.Q2 && x02Var.N2 != 2) {
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
        b52 b52Var = this.Q;
        if (b52Var != null) {
            b52Var.setVisibility(8);
        }
        for (Map.Entry entry : t1.entrySet()) {
            if (entry.getValue() instanceof jm6) {
                ((jm6) entry.getValue()).getClass();
            }
        }
        this.H.f();
    }

    public final void u0(ob0 ob0Var, TLRPC.VideoSize videoSize, long j) {
        boolean z;
        x02 x02Var = this.b;
        mb0 mb0Var = new mb0(x02Var.O1, x02Var.K1);
        ul5 ul5Var = x02Var.K1;
        if (ul5Var != null && ul5Var.c == 2) {
            z = false;
        } else {
            z = true;
        }
        mb0Var.R = z;
        x02Var.Z1.presentFragment(mb0Var);
        if (ob0Var != null) {
            mb0Var.p0(ob0Var);
        }
        if (videoSize != null) {
            mb0Var.q0(videoSize);
        }
        if (j != 0) {
            mb0Var.o0(j);
        }
        mb0Var.J = new q31(this, mb0Var, (byte) 23);
    }

    @Override
    public final void v() {
        this.O = true;
        s42 s42Var = this.F;
        int childCount = s42Var.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (s42Var.getChildAt(i) instanceof h48) {
                q0();
                break;
            } else {
                this.R.i();
                i++;
            }
        }
        ViewPropertyAnimator viewPropertyAnimator = this.p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator withEndAction = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33.j).withEndAction(new j42(this, (byte) 3));
        this.p1 = withEndAction;
        withEndAction.start();
        n0();
    }

    public final void v0() {
        boolean z;
        boolean z2;
        float f;
        x02 x02Var = this.b;
        if (!x02Var.c4 && this.w0 && CameraView.isCameraAllowed()) {
            if (this.Q == null) {
                boolean z3 = !e66.e(360928);
                Context context = getContext();
                Boolean bool = this.p0;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = x02Var.R3;
                }
                b52 b52Var = new b52(this, context, z, z3);
                this.Q = b52Var;
                org.telegram.ui.ActionBar.d dVar = x02Var.Z1;
                if ((dVar instanceof mu1) && ((mu1) dVar).y()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                b52Var.setRecordFile(gl.s0(z2));
                this.Q.setFocusable(true);
                this.Q.setFpsLimit(30);
                this.Q.setOutlineProvider(new cl0(this, (byte) 3));
                this.Q.setClipToOutline(true);
                this.Q.setContentDescription(k96.M0(2131754851, null));
                ww0 ww0Var = x02Var.c;
                b52 b52Var2 = this.Q;
                int i = this.L0;
                ww0Var.addView(b52Var2, 1, new FrameLayout.LayoutParams(i, i));
                this.Q.setDelegate(new u42(this));
                b52 b52Var3 = this.Q;
                if (this.w0) {
                    f = 1.0f;
                } else {
                    f = 0.2f;
                }
                b52Var3.setAlpha(f);
                this.Q.setEnabled(this.w0);
                if (this.O) {
                    this.Q.setVisibility(8);
                }
                if (!this.c0) {
                    W();
                }
                s42 s42Var = this.F;
                if (s42Var != null) {
                    s42Var.invalidate();
                }
                invalidate();
            }
            azc azcVar = this.m0;
            if (azcVar != null) {
                azcVar.b(false, 0.0f);
                this.C0 = 0.0f;
            }
            if (!this.c0) {
                this.Q.setTranslationX(this.V[0]);
            }
        }
    }

    @Override
    public final void w(float f) {
        b52 b52Var = this.Q;
        if (b52Var != null) {
            b52Var.setAlpha(f);
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0 && this.Q.getVisibility() != 0) {
                this.Q.setVisibility(0);
            } else if (i == 0 && this.Q.getVisibility() != 4) {
                this.Q.setVisibility(4);
            }
        }
    }

    public final void w0(boolean z) {
        Integer num;
        float f;
        azc azcVar = this.m0;
        if (azcVar.getTag() != null && z) {
            Runnable runnable = this.o0;
            if (runnable != null) {
                gl.r(runnable);
            }
            j42 j42Var = new j42(this, (byte) 1);
            this.o0 = j42Var;
            gl.d3(j42Var, 2000L);
        } else if (azcVar.getTag() != null || z) {
            AnimatorSet animatorSet = this.n0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (z) {
                num = 1;
            } else {
                num = null;
            }
            azcVar.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.n0 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = this.n0;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(azcVar, View.ALPHA, f));
            this.n0.addListener(new r42(this, (byte) 1));
            this.n0.start();
            if (z) {
                j42 j42Var2 = new j42(this, (byte) 2);
                this.o0 = j42Var2;
                gl.d3(j42Var2, 2000L);
            }
        }
    }

    @Override
    public final void x(int i) {
        TLRPC.Chat S0;
        boolean z;
        boolean z2;
        boolean z3 = true;
        x02 x02Var = this.b;
        if (i == 8) {
            x02Var.q1(!x02Var.W1, true);
            this.e1.a(!x02Var.W1, true);
        } else if ((i == 0 || i == 1) && x02Var.P3 > 0 && u1.size() > 1 && (S0 = x02Var.S0()) != null && !hc2.N(S0) && S0.slowmode_enabled) {
            ij.L(getContext(), k96.M0(2131745118, null), k96.M0(2131745110, null), null, null, this.a).o();
        } else {
            wjb wjbVar = this.a;
            HashMap hashMap = t1;
            if (i == 0) {
                k27 k27Var = x02Var.E3;
                org.telegram.ui.ActionBar.d dVar = x02Var.Z1;
                if (k27Var == null && (dVar instanceof mu1) && ((mu1) dVar).P7()) {
                    ij.J(getContext(), ((mu1) dVar).a(), new f42(this, (byte) 0), wjbVar);
                } else {
                    ij.X(x02Var.G3, x02Var.V0(), x02Var.R0() + hashMap.size(), new p8c(this) {
                        public final ChatAttachAlertPhotoLayout b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            byte b = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                            Long l = (Long) obj;
                            switch (b) {
                                case 0:
                                    boolean z4 = ChatAttachAlertPhotoLayout.r1;
                                    x02 x02Var2 = chatAttachAlertPhotoLayout.b;
                                    x02Var2.E0();
                                    x02Var2.W3.B1(7, false, true, 0, 0, 0L, x02Var2.a1(), false, l.longValue());
                                    return;
                                default:
                                    boolean z5 = ChatAttachAlertPhotoLayout.r1;
                                    x02 x02Var3 = chatAttachAlertPhotoLayout.b;
                                    x02Var3.E0();
                                    x02Var3.W3.B1(4, true, true, 0, 0, 0L, x02Var3.a1(), false, l.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i == 1) {
                k27 k27Var2 = x02Var.E3;
                org.telegram.ui.ActionBar.d dVar2 = x02Var.Z1;
                if (k27Var2 == null && (dVar2 instanceof mu1) && ((mu1) dVar2).P7()) {
                    ij.J(getContext(), ((mu1) dVar2).a(), new f42(this, (byte) 1), wjbVar);
                } else {
                    ij.X(x02Var.G3, x02Var.V0(), x02Var.R0() + hashMap.size(), new p8c(this) {
                        public final ChatAttachAlertPhotoLayout b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            byte b = r2;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                            Long l = (Long) obj;
                            switch (b) {
                                case 0:
                                    boolean z4 = ChatAttachAlertPhotoLayout.r1;
                                    x02 x02Var2 = chatAttachAlertPhotoLayout.b;
                                    x02Var2.E0();
                                    x02Var2.W3.B1(7, false, true, 0, 0, 0L, x02Var2.a1(), false, l.longValue());
                                    return;
                                default:
                                    boolean z5 = ChatAttachAlertPhotoLayout.r1;
                                    x02 x02Var3 = chatAttachAlertPhotoLayout.b;
                                    x02Var3.E0();
                                    x02Var3.W3.B1(4, true, true, 0, 0, 0L, x02Var3.a1(), false, l.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                e52 e52Var = this.H;
                s42 s42Var = this.F;
                if (i == 3) {
                    m52 m52Var = x02Var.k2;
                    if (m52Var != null) {
                        m52Var.P();
                    }
                    Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((jm6) ((Map.Entry) it.next()).getValue()).M) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    final boolean z4 = !z2;
                    gl.d3(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            int i2;
                            int i3;
                            byte b = r3;
                            boolean z5 = z4;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                            switch (b) {
                                case 0:
                                    boolean z6 = ChatAttachAlertPhotoLayout.r1;
                                    x02 x02Var2 = chatAttachAlertPhotoLayout.b;
                                    a8 a8Var = chatAttachAlertPhotoLayout.Z0;
                                    if (z5) {
                                        i2 = 2131751418;
                                    } else {
                                        i2 = 2131751142;
                                    }
                                    a8Var.setText(k96.M0(i2, null));
                                    if (z5) {
                                        a8Var.setIcon(2131232382);
                                        x02Var2.X2.u(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            x02Var2.X2.u(6);
                                            return;
                                        }
                                        return;
                                    }
                                    a8Var.setAnimatedIcon(2131624132);
                                    x02Var2.X2.S(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        x02Var2.X2.S(6);
                                        return;
                                    }
                                    return;
                                default:
                                    boolean z7 = ChatAttachAlertPhotoLayout.r1;
                                    a8 a8Var2 = chatAttachAlertPhotoLayout.b1;
                                    if (z5) {
                                        i3 = 2131745428;
                                    } else {
                                        i3 = 2131745429;
                                    }
                                    a8Var2.setText(k96.M0(i3, null));
                                    if (z5) {
                                        a8Var2.setIcon(2131231872);
                                        return;
                                    } else {
                                        a8Var2.setIcon(2131231869);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (entry.getValue() instanceof jm6) {
                            jm6 jm6Var = (jm6) entry.getValue();
                            jm6Var.M = z4;
                            jm6Var.R = false;
                            arrayList.add(Integer.valueOf(jm6Var.C));
                        }
                    }
                    s42Var.M(new i42((byte) 0, arrayList, z4));
                    if (x02Var.v2 != this) {
                        e52Var.f();
                    }
                    m52 m52Var2 = x02Var.k2;
                    if (m52Var2 != null) {
                        m52Var2.w.invalidate();
                    }
                } else if (i == 2) {
                    m52 m52Var3 = x02Var.k2;
                    if (m52Var3 != null) {
                        m52Var3.P();
                    }
                    Iterator it2 = hashMap.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((jm6) ((Map.Entry) it2.next()).getValue()).c()) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    final boolean z5 = !z;
                    gl.d3(new Runnable(this) {
                        public final ChatAttachAlertPhotoLayout b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            int i2;
                            int i3;
                            byte b = r3;
                            boolean z52 = z5;
                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                            switch (b) {
                                case 0:
                                    boolean z6 = ChatAttachAlertPhotoLayout.r1;
                                    x02 x02Var2 = chatAttachAlertPhotoLayout.b;
                                    a8 a8Var = chatAttachAlertPhotoLayout.Z0;
                                    if (z52) {
                                        i2 = 2131751418;
                                    } else {
                                        i2 = 2131751142;
                                    }
                                    a8Var.setText(k96.M0(i2, null));
                                    if (z52) {
                                        a8Var.setIcon(2131232382);
                                        x02Var2.X2.u(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            x02Var2.X2.u(6);
                                            return;
                                        }
                                        return;
                                    }
                                    a8Var.setAnimatedIcon(2131624132);
                                    x02Var2.X2.S(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        x02Var2.X2.S(6);
                                        return;
                                    }
                                    return;
                                default:
                                    boolean z7 = ChatAttachAlertPhotoLayout.r1;
                                    a8 a8Var2 = chatAttachAlertPhotoLayout.b1;
                                    if (z52) {
                                        i3 = 2131745428;
                                    } else {
                                        i3 = 2131745429;
                                    }
                                    a8Var2.setText(k96.M0(i3, null));
                                    if (z52) {
                                        a8Var2.setIcon(2131231872);
                                        return;
                                    } else {
                                        a8Var2.setIcon(2131231869);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        if (entry2.getValue() instanceof jm6) {
                            jm6 jm6Var2 = (jm6) entry2.getValue();
                            jm6Var2.z = Boolean.valueOf(z5);
                            jm6Var2.R = false;
                            arrayList2.add(Integer.valueOf(jm6Var2.C));
                        }
                    }
                    s42Var.M(new i42((byte) 1, arrayList2, z5));
                    if (x02Var.v2 != this) {
                        e52Var.f();
                    }
                    m52 m52Var4 = x02Var.k2;
                    if (m52Var4 != null) {
                        m52Var4.w.invalidate();
                    }
                } else if (i == 4) {
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
                            byte b = x02Var.N2;
                            org.telegram.ui.ActionBar.d dVar3 = x02Var.Z1;
                            if (b != 0) {
                                dVar3.startActivityForResult(createChooser, 14);
                            } else {
                                dVar3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            byte b2 = x02Var.N2;
                            org.telegram.ui.ActionBar.d dVar4 = x02Var.Z1;
                            if (b2 != 0) {
                                dVar4.startActivityForResult(intent3, 14);
                            } else {
                                dVar4.startActivityForResult(intent3, 1);
                            }
                        }
                        x02Var.a(true);
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                } else if (i == 7) {
                    if (x02Var.v2 == x02Var.k2) {
                        z3 = false;
                    }
                    x02Var.J1(z3);
                } else if (i == 9) {
                    jva.j1(getContext(), getStarsPrice(), true, new defpackage.f(this, (byte) 28), this.a);
                } else if (i >= 10) {
                    xl6 xl6Var = (xl6) this.W0.get(i - 10);
                    this.U0 = xl6Var;
                    xl6 xl6Var2 = this.V0;
                    TextView textView = this.y;
                    if (xl6Var == xl6Var2) {
                        textView.setText(k96.M0(2131752226, null));
                    } else {
                        textView.setText(xl6Var.c);
                    }
                    e52Var.f();
                    this.w.f();
                    this.G.g1(0, -(s42Var.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void x0() {
        ArrayList arrayList;
        w42 w42Var = this.x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w42Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        if (this.w0) {
            if (t0()) {
                arrayList = MediaController.c2;
            } else {
                arrayList = MediaController.d2;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.W0 = arrayList2;
            Collections.sort(arrayList2, new m42(arrayList, (byte) 0));
        } else {
            this.W0 = new ArrayList();
        }
        boolean isEmpty = this.W0.isEmpty();
        TextView textView = this.y;
        if (isEmpty) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.W0.size();
        for (int i = 0; i < size; i++) {
            xl6 xl6Var = (xl6) this.W0.get(i);
            kc kcVar = new kc(getContext(), xl6Var.d, xl6Var.c, xl6Var.e.size(), this.a);
            w42Var.getPopupLayout().addView(kcVar);
            kcVar.setOnClickListener(new v0(this, i + 10, (byte) 4));
        }
    }

    @Override
    public final void y() {
        boolean z;
        x02 x02Var = this.b;
        if (x02Var != null && (x02Var.Z1 instanceof mu1)) {
            z = true;
        } else {
            z = false;
        }
        V(z);
    }

    public final void y0() {
        s42 s42Var = this.F;
        if (s42Var != null) {
            for (int i = 0; i < s42Var.getChildCount(); i++) {
                View childAt = s42Var.getChildAt(i);
                if (childAt instanceof o48) {
                    ((o48) childAt).a.invalidate();
                }
            }
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (this.b.Z1 instanceof mu1) {
            s42 s42Var = this.F;
            int childCount = s42Var.getChildCount();
            int i = 0;
            while (true) {
                arrayList = u1;
                if (i >= childCount) {
                    break;
                }
                View childAt = s42Var.getChildAt(i);
                if (childAt instanceof o48) {
                    o48 o48Var = (o48) childAt;
                    jm6 d0 = d0(((Integer) o48Var.getTag()).intValue());
                    if (d0 != null) {
                        o48Var.setNum(arrayList.indexOf(Integer.valueOf(d0.C)));
                    }
                }
                i++;
            }
            s42 s42Var2 = this.r;
            int childCount2 = s42Var2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = s42Var2.getChildAt(i2);
                if (childAt2 instanceof o48) {
                    o48 o48Var2 = (o48) childAt2;
                    jm6 d02 = d0(((Integer) o48Var2.getTag()).intValue());
                    if (d02 != null) {
                        o48Var2.setNum(arrayList.indexOf(Integer.valueOf(d02.C)));
                    }
                }
            }
        }
    }
}
