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
import org.telegram.messenger.bi;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.PhotoViewer;
public final class t5 extends FrameLayout {
    public static final Rect f23051a0 = new Rect();
    public boolean E;
    public final boolean F;
    public MediaController.PhotoEntry G;
    public MediaController.SearchImage H;
    public final Paint I;
    public AnimatorSet J;
    public final org.telegram.ui.ActionBar.e6 K;
    public vh.g L;
    public vh.f M;
    public boolean N;
    public boolean O;
    public long P;
    public boolean Q;
    public Bitmap R;
    public Float S;
    public float T;
    public r5 U;
    public SpannableString V;
    public SpannableString W;
    public final p5 f23052a;
    public final o5 f23053b;
    public final FrameLayout f23054c;
    public final dq d;
    public final ImageView f23055e;
    public final TextView f23056f;
    public final q5 h;
    public AnimatorSet f23057n;
    public boolean f23058r;
    public boolean f23059s;
    public boolean v;
    public s5 f23060w;
    public boolean f23061x;
    public int f23062y;

    public t5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.F = true;
        this.I = new Paint();
        new Path();
        this.T = 1.0f;
        this.K = e6Var;
        setWillNotDraw(false);
        o5 o5Var = new o5(this, context);
        this.f23053b = o5Var;
        addView(o5Var, w7.x5.d(80.0f, 80));
        p5 p5Var = new p5(this, context);
        this.f23052a = p5Var;
        p5Var.setBlurAllowed(true);
        o5Var.addView(p5Var, w7.x5.d(-1.0f, -1));
        q5 q5Var = new q5(context, 0);
        q5Var.f22690b = new RectF();
        this.h = q5Var;
        q5Var.setWillNotDraw(false);
        q5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        o5Var.addView(q5Var, w7.x5.a(17.0f, 4.0f, 0.0f, 0.0f, 4.0f, -2, 83));
        ImageView imageView = new ImageView(context);
        this.f23055e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        q5Var.addView(imageView, w7.x5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f23056f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        q5Var.addView(textView, w7.x5.a(-2.0f, 13.0f, -0.7f, 0.0f, 0.0f, -2, 19));
        dq dqVar = new dq(context, 24, e6Var);
        this.d = dqVar;
        dqVar.setDrawBackgroundAsArc(7);
        dqVar.b(org.telegram.ui.ActionBar.i6.W9, org.telegram.ui.ActionBar.i6.X9, org.telegram.ui.ActionBar.i6.V9);
        addView(dqVar, w7.x5.a(26.0f, 52.0f, 4.0f, 0.0f, 0.0f, 26, 51));
        dqVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23054c = frameLayout;
        addView(frameLayout, w7.x5.a(42.0f, 38.0f, 0.0f, 0.0f, 0.0f, 42, 51));
        this.f23062y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.f25781a.f24101q;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        float f7;
        float f10;
        this.d.f25781a.f(i10, z10, z11);
        boolean z12 = false;
        if (this.f23061x) {
            AnimatorSet animatorSet = this.J;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.J = null;
            }
            float f11 = 1.0f;
            o5 o5Var = this.f23053b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.J = animatorSet2;
                if (z10) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o5Var, View.SCALE_X, f10);
                if (z10) {
                    f11 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(o5Var, View.SCALE_Y, f11));
                this.J.setDuration(200L);
                this.J.addListener(new ai.n(23, this, z10));
                this.J.start();
            } else {
                if (z10) {
                    f7 = 0.787f;
                } else {
                    f7 = 1.0f;
                }
                o5Var.setScaleX(f7);
                if (z10) {
                    f11 = 0.787f;
                }
                o5Var.setScaleY(f11);
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
            p5 p5Var = this.f23052a;
            if (isLaidOut) {
                Bitmap bitmap = this.R;
                this.R = AndroidUtilities.snapshotView(p5Var);
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
            p5Var.setHasBlur(z10);
            p5Var.invalidate();
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
            dq dqVar = this.d;
            float f10 = 1.0f;
            if (dqVar.f25781a.f24101q) {
                f7 = 0.787f;
            } else {
                f7 = 1.0f;
            }
            o5 o5Var = this.f23053b;
            o5Var.setScaleX(f7);
            if (dqVar.f25781a.f24101q) {
                f10 = 0.787f;
            }
            o5Var.setScaleY(f10);
        }
    }

    public final void d(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float f7;
        boolean z15 = false;
        this.v = false;
        this.G = photoEntry;
        this.f23058r = z12;
        this.f23059s = z13;
        boolean z16 = photoEntry.isVideo;
        float f10 = 0.0f;
        ImageView imageView = this.f23055e;
        TextView textView = this.f23056f;
        q5 q5Var = this.h;
        p5 p5Var = this.f23052a;
        if (z16 && !photoEntry.isLivePhoto()) {
            p5Var.q(0, true);
            q5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
        } else if (this.G.isHighQuality() && a()) {
            q5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            q5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.G;
        String str = photoEntry2.coverPath;
        if (str != null) {
            p5Var.f(str, null, org.telegram.ui.ActionBar.i6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                p5Var.f(str2, null, org.telegram.ui.ActionBar.i6.R4);
            } else if (photoEntry2.path != null) {
                if (photoEntry2.isVideo && !photoEntry2.isLivePhoto()) {
                    p5Var.f("vthumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.i6.R4);
                } else {
                    MediaController.PhotoEntry photoEntry3 = this.G;
                    p5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                    p5Var.f("thumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.i6.R4);
                }
            } else {
                p5Var.setImageDrawable(org.telegram.ui.ActionBar.i6.R4);
            }
        }
        if (z11 && PhotoViewer.M1(this.G.path)) {
            z14 = true;
        } else {
            z14 = false;
        }
        p5Var.getImageReceiver().setVisible(!z14, true);
        if (z14) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.d.setAlpha(f7);
        if (!z14) {
            f10 = 1.0f;
        }
        q5Var.setAlpha(f10);
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
                er erVar = new er(R.drawable.star_small_inner, 0);
                erVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.V;
                spannableString.setSpan(erVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.V);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.W == null) {
                    this.W = new SpannableString("l");
                    er erVar2 = new er(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.W;
                    spannableString2.setSpan(erVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.W);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j3));
            }
        } else {
            spannableStringBuilder = null;
        }
        p5 p5Var = this.f23052a;
        p5Var.setBlurredText(spannableStringBuilder);
        p5Var.invalidate();
        this.f23053b.invalidate();
    }

    public final void g(boolean z10) {
        float f7;
        float f10 = 1.0f;
        dq dqVar = this.d;
        if (!z10 || dqVar.getAlpha() != 1.0f) {
            if (!z10 && dqVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f23057n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f23057n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23057n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f23057n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f23057n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            q5 q5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q5Var, property, fArr);
            if (!z10) {
                f10 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(dqVar, property, f10));
            this.f23057n.addListener(new org.telegram.ui.t4(this, 8));
            this.f23057n.start();
        }
    }

    public dq getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f23054c;
    }

    public org.telegram.ui.Components.y9 getImageView() {
        return this.f23052a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.G;
    }

    public float getScale() {
        return this.f23053b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        p5 p5Var;
        o5 o5Var = this.f23053b;
        if (o5Var != null && (p5Var = this.f23052a) != null && p5Var.getMeasuredHeight() > 0 && p5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.M == null) {
                    this.M = vh.f.e(o5Var);
                    return;
                }
                return;
            }
            vh.f fVar = this.M;
            if (fVar != null) {
                fVar.b(this);
                this.M = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vh.f fVar = this.M;
        if (fVar != null) {
            if (fVar.f49719i) {
                this.M = vh.f.e(this);
            } else {
                fVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vh.f fVar = this.M;
        if (fVar != null) {
            fVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.f25781a.f24101q;
        p5 p5Var = this.f23052a;
        if (!z10 && this.f23053b.getScaleX() == 1.0f && p5Var.getImageReceiver().hasNotThumb() && p5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.G) == null || !PhotoViewer.M1(photoEntry.path)) && ((searchImage = this.H) == null || !PhotoViewer.M1(searchImage.getPathToAttach())))) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.X9, this.K);
        Paint paint = this.I;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), paint);
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
                c1.l(R.string.AttachVideo, ", ", sb3);
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
        if (this.d.f25781a.f24101q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f23061x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f23062y, 1073741824), bi.C(2.0f, this.f23062y, 1073741824));
            return;
        }
        int i12 = 6;
        if (this.E) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824);
            if (this.f23058r) {
                i12 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824));
            return;
        }
        if (this.f23058r) {
            i12 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t5.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void setDelegate(s5 s5Var) {
        this.f23060w = s5Var;
    }

    public void setFastScrollDelegate(r5 r5Var) {
        this.U = r5Var;
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
                ImageView imageView = this.f23055e;
                q5 q5Var = this.h;
                TextView textView = this.f23056f;
                if (z12 && !photoEntry.isLivePhoto()) {
                    this.f23052a.q(0, true);
                    q5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
                } else if (this.G.isHighQuality()) {
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
        this.E = z10;
    }

    public void setItemSize(int i10) {
        this.f23062y = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23053b.getLayoutParams();
        int i11 = this.f23062y;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f23054c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        dq dqVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) dqVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        dqVar.setDrawBackgroundAsArc(6);
        this.f23061x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f23054c.setOnClickListener(onClickListener);
    }
}
