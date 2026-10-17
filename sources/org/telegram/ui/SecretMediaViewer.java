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
    public static volatile SecretMediaViewer f33768x1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public boolean E;
    public float E0;
    public org.telegram.ui.Components.z7 F;
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
    public org.telegram.ui.Components.c81 Q;
    public float Q0;
    public x10 R;
    public float R0;
    public org.telegram.ui.ActionBar.j5 S;
    public float S0;
    public View T;
    public float T0;
    public t31 U;
    public float U0;
    public ImageView V;
    public float V0;
    public org.telegram.ui.Components.ah0 W;
    public float W0;
    public FrameLayout X;
    public float X0;
    public es0 Y;
    public float Y0;
    public zt0 Z;
    public boolean Z0;
    public int f33769a;
    public jt0 f33770a0;
    public boolean f33771a1;
    private float animationValue;
    public Activity f33772b;
    public int f33773b0;
    public boolean f33774b1;
    public WindowManager.LayoutParams f33775c;
    public boolean f33776c0;
    public boolean f33777c1;
    public m0 d;
    public boolean f33778d0;
    public boolean f33779d1;
    public ah.v e;
    public float f33780e0;
    public boolean f33781e1;
    public View f33782f;
    public long f33783f0;
    public boolean f33784f1;
    public WindowInsets f33785g0;
    public org.telegram.ui.Components.ln0 f33786g1;
    public MessageObject f33787h0;
    public boolean f33788h1;
    public ImageReceiver.BitmapHolder f33789i0;
    public final l31 f33790i1;
    public boolean f33791j0;
    public final int[] f33792j1;
    public final int[] f33794k1;
    public pa0 l1;
    public int m0;
    public boolean f33796m1;
    public s31 f33797n;
    public long f33798n0;
    public int f33799n1;
    public Runnable f33800o0;
    public boolean f33801o1;
    public boolean f33802p0;
    public Runnable f33803p1;
    public float f33804q0;
    public boolean f33805q1;
    public ei.x3 f33806r;
    public float f33807r0;
    public final l31 f33808r1;
    public boolean f33809s;
    public float f33810s0;
    public float[] f33811s1;
    public float f33812t0;
    public final Path f33813t1;
    public float f33814u0;
    public final v0 f33815u1;
    public long v;
    public float f33816v0;
    public final v0 f33817v1;
    public o4 f33818w;
    public float f33819w0;
    public boolean f33820w1;
    public TextureView f33821x;
    public float f33822x0;
    public r31 f33823y;
    public float f33824y0;
    public float f33825z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f33793k0 = true;
    public final PhotoBackgroundDrawable f33795l0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public lv0 f33826a;
        public int f33827b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            lv0 lv0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f33827b == 2 && (lv0Var = this.f33826a) != null) {
                    lv0Var.run();
                    this.f33826a = null;
                } else {
                    invalidateSelf();
                }
                this.f33827b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            pa0 pa0Var = secretMediaViewer.l1;
            if (pa0Var != null) {
                if (secretMediaViewer.f33791j0 && i10 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pa0Var.a(z10);
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
        this.f33824y0 = 1.0f;
        this.M0 = new DecelerateInterpolator(1.5f);
        this.O0 = 1.0f;
        this.f33779d1 = true;
        this.f33790i1 = new l31(this, 2);
        this.f33792j1 = new int[2];
        this.f33794k1 = new int[2];
        this.f33808r1 = new l31(this, 3);
        this.f33813t1 = new Path();
        this.f33815u1 = new v0("videoCrossfadeAlpha", 4);
        this.f33817v1 = new v0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f33785g0;
        secretMediaViewer.f33785g0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f33768x1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f33768x1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f33768x1 = secretMediaViewer;
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
        if (f33768x1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f7, float f10, float f11, boolean z10) {
        if (this.f33824y0 == f7 && this.f33819w0 == f10 && this.f33822x0 == f11) {
            return;
        }
        this.f33781e1 = z10;
        this.B0 = f7;
        this.f33825z0 = f10;
        this.A0 = f11;
        this.J0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.K0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.K0.setInterpolator(this.M0);
        this.K0.setDuration(250);
        this.K0.addListener(new q31(this, 3));
        this.K0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f33787h0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f33787h0.getId()))) {
                if (this.J && !this.H) {
                    this.I = true;
                } else if (!e(true, true)) {
                    this.f33788h1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f33787h0 != null && this.f33797n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f33787h0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f33787h0.messageOwner.destroyTime = keyAt;
                            this.f33797n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f33787h0.getId() == ((TLRPC.Message) objArr[0]).f20293id) {
            if (this.J && !this.H) {
                this.I = true;
            } else if (!e(true, true)) {
                this.f33788h1 = true;
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
        return this.f33780e0;
    }

    public final void h(File file) {
        if (this.f33772b == null) {
            return;
        }
        i();
        if (this.f33821x == null) {
            o4 o4Var = new o4(this.f33772b);
            this.f33818w = o4Var;
            o4Var.setVisibility(0);
            this.e.addView(this.f33818w, 0, w7.z5.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f33772b);
            this.f33821x = textureView;
            textureView.setOpaque(false);
            this.f33818w.addView(this.f33821x, w7.z5.e(-1, -1, 17));
        }
        this.f33776c0 = false;
        this.f33778d0 = false;
        this.f33821x.setAlpha(1.0f);
        if (this.f33823y == null) {
            r31 r31Var = new r31(this);
            this.f33823y = r31Var;
            r31Var.V(this.f33821x);
            this.f33823y.J = new mi.q(this, file, false, 14);
        }
        this.f33823y.D(Uri.fromFile(file), "other");
        this.f33823y.P(true);
        this.W.a(true, true);
    }

    public final void i() {
        r31 r31Var = this.f33823y;
        if (r31Var != null) {
            this.f33773b0 = 0;
            r31Var.H();
            this.f33823y = null;
        }
        try {
            Activity activity = this.f33772b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        o4 o4Var = this.f33818w;
        if (o4Var != null) {
            this.e.removeView(o4Var);
            this.f33818w = null;
        }
        if (this.f33821x != null) {
            this.f33821x = null;
        }
        this.E = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.a6.cloneSpans(charSequence, 3);
        if (this.f33770a0 == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.X = frameLayout;
            this.Z.setContainer(frameLayout);
            jt0 jt0Var = new jt0(this, this.e.getContext(), this.Z, this.X, 1);
            this.f33770a0 = jt0Var;
            this.Z.setScrollView(jt0Var);
            this.X.setClipChildren(false);
            this.f33770a0.addView(this.X, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.f33770a0, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
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
        jt0 jt0Var2 = this.f33770a0;
        jt0Var2.f42933l0 = false;
        if (z10) {
            TransitionManager.endTransitions(jt0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new o31(this, isEmpty2, isEmpty, 1)).addTransition(new o31(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.f33770a0.f42933l0 = true;
                duration.addTransition(new org.telegram.ui.Components.cn0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Z);
            }
            TransitionManager.beginDelayedTransition(this.f33770a0, duration);
            z11 = true;
        } else {
            this.Z.getCurrentView().setText((CharSequence) null);
            jt0 jt0Var3 = this.f33770a0;
            if (jt0Var3 != null) {
                jt0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.h6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.r41.C())) {
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
                jt0 jt0Var4 = this.f33770a0;
                if (jt0Var4 != null) {
                    jt0Var4.H(jt0Var4.getWidth(), jt0Var4.getHeight());
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            zt0 zt0Var2 = this.Z;
            if (this.f33793k0) {
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
        if (this.f33796m1 == z12 && z11) {
            return;
        }
        this.f33796m1 = z12;
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
            scaleY.alpha(f11).setDuration(340L).setInterpolator(org.telegram.ui.Components.bs.h).start();
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
        this.f33806r.p(true);
        if (this.J) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        ei.x3 x3Var = this.f33806r;
        x3Var.h = ei.x3.a(string, x3Var.getTextPaint());
        this.f33806r.s(string);
        this.f33806r.k(12.0f, 7.0f, 11.0f, 7.0f);
        ei.x3 x3Var2 = this.f33806r;
        x3Var2.getClass();
        x3Var2.f10073e0 = AndroidUtilities.dp(2);
        ei.x3 x3Var3 = this.f33806r;
        x3Var3.getClass();
        x3Var3.f10072d0 = 0.0f;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(R.raw.fire_on, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        uj0Var.start();
        x3Var3.j(uj0Var);
        this.f33806r.u();
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
        l31 l31Var = this.f33808r1;
        AndroidUtilities.cancelRunOnUIThread(l31Var);
        if (z10 && this.J) {
            AndroidUtilities.runOnUIThread(l31Var, 3000L);
        }
        if (z10) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z10);
        this.f33793k0 = z10;
        k(z10, z11);
        float f16 = 0.0f;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.Components.z7 z7Var = this.F;
            Property property = View.ALPHA;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(z7Var, property, f12));
            t31 t31Var = this.U;
            v0 v0Var = t31Var.f41584n;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(t31Var, v0Var, f13));
            jt0 jt0Var = this.f33770a0;
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
            View view2 = this.f33782f;
            if (z10) {
                f16 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f16));
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.G.addListener(new q31(this, 1));
            }
            this.G.setDuration(200L);
            this.G.start();
            return;
        }
        org.telegram.ui.Components.z7 z7Var2 = this.F;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        z7Var2.setAlpha(f7);
        jt0 jt0Var2 = this.f33770a0;
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
        View view4 = this.f33782f;
        if (z10) {
            f16 = 1.0f;
        }
        view4.setAlpha(f16);
        if (!z10) {
            this.F.setVisibility(8);
            this.f33770a0.scrollTo(0, 0);
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
        if (this.f33824y0 != 1.0f) {
            this.f33786g1.a();
            this.f33786g1.c(Math.round(this.f33819w0), Math.round(this.f33822x0), Math.round(f7), Math.round(f10), (int) this.V0, (int) this.W0, (int) this.X0, (int) this.Y0);
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
        if (this.f33784f1) {
            return false;
        }
        if (this.f33823y != null && this.f33793k0 && motionEvent.getX() >= this.V.getX() && motionEvent.getY() >= this.V.getY() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth()) {
            r31 r31Var = this.f33823y;
            r31Var.P(!r31Var.d.t());
            if (this.f33823y.d.t()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f33793k0, true);
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
        this.f33780e0 = f7;
        this.e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
