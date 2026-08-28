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
    public static volatile SecretMediaViewer f36115t1;
    public boolean A;
    public float A0;
    public org.telegram.ui.Components.r7 B;
    public float B0;
    public AnimatorSet C;
    public float C0;
    public boolean D;
    public int[] D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public long F0;
    public long G;
    public AnimatorSet G0;
    public long H;
    public GestureDetector H0;
    public boolean I;
    public final DecelerateInterpolator I0;
    public zt0 J;
    public float J0;
    public int K;
    public float K0;
    public int L;
    public float L0;
    public org.telegram.ui.Components.m61 M;
    public float M0;
    public yi0 N;
    public float N0;
    public org.telegram.ui.ActionBar.h5 O;
    public float O0;
    public View P;
    public float P0;
    public x31 Q;
    public float Q0;
    public ImageView R;
    public float R0;
    public org.telegram.ui.Components.qf0 S;
    public float S0;
    public FrameLayout T;
    public float T0;
    public tr0 U;
    public float U0;
    public pt0 V;
    public boolean V0;
    public zs0 W;
    public boolean W0;
    public int X;
    public boolean X0;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public int f36116a;
    public float f36117a0;
    public boolean f36118a1;
    private float animationValue;
    public Activity f36119b;
    public long f36120b0;
    public boolean f36121b1;
    public WindowManager.LayoutParams f36122c;
    public WindowInsets f36123c0;
    public org.telegram.ui.Components.yl0 f36124c1;
    public m0 d;
    public MessageObject f36125d0;
    public boolean f36126d1;
    public fh.v f36127e;
    public ImageReceiver.BitmapHolder f36128e0;
    public final p31 f36129e1;
    public View f36130f;
    public boolean f36131f0;
    public final int[] f36132f1;
    public final int[] f36134g1;
    public ff.t0 f36136h1;
    public int f36137i0;
    public boolean f36138i1;
    public long f36139j0;
    public int f36140j1;
    public Runnable f36141k0;
    public boolean f36142k1;
    public boolean f36143l0;
    public Runnable l1;
    public float m0;
    public boolean f36144m1;
    public w31 f36145n;
    public float f36146n0;
    public final p31 f36147n1;
    public float f36148o0;
    public float[] f36149o1;
    public float f36150p0;
    public final Path f36151p1;
    public float f36152q0;
    public final v0 f36153q1;
    public kh.x3 f36154r;
    public float f36155r0;
    public final v0 f36156r1;
    public boolean f36157s;
    public float f36158s0;
    public boolean f36159s1;
    public float f36160t0;
    public float f36161u0;
    public long v;
    public float f36162v0;
    public c5.c f36163w;
    public float f36164w0;
    public TextureView f36165x;
    public float f36166x0;
    public v31 f36167y;
    public float f36168y0;
    public float f36169z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean f36133g0 = true;
    public final PhotoBackgroundDrawable f36135h0 = new PhotoBackgroundDrawable();

    public class PhotoBackgroundDrawable extends ColorDrawable {
        public n21 f36170a;
        public int f36171b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override
        public final void draw(Canvas canvas) {
            n21 n21Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.f36171b == 2 && (n21Var = this.f36170a) != null) {
                    n21Var.run();
                    this.f36170a = null;
                } else {
                    invalidateSelf();
                }
                this.f36171b++;
            }
        }

        @Override
        public void setAlpha(int i9) {
            boolean z10;
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            ff.t0 t0Var = secretMediaViewer.f36136h1;
            if (t0Var != null) {
                if (secretMediaViewer.f36131f0 && i9 == 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t0Var.a(z10);
            }
            super.setAlpha(i9);
        }

        @Override
        public final void setBounds(int i9, int i10, int i11, int i12) {
            super.setBounds(i9, i10, i11, i12 + AndroidUtilities.navigationBarHeight);
        }

        @Override
        public final void setBounds(Rect rect) {
            rect.bottom += AndroidUtilities.navigationBarHeight;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.f36161u0 = 1.0f;
        this.I0 = new DecelerateInterpolator(1.5f);
        this.K0 = 1.0f;
        this.Z0 = true;
        this.f36129e1 = new p31(this, 2);
        this.f36132f1 = new int[2];
        this.f36134g1 = new int[2];
        this.f36147n1 = new p31(this, 3);
        this.f36151p1 = new Path();
        this.f36153q1 = new v0("videoCrossfadeAlpha", 4);
        this.f36156r1 = new v0("animationValue", 5);
    }

    public static WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f36123c0;
        secretMediaViewer.f36123c0 = windowInsets;
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
        SecretMediaViewer secretMediaViewer2 = f36115t1;
        if (secretMediaViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    secretMediaViewer = f36115t1;
                    if (secretMediaViewer == null) {
                        secretMediaViewer = new SecretMediaViewer();
                        f36115t1 = secretMediaViewer;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return secretMediaViewer;
        }
        return secretMediaViewer2;
    }

    public static boolean g() {
        if (f36115t1 != null) {
            return true;
        }
        return false;
    }

    public final void c(float f10, float f11, float f12, boolean z10) {
        if (this.f36161u0 == f10 && this.f36158s0 == f11 && this.f36160t0 == f12) {
            return;
        }
        this.f36118a1 = z10;
        this.f36166x0 = f10;
        this.f36162v0 = f11;
        this.f36164w0 = f12;
        this.F0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.G0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.G0.setInterpolator(this.I0);
        this.G0.setDuration(250);
        this.G0.addListener(new u31(this, 3));
        this.G0.start();
    }

    public final void d(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretMediaViewer.d(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f36125d0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f36125d0.getId()))) {
                if (this.F && !this.D) {
                    this.E = true;
                } else if (!e(true, true)) {
                    this.f36126d1 = true;
                }
            }
        } else if (i9 == NotificationCenter.didCreatedNewDeleteTask) {
            if (this.f36125d0 != null && this.f36145n != null && ((Long) objArr[0]).longValue() == this.v) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    int keyAt = sparseArray.keyAt(i11);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (this.f36125d0.getId() == ((Integer) arrayList.get(i12)).intValue()) {
                            this.f36125d0.messageOwner.destroyTime = keyAt;
                            this.f36145n.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i9 == NotificationCenter.updateMessageMedia && this.f36125d0.getId() == ((TLRPC.Message) objArr[0]).f22401id) {
            if (this.F && !this.D) {
                this.E = true;
            } else if (!e(true, true)) {
                this.f36126d1 = true;
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
        return this.f36117a0;
    }

    public final void h(File file) {
        if (this.f36119b == null) {
            return;
        }
        i();
        if (this.f36165x == null) {
            c5.c cVar = new c5.c(this.f36119b);
            this.f36163w = cVar;
            cVar.setVisibility(0);
            this.f36127e.addView(this.f36163w, 0, g7.e6.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.f36119b);
            this.f36165x = textureView;
            textureView.setOpaque(false);
            this.f36163w.addView(this.f36165x, g7.e6.e(-1, -1, 17));
        }
        this.Y = false;
        this.Z = false;
        this.f36165x.setAlpha(1.0f);
        if (this.f36167y == null) {
            v31 v31Var = new v31(this);
            this.f36167y = v31Var;
            v31Var.W(this.f36165x);
            this.f36167y.F = new org.telegram.ui.Cells.e3(11, this, file);
        }
        this.f36167y.E(Uri.fromFile(file), "other");
        this.f36167y.Q(true);
        this.S.a(true, true);
    }

    public final void i() {
        v31 v31Var = this.f36167y;
        if (v31Var != null) {
            this.X = 0;
            v31Var.I();
            this.f36167y = null;
        }
        try {
            Activity activity = this.f36119b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        c5.c cVar = this.f36163w;
        if (cVar != null) {
            this.f36127e.removeView(cVar);
            this.f36163w = null;
        }
        if (this.f36165x != null) {
            this.f36165x = null;
        }
        this.A = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        TextView currentView;
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.t5.cloneSpans(charSequence, 3);
        if (this.W == null) {
            FrameLayout frameLayout = new FrameLayout(this.f36127e.getContext());
            this.T = frameLayout;
            this.V.setContainer(frameLayout);
            zs0 zs0Var = new zs0(this, this.f36127e.getContext(), this.V, this.T, 1);
            this.W = zs0Var;
            this.V.setScrollView(zs0Var);
            this.T.setClipChildren(false);
            this.W.addView(this.T, new ViewGroup.LayoutParams(-1, -2));
            this.f36127e.addView(this.W, g7.e6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.U.o(this.f36127e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.V.getParent() != this.T) {
            this.V.setMeasureAllChildren(true);
            this.T.addView(this.V, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.V.getCurrentView().getText());
        pt0 pt0Var = this.V;
        if (z10) {
            currentView = pt0Var.getNextView();
        } else {
            currentView = pt0Var.getCurrentView();
        }
        int maxLines = currentView.getMaxLines();
        if (maxLines == 1) {
            this.V.getCurrentView().setSingleLine(false);
            this.V.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.V.getCurrentView().setMaxLines(Integer.MAX_VALUE);
            this.V.getNextView().setMaxLines(Integer.MAX_VALUE);
            this.V.getCurrentView().setEllipsize(null);
            this.V.getNextView().setEllipsize(null);
        }
        currentView.setScrollX(0);
        zs0 zs0Var2 = this.W;
        zs0Var2.f40525h0 = false;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(zs0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new s31(this, isEmpty2, isEmpty, 1)).addTransition(new s31(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.W.f40525h0 = true;
                duration.addTransition(new org.telegram.ui.Components.pl0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.V);
            }
            TransitionManager.beginDelayedTransition(this.W, duration);
            z11 = true;
        } else {
            this.V.getCurrentView().setText((CharSequence) null);
            zs0 zs0Var3 = this.W;
            if (zs0Var3 != null) {
                zs0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        int i9 = 4;
        if (!isEmpty) {
            org.telegram.ui.ActionBar.f6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.z21.A())) {
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
            this.V.setTag(cloneSpans);
            try {
                this.V.a(cloneSpans, z10, false);
                zs0 zs0Var4 = this.W;
                if (zs0Var4 != null) {
                    zs0Var4.H(zs0Var4.getWidth(), zs0Var4.getHeight());
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            currentView.setScrollY(0);
            currentView.setTextColor(-1);
            pt0 pt0Var2 = this.V;
            if (this.f36133g0) {
                i9 = 0;
            }
            pt0Var2.setVisibility(i9);
        } else {
            this.V.a(null, z10, false);
            this.V.getCurrentView().setTextColor(-1);
            pt0 pt0Var3 = this.V;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            pt0Var3.b(4, z12);
            this.V.setTag(null);
        }
        if (this.V.getCurrentView() instanceof ot0) {
            ((ot0) this.V.getCurrentView()).setLoading(false);
        }
    }

    public final void k(boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        if (this.F && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f36138i1 == z12 && z11) {
            return;
        }
        this.f36138i1 = z12;
        this.R.animate().cancel();
        float f12 = 0.0f;
        float f13 = 0.6f;
        if (z11) {
            ViewPropertyAnimator animate = this.R.animate();
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.6f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f11);
            if (z12) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f13);
            if (z12) {
                f12 = 1.0f;
            }
            scaleY.alpha(f12).setDuration(340L).setInterpolator(org.telegram.ui.Components.gr.h).start();
            return;
        }
        ImageView imageView = this.R;
        if (z12) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        imageView.setScaleX(f10);
        ImageView imageView2 = this.R;
        if (z12) {
            f13 = 1.0f;
        }
        imageView2.setScaleY(f13);
        ImageView imageView3 = this.R;
        if (z12) {
            f12 = 1.0f;
        }
        imageView3.setAlpha(f12);
    }

    public final void l() {
        int i9;
        this.f36154r.q(true);
        if (this.F) {
            i9 = R.string.VideoShownOnce;
        } else {
            i9 = R.string.PhotoShownOnce;
        }
        String string = LocaleController.getString(i9);
        kh.x3 x3Var = this.f36154r;
        x3Var.h = kh.x3.a(string, x3Var.getTextPaint());
        this.f36154r.t(string);
        this.f36154r.l(12.0f, 7.0f, 11.0f, 7.0f);
        kh.x3 x3Var2 = this.f36154r;
        x3Var2.getClass();
        x3Var2.f16341a0 = AndroidUtilities.dp(2);
        kh.x3 x3Var3 = this.f36154r;
        x3Var3.getClass();
        x3Var3.W = 0.0f;
        x3Var3.j(R.raw.fire_on);
        this.f36154r.v();
        MessagesController.getGlobalMainSettings().edit().putInt("viewoncehint", MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void m(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        p31 p31Var = this.f36147n1;
        AndroidUtilities.cancelRunOnUIThread(p31Var);
        if (z10 && this.F) {
            AndroidUtilities.runOnUIThread(p31Var, 3000L);
        }
        if (z10) {
            this.B.setVisibility(0);
        }
        this.B.setEnabled(z10);
        this.f36133g0 = z10;
        k(z10, z11);
        float f17 = 0.0f;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            org.telegram.ui.Components.r7 r7Var = this.B;
            Property property = View.ALPHA;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(r7Var, property, f13));
            x31 x31Var = this.Q;
            v0 v0Var = x31Var.f44360n;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(x31Var, v0Var, f14));
            zs0 zs0Var = this.W;
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(zs0Var, property, f15));
            View view = this.P;
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f16));
            View view2 = this.f36130f;
            if (z10) {
                f17 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view2, property, f17));
            AnimatorSet animatorSet = new AnimatorSet();
            this.C = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z10) {
                this.C.addListener(new u31(this, 1));
            }
            this.C.setDuration(200L);
            this.C.start();
            return;
        }
        org.telegram.ui.Components.r7 r7Var2 = this.B;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        r7Var2.setAlpha(f10);
        zs0 zs0Var2 = this.W;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        zs0Var2.setAlpha(f11);
        View view3 = this.P;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        view3.setAlpha(f12);
        View view4 = this.f36130f;
        if (z10) {
            f17 = 1.0f;
        }
        view4.setAlpha(f17);
        if (!z10) {
            this.B.setVisibility(8);
            this.W.scrollTo(0, 0);
        }
    }

    public final void n(float f10) {
        ImageReceiver imageReceiver = this.h;
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f10) - this.f36127e.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f10) - this.f36127e.getHeight())) / 2;
        if (imageWidth > 0) {
            this.R0 = -imageWidth;
            this.S0 = imageWidth;
        } else {
            this.S0 = 0.0f;
            this.R0 = 0.0f;
        }
        if (imageHeight > 0) {
            this.T0 = -imageHeight;
            this.U0 = imageHeight;
            return;
        }
        this.U0 = 0.0f;
        this.T0 = 0.0f;
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
        if (this.f36161u0 != 1.0f) {
            this.f36124c1.a();
            this.f36124c1.c(Math.round(this.f36158s0), Math.round(this.f36160t0), Math.round(f10), Math.round(f11), (int) this.R0, (int) this.S0, (int) this.T0, (int) this.U0);
            this.f36127e.postInvalidate();
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
        if (this.f36121b1) {
            return false;
        }
        if (this.f36167y != null && this.f36133g0 && motionEvent.getX() >= this.R.getX() && motionEvent.getY() >= this.R.getY() && motionEvent.getX() <= this.R.getX() + this.R.getMeasuredWidth() && motionEvent.getX() <= this.R.getX() + this.R.getMeasuredWidth()) {
            v31 v31Var = this.f36167y;
            v31Var.Q(!v31Var.d.h());
            if (this.f36167y.d.h()) {
                m(true, true);
                return true;
            }
            k(true, true);
            return true;
        }
        m(!this.f36133g0, true);
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f10) {
        this.animationValue = f10;
        this.f36127e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f10) {
        this.f36117a0 = f10;
        this.f36127e.invalidate();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
