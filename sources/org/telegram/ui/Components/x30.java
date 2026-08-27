package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public class x30 extends FrameLayout {
    public long A;
    public final org.telegram.ui.ActionBar.c6 B;
    public boolean C;
    public boolean D;

    public final cg.q f34451a;

    public ImageView f34452b;

    public final ImageView f34453c;
    public org.telegram.ui.Cells.s1 d;

    public View f34454e;

    public AnimatorSet f34455f;
    public Runnable h;

    public final int f34456n;

    public final boolean f34457r;

    public String f34458s;
    public int v;

    public float f34459w;

    public float f34460x;

    public int f34461y;

    public x30(Context context, int i10) {
        this(i10, context, null, false);
    }

    public final void a() {
        this.f34451a.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.D = true;
        ImageView imageView = new ImageView(getContext());
        this.f34452b = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.f34452b.setScaleType(ImageView.ScaleType.CENTER);
        this.f34452b.setColorFilter(new PorterDuffColorFilter(i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23274pf, this.B), 125), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.f34452b;
        boolean z10 = this.f34457r;
        addView(imageView2, h7.z5.d(34, 34.0f, 21, 0.0f, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f));
        setOnClickListener(new f0(this, 26));
    }

    public final void b(boolean z10) {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.h;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.h = null;
        }
        AnimatorSet animatorSet = this.f34455f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f34455f = null;
        }
        if (!z10) {
            setVisibility(4);
            this.f34454e = null;
            this.d = null;
            this.f34455f = null;
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34455f = animatorSet2;
        boolean z11 = this.C;
        int i10 = 2;
        Property property = View.ALPHA;
        if (z11) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<x30, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, (Property<x30, Float>) View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, (Property<x30, Float>) View.SCALE_X, 1.0f, 0.5f));
            this.f34455f.setDuration(150L);
            this.f34455f.setInterpolator(er.f28122f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<x30, Float>) property, 0.0f));
            this.f34455f.setDuration(300L);
        }
        this.f34455f.addListener(new v30(this, i10));
        this.f34455f.start();
    }

    public int c() {
        return 0;
    }

    public final void d() {
        cg.q qVar = this.f34451a;
        qVar.setTextColor(-1);
        this.f34453c.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        int i10 = this.f34456n;
        qVar.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp((i10 == 7 || i10 == 8) ? 6.0f : 3.0f), -366530760));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e(org.telegram.ui.Cells.s1 s1Var, Integer num, int i10, int i11, boolean z10) {
        float f10;
        int imageY;
        int iDp;
        int forwardNameCenterX;
        int measuredWidth;
        int left;
        int iDp2;
        ImageView imageView;
        float measuredWidth2;
        AnimatorSet animatorSet;
        int i12 = 0;
        int i13 = this.f34456n;
        if ((i13 != 5 || i11 != this.v || this.d != s1Var) && (i13 == 5 || ((i13 != 0 || getTag() == null) && this.d != s1Var))) {
            Runnable runnable = this.h;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.h = null;
            }
            int[] iArr = new int[2];
            s1Var.getLocationInWindow(iArr);
            int i14 = iArr[1];
            ((View) getParent()).getLocationInWindow(iArr);
            int i15 = i14 - iArr[1];
            View view = (View) s1Var.getParent();
            boolean z11 = this.f34457r;
            if (i13 != 0) {
                f10 = 10.0f;
                cg.q qVar = this.f34451a;
                if (i13 == 5) {
                    imageY = i15 + i11;
                    this.v = i11;
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (messageObject != null && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(messageObject);
                        if (MessageObject.isVoted(tL_messageMediaPoll) && !MessageObject.isVoteResultsIsNotEmpty(tL_messageMediaPoll)) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            if (!poll.closed && poll.hide_results_until_close) {
                                qVar.setText(LocaleController.getString(R.string.PollResultsWillLater));
                            } else if (num.intValue() == -1) {
                                qVar.setText(LocaleController.getString(R.string.PollSelectOption));
                            }
                        } else if (num.intValue() == -1) {
                            qVar.setText(LocaleController.getString(R.string.PollSelectOption));
                        }
                    } else if (num.intValue() == -1) {
                        qVar.setText(LocaleController.getString(R.string.PollSelectOption));
                    }
                    measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                    forwardNameCenterX = i10;
                    measuredWidth = view.getMeasuredWidth();
                    if (z11) {
                        float f11 = this.f34460x;
                        float fDp = AndroidUtilities.dp(44.0f);
                        this.f34459w = fDp;
                        setTranslationY(f11 + fDp);
                    } else {
                        float f12 = this.f34460x;
                        float measuredHeight = imageY - getMeasuredHeight();
                        this.f34459w = measuredHeight;
                        setTranslationY(f12 + measuredHeight);
                    }
                    left = s1Var.getLeft() + forwardNameCenterX;
                    iDp2 = AndroidUtilities.dp(19.0f);
                    if (i13 == 5) {
                        int iD = i0.a.d(19.1f, forwardNameCenterX - (getMeasuredWidth() / 2), 0);
                        setTranslationX(iD);
                        iDp2 += iD;
                    } else if (left > view.getMeasuredWidth() / 2) {
                        int measuredWidth3 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.dp(38.0f);
                        setTranslationX(measuredWidth3);
                        iDp2 += measuredWidth3;
                    } else {
                        setTranslationX(0.0f);
                    }
                    int left2 = (s1Var.getLeft() + forwardNameCenterX) - iDp2;
                    imageView = this.f34453c;
                    measuredWidth2 = left2 - (imageView.getMeasuredWidth() / 2);
                    imageView.setTranslationX(measuredWidth2);
                    if (left > view.getMeasuredWidth() / 2) {
                        if (measuredWidth2 < AndroidUtilities.dp(f10)) {
                            float fDp2 = measuredWidth2 - AndroidUtilities.dp(f10);
                            setTranslationX(getTranslationX() + fDp2);
                            imageView.setTranslationX(measuredWidth2 - fDp2);
                        }
                    } else if (measuredWidth2 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                        float measuredWidth4 = (measuredWidth2 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                        setTranslationX(measuredWidth4);
                        imageView.setTranslationX(measuredWidth2 - measuredWidth4);
                    } else if (measuredWidth2 < AndroidUtilities.dp(f10)) {
                        float fDp3 = measuredWidth2 - AndroidUtilities.dp(f10);
                        setTranslationX(getTranslationX() + fDp3);
                        imageView.setTranslationX(measuredWidth2 - fDp3);
                    }
                    this.d = s1Var;
                    animatorSet = this.f34455f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f34455f = null;
                    }
                    setTag(1);
                    setVisibility(0);
                    if (z10) {
                        setAlpha(1.0f);
                        return true;
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.f34455f = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<x30, Float>) View.ALPHA, 0.0f, 1.0f));
                    this.f34455f.addListener(new v30(this, i12));
                    this.f34455f.setDuration(300L);
                    this.f34455f.start();
                    return true;
                }
                MessageObject messageObject2 = s1Var.getMessageObject();
                String str = this.f34458s;
                if (str == null) {
                    qVar.setText(LocaleController.getString(R.string.HidAccount));
                } else {
                    qVar.setText(str);
                }
                measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                TLRPC.User currentUser = s1Var.getCurrentUser();
                if (currentUser == null || currentUser.f22527id != 0) {
                    int iDp3 = AndroidUtilities.dp(22.0f) + i15;
                    if (messageObject2.isOutOwner() || !s1Var.Va || s1Var.Ga == null) {
                        imageY = iDp3;
                    } else {
                        iDp = AndroidUtilities.dp(20.0f) + iDp3;
                    }
                    if (!z11 || imageY > AndroidUtilities.dp(10.0f) + getMeasuredHeight()) {
                        forwardNameCenterX = s1Var.getForwardNameCenterX();
                        measuredWidth = view.getMeasuredWidth();
                        if (z11) {
                            float f13 = this.f34460x;
                            float fDp4 = AndroidUtilities.dp(44.0f);
                            this.f34459w = fDp4;
                            setTranslationY(f13 + fDp4);
                        } else {
                            float f14 = this.f34460x;
                            float measuredHeight2 = imageY - getMeasuredHeight();
                            this.f34459w = measuredHeight2;
                            setTranslationY(f14 + measuredHeight2);
                        }
                        left = s1Var.getLeft() + forwardNameCenterX;
                        iDp2 = AndroidUtilities.dp(19.0f);
                        if (i13 == 5) {
                            int iD2 = i0.a.d(19.1f, forwardNameCenterX - (getMeasuredWidth() / 2), 0);
                            setTranslationX(iD2);
                            iDp2 += iD2;
                        } else if (left > view.getMeasuredWidth() / 2) {
                            int measuredWidth5 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.dp(38.0f);
                            setTranslationX(measuredWidth5);
                            iDp2 += measuredWidth5;
                        } else {
                            setTranslationX(0.0f);
                        }
                        int left3 = (s1Var.getLeft() + forwardNameCenterX) - iDp2;
                        imageView = this.f34453c;
                        measuredWidth2 = left3 - (imageView.getMeasuredWidth() / 2);
                        imageView.setTranslationX(measuredWidth2);
                        if (left > view.getMeasuredWidth() / 2) {
                            if (measuredWidth2 < AndroidUtilities.dp(f10)) {
                                float fDp5 = measuredWidth2 - AndroidUtilities.dp(f10);
                                setTranslationX(getTranslationX() + fDp5);
                                imageView.setTranslationX(measuredWidth2 - fDp5);
                            }
                        } else if (measuredWidth2 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                            float measuredWidth6 = (measuredWidth2 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                            setTranslationX(measuredWidth6);
                            imageView.setTranslationX(measuredWidth2 - measuredWidth6);
                        } else if (measuredWidth2 < AndroidUtilities.dp(f10)) {
                            float fDp6 = measuredWidth2 - AndroidUtilities.dp(f10);
                            setTranslationX(getTranslationX() + fDp6);
                            imageView.setTranslationX(measuredWidth2 - fDp6);
                        }
                        this.d = s1Var;
                        animatorSet = this.f34455f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f34455f = null;
                        }
                        setTag(1);
                        setVisibility(0);
                        if (z10) {
                            setAlpha(1.0f);
                            return true;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.f34455f = animatorSet3;
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<x30, Float>) View.ALPHA, 0.0f, 1.0f));
                        this.f34455f.addListener(new v30(this, i12));
                        this.f34455f.setDuration(300L);
                        this.f34455f.start();
                        return true;
                    }
                } else {
                    iDp = org.telegram.messenger.rl.C(50.0f, s1Var.getMeasuredHeight() - Math.max(0, s1Var.getBottom() - view.getMeasuredHeight()), i15);
                }
                imageY = iDp;
                if (!z11) {
                }
                forwardNameCenterX = s1Var.getForwardNameCenterX();
                measuredWidth = view.getMeasuredWidth();
                if (z11) {
                    float f15 = this.f34460x;
                    float fDp7 = AndroidUtilities.dp(44.0f);
                    this.f34459w = fDp7;
                    setTranslationY(f15 + fDp7);
                } else {
                    float f16 = this.f34460x;
                    float measuredHeight3 = imageY - getMeasuredHeight();
                    this.f34459w = measuredHeight3;
                    setTranslationY(f16 + measuredHeight3);
                }
                left = s1Var.getLeft() + forwardNameCenterX;
                iDp2 = AndroidUtilities.dp(19.0f);
                if (i13 == 5) {
                    int iD3 = i0.a.d(19.1f, forwardNameCenterX - (getMeasuredWidth() / 2), 0);
                    setTranslationX(iD3);
                    iDp2 += iD3;
                } else if (left > view.getMeasuredWidth() / 2) {
                    int measuredWidth7 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.dp(38.0f);
                    setTranslationX(measuredWidth7);
                    iDp2 += measuredWidth7;
                } else {
                    setTranslationX(0.0f);
                }
                int left4 = (s1Var.getLeft() + forwardNameCenterX) - iDp2;
                imageView = this.f34453c;
                measuredWidth2 = left4 - (imageView.getMeasuredWidth() / 2);
                imageView.setTranslationX(measuredWidth2);
                if (left > view.getMeasuredWidth() / 2) {
                    if (measuredWidth2 < AndroidUtilities.dp(f10)) {
                        float fDp8 = measuredWidth2 - AndroidUtilities.dp(f10);
                        setTranslationX(getTranslationX() + fDp8);
                        imageView.setTranslationX(measuredWidth2 - fDp8);
                    }
                } else if (measuredWidth2 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                    float measuredWidth8 = (measuredWidth2 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                    setTranslationX(measuredWidth8);
                    imageView.setTranslationX(measuredWidth2 - measuredWidth8);
                } else if (measuredWidth2 < AndroidUtilities.dp(f10)) {
                    float fDp9 = measuredWidth2 - AndroidUtilities.dp(f10);
                    setTranslationX(getTranslationX() + fDp9);
                    imageView.setTranslationX(measuredWidth2 - fDp9);
                }
                this.d = s1Var;
                animatorSet = this.f34455f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f34455f = null;
                }
                setTag(1);
                setVisibility(0);
                if (z10) {
                    setAlpha(1.0f);
                    return true;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f34455f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, (Property<x30, Float>) View.ALPHA, 0.0f, 1.0f));
                this.f34455f.addListener(new v30(this, i12));
                this.f34455f.setDuration(300L);
                this.f34455f.start();
                return true;
            }
            ImageReceiver photoImage = s1Var.getPhotoImage();
            imageY = (int) (photoImage.getImageY() + i15);
            int imageHeight = (int) photoImage.getImageHeight();
            int i16 = imageY + imageHeight;
            int measuredHeight4 = view.getMeasuredHeight();
            f10 = 10.0f;
            if (imageY > AndroidUtilities.dp(10.0f) + getMeasuredHeight() && i16 <= (imageHeight / 4) + measuredHeight4) {
                forwardNameCenterX = s1Var.getNoSoundIconCenterX();
                measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                measuredWidth = view.getMeasuredWidth();
                if (z11) {
                    float f17 = this.f34460x;
                    float fDp10 = AndroidUtilities.dp(44.0f);
                    this.f34459w = fDp10;
                    setTranslationY(f17 + fDp10);
                } else {
                    float f18 = this.f34460x;
                    float measuredHeight5 = imageY - getMeasuredHeight();
                    this.f34459w = measuredHeight5;
                    setTranslationY(f18 + measuredHeight5);
                }
                left = s1Var.getLeft() + forwardNameCenterX;
                iDp2 = AndroidUtilities.dp(19.0f);
                if (i13 == 5) {
                    int iD4 = i0.a.d(19.1f, forwardNameCenterX - (getMeasuredWidth() / 2), 0);
                    setTranslationX(iD4);
                    iDp2 += iD4;
                } else if (left > view.getMeasuredWidth() / 2) {
                    int measuredWidth9 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.dp(38.0f);
                    setTranslationX(measuredWidth9);
                    iDp2 += measuredWidth9;
                } else {
                    setTranslationX(0.0f);
                }
                int left5 = (s1Var.getLeft() + forwardNameCenterX) - iDp2;
                imageView = this.f34453c;
                measuredWidth2 = left5 - (imageView.getMeasuredWidth() / 2);
                imageView.setTranslationX(measuredWidth2);
                if (left > view.getMeasuredWidth() / 2) {
                    if (measuredWidth2 < AndroidUtilities.dp(f10)) {
                        float fDp11 = measuredWidth2 - AndroidUtilities.dp(f10);
                        setTranslationX(getTranslationX() + fDp11);
                        imageView.setTranslationX(measuredWidth2 - fDp11);
                    }
                } else if (measuredWidth2 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                    float measuredWidth10 = (measuredWidth2 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                    setTranslationX(measuredWidth10);
                    imageView.setTranslationX(measuredWidth2 - measuredWidth10);
                } else if (measuredWidth2 < AndroidUtilities.dp(f10)) {
                    float fDp12 = measuredWidth2 - AndroidUtilities.dp(f10);
                    setTranslationX(getTranslationX() + fDp12);
                    imageView.setTranslationX(measuredWidth2 - fDp12);
                }
                this.d = s1Var;
                animatorSet = this.f34455f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f34455f = null;
                }
                setTag(1);
                setVisibility(0);
                if (z10) {
                    setAlpha(1.0f);
                    return true;
                }
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f34455f = animatorSet5;
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this, (Property<x30, Float>) View.ALPHA, 0.0f, 1.0f));
                this.f34455f.addListener(new v30(this, i12));
                this.f34455f.setDuration(300L);
                this.f34455f.start();
                return true;
            }
        }
        return false;
    }

    public final void f(View view, boolean z10) {
        if (this.f34454e == view || getTag() != null) {
            if (getTag() != null) {
                g(view);
                return;
            }
            return;
        }
        Runnable runnable = this.h;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.h = null;
        }
        g(view);
        this.f34454e = view;
        AnimatorSet animatorSet = this.f34455f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f34455f = null;
        }
        int i10 = 1;
        setTag(1);
        setVisibility(0);
        if (!z10) {
            setAlpha(1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34455f = animatorSet2;
        boolean z11 = this.C;
        Property property = View.ALPHA;
        if (z11) {
            ImageView imageView = this.f34453c;
            setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
            setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
            this.f34455f.playTogether(ObjectAnimator.ofFloat(this, (Property<x30, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, (Property<x30, Float>) View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, (Property<x30, Float>) View.SCALE_X, 0.5f, 1.0f));
            this.f34455f.setDuration(350L);
            this.f34455f.setInterpolator(er.h);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<x30, Float>) property, 0.0f, 1.0f));
            this.f34455f.setDuration(300L);
        }
        this.f34455f.addListener(new v30(this, i10));
        this.f34455f.start();
    }

    public final void g(View view) {
        int measuredWidth;
        int i10;
        int i11;
        int measuredWidth2;
        measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int iDp = iArr[1] - AndroidUtilities.dp(4.0f);
        boolean z10 = this.f34457r;
        int i12 = this.f34456n;
        if (i12 == 4) {
            iDp += AndroidUtilities.dp(4.0f);
        } else if (i12 == 6 && z10) {
            iDp = org.telegram.messenger.y1.C(10.0f, getMeasuredHeight() + view.getMeasuredHeight(), iDp);
        } else if (i12 == 7 || (i12 == 8 && z10)) {
            iDp = org.telegram.messenger.y1.C(8.0f, getMeasuredHeight() + view.getMeasuredHeight(), iDp);
        } else if (i12 == 8) {
            iDp -= AndroidUtilities.dp(10.0f);
        }
        int measuredWidth3 = 0;
        if (i12 != 8 || !z10) {
            measuredWidth = i12 == 3 ? iArr[0] : (view.getMeasuredWidth() / 2) + iArr[0];
        } else if (view instanceof org.telegram.ui.ActionBar.h5) {
            org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) view;
            Drawable rightDrawable = h5Var.getRightDrawable();
            measuredWidth = (iArr[0] + (rightDrawable != null ? rightDrawable.getBounds().centerX() : h5Var.getTextWidth() / 2)) - AndroidUtilities.dp(8.0f);
        } else {
            measuredWidth = view instanceof TextView ? (((TextView) view).getMeasuredWidth() + iArr[0]) - AndroidUtilities.dp(16.5f) : iArr[0];
        }
        View view2 = (View) getParent();
        view2.getLocationInWindow(iArr);
        int i13 = measuredWidth - iArr[0];
        int i14 = (iDp - iArr[1]) - this.f34461y;
        int iC = c() + i13;
        int measuredWidth4 = view2.getMeasuredWidth();
        if (!z10 || i12 == 6 || i12 == 7 || i12 == 8) {
            float f10 = this.f34460x;
            float measuredHeight = i14 - getMeasuredHeight();
            this.f34459w = measuredHeight;
            setTranslationY(f10 + measuredHeight);
        } else {
            float f11 = this.f34460x;
            float fDp = AndroidUtilities.dp(44.0f);
            this.f34459w = fDp;
            setTranslationY(f11 + fDp);
        }
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            i10 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).rightMargin;
        } else {
            i10 = 0;
            i11 = 0;
        }
        ImageView imageView = this.f34453c;
        if (i12 == 8 && !z10) {
            measuredWidth3 = (((measuredWidth4 - i10) - i11) - getMeasuredWidth()) / 2;
        } else if (iC > view2.getMeasuredWidth() / 2) {
            if (i12 == 3) {
                measuredWidth2 = (int) (measuredWidth4 - (getMeasuredWidth() * 1.5f));
                if (measuredWidth2 >= 0) {
                    measuredWidth3 = measuredWidth2;
                }
            } else {
                measuredWidth3 = (measuredWidth4 - getMeasuredWidth()) - (i11 + i10);
            }
        } else if (i12 == 3 && (measuredWidth2 = (iC - (getMeasuredWidth() / 2)) - imageView.getMeasuredWidth()) >= 0) {
            measuredWidth3 = measuredWidth2;
        }
        setTranslationX(measuredWidth3);
        float measuredWidth5 = (iC - (i10 + measuredWidth3)) - (imageView.getMeasuredWidth() / 2.0f);
        if (i12 == 7) {
            measuredWidth5 += AndroidUtilities.dp(2.0f);
        }
        imageView.setTranslationX(measuredWidth5);
        if (iC > view2.getMeasuredWidth() / 2) {
            if (measuredWidth5 < AndroidUtilities.dp(10.0f)) {
                float fDp2 = measuredWidth5 - AndroidUtilities.dp(10.0f);
                setTranslationX(getTranslationX() + fDp2);
                imageView.setTranslationX(measuredWidth5 - fDp2);
                return;
            }
            return;
        }
        if (measuredWidth5 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
            float measuredWidth6 = (measuredWidth5 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
            setTranslationX(measuredWidth6);
            imageView.setTranslationX(measuredWidth5 - measuredWidth6);
        } else if (measuredWidth5 < AndroidUtilities.dp(10.0f)) {
            float fDp3 = measuredWidth5 - AndroidUtilities.dp(10.0f);
            setTranslationX(getTranslationX() + fDp3);
            imageView.setTranslationX(measuredWidth5 - fDp3);
        }
    }

    public float getBaseTranslationY() {
        return this.f34459w;
    }

    public org.telegram.ui.Cells.s1 getMessageCell() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setBottomOffset(int i10) {
        this.f34461y = i10;
    }

    public void setExtraTranslationY(float f10) {
        this.f34460x = f10;
        setTranslationY(f10 + this.f34459w);
    }

    public void setOverrideText(String str) {
        this.f34458s = str;
        this.f34451a.setText(str);
        org.telegram.ui.Cells.s1 s1Var = this.d;
        if (s1Var != null) {
            this.d = null;
            e(s1Var, null, 0, 0, false);
        }
    }

    public void setShowingDuration(long j10) {
        this.A = j10;
    }

    public void setText(CharSequence charSequence) {
        this.f34451a.setText(charSequence);
    }

    public void setUseScale(boolean z10) {
        this.C = z10;
    }

    public x30(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        this(2, activity, c6Var, false);
    }

    public x30(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.A = 2000L;
        this.B = c6Var;
        this.f34456n = i10;
        this.f34457r = z10;
        cg.q qVar = new cg.q(context, 23);
        this.f34451a = qVar;
        int i11 = org.telegram.ui.ActionBar.g6.f23274pf;
        qVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        qVar.setTextSize(1, 14.0f);
        qVar.setMaxLines(2);
        if (i10 == 7 || i10 == 8 || i10 == 9) {
            qVar.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i10 == 4) {
            qVar.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            qVar.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (i10 == 3) {
            qVar.setGravity(19);
            qVar.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23291qf, c6Var)));
            qVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(qVar, h7.z5.d(-2, 30.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        } else {
            qVar.setGravity(51);
            qVar.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23291qf, c6Var)));
            qVar.setPadding(AndroidUtilities.dp(i10 == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(qVar, h7.z5.d(-2, -2.0f, 51, 0.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        }
        if (i10 == 0) {
            qVar.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.f34452b = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.f34452b.setScaleType(ImageView.ScaleType.CENTER);
            this.f34452b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
            addView(this.f34452b, h7.z5.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.f34453c = imageView2;
        imageView2.setImageResource(z10 ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23291qf, c6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView2, h7.z5.d(14, 6.0f, (z10 ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setVisibleListener(w30 w30Var) {
    }
}
