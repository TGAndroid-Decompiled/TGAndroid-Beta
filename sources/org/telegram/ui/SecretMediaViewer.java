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
    public static volatile SecretMediaViewer f34250x1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public boolean E;
    public float E0;
    public org.telegram.ui.Components.a8 F;
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
    public ev0 N;
    public float N0;
    public int O;
    public float O0;
    public int P;
    public float P0;
    public org.telegram.ui.Components.s81 Q;
    public float Q0;
    public s50 R;
    public float R0;
    public org.telegram.ui.ActionBar.h5 S;
    public float S0;
    public View T;
    public float T0;
    public h51 U;
    public float U0;
    public ImageView V;
    public float V0;
    public org.telegram.ui.Components.kh0 W;
    public float W0;
    public FrameLayout X;
    public float X0;
    public ys0 Y;
    public float Y0;
    public uu0 Z;
    public boolean Z0;
    public int f34251a;
    public eu0 f34252a0;
    public boolean f34253a1;
    private float animationValue;
    public Activity f34254b;
    public int f34255b0;
    public boolean f34256b1;
    public WindowManager.LayoutParams f34257c;
    public boolean f34258c0;
    public boolean f34259c1;
    public k0 d;
    public boolean f34260d0;
    public boolean f34261d1;
    public ci.m6 f34262e;
    public float f34263e0;
    public boolean f34264e1;
    public View f34265f;
    public long f34266f0;
    public boolean f34267f1;
    public WindowInsets f34268g0;
    public org.telegram.ui.Components.zn0 f34269g1;
    public MessageObject f34270h0;
    public boolean f34271h1;
    public ImageReceiver.BitmapHolder f34272i0;
    public final y41 f34273i1;
    public boolean f34274j0;
    public final int[] f34275j1;
    public final int[] f34277k1;
    public jb0 l1;
    public int m0;
    public boolean f34279m1;
    public g51 f34280n;
    public long f34281n0;
    public int f34282n1;
    public Runnable f34283o0;
    public boolean f34284o1;
    public boolean f34285p0;
    public Runnable f34286p1;
    public float f34287q0;
    public boolean f34288q1;
    public ci.d4 f34289r;
    public float f34290r0;
    public final y41 f34291r1;
    public boolean f34292s;
    public float f34293s0;
    public float[] f34294s1;
    public float f34295t0;
    public final Path f34296t1;
    public float f34297u0;
    public final t0 f34298u1;
    public long v;
    public float f34299v0;
    public final t0 f34300v1;
    public l4 f34301w;
    public float f34302w0;
    public boolean f34303w1;
    public TextureView f34304x;
    public float f34305x0;
    public e51 f34306y;
    public float f34307y0;
    public float f34308z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f34276k0 = true;
    public final PhotoBackgroundDrawable f34278l0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public u31 f34309a;
        public int f34310b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            u31 u31Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f34310b == 2 && (u31Var = this.f34309a) != null) {
                    u31Var.run();
                    this.f34309a = null;
                } else {
                    invalidateSelf();
                }
                this.f34310b++;
            }
        }

        @Override
        public void setAlpha(int i10) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            jb0 jb0Var = secretMediaViewer.l1;
            if (jb0Var != null) {
                if (secretMediaViewer.f34274j0 && i10 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jb0Var.a(z10);
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
        this.f34307y0 = 1.0f;
        this.M0 = new DecelerateInterpolator(1.5f);
        this.O0 = 1.0f;
        this.f34261d1 = true;
        this.f34273i1 = new y41(this, 2);
        this.f34275j1 = new int[2];
        this.f34277k1 = new int[2];
        this.f34291r1 = new y41(this, 3);
        this.f34296t1 = new Path();
        this.f34298u1 = new t0("videoCrossfadeAlpha", 4);
        this.f34300v1 = new t0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f34268g0;
        secretMediaViewer.f34268g0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f34250x1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f34250x1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f34250x1 = secretMediaViewer;
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
        if (f34250x1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f7, float f10, float f11, boolean z10) {
        if (this.f34307y0 == f7 && this.f34302w0 == f10 && this.f34305x0 == f11) {
            return;
        }
        this.f34264e1 = z10;
        this.B0 = f7;
        this.f34308z0 = f10;
        this.A0 = f11;
        this.J0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.K0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.K0.setInterpolator(this.M0);
        this.K0.setDuration(250);
        this.K0.addListener(new d51(this, 3));
        this.K0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f34270h0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f34270h0.getId()))) {
                if (this.J && !this.H) {
                    this.I = true;
                } else if (!e(true, true)) {
                    this.f34271h1 = true;
                }
            }
        } else if (i10 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f34270h0 != null && this.f34280n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    int keyAt = sparseArray.keyAt(i12);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (this.f34270h0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                            this.f34270h0.messageOwner.destroyTime = keyAt;
                            this.f34280n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateMessageMedia && this.f34270h0.getId() == ((TLRPC.Message) objArr[0]).f19824id) {
            if (this.J && !this.H) {
                this.I = true;
            } else if (!e(true, true)) {
                this.f34271h1 = true;
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
        return this.f34263e0;
    }

    public final void h(File file) {
        if (this.f34254b == null) {
            return;
        }
        i();
        if (this.f34304x == null) {
            l4 l4Var = new l4(this.f34254b);
            this.f34301w = l4Var;
            l4Var.setVisibility(0);
            this.f34262e.addView(this.f34301w, 0, w7.w5.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f34254b);
            this.f34304x = textureView;
            textureView.setOpaque(false);
            this.f34301w.addView(this.f34304x, w7.w5.e(-1, -1, 17));
        }
        this.f34258c0 = false;
        this.f34260d0 = false;
        this.f34304x.setAlpha(1.0f);
        if (this.f34306y == null) {
            e51 e51Var = new e51(this);
            this.f34306y = e51Var;
            e51Var.V(this.f34304x);
            this.f34306y.J = new n6.k(this, file, false, 10);
        }
        this.f34306y.D(Uri.fromFile(file), "other");
        this.f34306y.P(true);
        this.W.a(true, true);
    }

    public final void i() {
        e51 e51Var = this.f34306y;
        if (e51Var != null) {
            this.f34255b0 = 0;
            e51Var.H();
            this.f34306y = null;
        }
        try {
            Activity activity = this.f34254b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        l4 l4Var = this.f34301w;
        if (l4Var != null) {
            this.f34262e.removeView(l4Var);
            this.f34301w = null;
        }
        if (this.f34304x != null) {
            this.f34304x = null;
        }
        this.E = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.b6.cloneSpans(charSequence, 3);
        if (this.f34252a0 == null) {
            FrameLayout frameLayout = new FrameLayout(this.f34262e.getContext());
            this.X = frameLayout;
            this.Z.setContainer(frameLayout);
            eu0 eu0Var = new eu0(this, this.f34262e.getContext(), this.Z, this.X, 1);
            this.f34252a0 = eu0Var;
            this.Z.setScrollView(eu0Var);
            this.X.setClipChildren(false);
            this.f34252a0.addView(this.X, new ViewGroup.LayoutParams(-1, -2));
            this.f34262e.addView(this.f34252a0, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
            this.Y.n(this.f34262e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Z.getParent() != this.X) {
            this.Z.setMeasureAllChildren(true);
            this.X.addView(this.Z, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Z.getCurrentView().getText());
        uu0 uu0Var = this.Z;
        if (z10) {
            currentView = uu0Var.getNextView();
        } else {
            currentView = uu0Var.getCurrentView();
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
        eu0 eu0Var2 = this.f34252a0;
        eu0Var2.f41731l0 = false;
        if (z10) {
            TransitionManager.endTransitions(eu0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new b51(this, isEmpty2, isEmpty, 1)).addTransition(new b51(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.f34252a0.f41731l0 = true;
                duration.addTransition(new org.telegram.ui.Components.qn0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Z);
            }
            TransitionManager.beginDelayedTransition(this.f34252a0, duration);
            z11 = true;
        } else {
            this.Z.getCurrentView().setText((CharSequence) null);
            eu0 eu0Var3 = this.f34252a0;
            if (eu0Var3 != null) {
                eu0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i10 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.h6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.g51.D())) {
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
                eu0 eu0Var4 = this.f34252a0;
                if (eu0Var4 != null) {
                    eu0Var4.H(eu0Var4.getWidth(), eu0Var4.getHeight());
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            uu0 uu0Var2 = this.Z;
            if (this.f34276k0) {
                i10 = 0;
            }
            uu0Var2.setVisibility(i10);
        } else {
            this.Z.a(null, z10, false);
            this.Z.getCurrentView().setTextColor(-1);
            uu0 uu0Var3 = this.Z;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            uu0Var3.b(4, z12);
            this.Z.setTag(null);
        }
        if (this.Z.getCurrentView() instanceof tu0) {
            ((tu0) this.Z.getCurrentView()).setLoading(false);
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
        if (this.f34279m1 == z12 && z11) {
            return;
        }
        this.f34279m1 = z12;
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
            scaleY.alpha(f11).setDuration(340L).setInterpolator(org.telegram.ui.Components.js.h).start();
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
        this.f34289r.p(true);
        if (this.J) {
            i10 = R.string.VideoShownOnce;
        } else {
            i10 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i10);
        ci.d4 d4Var = this.f34289r;
        d4Var.h = ci.d4.a(string, d4Var.getTextPaint());
        this.f34289r.s(string);
        this.f34289r.k(12.0f, 7.0f, 11.0f, 7.0f);
        ci.d4 d4Var2 = this.f34289r;
        d4Var2.getClass();
        d4Var2.f4908e0 = AndroidUtilities.dp(2);
        ci.d4 d4Var3 = this.f34289r;
        d4Var3.getClass();
        d4Var3.f4906d0 = 0.0f;
        org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(R.raw.fire_on, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        fk0Var.start();
        d4Var3.j(fk0Var);
        this.f34289r.u();
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
        y41 y41Var = this.f34291r1;
        AndroidUtilities.cancelRunOnUIThread(y41Var);
        if (z10 && this.J) {
            AndroidUtilities.runOnUIThread(y41Var, 3000L);
        }
        if (z10) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z10);
        this.f34276k0 = z10;
        k(z10, z11);
        float f16 = 0.0f;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.Components.a8 a8Var = this.F;
            Property property = View.ALPHA;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(a8Var, property, f12));
            h51 h51Var = this.U;
            t0 t0Var = h51Var.f38253n;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(h51Var, t0Var, f13));
            eu0 eu0Var = this.f34252a0;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(eu0Var, property, f14));
            View view = this.T;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f15));
            View view2 = this.f34265f;
            if (z10) {
                f16 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f16));
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.G.addListener(new d51(this, 1));
            }
            this.G.setDuration(200L);
            this.G.start();
            return;
        }
        org.telegram.ui.Components.a8 a8Var2 = this.F;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        a8Var2.setAlpha(f7);
        eu0 eu0Var2 = this.f34252a0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        eu0Var2.setAlpha(f10);
        View view3 = this.T;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        view3.setAlpha(f11);
        View view4 = this.f34265f;
        if (z10) {
            f16 = 1.0f;
        }
        view4.setAlpha(f16);
        if (!z10) {
            this.F.setVisibility(8);
            this.f34252a0.scrollTo(0, 0);
        }
    }

    public final void n(float f7) {
        ImageReceiver imageReceiver = this.h;
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f7) - this.f34262e.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f7) - this.f34262e.getHeight())) / 2;
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
        if (this.f34307y0 != 1.0f) {
            this.f34269g1.a();
            this.f34269g1.c(Math.round(this.f34302w0), Math.round(this.f34305x0), Math.round(f7), Math.round(f10), (int) this.V0, (int) this.W0, (int) this.X0, (int) this.Y0);
            this.f34262e.postInvalidate();
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
        if (this.f34267f1) {
            return false;
        }
        if (this.f34306y != null && this.f34276k0 && motionEvent.getX() >= this.V.getX() && motionEvent.getY() >= this.V.getY() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth() && motionEvent.getX() <= this.V.getX() + this.V.getMeasuredWidth()) {
            e51 e51Var = this.f34306y;
            e51Var.P(!e51Var.d.u());
            if (this.f34306y.d.u()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f34276k0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f7) {
        this.animationValue = f7;
        this.f34262e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f7) {
        this.f34263e0 = f7;
        this.f34262e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
