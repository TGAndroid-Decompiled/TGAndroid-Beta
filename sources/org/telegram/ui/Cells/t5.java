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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.eq;
import org.telegram.ui.PhotoViewer;
public final class t5 extends FrameLayout {
    public static final Rect T = new Rect();
    public boolean A;
    public final boolean B;
    public MediaController.PhotoEntry C;
    public MediaController.SearchImage D;
    public final Paint E;
    public AnimatorSet F;
    public final org.telegram.ui.ActionBar.b6 G;
    public dh.l H;
    public dh.k I;
    public boolean J;
    public boolean K;
    public long L;
    public boolean M;
    public Bitmap N;
    public Float O;
    public float P;
    public r5 Q;
    public SpannableString R;
    public SpannableString S;
    public final p5 f25683a;
    public final o5 f25684b;
    public final FrameLayout f25685c;
    public final dp d;
    public final ImageView f25686e;
    public final TextView f25687f;
    public final q5 h;
    public AnimatorSet f25688n;
    public boolean f25689r;
    public boolean f25690s;
    public boolean v;
    public s5 f25691w;
    public boolean f25692x;
    public int f25693y;

    public t5(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.B = true;
        this.E = new Paint();
        new Path();
        this.P = 1.0f;
        this.G = b6Var;
        setWillNotDraw(false);
        o5 o5Var = new o5(this, context);
        this.f25684b = o5Var;
        addView(o5Var, g7.e6.c(80.0f, 80));
        p5 p5Var = new p5(this, context);
        this.f25683a = p5Var;
        p5Var.setBlurAllowed(true);
        o5Var.addView(p5Var, g7.e6.c(-1.0f, -1));
        q5 q5Var = new q5(context, 0);
        q5Var.f24906b = new RectF();
        this.h = q5Var;
        q5Var.setWillNotDraw(false);
        q5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        o5Var.addView(q5Var, g7.e6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f25686e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        q5Var.addView(imageView, g7.e6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f25687f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        q5Var.addView(textView, g7.e6.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        dp dpVar = new dp(context, 24, b6Var);
        this.d = dpVar;
        dpVar.setDrawBackgroundAsArc(7);
        dpVar.b(org.telegram.ui.ActionBar.f6.W9, org.telegram.ui.ActionBar.f6.X9, org.telegram.ui.ActionBar.f6.V9);
        addView(dpVar, g7.e6.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        dpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25685c = frameLayout;
        addView(frameLayout, g7.e6.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.f25693y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.f27781a.f26313q;
    }

    public final void b(int i9, boolean z10, boolean z11) {
        float f10;
        float f11;
        this.d.f27781a.f(i9, z10, z11);
        boolean z12 = false;
        if (this.f25692x) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            float f12 = 1.0f;
            o5 o5Var = this.f25684b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f11 = 0.787f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o5Var, View.SCALE_X, f11);
                if (z10) {
                    f12 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(o5Var, View.SCALE_Y, f12));
                this.F.setDuration(200L);
                this.F.addListener(new hg.b0(23, this, z10));
                this.F.start();
            } else {
                if (z10) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                o5Var.setScaleX(f10);
                if (z10) {
                    f12 = 0.787f;
                }
                o5Var.setScaleY(f12);
            }
        }
        MediaController.PhotoEntry photoEntry = this.C;
        if (photoEntry != null && photoEntry.isHighQuality() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f10) {
        if (this.J != z10) {
            boolean isLaidOut = isLaidOut();
            p5 p5Var = this.f25683a;
            if (isLaidOut) {
                Bitmap bitmap = this.N;
                this.N = AndroidUtilities.snapshotView(p5Var);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.P = 0.0f;
            } else {
                Bitmap bitmap2 = this.N;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.N = null;
                }
                this.P = 1.0f;
            }
            this.J = z10;
            this.O = f10;
            p5Var.setHasBlur(z10);
            p5Var.invalidate();
            if (z10) {
                h(z10);
            }
        }
    }

    @Override
    public final void clearAnimation() {
        float f10;
        super.clearAnimation();
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F = null;
            dp dpVar = this.d;
            float f11 = 1.0f;
            if (dpVar.f27781a.f26313q) {
                f10 = 0.787f;
            } else {
                f10 = 1.0f;
            }
            o5 o5Var = this.f25684b;
            o5Var.setScaleX(f10);
            if (dpVar.f27781a.f26313q) {
                f11 = 0.787f;
            }
            o5Var.setScaleY(f11);
        }
    }

    public final void d(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float f10;
        boolean z15 = false;
        this.v = false;
        this.C = photoEntry;
        this.f25689r = z12;
        this.f25690s = z13;
        boolean z16 = photoEntry.isVideo;
        float f11 = 0.0f;
        ImageView imageView = this.f25686e;
        TextView textView = this.f25687f;
        q5 q5Var = this.h;
        p5 p5Var = this.f25683a;
        if (z16 && !photoEntry.isLivePhoto()) {
            p5Var.q(0, true);
            q5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.C.duration));
        } else if (this.C.isHighQuality() && a()) {
            q5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            q5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.C;
        String str = photoEntry2.coverPath;
        if (str != null) {
            p5Var.f(str, null, org.telegram.ui.ActionBar.f6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                p5Var.f(str2, null, org.telegram.ui.ActionBar.f6.R4);
            } else if (photoEntry2.path != null) {
                if (photoEntry2.isVideo && !photoEntry2.isLivePhoto()) {
                    p5Var.f("vthumb://" + this.C.imageId + ":" + this.C.path, null, org.telegram.ui.ActionBar.f6.R4);
                } else {
                    MediaController.PhotoEntry photoEntry3 = this.C;
                    p5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                    p5Var.f("thumb://" + this.C.imageId + ":" + this.C.path, null, org.telegram.ui.ActionBar.f6.R4);
                }
            } else {
                p5Var.setImageDrawable(org.telegram.ui.ActionBar.f6.R4);
            }
        }
        if (z11 && PhotoViewer.L1(this.C.path)) {
            z14 = true;
        } else {
            z14 = false;
        }
        p5Var.getImageReceiver().setVisible(!z14, true);
        if (z14) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.d.setAlpha(f10);
        if (!z14) {
            f11 = 1.0f;
        }
        q5Var.setAlpha(f11);
        requestLayout();
        setHasSpoiler(photoEntry.hasSpoiler);
        if (photoEntry.isHighQuality() && a()) {
            z15 = true;
        }
        setHighQuality(z15);
        f(photoEntry.starsAmount, z10);
    }

    public final void e(org.telegram.messenger.MediaController.SearchImage r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t5.e(org.telegram.messenger.MediaController$SearchImage):void");
    }

    public final void f(long j10, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.M && j10 == this.L) {
            return;
        }
        this.L = j10;
        this.M = z10;
        if (j10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.R == null) {
                this.R = new SpannableString("⭐");
                eq eqVar = new eq(R.drawable.star_small_inner, 0);
                eqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.R;
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.R);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.S == null) {
                    this.S = new SpannableString("l");
                    eq eqVar2 = new eq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.S;
                    spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.S);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j10));
            }
        } else {
            spannableStringBuilder = null;
        }
        p5 p5Var = this.f25683a;
        p5Var.setBlurredText(spannableStringBuilder);
        p5Var.invalidate();
        this.f25684b.invalidate();
    }

    public final void g(boolean z10) {
        float f10;
        float f11 = 1.0f;
        dp dpVar = this.d;
        if (!z10 || dpVar.getAlpha() != 1.0f) {
            if (!z10 && dpVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f25688n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f25688n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f25688n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f25688n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f25688n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            q5 q5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q5Var, property, fArr);
            if (!z10) {
                f11 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(dpVar, property, f11));
            this.f25688n.addListener(new mh.x(this, 14));
            this.f25688n.start();
        }
    }

    public dp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f25685c;
    }

    public org.telegram.ui.Components.o9 getImageView() {
        return this.f25683a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.C;
    }

    public float getScale() {
        return this.f25684b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        p5 p5Var;
        o5 o5Var = this.f25684b;
        if (o5Var != null && (p5Var = this.f25683a) != null && p5Var.getMeasuredHeight() > 0 && p5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.I == null) {
                    this.I = dh.k.e(o5Var);
                    return;
                }
                return;
            }
            dh.k kVar = this.I;
            if (kVar != null) {
                kVar.b(this);
                this.I = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dh.k kVar = this.I;
        if (kVar != null) {
            if (kVar.f4608i) {
                this.I = dh.k.e(this);
            } else {
                kVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dh.k kVar = this.I;
        if (kVar != null) {
            kVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.f27781a.f26313q;
        p5 p5Var = this.f25683a;
        if (!z10 && this.f25684b.getScaleX() == 1.0f && p5Var.getImageReceiver().hasNotThumb() && p5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.C) == null || !PhotoViewer.L1(photoEntry.path)) && ((searchImage = this.D) == null || !PhotoViewer.L1(searchImage.getPathToAttach())))) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.X9, this.G);
        Paint paint = this.E;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder();
        MediaController.PhotoEntry photoEntry = this.C;
        if (photoEntry != null && photoEntry.isLivePhoto()) {
            sb2.append(LocaleController.getString(R.string.AttachLivePhoto));
        } else {
            MediaController.PhotoEntry photoEntry2 = this.C;
            if (photoEntry2 != null && photoEntry2.isVideo) {
                StringBuilder sb3 = new StringBuilder();
                j2.k(R.string.AttachVideo, ", ", sb3);
                sb3.append(LocaleController.formatDuration(this.C.duration));
                sb2.append(sb3.toString());
            } else {
                sb2.append(LocaleController.getString(R.string.AttachPhoto));
            }
        }
        if (this.C != null) {
            sb2.append(". ");
            sb2.append(LocaleController.getInstance().getFormatterStats().format(this.C.dateTaken * 1000));
        }
        accessibilityNodeInfo.setText(sb2);
        if (this.d.f27781a.f26313q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (this.f25692x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25693y, 1073741824), ll.C(2.0f, this.f25693y, 1073741824));
            return;
        }
        int i11 = 6;
        if (this.A) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824);
            if (this.f25689r) {
                i11 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i11 + 80), 1073741824));
            return;
        }
        if (this.f25689r) {
            i11 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i11 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t5.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        if (i9 == R.id.acc_action_open_photo) {
            View view = (View) getParent();
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getLeft(), (getHeight() + getTop()) - 1, 0));
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getLeft(), (getHeight() + getTop()) - 1, 0));
        }
        return super.performAccessibilityAction(i9, bundle);
    }

    public void setDelegate(s5 s5Var) {
        this.f25691w = s5Var;
    }

    public void setFastScrollDelegate(r5 r5Var) {
        this.Q = r5Var;
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
        if (this.K != z11) {
            this.K = z11;
            MediaController.PhotoEntry photoEntry = this.C;
            if (photoEntry != null) {
                boolean z12 = photoEntry.isVideo;
                ImageView imageView = this.f25686e;
                q5 q5Var = this.h;
                TextView textView = this.f25687f;
                if (z12 && !photoEntry.isLivePhoto()) {
                    this.f25683a.q(0, true);
                    q5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.C.duration));
                } else if (this.C.isHighQuality()) {
                    q5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
                    textView.setText(LocaleController.getString(R.string.ShortHighQuality));
                } else {
                    imageView.setVisibility(8);
                    q5Var.setVisibility(4);
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.A = z10;
    }

    public void setItemSize(int i9) {
        this.f25693y = i9;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25684b.getLayoutParams();
        int i10 = this.f25693y;
        layoutParams.height = i10;
        layoutParams.width = i10;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f25685c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        dp dpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) dpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        dpVar.setDrawBackgroundAsArc(6);
        this.f25692x = true;
    }

    public void setNum(int i9) {
        this.d.setNum(i9);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f25685c.setOnClickListener(onClickListener);
    }
}
