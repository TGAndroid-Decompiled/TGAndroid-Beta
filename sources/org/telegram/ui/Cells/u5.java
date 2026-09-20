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
import org.telegram.messenger.rk;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oq;
import org.telegram.ui.PhotoViewer;
public final class u5 extends FrameLayout {
    public static final Rect f21606a0 = new Rect();
    public boolean E;
    public final boolean F;
    public MediaController.PhotoEntry G;
    public MediaController.SearchImage H;
    public final Paint I;
    public AnimatorSet J;
    public final org.telegram.ui.ActionBar.f6 K;
    public vh.h L;
    public vh.g M;
    public boolean N;
    public boolean O;
    public long P;
    public boolean Q;
    public Bitmap R;
    public Float S;
    public float T;
    public s5 U;
    public SpannableString V;
    public SpannableString W;
    public final q5 f21607a;
    public final p5 f21608b;
    public final FrameLayout f21609c;
    public final np d;
    public final ImageView e;
    public final TextView f21610f;
    public final r5 h;
    public AnimatorSet f21611n;
    public boolean f21612r;
    public boolean f21613s;
    public boolean v;
    public t5 f21614w;
    public boolean f21615x;
    public int f21616y;

    public u5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.F = true;
        this.I = new Paint();
        new Path();
        this.T = 1.0f;
        this.K = f6Var;
        setWillNotDraw(false);
        p5 p5Var = new p5(this, context);
        this.f21608b = p5Var;
        addView(p5Var, w7.y5.c(80.0f, 80));
        q5 q5Var = new q5(this, context);
        this.f21607a = q5Var;
        q5Var.setBlurAllowed(true);
        p5Var.addView(q5Var, w7.y5.c(-1.0f, -1));
        r5 r5Var = new r5(context, 0);
        r5Var.f20880b = new RectF();
        this.h = r5Var;
        r5Var.setWillNotDraw(false);
        r5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        p5Var.addView(r5Var, w7.y5.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.play_mini_video);
        r5Var.addView(imageView, w7.y5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.f21610f = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        r5Var.addView(textView, w7.y5.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        np npVar = new np(context, 24, f6Var);
        this.d = npVar;
        npVar.setDrawBackgroundAsArc(7);
        npVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        addView(npVar, w7.y5.d(26, 26.0f, 51, 52.0f, 4.0f, 0.0f, 0.0f));
        npVar.setVisibility(0);
        setFocusable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21609c = frameLayout;
        addView(frameLayout, w7.y5.d(42, 42.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        this.f21616y = AndroidUtilities.dp(80.0f);
    }

    public final boolean a() {
        return this.d.f26710a.f22193q;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        float f7;
        float f10;
        this.d.f26710a.f(i10, z10, z11);
        boolean z12 = false;
        if (this.f21615x) {
            AnimatorSet animatorSet = this.J;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.J = null;
            }
            float f11 = 1.0f;
            p5 p5Var = this.f21608b;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.J = animatorSet2;
                if (z10) {
                    f10 = 0.787f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p5Var, View.SCALE_X, f10);
                if (z10) {
                    f11 = 0.787f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(p5Var, View.SCALE_Y, f11));
                this.J.setDuration(200L);
                this.J.addListener(new ai.n(23, this, z10));
                this.J.start();
            } else {
                if (z10) {
                    f7 = 0.787f;
                } else {
                    f7 = 1.0f;
                }
                p5Var.setScaleX(f7);
                if (z10) {
                    f11 = 0.787f;
                }
                p5Var.setScaleY(f11);
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
            q5 q5Var = this.f21607a;
            if (isLaidOut) {
                Bitmap bitmap = this.R;
                this.R = AndroidUtilities.snapshotView(q5Var);
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
            q5Var.setHasBlur(z10);
            q5Var.invalidate();
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
            np npVar = this.d;
            float f10 = 1.0f;
            if (npVar.f26710a.f22193q) {
                f7 = 0.787f;
            } else {
                f7 = 1.0f;
            }
            p5 p5Var = this.f21608b;
            p5Var.setScaleX(f7);
            if (npVar.f26710a.f22193q) {
                f10 = 0.787f;
            }
            p5Var.setScaleY(f10);
        }
    }

    public final void d(MediaController.PhotoEntry photoEntry, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float f7;
        boolean z15 = false;
        this.v = false;
        this.G = photoEntry;
        this.f21612r = z12;
        this.f21613s = z13;
        boolean z16 = photoEntry.isVideo;
        float f10 = 0.0f;
        ImageView imageView = this.e;
        TextView textView = this.f21610f;
        r5 r5Var = this.h;
        q5 q5Var = this.f21607a;
        if (z16 && !photoEntry.isLivePhoto()) {
            q5Var.q(0, true);
            r5Var.setVisibility(0);
            imageView.setVisibility(0);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
            textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
        } else if (this.G.isHighQuality() && a()) {
            r5Var.setVisibility(0);
            imageView.setVisibility(8);
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
            textView.setText(LocaleController.getString(R.string.ShortHighQuality));
        } else {
            imageView.setVisibility(8);
            r5Var.setVisibility(4);
        }
        MediaController.PhotoEntry photoEntry2 = this.G;
        String str = photoEntry2.coverPath;
        if (str != null) {
            q5Var.f(str, null, org.telegram.ui.ActionBar.j6.R4);
        } else {
            String str2 = photoEntry2.thumbPath;
            if (str2 != null) {
                q5Var.f(str2, null, org.telegram.ui.ActionBar.j6.R4);
            } else if (photoEntry2.path != null) {
                if (photoEntry2.isVideo && !photoEntry2.isLivePhoto()) {
                    q5Var.f("vthumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    MediaController.PhotoEntry photoEntry3 = this.G;
                    q5Var.p(photoEntry3.orientation, photoEntry3.invert, true);
                    q5Var.f("thumb://" + this.G.imageId + ":" + this.G.path, null, org.telegram.ui.ActionBar.j6.R4);
                }
            } else {
                q5Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            }
        }
        if (z11 && PhotoViewer.L1(this.G.path)) {
            z14 = true;
        } else {
            z14 = false;
        }
        q5Var.getImageReceiver().setVisible(!z14, true);
        if (z14) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.d.setAlpha(f7);
        if (!z14) {
            f10 = 1.0f;
        }
        r5Var.setAlpha(f10);
        requestLayout();
        setHasSpoiler(photoEntry.hasSpoiler);
        if (photoEntry.isHighQuality() && a()) {
            z15 = true;
        }
        setHighQuality(z15);
        f(photoEntry.starsAmount, z10);
    }

    public final void e(org.telegram.messenger.MediaController.SearchImage r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u5.e(org.telegram.messenger.MediaController$SearchImage):void");
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
                oq oqVar = new oq(R.drawable.star_small_inner, 0);
                oqVar.setScale(0.7f, 0.7f);
                SpannableString spannableString = this.V;
                spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) this.V);
            spannableStringBuilder.append((CharSequence) "\u2009");
            if (z10) {
                if (this.W == null) {
                    this.W = new SpannableString("l");
                    oq oqVar2 = new oq(R.drawable.msg_mini_lock2, 0);
                    SpannableString spannableString2 = this.W;
                    spannableString2.setSpan(oqVar2, 0, spannableString2.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) this.W);
            } else {
                spannableStringBuilder.append((CharSequence) Long.toString(j3));
            }
        } else {
            spannableStringBuilder = null;
        }
        q5 q5Var = this.f21607a;
        q5Var.setBlurredText(spannableStringBuilder);
        q5Var.invalidate();
        this.f21608b.invalidate();
    }

    public final void g(boolean z10) {
        float f7;
        float f10 = 1.0f;
        np npVar = this.d;
        if (!z10 || npVar.getAlpha() != 1.0f) {
            if (!z10 && npVar.getAlpha() == 0.0f) {
                return;
            }
            AnimatorSet animatorSet = this.f21611n;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f21611n = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f21611n = animatorSet2;
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            this.f21611n.setDuration(180L);
            AnimatorSet animatorSet3 = this.f21611n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            r5 r5Var = this.h;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r5Var, property, fArr);
            if (!z10) {
                f10 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(npVar, property, f10));
            this.f21611n.addListener(new org.telegram.ui.t4(this, 8));
            this.f21611n.start();
        }
    }

    public np getCheckBox() {
        return this.d;
    }

    public FrameLayout getCheckFrame() {
        return this.f21609c;
    }

    public org.telegram.ui.Components.v9 getImageView() {
        return this.f21607a;
    }

    public MediaController.PhotoEntry getPhotoEntry() {
        return this.G;
    }

    public float getScale() {
        return this.f21608b.getScaleX();
    }

    public View getVideoInfoContainer() {
        return this.h;
    }

    public final void h(boolean z10) {
        q5 q5Var;
        p5 p5Var = this.f21608b;
        if (p5Var != null && (q5Var = this.f21607a) != null && q5Var.getMeasuredHeight() > 0 && q5Var.getMeasuredWidth() > 0) {
            if (z10) {
                if (this.M == null) {
                    this.M = vh.g.e(p5Var);
                    return;
                }
                return;
            }
            vh.g gVar = this.M;
            if (gVar != null) {
                gVar.b(this);
                this.M = null;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vh.g gVar = this.M;
        if (gVar != null) {
            if (gVar.f44696i) {
                this.M = vh.g.e(this);
            } else {
                gVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vh.g gVar = this.M;
        if (gVar != null) {
            gVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        MediaController.PhotoEntry photoEntry;
        MediaController.SearchImage searchImage;
        boolean z10 = this.d.f26710a.f22193q;
        q5 q5Var = this.f21607a;
        if (!z10 && this.f21608b.getScaleX() == 1.0f && q5Var.getImageReceiver().hasNotThumb() && q5Var.getImageReceiver().getCurrentAlpha() == 1.0f && (((photoEntry = this.G) == null || !PhotoViewer.L1(photoEntry.path)) && ((searchImage = this.H) == null || !PhotoViewer.L1(searchImage.getPathToAttach())))) {
            return;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.X9, this.K);
        Paint paint = this.I;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, q5Var.getMeasuredWidth(), q5Var.getMeasuredHeight(), paint);
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
                c1.o(R.string.AttachVideo, ", ", sb3);
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
        if (this.d.f26710a.f22193q) {
            accessibilityNodeInfo.setSelected(true);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_photo, LocaleController.getString(R.string.Open)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f21615x) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f21616y, 1073741824), rk.C(2.0f, this.f21616y, 1073741824));
            return;
        }
        int i12 = 6;
        if (this.E) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824);
            if (this.f21612r) {
                i12 = 0;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824));
            return;
        }
        if (this.f21612r) {
            i12 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 80), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u5.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void setDelegate(t5 t5Var) {
        this.f21614w = t5Var;
    }

    public void setFastScrollDelegate(s5 s5Var) {
        this.U = s5Var;
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
                r5 r5Var = this.h;
                TextView textView = this.f21610f;
                if (z12 && !photoEntry.isLivePhoto()) {
                    this.f21607a.q(0, true);
                    r5Var.setVisibility(0);
                    imageView.setVisibility(0);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(13.0f);
                    textView.setText(AndroidUtilities.formatShortDuration(this.G.duration));
                } else if (this.G.isHighQuality()) {
                    r5Var.setVisibility(0);
                    imageView.setVisibility(8);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(0.0f);
                    textView.setText(LocaleController.getString(R.string.ShortHighQuality));
                } else {
                    imageView.setVisibility(8);
                    r5Var.setVisibility(4);
                }
            }
        }
    }

    public void setIsVertical(boolean z10) {
        this.E = z10;
    }

    public void setItemSize(int i10) {
        this.f21616y = i10;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f21608b.getLayoutParams();
        int i11 = this.f21616y;
        layoutParams.height = i11;
        layoutParams.width = i11;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f21609c.getLayoutParams();
        layoutParams2.gravity = 53;
        layoutParams2.leftMargin = 0;
        np npVar = this.d;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) npVar.getLayoutParams();
        layoutParams3.gravity = 53;
        layoutParams3.leftMargin = 0;
        int dp = AndroidUtilities.dp(5.0f);
        layoutParams3.topMargin = dp;
        layoutParams3.rightMargin = dp;
        npVar.setDrawBackgroundAsArc(6);
        this.f21615x = true;
    }

    public void setNum(int i10) {
        this.d.setNum(i10);
    }

    public void setOnCheckClickListener(View.OnClickListener onClickListener) {
        this.f21609c.setOnClickListener(onClickListener);
    }
}
