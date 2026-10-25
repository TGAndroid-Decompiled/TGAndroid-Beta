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
    public static volatile SecretMediaViewer f36147x1;
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
    public ou0 N;
    public float N0;
    public int O;
    public float O0;
    public int P;
    public float P0;
    public org.telegram.ui.Components.u81 Q;
    public float Q0;
    public z10 R;
    public float R0;
    public org.telegram.ui.ActionBar.b6 S;
    public float S0;
    public View T;
    public float T0;
    public w31 U;
    public float U0;
    public ImageView V;
    public float V0;
    public org.telegram.ui.Components.dh0 W;
    public float W0;
    public FrameLayout X;
    public float X0;
    public js0 Y;
    public float Y0;
    public eu0 Z;
    public boolean Z0;
    public int f36148a;
    public ot0 f36149a0;
    public boolean f36150a1;
    private float animationValue;
    public Activity f36151b;
    public int f36152b0;
    public boolean f36153b1;
    public WindowManager.LayoutParams f36154c;
    public boolean f36155c0;
    public boolean f36156c1;
    public k0 d;
    public boolean f36157d0;
    public boolean f36158d1;
    public bh.p e;
    public float f36159e0;
    public boolean f36160e1;
    public View f36161f;
    public long f36162f0;
    public boolean f36163f1;
    public WindowInsets f36164g0;
    public org.telegram.ui.Components.un0 f36165g1;
    public MessageObject f36166h0;
    public boolean f36167h1;
    public ImageReceiver.BitmapHolder f36168i0;
    public final o31 f36169i1;
    public boolean f36170j0;
    public final int[] f36171j1;
    public final int[] f36173k1;
    public ag.b1 l1;
    public int m0;
    public boolean f36175m1;
    public v31 f36176n;
    public long f36177n0;
    public int f36178n1;
    public Runnable f36179o0;
    public boolean f36180o1;
    public boolean f36181p0;
    public Runnable f36182p1;
    public float f36183q0;
    public boolean f36184q1;
    public fi.v3 f36185r;
    public float f36186r0;
    public final o31 f36187r1;
    public boolean f36188s;
    public float f36189s0;
    public float[] f36190s1;
    public float f36191t0;
    public final Path f36192t1;
    public float f36193u0;
    public final s0 f36194u1;
    public long v;
    public float f36195v0;
    public final s0 f36196v1;
    public m4 f36197w;
    public float f36198w0;
    public boolean f36199w1;
    public TextureView f36200x;
    public float f36201x0;
    public u31 f36202y;
    public float f36203y0;
    public float f36204z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f36172k0 = true;
    public final PhotoBackgroundDrawable f36174l0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public fy0 f36205a;
        public int f36206b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            fy0 fy0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f36206b == 2 && (fy0Var = this.f36205a) != null) {
                    fy0Var.run();
                    this.f36205a = null;
                } else {
                    invalidateSelf();
                }
                this.f36206b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            ag.b1 b1Var = secretMediaViewer.l1;
            if (b1Var != null) {
                if (secretMediaViewer.f36170j0 && i10 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b1Var.a(z10);
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
        this.f36203y0 = 1.0f;
        this.M0 = new DecelerateInterpolator(1.5f);
        this.O0 = 1.0f;
        this.f36158d1 = true;
        this.f36169i1 = new o31(this, 2);
        this.f36171j1 = new int[2];
        this.f36173k1 = new int[2];
        this.f36187r1 = new o31(this, 3);
        this.f36192t1 = new Path();
        this.f36194u1 = new s0("videoCrossfadeAlpha", 4);
        this.f36196v1 = new s0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f36164g0;
        secretMediaViewer.f36164g0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f36147x1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f36147x1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f36147x1 = secretMediaViewer;
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
        if (f36147x1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f7, float f10, float f11, boolean z10) {
        if (this.f36203y0 == f7 && this.f36198w0 == f10 && this.f36201x0 == f11) {
            return;
        }
        this.f36160e1 = z10;
        this.B0 = f7;
        this.f36204z0 = f10;
        this.A0 = f11;
        this.J0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.K0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.K0.setInterpolator(this.M0);
        this.K0.setDuration(250);
        this.K0.addListener(new t31(this, 3));
        this.K0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f36166h0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f36166h0.getId()))) {
                if (this.J && !this.H) {
                    this.I = true;
                } else if (!e(true, true)) {
                    this.f36167h1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f36166h0 != null && this.f36176n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f36166h0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f36166h0.messageOwner.destroyTime = keyAt;
                            this.f36176n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f36166h0.getId() == ((TLRPC.Message) objArr[0]).f22048id) {
            if (this.J && !this.H) {
                this.I = true;
            } else if (!e(true, true)) {
                this.f36167h1 = true;
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
        return this.f36159e0;
    }

    public final void h(File file) {
        if (this.f36151b == null) {
            return;
        }
        i();
        if (this.f36200x == null) {
            m4 m4Var = new m4(this.f36151b);
            this.f36197w = m4Var;
            m4Var.setVisibility(0);
            this.e.addView(this.f36197w, 0, org.telegram.ui.Components.gb1.i(-1, -1, 17));
            TextureView textureView = new TextureView(this.f36151b);
            this.f36200x = textureView;
            textureView.setOpaque(false);
            this.f36197w.addView(this.f36200x, org.telegram.ui.Components.gb1.i(-1, -1, 17));
        }
        this.f36155c0 = false;
        this.f36157d0 = false;
        this.f36200x.setAlpha(1.0f);
        if (this.f36202y == null) {
            u31 u31Var = new u31(this);
            this.f36202y = u31Var;
            u31Var.V(this.f36200x);
            this.f36202y.J = new m4.w1(this, file, false, 15);
        }
        this.f36202y.D(Uri.fromFile(file), "other");
        this.f36202y.P(true);
        this.W.a(true, true);
    }

    public final void i() {
        u31 u31Var = this.f36202y;
        if (u31Var != null) {
            this.f36152b0 = 0;
            u31Var.H();
            this.f36202y = null;
        }
        try {
            Activity activity = this.f36151b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        m4 m4Var = this.f36197w;
        if (m4Var != null) {
            this.e.removeView(m4Var);
            this.f36197w = null;
        }
        if (this.f36200x != null) {
            this.f36200x = null;
        }
        this.E = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.c6.cloneSpans(charSequence, 3);
        if (this.f36149a0 == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.X = frameLayout;
            this.Z.setContainer(frameLayout);
            ot0 ot0Var = new ot0(this, this.e.getContext(), this.Z, this.X, 1);
            this.f36149a0 = ot0Var;
            this.Z.setScrollView(ot0Var);
            this.X.setClipChildren(false);
            this.f36149a0.addView(this.X, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.f36149a0, org.telegram.ui.Components.gb1.h(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.Y.n(this.e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Z.getParent() != this.X) {
            this.Z.setMeasureAllChildren(true);
            this.X.addView(this.Z, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Z.getCurrentView().getText());
        eu0 eu0Var = this.Z;
        if (z10) {
            currentView = eu0Var.getNextView();
        } else {
            currentView = eu0Var.getCurrentView();
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
        ot0 ot0Var2 = this.f36149a0;
        ot0Var2.f38168l0 = false;
        if (z10) {
            TransitionManager.endTransitions(ot0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new r31(this, isEmpty2, isEmpty, 1)).addTransition(new r31(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.f36149a0.f38168l0 = true;
                duration.addTransition(new org.telegram.ui.Components.ln0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Z);
            }
            TransitionManager.beginDelayedTransition(this.f36149a0, duration);
            z11 = true;
        } else {
            this.Z.getCurrentView().setText((CharSequence) null);
            ot0 ot0Var3 = this.f36149a0;
            if (ot0Var3 != null) {
                ot0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.y6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.f51.L())) {
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
                ot0 ot0Var4 = this.f36149a0;
                if (ot0Var4 != null) {
                    ot0Var4.H(ot0Var4.getWidth(), ot0Var4.getHeight());
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            eu0 eu0Var2 = this.Z;
            if (this.f36172k0) {
                i10 = 0;
            }
            eu0Var2.setVisibility(i10);
        } else {
            this.Z.a(null, z10, false);
            this.Z.getCurrentView().setTextColor(-1);
            eu0 eu0Var3 = this.Z;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            eu0Var3.b(4, z12);
            this.Z.setTag(null);
        }
        if (this.Z.getCurrentView() instanceof du0) {
            ((du0) this.Z.getCurrentView()).setLoading(false);
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
        if (this.f36175m1 == z12 && z11) {
            return;
        }
        this.f36175m1 = z12;
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
            scaleY.alpha(f11).setDuration(340L).setInterpolator(org.telegram.ui.Components.ds.h).start();
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
        this.f36185r.p(true);
        if (this.J) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        fi.v3 v3Var = this.f36185r;
        v3Var.h = fi.v3.a(string, v3Var.getTextPaint());
        this.f36185r.s(string);
        this.f36185r.k(12.0f, 7.0f, 11.0f, 7.0f);
        fi.v3 v3Var2 = this.f36185r;
        v3Var2.getClass();
        v3Var2.f11790e0 = AndroidUtilities.dp(2);
        fi.v3 v3Var3 = this.f36185r;
        v3Var3.getClass();
        v3Var3.f11789d0 = 0.0f;
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.fire_on, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        xj0Var.start();
        v3Var3.j(xj0Var);
        this.f36185r.u();
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
        o31 o31Var = this.f36187r1;
        AndroidUtilities.cancelRunOnUIThread(o31Var);
        if (z10 && this.J) {
            AndroidUtilities.runOnUIThread(o31Var, 3000L);
        }
        if (z10) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z10);
        this.f36172k0 = z10;
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
            w31 w31Var = this.U;
            s0 s0Var = w31Var.f44967n;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(w31Var, s0Var, f13));
            ot0 ot0Var = this.f36149a0;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ot0Var, property, f14));
            View view = this.T;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
            View view2 = this.f36161f;
            if (z10) {
                f16 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f16));
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.G.addListener(new t31(this, 1));
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
        ot0 ot0Var2 = this.f36149a0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ot0Var2.setAlpha(f10);
        View view3 = this.T;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        view3.setAlpha(f11);
        View view4 = this.f36161f;
        if (z10) {
            f16 = 1.0f;
        }
        view4.setAlpha(f16);
        if (!z10) {
            this.F.setVisibility(8);
            this.f36149a0.scrollTo(0, 0);
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
        if (this.f36203y0 != 1.0f) {
            this.f36165g1.a();
            this.f36165g1.c(Math.round(this.f36198w0), Math.round(this.f36201x0), Math.round(f7), Math.round(f10), (int) this.V0, (int) this.W0, (int) this.X0, (int) this.Y0);
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
        if (this.f36163f1) {
            return false;
        }
        if (this.f36202y != null && this.f36172k0 && motionEvent.getX() >= this.V.getX() && motionEvent.getY() >= this.V.getY() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth()) {
            u31 u31Var = this.f36202y;
            u31Var.P(!u31Var.d.t());
            if (this.f36202y.d.t()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f36172k0, true);
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
        this.f36159e0 = f7;
        this.e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
