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
    public static volatile SecretMediaViewer f31719x1;
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
    public bv0 N;
    public float N0;
    public int O;
    public float O0;
    public int P;
    public float P0;
    public org.telegram.ui.Components.v71 Q;
    public float Q0;
    public s50 R;
    public float R0;
    public org.telegram.ui.ActionBar.j5 S;
    public float S0;
    public View T;
    public float T0;
    public f51 U;
    public float U0;
    public ImageView V;
    public float V0;
    public org.telegram.ui.Components.pg0 W;
    public float W0;
    public FrameLayout X;
    public float X0;
    public ws0 Y;
    public float Y0;
    public ru0 Z;
    public boolean Z0;
    public int f31720a;
    public bu0 f31721a0;
    public boolean f31722a1;
    private float animationValue;
    public Activity f31723b;
    public int f31724b0;
    public boolean f31725b1;
    public WindowManager.LayoutParams f31726c;
    public boolean f31727c0;
    public boolean f31728c1;
    public j0 d;
    public boolean f31729d0;
    public boolean f31730d1;
    public ci.n6 e;
    public float f31731e0;
    public boolean f31732e1;
    public View f31733f;
    public long f31734f0;
    public boolean f31735f1;
    public WindowInsets f31736g0;
    public org.telegram.ui.Components.zm0 f31737g1;
    public MessageObject f31738h0;
    public boolean f31739h1;
    public ImageReceiver.BitmapHolder f31740i0;
    public final x41 f31741i1;
    public boolean f31742j0;
    public final int[] f31743j1;
    public final int[] f31745k1;
    public mb0 l1;
    public int m0;
    public boolean f31747m1;
    public e51 f31748n;
    public long f31749n0;
    public int f31750n1;
    public Runnable f31751o0;
    public boolean f31752o1;
    public boolean f31753p0;
    public Runnable f31754p1;
    public float f31755q0;
    public boolean f31756q1;
    public ci.f4 f31757r;
    public float f31758r0;
    public final x41 f31759r1;
    public boolean f31760s;
    public float f31761s0;
    public float[] f31762s1;
    public float f31763t0;
    public final Path f31764t1;
    public float f31765u0;
    public final s0 f31766u1;
    public long v;
    public float f31767v0;
    public final s0 f31768v1;
    public k4 f31769w;
    public float f31770w0;
    public boolean f31771w1;
    public TextureView f31772x;
    public float f31773x0;
    public d51 f31774y;
    public float f31775y0;
    public float f31776z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f31744k0 = true;
    public final PhotoBackgroundDrawable f31746l0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public rx0 f31777a;
        public int f31778b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            rx0 rx0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f31778b == 2 && (rx0Var = this.f31777a) != null) {
                    rx0Var.run();
                    this.f31777a = null;
                } else {
                    invalidateSelf();
                }
                this.f31778b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            mb0 mb0Var = secretMediaViewer.l1;
            if (mb0Var != null) {
                if (secretMediaViewer.f31742j0 && i10 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mb0Var.a(z10);
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
        this.f31775y0 = 1.0f;
        this.M0 = new DecelerateInterpolator(1.5f);
        this.O0 = 1.0f;
        this.f31730d1 = true;
        this.f31741i1 = new x41(this, 2);
        this.f31743j1 = new int[2];
        this.f31745k1 = new int[2];
        this.f31759r1 = new x41(this, 3);
        this.f31764t1 = new Path();
        this.f31766u1 = new s0("videoCrossfadeAlpha", 4);
        this.f31768v1 = new s0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f31736g0;
        secretMediaViewer.f31736g0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f31719x1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f31719x1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f31719x1 = secretMediaViewer;
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
        if (f31719x1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f7, float f10, float f11, boolean z10) {
        if (this.f31775y0 == f7 && this.f31770w0 == f10 && this.f31773x0 == f11) {
            return;
        }
        this.f31732e1 = z10;
        this.B0 = f7;
        this.f31776z0 = f10;
        this.A0 = f11;
        this.J0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.K0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.K0.setInterpolator(this.M0);
        this.K0.setDuration(250);
        this.K0.addListener(new c51(this, 3));
        this.K0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f31738h0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f31738h0.getId()))) {
                if (this.J && !this.H) {
                    this.I = true;
                } else if (!e(true, true)) {
                    this.f31739h1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f31738h0 != null && this.f31748n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f31738h0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f31738h0.messageOwner.destroyTime = keyAt;
                            this.f31748n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f31738h0.getId() == ((TLRPC.Message) objArr[0]).f18349id) {
            if (this.J && !this.H) {
                this.I = true;
            } else if (!e(true, true)) {
                this.f31739h1 = true;
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
        return this.f31731e0;
    }

    public final void h(File file) {
        if (this.f31723b == null) {
            return;
        }
        i();
        if (this.f31772x == null) {
            k4 k4Var = new k4(this.f31723b);
            this.f31769w = k4Var;
            k4Var.setVisibility(0);
            this.e.addView(this.f31769w, 0, w7.y5.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f31723b);
            this.f31772x = textureView;
            textureView.setOpaque(false);
            this.f31769w.addView(this.f31772x, w7.y5.e(-1, -1, 17));
        }
        this.f31727c0 = false;
        this.f31729d0 = false;
        this.f31772x.setAlpha(1.0f);
        if (this.f31774y == null) {
            d51 d51Var = new d51(this);
            this.f31774y = d51Var;
            d51Var.V(this.f31772x);
            this.f31774y.J = new org.telegram.ui.Cells.f3(6, this, file);
        }
        this.f31774y.D(Uri.fromFile(file), "other");
        this.f31774y.P(true);
        this.W.a(true, true);
    }

    public final void i() {
        d51 d51Var = this.f31774y;
        if (d51Var != null) {
            this.f31724b0 = 0;
            d51Var.H();
            this.f31774y = null;
        }
        try {
            Activity activity = this.f31723b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        k4 k4Var = this.f31769w;
        if (k4Var != null) {
            this.e.removeView(k4Var);
            this.f31769w = null;
        }
        if (this.f31772x != null) {
            this.f31772x = null;
        }
        this.E = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.y5.cloneSpans(charSequence, 3);
        if (this.f31721a0 == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.X = frameLayout;
            this.Z.setContainer(frameLayout);
            bu0 bu0Var = new bu0(this, this.e.getContext(), this.Z, this.X, 1);
            this.f31721a0 = bu0Var;
            this.Z.setScrollView(bu0Var);
            this.X.setClipChildren(false);
            this.f31721a0.addView(this.X, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.f31721a0, w7.y5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
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
        bu0 bu0Var2 = this.f31721a0;
        bu0Var2.f36379l0 = false;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(bu0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new a51(this, isEmpty2, isEmpty, 1)).addTransition(new a51(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.f31721a0.f36379l0 = true;
                duration.addTransition(new org.telegram.ui.Components.qm0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Z);
            }
            TransitionManager.beginDelayedTransition(this.f31721a0, duration);
            z11 = true;
        } else {
            this.Z.getCurrentView().setText((CharSequence) null);
            bu0 bu0Var3 = this.f31721a0;
            if (bu0Var3 != null) {
                bu0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.j6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.j41.A())) {
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
                bu0 bu0Var4 = this.f31721a0;
                if (bu0Var4 != null) {
                    bu0Var4.H(bu0Var4.getWidth(), bu0Var4.getHeight());
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            ru0 ru0Var2 = this.Z;
            if (this.f31744k0) {
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
        if (this.f31747m1 == z12 && z11) {
            return;
        }
        this.f31747m1 = z12;
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
            scaleY.alpha(f11).setDuration(340L).setInterpolator(org.telegram.ui.Components.qr.h).start();
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
        this.f31757r.p(true);
        if (this.J) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        ci.f4 f4Var = this.f31757r;
        f4Var.h = ci.f4.a(string, f4Var.getTextPaint());
        this.f31757r.s(string);
        this.f31757r.k(12.0f, 7.0f, 11.0f, 7.0f);
        ci.f4 f4Var2 = this.f31757r;
        f4Var2.getClass();
        f4Var2.f4631e0 = AndroidUtilities.dp(2);
        ci.f4 f4Var3 = this.f31757r;
        f4Var3.getClass();
        f4Var3.f4630d0 = 0.0f;
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.fire_on, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        hj0Var.start();
        f4Var3.j(hj0Var);
        this.f31757r.u();
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
        x41 x41Var = this.f31759r1;
        AndroidUtilities.cancelRunOnUIThread(x41Var);
        if (z10 && this.J) {
            AndroidUtilities.runOnUIThread(x41Var, 3000L);
        }
        if (z10) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z10);
        this.f31744k0 = z10;
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
            f51 f51Var = this.U;
            s0 s0Var = f51Var.f33500n;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(f51Var, s0Var, f13));
            bu0 bu0Var = this.f31721a0;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(bu0Var, property, f14));
            View view = this.T;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
            View view2 = this.f31733f;
            if (z10) {
                f16 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f16));
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.G.addListener(new c51(this, 1));
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
        bu0 bu0Var2 = this.f31721a0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        bu0Var2.setAlpha(f10);
        View view3 = this.T;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        view3.setAlpha(f11);
        View view4 = this.f31733f;
        if (z10) {
            f16 = 1.0f;
        }
        view4.setAlpha(f16);
        if (!z10) {
            this.F.setVisibility(8);
            this.f31721a0.scrollTo(0, 0);
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
        if (this.f31775y0 != 1.0f) {
            this.f31737g1.a();
            this.f31737g1.c(Math.round(this.f31770w0), Math.round(this.f31773x0), Math.round(f7), Math.round(f10), (int) this.V0, (int) this.W0, (int) this.X0, (int) this.Y0);
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
        if (this.f31735f1) {
            return false;
        }
        if (this.f31774y != null && this.f31744k0 && motionEvent.getX() >= this.V.getX() && motionEvent.getY() >= this.V.getY() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth()) {
            d51 d51Var = this.f31774y;
            d51Var.P(!d51Var.d.u());
            if (this.f31774y.d.u()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f31744k0, true);
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
        this.f31731e0 = f7;
        this.e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
