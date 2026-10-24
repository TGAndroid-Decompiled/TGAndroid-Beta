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
import org.telegram.messenger.tl;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.vq;
import org.telegram.ui.PhotoViewer;
public final class s5 extends FrameLayout {
    public static final Rect f23247a0 = new Rect();
    public boolean E;
    public final boolean F;
    public MediaController.PhotoEntry G;
    public MediaController.SearchImage H;
    public final Paint I;
    public AnimatorSet J;
    public final org.telegram.ui.ActionBar.g6 K;
    public wh.g L;
    public wh.f M;
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
    public final o5 f23248a;
    public final n5 f23249b;
    public final FrameLayout f23250c;
    public final vp d;
    public final ImageView e;
    public final TextView f23251f;
    public final p5 h;
    public AnimatorSet f23252n;
    public boolean f23253r;
    public boolean f23254s;
    public boolean v;
    public r5 f23255w;
    public boolean f23256x;
    public int f23257y;

    public s5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.F = true;
        this.I = new Paint();
        new Path();
        this.T = 1.0f;
        this.K = g6Var;
        setWillNotDraw(false);
        n5 n5Var = new n5(this, context);
        this.f23249b = n5Var;
        addView(n5Var, w7.z5.c(80.0f, 80));
        o5 o5Var = new o5(this, context);
        this.f23248a = o5Var;
        o5Var.setBlurAllowed(true);
        n5Var.addView(o5Var, w7.z5.c(-1.0f, -1));
        p5 p5Var = new p5(context, 0);
        p5Var.f22890b = new RectF();
        this.h = p5Var;
        p5Var.setWillNotDraw(false);
        p5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        n5Var.addView(p5Var, w7.z5.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        p5Var.addView(imageView, w7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f23251f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        p5Var.addView(textView, w7.z5.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        vp vpVar = new vp(context, 24, g6Var);
        this.d = vpVar;
        vpVar.setDrawBackgroundAsArc(7);
        vpVar.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
        addView(vpVar, w7.z5.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        vpVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23250c = frameLayout;
        addView(frameLayout, w7.z5.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.f23257y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.f32005a.f24297q;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        float f7;
        float f10;
        this.d.f32005a.f(i10, z10, z11);
        boolean z12 = false;
        if (this.f23256x) {
            AnimatorSet animatorSet = this.J;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.J = null;
            }
            float f11 = 1.0f;
            n5 n5Var = this.f23249b;
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
                this.J.addListener(new ah.p0(24, this, z10));
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
            o5 o5Var = this.f23248a;
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
            vp vpVar = this.d;
            float f10 = 1.0f;
            if (vpVar.f32005a.f24297q) {
                f7 = 0.787f;
            } else {
                f7 = 1.0f;
            }
            n5 n5Var = this.f23249b;
            n5Var.setScaleX(f7);
            if (vpVar.f32005a.f24297q) {
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
        this.f23253r = z12;
        this.f23254s = z13;
        boolean z16 = photoEntry.isVideo;
        float f10 = 0.0f;
        ImageView imageView = this.e;
        TextView textView = this.f23251f;
        p5 p5Var = this.h;
        o5 o5Var = this.f23248a;
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
            o5Var.g(str, null, org.telegram.ui.ActionBar.k6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                o5Var.g(str2, null, org.telegram.ui.ActionBar.k6.R4);
            } else if (photoEntry2.path != null) {
                if (photoEntry2.isVideo && !photoEntry2.isLivePhoto()) {
                    o5Var.g("vthumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.k6.R4);
                } else {
                    MediaController.PhotoEntry photoEntry3 = this.G;
                    o5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                    o5Var.g("thumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.k6.R4);
                }
            } else {
                o5Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
            }
        }
        if (z11 && PhotoViewer.O1(this.G.path)) {
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

    public final void f(long j10, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (z10 == this.Q && j10 == this.P) {
            return;
        }
        this.P = j10;
        this.Q = z10;
        if (j10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (this.V == null) {
                this.V = new SpannableString("⭐");
                vq vqVar = new vq(R.drawable.star_small_inner, 0);
                vqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.V;
                spannableString.setSpan(vqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.V);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.W == null) {
                    this.W = new SpannableString("l");
                    vq vqVar2 = new vq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.W;
                    spannableString2.setSpan(vqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.W);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j10));
            }
        } else {
            spannableStringBuilder = null;
        }
        o5 o5Var = this.f23248a;
        o5Var.setBlurredText(spannableStringBuilder);
        o5Var.invalidate();
        this.f23249b.invalidate();
    }

    public final void g(boolean z10) {
        float f7;
        float f10 = 1.0f;
        vp vpVar = this.d;
        if (!z10 || vpVar.getAlpha() != 1.0f) {
            if (!z10 && vpVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f23252n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f23252n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23252n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f23252n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f23252n;
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
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(vpVar, property, f10));
            this.f23252n.addListener(new m.a(this, 13));
            this.f23252n.start();
        }
    }

    public vp getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f23250c;
    }

    public org.telegram.ui.Components.u9 getImageView() {
        return this.f23248a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.G;
    }

    public float getScale() {
        return this.f23249b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        o5 o5Var;
        n5 n5Var = this.f23249b;
        if (n5Var != null && (o5Var = this.f23248a) != null && o5Var.getMeasuredHeight() > 0 && o5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.M == null) {
                    this.M = wh.f.e(n5Var);
                    return;
                }
                return;
            }
            wh.f fVar = this.M;
            if (fVar != null) {
                fVar.b(this);
                this.M = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wh.f fVar = this.M;
        if (fVar != null) {
            if (fVar.f49492i) {
                this.M = wh.f.e(this);
            } else {
                fVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wh.f fVar = this.M;
        if (fVar != null) {
            fVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.f32005a.f24297q;
        o5 o5Var = this.f23248a;
        if (!z10 && this.f23249b.getScaleX() == 1.0f && o5Var.getImageReceiver().hasNotThumb() && o5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.G) == null || !PhotoViewer.O1(photoEntry.path)) && ((searchImage = this.H) == null || !PhotoViewer.O1(searchImage.getPathToAttach())))) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.X9, this.K);
        Paint paint = this.I;
        paint.setColor(w02);
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
                b1.o(R.string.AttachVideo, ", ", sb3);
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
        if (this.d.f32005a.f24297q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f23256x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f23257y, 1073741824), tl.C(2.0f, this.f23257y, 1073741824));
            return;
        }
        int i12 = 6;
        if (this.E) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824);
            if (this.f23253r) {
                i12 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824));
            return;
        }
        if (this.f23253r) {
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
        this.f23255w = r5Var;
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
                ImageView imageView = this.e;
                p5 p5Var = this.h;
                TextView textView = this.f23251f;
                if (z12 && !photoEntry.isLivePhoto()) {
                    this.f23248a.q(0, true);
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
        this.f23257y = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23249b.getLayoutParams();
        int i11 = this.f23257y;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f23250c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        vp vpVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) vpVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        vpVar.setDrawBackgroundAsArc(6);
        this.f23256x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f23250c.setOnClickListener(onClickListener);
    }
}
