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
    public static volatile SecretMediaViewer f31723x1;
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
    public wu0 N;
    public float N0;
    public int O;
    public float O0;
    public int P;
    public float P0;
    public org.telegram.ui.Components.w71 Q;
    public float Q0;
    public q50 R;
    public float R0;
    public org.telegram.ui.ActionBar.j5 S;
    public float S0;
    public View T;
    public float T0;
    public y41 U;
    public float U0;
    public ImageView V;
    public float V0;
    public org.telegram.ui.Components.sg0 W;
    public float W0;
    public FrameLayout X;
    public float X0;
    public rs0 Y;
    public float Y0;
    public mu0 Z;
    public boolean Z0;
    public int f31724a;
    public wt0 f31725a0;
    public boolean f31726a1;
    private float animationValue;
    public Activity f31727b;
    public int f31728b0;
    public boolean f31729b1;
    public WindowManager.LayoutParams f31730c;
    public boolean f31731c0;
    public boolean f31732c1;
    public l0 d;
    public boolean f31733d0;
    public boolean f31734d1;
    public ci.m6 e;
    public float f31735e0;
    public boolean f31736e1;
    public View f31737f;
    public long f31738f0;
    public boolean f31739f1;
    public WindowInsets f31740g0;
    public org.telegram.ui.Components.bn0 f31741g1;
    public MessageObject f31742h0;
    public boolean f31743h1;
    public ImageReceiver.BitmapHolder f31744i0;
    public final q41 f31745i1;
    public boolean f31746j0;
    public final int[] f31747j1;
    public final int[] f31749k1;
    public hb0 l1;
    public int m0;
    public boolean f31751m1;
    public x41 f31752n;
    public long f31753n0;
    public int f31754n1;
    public Runnable f31755o0;
    public boolean f31756o1;
    public boolean f31757p0;
    public Runnable f31758p1;
    public float f31759q0;
    public boolean f31760q1;
    public ci.e4 f31761r;
    public float f31762r0;
    public final q41 f31763r1;
    public boolean f31764s;
    public float f31765s0;
    public float[] f31766s1;
    public float f31767t0;
    public final Path f31768t1;
    public float f31769u0;
    public final u0 f31770u1;
    public long v;
    public float f31771v0;
    public final u0 f31772v1;
    public m4 f31773w;
    public float f31774w0;
    public boolean f31775w1;
    public TextureView f31776x;
    public float f31777x0;
    public w41 f31778y;
    public float f31779y0;
    public float f31780z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f31748k0 = true;
    public final PhotoBackgroundDrawable f31750l0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public by0 f31781a;
        public int f31782b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            by0 by0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f31782b == 2 && (by0Var = this.f31781a) != null) {
                    by0Var.run();
                    this.f31781a = null;
                } else {
                    invalidateSelf();
                }
                this.f31782b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            hb0 hb0Var = secretMediaViewer.l1;
            if (hb0Var != null) {
                if (secretMediaViewer.f31746j0 && i10 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hb0Var.a(z10);
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
        this.f31779y0 = 1.0f;
        this.M0 = new DecelerateInterpolator(1.5f);
        this.O0 = 1.0f;
        this.f31734d1 = true;
        this.f31745i1 = new q41(this, 2);
        this.f31747j1 = new int[2];
        this.f31749k1 = new int[2];
        this.f31763r1 = new q41(this, 3);
        this.f31768t1 = new Path();
        this.f31770u1 = new u0("videoCrossfadeAlpha", 4);
        this.f31772v1 = new u0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f31740g0;
        secretMediaViewer.f31740g0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f31723x1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f31723x1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f31723x1 = secretMediaViewer;
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
        if (f31723x1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f7, float f10, float f11, boolean z10) {
        if (this.f31779y0 == f7 && this.f31774w0 == f10 && this.f31777x0 == f11) {
            return;
        }
        this.f31736e1 = z10;
        this.B0 = f7;
        this.f31780z0 = f10;
        this.A0 = f11;
        this.J0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.K0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.K0.setInterpolator(this.M0);
        this.K0.setDuration(250);
        this.K0.addListener(new v41(this, 3));
        this.K0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f31742h0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f31742h0.getId()))) {
                if (this.J && !this.H) {
                    this.I = true;
                } else if (!e(true, true)) {
                    this.f31743h1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f31742h0 != null && this.f31752n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f31742h0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f31742h0.messageOwner.destroyTime = keyAt;
                            this.f31752n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f31742h0.getId() == ((TLRPC.Message) objArr[0]).f18350id) {
            if (this.J && !this.H) {
                this.I = true;
            } else if (!e(true, true)) {
                this.f31743h1 = true;
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
        return this.f31735e0;
    }

    public final void h(File file) {
        if (this.f31727b == null) {
            return;
        }
        i();
        if (this.f31776x == null) {
            m4 m4Var = new m4(this.f31727b);
            this.f31773w = m4Var;
            m4Var.setVisibility(0);
            this.e.addView(this.f31773w, 0, w7.y5.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f31727b);
            this.f31776x = textureView;
            textureView.setOpaque(false);
            this.f31773w.addView(this.f31776x, w7.y5.e(-1, -1, 17));
        }
        this.f31731c0 = false;
        this.f31733d0 = false;
        this.f31776x.setAlpha(1.0f);
        if (this.f31778y == null) {
            w41 w41Var = new w41(this);
            this.f31778y = w41Var;
            w41Var.V(this.f31776x);
            this.f31778y.J = new n7.z0(this, file, false, 9);
        }
        this.f31778y.D(Uri.fromFile(file), "other");
        this.f31778y.P(true);
        this.W.a(true, true);
    }

    public final void i() {
        w41 w41Var = this.f31778y;
        if (w41Var != null) {
            this.f31728b0 = 0;
            w41Var.H();
            this.f31778y = null;
        }
        try {
            Activity activity = this.f31727b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        m4 m4Var = this.f31773w;
        if (m4Var != null) {
            this.e.removeView(m4Var);
            this.f31773w = null;
        }
        if (this.f31776x != null) {
            this.f31776x = null;
        }
        this.E = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.z5.cloneSpans(charSequence, 3);
        if (this.f31725a0 == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.X = frameLayout;
            this.Z.setContainer(frameLayout);
            wt0 wt0Var = new wt0(this, this.e.getContext(), this.Z, this.X, 1);
            this.f31725a0 = wt0Var;
            this.Z.setScrollView(wt0Var);
            this.X.setClipChildren(false);
            this.f31725a0.addView(this.X, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.f31725a0, w7.y5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.Y.o(this.e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Z.getParent() != this.X) {
            this.Z.setMeasureAllChildren(true);
            this.X.addView(this.Z, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Z.getCurrentView().getText());
        mu0 mu0Var = this.Z;
        if (z10) {
            currentView = mu0Var.getNextView();
        } else {
            currentView = mu0Var.getCurrentView();
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
        wt0 wt0Var2 = this.f31725a0;
        wt0Var2.f34859l0 = false;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(wt0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new t41(this, isEmpty2, isEmpty, 1)).addTransition(new t41(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.f31725a0.f34859l0 = true;
                duration.addTransition(new org.telegram.ui.Components.sm0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Z);
            }
            TransitionManager.beginDelayedTransition(this.f31725a0, duration);
            z11 = true;
        } else {
            this.Z.getCurrentView().setText((CharSequence) null);
            wt0 wt0Var3 = this.f31725a0;
            if (wt0Var3 != null) {
                wt0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.i6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.k41.A())) {
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
                wt0 wt0Var4 = this.f31725a0;
                if (wt0Var4 != null) {
                    wt0Var4.H(wt0Var4.getWidth(), wt0Var4.getHeight());
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            mu0 mu0Var2 = this.Z;
            if (this.f31748k0) {
                i10 = 0;
            }
            mu0Var2.setVisibility(i10);
        } else {
            this.Z.a(null, z10, false);
            this.Z.getCurrentView().setTextColor(-1);
            mu0 mu0Var3 = this.Z;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            mu0Var3.b(4, z12);
            this.Z.setTag(null);
        }
        if (this.Z.getCurrentView() instanceof lu0) {
            ((lu0) this.Z.getCurrentView()).setLoading(false);
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
        if (this.f31751m1 == z12 && z11) {
            return;
        }
        this.f31751m1 = z12;
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
            scaleY.alpha(f11).setDuration(340L).setInterpolator(org.telegram.ui.Components.sr.h).start();
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
        this.f31761r.p(true);
        if (this.J) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        ci.e4 e4Var = this.f31761r;
        e4Var.h = ci.e4.a(string, e4Var.getTextPaint());
        this.f31761r.s(string);
        this.f31761r.k(12.0f, 7.0f, 11.0f, 7.0f);
        ci.e4 e4Var2 = this.f31761r;
        e4Var2.getClass();
        e4Var2.f4617e0 = AndroidUtilities.dp(2);
        ci.e4 e4Var3 = this.f31761r;
        e4Var3.getClass();
        e4Var3.f4616d0 = 0.0f;
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(R.raw.fire_on, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        kj0Var.start();
        e4Var3.j(kj0Var);
        this.f31761r.u();
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
        q41 q41Var = this.f31763r1;
        AndroidUtilities.cancelRunOnUIThread(q41Var);
        if (z10 && this.J) {
            AndroidUtilities.runOnUIThread(q41Var, 3000L);
        }
        if (z10) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z10);
        this.f31748k0 = z10;
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
            y41 y41Var = this.U;
            u0 u0Var = y41Var.f40134n;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(y41Var, u0Var, f13));
            wt0 wt0Var = this.f31725a0;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(wt0Var, property, f14));
            View view = this.T;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
            View view2 = this.f31737f;
            if (z10) {
                f16 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f16));
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.G.addListener(new v41(this, 1));
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
        wt0 wt0Var2 = this.f31725a0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        wt0Var2.setAlpha(f10);
        View view3 = this.T;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        view3.setAlpha(f11);
        View view4 = this.f31737f;
        if (z10) {
            f16 = 1.0f;
        }
        view4.setAlpha(f16);
        if (!z10) {
            this.F.setVisibility(8);
            this.f31725a0.scrollTo(0, 0);
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
        if (this.f31779y0 != 1.0f) {
            this.f31741g1.a();
            this.f31741g1.c(Math.round(this.f31774w0), Math.round(this.f31777x0), Math.round(f7), Math.round(f10), (int) this.V0, (int) this.W0, (int) this.X0, (int) this.Y0);
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
        if (this.f31739f1) {
            return false;
        }
        if (this.f31778y != null && this.f31748k0 && motionEvent.getX() >= this.V.getX() && motionEvent.getY() >= this.V.getY() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth()) {
            w41 w41Var = this.f31778y;
            w41Var.P(!w41Var.d.u());
            if (this.f31778y.d.u()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f31748k0, true);
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
        this.f31735e0 = f7;
        this.e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
