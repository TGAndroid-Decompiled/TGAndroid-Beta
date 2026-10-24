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
    public static volatile SecretMediaViewer f34086x1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public boolean E;
    public float E0;
    public org.telegram.ui.Components.x7 F;
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
    public ju0 N;
    public float N0;
    public int O;
    public float O0;
    public int P;
    public float P0;
    public org.telegram.ui.Components.l81 Q;
    public float Q0;
    public e50 R;
    public float R0;
    public org.telegram.ui.ActionBar.n5 S;
    public float S0;
    public View T;
    public float T0;
    public u31 U;
    public float U0;
    public ImageView V;
    public float V0;
    public org.telegram.ui.Components.dh0 W;
    public float W0;
    public FrameLayout X;
    public float X0;
    public es0 Y;
    public float Y0;
    public zt0 Z;
    public boolean Z0;
    public int f34087a;
    public jt0 f34088a0;
    public boolean f34089a1;
    private float animationValue;
    public Activity f34090b;
    public int f34091b0;
    public boolean f34092b1;
    public WindowManager.LayoutParams f34093c;
    public boolean f34094c0;
    public boolean f34095c1;
    public l0 d;
    public boolean f34096d0;
    public boolean f34097d1;
    public ah.v e;
    public float f34098e0;
    public boolean f34099e1;
    public View f34100f;
    public long f34101f0;
    public boolean f34102f1;
    public WindowInsets f34103g0;
    public org.telegram.ui.Components.on0 f34104g1;
    public MessageObject f34105h0;
    public boolean f34106h1;
    public ImageReceiver.BitmapHolder f34107i0;
    public final m31 f34108i1;
    public boolean f34109j0;
    public final int[] f34110j1;
    public final int[] f34112k1;
    public ta0 l1;
    public int m0;
    public boolean f34114m1;
    public t31 f34115n;
    public long f34116n0;
    public int f34117n1;
    public Runnable f34118o0;
    public boolean f34119o1;
    public boolean f34120p0;
    public Runnable f34121p1;
    public float f34122q0;
    public boolean f34123q1;
    public ei.x3 f34124r;
    public float f34125r0;
    public final m31 f34126r1;
    public boolean f34127s;
    public float f34128s0;
    public float[] f34129s1;
    public float f34130t0;
    public final Path f34131t1;
    public float f34132u0;
    public final u0 f34133u1;
    public long v;
    public float f34134v0;
    public final u0 f34135v1;
    public n4 f34136w;
    public float f34137w0;
    public boolean f34138w1;
    public TextureView f34139x;
    public float f34140x0;
    public s31 f34141y;
    public float f34142y0;
    public float f34143z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f34111k0 = true;
    public final PhotoBackgroundDrawable f34113l0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public lv0 f34144a;
        public int f34145b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            lv0 lv0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f34145b == 2 && (lv0Var = this.f34144a) != null) {
                    lv0Var.run();
                    this.f34144a = null;
                } else {
                    invalidateSelf();
                }
                this.f34145b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            ta0 ta0Var = secretMediaViewer.l1;
            if (ta0Var != null) {
                if (secretMediaViewer.f34109j0 && i10 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ta0Var.a(z10);
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
        this.f34142y0 = 1.0f;
        this.M0 = new DecelerateInterpolator(1.5f);
        this.O0 = 1.0f;
        this.f34097d1 = true;
        this.f34108i1 = new m31(this, 2);
        this.f34110j1 = new int[2];
        this.f34112k1 = new int[2];
        this.f34126r1 = new m31(this, 3);
        this.f34131t1 = new Path();
        this.f34133u1 = new u0("videoCrossfadeAlpha", 4);
        this.f34135v1 = new u0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f34103g0;
        secretMediaViewer.f34103g0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f34086x1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f34086x1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f34086x1 = secretMediaViewer;
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
        if (f34086x1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f7, float f10, float f11, boolean z10) {
        if (this.f34142y0 == f7 && this.f34137w0 == f10 && this.f34140x0 == f11) {
            return;
        }
        this.f34099e1 = z10;
        this.B0 = f7;
        this.f34143z0 = f10;
        this.A0 = f11;
        this.J0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.K0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.K0.setInterpolator(this.M0);
        this.K0.setDuration(250);
        this.K0.addListener(new r31(this, 3));
        this.K0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f34105h0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f34105h0.getId()))) {
                if (this.J && !this.H) {
                    this.I = true;
                } else if (!e(true, true)) {
                    this.f34106h1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f34105h0 != null && this.f34115n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f34105h0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f34105h0.messageOwner.destroyTime = keyAt;
                            this.f34115n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f34105h0.getId() == ((TLRPC.Message) objArr[0]).f20365id) {
            if (this.J && !this.H) {
                this.I = true;
            } else if (!e(true, true)) {
                this.f34106h1 = true;
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
        return this.f34098e0;
    }

    public final void h(File file) {
        if (this.f34090b == null) {
            return;
        }
        i();
        if (this.f34139x == null) {
            n4 n4Var = new n4(this.f34090b);
            this.f34136w = n4Var;
            n4Var.setVisibility(0);
            this.e.addView(this.f34136w, 0, w7.z5.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f34090b);
            this.f34139x = textureView;
            textureView.setOpaque(false);
            this.f34136w.addView(this.f34139x, w7.z5.e(-1, -1, 17));
        }
        this.f34094c0 = false;
        this.f34096d0 = false;
        this.f34139x.setAlpha(1.0f);
        if (this.f34141y == null) {
            s31 s31Var = new s31(this);
            this.f34141y = s31Var;
            s31Var.V(this.f34139x);
            this.f34141y.J = new n2.e(this, file, false, 11);
        }
        this.f34141y.D(Uri.fromFile(file), "other");
        this.f34141y.P(true);
        this.W.a(true, true);
    }

    public final void i() {
        s31 s31Var = this.f34141y;
        if (s31Var != null) {
            this.f34091b0 = 0;
            s31Var.H();
            this.f34141y = null;
        }
        try {
            Activity activity = this.f34090b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        n4 n4Var = this.f34136w;
        if (n4Var != null) {
            this.e.removeView(n4Var);
            this.f34136w = null;
        }
        if (this.f34139x != null) {
            this.f34139x = null;
        }
        this.E = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.y5.cloneSpans(charSequence, 3);
        if (this.f34088a0 == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.X = frameLayout;
            this.Z.setContainer(frameLayout);
            jt0 jt0Var = new jt0(this, this.e.getContext(), this.Z, this.X, 1);
            this.f34088a0 = jt0Var;
            this.Z.setScrollView(jt0Var);
            this.X.setClipChildren(false);
            this.f34088a0.addView(this.X, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.f34088a0, w7.z5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.Y.n(this.e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Z.getParent() != this.X) {
            this.Z.setMeasureAllChildren(true);
            this.X.addView(this.Z, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Z.getCurrentView().getText());
        zt0 zt0Var = this.Z;
        if (z10) {
            currentView = zt0Var.getNextView();
        } else {
            currentView = zt0Var.getCurrentView();
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
        jt0 jt0Var2 = this.f34088a0;
        jt0Var2.f43409l0 = false;
        if (z10) {
            TransitionManager.endTransitions(jt0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new p31(this, isEmpty2, isEmpty, 1)).addTransition(new p31(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.f34088a0.f43409l0 = true;
                duration.addTransition(new org.telegram.ui.Components.fn0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Z);
            }
            TransitionManager.beginDelayedTransition(this.f34088a0, duration);
            z11 = true;
        } else {
            this.Z.getCurrentView().setText((CharSequence) null);
            jt0 jt0Var3 = this.f34088a0;
            if (jt0Var3 != null) {
                jt0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.k6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.x41.L())) {
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
                jt0 jt0Var4 = this.f34088a0;
                if (jt0Var4 != null) {
                    jt0Var4.H(jt0Var4.getWidth(), jt0Var4.getHeight());
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            zt0 zt0Var2 = this.Z;
            if (this.f34111k0) {
                i10 = 0;
            }
            zt0Var2.setVisibility(i10);
        } else {
            this.Z.a(null, z10, false);
            this.Z.getCurrentView().setTextColor(-1);
            zt0 zt0Var3 = this.Z;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            zt0Var3.b(4, z12);
            this.Z.setTag(null);
        }
        if (this.Z.getCurrentView() instanceof yt0) {
            ((yt0) this.Z.getCurrentView()).setLoading(false);
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
        if (this.f34114m1 == z12 && z11) {
            return;
        }
        this.f34114m1 = z12;
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
            scaleY.alpha(f11).setDuration(340L).setInterpolator(org.telegram.ui.Components.zr.h).start();
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
        this.f34124r.p(true);
        if (this.J) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        ei.x3 x3Var = this.f34124r;
        x3Var.h = ei.x3.a(string, x3Var.getTextPaint());
        this.f34124r.s(string);
        this.f34124r.k(12.0f, 7.0f, 11.0f, 7.0f);
        ei.x3 x3Var2 = this.f34124r;
        x3Var2.getClass();
        x3Var2.f10089e0 = AndroidUtilities.dp(2);
        ei.x3 x3Var3 = this.f34124r;
        x3Var3.getClass();
        x3Var3.f10088d0 = 0.0f;
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.fire_on, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        xj0Var.start();
        x3Var3.j(xj0Var);
        this.f34124r.u();
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
        m31 m31Var = this.f34126r1;
        AndroidUtilities.cancelRunOnUIThread(m31Var);
        if (z10 && this.J) {
            AndroidUtilities.runOnUIThread(m31Var, 3000L);
        }
        if (z10) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z10);
        this.f34111k0 = z10;
        k(z10, z11);
        float f16 = 0.0f;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.Components.x7 x7Var = this.F;
            Property property = View.ALPHA;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(x7Var, property, f12));
            u31 u31Var = this.U;
            u0 u0Var = u31Var.f42202n;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(u31Var, u0Var, f13));
            jt0 jt0Var = this.f34088a0;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(jt0Var, property, f14));
            View view = this.T;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
            View view2 = this.f34100f;
            if (z10) {
                f16 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f16));
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.G.addListener(new r31(this, 1));
            }
            this.G.setDuration(200L);
            this.G.start();
            return;
        }
        org.telegram.ui.Components.x7 x7Var2 = this.F;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        x7Var2.setAlpha(f7);
        jt0 jt0Var2 = this.f34088a0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        jt0Var2.setAlpha(f10);
        View view3 = this.T;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        view3.setAlpha(f11);
        View view4 = this.f34100f;
        if (z10) {
            f16 = 1.0f;
        }
        view4.setAlpha(f16);
        if (!z10) {
            this.F.setVisibility(8);
            this.f34088a0.scrollTo(0, 0);
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
        if (this.f34142y0 != 1.0f) {
            this.f34104g1.a();
            this.f34104g1.c(Math.round(this.f34137w0), Math.round(this.f34140x0), Math.round(f7), Math.round(f10), (int) this.V0, (int) this.W0, (int) this.X0, (int) this.Y0);
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
        if (this.f34102f1) {
            return false;
        }
        if (this.f34141y != null && this.f34111k0 && motionEvent.getX() >= this.V.getX() && motionEvent.getY() >= this.V.getY() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth()) {
            s31 s31Var = this.f34141y;
            s31Var.P(!s31Var.d.t());
            if (this.f34141y.d.t()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f34111k0, true);
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
        this.f34098e0 = f7;
        this.e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
