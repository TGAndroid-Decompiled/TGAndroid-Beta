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
    public static volatile SecretMediaViewer f32223u1;
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
    public hu0 K;
    public float K0;
    public int L;
    public float L0;
    public int M;
    public float M0;
    public org.telegram.ui.Components.k71 N;
    public float N0;
    public gw0 O;
    public float O0;
    public org.telegram.ui.ActionBar.k5 P;
    public float P0;
    public View Q;
    public float Q0;
    public j41 R;
    public float R0;
    public ImageView S;
    public float S0;
    public org.telegram.ui.Components.mg0 T;
    public float T0;
    public FrameLayout U;
    public float U0;
    public as0 V;
    public float V0;
    public wt0 W;
    public boolean W0;
    public gt0 X;
    public boolean X0;
    public int Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public int f32224a;
    public boolean f32225a0;
    public boolean f32226a1;
    private float animationValue;
    public Activity f32227b;
    public float f32228b0;
    public boolean f32229b1;
    public WindowManager.LayoutParams f32230c;
    public long f32231c0;
    public boolean f32232c1;
    public l0 d;
    public WindowInsets f32233d0;
    public org.telegram.ui.Components.vm0 f32234d1;
    public ah.d e;
    public MessageObject f32235e0;
    public boolean f32236e1;
    public View f32237f;
    public ImageReceiver.BitmapHolder f32238f0;
    public final b41 f32239f1;
    public boolean f32240g0;
    public final int[] f32241g1;
    public final int[] f32243h1;
    public lf.s0 f32245i1;
    public int f32246j0;
    public boolean f32247j1;
    public long f32248k0;
    public int f32249k1;
    public Runnable f32250l0;
    public boolean l1;
    public boolean m0;
    public Runnable f32251m1;
    public i41 f32252n;
    public float f32253n0;
    public boolean f32254n1;
    public float f32255o0;
    public final b41 f32256o1;
    public float f32257p0;
    public float[] f32258p1;
    public float f32259q0;
    public final Path f32260q1;
    public ph.f3 f32261r;
    public float f32262r0;
    public final u0 f32263r1;
    public boolean f32264s;
    public float f32265s0;
    public final u0 f32266s1;
    public float f32267t0;
    public boolean f32268t1;
    public float f32269u0;
    public long v;
    public float f32270v0;
    public o4 f32271w;
    public float f32272w0;
    public TextureView f32273x;
    public float f32274x0;
    public h41 f32275y;
    public float f32276y0;
    public float f32277z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f32242h0 = true;
    public final PhotoBackgroundDrawable f32244i0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public l01 f32278a;
        public int f32279b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            l01 l01Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f32279b == 2 && (l01Var = this.f32278a) != null) {
                    l01Var.run();
                    this.f32278a = null;
                } else {
                    invalidateSelf();
                }
                this.f32279b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z4;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            lf.s0 s0Var = secretMediaViewer.f32245i1;
            if (s0Var != null) {
                if (secretMediaViewer.f32240g0 && i10 == 255) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                s0Var.a(z4);
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
        this.f32270v0 = 1.0f;
        this.J0 = new DecelerateInterpolator(1.5f);
        this.L0 = 1.0f;
        this.f32226a1 = true;
        this.f32239f1 = new b41(this, 2);
        this.f32241g1 = new int[2];
        this.f32243h1 = new int[2];
        this.f32256o1 = new b41(this, 3);
        this.f32260q1 = new Path();
        this.f32263r1 = new u0("videoCrossfadeAlpha", 4);
        this.f32266s1 = new u0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f32233d0;
        secretMediaViewer.f32233d0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f32223u1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f32223u1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f32223u1 = secretMediaViewer;
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
        if (f32223u1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f10, float f11, float f12, boolean z4) {
        if (this.f32270v0 == f10 && this.f32267t0 == f11 && this.f32269u0 == f12) {
            return;
        }
        this.f32229b1 = z4;
        this.f32276y0 = f10;
        this.f32272w0 = f11;
        this.f32274x0 = f12;
        this.G0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.H0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.H0.setInterpolator(this.J0);
        this.H0.setDuration(250);
        this.H0.addListener(new g41(this, 3));
        this.H0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f32235e0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f32235e0.getId()))) {
                if (this.G && !this.E) {
                    this.F = true;
                } else if (!e(true, true)) {
                    this.f32236e1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f32235e0 != null && this.f32252n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f32235e0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f32235e0.messageOwner.destroyTime = keyAt;
                            this.f32252n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f32235e0.getId() == ((TLRPC.Message) objArr[0]).f19205id) {
            if (this.G && !this.E) {
                this.F = true;
            } else if (!e(true, true)) {
                this.f32236e1 = true;
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
        return this.f32228b0;
    }

    public final void h(File file) {
        if (this.f32227b == null) {
            return;
        }
        i();
        if (this.f32273x == null) {
            o4 o4Var = new o4(this.f32227b);
            this.f32271w = o4Var;
            o4Var.setVisibility(0);
            this.e.addView(this.f32271w, 0, k7.b6.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f32227b);
            this.f32273x = textureView;
            textureView.setOpaque(false);
            this.f32271w.addView(this.f32273x, k7.b6.e(-1, -1, 17));
        }
        this.Z = false;
        this.f32225a0 = false;
        this.f32273x.setAlpha(1.0f);
        if (this.f32275y == null) {
            h41 h41Var = new h41(this);
            this.f32275y = h41Var;
            h41Var.V(this.f32273x);
            this.f32275y.G = new n7.qa(21, this, file);
        }
        this.f32275y.D(Uri.fromFile(file), "other");
        this.f32275y.P(true);
        this.T.a(true, true);
    }

    public final void i() {
        h41 h41Var = this.f32275y;
        if (h41Var != null) {
            this.Y = 0;
            h41Var.H();
            this.f32275y = null;
        }
        try {
            Activity activity = this.f32227b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        o4 o4Var = this.f32271w;
        if (o4Var != null) {
            this.e.removeView(o4Var);
            this.f32271w = null;
        }
        if (this.f32273x != null) {
            this.f32273x = null;
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
            gt0 gt0Var = new gt0(this, this.e.getContext(), this.W, this.U, 1);
            this.X = gt0Var;
            this.W.setScrollView(gt0Var);
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
        wt0 wt0Var = this.W;
        if (z4) {
            currentView = wt0Var.getNextView();
        } else {
            currentView = wt0Var.getCurrentView();
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
        gt0 gt0Var2 = this.X;
        gt0Var2.f38746i0 = false;
        if (z4) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(gt0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new e41(this, isEmpty2, isEmpty, 1)).addTransition(new e41(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.X.f38746i0 = true;
                duration.addTransition(new org.telegram.ui.Components.mm0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.W);
            }
            TransitionManager.beginDelayedTransition(this.X, duration);
            z10 = true;
        } else {
            this.W.getCurrentView().setText((CharSequence) null);
            gt0 gt0Var3 = this.X;
            if (gt0Var3 != null) {
                gt0Var3.scrollTo(0, 0);
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
                gt0 gt0Var4 = this.X;
                if (gt0Var4 != null) {
                    gt0Var4.H(gt0Var4.getWidth(), gt0Var4.getHeight());
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            wt0 wt0Var2 = this.W;
            if (this.f32242h0) {
                i10 = 0;
            }
            wt0Var2.setVisibility(i10);
        } else {
            this.W.a(null, z4, false);
            this.W.getCurrentView().setTextColor(-1);
            wt0 wt0Var3 = this.W;
            if (z10 && !isEmpty2) {
                z11 = false;
            }
            wt0Var3.b(4, z11);
            this.W.setTag(null);
        }
        if (this.W.getCurrentView() instanceof vt0) {
            ((vt0) this.W.getCurrentView()).setLoading(false);
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
        if (this.f32247j1 == z11 && z10) {
            return;
        }
        this.f32247j1 = z11;
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
            scaleY.alpha(f12).setDuration(340L).setInterpolator(org.telegram.ui.Components.nr.h).start();
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
        this.f32261r.q(true);
        if (this.G) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        ph.f3 f3Var = this.f32261r;
        f3Var.h = ph.f3.a(string, f3Var.getTextPaint());
        this.f32261r.t(string);
        this.f32261r.l(12.0f, 7.0f, 11.0f, 7.0f);
        ph.f3 f3Var2 = this.f32261r;
        f3Var2.getClass();
        f3Var2.f41608b0 = AndroidUtilities.dp(2);
        ph.f3 f3Var3 = this.f32261r;
        f3Var3.getClass();
        f3Var3.f41606a0 = 0.0f;
        f3Var3.j(R.raw.fire_on);
        this.f32261r.v();
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
        b41 b41Var = this.f32256o1;
        AndroidUtilities.cancelRunOnUIThread(b41Var);
        if (z4 && this.G) {
            AndroidUtilities.runOnUIThread(b41Var, 3000L);
        }
        if (z4) {
            this.C.setVisibility(0);
        }
        this.C.setEnabled(z4);
        this.f32242h0 = z4;
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
            j41 j41Var = this.R;
            u0 u0Var = j41Var.f35235n;
            if (z4) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(j41Var, u0Var, f14));
            gt0 gt0Var = this.X;
            if (z4) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(gt0Var, property, f15));
            View view = this.Q;
            if (z4) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
            View view2 = this.f32237f;
            if (z4) {
                f17 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f17));
            AnimatorSet animatorSet = new AnimatorSet();
            this.D = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z4) {
                this.D.addListener(new g41(this, 1));
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
        gt0 gt0Var2 = this.X;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        gt0Var2.setAlpha(f11);
        View view3 = this.Q;
        if (z4) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        view3.setAlpha(f12);
        View view4 = this.f32237f;
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
        if (this.f32270v0 != 1.0f) {
            this.f32234d1.a();
            this.f32234d1.c(Math.round(this.f32267t0), Math.round(this.f32269u0), Math.round(f10), Math.round(f11), (int) this.S0, (int) this.T0, (int) this.U0, (int) this.V0);
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
        if (this.f32232c1) {
            return false;
        }
        if (this.f32275y != null && this.f32242h0 && motionEvent.getX() >= this.S.getX() && motionEvent.getY() >= this.S.getY() && motionEvent.getX() <= this.S.getX() + this.S.getMeasuredWidth() && motionEvent.getX() <= this.S.getX() + this.S.getMeasuredWidth()) {
            h41 h41Var = this.f32275y;
            h41Var.P(!h41Var.d.j());
            if (this.f32275y.d.j()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f32242h0, true);
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
        this.f32228b0 = f10;
        this.e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
