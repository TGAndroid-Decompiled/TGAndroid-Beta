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
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.iq;
import org.telegram.ui.PhotoViewer;
public final class r5 extends FrameLayout {
    public static final Rect T = new Rect();
    public boolean A;
    public final boolean B;
    public MediaController.PhotoEntry C;
    public MediaController.SearchImage D;
    public final Paint E;
    public AnimatorSet F;
    public final org.telegram.ui.ActionBar.c6 G;
    public gh.k H;
    public gh.j I;
    public boolean J;
    public boolean K;
    public long L;
    public boolean M;
    public Bitmap N;
    public Float O;
    public float P;
    public p5 Q;
    public SpannableString R;
    public SpannableString S;
    public final n5 f25215a;
    public final m5 f25216b;
    public final FrameLayout f25217c;
    public final hp d;
    public final ImageView f25218e;
    public final TextView f25219f;
    public final o5 h;
    public AnimatorSet f25220n;
    public boolean f25221r;
    public boolean f25222s;
    public boolean v;
    public q5 f25223w;
    public boolean f25224x;
    public int f25225y;

    public r5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.B = true;
        this.E = new Paint();
        new Path();
        this.P = 1.0f;
        this.G = c6Var;
        setWillNotDraw(false);
        m5 m5Var = new m5(this, context);
        this.f25216b = m5Var;
        addView(m5Var, i7.f6.c(80.0f, 80));
        n5 n5Var = new n5(this, context);
        this.f25215a = n5Var;
        n5Var.setBlurAllowed(true);
        m5Var.addView(n5Var, i7.f6.c(-1.0f, -1));
        o5 o5Var = new o5(context, 0);
        o5Var.f24805b = new RectF();
        this.h = o5Var;
        o5Var.setWillNotDraw(false);
        o5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        m5Var.addView(o5Var, i7.f6.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f25218e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        o5Var.addView(imageView, i7.f6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f25219f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        o5Var.addView(textView, i7.f6.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        hp hpVar = new hp(context, 24, c6Var);
        this.d = hpVar;
        hpVar.setDrawBackgroundAsArc(7);
        hpVar.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
        addView(hpVar, i7.f6.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        hpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25217c = frameLayout;
        addView(frameLayout, i7.f6.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.f25225y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.f29211a.f26324q;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        float f9;
        float f10;
        this.d.f29211a.f(i10, z10, z11);
        boolean z12 = false;
        if (this.f25224x) {
            AnimatorSet animatorSet = this.F;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F = null;
            }
            float f11 = 1.0f;
            m5 m5Var = this.f25216b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F = animatorSet2;
                if (z10) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m5Var, View.SCALE_X, f10);
                if (z10) {
                    f11 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(m5Var, View.SCALE_Y, f11));
                this.F.setDuration(200L);
                this.F.addListener(new bg.z2(23, this, z10));
                this.F.start();
            } else {
                if (z10) {
                    f9 = 0.787f;
                } else {
                    f9 = 1.0f;
                }
                m5Var.setScaleX(f9);
                if (z10) {
                    f11 = 0.787f;
                }
                m5Var.setScaleY(f11);
            }
        }
        MediaController.PhotoEntry photoEntry = this.C;
        if (photoEntry != null && photoEntry.isHighQuality() && a()) {
            z12 = true;
        }
        setHighQuality(z12);
    }

    public final void c(boolean z10, Float f9) {
        if (this.J != z10) {
            boolean isLaidOut = isLaidOut();
            n5 n5Var = this.f25215a;
            if (isLaidOut) {
                Bitmap bitmap = this.N;
                this.N = AndroidUtilities.snapshotView(n5Var);
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
            this.O = f9;
            n5Var.setHasBlur(z10);
            n5Var.invalidate();
            if (z10) {
                h(z10);
            }
        }
    }

    @Override
    public final void clearAnimation() {
        float f9;
        super.clearAnimation();
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F = null;
            hp hpVar = this.d;
            float f10 = 1.0f;
            if (hpVar.f29211a.f26324q) {
                f9 = 0.787f;
            } else {
                f9 = 1.0f;
            }
            m5 m5Var = this.f25216b;
            m5Var.setScaleX(f9);
            if (hpVar.f29211a.f26324q) {
                f10 = 0.787f;
            }
            m5Var.setScaleY(f10);
        }
    }

    public final void d(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float f9;
        boolean z15 = false;
        this.v = false;
        this.C = photoEntry;
        this.f25221r = z12;
        this.f25222s = z13;
        boolean z16 = photoEntry.isVideo;
        float f10 = 0.0f;
        ImageView imageView = this.f25218e;
        TextView textView = this.f25219f;
        o5 o5Var = this.h;
        n5 n5Var = this.f25215a;
        if (z16 && !photoEntry.isLivePhoto()) {
            n5Var.q(0, true);
            o5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.C.duration));
        } else if (this.C.isHighQuality() && a()) {
            o5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            o5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.C;
        String str = photoEntry2.coverPath;
        if (str != null) {
            n5Var.f(str, null, org.telegram.ui.ActionBar.g6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                n5Var.f(str2, null, org.telegram.ui.ActionBar.g6.R4);
            } else if (photoEntry2.path != null) {
                if (photoEntry2.isVideo && !photoEntry2.isLivePhoto()) {
                    n5Var.f("vthumb://" + this.C.imageId + ":" + this.C.path, null, org.telegram.ui.ActionBar.g6.R4);
                } else {
                    MediaController.PhotoEntry photoEntry3 = this.C;
                    n5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                    n5Var.f("thumb://" + this.C.imageId + ":" + this.C.path, null, org.telegram.ui.ActionBar.g6.R4);
                }
            } else {
                n5Var.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
            }
        }
        if (z11 && PhotoViewer.L1(this.C.path)) {
            z14 = true;
        } else {
            z14 = false;
        }
        n5Var.getImageReceiver().setVisible(!z14, true);
        if (z14) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        this.d.setAlpha(f9);
        if (!z14) {
            f10 = 1.0f;
        }
        o5Var.setAlpha(f10);
        requestLayout();
        setHasSpoiler(photoEntry.hasSpoiler);
        if (photoEntry.isHighQuality() && a()) {
            z15 = true;
        }
        setHighQuality(z15);
        f(photoEntry.starsAmount, z10);
    }

    public final void e(org.telegram.messenger.MediaController.SearchImage r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r5.e(org.telegram.messenger.MediaController$SearchImage):void");
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
                iq iqVar = new iq(R.drawable.star_small_inner, 0);
                iqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.R;
                spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.R);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.S == null) {
                    this.S = new SpannableString("l");
                    iq iqVar2 = new iq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.S;
                    spannableString2.setSpan(iqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.S);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j10));
            }
        } else {
            spannableStringBuilder = null;
        }
        n5 n5Var = this.f25215a;
        n5Var.setBlurredText(spannableStringBuilder);
        n5Var.invalidate();
        this.f25216b.invalidate();
    }

    public final void g(boolean z10) {
        float f9;
        float f10 = 1.0f;
        hp hpVar = this.d;
        if (!z10 || hpVar.getAlpha() != 1.0f) {
            if (!z10 && hpVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f25220n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f25220n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f25220n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f25220n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f25220n;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            float[] fArr = {f9};
            o5 o5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o5Var, property, fArr);
            if (!z10) {
                f10 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(hpVar, property, f10));
            this.f25220n.addListener(new nh.q5(this, 16));
            this.f25220n.start();
        }
    }

    public hp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f25217c;
    }

    public org.telegram.ui.Components.t9 getImageView() {
        return this.f25215a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.C;
    }

    public float getScale() {
        return this.f25216b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        n5 n5Var;
        m5 m5Var = this.f25216b;
        if (m5Var != null && (n5Var = this.f25215a) != null && n5Var.getMeasuredHeight() > 0 && n5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.I == null) {
                    this.I = gh.j.e(m5Var);
                    return;
                }
                return;
            }
            gh.j jVar = this.I;
            if (jVar != null) {
                jVar.b(this);
                this.I = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gh.j jVar = this.I;
        if (jVar != null) {
            if (jVar.f7398i) {
                this.I = gh.j.e(this);
            } else {
                jVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gh.j jVar = this.I;
        if (jVar != null) {
            jVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.f29211a.f26324q;
        n5 n5Var = this.f25215a;
        if (!z10 && this.f25216b.getScaleX() == 1.0f && n5Var.getImageReceiver().hasNotThumb() && n5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.C) == null || !PhotoViewer.L1(photoEntry.path)) && ((searchImage = this.D) == null || !PhotoViewer.L1(searchImage.getPathToAttach())))) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.X9, this.G);
        Paint paint = this.E;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, n5Var.getMeasuredWidth(), n5Var.getMeasuredHeight(), paint);
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
                org.telegram.ui.b.j(R.string.AttachVideo, ", ", sb3);
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
        if (this.d.f29211a.f26324q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f25224x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25225y, 1073741824), org.telegram.ui.b.B(2.0f, this.f25225y, 1073741824));
            return;
        }
        int i12 = 6;
        if (this.A) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824);
            if (this.f25221r) {
                i12 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824));
            return;
        }
        if (this.f25221r) {
            i12 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r5.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void setDelegate(q5 q5Var) {
        this.f25223w = q5Var;
    }

    public void setFastScrollDelegate(p5 p5Var) {
        this.Q = p5Var;
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
                ImageView imageView = this.f25218e;
                o5 o5Var = this.h;
                TextView textView = this.f25219f;
                if (z12 && !photoEntry.isLivePhoto()) {
                    this.f25215a.q(0, true);
                    o5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.C.duration));
                } else if (this.C.isHighQuality()) {
                    o5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
                    textView.setText(LocaleController.getString(R.string.ShortHighQuality));
                } else {
                    imageView.setVisibility(8);
                    o5Var.setVisibility(4);
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.A = z10;
    }

    public void setItemSize(int i10) {
        this.f25225y = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25216b.getLayoutParams();
        int i11 = this.f25225y;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f25217c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        hp hpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) hpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        hpVar.setDrawBackgroundAsArc(6);
        this.f25224x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f25217c.setOnClickListener(onClickListener);
    }
}
