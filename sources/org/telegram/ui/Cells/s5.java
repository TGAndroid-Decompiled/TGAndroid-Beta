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
import org.telegram.messenger.vl;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.nq;
import org.telegram.ui.PhotoViewer;
public final class s5 extends FrameLayout {
    public static final Rect f22830a0 = new Rect();
    public boolean E;
    public final boolean F;
    public MediaController.PhotoEntry G;
    public MediaController.SearchImage H;
    public final Paint I;
    public AnimatorSet J;
    public final org.telegram.ui.ActionBar.f6 K;
    public wh.h L;
    public wh.g M;
    public boolean N;
    public boolean O;
    public long P;
    public boolean Q;
    public Bitmap R;
    public Float S;
    public float T;
    public q5 U;
    public SpannableString V;
    public SpannableString W;
    public final o5 f22831a;
    public final n5 f22832b;
    public final FrameLayout f22833c;
    public final mp d;
    public final ImageView f22834e;
    public final TextView f22835f;
    public final p5 h;
    public AnimatorSet f22836n;
    public boolean f22837r;
    public boolean f22838s;
    public boolean v;
    public r5 f22839w;
    public boolean f22840x;
    public int f22841y;

    public s5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.F = true;
        this.I = new Paint();
        new Path();
        this.T = 1.0f;
        this.K = f6Var;
        setWillNotDraw(false);
        n5 n5Var = new n5(this, context);
        this.f22832b = n5Var;
        addView(n5Var, w7.x5.c(80.0f, 80));
        o5 o5Var = new o5(this, context);
        this.f22831a = o5Var;
        o5Var.setBlurAllowed(true);
        n5Var.addView(o5Var, w7.x5.c(-1.0f, -1));
        p5 p5Var = new p5(context, 0);
        p5Var.f22463b = new RectF();
        this.h = p5Var;
        p5Var.setWillNotDraw(false);
        p5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        n5Var.addView(p5Var, w7.x5.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f22834e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        p5Var.addView(imageView, w7.x5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f22835f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        p5Var.addView(textView, w7.x5.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        mp mpVar = new mp(context, 24, f6Var);
        this.d = mpVar;
        mpVar.setDrawBackgroundAsArc(7);
        mpVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        addView(mpVar, w7.x5.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        mpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22833c = frameLayout;
        addView(frameLayout, w7.x5.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.f22841y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.f28477a.f23907q;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        float f7;
        float f10;
        this.d.f28477a.f(i10, z10, z11);
        boolean z12 = false;
        if (this.f22840x) {
            AnimatorSet animatorSet = this.J;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.J = null;
            }
            float f11 = 1.0f;
            n5 n5Var = this.f22832b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.J = animatorSet2;
                if (z10) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n5Var, View.SCALE_X, f10);
                if (z10) {
                    f11 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(n5Var, View.SCALE_Y, f11));
                this.J.setDuration(200L);
                this.J.addListener(new ah.q0(24, this, z10));
                this.J.start();
            } else {
                if (z10) {
                    f7 = 0.787f;
                } else {
                    f7 = 1.0f;
                }
                n5Var.setScaleX(f7);
                if (z10) {
                    f11 = 0.787f;
                }
                n5Var.setScaleY(f11);
            }
        }
        MediaController.PhotoEntry photoEntry = this.G;
        if (photoEntry != null && photoEntry.isHighQuality() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f7) {
        if (this.N != z10) {
            boolean isLaidOut = isLaidOut();
            o5 o5Var = this.f22831a;
            if (isLaidOut) {
                Bitmap bitmap = this.R;
                this.R = AndroidUtilities.snapshotView(o5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.T = 0.0f;
            } else {
                Bitmap bitmap2 = this.R;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.R = null;
                }
                this.T = 1.0f;
            }
            this.N = z10;
            this.S = f7;
            o5Var.setHasBlur(z10);
            o5Var.invalidate();
            if (z10) {
                h(z10);
            }
        }
    }

    @Override
    public final void clearAnimation() {
        float f7;
        super.clearAnimation();
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.J = null;
            mp mpVar = this.d;
            float f10 = 1.0f;
            if (mpVar.f28477a.f23907q) {
                f7 = 0.787f;
            } else {
                f7 = 1.0f;
            }
            n5 n5Var = this.f22832b;
            n5Var.setScaleX(f7);
            if (mpVar.f28477a.f23907q) {
                f10 = 0.787f;
            }
            n5Var.setScaleY(f10);
        }
    }

    public final void d(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float f7;
        boolean z15 = false;
        this.v = false;
        this.G = photoEntry;
        this.f22837r = z12;
        this.f22838s = z13;
        boolean z16 = photoEntry.isVideo;
        float f10 = 0.0f;
        ImageView imageView = this.f22834e;
        TextView textView = this.f22835f;
        p5 p5Var = this.h;
        o5 o5Var = this.f22831a;
        if (z16 && !photoEntry.isLivePhoto()) {
            o5Var.q(0, true);
            p5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
        } else if (this.G.isHighQuality() && a()) {
            p5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            p5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.G;
        String str = photoEntry2.coverPath;
        if (str != null) {
            o5Var.f(str, null, org.telegram.ui.ActionBar.j6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                o5Var.f(str2, null, org.telegram.ui.ActionBar.j6.R4);
            } else if (photoEntry2.path != null) {
                if (photoEntry2.isVideo && !photoEntry2.isLivePhoto()) {
                    o5Var.f("vthumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    MediaController.PhotoEntry photoEntry3 = this.G;
                    o5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                    o5Var.f("thumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.j6.R4);
                }
            } else {
                o5Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            }
        }
        if (z11 && PhotoViewer.L1(this.G.path)) {
            z14 = true;
        } else {
            z14 = false;
        }
        o5Var.getImageReceiver().setVisible(!z14, true);
        if (z14) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.d.setAlpha(f7);
        if (!z14) {
            f10 = 1.0f;
        }
        p5Var.setAlpha(f10);
        requestLayout();
        setHasSpoiler(photoEntry.hasSpoiler);
        if (photoEntry.isHighQuality() && a()) {
            z15 = true;
        }
        setHighQuality(z15);
        f(photoEntry.starsAmount, z10);
    }

    public final void e(org.telegram.messenger.MediaController.SearchImage r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s5.e(org.telegram.messenger.MediaController$SearchImage):void");
    }

    public final void f(long j3, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.Q && j3 == this.P) {
            return;
        }
        this.P = j3;
        this.Q = z10;
        if (j3 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.V == null) {
                this.V = new SpannableString("⭐");
                nq nqVar = new nq(R.drawable.star_small_inner, 0);
                nqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.V;
                spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.V);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.W == null) {
                    this.W = new SpannableString("l");
                    nq nqVar2 = new nq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.W;
                    spannableString2.setSpan(nqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.W);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j3));
            }
        } else {
            spannableStringBuilder = null;
        }
        o5 o5Var = this.f22831a;
        o5Var.setBlurredText(spannableStringBuilder);
        o5Var.invalidate();
        this.f22832b.invalidate();
    }

    public final void g(boolean z10) {
        float f7;
        float f10 = 1.0f;
        mp mpVar = this.d;
        if (!z10 || mpVar.getAlpha() != 1.0f) {
            if (!z10 && mpVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f22836n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f22836n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f22836n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f22836n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f22836n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            p5 p5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p5Var, property, fArr);
            if (!z10) {
                f10 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(mpVar, property, f10));
            this.f22836n.addListener(new org.telegram.ui.s0(this, 11));
            this.f22836n.start();
        }
    }

    public mp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f22833c;
    }

    public org.telegram.ui.Components.x9 getImageView() {
        return this.f22831a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.G;
    }

    public float getScale() {
        return this.f22832b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        o5 o5Var;
        n5 n5Var = this.f22832b;
        if (n5Var != null && (o5Var = this.f22831a) != null && o5Var.getMeasuredHeight() > 0 && o5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.M == null) {
                    this.M = wh.g.e(n5Var);
                    return;
                }
                return;
            }
            wh.g gVar = this.M;
            if (gVar != null) {
                gVar.b(this);
                this.M = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wh.g gVar = this.M;
        if (gVar != null) {
            if (gVar.f48608i) {
                this.M = wh.g.e(this);
            } else {
                gVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wh.g gVar = this.M;
        if (gVar != null) {
            gVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.f28477a.f23907q;
        o5 o5Var = this.f22831a;
        if (!z10 && this.f22832b.getScaleX() == 1.0f && o5Var.getImageReceiver().hasNotThumb() && o5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.G) == null || !PhotoViewer.L1(photoEntry.path)) && ((searchImage = this.H) == null || !PhotoViewer.L1(searchImage.getPathToAttach())))) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.X9, this.K);
        Paint paint = this.I;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, o5Var.getMeasuredWidth(), o5Var.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        MediaController.PhotoEntry photoEntry = this.G;
        if (photoEntry != null && photoEntry.isLivePhoto()) {
            sb2.append(LocaleController.getString(R.string.AttachLivePhoto));
        } else {
            MediaController.PhotoEntry photoEntry2 = this.G;
            if (photoEntry2 != null && photoEntry2.isVideo) {
                StringBuilder sb3 = new StringBuilder();
                vl.l(R.string.AttachVideo, ", ", sb3);
                sb3.append(LocaleController.formatDuration(this.G.duration));
                sb2.append(sb3.toString());
            } else {
                sb2.append(LocaleController.getString(R.string.AttachPhoto));
            }
        }
        if (this.G != null) {
            sb2.append(". ");
            sb2.append(LocaleController.getInstance().getFormatterStats().format(this.G.dateTaken * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.f28477a.f23907q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f22840x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f22841y, 1073741824), vl.C(2.0f, this.f22841y, 1073741824));
            return;
        }
        int i12 = 6;
        if (this.E) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824);
            if (this.f22837r) {
                i12 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824));
            return;
        }
        if (this.f22837r) {
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
        this.f22839w = r5Var;
    }

    public void setFastScrollDelegate(q5 q5Var) {
        this.U = q5Var;
    }

    public void setHasSpoiler(boolean z10) {
        c(z10, null);
    }

    public void setHighQuality(boolean z10) {
        boolean z11;
        if (z10 && a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.O != z11) {
            this.O = z11;
            MediaController.PhotoEntry photoEntry = this.G;
            if (photoEntry != null) {
                boolean z12 = photoEntry.isVideo;
                ImageView imageView = this.f22834e;
                p5 p5Var = this.h;
                TextView textView = this.f22835f;
                if (z12 && !photoEntry.isLivePhoto()) {
                    this.f22831a.q(0, true);
                    p5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
                } else if (this.G.isHighQuality()) {
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

    public void setIsVertical(boolean z10) {
        this.E = z10;
    }

    public void setItemSize(int i10) {
        this.f22841y = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22832b.getLayoutParams();
        int i11 = this.f22841y;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f22833c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        mp mpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) mpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        mpVar.setDrawBackgroundAsArc(6);
        this.f22840x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f22833c.setOnClickListener(onClickListener);
    }
}
