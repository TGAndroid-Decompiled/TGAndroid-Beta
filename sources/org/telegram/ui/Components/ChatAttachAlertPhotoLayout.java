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
public class ChatAttachAlertPhotoLayout extends a22 implements jm7 {
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
    public final d62 F;
    public final Rect F0;
    public final as0 G;
    public float G0;
    public final p62 H;
    public boolean H0;
    public final r34 I;
    public boolean I0;
    public final y69 J;
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
    public m62 Q;
    public boolean Q0;
    public final n62 R;
    public boolean R0;
    public final k62 S;
    public boolean S0;
    public final ImageView[] T;
    public int T0;
    public boolean U;
    public yn6 U0;
    public final float[] V;
    public yn6 V0;
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
    public final k57 e1;
    public float f0;
    public final boolean f1;
    public final int[] g0;
    public final po g1;
    public int h0;
    public boolean h1;
    public a62 i0;
    public final g62 i1;
    public final DecelerateInterpolator j0;
    public boolean j1;
    public final yd k0;
    public float k1;
    public final ShutterButton l0;
    public float l1;
    public final b1d m0;
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
    public final d62 r;
    public final TextView r0;
    public final zs s;
    public final ImageView s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final p62 w;
    public boolean w0;
    public final h62 x;
    public boolean x0;
    public final TextView y;
    public boolean y0;
    public boolean z0;

    public ChatAttachAlertPhotoLayout(i22 i22Var, Context context, boolean z, boolean z2, ylb ylbVar) {
        super(i22Var, ylbVar, context);
        boolean z3;
        this.T = new ImageView[2];
        this.V = new float[2];
        this.W = new int[2];
        this.g0 = new int[5];
        this.j0 = new DecelerateInterpolator(1.5f);
        this.p0 = null;
        this.F0 = new Rect();
        int L = gm.L(80.0f);
        this.L0 = L;
        this.M0 = L;
        this.N0 = (byte) 3;
        this.Y0 = true;
        this.g1 = new po(null);
        this.i1 = new g62(this);
        this.f1 = z;
        this.n = z2;
        nm7.e().b(this, nm7.r2);
        nm7.e().b(this, nm7.p4);
        dy0 dy0Var = i22Var.c;
        i22 i22Var2 = this.b;
        if (i22Var2.N2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.h1 = z3;
        h62 h62Var = new h62(this, context, i22Var2.U2.t(), ylbVar, (byte) 0);
        this.x = h62Var;
        h62Var.setSubMenuOpenSide(1);
        FrameLayout.LayoutParams d = qoe.d(-2, -1.0f, 51, 60.0f, 0.0f, 40.0f, 0.0f);
        d.topMargin = gm.m;
        this.b.U2.addView(h62Var, 0, d);
        h62Var.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                m62 m62Var;
                m62 m62Var2;
                byte b = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (b) {
                    case 0:
                        boolean z4 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.t0 && (m62Var = chatAttachAlertPhotoLayout.Q) != null && m62Var.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new c62(chatAttachAlertPhotoLayout, (byte) 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        boolean z5 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.U && (m62Var2 = chatAttachAlertPhotoLayout.Q) != null && m62Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, gm.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -gm.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(d53.f);
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
        int i = cmb.i5;
        anb.X(textView, i, ylbVar);
        textView.setText(jb6.M0(2131752175, null));
        textView.setTypeface(gm.o());
        Drawable d2 = b10.d(context, 2131231257);
        this.E = d2;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.x(this, d2, i, ylbVar, mode);
        textView.setPadding(0, 0, gm.L(10.0f), 0);
        h62Var.addView(textView, qoe.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        U(false);
        k57 k57Var = new k57(context, 2131624139, jb6.M0(2131752513, null), 2131624138, jb6.M0(2131752512, null), ylbVar);
        this.e1 = k57Var;
        k57Var.a(!this.b.W1, false);
        this.d1 = this.b.X2.e(7, 2131232426, jb6.M0(2131753922, null));
        this.b.X2.a(5);
        this.b.X2.e(4, 2131232271, jb6.M0(2131747529, null));
        this.a1 = this.b.X2.e(1, 2131232138, jb6.M0(2131745319, null));
        this.b.X2.e(0, 2131232417, jb6.M0(2131745318, null));
        this.b.X2.a(6);
        this.Z0 = this.b.X2.e(3, 2131232382, jb6.M0(2131751091, null));
        this.b1 = this.b.X2.e(2, 2131231870, jb6.M0(2131745355, null));
        r7 r7Var = this.b.X2;
        r7Var.q();
        k57Var.setMinimumWidth(gm.L(196.0f));
        k57Var.setTag(8);
        r7Var.b.addView(k57Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) k57Var.getLayoutParams();
        if (jb6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gm.L(48.0f);
        k57Var.setLayoutParams(layoutParams);
        k57Var.setOnClickListener(new s6(r7Var, (byte) 2));
        this.c1 = this.b.X2.e(9, 2131231814, jb6.M0(2131747463, null));
        this.b.X2.setFitSubItems(true);
        d62 d62Var = new d62(this, context, ylbVar, (byte) 1);
        this.F = d62Var;
        d62Var.setFastScrollEnabled(1);
        d62Var.setFastScrollVisible(true);
        d62Var.getFastScroll().setAlpha(0.0f);
        d62Var.getFastScroll().a = false;
        d62Var.getFastScroll().i0 = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        p62 p62Var = new p62(this, context, z2);
        this.H = p62Var;
        d62Var.setAdapter(p62Var);
        n62 n62Var = new n62(this, d62Var);
        this.R = n62Var;
        d62Var.i(n62Var);
        int i2 = 0;
        for (int i3 = 8; i2 < i3; i3 = 8) {
            p62Var.h.add(p62Var.L());
            i2++;
        }
        d62Var.setClipToPadding(false);
        d62Var.setItemAnimator(null);
        d62Var.setLayoutAnimation(null);
        d62Var.setVerticalScrollBarEnabled(false);
        anb.l(d62Var, 21, cmb.z5, ylbVar);
        addView(d62Var, qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        d62Var.setOnScrollListener(new i62(this, (byte) 0));
        as0 as0Var = new as0(this, this.L0, (byte) 2);
        this.G = as0Var;
        as0Var.O = new zr1(this, (byte) 2);
        d62Var.setLayoutManager(as0Var);
        d62Var.setOnItemClickListener(new ci(this, z2, ylbVar, (byte) 5));
        d62Var.setOnItemLongClickListener(new q52(this, (byte) 2));
        y69 y69Var = new y69(new nl9(this, (byte) 19));
        this.J = y69Var;
        d62Var.F.add(y69Var);
        setBlur3Capture(d62Var);
        this.d = d62Var;
        this.f = true;
        r34 r34Var = new r34(context, ylbVar);
        this.I = r34Var;
        r34Var.setText(jb6.M0(2131747914, null));
        r34Var.setOnTouchListener(null);
        r34Var.setTextSize(16);
        addView(r34Var, qoe.c(-2.0f, -1));
        if (this.Y0) {
            r34Var.b();
        } else {
            r34Var.c();
        }
        Paint paint = new Paint(1);
        paint.setColor(-2468275);
        k62 k62Var = new k62(context, paint);
        this.S = k62Var;
        gm.T3(k62Var, false, 1.0f, true, false);
        k62Var.setBackgroundResource(2131232788);
        k62Var.getBackground().setColorFilter(new PorterDuffColorFilter(1711276032, mode));
        k62Var.setTextSize(1, 15.0f);
        k62Var.setTypeface(gm.o());
        k62Var.setAlpha(0.0f);
        k62Var.setTextColor(-1);
        k62Var.setPadding(gm.L(24.0f), gm.L(5.0f), gm.L(10.0f), gm.L(5.0f));
        dy0Var.addView(k62Var, qoe.d(-2, -2.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        yd ydVar = new yd((byte) 11, context, this);
        this.k0 = ydVar;
        ydVar.setVisibility(8);
        ydVar.setAlpha(0.0f);
        dy0Var.addView(ydVar, qoe.e(-1, 126, 83));
        TextView textView2 = new TextView(context);
        this.q0 = textView2;
        textView2.setBackgroundResource(2131232553);
        textView2.setVisibility(8);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.setTypeface(gm.o());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131232551, 0);
        textView2.setCompoundDrawablePadding(gm.L(4.0f));
        textView2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        dy0Var.addView(textView2, qoe.d(-2, 38.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                m62 m62Var;
                m62 m62Var2;
                byte b = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (b) {
                    case 0:
                        boolean z4 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.t0 && (m62Var = chatAttachAlertPhotoLayout.Q) != null && m62Var.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new c62(chatAttachAlertPhotoLayout, (byte) 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        boolean z5 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.U && (m62Var2 = chatAttachAlertPhotoLayout.Q) != null && m62Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, 0.0f, gm.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, property, -gm.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(d53.f);
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
        b1d b1dVar = new b1d(context);
        this.m0 = b1dVar;
        b1dVar.setVisibility(8);
        b1dVar.setAlpha(0.0f);
        dy0Var.addView(b1dVar, qoe.d(-2, 50.0f, 51, 0.0f, 0.0f, 0.0f, 116.0f));
        b1dVar.setDelegate(new q52(this, (byte) 3));
        ?? view = new View(context);
        view.b = new DecelerateInterpolator();
        view.x = new ei7(view, (byte) 29);
        view.a = view.getResources().getDrawable(2131230929);
        Paint paint2 = new Paint(1);
        view.c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        view.d = paint3;
        paint3.setStyle(style);
        paint3.setColor(-3324089);
        view.f = aja.a;
        this.l0 = view;
        ydVar.addView((View) view, qoe.e(84, 84, 17));
        view.setDelegate(new b62(this, ylbVar, dy0Var));
        view.setFocusable(true);
        view.setContentDescription(jb6.M0(2131754759, null));
        ImageView imageView = new ImageView(context);
        this.s0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ydVar.addView(imageView, qoe.e(48, 48, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertPhotoLayout b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                m62 m62Var;
                m62 m62Var2;
                byte b = r2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                switch (b) {
                    case 0:
                        boolean z4 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.t0 && (m62Var = chatAttachAlertPhotoLayout.Q) != null && m62Var.isInited()) {
                            chatAttachAlertPhotoLayout.d0 = false;
                            chatAttachAlertPhotoLayout.Q.switchCamera();
                            ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, View.SCALE_X, 0.0f).setDuration(100L);
                            duration.addListener(new c62(chatAttachAlertPhotoLayout, (byte) 0));
                            duration.start();
                            return;
                        }
                        return;
                    case 1:
                        boolean z5 = ChatAttachAlertPhotoLayout.r1;
                        if (!chatAttachAlertPhotoLayout.U && (m62Var2 = chatAttachAlertPhotoLayout.Q) != null && m62Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, gm.L(48.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -gm.L(48.0f), 0.0f);
                                Property property2 = View.ALPHA;
                                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                animatorSet.setDuration(220L);
                                animatorSet.setInterpolator(d53.f);
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
        imageView.setContentDescription(jb6.M0(2131754751, null));
        for (int i4 = 0; i4 < 2; i4++) {
            this.T[i4] = new ImageView(context);
            this.T[i4].setScaleType(ImageView.ScaleType.CENTER);
            this.T[i4].setVisibility(4);
            this.k0.addView(this.T[i4], qoe.e(48, 48, 51));
            this.T[i4].setOnClickListener(new View.OnClickListener(this) {
                public final ChatAttachAlertPhotoLayout b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    m62 m62Var;
                    m62 m62Var2;
                    byte b = r2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
                    switch (b) {
                        case 0:
                            boolean z4 = ChatAttachAlertPhotoLayout.r1;
                            if (!chatAttachAlertPhotoLayout.t0 && (m62Var = chatAttachAlertPhotoLayout.Q) != null && m62Var.isInited()) {
                                chatAttachAlertPhotoLayout.d0 = false;
                                chatAttachAlertPhotoLayout.Q.switchCamera();
                                ObjectAnimator duration = ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.s0, View.SCALE_X, 0.0f).setDuration(100L);
                                duration.addListener(new c62(chatAttachAlertPhotoLayout, (byte) 0));
                                duration.start();
                                return;
                            }
                            return;
                        case 1:
                            boolean z5 = ChatAttachAlertPhotoLayout.r1;
                            if (!chatAttachAlertPhotoLayout.U && (m62Var2 = chatAttachAlertPhotoLayout.Q) != null && m62Var2.isInited() && chatAttachAlertPhotoLayout.c0) {
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
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, 0.0f, gm.L(48.0f));
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property, -gm.L(48.0f), 0.0f);
                                    Property property2 = View.ALPHA;
                                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view2, property2, 1.0f, 0.0f), ObjectAnimator.ofFloat(imageView2, property2, 0.0f, 1.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(d53.f);
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
        textView3.setText(jb6.M0(2131743955, null));
        textView3.setShadowLayer(gm.L(3.33333f), 0.0f, gm.L(0.666f), 1275068416);
        textView3.setPadding(gm.L(6.0f), 0, gm.L(6.0f), 0);
        this.k0.addView(textView3, qoe.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        d62 d62Var2 = new d62(this, context, ylbVar, (byte) 0);
        this.r = d62Var2;
        d62Var2.setVerticalScrollBarEnabled(true);
        p62 p62Var2 = new p62(this, context, false);
        this.w = p62Var2;
        d62Var2.setAdapter(p62Var2);
        for (int i5 = 0; i5 < 8; i5++) {
            p62Var2.h.add(p62Var2.L());
        }
        d62Var2.setClipToPadding(false);
        d62Var2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        d62Var2.setItemAnimator(null);
        d62Var2.setLayoutAnimation(null);
        d62Var2.setOverScrollMode(2);
        d62Var2.setVisibility(4);
        d62Var2.setAlpha(0.0f);
        dy0Var.addView(d62Var2, qoe.c(80.0f, -1));
        zs zsVar = new zs((byte) 3, 0, false);
        this.s = zsVar;
        d62Var2.setLayoutManager(zsVar);
        d62Var2.setOnItemClickListener(new l5((byte) 2));
    }

    public static boolean S() {
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof jo6) {
                    jo6 jo6Var = (jo6) entry.getValue();
                    if (jo6Var.d() && jo6Var.j()) {
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
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = u1;
            if (i >= arrayList.size()) {
                break;
            }
            Object obj = t1.get(arrayList.get(i));
            if (obj instanceof jo6) {
                charSequence = ((jo6) obj).a;
            } else if (obj instanceof no6) {
                charSequence = ((no6) obj).I;
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
                if ((entry.getValue() instanceof jo6) && ((jo6) entry.getValue()).d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int getTopScrollOffset() {
        return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gm.L(7.0f) + this.q1;
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
                imageView.setImageResource(2131231198);
                imageView.setContentDescription(jb6.M0(2131754913, null));
                return;
            case 1:
                imageView.setImageResource(2131231197);
                imageView.setContentDescription(jb6.M0(2131754914, null));
                return;
            case 2:
                imageView.setImageResource(2131231196);
                imageView.setContentDescription(jb6.M0(2131754915, null));
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
    public final void A() {
        ShutterButton shutterButton = this.l0;
        if (shutterButton == null) {
            return;
        }
        boolean z = this.R0;
        m62 m62Var = this.Q;
        aja ajaVar = aja.a;
        aja ajaVar2 = aja.b;
        if (!z) {
            if (m62Var != null && shutterButton.getState() == ajaVar2) {
                o0();
                CameraController.getInstance().stopVideoRecording(this.Q.getCameraSession(), false);
                shutterButton.a(ajaVar);
            }
            if (this.c0) {
                b0(false);
            }
            f0(true);
            return;
        }
        if (m62Var != null && shutterButton.getState() == ajaVar2) {
            shutterButton.a(ajaVar);
        }
        this.R0 = false;
    }

    public final void A0() {
        ArrayList arrayList;
        p62 p62Var;
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
        i22 i22Var = this.b;
        org.telegram.ui.ActionBar.d dVar = i22Var.Z1;
        org.telegram.ui.ActionBar.d dVar2 = i22Var.Z1;
        if (dVar instanceof yv1) {
            d62 d62Var = this.F;
            int childCount = d62Var.getChildCount();
            int i2 = 0;
            while (true) {
                arrayList = u1;
                p62Var = this.H;
                hashMap = t1;
                int i3 = -1;
                if (i2 >= childCount) {
                    break;
                }
                View childAt = d62Var.getChildAt(i2);
                if (childAt instanceof q68) {
                    q68 q68Var = (q68) childAt;
                    int R = RecyclerView.R(childAt);
                    if (p62Var.f && R > this.N0) {
                        R--;
                    }
                    if (p62Var.d && this.U0 == this.V0) {
                        R--;
                    }
                    jo6 d0 = d0(R);
                    if (d0 != null && d0.M) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    q68Var.setHasSpoiler(z5);
                    if (d0 != null && d0.c()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    q68Var.setHighQuality(z6);
                    if ((dVar2 instanceof yv1) && i22Var.Q3) {
                        if (d0 != null) {
                            i3 = arrayList.indexOf(Integer.valueOf(d0.C));
                        }
                        if (d0 != null && hashMap.containsKey(Integer.valueOf(d0.C))) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        q68Var.b(i3, z8, true);
                    } else {
                        if (d0 != null && hashMap.containsKey(Integer.valueOf(d0.C))) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        q68Var.b(-1, z7, true);
                    }
                }
                i2++;
            }
            d62 d62Var2 = this.r;
            int childCount2 = d62Var2.getChildCount();
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = d62Var2.getChildAt(i4);
                if (childAt2 instanceof q68) {
                    q68 q68Var2 = (q68) childAt2;
                    int R2 = RecyclerView.R(childAt2);
                    if (p62Var.f && R2 > this.N0) {
                        R2--;
                    }
                    if (p62Var.d && this.U0 == this.V0) {
                        R2--;
                    }
                    jo6 d02 = d0(R2);
                    if (d02 != null && d02.M) {
                        z = true;
                    } else {
                        z = false;
                    }
                    q68Var2.setHasSpoiler(z);
                    if (d02 != null && d02.c()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    q68Var2.setHighQuality(z2);
                    if ((dVar2 instanceof yv1) && i22Var.Q3) {
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
                        q68Var2.b(i, z4, true);
                    } else {
                        if (d02 != null && hashMap.containsKey(Integer.valueOf(d02.C))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        q68Var2.b(-1, z3, true);
                    }
                }
            }
        }
    }

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.B(int, int):void");
    }

    public final void B0(boolean z) {
        boolean z2;
        TextView textView = this.q0;
        if (textView != null) {
            i22 i22Var = this.b;
            byte b = i22Var.N2;
            TextView textView2 = i22Var.g3;
            if (b == 0 && !i22Var.Q2 && !i22Var.B1) {
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
                    if (((jo6) ((Map.Entry) it.next()).getValue()).b) {
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
                        textView.setText(jb6.G(hashMap.size(), "Media", new Object[0]).toUpperCase());
                        if (max != this.N || z) {
                            textView2.setText(jb6.G(max, "MediaSelected", new Object[0]));
                        }
                    } else {
                        textView.setText(jb6.G(hashMap.size(), "Videos", new Object[0]).toUpperCase());
                        if (max != this.N || z) {
                            textView2.setText(jb6.G(max, "VideosSelected", new Object[0]));
                        }
                    }
                } else {
                    textView.setText(jb6.G(hashMap.size(), "Photos", new Object[0]).toUpperCase());
                    if (max != this.N || z) {
                        textView2.setText(jb6.G(max, "PhotosSelected", new Object[0]));
                    }
                }
                if (max <= 1) {
                    z2 = false;
                }
                i22Var.G1 = z2;
                i22Var.j3.setVisibility((!z2 || i22Var.N2 == 2) ? 8 : 8);
                this.N = max;
            }
        }
    }

    @Override
    public final void C() {
        i22 i22Var = this.b;
        if (i22Var.isShowing() && !i22Var.J && !PhotoViewer.r0().V0()) {
            U(false);
        }
    }

    @Override
    public final void E(int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertPhotoLayout.E(int):void");
    }

    @Override
    public final boolean G(int i) {
        if (this.c0) {
            if (i == 24 || i == 25 || i == 79 || i == 85) {
                ((b62) this.l0.getDelegate()).a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void H(a22 a22Var) {
        ViewPropertyAnimator viewPropertyAnimator = this.p1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.x.setVisibility(0);
        boolean z = a22Var instanceof x62;
        TextView textView = this.y;
        if (!z) {
            a0();
            textView.setAlpha(1.0f);
        } else {
            ViewPropertyAnimator interpolator = textView.animate().alpha(1.0f).setDuration(150L).setInterpolator(d53.j);
            this.p1 = interpolator;
            interpolator.start();
        }
        this.b.U2.setTitle("");
        this.G.g1(0, 0);
        if (z) {
            this.F.post(new lx1(this, a22Var, (byte) 20));
        }
        W();
        p0();
    }

    @Override
    public final void I() {
        this.O = false;
        m62 m62Var = this.Q;
        if (m62Var != null) {
            m62Var.setVisibility(0);
        }
        if (this.v0) {
            this.v0 = false;
            U(true);
        }
    }

    @Override
    public final void J() {
        this.F.z0(0);
    }

    public final int Q(jo6 jo6Var, int i) {
        boolean z;
        Integer valueOf = Integer.valueOf(jo6Var.C);
        HashMap hashMap = t1;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = u1;
        if (containsKey) {
            jo6Var.N = 0L;
            jo6Var.M = false;
            jo6Var.O = null;
            jo6Var.z = null;
            hashMap.remove(valueOf);
            int indexOf = arrayList.indexOf(valueOf);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            B0(false);
            z0();
            if (i >= 0) {
                jo6Var.e();
                this.i1.Y(i);
            }
            return indexOf;
        }
        jo6Var.N = getStarsPrice();
        if (getStarsPrice() > 0) {
            z = true;
        } else {
            z = false;
        }
        jo6Var.M = z;
        jo6Var.R = false;
        if (e0()) {
            jo6Var.O = Boolean.valueOf(!S());
        }
        jo6Var.z = Boolean.valueOf(jo6Var.c());
        boolean X = X(true);
        hashMap.put(valueOf, jo6Var);
        arrayList.add(valueOf);
        if (X) {
            A0();
            return -1;
        }
        B0(true);
        return -1;
    }

    public final void R() {
        m62 m62Var = this.Q;
        if (m62Var != null) {
            if (!this.c0) {
                m62Var.setTranslationX(this.V[0]);
            }
            int i = this.L0;
            int L = gm.L(2.0f) + (i << 1);
            if (!this.c0) {
                this.Q.setClipTop((int) this.a0);
                this.Q.setClipBottom((int) this.b0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
                if (layoutParams.height != L || layoutParams.width != i) {
                    layoutParams.width = i;
                    layoutParams.height = L;
                    this.Q.setLayoutParams(layoutParams);
                    gm.c3(new lx1(this, layoutParams, (byte) 21));
                }
            }
        }
    }

    public final void U(boolean z) {
        org.telegram.ui.ActionBar.d dVar;
        boolean z2;
        p62 p62Var;
        i22 i22Var = this.b;
        boolean z3 = i22Var.P1;
        org.telegram.ui.ActionBar.d dVar2 = i22Var.Z1;
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
                if (!gda.v0) {
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
                        if (z || gda.L0) {
                            CameraController.getInstance().initCamera(null);
                        }
                        z6 = CameraController.getInstance().isCameraInitied();
                        this.O0 = z6;
                    }
                }
                if ((z4 != z6 || z5 != this.P0) && (p62Var = this.H) != null) {
                    p62Var.f();
                }
                if (!i22Var.P1 && i22Var.isShowing() && this.O0 && ((Paint) i22Var.Z.b).getAlpha() != 0 && !this.c0) {
                    v0();
                }
            }
        }
    }

    public final void W() {
        u69 K;
        float[] fArr;
        int i;
        float f;
        int systemWindowInsetTop;
        if (!PhotoViewer.C0() || PhotoViewer.r0().o5 == null || !PhotoViewer.r0().o5.W) {
            m62 m62Var = this.Q;
            if (m62Var != null) {
                m62Var.invalidateOutline();
            }
            d62 d62Var = this.F;
            u69 K2 = d62Var.K(this.N0 - 1);
            if (K2 != null) {
                K2.a.invalidateOutline();
            }
            if ((!this.H.d || !this.O0 || this.U0 != this.V0) && (K = d62Var.K(0)) != null) {
                K.a.invalidateOutline();
            }
            m62 m62Var2 = this.Q;
            if (m62Var2 != null) {
                m62Var2.invalidate();
            }
            k62 k62Var = this.S;
            if (k62Var != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) k62Var.getLayoutParams();
                if (getRootWindowInsets() == null) {
                    systemWindowInsetTop = gm.L(16.0f);
                } else {
                    systemWindowInsetTop = getRootWindowInsets().getSystemWindowInsetTop() + gm.L(2.0f);
                }
                marginLayoutParams.topMargin = systemWindowInsetTop;
            }
            if (!this.O0) {
                return;
            }
            int childCount = d62Var.getChildCount();
            int i2 = 0;
            while (true) {
                fArr = this.V;
                if (i2 >= childCount) {
                    break;
                }
                View childAt = d62Var.getChildAt(i2);
                if (childAt instanceof k68) {
                    if (childAt.isAttachedToWindow()) {
                        float y = getY() + d62Var.getY() + childAt.getY();
                        i22 i22Var = this.b;
                        ViewGroup viewGroup = i22Var.b;
                        i12 i12Var = i22Var.v3;
                        su suVar = i22Var.L2;
                        float y2 = viewGroup.getY() + y;
                        float x = (i22Var.b.getX() + (getX() + (d62Var.getX() + childAt.getX()))) - getRootWindowInsets().getSystemWindowInsetLeft();
                        if (!i22Var.a2) {
                            i = gm.m;
                        } else {
                            i = 0;
                        }
                        float alpha = (suVar.getAlpha() * suVar.getMeasuredHeight()) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + i;
                        lc1 lc1Var = i22Var.B4;
                        if (lc1Var != null && lc1Var.g()) {
                            alpha = Math.max(alpha, (i22Var.B4.e() + i22Var.B4.getY()) - i22Var.i4);
                        }
                        if (y < alpha) {
                            f = alpha - y;
                        } else {
                            f = 0.0f;
                        }
                        if (f != this.a0) {
                            this.a0 = f;
                            m62 m62Var3 = this.Q;
                            if (m62Var3 != null) {
                                m62Var3.invalidateOutline();
                                this.Q.invalidate();
                            }
                        }
                        float translationY = (int) (i12Var.getTranslationY() + (i22Var.b.getMeasuredHeight() - i12Var.getMeasuredHeight()));
                        lc1 lc1Var2 = i22Var.B4;
                        if (lc1Var2 != null) {
                            translationY -= lc1Var2.d() - gm.L(6.0f);
                        }
                        if (childAt.getMeasuredHeight() + y > translationY) {
                            this.b0 = Math.min(-gm.L(5.0f), y - translationY) + childAt.getMeasuredHeight();
                        } else {
                            this.b0 = 0.0f;
                        }
                        fArr[0] = x;
                        fArr[1] = y2;
                        R();
                        return;
                    }
                } else {
                    i2++;
                }
            }
            if (this.a0 != 0.0f) {
                this.a0 = 0.0f;
                m62 m62Var4 = this.Q;
                if (m62Var4 != null) {
                    m62Var4.invalidateOutline();
                    this.Q.invalidate();
                }
            }
            fArr[0] = gm.L(-400.0f);
            fArr[1] = 0.0f;
            R();
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
                if (!(obj instanceof jo6)) {
                    break;
                }
                Q((jo6) obj, -1);
                z2 = true;
            } else {
                break;
            }
        }
        return z2;
    }

    public final boolean Y(jo6 jo6Var) {
        boolean z = this.x0;
        ylb ylbVar = this.a;
        i22 i22Var = this.b;
        if (!z && jo6Var.b) {
            if (!i22Var.F0()) {
                mlb.y(null, 2131749312, new c41(i22Var.o3, ylbVar), null);
                return true;
            }
        } else if (!this.y0 && !jo6Var.b) {
            if (!i22Var.F0()) {
                mlb.y(null, 2131749316, new c41(i22Var.o3, ylbVar), null);
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
        jo6 jo6Var;
        int i = 0;
        while (true) {
            ArrayList arrayList = u1;
            if (i < arrayList.size()) {
                if (i == 0) {
                    Object obj = arrayList.get(i);
                    HashMap hashMap = t1;
                    Object obj2 = hashMap.get(obj);
                    if (obj2 instanceof jo6) {
                        jo6 clone = ((jo6) obj2).clone();
                        CharSequence[] charSequenceArr = {editable};
                        clone.n = hs6.d0(z8c.t0).Y(charSequenceArr, false, true);
                        clone.a = charSequenceArr[0];
                        jo6Var = clone;
                    } else {
                        boolean z = obj2 instanceof no6;
                        jo6Var = obj2;
                        if (z) {
                            no6 clone2 = ((no6) obj2).clone();
                            CharSequence[] charSequenceArr2 = {editable};
                            clone2.n = hs6.d0(z8c.t0).Y(charSequenceArr2, false, true);
                            clone2.I = charSequenceArr2[0];
                            jo6Var = clone2;
                        }
                    }
                    hashMap.put(obj, jo6Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void a0() {
        String M0 = jb6.M0(2131751091, null);
        a8 a8Var = this.Z0;
        a8Var.setText(M0);
        a8Var.setAnimatedIcon(2131624132);
        this.b.X2.S(1);
        HashMap hashMap = t1;
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((jo6) entry.getValue()).e();
            }
            hashMap.clear();
            u1.clear();
        }
        ArrayList arrayList = s1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                jo6 jo6Var = (jo6) arrayList.get(i);
                new File(jo6Var.I).delete();
                if (jo6Var.h != null) {
                    new File(jo6Var.h).delete();
                }
                if (jo6Var.c != null) {
                    new File(jo6Var.c).delete();
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
        m62 m62Var;
        if (!this.t0 && this.Q != null) {
            int i = this.L0;
            int[] iArr = this.g0;
            iArr[1] = i;
            iArr[2] = gm.L(2.0f) + (i << 1);
            Runnable runnable = this.o0;
            if (runnable != null) {
                gm.r(runnable);
                this.o0 = null;
            }
            if (gm.B(cmb.v0(cmb.Z6, this.a)) > 0.721d) {
                z2 = true;
            } else {
                z2 = false;
            }
            gm.i3(this.b, z2);
            TextView textView = this.q0;
            d62 d62Var = this.r;
            yd ydVar = this.k0;
            d62 d62Var2 = this.F;
            ImageView[] imageViewArr = this.T;
            b1d b1dVar = this.m0;
            if (z) {
                this.k1 = this.Q.getTranslationY();
                this.e0 = true;
                if (d62Var2 != null) {
                    d62Var2.invalidate();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f));
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(ydVar, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(b1dVar, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(d62Var, property, 0.0f));
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
                animatorSet.setInterpolator(d53.f);
                animatorSet.addListener(new c62(this, (byte) 3));
                animatorSet.start();
            } else {
                this.j1 = false;
                setAlertKeepScreenOn(false);
                setCameraOpenProgress(0.0f);
                iArr[0] = 0;
                setCameraOpenProgress(0.0f);
                ydVar.setAlpha(0.0f);
                ydVar.setVisibility(8);
                b1dVar.setAlpha(0.0f);
                b1dVar.setTag(null);
                b1dVar.setVisibility(8);
                d62Var.setAlpha(0.0f);
                textView.setAlpha(0.0f);
                d62Var.setVisibility(8);
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
                m62 m62Var2 = this.Q;
                if (m62Var2 != null) {
                    m62Var2.setFpsLimit(30);
                    this.Q.setSystemUiVisibility(1024);
                }
                if (d62Var2 != null) {
                    d62Var2.invalidate();
                }
            }
            m62 m62Var3 = this.Q;
            if (m62Var3 != null) {
                m62Var3.setImportantForAccessibility(0);
            }
            d62Var2.setImportantForAccessibility(0);
            if (!e86.e(360928) && (m62Var = this.Q) != null) {
                m62Var.showTexture(false, z);
            }
        }
    }

    @Override
    public final boolean c() {
        for (Map.Entry entry : t1.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof jo6) {
                if (((jo6) value).x != 0) {
                    return false;
                }
            } else if ((value instanceof no6) && ((no6) value).x != 0) {
                return false;
            }
        }
        return true;
    }

    public final q68 c0(int i) {
        d62 d62Var = this.F;
        int childCount = d62Var.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = d62Var.getChildAt(i2);
            if (childAt.getTop() < d62Var.getMeasuredHeight() - this.b.T0() && (childAt instanceof q68)) {
                q68 q68Var = (q68) childAt;
                if (q68Var.getImageView().getTag() != null && ((Integer) q68Var.getImageView().getTag()).intValue() == i) {
                    return q68Var;
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
            i = cmb.Xg;
        } else {
            i = cmb.i5;
        }
        int i5 = cmb.b7;
        ylb ylbVar = this.a;
        this.I.setTextColor(cmb.v0(i5, ylbVar));
        int i6 = cmb.z5;
        d62 d62Var = this.F;
        anb.H(d62Var, i6, ylbVar);
        d62Var.K(0);
        anb.X(this.y, i, ylbVar);
        if (z) {
            i2 = cmb.Xg;
        } else {
            i2 = cmb.D8;
        }
        int v0 = cmb.v0(i2, ylbVar);
        h62 h62Var = this.x;
        h62Var.O(v0, false);
        if (z) {
            i3 = cmb.Xg;
        } else {
            i3 = cmb.D8;
        }
        h62Var.O(cmb.v0(i3, ylbVar), true);
        if (z) {
            i4 = cmb.Zg;
        } else {
            i4 = cmb.F8;
        }
        h62Var.I(cmb.v0(i4, ylbVar));
        cmb.A1(cmb.v0(i, ylbVar), this.E);
    }

    public final jo6 d0(int i) {
        if (i >= 0) {
            ArrayList arrayList = s1;
            int size = arrayList.size();
            if (i < size) {
                return (jo6) arrayList.get(i);
            }
            int i2 = i - size;
            yn6 yn6Var = this.U0;
            if (yn6Var != null && i2 < yn6Var.e.size()) {
                return (jo6) this.U0.e.get(i2);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        yn6 yn6Var;
        i22 i22Var;
        if (i == nm7.r2) {
            p62 p62Var = this.H;
            if (p62Var != null) {
                if (t0()) {
                    yn6Var = MediaController.a2;
                    this.V0 = yn6Var;
                } else {
                    yn6Var = MediaController.b2;
                    this.V0 = yn6Var;
                }
                if (this.U0 != null && ((i22Var = this.b) == null || !i22Var.A1)) {
                    if (t0()) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= MediaController.c2.size()) {
                                break;
                            }
                            yn6 yn6Var2 = (yn6) MediaController.c2.get(i3);
                            int i4 = yn6Var2.a;
                            yn6 yn6Var3 = this.U0;
                            if (i4 == yn6Var3.a && yn6Var2.b == yn6Var3.b) {
                                this.U0 = yn6Var2;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    this.U0 = yn6Var;
                }
                this.Y0 = false;
                this.I.c();
                p62Var.f();
                this.w.f();
                ArrayList arrayList = u1;
                if (!arrayList.isEmpty() && this.V0 != null) {
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        Integer num = (Integer) arrayList.get(i5);
                        HashMap hashMap = t1;
                        Object obj = hashMap.get(num);
                        jo6 jo6Var = (jo6) this.V0.f.get(num.intValue());
                        if (jo6Var != null) {
                            if (obj instanceof jo6) {
                                jo6Var.g((jo6) obj);
                            }
                            hashMap.put(num, jo6Var);
                        }
                    }
                }
                x0();
            }
        } else if (i == nm7.p4) {
            U(false);
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
            gm.d3(new u52(this, (byte) 0), 300L);
            this.d0 = false;
        }
    }

    public final boolean g0() {
        Activity W = gm.W(getContext());
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
        yn6 yn6Var = this.U0;
        ArrayList<Object> arrayList = s1;
        if (yn6Var != null) {
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
        d62 d62Var = this.F;
        int childCount = d62Var.getChildCount();
        r34 r34Var = this.I;
        if (childCount <= 0) {
            d62Var.setTopGlowOffset(d62Var.getPaddingTop());
            r34Var.setTranslationY(0.0f);
            return Integer.MAX_VALUE;
        }
        View childAt = d62Var.getChildAt(0);
        b59 b59Var = (b59) d62Var.G(childAt);
        int top = childAt.getTop() - this.q1;
        int L = gm.L(7.0f);
        if (top < gm.L(7.0f) || b59Var == null || b59Var.b() != 0) {
            top = L;
        }
        r34Var.setTranslationY(((((getMeasuredHeight() - top) - gm.L(50.0f)) - r34Var.getMeasuredHeight()) / 2.0f) + top);
        d62Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return gm.L(56.0f) + getListTopPadding();
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
            if (obj instanceof jo6) {
                jo6 jo6Var = (jo6) obj;
                if (!jo6Var.b && jo6Var.s == null) {
                    i++;
                }
            }
        }
        return i;
    }

    public int getSelectedPhotosHighQualityCount() {
        int i = 0;
        for (Object obj : t1.values()) {
            if (obj instanceof jo6) {
                jo6 jo6Var = (jo6) obj;
                if (jo6Var.c() && !jo6Var.b && jo6Var.s == null) {
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
            return ((jo6) ((Map.Entry) it.next()).getValue()).N;
        }
        return 0L;
    }

    public final void h0() {
        yn6 yn6Var;
        if (t0()) {
            yn6Var = MediaController.a2;
        } else {
            yn6Var = MediaController.b2;
        }
        if (yn6Var == null) {
            MediaController.N(0);
        }
    }

    public final int i0() {
        i22 i22Var = this.b;
        org.telegram.ui.ActionBar.d dVar = i22Var.Z1;
        if ((dVar instanceof yv1) && ((yv1) dVar).g4 == 5) {
            return dVar.getMessagesController().l4.i0.f() - ((yv1) i22Var.Z1).M6.size();
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
        m62 m62Var;
        m62 m62Var2 = this.Q;
        if (m62Var2 != null && this.P == null) {
            i22 i22Var = this.b;
            if (!i22Var.J) {
                m62Var2.initTexture();
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
                d62 d62Var = this.r;
                if (isEmpty) {
                    textView2.setVisibility(4);
                    d62Var.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    d62Var.setVisibility(0);
                }
                if (i22Var.U0().w && isFocusable()) {
                    i22Var.U0().d();
                }
                b1d b1dVar = this.m0;
                b1dVar.setVisibility(0);
                b1dVar.setAlpha(0.0f);
                yd ydVar = this.k0;
                ydVar.setVisibility(0);
                ydVar.setTag(null);
                int[] iArr = this.g0;
                iArr[0] = 0;
                int i2 = this.L0;
                iArr[1] = i2;
                iArr[2] = gm.L(2.0f) + (i2 << 1);
                this.k1 = 0.0f;
                this.j1 = true;
                m62 m62Var3 = this.Q;
                if (m62Var3 != null) {
                    m62Var3.setFpsLimit(-1);
                }
                gm.t1(this);
                gm.i3(i22Var, false);
                setAlertKeepScreenOn(true);
                d62 d62Var2 = this.F;
                ImageView[] imageViewArr = this.T;
                if (z) {
                    setCameraOpenProgress(0.0f);
                    this.e0 = true;
                    if (d62Var2 != null) {
                        d62Var2.invalidate();
                    }
                    this.g1.d();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this, "cameraOpenProgress", 0.0f, 1.0f));
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(ydVar, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(d62Var, property, 1.0f));
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
                    animatorSet.setInterpolator(d53.f);
                    animatorSet.addListener(new c62(this, (byte) 2));
                    animatorSet.start();
                } else {
                    setCameraOpenProgress(1.0f);
                    ydVar.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                    d62Var.setAlpha(1.0f);
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
                    i22Var.W3.b0();
                    m62 m62Var4 = this.Q;
                    if (m62Var4 != null) {
                        m62Var4.setSystemUiVisibility(1028);
                    }
                }
                this.c0 = true;
                m62 m62Var5 = this.Q;
                if (m62Var5 != null) {
                    m62Var5.setImportantForAccessibility(2);
                }
                d62Var2.setImportantForAccessibility(4);
                d62Var2.invalidate();
                if (!e86.e(360928) && (m62Var = this.Q) != null && m62Var.isInited()) {
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
        if (gda.v0) {
            k0(true);
            return;
        }
        i22 i22Var = this.b;
        g22 g22Var = i22Var.W3;
        if (g22Var != null) {
            g22Var.E0(0, false, true, 0, 0, 0L, i22Var.a1(), false, 0L);
        }
    }

    @Override
    public final void m(float f) {
        this.X0 = f;
        W();
        m62 m62Var = this.Q;
        if (m62Var != null) {
            m62Var.invalidateOutline();
            this.Q.invalidate();
        }
        invalidate();
    }

    public final void m0(jo6 jo6Var, boolean z, boolean z2) {
        int i;
        yv1 yv1Var;
        yv1 yv1Var2;
        ArrayList<Object> arrayList;
        int i2;
        ArrayList arrayList2 = s1;
        i22 i22Var = this.b;
        if (jo6Var != null) {
            int i3 = jo6Var.C;
            arrayList2.add(jo6Var);
            t1.put(Integer.valueOf(i3), jo6Var);
            u1.add(Integer.valueOf(i3));
            i22Var.F1(0);
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
            org.telegram.ui.ActionBar.d dVar = i22Var.Z1;
            org.telegram.ui.ActionBar.d dVar2 = i22Var.Z1;
            if (dVar == null) {
                dVar = LaunchActivity.Q();
            }
            if (dVar != null) {
                PhotoViewer.r0().T1(dVar.getParentActivity(), null, this.a);
                PhotoViewer.r0().U1(i22Var);
                PhotoViewer r0 = PhotoViewer.r0();
                int i4 = i22Var.P3;
                boolean z3 = i22Var.Q3;
                r0.h = i4;
                r0.n = z3;
                if (i22Var.z1 && i22Var.A1) {
                    yv1Var = (yv1) dVar2;
                    i = 11;
                } else {
                    if (i22Var.N2 != 0) {
                        i = 1;
                    } else if (dVar2 instanceof yv1) {
                        yv1Var = (yv1) dVar2;
                        i = 2;
                    } else {
                        i = 5;
                    }
                    yv1Var = null;
                }
                boolean z4 = i22Var.B1;
                if (z4) {
                    i = 13;
                    yv1Var2 = null;
                } else {
                    yv1Var2 = yv1Var;
                }
                int i5 = i;
                if (i22Var.N2 == 0 && !z4) {
                    arrayList = getAllPhotosArray();
                    i2 = arrayList2.size() - 1;
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(jo6Var);
                    i2 = 0;
                }
                ArrayList<Object> arrayList3 = arrayList;
                un5 un5Var = i22Var.K1;
                if (un5Var != null && jo6Var != null) {
                    un5Var.e = jo6Var.b;
                }
                PhotoViewer.r0().o1(arrayList3, i2, i5, false, new e62(this, z), yv1Var2);
                PhotoViewer.r0().G1(i22Var.K1);
                if (i22Var.A1) {
                    PhotoViewer.r0().U(null, null, false, i22Var.D1);
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
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean o(MotionEvent motionEvent) {
        int[] iArr;
        m62 m62Var;
        if (!this.e0) {
            if (this.c0 && motionEvent != null) {
                boolean z = this.H0;
                b1d b1dVar = this.m0;
                if ((!z && motionEvent.getActionMasked() == 0) || motionEvent.getActionMasked() == 5) {
                    Rect rect = this.F0;
                    b1dVar.getHitRect(rect);
                    if (b1dVar.getTag() == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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
                    d62 d62Var = this.r;
                    TextView textView = this.q0;
                    Property property = View.ALPHA;
                    ImageView[] imageViewArr = this.T;
                    yd ydVar = this.k0;
                    float f = 1.0f;
                    if (actionMasked == 2) {
                        if (this.D0 && motionEvent.getPointerCount() == 2 && !this.J0) {
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            if (!this.E0) {
                                if (Math.abs(hypot - this.B0) >= gm.Z0(false, 0.4f)) {
                                    this.B0 = hypot;
                                    this.E0 = true;
                                    return true;
                                }
                            } else if (this.Q != null) {
                                this.B0 = hypot;
                                float L = this.C0 + ((hypot - this.B0) / gm.L(100.0f));
                                this.C0 = L;
                                if (L < 0.0f) {
                                    this.C0 = 0.0f;
                                    f = 0.0f;
                                } else if (L > 1.0f) {
                                    this.C0 = 1.0f;
                                } else {
                                    f = L;
                                }
                                b1dVar.b(false, f);
                                this.b.b.invalidate();
                                this.Q.setZoom(this.C0);
                                w0(true);
                                return true;
                            }
                        } else {
                            float y = motionEvent.getY();
                            float f2 = y - this.G0;
                            if (this.I0) {
                                if (Math.abs(f2) > gm.Z0(false, 0.4f)) {
                                    this.I0 = false;
                                    this.J0 = true;
                                    return true;
                                }
                            } else if (this.J0 && (m62Var = this.Q) != null) {
                                m62Var.setTranslationY(m62Var.getTranslationY() + f2);
                                this.G0 = y;
                                b1dVar.setTag(null);
                                Runnable runnable = this.o0;
                                if (runnable != null) {
                                    gm.r(runnable);
                                    this.o0 = null;
                                }
                                if (ydVar.getTag() == null) {
                                    ydVar.setTag(1);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(ydVar, property, 0.0f), ObjectAnimator.ofFloat(b1dVar, property, 0.0f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 0.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 0.0f), ObjectAnimator.ofFloat(d62Var, property, 0.0f));
                                    animatorSet.setDuration(220L);
                                    animatorSet.setInterpolator(d53.f);
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
                            m62 m62Var2 = this.Q;
                            if (m62Var2 != null) {
                                if (Math.abs(m62Var2.getTranslationY()) > this.Q.getMeasuredHeight() / 6.0f) {
                                    b0(true);
                                    return true;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(ydVar, property, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[0], property, 1.0f), ObjectAnimator.ofFloat(imageViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(d62Var, property, 1.0f));
                                animatorSet2.setDuration(250L);
                                animatorSet2.setInterpolator(this.j0);
                                animatorSet2.start();
                                ydVar.setTag(null);
                                return true;
                            }
                        } else {
                            m62 m62Var3 = this.Q;
                            if (m62Var3 != null && !this.E0) {
                                m62Var3.getLocationOnScreen(this.W);
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
            this.T[i].animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(d53.f).start();
        }
        ViewPropertyAnimator duration = this.s0.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        d53 d53Var = d53.f;
        duration.setInterpolator(d53Var).start();
        this.r0.animate().alpha(1.0f).setDuration(150L).setInterpolator(d53Var).start();
        gm.R3(this.S, false);
        gm.r(this.i0);
        this.i0 = null;
        gm.K3(gm.W(getContext()));
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (this.T0 != i5) {
            this.T0 = i5;
            p62 p62Var = this.H;
            if (p62Var != null) {
                p62Var.f();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        W();
    }

    @Override
    public final void p() {
        nm7.e().n(this, nm7.p4);
        nm7.e().n(this, nm7.r2);
    }

    public final void p0() {
        try {
            U(false);
            if (this.Q != null) {
                CameraController.getInstance().startPreview(this.Q.getCameraSessionObject());
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean q() {
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
    public final void r(int i) {
        boolean z;
        if (i != 0 && i != 2) {
            z = true;
        } else {
            z = false;
        }
        f0(z);
    }

    @Override
    public final void requestLayout() {
        if (this.S0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(int i, final boolean z) {
        PhotoViewer r0 = PhotoViewer.r0();
        if (i == -1) {
            i = r0.O4;
        }
        ArrayList arrayList = r0.f7;
        if (arrayList != null && !arrayList.isEmpty() && i < arrayList.size() && (arrayList.get(i) instanceof jo6) && ((jo6) arrayList.get(i)).M) {
            final jo6 jo6Var = (jo6) arrayList.get(i);
            this.F.M(new gu2() {
                @Override
                public final void accept(Object obj) {
                    View view = (View) obj;
                    boolean z2 = ChatAttachAlertPhotoLayout.r1;
                    if (view instanceof q68) {
                        q68 q68Var = (q68) view;
                        if (q68Var.getPhotoEntry() == jo6Var) {
                            q68Var.c(z, Float.valueOf(250.0f));
                            long starsPrice = ChatAttachAlertPhotoLayout.this.getStarsPrice();
                            boolean z3 = true;
                            if (ChatAttachAlertPhotoLayout.t1.size() <= 1) {
                                z3 = false;
                            }
                            q68Var.f(starsPrice, z3);
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
        int i3 = gm.q.x;
        i22 i22Var = this.b;
        float width = i22Var.c.getWidth();
        float height = i22Var.c.getHeight();
        float[] fArr = this.V;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = this.k1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
        float textureHeight = this.Q.getTextureHeight(f2, f3) / this.Q.getTextureHeight(width, height);
        float f7 = f3 / height;
        float f8 = f2 / width;
        boolean z = this.j1;
        m62 m62Var = this.Q;
        if (z) {
            i = (int) width;
            i2 = (int) height;
            float f9 = 1.0f - f;
            float f10 = (textureHeight * f9) + f;
            m62Var.getTextureView().setScaleX(f10);
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
            m62Var.getTextureView().setScaleX(1.0f);
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
                jo6 jo6Var = (jo6) entry.getValue();
                jo6Var.N = j;
                if (j > 0) {
                    z = true;
                } else {
                    z = false;
                }
                jo6Var.M = z;
                jo6Var.R = false;
            }
        }
        E(getSelectedItemsCount());
        if (X(false)) {
            A0();
        }
    }

    @Override
    public void setTranslationY(float f) {
        i22 i22Var = this.b;
        if (i22Var.B0 == 1) {
            float f2 = (f / 40.0f) * (-0.1f);
            d62 d62Var = this.F;
            int childCount = d62Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = d62Var.getChildAt(i);
                if (childAt instanceof q68) {
                    q68 q68Var = (q68) childAt;
                    float f3 = 1.0f + f2;
                    q68Var.getCheckBox().setScaleX(f3);
                    q68Var.getCheckBox().setScaleY(f3);
                }
            }
        }
        super.setTranslationY(f);
        i22Var.b.invalidate();
        invalidate();
    }

    @Override
    public final void t() {
        m62 m62Var = this.Q;
        if (m62Var != null) {
            m62Var.setVisibility(8);
        }
        for (Map.Entry entry : t1.entrySet()) {
            if (entry.getValue() instanceof jo6) {
                ((jo6) entry.getValue()).getClass();
            }
        }
        this.H.f();
    }

    public final boolean t0() {
        if (!this.z0) {
            i22 i22Var = this.b;
            if (!i22Var.z1) {
                if (!(i22Var.Z1 instanceof yv1) && !i22Var.Q2 && i22Var.N2 != 2) {
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
        d62 d62Var = this.F;
        int childCount = d62Var.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (d62Var.getChildAt(i) instanceof k68) {
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
        ViewPropertyAnimator withEndAction = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53.j).withEndAction(new u52(this, (byte) 3));
        this.p1 = withEndAction;
        withEndAction.start();
        n0();
    }

    public final void u0(oc0 oc0Var, TLRPC.VideoSize videoSize, long j) {
        boolean z;
        i22 i22Var = this.b;
        mc0 mc0Var = new mc0(i22Var.O1, i22Var.K1);
        un5 un5Var = i22Var.K1;
        if (un5Var != null && un5Var.c == 2) {
            z = false;
        } else {
            z = true;
        }
        mc0Var.R = z;
        i22Var.Z1.presentFragment(mc0Var);
        if (oc0Var != null) {
            mc0Var.q0(oc0Var);
        }
        if (videoSize != null) {
            mc0Var.r0(videoSize);
        }
        if (j != 0) {
            mc0Var.p0(j);
        }
        mc0Var.J = new g11(this, mc0Var, (byte) 24);
    }

    @Override
    public final void v(float f) {
        m62 m62Var = this.Q;
        if (m62Var != null) {
            m62Var.setAlpha(f);
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0 && this.Q.getVisibility() != 0) {
                this.Q.setVisibility(0);
            } else if (i == 0 && this.Q.getVisibility() != 4) {
                this.Q.setVisibility(4);
            }
        }
    }

    public final void v0() {
        boolean z;
        boolean z2;
        float f;
        i22 i22Var = this.b;
        if (!i22Var.c4 && this.w0 && CameraView.isCameraAllowed()) {
            if (this.Q == null) {
                boolean z3 = !e86.e(360928);
                Context context = getContext();
                Boolean bool = this.p0;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = i22Var.R3;
                }
                m62 m62Var = new m62(this, context, z, z3);
                this.Q = m62Var;
                org.telegram.ui.ActionBar.d dVar = i22Var.Z1;
                if ((dVar instanceof yv1) && ((yv1) dVar).x()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                m62Var.setRecordFile(gm.s0(z2));
                this.Q.setFocusable(true);
                this.Q.setFpsLimit(30);
                this.Q.setOutlineProvider(new cm0(this, (byte) 4));
                this.Q.setClipToOutline(true);
                this.Q.setContentDescription(jb6.M0(2131754851, null));
                dy0 dy0Var = i22Var.c;
                m62 m62Var2 = this.Q;
                int i = this.L0;
                dy0Var.addView(m62Var2, 1, new FrameLayout.LayoutParams(i, i));
                this.Q.setDelegate(new f62(this));
                m62 m62Var3 = this.Q;
                if (this.w0) {
                    f = 1.0f;
                } else {
                    f = 0.2f;
                }
                m62Var3.setAlpha(f);
                this.Q.setEnabled(this.w0);
                if (this.O) {
                    this.Q.setVisibility(8);
                }
                if (!this.c0) {
                    W();
                }
                d62 d62Var = this.F;
                if (d62Var != null) {
                    d62Var.invalidate();
                }
                invalidate();
            }
            b1d b1dVar = this.m0;
            if (b1dVar != null) {
                b1dVar.b(false, 0.0f);
                this.C0 = 0.0f;
            }
            if (!this.c0) {
                this.Q.setTranslationX(this.V[0]);
            }
        }
    }

    @Override
    public final void w(int i) {
        TLRPC.Chat S0;
        boolean z;
        boolean z2;
        boolean z3 = true;
        i22 i22Var = this.b;
        if (i == 8) {
            i22Var.q1(!i22Var.W1, true);
            this.e1.a(!i22Var.W1, true);
        } else if ((i == 0 || i == 1) && i22Var.P3 > 0 && u1.size() > 1 && (S0 = i22Var.S0()) != null && !sd2.N(S0) && S0.slowmode_enabled) {
            ik.L(getContext(), jb6.M0(2131745044, null), jb6.M0(2131745036, null), null, null, this.a).o();
        } else {
            ylb ylbVar = this.a;
            HashMap hashMap = t1;
            if (i == 0) {
                k47 k47Var = i22Var.E3;
                org.telegram.ui.ActionBar.d dVar = i22Var.Z1;
                if (k47Var == null && (dVar instanceof yv1) && ((yv1) dVar).X7()) {
                    ik.J(getContext(), ((yv1) dVar).a(), new q52(this, (byte) 0), ylbVar);
                } else {
                    ik.X(i22Var.G3, i22Var.V0(), i22Var.R0() + hashMap.size(), new qac(this) {
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
                                    i22 i22Var2 = chatAttachAlertPhotoLayout.b;
                                    i22Var2.E0();
                                    i22Var2.W3.E0(7, false, true, 0, 0, 0L, i22Var2.a1(), false, l.longValue());
                                    return;
                                default:
                                    boolean z5 = ChatAttachAlertPhotoLayout.r1;
                                    i22 i22Var3 = chatAttachAlertPhotoLayout.b;
                                    i22Var3.E0();
                                    i22Var3.W3.E0(4, true, true, 0, 0, 0L, i22Var3.a1(), false, l.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else if (i == 1) {
                k47 k47Var2 = i22Var.E3;
                org.telegram.ui.ActionBar.d dVar2 = i22Var.Z1;
                if (k47Var2 == null && (dVar2 instanceof yv1) && ((yv1) dVar2).X7()) {
                    ik.J(getContext(), ((yv1) dVar2).a(), new q52(this, (byte) 1), ylbVar);
                } else {
                    ik.X(i22Var.G3, i22Var.V0(), i22Var.R0() + hashMap.size(), new qac(this) {
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
                                    i22 i22Var2 = chatAttachAlertPhotoLayout.b;
                                    i22Var2.E0();
                                    i22Var2.W3.E0(7, false, true, 0, 0, 0L, i22Var2.a1(), false, l.longValue());
                                    return;
                                default:
                                    boolean z5 = ChatAttachAlertPhotoLayout.r1;
                                    i22 i22Var3 = chatAttachAlertPhotoLayout.b;
                                    i22Var3.E0();
                                    i22Var3.W3.E0(4, true, true, 0, 0, 0L, i22Var3.a1(), false, l.longValue());
                                    return;
                            }
                        }
                    });
                }
            } else {
                p62 p62Var = this.H;
                d62 d62Var = this.F;
                if (i == 3) {
                    x62 x62Var = i22Var.k2;
                    if (x62Var != null) {
                        x62Var.O();
                    }
                    Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((jo6) ((Map.Entry) it.next()).getValue()).M) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    final boolean z4 = !z2;
                    gm.d3(new Runnable(this) {
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
                                    i22 i22Var2 = chatAttachAlertPhotoLayout.b;
                                    a8 a8Var = chatAttachAlertPhotoLayout.Z0;
                                    if (z5) {
                                        i2 = 2131751367;
                                    } else {
                                        i2 = 2131751091;
                                    }
                                    a8Var.setText(jb6.M0(i2, null));
                                    if (z5) {
                                        a8Var.setIcon(2131232383);
                                        i22Var2.X2.u(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            i22Var2.X2.u(6);
                                            return;
                                        }
                                        return;
                                    }
                                    a8Var.setAnimatedIcon(2131624132);
                                    i22Var2.X2.S(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        i22Var2.X2.S(6);
                                        return;
                                    }
                                    return;
                                default:
                                    boolean z7 = ChatAttachAlertPhotoLayout.r1;
                                    a8 a8Var2 = chatAttachAlertPhotoLayout.b1;
                                    if (z5) {
                                        i3 = 2131745354;
                                    } else {
                                        i3 = 2131745355;
                                    }
                                    a8Var2.setText(jb6.M0(i3, null));
                                    if (z5) {
                                        a8Var2.setIcon(2131231873);
                                        return;
                                    } else {
                                        a8Var2.setIcon(2131231870);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (entry.getValue() instanceof jo6) {
                            jo6 jo6Var = (jo6) entry.getValue();
                            jo6Var.M = z4;
                            jo6Var.R = false;
                            arrayList.add(Integer.valueOf(jo6Var.C));
                        }
                    }
                    d62Var.M(new t52((byte) 0, arrayList, z4));
                    if (i22Var.v2 != this) {
                        p62Var.f();
                    }
                    x62 x62Var2 = i22Var.k2;
                    if (x62Var2 != null) {
                        x62Var2.w.invalidate();
                    }
                } else if (i == 2) {
                    x62 x62Var3 = i22Var.k2;
                    if (x62Var3 != null) {
                        x62Var3.O();
                    }
                    Iterator it2 = hashMap.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((jo6) ((Map.Entry) it2.next()).getValue()).c()) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    final boolean z5 = !z;
                    gm.d3(new Runnable(this) {
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
                                    i22 i22Var2 = chatAttachAlertPhotoLayout.b;
                                    a8 a8Var = chatAttachAlertPhotoLayout.Z0;
                                    if (z52) {
                                        i2 = 2131751367;
                                    } else {
                                        i2 = 2131751091;
                                    }
                                    a8Var.setText(jb6.M0(i2, null));
                                    if (z52) {
                                        a8Var.setIcon(2131232383);
                                        i22Var2.X2.u(1);
                                        if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                            i22Var2.X2.u(6);
                                            return;
                                        }
                                        return;
                                    }
                                    a8Var.setAnimatedIcon(2131624132);
                                    i22Var2.X2.S(1);
                                    if (chatAttachAlertPhotoLayout.getSelectedItemsCount() <= 1) {
                                        i22Var2.X2.S(6);
                                        return;
                                    }
                                    return;
                                default:
                                    boolean z7 = ChatAttachAlertPhotoLayout.r1;
                                    a8 a8Var2 = chatAttachAlertPhotoLayout.b1;
                                    if (z52) {
                                        i3 = 2131745354;
                                    } else {
                                        i3 = 2131745355;
                                    }
                                    a8Var2.setText(jb6.M0(i3, null));
                                    if (z52) {
                                        a8Var2.setIcon(2131231873);
                                        return;
                                    } else {
                                        a8Var2.setIcon(2131231870);
                                        return;
                                    }
                            }
                        }
                    }, 200L);
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        if (entry2.getValue() instanceof jo6) {
                            jo6 jo6Var2 = (jo6) entry2.getValue();
                            jo6Var2.z = Boolean.valueOf(z5);
                            jo6Var2.R = false;
                            arrayList2.add(Integer.valueOf(jo6Var2.C));
                        }
                    }
                    d62Var.M(new t52((byte) 1, arrayList2, z5));
                    if (i22Var.v2 != this) {
                        p62Var.f();
                    }
                    x62 x62Var4 = i22Var.k2;
                    if (x62Var4 != null) {
                        x62Var4.w.invalidate();
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
                            byte b = i22Var.N2;
                            org.telegram.ui.ActionBar.d dVar3 = i22Var.Z1;
                            if (b != 0) {
                                dVar3.startActivityForResult(createChooser, 14);
                            } else {
                                dVar3.startActivityForResult(createChooser, 1);
                            }
                        } else {
                            Intent intent3 = new Intent("android.intent.action.PICK");
                            intent3.setType("image/*");
                            byte b2 = i22Var.N2;
                            org.telegram.ui.ActionBar.d dVar4 = i22Var.Z1;
                            if (b2 != 0) {
                                dVar4.startActivityForResult(intent3, 14);
                            } else {
                                dVar4.startActivityForResult(intent3, 1);
                            }
                        }
                        i22Var.a(true);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                } else if (i == 7) {
                    if (i22Var.v2 == i22Var.k2) {
                        z3 = false;
                    }
                    i22Var.J1(z3);
                } else if (i == 9) {
                    nxa.k1(getContext(), getStarsPrice(), true, new defpackage.f(this, (byte) 28), this.a);
                } else if (i >= 10) {
                    yn6 yn6Var = (yn6) this.W0.get(i - 10);
                    this.U0 = yn6Var;
                    yn6 yn6Var2 = this.V0;
                    TextView textView = this.y;
                    if (yn6Var == yn6Var2) {
                        textView.setText(jb6.M0(2131752175, null));
                    } else {
                        textView.setText(yn6Var.c);
                    }
                    p62Var.f();
                    this.w.f();
                    this.G.g1(0, -(d62Var.getPaddingTop() - getTopScrollOffset()));
                }
            }
        }
    }

    public final void w0(boolean z) {
        Integer num;
        float f;
        b1d b1dVar = this.m0;
        if (b1dVar.getTag() != null && z) {
            Runnable runnable = this.o0;
            if (runnable != null) {
                gm.r(runnable);
            }
            u52 u52Var = new u52(this, (byte) 1);
            this.o0 = u52Var;
            gm.d3(u52Var, 2000L);
        } else if (b1dVar.getTag() != null || z) {
            AnimatorSet animatorSet = this.n0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (z) {
                num = 1;
            } else {
                num = null;
            }
            b1dVar.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.n0 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = this.n0;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(b1dVar, View.ALPHA, f));
            this.n0.addListener(new c62(this, (byte) 1));
            this.n0.start();
            if (z) {
                u52 u52Var2 = new u52(this, (byte) 2);
                this.o0 = u52Var2;
                gm.d3(u52Var2, 2000L);
            }
        }
    }

    @Override
    public final void x() {
        boolean z;
        i22 i22Var = this.b;
        if (i22Var != null && (i22Var.Z1 instanceof yv1)) {
            z = true;
        } else {
            z = false;
        }
        U(z);
    }

    public final void x0() {
        ArrayList arrayList;
        h62 h62Var = this.x;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h62Var.b;
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
            Collections.sort(arrayList2, new x52(arrayList, (byte) 0));
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
            yn6 yn6Var = (yn6) this.W0.get(i);
            kd kdVar = new kd(getContext(), yn6Var.d, yn6Var.c, yn6Var.e.size(), this.a);
            h62Var.getPopupLayout().addView(kdVar);
            kdVar.setOnClickListener(new v0(this, i + 10, (byte) 4));
        }
    }

    public final void y0() {
        d62 d62Var = this.F;
        if (d62Var != null) {
            for (int i = 0; i < d62Var.getChildCount(); i++) {
                View childAt = d62Var.getChildAt(i);
                if (childAt instanceof q68) {
                    ((q68) childAt).a.invalidate();
                }
            }
        }
    }

    @Override
    public final void z(int i, boolean z) {
        W();
        m62 m62Var = this.Q;
        if (m62Var != null) {
            m62Var.invalidateOutline();
            this.Q.invalidate();
        }
    }

    public final void z0() {
        ArrayList arrayList;
        if (this.b.Z1 instanceof yv1) {
            d62 d62Var = this.F;
            int childCount = d62Var.getChildCount();
            int i = 0;
            while (true) {
                arrayList = u1;
                if (i >= childCount) {
                    break;
                }
                View childAt = d62Var.getChildAt(i);
                if (childAt instanceof q68) {
                    q68 q68Var = (q68) childAt;
                    jo6 d0 = d0(((Integer) q68Var.getTag()).intValue());
                    if (d0 != null) {
                        q68Var.setNum(arrayList.indexOf(Integer.valueOf(d0.C)));
                    }
                }
                i++;
            }
            d62 d62Var2 = this.r;
            int childCount2 = d62Var2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = d62Var2.getChildAt(i2);
                if (childAt2 instanceof q68) {
                    q68 q68Var2 = (q68) childAt2;
                    jo6 d02 = d0(((Integer) q68Var2.getTag()).intValue());
                    if (d02 != null) {
                        q68Var2.setNum(arrayList.indexOf(Integer.valueOf(d02.C)));
                    }
                }
            }
        }
    }
}
