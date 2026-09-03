package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lq;
import org.telegram.ui.PhotoViewer;
public final class s5 extends FrameLayout {
    public static final Rect U = new Rect();
    public boolean B;
    public final boolean C;
    public MediaController.PhotoEntry D;
    public MediaController.SearchImage E;
    public final Paint F;
    public AnimatorSet G;
    public final org.telegram.ui.ActionBar.f6 H;
    public ih.k I;
    public ih.j J;
    public boolean K;
    public boolean L;
    public long M;
    public boolean N;
    public Bitmap O;
    public Float P;
    public float Q;
    public q5 R;
    public SpannableString S;
    public SpannableString T;
    public final o5 f22284a;
    public final n5 f22285b;
    public final FrameLayout f22286c;
    public final kp d;
    public final ImageView e;
    public final TextView f22287f;
    public final p5 h;
    public AnimatorSet f22288n;
    public boolean f22289r;
    public boolean f22290s;
    public boolean v;
    public r5 f22291w;
    public boolean f22292x;
    public int f22293y;

    public s5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.C = true;
        this.F = new Paint();
        new Path();
        this.Q = 1.0f;
        this.H = f6Var;
        setWillNotDraw(false);
        n5 n5Var = new n5(this, context);
        this.f22285b = n5Var;
        addView(n5Var, k7.b6.c(80.0f, 80));
        o5 o5Var = new o5(this, context);
        this.f22284a = o5Var;
        o5Var.setBlurAllowed(true);
        n5Var.addView(o5Var, k7.b6.c(-1.0f, -1));
        p5 p5Var = new p5(context, 0);
        p5Var.f21510b = new RectF();
        this.h = p5Var;
        p5Var.setWillNotDraw(false);
        p5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        n5Var.addView(p5Var, k7.b6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        p5Var.addView(imageView, k7.b6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f22287f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        p5Var.addView(textView, k7.b6.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        kp kpVar = new kp(context, 24, f6Var);
        this.d = kpVar;
        kpVar.setDrawBackgroundAsArc(7);
        kpVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        addView(kpVar, k7.b6.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        kpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22286c = frameLayout;
        addView(frameLayout, k7.b6.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.f22293y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.f26377a.f22938q;
    }

    public final void b(int i10, boolean z4, boolean z10) {
        float f10;
        float f11;
        this.d.f26377a.f(i10, z4, z10);
        boolean z11 = false;
        if (this.f22292x) {
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.G = null;
            }
            float f12 = 1.0f;
            n5 n5Var = this.f22285b;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.G = animatorSet2;
                if (z4) {
                    f11 = 0.787f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n5Var, View.SCALE_X, f11);
                if (z4) {
                    f12 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(n5Var, View.SCALE_Y, f12));
                this.G.setDuration(200L);
                this.G.addListener(new dg.w2(15, this, z4));
                this.G.start();
            } else {
                if (z4) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                n5Var.setScaleX(f10);
                if (z4) {
                    f12 = 0.787f;
                }
                n5Var.setScaleY(f12);
            }
        }
        MediaController.PhotoEntry photoEntry = this.D;
        if (photoEntry != null && photoEntry.isHighQuality() && a()) {
            z11 = true;
        }
        setHighQuality(z11);
    }

    public final void c(boolean z4, Float f10) {
        if (this.K != z4) {
            boolean isLaidOut = isLaidOut();
            o5 o5Var = this.f22284a;
            if (isLaidOut) {
                Bitmap bitmap = this.O;
                this.O = AndroidUtilities.snapshotView(o5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.Q = 0.0f;
            } else {
                Bitmap bitmap2 = this.O;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.O = null;
                }
                this.Q = 1.0f;
            }
            this.K = z4;
            this.P = f10;
            o5Var.setHasBlur(z4);
            o5Var.invalidate();
            if (z4) {
                h(z4);
            }
        }
    }

    @Override
    public final void clearAnimation() {
        float f10;
        super.clearAnimation();
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.G = null;
            kp kpVar = this.d;
            float f11 = 1.0f;
            if (kpVar.f26377a.f22938q) {
                f10 = 0.787f;
            } else {
                f10 = 1.0f;
            }
            n5 n5Var = this.f22285b;
            n5Var.setScaleX(f10);
            if (kpVar.f26377a.f22938q) {
                f11 = 0.787f;
            }
            n5Var.setScaleY(f11);
        }
    }

    public final void d(MediaController.PhotoEntry photoEntry, boolean z4, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f10;
        boolean z14 = false;
        this.v = false;
        this.D = photoEntry;
        this.f22289r = z11;
        this.f22290s = z12;
        boolean z15 = photoEntry.isVideo;
        float f11 = 0.0f;
        ImageView imageView = this.e;
        TextView textView = this.f22287f;
        p5 p5Var = this.h;
        o5 o5Var = this.f22284a;
        if (z15 && !photoEntry.isLivePhoto()) {
            o5Var.q(0, true);
            p5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.D.duration));
        } else if (this.D.isHighQuality() && a()) {
            p5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            p5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.D;
        String str = photoEntry2.coverPath;
        if (str != null) {
            o5Var.f(str, null, org.telegram.ui.ActionBar.j6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                o5Var.f(str2, null, org.telegram.ui.ActionBar.j6.R4);
            } else if (photoEntry2.path != null) {
                if (photoEntry2.isVideo && !photoEntry2.isLivePhoto()) {
                    o5Var.f("vthumb://" + this.D.imageId + ":" + this.D.path, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    MediaController.PhotoEntry photoEntry3 = this.D;
                    o5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                    o5Var.f("thumb://" + this.D.imageId + ":" + this.D.path, null, org.telegram.ui.ActionBar.j6.R4);
                }
            } else {
                o5Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            }
        }
        if (z10 && PhotoViewer.L1(this.D.path)) {
            z13 = true;
        } else {
            z13 = false;
        }
        o5Var.getImageReceiver().setVisible(!z13, true);
        if (z13) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.d.setAlpha(f10);
        if (!z13) {
            f11 = 1.0f;
        }
        p5Var.setAlpha(f11);
        requestLayout();
        setHasSpoiler(photoEntry.hasSpoiler);
        if (photoEntry.isHighQuality() && a()) {
            z14 = true;
        }
        setHighQuality(z14);
        f(photoEntry.starsAmount, z4);
    }

    public final void e(org.telegram.messenger.MediaController.SearchImage r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s5.e(org.telegram.messenger.MediaController$SearchImage):void");
    }

    public final void f(long j10, boolean z4) {
        SpannableStringBuilder spannableStringBuilder;
        if (z4 == this.N && j10 == this.M) {
            return;
        }
        this.M = j10;
        this.N = z4;
        if (j10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.S == null) {
                this.S = new SpannableString("⭐");
                lq lqVar = new lq(R.drawable.star_small_inner, 0);
                lqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.S;
                spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.S);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z4) {
                if (this.T == null) {
                    this.T = new SpannableString("l");
                    lq lqVar2 = new lq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.T;
                    spannableString2.setSpan(lqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.T);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j10));
            }
        } else {
            spannableStringBuilder = null;
        }
        o5 o5Var = this.f22284a;
        o5Var.setBlurredText(spannableStringBuilder);
        o5Var.invalidate();
        this.f22285b.invalidate();
    }

    public final void g(boolean z4) {
        float f10;
        float f11 = 1.0f;
        kp kpVar = this.d;
        if (!z4 || kpVar.getAlpha() != 1.0f) {
            if (!z4 && kpVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f22288n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f22288n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f22288n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f22288n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f22288n;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            p5 p5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p5Var, property, fArr);
            if (!z4) {
                f11 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(kpVar, property, f11));
            this.f22288n.addListener(new org.telegram.ui.u5(this, 7));
            this.f22288n.start();
        }
    }

    public kp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f22286c;
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.f22284a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.D;
    }

    public float getScale() {
        return this.f22285b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z4) {
        o5 o5Var;
        n5 n5Var = this.f22285b;
        if (n5Var != null && (o5Var = this.f22284a) != null && o5Var.getMeasuredHeight() > 0 && o5Var.getMeasuredWidth() > 0) {
            if (z4) {
                if (this.J == null) {
                    this.J = ih.j.e(n5Var);
                    return;
                }
                return;
            }
            ih.j jVar = this.J;
            if (jVar != null) {
                jVar.b(this);
                this.J = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ih.j jVar = this.J;
        if (jVar != null) {
            if (jVar.f7580i) {
                this.J = ih.j.e(this);
            } else {
                jVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ih.j jVar = this.J;
        if (jVar != null) {
            jVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z4 = this.d.f26377a.f22938q;
        o5 o5Var = this.f22284a;
        if (!z4 && this.f22285b.getScaleX() == 1.0f && o5Var.getImageReceiver().hasNotThumb() && o5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.D) == null || !PhotoViewer.L1(photoEntry.path)) && ((searchImage = this.E) == null || !PhotoViewer.L1(searchImage.getPathToAttach())))) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.X9, this.H);
        Paint paint = this.F;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, o5Var.getMeasuredWidth(), o5Var.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder();
        MediaController.PhotoEntry photoEntry = this.D;
        if (photoEntry != null && photoEntry.isLivePhoto()) {
            sb.append(LocaleController.getString(R.string.AttachLivePhoto));
        } else {
            MediaController.PhotoEntry photoEntry2 = this.D;
            if (photoEntry2 != null && photoEntry2.isVideo) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.b.i(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(this.D.duration));
                sb.append(sb2.toString());
            } else {
                sb.append(LocaleController.getString(R.string.AttachPhoto));
            }
        }
        if (this.D != null) {
            sb.append(". ");
            sb.append(LocaleController.getInstance().getFormatterStats().format(this.D.dateTaken * 1000));
        }
        accessibilityNodeInfo.setText(sb);
        if (this.d.f26377a.f22938q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f22292x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f22293y, 1073741824), org.telegram.ui.b.B(2.0f, this.f22293y, 1073741824));
            return;
        }
        int i12 = 6;
        if (this.B) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824);
            if (this.f22289r) {
                i12 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824));
            return;
        }
        if (this.f22289r) {
            i12 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s5.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 == R.id.acc_action_open_photo) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setDelegate(r5 r5Var) {
        this.f22291w = r5Var;
    }

    public void setFastScrollDelegate(q5 q5Var) {
        this.R = q5Var;
    }

    public void setHasSpoiler(boolean z4) {
        c(z4, null);
    }

    public void setHighQuality(boolean z4) {
        boolean z10;
        if (z4 && a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.L != z10) {
            this.L = z10;
            MediaController.PhotoEntry photoEntry = this.D;
            if (photoEntry != null) {
                boolean z11 = photoEntry.isVideo;
                ImageView imageView = this.e;
                p5 p5Var = this.h;
                TextView textView = this.f22287f;
                if (z11 && !photoEntry.isLivePhoto()) {
                    this.f22284a.q(0, true);
                    p5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.D.duration));
                } else if (this.D.isHighQuality()) {
                    p5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
                    textView.setText(LocaleController.getString(R.string.ShortHighQuality));
                } else {
                    imageView.setVisibility(8);
                    p5Var.setVisibility(4);
                }
            }
        }
    }

    public void setIsVertical(boolean z4) {
        this.B = z4;
    }

    public void setItemSize(int i10) {
        this.f22293y = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22285b.getLayoutParams();
        int i11 = this.f22293y;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f22286c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        kp kpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) kpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        kpVar.setDrawBackgroundAsArc(6);
        this.f22292x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f22286c.setOnClickListener(onClickListener);
    }
}
