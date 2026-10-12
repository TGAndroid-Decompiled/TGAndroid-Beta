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
    public static volatile SecretMediaViewer f32726x1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public boolean E;
    public float E0;
    public org.telegram.ui.Components.b8 F;
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
    public iv0 N;
    public float N0;
    public int O;
    public float O0;
    public int P;
    public float P0;
    public org.telegram.ui.Components.j81 Q;
    public float Q0;
    public x50 R;
    public float R0;
    public org.telegram.ui.ActionBar.h5 S;
    public float S0;
    public View T;
    public float T0;
    public l51 U;
    public float U0;
    public ImageView V;
    public float V0;
    public org.telegram.ui.Components.gh0 W;
    public float W0;
    public FrameLayout X;
    public float X0;
    public dt0 Y;
    public float Y0;
    public yu0 Z;
    public boolean Z0;
    public int f32727a;
    public iu0 f32728a0;
    public boolean f32729a1;
    private float animationValue;
    public Activity f32730b;
    public int f32731b0;
    public boolean f32732b1;
    public WindowManager.LayoutParams f32733c;
    public boolean f32734c0;
    public boolean f32735c1;
    public l0 d;
    public boolean f32736d0;
    public boolean f32737d1;
    public ah.v e;
    public float f32738e0;
    public boolean f32739e1;
    public View f32740f;
    public long f32741f0;
    public boolean f32742f1;
    public WindowInsets f32743g0;
    public org.telegram.ui.Components.pn0 f32744g1;
    public MessageObject f32745h0;
    public boolean f32746h1;
    public ImageReceiver.BitmapHolder f32747i0;
    public final d51 f32748i1;
    public boolean f32749j0;
    public final int[] f32750j1;
    public final int[] f32752k1;
    public nb0 l1;
    public int m0;
    public boolean f32754m1;
    public k51 f32755n;
    public long f32756n0;
    public int f32757n1;
    public Runnable f32758o0;
    public boolean f32759o1;
    public boolean f32760p0;
    public Runnable f32761p1;
    public float f32762q0;
    public boolean f32763q1;
    public di.d4 f32764r;
    public float f32765r0;
    public final d51 f32766r1;
    public boolean f32767s;
    public float f32768s0;
    public float[] f32769s1;
    public float f32770t0;
    public final Path f32771t1;
    public float f32772u0;
    public final v0 f32773u1;
    public long v;
    public float f32774v0;
    public final v0 f32775v1;
    public n4 f32776w;
    public float f32777w0;
    public boolean f32778w1;
    public TextureView f32779x;
    public float f32780x0;
    public j51 f32781y;
    public float f32782y0;
    public float f32783z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f32751k0 = true;
    public final PhotoBackgroundDrawable f32753l0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public hz0 f32784a;
        public int f32785b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            hz0 hz0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f32785b == 2 && (hz0Var = this.f32784a) != null) {
                    hz0Var.run();
                    this.f32784a = null;
                } else {
                    invalidateSelf();
                }
                this.f32785b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            nb0 nb0Var = secretMediaViewer.l1;
            if (nb0Var != null) {
                if (secretMediaViewer.f32749j0 && i10 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nb0Var.a(z10);
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
        this.f32782y0 = 1.0f;
        this.M0 = new DecelerateInterpolator(1.5f);
        this.O0 = 1.0f;
        this.f32737d1 = true;
        this.f32748i1 = new d51(this, 2);
        this.f32750j1 = new int[2];
        this.f32752k1 = new int[2];
        this.f32766r1 = new d51(this, 3);
        this.f32771t1 = new Path();
        this.f32773u1 = new v0("videoCrossfadeAlpha", 4);
        this.f32775v1 = new v0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f32743g0;
        secretMediaViewer.f32743g0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f32726x1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f32726x1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f32726x1 = secretMediaViewer;
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
        if (f32726x1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f7, float f10, float f11, boolean z10) {
        if (this.f32782y0 == f7 && this.f32777w0 == f10 && this.f32780x0 == f11) {
            return;
        }
        this.f32739e1 = z10;
        this.B0 = f7;
        this.f32783z0 = f10;
        this.A0 = f11;
        this.J0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.K0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.K0.setInterpolator(this.M0);
        this.K0.setDuration(250);
        this.K0.addListener(new i51(this, 3));
        this.K0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f32745h0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f32745h0.getId()))) {
                if (this.J && !this.H) {
                    this.I = true;
                } else if (!e(true, true)) {
                    this.f32746h1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f32745h0 != null && this.f32755n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f32745h0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f32745h0.messageOwner.destroyTime = keyAt;
                            this.f32755n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f32745h0.getId() == ((TLRPC.Message) objArr[0]).f19237id) {
            if (this.J && !this.H) {
                this.I = true;
            } else if (!e(true, true)) {
                this.f32746h1 = true;
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
        return this.f32738e0;
    }

    public final void h(File file) {
        if (this.f32730b == null) {
            return;
        }
        i();
        if (this.f32779x == null) {
            n4 n4Var = new n4(this.f32730b);
            this.f32776w = n4Var;
            n4Var.setVisibility(0);
            this.e.addView(this.f32776w, 0, w7.a6.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f32730b);
            this.f32779x = textureView;
            textureView.setOpaque(false);
            this.f32776w.addView(this.f32779x, w7.a6.e(-1, -1, 17));
        }
        this.f32734c0 = false;
        this.f32736d0 = false;
        this.f32779x.setAlpha(1.0f);
        if (this.f32781y == null) {
            j51 j51Var = new j51(this);
            this.f32781y = j51Var;
            j51Var.V(this.f32779x);
            this.f32781y.J = new n6.o(this, file, false, 10);
        }
        this.f32781y.D(Uri.fromFile(file), "other");
        this.f32781y.P(true);
        this.W.a(true, true);
    }

    public final void i() {
        j51 j51Var = this.f32781y;
        if (j51Var != null) {
            this.f32731b0 = 0;
            j51Var.H();
            this.f32781y = null;
        }
        try {
            Activity activity = this.f32730b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        n4 n4Var = this.f32776w;
        if (n4Var != null) {
            this.e.removeView(n4Var);
            this.f32776w = null;
        }
        if (this.f32779x != null) {
            this.f32779x = null;
        }
        this.E = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.b6.cloneSpans(charSequence, 3);
        if (this.f32728a0 == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.X = frameLayout;
            this.Z.setContainer(frameLayout);
            iu0 iu0Var = new iu0(this, this.e.getContext(), this.Z, this.X, 1);
            this.f32728a0 = iu0Var;
            this.Z.setScrollView(iu0Var);
            this.X.setClipChildren(false);
            this.f32728a0.addView(this.X, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.f32728a0, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
            this.Y.n(this.e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Z.getParent() != this.X) {
            this.Z.setMeasureAllChildren(true);
            this.X.addView(this.Z, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Z.getCurrentView().getText());
        yu0 yu0Var = this.Z;
        if (z10) {
            currentView = yu0Var.getNextView();
        } else {
            currentView = yu0Var.getCurrentView();
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
        iu0 iu0Var2 = this.f32728a0;
        iu0Var2.f41083l0 = false;
        if (z10) {
            TransitionManager.endTransitions(iu0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new g51(this, isEmpty2, isEmpty, 1)).addTransition(new g51(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.f32728a0.f41083l0 = true;
                duration.addTransition(new org.telegram.ui.Components.gn0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Z);
            }
            TransitionManager.beginDelayedTransition(this.f32728a0, duration);
            z11 = true;
        } else {
            this.Z.getCurrentView().setText((CharSequence) null);
            iu0 iu0Var3 = this.f32728a0;
            if (iu0Var3 != null) {
                iu0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.g6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.x41.D())) {
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
                iu0 iu0Var4 = this.f32728a0;
                if (iu0Var4 != null) {
                    iu0Var4.H(iu0Var4.getWidth(), iu0Var4.getHeight());
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            yu0 yu0Var2 = this.Z;
            if (this.f32751k0) {
                i10 = 0;
            }
            yu0Var2.setVisibility(i10);
        } else {
            this.Z.a(null, z10, false);
            this.Z.getCurrentView().setTextColor(-1);
            yu0 yu0Var3 = this.Z;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            yu0Var3.b(4, z12);
            this.Z.setTag(null);
        }
        if (this.Z.getCurrentView() instanceof xu0) {
            ((xu0) this.Z.getCurrentView()).setLoading(false);
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
        if (this.f32754m1 == z12 && z11) {
            return;
        }
        this.f32754m1 = z12;
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
            scaleY.alpha(f11).setDuration(340L).setInterpolator(org.telegram.ui.Components.es.h).start();
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
        this.f32764r.p(true);
        if (this.J) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        di.d4 d4Var = this.f32764r;
        d4Var.h = di.d4.a(string, d4Var.getTextPaint());
        this.f32764r.s(string);
        this.f32764r.k(12.0f, 7.0f, 11.0f, 7.0f);
        di.d4 d4Var2 = this.f32764r;
        d4Var2.getClass();
        d4Var2.f6793e0 = AndroidUtilities.dp(2);
        di.d4 d4Var3 = this.f32764r;
        d4Var3.getClass();
        d4Var3.f6792d0 = 0.0f;
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.fire_on, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        yj0Var.start();
        d4Var3.j(yj0Var);
        this.f32764r.u();
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
        d51 d51Var = this.f32766r1;
        AndroidUtilities.cancelRunOnUIThread(d51Var);
        if (z10 && this.J) {
            AndroidUtilities.runOnUIThread(d51Var, 3000L);
        }
        if (z10) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z10);
        this.f32751k0 = z10;
        k(z10, z11);
        float f16 = 0.0f;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.Components.b8 b8Var = this.F;
            Property property = View.ALPHA;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(b8Var, property, f12));
            l51 l51Var = this.U;
            v0 v0Var = l51Var.f37851n;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(l51Var, v0Var, f13));
            iu0 iu0Var = this.f32728a0;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(iu0Var, property, f14));
            View view = this.T;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
            View view2 = this.f32740f;
            if (z10) {
                f16 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f16));
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.G.addListener(new i51(this, 1));
            }
            this.G.setDuration(200L);
            this.G.start();
            return;
        }
        org.telegram.ui.Components.b8 b8Var2 = this.F;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        b8Var2.setAlpha(f7);
        iu0 iu0Var2 = this.f32728a0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        iu0Var2.setAlpha(f10);
        View view3 = this.T;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        view3.setAlpha(f11);
        View view4 = this.f32740f;
        if (z10) {
            f16 = 1.0f;
        }
        view4.setAlpha(f16);
        if (!z10) {
            this.F.setVisibility(8);
            this.f32728a0.scrollTo(0, 0);
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
    public final boolean onDoubleTap(android.view.MotionEvent r8) {
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
        if (this.f32782y0 != 1.0f) {
            this.f32744g1.a();
            this.f32744g1.c(Math.round(this.f32777w0), Math.round(this.f32780x0), Math.round(f7), Math.round(f10), (int) this.V0, (int) this.W0, (int) this.X0, (int) this.Y0);
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
        if (this.f32742f1) {
            return false;
        }
        if (this.f32781y != null && this.f32751k0 && motionEvent.getX() >= this.V.getX() && motionEvent.getY() >= this.V.getY() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth()) {
            j51 j51Var = this.f32781y;
            j51Var.P(!j51Var.d.t());
            if (this.f32781y.d.t()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f32751k0, true);
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
        this.f32738e0 = f7;
        this.e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
