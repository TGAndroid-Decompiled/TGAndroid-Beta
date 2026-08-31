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
    public static volatile SecretMediaViewer f34758u1;
    public float A0;
    public boolean B;
    public float B0;
    public fg.k1 C;
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
    public ju0 K;
    public float K0;
    public int L;
    public float L0;
    public int M;
    public float M0;
    public org.telegram.ui.Components.m71 N;
    public float N0;
    public iw0 O;
    public float O0;
    public org.telegram.ui.ActionBar.l5 P;
    public float P0;
    public View Q;
    public float Q0;
    public l41 R;
    public float R0;
    public ImageView S;
    public float S0;
    public org.telegram.ui.Components.og0 T;
    public float T0;
    public FrameLayout U;
    public float U0;
    public cs0 V;
    public float V0;
    public yt0 W;
    public boolean W0;
    public it0 X;
    public boolean X0;
    public int Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public int f34759a;
    public boolean f34760a0;
    public boolean f34761a1;
    private float animationValue;
    public Activity f34762b;
    public float f34763b0;
    public boolean f34764b1;
    public WindowManager.LayoutParams f34765c;
    public long f34766c0;
    public boolean f34767c1;
    public l0 d;
    public WindowInsets f34768d0;
    public org.telegram.ui.Components.wm0 f34769d1;
    public ag.l f34770e;
    public MessageObject f34771e0;
    public boolean f34772e1;
    public View f34773f;
    public ImageReceiver.BitmapHolder f34774f0;
    public final d41 f34775f1;
    public boolean f34776g0;
    public final int[] f34777g1;
    public final int[] f34779h1;
    public lf.s0 f34781i1;
    public int f34782j0;
    public boolean f34783j1;
    public long f34784k0;
    public int f34785k1;
    public Runnable f34786l0;
    public boolean l1;
    public boolean m0;
    public Runnable f34787m1;
    public k41 f34788n;
    public float f34789n0;
    public boolean f34790n1;
    public float f34791o0;
    public final d41 f34792o1;
    public float f34793p0;
    public float[] f34794p1;
    public float f34795q0;
    public final Path f34796q1;
    public qh.f3 f34797r;
    public float f34798r0;
    public final u0 f34799r1;
    public boolean f34800s;
    public float f34801s0;
    public final u0 f34802s1;
    public float f34803t0;
    public boolean f34804t1;
    public float f34805u0;
    public long v;
    public float f34806v0;
    public o4 f34807w;
    public float f34808w0;
    public TextureView f34809x;
    public float f34810x0;
    public j41 f34811y;
    public float f34812y0;
    public float f34813z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f34778h0 = true;
    public final PhotoBackgroundDrawable f34780i0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public w01 f34814a;
        public int f34815b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            w01 w01Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f34815b == 2 && (w01Var = this.f34814a) != null) {
                    w01Var.run();
                    this.f34814a = null;
                } else {
                    invalidateSelf();
                }
                this.f34815b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z4;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            lf.s0 s0Var = secretMediaViewer.f34781i1;
            if (s0Var != null) {
                if (secretMediaViewer.f34776g0 && i10 == 255) {
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
        this.f34806v0 = 1.0f;
        this.J0 = new DecelerateInterpolator(1.5f);
        this.L0 = 1.0f;
        this.f34761a1 = true;
        this.f34775f1 = new d41(this, 2);
        this.f34777g1 = new int[2];
        this.f34779h1 = new int[2];
        this.f34792o1 = new d41(this, 3);
        this.f34796q1 = new Path();
        this.f34799r1 = new u0("videoCrossfadeAlpha", 4);
        this.f34802s1 = new u0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f34768d0;
        secretMediaViewer.f34768d0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f34758u1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f34758u1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f34758u1 = secretMediaViewer;
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
        if (f34758u1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f10, float f11, float f12, boolean z4) {
        if (this.f34806v0 == f10 && this.f34803t0 == f11 && this.f34805u0 == f12) {
            return;
        }
        this.f34764b1 = z4;
        this.f34812y0 = f10;
        this.f34808w0 = f11;
        this.f34810x0 = f12;
        this.G0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.H0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.H0.setInterpolator(this.J0);
        this.H0.setDuration(250);
        this.H0.addListener(new i41(this, 3));
        this.H0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f34771e0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f34771e0.getId()))) {
                if (this.G && !this.E) {
                    this.F = true;
                } else if (!e(true, true)) {
                    this.f34772e1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f34771e0 != null && this.f34788n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f34771e0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f34771e0.messageOwner.destroyTime = keyAt;
                            this.f34788n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f34771e0.getId() == ((TLRPC.Message) objArr[0]).f20864id) {
            if (this.G && !this.E) {
                this.F = true;
            } else if (!e(true, true)) {
                this.f34772e1 = true;
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
        return this.f34763b0;
    }

    public final void h(File file) {
        if (this.f34762b == null) {
            return;
        }
        i();
        if (this.f34809x == null) {
            o4 o4Var = new o4(this.f34762b);
            this.f34807w = o4Var;
            o4Var.setVisibility(0);
            this.f34770e.addView(this.f34807w, 0, k7.c6.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f34762b);
            this.f34809x = textureView;
            textureView.setOpaque(false);
            this.f34807w.addView(this.f34809x, k7.c6.e(-1, -1, 17));
        }
        this.Z = false;
        this.f34760a0 = false;
        this.f34809x.setAlpha(1.0f);
        if (this.f34811y == null) {
            j41 j41Var = new j41(this);
            this.f34811y = j41Var;
            j41Var.V(this.f34809x);
            this.f34811y.G = new n7.qa(this, file, false, 21);
        }
        this.f34811y.D(Uri.fromFile(file), "other");
        this.f34811y.P(true);
        this.T.a(true, true);
    }

    public final void i() {
        j41 j41Var = this.f34811y;
        if (j41Var != null) {
            this.Y = 0;
            j41Var.H();
            this.f34811y = null;
        }
        try {
            Activity activity = this.f34762b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        o4 o4Var = this.f34807w;
        if (o4Var != null) {
            this.f34770e.removeView(o4Var);
            this.f34807w = null;
        }
        if (this.f34809x != null) {
            this.f34809x = null;
        }
        this.B = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z4) {
        TextView currentView;
        boolean z10;
        CharSequence cloneSpans = org.telegram.ui.Components.u5.cloneSpans(charSequence, 3);
        if (this.X == null) {
            FrameLayout frameLayout = new FrameLayout(this.f34770e.getContext());
            this.U = frameLayout;
            this.W.setContainer(frameLayout);
            it0 it0Var = new it0(this, this.f34770e.getContext(), this.W, this.U, 1);
            this.X = it0Var;
            this.W.setScrollView(it0Var);
            this.U.setClipChildren(false);
            this.X.addView(this.U, new ViewGroup.LayoutParams(-1, -2));
            this.f34770e.addView(this.X, k7.c6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.V.o(this.f34770e.getContext()).bringToFront();
        }
        boolean z11 = true;
        if (this.W.getParent() != this.U) {
            this.W.setMeasureAllChildren(true);
            this.U.addView(this.W, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.W.getCurrentView().getText());
        yt0 yt0Var = this.W;
        if (z4) {
            currentView = yt0Var.getNextView();
        } else {
            currentView = yt0Var.getCurrentView();
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
        it0 it0Var2 = this.X;
        it0Var2.f42297i0 = false;
        if (z4) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(it0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new g41(this, isEmpty2, isEmpty, 1)).addTransition(new g41(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.X.f42297i0 = true;
                duration.addTransition(new org.telegram.ui.Components.nm0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.W);
            }
            TransitionManager.beginDelayedTransition(this.X, duration);
            z10 = true;
        } else {
            this.W.getCurrentView().setText((CharSequence) null);
            it0 it0Var3 = this.X;
            if (it0Var3 != null) {
                it0Var3.scrollTo(0, 0);
            }
            z10 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.k6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.w31.B())) {
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
                it0 it0Var4 = this.X;
                if (it0Var4 != null) {
                    it0Var4.H(it0Var4.getWidth(), it0Var4.getHeight());
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            yt0 yt0Var2 = this.W;
            if (this.f34778h0) {
                i10 = 0;
            }
            yt0Var2.setVisibility(i10);
        } else {
            this.W.a(null, z4, false);
            this.W.getCurrentView().setTextColor(-1);
            yt0 yt0Var3 = this.W;
            if (z10 && !isEmpty2) {
                z11 = false;
            }
            yt0Var3.b(4, z11);
            this.W.setTag(null);
        }
        if (this.W.getCurrentView() instanceof xt0) {
            ((xt0) this.W.getCurrentView()).setLoading(false);
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
        if (this.f34783j1 == z11 && z10) {
            return;
        }
        this.f34783j1 = z11;
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
            scaleY.alpha(f12).setDuration(340L).setInterpolator(org.telegram.ui.Components.pr.h).start();
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
        this.f34797r.q(true);
        if (this.G) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        qh.f3 f3Var = this.f34797r;
        f3Var.h = qh.f3.a(string, f3Var.getTextPaint());
        this.f34797r.t(string);
        this.f34797r.l(12.0f, 7.0f, 11.0f, 7.0f);
        qh.f3 f3Var2 = this.f34797r;
        f3Var2.getClass();
        f3Var2.f45288b0 = AndroidUtilities.dp(2);
        qh.f3 f3Var3 = this.f34797r;
        f3Var3.getClass();
        f3Var3.f45286a0 = 0.0f;
        f3Var3.j(R.raw.fire_on);
        this.f34797r.v();
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
        d41 d41Var = this.f34792o1;
        AndroidUtilities.cancelRunOnUIThread(d41Var);
        if (z4 && this.G) {
            AndroidUtilities.runOnUIThread(d41Var, 3000L);
        }
        if (z4) {
            this.C.setVisibility(0);
        }
        this.C.setEnabled(z4);
        this.f34778h0 = z4;
        k(z4, z10);
        float f17 = 0.0f;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            fg.k1 k1Var = this.C;
            Property property = View.ALPHA;
            if (z4) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(k1Var, property, f13));
            l41 l41Var = this.R;
            u0 u0Var = l41Var.f38635n;
            if (z4) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(l41Var, u0Var, f14));
            it0 it0Var = this.X;
            if (z4) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(it0Var, property, f15));
            View view = this.Q;
            if (z4) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
            View view2 = this.f34773f;
            if (z4) {
                f17 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f17));
            AnimatorSet animatorSet = new AnimatorSet();
            this.D = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z4) {
                this.D.addListener(new i41(this, 1));
            }
            this.D.setDuration(200L);
            this.D.start();
            return;
        }
        fg.k1 k1Var2 = this.C;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        k1Var2.setAlpha(f10);
        it0 it0Var2 = this.X;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        it0Var2.setAlpha(f11);
        View view3 = this.Q;
        if (z4) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        view3.setAlpha(f12);
        View view4 = this.f34773f;
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
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f10) - this.f34770e.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f10) - this.f34770e.getHeight())) / 2;
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
        if (this.f34806v0 != 1.0f) {
            this.f34769d1.a();
            this.f34769d1.c(Math.round(this.f34803t0), Math.round(this.f34805u0), Math.round(f10), Math.round(f11), (int) this.S0, (int) this.T0, (int) this.U0, (int) this.V0);
            this.f34770e.postInvalidate();
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
        if (this.f34767c1) {
            return false;
        }
        if (this.f34811y != null && this.f34778h0 && motionEvent.getX() >= this.S.getX() && motionEvent.getY() >= this.S.getY() && motionEvent.getX() <= this.S.getX() + this.S.getMeasuredWidth() && motionEvent.getX() <= this.S.getX() + this.S.getMeasuredWidth()) {
            j41 j41Var = this.f34811y;
            j41Var.P(!j41Var.d.j());
            if (this.f34811y.d.j()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f34778h0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f10) {
        this.animationValue = f10;
        this.f34770e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f10) {
        this.f34763b0 = f10;
        this.f34770e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
