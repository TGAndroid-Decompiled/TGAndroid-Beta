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
    public static volatile SecretMediaViewer f34056x1;
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
    public av0 N;
    public float N0;
    public int O;
    public float O0;
    public int P;
    public float P0;
    public org.telegram.ui.Components.i71 Q;
    public float Q0;
    public t50 R;
    public float R0;
    public org.telegram.ui.ActionBar.j5 S;
    public float S0;
    public View T;
    public float T0;
    public e51 U;
    public float U0;
    public ImageView V;
    public float V0;
    public org.telegram.ui.Components.fg0 W;
    public float W0;
    public FrameLayout X;
    public float X0;
    public vs0 Y;
    public float Y0;
    public qu0 Z;
    public boolean Z0;
    public int f34057a;
    public au0 f34058a0;
    public boolean f34059a1;
    private float animationValue;
    public Activity f34060b;
    public int f34061b0;
    public boolean f34062b1;
    public WindowManager.LayoutParams f34063c;
    public boolean f34064c0;
    public boolean f34065c1;
    public j0 d;
    public boolean f34066d0;
    public boolean f34067d1;
    public ah.w f34068e;
    public float f34069e0;
    public boolean f34070e1;
    public View f34071f;
    public long f34072f0;
    public boolean f34073f1;
    public WindowInsets f34074g0;
    public org.telegram.ui.Components.nm0 f34075g1;
    public MessageObject f34076h0;
    public boolean f34077h1;
    public ImageReceiver.BitmapHolder f34078i0;
    public final w41 f34079i1;
    public boolean f34080j0;
    public final int[] f34081j1;
    public final int[] f34083k1;
    public kb0 l1;
    public int m0;
    public boolean f34085m1;
    public d51 f34086n;
    public long f34087n0;
    public int f34088n1;
    public Runnable f34089o0;
    public boolean f34090o1;
    public boolean f34091p0;
    public Runnable f34092p1;
    public float f34093q0;
    public boolean f34094q1;
    public di.f4 f34095r;
    public float f34096r0;
    public final w41 f34097r1;
    public boolean f34098s;
    public float f34099s0;
    public float[] f34100s1;
    public float f34101t0;
    public final Path f34102t1;
    public float f34103u0;
    public final t0 f34104u1;
    public long v;
    public float f34105v0;
    public final t0 f34106v1;
    public l4 f34107w;
    public float f34108w0;
    public boolean f34109w1;
    public TextureView f34110x;
    public float f34111x0;
    public c51 f34112y;
    public float f34113y0;
    public float f34114z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f34082k0 = true;
    public final PhotoBackgroundDrawable f34084l0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public rx0 f34115a;
        public int f34116b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            rx0 rx0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f34116b == 2 && (rx0Var = this.f34115a) != null) {
                    rx0Var.run();
                    this.f34115a = null;
                } else {
                    invalidateSelf();
                }
                this.f34116b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            kb0 kb0Var = secretMediaViewer.l1;
            if (kb0Var != null) {
                if (secretMediaViewer.f34080j0 && i10 == 255) {
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
        this.f34113y0 = 1.0f;
        this.M0 = new DecelerateInterpolator(1.5f);
        this.O0 = 1.0f;
        this.f34067d1 = true;
        this.f34079i1 = new w41(this, 2);
        this.f34081j1 = new int[2];
        this.f34083k1 = new int[2];
        this.f34097r1 = new w41(this, 3);
        this.f34102t1 = new Path();
        this.f34104u1 = new t0("videoCrossfadeAlpha", 4);
        this.f34106v1 = new t0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f34074g0;
        secretMediaViewer.f34074g0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f34056x1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f34056x1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f34056x1 = secretMediaViewer;
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
        if (f34056x1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f7, float f10, float f11, boolean z10) {
        if (this.f34113y0 == f7 && this.f34108w0 == f10 && this.f34111x0 == f11) {
            return;
        }
        this.f34070e1 = z10;
        this.B0 = f7;
        this.f34114z0 = f10;
        this.A0 = f11;
        this.J0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.K0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.K0.setInterpolator(this.M0);
        this.K0.setDuration(250);
        this.K0.addListener(new b51(this, 3));
        this.K0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f34076h0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f34076h0.getId()))) {
                if (this.J && !this.H) {
                    this.I = true;
                } else if (!e(true, true)) {
                    this.f34077h1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f34076h0 != null && this.f34086n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f34076h0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f34076h0.messageOwner.destroyTime = keyAt;
                            this.f34086n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f34076h0.getId() == ((TLRPC.Message) objArr[0]).f19890id) {
            if (this.J && !this.H) {
                this.I = true;
            } else if (!e(true, true)) {
                this.f34077h1 = true;
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
        return this.f34069e0;
    }

    public final void h(File file) {
        if (this.f34060b == null) {
            return;
        }
        i();
        if (this.f34110x == null) {
            l4 l4Var = new l4(this.f34060b);
            this.f34107w = l4Var;
            l4Var.setVisibility(0);
            this.f34068e.addView(this.f34107w, 0, w7.x5.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f34060b);
            this.f34110x = textureView;
            textureView.setOpaque(false);
            this.f34107w.addView(this.f34110x, w7.x5.e(-1, -1, 17));
        }
        this.f34064c0 = false;
        this.f34066d0 = false;
        this.f34110x.setAlpha(1.0f);
        if (this.f34112y == null) {
            c51 c51Var = new c51(this);
            this.f34112y = c51Var;
            c51Var.V(this.f34110x);
            this.f34112y.J = new n7.z0(this, file, false, 9);
        }
        this.f34112y.D(Uri.fromFile(file), "other");
        this.f34112y.P(true);
        this.W.a(true, true);
    }

    public final void i() {
        c51 c51Var = this.f34112y;
        if (c51Var != null) {
            this.f34061b0 = 0;
            c51Var.H();
            this.f34112y = null;
        }
        try {
            Activity activity = this.f34060b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        l4 l4Var = this.f34107w;
        if (l4Var != null) {
            this.f34068e.removeView(l4Var);
            this.f34107w = null;
        }
        if (this.f34110x != null) {
            this.f34110x = null;
        }
        this.E = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.z5.cloneSpans(charSequence, 3);
        if (this.f34058a0 == null) {
            FrameLayout frameLayout = new FrameLayout(this.f34068e.getContext());
            this.X = frameLayout;
            this.Z.setContainer(frameLayout);
            au0 au0Var = new au0(this, this.f34068e.getContext(), this.Z, this.X, 1);
            this.f34058a0 = au0Var;
            this.Z.setScrollView(au0Var);
            this.X.setClipChildren(false);
            this.f34058a0.addView(this.X, new ViewGroup.LayoutParams(-1, -2));
            this.f34068e.addView(this.f34058a0, w7.x5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.Y.o(this.f34068e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Z.getParent() != this.X) {
            this.Z.setMeasureAllChildren(true);
            this.X.addView(this.Z, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Z.getCurrentView().getText());
        qu0 qu0Var = this.Z;
        if (z10) {
            currentView = qu0Var.getNextView();
        } else {
            currentView = qu0Var.getCurrentView();
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
        au0 au0Var2 = this.f34058a0;
        au0Var2.f39032l0 = false;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(au0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new z41(this, isEmpty2, isEmpty, 1)).addTransition(new z41(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.f34058a0.f39032l0 = true;
                duration.addTransition(new org.telegram.ui.Components.em0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Z);
            }
            TransitionManager.beginDelayedTransition(this.f34058a0, duration);
            z11 = true;
        } else {
            this.Z.getCurrentView().setText((CharSequence) null);
            au0 au0Var3 = this.f34058a0;
            if (au0Var3 != null) {
                au0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.j6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.u31.B())) {
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
                au0 au0Var4 = this.f34058a0;
                if (au0Var4 != null) {
                    au0Var4.H(au0Var4.getWidth(), au0Var4.getHeight());
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            qu0 qu0Var2 = this.Z;
            if (this.f34082k0) {
                i10 = 0;
            }
            qu0Var2.setVisibility(i10);
        } else {
            this.Z.a(null, z10, false);
            this.Z.getCurrentView().setTextColor(-1);
            qu0 qu0Var3 = this.Z;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            qu0Var3.b(4, z12);
            this.Z.setTag(null);
        }
        if (this.Z.getCurrentView() instanceof pu0) {
            ((pu0) this.Z.getCurrentView()).setLoading(false);
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
        if (this.f34085m1 == z12 && z11) {
            return;
        }
        this.f34085m1 = z12;
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
            scaleY.alpha(f11).setDuration(340L).setInterpolator(org.telegram.ui.Components.pr.h).start();
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
        this.f34095r.p(true);
        if (this.J) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        di.f4 f4Var = this.f34095r;
        f4Var.h = di.f4.a(string, f4Var.getTextPaint());
        this.f34095r.s(string);
        this.f34095r.k(12.0f, 7.0f, 11.0f, 7.0f);
        di.f4 f4Var2 = this.f34095r;
        f4Var2.getClass();
        f4Var2.f7202e0 = AndroidUtilities.dp(2);
        di.f4 f4Var3 = this.f34095r;
        f4Var3.getClass();
        f4Var3.f7200d0 = 0.0f;
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.fire_on, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        xi0Var.start();
        f4Var3.j(xi0Var);
        this.f34095r.u();
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
        w41 w41Var = this.f34097r1;
        AndroidUtilities.cancelRunOnUIThread(w41Var);
        if (z10 && this.J) {
            AndroidUtilities.runOnUIThread(w41Var, 3000L);
        }
        if (z10) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z10);
        this.f34082k0 = z10;
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
            e51 e51Var = this.U;
            t0 t0Var = e51Var.f35939n;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(e51Var, t0Var, f13));
            au0 au0Var = this.f34058a0;
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
            View view2 = this.f34071f;
            if (z10) {
                f16 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f16));
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.G.addListener(new b51(this, 1));
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
        au0 au0Var2 = this.f34058a0;
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
        View view4 = this.f34071f;
        if (z10) {
            f16 = 1.0f;
        }
        view4.setAlpha(f16);
        if (!z10) {
            this.F.setVisibility(8);
            this.f34058a0.scrollTo(0, 0);
        }
    }

    public final void n(float f7) {
        ImageReceiver imageReceiver = this.h;
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f7) - this.f34068e.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f7) - this.f34068e.getHeight())) / 2;
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
        if (this.f34113y0 != 1.0f) {
            this.f34075g1.a();
            this.f34075g1.c(Math.round(this.f34108w0), Math.round(this.f34111x0), Math.round(f7), Math.round(f10), (int) this.V0, (int) this.W0, (int) this.X0, (int) this.Y0);
            this.f34068e.postInvalidate();
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
        if (this.f34073f1) {
            return false;
        }
        if (this.f34112y != null && this.f34082k0 && motionEvent.getX() >= this.V.getX() && motionEvent.getY() >= this.V.getY() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth()) {
            c51 c51Var = this.f34112y;
            c51Var.P(!c51Var.d.u());
            if (this.f34112y.d.u()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f34082k0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f7) {
        this.animationValue = f7;
        this.f34068e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f7) {
        this.f34069e0 = f7;
        this.f34068e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
