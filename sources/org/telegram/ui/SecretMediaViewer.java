package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public class SecretMediaViewer implements NotificationCenter.NotificationCenterDelegate, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer f36180t1;
    public boolean A;
    public float A0;
    public cg.m1 B;
    public float B0;
    public AnimatorSet C;
    public float C0;
    public boolean D;
    public int[] D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public long F0;
    public long G;
    public AnimatorSet G0;
    public long H;
    public GestureDetector H0;
    public boolean I;
    public final DecelerateInterpolator I0;
    public xt0 J;
    public float J0;
    public int K;
    public float K0;
    public int L;
    public float L0;
    public org.telegram.ui.Components.z61 M;
    public float M0;
    public op0 N;
    public float N0;
    public org.telegram.ui.ActionBar.h5 O;
    public float O0;
    public View P;
    public float P0;
    public z31 Q;
    public float Q0;
    public ImageView R;
    public float R0;
    public org.telegram.ui.Components.cg0 S;
    public float S0;
    public FrameLayout T;
    public float T0;
    public sr0 U;
    public float U0;
    public nt0 V;
    public boolean V0;
    public xs0 W;
    public boolean W0;
    public int X;
    public boolean X0;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public int f36181a;
    public float f36182a0;
    public boolean f36183a1;
    private float animationValue;
    public Activity f36184b;
    public long f36185b0;
    public boolean f36186b1;
    public WindowManager.LayoutParams f36187c;
    public WindowInsets f36188c0;
    public org.telegram.ui.Components.lm0 f36189c1;
    public n0 d;
    public MessageObject f36190d0;
    public boolean f36191d1;
    public bg.d1 f36192e;
    public ImageReceiver.BitmapHolder f36193e0;
    public final q31 f36194e1;
    public View f36195f;
    public boolean f36196f0;
    public final int[] f36197f1;
    public final int[] f36199g1;
    public jf.s0 f36201h1;
    public int f36202i0;
    public boolean f36203i1;
    public long f36204j0;
    public int f36205j1;
    public Runnable f36206k0;
    public boolean f36207k1;
    public boolean f36208l0;
    public Runnable l1;
    public float m0;
    public boolean f36209m1;
    public y31 f36210n;
    public float f36211n0;
    public final q31 f36212n1;
    public float f36213o0;
    public float[] f36214o1;
    public float f36215p0;
    public final Path f36216p1;
    public float f36217q0;
    public final w0 f36218q1;
    public nh.t3 f36219r;
    public float f36220r0;
    public final w0 f36221r1;
    public boolean f36222s;
    public float f36223s0;
    public boolean f36224s1;
    public float f36225t0;
    public float f36226u0;
    public long v;
    public float f36227v0;
    public e5.c f36228w;
    public float f36229w0;
    public TextureView f36230x;
    public float f36231x0;
    public x31 f36232y;
    public float f36233y0;
    public float f36234z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f36198g0 = true;
    public final PhotoBackgroundDrawable f36200h0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public t31 f36235a;
        public int f36236b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            t31 t31Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f36236b == 2 && (t31Var = this.f36235a) != null) {
                    t31Var.run();
                    this.f36235a = null;
                } else {
                    invalidateSelf();
                }
                this.f36236b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            jf.s0 s0Var = secretMediaViewer.f36201h1;
            if (s0Var != null) {
                if (secretMediaViewer.f36196f0 && i10 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s0Var.a(z10);
            }
            super.setAlpha(i10);
        }

        @Override
        public final void setBounds(int i10, int i11, int i12, int i13) {
            super.setBounds(i10, i11, i12, i13 + AndroidUtilities.navigationBarHeight);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += AndroidUtilities.navigationBarHeight;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.f36226u0 = 1.0f;
        this.I0 = new DecelerateInterpolator(1.5f);
        this.K0 = 1.0f;
        this.Z0 = true;
        this.f36194e1 = new q31(this, 2);
        this.f36197f1 = new int[2];
        this.f36199g1 = new int[2];
        this.f36212n1 = new q31(this, 3);
        this.f36216p1 = new Path();
        this.f36218q1 = new w0("videoCrossfadeAlpha", 4);
        this.f36221r1 = new w0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f36188c0;
        secretMediaViewer.f36188c0 = windowInsets;
        if (windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) {
            secretMediaViewer.d.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(org.telegram.ui.SecretMediaViewer r26, android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.b(org.telegram.ui.SecretMediaViewer, android.graphics.Canvas):void");
    }

    public static SecretMediaViewer f() {
        SecretMediaViewer secretMediaViewer;
        SecretMediaViewer secretMediaViewer2 = f36180t1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f36180t1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f36180t1 = secretMediaViewer;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return secretMediaViewer;
        }
        return secretMediaViewer2;
    }

    public static boolean g() {
        if (f36180t1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f9, float f10, float f11, boolean z10) {
        if (this.f36226u0 == f9 && this.f36223s0 == f10 && this.f36225t0 == f11) {
            return;
        }
        this.f36183a1 = z10;
        this.f36231x0 = f9;
        this.f36227v0 = f10;
        this.f36229w0 = f11;
        this.F0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.G0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.G0.setInterpolator(this.I0);
        this.G0.setDuration(250);
        this.G0.addListener(new w31(this, 3));
        this.G0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f36190d0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f36190d0.getId()))) {
                if (this.F && !this.D) {
                    this.E = true;
                } else if (!e(true, true)) {
                    this.f36191d1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f36190d0 != null && this.f36210n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f36190d0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f36190d0.messageOwner.destroyTime = keyAt;
                            this.f36210n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f36190d0.getId() == ((TLRPC.Message) objArr[0]).f22413id) {
            if (this.F && !this.D) {
                this.E = true;
            } else if (!e(true, true)) {
                this.f36191d1 = true;
            }
        }
    }

    public final boolean e(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.e(boolean, boolean):boolean");
    }

    public float getAnimationValue() {
        return this.animationValue;
    }

    public float getVideoCrossfadeAlpha() {
        return this.f36182a0;
    }

    public final void h(File file) {
        if (this.f36184b == null) {
            return;
        }
        i();
        if (this.f36230x == null) {
            e5.c cVar = new e5.c(this.f36184b);
            this.f36228w = cVar;
            cVar.setVisibility(0);
            this.f36192e.addView(this.f36228w, 0, i7.f6.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f36184b);
            this.f36230x = textureView;
            textureView.setOpaque(false);
            this.f36228w.addView(this.f36230x, i7.f6.e(-1, -1, 17));
        }
        this.Y = false;
        this.Z = false;
        this.f36230x.setAlpha(1.0f);
        if (this.f36232y == null) {
            x31 x31Var = new x31(this);
            this.f36232y = x31Var;
            x31Var.W(this.f36230x);
            this.f36232y.F = new oc.i(this, file, false, 14);
        }
        this.f36232y.E(Uri.fromFile(file), "other");
        this.f36232y.Q(true);
        this.S.a(true, true);
    }

    public final void i() {
        x31 x31Var = this.f36232y;
        if (x31Var != null) {
            this.X = 0;
            x31Var.I();
            this.f36232y = null;
        }
        try {
            Activity activity = this.f36184b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        e5.c cVar = this.f36228w;
        if (cVar != null) {
            this.f36192e.removeView(cVar);
            this.f36228w = null;
        }
        if (this.f36230x != null) {
            this.f36230x = null;
        }
        this.A = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.y5.cloneSpans(charSequence, 3);
        if (this.W == null) {
            FrameLayout frameLayout = new FrameLayout(this.f36192e.getContext());
            this.T = frameLayout;
            this.V.setContainer(frameLayout);
            xs0 xs0Var = new xs0(this, this.f36192e.getContext(), this.V, this.T, 1);
            this.W = xs0Var;
            this.V.setScrollView(xs0Var);
            this.T.setClipChildren(false);
            this.W.addView(this.T, new ViewGroup.LayoutParams(-1, -2));
            this.f36192e.addView(this.W, i7.f6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.U.o(this.f36192e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.V.getParent() != this.T) {
            this.V.setMeasureAllChildren(true);
            this.T.addView(this.V, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.V.getCurrentView().getText());
        nt0 nt0Var = this.V;
        if (z10) {
            currentView = nt0Var.getNextView();
        } else {
            currentView = nt0Var.getCurrentView();
        }
        int maxLines = currentView.getMaxLines();
        if (maxLines == 1) {
            this.V.getCurrentView().setSingleLine(false);
            this.V.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.V.getCurrentView().setMaxLines(Integer.MAX_VALUE);
            this.V.getNextView().setMaxLines(Integer.MAX_VALUE);
            this.V.getCurrentView().setEllipsize(null);
            this.V.getNextView().setEllipsize(null);
        }
        currentView.setScrollX(0);
        xs0 xs0Var2 = this.W;
        xs0Var2.f40013h0 = false;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(xs0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new u31(this, isEmpty2, isEmpty, 1)).addTransition(new u31(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.W.f40013h0 = true;
                duration.addTransition(new org.telegram.ui.Components.cm0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.V);
            }
            TransitionManager.beginDelayedTransition(this.W, duration);
            z11 = true;
        } else {
            this.V.getCurrentView().setText((CharSequence) null);
            xs0 xs0Var3 = this.W;
            if (xs0Var3 != null) {
                xs0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.g6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.k31.B())) {
                if (!messageObject.messageOwner.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    messageObject.addEntitiesToText(spannableString, true, false);
                    if (messageObject.isVideo()) {
                        MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableString, false, 3, (int) messageObject.getDuration(), false);
                    }
                    cloneSpans = Emoji.replaceEmoji(spannableString, currentView.getPaint().getFontMetricsInt(), false);
                } else {
                    cloneSpans = Emoji.replaceEmoji(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false);
                }
            }
            this.V.setTag(cloneSpans);
            try {
                this.V.a(cloneSpans, z10, false);
                xs0 xs0Var4 = this.W;
                if (xs0Var4 != null) {
                    xs0Var4.H(xs0Var4.getWidth(), xs0Var4.getHeight());
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            nt0 nt0Var2 = this.V;
            if (this.f36198g0) {
                i10 = 0;
            }
            nt0Var2.setVisibility(i10);
        } else {
            this.V.a(null, z10, false);
            this.V.getCurrentView().setTextColor(-1);
            nt0 nt0Var3 = this.V;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            nt0Var3.b(4, z12);
            this.V.setTag(null);
        }
        if (this.V.getCurrentView() instanceof mt0) {
            ((mt0) this.V.getCurrentView()).setLoading(false);
        }
    }

    public final void k(boolean z10, boolean z11) {
        boolean z12;
        float f9;
        float f10;
        if (this.F && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f36203i1 == z12 && z11) {
            return;
        }
        this.f36203i1 = z12;
        this.R.animate().cancel();
        float f11 = 0.0f;
        float f12 = 0.6f;
        if (z11) {
            ViewPropertyAnimator animate = this.R.animate();
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (z12) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f12);
            if (z12) {
                f11 = 1.0f;
            }
            scaleY.alpha(f11).setDuration(340L).setInterpolator(org.telegram.ui.Components.jr.h).start();
            return;
        }
        ImageView imageView = this.R;
        if (z12) {
            f9 = 1.0f;
        } else {
            f9 = 0.6f;
        }
        imageView.setScaleX(f9);
        ImageView imageView2 = this.R;
        if (z12) {
            f12 = 1.0f;
        }
        imageView2.setScaleY(f12);
        ImageView imageView3 = this.R;
        if (z12) {
            f11 = 1.0f;
        }
        imageView3.setAlpha(f11);
    }

    public final void l() {
        int i10;
        this.f36219r.q(true);
        if (this.F) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        nh.t3 t3Var = this.f36219r;
        t3Var.h = nh.t3.a(string, t3Var.getTextPaint());
        this.f36219r.t(string);
        this.f36219r.l(12.0f, 7.0f, 11.0f, 7.0f);
        nh.t3 t3Var2 = this.f36219r;
        t3Var2.getClass();
        t3Var2.f18586a0 = AndroidUtilities.dp(2);
        nh.t3 t3Var3 = this.f36219r;
        t3Var3.getClass();
        t3Var3.W = 0.0f;
        t3Var3.j(R.raw.fire_on);
        this.f36219r.v();
        MessagesController.getGlobalMainSettings().edit().putInt("viewoncehint", MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void m(boolean z10, boolean z11) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        q31 q31Var = this.f36212n1;
        AndroidUtilities.cancelRunOnUIThread(q31Var);
        if (z10 && this.F) {
            AndroidUtilities.runOnUIThread(q31Var, 3000L);
        }
        if (z10) {
            this.B.setVisibility(0);
        }
        this.B.setEnabled(z10);
        this.f36198g0 = z10;
        k(z10, z11);
        float f16 = 0.0f;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            cg.m1 m1Var = this.B;
            Property property = View.ALPHA;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(m1Var, property, f12));
            z31 z31Var = this.Q;
            w0 w0Var = z31Var.f45061n;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(z31Var, w0Var, f13));
            xs0 xs0Var = this.W;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(xs0Var, property, f14));
            View view = this.P;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
            View view2 = this.f36195f;
            if (z10) {
                f16 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f16));
            AnimatorSet animatorSet = new AnimatorSet();
            this.C = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.C.addListener(new w31(this, 1));
            }
            this.C.setDuration(200L);
            this.C.start();
            return;
        }
        cg.m1 m1Var2 = this.B;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        m1Var2.setAlpha(f9);
        xs0 xs0Var2 = this.W;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        xs0Var2.setAlpha(f10);
        View view3 = this.P;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        view3.setAlpha(f11);
        View view4 = this.f36195f;
        if (z10) {
            f16 = 1.0f;
        }
        view4.setAlpha(f16);
        if (!z10) {
            this.B.setVisibility(8);
            this.W.scrollTo(0, 0);
        }
    }

    public final void n(float f9) {
        ImageReceiver imageReceiver = this.h;
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f9) - this.f36192e.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f9) - this.f36192e.getHeight())) / 2;
        if (imageWidth > 0) {
            this.R0 = -imageWidth;
            this.S0 = imageWidth;
        } else {
            this.S0 = 0.0f;
            this.R0 = 0.0f;
        }
        if (imageHeight > 0) {
            this.T0 = -imageHeight;
            this.U0 = imageHeight;
            return;
        }
        this.U0 = 0.0f;
        this.T0 = 0.0f;
    }

    @Override
    public final boolean onDoubleTap(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        if (this.f36226u0 != 1.0f) {
            this.f36189c1.a();
            this.f36189c1.c(Math.round(this.f36223s0), Math.round(this.f36225t0), Math.round(f9), Math.round(f10), (int) this.R0, (int) this.S0, (int) this.T0, (int) this.U0);
            this.f36192e.postInvalidate();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        return false;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f36186b1) {
            return false;
        }
        if (this.f36232y != null && this.f36198g0 && motionEvent.getX() >= this.R.getX() && motionEvent.getY() >= this.R.getY() && motionEvent.getX() <= this.R.getX() + this.R.getMeasuredWidth() && motionEvent.getX() <= this.R.getX() + this.R.getMeasuredWidth()) {
            x31 x31Var = this.f36232y;
            x31Var.Q(!x31Var.d.h());
            if (this.f36232y.d.h()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f36198g0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f9) {
        this.animationValue = f9;
        this.f36192e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f9) {
        this.f36182a0 = f9;
        this.f36192e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
