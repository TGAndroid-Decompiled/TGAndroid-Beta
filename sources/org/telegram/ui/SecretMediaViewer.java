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
    public static volatile SecretMediaViewer f30547x1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public boolean E;
    public float E0;
    public org.telegram.ui.Components.y7 F;
    public float F0;
    public AnimatorSet G;
    public float G0;
    public boolean H;
    public int[] H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public long J0;
    public long K;
    public AnimatorSet K0;
    public long L;
    public GestureDetector L0;
    public boolean M;
    public final DecelerateInterpolator M0;
    public cv0 N;
    public float N0;
    public int O;
    public float O0;
    public int P;
    public float P0;
    public org.telegram.ui.Components.v71 Q;
    public float Q0;
    public t50 R;
    public float R0;
    public org.telegram.ui.ActionBar.l5 S;
    public float S0;
    public View T;
    public float T0;
    public h51 U;
    public float U0;
    public ImageView V;
    public float V0;
    public org.telegram.ui.Components.pg0 W;
    public float W0;
    public FrameLayout X;
    public float X0;
    public vs0 Y;
    public float Y0;
    public ru0 Z;
    public boolean Z0;
    public int f30548a;
    public au0 f30549a0;
    public boolean f30550a1;
    private float animationValue;
    public Activity f30551b;
    public int f30552b0;
    public boolean f30553b1;
    public WindowManager.LayoutParams f30554c;
    public boolean f30555c0;
    public boolean f30556c1;
    public k0 d;
    public boolean f30557d0;
    public boolean f30558d1;
    public bi.n7 e;
    public float f30559e0;
    public boolean f30560e1;
    public View f30561f;
    public long f30562f0;
    public boolean f30563f1;
    public WindowInsets f30564g0;
    public org.telegram.ui.Components.xm0 f30565g1;
    public MessageObject f30566h0;
    public boolean f30567h1;
    public ImageReceiver.BitmapHolder f30568i0;
    public final z41 f30569i1;
    public boolean f30570j0;
    public final int[] f30571j1;
    public final int[] f30573k1;
    public kb0 l1;
    public int m0;
    public boolean f30575m1;
    public g51 f30576n;
    public long f30577n0;
    public int f30578n1;
    public Runnable f30579o0;
    public boolean f30580o1;
    public boolean f30581p0;
    public Runnable f30582p1;
    public float f30583q0;
    public boolean f30584q1;
    public bi.x4 f30585r;
    public float f30586r0;
    public final z41 f30587r1;
    public boolean f30588s;
    public float f30589s0;
    public float[] f30590s1;
    public float f30591t0;
    public final Path f30592t1;
    public float f30593u0;
    public final t0 f30594u1;
    public long v;
    public float f30595v0;
    public final t0 f30596v1;
    public m4 f30597w;
    public float f30598w0;
    public boolean f30599w1;
    public TextureView f30600x;
    public float f30601x0;
    public f51 f30602y;
    public float f30603y0;
    public float f30604z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f30572k0 = true;
    public final PhotoBackgroundDrawable f30574l0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public ey0 f30605a;
        public int f30606b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            ey0 ey0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f30606b == 2 && (ey0Var = this.f30605a) != null) {
                    ey0Var.run();
                    this.f30605a = null;
                } else {
                    invalidateSelf();
                }
                this.f30606b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            kb0 kb0Var = secretMediaViewer.l1;
            if (kb0Var != null) {
                if (secretMediaViewer.f30570j0 && i10 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kb0Var.a(z10);
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
        this.f30603y0 = 1.0f;
        this.M0 = new DecelerateInterpolator(1.5f);
        this.O0 = 1.0f;
        this.f30558d1 = true;
        this.f30569i1 = new z41(this, 2);
        this.f30571j1 = new int[2];
        this.f30573k1 = new int[2];
        this.f30587r1 = new z41(this, 3);
        this.f30592t1 = new Path();
        this.f30594u1 = new t0("videoCrossfadeAlpha", 4);
        this.f30596v1 = new t0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f30564g0;
        secretMediaViewer.f30564g0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f30547x1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f30547x1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f30547x1 = secretMediaViewer;
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
        if (f30547x1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f7, float f10, float f11, boolean z10) {
        if (this.f30603y0 == f7 && this.f30598w0 == f10 && this.f30601x0 == f11) {
            return;
        }
        this.f30560e1 = z10;
        this.B0 = f7;
        this.f30604z0 = f10;
        this.A0 = f11;
        this.J0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.K0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.K0.setInterpolator(this.M0);
        this.K0.setDuration(250);
        this.K0.addListener(new e51(this, 3));
        this.K0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f30566h0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f30566h0.getId()))) {
                if (this.J && !this.H) {
                    this.I = true;
                } else if (!e(true, true)) {
                    this.f30567h1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f30566h0 != null && this.f30576n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f30566h0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f30566h0.messageOwner.destroyTime = keyAt;
                            this.f30576n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f30566h0.getId() == ((TLRPC.Message) objArr[0]).f17216id) {
            if (this.J && !this.H) {
                this.I = true;
            } else if (!e(true, true)) {
                this.f30567h1 = true;
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
        return this.f30559e0;
    }

    public final void h(File file) {
        if (this.f30551b == null) {
            return;
        }
        i();
        if (this.f30600x == null) {
            m4 m4Var = new m4(this.f30551b);
            this.f30597w = m4Var;
            m4Var.setVisibility(0);
            this.e.addView(this.f30597w, 0, w7.a6.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f30551b);
            this.f30600x = textureView;
            textureView.setOpaque(false);
            this.f30597w.addView(this.f30600x, w7.a6.e(-1, -1, 17));
        }
        this.f30555c0 = false;
        this.f30557d0 = false;
        this.f30600x.setAlpha(1.0f);
        if (this.f30602y == null) {
            f51 f51Var = new f51(this);
            this.f30602y = f51Var;
            f51Var.V(this.f30600x);
            this.f30602y.J = new og.u0(this, file, false, 9);
        }
        this.f30602y.D(Uri.fromFile(file), "other");
        this.f30602y.P(true);
        this.W.a(true, true);
    }

    public final void i() {
        f51 f51Var = this.f30602y;
        if (f51Var != null) {
            this.f30552b0 = 0;
            f51Var.H();
            this.f30602y = null;
        }
        try {
            Activity activity = this.f30551b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        m4 m4Var = this.f30597w;
        if (m4Var != null) {
            this.e.removeView(m4Var);
            this.f30597w = null;
        }
        if (this.f30600x != null) {
            this.f30600x = null;
        }
        this.E = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.y5.cloneSpans(charSequence, 3);
        if (this.f30549a0 == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.X = frameLayout;
            this.Z.setContainer(frameLayout);
            au0 au0Var = new au0(this, this.e.getContext(), this.Z, this.X, 1);
            this.f30549a0 = au0Var;
            this.Z.setScrollView(au0Var);
            this.X.setClipChildren(false);
            this.f30549a0.addView(this.X, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.f30549a0, w7.a6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.Y.o(this.e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Z.getParent() != this.X) {
            this.Z.setMeasureAllChildren(true);
            this.X.addView(this.Z, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Z.getCurrentView().getText());
        ru0 ru0Var = this.Z;
        if (z10) {
            currentView = ru0Var.getNextView();
        } else {
            currentView = ru0Var.getCurrentView();
        }
        int maxLines = currentView.getMaxLines();
        if (maxLines == 1) {
            this.Z.getCurrentView().setSingleLine(false);
            this.Z.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.Z.getCurrentView().setMaxLines(Integer.MAX_VALUE);
            this.Z.getNextView().setMaxLines(Integer.MAX_VALUE);
            this.Z.getCurrentView().setEllipsize(null);
            this.Z.getNextView().setEllipsize(null);
        }
        currentView.setScrollX(0);
        au0 au0Var2 = this.f30549a0;
        au0Var2.f35613l0 = false;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(au0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new c51(this, isEmpty2, isEmpty, 1)).addTransition(new c51(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.f30549a0.f35613l0 = true;
                duration.addTransition(new org.telegram.ui.Components.om0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Z);
            }
            TransitionManager.beginDelayedTransition(this.f30549a0, duration);
            z11 = true;
        } else {
            this.Z.getCurrentView().setText((CharSequence) null);
            au0 au0Var3 = this.f30549a0;
            if (au0Var3 != null) {
                au0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.j6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.i41.A())) {
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
            this.Z.setTag(cloneSpans);
            try {
                this.Z.a(cloneSpans, z10, false);
                au0 au0Var4 = this.f30549a0;
                if (au0Var4 != null) {
                    au0Var4.H(au0Var4.getWidth(), au0Var4.getHeight());
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            ru0 ru0Var2 = this.Z;
            if (this.f30572k0) {
                i10 = 0;
            }
            ru0Var2.setVisibility(i10);
        } else {
            this.Z.a(null, z10, false);
            this.Z.getCurrentView().setTextColor(-1);
            ru0 ru0Var3 = this.Z;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            ru0Var3.b(4, z12);
            this.Z.setTag(null);
        }
        if (this.Z.getCurrentView() instanceof qu0) {
            ((qu0) this.Z.getCurrentView()).setLoading(false);
        }
    }

    public final void k(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        if (this.J && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f30575m1 == z12 && z11) {
            return;
        }
        this.f30575m1 = z12;
        this.V.animate().cancel();
        float f11 = 0.0f;
        float f12 = 0.6f;
        if (z11) {
            ViewPropertyAnimator animate = this.V.animate();
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
            scaleY.alpha(f11).setDuration(340L).setInterpolator(org.telegram.ui.Components.wr.h).start();
            return;
        }
        ImageView imageView = this.V;
        if (z12) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        imageView.setScaleX(f7);
        ImageView imageView2 = this.V;
        if (z12) {
            f12 = 1.0f;
        }
        imageView2.setScaleY(f12);
        ImageView imageView3 = this.V;
        if (z12) {
            f11 = 1.0f;
        }
        imageView3.setAlpha(f11);
    }

    public final void l() {
        int i10;
        this.f30585r.p(true);
        if (this.J) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        bi.x4 x4Var = this.f30585r;
        x4Var.h = bi.x4.a(string, x4Var.getTextPaint());
        this.f30585r.s(string);
        this.f30585r.k(12.0f, 7.0f, 11.0f, 7.0f);
        bi.x4 x4Var2 = this.f30585r;
        x4Var2.getClass();
        x4Var2.f3882e0 = AndroidUtilities.dp(2);
        bi.x4 x4Var3 = this.f30585r;
        x4Var3.getClass();
        x4Var3.f3881d0 = 0.0f;
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.fire_on, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        hj0Var.start();
        x4Var3.j(hj0Var);
        this.f30585r.u();
        MessagesController.getGlobalMainSettings().edit().putInt("viewoncehint", MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void m(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        z41 z41Var = this.f30587r1;
        AndroidUtilities.cancelRunOnUIThread(z41Var);
        if (z10 && this.J) {
            AndroidUtilities.runOnUIThread(z41Var, 3000L);
        }
        if (z10) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z10);
        this.f30572k0 = z10;
        k(z10, z11);
        float f16 = 0.0f;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.Components.y7 y7Var = this.F;
            Property property = View.ALPHA;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(y7Var, property, f12));
            h51 h51Var = this.U;
            t0 t0Var = h51Var.f33282n;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(h51Var, t0Var, f13));
            au0 au0Var = this.f30549a0;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(au0Var, property, f14));
            View view = this.T;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
            View view2 = this.f30561f;
            if (z10) {
                f16 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f16));
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.G.addListener(new e51(this, 1));
            }
            this.G.setDuration(200L);
            this.G.start();
            return;
        }
        org.telegram.ui.Components.y7 y7Var2 = this.F;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        y7Var2.setAlpha(f7);
        au0 au0Var2 = this.f30549a0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        au0Var2.setAlpha(f10);
        View view3 = this.T;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        view3.setAlpha(f11);
        View view4 = this.f30561f;
        if (z10) {
            f16 = 1.0f;
        }
        view4.setAlpha(f16);
        if (!z10) {
            this.F.setVisibility(8);
            this.f30549a0.scrollTo(0, 0);
        }
    }

    public final void n(float f7) {
        ImageReceiver imageReceiver = this.h;
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f7) - this.e.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f7) - this.e.getHeight())) / 2;
        if (imageWidth > 0) {
            this.V0 = -imageWidth;
            this.W0 = imageWidth;
        } else {
            this.W0 = 0.0f;
            this.V0 = 0.0f;
        }
        if (imageHeight > 0) {
            this.X0 = -imageHeight;
            this.Y0 = imageHeight;
            return;
        }
        this.Y0 = 0.0f;
        this.X0 = 0.0f;
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        if (this.f30603y0 != 1.0f) {
            this.f30565g1.a();
            this.f30565g1.c(Math.round(this.f30598w0), Math.round(this.f30601x0), Math.round(f7), Math.round(f10), (int) this.V0, (int) this.W0, (int) this.X0, (int) this.Y0);
            this.e.postInvalidate();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f30563f1) {
            return false;
        }
        if (this.f30602y != null && this.f30572k0 && motionEvent.getX() >= this.V.getX() && motionEvent.getY() >= this.V.getY() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth()) {
            f51 f51Var = this.f30602y;
            f51Var.P(!f51Var.d.u());
            if (this.f30602y.d.u()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f30572k0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f7) {
        this.animationValue = f7;
        this.e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f7) {
        this.f30559e0 = f7;
        this.e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
