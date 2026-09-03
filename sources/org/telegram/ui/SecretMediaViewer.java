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
    public static volatile SecretMediaViewer f32197u1;
    public float A0;
    public boolean B;
    public float B0;
    public eg.l1 C;
    public float C0;
    public AnimatorSet D;
    public float D0;
    public boolean E;
    public int[] E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public long G0;
    public long H;
    public AnimatorSet H0;
    public long I;
    public GestureDetector I0;
    public boolean J;
    public final DecelerateInterpolator J0;
    public ou0 K;
    public float K0;
    public int L;
    public float L0;
    public int M;
    public float M0;
    public org.telegram.ui.Components.k71 N;
    public float N0;
    public nw0 O;
    public float O0;
    public org.telegram.ui.ActionBar.k5 P;
    public float P0;
    public View Q;
    public float Q0;
    public q41 R;
    public float R0;
    public ImageView S;
    public float S0;
    public org.telegram.ui.Components.ng0 T;
    public float T0;
    public FrameLayout U;
    public float U0;
    public hs0 V;
    public float V0;
    public du0 W;
    public boolean W0;
    public nt0 X;
    public boolean X0;
    public int Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public int f32198a;
    public boolean f32199a0;
    public boolean f32200a1;
    private float animationValue;
    public Activity f32201b;
    public float f32202b0;
    public boolean f32203b1;
    public WindowManager.LayoutParams f32204c;
    public long f32205c0;
    public boolean f32206c1;
    public n0 d;
    public WindowInsets f32207d0;
    public org.telegram.ui.Components.um0 f32208d1;
    public ah.e e;
    public MessageObject f32209e0;
    public boolean f32210e1;
    public View f32211f;
    public ImageReceiver.BitmapHolder f32212f0;
    public final i41 f32213f1;
    public boolean f32214g0;
    public final int[] f32215g1;
    public final int[] f32217h1;
    public kf.t0 f32219i1;
    public int f32220j0;
    public boolean f32221j1;
    public long f32222k0;
    public int f32223k1;
    public Runnable f32224l0;
    public boolean l1;
    public boolean m0;
    public Runnable f32225m1;
    public p41 f32226n;
    public float f32227n0;
    public boolean f32228n1;
    public float f32229o0;
    public final i41 f32230o1;
    public float f32231p0;
    public float[] f32232p1;
    public float f32233q0;
    public final Path f32234q1;
    public ph.f3 f32235r;
    public float f32236r0;
    public final w0 f32237r1;
    public boolean f32238s;
    public float f32239s0;
    public final w0 f32240s1;
    public float f32241t0;
    public boolean f32242t1;
    public float f32243u0;
    public long v;
    public float f32244v0;
    public q4 f32245w;
    public float f32246w0;
    public TextureView f32247x;
    public float f32248x0;
    public o41 f32249y;
    public float f32250y0;
    public float f32251z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f32216h0 = true;
    public final PhotoBackgroundDrawable f32218i0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public b11 f32252a;
        public int f32253b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            b11 b11Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f32253b == 2 && (b11Var = this.f32252a) != null) {
                    b11Var.run();
                    this.f32252a = null;
                } else {
                    invalidateSelf();
                }
                this.f32253b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z4;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            kf.t0 t0Var = secretMediaViewer.f32219i1;
            if (t0Var != null) {
                if (secretMediaViewer.f32214g0 && i10 == 255) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                t0Var.a(z4);
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
        this.f32244v0 = 1.0f;
        this.J0 = new DecelerateInterpolator(1.5f);
        this.L0 = 1.0f;
        this.f32200a1 = true;
        this.f32213f1 = new i41(this, 2);
        this.f32215g1 = new int[2];
        this.f32217h1 = new int[2];
        this.f32230o1 = new i41(this, 3);
        this.f32234q1 = new Path();
        this.f32237r1 = new w0("videoCrossfadeAlpha", 4);
        this.f32240s1 = new w0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f32207d0;
        secretMediaViewer.f32207d0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f32197u1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f32197u1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f32197u1 = secretMediaViewer;
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
        if (f32197u1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f10, float f11, float f12, boolean z4) {
        if (this.f32244v0 == f10 && this.f32241t0 == f11 && this.f32243u0 == f12) {
            return;
        }
        this.f32203b1 = z4;
        this.f32250y0 = f10;
        this.f32246w0 = f11;
        this.f32248x0 = f12;
        this.G0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.H0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.H0.setInterpolator(this.J0);
        this.H0.setDuration(250);
        this.H0.addListener(new n41(this, 3));
        this.H0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f32209e0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f32209e0.getId()))) {
                if (this.G && !this.E) {
                    this.F = true;
                } else if (!e(true, true)) {
                    this.f32210e1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f32209e0 != null && this.f32226n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f32209e0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f32209e0.messageOwner.destroyTime = keyAt;
                            this.f32226n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f32209e0.getId() == ((TLRPC.Message) objArr[0]).f19180id) {
            if (this.G && !this.E) {
                this.F = true;
            } else if (!e(true, true)) {
                this.f32210e1 = true;
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
        return this.f32202b0;
    }

    public final void h(File file) {
        if (this.f32201b == null) {
            return;
        }
        i();
        if (this.f32247x == null) {
            q4 q4Var = new q4(this.f32201b);
            this.f32245w = q4Var;
            q4Var.setVisibility(0);
            this.e.addView(this.f32245w, 0, k7.b6.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f32201b);
            this.f32247x = textureView;
            textureView.setOpaque(false);
            this.f32245w.addView(this.f32247x, k7.b6.e(-1, -1, 17));
        }
        this.Z = false;
        this.f32199a0 = false;
        this.f32247x.setAlpha(1.0f);
        if (this.f32249y == null) {
            o41 o41Var = new o41(this);
            this.f32249y = o41Var;
            o41Var.V(this.f32247x);
            this.f32249y.G = new n7.qa(22, this, file);
        }
        this.f32249y.D(Uri.fromFile(file), "other");
        this.f32249y.P(true);
        this.T.a(true, true);
    }

    public final void i() {
        o41 o41Var = this.f32249y;
        if (o41Var != null) {
            this.Y = 0;
            o41Var.H();
            this.f32249y = null;
        }
        try {
            Activity activity = this.f32201b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        q4 q4Var = this.f32245w;
        if (q4Var != null) {
            this.e.removeView(q4Var);
            this.f32245w = null;
        }
        if (this.f32247x != null) {
            this.f32247x = null;
        }
        this.B = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z4) {
        TextView currentView;
        boolean z10;
        CharSequence cloneSpans = org.telegram.ui.Components.u5.cloneSpans(charSequence, 3);
        if (this.X == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.U = frameLayout;
            this.W.setContainer(frameLayout);
            nt0 nt0Var = new nt0(this, this.e.getContext(), this.W, this.U, 1);
            this.X = nt0Var;
            this.W.setScrollView(nt0Var);
            this.U.setClipChildren(false);
            this.X.addView(this.U, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.X, k7.b6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.V.o(this.e.getContext()).bringToFront();
        }
        boolean z11 = true;
        if (this.W.getParent() != this.U) {
            this.W.setMeasureAllChildren(true);
            this.U.addView(this.W, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.W.getCurrentView().getText());
        du0 du0Var = this.W;
        if (z4) {
            currentView = du0Var.getNextView();
        } else {
            currentView = du0Var.getCurrentView();
        }
        int maxLines = currentView.getMaxLines();
        if (maxLines == 1) {
            this.W.getCurrentView().setSingleLine(false);
            this.W.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.W.getCurrentView().setMaxLines(Integer.MAX_VALUE);
            this.W.getNextView().setMaxLines(Integer.MAX_VALUE);
            this.W.getCurrentView().setEllipsize(null);
            this.W.getNextView().setEllipsize(null);
        }
        currentView.setScrollX(0);
        nt0 nt0Var2 = this.X;
        nt0Var2.f32656i0 = false;
        if (z4) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(nt0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new l41(this, isEmpty2, isEmpty, 1)).addTransition(new l41(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.X.f32656i0 = true;
                duration.addTransition(new org.telegram.ui.Components.lm0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.W);
            }
            TransitionManager.beginDelayedTransition(this.X, duration);
            z10 = true;
        } else {
            this.W.getCurrentView().setText((CharSequence) null);
            nt0 nt0Var3 = this.X;
            if (nt0Var3 != null) {
                nt0Var3.scrollTo(0, 0);
            }
            z10 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.j6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.v31.B())) {
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
            this.W.setTag(cloneSpans);
            try {
                this.W.a(cloneSpans, z4, false);
                nt0 nt0Var4 = this.X;
                if (nt0Var4 != null) {
                    nt0Var4.H(nt0Var4.getWidth(), nt0Var4.getHeight());
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            du0 du0Var2 = this.W;
            if (this.f32216h0) {
                i10 = 0;
            }
            du0Var2.setVisibility(i10);
        } else {
            this.W.a(null, z4, false);
            this.W.getCurrentView().setTextColor(-1);
            du0 du0Var3 = this.W;
            if (z10 && !isEmpty2) {
                z11 = false;
            }
            du0Var3.b(4, z11);
            this.W.setTag(null);
        }
        if (this.W.getCurrentView() instanceof cu0) {
            ((cu0) this.W.getCurrentView()).setLoading(false);
        }
    }

    public final void k(boolean z4, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        if (this.G && z4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f32221j1 == z11 && z10) {
            return;
        }
        this.f32221j1 = z11;
        this.S.animate().cancel();
        float f12 = 0.0f;
        float f13 = 0.6f;
        if (z10) {
            ViewPropertyAnimator animate = this.S.animate();
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.6f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f11);
            if (z11) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f13);
            if (z11) {
                f12 = 1.0f;
            }
            scaleY.alpha(f12).setDuration(340L).setInterpolator(org.telegram.ui.Components.mr.h).start();
            return;
        }
        ImageView imageView = this.S;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        imageView.setScaleX(f10);
        ImageView imageView2 = this.S;
        if (z11) {
            f13 = 1.0f;
        }
        imageView2.setScaleY(f13);
        ImageView imageView3 = this.S;
        if (z11) {
            f12 = 1.0f;
        }
        imageView3.setAlpha(f12);
    }

    public final void l() {
        int i10;
        this.f32235r.p(true);
        if (this.G) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        ph.f3 f3Var = this.f32235r;
        f3Var.h = ph.f3.a(string, f3Var.getTextPaint());
        this.f32235r.s(string);
        this.f32235r.k(12.0f, 7.0f, 11.0f, 7.0f);
        ph.f3 f3Var2 = this.f32235r;
        f3Var2.getClass();
        f3Var2.f41653b0 = AndroidUtilities.dp(2);
        ph.f3 f3Var3 = this.f32235r;
        f3Var3.getClass();
        f3Var3.f41651a0 = 0.0f;
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.fire_on, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        gj0Var.start();
        f3Var3.j(gj0Var);
        this.f32235r.u();
        MessagesController.getGlobalMainSettings().edit().putInt("viewoncehint", MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void m(boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        i41 i41Var = this.f32230o1;
        AndroidUtilities.cancelRunOnUIThread(i41Var);
        if (z4 && this.G) {
            AndroidUtilities.runOnUIThread(i41Var, 3000L);
        }
        if (z4) {
            this.C.setVisibility(0);
        }
        this.C.setEnabled(z4);
        this.f32216h0 = z4;
        k(z4, z10);
        float f17 = 0.0f;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            eg.l1 l1Var = this.C;
            Property property = View.ALPHA;
            if (z4) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(l1Var, property, f13));
            q41 q41Var = this.R;
            w0 w0Var = q41Var.f37303n;
            if (z4) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(q41Var, w0Var, f14));
            nt0 nt0Var = this.X;
            if (z4) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(nt0Var, property, f15));
            View view = this.Q;
            if (z4) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
            View view2 = this.f32211f;
            if (z4) {
                f17 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f17));
            AnimatorSet animatorSet = new AnimatorSet();
            this.D = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z4) {
                this.D.addListener(new n41(this, 1));
            }
            this.D.setDuration(200L);
            this.D.start();
            return;
        }
        eg.l1 l1Var2 = this.C;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        l1Var2.setAlpha(f10);
        nt0 nt0Var2 = this.X;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        nt0Var2.setAlpha(f11);
        View view3 = this.Q;
        if (z4) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        view3.setAlpha(f12);
        View view4 = this.f32211f;
        if (z4) {
            f17 = 1.0f;
        }
        view4.setAlpha(f17);
        if (!z4) {
            this.C.setVisibility(8);
            this.X.scrollTo(0, 0);
        }
    }

    public final void n(float f10) {
        ImageReceiver imageReceiver = this.h;
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f10) - this.e.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f10) - this.e.getHeight())) / 2;
        if (imageWidth > 0) {
            this.S0 = -imageWidth;
            this.T0 = imageWidth;
        } else {
            this.T0 = 0.0f;
            this.S0 = 0.0f;
        }
        if (imageHeight > 0) {
            this.U0 = -imageHeight;
            this.V0 = imageHeight;
            return;
        }
        this.V0 = 0.0f;
        this.U0 = 0.0f;
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.f32244v0 != 1.0f) {
            this.f32208d1.a();
            this.f32208d1.c(Math.round(this.f32241t0), Math.round(this.f32243u0), Math.round(f10), Math.round(f11), (int) this.S0, (int) this.T0, (int) this.U0, (int) this.V0);
            this.e.postInvalidate();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f32206c1) {
            return false;
        }
        if (this.f32249y != null && this.f32216h0 && motionEvent.getX() >= this.S.getX() && motionEvent.getY() >= this.S.getY() && motionEvent.getX() <= this.S.getX() + this.S.getMeasuredWidth() && motionEvent.getX() <= this.S.getX() + this.S.getMeasuredWidth()) {
            o41 o41Var = this.f32249y;
            o41Var.P(!o41Var.d.j());
            if (this.f32249y.d.j()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f32216h0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f10) {
        this.animationValue = f10;
        this.e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f10) {
        this.f32202b0 = f10;
        this.e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
